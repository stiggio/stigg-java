// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v2

import com.google.errorprone.annotations.MustBeClosed
import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v2.permissions.PermissionCheckParams
import com.stigg.api.models.v2.permissions.PermissionCheckResponse
import java.util.function.Consumer

interface PermissionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PermissionService

    /** Check multiple permissions for a user */
    fun check(params: PermissionCheckParams): PermissionCheckResponse =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(
        params: PermissionCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionCheckResponse

    /** A view of [PermissionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PermissionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/permissions/check`, but is otherwise the
         * same as [PermissionService.check].
         */
        @MustBeClosed
        fun check(params: PermissionCheckParams): HttpResponseFor<PermissionCheckResponse> =
            check(params, RequestOptions.none())

        /** @see check */
        @MustBeClosed
        fun check(
            params: PermissionCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionCheckResponse>
    }
}
