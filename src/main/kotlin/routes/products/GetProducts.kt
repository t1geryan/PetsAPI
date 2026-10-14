package io.github.t1geryan.routes.products

import io.github.t1geryan.data.ProductsStore
import io.ktor.server.response.respond
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get

fun Routing.getProducts() {
    get("/products/") {
        val connection = call.request.local
        val host = connection.serverHost.let {
            if (':' in it && !it.startsWith("[")) "[$it]" else it
        }
        val baseURL = System.getenv("PUBLIC_BASE_URL")?.takeIf { it.isNotBlank() }
            ?: "${connection.scheme}://$host:${connection.serverPort}"
        call.respond(ProductsStore.getProducts(baseURL))
    }
}
