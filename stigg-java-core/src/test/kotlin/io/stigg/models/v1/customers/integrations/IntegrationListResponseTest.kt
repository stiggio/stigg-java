// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationListResponseTest {

    @Test
    fun create() {
        val integrationListResponse =
            IntegrationListResponse.builder()
                .id("id")
                .syncedEntityId("syncedEntityId")
                .vendorIdentifier(IntegrationListResponse.VendorIdentifier.AUTH0)
                .syncData(
                    IntegrationListResponse.SyncData.SyncRevisionPriceBillingData.builder()
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .priceGroupPackageBillingId("priceGroupPackageBillingId")
                        .build()
                )
                .build()

        assertThat(integrationListResponse.id()).isEqualTo("id")
        assertThat(integrationListResponse.syncedEntityId()).contains("syncedEntityId")
        assertThat(integrationListResponse.vendorIdentifier())
            .isEqualTo(IntegrationListResponse.VendorIdentifier.AUTH0)
        assertThat(integrationListResponse.syncData())
            .contains(
                IntegrationListResponse.SyncData.ofRevisionPriceBilling(
                    IntegrationListResponse.SyncData.SyncRevisionPriceBillingData.builder()
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .priceGroupPackageBillingId("priceGroupPackageBillingId")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationListResponse =
            IntegrationListResponse.builder()
                .id("id")
                .syncedEntityId("syncedEntityId")
                .vendorIdentifier(IntegrationListResponse.VendorIdentifier.AUTH0)
                .syncData(
                    IntegrationListResponse.SyncData.SyncRevisionPriceBillingData.builder()
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .priceGroupPackageBillingId("priceGroupPackageBillingId")
                        .build()
                )
                .build()

        val roundtrippedIntegrationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationListResponse),
                jacksonTypeRef<IntegrationListResponse>(),
            )

        assertThat(roundtrippedIntegrationListResponse).isEqualTo(integrationListResponse)
    }
}
