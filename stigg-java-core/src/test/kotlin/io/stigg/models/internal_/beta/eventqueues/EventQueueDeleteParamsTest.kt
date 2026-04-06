// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.internal_.beta.eventqueues

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventQueueDeleteParamsTest {

    @Test
    fun create() {
        EventQueueDeleteParams.builder().queueName("x").build()
    }

    @Test
    fun pathParams() {
        val params = EventQueueDeleteParams.builder().queueName("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
