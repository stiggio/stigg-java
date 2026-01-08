// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.JsonValue
import com.stigg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateEventResponseTest {

    @Test
    fun create() {
        val v1CreateEventResponse =
            V1CreateEventResponse.builder().data(JsonValue.from(mapOf<String, Any>())).build()

        assertThat(v1CreateEventResponse._data()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1CreateEventResponse =
            V1CreateEventResponse.builder().data(JsonValue.from(mapOf<String, Any>())).build()

        val roundtrippedV1CreateEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1CreateEventResponse),
                jacksonTypeRef<V1CreateEventResponse>(),
            )

        assertThat(roundtrippedV1CreateEventResponse).isEqualTo(v1CreateEventResponse)
    }
}
