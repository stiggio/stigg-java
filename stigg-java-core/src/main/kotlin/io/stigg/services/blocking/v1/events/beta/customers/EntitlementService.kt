// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.beta.customers

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.beta.customers.entitlements.EntitlementCheckParams
import io.stigg.models.v1.events.beta.customers.entitlements.EntitlementCheckResponse
import java.util.function.Consumer

interface EntitlementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementService

    /**
     * Experimental — request and response shapes may change without notice. Same semantics as
     * `Check entitlement`, plus an optional `dimensions` query param that resolves to per-entity
     * governance limits surfaced as `chains` on the response.
     */
    fun check(id: String): EntitlementCheckResponse = check(id, EntitlementCheckParams.none())

    /** @see check */
    fun check(
        id: String,
        params: EntitlementCheckParams = EntitlementCheckParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementCheckResponse = check(params.toBuilder().id(id).build(), requestOptions)

    /** @see check */
    fun check(
        id: String,
        params: EntitlementCheckParams = EntitlementCheckParams.none(),
    ): EntitlementCheckResponse = check(id, params, RequestOptions.none())

    /** @see check */
    fun check(
        params: EntitlementCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementCheckResponse

    /** @see check */
    fun check(params: EntitlementCheckParams): EntitlementCheckResponse =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(id: String, requestOptions: RequestOptions): EntitlementCheckResponse =
        check(id, EntitlementCheckParams.none(), requestOptions)

    /**
     * A view of [EntitlementService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntitlementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/customers/{id}/entitlements/check`, but
         * is otherwise the same as [EntitlementService.check].
         */
        @MustBeClosed
        fun check(id: String): HttpResponseFor<EntitlementCheckResponse> =
            check(id, EntitlementCheckParams.none())

        /** @see check */
        @MustBeClosed
        fun check(
            id: String,
            params: EntitlementCheckParams = EntitlementCheckParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementCheckResponse> =
            check(params.toBuilder().id(id).build(), requestOptions)

        /** @see check */
        @MustBeClosed
        fun check(
            id: String,
            params: EntitlementCheckParams = EntitlementCheckParams.none(),
        ): HttpResponseFor<EntitlementCheckResponse> = check(id, params, RequestOptions.none())

        /** @see check */
        @MustBeClosed
        fun check(
            params: EntitlementCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementCheckResponse>

        /** @see check */
        @MustBeClosed
        fun check(params: EntitlementCheckParams): HttpResponseFor<EntitlementCheckResponse> =
            check(params, RequestOptions.none())

        /** @see check */
        @MustBeClosed
        fun check(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementCheckResponse> =
            check(id, EntitlementCheckParams.none(), requestOptions)
    }
}
