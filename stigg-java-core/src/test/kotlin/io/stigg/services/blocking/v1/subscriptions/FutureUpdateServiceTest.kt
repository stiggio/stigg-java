// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.subscriptions

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelPendingPaymentParams
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelScheduleParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FutureUpdateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelPendingPayment() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val futureUpdateService = client.v1().subscriptions().futureUpdate()

        val cancelSubscription =
            futureUpdateService.cancelPendingPayment(
                FutureUpdateCancelPendingPaymentParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        cancelSubscription.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelSchedule() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val futureUpdateService = client.v1().subscriptions().futureUpdate()

        val cancelSubscription =
            futureUpdateService.cancelSchedule(
                FutureUpdateCancelScheduleParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        cancelSubscription.validate()
    }
}
