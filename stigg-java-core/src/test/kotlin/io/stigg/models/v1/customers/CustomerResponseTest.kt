// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerResponseTest {

    @Test
    fun create() {
        val customerResponse =
            CustomerResponse.builder()
                .data(
                    CustomerResponse.Data.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .couponId("couponId")
                        .defaultPaymentMethod(
                            CustomerResponse.Data.DefaultPaymentMethod.builder()
                                .billingId("billingId")
                                .cardExpiryMonth(0.0)
                                .cardExpiryYear(0.0)
                                .cardLast4Digits("cardLast4Digits")
                                .type(CustomerResponse.Data.DefaultPaymentMethod.Type.CARD)
                                .build()
                        )
                        .email("dev@stainless.com")
                        .addIntegration(
                            CustomerResponse.Data.Integration.builder()
                                .id("id")
                                .syncedEntityId("syncedEntityId")
                                .vendorIdentifier(
                                    CustomerResponse.Data.Integration.VendorIdentifier.AUTH0
                                )
                                .build()
                        )
                        .metadata(
                            CustomerResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .build()

        assertThat(customerResponse.data())
            .isEqualTo(
                CustomerResponse.Data.builder()
                    .id("id")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .couponId("couponId")
                    .defaultPaymentMethod(
                        CustomerResponse.Data.DefaultPaymentMethod.builder()
                            .billingId("billingId")
                            .cardExpiryMonth(0.0)
                            .cardExpiryYear(0.0)
                            .cardLast4Digits("cardLast4Digits")
                            .type(CustomerResponse.Data.DefaultPaymentMethod.Type.CARD)
                            .build()
                    )
                    .email("dev@stainless.com")
                    .addIntegration(
                        CustomerResponse.Data.Integration.builder()
                            .id("id")
                            .syncedEntityId("syncedEntityId")
                            .vendorIdentifier(
                                CustomerResponse.Data.Integration.VendorIdentifier.AUTH0
                            )
                            .build()
                    )
                    .metadata(
                        CustomerResponse.Data.Metadata.builder()
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
        val customerResponse =
            CustomerResponse.builder()
                .data(
                    CustomerResponse.Data.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .couponId("couponId")
                        .defaultPaymentMethod(
                            CustomerResponse.Data.DefaultPaymentMethod.builder()
                                .billingId("billingId")
                                .cardExpiryMonth(0.0)
                                .cardExpiryYear(0.0)
                                .cardLast4Digits("cardLast4Digits")
                                .type(CustomerResponse.Data.DefaultPaymentMethod.Type.CARD)
                                .build()
                        )
                        .email("dev@stainless.com")
                        .addIntegration(
                            CustomerResponse.Data.Integration.builder()
                                .id("id")
                                .syncedEntityId("syncedEntityId")
                                .vendorIdentifier(
                                    CustomerResponse.Data.Integration.VendorIdentifier.AUTH0
                                )
                                .build()
                        )
                        .metadata(
                            CustomerResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedCustomerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerResponse),
                jacksonTypeRef<CustomerResponse>(),
            )

        assertThat(roundtrippedCustomerResponse).isEqualTo(customerResponse)
    }
}
