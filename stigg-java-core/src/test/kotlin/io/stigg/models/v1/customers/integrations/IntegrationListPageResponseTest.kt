// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationListPageResponseTest {

    @Test
    fun create() {
        val integrationListPageResponse =
            IntegrationListPageResponse.builder()
                .addData(
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
                )
                .pagination(
                    IntegrationListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(integrationListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(integrationListPageResponse.pagination())
            .isEqualTo(
                IntegrationListPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationListPageResponse =
            IntegrationListPageResponse.builder()
                .addData(
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
                )
                .pagination(
                    IntegrationListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedIntegrationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationListPageResponse),
                jacksonTypeRef<IntegrationListPageResponse>(),
            )

        assertThat(roundtrippedIntegrationListPageResponse).isEqualTo(integrationListPageResponse)
    }
}
