package io.github.t1geryan

import io.github.t1geryan.routes.products.getProducts
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        getProducts()
    }
}