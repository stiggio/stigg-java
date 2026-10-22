// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.credits

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.credits.reservations.ReservationReleaseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReservationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun release() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val reservationService = client.v1().credits().reservations()

        val response =
            reservationService.release(
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

        response.validate()
    }
}
