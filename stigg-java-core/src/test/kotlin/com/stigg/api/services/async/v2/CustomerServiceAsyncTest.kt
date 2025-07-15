// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v2

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClientAsync
import com.stigg.api.models.v2.customers.CustomerGetCustomerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getCustomer() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.v2().customers()

        val responseFuture =
            customerServiceAsync.getCustomer(
                CustomerGetCustomerParams.builder()
                    .refId("refId")
                    .xApiKey("X-API-KEY")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
