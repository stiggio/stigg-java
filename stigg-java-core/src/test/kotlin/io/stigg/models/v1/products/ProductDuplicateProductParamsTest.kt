// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductDuplicateProductParamsTest {

    @Test
    fun create() {
        ProductDuplicateProductParams.builder()
            .id("x")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .targetId("targetId")
            .description("description")
            .displayName("displayName")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProductDuplicateProductParams.builder().id("x").targetId("targetId").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ProductDuplicateProductParams.builder()
                .id("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .targetId("targetId")
                .description("description")
                .displayName("displayName")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = ProductDuplicateProductParams.builder().id("x").targetId("targetId").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ProductDuplicateProductParams.builder()
                .id("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .targetId("targetId")
                .description("description")
                .displayName("displayName")
                .build()

        val body = params._body()

        assertThat(body.targetId()).isEqualTo("targetId")
        assertThat(body.description()).contains("description")
        assertThat(body.displayName()).contains("displayName")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProductDuplicateProductParams.builder().id("x").targetId("targetId").build()

        val body = params._body()

        assertThat(body.targetId()).isEqualTo("targetId")
    }
}
