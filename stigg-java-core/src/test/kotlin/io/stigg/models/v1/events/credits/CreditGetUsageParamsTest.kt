// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits

import io.stigg.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditGetUsageParamsTest {

    @Test
    fun create() {
        CreditGetUsageParams.builder()
            .customerId("customerId")
            .currencyId("currencyId")
            .resourceId("resourceId")
            .timeRange(CreditGetUsageParams.TimeRange.LAST_DAY)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CreditGetUsageParams.builder()
                .customerId("customerId")
                .currencyId("currencyId")
                .resourceId("resourceId")
                .timeRange(CreditGetUsageParams.TimeRange.LAST_DAY)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customerId", "customerId")
                    .put("currencyId", "currencyId")
                    .put("resourceId", "resourceId")
                    .put("timeRange", "LAST_DAY")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CreditGetUsageParams.builder().customerId("customerId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("customerId", "customerId").build())
    }
}
