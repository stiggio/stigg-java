// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans.entitlements

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementCreateParamsTest {

    @Test
    fun create() {
        EntitlementCreateParams.builder()
            .planId("planId")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .addEntitlement(
                EntitlementCreateParams.Entitlement.Feature.builder()
                    .id("id")
                    .behavior(EntitlementCreateParams.Entitlement.Feature.Behavior.INCREMENT)
                    .description("description")
                    .displayNameOverride("displayNameOverride")
                    .addEnumValue("string")
                    .hasSoftLimit(true)
                    .hasUnlimitedUsage(true)
                    .addHiddenFromWidget(
                        EntitlementCreateParams.Entitlement.Feature.HiddenFromWidget.PAYWALL
                    )
                    .isCustom(true)
                    .isGranted(true)
                    .monthlyResetPeriodConfiguration(
                        EntitlementCreateParams.Entitlement.Feature.MonthlyResetPeriodConfiguration
                            .builder()
                            .accordingTo(
                                EntitlementCreateParams.Entitlement.Feature
                                    .MonthlyResetPeriodConfiguration
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .order(0.0)
                    .resetPeriod(EntitlementCreateParams.Entitlement.Feature.ResetPeriod.YEAR)
                    .usageLimit(0L)
                    .weeklyResetPeriodConfiguration(
                        EntitlementCreateParams.Entitlement.Feature.WeeklyResetPeriodConfiguration
                            .builder()
                            .accordingTo(
                                EntitlementCreateParams.Entitlement.Feature
                                    .WeeklyResetPeriodConfiguration
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .yearlyResetPeriodConfiguration(
                        EntitlementCreateParams.Entitlement.Feature.YearlyResetPeriodConfiguration
                            .builder()
                            .accordingTo(
                                EntitlementCreateParams.Entitlement.Feature
                                    .YearlyResetPeriodConfiguration
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
            EntitlementCreateParams.builder().planId("planId").addFeatureEntitlement("id").build()

        assertThat(params._pathParam(0)).isEqualTo("planId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            EntitlementCreateParams.builder()
                .planId("planId")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addEntitlement(
                    EntitlementCreateParams.Entitlement.Feature.builder()
                        .id("id")
                        .behavior(EntitlementCreateParams.Entitlement.Feature.Behavior.INCREMENT)
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            EntitlementCreateParams.Entitlement.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .monthlyResetPeriodConfiguration(
                            EntitlementCreateParams.Entitlement.Feature
                                .MonthlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementCreateParams.Entitlement.Feature
                                        .MonthlyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .order(0.0)
                        .resetPeriod(EntitlementCreateParams.Entitlement.Feature.ResetPeriod.YEAR)
                        .usageLimit(0L)
                        .weeklyResetPeriodConfiguration(
                            EntitlementCreateParams.Entitlement.Feature
                                .WeeklyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementCreateParams.Entitlement.Feature
                                        .WeeklyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .yearlyResetPeriodConfiguration(
                            EntitlementCreateParams.Entitlement.Feature
                                .YearlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementCreateParams.Entitlement.Feature
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
            EntitlementCreateParams.builder().planId("planId").addFeatureEntitlement("id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EntitlementCreateParams.builder()
                .planId("planId")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addEntitlement(
                    EntitlementCreateParams.Entitlement.Feature.builder()
                        .id("id")
                        .behavior(EntitlementCreateParams.Entitlement.Feature.Behavior.INCREMENT)
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            EntitlementCreateParams.Entitlement.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .monthlyResetPeriodConfiguration(
                            EntitlementCreateParams.Entitlement.Feature
                                .MonthlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementCreateParams.Entitlement.Feature
                                        .MonthlyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .order(0.0)
                        .resetPeriod(EntitlementCreateParams.Entitlement.Feature.ResetPeriod.YEAR)
                        .usageLimit(0L)
                        .weeklyResetPeriodConfiguration(
                            EntitlementCreateParams.Entitlement.Feature
                                .WeeklyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementCreateParams.Entitlement.Feature
                                        .WeeklyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .yearlyResetPeriodConfiguration(
                            EntitlementCreateParams.Entitlement.Feature
                                .YearlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementCreateParams.Entitlement.Feature
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

        assertThat(body.entitlements())
            .containsExactly(
                EntitlementCreateParams.Entitlement.ofFeature(
                    EntitlementCreateParams.Entitlement.Feature.builder()
                        .id("id")
                        .behavior(EntitlementCreateParams.Entitlement.Feature.Behavior.INCREMENT)
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            EntitlementCreateParams.Entitlement.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .monthlyResetPeriodConfiguration(
                            EntitlementCreateParams.Entitlement.Feature
                                .MonthlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementCreateParams.Entitlement.Feature
                                        .MonthlyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .order(0.0)
                        .resetPeriod(EntitlementCreateParams.Entitlement.Feature.ResetPeriod.YEAR)
                        .usageLimit(0L)
                        .weeklyResetPeriodConfiguration(
                            EntitlementCreateParams.Entitlement.Feature
                                .WeeklyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementCreateParams.Entitlement.Feature
                                        .WeeklyResetPeriodConfiguration
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .yearlyResetPeriodConfiguration(
                            EntitlementCreateParams.Entitlement.Feature
                                .YearlyResetPeriodConfiguration
                                .builder()
                                .accordingTo(
                                    EntitlementCreateParams.Entitlement.Feature
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
            EntitlementCreateParams.builder().planId("planId").addFeatureEntitlement("id").build()

        val body = params._body()

        assertThat(body.entitlements())
            .containsExactly(
                EntitlementCreateParams.Entitlement.ofFeature(
                    EntitlementCreateParams.Entitlement.Feature.builder().id("id").build()
                )
            )
    }
}
