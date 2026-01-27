// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import io.stigg.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListParamsTest {

    @Test
    fun create() {
        SubscriptionListParams.builder()
            .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customerId("customerId")
            .limit(1L)
            .status("status")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SubscriptionListParams.builder()
                .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("customerId")
                .limit(1L)
                .status("status")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("customerId", "customerId")
                    .put("limit", "1")
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
