// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListProductsResponseTest {

    @Test
    fun create() {
        val productListProductsResponse =
            ProductListProductsResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .displayName("displayName")
                .metadata(
                    ProductListProductsResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .multipleSubscriptions(true)
                .status(ProductListProductsResponse.Status.PUBLISHED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(productListProductsResponse.id()).isEqualTo("id")
        assertThat(productListProductsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productListProductsResponse.description()).contains("description")
        assertThat(productListProductsResponse.displayName()).isEqualTo("displayName")
        assertThat(productListProductsResponse.metadata())
            .isEqualTo(
                ProductListProductsResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(productListProductsResponse.multipleSubscriptions()).isEqualTo(true)
        assertThat(productListProductsResponse.status())
            .isEqualTo(ProductListProductsResponse.Status.PUBLISHED)
        assertThat(productListProductsResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productListProductsResponse =
            ProductListProductsResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .displayName("displayName")
                .metadata(
                    ProductListProductsResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .multipleSubscriptions(true)
                .status(ProductListProductsResponse.Status.PUBLISHED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedProductListProductsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productListProductsResponse),
                jacksonTypeRef<ProductListProductsResponse>(),
            )

        assertThat(roundtrippedProductListProductsResponse).isEqualTo(productListProductsResponse)
    }
}
