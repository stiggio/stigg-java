// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.subscriptions

import com.stigg.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListParamsTest {

    @Test
    fun create() {
        SubscriptionListParams.builder()
            .customerId("customerId")
            .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(1L)
            .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status("status")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SubscriptionListParams.builder()
                .customerId("customerId")
                .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(1L)
                .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status("status")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customerId", "customerId")
                    .put("endingBefore", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("limit", "1")
                    .put("startingAfter", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("status", "status")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SubscriptionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
