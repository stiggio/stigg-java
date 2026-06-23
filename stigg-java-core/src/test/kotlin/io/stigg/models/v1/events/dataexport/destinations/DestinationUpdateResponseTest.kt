// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport.destinations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DestinationUpdateResponseTest {

    @Test
    fun create() {
        val destinationUpdateResponse =
            DestinationUpdateResponse.builder()
                .data(
                    DestinationUpdateResponse.Data.builder()
                        .addDestination(
                            DestinationUpdateResponse.Data.Destination.builder()
                                .connectedAt("connectedAt")
                                .destinationId("destinationId")
                                .type("type")
                                .connectionStatus("connectionStatus")
                                .addEnabledModel("string")
                                .lastSyncStatus(
                                    DestinationUpdateResponse.Data.Destination.LastSyncStatus
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

        assertThat(destinationUpdateResponse.data())
            .isEqualTo(
                DestinationUpdateResponse.Data.builder()
                    .addDestination(
                        DestinationUpdateResponse.Data.Destination.builder()
                            .connectedAt("connectedAt")
                            .destinationId("destinationId")
                            .type("type")
                            .connectionStatus("connectionStatus")
                            .addEnabledModel("string")
                            .lastSyncStatus(
                                DestinationUpdateResponse.Data.Destination.LastSyncStatus.builder()
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
        val destinationUpdateResponse =
            DestinationUpdateResponse.builder()
                .data(
                    DestinationUpdateResponse.Data.builder()
                        .addDestination(
                            DestinationUpdateResponse.Data.Destination.builder()
                                .connectedAt("connectedAt")
                                .destinationId("destinationId")
                                .type("type")
                                .connectionStatus("connectionStatus")
                                .addEnabledModel("string")
                                .lastSyncStatus(
                                    DestinationUpdateResponse.Data.Destination.LastSyncStatus
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

        val roundtrippedDestinationUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(destinationUpdateResponse),
                jacksonTypeRef<DestinationUpdateResponse>(),
            )

        assertThat(roundtrippedDestinationUpdateResponse).isEqualTo(destinationUpdateResponse)
    }
}
