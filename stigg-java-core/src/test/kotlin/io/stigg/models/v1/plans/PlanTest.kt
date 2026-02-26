// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanTest {

    @Test
    fun create() {
        val plan =
            Plan.builder()
                .data(
                    Plan.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .addCompatibleAddonId("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultTrialConfig(
                            Plan.Data.DefaultTrialConfig.builder()
                                .duration(0.0)
                                .units(Plan.Data.DefaultTrialConfig.Units.DAY)
                                .budget(
                                    Plan.Data.DefaultTrialConfig.Budget.builder()
                                        .hasSoftLimit(true)
                                        .limit(0.0)
                                        .build()
                                )
                                .trialEndBehavior(
                                    Plan.Data.DefaultTrialConfig.TrialEndBehavior.CONVERT_TO_PAID
                                )
                                .build()
                        )
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            Plan.Data.Entitlement.builder()
                                .id("id")
                                .type(Plan.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .metadata(
                            Plan.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parentPlanId("parentPlanId")
                        .pricingType(Plan.Data.PricingType.FREE)
                        .productId("productId")
                        .status(Plan.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        assertThat(plan.data())
            .isEqualTo(
                Plan.Data.builder()
                    .id("id")
                    .billingId("billingId")
                    .addCompatibleAddonId("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .defaultTrialConfig(
                        Plan.Data.DefaultTrialConfig.builder()
                            .duration(0.0)
                            .units(Plan.Data.DefaultTrialConfig.Units.DAY)
                            .budget(
                                Plan.Data.DefaultTrialConfig.Budget.builder()
                                    .hasSoftLimit(true)
                                    .limit(0.0)
                                    .build()
                            )
                            .trialEndBehavior(
                                Plan.Data.DefaultTrialConfig.TrialEndBehavior.CONVERT_TO_PAID
                            )
                            .build()
                    )
                    .description("description")
                    .displayName("displayName")
                    .addEntitlement(
                        Plan.Data.Entitlement.builder()
                            .id("id")
                            .type(Plan.Data.Entitlement.Type.FEATURE)
                            .build()
                    )
                    .isLatest(true)
                    .metadata(
                        Plan.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .parentPlanId("parentPlanId")
                    .pricingType(Plan.Data.PricingType.FREE)
                    .productId("productId")
                    .status(Plan.Data.Status.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .versionNumber(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val plan =
            Plan.builder()
                .data(
                    Plan.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .addCompatibleAddonId("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultTrialConfig(
                            Plan.Data.DefaultTrialConfig.builder()
                                .duration(0.0)
                                .units(Plan.Data.DefaultTrialConfig.Units.DAY)
                                .budget(
                                    Plan.Data.DefaultTrialConfig.Budget.builder()
                                        .hasSoftLimit(true)
                                        .limit(0.0)
                                        .build()
                                )
                                .trialEndBehavior(
                                    Plan.Data.DefaultTrialConfig.TrialEndBehavior.CONVERT_TO_PAID
                                )
                                .build()
                        )
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            Plan.Data.Entitlement.builder()
                                .id("id")
                                .type(Plan.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .metadata(
                            Plan.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parentPlanId("parentPlanId")
                        .pricingType(Plan.Data.PricingType.FREE)
                        .productId("productId")
                        .status(Plan.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        val roundtrippedPlan =
            jsonMapper.readValue(jsonMapper.writeValueAsString(plan), jacksonTypeRef<Plan>())

        assertThat(roundtrippedPlan).isEqualTo(plan)
    }
}
