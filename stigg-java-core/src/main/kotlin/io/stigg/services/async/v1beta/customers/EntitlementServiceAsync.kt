// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1beta.customers

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1beta.customers.entitlements.EntitlementCheckParams
import io.stigg.models.v1beta.customers.entitlements.EntitlementCheckResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EntitlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementServiceAsync

    /**
     * Experimental — request and response shapes may change without notice. Same semantics as
     * `Check entitlement`, plus an optional `dimensions` query param that resolves to per-entity
     * governance limits surfaced as `chains` on the response.
     */
    fun check(id: String): CompletableFuture<EntitlementCheckResponse> =
        check(id, EntitlementCheckParams.none())

    /** @see check */
    fun check(
        id: String,
        params: EntitlementCheckParams = EntitlementCheckParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementCheckResponse> =
        check(params.toBuilder().id(id).build(), requestOptions)

    /** @see check */
    fun check(
        id: String,
        params: EntitlementCheckParams = EntitlementCheckParams.none(),
    ): CompletableFuture<EntitlementCheckResponse> = check(id, params, RequestOptions.none())

    /** @see check */
    fun check(
        params: EntitlementCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementCheckResponse>

    /** @see check */
    fun check(params: EntitlementCheckParams): CompletableFuture<EntitlementCheckResponse> =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementCheckResponse> =
        check(id, EntitlementCheckParams.none(), requestOptions)

    /**
     * A view of [EntitlementServiceAsync] that provides access to raw HTTP responses for each
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
        ): EntitlementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/customers/{id}/entitlements/check`, but
         * is otherwise the same as [EntitlementServiceAsync.check].
         */
        fun check(id: String): CompletableFuture<HttpResponseFor<EntitlementCheckResponse>> =
            check(id, EntitlementCheckParams.none())

        /** @see check */
        fun check(
            id: String,
            params: EntitlementCheckParams = EntitlementCheckParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementCheckResponse>> =
            check(params.toBuilder().id(id).build(), requestOptions)

        /** @see check */
        fun check(
            id: String,
            params: EntitlementCheckParams = EntitlementCheckParams.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementCheckResponse>> =
            check(id, params, RequestOptions.none())

        /** @see check */
        fun check(
            params: EntitlementCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementCheckResponse>>

        /** @see check */
        fun check(
            params: EntitlementCheckParams
        ): CompletableFuture<HttpResponseFor<EntitlementCheckResponse>> =
            check(params, RequestOptions.none())

        /** @see check */
        fun check(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntitlementCheckResponse>> =
            check(id, EntitlementCheckParams.none(), requestOptions)
    }
}
