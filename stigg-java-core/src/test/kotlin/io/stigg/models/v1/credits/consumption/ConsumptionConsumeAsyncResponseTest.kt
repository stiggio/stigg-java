// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.consumption

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConsumptionConsumeAsyncResponseTest {

    @Test
    fun create() {
        val consumptionConsumeAsyncResponse =
            ConsumptionConsumeAsyncResponse.builder()
                .data(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(consumptionConsumeAsyncResponse._data())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val consumptionConsumeAsyncResponse =
            ConsumptionConsumeAsyncResponse.builder()
                .data(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedConsumptionConsumeAsyncResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(consumptionConsumeAsyncResponse),
                jacksonTypeRef<ConsumptionConsumeAsyncResponse>(),
            )

        assertThat(roundtrippedConsumptionConsumeAsyncResponse)
            .isEqualTo(consumptionConsumeAsyncResponse)
    }
}
