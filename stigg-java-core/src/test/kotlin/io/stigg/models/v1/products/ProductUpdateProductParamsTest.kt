// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import io.stigg.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductUpdateProductParamsTest {

    @Test
    fun create() {
        ProductUpdateProductParams.builder()
            .id("x")
            .description("description")
            .displayName("displayName")
            .metadata(
                ProductUpdateProductParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .multipleSubscriptions(true)
            .productSettings(
                ProductUpdateProductParams.ProductSettings.builder()
                    .subscriptionCancellationTime(
                        ProductUpdateProductParams.ProductSettings.SubscriptionCancellationTime
                            .END_OF_BILLING_PERIOD
                    )
                    .subscriptionEndSetup(
                        ProductUpdateProductParams.ProductSettings.SubscriptionEndSetup
                            .DOWNGRADE_TO_FREE
                    )
                    .subscriptionStartSetup(
                        ProductUpdateProductParams.ProductSettings.SubscriptionStartSetup
                            .PLAN_SELECTION
                    )
                    .downgradePlanId("downgradePlanId")
                    .prorateAtEndOfBillingPeriod(true)
                    .subscriptionStartPlanId("subscriptionStartPlanId")
                    .build()
            )
            .usageResetCutoffRule(
                ProductUpdateProductParams.UsageResetCutoffRule.builder()
                    .behavior(ProductUpdateProductParams.UsageResetCutoffRule.Behavior.NEVER_RESET)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProductUpdateProductParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProductUpdateProductParams.builder()
                .id("x")
                .description("description")
                .displayName("displayName")
                .metadata(
                    ProductUpdateProductParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .multipleSubscriptions(true)
                .productSettings(
                    ProductUpdateProductParams.ProductSettings.builder()
                        .subscriptionCancellationTime(
                            ProductUpdateProductParams.ProductSettings.SubscriptionCancellationTime
                                .END_OF_BILLING_PERIOD
                        )
                        .subscriptionEndSetup(
                            ProductUpdateProductParams.ProductSettings.SubscriptionEndSetup
                                .DOWNGRADE_TO_FREE
                        )
                        .subscriptionStartSetup(
                            ProductUpdateProductParams.ProductSettings.SubscriptionStartSetup
                                .PLAN_SELECTION
                        )
                        .downgradePlanId("downgradePlanId")
                        .prorateAtEndOfBillingPeriod(true)
                        .subscriptionStartPlanId("subscriptionStartPlanId")
                        .build()
                )
                .usageResetCutoffRule(
                    ProductUpdateProductParams.UsageResetCutoffRule.builder()
                        .behavior(
                            ProductUpdateProductParams.UsageResetCutoffRule.Behavior.NEVER_RESET
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.displayName()).contains("displayName")
        assertThat(body.metadata())
            .contains(
                ProductUpdateProductParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.multipleSubscriptions()).contains(true)
        assertThat(body.productSettings())
            .contains(
                ProductUpdateProductParams.ProductSettings.builder()
                    .subscriptionCancellationTime(
                        ProductUpdateProductParams.ProductSettings.SubscriptionCancellationTime
                            .END_OF_BILLING_PERIOD
                    )
                    .subscriptionEndSetup(
                        ProductUpdateProductParams.ProductSettings.SubscriptionEndSetup
                            .DOWNGRADE_TO_FREE
                    )
                    .subscriptionStartSetup(
                        ProductUpdateProductParams.ProductSettings.SubscriptionStartSetup
                            .PLAN_SELECTION
                    )
                    .downgradePlanId("downgradePlanId")
                    .prorateAtEndOfBillingPeriod(true)
                    .subscriptionStartPlanId("subscriptionStartPlanId")
                    .build()
            )
        assertThat(body.usageResetCutoffRule())
            .contains(
                ProductUpdateProductParams.UsageResetCutoffRule.builder()
                    .behavior(ProductUpdateProductParams.UsageResetCutoffRule.Behavior.NEVER_RESET)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProductUpdateProductParams.builder().id("x").build()

        val body = params._body()
    }
}
