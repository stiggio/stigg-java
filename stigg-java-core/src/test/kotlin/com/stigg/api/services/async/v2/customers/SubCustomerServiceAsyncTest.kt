// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v2.customers

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClientAsync
import com.stigg.api.models.v2.customers.subcustomer.SubCustomerRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubCustomerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subCustomerServiceAsync = client.v2().customers().subCustomer()

        val subCustomerFuture =
            subCustomerServiceAsync.retrieve(
                SubCustomerRetrieveParams.builder()
                    .refId("refId")
                    .xApiKey("X-API-KEY")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val subCustomer = subCustomerFuture.get()
        subCustomer.validate()
    }
}
