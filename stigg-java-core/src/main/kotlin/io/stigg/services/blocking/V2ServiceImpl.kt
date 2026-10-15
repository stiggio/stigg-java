// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.v2.UsageService
import io.stigg.services.blocking.v2.UsageServiceImpl
import java.util.function.Consumer

class V2ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V2Service {

    private val withRawResponse: V2Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptions) }

    override fun withRawResponse(): V2Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service =
        V2ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Operations related to usage & metering */
    override fun usage(): UsageService = usage

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2Service.WithRawResponse {

        private val usage: UsageService.WithRawResponse by lazy {
            UsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2Service.WithRawResponse =
            V2ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Operations related to usage & metering */
        override fun usage(): UsageService.WithRawResponse = usage
    }
}
