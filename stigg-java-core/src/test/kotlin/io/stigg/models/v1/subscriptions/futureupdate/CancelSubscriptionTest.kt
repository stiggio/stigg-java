// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions.futureupdate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CancelSubscriptionTest {

    @Test
    fun create() {
        val cancelSubscription =
            CancelSubscription.builder()
                .data(CancelSubscription.Data.builder().id("id").build())
                .build()

        assertThat(cancelSubscription.data())
            .isEqualTo(CancelSubscription.Data.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cancelSubscription =
            CancelSubscription.builder()
                .data(CancelSubscription.Data.builder().id("id").build())
                .build()

        val roundtrippedCancelSubscription =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cancelSubscription),
                jacksonTypeRef<CancelSubscription>(),
            )

        assertThat(roundtrippedCancelSubscription).isEqualTo(cancelSubscription)
    }
}
