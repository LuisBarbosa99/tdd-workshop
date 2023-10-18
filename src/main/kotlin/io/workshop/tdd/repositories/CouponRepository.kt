package io.workshop.tdd.repositories

import io.workshop.tdd.models.entities.Coupon
import org.springframework.data.jpa.repository.JpaRepository

interface CouponRepository: JpaRepository<Coupon, String>