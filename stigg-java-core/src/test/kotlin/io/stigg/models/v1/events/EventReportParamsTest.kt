// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events

import io.stigg.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventReportParamsTest {

    @Test
    fun create() {
        EventReportParams.builder()
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
    fun body() {
        val params =
            EventReportParams.builder()
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
