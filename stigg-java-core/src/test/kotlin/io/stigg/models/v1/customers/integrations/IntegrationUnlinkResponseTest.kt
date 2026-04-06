// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationUnlinkResponseTest {

    @Test
    fun create() {
        val integrationUnlinkResponse =
            IntegrationUnlinkResponse.builder()
                .data(
                    IntegrationUnlinkResponse.Data.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(IntegrationUnlinkResponse.Data.VendorIdentifier.AUTH0)
                        .syncData(
                            IntegrationUnlinkResponse.Data.SyncData.SyncRevisionPriceBillingData
                                .builder()
                                .billingId("billingId")
                                .billingLinkUrl("billingLinkUrl")
                                .priceGroupPackageBillingId("priceGroupPackageBillingId")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(integrationUnlinkResponse.data())
            .isEqualTo(
                IntegrationUnlinkResponse.Data.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(IntegrationUnlinkResponse.Data.VendorIdentifier.AUTH0)
                    .syncData(
                        IntegrationUnlinkResponse.Data.SyncData.SyncRevisionPriceBillingData
                            .builder()
                            .billingId("billingId")
                            .billingLinkUrl("billingLinkUrl")
                            .priceGroupPackageBillingId("priceGroupPackageBillingId")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationUnlinkResponse =
            IntegrationUnlinkResponse.builder()
                .data(
                    IntegrationUnlinkResponse.Data.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(IntegrationUnlinkResponse.Data.VendorIdentifier.AUTH0)
                        .syncData(
                            IntegrationUnlinkResponse.Data.SyncData.SyncRevisionPriceBillingData
                                .builder()
                                .billingId("billingId")
                                .billingLinkUrl("billingLinkUrl")
                                .priceGroupPackageBillingId("priceGroupPackageBillingId")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedIntegrationUnlinkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationUnlinkResponse),
                jacksonTypeRef<IntegrationUnlinkResponse>(),
            )

        assertThat(roundtrippedIntegrationUnlinkResponse).isEqualTo(integrationUnlinkResponse)
    }
}
