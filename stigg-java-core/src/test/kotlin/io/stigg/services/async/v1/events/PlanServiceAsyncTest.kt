// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.events.plans.PlanCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlanServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().events().plans()

        val planFuture =
            planServiceAsync.create(
                PlanCreateParams.builder()
                    .id("id")
                    .displayName("displayName")
                    .productId("productId")
                    .billingId("billingId")
                    .defaultTrialConfig(
                        PlanCreateParams.DefaultTrialConfig.builder()
                            .duration(0.0)
                            .units(PlanCreateParams.DefaultTrialConfig.Units.DAY)
                            .budget(
                                PlanCreateParams.DefaultTrialConfig.Budget.builder()
                                    .hasSoftLimit(true)
                                    .limit(0.0)
                                    .build()
                            )
                            .trialEndBehavior(
                                PlanCreateParams.DefaultTrialConfig.TrialEndBehavior.CONVERT_TO_PAID
                            )
                            .build()
                    )
                    .description("description")
                    .metadata(
                        PlanCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .parentPlanId("parentPlanId")
                    .pricingType(PlanCreateParams.PricingType.FREE)
                    .status(PlanCreateParams.Status.DRAFT)
                    .build()
            )

        val plan = planFuture.get()
        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().events().plans()

        val planFuture = planServiceAsync.retrieve("x")

        val plan = planFuture.get()
        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.v1().events().plans()

        val pageFuture = planServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
