// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1.customers

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClientAsync
import com.stigg.api.models.v1.customers.subcustomer.SubCustomerGetSubCustomerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubCustomerServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getSubCustomer() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subCustomerServiceAsync = client.v1().customers().subCustomer()

        val responseFuture =
            subCustomerServiceAsync.getSubCustomer(
                SubCustomerGetSubCustomerParams.builder()
                    .refId("refId")
                    .xApiKey("X-API-KEY")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
