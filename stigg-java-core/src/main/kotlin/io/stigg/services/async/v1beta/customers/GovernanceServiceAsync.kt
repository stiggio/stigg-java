// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1beta.customers

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1beta.customers.governance.GovernanceListPageAsync
import io.stigg.models.v1beta.customers.governance.GovernanceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GovernanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GovernanceServiceAsync

    /**
     * Queries the customer's governance hierarchy tree, returning a cursor-paginated list of nodes
     * with their usage configuration (limit, cadence, scope) and current usage, sortable and
     * filterable by usage. Each node carries `parentId` so the tree can be rebuilt client-side.
     * Usage is read from a periodically-refreshed read model and never gates access.
     */
    fun list(id: String): CompletableFuture<GovernanceListPageAsync> =
        list(id, GovernanceListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: GovernanceListParams = GovernanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GovernanceListPageAsync> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: GovernanceListParams = GovernanceListParams.none(),
    ): CompletableFuture<GovernanceListPageAsync> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GovernanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GovernanceListPageAsync>

    /** @see list */
    fun list(params: GovernanceListParams): CompletableFuture<GovernanceListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GovernanceListPageAsync> =
        list(id, GovernanceListParams.none(), requestOptions)

    /**
     * A view of [GovernanceServiceAsync] that provides access to raw HTTP responses for each
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
        ): GovernanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/customers/{id}/governance`, but is
         * otherwise the same as [GovernanceServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<GovernanceListPageAsync>> =
            list(id, GovernanceListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: GovernanceListParams = GovernanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GovernanceListPageAsync>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: GovernanceListParams = GovernanceListParams.none(),
        ): CompletableFuture<HttpResponseFor<GovernanceListPageAsync>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: GovernanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GovernanceListPageAsync>>

        /** @see list */
        fun list(
            params: GovernanceListParams
        ): CompletableFuture<HttpResponseFor<GovernanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GovernanceListPageAsync>> =
            list(id, GovernanceListParams.none(), requestOptions)
    }
}
