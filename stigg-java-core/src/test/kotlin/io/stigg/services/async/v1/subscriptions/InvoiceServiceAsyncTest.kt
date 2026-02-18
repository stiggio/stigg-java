// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.subscriptions

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InvoiceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun markAsPaid() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.v1().subscriptions().invoice()

        val responseFuture = invoiceServiceAsync.markAsPaid("x")

        val response = responseFuture.get()
        response.validate()
    }
}
