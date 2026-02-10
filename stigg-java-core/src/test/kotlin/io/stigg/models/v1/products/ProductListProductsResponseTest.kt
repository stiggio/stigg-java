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
                .productSettings(
                    ProductListProductsResponse.ProductSettings.builder()
                        .subscriptionCancellationTime(
                            ProductListProductsResponse.ProductSettings.SubscriptionCancellationTime
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
        assertThat(productListProductsResponse.productSettings())
            .contains(
                ProductListProductsResponse.ProductSettings.builder()
                    .subscriptionCancellationTime(
                        ProductListProductsResponse.ProductSettings.SubscriptionCancellationTime
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
                .productSettings(
                    ProductListProductsResponse.ProductSettings.builder()
                        .subscriptionCancellationTime(
                            ProductListProductsResponse.ProductSettings.SubscriptionCancellationTime
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

        val roundtrippedProductListProductsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productListProductsResponse),
                jacksonTypeRef<ProductListProductsResponse>(),
            )

        assertThat(roundtrippedProductListProductsResponse).isEqualTo(productListProductsResponse)
    }
}
