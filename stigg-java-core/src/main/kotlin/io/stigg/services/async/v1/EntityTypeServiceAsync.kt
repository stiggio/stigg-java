// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.entitytypes.EntityTypeArchiveParams
import io.stigg.models.v1.entitytypes.EntityTypeArchiveResponse
import io.stigg.models.v1.entitytypes.EntityTypeCheckActiveEntitiesParams
import io.stigg.models.v1.entitytypes.EntityTypeCheckActiveEntitiesResponse
import io.stigg.models.v1.entitytypes.EntityTypeListPageAsync
import io.stigg.models.v1.entitytypes.EntityTypeListParams
import io.stigg.models.v1.entitytypes.EntityTypeUpsertParams
import io.stigg.models.v1.entitytypes.EntityTypeUpsertResponse
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
     * vendor-defined categories of resource that can be governed (e.g. Org, Team, User). Archived
     * entity types are excluded unless includeArchived=true.
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
     * Archives entity types in bulk by id. An entity type with active entities cannot be archived:
     * archive its entities first, or the whole request fails with 400.
     */
    fun archive(params: EntityTypeArchiveParams): CompletableFuture<EntityTypeArchiveResponse> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: EntityTypeArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityTypeArchiveResponse>

    /**
     * Returns whether any active entity of this entity type exists, across every customer. An
     * entity type can be archived only when this is false. An unknown entity type returns false.
     */
    fun checkActiveEntities(id: String): CompletableFuture<EntityTypeCheckActiveEntitiesResponse> =
        checkActiveEntities(id, EntityTypeCheckActiveEntitiesParams.none())

    /** @see checkActiveEntities */
    fun checkActiveEntities(
        id: String,
        params: EntityTypeCheckActiveEntitiesParams = EntityTypeCheckActiveEntitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityTypeCheckActiveEntitiesResponse> =
        checkActiveEntities(params.toBuilder().id(id).build(), requestOptions)

    /** @see checkActiveEntities */
    fun checkActiveEntities(
        id: String,
        params: EntityTypeCheckActiveEntitiesParams = EntityTypeCheckActiveEntitiesParams.none(),
    ): CompletableFuture<EntityTypeCheckActiveEntitiesResponse> =
        checkActiveEntities(id, params, RequestOptions.none())

    /** @see checkActiveEntities */
    fun checkActiveEntities(
        params: EntityTypeCheckActiveEntitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityTypeCheckActiveEntitiesResponse>

    /** @see checkActiveEntities */
    fun checkActiveEntities(
        params: EntityTypeCheckActiveEntitiesParams
    ): CompletableFuture<EntityTypeCheckActiveEntitiesResponse> =
        checkActiveEntities(params, RequestOptions.none())

    /** @see checkActiveEntities */
    fun checkActiveEntities(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityTypeCheckActiveEntitiesResponse> =
        checkActiveEntities(id, EntityTypeCheckActiveEntitiesParams.none(), requestOptions)

    /**
     * Batched create-or-update of entity types. Existing types matched by id are updated; new ids
     * are created. Idempotent — re-submitting the same payload converges to the same state. An
     * upsert of an archived entity type restores it.
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
         * Returns a raw HTTP response for `get /api/v1/entity-types`, but is otherwise the same as
         * [EntityTypeServiceAsync.list].
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
         * Returns a raw HTTP response for `post /api/v1/entity-types/archive`, but is otherwise the
         * same as [EntityTypeServiceAsync.archive].
         */
        fun archive(
            params: EntityTypeArchiveParams
        ): CompletableFuture<HttpResponseFor<EntityTypeArchiveResponse>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: EntityTypeArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityTypeArchiveResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/entity-types/{id}/has-active-entities`, but
         * is otherwise the same as [EntityTypeServiceAsync.checkActiveEntities].
         */
        fun checkActiveEntities(
            id: String
        ): CompletableFuture<HttpResponseFor<EntityTypeCheckActiveEntitiesResponse>> =
            checkActiveEntities(id, EntityTypeCheckActiveEntitiesParams.none())

        /** @see checkActiveEntities */
        fun checkActiveEntities(
            id: String,
            params: EntityTypeCheckActiveEntitiesParams =
                EntityTypeCheckActiveEntitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityTypeCheckActiveEntitiesResponse>> =
            checkActiveEntities(params.toBuilder().id(id).build(), requestOptions)

        /** @see checkActiveEntities */
        fun checkActiveEntities(
            id: String,
            params: EntityTypeCheckActiveEntitiesParams = EntityTypeCheckActiveEntitiesParams.none(),
        ): CompletableFuture<HttpResponseFor<EntityTypeCheckActiveEntitiesResponse>> =
            checkActiveEntities(id, params, RequestOptions.none())

        /** @see checkActiveEntities */
        fun checkActiveEntities(
            params: EntityTypeCheckActiveEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityTypeCheckActiveEntitiesResponse>>

        /** @see checkActiveEntities */
        fun checkActiveEntities(
            params: EntityTypeCheckActiveEntitiesParams
        ): CompletableFuture<HttpResponseFor<EntityTypeCheckActiveEntitiesResponse>> =
            checkActiveEntities(params, RequestOptions.none())

        /** @see checkActiveEntities */
        fun checkActiveEntities(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityTypeCheckActiveEntitiesResponse>> =
            checkActiveEntities(id, EntityTypeCheckActiveEntitiesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/entity-types`, but is otherwise the same as
         * [EntityTypeServiceAsync.upsert].
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
