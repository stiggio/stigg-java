// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.plans.entitlements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementUpdateParamsTest {

    @Test
    fun create() {
        EntitlementUpdateParams.builder()
            .planId("planId")
            .id("id")
            .credit(
                EntitlementUpdateParams.Credit.builder()
                    .amount(1.0)
                    .behavior(EntitlementUpdateParams.Credit.Behavior.INCREMENT)
                    .cadence(EntitlementUpdateParams.Credit.Cadence.MONTH)
                    .description("description")
                    .displayNameOverride("displayNameOverride")
                    .addHiddenFromWidget(EntitlementUpdateParams.Credit.HiddenFromWidget.PAYWALL)
                    .isCustom(true)
                    .isGranted(true)
                    .order(0.0)
                    .build()
            )
            .feature(
                EntitlementUpdateParams.Feature.builder()
                    .behavior(EntitlementUpdateParams.Feature.Behavior.INCREMENT)
                    .description("description")
                    .displayNameOverride("displayNameOverride")
                    .addEnumValue("string")
                    .hasSoftLimit(true)
                    .hasUnlimitedUsage(true)
                    .addHiddenFromWidget(EntitlementUpdateParams.Feature.HiddenFromWidget.PAYWALL)
                    .isCustom(true)
                    .isGranted(true)
                    .monthlyResetPeriodConfiguration(
                        EntitlementUpdateParams.Feature.MonthlyResetPeriodConfiguration.builder()
                            .accordingTo(
                                EntitlementUpdateParams.Feature.MonthlyResetPeriodConfiguration
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .order(0.0)
                    .resetPeriod(EntitlementUpdateParams.Feature.ResetPeriod.YEAR)
                    .usageLimit(0L)
                    .weeklyResetPeriodConfiguration(
                        EntitlementUpdateParams.Feature.WeeklyResetPeriodConfiguration.builder()
                            .accordingTo(
                                EntitlementUpdateParams.Feature.WeeklyResetPeriodConfiguration
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .yearlyResetPeriodConfiguration(
                        EntitlementUpdateParams.Feature.YearlyResetPeriodConfiguration.builder()
                            .accordingTo(
                                EntitlementUpdateParams.Feature.YearlyResetPeriodConfiguration
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = EntitlementUpdateParams.builder().planId("planId").id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("planId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EntitlementUpdateParams.builder()
                .planId("planId")
                .id("id")
                .credit(
                    EntitlementUpdateParams.Credit.builder()
                        .amount(1.0)
                        .behavior(EntitlementUpdateParams.Credit.Behavior.INCREMENT)
                        .cadence(EntitlementUpdateParams.Credit.Cadence.MONTH)
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addHiddenFromWidget(
                            EntitlementUpdateParams.Credit.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .build()
                )
                .feature(
                    EntitlementUpdateParams.Feature.builder()
                        .behavior(EntitlementUpdateParams.Feature.Behavior.INCREMENT)
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            EntitlementUpdateParams.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .monthlyResetPeriodConfiguration(
                            EntitlementUpdateParams.Feature.MonthlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementUpdateParams.Feature.MonthlyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .order(0.0)
                        .resetPeriod(EntitlementUpdateParams.Feature.ResetPeriod.YEAR)
                        .usageLimit(0L)
                        .weeklyResetPeriodConfiguration(
                            EntitlementUpdateParams.Feature.WeeklyResetPeriodConfiguration.builder()
                                .accordingTo(
                                    EntitlementUpdateParams.Feature.WeeklyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .yearlyResetPeriodConfiguration(
                            EntitlementUpdateParams.Feature.YearlyResetPeriodConfiguration.builder()
                                .accordingTo(
                                    EntitlementUpdateParams.Feature.YearlyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.credit())
            .contains(
                EntitlementUpdateParams.Credit.builder()
                    .amount(1.0)
                    .behavior(EntitlementUpdateParams.Credit.Behavior.INCREMENT)
                    .cadence(EntitlementUpdateParams.Credit.Cadence.MONTH)
                    .description("description")
                    .displayNameOverride("displayNameOverride")
                    .addHiddenFromWidget(EntitlementUpdateParams.Credit.HiddenFromWidget.PAYWALL)
                    .isCustom(true)
                    .isGranted(true)
                    .order(0.0)
                    .build()
            )
        assertThat(body.feature())
            .contains(
                EntitlementUpdateParams.Feature.builder()
                    .behavior(EntitlementUpdateParams.Feature.Behavior.INCREMENT)
                    .description("description")
                    .displayNameOverride("displayNameOverride")
                    .addEnumValue("string")
                    .hasSoftLimit(true)
                    .hasUnlimitedUsage(true)
                    .addHiddenFromWidget(EntitlementUpdateParams.Feature.HiddenFromWidget.PAYWALL)
                    .isCustom(true)
                    .isGranted(true)
                    .monthlyResetPeriodConfiguration(
                        EntitlementUpdateParams.Feature.MonthlyResetPeriodConfiguration.builder()
                            .accordingTo(
                                EntitlementUpdateParams.Feature.MonthlyResetPeriodConfiguration
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .order(0.0)
                    .resetPeriod(EntitlementUpdateParams.Feature.ResetPeriod.YEAR)
                    .usageLimit(0L)
                    .weeklyResetPeriodConfiguration(
                        EntitlementUpdateParams.Feature.WeeklyResetPeriodConfiguration.builder()
                            .accordingTo(
                                EntitlementUpdateParams.Feature.WeeklyResetPeriodConfiguration
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .yearlyResetPeriodConfiguration(
                        EntitlementUpdateParams.Feature.YearlyResetPeriodConfiguration.builder()
                            .accordingTo(
                                EntitlementUpdateParams.Feature.YearlyResetPeriodConfiguration
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EntitlementUpdateParams.builder().planId("planId").id("id").build()

        val body = params._body()
    }
}
