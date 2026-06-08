// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationUpdateParamsTest {

    @Test
    fun create() {
        IntegrationUpdateParams.builder()
            .id("id")
            .integrationId("integrationId")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .syncedEntityId("syncedEntityId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntegrationUpdateParams.builder()
                .id("id")
                .integrationId("integrationId")
                .syncedEntityId("syncedEntityId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("integrationId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            IntegrationUpdateParams.builder()
                .id("id")
                .integrationId("integrationId")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .syncedEntityId("syncedEntityId")
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
            IntegrationUpdateParams.builder()
                .id("id")
                .integrationId("integrationId")
                .syncedEntityId("syncedEntityId")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            IntegrationUpdateParams.builder()
                .id("id")
                .integrationId("integrationId")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .syncedEntityId("syncedEntityId")
                .build()

        val body = params._body()

        assertThat(body.syncedEntityId()).contains("syncedEntityId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IntegrationUpdateParams.builder()
                .id("id")
                .integrationId("integrationId")
                .syncedEntityId("syncedEntityId")
                .build()

        val body = params._body()

        assertThat(body.syncedEntityId()).contains("syncedEntityId")
    }
}
