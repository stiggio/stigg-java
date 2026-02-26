// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanCreateResponseTest {

    @Test
    fun create() {
        val planCreateResponse =
            PlanCreateResponse.builder()
                .data(
                    PlanCreateResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .addCompatibleAddonId("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultTrialConfig(
                            PlanCreateResponse.Data.DefaultTrialConfig.builder()
                                .duration(0.0)
                                .units(PlanCreateResponse.Data.DefaultTrialConfig.Units.DAY)
                                .budget(
                                    PlanCreateResponse.Data.DefaultTrialConfig.Budget.builder()
                                        .hasSoftLimit(true)
                                        .limit(0.0)
                                        .build()
                                )
                                .trialEndBehavior(
                                    PlanCreateResponse.Data.DefaultTrialConfig.TrialEndBehavior
                                        .CONVERT_TO_PAID
                                )
                                .build()
                        )
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            PlanCreateResponse.Data.Entitlement.builder()
                                .id("id")
                                .type(PlanCreateResponse.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .metadata(
                            PlanCreateResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parentPlanId("parentPlanId")
                        .pricingType(PlanCreateResponse.Data.PricingType.FREE)
                        .productId("productId")
                        .status(PlanCreateResponse.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        assertThat(planCreateResponse.data())
            .isEqualTo(
                PlanCreateResponse.Data.builder()
                    .id("id")
                    .billingId("billingId")
                    .addCompatibleAddonId("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .defaultTrialConfig(
                        PlanCreateResponse.Data.DefaultTrialConfig.builder()
                            .duration(0.0)
                            .units(PlanCreateResponse.Data.DefaultTrialConfig.Units.DAY)
                            .budget(
                                PlanCreateResponse.Data.DefaultTrialConfig.Budget.builder()
                                    .hasSoftLimit(true)
                                    .limit(0.0)
                                    .build()
                            )
                            .trialEndBehavior(
                                PlanCreateResponse.Data.DefaultTrialConfig.TrialEndBehavior
                                    .CONVERT_TO_PAID
                            )
                            .build()
                    )
                    .description("description")
                    .displayName("displayName")
                    .addEntitlement(
                        PlanCreateResponse.Data.Entitlement.builder()
                            .id("id")
                            .type(PlanCreateResponse.Data.Entitlement.Type.FEATURE)
                            .build()
                    )
                    .isLatest(true)
                    .metadata(
                        PlanCreateResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .parentPlanId("parentPlanId")
                    .pricingType(PlanCreateResponse.Data.PricingType.FREE)
                    .productId("productId")
                    .status(PlanCreateResponse.Data.Status.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .versionNumber(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planCreateResponse =
            PlanCreateResponse.builder()
                .data(
                    PlanCreateResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .addCompatibleAddonId("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultTrialConfig(
                            PlanCreateResponse.Data.DefaultTrialConfig.builder()
                                .duration(0.0)
                                .units(PlanCreateResponse.Data.DefaultTrialConfig.Units.DAY)
                                .budget(
                                    PlanCreateResponse.Data.DefaultTrialConfig.Budget.builder()
                                        .hasSoftLimit(true)
                                        .limit(0.0)
                                        .build()
                                )
                                .trialEndBehavior(
                                    PlanCreateResponse.Data.DefaultTrialConfig.TrialEndBehavior
                                        .CONVERT_TO_PAID
                                )
                                .build()
                        )
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            PlanCreateResponse.Data.Entitlement.builder()
                                .id("id")
                                .type(PlanCreateResponse.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .metadata(
                            PlanCreateResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parentPlanId("parentPlanId")
                        .pricingType(PlanCreateResponse.Data.PricingType.FREE)
                        .productId("productId")
                        .status(PlanCreateResponse.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        val roundtrippedPlanCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planCreateResponse),
                jacksonTypeRef<PlanCreateResponse>(),
            )

        assertThat(roundtrippedPlanCreateResponse).isEqualTo(planCreateResponse)
    }
}
