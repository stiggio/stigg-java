// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.plans

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.plans.entitlements.EntitlementCreateParams
import io.stigg.models.v1.plans.entitlements.EntitlementDeleteParams
import io.stigg.models.v1.plans.entitlements.EntitlementListParams
import io.stigg.models.v1.plans.entitlements.EntitlementUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntitlementServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entitlementService = client.v1().plans().entitlements()

        val entitlement =
            entitlementService.create(
                EntitlementCreateParams.builder()
                    .planId("planId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .addEntitlement(
                        EntitlementCreateParams.Entitlement.Feature.builder()
                            .id("id")
                            .behavior(
                                EntitlementCreateParams.Entitlement.Feature.Behavior.INCREMENT
                            )
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
                            .resetPeriod(
                                EntitlementCreateParams.Entitlement.Feature.ResetPeriod.YEAR
                            )
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
            )

        entitlement.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entitlementService = client.v1().plans().entitlements()

        val planEntitlement =
            entitlementService.update(
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
            )

        planEntitlement.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entitlementService = client.v1().plans().entitlements()

        val entitlements =
            entitlementService.list(
                EntitlementListParams.builder()
                    .planId("planId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        entitlements.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entitlementService = client.v1().plans().entitlements()

        val planEntitlement =
            entitlementService.delete(
                EntitlementDeleteParams.builder()
                    .planId("planId")
                    .id("id")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        planEntitlement.validate()
    }
}
