// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageReportResponseTest {

    @Test
    fun create() {
        val usageReportResponse =
            UsageReportResponse.builder()
                .addData(
                    UsageReportResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customerId")
                        .featureId("featureId")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(0.0)
                        .currentUsage(0.0)
                        .nextResetDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .resourceId("resourceId")
                        .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(usageReportResponse.data())
            .containsExactly(
                UsageReportResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customerId")
                    .featureId("featureId")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value(0.0)
                    .currentUsage(0.0)
                    .nextResetDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .resourceId("resourceId")
                    .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageReportResponse =
            UsageReportResponse.builder()
                .addData(
                    UsageReportResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customerId")
                        .featureId("featureId")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(0.0)
                        .currentUsage(0.0)
                        .nextResetDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .resourceId("resourceId")
                        .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedUsageReportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageReportResponse),
                jacksonTypeRef<UsageReportResponse>(),
            )

        assertThat(roundtrippedUsageReportResponse).isEqualTo(usageReportResponse)
    }
}
