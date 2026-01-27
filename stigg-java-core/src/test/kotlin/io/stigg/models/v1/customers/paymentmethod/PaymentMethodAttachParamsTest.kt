// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.paymentmethod

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentMethodAttachParamsTest {

    @Test
    fun create() {
        PaymentMethodAttachParams.builder()
            .id("x")
            .integrationId("integrationId")
            .paymentMethodId("paymentMethodId")
            .vendorIdentifier(PaymentMethodAttachParams.VendorIdentifier.AUTH0)
            .billingCurrency(PaymentMethodAttachParams.BillingCurrency.USD)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PaymentMethodAttachParams.builder()
                .id("x")
                .integrationId("integrationId")
                .paymentMethodId("paymentMethodId")
                .vendorIdentifier(PaymentMethodAttachParams.VendorIdentifier.AUTH0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PaymentMethodAttachParams.builder()
                .id("x")
                .integrationId("integrationId")
                .paymentMethodId("paymentMethodId")
                .vendorIdentifier(PaymentMethodAttachParams.VendorIdentifier.AUTH0)
                .billingCurrency(PaymentMethodAttachParams.BillingCurrency.USD)
                .build()

        val body = params._body()

        assertThat(body.integrationId()).isEqualTo("integrationId")
        assertThat(body.paymentMethodId()).isEqualTo("paymentMethodId")
        assertThat(body.vendorIdentifier())
            .isEqualTo(PaymentMethodAttachParams.VendorIdentifier.AUTH0)
        assertThat(body.billingCurrency()).contains(PaymentMethodAttachParams.BillingCurrency.USD)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentMethodAttachParams.builder()
                .id("x")
                .integrationId("integrationId")
                .paymentMethodId("paymentMethodId")
                .vendorIdentifier(PaymentMethodAttachParams.VendorIdentifier.AUTH0)
                .build()

        val body = params._body()

        assertThat(body.integrationId()).isEqualTo("integrationId")
        assertThat(body.paymentMethodId()).isEqualTo("paymentMethodId")
        assertThat(body.vendorIdentifier())
            .isEqualTo(PaymentMethodAttachParams.VendorIdentifier.AUTH0)
    }
}
