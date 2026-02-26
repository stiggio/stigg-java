// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.addons

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.addons.entitlements.EntitlementCreateParams
import io.stigg.models.v1.addons.entitlements.EntitlementDeleteParams
import io.stigg.models.v1.addons.entitlements.EntitlementUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntitlementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().addons().entitlements()

        val entitlementFuture =
            entitlementServiceAsync.create(
                EntitlementCreateParams.builder()
                    .addonId("addonId")
                    .addEntitlement(
                        EntitlementCreateParams.Entitlement.builder()
                            .credit(
                                EntitlementCreateParams.Entitlement.Credit.builder()
                                    .amount(1.0)
                                    .cadence(
                                        EntitlementCreateParams.Entitlement.Credit.Cadence.MONTH
                                    )
                                    .customCurrencyId("customCurrencyId")
                                    .behavior(
                                        EntitlementCreateParams.Entitlement.Credit.Behavior
                                            .INCREMENT
                                    )
                                    .description("description")
                                    .displayNameOverride("displayNameOverride")
                                    .addHiddenFromWidget(
                                        EntitlementCreateParams.Entitlement.Credit.HiddenFromWidget
                                            .PAYWALL
                                    )
                                    .isCustom(true)
                                    .isGranted(true)
                                    .order(0.0)
                                    .build()
                            )
                            .feature(
                                EntitlementCreateParams.Entitlement.Feature.builder()
                                    .featureId("featureId")
                                    .behavior(
                                        EntitlementCreateParams.Entitlement.Feature.Behavior
                                            .INCREMENT
                                    )
                                    .description("description")
                                    .displayNameOverride("displayNameOverride")
                                    .addEnumValue("string")
                                    .hasSoftLimit(true)
                                    .hasUnlimitedUsage(true)
                                    .addHiddenFromWidget(
                                        EntitlementCreateParams.Entitlement.Feature.HiddenFromWidget
                                            .PAYWALL
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
                    .build()
            )

        val entitlement = entitlementFuture.get()
        entitlement.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().addons().entitlements()

        val addonPackageEntitlementFuture =
            entitlementServiceAsync.update(
                EntitlementUpdateParams.builder()
                    .addonId("addonId")
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
                                        EntitlementUpdateParams.Feature
                                            .MonthlyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .order(0.0)
                            .resetPeriod(EntitlementUpdateParams.Feature.ResetPeriod.YEAR)
                            .usageLimit(0L)
                            .weeklyResetPeriodConfiguration(
                                EntitlementUpdateParams.Feature.WeeklyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        EntitlementUpdateParams.Feature
                                            .WeeklyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .yearlyResetPeriodConfiguration(
                                EntitlementUpdateParams.Feature.YearlyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        EntitlementUpdateParams.Feature
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

        val addonPackageEntitlement = addonPackageEntitlementFuture.get()
        addonPackageEntitlement.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().addons().entitlements()

        val entitlementsFuture = entitlementServiceAsync.list("addonId")

        val entitlements = entitlementsFuture.get()
        entitlements.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().addons().entitlements()

        val addonPackageEntitlementFuture =
            entitlementServiceAsync.delete(
                EntitlementDeleteParams.builder().addonId("addonId").id("id").build()
            )

        val addonPackageEntitlement = addonPackageEntitlementFuture.get()
        addonPackageEntitlement.validate()
    }
}
