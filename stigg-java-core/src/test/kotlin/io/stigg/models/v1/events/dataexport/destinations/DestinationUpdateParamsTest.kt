// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport.destinations

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DestinationUpdateParamsTest {

    @Test
    fun create() {
        DestinationUpdateParams.builder()
            .destinationId("x")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .addEnabledModel("x")
            .integrationId("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DestinationUpdateParams.builder()
                .destinationId("x")
                .addEnabledModel("x")
                .integrationId("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            DestinationUpdateParams.builder()
                .destinationId("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addEnabledModel("x")
                .integrationId("x")
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
            DestinationUpdateParams.builder()
                .destinationId("x")
                .addEnabledModel("x")
                .integrationId("x")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            DestinationUpdateParams.builder()
                .destinationId("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addEnabledModel("x")
                .integrationId("x")
                .build()

        val body = params._body()

        assertThat(body.enabledModels()).containsExactly("x")
        assertThat(body.integrationId()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DestinationUpdateParams.builder()
                .destinationId("x")
                .addEnabledModel("x")
                .integrationId("x")
                .build()

        val body = params._body()

        assertThat(body.enabledModels()).containsExactly("x")
        assertThat(body.integrationId()).isEqualTo("x")
    }
}
