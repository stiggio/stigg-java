// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.customers

import io.stigg.core.ClientOptions
import java.util.function.Consumer

class PromotionalEntitlementServiceImpl
internal constructor(private val clientOptions: ClientOptions) : PromotionalEntitlementService {

    private val withRawResponse: PromotionalEntitlementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PromotionalEntitlementService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PromotionalEntitlementService =
        PromotionalEntitlementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PromotionalEntitlementService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromotionalEntitlementService.WithRawResponse =
            PromotionalEntitlementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
