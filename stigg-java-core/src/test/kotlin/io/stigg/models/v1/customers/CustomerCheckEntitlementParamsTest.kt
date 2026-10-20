// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCheckEntitlementParamsTest {

    @Test
    fun create() {
        CustomerCheckEntitlementParams.builder()
            .id("x")
            .currencyId("x")
            .featureId("x")
            .requestedUsage(0L)
            .addRequestedValue("string")
            .reservationExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .reservationId("x")
            .reservationMetadata("reservationMetadata")
            .reservationTtlSeconds(1L)
            .reserveAmount(1.0)
            .resourceId("x")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CustomerCheckEntitlementParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CustomerCheckEntitlementParams.builder()
                .id("x")
                .currencyId("x")
                .featureId("x")
                .requestedUsage(0L)
                .addRequestedValue("string")
                .reservationExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .reservationId("x")
                .reservationMetadata("reservationMetadata")
                .reservationTtlSeconds(1L)
                .reserveAmount(1.0)
                .resourceId("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
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
        val params = CustomerCheckEntitlementParams.builder().id("x").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            CustomerCheckEntitlementParams.builder()
                .id("x")
                .currencyId("x")
                .featureId("x")
                .requestedUsage(0L)
                .addRequestedValue("string")
                .reservationExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .reservationId("x")
                .reservationMetadata("reservationMetadata")
                .reservationTtlSeconds(1L)
                .reserveAmount(1.0)
                .resourceId("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("currencyId", "x")
                    .put("featureId", "x")
                    .put("requestedUsage", "0")
                    .put("requestedValues", listOf("string").joinToString(","))
                    .put("reservationExpiresAt", "2019-12-27T18:11:19.117Z")
                    .put("reservationId", "x")
                    .put("reservationMetadata", "reservationMetadata")
                    .put("reservationTtlSeconds", "1")
                    .put("reserveAmount", "1.0")
                    .put("resourceId", "x")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerCheckEntitlementParams.builder().id("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
