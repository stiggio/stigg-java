// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.internal_.beta

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.internal_.beta.eventqueues.EventQueueProvisionParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventQueueServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventQueueServiceAsync = client.internal_().beta().eventQueues()

        val eventQueueFuture = eventQueueServiceAsync.retrieve("x")

        val eventQueue = eventQueueFuture.get()
        eventQueue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventQueueServiceAsync = client.internal_().beta().eventQueues()

        val eventQueueFuture =
            eventQueueServiceAsync.update(
                EventQueueUpdateParams.builder()
                    .queueName("x")
                    .addAllowedAssumeRoleArn("string")
                    .createLowPriorityQueues(true)
                    .addEventType(EventQueueUpdateParams.EventType.MEMBER_INVITED)
                    .build()
            )

        val eventQueue = eventQueueFuture.get()
        eventQueue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventQueueServiceAsync = client.internal_().beta().eventQueues()

        val eventQueuesFuture = eventQueueServiceAsync.list()

        val eventQueues = eventQueuesFuture.get()
        eventQueues.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventQueueServiceAsync = client.internal_().beta().eventQueues()

        val eventQueueFuture = eventQueueServiceAsync.delete("x")

        val eventQueue = eventQueueFuture.get()
        eventQueue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun provision() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventQueueServiceAsync = client.internal_().beta().eventQueues()

        val responseFuture =
            eventQueueServiceAsync.provision(
                EventQueueProvisionParams.builder()
                    .region(EventQueueProvisionParams.Region.US_EAST_1)
                    .addAllowedAssumeRoleArn("string")
                    .createLowPriorityQueues(true)
                    .addEventType(EventQueueProvisionParams.EventType.MEMBER_INVITED)
                    .suffix("suffix")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
