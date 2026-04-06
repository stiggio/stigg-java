// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.internal_.beta.eventqueues

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventQueueUpdateParamsTest {

    @Test
    fun create() {
        EventQueueUpdateParams.builder()
            .queueName("x")
            .addAllowedAssumeRoleArn("string")
            .createLowPriorityQueues(true)
            .addEventType(EventQueueUpdateParams.EventType.MEMBER_INVITED)
            .build()
    }

    @Test
    fun pathParams() {
        val params = EventQueueUpdateParams.builder().queueName("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EventQueueUpdateParams.builder()
                .queueName("x")
                .addAllowedAssumeRoleArn("string")
                .createLowPriorityQueues(true)
                .addEventType(EventQueueUpdateParams.EventType.MEMBER_INVITED)
                .build()

        val body = params._body()

        assertThat(body.allowedAssumeRoleArns().getOrNull()).containsExactly("string")
        assertThat(body.createLowPriorityQueues()).contains(true)
        assertThat(body.eventTypes().getOrNull())
            .containsExactly(EventQueueUpdateParams.EventType.MEMBER_INVITED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EventQueueUpdateParams.builder().queueName("x").build()

        val body = params._body()
    }
}
