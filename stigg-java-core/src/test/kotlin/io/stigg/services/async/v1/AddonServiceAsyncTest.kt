// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.addons.AddonArchiveParams
import io.stigg.models.v1.addons.AddonCreateDraftParams
import io.stigg.models.v1.addons.AddonCreateParams
import io.stigg.models.v1.addons.AddonPublishParams
import io.stigg.models.v1.addons.AddonRemoveDraftParams
import io.stigg.models.v1.addons.AddonRetrieveParams
import io.stigg.models.v1.addons.AddonUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AddonServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().addons()

        val addonFuture =
            addonServiceAsync.create(
                AddonCreateParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .id("id")
                    .displayName("displayName")
                    .productId("productId")
                    .billingId("billingId")
                    .description("description")
                    .maxQuantity(1L)
                    .metadata(
                        AddonCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pricingType(AddonCreateParams.PricingType.FREE)
                    .status(AddonCreateParams.Status.DRAFT)
                    .build()
            )

        val addon = addonFuture.get()
        addon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().addons()

        val addonFuture =
            addonServiceAsync.retrieve(
                AddonRetrieveParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val addon = addonFuture.get()
        addon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().addons()

        val addonFuture =
            addonServiceAsync.update(
                AddonUpdateParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .billingId("billingId")
                    .charges(
                        AddonUpdateParams.Charges.builder()
                            .pricingType(AddonUpdateParams.Charges.PricingType.FREE)
                            .billingId("billingId")
                            .addMinimumSpend(
                                AddonUpdateParams.Charges.MinimumSpend.builder()
                                    .billingPeriod(
                                        AddonUpdateParams.Charges.MinimumSpend.BillingPeriod.MONTHLY
                                    )
                                    .minimum(
                                        AddonUpdateParams.Charges.MinimumSpend.Minimum.builder()
                                            .amount(0.0)
                                            .currency(
                                                AddonUpdateParams.Charges.MinimumSpend.Minimum
                                                    .Currency
                                                    .USD
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .overageBillingPeriod(
                                AddonUpdateParams.Charges.OverageBillingPeriod
                                    .ON_SUBSCRIPTION_RENEWAL
                            )
                            .addOveragePricingModel(
                                AddonUpdateParams.Charges.OveragePricingModel.builder()
                                    .billingModel(
                                        AddonUpdateParams.Charges.OveragePricingModel.BillingModel
                                            .FLAT_FEE
                                    )
                                    .addPricePeriod(
                                        AddonUpdateParams.Charges.OveragePricingModel.PricePeriod
                                            .builder()
                                            .billingPeriod(
                                                AddonUpdateParams.Charges.OveragePricingModel
                                                    .PricePeriod
                                                    .BillingPeriod
                                                    .MONTHLY
                                            )
                                            .billingCountryCode("billingCountryCode")
                                            .blockSize(0.0)
                                            .creditGrantCadence(
                                                AddonUpdateParams.Charges.OveragePricingModel
                                                    .PricePeriod
                                                    .CreditGrantCadence
                                                    .BEGINNING_OF_BILLING_PERIOD
                                            )
                                            .creditRate(
                                                AddonUpdateParams.Charges.OveragePricingModel
                                                    .PricePeriod
                                                    .CreditRate
                                                    .builder()
                                                    .amount(1.0)
                                                    .currencyId("currencyId")
                                                    .costFormula("costFormula")
                                                    .build()
                                            )
                                            .price(
                                                AddonUpdateParams.Charges.OveragePricingModel
                                                    .PricePeriod
                                                    .Price
                                                    .builder()
                                                    .amount(0.0)
                                                    .currency(
                                                        AddonUpdateParams.Charges
                                                            .OveragePricingModel
                                                            .PricePeriod
                                                            .Price
                                                            .Currency
                                                            .USD
                                                    )
                                                    .build()
                                            )
                                            .addTier(
                                                AddonUpdateParams.Charges.OveragePricingModel
                                                    .PricePeriod
                                                    .Tier
                                                    .builder()
                                                    .flatPrice(
                                                        AddonUpdateParams.Charges
                                                            .OveragePricingModel
                                                            .PricePeriod
                                                            .Tier
                                                            .FlatPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                AddonUpdateParams.Charges
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
                                                        AddonUpdateParams.Charges
                                                            .OveragePricingModel
                                                            .PricePeriod
                                                            .Tier
                                                            .UnitPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                AddonUpdateParams.Charges
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
                                        AddonUpdateParams.Charges.OveragePricingModel.BillingCadence
                                            .RECURRING
                                    )
                                    .currencyId("currencyId")
                                    .entitlement(
                                        AddonUpdateParams.Charges.OveragePricingModel.Entitlement
                                            .builder()
                                            .featureId("featureId")
                                            .hasSoftLimit(true)
                                            .hasUnlimitedUsage(true)
                                            .monthlyResetPeriodConfiguration(
                                                AddonUpdateParams.Charges.OveragePricingModel
                                                    .Entitlement
                                                    .MonthlyResetPeriodConfiguration
                                                    .builder()
                                                    .accordingTo(
                                                        AddonUpdateParams.Charges
                                                            .OveragePricingModel
                                                            .Entitlement
                                                            .MonthlyResetPeriodConfiguration
                                                            .AccordingTo
                                                            .SUBSCRIPTION_START
                                                    )
                                                    .build()
                                            )
                                            .resetPeriod(
                                                AddonUpdateParams.Charges.OveragePricingModel
                                                    .Entitlement
                                                    .ResetPeriod
                                                    .YEAR
                                            )
                                            .usageLimit(0.0)
                                            .weeklyResetPeriodConfiguration(
                                                AddonUpdateParams.Charges.OveragePricingModel
                                                    .Entitlement
                                                    .WeeklyResetPeriodConfiguration
                                                    .builder()
                                                    .accordingTo(
                                                        AddonUpdateParams.Charges
                                                            .OveragePricingModel
                                                            .Entitlement
                                                            .WeeklyResetPeriodConfiguration
                                                            .AccordingTo
                                                            .SUBSCRIPTION_START
                                                    )
                                                    .build()
                                            )
                                            .yearlyResetPeriodConfiguration(
                                                AddonUpdateParams.Charges.OveragePricingModel
                                                    .Entitlement
                                                    .YearlyResetPeriodConfiguration
                                                    .builder()
                                                    .accordingTo(
                                                        AddonUpdateParams.Charges
                                                            .OveragePricingModel
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
                                    .build()
                            )
                            .addPricingModel(
                                AddonUpdateParams.Charges.PricingModel.builder()
                                    .billingModel(
                                        AddonUpdateParams.Charges.PricingModel.BillingModel.FLAT_FEE
                                    )
                                    .addPricePeriod(
                                        AddonUpdateParams.Charges.PricingModel.PricePeriod.builder()
                                            .billingPeriod(
                                                AddonUpdateParams.Charges.PricingModel.PricePeriod
                                                    .BillingPeriod
                                                    .MONTHLY
                                            )
                                            .billingCountryCode("billingCountryCode")
                                            .blockSize(0.0)
                                            .creditGrantCadence(
                                                AddonUpdateParams.Charges.PricingModel.PricePeriod
                                                    .CreditGrantCadence
                                                    .BEGINNING_OF_BILLING_PERIOD
                                            )
                                            .creditRate(
                                                AddonUpdateParams.Charges.PricingModel.PricePeriod
                                                    .CreditRate
                                                    .builder()
                                                    .amount(1.0)
                                                    .currencyId("currencyId")
                                                    .costFormula("costFormula")
                                                    .build()
                                            )
                                            .price(
                                                AddonUpdateParams.Charges.PricingModel.PricePeriod
                                                    .Price
                                                    .builder()
                                                    .amount(0.0)
                                                    .currency(
                                                        AddonUpdateParams.Charges.PricingModel
                                                            .PricePeriod
                                                            .Price
                                                            .Currency
                                                            .USD
                                                    )
                                                    .build()
                                            )
                                            .addTier(
                                                AddonUpdateParams.Charges.PricingModel.PricePeriod
                                                    .Tier
                                                    .builder()
                                                    .flatPrice(
                                                        AddonUpdateParams.Charges.PricingModel
                                                            .PricePeriod
                                                            .Tier
                                                            .FlatPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                AddonUpdateParams.Charges
                                                                    .PricingModel
                                                                    .PricePeriod
                                                                    .Tier
                                                                    .FlatPrice
                                                                    .Currency
                                                                    .USD
                                                            )
                                                            .build()
                                                    )
                                                    .unitPrice(
                                                        AddonUpdateParams.Charges.PricingModel
                                                            .PricePeriod
                                                            .Tier
                                                            .UnitPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                AddonUpdateParams.Charges
                                                                    .PricingModel
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
                                        AddonUpdateParams.Charges.PricingModel.BillingCadence
                                            .RECURRING
                                    )
                                    .featureId("featureId")
                                    .maxUnitQuantity(1L)
                                    .minUnitQuantity(1L)
                                    .monthlyResetPeriodConfiguration(
                                        AddonUpdateParams.Charges.PricingModel
                                            .MonthlyResetPeriodConfiguration
                                            .builder()
                                            .accordingTo(
                                                AddonUpdateParams.Charges.PricingModel
                                                    .MonthlyResetPeriodConfiguration
                                                    .AccordingTo
                                                    .SUBSCRIPTION_START
                                            )
                                            .build()
                                    )
                                    .resetPeriod(
                                        AddonUpdateParams.Charges.PricingModel.ResetPeriod.YEAR
                                    )
                                    .tiersMode(
                                        AddonUpdateParams.Charges.PricingModel.TiersMode.VOLUME
                                    )
                                    .topUpCustomCurrencyId("topUpCustomCurrencyId")
                                    .weeklyResetPeriodConfiguration(
                                        AddonUpdateParams.Charges.PricingModel
                                            .WeeklyResetPeriodConfiguration
                                            .builder()
                                            .accordingTo(
                                                AddonUpdateParams.Charges.PricingModel
                                                    .WeeklyResetPeriodConfiguration
                                                    .AccordingTo
                                                    .SUBSCRIPTION_START
                                            )
                                            .build()
                                    )
                                    .yearlyResetPeriodConfiguration(
                                        AddonUpdateParams.Charges.PricingModel
                                            .YearlyResetPeriodConfiguration
                                            .builder()
                                            .accordingTo(
                                                AddonUpdateParams.Charges.PricingModel
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
                    .addDependency("string")
                    .description("description")
                    .displayName("displayName")
                    .maxQuantity(1L)
                    .metadata(
                        AddonUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .status(AddonUpdateParams.Status.DRAFT)
                    .build()
            )

        val addon = addonFuture.get()
        addon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().addons()

        val pageFuture = addonServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().addons()

        val addonFuture =
            addonServiceAsync.archive(
                AddonArchiveParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val addon = addonFuture.get()
        addon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createDraft() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().addons()

        val addonFuture =
            addonServiceAsync.createDraft(
                AddonCreateDraftParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val addon = addonFuture.get()
        addon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCharges() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().addons()

        val pageFuture = addonServiceAsync.listCharges("x")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().addons()

        val responseFuture =
            addonServiceAsync.publish(
                AddonPublishParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .migrationType(AddonPublishParams.MigrationType.NEW_CUSTOMERS)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun removeDraft() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().addons()

        val responseFuture =
            addonServiceAsync.removeDraft(
                AddonRemoveDraftParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
