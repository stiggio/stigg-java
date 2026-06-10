// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportTriggerSyncParamsTest {

    @Test
    fun create() {
        DataExportTriggerSyncParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .destinationId("destinationId")
            .build()
    }

    @Test
    fun headers() {
        val params =
            DataExportTriggerSyncParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .destinationId("destinationId")
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
        val params = DataExportTriggerSyncParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            DataExportTriggerSyncParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .destinationId("destinationId")
                .build()

        val body = params._body()

        assertThat(body.destinationId()).contains("destinationId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DataExportTriggerSyncParams.builder().build()

        val body = params._body()
    }
}
