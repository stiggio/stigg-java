// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.subscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.JsonValue
import com.stigg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateResponseTest {

    @Test
    fun create() {
        val subscriptionCreateResponse =
            SubscriptionCreateResponse.builder()
                .data(
                    SubscriptionCreateResponse.Data.builder()
                        .id("id")
                        .status(SubscriptionCreateResponse.Data.Status.SUCCESS)
                        .checkoutBillingId("checkoutBillingId")
                        .checkoutUrl("checkoutUrl")
                        .isScheduled(true)
                        .subscription(
                            SubscriptionCreateResponse.Data.Subscription.builder()
                                .id("id")
                                .billingId("billingId")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .customerId("customerId")
                                .paymentCollection(
                                    SubscriptionCreateResponse.Data.Subscription.PaymentCollection
                                        .NOT_REQUIRED
                                )
                                .planId("planId")
                                .pricingType(
                                    SubscriptionCreateResponse.Data.Subscription.PricingType.FREE
                                )
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(
                                    SubscriptionCreateResponse.Data.Subscription.Status
                                        .PAYMENT_PENDING
                                )
                                .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .cancelReason(
                                    SubscriptionCreateResponse.Data.Subscription.CancelReason
                                        .UPGRADE_OR_DOWNGRADE
                                )
                                .currentBillingPeriodEnd(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .currentBillingPeriodStart(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .effectiveEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .metadata(
                                    SubscriptionCreateResponse.Data.Subscription.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .payingCustomerId("payingCustomerId")
                                .paymentCollectionMethod(
                                    SubscriptionCreateResponse.Data.Subscription
                                        .PaymentCollectionMethod
                                        .CHARGE
                                )
                                .resourceId("resourceId")
                                .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(subscriptionCreateResponse.data())
            .isEqualTo(
                SubscriptionCreateResponse.Data.builder()
                    .id("id")
                    .status(SubscriptionCreateResponse.Data.Status.SUCCESS)
                    .checkoutBillingId("checkoutBillingId")
                    .checkoutUrl("checkoutUrl")
                    .isScheduled(true)
                    .subscription(
                        SubscriptionCreateResponse.Data.Subscription.builder()
                            .id("id")
                            .billingId("billingId")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .customerId("customerId")
                            .paymentCollection(
                                SubscriptionCreateResponse.Data.Subscription.PaymentCollection
                                    .NOT_REQUIRED
                            )
                            .planId("planId")
                            .pricingType(
                                SubscriptionCreateResponse.Data.Subscription.PricingType.FREE
                            )
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(
                                SubscriptionCreateResponse.Data.Subscription.Status.PAYMENT_PENDING
                            )
                            .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .cancelReason(
                                SubscriptionCreateResponse.Data.Subscription.CancelReason
                                    .UPGRADE_OR_DOWNGRADE
                            )
                            .currentBillingPeriodEnd(
                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                            )
                            .currentBillingPeriodStart(
                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                            )
                            .effectiveEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .metadata(
                                SubscriptionCreateResponse.Data.Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .payingCustomerId("payingCustomerId")
                            .paymentCollectionMethod(
                                SubscriptionCreateResponse.Data.Subscription.PaymentCollectionMethod
                                    .CHARGE
                            )
                            .resourceId("resourceId")
                            .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionCreateResponse =
            SubscriptionCreateResponse.builder()
                .data(
                    SubscriptionCreateResponse.Data.builder()
                        .id("id")
                        .status(SubscriptionCreateResponse.Data.Status.SUCCESS)
                        .checkoutBillingId("checkoutBillingId")
                        .checkoutUrl("checkoutUrl")
                        .isScheduled(true)
                        .subscription(
                            SubscriptionCreateResponse.Data.Subscription.builder()
                                .id("id")
                                .billingId("billingId")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .customerId("customerId")
                                .paymentCollection(
                                    SubscriptionCreateResponse.Data.Subscription.PaymentCollection
                                        .NOT_REQUIRED
                                )
                                .planId("planId")
                                .pricingType(
                                    SubscriptionCreateResponse.Data.Subscription.PricingType.FREE
                                )
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(
                                    SubscriptionCreateResponse.Data.Subscription.Status
                                        .PAYMENT_PENDING
                                )
                                .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .cancelReason(
                                    SubscriptionCreateResponse.Data.Subscription.CancelReason
                                        .UPGRADE_OR_DOWNGRADE
                                )
                                .currentBillingPeriodEnd(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .currentBillingPeriodStart(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .effectiveEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .metadata(
                                    SubscriptionCreateResponse.Data.Subscription.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .payingCustomerId("payingCustomerId")
                                .paymentCollectionMethod(
                                    SubscriptionCreateResponse.Data.Subscription
                                        .PaymentCollectionMethod
                                        .CHARGE
                                )
                                .resourceId("resourceId")
                                .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedSubscriptionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionCreateResponse),
                jacksonTypeRef<SubscriptionCreateResponse>(),
            )

        assertThat(roundtrippedSubscriptionCreateResponse).isEqualTo(subscriptionCreateResponse)
    }
}
