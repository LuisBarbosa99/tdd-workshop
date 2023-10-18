package io.workshop.tdd.services

import io.workshop.tdd.models.forms.CouponForm
import io.workshop.tdd.repositories.CouponRepository
import org.springframework.stereotype.Service

@Service
class CouponService(
    val couponRepository: CouponRepository
) {
    
    fun create(model: CouponForm) {
        //TODO
    }
    
    fun findById(id: String) {
        //TODO
    }
    
    fun list() {
        //TODO
    }
    
    fun use(id: String) {
        //TODO
    }
}