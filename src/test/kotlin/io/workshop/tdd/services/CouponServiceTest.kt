package io.workshop.tdd.services

import io.workshop.tdd.models.forms.CouponForm
import io.workshop.tdd.repositories.CouponRepository
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.kotlin.mock

class CouponServiceTest {
    
    private var couponRepository: CouponRepository = mock()
    
    private lateinit var couponService: CouponService
    
    @BeforeEach
    fun setup() {
        couponService = CouponService(couponRepository)
    }
    
    @Test
    fun shouldCreate() {
        
        Mockito.verify(couponRepository, Mockito.times(1)).save(Mockito.any())
    }
}