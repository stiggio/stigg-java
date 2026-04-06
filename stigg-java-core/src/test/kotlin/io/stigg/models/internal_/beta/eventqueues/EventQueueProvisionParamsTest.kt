// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.internal_.beta.eventqueues

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventQueueProvisionParamsTest {

    @Test
    fun create() {
        EventQueueProvisionParams.builder()
            .region(EventQueueProvisionParams.Region.US_EAST_1)
            .addAllowedAssumeRoleArn("string")
            .createLowPriorityQueues(true)
            .addEventType(EventQueueProvisionParams.EventType.MEMBER_INVITED)
            .suffix("suffix")
            .build()
    }

    @Test
    fun body() {
        val params =
            EventQueueProvisionParams.builder()
                .region(EventQueueProvisionParams.Region.US_EAST_1)
                .addAllowedAssumeRoleArn("string")
                .createLowPriorityQueues(true)
                .addEventType(EventQueueProvisionParams.EventType.MEMBER_INVITED)
                .suffix("suffix")
                .build()

        val body = params._body()

        assertThat(body.region()).isEqualTo(EventQueueProvisionParams.Region.US_EAST_1)
        assertThat(body.allowedAssumeRoleArns().getOrNull()).containsExactly("string")
        assertThat(body.createLowPriorityQueues()).contains(true)
        assertThat(body.eventTypes().getOrNull())
            .containsExactly(EventQueueProvisionParams.EventType.MEMBER_INVITED)
        assertThat(body.suffix()).contains("suffix")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventQueueProvisionParams.builder()
                .region(EventQueueProvisionParams.Region.US_EAST_1)
                .build()

        val body = params._body()

        assertThat(body.region()).isEqualTo(EventQueueProvisionParams.Region.US_EAST_1)
    }
}
