// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.usage.UsageHistoryParams
import io.stigg.models.v1.usage.UsageReportParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun history() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val usageServiceAsync = client.v1().usage()

        val responseFuture =
            usageServiceAsync.history(
                UsageHistoryParams.builder()
                    .customerId("customerId")
                    .featureId("featureId")
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .groupBy("groupBy")
                    .resourceId("resourceId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun report() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val usageServiceAsync = client.v1().usage()

        val responseFuture =
            usageServiceAsync.report(
                UsageReportParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .addUsage(
                        UsageReportParams.Usage.builder()
                            .customerId("customerId")
                            .featureId("featureId")
                            .value(-9007199254740991L)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .dimensions(
                                UsageReportParams.Usage.Dimensions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .resourceId("resourceId")
                            .updateBehavior(UsageReportParams.Usage.UpdateBehavior.DELTA)
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
