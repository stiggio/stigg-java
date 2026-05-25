// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async

import io.stigg.core.ClientOptions
import io.stigg.services.async.v1beta.CustomerServiceAsync
import io.stigg.services.async.v1beta.EntityServiceAsync
import io.stigg.services.async.v1beta.EntityTypeServiceAsync
import java.util.function.Consumer

interface V1BetaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1BetaServiceAsync

    fun customers(): CustomerServiceAsync

    fun entityTypes(): EntityTypeServiceAsync

    fun entities(): EntityServiceAsync

    /**
     * A view of [V1BetaServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1BetaServiceAsync.WithRawResponse

        fun customers(): CustomerServiceAsync.WithRawResponse

        fun entityTypes(): EntityTypeServiceAsync.WithRawResponse

        fun entities(): EntityServiceAsync.WithRawResponse
    }
}
