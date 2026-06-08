// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCreateProductParamsTest {

    @Test
    fun create() {
        ProductCreateProductParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .id("id")
            .displayName("displayName")
            .description("description")
            .metadata(
                ProductCreateProductParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .multipleSubscriptions(true)
            .build()
    }

    @Test
    fun headers() {
        val params =
            ProductCreateProductParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .id("id")
                .displayName("displayName")
                .description("description")
                .metadata(
                    ProductCreateProductParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .multipleSubscriptions(true)
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
        val params =
            ProductCreateProductParams.builder().id("id").displayName("displayName").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ProductCreateProductParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .id("id")
                .displayName("displayName")
                .description("description")
                .metadata(
                    ProductCreateProductParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .multipleSubscriptions(true)
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.displayName()).isEqualTo("displayName")
        assertThat(body.description()).contains("description")
        assertThat(body.metadata())
            .contains(
                ProductCreateProductParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.multipleSubscriptions()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProductCreateProductParams.builder().id("id").displayName("displayName").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.displayName()).isEqualTo("displayName")
    }
}
