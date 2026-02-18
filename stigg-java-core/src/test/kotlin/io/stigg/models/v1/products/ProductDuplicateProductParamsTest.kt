// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductDuplicateProductParamsTest {

    @Test
    fun create() {
        ProductDuplicateProductParams.builder()
            .id("x")
            .description("description")
            .displayName("displayName")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProductDuplicateProductParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProductDuplicateProductParams.builder()
                .id("x")
                .description("description")
                .displayName("displayName")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.displayName()).contains("displayName")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProductDuplicateProductParams.builder().id("x").build()

        val body = params._body()
    }
}
