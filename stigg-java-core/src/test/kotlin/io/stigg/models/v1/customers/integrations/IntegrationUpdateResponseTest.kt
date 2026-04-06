// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationUpdateResponseTest {

    @Test
    fun create() {
        val integrationUpdateResponse =
            IntegrationUpdateResponse.builder()
                .data(
                    IntegrationUpdateResponse.Data.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(IntegrationUpdateResponse.Data.VendorIdentifier.AUTH0)
                        .syncData(
                            IntegrationUpdateResponse.Data.SyncData.SyncRevisionPriceBillingData
                                .builder()
                                .billingId("billingId")
                                .billingLinkUrl("billingLinkUrl")
                                .priceGroupPackageBillingId("priceGroupPackageBillingId")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(integrationUpdateResponse.data())
            .isEqualTo(
                IntegrationUpdateResponse.Data.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(IntegrationUpdateResponse.Data.VendorIdentifier.AUTH0)
                    .syncData(
                        IntegrationUpdateResponse.Data.SyncData.SyncRevisionPriceBillingData
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
        val integrationUpdateResponse =
            IntegrationUpdateResponse.builder()
                .data(
                    IntegrationUpdateResponse.Data.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(IntegrationUpdateResponse.Data.VendorIdentifier.AUTH0)
                        .syncData(
                            IntegrationUpdateResponse.Data.SyncData.SyncRevisionPriceBillingData
                                .builder()
                                .billingId("billingId")
                                .billingLinkUrl("billingLinkUrl")
                                .priceGroupPackageBillingId("priceGroupPackageBillingId")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedIntegrationUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationUpdateResponse),
                jacksonTypeRef<IntegrationUpdateResponse>(),
            )

        assertThat(roundtrippedIntegrationUpdateResponse).isEqualTo(integrationUpdateResponse)
    }
}
