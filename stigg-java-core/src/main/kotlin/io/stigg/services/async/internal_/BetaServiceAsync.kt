// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.internal_

import io.stigg.core.ClientOptions
import io.stigg.services.async.internal_.beta.EventQueueServiceAsync
import java.util.function.Consumer

interface BetaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaServiceAsync

    fun eventQueues(): EventQueueServiceAsync

    /** A view of [BetaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaServiceAsync.WithRawResponse

        fun eventQueues(): EventQueueServiceAsync.WithRawResponse
    }
}
