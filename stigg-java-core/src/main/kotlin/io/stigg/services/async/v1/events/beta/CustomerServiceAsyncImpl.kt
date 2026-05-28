// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.beta

import io.stigg.core.ClientOptions
import io.stigg.services.async.v1.events.beta.customers.AssignmentServiceAsync
import io.stigg.services.async.v1.events.beta.customers.AssignmentServiceAsyncImpl
import io.stigg.services.async.v1.events.beta.customers.EntitlementServiceAsync
import io.stigg.services.async.v1.events.beta.customers.EntitlementServiceAsyncImpl
import io.stigg.services.async.v1.events.beta.customers.EntityServiceAsync
import io.stigg.services.async.v1.events.beta.customers.EntityServiceAsyncImpl
import java.util.function.Consumer

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val withRawResponse: CustomerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val entitlements: EntitlementServiceAsync by lazy {
        EntitlementServiceAsyncImpl(clientOptions)
    }

    private val entities: EntityServiceAsync by lazy { EntityServiceAsyncImpl(clientOptions) }

    private val assignments: AssignmentServiceAsync by lazy {
        AssignmentServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerServiceAsync =
        CustomerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun entitlements(): EntitlementServiceAsync = entitlements

    override fun entities(): EntityServiceAsync = entities

    override fun assignments(): AssignmentServiceAsync = assignments

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerServiceAsync.WithRawResponse {

        private val entitlements: EntitlementServiceAsync.WithRawResponse by lazy {
            EntitlementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val entities: EntityServiceAsync.WithRawResponse by lazy {
            EntityServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val assignments: AssignmentServiceAsync.WithRawResponse by lazy {
            AssignmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceAsync.WithRawResponse =
            CustomerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun entitlements(): EntitlementServiceAsync.WithRawResponse = entitlements

        override fun entities(): EntityServiceAsync.WithRawResponse = entities

        override fun assignments(): AssignmentServiceAsync.WithRawResponse = assignments
    }
}
