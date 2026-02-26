// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.events.plans.PlanCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlanServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val planService = client.v1().events().plans()

        val plan =
            planService.create(
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

        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val planService = client.v1().events().plans()

        val plan = planService.retrieve("x")

        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val planService = client.v1().events().plans()

        val page = planService.list()

        page.response().validate()
    }
}
