// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.subscriptions

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FutureUpdateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun cancelPendingPayment() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val futureUpdateServiceAsync = client.v1().subscriptions().futureUpdate()

        val cancelSubscriptionFuture = futureUpdateServiceAsync.cancelPendingPayment("x")

        val cancelSubscription = cancelSubscriptionFuture.get()
        cancelSubscription.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancelSchedule() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val futureUpdateServiceAsync = client.v1().subscriptions().futureUpdate()

        val cancelSubscriptionFuture = futureUpdateServiceAsync.cancelSchedule("x")

        val cancelSubscription = cancelSubscriptionFuture.get()
        cancelSubscription.validate()
    }
}
