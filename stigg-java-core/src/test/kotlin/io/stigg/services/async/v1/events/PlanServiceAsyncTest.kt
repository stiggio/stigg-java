// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.events.addons.SetPackagePricing
import io.stigg.models.v1.events.plans.PlanCreateParams
import io.stigg.models.v1.events.plans.PlanPublishParams
import io.stigg.models.v1.events.plans.PlanSetPricingParams
import io.stigg.models.v1.events.plans.PlanUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlanServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().events().plans()

        val planFuture =
            planServiceAsync.create(
                PlanCreateParams.builder()
                    .id("id")
                    .displayName("displayName")
                    .productId("productId")
                    .billingId("billingId")
                    .defaultTrialConfig(
                        PlanCreateParams.DefaultTrialConfig.builder()
                            .duration(0.0)
                            .units(PlanCreateParams.DefaultTrialConfig.Units.DAY)
                            .budget(
                                PlanCreateParams.DefaultTrialConfig.Budget.builder()
                                    .hasSoftLimit(true)
                                    .limit(0.0)
                                    .build()
                            )
                            .trialEndBehavior(
                                PlanCreateParams.DefaultTrialConfig.TrialEndBehavior.CONVERT_TO_PAID
                            )
                            .build()
                    )
                    .description("description")
                    .metadata(
                        PlanCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .parentPlanId("parentPlanId")
                    .pricingType(PlanCreateParams.PricingType.FREE)
                    .status(PlanCreateParams.Status.DRAFT)
                    .build()
            )

        val plan = planFuture.get()
        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().events().plans()

        val planFuture = planServiceAsync.retrieve("x")

        val plan = planFuture.get()
        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().events().plans()

        val planFuture =
            planServiceAsync.update(
                PlanUpdateParams.builder()
                    .id("x")
                    .billingId("billingId")
                    .addCompatibleAddonId("string")
                    .defaultTrialConfig(
                        PlanUpdateParams.DefaultTrialConfig.builder()
                            .duration(0.0)
                            .units(PlanUpdateParams.DefaultTrialConfig.Units.DAY)
                            .budget(
                                PlanUpdateParams.DefaultTrialConfig.Budget.builder()
                                    .hasSoftLimit(true)
                                    .limit(0.0)
                                    .build()
                            )
                            .trialEndBehavior(
                                PlanUpdateParams.DefaultTrialConfig.TrialEndBehavior.CONVERT_TO_PAID
                            )
                            .build()
                    )
                    .description("description")
                    .displayName("displayName")
                    .metadata(
                        PlanUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .parentPlanId("parentPlanId")
                    .build()
            )

        val plan = planFuture.get()
        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().events().plans()

        val pageFuture = planServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().events().plans()

        val planFuture = planServiceAsync.archive("x")

        val plan = planFuture.get()
        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().events().plans()

        val responseFuture =
            planServiceAsync.publish(
                PlanPublishParams.builder()
                    .id("x")
                    .migrationType(PlanPublishParams.MigrationType.NEW_CUSTOMERS)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setPricing() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().events().plans()

        val setPackagePricingResponseFuture =
            planServiceAsync.setPricing(
                PlanSetPricingParams.builder()
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
}
