// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1beta.customers

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1beta.customers.entities.EntityArchiveParams
import io.stigg.models.v1beta.customers.entities.EntityArchiveResponse
import io.stigg.models.v1beta.customers.entities.EntityListPage
import io.stigg.models.v1beta.customers.entities.EntityListParams
import io.stigg.models.v1beta.customers.entities.EntityRetrieveParams
import io.stigg.models.v1beta.customers.entities.EntityRetrieveResponse
import io.stigg.models.v1beta.customers.entities.EntityUnarchiveParams
import io.stigg.models.v1beta.customers.entities.EntityUnarchiveResponse
import io.stigg.models.v1beta.customers.entities.EntityUpsertParams
import io.stigg.models.v1beta.customers.entities.EntityUpsertResponse
import java.util.function.Consumer

interface EntityService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityService

    /**
     * Retrieves a single entity for the given customer by its identifier. Deprecated: use `GET
     * /api/v1/customers/{id}/entities/{entityId}`.
     */
    @Deprecated("Use `v1.customers.entities.retrieve` instead.")
    fun retrieve(entityId: String, params: EntityRetrieveParams): EntityRetrieveResponse =
        retrieve(entityId, params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("Use `v1.customers.entities.retrieve` instead.")
    fun retrieve(
        entityId: String,
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityRetrieveResponse =
        retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("Use `v1.customers.entities.retrieve` instead.")
    fun retrieve(params: EntityRetrieveParams): EntityRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("Use `v1.customers.entities.retrieve` instead.")
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityRetrieveResponse

    /**
     * Retrieves a paginated list of entities for the given customer. Deprecated: use `GET
     * /api/v1/customers/{id}/entities`.
     */
    @Deprecated("Use `v1.customers.entities.list` instead.")
    fun list(id: String): EntityListPage = list(id, EntityListParams.none())

    /** @see list */
    @Deprecated("Use `v1.customers.entities.list` instead.")
    fun list(
        id: String,
        params: EntityListParams = EntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    @Deprecated("Use `v1.customers.entities.list` instead.")
    fun list(id: String, params: EntityListParams = EntityListParams.none()): EntityListPage =
        list(id, params, RequestOptions.none())

    /** @see list */
    @Deprecated("Use `v1.customers.entities.list` instead.")
    fun list(
        params: EntityListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityListPage

    /** @see list */
    @Deprecated("Use `v1.customers.entities.list` instead.")
    fun list(params: EntityListParams): EntityListPage = list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("Use `v1.customers.entities.list` instead.")
    fun list(id: String, requestOptions: RequestOptions): EntityListPage =
        list(id, EntityListParams.none(), requestOptions)

    /**
     * Archives entities in bulk for the given customer by id. Upsert an archived entity to restore
     * it. Deprecated: use `POST /api/v1/customers/{id}/entities/archive`.
     */
    @Deprecated("Use `v1.customers.entities.archive` instead.")
    fun archive(id: String, params: EntityArchiveParams): EntityArchiveResponse =
        archive(id, params, RequestOptions.none())

    /** @see archive */
    @Deprecated("Use `v1.customers.entities.archive` instead.")
    fun archive(
        id: String,
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityArchiveResponse = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    @Deprecated("Use `v1.customers.entities.archive` instead.")
    fun archive(params: EntityArchiveParams): EntityArchiveResponse =
        archive(params, RequestOptions.none())

    /** @see archive */
    @Deprecated("Use `v1.customers.entities.archive` instead.")
    fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityArchiveResponse

    /**
     * Deprecated: use `PUT /api/v1/customers/{id}/entities` with the entity id to restore it.
     * Restores previously archived entities in bulk for the given customer by id.
     */
    @Deprecated(
        "Use `v1.customers.entities.upsert` with the entity id to restore an archived entity."
    )
    fun unarchive(id: String, params: EntityUnarchiveParams): EntityUnarchiveResponse =
        unarchive(id, params, RequestOptions.none())

    /** @see unarchive */
    @Deprecated(
        "Use `v1.customers.entities.upsert` with the entity id to restore an archived entity."
    )
    fun unarchive(
        id: String,
        params: EntityUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityUnarchiveResponse = unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchive */
    @Deprecated(
        "Use `v1.customers.entities.upsert` with the entity id to restore an archived entity."
    )
    fun unarchive(params: EntityUnarchiveParams): EntityUnarchiveResponse =
        unarchive(params, RequestOptions.none())

    /** @see unarchive */
    @Deprecated(
        "Use `v1.customers.entities.upsert` with the entity id to restore an archived entity."
    )
    fun unarchive(
        params: EntityUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityUnarchiveResponse

    /**
     * Creates or updates entities in bulk for the given customer. Existing entities matched by id
     * are updated; new ids are created. An upsert of an archived entity restores it. An entity on
     * an archived entity type fails with 400. Deprecated: use `PUT
     * /api/v1/customers/{id}/entities`.
     */
    @Deprecated("Use `v1.customers.entities.upsert` instead.")
    fun upsert(id: String, params: EntityUpsertParams): EntityUpsertResponse =
        upsert(id, params, RequestOptions.none())

    /** @see upsert */
    @Deprecated("Use `v1.customers.entities.upsert` instead.")
    fun upsert(
        id: String,
        params: EntityUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityUpsertResponse = upsert(params.toBuilder().id(id).build(), requestOptions)

    /** @see upsert */
    @Deprecated("Use `v1.customers.entities.upsert` instead.")
    fun upsert(params: EntityUpsertParams): EntityUpsertResponse =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    @Deprecated("Use `v1.customers.entities.upsert` instead.")
    fun upsert(
        params: EntityUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityUpsertResponse

    /** A view of [EntityService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/customers/{id}/entities/{entityId}`,
         * but is otherwise the same as [EntityService.retrieve].
         */
        @Deprecated("Use `v1.customers.entities.retrieve` instead.")
        @MustBeClosed
        fun retrieve(
            entityId: String,
            params: EntityRetrieveParams,
        ): HttpResponseFor<EntityRetrieveResponse> =
            retrieve(entityId, params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("Use `v1.customers.entities.retrieve` instead.")
        @MustBeClosed
        fun retrieve(
            entityId: String,
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityRetrieveResponse> =
            retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("Use `v1.customers.entities.retrieve` instead.")
        @MustBeClosed
        fun retrieve(params: EntityRetrieveParams): HttpResponseFor<EntityRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("Use `v1.customers.entities.retrieve` instead.")
        @MustBeClosed
        fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/customers/{id}/entities`, but is
         * otherwise the same as [EntityService.list].
         */
        @Deprecated("Use `v1.customers.entities.list` instead.")
        @MustBeClosed
        fun list(id: String): HttpResponseFor<EntityListPage> = list(id, EntityListParams.none())

        /** @see list */
        @Deprecated("Use `v1.customers.entities.list` instead.")
        @MustBeClosed
        fun list(
            id: String,
            params: EntityListParams = EntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityListPage> = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @Deprecated("Use `v1.customers.entities.list` instead.")
        @MustBeClosed
        fun list(
            id: String,
            params: EntityListParams = EntityListParams.none(),
        ): HttpResponseFor<EntityListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @Deprecated("Use `v1.customers.entities.list` instead.")
        @MustBeClosed
        fun list(
            params: EntityListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityListPage>

        /** @see list */
        @Deprecated("Use `v1.customers.entities.list` instead.")
        @MustBeClosed
        fun list(params: EntityListParams): HttpResponseFor<EntityListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("Use `v1.customers.entities.list` instead.")
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<EntityListPage> =
            list(id, EntityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1-beta/customers/{id}/entities/archive`, but
         * is otherwise the same as [EntityService.archive].
         */
        @Deprecated("Use `v1.customers.entities.archive` instead.")
        @MustBeClosed
        fun archive(
            id: String,
            params: EntityArchiveParams,
        ): HttpResponseFor<EntityArchiveResponse> = archive(id, params, RequestOptions.none())

        /** @see archive */
        @Deprecated("Use `v1.customers.entities.archive` instead.")
        @MustBeClosed
        fun archive(
            id: String,
            params: EntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityArchiveResponse> =
            archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        @Deprecated("Use `v1.customers.entities.archive` instead.")
        @MustBeClosed
        fun archive(params: EntityArchiveParams): HttpResponseFor<EntityArchiveResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @Deprecated("Use `v1.customers.entities.archive` instead.")
        @MustBeClosed
        fun archive(
            params: EntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityArchiveResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1-beta/customers/{id}/entities/unarchive`,
         * but is otherwise the same as [EntityService.unarchive].
         */
        @Deprecated(
            "Use `v1.customers.entities.upsert` with the entity id to restore an archived entity."
        )
        @MustBeClosed
        fun unarchive(
            id: String,
            params: EntityUnarchiveParams,
        ): HttpResponseFor<EntityUnarchiveResponse> = unarchive(id, params, RequestOptions.none())

        /** @see unarchive */
        @Deprecated(
            "Use `v1.customers.entities.upsert` with the entity id to restore an archived entity."
        )
        @MustBeClosed
        fun unarchive(
            id: String,
            params: EntityUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityUnarchiveResponse> =
            unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchive */
        @Deprecated(
            "Use `v1.customers.entities.upsert` with the entity id to restore an archived entity."
        )
        @MustBeClosed
        fun unarchive(params: EntityUnarchiveParams): HttpResponseFor<EntityUnarchiveResponse> =
            unarchive(params, RequestOptions.none())

        /** @see unarchive */
        @Deprecated(
            "Use `v1.customers.entities.upsert` with the entity id to restore an archived entity."
        )
        @MustBeClosed
        fun unarchive(
            params: EntityUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityUnarchiveResponse>

        /**
         * Returns a raw HTTP response for `put /api/v1-beta/customers/{id}/entities`, but is
         * otherwise the same as [EntityService.upsert].
         */
        @Deprecated("Use `v1.customers.entities.upsert` instead.")
        @MustBeClosed
        fun upsert(id: String, params: EntityUpsertParams): HttpResponseFor<EntityUpsertResponse> =
            upsert(id, params, RequestOptions.none())

        /** @see upsert */
        @Deprecated("Use `v1.customers.entities.upsert` instead.")
        @MustBeClosed
        fun upsert(
            id: String,
            params: EntityUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityUpsertResponse> =
            upsert(params.toBuilder().id(id).build(), requestOptions)

        /** @see upsert */
        @Deprecated("Use `v1.customers.entities.upsert` instead.")
        @MustBeClosed
        fun upsert(params: EntityUpsertParams): HttpResponseFor<EntityUpsertResponse> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @Deprecated("Use `v1.customers.entities.upsert` instead.")
        @MustBeClosed
        fun upsert(
            params: EntityUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityUpsertResponse>
    }
}
