// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.subscriptions

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClient
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

        val cancelSubscription = futureUpdateService.cancelPendingPayment("x")

        cancelSubscription.validate()
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

        val cancelSubscription = futureUpdateService.cancelSchedule("x")

        cancelSubscription.validate()
    }
}
