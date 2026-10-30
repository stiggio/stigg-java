// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.entitytypes.EntityTypeArchiveParams
import io.stigg.models.v1.entitytypes.EntityTypeArchiveResponse
import io.stigg.models.v1.entitytypes.EntityTypeCheckActiveEntitiesParams
import io.stigg.models.v1.entitytypes.EntityTypeCheckActiveEntitiesResponse
import io.stigg.models.v1.entitytypes.EntityTypeListPage
import io.stigg.models.v1.entitytypes.EntityTypeListParams
import io.stigg.models.v1.entitytypes.EntityTypeUpsertParams
import io.stigg.models.v1.entitytypes.EntityTypeUpsertResponse
import java.util.function.Consumer

interface EntityTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityTypeService

    /**
     * Returns a cursor-paginated list of entity types defined in the environment. Entity types are
     * vendor-defined categories of resource that can be governed (e.g. Org, Team, User). Archived
     * entity types are excluded unless includeArchived=true.
     */
    fun list(): EntityTypeListPage = list(EntityTypeListParams.none())

    /** @see list */
    fun list(
        params: EntityTypeListParams = EntityTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityTypeListPage

    /** @see list */
    fun list(params: EntityTypeListParams = EntityTypeListParams.none()): EntityTypeListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EntityTypeListPage =
        list(EntityTypeListParams.none(), requestOptions)

    /**
     * Archives entity types in bulk by id. An entity type with active entities cannot be archived:
     * archive its entities first, or the whole request fails with 400.
     */
    fun archive(params: EntityTypeArchiveParams): EntityTypeArchiveResponse =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: EntityTypeArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityTypeArchiveResponse

    /**
     * Returns whether any active entity of this entity type exists, across every customer. An
     * entity type can be archived only when this is false. An unknown entity type returns false.
     */
    fun checkActiveEntities(id: String): EntityTypeCheckActiveEntitiesResponse =
        checkActiveEntities(id, EntityTypeCheckActiveEntitiesParams.none())

    /** @see checkActiveEntities */
    fun checkActiveEntities(
        id: String,
        params: EntityTypeCheckActiveEntitiesParams = EntityTypeCheckActiveEntitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityTypeCheckActiveEntitiesResponse =
        checkActiveEntities(params.toBuilder().id(id).build(), requestOptions)

    /** @see checkActiveEntities */
    fun checkActiveEntities(
        id: String,
        params: EntityTypeCheckActiveEntitiesParams = EntityTypeCheckActiveEntitiesParams.none(),
    ): EntityTypeCheckActiveEntitiesResponse =
        checkActiveEntities(id, params, RequestOptions.none())

    /** @see checkActiveEntities */
    fun checkActiveEntities(
        params: EntityTypeCheckActiveEntitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityTypeCheckActiveEntitiesResponse

    /** @see checkActiveEntities */
    fun checkActiveEntities(
        params: EntityTypeCheckActiveEntitiesParams
    ): EntityTypeCheckActiveEntitiesResponse = checkActiveEntities(params, RequestOptions.none())

    /** @see checkActiveEntities */
    fun checkActiveEntities(
        id: String,
        requestOptions: RequestOptions,
    ): EntityTypeCheckActiveEntitiesResponse =
        checkActiveEntities(id, EntityTypeCheckActiveEntitiesParams.none(), requestOptions)

    /**
     * Batched create-or-update of entity types. Existing types matched by id are updated; new ids
     * are created. Idempotent — re-submitting the same payload converges to the same state. An
     * upsert of an archived entity type restores it.
     */
    fun upsert(params: EntityTypeUpsertParams): EntityTypeUpsertResponse =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: EntityTypeUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityTypeUpsertResponse

    /** A view of [EntityTypeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityTypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/entity-types`, but is otherwise the same as
         * [EntityTypeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EntityTypeListPage> = list(EntityTypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EntityTypeListParams = EntityTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityTypeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EntityTypeListParams = EntityTypeListParams.none()
        ): HttpResponseFor<EntityTypeListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EntityTypeListPage> =
            list(EntityTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/entity-types/archive`, but is otherwise the
         * same as [EntityTypeService.archive].
         */
        @MustBeClosed
        fun archive(params: EntityTypeArchiveParams): HttpResponseFor<EntityTypeArchiveResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: EntityTypeArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityTypeArchiveResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/entity-types/{id}/has-active-entities`, but
         * is otherwise the same as [EntityTypeService.checkActiveEntities].
         */
        @MustBeClosed
        fun checkActiveEntities(
            id: String
        ): HttpResponseFor<EntityTypeCheckActiveEntitiesResponse> =
            checkActiveEntities(id, EntityTypeCheckActiveEntitiesParams.none())

        /** @see checkActiveEntities */
        @MustBeClosed
        fun checkActiveEntities(
            id: String,
            params: EntityTypeCheckActiveEntitiesParams =
                EntityTypeCheckActiveEntitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityTypeCheckActiveEntitiesResponse> =
            checkActiveEntities(params.toBuilder().id(id).build(), requestOptions)

        /** @see checkActiveEntities */
        @MustBeClosed
        fun checkActiveEntities(
            id: String,
            params: EntityTypeCheckActiveEntitiesParams = EntityTypeCheckActiveEntitiesParams.none(),
        ): HttpResponseFor<EntityTypeCheckActiveEntitiesResponse> =
            checkActiveEntities(id, params, RequestOptions.none())

        /** @see checkActiveEntities */
        @MustBeClosed
        fun checkActiveEntities(
            params: EntityTypeCheckActiveEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityTypeCheckActiveEntitiesResponse>

        /** @see checkActiveEntities */
        @MustBeClosed
        fun checkActiveEntities(
            params: EntityTypeCheckActiveEntitiesParams
        ): HttpResponseFor<EntityTypeCheckActiveEntitiesResponse> =
            checkActiveEntities(params, RequestOptions.none())

        /** @see checkActiveEntities */
        @MustBeClosed
        fun checkActiveEntities(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityTypeCheckActiveEntitiesResponse> =
            checkActiveEntities(id, EntityTypeCheckActiveEntitiesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/entity-types`, but is otherwise the same as
         * [EntityTypeService.upsert].
         */
        @MustBeClosed
        fun upsert(params: EntityTypeUpsertParams): HttpResponseFor<EntityTypeUpsertResponse> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: EntityTypeUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityTypeUpsertResponse>
    }
}
