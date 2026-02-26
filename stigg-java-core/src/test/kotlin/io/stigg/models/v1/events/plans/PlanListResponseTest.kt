// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListResponseTest {

    @Test
    fun create() {
        val planListResponse =
            PlanListResponse.builder()
                .id("id")
                .billingId("billingId")
                .addCompatibleAddonId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultTrialConfig(
                    PlanListResponse.DefaultTrialConfig.builder()
                        .duration(0.0)
                        .units(PlanListResponse.DefaultTrialConfig.Units.DAY)
                        .budget(
                            PlanListResponse.DefaultTrialConfig.Budget.builder()
                                .hasSoftLimit(true)
                                .limit(0.0)
                                .build()
                        )
                        .trialEndBehavior(
                            PlanListResponse.DefaultTrialConfig.TrialEndBehavior.CONVERT_TO_PAID
                        )
                        .build()
                )
                .description("description")
                .displayName("displayName")
                .addEntitlement(
                    PlanListResponse.Entitlement.builder()
                        .id("id")
                        .type(PlanListResponse.Entitlement.Type.FEATURE)
                        .build()
                )
                .isLatest(true)
                .metadata(
                    PlanListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .parentPlanId("parentPlanId")
                .pricingType(PlanListResponse.PricingType.FREE)
                .productId("productId")
                .status(PlanListResponse.Status.DRAFT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .versionNumber(0L)
                .build()

        assertThat(planListResponse.id()).isEqualTo("id")
        assertThat(planListResponse.billingId()).contains("billingId")
        assertThat(planListResponse.compatibleAddonIds().getOrNull()).containsExactly("string")
        assertThat(planListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planListResponse.defaultTrialConfig())
            .contains(
                PlanListResponse.DefaultTrialConfig.builder()
                    .duration(0.0)
                    .units(PlanListResponse.DefaultTrialConfig.Units.DAY)
                    .budget(
                        PlanListResponse.DefaultTrialConfig.Budget.builder()
                            .hasSoftLimit(true)
                            .limit(0.0)
                            .build()
                    )
                    .trialEndBehavior(
                        PlanListResponse.DefaultTrialConfig.TrialEndBehavior.CONVERT_TO_PAID
                    )
                    .build()
            )
        assertThat(planListResponse.description()).contains("description")
        assertThat(planListResponse.displayName()).isEqualTo("displayName")
        assertThat(planListResponse.entitlements())
            .containsExactly(
                PlanListResponse.Entitlement.builder()
                    .id("id")
                    .type(PlanListResponse.Entitlement.Type.FEATURE)
                    .build()
            )
        assertThat(planListResponse.isLatest()).contains(true)
        assertThat(planListResponse.metadata())
            .isEqualTo(
                PlanListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(planListResponse.parentPlanId()).contains("parentPlanId")
        assertThat(planListResponse.pricingType()).contains(PlanListResponse.PricingType.FREE)
        assertThat(planListResponse.productId()).isEqualTo("productId")
        assertThat(planListResponse.status()).isEqualTo(PlanListResponse.Status.DRAFT)
        assertThat(planListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planListResponse.versionNumber()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListResponse =
            PlanListResponse.builder()
                .id("id")
                .billingId("billingId")
                .addCompatibleAddonId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultTrialConfig(
                    PlanListResponse.DefaultTrialConfig.builder()
                        .duration(0.0)
                        .units(PlanListResponse.DefaultTrialConfig.Units.DAY)
                        .budget(
                            PlanListResponse.DefaultTrialConfig.Budget.builder()
                                .hasSoftLimit(true)
                                .limit(0.0)
                                .build()
                        )
                        .trialEndBehavior(
                            PlanListResponse.DefaultTrialConfig.TrialEndBehavior.CONVERT_TO_PAID
                        )
                        .build()
                )
                .description("description")
                .displayName("displayName")
                .addEntitlement(
                    PlanListResponse.Entitlement.builder()
                        .id("id")
                        .type(PlanListResponse.Entitlement.Type.FEATURE)
                        .build()
                )
                .isLatest(true)
                .metadata(
                    PlanListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .parentPlanId("parentPlanId")
                .pricingType(PlanListResponse.PricingType.FREE)
                .productId("productId")
                .status(PlanListResponse.Status.DRAFT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .versionNumber(0L)
                .build()

        val roundtrippedPlanListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListResponse),
                jacksonTypeRef<PlanListResponse>(),
            )

        assertThat(roundtrippedPlanListResponse).isEqualTo(planListResponse)
    }
}
