// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.subscriptions.SubscriptionCancelParams
import io.stigg.models.v1.subscriptions.SubscriptionDelegateParams
import io.stigg.models.v1.subscriptions.SubscriptionImportParams
import io.stigg.models.v1.subscriptions.SubscriptionMigrateParams
import io.stigg.models.v1.subscriptions.SubscriptionPreviewParams
import io.stigg.models.v1.subscriptions.SubscriptionProvisionParams
import io.stigg.models.v1.subscriptions.SubscriptionTransferParams
import io.stigg.models.v1.subscriptions.SubscriptionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SubscriptionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val subscriptionService = client.v1().subscriptions()

        val subscription = subscriptionService.retrieve("x")

        subscription.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val subscriptionService = client.v1().subscriptions()

        val subscription =
            subscriptionService.update(
                SubscriptionUpdateParams.builder()
                    .id("x")
                    .addAddon(
                        SubscriptionUpdateParams.Addon.builder().id("id").quantity(0L).build()
                    )
                    .appliedCoupon(
                        SubscriptionUpdateParams.AppliedCoupon.builder()
                            .billingCouponId("billingCouponId")
                            .configuration(
                                SubscriptionUpdateParams.AppliedCoupon.Configuration.builder()
                                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .couponId("couponId")
                            .discount(
                                SubscriptionUpdateParams.AppliedCoupon.Discount.builder()
                                    .addAmountsOff(
                                        SubscriptionUpdateParams.AppliedCoupon.Discount.AmountsOff
                                            .builder()
                                            .amount(0.0)
                                            .currency(
                                                SubscriptionUpdateParams.AppliedCoupon.Discount
                                                    .AmountsOff
                                                    .Currency
                                                    .USD
                                            )
                                            .build()
                                    )
                                    .description("description")
                                    .durationInMonths(1.0)
                                    .name("name")
                                    .percentOff(1.0)
                                    .build()
                            )
                            .promotionCode("promotionCode")
                            .build()
                    )
                    .awaitPaymentConfirmation(true)
                    .billingCycleAnchor(SubscriptionUpdateParams.BillingCycleAnchor.UNCHANGED)
                    .billingInformation(
                        SubscriptionUpdateParams.BillingInformation.builder()
                            .billingAddress(
                                SubscriptionUpdateParams.BillingInformation.BillingAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .chargeOnBehalfOfAccount("chargeOnBehalfOfAccount")
                            .couponId("couponId")
                            .integrationId("integrationId")
                            .invoiceDaysUntilDue(0.0)
                            .isBackdated(true)
                            .isInvoicePaid(true)
                            .metadata(
                                SubscriptionUpdateParams.BillingInformation.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .prorationBehavior(
                                SubscriptionUpdateParams.BillingInformation.ProrationBehavior
                                    .INVOICE_IMMEDIATELY
                            )
                            .addTaxId(
                                SubscriptionUpdateParams.BillingInformation.TaxId.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .taxPercentage(0.0)
                            .addTaxRateId("string")
                            .build()
                    )
                    .billingPeriod(SubscriptionUpdateParams.BillingPeriod.MONTHLY)
                    .budget(
                        SubscriptionUpdateParams.Budget.builder()
                            .hasSoftLimit(true)
                            .limit(0.0)
                            .build()
                    )
                    .addCharge(
                        SubscriptionUpdateParams.Charge.builder()
                            .id("id")
                            .quantity(0.0)
                            .type(SubscriptionUpdateParams.Charge.Type.FEATURE)
                            .build()
                    )
                    .addEntitlement(
                        SubscriptionUpdateParams.Entitlement.Feature.builder()
                            .id("id")
                            .hasSoftLimit(true)
                            .hasUnlimitedUsage(true)
                            .monthlyResetPeriodConfiguration(
                                SubscriptionUpdateParams.Entitlement.Feature
                                    .MonthlyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        SubscriptionUpdateParams.Entitlement.Feature
                                            .MonthlyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .resetPeriod(
                                SubscriptionUpdateParams.Entitlement.Feature.ResetPeriod.YEAR
                            )
                            .usageLimit(0L)
                            .weeklyResetPeriodConfiguration(
                                SubscriptionUpdateParams.Entitlement.Feature
                                    .WeeklyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        SubscriptionUpdateParams.Entitlement.Feature
                                            .WeeklyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .yearlyResetPeriodConfiguration(
                                SubscriptionUpdateParams.Entitlement.Feature
                                    .YearlyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        SubscriptionUpdateParams.Entitlement.Feature
                                            .YearlyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        SubscriptionUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .minimumSpend(
                        SubscriptionUpdateParams.MinimumSpend.builder()
                            .amount(0.0)
                            .currency(SubscriptionUpdateParams.MinimumSpend.Currency.USD)
                            .build()
                    )
                    .addPriceOverride(
                        SubscriptionUpdateParams.PriceOverride.builder()
                            .addonId("addonId")
                            .amount(0.0)
                            .baseCharge(true)
                            .currency(SubscriptionUpdateParams.PriceOverride.Currency.USD)
                            .currencyId("currencyId")
                            .featureId("featureId")
                            .build()
                    )
                    .promotionCode("promotionCode")
                    .scheduleStrategy(
                        SubscriptionUpdateParams.ScheduleStrategy.END_OF_BILLING_PERIOD
                    )
                    .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        subscription.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val subscriptionService = client.v1().subscriptions()

        val page = subscriptionService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val subscriptionService = client.v1().subscriptions()

        val subscription =
            subscriptionService.cancel(
                SubscriptionCancelParams.builder()
                    .id("x")
                    .cancellationAction(SubscriptionCancelParams.CancellationAction.DEFAULT)
                    .cancellationTime(
                        SubscriptionCancelParams.CancellationTime.END_OF_BILLING_PERIOD
                    )
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .prorate(true)
                    .build()
            )

        subscription.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delegate() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val subscriptionService = client.v1().subscriptions()

        val subscription =
            subscriptionService.delegate(
                SubscriptionDelegateParams.builder()
                    .id("x")
                    .targetCustomerId("targetCustomerId")
                    .build()
            )

        subscription.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun import_() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val subscriptionService = client.v1().subscriptions()

        val response =
            subscriptionService.import_(
                SubscriptionImportParams.builder()
                    .addSubscription(
                        SubscriptionImportParams.Subscription.builder()
                            .id("id")
                            .customerId("customerId")
                            .planId("planId")
                            .addAddon(
                                SubscriptionImportParams.Subscription.Addon.builder()
                                    .id("id")
                                    .quantity(0L)
                                    .build()
                            )
                            .billingId("billingId")
                            .billingPeriod(
                                SubscriptionImportParams.Subscription.BillingPeriod.MONTHLY
                            )
                            .addCharge(
                                SubscriptionImportParams.Subscription.Charge.builder()
                                    .id("id")
                                    .quantity(0.0)
                                    .type(SubscriptionImportParams.Subscription.Charge.Type.FEATURE)
                                    .build()
                            )
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .metadata(
                                SubscriptionImportParams.Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .resourceId("resourceId")
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .integrationId("integrationId")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun migrate() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val subscriptionService = client.v1().subscriptions()

        val subscription =
            subscriptionService.migrate(
                SubscriptionMigrateParams.builder()
                    .id("x")
                    .subscriptionMigrationTime(
                        SubscriptionMigrateParams.SubscriptionMigrationTime.END_OF_BILLING_PERIOD
                    )
                    .build()
            )

        subscription.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun preview() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val subscriptionService = client.v1().subscriptions()

        val response =
            subscriptionService.preview(
                SubscriptionPreviewParams.builder()
                    .customerId("customerId")
                    .planId("planId")
                    .addAddon(
                        SubscriptionPreviewParams.Addon.builder().id("id").quantity(0L).build()
                    )
                    .appliedCoupon(
                        SubscriptionPreviewParams.AppliedCoupon.builder()
                            .billingCouponId("billingCouponId")
                            .configuration(
                                SubscriptionPreviewParams.AppliedCoupon.Configuration.builder()
                                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .couponId("couponId")
                            .discount(
                                SubscriptionPreviewParams.AppliedCoupon.Discount.builder()
                                    .addAmountsOff(
                                        SubscriptionPreviewParams.AppliedCoupon.Discount.AmountsOff
                                            .builder()
                                            .amount(0.0)
                                            .currency(
                                                SubscriptionPreviewParams.AppliedCoupon.Discount
                                                    .AmountsOff
                                                    .Currency
                                                    .USD
                                            )
                                            .build()
                                    )
                                    .description("description")
                                    .durationInMonths(1.0)
                                    .name("name")
                                    .percentOff(1.0)
                                    .build()
                            )
                            .promotionCode("promotionCode")
                            .build()
                    )
                    .addBillableFeature(
                        SubscriptionPreviewParams.BillableFeature.builder()
                            .featureId("featureId")
                            .quantity(0.0)
                            .build()
                    )
                    .billingCountryCode("billingCountryCode")
                    .billingCycleAnchor(SubscriptionPreviewParams.BillingCycleAnchor.UNCHANGED)
                    .billingInformation(
                        SubscriptionPreviewParams.BillingInformation.builder()
                            .billingAddress(
                                SubscriptionPreviewParams.BillingInformation.BillingAddress
                                    .builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .chargeOnBehalfOfAccount("chargeOnBehalfOfAccount")
                            .integrationId("integrationId")
                            .invoiceDaysUntilDue(0.0)
                            .isBackdated(true)
                            .isInvoicePaid(true)
                            .metadata(
                                SubscriptionPreviewParams.BillingInformation.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .prorationBehavior(
                                SubscriptionPreviewParams.BillingInformation.ProrationBehavior
                                    .INVOICE_IMMEDIATELY
                            )
                            .addTaxId(
                                SubscriptionPreviewParams.BillingInformation.TaxId.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .taxPercentage(0.0)
                            .addTaxRateId("string")
                            .build()
                    )
                    .billingPeriod(SubscriptionPreviewParams.BillingPeriod.MONTHLY)
                    .addCharge(
                        SubscriptionPreviewParams.Charge.builder()
                            .id("id")
                            .quantity(0.0)
                            .type(SubscriptionPreviewParams.Charge.Type.FEATURE)
                            .build()
                    )
                    .payingCustomerId("payingCustomerId")
                    .resourceId("resourceId")
                    .scheduleStrategy(
                        SubscriptionPreviewParams.ScheduleStrategy.END_OF_BILLING_PERIOD
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .trialOverrideConfiguration(
                        SubscriptionPreviewParams.TrialOverrideConfiguration.builder()
                            .isTrial(true)
                            .trialEndBehavior(
                                SubscriptionPreviewParams.TrialOverrideConfiguration
                                    .TrialEndBehavior
                                    .CONVERT_TO_PAID
                            )
                            .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .unitQuantity(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun provision() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val subscriptionService = client.v1().subscriptions()

        val response =
            subscriptionService.provision(
                SubscriptionProvisionParams.builder()
                    .customerId("customerId")
                    .planId("planId")
                    .id("id")
                    .addAddon(
                        SubscriptionProvisionParams.Addon.builder().id("id").quantity(0L).build()
                    )
                    .appliedCoupon(
                        SubscriptionProvisionParams.AppliedCoupon.builder()
                            .billingCouponId("billingCouponId")
                            .configuration(
                                SubscriptionProvisionParams.AppliedCoupon.Configuration.builder()
                                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .couponId("couponId")
                            .discount(
                                SubscriptionProvisionParams.AppliedCoupon.Discount.builder()
                                    .addAmountsOff(
                                        SubscriptionProvisionParams.AppliedCoupon.Discount
                                            .AmountsOff
                                            .builder()
                                            .amount(0.0)
                                            .currency(
                                                SubscriptionProvisionParams.AppliedCoupon.Discount
                                                    .AmountsOff
                                                    .Currency
                                                    .USD
                                            )
                                            .build()
                                    )
                                    .description("description")
                                    .durationInMonths(1.0)
                                    .name("name")
                                    .percentOff(1.0)
                                    .build()
                            )
                            .promotionCode("promotionCode")
                            .build()
                    )
                    .awaitPaymentConfirmation(true)
                    .billingCountryCode("billingCountryCode")
                    .billingCycleAnchor(SubscriptionProvisionParams.BillingCycleAnchor.UNCHANGED)
                    .billingId("billingId")
                    .billingInformation(
                        SubscriptionProvisionParams.BillingInformation.builder()
                            .billingAddress(
                                SubscriptionProvisionParams.BillingInformation.BillingAddress
                                    .builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .chargeOnBehalfOfAccount("chargeOnBehalfOfAccount")
                            .integrationId("integrationId")
                            .invoiceDaysUntilDue(0.0)
                            .isBackdated(true)
                            .isInvoicePaid(true)
                            .metadata(
                                SubscriptionProvisionParams.BillingInformation.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .prorationBehavior(
                                SubscriptionProvisionParams.BillingInformation.ProrationBehavior
                                    .INVOICE_IMMEDIATELY
                            )
                            .addTaxId(
                                SubscriptionProvisionParams.BillingInformation.TaxId.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .taxPercentage(0.0)
                            .addTaxRateId("string")
                            .build()
                    )
                    .billingPeriod(SubscriptionProvisionParams.BillingPeriod.MONTHLY)
                    .budget(
                        SubscriptionProvisionParams.Budget.builder()
                            .hasSoftLimit(true)
                            .limit(0.0)
                            .build()
                    )
                    .addCharge(
                        SubscriptionProvisionParams.Charge.builder()
                            .id("id")
                            .quantity(0.0)
                            .type(SubscriptionProvisionParams.Charge.Type.FEATURE)
                            .build()
                    )
                    .checkoutOptions(
                        SubscriptionProvisionParams.CheckoutOptions.builder()
                            .cancelUrl("https://example.com")
                            .successUrl("https://example.com")
                            .allowPromoCodes(true)
                            .allowTaxIdCollection(true)
                            .collectBillingAddress(true)
                            .collectPhoneNumber(true)
                            .referenceId("referenceId")
                            .build()
                    )
                    .addEntitlement(
                        SubscriptionProvisionParams.Entitlement.Feature.builder()
                            .id("id")
                            .hasSoftLimit(true)
                            .hasUnlimitedUsage(true)
                            .monthlyResetPeriodConfiguration(
                                SubscriptionProvisionParams.Entitlement.Feature
                                    .MonthlyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        SubscriptionProvisionParams.Entitlement.Feature
                                            .MonthlyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .resetPeriod(
                                SubscriptionProvisionParams.Entitlement.Feature.ResetPeriod.YEAR
                            )
                            .usageLimit(0L)
                            .weeklyResetPeriodConfiguration(
                                SubscriptionProvisionParams.Entitlement.Feature
                                    .WeeklyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        SubscriptionProvisionParams.Entitlement.Feature
                                            .WeeklyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .yearlyResetPeriodConfiguration(
                                SubscriptionProvisionParams.Entitlement.Feature
                                    .YearlyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        SubscriptionProvisionParams.Entitlement.Feature
                                            .YearlyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        SubscriptionProvisionParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .minimumSpend(
                        SubscriptionProvisionParams.MinimumSpend.builder()
                            .amount(0.0)
                            .currency(SubscriptionProvisionParams.MinimumSpend.Currency.USD)
                            .build()
                    )
                    .payingCustomerId("payingCustomerId")
                    .paymentCollectionMethod(
                        SubscriptionProvisionParams.PaymentCollectionMethod.CHARGE
                    )
                    .addPriceOverride(
                        SubscriptionProvisionParams.PriceOverride.builder()
                            .addonId("addonId")
                            .amount(0.0)
                            .baseCharge(true)
                            .billingCountryCode("billingCountryCode")
                            .blockSize(0.0)
                            .creditGrantCadence(
                                SubscriptionProvisionParams.PriceOverride.CreditGrantCadence
                                    .BEGINNING_OF_BILLING_PERIOD
                            )
                            .creditRate(
                                SubscriptionProvisionParams.PriceOverride.CreditRate.builder()
                                    .amount(1.0)
                                    .currencyId("currencyId")
                                    .costFormula("costFormula")
                                    .build()
                            )
                            .currency(SubscriptionProvisionParams.PriceOverride.Currency.USD)
                            .featureId("featureId")
                            .addTier(
                                SubscriptionProvisionParams.PriceOverride.Tier.builder()
                                    .flatPrice(
                                        SubscriptionProvisionParams.PriceOverride.Tier.FlatPrice
                                            .builder()
                                            .amount(0.0)
                                            .currency(
                                                SubscriptionProvisionParams.PriceOverride.Tier
                                                    .FlatPrice
                                                    .Currency
                                                    .USD
                                            )
                                            .build()
                                    )
                                    .unitPrice(
                                        SubscriptionProvisionParams.PriceOverride.Tier.UnitPrice
                                            .builder()
                                            .amount(0.0)
                                            .currency(
                                                SubscriptionProvisionParams.PriceOverride.Tier
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
                    .resourceId("resourceId")
                    .salesforceId("salesforceId")
                    .scheduleStrategy(
                        SubscriptionProvisionParams.ScheduleStrategy.END_OF_BILLING_PERIOD
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .trialOverrideConfiguration(
                        SubscriptionProvisionParams.TrialOverrideConfiguration.builder()
                            .isTrial(true)
                            .trialEndBehavior(
                                SubscriptionProvisionParams.TrialOverrideConfiguration
                                    .TrialEndBehavior
                                    .CONVERT_TO_PAID
                            )
                            .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .unitQuantity(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun transfer() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val subscriptionService = client.v1().subscriptions()

        val subscription =
            subscriptionService.transfer(
                SubscriptionTransferParams.builder()
                    .id("x")
                    .destinationResourceId("destinationResourceId")
                    .build()
            )

        subscription.validate()
    }
}
