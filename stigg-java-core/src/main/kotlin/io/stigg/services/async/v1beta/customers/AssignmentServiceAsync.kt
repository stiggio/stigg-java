// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1beta.customers

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1beta.customers.assignments.AssignmentListPageAsync
import io.stigg.models.v1beta.customers.assignments.AssignmentListParams
import io.stigg.models.v1beta.customers.assignments.AssignmentUpsertParams
import io.stigg.models.v1beta.customers.assignments.AssignmentUpsertResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AssignmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssignmentServiceAsync

    /**
     * Returns a cursor-paginated list of capability assignments for the given customer. An
     * assignment ties an entity to a capability with a usage limit and reset cadence.
     */
    fun list(id: String): CompletableFuture<AssignmentListPageAsync> =
        list(id, AssignmentListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: AssignmentListParams = AssignmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssignmentListPageAsync> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: AssignmentListParams = AssignmentListParams.none(),
    ): CompletableFuture<AssignmentListPageAsync> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssignmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssignmentListPageAsync>

    /** @see list */
    fun list(params: AssignmentListParams): CompletableFuture<AssignmentListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssignmentListPageAsync> =
        list(id, AssignmentListParams.none(), requestOptions)

    /**
     * Batched create-or-update of capability assignments. Existing assignments matched by
     * (entityId, capabilityId) are updated; new pairs are created. On update, omitted fields
     * (usageLimit, cadence) are preserved; on create both are required by the governance service.
     */
    fun upsert(
        id: String,
        params: AssignmentUpsertParams,
    ): CompletableFuture<AssignmentUpsertResponse> = upsert(id, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        id: String,
        params: AssignmentUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssignmentUpsertResponse> =
        upsert(params.toBuilder().id(id).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: AssignmentUpsertParams): CompletableFuture<AssignmentUpsertResponse> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: AssignmentUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssignmentUpsertResponse>

    /**
     * A view of [AssignmentServiceAsync] that provides access to raw HTTP responses for each
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
        ): AssignmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/customers/{id}/assignments`, but is
         * otherwise the same as [AssignmentServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<AssignmentListPageAsync>> =
            list(id, AssignmentListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: AssignmentListParams = AssignmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssignmentListPageAsync>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: AssignmentListParams = AssignmentListParams.none(),
        ): CompletableFuture<HttpResponseFor<AssignmentListPageAsync>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AssignmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssignmentListPageAsync>>

        /** @see list */
        fun list(
            params: AssignmentListParams
        ): CompletableFuture<HttpResponseFor<AssignmentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssignmentListPageAsync>> =
            list(id, AssignmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1-beta/customers/{id}/assignments`, but is
         * otherwise the same as [AssignmentServiceAsync.upsert].
         */
        fun upsert(
            id: String,
            params: AssignmentUpsertParams,
        ): CompletableFuture<HttpResponseFor<AssignmentUpsertResponse>> =
            upsert(id, params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            id: String,
            params: AssignmentUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssignmentUpsertResponse>> =
            upsert(params.toBuilder().id(id).build(), requestOptions)

        /** @see upsert */
        fun upsert(
            params: AssignmentUpsertParams
        ): CompletableFuture<HttpResponseFor<AssignmentUpsertResponse>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: AssignmentUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssignmentUpsertResponse>>
    }
}
