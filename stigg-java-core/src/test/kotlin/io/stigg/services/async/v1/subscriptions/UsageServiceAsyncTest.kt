// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.subscriptions

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.subscriptions.usage.UsageChargeUsageParams
import io.stigg.models.v1.subscriptions.usage.UsageSyncParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun chargeUsage() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val usageServiceAsync = client.v1().subscriptions().usage()

        val responseFuture =
            usageServiceAsync.chargeUsage(
                UsageChargeUsageParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .untilDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sync() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val usageServiceAsync = client.v1().subscriptions().usage()

        val responseFuture =
            usageServiceAsync.sync(
                UsageSyncParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
