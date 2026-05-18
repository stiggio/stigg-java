// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

import io.stigg.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListChargesParamsTest {

    @Test
    fun create() {
        PlanListChargesParams.builder()
            .id("x")
            .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = PlanListChargesParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PlanListChargesParams.builder()
                .id("x")
                .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("limit", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlanListChargesParams.builder().id("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
