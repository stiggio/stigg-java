// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.beta.customers

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.beta.customers.entities.EntityArchiveParams
import io.stigg.models.v1.events.beta.customers.entities.EntityArchiveResponse
import io.stigg.models.v1.events.beta.customers.entities.EntityListPage
import io.stigg.models.v1.events.beta.customers.entities.EntityListParams
import io.stigg.models.v1.events.beta.customers.entities.EntityRetrieveParams
import io.stigg.models.v1.events.beta.customers.entities.EntityRetrieveResponse
import io.stigg.models.v1.events.beta.customers.entities.EntityUnarchiveParams
import io.stigg.models.v1.events.beta.customers.entities.EntityUnarchiveResponse
import io.stigg.models.v1.events.beta.customers.entities.EntityUpsertParams
import io.stigg.models.v1.events.beta.customers.entities.EntityUpsertResponse
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

    /** Retrieves a single entity for the given customer by its identifier. */
    fun retrieve(entityId: String, params: EntityRetrieveParams): EntityRetrieveResponse =
        retrieve(entityId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        entityId: String,
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityRetrieveResponse =
        retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: EntityRetrieveParams): EntityRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityRetrieveResponse

    /** Retrieves a paginated list of entities for the given customer. */
    fun list(id: String): EntityListPage = list(id, EntityListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: EntityListParams = EntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: EntityListParams = EntityListParams.none()): EntityListPage =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EntityListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityListPage

    /** @see list */
    fun list(params: EntityListParams): EntityListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): EntityListPage =
        list(id, EntityListParams.none(), requestOptions)

    /** Archives entities in bulk for the given customer by id. */
    fun archive(id: String, params: EntityArchiveParams): EntityArchiveResponse =
        archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        id: String,
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityArchiveResponse = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(params: EntityArchiveParams): EntityArchiveResponse =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityArchiveResponse

    /** Restores previously archived entities in bulk for the given customer by id. */
    fun unarchive(id: String, params: EntityUnarchiveParams): EntityUnarchiveResponse =
        unarchive(id, params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        id: String,
        params: EntityUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityUnarchiveResponse = unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(params: EntityUnarchiveParams): EntityUnarchiveResponse =
        unarchive(params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        params: EntityUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityUnarchiveResponse

    /**
     * Creates or updates entities in bulk for the given customer. Existing entities matched by id
     * are updated; new ids are created.
     */
    fun upsert(id: String, params: EntityUpsertParams): EntityUpsertResponse =
        upsert(id, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        id: String,
        params: EntityUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityUpsertResponse = upsert(params.toBuilder().id(id).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: EntityUpsertParams): EntityUpsertResponse =
        upsert(params, RequestOptions.none())

    /** @see upsert */
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
        @MustBeClosed
        fun retrieve(
            entityId: String,
            params: EntityRetrieveParams,
        ): HttpResponseFor<EntityRetrieveResponse> =
            retrieve(entityId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            entityId: String,
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityRetrieveResponse> =
            retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EntityRetrieveParams): HttpResponseFor<EntityRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/customers/{id}/entities`, but is
         * otherwise the same as [EntityService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<EntityListPage> = list(id, EntityListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: EntityListParams = EntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityListPage> = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: EntityListParams = EntityListParams.none(),
        ): HttpResponseFor<EntityListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EntityListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: EntityListParams): HttpResponseFor<EntityListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<EntityListPage> =
            list(id, EntityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1-beta/customers/{id}/entities/archive`, but
         * is otherwise the same as [EntityService.archive].
         */
        @MustBeClosed
        fun archive(
            id: String,
            params: EntityArchiveParams,
        ): HttpResponseFor<EntityArchiveResponse> = archive(id, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: EntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityArchiveResponse> =
            archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(params: EntityArchiveParams): HttpResponseFor<EntityArchiveResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: EntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityArchiveResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1-beta/customers/{id}/entities/unarchive`,
         * but is otherwise the same as [EntityService.unarchive].
         */
        @MustBeClosed
        fun unarchive(
            id: String,
            params: EntityUnarchiveParams,
        ): HttpResponseFor<EntityUnarchiveResponse> = unarchive(id, params, RequestOptions.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            id: String,
            params: EntityUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityUnarchiveResponse> =
            unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(params: EntityUnarchiveParams): HttpResponseFor<EntityUnarchiveResponse> =
            unarchive(params, RequestOptions.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            params: EntityUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityUnarchiveResponse>

        /**
         * Returns a raw HTTP response for `put /api/v1-beta/customers/{id}/entities`, but is
         * otherwise the same as [EntityService.upsert].
         */
        @MustBeClosed
        fun upsert(id: String, params: EntityUpsertParams): HttpResponseFor<EntityUpsertResponse> =
            upsert(id, params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            id: String,
            params: EntityUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityUpsertResponse> =
            upsert(params.toBuilder().id(id).build(), requestOptions)

        /** @see upsert */
        @MustBeClosed
        fun upsert(params: EntityUpsertParams): HttpResponseFor<EntityUpsertResponse> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: EntityUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityUpsertResponse>
    }
}
