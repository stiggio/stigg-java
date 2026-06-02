// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.v1.events.beta.CustomerService
import io.stigg.services.blocking.v1.events.beta.CustomerServiceImpl
import io.stigg.services.blocking.v1.events.beta.EntityTypeService
import io.stigg.services.blocking.v1.events.beta.EntityTypeServiceImpl
import java.util.function.Consumer

class BetaServiceImpl internal constructor(private val clientOptions: ClientOptions) : BetaService {

    private val withRawResponse: BetaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customers: CustomerService by lazy { CustomerServiceImpl(clientOptions) }

    private val entityTypes: EntityTypeService by lazy { EntityTypeServiceImpl(clientOptions) }

    override fun withRawResponse(): BetaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaService =
        BetaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerService = customers

    override fun entityTypes(): EntityTypeService = entityTypes

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BetaService.WithRawResponse {

        private val customers: CustomerService.WithRawResponse by lazy {
            CustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val entityTypes: EntityTypeService.WithRawResponse by lazy {
            EntityTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BetaService.WithRawResponse =
            BetaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerService.WithRawResponse = customers

        override fun entityTypes(): EntityTypeService.WithRawResponse = entityTypes
    }
}
