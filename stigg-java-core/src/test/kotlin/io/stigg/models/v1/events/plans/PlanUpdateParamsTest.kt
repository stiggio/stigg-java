// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.plans

import io.stigg.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanUpdateParamsTest {

    @Test
    fun create() {
        PlanUpdateParams.builder()
            .id("x")
            .billingId("billingId")
            .addCompatibleAddonId("string")
            .defaultTrialConfig(
                PlanUpdateParams.DefaultTrialConfig.builder()
                    .duration(0.0)
                    .units(PlanUpdateParams.DefaultTrialConfig.Units.DAY)
                    .budget(
                        PlanUpdateParams.DefaultTrialConfig.Budget.builder()
                            .hasSoftLimit(true)
                            .limit(0.0)
                            .build()
                    )
                    .trialEndBehavior(
                        PlanUpdateParams.DefaultTrialConfig.TrialEndBehavior.CONVERT_TO_PAID
                    )
                    .build()
            )
            .description("description")
            .displayName("displayName")
            .metadata(
                PlanUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .parentPlanId("parentPlanId")
            .build()
    }

    @Test
    fun pathParams() {
        val params = PlanUpdateParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlanUpdateParams.builder()
                .id("x")
                .billingId("billingId")
                .addCompatibleAddonId("string")
                .defaultTrialConfig(
                    PlanUpdateParams.DefaultTrialConfig.builder()
                        .duration(0.0)
                        .units(PlanUpdateParams.DefaultTrialConfig.Units.DAY)
                        .budget(
                            PlanUpdateParams.DefaultTrialConfig.Budget.builder()
                                .hasSoftLimit(true)
                                .limit(0.0)
                                .build()
                        )
                        .trialEndBehavior(
                            PlanUpdateParams.DefaultTrialConfig.TrialEndBehavior.CONVERT_TO_PAID
                        )
                        .build()
                )
                .description("description")
                .displayName("displayName")
                .metadata(
                    PlanUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .parentPlanId("parentPlanId")
                .build()

        val body = params._body()

        assertThat(body.billingId()).contains("billingId")
        assertThat(body.compatibleAddonIds().getOrNull()).containsExactly("string")
        assertThat(body.defaultTrialConfig())
            .contains(
                PlanUpdateParams.DefaultTrialConfig.builder()
                    .duration(0.0)
                    .units(PlanUpdateParams.DefaultTrialConfig.Units.DAY)
                    .budget(
                        PlanUpdateParams.DefaultTrialConfig.Budget.builder()
                            .hasSoftLimit(true)
                            .limit(0.0)
                            .build()
                    )
                    .trialEndBehavior(
                        PlanUpdateParams.DefaultTrialConfig.TrialEndBehavior.CONVERT_TO_PAID
                    )
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.displayName()).contains("displayName")
        assertThat(body.metadata())
            .contains(
                PlanUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.parentPlanId()).contains("parentPlanId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PlanUpdateParams.builder().id("x").build()

        val body = params._body()
    }
}
