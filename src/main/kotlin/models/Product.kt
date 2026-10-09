package io.github.t1geryan.models

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val id: String,
    val name: String,
    val description: String,
    val details: String,
    val animalType: String,
    val categoryID: String,
    val price: Int,
    val taste: String,
    val weight: Double,
    val imageName: String,
    val discount: Int?,
    val currencyCode: String
)
