// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.internal_.beta

import io.stigg.core.ClientOptions
import java.util.function.Consumer

class EventQueueServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventQueueService {

    private val withRawResponse: EventQueueService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventQueueService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventQueueService =
        EventQueueServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventQueueService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventQueueService.WithRawResponse =
            EventQueueServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
