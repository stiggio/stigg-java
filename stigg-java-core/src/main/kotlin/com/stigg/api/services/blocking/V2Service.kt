// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking

import com.stigg.api.core.ClientOptions
import com.stigg.api.services.blocking.v2.CustomerService
import com.stigg.api.services.blocking.v2.PermissionService
import java.util.function.Consumer

interface V2Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service

    fun customers(): CustomerService

    fun permissions(): PermissionService

    /** A view of [V2Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service.WithRawResponse

        fun customers(): CustomerService.WithRawResponse

        fun permissions(): PermissionService.WithRawResponse
    }
}
