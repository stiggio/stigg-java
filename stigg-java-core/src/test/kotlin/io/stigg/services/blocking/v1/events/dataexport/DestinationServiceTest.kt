// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.dataexport

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.events.dataexport.destinations.DestinationCreateParams
import io.stigg.models.v1.events.dataexport.destinations.DestinationDeleteParams
import io.stigg.models.v1.events.dataexport.destinations.DestinationUpdateSelectionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DestinationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val destinationService = client.v1().events().dataExport().destinations()

        val destination =
            destinationService.create(
                DestinationCreateParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .destinationId("x")
                    .destinationType("x")
                    .addEnabledModel("x")
                    .build()
            )

        destination.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val destinationService = client.v1().events().dataExport().destinations()

        val destination =
            destinationService.delete(
                DestinationDeleteParams.builder()
                    .destinationId("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        destination.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSelection() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val destinationService = client.v1().events().dataExport().destinations()

        val response =
            destinationService.updateSelection(
                DestinationUpdateSelectionParams.builder()
                    .destinationId("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .addEnabledModel("x")
                    .integrationId("x")
                    .build()
            )

        response.validate()
    }
}
