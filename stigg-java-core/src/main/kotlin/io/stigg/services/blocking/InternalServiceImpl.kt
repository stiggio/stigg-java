// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.internal_.BetaService
import io.stigg.services.blocking.internal_.BetaServiceImpl
import java.util.function.Consumer

class InternalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InternalService {

    private val withRawResponse: InternalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val beta: BetaService by lazy { BetaServiceImpl(clientOptions) }

    override fun withRawResponse(): InternalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InternalService =
        InternalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun beta(): BetaService = beta

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InternalService.WithRawResponse {

        private val beta: BetaService.WithRawResponse by lazy {
            BetaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InternalService.WithRawResponse =
            InternalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun beta(): BetaService.WithRawResponse = beta
    }
}
