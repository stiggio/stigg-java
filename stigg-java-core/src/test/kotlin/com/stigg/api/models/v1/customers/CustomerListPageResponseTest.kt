// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.JsonValue
import com.stigg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListPageResponseTest {

    @Test
    fun create() {
        val customerListPageResponse =
            CustomerListPageResponse.builder()
                .addData(
                    CustomerListResponse.builder()
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cursorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .email("dev@stainless.com")
                        .externalId("externalId")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultPaymentMethod(
                            CustomerListResponse.DefaultPaymentMethod.builder()
                                .billingId("billingId")
                                .cardExpiryMonth(0.0)
                                .cardExpiryYear(0.0)
                                .cardLast4Digits("cardLast4Digits")
                                .type(CustomerListResponse.DefaultPaymentMethod.Type.CARD)
                                .build()
                        )
                        .addIntegration(
                            CustomerListResponse.Integration.builder()
                                .id("id")
                                .syncedEntityId("syncedEntityId")
                                .vendorIdentifier(
                                    CustomerListResponse.Integration.VendorIdentifier.AUTH0
                                )
                                .build()
                        )
                        .metadata(
                            CustomerListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(customerListPageResponse.data())
            .containsExactly(
                CustomerListResponse.builder()
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cursorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .email("dev@stainless.com")
                    .externalId("externalId")
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .defaultPaymentMethod(
                        CustomerListResponse.DefaultPaymentMethod.builder()
                            .billingId("billingId")
                            .cardExpiryMonth(0.0)
                            .cardExpiryYear(0.0)
                            .cardLast4Digits("cardLast4Digits")
                            .type(CustomerListResponse.DefaultPaymentMethod.Type.CARD)
                            .build()
                    )
                    .addIntegration(
                        CustomerListResponse.Integration.builder()
                            .id("id")
                            .syncedEntityId("syncedEntityId")
                            .vendorIdentifier(
                                CustomerListResponse.Integration.VendorIdentifier.AUTH0
                            )
                            .build()
                    )
                    .metadata(
                        CustomerListResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListPageResponse =
            CustomerListPageResponse.builder()
                .addData(
                    CustomerListResponse.builder()
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cursorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .email("dev@stainless.com")
                        .externalId("externalId")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultPaymentMethod(
                            CustomerListResponse.DefaultPaymentMethod.builder()
                                .billingId("billingId")
                                .cardExpiryMonth(0.0)
                                .cardExpiryYear(0.0)
                                .cardLast4Digits("cardLast4Digits")
                                .type(CustomerListResponse.DefaultPaymentMethod.Type.CARD)
                                .build()
                        )
                        .addIntegration(
                            CustomerListResponse.Integration.builder()
                                .id("id")
                                .syncedEntityId("syncedEntityId")
                                .vendorIdentifier(
                                    CustomerListResponse.Integration.VendorIdentifier.AUTH0
                                )
                                .build()
                        )
                        .metadata(
                            CustomerListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCustomerListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListPageResponse),
                jacksonTypeRef<CustomerListPageResponse>(),
            )

        assertThat(roundtrippedCustomerListPageResponse).isEqualTo(customerListPageResponse)
    }
}
