package io.workshop.tdd.models.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "coupon")
data class Coupon(
    @Id
    val id: String,
    
    @Column
    val valueCents: Long,
    
    @Column
    val quantity: Int,
    
    @Column
    val description: String? = null,
    
    @Column
    val type: String
)