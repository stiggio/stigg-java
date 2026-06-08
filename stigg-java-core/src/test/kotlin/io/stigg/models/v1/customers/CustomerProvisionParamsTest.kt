// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerProvisionParamsTest {

    @Test
    fun create() {
        CustomerProvisionParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .id("id")
            .billingCurrency(CustomerProvisionParams.BillingCurrency.USD)
            .billingId("billingId")
            .couponId(CustomerProvisionParams.CouponId.EMPTY)
            .defaultPaymentMethod(
                CustomerProvisionParams.DefaultPaymentMethod.builder()
                    .billingId("billingId")
                    .cardExpiryMonth(0.0)
                    .cardExpiryYear(0.0)
                    .cardLast4Digits("cardLast4Digits")
                    .type(CustomerProvisionParams.DefaultPaymentMethod.Type.CARD)
                    .build()
            )
            .email("dev@stainless.com")
            .addIntegration(
                CustomerProvisionParams.Integration.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(CustomerProvisionParams.Integration.VendorIdentifier.AUTH0)
                    .build()
            )
            .language("language")
            .metadata(
                CustomerProvisionParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .passthrough(
                CustomerProvisionParams.Passthrough.builder()
                    .stripe(
                        CustomerProvisionParams.Passthrough.Stripe.builder()
                            .billingAddress(
                                CustomerProvisionParams.Passthrough.Stripe.BillingAddress.builder()
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
                                CustomerProvisionParams.Passthrough.Stripe.InvoiceCustomFields
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .metadata(
                                CustomerProvisionParams.Passthrough.Stripe.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentMethodId("paymentMethodId")
                            .shippingAddress(
                                CustomerProvisionParams.Passthrough.Stripe.ShippingAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .addTaxId(
                                CustomerProvisionParams.Passthrough.Stripe.TaxId.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .zuora(
                        CustomerProvisionParams.Passthrough.Zuora.builder()
                            .billingAddress(
                                CustomerProvisionParams.Passthrough.Zuora.BillingAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .currency(CustomerProvisionParams.Passthrough.Zuora.Currency.USD)
                            .metadata(
                                CustomerProvisionParams.Passthrough.Zuora.Metadata.builder()
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
    fun headers() {
        val params =
            CustomerProvisionParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .id("id")
                .billingCurrency(CustomerProvisionParams.BillingCurrency.USD)
                .billingId("billingId")
                .couponId(CustomerProvisionParams.CouponId.EMPTY)
                .defaultPaymentMethod(
                    CustomerProvisionParams.DefaultPaymentMethod.builder()
                        .billingId("billingId")
                        .cardExpiryMonth(0.0)
                        .cardExpiryYear(0.0)
                        .cardLast4Digits("cardLast4Digits")
                        .type(CustomerProvisionParams.DefaultPaymentMethod.Type.CARD)
                        .build()
                )
                .email("dev@stainless.com")
                .addIntegration(
                    CustomerProvisionParams.Integration.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(
                            CustomerProvisionParams.Integration.VendorIdentifier.AUTH0
                        )
                        .build()
                )
                .language("language")
                .metadata(
                    CustomerProvisionParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .passthrough(
                    CustomerProvisionParams.Passthrough.builder()
                        .stripe(
                            CustomerProvisionParams.Passthrough.Stripe.builder()
                                .billingAddress(
                                    CustomerProvisionParams.Passthrough.Stripe.BillingAddress
                                        .builder()
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
                                    CustomerProvisionParams.Passthrough.Stripe.InvoiceCustomFields
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .metadata(
                                    CustomerProvisionParams.Passthrough.Stripe.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .paymentMethodId("paymentMethodId")
                                .shippingAddress(
                                    CustomerProvisionParams.Passthrough.Stripe.ShippingAddress
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
                                    CustomerProvisionParams.Passthrough.Stripe.TaxId.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .zuora(
                            CustomerProvisionParams.Passthrough.Zuora.builder()
                                .billingAddress(
                                    CustomerProvisionParams.Passthrough.Zuora.BillingAddress
                                        .builder()
                                        .city("city")
                                        .country("country")
                                        .line1("line1")
                                        .line2("line2")
                                        .postalCode("postalCode")
                                        .state("state")
                                        .build()
                                )
                                .currency(CustomerProvisionParams.Passthrough.Zuora.Currency.USD)
                                .metadata(
                                    CustomerProvisionParams.Passthrough.Zuora.Metadata.builder()
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = CustomerProvisionParams.builder().id("id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CustomerProvisionParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .id("id")
                .billingCurrency(CustomerProvisionParams.BillingCurrency.USD)
                .billingId("billingId")
                .couponId(CustomerProvisionParams.CouponId.EMPTY)
                .defaultPaymentMethod(
                    CustomerProvisionParams.DefaultPaymentMethod.builder()
                        .billingId("billingId")
                        .cardExpiryMonth(0.0)
                        .cardExpiryYear(0.0)
                        .cardLast4Digits("cardLast4Digits")
                        .type(CustomerProvisionParams.DefaultPaymentMethod.Type.CARD)
                        .build()
                )
                .email("dev@stainless.com")
                .addIntegration(
                    CustomerProvisionParams.Integration.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(
                            CustomerProvisionParams.Integration.VendorIdentifier.AUTH0
                        )
                        .build()
                )
                .language("language")
                .metadata(
                    CustomerProvisionParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .passthrough(
                    CustomerProvisionParams.Passthrough.builder()
                        .stripe(
                            CustomerProvisionParams.Passthrough.Stripe.builder()
                                .billingAddress(
                                    CustomerProvisionParams.Passthrough.Stripe.BillingAddress
                                        .builder()
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
                                    CustomerProvisionParams.Passthrough.Stripe.InvoiceCustomFields
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .metadata(
                                    CustomerProvisionParams.Passthrough.Stripe.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .paymentMethodId("paymentMethodId")
                                .shippingAddress(
                                    CustomerProvisionParams.Passthrough.Stripe.ShippingAddress
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
                                    CustomerProvisionParams.Passthrough.Stripe.TaxId.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .zuora(
                            CustomerProvisionParams.Passthrough.Zuora.builder()
                                .billingAddress(
                                    CustomerProvisionParams.Passthrough.Zuora.BillingAddress
                                        .builder()
                                        .city("city")
                                        .country("country")
                                        .line1("line1")
                                        .line2("line2")
                                        .postalCode("postalCode")
                                        .state("state")
                                        .build()
                                )
                                .currency(CustomerProvisionParams.Passthrough.Zuora.Currency.USD)
                                .metadata(
                                    CustomerProvisionParams.Passthrough.Zuora.Metadata.builder()
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

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.billingCurrency()).contains(CustomerProvisionParams.BillingCurrency.USD)
        assertThat(body.billingId()).contains("billingId")
        assertThat(body.couponId()).contains(CustomerProvisionParams.CouponId.EMPTY)
        assertThat(body.defaultPaymentMethod())
            .contains(
                CustomerProvisionParams.DefaultPaymentMethod.builder()
                    .billingId("billingId")
                    .cardExpiryMonth(0.0)
                    .cardExpiryYear(0.0)
                    .cardLast4Digits("cardLast4Digits")
                    .type(CustomerProvisionParams.DefaultPaymentMethod.Type.CARD)
                    .build()
            )
        assertThat(body.email()).contains("dev@stainless.com")
        assertThat(body.integrations().getOrNull())
            .containsExactly(
                CustomerProvisionParams.Integration.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(CustomerProvisionParams.Integration.VendorIdentifier.AUTH0)
                    .build()
            )
        assertThat(body.language()).contains("language")
        assertThat(body.metadata())
            .contains(
                CustomerProvisionParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.passthrough())
            .contains(
                CustomerProvisionParams.Passthrough.builder()
                    .stripe(
                        CustomerProvisionParams.Passthrough.Stripe.builder()
                            .billingAddress(
                                CustomerProvisionParams.Passthrough.Stripe.BillingAddress.builder()
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
                                CustomerProvisionParams.Passthrough.Stripe.InvoiceCustomFields
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .metadata(
                                CustomerProvisionParams.Passthrough.Stripe.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentMethodId("paymentMethodId")
                            .shippingAddress(
                                CustomerProvisionParams.Passthrough.Stripe.ShippingAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .addTaxId(
                                CustomerProvisionParams.Passthrough.Stripe.TaxId.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .zuora(
                        CustomerProvisionParams.Passthrough.Zuora.builder()
                            .billingAddress(
                                CustomerProvisionParams.Passthrough.Zuora.BillingAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .line2("line2")
                                    .postalCode("postalCode")
                                    .state("state")
                                    .build()
                            )
                            .currency(CustomerProvisionParams.Passthrough.Zuora.Currency.USD)
                            .metadata(
                                CustomerProvisionParams.Passthrough.Zuora.Metadata.builder()
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
        val params = CustomerProvisionParams.builder().id("id").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
    }
}
