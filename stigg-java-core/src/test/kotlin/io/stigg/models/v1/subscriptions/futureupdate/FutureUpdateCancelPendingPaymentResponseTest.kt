// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions.futureupdate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FutureUpdateCancelPendingPaymentResponseTest {

    @Test
    fun create() {
        val futureUpdateCancelPendingPaymentResponse =
            FutureUpdateCancelPendingPaymentResponse.builder()
                .data(FutureUpdateCancelPendingPaymentResponse.Data.builder().id("id").build())
                .build()

        assertThat(futureUpdateCancelPendingPaymentResponse.data())
            .isEqualTo(FutureUpdateCancelPendingPaymentResponse.Data.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val futureUpdateCancelPendingPaymentResponse =
            FutureUpdateCancelPendingPaymentResponse.builder()
                .data(FutureUpdateCancelPendingPaymentResponse.Data.builder().id("id").build())
                .build()

        val roundtrippedFutureUpdateCancelPendingPaymentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(futureUpdateCancelPendingPaymentResponse),
                jacksonTypeRef<FutureUpdateCancelPendingPaymentResponse>(),
            )

        assertThat(roundtrippedFutureUpdateCancelPendingPaymentResponse)
            .isEqualTo(futureUpdateCancelPendingPaymentResponse)
    }
}
