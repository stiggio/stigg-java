// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductUnarchiveProductResponseTest {

    @Test
    fun create() {
        val productUnarchiveProductResponse =
            ProductUnarchiveProductResponse.builder()
                .data(
                    ProductUnarchiveProductResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            ProductUnarchiveProductResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .multipleSubscriptions(true)
                        .status(ProductUnarchiveProductResponse.Data.Status.PUBLISHED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productSettings(
                            ProductUnarchiveProductResponse.Data.ProductSettings.builder()
                                .subscriptionCancellationTime(
                                    ProductUnarchiveProductResponse.Data.ProductSettings
                                        .SubscriptionCancellationTime
                                        .END_OF_BILLING_PERIOD
                                )
                                .subscriptionEndSetup(
                                    ProductUnarchiveProductResponse.Data.ProductSettings
                                        .SubscriptionEndSetup
                                        .DOWNGRADE_TO_FREE
                                )
                                .subscriptionStartSetup(
                                    ProductUnarchiveProductResponse.Data.ProductSettings
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

        assertThat(productUnarchiveProductResponse.data())
            .isEqualTo(
                ProductUnarchiveProductResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .metadata(
                        ProductUnarchiveProductResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .multipleSubscriptions(true)
                    .status(ProductUnarchiveProductResponse.Data.Status.PUBLISHED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .productSettings(
                        ProductUnarchiveProductResponse.Data.ProductSettings.builder()
                            .subscriptionCancellationTime(
                                ProductUnarchiveProductResponse.Data.ProductSettings
                                    .SubscriptionCancellationTime
                                    .END_OF_BILLING_PERIOD
                            )
                            .subscriptionEndSetup(
                                ProductUnarchiveProductResponse.Data.ProductSettings
                                    .SubscriptionEndSetup
                                    .DOWNGRADE_TO_FREE
                            )
                            .subscriptionStartSetup(
                                ProductUnarchiveProductResponse.Data.ProductSettings
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
        val productUnarchiveProductResponse =
            ProductUnarchiveProductResponse.builder()
                .data(
                    ProductUnarchiveProductResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            ProductUnarchiveProductResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .multipleSubscriptions(true)
                        .status(ProductUnarchiveProductResponse.Data.Status.PUBLISHED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productSettings(
                            ProductUnarchiveProductResponse.Data.ProductSettings.builder()
                                .subscriptionCancellationTime(
                                    ProductUnarchiveProductResponse.Data.ProductSettings
                                        .SubscriptionCancellationTime
                                        .END_OF_BILLING_PERIOD
                                )
                                .subscriptionEndSetup(
                                    ProductUnarchiveProductResponse.Data.ProductSettings
                                        .SubscriptionEndSetup
                                        .DOWNGRADE_TO_FREE
                                )
                                .subscriptionStartSetup(
                                    ProductUnarchiveProductResponse.Data.ProductSettings
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

        val roundtrippedProductUnarchiveProductResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productUnarchiveProductResponse),
                jacksonTypeRef<ProductUnarchiveProductResponse>(),
            )

        assertThat(roundtrippedProductUnarchiveProductResponse)
            .isEqualTo(productUnarchiveProductResponse)
    }
}
