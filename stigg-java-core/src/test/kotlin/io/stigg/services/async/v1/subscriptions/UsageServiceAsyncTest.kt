// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.subscriptions

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.subscriptions.usage.UsageChargeUsageParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun chargeUsage() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageServiceAsync = client.v1().subscriptions().usage()

        val responseFuture =
            usageServiceAsync.chargeUsage(
                UsageChargeUsageParams.builder()
                    .id("x")
                    .untilDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sync() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageServiceAsync = client.v1().subscriptions().usage()

        val responseFuture = usageServiceAsync.sync("x")

        val response = responseFuture.get()
        response.validate()
    }
}
