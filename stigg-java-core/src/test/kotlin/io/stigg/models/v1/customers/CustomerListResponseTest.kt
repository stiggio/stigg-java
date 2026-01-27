// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListResponseTest {

    @Test
    fun create() {
        val customerListResponse =
            CustomerListResponse.builder()
                .id("id")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .couponId("couponId")
                .defaultPaymentMethod(
                    CustomerListResponse.DefaultPaymentMethod.builder()
                        .billingId("billingId")
                        .cardExpiryMonth(0.0)
                        .cardExpiryYear(0.0)
                        .cardLast4Digits("cardLast4Digits")
                        .type(CustomerListResponse.DefaultPaymentMethod.Type.CARD)
                        .build()
                )
                .email("dev@stainless.com")
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
                .name("name")
                .build()

        assertThat(customerListResponse.id()).isEqualTo("id")
        assertThat(customerListResponse.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListResponse.couponId()).contains("couponId")
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
        assertThat(customerListResponse.email()).contains("dev@stainless.com")
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
        assertThat(customerListResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListResponse =
            CustomerListResponse.builder()
                .id("id")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .couponId("couponId")
                .defaultPaymentMethod(
                    CustomerListResponse.DefaultPaymentMethod.builder()
                        .billingId("billingId")
                        .cardExpiryMonth(0.0)
                        .cardExpiryYear(0.0)
                        .cardLast4Digits("cardLast4Digits")
                        .type(CustomerListResponse.DefaultPaymentMethod.Type.CARD)
                        .build()
                )
                .email("dev@stainless.com")
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
                .name("name")
                .build()

        val roundtrippedCustomerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListResponse),
                jacksonTypeRef<CustomerListResponse>(),
            )

        assertThat(roundtrippedCustomerListResponse).isEqualTo(customerListResponse)
    }
}
