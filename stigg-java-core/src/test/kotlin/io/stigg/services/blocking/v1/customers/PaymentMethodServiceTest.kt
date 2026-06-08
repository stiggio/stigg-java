// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.customers

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.customers.paymentmethod.PaymentMethodAttachParams
import io.stigg.models.v1.customers.paymentmethod.PaymentMethodDetachParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PaymentMethodServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun attach() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val paymentMethodService = client.v1().customers().paymentMethod()

        val customerResponse =
            paymentMethodService.attach(
                PaymentMethodAttachParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .integrationId("integrationId")
                    .paymentMethodId("paymentMethodId")
                    .vendorIdentifier(PaymentMethodAttachParams.VendorIdentifier.AUTH0)
                    .billingCurrency(PaymentMethodAttachParams.BillingCurrency.USD)
                    .build()
            )

        customerResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun detach() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val paymentMethodService = client.v1().customers().paymentMethod()

        val customerResponse =
            paymentMethodService.detach(
                PaymentMethodDetachParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        customerResponse.validate()
    }
}
