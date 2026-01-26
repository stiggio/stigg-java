// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.JsonValue
import com.stigg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListResponseTest {

    @Test
    fun create() {
        val customerListResponse =
            CustomerListResponse.builder()
                .addData(
                    CustomerListResponse.Data.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cursorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultPaymentMethod(
                            CustomerListResponse.Data.DefaultPaymentMethod.builder()
                                .billingId("billingId")
                                .cardExpiryMonth(0.0)
                                .cardExpiryYear(0.0)
                                .cardLast4Digits("cardLast4Digits")
                                .type(CustomerListResponse.Data.DefaultPaymentMethod.Type.CARD)
                                .build()
                        )
                        .email("dev@stainless.com")
                        .addIntegration(
                            CustomerListResponse.Data.Integration.builder()
                                .id("id")
                                .syncedEntityId("syncedEntityId")
                                .vendorIdentifier(
                                    CustomerListResponse.Data.Integration.VendorIdentifier.AUTH0
                                )
                                .build()
                        )
                        .metadata(
                            CustomerListResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .build()

        assertThat(customerListResponse.data())
            .containsExactly(
                CustomerListResponse.Data.builder()
                    .id("id")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cursorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .defaultPaymentMethod(
                        CustomerListResponse.Data.DefaultPaymentMethod.builder()
                            .billingId("billingId")
                            .cardExpiryMonth(0.0)
                            .cardExpiryYear(0.0)
                            .cardLast4Digits("cardLast4Digits")
                            .type(CustomerListResponse.Data.DefaultPaymentMethod.Type.CARD)
                            .build()
                    )
                    .email("dev@stainless.com")
                    .addIntegration(
                        CustomerListResponse.Data.Integration.builder()
                            .id("id")
                            .syncedEntityId("syncedEntityId")
                            .vendorIdentifier(
                                CustomerListResponse.Data.Integration.VendorIdentifier.AUTH0
                            )
                            .build()
                    )
                    .metadata(
                        CustomerListResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListResponse =
            CustomerListResponse.builder()
                .addData(
                    CustomerListResponse.Data.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cursorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultPaymentMethod(
                            CustomerListResponse.Data.DefaultPaymentMethod.builder()
                                .billingId("billingId")
                                .cardExpiryMonth(0.0)
                                .cardExpiryYear(0.0)
                                .cardLast4Digits("cardLast4Digits")
                                .type(CustomerListResponse.Data.DefaultPaymentMethod.Type.CARD)
                                .build()
                        )
                        .email("dev@stainless.com")
                        .addIntegration(
                            CustomerListResponse.Data.Integration.builder()
                                .id("id")
                                .syncedEntityId("syncedEntityId")
                                .vendorIdentifier(
                                    CustomerListResponse.Data.Integration.VendorIdentifier.AUTH0
                                )
                                .build()
                        )
                        .metadata(
                            CustomerListResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedCustomerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListResponse),
                jacksonTypeRef<CustomerListResponse>(),
            )

        assertThat(roundtrippedCustomerListResponse).isEqualTo(customerListResponse)
    }
}
