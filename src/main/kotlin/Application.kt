package io.github.t1geryan

import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import kotlinx.serialization.json.Json


fun Application.rootModule() {
    install(ContentNegotiation) {
        json(
            Json {
                isLenient = true
                prettyPrint = true
            }
        )
    }
    configureRouting()
}
