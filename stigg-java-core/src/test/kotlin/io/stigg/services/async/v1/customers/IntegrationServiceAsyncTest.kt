// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.customers.integrations.IntegrationLinkParams
import io.stigg.models.v1.customers.integrations.IntegrationRetrieveParams
import io.stigg.models.v1.customers.integrations.IntegrationUnlinkParams
import io.stigg.models.v1.customers.integrations.IntegrationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IntegrationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val integrationServiceAsync = client.v1().customers().integrations()

        val customerIntegrationResponseFuture =
            integrationServiceAsync.retrieve(
                IntegrationRetrieveParams.builder()
                    .id("id")
                    .integrationId("integrationId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val customerIntegrationResponse = customerIntegrationResponseFuture.get()
        customerIntegrationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val integrationServiceAsync = client.v1().customers().integrations()

        val customerIntegrationResponseFuture =
            integrationServiceAsync.update(
                IntegrationUpdateParams.builder()
                    .id("id")
                    .integrationId("integrationId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .syncedEntityId("syncedEntityId")
                    .build()
            )

        val customerIntegrationResponse = customerIntegrationResponseFuture.get()
        customerIntegrationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val integrationServiceAsync = client.v1().customers().integrations()

        val pageFuture = integrationServiceAsync.list("x")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun link() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val integrationServiceAsync = client.v1().customers().integrations()

        val customerIntegrationResponseFuture =
            integrationServiceAsync.link(
                IntegrationLinkParams.builder()
                    .pathId("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .bodyId("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(IntegrationLinkParams.VendorIdentifier.AUTH0)
                    .build()
            )

        val customerIntegrationResponse = customerIntegrationResponseFuture.get()
        customerIntegrationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unlink() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val integrationServiceAsync = client.v1().customers().integrations()

        val customerIntegrationResponseFuture =
            integrationServiceAsync.unlink(
                IntegrationUnlinkParams.builder()
                    .id("id")
                    .integrationId("integrationId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val customerIntegrationResponse = customerIntegrationResponseFuture.get()
        customerIntegrationResponse.validate()
    }
}
