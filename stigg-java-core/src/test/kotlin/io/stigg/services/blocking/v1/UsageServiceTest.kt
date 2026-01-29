// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.usage.UsageHistoryParams
import io.stigg.models.v1.usage.UsageReportParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun history() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageService = client.v1().usage()

        val response =
            usageService.history(
                UsageHistoryParams.builder()
                    .customerId("customerId")
                    .featureId("featureId")
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .groupBy("groupBy")
                    .resourceId("resourceId")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun report() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageService = client.v1().usage()

        val response =
            usageService.report(
                UsageReportParams.builder()
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

        response.validate()
    }
}
