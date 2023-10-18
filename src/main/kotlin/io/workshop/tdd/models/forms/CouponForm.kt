package io.workshop.tdd.models.forms

data class CouponForm(
    val name:String,
    val value:Long,
    val quantity: Int,
    val type: String,
    val description: String? = null
)
