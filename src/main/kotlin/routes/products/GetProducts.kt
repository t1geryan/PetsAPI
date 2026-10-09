package io.github.t1geryan.routes.products

import io.github.t1geryan.data.ProductsStore
import io.ktor.server.response.respond
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get

fun Routing.getProducts() {
    get("/products/") {
        call.respond(ProductsStore.getProducts())
    }
}