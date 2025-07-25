// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v2

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v2.permissions.PermissionCheckParams
import com.stigg.api.models.v2.permissions.PermissionCheckResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PermissionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PermissionServiceAsync

    /** Check multiple permissions for a user */
    fun check(params: PermissionCheckParams): CompletableFuture<PermissionCheckResponse> =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(
        params: PermissionCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionCheckResponse>

    /**
     * A view of [PermissionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PermissionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/permissions/check`, but is otherwise the
         * same as [PermissionServiceAsync.check].
         */
        fun check(
            params: PermissionCheckParams
        ): CompletableFuture<HttpResponseFor<PermissionCheckResponse>> =
            check(params, RequestOptions.none())

        /** @see check */
        fun check(
            params: PermissionCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionCheckResponse>>
    }
}
