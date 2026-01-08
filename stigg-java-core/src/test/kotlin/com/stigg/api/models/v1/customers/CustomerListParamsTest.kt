// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers

import com.stigg.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListParamsTest {

    @Test
    fun create() {
        CustomerListParams.builder()
            .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(1L)
            .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerListParams.builder()
                .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(1L)
                .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endingBefore", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("limit", "1")
                    .put("startingAfter", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
