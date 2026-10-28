// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1beta.customers

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1beta.customers.governance.GovernanceListPage
import io.stigg.models.v1beta.customers.governance.GovernanceListParams
import java.util.function.Consumer

interface GovernanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GovernanceService

    /**
     * Queries the customer's governance hierarchy tree, returning a cursor-paginated list of nodes
     * with their usage configuration (limit, cadence, scope) and current usage, sortable and
     * filterable by usage. Each node carries `parentId` so the tree can be rebuilt client-side.
     * Usage is read from a periodically-refreshed read model and never gates access.
     */
    fun list(id: String): GovernanceListPage = list(id, GovernanceListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: GovernanceListParams = GovernanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GovernanceListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: GovernanceListParams = GovernanceListParams.none(),
    ): GovernanceListPage = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GovernanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GovernanceListPage

    /** @see list */
    fun list(params: GovernanceListParams): GovernanceListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): GovernanceListPage =
        list(id, GovernanceListParams.none(), requestOptions)

    /** A view of [GovernanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GovernanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/customers/{id}/governance`, but is
         * otherwise the same as [GovernanceService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<GovernanceListPage> =
            list(id, GovernanceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: GovernanceListParams = GovernanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GovernanceListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: GovernanceListParams = GovernanceListParams.none(),
        ): HttpResponseFor<GovernanceListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GovernanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GovernanceListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: GovernanceListParams): HttpResponseFor<GovernanceListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<GovernanceListPage> =
            list(id, GovernanceListParams.none(), requestOptions)
    }
}
