// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

import io.stigg.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.displayName()).isEqualTo("displayName")
        assertThat(body.productId()).isEqualTo("productId")
        assertThat(body.billingId()).contains("billingId")
        assertThat(body.defaultTrialConfig())
            .contains(
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
        assertThat(body.description()).contains("description")
        assertThat(body.metadata())
            .contains(
                PlanCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.parentPlanId()).contains("parentPlanId")
        assertThat(body.pricingType()).contains(PlanCreateParams.PricingType.FREE)
        assertThat(body.status()).contains(PlanCreateParams.Status.DRAFT)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanCreateParams.builder()
                .id("id")
                .displayName("displayName")
                .productId("productId")
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.displayName()).isEqualTo("displayName")
        assertThat(body.productId()).isEqualTo("productId")
    }
}
