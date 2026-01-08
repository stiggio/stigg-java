// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers.promotional

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromotionalRevokeResponseTest {

    @Test
    fun create() {
        val promotionalRevokeResponse =
            PromotionalRevokeResponse.builder()
                .data(
                    PromotionalRevokeResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addEnumValue("string")
                        .environmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addFeatureGroupId("string")
                        .featureId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .isVisible(true)
                        .period(PromotionalRevokeResponse.Data.Period._1_WEEK)
                        .resetPeriod(PromotionalRevokeResponse.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PromotionalRevokeResponse.Data.ResetPeriodConfiguration.AccordingTo
                                .builder()
                                .accordingTo(
                                    PromotionalRevokeResponse.Data.ResetPeriodConfiguration
                                        .AccordingTo
                                        .InnerAccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PromotionalRevokeResponse.Data.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        assertThat(promotionalRevokeResponse.data())
            .isEqualTo(
                PromotionalRevokeResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addEnumValue("string")
                    .environmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addFeatureGroupId("string")
                    .featureId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .hasSoftLimit(true)
                    .hasUnlimitedUsage(true)
                    .isVisible(true)
                    .period(PromotionalRevokeResponse.Data.Period._1_WEEK)
                    .resetPeriod(PromotionalRevokeResponse.Data.ResetPeriod.YEAR)
                    .resetPeriodConfiguration(
                        PromotionalRevokeResponse.Data.ResetPeriodConfiguration.AccordingTo
                            .builder()
                            .accordingTo(
                                PromotionalRevokeResponse.Data.ResetPeriodConfiguration.AccordingTo
                                    .InnerAccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(PromotionalRevokeResponse.Data.Status.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .usageLimit(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promotionalRevokeResponse =
            PromotionalRevokeResponse.builder()
                .data(
                    PromotionalRevokeResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addEnumValue("string")
                        .environmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addFeatureGroupId("string")
                        .featureId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .isVisible(true)
                        .period(PromotionalRevokeResponse.Data.Period._1_WEEK)
                        .resetPeriod(PromotionalRevokeResponse.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PromotionalRevokeResponse.Data.ResetPeriodConfiguration.AccordingTo
                                .builder()
                                .accordingTo(
                                    PromotionalRevokeResponse.Data.ResetPeriodConfiguration
                                        .AccordingTo
                                        .InnerAccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PromotionalRevokeResponse.Data.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        val roundtrippedPromotionalRevokeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promotionalRevokeResponse),
                jacksonTypeRef<PromotionalRevokeResponse>(),
            )

        assertThat(roundtrippedPromotionalRevokeResponse).isEqualTo(promotionalRevokeResponse)
    }
}
