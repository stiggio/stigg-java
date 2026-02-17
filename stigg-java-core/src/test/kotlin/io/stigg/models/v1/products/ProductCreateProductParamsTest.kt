// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import io.stigg.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCreateProductParamsTest {

    @Test
    fun create() {
        ProductCreateProductParams.builder()
            .id("id")
            .description("description")
            .displayName("displayName")
            .metadata(
                ProductCreateProductParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .multipleSubscriptions(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            ProductCreateProductParams.builder()
                .id("id")
                .description("description")
                .displayName("displayName")
                .metadata(
                    ProductCreateProductParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .multipleSubscriptions(true)
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.description()).contains("description")
        assertThat(body.displayName()).contains("displayName")
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
        val params = ProductCreateProductParams.builder().id("id").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
    }
}
