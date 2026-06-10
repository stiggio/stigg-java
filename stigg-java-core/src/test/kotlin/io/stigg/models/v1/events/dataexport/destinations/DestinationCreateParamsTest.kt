// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport.destinations

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DestinationCreateParamsTest {

    @Test
    fun create() {
        DestinationCreateParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .destinationId("x")
            .destinationType("x")
            .build()
    }

    @Test
    fun headers() {
        val params =
            DestinationCreateParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .destinationId("x")
                .destinationType("x")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            DestinationCreateParams.builder().destinationId("x").destinationType("x").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            DestinationCreateParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .destinationId("x")
                .destinationType("x")
                .build()

        val body = params._body()

        assertThat(body.destinationId()).isEqualTo("x")
        assertThat(body.destinationType()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DestinationCreateParams.builder().destinationId("x").destinationType("x").build()

        val body = params._body()

        assertThat(body.destinationId()).isEqualTo("x")
        assertThat(body.destinationType()).isEqualTo("x")
    }
}
