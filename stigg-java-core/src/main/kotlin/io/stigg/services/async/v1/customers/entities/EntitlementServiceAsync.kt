// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers.entities

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.entities.entitlements.EntitlementListPageAsync
import io.stigg.models.v1.customers.entities.entitlements.EntitlementListParams
import io.stigg.models.v1.customers.entities.entitlements.EntitlementUpsertParams
import io.stigg.models.v1.customers.entities.entitlements.EntitlementUpsertResponse
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
     * Returns a cursor-paginated list of entity entitlements for the given customer. An entity
     * entitlement ties an entity to a feature or currency with a usage limit and reset cadence.
     */
    fun list(id: String): CompletableFuture<EntitlementListPageAsync> =
        list(id, EntitlementListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: EntitlementListParams = EntitlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementListPageAsync> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: EntitlementListParams = EntitlementListParams.none(),
    ): CompletableFuture<EntitlementListPageAsync> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EntitlementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementListPageAsync>

    /** @see list */
    fun list(params: EntitlementListParams): CompletableFuture<EntitlementListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementListPageAsync> =
        list(id, EntitlementListParams.none(), requestOptions)

    /**
     * Batched create-or-update of entity entitlements. Existing entity entitlements matched by
     * (entityId, featureId or currencyId, scopeEntityIds) are updated; new ones are created. On
     * update, omitted fields (usageLimit, cadence) are preserved; on create both are required.
     */
    fun upsert(
        id: String,
        params: EntitlementUpsertParams,
    ): CompletableFuture<EntitlementUpsertResponse> = upsert(id, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        id: String,
        params: EntitlementUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementUpsertResponse> =
        upsert(params.toBuilder().id(id).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: EntitlementUpsertParams): CompletableFuture<EntitlementUpsertResponse> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: EntitlementUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementUpsertResponse>

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
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/entities/entitlements`, but
         * is otherwise the same as [EntitlementServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<EntitlementListPageAsync>> =
            list(id, EntitlementListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: EntitlementListParams = EntitlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementListPageAsync>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: EntitlementListParams = EntitlementListParams.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementListPageAsync>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: EntitlementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementListPageAsync>>

        /** @see list */
        fun list(
            params: EntitlementListParams
        ): CompletableFuture<HttpResponseFor<EntitlementListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntitlementListPageAsync>> =
            list(id, EntitlementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/customers/{id}/entities/entitlements`, but
         * is otherwise the same as [EntitlementServiceAsync.upsert].
         */
        fun upsert(
            id: String,
            params: EntitlementUpsertParams,
        ): CompletableFuture<HttpResponseFor<EntitlementUpsertResponse>> =
            upsert(id, params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            id: String,
            params: EntitlementUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementUpsertResponse>> =
            upsert(params.toBuilder().id(id).build(), requestOptions)

        /** @see upsert */
        fun upsert(
            params: EntitlementUpsertParams
        ): CompletableFuture<HttpResponseFor<EntitlementUpsertResponse>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: EntitlementUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementUpsertResponse>>
    }
}
