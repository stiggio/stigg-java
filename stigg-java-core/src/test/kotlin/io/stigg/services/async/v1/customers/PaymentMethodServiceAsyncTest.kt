// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.customers.paymentmethod.PaymentMethodAttachParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentMethodServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun attach() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentMethodServiceAsync = client.v1().customers().paymentMethod()

        val customerResponseFuture =
            paymentMethodServiceAsync.attach(
                PaymentMethodAttachParams.builder()
                    .id("x")
                    .integrationId("integrationId")
                    .paymentMethodId("paymentMethodId")
                    .vendorIdentifier(PaymentMethodAttachParams.VendorIdentifier.AUTH0)
                    .billingCurrency(PaymentMethodAttachParams.BillingCurrency.USD)
                    .build()
            )

        val customerResponse = customerResponseFuture.get()
        customerResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun detach() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentMethodServiceAsync = client.v1().customers().paymentMethod()

        val customerResponseFuture = paymentMethodServiceAsync.detach("x")

        val customerResponse = customerResponseFuture.get()
        customerResponse.validate()
    }
}
