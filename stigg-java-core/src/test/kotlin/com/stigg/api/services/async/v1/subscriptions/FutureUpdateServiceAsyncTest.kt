// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1.subscriptions

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FutureUpdateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun cancelPendingPayment() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val futureUpdateServiceAsync = client.v1().subscriptions().futureUpdate()

        val responseFuture = futureUpdateServiceAsync.cancelPendingPayment("x")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancelSchedule() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val futureUpdateServiceAsync = client.v1().subscriptions().futureUpdate()

        val responseFuture = futureUpdateServiceAsync.cancelSchedule("x")

        val response = responseFuture.get()
        response.validate()
    }
}
