// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.events.EventReportParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun report() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventServiceAsync = client.v1().events()

        val responseFuture =
            eventServiceAsync.report(
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

        val response = responseFuture.get()
        response.validate()
    }
}
