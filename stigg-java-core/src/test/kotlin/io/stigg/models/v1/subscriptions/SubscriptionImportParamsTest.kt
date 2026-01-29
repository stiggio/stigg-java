// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import io.stigg.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionImportParamsTest {

    @Test
    fun create() {
        SubscriptionImportParams.builder()
            .addSubscription(
                SubscriptionImportParams.Subscription.builder()
                    .id("id")
                    .customerId("customerId")
                    .planId("planId")
                    .billingId("billingId")
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
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionImportParams.builder()
                .addSubscription(
                    SubscriptionImportParams.Subscription.builder()
                        .id("id")
                        .customerId("customerId")
                        .planId("planId")
                        .billingId("billingId")
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
                .build()

        val body = params._body()

        assertThat(body.subscriptions())
            .containsExactly(
                SubscriptionImportParams.Subscription.builder()
                    .id("id")
                    .customerId("customerId")
                    .planId("planId")
                    .billingId("billingId")
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionImportParams.builder()
                .addSubscription(
                    SubscriptionImportParams.Subscription.builder()
                        .id("id")
                        .customerId("customerId")
                        .planId("planId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.subscriptions())
            .containsExactly(
                SubscriptionImportParams.Subscription.builder()
                    .id("id")
                    .customerId("customerId")
                    .planId("planId")
                    .build()
            )
    }
}
