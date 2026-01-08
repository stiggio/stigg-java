// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers.promotional

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromotionalCreateResponseTest {

    @Test
    fun create() {
        val promotionalCreateResponse =
            PromotionalCreateResponse.builder()
                .addData(
                    PromotionalCreateResponse.Data.builder()
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
                        .period(PromotionalCreateResponse.Data.Period._1_WEEK)
                        .resetPeriod(PromotionalCreateResponse.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PromotionalCreateResponse.Data.ResetPeriodConfiguration.AccordingTo
                                .builder()
                                .accordingTo(
                                    PromotionalCreateResponse.Data.ResetPeriodConfiguration
                                        .AccordingTo
                                        .InnerAccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PromotionalCreateResponse.Data.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        assertThat(promotionalCreateResponse.data())
            .containsExactly(
                PromotionalCreateResponse.Data.builder()
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
                    .period(PromotionalCreateResponse.Data.Period._1_WEEK)
                    .resetPeriod(PromotionalCreateResponse.Data.ResetPeriod.YEAR)
                    .resetPeriodConfiguration(
                        PromotionalCreateResponse.Data.ResetPeriodConfiguration.AccordingTo
                            .builder()
                            .accordingTo(
                                PromotionalCreateResponse.Data.ResetPeriodConfiguration.AccordingTo
                                    .InnerAccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(PromotionalCreateResponse.Data.Status.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .usageLimit(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promotionalCreateResponse =
            PromotionalCreateResponse.builder()
                .addData(
                    PromotionalCreateResponse.Data.builder()
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
                        .period(PromotionalCreateResponse.Data.Period._1_WEEK)
                        .resetPeriod(PromotionalCreateResponse.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PromotionalCreateResponse.Data.ResetPeriodConfiguration.AccordingTo
                                .builder()
                                .accordingTo(
                                    PromotionalCreateResponse.Data.ResetPeriodConfiguration
                                        .AccordingTo
                                        .InnerAccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PromotionalCreateResponse.Data.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        val roundtrippedPromotionalCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promotionalCreateResponse),
                jacksonTypeRef<PromotionalCreateResponse>(),
            )

        assertThat(roundtrippedPromotionalCreateResponse).isEqualTo(promotionalCreateResponse)
    }
}
