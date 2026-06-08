// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventReportParamsTest {

    @Test
    fun create() {
        EventReportParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .addEvent(
                EventReportParams.Event.builder()
                    .customerId("customerId")
                    .eventName("x")
                    .idempotencyKey("x")
                    .dimensions(
                        EventReportParams.Event.Dimensions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .resourceId("resourceId")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            EventReportParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addEvent(
                    EventReportParams.Event.builder()
                        .customerId("customerId")
                        .eventName("x")
                        .idempotencyKey("x")
                        .dimensions(
                            EventReportParams.Event.Dimensions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .resourceId("resourceId")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
            EventReportParams.builder()
                .addEvent(
                    EventReportParams.Event.builder()
                        .customerId("customerId")
                        .eventName("x")
                        .idempotencyKey("x")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EventReportParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addEvent(
                    EventReportParams.Event.builder()
                        .customerId("customerId")
                        .eventName("x")
                        .idempotencyKey("x")
                        .dimensions(
                            EventReportParams.Event.Dimensions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .resourceId("resourceId")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.events())
            .containsExactly(
                EventReportParams.Event.builder()
                    .customerId("customerId")
                    .eventName("x")
                    .idempotencyKey("x")
                    .dimensions(
                        EventReportParams.Event.Dimensions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .resourceId("resourceId")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventReportParams.builder()
                .addEvent(
                    EventReportParams.Event.builder()
                        .customerId("customerId")
                        .eventName("x")
                        .idempotencyKey("x")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.events())
            .containsExactly(
                EventReportParams.Event.builder()
                    .customerId("customerId")
                    .eventName("x")
                    .idempotencyKey("x")
                    .build()
            )
    }
}
