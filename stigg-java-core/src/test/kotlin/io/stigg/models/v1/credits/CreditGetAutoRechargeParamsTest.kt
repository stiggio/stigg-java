// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits

import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditGetAutoRechargeParamsTest {

    @Test
    fun create() {
        CreditGetAutoRechargeParams.builder()
            .currencyId("currencyId")
            .customerId("customerId")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .build()
    }

    @Test
    fun headers() {
        val params =
            CreditGetAutoRechargeParams.builder()
                .currencyId("currencyId")
                .customerId("customerId")
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
        val params =
            CreditGetAutoRechargeParams.builder()
                .currencyId("currencyId")
                .customerId("customerId")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            CreditGetAutoRechargeParams.builder()
                .currencyId("currencyId")
                .customerId("customerId")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("currencyId", "currencyId")
                    .put("customerId", "customerId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CreditGetAutoRechargeParams.builder()
                .currencyId("currencyId")
                .customerId("customerId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("currencyId", "currencyId")
                    .put("customerId", "customerId")
                    .build()
            )
    }
}
