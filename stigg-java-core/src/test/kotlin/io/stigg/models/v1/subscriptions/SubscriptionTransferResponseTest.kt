// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionTransferResponseTest {

    @Test
    fun create() {
        val subscriptionTransferResponse =
            SubscriptionTransferResponse.builder()
                .data(
                    SubscriptionTransferResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customerId")
                        .paymentCollection(
                            SubscriptionTransferResponse.Data.PaymentCollection.NOT_REQUIRED
                        )
                        .planId("planId")
                        .pricingType(SubscriptionTransferResponse.Data.PricingType.FREE)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionTransferResponse.Data.Status.PAYMENT_PENDING)
                        .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cancelReason(
                            SubscriptionTransferResponse.Data.CancelReason.UPGRADE_OR_DOWNGRADE
                        )
                        .currentBillingPeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currentBillingPeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            SubscriptionTransferResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .payingCustomerId("payingCustomerId")
                        .paymentCollectionMethod(
                            SubscriptionTransferResponse.Data.PaymentCollectionMethod.CHARGE
                        )
                        .addPrice(
                            SubscriptionTransferResponse.Data.Price.builder()
                                .id("id")
                                .createdAt("createdAt")
                                .updatedAt("updatedAt")
                                .build()
                        )
                        .resourceId("resourceId")
                        .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .unitQuantity(1.0)
                        .build()
                )
                .build()

        assertThat(subscriptionTransferResponse.data())
            .isEqualTo(
                SubscriptionTransferResponse.Data.builder()
                    .id("id")
                    .billingId("billingId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customerId")
                    .paymentCollection(
                        SubscriptionTransferResponse.Data.PaymentCollection.NOT_REQUIRED
                    )
                    .planId("planId")
                    .pricingType(SubscriptionTransferResponse.Data.PricingType.FREE)
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(SubscriptionTransferResponse.Data.Status.PAYMENT_PENDING)
                    .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cancelReason(
                        SubscriptionTransferResponse.Data.CancelReason.UPGRADE_OR_DOWNGRADE
                    )
                    .currentBillingPeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currentBillingPeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        SubscriptionTransferResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .payingCustomerId("payingCustomerId")
                    .paymentCollectionMethod(
                        SubscriptionTransferResponse.Data.PaymentCollectionMethod.CHARGE
                    )
                    .addPrice(
                        SubscriptionTransferResponse.Data.Price.builder()
                            .id("id")
                            .createdAt("createdAt")
                            .updatedAt("updatedAt")
                            .build()
                    )
                    .resourceId("resourceId")
                    .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .unitQuantity(1.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionTransferResponse =
            SubscriptionTransferResponse.builder()
                .data(
                    SubscriptionTransferResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customerId")
                        .paymentCollection(
                            SubscriptionTransferResponse.Data.PaymentCollection.NOT_REQUIRED
                        )
                        .planId("planId")
                        .pricingType(SubscriptionTransferResponse.Data.PricingType.FREE)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionTransferResponse.Data.Status.PAYMENT_PENDING)
                        .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cancelReason(
                            SubscriptionTransferResponse.Data.CancelReason.UPGRADE_OR_DOWNGRADE
                        )
                        .currentBillingPeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currentBillingPeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            SubscriptionTransferResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .payingCustomerId("payingCustomerId")
                        .paymentCollectionMethod(
                            SubscriptionTransferResponse.Data.PaymentCollectionMethod.CHARGE
                        )
                        .addPrice(
                            SubscriptionTransferResponse.Data.Price.builder()
                                .id("id")
                                .createdAt("createdAt")
                                .updatedAt("updatedAt")
                                .build()
                        )
                        .resourceId("resourceId")
                        .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .unitQuantity(1.0)
                        .build()
                )
                .build()

        val roundtrippedSubscriptionTransferResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionTransferResponse),
                jacksonTypeRef<SubscriptionTransferResponse>(),
            )

        assertThat(roundtrippedSubscriptionTransferResponse).isEqualTo(subscriptionTransferResponse)
    }
}
