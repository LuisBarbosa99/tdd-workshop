package io.workshop.tdd.controllers

import io.workshop.tdd.models.forms.CouponForm
import io.workshop.tdd.services.CouponService
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.badRequest
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/coupon")
class CouponController(
    val couponService: CouponService
) {
    
    //FIXME - Adicionar tratativa de erro.
    @PostMapping
    fun create(@RequestBody form: CouponForm): ResponseEntity<Any> =
        ok().build()
    
    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: String) {
        //TODO
    }
    
    @GetMapping
    fun list() {
        //TODO
    }
    
    @PutMapping("/{id}")
    fun use(@PathVariable("id") id: String) {
        //TODO
    }
}