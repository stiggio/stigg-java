// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async

import io.stigg.core.ClientOptions
import io.stigg.services.async.internal_.BetaServiceAsync
import io.stigg.services.async.internal_.BetaServiceAsyncImpl
import java.util.function.Consumer

class InternalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InternalServiceAsync {

    private val withRawResponse: InternalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val beta: BetaServiceAsync by lazy { BetaServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): InternalServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InternalServiceAsync =
        InternalServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun beta(): BetaServiceAsync = beta

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InternalServiceAsync.WithRawResponse {

        private val beta: BetaServiceAsync.WithRawResponse by lazy {
            BetaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InternalServiceAsync.WithRawResponse =
            InternalServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun beta(): BetaServiceAsync.WithRawResponse = beta
    }
}
