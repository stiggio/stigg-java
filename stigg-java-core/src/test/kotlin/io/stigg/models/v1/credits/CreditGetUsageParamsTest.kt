// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits

import io.stigg.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditGetUsageParamsTest {

    @Test
    fun create() {
        CreditGetUsageParams.builder()
            .customerId("customerId")
            .currencyId("currencyId")
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .resourceId("resourceId")
            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .timeRange(CreditGetUsageParams.TimeRange.LAST_DAY)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CreditGetUsageParams.builder()
                .customerId("customerId")
                .currencyId("currencyId")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resourceId("resourceId")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeRange(CreditGetUsageParams.TimeRange.LAST_DAY)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customerId", "customerId")
                    .put("currencyId", "currencyId")
                    .put("endDate", "2019-12-27T18:11:19.117Z")
                    .put("resourceId", "resourceId")
                    .put("startDate", "2019-12-27T18:11:19.117Z")
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
