// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async

import io.stigg.core.ClientOptions
import io.stigg.services.async.internal_.BetaServiceAsync
import java.util.function.Consumer

interface InternalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InternalServiceAsync

    fun beta(): BetaServiceAsync

    /**
     * A view of [InternalServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InternalServiceAsync.WithRawResponse

        fun beta(): BetaServiceAsync.WithRawResponse
    }
}
