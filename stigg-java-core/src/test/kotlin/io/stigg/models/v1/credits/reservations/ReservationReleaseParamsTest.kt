// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.reservations

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReservationReleaseParamsTest {

    @Test
    fun create() {
        ReservationReleaseParams.builder()
            .reservationId("x")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .consumedAmount(0.0)
            .currencyId("currencyId")
            .customerId("customerId")
            .resourceId("resourceId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ReservationReleaseParams.builder()
                .reservationId("x")
                .consumedAmount(0.0)
                .currencyId("currencyId")
                .customerId("customerId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ReservationReleaseParams.builder()
                .reservationId("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .consumedAmount(0.0)
                .currencyId("currencyId")
                .customerId("customerId")
                .resourceId("resourceId")
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
            ReservationReleaseParams.builder()
                .reservationId("x")
                .consumedAmount(0.0)
                .currencyId("currencyId")
                .customerId("customerId")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ReservationReleaseParams.builder()
                .reservationId("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .consumedAmount(0.0)
                .currencyId("currencyId")
                .customerId("customerId")
                .resourceId("resourceId")
                .build()

        val body = params._body()

        assertThat(body.consumedAmount()).isEqualTo(0.0)
        assertThat(body.currencyId()).isEqualTo("currencyId")
        assertThat(body.customerId()).isEqualTo("customerId")
        assertThat(body.resourceId()).contains("resourceId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReservationReleaseParams.builder()
                .reservationId("x")
                .consumedAmount(0.0)
                .currencyId("currencyId")
                .customerId("customerId")
                .build()

        val body = params._body()

        assertThat(body.consumedAmount()).isEqualTo(0.0)
        assertThat(body.currencyId()).isEqualTo("currencyId")
        assertThat(body.customerId()).isEqualTo("customerId")
    }
}
