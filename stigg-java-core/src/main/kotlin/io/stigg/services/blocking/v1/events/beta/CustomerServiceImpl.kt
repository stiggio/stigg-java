// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.beta

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.v1.events.beta.customers.EntitlementService
import io.stigg.services.blocking.v1.events.beta.customers.EntitlementServiceImpl
import java.util.function.Consumer

class CustomerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerService {

    private val withRawResponse: CustomerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val entitlements: EntitlementService by lazy { EntitlementServiceImpl(clientOptions) }

    override fun withRawResponse(): CustomerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService =
        CustomerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun entitlements(): EntitlementService = entitlements

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerService.WithRawResponse {

        private val entitlements: EntitlementService.WithRawResponse by lazy {
            EntitlementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerService.WithRawResponse =
            CustomerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun entitlements(): EntitlementService.WithRawResponse = entitlements
    }
}
