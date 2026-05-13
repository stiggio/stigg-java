// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits.grants

import io.stigg.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GrantListParamsTest {

    @Test
    fun create() {
        GrantListParams.builder()
            .customerId("customerId")
            .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .createdAt(
                GrantListParams.CreatedAt.builder()
                    .gt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .currencyId("currencyId")
            .limit(1L)
            .resourceId("resourceId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GrantListParams.builder()
                .customerId("customerId")
                .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(
                    GrantListParams.CreatedAt.builder()
                        .gt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .currencyId("currencyId")
                .limit(1L)
                .resourceId("resourceId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customerId", "customerId")
                    .put("after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("createdAt[gt]", "2019-12-27T18:11:19.117Z")
                    .put("createdAt[gte]", "2019-12-27T18:11:19.117Z")
                    .put("createdAt[lt]", "2019-12-27T18:11:19.117Z")
                    .put("createdAt[lte]", "2019-12-27T18:11:19.117Z")
                    .put("currencyId", "currencyId")
                    .put("limit", "1")
                    .put("resourceId", "resourceId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GrantListParams.builder().customerId("customerId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("customerId", "customerId").build())
    }
}
