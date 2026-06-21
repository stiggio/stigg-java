// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportListModelsResponseTest {

    @Test
    fun create() {
        val dataExportListModelsResponse =
            DataExportListModelsResponse.builder()
                .data(
                    DataExportListModelsResponse.Data.builder()
                        .addGroup(
                            DataExportListModelsResponse.Data.Group.builder()
                                .id("id")
                                .displayName("displayName")
                                .addModel(
                                    DataExportListModelsResponse.Data.Group.Model.builder()
                                        .id("id")
                                        .displayName("displayName")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(dataExportListModelsResponse.data())
            .isEqualTo(
                DataExportListModelsResponse.Data.builder()
                    .addGroup(
                        DataExportListModelsResponse.Data.Group.builder()
                            .id("id")
                            .displayName("displayName")
                            .addModel(
                                DataExportListModelsResponse.Data.Group.Model.builder()
                                    .id("id")
                                    .displayName("displayName")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportListModelsResponse =
            DataExportListModelsResponse.builder()
                .data(
                    DataExportListModelsResponse.Data.builder()
                        .addGroup(
                            DataExportListModelsResponse.Data.Group.builder()
                                .id("id")
                                .displayName("displayName")
                                .addModel(
                                    DataExportListModelsResponse.Data.Group.Model.builder()
                                        .id("id")
                                        .displayName("displayName")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedDataExportListModelsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportListModelsResponse),
                jacksonTypeRef<DataExportListModelsResponse>(),
            )

        assertThat(roundtrippedDataExportListModelsResponse).isEqualTo(dataExportListModelsResponse)
    }
}
