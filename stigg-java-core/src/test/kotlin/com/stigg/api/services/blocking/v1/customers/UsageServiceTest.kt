// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1.customers

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClient
import com.stigg.api.models.v1.customers.usage.UsageRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageService = client.v1().customers().usage()

        val usage =
            usageService.retrieve(
                UsageRetrieveParams.builder()
                    .customerId("customerId")
                    .featureId("featureId")
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .groupBy("groupBy")
                    .resourceId("resourceId")
                    .build()
            )

        usage.validate()
    }
}
