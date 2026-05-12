// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.internal_.beta

import io.stigg.core.ClientOptions
import java.util.function.Consumer

class EventQueueServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventQueueServiceAsync {

    private val withRawResponse: EventQueueServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventQueueServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventQueueServiceAsync =
        EventQueueServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventQueueServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventQueueServiceAsync.WithRawResponse =
            EventQueueServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
