// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1beta

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1beta.entitytypes.EntityTypeListPageAsync
import io.stigg.models.v1beta.entitytypes.EntityTypeListParams
import io.stigg.models.v1beta.entitytypes.EntityTypeUpsertParams
import io.stigg.models.v1beta.entitytypes.EntityTypeUpsertResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EntityTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityTypeServiceAsync

    /**
     * Returns a cursor-paginated list of entity types defined in the environment. Entity types are
     * vendor-defined categories of resource that can be governed (e.g. Org, Team, User).
     */
    fun list(): CompletableFuture<EntityTypeListPageAsync> = list(EntityTypeListParams.none())

    /** @see list */
    fun list(
        params: EntityTypeListParams = EntityTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityTypeListPageAsync>

    /** @see list */
    fun list(
        params: EntityTypeListParams = EntityTypeListParams.none()
    ): CompletableFuture<EntityTypeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EntityTypeListPageAsync> =
        list(EntityTypeListParams.none(), requestOptions)

    /**
     * Batched create-or-update of entity types. Existing types matched by id are updated; new ids
     * are created. Idempotent — re-submitting the same payload converges to the same state.
     */
    fun upsert(params: EntityTypeUpsertParams): CompletableFuture<EntityTypeUpsertResponse> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: EntityTypeUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityTypeUpsertResponse>

    /**
     * A view of [EntityTypeServiceAsync] that provides access to raw HTTP responses for each
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
        ): EntityTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/entity-types`, but is otherwise the
         * same as [EntityTypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EntityTypeListPageAsync>> =
            list(EntityTypeListParams.none())

        /** @see list */
        fun list(
            params: EntityTypeListParams = EntityTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityTypeListPageAsync>>

        /** @see list */
        fun list(
            params: EntityTypeListParams = EntityTypeListParams.none()
        ): CompletableFuture<HttpResponseFor<EntityTypeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EntityTypeListPageAsync>> =
            list(EntityTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1-beta/entity-types`, but is otherwise the
         * same as [EntityTypeServiceAsync.upsert].
         */
        fun upsert(
            params: EntityTypeUpsertParams
        ): CompletableFuture<HttpResponseFor<EntityTypeUpsertResponse>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: EntityTypeUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityTypeUpsertResponse>>
    }
}
