// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.subscriptions

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InvoiceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun markAsPaid() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invoiceServiceAsync = client.v1().subscriptions().invoice()

        val responseFuture = invoiceServiceAsync.markAsPaid("x")

        val response = responseFuture.get()
        response.validate()
    }
}
