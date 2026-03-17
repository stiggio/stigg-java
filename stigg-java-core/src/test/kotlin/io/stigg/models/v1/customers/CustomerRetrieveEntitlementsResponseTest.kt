// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerRetrieveEntitlementsResponseTest {

    @Test
    fun create() {
        val customerRetrieveEntitlementsResponse =
            CustomerRetrieveEntitlementsResponse.builder()
                .data(
                    CustomerRetrieveEntitlementsResponse.Data.builder()
                        .accessDeniedReason(
                            CustomerRetrieveEntitlementsResponse.Data.AccessDeniedReason
                                .CUSTOMER_NOT_FOUND
                        )
                        .addEntitlement(
                            CustomerRetrieveEntitlementsResponse.Data.Entitlement.Feature.builder()
                                .accessDeniedReason(
                                    CustomerRetrieveEntitlementsResponse.Data.Entitlement.Feature
                                        .AccessDeniedReason
                                        .FEATURE_NOT_FOUND
                                )
                                .isGranted(true)
                                .currentUsage(0.0)
                                .entitlementUpdatedAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .feature(
                                    CustomerRetrieveEntitlementsResponse.Data.Entitlement.Feature
                                        .InnerFeature
                                        .builder()
                                        .displayName("displayName")
                                        .featureStatus(
                                            CustomerRetrieveEntitlementsResponse.Data.Entitlement
                                                .Feature
                                                .InnerFeature
                                                .FeatureStatus
                                                .NEW
                                        )
                                        .featureType(
                                            CustomerRetrieveEntitlementsResponse.Data.Entitlement
                                                .Feature
                                                .InnerFeature
                                                .FeatureType
                                                .BOOLEAN
                                        )
                                        .refId("refId")
                                        .build()
                                )
                                .hasUnlimitedUsage(true)
                                .resetPeriod(
                                    CustomerRetrieveEntitlementsResponse.Data.Entitlement.Feature
                                        .ResetPeriod
                                        .YEAR
                                )
                                .usageLimit(0.0)
                                .usagePeriodAnchor(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .validUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(customerRetrieveEntitlementsResponse.data())
            .isEqualTo(
                CustomerRetrieveEntitlementsResponse.Data.builder()
                    .accessDeniedReason(
                        CustomerRetrieveEntitlementsResponse.Data.AccessDeniedReason
                            .CUSTOMER_NOT_FOUND
                    )
                    .addEntitlement(
                        CustomerRetrieveEntitlementsResponse.Data.Entitlement.Feature.builder()
                            .accessDeniedReason(
                                CustomerRetrieveEntitlementsResponse.Data.Entitlement.Feature
                                    .AccessDeniedReason
                                    .FEATURE_NOT_FOUND
                            )
                            .isGranted(true)
                            .currentUsage(0.0)
                            .entitlementUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .feature(
                                CustomerRetrieveEntitlementsResponse.Data.Entitlement.Feature
                                    .InnerFeature
                                    .builder()
                                    .displayName("displayName")
                                    .featureStatus(
                                        CustomerRetrieveEntitlementsResponse.Data.Entitlement
                                            .Feature
                                            .InnerFeature
                                            .FeatureStatus
                                            .NEW
                                    )
                                    .featureType(
                                        CustomerRetrieveEntitlementsResponse.Data.Entitlement
                                            .Feature
                                            .InnerFeature
                                            .FeatureType
                                            .BOOLEAN
                                    )
                                    .refId("refId")
                                    .build()
                            )
                            .hasUnlimitedUsage(true)
                            .resetPeriod(
                                CustomerRetrieveEntitlementsResponse.Data.Entitlement.Feature
                                    .ResetPeriod
                                    .YEAR
                            )
                            .usageLimit(0.0)
                            .usagePeriodAnchor(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .validUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerRetrieveEntitlementsResponse =
            CustomerRetrieveEntitlementsResponse.builder()
                .data(
                    CustomerRetrieveEntitlementsResponse.Data.builder()
                        .accessDeniedReason(
                            CustomerRetrieveEntitlementsResponse.Data.AccessDeniedReason
                                .CUSTOMER_NOT_FOUND
                        )
                        .addEntitlement(
                            CustomerRetrieveEntitlementsResponse.Data.Entitlement.Feature.builder()
                                .accessDeniedReason(
                                    CustomerRetrieveEntitlementsResponse.Data.Entitlement.Feature
                                        .AccessDeniedReason
                                        .FEATURE_NOT_FOUND
                                )
                                .isGranted(true)
                                .currentUsage(0.0)
                                .entitlementUpdatedAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .feature(
                                    CustomerRetrieveEntitlementsResponse.Data.Entitlement.Feature
                                        .InnerFeature
                                        .builder()
                                        .displayName("displayName")
                                        .featureStatus(
                                            CustomerRetrieveEntitlementsResponse.Data.Entitlement
                                                .Feature
                                                .InnerFeature
                                                .FeatureStatus
                                                .NEW
                                        )
                                        .featureType(
                                            CustomerRetrieveEntitlementsResponse.Data.Entitlement
                                                .Feature
                                                .InnerFeature
                                                .FeatureType
                                                .BOOLEAN
                                        )
                                        .refId("refId")
                                        .build()
                                )
                                .hasUnlimitedUsage(true)
                                .resetPeriod(
                                    CustomerRetrieveEntitlementsResponse.Data.Entitlement.Feature
                                        .ResetPeriod
                                        .YEAR
                                )
                                .usageLimit(0.0)
                                .usagePeriodAnchor(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .validUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCustomerRetrieveEntitlementsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerRetrieveEntitlementsResponse),
                jacksonTypeRef<CustomerRetrieveEntitlementsResponse>(),
            )

        assertThat(roundtrippedCustomerRetrieveEntitlementsResponse)
            .isEqualTo(customerRetrieveEntitlementsResponse)
    }
}
