// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProductServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listProducts() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val productServiceAsync = client.v1().products()

        val pageFuture = productServiceAsync.listProducts()

        val page = pageFuture.get()
        page.response().validate()
    }
}
