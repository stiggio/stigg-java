// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClientAsync
import com.stigg.api.models.v1.customers.CustomerRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.v1().customers()

        val customerFuture =
            customerServiceAsync.retrieve(
                CustomerRetrieveParams.builder()
                    .refId("refId")
                    .xApiKey("X-API-KEY")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val customer = customerFuture.get()
        customer.validate()
    }
}
