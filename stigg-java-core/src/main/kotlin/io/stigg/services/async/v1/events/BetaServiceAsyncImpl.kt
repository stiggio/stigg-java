// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.core.ClientOptions
import io.stigg.services.async.v1.events.beta.CustomerServiceAsync
import io.stigg.services.async.v1.events.beta.CustomerServiceAsyncImpl
import java.util.function.Consumer

class BetaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BetaServiceAsync {

    private val withRawResponse: BetaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customers: CustomerServiceAsync by lazy { CustomerServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BetaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaServiceAsync =
        BetaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerServiceAsync = customers

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BetaServiceAsync.WithRawResponse {

        private val customers: CustomerServiceAsync.WithRawResponse by lazy {
            CustomerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BetaServiceAsync.WithRawResponse =
            BetaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerServiceAsync.WithRawResponse = customers
    }
}
