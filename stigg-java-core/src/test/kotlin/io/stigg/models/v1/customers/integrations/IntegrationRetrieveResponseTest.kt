// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationRetrieveResponseTest {

    @Test
    fun create() {
        val integrationRetrieveResponse =
            IntegrationRetrieveResponse.builder()
                .data(
                    IntegrationRetrieveResponse.Data.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(IntegrationRetrieveResponse.Data.VendorIdentifier.AUTH0)
                        .syncData(
                            IntegrationRetrieveResponse.Data.SyncData.SyncRevisionPriceBillingData
                                .builder()
                                .billingId("billingId")
                                .billingLinkUrl("billingLinkUrl")
                                .priceGroupPackageBillingId("priceGroupPackageBillingId")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(integrationRetrieveResponse.data())
            .isEqualTo(
                IntegrationRetrieveResponse.Data.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(IntegrationRetrieveResponse.Data.VendorIdentifier.AUTH0)
                    .syncData(
                        IntegrationRetrieveResponse.Data.SyncData.SyncRevisionPriceBillingData
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
        val integrationRetrieveResponse =
            IntegrationRetrieveResponse.builder()
                .data(
                    IntegrationRetrieveResponse.Data.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(IntegrationRetrieveResponse.Data.VendorIdentifier.AUTH0)
                        .syncData(
                            IntegrationRetrieveResponse.Data.SyncData.SyncRevisionPriceBillingData
                                .builder()
                                .billingId("billingId")
                                .billingLinkUrl("billingLinkUrl")
                                .priceGroupPackageBillingId("priceGroupPackageBillingId")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedIntegrationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationRetrieveResponse),
                jacksonTypeRef<IntegrationRetrieveResponse>(),
            )

        assertThat(roundtrippedIntegrationRetrieveResponse).isEqualTo(integrationRetrieveResponse)
    }
}
