// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.credits

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.credits.reservations.ReservationReleaseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReservationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun release() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reservationServiceAsync = client.v1().credits().reservations()

        val responseFuture =
            reservationServiceAsync.release(
                ReservationReleaseParams.builder()
                    .reservationId("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .consumedAmount(0.0)
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .resourceId("resourceId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
