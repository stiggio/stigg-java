// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async

import io.stigg.core.ClientOptions
import io.stigg.services.async.v2.UsageServiceAsync
import io.stigg.services.async.v2.UsageServiceAsyncImpl
import java.util.function.Consumer

class V2ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V2ServiceAsync {

    private val withRawResponse: V2ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val usage: UsageServiceAsync by lazy { UsageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V2ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync =
        V2ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Operations related to usage & metering */
    override fun usage(): UsageServiceAsync = usage

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2ServiceAsync.WithRawResponse {

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2ServiceAsync.WithRawResponse =
            V2ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Operations related to usage & metering */
        override fun usage(): UsageServiceAsync.WithRawResponse = usage
    }
}
