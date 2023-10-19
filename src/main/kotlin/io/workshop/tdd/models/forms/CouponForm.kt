package io.workshop.tdd.models.forms

data class CouponForm(
    var nome: String,
    var valor: Int,
    var categoria: String,
    var tipo: String,
    var quantidade: Int
)
