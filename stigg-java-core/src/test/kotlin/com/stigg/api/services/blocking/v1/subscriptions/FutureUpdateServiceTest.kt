// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1.subscriptions

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FutureUpdateServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun cancelPendingPayment() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val futureUpdateService = client.v1().subscriptions().futureUpdate()

        val response = futureUpdateService.cancelPendingPayment("x")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancelSchedule() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val futureUpdateService = client.v1().subscriptions().futureUpdate()

        val response = futureUpdateService.cancelSchedule("x")

        response.validate()
    }
}
