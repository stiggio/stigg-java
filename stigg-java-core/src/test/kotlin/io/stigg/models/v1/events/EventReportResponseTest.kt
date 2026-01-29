// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventReportResponseTest {

    @Test
    fun create() {
        val eventReportResponse =
            EventReportResponse.builder().data(JsonValue.from(mapOf<String, Any>())).build()

        assertThat(eventReportResponse._data()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventReportResponse =
            EventReportResponse.builder().data(JsonValue.from(mapOf<String, Any>())).build()

        val roundtrippedEventReportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventReportResponse),
                jacksonTypeRef<EventReportResponse>(),
            )

        assertThat(roundtrippedEventReportResponse).isEqualTo(eventReportResponse)
    }
}
