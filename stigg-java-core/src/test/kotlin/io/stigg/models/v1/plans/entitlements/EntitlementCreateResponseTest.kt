// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans.entitlements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementCreateResponseTest {

    @Test
    fun create() {
        val entitlementCreateResponse =
            EntitlementCreateResponse.builder()
                .addData(
                    EntitlementCreateResponse.Data.builder()
                        .id("id")
                        .amount(0.0)
                        .behavior(EntitlementCreateResponse.Data.Behavior.INCREMENT)
                        .cadence(EntitlementCreateResponse.Data.Cadence.MONTH)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customCurrencyId("customCurrencyId")
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .featureId("featureId")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            EntitlementCreateResponse.Data.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(EntitlementCreateResponse.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            EntitlementCreateResponse.Data.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    EntitlementCreateResponse.Data.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .type(EntitlementCreateResponse.Data.Type.FEATURE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        assertThat(entitlementCreateResponse.data())
            .containsExactly(
                EntitlementCreateResponse.Data.builder()
                    .id("id")
                    .amount(0.0)
                    .behavior(EntitlementCreateResponse.Data.Behavior.INCREMENT)
                    .cadence(EntitlementCreateResponse.Data.Cadence.MONTH)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customCurrencyId("customCurrencyId")
                    .description("description")
                    .displayNameOverride("displayNameOverride")
                    .addEnumValue("string")
                    .featureId("featureId")
                    .hasSoftLimit(true)
                    .hasUnlimitedUsage(true)
                    .addHiddenFromWidget(EntitlementCreateResponse.Data.HiddenFromWidget.PAYWALL)
                    .isCustom(true)
                    .isGranted(true)
                    .order(0.0)
                    .resetPeriod(EntitlementCreateResponse.Data.ResetPeriod.YEAR)
                    .resetPeriodConfiguration(
                        EntitlementCreateResponse.Data.ResetPeriodConfiguration
                            .YearlyResetPeriodConfig
                            .builder()
                            .accordingTo(
                                EntitlementCreateResponse.Data.ResetPeriodConfiguration
                                    .YearlyResetPeriodConfig
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .type(EntitlementCreateResponse.Data.Type.FEATURE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .usageLimit(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementCreateResponse =
            EntitlementCreateResponse.builder()
                .addData(
                    EntitlementCreateResponse.Data.builder()
                        .id("id")
                        .amount(0.0)
                        .behavior(EntitlementCreateResponse.Data.Behavior.INCREMENT)
                        .cadence(EntitlementCreateResponse.Data.Cadence.MONTH)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customCurrencyId("customCurrencyId")
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .featureId("featureId")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            EntitlementCreateResponse.Data.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(EntitlementCreateResponse.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            EntitlementCreateResponse.Data.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    EntitlementCreateResponse.Data.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .type(EntitlementCreateResponse.Data.Type.FEATURE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        val roundtrippedEntitlementCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementCreateResponse),
                jacksonTypeRef<EntitlementCreateResponse>(),
            )

        assertThat(roundtrippedEntitlementCreateResponse).isEqualTo(entitlementCreateResponse)
    }
}
