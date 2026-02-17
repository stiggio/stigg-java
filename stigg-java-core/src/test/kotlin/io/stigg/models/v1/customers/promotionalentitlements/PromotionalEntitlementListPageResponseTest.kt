// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.promotionalentitlements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromotionalEntitlementListPageResponseTest {

    @Test
    fun create() {
        val promotionalEntitlementListPageResponse =
            PromotionalEntitlementListPageResponse.builder()
                .addData(
                    PromotionalEntitlementListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addEnumValue("string")
                        .environmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addFeatureGroupId("string")
                        .featureId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .isVisible(true)
                        .period(PromotionalEntitlementListResponse.Period._1_WEEK)
                        .resetPeriod(PromotionalEntitlementListResponse.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PromotionalEntitlementListResponse.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    PromotionalEntitlementListResponse.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PromotionalEntitlementListResponse.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .pagination(
                    PromotionalEntitlementListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(promotionalEntitlementListPageResponse.data())
            .containsExactly(
                PromotionalEntitlementListResponse.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addEnumValue("string")
                    .environmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addFeatureGroupId("string")
                    .featureId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .hasSoftLimit(true)
                    .hasUnlimitedUsage(true)
                    .isVisible(true)
                    .period(PromotionalEntitlementListResponse.Period._1_WEEK)
                    .resetPeriod(PromotionalEntitlementListResponse.ResetPeriod.YEAR)
                    .resetPeriodConfiguration(
                        PromotionalEntitlementListResponse.ResetPeriodConfiguration
                            .YearlyResetPeriodConfig
                            .builder()
                            .accordingTo(
                                PromotionalEntitlementListResponse.ResetPeriodConfiguration
                                    .YearlyResetPeriodConfig
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(PromotionalEntitlementListResponse.Status.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .usageLimit(0.0)
                    .build()
            )
        assertThat(promotionalEntitlementListPageResponse.pagination())
            .isEqualTo(
                PromotionalEntitlementListPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promotionalEntitlementListPageResponse =
            PromotionalEntitlementListPageResponse.builder()
                .addData(
                    PromotionalEntitlementListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addEnumValue("string")
                        .environmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addFeatureGroupId("string")
                        .featureId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .isVisible(true)
                        .period(PromotionalEntitlementListResponse.Period._1_WEEK)
                        .resetPeriod(PromotionalEntitlementListResponse.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            PromotionalEntitlementListResponse.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    PromotionalEntitlementListResponse.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PromotionalEntitlementListResponse.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .pagination(
                    PromotionalEntitlementListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedPromotionalEntitlementListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promotionalEntitlementListPageResponse),
                jacksonTypeRef<PromotionalEntitlementListPageResponse>(),
            )

        assertThat(roundtrippedPromotionalEntitlementListPageResponse)
            .isEqualTo(promotionalEntitlementListPageResponse)
    }
}
