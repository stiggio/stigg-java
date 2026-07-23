// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport.destinations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DestinationUpdateSelectionResponseTest {

    @Test
    fun create() {
        val destinationUpdateSelectionResponse =
            DestinationUpdateSelectionResponse.builder()
                .data(
                    DestinationUpdateSelectionResponse.Data.builder()
                        .addDestination(
                            DestinationUpdateSelectionResponse.Data.Destination.builder()
                                .connectedAt("connectedAt")
                                .destinationId("destinationId")
                                .type("type")
                                .connectionStatus("connectionStatus")
                                .addEnabledModel("string")
                                .lastSyncStatus(
                                    DestinationUpdateSelectionResponse.Data.Destination
                                        .LastSyncStatus
                                        .builder()
                                        .finishedAt("finishedAt")
                                        .status("status")
                                        .transferId("transferId")
                                        .blamedParty("blamedParty")
                                        .failureMessage("failureMessage")
                                        .rowsTransferred(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(destinationUpdateSelectionResponse.data())
            .isEqualTo(
                DestinationUpdateSelectionResponse.Data.builder()
                    .addDestination(
                        DestinationUpdateSelectionResponse.Data.Destination.builder()
                            .connectedAt("connectedAt")
                            .destinationId("destinationId")
                            .type("type")
                            .connectionStatus("connectionStatus")
                            .addEnabledModel("string")
                            .lastSyncStatus(
                                DestinationUpdateSelectionResponse.Data.Destination.LastSyncStatus
                                    .builder()
                                    .finishedAt("finishedAt")
                                    .status("status")
                                    .transferId("transferId")
                                    .blamedParty("blamedParty")
                                    .failureMessage("failureMessage")
                                    .rowsTransferred(0.0)
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
        val destinationUpdateSelectionResponse =
            DestinationUpdateSelectionResponse.builder()
                .data(
                    DestinationUpdateSelectionResponse.Data.builder()
                        .addDestination(
                            DestinationUpdateSelectionResponse.Data.Destination.builder()
                                .connectedAt("connectedAt")
                                .destinationId("destinationId")
                                .type("type")
                                .connectionStatus("connectionStatus")
                                .addEnabledModel("string")
                                .lastSyncStatus(
                                    DestinationUpdateSelectionResponse.Data.Destination
                                        .LastSyncStatus
                                        .builder()
                                        .finishedAt("finishedAt")
                                        .status("status")
                                        .transferId("transferId")
                                        .blamedParty("blamedParty")
                                        .failureMessage("failureMessage")
                                        .rowsTransferred(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedDestinationUpdateSelectionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(destinationUpdateSelectionResponse),
                jacksonTypeRef<DestinationUpdateSelectionResponse>(),
            )

        assertThat(roundtrippedDestinationUpdateSelectionResponse)
            .isEqualTo(destinationUpdateSelectionResponse)
    }
}
