// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.products.ProductCreateProductParams
import io.stigg.models.v1.products.ProductDuplicateProductParams
import io.stigg.models.v1.products.ProductUpdateProductParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProductServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun archiveProduct() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val productServiceAsync = client.v1().products()

        val responseFuture = productServiceAsync.archiveProduct("x")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createProduct() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val productServiceAsync = client.v1().products()

        val responseFuture =
            productServiceAsync.createProduct(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun duplicateProduct() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val productServiceAsync = client.v1().products()

        val responseFuture =
            productServiceAsync.duplicateProduct(
                ProductDuplicateProductParams.builder()
                    .pathId("x")
                    .bodyId("id")
                    .description("description")
                    .displayName("displayName")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listProducts() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val productServiceAsync = client.v1().products()

        val pageFuture = productServiceAsync.listProducts()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unarchiveProduct() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val productServiceAsync = client.v1().products()

        val responseFuture = productServiceAsync.unarchiveProduct("x")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateProduct() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val productServiceAsync = client.v1().products()

        val responseFuture =
            productServiceAsync.updateProduct(
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

        val response = responseFuture.get()
        response.validate()
    }
}
