// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationLinkResponseTest {

    @Test
    fun create() {
        val integrationLinkResponse =
            IntegrationLinkResponse.builder()
                .data(
                    IntegrationLinkResponse.Data.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(IntegrationLinkResponse.Data.VendorIdentifier.AUTH0)
                        .syncData(
                            IntegrationLinkResponse.Data.SyncData.SyncRevisionPriceBillingData
                                .builder()
                                .billingId("billingId")
                                .billingLinkUrl("billingLinkUrl")
                                .priceGroupPackageBillingId("priceGroupPackageBillingId")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(integrationLinkResponse.data())
            .isEqualTo(
                IntegrationLinkResponse.Data.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(IntegrationLinkResponse.Data.VendorIdentifier.AUTH0)
                    .syncData(
                        IntegrationLinkResponse.Data.SyncData.SyncRevisionPriceBillingData.builder()
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
        val integrationLinkResponse =
            IntegrationLinkResponse.builder()
                .data(
                    IntegrationLinkResponse.Data.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(IntegrationLinkResponse.Data.VendorIdentifier.AUTH0)
                        .syncData(
                            IntegrationLinkResponse.Data.SyncData.SyncRevisionPriceBillingData
                                .builder()
                                .billingId("billingId")
                                .billingLinkUrl("billingLinkUrl")
                                .priceGroupPackageBillingId("priceGroupPackageBillingId")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedIntegrationLinkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationLinkResponse),
                jacksonTypeRef<IntegrationLinkResponse>(),
            )

        assertThat(roundtrippedIntegrationLinkResponse).isEqualTo(integrationLinkResponse)
    }
}
