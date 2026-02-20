// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.events.EventReportParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun report() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val eventService = client.v1().events()

        val response =
            eventService.report(
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
            )

        response.validate()
    }
}
