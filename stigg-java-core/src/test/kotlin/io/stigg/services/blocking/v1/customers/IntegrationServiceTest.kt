// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.customers

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.customers.integrations.IntegrationLinkParams
import io.stigg.models.v1.customers.integrations.IntegrationRetrieveParams
import io.stigg.models.v1.customers.integrations.IntegrationUnlinkParams
import io.stigg.models.v1.customers.integrations.IntegrationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IntegrationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val integrationService = client.v1().customers().integrations()

        val integration =
            integrationService.retrieve(
                IntegrationRetrieveParams.builder().id("id").integrationId("integrationId").build()
            )

        integration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val integrationService = client.v1().customers().integrations()

        val integration =
            integrationService.update(
                IntegrationUpdateParams.builder()
                    .id("id")
                    .integrationId("integrationId")
                    .syncedEntityId("syncedEntityId")
                    .build()
            )

        integration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val integrationService = client.v1().customers().integrations()

        val page = integrationService.list("x")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun link() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val integrationService = client.v1().customers().integrations()

        val response =
            integrationService.link(
                IntegrationLinkParams.builder()
                    .pathId("x")
                    .bodyId("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(IntegrationLinkParams.VendorIdentifier.AUTH0)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unlink() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val integrationService = client.v1().customers().integrations()

        val response =
            integrationService.unlink(
                IntegrationUnlinkParams.builder().id("id").integrationId("integrationId").build()
            )

        response.validate()
    }
}
