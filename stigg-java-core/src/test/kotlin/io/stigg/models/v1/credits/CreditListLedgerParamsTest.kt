// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits

import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditListLedgerParamsTest {

    @Test
    fun create() {
        CreditListLedgerParams.builder()
            .customerId("customerId")
            .after("after")
            .before("before")
            .currencyId("currencyId")
            .eventType("eventType")
            .limit(1L)
            .resourceId("resourceId")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .build()
    }

    @Test
    fun headers() {
        val params =
            CreditListLedgerParams.builder()
                .customerId("customerId")
                .after("after")
                .before("before")
                .currencyId("currencyId")
                .eventType("eventType")
                .limit(1L)
                .resourceId("resourceId")
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
        val params = CreditListLedgerParams.builder().customerId("customerId").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            CreditListLedgerParams.builder()
                .customerId("customerId")
                .after("after")
                .before("before")
                .currencyId("currencyId")
                .eventType("eventType")
                .limit(1L)
                .resourceId("resourceId")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customerId", "customerId")
                    .put("after", "after")
                    .put("before", "before")
                    .put("currencyId", "currencyId")
                    .put("eventType", "eventType")
                    .put("limit", "1")
                    .put("resourceId", "resourceId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CreditListLedgerParams.builder().customerId("customerId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("customerId", "customerId").build())
    }
}
