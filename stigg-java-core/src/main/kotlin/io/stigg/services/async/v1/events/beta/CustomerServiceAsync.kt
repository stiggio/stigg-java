// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.beta

import io.stigg.core.ClientOptions
import io.stigg.services.async.v1.events.beta.customers.EntitlementServiceAsync
import java.util.function.Consumer

interface CustomerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerServiceAsync

    fun entitlements(): EntitlementServiceAsync

    /**
     * A view of [CustomerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceAsync.WithRawResponse

        fun entitlements(): EntitlementServiceAsync.WithRawResponse
    }
}
