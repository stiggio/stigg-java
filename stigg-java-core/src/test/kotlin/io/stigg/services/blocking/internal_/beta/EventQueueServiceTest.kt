// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.internal_.beta

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.internal_.beta.eventqueues.EventQueueProvisionParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventQueueServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val eventQueueService = client.internal_().beta().eventQueues()

        val eventQueue = eventQueueService.retrieve("x")

        eventQueue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val eventQueueService = client.internal_().beta().eventQueues()

        val eventQueue =
            eventQueueService.update(
                EventQueueUpdateParams.builder()
                    .queueName("x")
                    .addAllowedAssumeRoleArn("string")
                    .createLowPriorityQueues(true)
                    .addEventType(EventQueueUpdateParams.EventType.MEMBER_INVITED)
                    .build()
            )

        eventQueue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val eventQueueService = client.internal_().beta().eventQueues()

        val eventQueues = eventQueueService.list()

        eventQueues.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val eventQueueService = client.internal_().beta().eventQueues()

        val eventQueue = eventQueueService.delete("x")

        eventQueue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun provision() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val eventQueueService = client.internal_().beta().eventQueues()

        val response =
            eventQueueService.provision(
                EventQueueProvisionParams.builder()
                    .region(EventQueueProvisionParams.Region.US_EAST_1)
                    .addAllowedAssumeRoleArn("string")
                    .createLowPriorityQueues(true)
                    .addEventType(EventQueueProvisionParams.EventType.MEMBER_INVITED)
                    .suffix("suffix")
                    .build()
            )

        response.validate()
    }
}
