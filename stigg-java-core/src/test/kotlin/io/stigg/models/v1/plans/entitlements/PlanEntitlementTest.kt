// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans.entitlements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanEntitlementTest {

    @Test
    fun create() {
        val planEntitlement =
            PlanEntitlement.builder()
                .data(
                    PlanEntitlement.Data.Feature.builder()
                        .id("id")
                        .behavior(PlanEntitlement.Data.Feature.Behavior.INCREMENT)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(PlanEntitlement.Data.Feature.HiddenFromWidget.PAYWALL)
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(PlanEntitlement.Data.Feature.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PlanEntitlement.Data.Feature.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    PlanEntitlement.Data.Feature.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        assertThat(planEntitlement.data())
            .isEqualTo(
                PlanEntitlement.Data.ofFeature(
                    PlanEntitlement.Data.Feature.builder()
                        .id("id")
                        .behavior(PlanEntitlement.Data.Feature.Behavior.INCREMENT)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(PlanEntitlement.Data.Feature.HiddenFromWidget.PAYWALL)
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(PlanEntitlement.Data.Feature.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PlanEntitlement.Data.Feature.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    PlanEntitlement.Data.Feature.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planEntitlement =
            PlanEntitlement.builder()
                .data(
                    PlanEntitlement.Data.Feature.builder()
                        .id("id")
                        .behavior(PlanEntitlement.Data.Feature.Behavior.INCREMENT)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(PlanEntitlement.Data.Feature.HiddenFromWidget.PAYWALL)
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(PlanEntitlement.Data.Feature.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PlanEntitlement.Data.Feature.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    PlanEntitlement.Data.Feature.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        val roundtrippedPlanEntitlement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planEntitlement),
                jacksonTypeRef<PlanEntitlement>(),
            )

        assertThat(roundtrippedPlanEntitlement).isEqualTo(planEntitlement)
    }
}
