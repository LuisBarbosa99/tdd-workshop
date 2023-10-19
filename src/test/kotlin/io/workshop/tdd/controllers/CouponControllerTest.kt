package io.workshop.tdd.controllers

import com.fasterxml.jackson.databind.ObjectMapper
import io.workshop.tdd.models.forms.CouponForm
import io.workshop.tdd.services.CouponService
import org.junit.jupiter.api.Test
import org.mockito.kotlin.whenever
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity.ok
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post

@WebMvcTest(controllers = [CouponController::class])
class CouponControllerTest {
    
    @MockBean
    private lateinit var couponService: CouponService
    
    @Autowired
    lateinit var mockMvc: MockMvc
    
    private var mapper = ObjectMapper()
    
    @Test
    fun criaOCupomCertinhoComValorFixoEmReais() {
        var objeto = CouponForm(
            nome = "XABLAU30",
            valor = 30,
            categoria = "BOMBAS",
            tipo = "FIXO",
            quantidade = 30
        )
        
        mockMvc.post("/coupon") {
            contentType = MediaType.APPLICATION_JSON
            content = mapper.writeValueAsString(objeto)
        }.andExpect { ok() }
    }
    
   
    
    
}