// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.plans

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.plans.entitlements.EntitlementCreateParams
import io.stigg.models.v1.plans.entitlements.EntitlementDeleteParams
import io.stigg.models.v1.plans.entitlements.EntitlementListParams
import io.stigg.models.v1.plans.entitlements.EntitlementUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntitlementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().plans().entitlements()

        val entitlementFuture =
            entitlementServiceAsync.create(
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

        val entitlement = entitlementFuture.get()
        entitlement.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().plans().entitlements()

        val planEntitlementFuture =
            entitlementServiceAsync.update(
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

        val planEntitlement = planEntitlementFuture.get()
        planEntitlement.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().plans().entitlements()

        val entitlementsFuture =
            entitlementServiceAsync.list(
                EntitlementListParams.builder()
                    .planId("planId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val entitlements = entitlementsFuture.get()
        entitlements.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().plans().entitlements()

        val planEntitlementFuture =
            entitlementServiceAsync.delete(
                EntitlementDeleteParams.builder()
                    .planId("planId")
                    .id("id")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val planEntitlement = planEntitlementFuture.get()
        planEntitlement.validate()
    }
}
