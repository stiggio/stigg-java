// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.beta

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.beta.customers.CustomerRetrieveGovernanceParams
import io.stigg.models.v1.events.beta.customers.CustomerRetrieveGovernanceResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CustomerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerServiceAsync

    /**
     * Queries the customer's governance hierarchy tree, returning a cursor-paginated list of nodes
     * with their usage configuration (limit, cadence, scope) and current usage, sortable and
     * filterable by usage. Each node carries `parentId` so the tree can be rebuilt client-side.
     * Usage is read from a periodically-refreshed read model and never gates access.
     */
    fun retrieveGovernance(id: String): CompletableFuture<CustomerRetrieveGovernanceResponse> =
        retrieveGovernance(id, CustomerRetrieveGovernanceParams.none())

    /** @see retrieveGovernance */
    fun retrieveGovernance(
        id: String,
        params: CustomerRetrieveGovernanceParams = CustomerRetrieveGovernanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerRetrieveGovernanceResponse> =
        retrieveGovernance(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveGovernance */
    fun retrieveGovernance(
        id: String,
        params: CustomerRetrieveGovernanceParams = CustomerRetrieveGovernanceParams.none(),
    ): CompletableFuture<CustomerRetrieveGovernanceResponse> =
        retrieveGovernance(id, params, RequestOptions.none())

    /** @see retrieveGovernance */
    fun retrieveGovernance(
        params: CustomerRetrieveGovernanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerRetrieveGovernanceResponse>

    /** @see retrieveGovernance */
    fun retrieveGovernance(
        params: CustomerRetrieveGovernanceParams
    ): CompletableFuture<CustomerRetrieveGovernanceResponse> =
        retrieveGovernance(params, RequestOptions.none())

    /** @see retrieveGovernance */
    fun retrieveGovernance(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerRetrieveGovernanceResponse> =
        retrieveGovernance(id, CustomerRetrieveGovernanceParams.none(), requestOptions)

    /**
     * A view of [CustomerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/customers/{id}/governance`, but is
         * otherwise the same as [CustomerServiceAsync.retrieveGovernance].
         */
        fun retrieveGovernance(
            id: String
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveGovernanceResponse>> =
            retrieveGovernance(id, CustomerRetrieveGovernanceParams.none())

        /** @see retrieveGovernance */
        fun retrieveGovernance(
            id: String,
            params: CustomerRetrieveGovernanceParams = CustomerRetrieveGovernanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveGovernanceResponse>> =
            retrieveGovernance(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveGovernance */
        fun retrieveGovernance(
            id: String,
            params: CustomerRetrieveGovernanceParams = CustomerRetrieveGovernanceParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveGovernanceResponse>> =
            retrieveGovernance(id, params, RequestOptions.none())

        /** @see retrieveGovernance */
        fun retrieveGovernance(
            params: CustomerRetrieveGovernanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveGovernanceResponse>>

        /** @see retrieveGovernance */
        fun retrieveGovernance(
            params: CustomerRetrieveGovernanceParams
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveGovernanceResponse>> =
            retrieveGovernance(params, RequestOptions.none())

        /** @see retrieveGovernance */
        fun retrieveGovernance(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveGovernanceResponse>> =
            retrieveGovernance(id, CustomerRetrieveGovernanceParams.none(), requestOptions)
    }
}
