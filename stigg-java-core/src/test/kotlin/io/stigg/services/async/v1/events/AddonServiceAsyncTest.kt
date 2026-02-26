// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.events.addons.AddonCreateAddonParams
import io.stigg.models.v1.events.addons.AddonPublishAddonParams
import io.stigg.models.v1.events.addons.AddonSetPricingParams
import io.stigg.models.v1.events.addons.AddonUpdateAddonParams
import io.stigg.models.v1.events.addons.SetPackagePricing
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AddonServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun archiveAddon() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val addonFuture = addonServiceAsync.archiveAddon("x")

        val addon = addonFuture.get()
        addon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAddon() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val addonFuture =
            addonServiceAsync.createAddon(
                AddonCreateAddonParams.builder()
                    .id("id")
                    .displayName("displayName")
                    .productId("productId")
                    .billingId("billingId")
                    .description("description")
                    .maxQuantity(0L)
                    .metadata(
                        AddonCreateAddonParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pricingType(AddonCreateAddonParams.PricingType.FREE)
                    .status(AddonCreateAddonParams.Status.DRAFT)
                    .build()
            )

        val addon = addonFuture.get()
        addon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAddons() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val pageFuture = addonServiceAsync.listAddons()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publishAddon() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val responseFuture =
            addonServiceAsync.publishAddon(
                AddonPublishAddonParams.builder()
                    .id("x")
                    .migrationType(AddonPublishAddonParams.MigrationType.NEW_CUSTOMERS)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveAddon() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val addonFuture = addonServiceAsync.retrieveAddon("x")

        val addon = addonFuture.get()
        addon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setPricing() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val setPackagePricingResponseFuture =
            addonServiceAsync.setPricing(
                AddonSetPricingParams.builder()
                    .id("x")
                    .setPackagePricing(
                        SetPackagePricing.builder()
                            .pricingType(SetPackagePricing.PricingType.FREE)
                            .billingId("billingId")
                            .addMinimumSpend(
                                SetPackagePricing.MinimumSpend.builder()
                                    .billingPeriod(
                                        SetPackagePricing.MinimumSpend.BillingPeriod.MONTHLY
                                    )
                                    .minimum(
                                        SetPackagePricing.MinimumSpend.Minimum.builder()
                                            .amount(0.0)
                                            .currency(
                                                SetPackagePricing.MinimumSpend.Minimum.Currency.USD
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .overageBillingPeriod(
                                SetPackagePricing.OverageBillingPeriod.ON_SUBSCRIPTION_RENEWAL
                            )
                            .addOveragePricingModel(
                                SetPackagePricing.OveragePricingModel.builder()
                                    .billingModel(
                                        SetPackagePricing.OveragePricingModel.BillingModel.FLAT_FEE
                                    )
                                    .addPricePeriod(
                                        SetPackagePricing.OveragePricingModel.PricePeriod.builder()
                                            .billingPeriod(
                                                SetPackagePricing.OveragePricingModel.PricePeriod
                                                    .BillingPeriod
                                                    .MONTHLY
                                            )
                                            .billingCountryCode("billingCountryCode")
                                            .blockSize(0.0)
                                            .creditGrantCadence(
                                                SetPackagePricing.OveragePricingModel.PricePeriod
                                                    .CreditGrantCadence
                                                    .BEGINNING_OF_BILLING_PERIOD
                                            )
                                            .creditRate(
                                                SetPackagePricing.OveragePricingModel.PricePeriod
                                                    .CreditRate
                                                    .builder()
                                                    .amount(1.0)
                                                    .currencyId("currencyId")
                                                    .costFormula("costFormula")
                                                    .build()
                                            )
                                            .price(
                                                SetPackagePricing.OveragePricingModel.PricePeriod
                                                    .Price
                                                    .builder()
                                                    .amount(0.0)
                                                    .currency(
                                                        SetPackagePricing.OveragePricingModel
                                                            .PricePeriod
                                                            .Price
                                                            .Currency
                                                            .USD
                                                    )
                                                    .build()
                                            )
                                            .addTier(
                                                SetPackagePricing.OveragePricingModel.PricePeriod
                                                    .Tier
                                                    .builder()
                                                    .flatPrice(
                                                        SetPackagePricing.OveragePricingModel
                                                            .PricePeriod
                                                            .Tier
                                                            .FlatPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                SetPackagePricing
                                                                    .OveragePricingModel
                                                                    .PricePeriod
                                                                    .Tier
                                                                    .FlatPrice
                                                                    .Currency
                                                                    .USD
                                                            )
                                                            .build()
                                                    )
                                                    .unitPrice(
                                                        SetPackagePricing.OveragePricingModel
                                                            .PricePeriod
                                                            .Tier
                                                            .UnitPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                SetPackagePricing
                                                                    .OveragePricingModel
                                                                    .PricePeriod
                                                                    .Tier
                                                                    .UnitPrice
                                                                    .Currency
                                                                    .USD
                                                            )
                                                            .build()
                                                    )
                                                    .upTo(0.0)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .billingCadence(
                                        SetPackagePricing.OveragePricingModel.BillingCadence
                                            .RECURRING
                                    )
                                    .entitlement(
                                        SetPackagePricing.OveragePricingModel.Entitlement.builder()
                                            .featureId("featureId")
                                            .hasSoftLimit(true)
                                            .hasUnlimitedUsage(true)
                                            .monthlyResetPeriodConfiguration(
                                                SetPackagePricing.OveragePricingModel.Entitlement
                                                    .MonthlyResetPeriodConfiguration
                                                    .builder()
                                                    .accordingTo(
                                                        SetPackagePricing.OveragePricingModel
                                                            .Entitlement
                                                            .MonthlyResetPeriodConfiguration
                                                            .AccordingTo
                                                            .SUBSCRIPTION_START
                                                    )
                                                    .build()
                                            )
                                            .resetPeriod(
                                                SetPackagePricing.OveragePricingModel.Entitlement
                                                    .ResetPeriod
                                                    .YEAR
                                            )
                                            .usageLimit(0.0)
                                            .weeklyResetPeriodConfiguration(
                                                SetPackagePricing.OveragePricingModel.Entitlement
                                                    .WeeklyResetPeriodConfiguration
                                                    .builder()
                                                    .accordingTo(
                                                        SetPackagePricing.OveragePricingModel
                                                            .Entitlement
                                                            .WeeklyResetPeriodConfiguration
                                                            .AccordingTo
                                                            .SUBSCRIPTION_START
                                                    )
                                                    .build()
                                            )
                                            .yearlyResetPeriodConfiguration(
                                                SetPackagePricing.OveragePricingModel.Entitlement
                                                    .YearlyResetPeriodConfiguration
                                                    .builder()
                                                    .accordingTo(
                                                        SetPackagePricing.OveragePricingModel
                                                            .Entitlement
                                                            .YearlyResetPeriodConfiguration
                                                            .AccordingTo
                                                            .SUBSCRIPTION_START
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .featureId("featureId")
                                    .topUpCustomCurrencyId("topUpCustomCurrencyId")
                                    .build()
                            )
                            .addPricingModel(
                                SetPackagePricing.PricingModel.builder()
                                    .billingModel(
                                        SetPackagePricing.PricingModel.BillingModel.FLAT_FEE
                                    )
                                    .addPricePeriod(
                                        SetPackagePricing.PricingModel.PricePeriod.builder()
                                            .billingPeriod(
                                                SetPackagePricing.PricingModel.PricePeriod
                                                    .BillingPeriod
                                                    .MONTHLY
                                            )
                                            .billingCountryCode("billingCountryCode")
                                            .blockSize(0.0)
                                            .creditGrantCadence(
                                                SetPackagePricing.PricingModel.PricePeriod
                                                    .CreditGrantCadence
                                                    .BEGINNING_OF_BILLING_PERIOD
                                            )
                                            .creditRate(
                                                SetPackagePricing.PricingModel.PricePeriod
                                                    .CreditRate
                                                    .builder()
                                                    .amount(1.0)
                                                    .currencyId("currencyId")
                                                    .costFormula("costFormula")
                                                    .build()
                                            )
                                            .price(
                                                SetPackagePricing.PricingModel.PricePeriod.Price
                                                    .builder()
                                                    .amount(0.0)
                                                    .currency(
                                                        SetPackagePricing.PricingModel.PricePeriod
                                                            .Price
                                                            .Currency
                                                            .USD
                                                    )
                                                    .build()
                                            )
                                            .addTier(
                                                SetPackagePricing.PricingModel.PricePeriod.Tier
                                                    .builder()
                                                    .flatPrice(
                                                        SetPackagePricing.PricingModel.PricePeriod
                                                            .Tier
                                                            .FlatPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                SetPackagePricing.PricingModel
                                                                    .PricePeriod
                                                                    .Tier
                                                                    .FlatPrice
                                                                    .Currency
                                                                    .USD
                                                            )
                                                            .build()
                                                    )
                                                    .unitPrice(
                                                        SetPackagePricing.PricingModel.PricePeriod
                                                            .Tier
                                                            .UnitPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                SetPackagePricing.PricingModel
                                                                    .PricePeriod
                                                                    .Tier
                                                                    .UnitPrice
                                                                    .Currency
                                                                    .USD
                                                            )
                                                            .build()
                                                    )
                                                    .upTo(0.0)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .billingCadence(
                                        SetPackagePricing.PricingModel.BillingCadence.RECURRING
                                    )
                                    .featureId("featureId")
                                    .maxUnitQuantity(1L)
                                    .minUnitQuantity(1L)
                                    .monthlyResetPeriodConfiguration(
                                        SetPackagePricing.PricingModel
                                            .MonthlyResetPeriodConfiguration
                                            .builder()
                                            .accordingTo(
                                                SetPackagePricing.PricingModel
                                                    .MonthlyResetPeriodConfiguration
                                                    .AccordingTo
                                                    .SUBSCRIPTION_START
                                            )
                                            .build()
                                    )
                                    .resetPeriod(SetPackagePricing.PricingModel.ResetPeriod.YEAR)
                                    .tiersMode(SetPackagePricing.PricingModel.TiersMode.VOLUME)
                                    .topUpCustomCurrencyId("topUpCustomCurrencyId")
                                    .weeklyResetPeriodConfiguration(
                                        SetPackagePricing.PricingModel
                                            .WeeklyResetPeriodConfiguration
                                            .builder()
                                            .accordingTo(
                                                SetPackagePricing.PricingModel
                                                    .WeeklyResetPeriodConfiguration
                                                    .AccordingTo
                                                    .SUBSCRIPTION_START
                                            )
                                            .build()
                                    )
                                    .yearlyResetPeriodConfiguration(
                                        SetPackagePricing.PricingModel
                                            .YearlyResetPeriodConfiguration
                                            .builder()
                                            .accordingTo(
                                                SetPackagePricing.PricingModel
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

        val setPackagePricingResponse = setPackagePricingResponseFuture.get()
        setPackagePricingResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateAddon() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val addonFuture =
            addonServiceAsync.updateAddon(
                AddonUpdateAddonParams.builder()
                    .id("x")
                    .billingId("billingId")
                    .addDependency("string")
                    .description("description")
                    .displayName("displayName")
                    .maxQuantity(0L)
                    .metadata(
                        AddonUpdateAddonParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val addon = addonFuture.get()
        addon.validate()
    }
}
