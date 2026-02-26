// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons.entitlements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementListResponseTest {

    @Test
    fun create() {
        val entitlementListResponse =
            EntitlementListResponse.builder()
                .addData(
                    EntitlementListResponse.Data.builder()
                        .id("id")
                        .amount(0.0)
                        .behavior(EntitlementListResponse.Data.Behavior.INCREMENT)
                        .cadence(EntitlementListResponse.Data.Cadence.MONTH)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customCurrencyId("customCurrencyId")
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .featureId("featureId")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(EntitlementListResponse.Data.HiddenFromWidget.PAYWALL)
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(EntitlementListResponse.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            EntitlementListResponse.Data.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    EntitlementListResponse.Data.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .type(EntitlementListResponse.Data.Type.FEATURE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .pagination(
                    EntitlementListResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(entitlementListResponse.data())
            .containsExactly(
                EntitlementListResponse.Data.builder()
                    .id("id")
                    .amount(0.0)
                    .behavior(EntitlementListResponse.Data.Behavior.INCREMENT)
                    .cadence(EntitlementListResponse.Data.Cadence.MONTH)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customCurrencyId("customCurrencyId")
                    .description("description")
                    .displayNameOverride("displayNameOverride")
                    .addEnumValue("string")
                    .featureId("featureId")
                    .hasSoftLimit(true)
                    .hasUnlimitedUsage(true)
                    .addHiddenFromWidget(EntitlementListResponse.Data.HiddenFromWidget.PAYWALL)
                    .isCustom(true)
                    .isGranted(true)
                    .order(0.0)
                    .resetPeriod(EntitlementListResponse.Data.ResetPeriod.YEAR)
                    .resetPeriodConfiguration(
                        EntitlementListResponse.Data.ResetPeriodConfiguration
                            .YearlyResetPeriodConfig
                            .builder()
                            .accordingTo(
                                EntitlementListResponse.Data.ResetPeriodConfiguration
                                    .YearlyResetPeriodConfig
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .type(EntitlementListResponse.Data.Type.FEATURE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .usageLimit(0.0)
                    .build()
            )
        assertThat(entitlementListResponse.pagination())
            .isEqualTo(
                EntitlementListResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementListResponse =
            EntitlementListResponse.builder()
                .addData(
                    EntitlementListResponse.Data.builder()
                        .id("id")
                        .amount(0.0)
                        .behavior(EntitlementListResponse.Data.Behavior.INCREMENT)
                        .cadence(EntitlementListResponse.Data.Cadence.MONTH)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customCurrencyId("customCurrencyId")
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .featureId("featureId")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(EntitlementListResponse.Data.HiddenFromWidget.PAYWALL)
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(EntitlementListResponse.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            EntitlementListResponse.Data.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    EntitlementListResponse.Data.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .type(EntitlementListResponse.Data.Type.FEATURE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .pagination(
                    EntitlementListResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedEntitlementListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementListResponse),
                jacksonTypeRef<EntitlementListResponse>(),
            )

        assertThat(roundtrippedEntitlementListResponse).isEqualTo(entitlementListResponse)
    }
}
