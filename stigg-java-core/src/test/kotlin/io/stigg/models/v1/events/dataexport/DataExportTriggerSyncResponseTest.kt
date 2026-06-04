// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportTriggerSyncResponseTest {

    @Test
    fun create() {
        val dataExportTriggerSyncResponse =
            DataExportTriggerSyncResponse.builder()
                .data(
                    DataExportTriggerSyncResponse.Data.builder()
                        .addResult(
                            DataExportTriggerSyncResponse.Data.Result.builder()
                                .destinationId("destinationId")
                                .triggered(true)
                                .errorMessage("errorMessage")
                                .transferId("transferId")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(dataExportTriggerSyncResponse.data())
            .isEqualTo(
                DataExportTriggerSyncResponse.Data.builder()
                    .addResult(
                        DataExportTriggerSyncResponse.Data.Result.builder()
                            .destinationId("destinationId")
                            .triggered(true)
                            .errorMessage("errorMessage")
                            .transferId("transferId")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportTriggerSyncResponse =
            DataExportTriggerSyncResponse.builder()
                .data(
                    DataExportTriggerSyncResponse.Data.builder()
                        .addResult(
                            DataExportTriggerSyncResponse.Data.Result.builder()
                                .destinationId("destinationId")
                                .triggered(true)
                                .errorMessage("errorMessage")
                                .transferId("transferId")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedDataExportTriggerSyncResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportTriggerSyncResponse),
                jacksonTypeRef<DataExportTriggerSyncResponse>(),
            )

        assertThat(roundtrippedDataExportTriggerSyncResponse)
            .isEqualTo(dataExportTriggerSyncResponse)
    }
}
