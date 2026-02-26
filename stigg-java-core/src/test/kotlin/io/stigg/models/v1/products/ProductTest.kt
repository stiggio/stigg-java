// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductTest {

    @Test
    fun create() {
        val product =
            Product.builder()
                .data(
                    Product.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            Product.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .multipleSubscriptions(true)
                        .status(Product.Data.Status.PUBLISHED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productSettings(
                            Product.Data.ProductSettings.builder()
                                .subscriptionCancellationTime(
                                    Product.Data.ProductSettings.SubscriptionCancellationTime
                                        .END_OF_BILLING_PERIOD
                                )
                                .subscriptionEndSetup(
                                    Product.Data.ProductSettings.SubscriptionEndSetup
                                        .DOWNGRADE_TO_FREE
                                )
                                .subscriptionStartSetup(
                                    Product.Data.ProductSettings.SubscriptionStartSetup
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

        assertThat(product.data())
            .isEqualTo(
                Product.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .metadata(
                        Product.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .multipleSubscriptions(true)
                    .status(Product.Data.Status.PUBLISHED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .productSettings(
                        Product.Data.ProductSettings.builder()
                            .subscriptionCancellationTime(
                                Product.Data.ProductSettings.SubscriptionCancellationTime
                                    .END_OF_BILLING_PERIOD
                            )
                            .subscriptionEndSetup(
                                Product.Data.ProductSettings.SubscriptionEndSetup.DOWNGRADE_TO_FREE
                            )
                            .subscriptionStartSetup(
                                Product.Data.ProductSettings.SubscriptionStartSetup.PLAN_SELECTION
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
        val product =
            Product.builder()
                .data(
                    Product.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            Product.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .multipleSubscriptions(true)
                        .status(Product.Data.Status.PUBLISHED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productSettings(
                            Product.Data.ProductSettings.builder()
                                .subscriptionCancellationTime(
                                    Product.Data.ProductSettings.SubscriptionCancellationTime
                                        .END_OF_BILLING_PERIOD
                                )
                                .subscriptionEndSetup(
                                    Product.Data.ProductSettings.SubscriptionEndSetup
                                        .DOWNGRADE_TO_FREE
                                )
                                .subscriptionStartSetup(
                                    Product.Data.ProductSettings.SubscriptionStartSetup
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

        val roundtrippedProduct =
            jsonMapper.readValue(jsonMapper.writeValueAsString(product), jacksonTypeRef<Product>())

        assertThat(roundtrippedProduct).isEqualTo(product)
    }
}
