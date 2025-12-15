// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1.customers

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClient
import com.stigg.api.models.v1.customers.paymentmethod.PaymentMethodAttachParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentMethodServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun attach() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentMethodService = client.v1().customers().paymentMethod()

        val customerResponse =
            paymentMethodService.attach(
                PaymentMethodAttachParams.builder()
                    .id("x")
                    .integrationId("integrationId")
                    .paymentMethodId("paymentMethodId")
                    .vendorIdentifier(PaymentMethodAttachParams.VendorIdentifier.AUTH0)
                    .billingCurrency(PaymentMethodAttachParams.BillingCurrency.USD)
                    .build()
            )

        customerResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun detach() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentMethodService = client.v1().customers().paymentMethod()

        val customerResponse = paymentMethodService.detach("x")

        customerResponse.validate()
    }
}
