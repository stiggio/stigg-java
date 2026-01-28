// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionRetrieveResponseTest {

    @Test
    fun create() {
        val subscriptionRetrieveResponse =
            SubscriptionRetrieveResponse.builder()
                .data(
                    SubscriptionRetrieveResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customerId")
                        .paymentCollection(
                            SubscriptionRetrieveResponse.Data.PaymentCollection.NOT_REQUIRED
                        )
                        .planId("planId")
                        .pricingType(SubscriptionRetrieveResponse.Data.PricingType.FREE)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionRetrieveResponse.Data.Status.PAYMENT_PENDING)
                        .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cancelReason(
                            SubscriptionRetrieveResponse.Data.CancelReason.UPGRADE_OR_DOWNGRADE
                        )
                        .currentBillingPeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currentBillingPeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            SubscriptionRetrieveResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .payingCustomerId("payingCustomerId")
                        .paymentCollectionMethod(
                            SubscriptionRetrieveResponse.Data.PaymentCollectionMethod.CHARGE
                        )
                        .addPrice(
                            SubscriptionRetrieveResponse.Data.Price.builder()
                                .id("id")
                                .createdAt("createdAt")
                                .updatedAt("updatedAt")
                                .build()
                        )
                        .resourceId("resourceId")
                        .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(subscriptionRetrieveResponse.data())
            .isEqualTo(
                SubscriptionRetrieveResponse.Data.builder()
                    .id("id")
                    .billingId("billingId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customerId")
                    .paymentCollection(
                        SubscriptionRetrieveResponse.Data.PaymentCollection.NOT_REQUIRED
                    )
                    .planId("planId")
                    .pricingType(SubscriptionRetrieveResponse.Data.PricingType.FREE)
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(SubscriptionRetrieveResponse.Data.Status.PAYMENT_PENDING)
                    .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cancelReason(
                        SubscriptionRetrieveResponse.Data.CancelReason.UPGRADE_OR_DOWNGRADE
                    )
                    .currentBillingPeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currentBillingPeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        SubscriptionRetrieveResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .payingCustomerId("payingCustomerId")
                    .paymentCollectionMethod(
                        SubscriptionRetrieveResponse.Data.PaymentCollectionMethod.CHARGE
                    )
                    .addPrice(
                        SubscriptionRetrieveResponse.Data.Price.builder()
                            .id("id")
                            .createdAt("createdAt")
                            .updatedAt("updatedAt")
                            .build()
                    )
                    .resourceId("resourceId")
                    .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionRetrieveResponse =
            SubscriptionRetrieveResponse.builder()
                .data(
                    SubscriptionRetrieveResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customerId")
                        .paymentCollection(
                            SubscriptionRetrieveResponse.Data.PaymentCollection.NOT_REQUIRED
                        )
                        .planId("planId")
                        .pricingType(SubscriptionRetrieveResponse.Data.PricingType.FREE)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionRetrieveResponse.Data.Status.PAYMENT_PENDING)
                        .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cancelReason(
                            SubscriptionRetrieveResponse.Data.CancelReason.UPGRADE_OR_DOWNGRADE
                        )
                        .currentBillingPeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currentBillingPeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            SubscriptionRetrieveResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .payingCustomerId("payingCustomerId")
                        .paymentCollectionMethod(
                            SubscriptionRetrieveResponse.Data.PaymentCollectionMethod.CHARGE
                        )
                        .addPrice(
                            SubscriptionRetrieveResponse.Data.Price.builder()
                                .id("id")
                                .createdAt("createdAt")
                                .updatedAt("updatedAt")
                                .build()
                        )
                        .resourceId("resourceId")
                        .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedSubscriptionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionRetrieveResponse),
                jacksonTypeRef<SubscriptionRetrieveResponse>(),
            )

        assertThat(roundtrippedSubscriptionRetrieveResponse).isEqualTo(subscriptionRetrieveResponse)
    }
}
