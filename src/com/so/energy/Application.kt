package com.so.energy

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.get
import io.ktor.routing.routing
import org.slf4j.Logger
import org.slf4j.LoggerFactory

val logger: Logger = LoggerFactory.getLogger(Application::class.java)

fun main(args: Array<String>) {
    io.ktor.server.jetty.EngineMain.main(args)
}

// Referenced in application.conf
@Suppress("unused")
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    routing {

        get("/health-check") {
            logger.debug("healthy")
            call.respondText("healthy", contentType = ContentType.Text.Plain)
        }
    }
}



