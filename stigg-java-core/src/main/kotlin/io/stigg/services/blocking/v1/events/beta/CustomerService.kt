// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.beta

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.beta.customers.CustomerRetrieveGovernanceParams
import io.stigg.models.v1.events.beta.customers.CustomerRetrieveGovernanceResponse
import java.util.function.Consumer

interface CustomerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService

    /**
     * Queries the customer's governance hierarchy tree, returning a cursor-paginated list of nodes
     * with their usage configuration (limit, cadence, scope) and current usage, sortable and
     * filterable by usage. Each node carries `parentId` so the tree can be rebuilt client-side.
     * Usage is read from a periodically-refreshed read model and never gates access.
     */
    fun retrieveGovernance(id: String): CustomerRetrieveGovernanceResponse =
        retrieveGovernance(id, CustomerRetrieveGovernanceParams.none())

    /** @see retrieveGovernance */
    fun retrieveGovernance(
        id: String,
        params: CustomerRetrieveGovernanceParams = CustomerRetrieveGovernanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerRetrieveGovernanceResponse =
        retrieveGovernance(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveGovernance */
    fun retrieveGovernance(
        id: String,
        params: CustomerRetrieveGovernanceParams = CustomerRetrieveGovernanceParams.none(),
    ): CustomerRetrieveGovernanceResponse = retrieveGovernance(id, params, RequestOptions.none())

    /** @see retrieveGovernance */
    fun retrieveGovernance(
        params: CustomerRetrieveGovernanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerRetrieveGovernanceResponse

    /** @see retrieveGovernance */
    fun retrieveGovernance(
        params: CustomerRetrieveGovernanceParams
    ): CustomerRetrieveGovernanceResponse = retrieveGovernance(params, RequestOptions.none())

    /** @see retrieveGovernance */
    fun retrieveGovernance(
        id: String,
        requestOptions: RequestOptions,
    ): CustomerRetrieveGovernanceResponse =
        retrieveGovernance(id, CustomerRetrieveGovernanceParams.none(), requestOptions)

    /** A view of [CustomerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/customers/{id}/governance`, but is
         * otherwise the same as [CustomerService.retrieveGovernance].
         */
        @MustBeClosed
        fun retrieveGovernance(id: String): HttpResponseFor<CustomerRetrieveGovernanceResponse> =
            retrieveGovernance(id, CustomerRetrieveGovernanceParams.none())

        /** @see retrieveGovernance */
        @MustBeClosed
        fun retrieveGovernance(
            id: String,
            params: CustomerRetrieveGovernanceParams = CustomerRetrieveGovernanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerRetrieveGovernanceResponse> =
            retrieveGovernance(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveGovernance */
        @MustBeClosed
        fun retrieveGovernance(
            id: String,
            params: CustomerRetrieveGovernanceParams = CustomerRetrieveGovernanceParams.none(),
        ): HttpResponseFor<CustomerRetrieveGovernanceResponse> =
            retrieveGovernance(id, params, RequestOptions.none())

        /** @see retrieveGovernance */
        @MustBeClosed
        fun retrieveGovernance(
            params: CustomerRetrieveGovernanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerRetrieveGovernanceResponse>

        /** @see retrieveGovernance */
        @MustBeClosed
        fun retrieveGovernance(
            params: CustomerRetrieveGovernanceParams
        ): HttpResponseFor<CustomerRetrieveGovernanceResponse> =
            retrieveGovernance(params, RequestOptions.none())

        /** @see retrieveGovernance */
        @MustBeClosed
        fun retrieveGovernance(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerRetrieveGovernanceResponse> =
            retrieveGovernance(id, CustomerRetrieveGovernanceParams.none(), requestOptions)
    }
}
