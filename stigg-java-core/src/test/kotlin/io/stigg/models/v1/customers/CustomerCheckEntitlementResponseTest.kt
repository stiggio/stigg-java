// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCheckEntitlementResponseTest {

    @Test
    fun create() {
        val customerCheckEntitlementResponse =
            CustomerCheckEntitlementResponse.builder()
                .data(
                    CustomerCheckEntitlementResponse.Data.Feature.builder()
                        .accessDeniedReason(
                            CustomerCheckEntitlementResponse.Data.Feature.AccessDeniedReason
                                .FEATURE_NOT_FOUND
                        )
                        .isGranted(true)
                        .currentUsage(0.0)
                        .entitlementUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .feature(
                            CustomerCheckEntitlementResponse.Data.Feature.InnerFeature.builder()
                                .id("id")
                                .displayName("displayName")
                                .featureStatus(
                                    CustomerCheckEntitlementResponse.Data.Feature.InnerFeature
                                        .FeatureStatus
                                        .NEW
                                )
                                .featureType(
                                    CustomerCheckEntitlementResponse.Data.Feature.InnerFeature
                                        .FeatureType
                                        .BOOLEAN
                                )
                                .build()
                        )
                        .hasUnlimitedUsage(true)
                        .resetPeriod(CustomerCheckEntitlementResponse.Data.Feature.ResetPeriod.YEAR)
                        .usageLimit(0.0)
                        .usagePeriodAnchor(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .validUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(customerCheckEntitlementResponse.data())
            .isEqualTo(
                CustomerCheckEntitlementResponse.Data.ofFeature(
                    CustomerCheckEntitlementResponse.Data.Feature.builder()
                        .accessDeniedReason(
                            CustomerCheckEntitlementResponse.Data.Feature.AccessDeniedReason
                                .FEATURE_NOT_FOUND
                        )
                        .isGranted(true)
                        .currentUsage(0.0)
                        .entitlementUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .feature(
                            CustomerCheckEntitlementResponse.Data.Feature.InnerFeature.builder()
                                .id("id")
                                .displayName("displayName")
                                .featureStatus(
                                    CustomerCheckEntitlementResponse.Data.Feature.InnerFeature
                                        .FeatureStatus
                                        .NEW
                                )
                                .featureType(
                                    CustomerCheckEntitlementResponse.Data.Feature.InnerFeature
                                        .FeatureType
                                        .BOOLEAN
                                )
                                .build()
                        )
                        .hasUnlimitedUsage(true)
                        .resetPeriod(CustomerCheckEntitlementResponse.Data.Feature.ResetPeriod.YEAR)
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
        val customerCheckEntitlementResponse =
            CustomerCheckEntitlementResponse.builder()
                .data(
                    CustomerCheckEntitlementResponse.Data.Feature.builder()
                        .accessDeniedReason(
                            CustomerCheckEntitlementResponse.Data.Feature.AccessDeniedReason
                                .FEATURE_NOT_FOUND
                        )
                        .isGranted(true)
                        .currentUsage(0.0)
                        .entitlementUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .feature(
                            CustomerCheckEntitlementResponse.Data.Feature.InnerFeature.builder()
                                .id("id")
                                .displayName("displayName")
                                .featureStatus(
                                    CustomerCheckEntitlementResponse.Data.Feature.InnerFeature
                                        .FeatureStatus
                                        .NEW
                                )
                                .featureType(
                                    CustomerCheckEntitlementResponse.Data.Feature.InnerFeature
                                        .FeatureType
                                        .BOOLEAN
                                )
                                .build()
                        )
                        .hasUnlimitedUsage(true)
                        .resetPeriod(CustomerCheckEntitlementResponse.Data.Feature.ResetPeriod.YEAR)
                        .usageLimit(0.0)
                        .usagePeriodAnchor(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .validUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCustomerCheckEntitlementResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCheckEntitlementResponse),
                jacksonTypeRef<CustomerCheckEntitlementResponse>(),
            )

        assertThat(roundtrippedCustomerCheckEntitlementResponse)
            .isEqualTo(customerCheckEntitlementResponse)
    }
}
