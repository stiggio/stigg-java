// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.promotionalentitlements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromotionalEntitlementGrantResponseTest {

    @Test
    fun create() {
        val promotionalEntitlementGrantResponse =
            PromotionalEntitlementGrantResponse.builder()
                .addData(
                    PromotionalEntitlementGrantResponse.Data.builder()
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
                        .period(PromotionalEntitlementGrantResponse.Data.Period._1_WEEK)
                        .resetPeriod(PromotionalEntitlementGrantResponse.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PromotionalEntitlementGrantResponse.Data.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    PromotionalEntitlementGrantResponse.Data
                                        .ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PromotionalEntitlementGrantResponse.Data.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        assertThat(promotionalEntitlementGrantResponse.data())
            .containsExactly(
                PromotionalEntitlementGrantResponse.Data.builder()
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
                    .period(PromotionalEntitlementGrantResponse.Data.Period._1_WEEK)
                    .resetPeriod(PromotionalEntitlementGrantResponse.Data.ResetPeriod.YEAR)
                    .resetPeriodConfiguration(
                        PromotionalEntitlementGrantResponse.Data.ResetPeriodConfiguration
                            .YearlyResetPeriodConfig
                            .builder()
                            .accordingTo(
                                PromotionalEntitlementGrantResponse.Data.ResetPeriodConfiguration
                                    .YearlyResetPeriodConfig
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(PromotionalEntitlementGrantResponse.Data.Status.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .usageLimit(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promotionalEntitlementGrantResponse =
            PromotionalEntitlementGrantResponse.builder()
                .addData(
                    PromotionalEntitlementGrantResponse.Data.builder()
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
                        .period(PromotionalEntitlementGrantResponse.Data.Period._1_WEEK)
                        .resetPeriod(PromotionalEntitlementGrantResponse.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PromotionalEntitlementGrantResponse.Data.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    PromotionalEntitlementGrantResponse.Data
                                        .ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PromotionalEntitlementGrantResponse.Data.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        val roundtrippedPromotionalEntitlementGrantResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promotionalEntitlementGrantResponse),
                jacksonTypeRef<PromotionalEntitlementGrantResponse>(),
            )

        assertThat(roundtrippedPromotionalEntitlementGrantResponse)
            .isEqualTo(promotionalEntitlementGrantResponse)
    }
}
