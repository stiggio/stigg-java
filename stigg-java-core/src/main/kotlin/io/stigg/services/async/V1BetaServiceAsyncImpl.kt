// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async

import io.stigg.core.ClientOptions
import io.stigg.services.async.v1beta.CustomerServiceAsync
import io.stigg.services.async.v1beta.CustomerServiceAsyncImpl
import io.stigg.services.async.v1beta.EntityTypeServiceAsync
import io.stigg.services.async.v1beta.EntityTypeServiceAsyncImpl
import java.util.function.Consumer

class V1BetaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1BetaServiceAsync {

    private val withRawResponse: V1BetaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customers: CustomerServiceAsync by lazy { CustomerServiceAsyncImpl(clientOptions) }

    private val entityTypes: EntityTypeServiceAsync by lazy {
        EntityTypeServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): V1BetaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1BetaServiceAsync =
        V1BetaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerServiceAsync = customers

    override fun entityTypes(): EntityTypeServiceAsync = entityTypes

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1BetaServiceAsync.WithRawResponse {

        private val customers: CustomerServiceAsync.WithRawResponse by lazy {
            CustomerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val entityTypes: EntityTypeServiceAsync.WithRawResponse by lazy {
            EntityTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1BetaServiceAsync.WithRawResponse =
            V1BetaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerServiceAsync.WithRawResponse = customers

        override fun entityTypes(): EntityTypeServiceAsync.WithRawResponse = entityTypes
    }
}
