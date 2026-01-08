// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateUsageResponseTest {

    @Test
    fun create() {
        val v1CreateUsageResponse =
            V1CreateUsageResponse.builder()
                .addData(
                    V1CreateUsageResponse.Data.builder()
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

        assertThat(v1CreateUsageResponse.data())
            .containsExactly(
                V1CreateUsageResponse.Data.builder()
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
        val v1CreateUsageResponse =
            V1CreateUsageResponse.builder()
                .addData(
                    V1CreateUsageResponse.Data.builder()
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

        val roundtrippedV1CreateUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1CreateUsageResponse),
                jacksonTypeRef<V1CreateUsageResponse>(),
            )

        assertThat(roundtrippedV1CreateUsageResponse).isEqualTo(v1CreateUsageResponse)
    }
}
