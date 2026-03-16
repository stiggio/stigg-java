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
                .billingCurrency(CustomerListResponse.BillingCurrency.USD)
                .billingId("billingId")
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
                .language("language")
                .metadata(
                    CustomerListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .passthrough(
                    CustomerListResponse.Passthrough.builder()
                        .stripe(
                            CustomerListResponse.Passthrough.Stripe.builder()
                                .billingAddress(
                                    CustomerListResponse.Passthrough.Stripe.BillingAddress.builder()
                                        .city("city")
                                        .country("country")
                                        .line1("line1")
                                        .line2("line2")
                                        .postalCode("postalCode")
                                        .state("state")
                                        .build()
                                )
                                .customerName("customerName")
                                .invoiceCustomFields(
                                    CustomerListResponse.Passthrough.Stripe.InvoiceCustomFields
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .metadata(
                                    CustomerListResponse.Passthrough.Stripe.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .paymentMethodId("paymentMethodId")
                                .shippingAddress(
                                    CustomerListResponse.Passthrough.Stripe.ShippingAddress
                                        .builder()
                                        .city("city")
                                        .country("country")
                                        .line1("line1")
                                        .line2("line2")
                                        .postalCode("postalCode")
                                        .state("state")
                                        .build()
                                )
                                .addTaxId(
                                    CustomerListResponse.Passthrough.Stripe.TaxId.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .zuora(
                            CustomerListResponse.Passthrough.Zuora.builder()
                                .billingAddress(
                                    CustomerListResponse.Passthrough.Zuora.BillingAddress.builder()
                                        .city("city")
                                        .country("country")
                                        .line1("line1")
                                        .line2("line2")
                                        .postalCode("postalCode")
                                        .state("state")
                                        .build()
                                )
                                .currency(CustomerListResponse.Passthrough.Zuora.Currency.USD)
                                .metadata(
                                    CustomerListResponse.Passthrough.Zuora.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .paymentMethodId("paymentMethodId")
                                .build()
                        )
                        .build()
                )
                .timezone("timezone")
                .build()

        assertThat(customerListResponse.id()).isEqualTo("id")
        assertThat(customerListResponse.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListResponse.billingCurrency())
            .contains(CustomerListResponse.BillingCurrency.USD)
        assertThat(customerListResponse.billingId()).contains("billingId")
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
        assertThat(customerListResponse.language()).contains("language")
        assertThat(customerListResponse.metadata())
            .contains(
                CustomerListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customerListResponse.name()).contains("name")
        assertThat(customerListResponse.passthrough())
            .contains(
                CustomerListResponse.Passthrough.builder()
                    .stripe(
                        CustomerListResponse.Passthrough.Stripe.builder()
                            .billingAddress(
                                CustomerListResponse.Passthrough.Stripe.BillingAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .customerName("customerName")
                            .invoiceCustomFields(
                                CustomerListResponse.Passthrough.Stripe.InvoiceCustomFields
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .metadata(
                                CustomerListResponse.Passthrough.Stripe.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentMethodId("paymentMethodId")
                            .shippingAddress(
                                CustomerListResponse.Passthrough.Stripe.ShippingAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .addTaxId(
                                CustomerListResponse.Passthrough.Stripe.TaxId.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .zuora(
                        CustomerListResponse.Passthrough.Zuora.builder()
                            .billingAddress(
                                CustomerListResponse.Passthrough.Zuora.BillingAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .currency(CustomerListResponse.Passthrough.Zuora.Currency.USD)
                            .metadata(
                                CustomerListResponse.Passthrough.Zuora.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentMethodId("paymentMethodId")
                            .build()
                    )
                    .build()
            )
        assertThat(customerListResponse.timezone()).contains("timezone")
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
                .billingCurrency(CustomerListResponse.BillingCurrency.USD)
                .billingId("billingId")
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
                .language("language")
                .metadata(
                    CustomerListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .passthrough(
                    CustomerListResponse.Passthrough.builder()
                        .stripe(
                            CustomerListResponse.Passthrough.Stripe.builder()
                                .billingAddress(
                                    CustomerListResponse.Passthrough.Stripe.BillingAddress.builder()
                                        .city("city")
                                        .country("country")
                                        .line1("line1")
                                        .line2("line2")
                                        .postalCode("postalCode")
                                        .state("state")
                                        .build()
                                )
                                .customerName("customerName")
                                .invoiceCustomFields(
                                    CustomerListResponse.Passthrough.Stripe.InvoiceCustomFields
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .metadata(
                                    CustomerListResponse.Passthrough.Stripe.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .paymentMethodId("paymentMethodId")
                                .shippingAddress(
                                    CustomerListResponse.Passthrough.Stripe.ShippingAddress
                                        .builder()
                                        .city("city")
                                        .country("country")
                                        .line1("line1")
                                        .line2("line2")
                                        .postalCode("postalCode")
                                        .state("state")
                                        .build()
                                )
                                .addTaxId(
                                    CustomerListResponse.Passthrough.Stripe.TaxId.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .zuora(
                            CustomerListResponse.Passthrough.Zuora.builder()
                                .billingAddress(
                                    CustomerListResponse.Passthrough.Zuora.BillingAddress.builder()
                                        .city("city")
                                        .country("country")
                                        .line1("line1")
                                        .line2("line2")
                                        .postalCode("postalCode")
                                        .state("state")
                                        .build()
                                )
                                .currency(CustomerListResponse.Passthrough.Zuora.Currency.USD)
                                .metadata(
                                    CustomerListResponse.Passthrough.Zuora.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .paymentMethodId("paymentMethodId")
                                .build()
                        )
                        .build()
                )
                .timezone("timezone")
                .build()

        val roundtrippedCustomerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListResponse),
                jacksonTypeRef<CustomerListResponse>(),
            )

        assertThat(roundtrippedCustomerListResponse).isEqualTo(customerListResponse)
    }
}
