// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListResponseTest {

    @Test
    fun create() {
        val subscriptionListResponse =
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
                .paymentCollectionMethod(SubscriptionListResponse.PaymentCollectionMethod.CHARGE)
                .addPrice(
                    SubscriptionListResponse.Price.builder()
                        .id("id")
                        .createdAt("createdAt")
                        .updatedAt("updatedAt")
                        .build()
                )
                .resourceId("resourceId")
                .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(subscriptionListResponse.id()).isEqualTo("id")
        assertThat(subscriptionListResponse.billingId()).contains("billingId")
        assertThat(subscriptionListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListResponse.customerId()).isEqualTo("customerId")
        assertThat(subscriptionListResponse.paymentCollection())
            .isEqualTo(SubscriptionListResponse.PaymentCollection.NOT_REQUIRED)
        assertThat(subscriptionListResponse.planId()).isEqualTo("planId")
        assertThat(subscriptionListResponse.pricingType())
            .isEqualTo(SubscriptionListResponse.PricingType.FREE)
        assertThat(subscriptionListResponse.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListResponse.status())
            .isEqualTo(SubscriptionListResponse.Status.PAYMENT_PENDING)
        assertThat(subscriptionListResponse.cancellationDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListResponse.cancelReason())
            .contains(SubscriptionListResponse.CancelReason.UPGRADE_OR_DOWNGRADE)
        assertThat(subscriptionListResponse.currentBillingPeriodEnd())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListResponse.currentBillingPeriodStart())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListResponse.effectiveEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListResponse.endDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListResponse.metadata())
            .contains(
                SubscriptionListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(subscriptionListResponse.payingCustomerId()).contains("payingCustomerId")
        assertThat(subscriptionListResponse.paymentCollectionMethod())
            .contains(SubscriptionListResponse.PaymentCollectionMethod.CHARGE)
        assertThat(subscriptionListResponse.prices().getOrNull())
            .containsExactly(
                SubscriptionListResponse.Price.builder()
                    .id("id")
                    .createdAt("createdAt")
                    .updatedAt("updatedAt")
                    .build()
            )
        assertThat(subscriptionListResponse.resourceId()).contains("resourceId")
        assertThat(subscriptionListResponse.trialEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionListResponse =
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
                .paymentCollectionMethod(SubscriptionListResponse.PaymentCollectionMethod.CHARGE)
                .addPrice(
                    SubscriptionListResponse.Price.builder()
                        .id("id")
                        .createdAt("createdAt")
                        .updatedAt("updatedAt")
                        .build()
                )
                .resourceId("resourceId")
                .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSubscriptionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionListResponse),
                jacksonTypeRef<SubscriptionListResponse>(),
            )

        assertThat(roundtrippedSubscriptionListResponse).isEqualTo(subscriptionListResponse)
    }
}
