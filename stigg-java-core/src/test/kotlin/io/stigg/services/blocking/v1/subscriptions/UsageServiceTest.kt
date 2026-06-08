// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.subscriptions

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.subscriptions.usage.UsageChargeUsageParams
import io.stigg.models.v1.subscriptions.usage.UsageSyncParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun chargeUsage() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val usageService = client.v1().subscriptions().usage()

        val response =
            usageService.chargeUsage(
                UsageChargeUsageParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .untilDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sync() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val usageService = client.v1().subscriptions().usage()

        val response =
            usageService.sync(
                UsageSyncParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        response.validate()
    }
}
