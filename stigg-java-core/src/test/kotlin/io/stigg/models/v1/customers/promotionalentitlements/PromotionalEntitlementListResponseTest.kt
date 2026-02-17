// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.promotionalentitlements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromotionalEntitlementListResponseTest {

    @Test
    fun create() {
        val promotionalEntitlementListResponse =
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

        assertThat(promotionalEntitlementListResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promotionalEntitlementListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(promotionalEntitlementListResponse.description()).contains("description")
        assertThat(promotionalEntitlementListResponse.endDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(promotionalEntitlementListResponse.enumValues().getOrNull())
            .containsExactly("string")
        assertThat(promotionalEntitlementListResponse.environmentId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promotionalEntitlementListResponse.featureGroupIds().getOrNull())
            .containsExactly("string")
        assertThat(promotionalEntitlementListResponse.featureId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promotionalEntitlementListResponse.hasSoftLimit()).contains(true)
        assertThat(promotionalEntitlementListResponse.hasUnlimitedUsage()).contains(true)
        assertThat(promotionalEntitlementListResponse.isVisible()).isEqualTo(true)
        assertThat(promotionalEntitlementListResponse.period())
            .isEqualTo(PromotionalEntitlementListResponse.Period._1_WEEK)
        assertThat(promotionalEntitlementListResponse.resetPeriod())
            .contains(PromotionalEntitlementListResponse.ResetPeriod.YEAR)
        assertThat(promotionalEntitlementListResponse.resetPeriodConfiguration())
            .contains(
                PromotionalEntitlementListResponse.ResetPeriodConfiguration
                    .ofYearlyResetPeriodConfig(
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
            )
        assertThat(promotionalEntitlementListResponse.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(promotionalEntitlementListResponse.status())
            .isEqualTo(PromotionalEntitlementListResponse.Status.ACTIVE)
        assertThat(promotionalEntitlementListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(promotionalEntitlementListResponse.usageLimit()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promotionalEntitlementListResponse =
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

        val roundtrippedPromotionalEntitlementListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promotionalEntitlementListResponse),
                jacksonTypeRef<PromotionalEntitlementListResponse>(),
            )

        assertThat(roundtrippedPromotionalEntitlementListResponse)
            .isEqualTo(promotionalEntitlementListResponse)
    }
}
