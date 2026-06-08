// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListProductsParamsTest {

    @Test
    fun create() {
        ProductListProductsParams.builder()
            .id("id")
            .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .createdAt(
                ProductListProductsParams.CreatedAt.builder()
                    .gt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .limit(1L)
            .addStatus(ProductListProductsParams.Status.PUBLISHED)
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .build()
    }

    @Test
    fun headers() {
        val params =
            ProductListProductsParams.builder()
                .id("id")
                .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(
                    ProductListProductsParams.CreatedAt.builder()
                        .gt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .limit(1L)
                .addStatus(ProductListProductsParams.Status.PUBLISHED)
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
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
        val params = ProductListProductsParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            ProductListProductsParams.builder()
                .id("id")
                .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(
                    ProductListProductsParams.CreatedAt.builder()
                        .gt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .limit(1L)
                .addStatus(ProductListProductsParams.Status.PUBLISHED)
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "id")
                    .put("after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("createdAt[gt]", "2019-12-27T18:11:19.117Z")
                    .put("createdAt[gte]", "2019-12-27T18:11:19.117Z")
                    .put("createdAt[lt]", "2019-12-27T18:11:19.117Z")
                    .put("createdAt[lte]", "2019-12-27T18:11:19.117Z")
                    .put("limit", "1")
                    .put("status", listOf("PUBLISHED").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProductListProductsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
