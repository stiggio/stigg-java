// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.customers.entitlements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementCheckResponseTest {

    @Test
    fun create() {
        val entitlementCheckResponse =
            EntitlementCheckResponse.builder()
                .data(
                    EntitlementCheckResponse.Data.Feature.builder()
                        .accessDeniedReason(
                            EntitlementCheckResponse.Data.Feature.AccessDeniedReason
                                .FEATURE_NOT_FOUND
                        )
                        .isGranted(true)
                        .addChain(
                            listOf(
                                EntitlementCheckResponse.Data.Feature.BetaChainNode.builder()
                                    .currentUsage(0.0)
                                    .entityId("entityId")
                                    .isGranted(true)
                                    .usageLimit(0.0)
                                    .build()
                            )
                        )
                        .currentUsage(0.0)
                        .entitlementUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .feature(
                            EntitlementCheckResponse.Data.Feature.InnerFeature.builder()
                                .id("id")
                                .displayName("displayName")
                                .featureStatus(
                                    EntitlementCheckResponse.Data.Feature.InnerFeature.FeatureStatus
                                        .NEW
                                )
                                .featureType(
                                    EntitlementCheckResponse.Data.Feature.InnerFeature.FeatureType
                                        .BOOLEAN
                                )
                                .build()
                        )
                        .hasUnlimitedUsage(true)
                        .resetPeriod(EntitlementCheckResponse.Data.Feature.ResetPeriod.YEAR)
                        .usageLimit(0.0)
                        .usagePeriodAnchor(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .validUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(entitlementCheckResponse.data())
            .isEqualTo(
                EntitlementCheckResponse.Data.ofFeature(
                    EntitlementCheckResponse.Data.Feature.builder()
                        .accessDeniedReason(
                            EntitlementCheckResponse.Data.Feature.AccessDeniedReason
                                .FEATURE_NOT_FOUND
                        )
                        .isGranted(true)
                        .addChain(
                            listOf(
                                EntitlementCheckResponse.Data.Feature.BetaChainNode.builder()
                                    .currentUsage(0.0)
                                    .entityId("entityId")
                                    .isGranted(true)
                                    .usageLimit(0.0)
                                    .build()
                            )
                        )
                        .currentUsage(0.0)
                        .entitlementUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .feature(
                            EntitlementCheckResponse.Data.Feature.InnerFeature.builder()
                                .id("id")
                                .displayName("displayName")
                                .featureStatus(
                                    EntitlementCheckResponse.Data.Feature.InnerFeature.FeatureStatus
                                        .NEW
                                )
                                .featureType(
                                    EntitlementCheckResponse.Data.Feature.InnerFeature.FeatureType
                                        .BOOLEAN
                                )
                                .build()
                        )
                        .hasUnlimitedUsage(true)
                        .resetPeriod(EntitlementCheckResponse.Data.Feature.ResetPeriod.YEAR)
                        .usageLimit(0.0)
                        .usagePeriodAnchor(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .validUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementCheckResponse =
            EntitlementCheckResponse.builder()
                .data(
                    EntitlementCheckResponse.Data.Feature.builder()
                        .accessDeniedReason(
                            EntitlementCheckResponse.Data.Feature.AccessDeniedReason
                                .FEATURE_NOT_FOUND
                        )
                        .isGranted(true)
                        .addChain(
                            listOf(
                                EntitlementCheckResponse.Data.Feature.BetaChainNode.builder()
                                    .currentUsage(0.0)
                                    .entityId("entityId")
                                    .isGranted(true)
                                    .usageLimit(0.0)
                                    .build()
                            )
                        )
                        .currentUsage(0.0)
                        .entitlementUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .feature(
                            EntitlementCheckResponse.Data.Feature.InnerFeature.builder()
                                .id("id")
                                .displayName("displayName")
                                .featureStatus(
                                    EntitlementCheckResponse.Data.Feature.InnerFeature.FeatureStatus
                                        .NEW
                                )
                                .featureType(
                                    EntitlementCheckResponse.Data.Feature.InnerFeature.FeatureType
                                        .BOOLEAN
                                )
                                .build()
                        )
                        .hasUnlimitedUsage(true)
                        .resetPeriod(EntitlementCheckResponse.Data.Feature.ResetPeriod.YEAR)
                        .usageLimit(0.0)
                        .usagePeriodAnchor(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .validUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedEntitlementCheckResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementCheckResponse),
                jacksonTypeRef<EntitlementCheckResponse>(),
            )

        assertThat(roundtrippedEntitlementCheckResponse).isEqualTo(entitlementCheckResponse)
    }
}
