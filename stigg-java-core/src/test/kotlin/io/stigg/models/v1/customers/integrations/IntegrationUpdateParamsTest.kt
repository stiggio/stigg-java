// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationUpdateParamsTest {

    @Test
    fun create() {
        IntegrationUpdateParams.builder()
            .id("id")
            .integrationId("integrationId")
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
    fun body() {
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
