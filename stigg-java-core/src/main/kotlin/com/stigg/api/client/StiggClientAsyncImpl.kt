// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.client

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.getPackageVersion
import com.stigg.api.services.async.V1ServiceAsync
import com.stigg.api.services.async.V1ServiceAsyncImpl
import com.stigg.api.services.async.V2ServiceAsync
import com.stigg.api.services.async.V2ServiceAsyncImpl
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

    private val v2: V2ServiceAsync by lazy { V2ServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): StiggClient = sync

    override fun withRawResponse(): StiggClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StiggClientAsync =
        StiggClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1ServiceAsync = v1

    override fun v2(): V2ServiceAsync = v2

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StiggClientAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val v2: V2ServiceAsync.WithRawResponse by lazy {
            V2ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StiggClientAsync.WithRawResponse =
            StiggClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1ServiceAsync.WithRawResponse = v1

        override fun v2(): V2ServiceAsync.WithRawResponse = v2
    }
}
