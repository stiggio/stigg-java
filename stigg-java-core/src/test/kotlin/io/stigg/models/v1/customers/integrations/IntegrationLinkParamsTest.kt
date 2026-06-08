// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationLinkParamsTest {

    @Test
    fun create() {
        IntegrationLinkParams.builder()
            .pathId("x")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .bodyId("id")
            .syncedEntityId("syncedEntityId")
            .vendorIdentifier(IntegrationLinkParams.VendorIdentifier.AUTH0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntegrationLinkParams.builder()
                .pathId("x")
                .bodyId("id")
                .syncedEntityId("syncedEntityId")
                .vendorIdentifier(IntegrationLinkParams.VendorIdentifier.AUTH0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            IntegrationLinkParams.builder()
                .pathId("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .bodyId("id")
                .syncedEntityId("syncedEntityId")
                .vendorIdentifier(IntegrationLinkParams.VendorIdentifier.AUTH0)
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
            IntegrationLinkParams.builder()
                .pathId("x")
                .bodyId("id")
                .syncedEntityId("syncedEntityId")
                .vendorIdentifier(IntegrationLinkParams.VendorIdentifier.AUTH0)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            IntegrationLinkParams.builder()
                .pathId("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .bodyId("id")
                .syncedEntityId("syncedEntityId")
                .vendorIdentifier(IntegrationLinkParams.VendorIdentifier.AUTH0)
                .build()

        val body = params._body()

        assertThat(body.bodyId()).isEqualTo("id")
        assertThat(body.syncedEntityId()).isEqualTo("syncedEntityId")
        assertThat(body.vendorIdentifier()).isEqualTo(IntegrationLinkParams.VendorIdentifier.AUTH0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IntegrationLinkParams.builder()
                .pathId("x")
                .bodyId("id")
                .syncedEntityId("syncedEntityId")
                .vendorIdentifier(IntegrationLinkParams.VendorIdentifier.AUTH0)
                .build()

        val body = params._body()

        assertThat(body.bodyId()).isEqualTo("id")
        assertThat(body.syncedEntityId()).isEqualTo("syncedEntityId")
        assertThat(body.vendorIdentifier()).isEqualTo(IntegrationLinkParams.VendorIdentifier.AUTH0)
    }
}
