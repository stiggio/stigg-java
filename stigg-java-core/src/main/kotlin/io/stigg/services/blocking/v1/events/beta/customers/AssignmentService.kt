// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.beta.customers

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.beta.customers.assignments.AssignmentListPage
import io.stigg.models.v1.events.beta.customers.assignments.AssignmentListParams
import io.stigg.models.v1.events.beta.customers.assignments.AssignmentUpsertParams
import io.stigg.models.v1.events.beta.customers.assignments.AssignmentUpsertResponse
import java.util.function.Consumer

interface AssignmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssignmentService

    /**
     * Returns a cursor-paginated list of capability assignments for the given customer. An
     * assignment ties an entity to a capability with a usage limit and reset cadence.
     */
    fun list(id: String): AssignmentListPage = list(id, AssignmentListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: AssignmentListParams = AssignmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssignmentListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: AssignmentListParams = AssignmentListParams.none(),
    ): AssignmentListPage = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssignmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssignmentListPage

    /** @see list */
    fun list(params: AssignmentListParams): AssignmentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): AssignmentListPage =
        list(id, AssignmentListParams.none(), requestOptions)

    /**
     * Batched create-or-update of capability assignments. Existing assignments matched by
     * (entityId, capabilityId) are updated; new pairs are created. On update, omitted fields
     * (usageLimit, cadence) are preserved; on create both are required by the governance service.
     */
    fun upsert(id: String, params: AssignmentUpsertParams): AssignmentUpsertResponse =
        upsert(id, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        id: String,
        params: AssignmentUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssignmentUpsertResponse = upsert(params.toBuilder().id(id).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: AssignmentUpsertParams): AssignmentUpsertResponse =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: AssignmentUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssignmentUpsertResponse

    /** A view of [AssignmentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssignmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/customers/{id}/assignments`, but is
         * otherwise the same as [AssignmentService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<AssignmentListPage> =
            list(id, AssignmentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: AssignmentListParams = AssignmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssignmentListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: AssignmentListParams = AssignmentListParams.none(),
        ): HttpResponseFor<AssignmentListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssignmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssignmentListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AssignmentListParams): HttpResponseFor<AssignmentListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<AssignmentListPage> =
            list(id, AssignmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1-beta/customers/{id}/assignments`, but is
         * otherwise the same as [AssignmentService.upsert].
         */
        @MustBeClosed
        fun upsert(
            id: String,
            params: AssignmentUpsertParams,
        ): HttpResponseFor<AssignmentUpsertResponse> = upsert(id, params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            id: String,
            params: AssignmentUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssignmentUpsertResponse> =
            upsert(params.toBuilder().id(id).build(), requestOptions)

        /** @see upsert */
        @MustBeClosed
        fun upsert(params: AssignmentUpsertParams): HttpResponseFor<AssignmentUpsertResponse> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: AssignmentUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssignmentUpsertResponse>
    }
}
