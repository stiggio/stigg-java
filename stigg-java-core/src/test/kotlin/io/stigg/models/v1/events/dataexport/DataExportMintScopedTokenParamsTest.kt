// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportMintScopedTokenParamsTest {

    @Test
    fun create() {
        DataExportMintScopedTokenParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .applicationOrigin("x")
            .destinationType("destinationType")
            .build()
    }

    @Test
    fun headers() {
        val params =
            DataExportMintScopedTokenParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .applicationOrigin("x")
                .destinationType("destinationType")
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
        val params = DataExportMintScopedTokenParams.builder().applicationOrigin("x").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            DataExportMintScopedTokenParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .applicationOrigin("x")
                .destinationType("destinationType")
                .build()

        val body = params._body()

        assertThat(body.applicationOrigin()).isEqualTo("x")
        assertThat(body.destinationType()).contains("destinationType")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DataExportMintScopedTokenParams.builder().applicationOrigin("x").build()

        val body = params._body()

        assertThat(body.applicationOrigin()).isEqualTo("x")
    }
}
