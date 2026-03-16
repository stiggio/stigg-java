// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.plans.PlanCreateParams
import io.stigg.models.v1.plans.PlanPublishParams
import io.stigg.models.v1.plans.PlanUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlanServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().plans()

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
        val planServiceAsync = client.v1().plans()

        val planFuture = planServiceAsync.retrieve("x")

        val plan = planFuture.get()
        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().plans()

        val planFuture =
            planServiceAsync.update(
                PlanUpdateParams.builder()
                    .id("x")
                    .billingId("billingId")
                    .charges(
                        PlanUpdateParams.Charges.builder()
                            .pricingType(PlanUpdateParams.Charges.PricingType.FREE)
                            .billingId("billingId")
                            .addMinimumSpend(
                                PlanUpdateParams.Charges.MinimumSpend.builder()
                                    .billingPeriod(
                                        PlanUpdateParams.Charges.MinimumSpend.BillingPeriod.MONTHLY
                                    )
                                    .minimum(
                                        PlanUpdateParams.Charges.MinimumSpend.Minimum.builder()
                                            .amount(0.0)
                                            .currency(
                                                PlanUpdateParams.Charges.MinimumSpend.Minimum
                                                    .Currency
                                                    .USD
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .overageBillingPeriod(
                                PlanUpdateParams.Charges.OverageBillingPeriod
                                    .ON_SUBSCRIPTION_RENEWAL
                            )
                            .addOveragePricingModel(
                                PlanUpdateParams.Charges.OveragePricingModel.builder()
                                    .billingModel(
                                        PlanUpdateParams.Charges.OveragePricingModel.BillingModel
                                            .FLAT_FEE
                                    )
                                    .addPricePeriod(
                                        PlanUpdateParams.Charges.OveragePricingModel.PricePeriod
                                            .builder()
                                            .billingPeriod(
                                                PlanUpdateParams.Charges.OveragePricingModel
                                                    .PricePeriod
                                                    .BillingPeriod
                                                    .MONTHLY
                                            )
                                            .billingCountryCode("billingCountryCode")
                                            .blockSize(0.0)
                                            .creditGrantCadence(
                                                PlanUpdateParams.Charges.OveragePricingModel
                                                    .PricePeriod
                                                    .CreditGrantCadence
                                                    .BEGINNING_OF_BILLING_PERIOD
                                            )
                                            .creditRate(
                                                PlanUpdateParams.Charges.OveragePricingModel
                                                    .PricePeriod
                                                    .CreditRate
                                                    .builder()
                                                    .amount(1.0)
                                                    .currencyId("currencyId")
                                                    .costFormula("costFormula")
                                                    .build()
                                            )
                                            .price(
                                                PlanUpdateParams.Charges.OveragePricingModel
                                                    .PricePeriod
                                                    .Price
                                                    .builder()
                                                    .amount(0.0)
                                                    .currency(
                                                        PlanUpdateParams.Charges.OveragePricingModel
                                                            .PricePeriod
                                                            .Price
                                                            .Currency
                                                            .USD
                                                    )
                                                    .build()
                                            )
                                            .addTier(
                                                PlanUpdateParams.Charges.OveragePricingModel
                                                    .PricePeriod
                                                    .Tier
                                                    .builder()
                                                    .flatPrice(
                                                        PlanUpdateParams.Charges.OveragePricingModel
                                                            .PricePeriod
                                                            .Tier
                                                            .FlatPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                PlanUpdateParams.Charges
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
                                                        PlanUpdateParams.Charges.OveragePricingModel
                                                            .PricePeriod
                                                            .Tier
                                                            .UnitPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                PlanUpdateParams.Charges
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
                                        PlanUpdateParams.Charges.OveragePricingModel.BillingCadence
                                            .RECURRING
                                    )
                                    .entitlement(
                                        PlanUpdateParams.Charges.OveragePricingModel.Entitlement
                                            .builder()
                                            .featureId("featureId")
                                            .hasSoftLimit(true)
                                            .hasUnlimitedUsage(true)
                                            .monthlyResetPeriodConfiguration(
                                                PlanUpdateParams.Charges.OveragePricingModel
                                                    .Entitlement
                                                    .MonthlyResetPeriodConfiguration
                                                    .builder()
                                                    .accordingTo(
                                                        PlanUpdateParams.Charges.OveragePricingModel
                                                            .Entitlement
                                                            .MonthlyResetPeriodConfiguration
                                                            .AccordingTo
                                                            .SUBSCRIPTION_START
                                                    )
                                                    .build()
                                            )
                                            .resetPeriod(
                                                PlanUpdateParams.Charges.OveragePricingModel
                                                    .Entitlement
                                                    .ResetPeriod
                                                    .YEAR
                                            )
                                            .usageLimit(0.0)
                                            .weeklyResetPeriodConfiguration(
                                                PlanUpdateParams.Charges.OveragePricingModel
                                                    .Entitlement
                                                    .WeeklyResetPeriodConfiguration
                                                    .builder()
                                                    .accordingTo(
                                                        PlanUpdateParams.Charges.OveragePricingModel
                                                            .Entitlement
                                                            .WeeklyResetPeriodConfiguration
                                                            .AccordingTo
                                                            .SUBSCRIPTION_START
                                                    )
                                                    .build()
                                            )
                                            .yearlyResetPeriodConfiguration(
                                                PlanUpdateParams.Charges.OveragePricingModel
                                                    .Entitlement
                                                    .YearlyResetPeriodConfiguration
                                                    .builder()
                                                    .accordingTo(
                                                        PlanUpdateParams.Charges.OveragePricingModel
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
                                PlanUpdateParams.Charges.PricingModel.builder()
                                    .billingModel(
                                        PlanUpdateParams.Charges.PricingModel.BillingModel.FLAT_FEE
                                    )
                                    .addPricePeriod(
                                        PlanUpdateParams.Charges.PricingModel.PricePeriod.builder()
                                            .billingPeriod(
                                                PlanUpdateParams.Charges.PricingModel.PricePeriod
                                                    .BillingPeriod
                                                    .MONTHLY
                                            )
                                            .billingCountryCode("billingCountryCode")
                                            .blockSize(0.0)
                                            .creditGrantCadence(
                                                PlanUpdateParams.Charges.PricingModel.PricePeriod
                                                    .CreditGrantCadence
                                                    .BEGINNING_OF_BILLING_PERIOD
                                            )
                                            .creditRate(
                                                PlanUpdateParams.Charges.PricingModel.PricePeriod
                                                    .CreditRate
                                                    .builder()
                                                    .amount(1.0)
                                                    .currencyId("currencyId")
                                                    .costFormula("costFormula")
                                                    .build()
                                            )
                                            .price(
                                                PlanUpdateParams.Charges.PricingModel.PricePeriod
                                                    .Price
                                                    .builder()
                                                    .amount(0.0)
                                                    .currency(
                                                        PlanUpdateParams.Charges.PricingModel
                                                            .PricePeriod
                                                            .Price
                                                            .Currency
                                                            .USD
                                                    )
                                                    .build()
                                            )
                                            .addTier(
                                                PlanUpdateParams.Charges.PricingModel.PricePeriod
                                                    .Tier
                                                    .builder()
                                                    .flatPrice(
                                                        PlanUpdateParams.Charges.PricingModel
                                                            .PricePeriod
                                                            .Tier
                                                            .FlatPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                PlanUpdateParams.Charges
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
                                                        PlanUpdateParams.Charges.PricingModel
                                                            .PricePeriod
                                                            .Tier
                                                            .UnitPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                PlanUpdateParams.Charges
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
                                        PlanUpdateParams.Charges.PricingModel.BillingCadence
                                            .RECURRING
                                    )
                                    .featureId("featureId")
                                    .maxUnitQuantity(1L)
                                    .minUnitQuantity(1L)
                                    .monthlyResetPeriodConfiguration(
                                        PlanUpdateParams.Charges.PricingModel
                                            .MonthlyResetPeriodConfiguration
                                            .builder()
                                            .accordingTo(
                                                PlanUpdateParams.Charges.PricingModel
                                                    .MonthlyResetPeriodConfiguration
                                                    .AccordingTo
                                                    .SUBSCRIPTION_START
                                            )
                                            .build()
                                    )
                                    .resetPeriod(
                                        PlanUpdateParams.Charges.PricingModel.ResetPeriod.YEAR
                                    )
                                    .tiersMode(
                                        PlanUpdateParams.Charges.PricingModel.TiersMode.VOLUME
                                    )
                                    .topUpCustomCurrencyId("topUpCustomCurrencyId")
                                    .weeklyResetPeriodConfiguration(
                                        PlanUpdateParams.Charges.PricingModel
                                            .WeeklyResetPeriodConfiguration
                                            .builder()
                                            .accordingTo(
                                                PlanUpdateParams.Charges.PricingModel
                                                    .WeeklyResetPeriodConfiguration
                                                    .AccordingTo
                                                    .SUBSCRIPTION_START
                                            )
                                            .build()
                                    )
                                    .yearlyResetPeriodConfiguration(
                                        PlanUpdateParams.Charges.PricingModel
                                            .YearlyResetPeriodConfiguration
                                            .builder()
                                            .accordingTo(
                                                PlanUpdateParams.Charges.PricingModel
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
        val planServiceAsync = client.v1().plans()

        val pageFuture = planServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().plans()

        val planFuture = planServiceAsync.archive("x")

        val plan = planFuture.get()
        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createDraft() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().plans()

        val planFuture = planServiceAsync.createDraft("x")

        val plan = planFuture.get()
        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().plans()

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
    fun removeDraft() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().plans()

        val responseFuture = planServiceAsync.removeDraft("x")

        val response = responseFuture.get()
        response.validate()
    }
}
