// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

import io.stigg.core.ClientOptions
import java.util.function.Consumer

class PromotionalEntitlementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    PromotionalEntitlementServiceAsync {

    private val withRawResponse: PromotionalEntitlementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PromotionalEntitlementServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PromotionalEntitlementServiceAsync =
        PromotionalEntitlementServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PromotionalEntitlementServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromotionalEntitlementServiceAsync.WithRawResponse =
            PromotionalEntitlementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
