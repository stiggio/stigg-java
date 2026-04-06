// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.internal_

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.internal_.beta.EventQueueService
import io.stigg.services.blocking.internal_.beta.EventQueueServiceImpl
import java.util.function.Consumer

class BetaServiceImpl internal constructor(private val clientOptions: ClientOptions) : BetaService {

    private val withRawResponse: BetaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val eventQueues: EventQueueService by lazy { EventQueueServiceImpl(clientOptions) }

    override fun withRawResponse(): BetaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaService =
        BetaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun eventQueues(): EventQueueService = eventQueues

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BetaService.WithRawResponse {

        private val eventQueues: EventQueueService.WithRawResponse by lazy {
            EventQueueServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BetaService.WithRawResponse =
            BetaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun eventQueues(): EventQueueService.WithRawResponse = eventQueues
    }
}
