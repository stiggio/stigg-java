// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons.entitlements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonPackageEntitlementTest {

    @Test
    fun create() {
        val addonPackageEntitlement =
            AddonPackageEntitlement.builder()
                .data(
                    AddonPackageEntitlement.Data.builder()
                        .id("id")
                        .amount(0.0)
                        .behavior(AddonPackageEntitlement.Data.Behavior.INCREMENT)
                        .cadence(AddonPackageEntitlement.Data.Cadence.MONTH)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customCurrencyId("customCurrencyId")
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .featureId("featureId")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(AddonPackageEntitlement.Data.HiddenFromWidget.PAYWALL)
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(AddonPackageEntitlement.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            AddonPackageEntitlement.Data.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    AddonPackageEntitlement.Data.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .type(AddonPackageEntitlement.Data.Type.FEATURE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        assertThat(addonPackageEntitlement.data())
            .isEqualTo(
                AddonPackageEntitlement.Data.builder()
                    .id("id")
                    .amount(0.0)
                    .behavior(AddonPackageEntitlement.Data.Behavior.INCREMENT)
                    .cadence(AddonPackageEntitlement.Data.Cadence.MONTH)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customCurrencyId("customCurrencyId")
                    .description("description")
                    .displayNameOverride("displayNameOverride")
                    .addEnumValue("string")
                    .featureId("featureId")
                    .hasSoftLimit(true)
                    .hasUnlimitedUsage(true)
                    .addHiddenFromWidget(AddonPackageEntitlement.Data.HiddenFromWidget.PAYWALL)
                    .isCustom(true)
                    .isGranted(true)
                    .order(0.0)
                    .resetPeriod(AddonPackageEntitlement.Data.ResetPeriod.YEAR)
                    .resetPeriodConfiguration(
                        AddonPackageEntitlement.Data.ResetPeriodConfiguration
                            .YearlyResetPeriodConfig
                            .builder()
                            .accordingTo(
                                AddonPackageEntitlement.Data.ResetPeriodConfiguration
                                    .YearlyResetPeriodConfig
                                    .AccordingTo
                                    .SUBSCRIPTION_START
                            )
                            .build()
                    )
                    .type(AddonPackageEntitlement.Data.Type.FEATURE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .usageLimit(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonPackageEntitlement =
            AddonPackageEntitlement.builder()
                .data(
                    AddonPackageEntitlement.Data.builder()
                        .id("id")
                        .amount(0.0)
                        .behavior(AddonPackageEntitlement.Data.Behavior.INCREMENT)
                        .cadence(AddonPackageEntitlement.Data.Cadence.MONTH)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customCurrencyId("customCurrencyId")
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .featureId("featureId")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(AddonPackageEntitlement.Data.HiddenFromWidget.PAYWALL)
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(AddonPackageEntitlement.Data.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            AddonPackageEntitlement.Data.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    AddonPackageEntitlement.Data.ResetPeriodConfiguration
                                        .YearlyResetPeriodConfig
                                        .AccordingTo
                                        .SUBSCRIPTION_START
                                )
                                .build()
                        )
                        .type(AddonPackageEntitlement.Data.Type.FEATURE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .build()
                )
                .build()

        val roundtrippedAddonPackageEntitlement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonPackageEntitlement),
                jacksonTypeRef<AddonPackageEntitlement>(),
            )

        assertThat(roundtrippedAddonPackageEntitlement).isEqualTo(addonPackageEntitlement)
    }
}
