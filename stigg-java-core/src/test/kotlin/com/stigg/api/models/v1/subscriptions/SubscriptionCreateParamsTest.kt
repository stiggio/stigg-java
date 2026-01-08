// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.subscriptions

import com.stigg.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("customerId")
        assertThat(body.planId()).isEqualTo("planId")
        assertThat(body.id()).contains("id")
        assertThat(body.awaitPaymentConfirmation()).contains(true)
        assertThat(body.billingPeriod()).contains(SubscriptionCreateParams.BillingPeriod.MONTHLY)
        assertThat(body.checkoutOptions())
            .contains(
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
        assertThat(body.metadata())
            .contains(
                SubscriptionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.payingCustomerId()).contains("payingCustomerId")
        assertThat(body.resourceId()).contains("resourceId")
        assertThat(body.trialOverrideConfiguration())
            .contains(
                SubscriptionCreateParams.TrialOverrideConfiguration.builder()
                    .isTrial(true)
                    .trialEndBehavior(
                        SubscriptionCreateParams.TrialOverrideConfiguration.TrialEndBehavior
                            .CONVERT_TO_PAID
                    )
                    .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionCreateParams.builder().customerId("customerId").planId("planId").build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("customerId")
        assertThat(body.planId()).isEqualTo("planId")
    }
}
