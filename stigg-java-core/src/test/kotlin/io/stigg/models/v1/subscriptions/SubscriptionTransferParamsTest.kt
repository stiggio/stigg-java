// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionTransferParamsTest {

    @Test
    fun create() {
        SubscriptionTransferParams.builder()
            .id("x")
            .destinationResourceId("destinationResourceId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionTransferParams.builder()
                .id("x")
                .destinationResourceId("destinationResourceId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionTransferParams.builder()
                .id("x")
                .destinationResourceId("destinationResourceId")
                .build()

        val body = params._body()

        assertThat(body.destinationResourceId()).isEqualTo("destinationResourceId")
    }
}
