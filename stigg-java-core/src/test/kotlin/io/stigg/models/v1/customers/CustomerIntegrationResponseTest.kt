// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerIntegrationResponseTest {

    @Test
    fun create() {
        val customerIntegrationResponse =
            CustomerIntegrationResponse.builder()
                .data(
                    CustomerIntegrationResponse.Data.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(CustomerIntegrationResponse.Data.VendorIdentifier.AUTH0)
                        .syncData(
                            CustomerIntegrationResponse.Data.SyncData.SyncRevisionPriceBillingData
                                .builder()
                                .billingId("billingId")
                                .billingLinkUrl("billingLinkUrl")
                                .priceGroupPackageBillingId("priceGroupPackageBillingId")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(customerIntegrationResponse.data())
            .isEqualTo(
                CustomerIntegrationResponse.Data.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(CustomerIntegrationResponse.Data.VendorIdentifier.AUTH0)
                    .syncData(
                        CustomerIntegrationResponse.Data.SyncData.SyncRevisionPriceBillingData
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
        val customerIntegrationResponse =
            CustomerIntegrationResponse.builder()
                .data(
                    CustomerIntegrationResponse.Data.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(CustomerIntegrationResponse.Data.VendorIdentifier.AUTH0)
                        .syncData(
                            CustomerIntegrationResponse.Data.SyncData.SyncRevisionPriceBillingData
                                .builder()
                                .billingId("billingId")
                                .billingLinkUrl("billingLinkUrl")
                                .priceGroupPackageBillingId("priceGroupPackageBillingId")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCustomerIntegrationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerIntegrationResponse),
                jacksonTypeRef<CustomerIntegrationResponse>(),
            )

        assertThat(roundtrippedCustomerIntegrationResponse).isEqualTo(customerIntegrationResponse)
    }
}
