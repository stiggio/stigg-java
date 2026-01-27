// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.usage

import io.stigg.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageRetrieveParamsTest {

    @Test
    fun create() {
        UsageRetrieveParams.builder()
            .customerId("customerId")
            .featureId("featureId")
            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .groupBy("groupBy")
            .resourceId("resourceId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UsageRetrieveParams.builder()
                .customerId("customerId")
                .featureId("featureId")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("customerId")
        assertThat(params._pathParam(1)).isEqualTo("featureId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            UsageRetrieveParams.builder()
                .customerId("customerId")
                .featureId("featureId")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupBy("groupBy")
                .resourceId("resourceId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("startDate", "2019-12-27T18:11:19.117Z")
                    .put("endDate", "2019-12-27T18:11:19.117Z")
                    .put("groupBy", "groupBy")
                    .put("resourceId", "resourceId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            UsageRetrieveParams.builder()
                .customerId("customerId")
                .featureId("featureId")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("startDate", "2019-12-27T18:11:19.117Z").build())
    }
}
