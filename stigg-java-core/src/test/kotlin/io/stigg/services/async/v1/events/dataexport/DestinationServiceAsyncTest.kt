// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.dataexport

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.events.dataexport.destinations.DestinationCreateParams
import io.stigg.models.v1.events.dataexport.destinations.DestinationDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DestinationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val destinationServiceAsync = client.v1().events().dataExport().destinations()

        val destinationFuture =
            destinationServiceAsync.create(
                DestinationCreateParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .destinationId("x")
                    .destinationType("x")
                    .build()
            )

        val destination = destinationFuture.get()
        destination.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val destinationServiceAsync = client.v1().events().dataExport().destinations()

        val destinationFuture =
            destinationServiceAsync.delete(
                DestinationDeleteParams.builder()
                    .destinationId("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val destination = destinationFuture.get()
        destination.validate()
    }
}
