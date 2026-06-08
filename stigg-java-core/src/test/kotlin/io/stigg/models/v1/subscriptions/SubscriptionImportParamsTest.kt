// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionImportParamsTest {

    @Test
    fun create() {
        SubscriptionImportParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
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
                    .billingPeriod(SubscriptionImportParams.Subscription.BillingPeriod.MONTHLY)
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
    }

    @Test
    fun headers() {
        val params =
            SubscriptionImportParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
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
                        .billingPeriod(SubscriptionImportParams.Subscription.BillingPeriod.MONTHLY)
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
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

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SubscriptionImportParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
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
                        .billingPeriod(SubscriptionImportParams.Subscription.BillingPeriod.MONTHLY)
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

        val body = params._body()

        assertThat(body.subscriptions())
            .containsExactly(
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
                    .billingPeriod(SubscriptionImportParams.Subscription.BillingPeriod.MONTHLY)
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
        assertThat(body.integrationId()).contains("integrationId")
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
