// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.usage

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageReportParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            UsageReportParams.builder()
                .addUsage(
                    UsageReportParams.Usage.builder()
                        .customerId("customerId")
                        .featureId("featureId")
                        .value(-9007199254740991L)
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.usages())
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageReportParams.builder()
                .addUsage(
                    UsageReportParams.Usage.builder()
                        .customerId("customerId")
                        .featureId("featureId")
                        .value(-9007199254740991L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.usages())
            .containsExactly(
                UsageReportParams.Usage.builder()
                    .customerId("customerId")
                    .featureId("featureId")
                    .value(-9007199254740991L)
                    .build()
            )
    }
}
