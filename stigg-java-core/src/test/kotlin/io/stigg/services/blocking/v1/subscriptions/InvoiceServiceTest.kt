// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.subscriptions

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InvoiceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun markAsPaid() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.v1().subscriptions().invoice()

        val response = invoiceService.markAsPaid("x")

        response.validate()
    }
}
