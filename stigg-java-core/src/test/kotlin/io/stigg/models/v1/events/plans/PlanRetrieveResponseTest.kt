// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanRetrieveResponseTest {

    @Test
    fun create() {
        val planRetrieveResponse =
            PlanRetrieveResponse.builder()
                .data(
                    PlanRetrieveResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .addCompatibleAddonId("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultTrialConfig(
                            PlanRetrieveResponse.Data.DefaultTrialConfig.builder()
                                .duration(0.0)
                                .units(PlanRetrieveResponse.Data.DefaultTrialConfig.Units.DAY)
                                .budget(
                                    PlanRetrieveResponse.Data.DefaultTrialConfig.Budget.builder()
                                        .hasSoftLimit(true)
                                        .limit(0.0)
                                        .build()
                                )
                                .trialEndBehavior(
                                    PlanRetrieveResponse.Data.DefaultTrialConfig.TrialEndBehavior
                                        .CONVERT_TO_PAID
                                )
                                .build()
                        )
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            PlanRetrieveResponse.Data.Entitlement.builder()
                                .id("id")
                                .type(PlanRetrieveResponse.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .metadata(
                            PlanRetrieveResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parentPlanId("parentPlanId")
                        .pricingType(PlanRetrieveResponse.Data.PricingType.FREE)
                        .productId("productId")
                        .status(PlanRetrieveResponse.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        assertThat(planRetrieveResponse.data())
            .isEqualTo(
                PlanRetrieveResponse.Data.builder()
                    .id("id")
                    .billingId("billingId")
                    .addCompatibleAddonId("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .defaultTrialConfig(
                        PlanRetrieveResponse.Data.DefaultTrialConfig.builder()
                            .duration(0.0)
                            .units(PlanRetrieveResponse.Data.DefaultTrialConfig.Units.DAY)
                            .budget(
                                PlanRetrieveResponse.Data.DefaultTrialConfig.Budget.builder()
                                    .hasSoftLimit(true)
                                    .limit(0.0)
                                    .build()
                            )
                            .trialEndBehavior(
                                PlanRetrieveResponse.Data.DefaultTrialConfig.TrialEndBehavior
                                    .CONVERT_TO_PAID
                            )
                            .build()
                    )
                    .description("description")
                    .displayName("displayName")
                    .addEntitlement(
                        PlanRetrieveResponse.Data.Entitlement.builder()
                            .id("id")
                            .type(PlanRetrieveResponse.Data.Entitlement.Type.FEATURE)
                            .build()
                    )
                    .isLatest(true)
                    .metadata(
                        PlanRetrieveResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .parentPlanId("parentPlanId")
                    .pricingType(PlanRetrieveResponse.Data.PricingType.FREE)
                    .productId("productId")
                    .status(PlanRetrieveResponse.Data.Status.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .versionNumber(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planRetrieveResponse =
            PlanRetrieveResponse.builder()
                .data(
                    PlanRetrieveResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .addCompatibleAddonId("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultTrialConfig(
                            PlanRetrieveResponse.Data.DefaultTrialConfig.builder()
                                .duration(0.0)
                                .units(PlanRetrieveResponse.Data.DefaultTrialConfig.Units.DAY)
                                .budget(
                                    PlanRetrieveResponse.Data.DefaultTrialConfig.Budget.builder()
                                        .hasSoftLimit(true)
                                        .limit(0.0)
                                        .build()
                                )
                                .trialEndBehavior(
                                    PlanRetrieveResponse.Data.DefaultTrialConfig.TrialEndBehavior
                                        .CONVERT_TO_PAID
                                )
                                .build()
                        )
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            PlanRetrieveResponse.Data.Entitlement.builder()
                                .id("id")
                                .type(PlanRetrieveResponse.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .metadata(
                            PlanRetrieveResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parentPlanId("parentPlanId")
                        .pricingType(PlanRetrieveResponse.Data.PricingType.FREE)
                        .productId("productId")
                        .status(PlanRetrieveResponse.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        val roundtrippedPlanRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planRetrieveResponse),
                jacksonTypeRef<PlanRetrieveResponse>(),
            )

        assertThat(roundtrippedPlanRetrieveResponse).isEqualTo(planRetrieveResponse)
    }
}
