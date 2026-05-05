// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.internal_

import io.stigg.core.ClientOptions
import io.stigg.services.async.internal_.beta.EventQueueServiceAsync
import io.stigg.services.async.internal_.beta.EventQueueServiceAsyncImpl
import java.util.function.Consumer

class BetaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BetaServiceAsync {

    private val withRawResponse: BetaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val eventQueues: EventQueueServiceAsync by lazy {
        EventQueueServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): BetaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaServiceAsync =
        BetaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun eventQueues(): EventQueueServiceAsync = eventQueues

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BetaServiceAsync.WithRawResponse {

        private val eventQueues: EventQueueServiceAsync.WithRawResponse by lazy {
            EventQueueServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BetaServiceAsync.WithRawResponse =
            BetaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun eventQueues(): EventQueueServiceAsync.WithRawResponse = eventQueues
    }
}
