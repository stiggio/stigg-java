// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListProductsPageResponseTest {

    @Test
    fun create() {
        val productListProductsPageResponse =
            ProductListProductsPageResponse.builder()
                .addData(
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
                        .productSettings(
                            ProductListProductsResponse.ProductSettings.builder()
                                .subscriptionCancellationTime(
                                    ProductListProductsResponse.ProductSettings
                                        .SubscriptionCancellationTime
                                        .END_OF_BILLING_PERIOD
                                )
                                .subscriptionEndSetup(
                                    ProductListProductsResponse.ProductSettings.SubscriptionEndSetup
                                        .DOWNGRADE_TO_FREE
                                )
                                .subscriptionStartSetup(
                                    ProductListProductsResponse.ProductSettings
                                        .SubscriptionStartSetup
                                        .PLAN_SELECTION
                                )
                                .downgradePlanId("downgradePlanId")
                                .prorateAtEndOfBillingPeriod(true)
                                .subscriptionStartPlanId("subscriptionStartPlanId")
                                .build()
                        )
                        .build()
                )
                .pagination(
                    ProductListProductsPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(productListProductsPageResponse.data())
            .containsExactly(
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
                    .productSettings(
                        ProductListProductsResponse.ProductSettings.builder()
                            .subscriptionCancellationTime(
                                ProductListProductsResponse.ProductSettings
                                    .SubscriptionCancellationTime
                                    .END_OF_BILLING_PERIOD
                            )
                            .subscriptionEndSetup(
                                ProductListProductsResponse.ProductSettings.SubscriptionEndSetup
                                    .DOWNGRADE_TO_FREE
                            )
                            .subscriptionStartSetup(
                                ProductListProductsResponse.ProductSettings.SubscriptionStartSetup
                                    .PLAN_SELECTION
                            )
                            .downgradePlanId("downgradePlanId")
                            .prorateAtEndOfBillingPeriod(true)
                            .subscriptionStartPlanId("subscriptionStartPlanId")
                            .build()
                    )
                    .build()
            )
        assertThat(productListProductsPageResponse.pagination())
            .isEqualTo(
                ProductListProductsPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productListProductsPageResponse =
            ProductListProductsPageResponse.builder()
                .addData(
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
                        .productSettings(
                            ProductListProductsResponse.ProductSettings.builder()
                                .subscriptionCancellationTime(
                                    ProductListProductsResponse.ProductSettings
                                        .SubscriptionCancellationTime
                                        .END_OF_BILLING_PERIOD
                                )
                                .subscriptionEndSetup(
                                    ProductListProductsResponse.ProductSettings.SubscriptionEndSetup
                                        .DOWNGRADE_TO_FREE
                                )
                                .subscriptionStartSetup(
                                    ProductListProductsResponse.ProductSettings
                                        .SubscriptionStartSetup
                                        .PLAN_SELECTION
                                )
                                .downgradePlanId("downgradePlanId")
                                .prorateAtEndOfBillingPeriod(true)
                                .subscriptionStartPlanId("subscriptionStartPlanId")
                                .build()
                        )
                        .build()
                )
                .pagination(
                    ProductListProductsPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedProductListProductsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productListProductsPageResponse),
                jacksonTypeRef<ProductListProductsPageResponse>(),
            )

        assertThat(roundtrippedProductListProductsPageResponse)
            .isEqualTo(productListProductsPageResponse)
    }
}
