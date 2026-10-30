// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.entities.EntityArchiveParams
import io.stigg.models.v1.customers.entities.EntityArchiveResponse
import io.stigg.models.v1.customers.entities.EntityListPageAsync
import io.stigg.models.v1.customers.entities.EntityListParams
import io.stigg.models.v1.customers.entities.EntityRetrieveParams
import io.stigg.models.v1.customers.entities.EntityRetrieveResponse
import io.stigg.models.v1.customers.entities.EntityUpsertParams
import io.stigg.models.v1.customers.entities.EntityUpsertResponse
import io.stigg.services.async.v1.customers.entities.EntitlementServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityServiceAsync

    fun entitlements(): EntitlementServiceAsync

    /** Retrieves a single entity for the given customer by its identifier. */
    fun retrieve(
        entityId: String,
        params: EntityRetrieveParams,
    ): CompletableFuture<EntityRetrieveResponse> = retrieve(entityId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        entityId: String,
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityRetrieveResponse> =
        retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: EntityRetrieveParams): CompletableFuture<EntityRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityRetrieveResponse>

    /** Retrieves a paginated list of entities for the given customer. */
    fun list(id: String): CompletableFuture<EntityListPageAsync> = list(id, EntityListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: EntityListParams = EntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityListPageAsync> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: EntityListParams = EntityListParams.none(),
    ): CompletableFuture<EntityListPageAsync> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EntityListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityListPageAsync>

    /** @see list */
    fun list(params: EntityListParams): CompletableFuture<EntityListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<EntityListPageAsync> =
        list(id, EntityListParams.none(), requestOptions)

    /**
     * Archives entities in bulk for the given customer by id. Upsert an archived entity to restore
     * it.
     */
    fun archive(id: String, params: EntityArchiveParams): CompletableFuture<EntityArchiveResponse> =
        archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        id: String,
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityArchiveResponse> =
        archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(params: EntityArchiveParams): CompletableFuture<EntityArchiveResponse> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityArchiveResponse>

    /**
     * Creates or updates entities in bulk for the given customer. Existing entities matched by id
     * are updated; new ids are created. An upsert of an archived entity restores it. An entity on
     * an archived entity type fails with 400.
     */
    fun upsert(id: String, params: EntityUpsertParams): CompletableFuture<EntityUpsertResponse> =
        upsert(id, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        id: String,
        params: EntityUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityUpsertResponse> =
        upsert(params.toBuilder().id(id).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: EntityUpsertParams): CompletableFuture<EntityUpsertResponse> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: EntityUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityUpsertResponse>

    /**
     * A view of [EntityServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityServiceAsync.WithRawResponse

        fun entitlements(): EntitlementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/entities/{entityId}`, but is
         * otherwise the same as [EntityServiceAsync.retrieve].
         */
        fun retrieve(
            entityId: String,
            params: EntityRetrieveParams,
        ): CompletableFuture<HttpResponseFor<EntityRetrieveResponse>> =
            retrieve(entityId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            entityId: String,
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityRetrieveResponse>> =
            retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: EntityRetrieveParams
        ): CompletableFuture<HttpResponseFor<EntityRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/entities`, but is otherwise
         * the same as [EntityServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(id, EntityListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: EntityListParams = EntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: EntityListParams = EntityListParams.none(),
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: EntityListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>>

        /** @see list */
        fun list(
            params: EntityListParams
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(id, EntityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{id}/entities/archive`, but is
         * otherwise the same as [EntityServiceAsync.archive].
         */
        fun archive(
            id: String,
            params: EntityArchiveParams,
        ): CompletableFuture<HttpResponseFor<EntityArchiveResponse>> =
            archive(id, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            id: String,
            params: EntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityArchiveResponse>> =
            archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        fun archive(
            params: EntityArchiveParams
        ): CompletableFuture<HttpResponseFor<EntityArchiveResponse>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: EntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityArchiveResponse>>

        /**
         * Returns a raw HTTP response for `put /api/v1/customers/{id}/entities`, but is otherwise
         * the same as [EntityServiceAsync.upsert].
         */
        fun upsert(
            id: String,
            params: EntityUpsertParams,
        ): CompletableFuture<HttpResponseFor<EntityUpsertResponse>> =
            upsert(id, params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            id: String,
            params: EntityUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityUpsertResponse>> =
            upsert(params.toBuilder().id(id).build(), requestOptions)

        /** @see upsert */
        fun upsert(
            params: EntityUpsertParams
        ): CompletableFuture<HttpResponseFor<EntityUpsertResponse>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: EntityUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityUpsertResponse>>
    }
}
