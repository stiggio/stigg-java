// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.promotionalentitlements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromotionalEntitlementRevokeResponseTest {

    @Test
    fun create() {
        val promotionalEntitlementRevokeResponse =
            PromotionalEntitlementRevokeResponse.builder()
                .data(
                    PromotionalEntitlementRevokeResponse.Data.builder()
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
                        .period(PromotionalEntitlementRevokeResponse.Data.Period._1_WEEK)
                        .resetPeriod(PromotionalEntitlementRevokeResponse.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PromotionalEntitlementRevokeResponse.Data.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    PromotionalEntitlementRevokeResponse.Data
                                        .ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PromotionalEntitlementRevokeResponse.Data.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        assertThat(promotionalEntitlementRevokeResponse.data())
            .isEqualTo(
                PromotionalEntitlementRevokeResponse.Data.builder()
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
                    .period(PromotionalEntitlementRevokeResponse.Data.Period._1_WEEK)
                    .resetPeriod(PromotionalEntitlementRevokeResponse.Data.ResetPeriod.YEAR)
                    .resetPeriodConfiguration(
                        PromotionalEntitlementRevokeResponse.Data.ResetPeriodConfiguration
                            .YearlyResetPeriodConfig
                            .builder()
                            .accordingTo(
                                PromotionalEntitlementRevokeResponse.Data.ResetPeriodConfiguration
                                    .YearlyResetPeriodConfig
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(PromotionalEntitlementRevokeResponse.Data.Status.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .usageLimit(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promotionalEntitlementRevokeResponse =
            PromotionalEntitlementRevokeResponse.builder()
                .data(
                    PromotionalEntitlementRevokeResponse.Data.builder()
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
                        .period(PromotionalEntitlementRevokeResponse.Data.Period._1_WEEK)
                        .resetPeriod(PromotionalEntitlementRevokeResponse.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PromotionalEntitlementRevokeResponse.Data.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    PromotionalEntitlementRevokeResponse.Data
                                        .ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PromotionalEntitlementRevokeResponse.Data.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        val roundtrippedPromotionalEntitlementRevokeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promotionalEntitlementRevokeResponse),
                jacksonTypeRef<PromotionalEntitlementRevokeResponse>(),
            )

        assertThat(roundtrippedPromotionalEntitlementRevokeResponse)
            .isEqualTo(promotionalEntitlementRevokeResponse)
    }
}
