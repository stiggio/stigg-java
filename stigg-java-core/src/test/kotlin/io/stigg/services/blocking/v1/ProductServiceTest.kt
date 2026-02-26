// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.products.ProductCreateProductParams
import io.stigg.models.v1.products.ProductDuplicateProductParams
import io.stigg.models.v1.products.ProductUpdateProductParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProductServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun archiveProduct() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val productService = client.v1().products()

        val product = productService.archiveProduct("x")

        product.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createProduct() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val productService = client.v1().products()

        val product =
            productService.createProduct(
                ProductCreateProductParams.builder()
                    .id("id")
                    .description("description")
                    .displayName("displayName")
                    .metadata(
                        ProductCreateProductParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .multipleSubscriptions(true)
                    .build()
            )

        product.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun duplicateProduct() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val productService = client.v1().products()

        val product =
            productService.duplicateProduct(
                ProductDuplicateProductParams.builder()
                    .pathId("x")
                    .bodyId("id")
                    .description("description")
                    .displayName("displayName")
                    .build()
            )

        product.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listProducts() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val productService = client.v1().products()

        val page = productService.listProducts()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unarchiveProduct() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val productService = client.v1().products()

        val product = productService.unarchiveProduct("x")

        product.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateProduct() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val productService = client.v1().products()

        val product =
            productService.updateProduct(
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
                                ProductUpdateProductParams.ProductSettings
                                    .SubscriptionCancellationTime
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
            )

        product.validate()
    }
}
