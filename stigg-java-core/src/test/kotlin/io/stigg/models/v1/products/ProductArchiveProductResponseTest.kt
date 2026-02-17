// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductArchiveProductResponseTest {

    @Test
    fun create() {
        val productArchiveProductResponse =
            ProductArchiveProductResponse.builder()
                .data(
                    ProductArchiveProductResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            ProductArchiveProductResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .multipleSubscriptions(true)
                        .status(ProductArchiveProductResponse.Data.Status.PUBLISHED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productSettings(
                            ProductArchiveProductResponse.Data.ProductSettings.builder()
                                .subscriptionCancellationTime(
                                    ProductArchiveProductResponse.Data.ProductSettings
                                        .SubscriptionCancellationTime
                                        .END_OF_BILLING_PERIOD
                                )
                                .subscriptionEndSetup(
                                    ProductArchiveProductResponse.Data.ProductSettings
                                        .SubscriptionEndSetup
                                        .DOWNGRADE_TO_FREE
                                )
                                .subscriptionStartSetup(
                                    ProductArchiveProductResponse.Data.ProductSettings
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

        assertThat(productArchiveProductResponse.data())
            .isEqualTo(
                ProductArchiveProductResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .metadata(
                        ProductArchiveProductResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .multipleSubscriptions(true)
                    .status(ProductArchiveProductResponse.Data.Status.PUBLISHED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .productSettings(
                        ProductArchiveProductResponse.Data.ProductSettings.builder()
                            .subscriptionCancellationTime(
                                ProductArchiveProductResponse.Data.ProductSettings
                                    .SubscriptionCancellationTime
                                    .END_OF_BILLING_PERIOD
                            )
                            .subscriptionEndSetup(
                                ProductArchiveProductResponse.Data.ProductSettings
                                    .SubscriptionEndSetup
                                    .DOWNGRADE_TO_FREE
                            )
                            .subscriptionStartSetup(
                                ProductArchiveProductResponse.Data.ProductSettings
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
        val productArchiveProductResponse =
            ProductArchiveProductResponse.builder()
                .data(
                    ProductArchiveProductResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            ProductArchiveProductResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .multipleSubscriptions(true)
                        .status(ProductArchiveProductResponse.Data.Status.PUBLISHED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productSettings(
                            ProductArchiveProductResponse.Data.ProductSettings.builder()
                                .subscriptionCancellationTime(
                                    ProductArchiveProductResponse.Data.ProductSettings
                                        .SubscriptionCancellationTime
                                        .END_OF_BILLING_PERIOD
                                )
                                .subscriptionEndSetup(
                                    ProductArchiveProductResponse.Data.ProductSettings
                                        .SubscriptionEndSetup
                                        .DOWNGRADE_TO_FREE
                                )
                                .subscriptionStartSetup(
                                    ProductArchiveProductResponse.Data.ProductSettings
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

        val roundtrippedProductArchiveProductResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productArchiveProductResponse),
                jacksonTypeRef<ProductArchiveProductResponse>(),
            )

        assertThat(roundtrippedProductArchiveProductResponse)
            .isEqualTo(productArchiveProductResponse)
    }
}
