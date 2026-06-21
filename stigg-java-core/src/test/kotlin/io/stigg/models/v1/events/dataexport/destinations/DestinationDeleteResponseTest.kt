// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport.destinations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DestinationDeleteResponseTest {

    @Test
    fun create() {
        val destinationDeleteResponse =
            DestinationDeleteResponse.builder()
                .data(
                    DestinationDeleteResponse.Data.builder()
                        .addDestination(
                            DestinationDeleteResponse.Data.Destination.builder()
                                .connectedAt("connectedAt")
                                .destinationId("destinationId")
                                .type("type")
                                .connectionStatus("connectionStatus")
                                .addEnabledModel("string")
                                .lastSyncStatus(
                                    DestinationDeleteResponse.Data.Destination.LastSyncStatus
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

        assertThat(destinationDeleteResponse.data())
            .isEqualTo(
                DestinationDeleteResponse.Data.builder()
                    .addDestination(
                        DestinationDeleteResponse.Data.Destination.builder()
                            .connectedAt("connectedAt")
                            .destinationId("destinationId")
                            .type("type")
                            .connectionStatus("connectionStatus")
                            .addEnabledModel("string")
                            .lastSyncStatus(
                                DestinationDeleteResponse.Data.Destination.LastSyncStatus.builder()
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
        val destinationDeleteResponse =
            DestinationDeleteResponse.builder()
                .data(
                    DestinationDeleteResponse.Data.builder()
                        .addDestination(
                            DestinationDeleteResponse.Data.Destination.builder()
                                .connectedAt("connectedAt")
                                .destinationId("destinationId")
                                .type("type")
                                .connectionStatus("connectionStatus")
                                .addEnabledModel("string")
                                .lastSyncStatus(
                                    DestinationDeleteResponse.Data.Destination.LastSyncStatus
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

        val roundtrippedDestinationDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(destinationDeleteResponse),
                jacksonTypeRef<DestinationDeleteResponse>(),
            )

        assertThat(roundtrippedDestinationDeleteResponse).isEqualTo(destinationDeleteResponse)
    }
}
