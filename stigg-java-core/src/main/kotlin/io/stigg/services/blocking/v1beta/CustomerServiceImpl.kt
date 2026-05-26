// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1beta

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.v1beta.customers.AssignmentService
import io.stigg.services.blocking.v1beta.customers.AssignmentServiceImpl
import io.stigg.services.blocking.v1beta.customers.EntitlementService
import io.stigg.services.blocking.v1beta.customers.EntitlementServiceImpl
import io.stigg.services.blocking.v1beta.customers.EntityService
import io.stigg.services.blocking.v1beta.customers.EntityServiceImpl
import java.util.function.Consumer

class CustomerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerService {

    private val withRawResponse: CustomerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val entitlements: EntitlementService by lazy { EntitlementServiceImpl(clientOptions) }

    private val entities: EntityService by lazy { EntityServiceImpl(clientOptions) }

    private val assignments: AssignmentService by lazy { AssignmentServiceImpl(clientOptions) }

    override fun withRawResponse(): CustomerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService =
        CustomerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun entitlements(): EntitlementService = entitlements

    override fun entities(): EntityService = entities

    override fun assignments(): AssignmentService = assignments

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerService.WithRawResponse {

        private val entitlements: EntitlementService.WithRawResponse by lazy {
            EntitlementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val entities: EntityService.WithRawResponse by lazy {
            EntityServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val assignments: AssignmentService.WithRawResponse by lazy {
            AssignmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerService.WithRawResponse =
            CustomerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun entitlements(): EntitlementService.WithRawResponse = entitlements

        override fun entities(): EntityService.WithRawResponse = entities

        override fun assignments(): AssignmentService.WithRawResponse = assignments
    }
}
