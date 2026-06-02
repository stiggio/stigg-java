// File generated from our OpenAPI spec by Stainless.

package io.stigg.client

import io.stigg.core.ClientOptions
import io.stigg.core.getPackageVersion
import io.stigg.services.async.V1BetaServiceAsync
import io.stigg.services.async.V1BetaServiceAsyncImpl
import io.stigg.services.async.V1ServiceAsync
import io.stigg.services.async.V1ServiceAsyncImpl
import java.util.function.Consumer

class StiggClientAsyncImpl(private val clientOptions: ClientOptions) : StiggClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: StiggClient by lazy { StiggClientImpl(clientOptions) }

    private val withRawResponse: StiggClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val v1Beta: V1BetaServiceAsync by lazy {
        V1BetaServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): StiggClient = sync

    override fun withRawResponse(): StiggClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StiggClientAsync =
        StiggClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1ServiceAsync = v1

    override fun v1Beta(): V1BetaServiceAsync = v1Beta

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StiggClientAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val v1Beta: V1BetaServiceAsync.WithRawResponse by lazy {
            V1BetaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StiggClientAsync.WithRawResponse =
            StiggClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1ServiceAsync.WithRawResponse = v1

        override fun v1Beta(): V1BetaServiceAsync.WithRawResponse = v1Beta
    }
}
