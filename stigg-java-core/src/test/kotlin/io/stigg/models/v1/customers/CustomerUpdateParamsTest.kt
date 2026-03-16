// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUpdateParamsTest {

    @Test
    fun create() {
        CustomerUpdateParams.builder()
            .id("x")
            .billingCurrency(CustomerUpdateParams.BillingCurrency.USD)
            .billingId("billingId")
            .couponId("couponId")
            .email("dev@stainless.com")
            .addIntegration(
                CustomerUpdateParams.Integration.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(CustomerUpdateParams.Integration.VendorIdentifier.AUTH0)
                    .build()
            )
            .language("language")
            .metadata(
                CustomerUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .passthrough(
                CustomerUpdateParams.Passthrough.builder()
                    .stripe(
                        CustomerUpdateParams.Passthrough.Stripe.builder()
                            .billingAddress(
                                CustomerUpdateParams.Passthrough.Stripe.BillingAddress.builder()
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
                                CustomerUpdateParams.Passthrough.Stripe.InvoiceCustomFields
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .metadata(
                                CustomerUpdateParams.Passthrough.Stripe.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentMethodId("paymentMethodId")
                            .shippingAddress(
                                CustomerUpdateParams.Passthrough.Stripe.ShippingAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .addTaxId(
                                CustomerUpdateParams.Passthrough.Stripe.TaxId.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .zuora(
                        CustomerUpdateParams.Passthrough.Zuora.builder()
                            .billingAddress(
                                CustomerUpdateParams.Passthrough.Zuora.BillingAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .currency(CustomerUpdateParams.Passthrough.Zuora.Currency.USD)
                            .metadata(
                                CustomerUpdateParams.Passthrough.Zuora.Metadata.builder()
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
    }

    @Test
    fun pathParams() {
        val params = CustomerUpdateParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerUpdateParams.builder()
                .id("x")
                .billingCurrency(CustomerUpdateParams.BillingCurrency.USD)
                .billingId("billingId")
                .couponId("couponId")
                .email("dev@stainless.com")
                .addIntegration(
                    CustomerUpdateParams.Integration.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(CustomerUpdateParams.Integration.VendorIdentifier.AUTH0)
                        .build()
                )
                .language("language")
                .metadata(
                    CustomerUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .passthrough(
                    CustomerUpdateParams.Passthrough.builder()
                        .stripe(
                            CustomerUpdateParams.Passthrough.Stripe.builder()
                                .billingAddress(
                                    CustomerUpdateParams.Passthrough.Stripe.BillingAddress.builder()
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
                                    CustomerUpdateParams.Passthrough.Stripe.InvoiceCustomFields
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .metadata(
                                    CustomerUpdateParams.Passthrough.Stripe.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .paymentMethodId("paymentMethodId")
                                .shippingAddress(
                                    CustomerUpdateParams.Passthrough.Stripe.ShippingAddress
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
                                    CustomerUpdateParams.Passthrough.Stripe.TaxId.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .zuora(
                            CustomerUpdateParams.Passthrough.Zuora.builder()
                                .billingAddress(
                                    CustomerUpdateParams.Passthrough.Zuora.BillingAddress.builder()
                                        .city("city")
                                        .country("country")
                                        .line1("line1")
                                        .line2("line2")
                                        .postalCode("postalCode")
                                        .state("state")
                                        .build()
                                )
                                .currency(CustomerUpdateParams.Passthrough.Zuora.Currency.USD)
                                .metadata(
                                    CustomerUpdateParams.Passthrough.Zuora.Metadata.builder()
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

        val body = params._body()

        assertThat(body.billingCurrency()).contains(CustomerUpdateParams.BillingCurrency.USD)
        assertThat(body.billingId()).contains("billingId")
        assertThat(body.couponId()).contains("couponId")
        assertThat(body.email()).contains("dev@stainless.com")
        assertThat(body.integrations().getOrNull())
            .containsExactly(
                CustomerUpdateParams.Integration.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(CustomerUpdateParams.Integration.VendorIdentifier.AUTH0)
                    .build()
            )
        assertThat(body.language()).contains("language")
        assertThat(body.metadata())
            .contains(
                CustomerUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.passthrough())
            .contains(
                CustomerUpdateParams.Passthrough.builder()
                    .stripe(
                        CustomerUpdateParams.Passthrough.Stripe.builder()
                            .billingAddress(
                                CustomerUpdateParams.Passthrough.Stripe.BillingAddress.builder()
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
                                CustomerUpdateParams.Passthrough.Stripe.InvoiceCustomFields
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .metadata(
                                CustomerUpdateParams.Passthrough.Stripe.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentMethodId("paymentMethodId")
                            .shippingAddress(
                                CustomerUpdateParams.Passthrough.Stripe.ShippingAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .addTaxId(
                                CustomerUpdateParams.Passthrough.Stripe.TaxId.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .zuora(
                        CustomerUpdateParams.Passthrough.Zuora.builder()
                            .billingAddress(
                                CustomerUpdateParams.Passthrough.Zuora.BillingAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .currency(CustomerUpdateParams.Passthrough.Zuora.Currency.USD)
                            .metadata(
                                CustomerUpdateParams.Passthrough.Zuora.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentMethodId("paymentMethodId")
                            .build()
                    )
                    .build()
            )
        assertThat(body.timezone()).contains("timezone")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerUpdateParams.builder().id("x").build()

        val body = params._body()
    }
}
