// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.subscriptions

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelPendingPaymentParams
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelScheduleParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FutureUpdateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelPendingPayment() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val futureUpdateServiceAsync = client.v1().subscriptions().futureUpdate()

        val cancelSubscriptionFuture =
            futureUpdateServiceAsync.cancelPendingPayment(
                FutureUpdateCancelPendingPaymentParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val cancelSubscription = cancelSubscriptionFuture.get()
        cancelSubscription.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelSchedule() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val futureUpdateServiceAsync = client.v1().subscriptions().futureUpdate()

        val cancelSubscriptionFuture =
            futureUpdateServiceAsync.cancelSchedule(
                FutureUpdateCancelScheduleParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val cancelSubscription = cancelSubscriptionFuture.get()
        cancelSubscription.validate()
    }
}
