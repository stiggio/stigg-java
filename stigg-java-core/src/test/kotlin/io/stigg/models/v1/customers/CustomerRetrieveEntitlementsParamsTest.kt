// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerRetrieveEntitlementsParamsTest {

    @Test
    fun create() {
        CustomerRetrieveEntitlementsParams.builder().id("x").resourceId("resourceId").build()
    }

    @Test
    fun pathParams() {
        val params = CustomerRetrieveEntitlementsParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomerRetrieveEntitlementsParams.builder().id("x").resourceId("resourceId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("resourceId", "resourceId").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerRetrieveEntitlementsParams.builder().id("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
