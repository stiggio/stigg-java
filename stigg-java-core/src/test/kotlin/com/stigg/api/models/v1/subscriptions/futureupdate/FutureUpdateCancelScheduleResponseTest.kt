// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.subscriptions.futureupdate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FutureUpdateCancelScheduleResponseTest {

    @Test
    fun create() {
        val futureUpdateCancelScheduleResponse =
            FutureUpdateCancelScheduleResponse.builder()
                .data(FutureUpdateCancelScheduleResponse.Data.builder().id("id").build())
                .build()

        assertThat(futureUpdateCancelScheduleResponse.data())
            .isEqualTo(FutureUpdateCancelScheduleResponse.Data.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val futureUpdateCancelScheduleResponse =
            FutureUpdateCancelScheduleResponse.builder()
                .data(FutureUpdateCancelScheduleResponse.Data.builder().id("id").build())
                .build()

        val roundtrippedFutureUpdateCancelScheduleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(futureUpdateCancelScheduleResponse),
                jacksonTypeRef<FutureUpdateCancelScheduleResponse>(),
            )

        assertThat(roundtrippedFutureUpdateCancelScheduleResponse)
            .isEqualTo(futureUpdateCancelScheduleResponse)
    }
}
