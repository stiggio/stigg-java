// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.stigg.api.client.StiggClient
import com.stigg.api.client.okhttp.StiggOkHttpClient
import com.stigg.api.core.JsonValue
import com.stigg.api.core.http.Headers
import com.stigg.api.core.jsonMapper
import com.stigg.api.errors.BadRequestException
import com.stigg.api.errors.InternalServerException
import com.stigg.api.errors.NotFoundException
import com.stigg.api.errors.PermissionDeniedException
import com.stigg.api.errors.RateLimitException
import com.stigg.api.errors.StiggException
import com.stigg.api.errors.UnauthorizedException
import com.stigg.api.errors.UnexpectedStatusCodeException
import com.stigg.api.errors.UnprocessableEntityException
import com.stigg.api.models.v1.permissions.PermissionCheckParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: StiggClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            StiggOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun permissionsCheck400() {
        val permissionService = client.v1().permissions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                permissionService.check(
                    PermissionCheckParams.builder()
                        .userId("userId")
                        .addResourcesAndAction(
                            PermissionCheckParams.ResourcesAndAction.builder()
                                .action(JsonValue.from("read"))
                                .resource("product")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun permissionsCheck401() {
        val permissionService = client.v1().permissions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                permissionService.check(
                    PermissionCheckParams.builder()
                        .userId("userId")
                        .addResourcesAndAction(
                            PermissionCheckParams.ResourcesAndAction.builder()
                                .action(JsonValue.from("read"))
                                .resource("product")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun permissionsCheck403() {
        val permissionService = client.v1().permissions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                permissionService.check(
                    PermissionCheckParams.builder()
                        .userId("userId")
                        .addResourcesAndAction(
                            PermissionCheckParams.ResourcesAndAction.builder()
                                .action(JsonValue.from("read"))
                                .resource("product")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun permissionsCheck404() {
        val permissionService = client.v1().permissions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                permissionService.check(
                    PermissionCheckParams.builder()
                        .userId("userId")
                        .addResourcesAndAction(
                            PermissionCheckParams.ResourcesAndAction.builder()
                                .action(JsonValue.from("read"))
                                .resource("product")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun permissionsCheck422() {
        val permissionService = client.v1().permissions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                permissionService.check(
                    PermissionCheckParams.builder()
                        .userId("userId")
                        .addResourcesAndAction(
                            PermissionCheckParams.ResourcesAndAction.builder()
                                .action(JsonValue.from("read"))
                                .resource("product")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun permissionsCheck429() {
        val permissionService = client.v1().permissions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                permissionService.check(
                    PermissionCheckParams.builder()
                        .userId("userId")
                        .addResourcesAndAction(
                            PermissionCheckParams.ResourcesAndAction.builder()
                                .action(JsonValue.from("read"))
                                .resource("product")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun permissionsCheck500() {
        val permissionService = client.v1().permissions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                permissionService.check(
                    PermissionCheckParams.builder()
                        .userId("userId")
                        .addResourcesAndAction(
                            PermissionCheckParams.ResourcesAndAction.builder()
                                .action(JsonValue.from("read"))
                                .resource("product")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun permissionsCheck999() {
        val permissionService = client.v1().permissions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                permissionService.check(
                    PermissionCheckParams.builder()
                        .userId("userId")
                        .addResourcesAndAction(
                            PermissionCheckParams.ResourcesAndAction.builder()
                                .action(JsonValue.from("read"))
                                .resource("product")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun permissionsCheckInvalidJsonBody() {
        val permissionService = client.v1().permissions()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<StiggException> {
                permissionService.check(
                    PermissionCheckParams.builder()
                        .userId("userId")
                        .addResourcesAndAction(
                            PermissionCheckParams.ResourcesAndAction.builder()
                                .action(JsonValue.from("read"))
                                .resource("product")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
