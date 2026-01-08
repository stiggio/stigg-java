// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageRetrieveResponseTest {

    @Test
    fun create() {
        val usageRetrieveResponse =
            UsageRetrieveResponse.builder()
                .data(
                    UsageRetrieveResponse.Data.builder()
                        .addMarker(
                            UsageRetrieveResponse.Data.Marker.builder()
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .type(UsageRetrieveResponse.Data.Marker.Type.PERIODIC_RESET)
                                .build()
                        )
                        .addSeries(
                            UsageRetrieveResponse.Data.Series.builder()
                                .addPoint(
                                    UsageRetrieveResponse.Data.Series.Point.builder()
                                        .isResetPoint(true)
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .value(0.0)
                                        .build()
                                )
                                .addTag(
                                    UsageRetrieveResponse.Data.Series.Tag.builder()
                                        .key("key")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(usageRetrieveResponse.data())
            .isEqualTo(
                UsageRetrieveResponse.Data.builder()
                    .addMarker(
                        UsageRetrieveResponse.Data.Marker.builder()
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .type(UsageRetrieveResponse.Data.Marker.Type.PERIODIC_RESET)
                            .build()
                    )
                    .addSeries(
                        UsageRetrieveResponse.Data.Series.builder()
                            .addPoint(
                                UsageRetrieveResponse.Data.Series.Point.builder()
                                    .isResetPoint(true)
                                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .value(0.0)
                                    .build()
                            )
                            .addTag(
                                UsageRetrieveResponse.Data.Series.Tag.builder()
                                    .key("key")
                                    .value("value")
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
        val usageRetrieveResponse =
            UsageRetrieveResponse.builder()
                .data(
                    UsageRetrieveResponse.Data.builder()
                        .addMarker(
                            UsageRetrieveResponse.Data.Marker.builder()
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .type(UsageRetrieveResponse.Data.Marker.Type.PERIODIC_RESET)
                                .build()
                        )
                        .addSeries(
                            UsageRetrieveResponse.Data.Series.builder()
                                .addPoint(
                                    UsageRetrieveResponse.Data.Series.Point.builder()
                                        .isResetPoint(true)
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .value(0.0)
                                        .build()
                                )
                                .addTag(
                                    UsageRetrieveResponse.Data.Series.Tag.builder()
                                        .key("key")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedUsageRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageRetrieveResponse),
                jacksonTypeRef<UsageRetrieveResponse>(),
            )

        assertThat(roundtrippedUsageRetrieveResponse).isEqualTo(usageRetrieveResponse)
    }
}
