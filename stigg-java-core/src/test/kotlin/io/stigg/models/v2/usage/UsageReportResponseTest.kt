// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v2.usage

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
                .data(
                    UsageReportResponse.Data.builder()
                        .addUsage(
                            UsageReportResponse.Data.Usage.builder()
                                .id("id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .customerId("customerId")
                                .featureId("featureId")
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .value(0.0)
                                .credit(
                                    UsageReportResponse.Data.Usage.Credit.builder()
                                        .consumed(0.0)
                                        .currencyId("currencyId")
                                        .build()
                                )
                                .currentUsage(0.0)
                                .nextResetDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .resourceId("resourceId")
                                .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .addCredit(
                            UsageReportResponse.Data.Credit.builder()
                                .currencyId("currencyId")
                                .currentUsage(0.0)
                                .customerId("customerId")
                                .resourceId("resourceId")
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usageLimit(0.0)
                                .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .addEntity(
                            UsageReportResponse.Data.Entity.builder()
                                .currentUsage(0.0)
                                .customerId("customerId")
                                .entitlementId("entitlementId")
                                .entityId("entityId")
                                .resourceId("resourceId")
                                .addScopeEntityId("string")
                                .usageUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currencyId("currencyId")
                                .featureId("featureId")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(usageReportResponse.data())
            .isEqualTo(
                UsageReportResponse.Data.builder()
                    .addUsage(
                        UsageReportResponse.Data.Usage.builder()
                            .id("id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .customerId("customerId")
                            .featureId("featureId")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .value(0.0)
                            .credit(
                                UsageReportResponse.Data.Usage.Credit.builder()
                                    .consumed(0.0)
                                    .currencyId("currencyId")
                                    .build()
                            )
                            .currentUsage(0.0)
                            .nextResetDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .resourceId("resourceId")
                            .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addCredit(
                        UsageReportResponse.Data.Credit.builder()
                            .currencyId("currencyId")
                            .currentUsage(0.0)
                            .customerId("customerId")
                            .resourceId("resourceId")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .usageLimit(0.0)
                            .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addEntity(
                        UsageReportResponse.Data.Entity.builder()
                            .currentUsage(0.0)
                            .customerId("customerId")
                            .entitlementId("entitlementId")
                            .entityId("entityId")
                            .resourceId("resourceId")
                            .addScopeEntityId("string")
                            .usageUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currencyId("currencyId")
                            .featureId("featureId")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageReportResponse =
            UsageReportResponse.builder()
                .data(
                    UsageReportResponse.Data.builder()
                        .addUsage(
                            UsageReportResponse.Data.Usage.builder()
                                .id("id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .customerId("customerId")
                                .featureId("featureId")
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .value(0.0)
                                .credit(
                                    UsageReportResponse.Data.Usage.Credit.builder()
                                        .consumed(0.0)
                                        .currencyId("currencyId")
                                        .build()
                                )
                                .currentUsage(0.0)
                                .nextResetDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .resourceId("resourceId")
                                .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .addCredit(
                            UsageReportResponse.Data.Credit.builder()
                                .currencyId("currencyId")
                                .currentUsage(0.0)
                                .customerId("customerId")
                                .resourceId("resourceId")
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usageLimit(0.0)
                                .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .addEntity(
                            UsageReportResponse.Data.Entity.builder()
                                .currentUsage(0.0)
                                .customerId("customerId")
                                .entitlementId("entitlementId")
                                .entityId("entityId")
                                .resourceId("resourceId")
                                .addScopeEntityId("string")
                                .usageUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currencyId("currencyId")
                                .featureId("featureId")
                                .build()
                        )
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
