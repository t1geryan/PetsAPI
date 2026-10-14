package io.github.t1geryan.data

import io.github.t1geryan.models.Product
import kotlinx.serialization.json.Json

object ProductsStore {
    private val products: List<Product> = ProductsStore::class.java
        .getResourceAsStream("/products.json")
        ?.bufferedReader(Charsets.UTF_8)?.use { Json.decodeFromString(it.readText()) }
        ?: error("products.json is missing from server resources")

    init {
        require(products.map { it.id }.distinct().size == products.size)
        require(products.all { it.id.isNotBlank() && it.rating in 0.0..5.0 && it.imageURL.startsWith("/images/") })
    }

    fun getProducts(baseURL: String): List<Product> = products.map {
        it.copy(imageURL = baseURL.trimEnd('/') + it.imageURL)
    }
}
