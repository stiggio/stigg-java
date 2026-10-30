// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.customers.entities

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.entities.entitlements.EntitlementListPage
import io.stigg.models.v1.customers.entities.entitlements.EntitlementListParams
import io.stigg.models.v1.customers.entities.entitlements.EntitlementUpsertParams
import io.stigg.models.v1.customers.entities.entitlements.EntitlementUpsertResponse
import java.util.function.Consumer

interface EntitlementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementService

    /**
     * Returns a cursor-paginated list of entity entitlements for the given customer. An entity
     * entitlement ties an entity to a feature or currency with a usage limit and reset cadence.
     */
    fun list(id: String): EntitlementListPage = list(id, EntitlementListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: EntitlementListParams = EntitlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: EntitlementListParams = EntitlementListParams.none(),
    ): EntitlementListPage = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EntitlementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementListPage

    /** @see list */
    fun list(params: EntitlementListParams): EntitlementListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): EntitlementListPage =
        list(id, EntitlementListParams.none(), requestOptions)

    /**
     * Batched create-or-update of entity entitlements. Existing entity entitlements matched by
     * (entityId, featureId or currencyId, scopeEntityIds) are updated; new ones are created. On
     * update, omitted fields (usageLimit, cadence) are preserved; on create both are required.
     */
    fun upsert(id: String, params: EntitlementUpsertParams): EntitlementUpsertResponse =
        upsert(id, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        id: String,
        params: EntitlementUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementUpsertResponse = upsert(params.toBuilder().id(id).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: EntitlementUpsertParams): EntitlementUpsertResponse =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: EntitlementUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementUpsertResponse

    /**
     * A view of [EntitlementService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntitlementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/entities/entitlements`, but
         * is otherwise the same as [EntitlementService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<EntitlementListPage> =
            list(id, EntitlementListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: EntitlementListParams = EntitlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: EntitlementListParams = EntitlementListParams.none(),
        ): HttpResponseFor<EntitlementListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EntitlementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: EntitlementListParams): HttpResponseFor<EntitlementListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<EntitlementListPage> =
            list(id, EntitlementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/customers/{id}/entities/entitlements`, but
         * is otherwise the same as [EntitlementService.upsert].
         */
        @MustBeClosed
        fun upsert(
            id: String,
            params: EntitlementUpsertParams,
        ): HttpResponseFor<EntitlementUpsertResponse> = upsert(id, params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            id: String,
            params: EntitlementUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementUpsertResponse> =
            upsert(params.toBuilder().id(id).build(), requestOptions)

        /** @see upsert */
        @MustBeClosed
        fun upsert(params: EntitlementUpsertParams): HttpResponseFor<EntitlementUpsertResponse> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: EntitlementUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementUpsertResponse>
    }
}
