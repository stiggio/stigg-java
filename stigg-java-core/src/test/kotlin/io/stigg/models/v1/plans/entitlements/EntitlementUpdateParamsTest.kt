// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans.entitlements

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementUpdateParamsTest {

    @Test
    fun create() {
        EntitlementUpdateParams.builder()
            .planId("planId")
            .id("id")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .body(
                EntitlementUpdateParams.Body.Feature.builder()
                    .behavior(EntitlementUpdateParams.Body.Feature.Behavior.INCREMENT)
                    .description("description")
                    .displayNameOverride("displayNameOverride")
                    .addEnumValue("string")
                    .hasSoftLimit(true)
                    .hasUnlimitedUsage(true)
                    .addHiddenFromWidget(
                        EntitlementUpdateParams.Body.Feature.HiddenFromWidget.PAYWALL
                    )
                    .isCustom(true)
                    .isGranted(true)
                    .monthlyResetPeriodConfiguration(
                        EntitlementUpdateParams.Body.Feature.MonthlyResetPeriodConfiguration
                            .builder()
                            .accordingTo(
                                EntitlementUpdateParams.Body.Feature.MonthlyResetPeriodConfiguration
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .order(0.0)
                    .resetPeriod(EntitlementUpdateParams.Body.Feature.ResetPeriod.YEAR)
                    .usageLimit(0L)
                    .weeklyResetPeriodConfiguration(
                        EntitlementUpdateParams.Body.Feature.WeeklyResetPeriodConfiguration
                            .builder()
                            .accordingTo(
                                EntitlementUpdateParams.Body.Feature.WeeklyResetPeriodConfiguration
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .yearlyResetPeriodConfiguration(
                        EntitlementUpdateParams.Body.Feature.YearlyResetPeriodConfiguration
                            .builder()
                            .accordingTo(
                                EntitlementUpdateParams.Body.Feature.YearlyResetPeriodConfiguration
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
        val params =
            EntitlementUpdateParams.builder()
                .planId("planId")
                .id("id")
                .body(EntitlementUpdateParams.Body.Feature.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("planId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            EntitlementUpdateParams.builder()
                .planId("planId")
                .id("id")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .body(
                    EntitlementUpdateParams.Body.Feature.builder()
                        .behavior(EntitlementUpdateParams.Body.Feature.Behavior.INCREMENT)
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            EntitlementUpdateParams.Body.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .monthlyResetPeriodConfiguration(
                            EntitlementUpdateParams.Body.Feature.MonthlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementUpdateParams.Body.Feature
                                        .MonthlyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .order(0.0)
                        .resetPeriod(EntitlementUpdateParams.Body.Feature.ResetPeriod.YEAR)
                        .usageLimit(0L)
                        .weeklyResetPeriodConfiguration(
                            EntitlementUpdateParams.Body.Feature.WeeklyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementUpdateParams.Body.Feature
                                        .WeeklyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .yearlyResetPeriodConfiguration(
                            EntitlementUpdateParams.Body.Feature.YearlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementUpdateParams.Body.Feature
                                        .YearlyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            EntitlementUpdateParams.builder()
                .planId("planId")
                .id("id")
                .body(EntitlementUpdateParams.Body.Feature.builder().build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EntitlementUpdateParams.builder()
                .planId("planId")
                .id("id")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .body(
                    EntitlementUpdateParams.Body.Feature.builder()
                        .behavior(EntitlementUpdateParams.Body.Feature.Behavior.INCREMENT)
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            EntitlementUpdateParams.Body.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .monthlyResetPeriodConfiguration(
                            EntitlementUpdateParams.Body.Feature.MonthlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementUpdateParams.Body.Feature
                                        .MonthlyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .order(0.0)
                        .resetPeriod(EntitlementUpdateParams.Body.Feature.ResetPeriod.YEAR)
                        .usageLimit(0L)
                        .weeklyResetPeriodConfiguration(
                            EntitlementUpdateParams.Body.Feature.WeeklyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementUpdateParams.Body.Feature
                                        .WeeklyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .yearlyResetPeriodConfiguration(
                            EntitlementUpdateParams.Body.Feature.YearlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementUpdateParams.Body.Feature
                                        .YearlyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EntitlementUpdateParams.Body.ofFeature(
                    EntitlementUpdateParams.Body.Feature.builder()
                        .behavior(EntitlementUpdateParams.Body.Feature.Behavior.INCREMENT)
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            EntitlementUpdateParams.Body.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .monthlyResetPeriodConfiguration(
                            EntitlementUpdateParams.Body.Feature.MonthlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementUpdateParams.Body.Feature
                                        .MonthlyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .order(0.0)
                        .resetPeriod(EntitlementUpdateParams.Body.Feature.ResetPeriod.YEAR)
                        .usageLimit(0L)
                        .weeklyResetPeriodConfiguration(
                            EntitlementUpdateParams.Body.Feature.WeeklyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementUpdateParams.Body.Feature
                                        .WeeklyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .yearlyResetPeriodConfiguration(
                            EntitlementUpdateParams.Body.Feature.YearlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementUpdateParams.Body.Feature
                                        .YearlyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EntitlementUpdateParams.builder()
                .planId("planId")
                .id("id")
                .body(EntitlementUpdateParams.Body.Feature.builder().build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EntitlementUpdateParams.Body.ofFeature(
                    EntitlementUpdateParams.Body.Feature.builder().build()
                )
            )
    }
}
