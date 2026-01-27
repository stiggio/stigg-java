// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.subscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.JsonValue
import com.stigg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListPageResponseTest {

    @Test
    fun create() {
        val subscriptionListPageResponse =
            SubscriptionListPageResponse.builder()
                .addData(
                    SubscriptionListResponse.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customerId")
                        .paymentCollection(SubscriptionListResponse.PaymentCollection.NOT_REQUIRED)
                        .planId("planId")
                        .pricingType(SubscriptionListResponse.PricingType.FREE)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionListResponse.Status.PAYMENT_PENDING)
                        .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cancelReason(SubscriptionListResponse.CancelReason.UPGRADE_OR_DOWNGRADE)
                        .currentBillingPeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currentBillingPeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            SubscriptionListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .payingCustomerId("payingCustomerId")
                        .paymentCollectionMethod(
                            SubscriptionListResponse.PaymentCollectionMethod.CHARGE
                        )
                        .resourceId("resourceId")
                        .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pagination(
                    SubscriptionListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(subscriptionListPageResponse.data())
            .containsExactly(
                SubscriptionListResponse.builder()
                    .id("id")
                    .billingId("billingId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customerId")
                    .paymentCollection(SubscriptionListResponse.PaymentCollection.NOT_REQUIRED)
                    .planId("planId")
                    .pricingType(SubscriptionListResponse.PricingType.FREE)
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(SubscriptionListResponse.Status.PAYMENT_PENDING)
                    .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cancelReason(SubscriptionListResponse.CancelReason.UPGRADE_OR_DOWNGRADE)
                    .currentBillingPeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currentBillingPeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        SubscriptionListResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .payingCustomerId("payingCustomerId")
                    .paymentCollectionMethod(
                        SubscriptionListResponse.PaymentCollectionMethod.CHARGE
                    )
                    .resourceId("resourceId")
                    .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(subscriptionListPageResponse.pagination())
            .isEqualTo(
                SubscriptionListPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionListPageResponse =
            SubscriptionListPageResponse.builder()
                .addData(
                    SubscriptionListResponse.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customerId")
                        .paymentCollection(SubscriptionListResponse.PaymentCollection.NOT_REQUIRED)
                        .planId("planId")
                        .pricingType(SubscriptionListResponse.PricingType.FREE)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionListResponse.Status.PAYMENT_PENDING)
                        .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cancelReason(SubscriptionListResponse.CancelReason.UPGRADE_OR_DOWNGRADE)
                        .currentBillingPeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currentBillingPeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            SubscriptionListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .payingCustomerId("payingCustomerId")
                        .paymentCollectionMethod(
                            SubscriptionListResponse.PaymentCollectionMethod.CHARGE
                        )
                        .resourceId("resourceId")
                        .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pagination(
                    SubscriptionListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedSubscriptionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionListPageResponse),
                jacksonTypeRef<SubscriptionListPageResponse>(),
            )

        assertThat(roundtrippedSubscriptionListPageResponse).isEqualTo(subscriptionListPageResponse)
    }
}
