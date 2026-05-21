// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.beta

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.v1.events.beta.customers.EntitlementService
import java.util.function.Consumer

interface CustomerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService

    fun entitlements(): EntitlementService

    /** A view of [CustomerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService.WithRawResponse

        fun entitlements(): EntitlementService.WithRawResponse
    }
}
