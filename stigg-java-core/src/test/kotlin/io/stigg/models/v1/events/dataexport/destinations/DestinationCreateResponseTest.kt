// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport.destinations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DestinationCreateResponseTest {

    @Test
    fun create() {
        val destinationCreateResponse =
            DestinationCreateResponse.builder()
                .data(
                    DestinationCreateResponse.Data.builder()
                        .addDestination(
                            DestinationCreateResponse.Data.Destination.builder()
                                .connectedAt("connectedAt")
                                .destinationId("destinationId")
                                .type("type")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(destinationCreateResponse.data())
            .isEqualTo(
                DestinationCreateResponse.Data.builder()
                    .addDestination(
                        DestinationCreateResponse.Data.Destination.builder()
                            .connectedAt("connectedAt")
                            .destinationId("destinationId")
                            .type("type")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val destinationCreateResponse =
            DestinationCreateResponse.builder()
                .data(
                    DestinationCreateResponse.Data.builder()
                        .addDestination(
                            DestinationCreateResponse.Data.Destination.builder()
                                .connectedAt("connectedAt")
                                .destinationId("destinationId")
                                .type("type")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedDestinationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(destinationCreateResponse),
                jacksonTypeRef<DestinationCreateResponse>(),
            )

        assertThat(roundtrippedDestinationCreateResponse).isEqualTo(destinationCreateResponse)
    }
}
