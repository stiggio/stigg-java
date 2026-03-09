// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons.entitlements

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
                    AddonPackageEntitlement.Data.Feature.builder()
                        .id("id")
                        .behavior(AddonPackageEntitlement.Data.Feature.Behavior.INCREMENT)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            AddonPackageEntitlement.Data.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(AddonPackageEntitlement.Data.Feature.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            AddonPackageEntitlement.Data.Feature.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    AddonPackageEntitlement.Data.Feature.ResetPeriodConfiguration
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

        assertThat(addonPackageEntitlement.data())
            .isEqualTo(
                AddonPackageEntitlement.Data.ofFeature(
                    AddonPackageEntitlement.Data.Feature.builder()
                        .id("id")
                        .behavior(AddonPackageEntitlement.Data.Feature.Behavior.INCREMENT)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            AddonPackageEntitlement.Data.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(AddonPackageEntitlement.Data.Feature.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            AddonPackageEntitlement.Data.Feature.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    AddonPackageEntitlement.Data.Feature.ResetPeriodConfiguration
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
        val addonPackageEntitlement =
            AddonPackageEntitlement.builder()
                .data(
                    AddonPackageEntitlement.Data.Feature.builder()
                        .id("id")
                        .behavior(AddonPackageEntitlement.Data.Feature.Behavior.INCREMENT)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayNameOverride("displayNameOverride")
                        .addEnumValue("string")
                        .hasSoftLimit(true)
                        .hasUnlimitedUsage(true)
                        .addHiddenFromWidget(
                            AddonPackageEntitlement.Data.Feature.HiddenFromWidget.PAYWALL
                        )
                        .isCustom(true)
                        .isGranted(true)
                        .order(0.0)
                        .resetPeriod(AddonPackageEntitlement.Data.Feature.ResetPeriod.YEAR)
                        .resetPeriodConfiguration(
                            AddonPackageEntitlement.Data.Feature.ResetPeriodConfiguration
                                .YearlyResetPeriodConfig
                                .builder()
                                .accordingTo(
                                    AddonPackageEntitlement.Data.Feature.ResetPeriodConfiguration
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

        val roundtrippedAddonPackageEntitlement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonPackageEntitlement),
                jacksonTypeRef<AddonPackageEntitlement>(),
            )

        assertThat(roundtrippedAddonPackageEntitlement).isEqualTo(addonPackageEntitlement)
    }
}
