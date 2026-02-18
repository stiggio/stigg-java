// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCreateProductResponseTest {

    @Test
    fun create() {
        val productCreateProductResponse =
            ProductCreateProductResponse.builder()
                .data(
                    ProductCreateProductResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            ProductCreateProductResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .multipleSubscriptions(true)
                        .status(ProductCreateProductResponse.Data.Status.PUBLISHED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productSettings(
                            ProductCreateProductResponse.Data.ProductSettings.builder()
                                .subscriptionCancellationTime(
                                    ProductCreateProductResponse.Data.ProductSettings
                                        .SubscriptionCancellationTime
                                        .END_OF_BILLING_PERIOD
                                )
                                .subscriptionEndSetup(
                                    ProductCreateProductResponse.Data.ProductSettings
                                        .SubscriptionEndSetup
                                        .DOWNGRADE_TO_FREE
                                )
                                .subscriptionStartSetup(
                                    ProductCreateProductResponse.Data.ProductSettings
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
                .build()

        assertThat(productCreateProductResponse.data())
            .isEqualTo(
                ProductCreateProductResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .metadata(
                        ProductCreateProductResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .multipleSubscriptions(true)
                    .status(ProductCreateProductResponse.Data.Status.PUBLISHED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .productSettings(
                        ProductCreateProductResponse.Data.ProductSettings.builder()
                            .subscriptionCancellationTime(
                                ProductCreateProductResponse.Data.ProductSettings
                                    .SubscriptionCancellationTime
                                    .END_OF_BILLING_PERIOD
                            )
                            .subscriptionEndSetup(
                                ProductCreateProductResponse.Data.ProductSettings
                                    .SubscriptionEndSetup
                                    .DOWNGRADE_TO_FREE
                            )
                            .subscriptionStartSetup(
                                ProductCreateProductResponse.Data.ProductSettings
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productCreateProductResponse =
            ProductCreateProductResponse.builder()
                .data(
                    ProductCreateProductResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            ProductCreateProductResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .multipleSubscriptions(true)
                        .status(ProductCreateProductResponse.Data.Status.PUBLISHED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productSettings(
                            ProductCreateProductResponse.Data.ProductSettings.builder()
                                .subscriptionCancellationTime(
                                    ProductCreateProductResponse.Data.ProductSettings
                                        .SubscriptionCancellationTime
                                        .END_OF_BILLING_PERIOD
                                )
                                .subscriptionEndSetup(
                                    ProductCreateProductResponse.Data.ProductSettings
                                        .SubscriptionEndSetup
                                        .DOWNGRADE_TO_FREE
                                )
                                .subscriptionStartSetup(
                                    ProductCreateProductResponse.Data.ProductSettings
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
                .build()

        val roundtrippedProductCreateProductResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productCreateProductResponse),
                jacksonTypeRef<ProductCreateProductResponse>(),
            )

        assertThat(roundtrippedProductCreateProductResponse).isEqualTo(productCreateProductResponse)
    }
}
