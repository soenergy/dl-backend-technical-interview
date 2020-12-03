package com.ktor

import com.so.energy.module
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {

    @Test
    fun testRoot() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/health-check").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("healthy", response.content)
            }
        }
    }
}
