// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.v1beta.CustomerService
import io.stigg.services.blocking.v1beta.CustomerServiceImpl
import io.stigg.services.blocking.v1beta.EntityService
import io.stigg.services.blocking.v1beta.EntityServiceImpl
import io.stigg.services.blocking.v1beta.EntityTypeService
import io.stigg.services.blocking.v1beta.EntityTypeServiceImpl
import java.util.function.Consumer

class V1BetaServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    V1BetaService {

    private val withRawResponse: V1BetaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customers: CustomerService by lazy { CustomerServiceImpl(clientOptions) }

    private val entityTypes: EntityTypeService by lazy { EntityTypeServiceImpl(clientOptions) }

    private val entities: EntityService by lazy { EntityServiceImpl(clientOptions) }

    override fun withRawResponse(): V1BetaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1BetaService =
        V1BetaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerService = customers

    override fun entityTypes(): EntityTypeService = entityTypes

    override fun entities(): EntityService = entities

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1BetaService.WithRawResponse {

        private val customers: CustomerService.WithRawResponse by lazy {
            CustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val entityTypes: EntityTypeService.WithRawResponse by lazy {
            EntityTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val entities: EntityService.WithRawResponse by lazy {
            EntityServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1BetaService.WithRawResponse =
            V1BetaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerService.WithRawResponse = customers

        override fun entityTypes(): EntityTypeService.WithRawResponse = entityTypes

        override fun entities(): EntityService.WithRawResponse = entities
    }
}
