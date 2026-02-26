// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListPageResponseTest {

    @Test
    fun create() {
        val planListPageResponse =
            PlanListPageResponse.builder()
                .addData(
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
                                    PlanListResponse.DefaultTrialConfig.TrialEndBehavior
                                        .CONVERT_TO_PAID
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
                )
                .pagination(
                    PlanListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(planListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(planListPageResponse.pagination())
            .isEqualTo(
                PlanListPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListPageResponse =
            PlanListPageResponse.builder()
                .addData(
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
                                    PlanListResponse.DefaultTrialConfig.TrialEndBehavior
                                        .CONVERT_TO_PAID
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
                )
                .pagination(
                    PlanListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedPlanListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListPageResponse),
                jacksonTypeRef<PlanListPageResponse>(),
            )

        assertThat(roundtrippedPlanListPageResponse).isEqualTo(planListPageResponse)
    }
}
