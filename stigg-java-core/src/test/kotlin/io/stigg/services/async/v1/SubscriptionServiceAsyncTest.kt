// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.subscriptions.SubscriptionCreateParams
import io.stigg.models.v1.subscriptions.SubscriptionDelegateParams
import io.stigg.models.v1.subscriptions.SubscriptionMigrateParams
import io.stigg.models.v1.subscriptions.SubscriptionPreviewParams
import io.stigg.models.v1.subscriptions.SubscriptionTransferParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.v1().subscriptions()

        val subscriptionFuture =
            subscriptionServiceAsync.create(
                SubscriptionCreateParams.builder()
                    .customerId("customerId")
                    .planId("planId")
                    .id("id")
                    .addAddon(
                        SubscriptionCreateParams.Addon.builder()
                            .addonId("addonId")
                            .quantity(1L)
                            .build()
                    )
                    .appliedCoupon(
                        SubscriptionCreateParams.AppliedCoupon.builder()
                            .billingCouponId("billingCouponId")
                            .configuration(
                                SubscriptionCreateParams.AppliedCoupon.Configuration.builder()
                                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .couponId("couponId")
                            .discount(
                                SubscriptionCreateParams.AppliedCoupon.Discount.builder()
                                    .addAmountsOff(
                                        SubscriptionCreateParams.AppliedCoupon.Discount.AmountsOff
                                            .builder()
                                            .amount(0.0)
                                            .currency(
                                                SubscriptionCreateParams.AppliedCoupon.Discount
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
                    .billingId("billingId")
                    .billingInformation(
                        SubscriptionCreateParams.BillingInformation.builder()
                            .billingAddress(
                                SubscriptionCreateParams.BillingInformation.BillingAddress.builder()
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
                                SubscriptionCreateParams.BillingInformation.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .prorationBehavior(
                                SubscriptionCreateParams.BillingInformation.ProrationBehavior
                                    .INVOICE_IMMEDIATELY
                            )
                            .addTaxId(
                                SubscriptionCreateParams.BillingInformation.TaxId.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .taxPercentage(0.0)
                            .addTaxRateId("string")
                            .build()
                    )
                    .billingPeriod(SubscriptionCreateParams.BillingPeriod.MONTHLY)
                    .budget(
                        SubscriptionCreateParams.Budget.builder()
                            .hasSoftLimit(true)
                            .limit(0.0)
                            .build()
                    )
                    .addCharge(
                        SubscriptionCreateParams.Charge.builder()
                            .id("id")
                            .quantity(1.0)
                            .type(SubscriptionCreateParams.Charge.Type.FEATURE)
                            .build()
                    )
                    .checkoutOptions(
                        SubscriptionCreateParams.CheckoutOptions.builder()
                            .cancelUrl("https://example.com")
                            .successUrl("https://example.com")
                            .allowPromoCodes(true)
                            .allowTaxIdCollection(true)
                            .collectBillingAddress(true)
                            .collectPhoneNumber(true)
                            .referenceId("referenceId")
                            .build()
                    )
                    .metadata(
                        SubscriptionCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .minimumSpend(
                        SubscriptionCreateParams.MinimumSpend.builder()
                            .minimum(
                                SubscriptionCreateParams.MinimumSpend.Minimum.builder()
                                    .amount(0.0)
                                    .billingCountryCode("billingCountryCode")
                                    .currency(
                                        SubscriptionCreateParams.MinimumSpend.Minimum.Currency.USD
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .payingCustomerId("payingCustomerId")
                    .paymentCollectionMethod(
                        SubscriptionCreateParams.PaymentCollectionMethod.CHARGE
                    )
                    .addPriceOverride(
                        SubscriptionCreateParams.PriceOverride.builder()
                            .addonId("addonId")
                            .baseCharge(true)
                            .blockSize(0.0)
                            .creditGrantCadence(
                                SubscriptionCreateParams.PriceOverride.CreditGrantCadence
                                    .BEGINNING_OF_BILLING_PERIOD
                            )
                            .creditRate(
                                SubscriptionCreateParams.PriceOverride.CreditRate.builder()
                                    .amount(1.0)
                                    .currencyId("currencyId")
                                    .costFormula("costFormula")
                                    .build()
                            )
                            .featureId("featureId")
                            .price(
                                SubscriptionCreateParams.PriceOverride.Price.builder()
                                    .amount(0.0)
                                    .billingCountryCode("billingCountryCode")
                                    .currency(
                                        SubscriptionCreateParams.PriceOverride.Price.Currency.USD
                                    )
                                    .build()
                            )
                            .addTier(
                                SubscriptionCreateParams.PriceOverride.Tier.builder()
                                    .flatPrice(
                                        SubscriptionCreateParams.PriceOverride.Tier.FlatPrice
                                            .builder()
                                            .amount(0.0)
                                            .billingCountryCode("billingCountryCode")
                                            .currency(
                                                SubscriptionCreateParams.PriceOverride.Tier
                                                    .FlatPrice
                                                    .Currency
                                                    .USD
                                            )
                                            .build()
                                    )
                                    .unitPrice(
                                        SubscriptionCreateParams.PriceOverride.Tier.UnitPrice
                                            .builder()
                                            .amount(0.0)
                                            .billingCountryCode("billingCountryCode")
                                            .currency(
                                                SubscriptionCreateParams.PriceOverride.Tier
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
                        SubscriptionCreateParams.ScheduleStrategy.END_OF_BILLING_PERIOD
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addSubscriptionEntitlement(
                        SubscriptionCreateParams.SubscriptionEntitlement.builder()
                            .featureId("featureId")
                            .usageLimit(0.0)
                            .isGranted(true)
                            .build()
                    )
                    .trialOverrideConfiguration(
                        SubscriptionCreateParams.TrialOverrideConfiguration.builder()
                            .isTrial(true)
                            .trialEndBehavior(
                                SubscriptionCreateParams.TrialOverrideConfiguration.TrialEndBehavior
                                    .CONVERT_TO_PAID
                            )
                            .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .unitQuantity(1.0)
                    .build()
            )

        val subscription = subscriptionFuture.get()
        subscription.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.v1().subscriptions()

        val subscriptionFuture = subscriptionServiceAsync.retrieve("x")

        val subscription = subscriptionFuture.get()
        subscription.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.v1().subscriptions()

        val pageFuture = subscriptionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delegate() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.v1().subscriptions()

        val responseFuture =
            subscriptionServiceAsync.delegate(
                SubscriptionDelegateParams.builder()
                    .id("x")
                    .targetCustomerId("targetCustomerId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun migrate() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.v1().subscriptions()

        val responseFuture =
            subscriptionServiceAsync.migrate(
                SubscriptionMigrateParams.builder()
                    .id("x")
                    .subscriptionMigrationTime(
                        SubscriptionMigrateParams.SubscriptionMigrationTime.END_OF_BILLING_PERIOD
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun preview() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.v1().subscriptions()

        val responseFuture =
            subscriptionServiceAsync.preview(
                SubscriptionPreviewParams.builder()
                    .customerId("customerId")
                    .planId("planId")
                    .addAddon(
                        SubscriptionPreviewParams.Addon.builder()
                            .addonId("addonId")
                            .quantity(1L)
                            .build()
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
                            .quantity(1.0)
                            .build()
                    )
                    .billingCountryCode("billingCountryCode")
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
                            .metadata(JsonValue.from(mapOf<String, Any>()))
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
                            .quantity(1.0)
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
                    .unitQuantity(1.0)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun transfer() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.v1().subscriptions()

        val responseFuture =
            subscriptionServiceAsync.transfer(
                SubscriptionTransferParams.builder()
                    .id("x")
                    .destinationResourceId("destinationResourceId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
