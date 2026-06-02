// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.v1beta.CustomerService
import io.stigg.services.blocking.v1beta.EntityTypeService
import java.util.function.Consumer

interface V1BetaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1BetaService

    fun customers(): CustomerService

    fun entityTypes(): EntityTypeService

    /** A view of [V1BetaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1BetaService.WithRawResponse

        fun customers(): CustomerService.WithRawResponse

        fun entityTypes(): EntityTypeService.WithRawResponse
    }
}
