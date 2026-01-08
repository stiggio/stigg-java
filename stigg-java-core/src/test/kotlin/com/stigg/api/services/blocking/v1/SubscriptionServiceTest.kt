// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClient
import com.stigg.api.core.JsonValue
import com.stigg.api.models.v1.subscriptions.SubscriptionCreateParams
import com.stigg.api.models.v1.subscriptions.SubscriptionDelegateParams
import com.stigg.api.models.v1.subscriptions.SubscriptionListParams
import com.stigg.api.models.v1.subscriptions.SubscriptionMigrateParams
import com.stigg.api.models.v1.subscriptions.SubscriptionPreviewParams
import com.stigg.api.models.v1.subscriptions.SubscriptionTransferParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.v1().subscriptions()

        val subscription =
            subscriptionService.create(
                SubscriptionCreateParams.builder()
                    .customerId("customerId")
                    .planId("planId")
                    .id("id")
                    .awaitPaymentConfirmation(true)
                    .billingPeriod(SubscriptionCreateParams.BillingPeriod.MONTHLY)
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
                    .payingCustomerId("payingCustomerId")
                    .resourceId("resourceId")
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
                    .build()
            )

        subscription.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.v1().subscriptions()

        val subscription = subscriptionService.retrieve("x")

        subscription.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.v1().subscriptions()

        val subscriptions =
            subscriptionService.list(
                SubscriptionListParams.builder()
                    .customerId("customerId")
                    .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status("status")
                    .build()
            )

        subscriptions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delegate() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.v1().subscriptions()

        val response =
            subscriptionService.delegate(
                SubscriptionDelegateParams.builder()
                    .id("x")
                    .targetCustomerId("targetCustomerId")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun migrate() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.v1().subscriptions()

        val response =
            subscriptionService.migrate(
                SubscriptionMigrateParams.builder()
                    .id("x")
                    .subscriptionMigrationTime(
                        SubscriptionMigrateParams.SubscriptionMigrationTime.END_OF_BILLING_PERIOD
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun preview() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.v1().subscriptions()

        val response =
            subscriptionService.preview(
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

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun transfer() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.v1().subscriptions()

        val response =
            subscriptionService.transfer(
                SubscriptionTransferParams.builder()
                    .id("x")
                    .destinationResourceId("destinationResourceId")
                    .build()
            )

        response.validate()
    }
}
