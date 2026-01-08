// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.JsonValue
import com.stigg.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListResponseTest {

    @Test
    fun create() {
        val customerListResponse =
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
                        .vendorIdentifier(CustomerListResponse.Integration.VendorIdentifier.AUTH0)
                        .build()
                )
                .metadata(
                    CustomerListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(customerListResponse.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListResponse.cursorId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customerListResponse.email()).contains("dev@stainless.com")
        assertThat(customerListResponse.externalId()).isEqualTo("externalId")
        assertThat(customerListResponse.name()).contains("name")
        assertThat(customerListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListResponse.defaultPaymentMethod())
            .contains(
                CustomerListResponse.DefaultPaymentMethod.builder()
                    .billingId("billingId")
                    .cardExpiryMonth(0.0)
                    .cardExpiryYear(0.0)
                    .cardLast4Digits("cardLast4Digits")
                    .type(CustomerListResponse.DefaultPaymentMethod.Type.CARD)
                    .build()
            )
        assertThat(customerListResponse.integrations().getOrNull())
            .containsExactly(
                CustomerListResponse.Integration.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(CustomerListResponse.Integration.VendorIdentifier.AUTH0)
                    .build()
            )
        assertThat(customerListResponse.metadata())
            .contains(
                CustomerListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListResponse =
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
                        .vendorIdentifier(CustomerListResponse.Integration.VendorIdentifier.AUTH0)
                        .build()
                )
                .metadata(
                    CustomerListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
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
