// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits

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
            .limit(1L)
            .resourceId("resourceId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CreditListLedgerParams.builder()
                .customerId("customerId")
                .after("after")
                .before("before")
                .currencyId("currencyId")
                .limit(1L)
                .resourceId("resourceId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customerId", "customerId")
                    .put("after", "after")
                    .put("before", "before")
                    .put("currencyId", "currencyId")
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
