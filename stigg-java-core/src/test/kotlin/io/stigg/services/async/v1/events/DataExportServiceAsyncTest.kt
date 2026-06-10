// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.events.dataexport.DataExportMintScopedTokenParams
import io.stigg.models.v1.events.dataexport.DataExportTriggerSyncParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DataExportServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun mintScopedToken() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataExportServiceAsync = client.v1().events().dataExport()

        val responseFuture =
            dataExportServiceAsync.mintScopedToken(
                DataExportMintScopedTokenParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .applicationOrigin("x")
                    .destinationType("destinationType")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun triggerSync() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataExportServiceAsync = client.v1().events().dataExport()

        val responseFuture =
            dataExportServiceAsync.triggerSync(
                DataExportTriggerSyncParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .destinationId("destinationId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
