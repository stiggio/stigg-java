// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageHistoryResponseTest {

    @Test
    fun create() {
        val usageHistoryResponse =
            UsageHistoryResponse.builder()
                .data(
                    UsageHistoryResponse.Data.builder()
                        .addMarker(
                            UsageHistoryResponse.Data.Marker.builder()
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .type(UsageHistoryResponse.Data.Marker.Type.PERIODIC_RESET)
                                .build()
                        )
                        .addSeries(
                            UsageHistoryResponse.Data.Series.builder()
                                .addPoint(
                                    UsageHistoryResponse.Data.Series.Point.builder()
                                        .isResetPoint(true)
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .value(0.0)
                                        .build()
                                )
                                .addTag(
                                    UsageHistoryResponse.Data.Series.Tag.builder()
                                        .key("key")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(usageHistoryResponse.data())
            .isEqualTo(
                UsageHistoryResponse.Data.builder()
                    .addMarker(
                        UsageHistoryResponse.Data.Marker.builder()
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .type(UsageHistoryResponse.Data.Marker.Type.PERIODIC_RESET)
                            .build()
                    )
                    .addSeries(
                        UsageHistoryResponse.Data.Series.builder()
                            .addPoint(
                                UsageHistoryResponse.Data.Series.Point.builder()
                                    .isResetPoint(true)
                                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .value(0.0)
                                    .build()
                            )
                            .addTag(
                                UsageHistoryResponse.Data.Series.Tag.builder()
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
        val usageHistoryResponse =
            UsageHistoryResponse.builder()
                .data(
                    UsageHistoryResponse.Data.builder()
                        .addMarker(
                            UsageHistoryResponse.Data.Marker.builder()
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .type(UsageHistoryResponse.Data.Marker.Type.PERIODIC_RESET)
                                .build()
                        )
                        .addSeries(
                            UsageHistoryResponse.Data.Series.builder()
                                .addPoint(
                                    UsageHistoryResponse.Data.Series.Point.builder()
                                        .isResetPoint(true)
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .value(0.0)
                                        .build()
                                )
                                .addTag(
                                    UsageHistoryResponse.Data.Series.Tag.builder()
                                        .key("key")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedUsageHistoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageHistoryResponse),
                jacksonTypeRef<UsageHistoryResponse>(),
            )

        assertThat(roundtrippedUsageHistoryResponse).isEqualTo(usageHistoryResponse)
    }
}
