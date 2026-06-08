// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationRetrieveParamsTest {

    @Test
    fun create() {
        IntegrationRetrieveParams.builder()
            .id("id")
            .integrationId("integrationId")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntegrationRetrieveParams.builder().id("id").integrationId("integrationId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("integrationId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            IntegrationRetrieveParams.builder()
                .id("id")
                .integrationId("integrationId")
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
        val params =
            IntegrationRetrieveParams.builder().id("id").integrationId("integrationId").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
