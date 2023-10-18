package io.workshop.tdd.controllers

import com.fasterxml.jackson.databind.ObjectMapper
import io.workshop.tdd.models.forms.CouponForm
import io.workshop.tdd.services.CouponService
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.kotlin.whenever
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post

@WebMvcTest(controllers = [CouponController::class])
class CouponControllerTest {
    
    @MockBean
    private lateinit var couponService: CouponService
    
    @Autowired
    private lateinit var mockMvc: MockMvc
    
    private var mapper = ObjectMapper()
    
    //TODO - Melhorar nome deste método de testes
    @Test
    fun shouldReturnOk() {
        val form = CouponForm(
            name = "XABLAU30",
            value = 30L,
            quantity = 4,
            type = "PERCENT"
        )
        
        Mockito.doNothing().whenever(couponService).create(form)
        
        mockMvc.post("/coupon") {
            contentType = MediaType.APPLICATION_JSON
            content = mapper.writeValueAsString(form)
        }.andExpect {
            status { isOk() }
        }
    }
    
    //TODO - Melhorar nome deste método de testes
    @Test
    fun shouldReturnBadRequest() {
        val form = CouponForm(
            name = "XABLAU30",
            value = 30L,
            quantity = 4,
            type = ""
        )
        
        whenever(couponService.create(form))
            .then { throw Exception() }
        
        mockMvc.post("/coupon") {
            contentType = MediaType.APPLICATION_JSON
            content = mapper.writeValueAsString(form)
        }.andExpect {
            status { isBadRequest() }
        }
    }
    
    
}