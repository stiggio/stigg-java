// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductUpdateProductResponseTest {

    @Test
    fun create() {
        val productUpdateProductResponse =
            ProductUpdateProductResponse.builder()
                .data(
                    ProductUpdateProductResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            ProductUpdateProductResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .multipleSubscriptions(true)
                        .status(ProductUpdateProductResponse.Data.Status.PUBLISHED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productSettings(
                            ProductUpdateProductResponse.Data.ProductSettings.builder()
                                .subscriptionCancellationTime(
                                    ProductUpdateProductResponse.Data.ProductSettings
                                        .SubscriptionCancellationTime
                                        .END_OF_BILLING_PERIOD
                                )
                                .subscriptionEndSetup(
                                    ProductUpdateProductResponse.Data.ProductSettings
                                        .SubscriptionEndSetup
                                        .DOWNGRADE_TO_FREE
                                )
                                .subscriptionStartSetup(
                                    ProductUpdateProductResponse.Data.ProductSettings
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

        assertThat(productUpdateProductResponse.data())
            .isEqualTo(
                ProductUpdateProductResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .metadata(
                        ProductUpdateProductResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .multipleSubscriptions(true)
                    .status(ProductUpdateProductResponse.Data.Status.PUBLISHED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .productSettings(
                        ProductUpdateProductResponse.Data.ProductSettings.builder()
                            .subscriptionCancellationTime(
                                ProductUpdateProductResponse.Data.ProductSettings
                                    .SubscriptionCancellationTime
                                    .END_OF_BILLING_PERIOD
                            )
                            .subscriptionEndSetup(
                                ProductUpdateProductResponse.Data.ProductSettings
                                    .SubscriptionEndSetup
                                    .DOWNGRADE_TO_FREE
                            )
                            .subscriptionStartSetup(
                                ProductUpdateProductResponse.Data.ProductSettings
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
        val productUpdateProductResponse =
            ProductUpdateProductResponse.builder()
                .data(
                    ProductUpdateProductResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            ProductUpdateProductResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .multipleSubscriptions(true)
                        .status(ProductUpdateProductResponse.Data.Status.PUBLISHED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productSettings(
                            ProductUpdateProductResponse.Data.ProductSettings.builder()
                                .subscriptionCancellationTime(
                                    ProductUpdateProductResponse.Data.ProductSettings
                                        .SubscriptionCancellationTime
                                        .END_OF_BILLING_PERIOD
                                )
                                .subscriptionEndSetup(
                                    ProductUpdateProductResponse.Data.ProductSettings
                                        .SubscriptionEndSetup
                                        .DOWNGRADE_TO_FREE
                                )
                                .subscriptionStartSetup(
                                    ProductUpdateProductResponse.Data.ProductSettings
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

        val roundtrippedProductUpdateProductResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productUpdateProductResponse),
                jacksonTypeRef<ProductUpdateProductResponse>(),
            )

        assertThat(roundtrippedProductUpdateProductResponse).isEqualTo(productUpdateProductResponse)
    }
}
