// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons.entitlements

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
                    EntitlementCreateResponse.Data.Feature.builder()
                        .id("id")
                        .behavior(EntitlementCreateResponse.Data.Feature.Behavior.INCREMENT)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            EntitlementCreateResponse.Data.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(EntitlementCreateResponse.Data.Feature.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            EntitlementCreateResponse.Data.Feature.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    EntitlementCreateResponse.Data.Feature.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        assertThat(entitlementCreateResponse.data())
            .containsExactly(
                EntitlementCreateResponse.Data.ofFeature(
                    EntitlementCreateResponse.Data.Feature.builder()
                        .id("id")
                        .behavior(EntitlementCreateResponse.Data.Feature.Behavior.INCREMENT)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            EntitlementCreateResponse.Data.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(EntitlementCreateResponse.Data.Feature.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            EntitlementCreateResponse.Data.Feature.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    EntitlementCreateResponse.Data.Feature.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementCreateResponse =
            EntitlementCreateResponse.builder()
                .addData(
                    EntitlementCreateResponse.Data.Feature.builder()
                        .id("id")
                        .behavior(EntitlementCreateResponse.Data.Feature.Behavior.INCREMENT)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            EntitlementCreateResponse.Data.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(EntitlementCreateResponse.Data.Feature.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            EntitlementCreateResponse.Data.Feature.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    EntitlementCreateResponse.Data.Feature.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
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
