// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.events.dataexport.DataExportListModelsParams
import io.stigg.models.v1.events.dataexport.DataExportMintScopedTokenParams
import io.stigg.models.v1.events.dataexport.DataExportTriggerSyncParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DataExportServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listModels() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val dataExportService = client.v1().events().dataExport()

        val response =
            dataExportService.listModels(
                DataExportListModelsParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun mintScopedToken() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val dataExportService = client.v1().events().dataExport()

        val response =
            dataExportService.mintScopedToken(
                DataExportMintScopedTokenParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .applicationOrigin("x")
                    .destinationType("destinationType")
                    .addEnabledModel("x")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun triggerSync() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val dataExportService = client.v1().events().dataExport()

        val response =
            dataExportService.triggerSync(
                DataExportTriggerSyncParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .destinationId("destinationId")
                    .build()
            )

        response.validate()
    }
}
