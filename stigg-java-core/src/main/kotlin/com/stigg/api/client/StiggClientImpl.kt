// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.client

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.getPackageVersion
import com.stigg.api.services.blocking.V1Service
import com.stigg.api.services.blocking.V1ServiceImpl
import java.util.function.Consumer

class StiggClientImpl(private val clientOptions: ClientOptions) : StiggClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: StiggClientAsync by lazy { StiggClientAsyncImpl(clientOptions) }

    private val withRawResponse: StiggClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): StiggClientAsync = async

    override fun withRawResponse(): StiggClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StiggClient =
        StiggClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StiggClient.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StiggClient.WithRawResponse =
            StiggClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
