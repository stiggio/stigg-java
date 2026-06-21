// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportListModelsParamsTest {

    @Test
    fun create() {
        DataExportListModelsParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .build()
    }

    @Test
    fun headers() {
        val params =
            DataExportListModelsParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
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
        val params = DataExportListModelsParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
