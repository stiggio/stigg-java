// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v2

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClient
import com.stigg.api.models.v2.customers.CustomerRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.v2().customers()

        val customer =
            customerService.retrieve(
                CustomerRetrieveParams.builder()
                    .refId("refId")
                    .xApiKey("X-API-KEY")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        customer.validate()
    }
}
