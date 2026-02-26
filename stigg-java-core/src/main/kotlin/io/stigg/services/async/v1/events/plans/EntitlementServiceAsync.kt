// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.plans

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.plans.entitlements.EntitlementCreateParams
import io.stigg.models.v1.events.plans.entitlements.EntitlementCreateResponse
import io.stigg.models.v1.events.plans.entitlements.EntitlementDeleteParams
import io.stigg.models.v1.events.plans.entitlements.EntitlementListParams
import io.stigg.models.v1.events.plans.entitlements.EntitlementListResponse
import io.stigg.models.v1.events.plans.entitlements.EntitlementUpdateParams
import io.stigg.models.v1.events.plans.entitlements.PlanEntitlement
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

    /** Creates one or more entitlements (feature or credit) on a draft plan. */
    fun create(
        planId: String,
        params: EntitlementCreateParams,
    ): CompletableFuture<EntitlementCreateResponse> = create(planId, params, RequestOptions.none())

    /** @see create */
    fun create(
        planId: String,
        params: EntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementCreateResponse> =
        create(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see create */
    fun create(params: EntitlementCreateParams): CompletableFuture<EntitlementCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementCreateResponse>

    /** Updates an existing entitlement on a draft plan. */
    fun update(id: String, params: EntitlementUpdateParams): CompletableFuture<PlanEntitlement> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanEntitlement> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: EntitlementUpdateParams): CompletableFuture<PlanEntitlement> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanEntitlement>

    /** Retrieves a list of entitlements for a plan. */
    fun list(planId: String): CompletableFuture<EntitlementListResponse> =
        list(planId, EntitlementListParams.none())

    /** @see list */
    fun list(
        planId: String,
        params: EntitlementListParams = EntitlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementListResponse> =
        list(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see list */
    fun list(
        planId: String,
        params: EntitlementListParams = EntitlementListParams.none(),
    ): CompletableFuture<EntitlementListResponse> = list(planId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EntitlementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementListResponse>

    /** @see list */
    fun list(params: EntitlementListParams): CompletableFuture<EntitlementListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        planId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementListResponse> =
        list(planId, EntitlementListParams.none(), requestOptions)

    /** Deletes an entitlement from a draft plan. */
    fun delete(id: String, params: EntitlementDeleteParams): CompletableFuture<PlanEntitlement> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EntitlementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanEntitlement> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: EntitlementDeleteParams): CompletableFuture<PlanEntitlement> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EntitlementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanEntitlement>

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
         * Returns a raw HTTP response for `post /api/v1/plans/{planId}/entitlements`, but is
         * otherwise the same as [EntitlementServiceAsync.create].
         */
        fun create(
            planId: String,
            params: EntitlementCreateParams,
        ): CompletableFuture<HttpResponseFor<EntitlementCreateResponse>> =
            create(planId, params, RequestOptions.none())

        /** @see create */
        fun create(
            planId: String,
            params: EntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementCreateResponse>> =
            create(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see create */
        fun create(
            params: EntitlementCreateParams
        ): CompletableFuture<HttpResponseFor<EntitlementCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/plans/{planId}/entitlements/{id}`, but is
         * otherwise the same as [EntitlementServiceAsync.update].
         */
        fun update(
            id: String,
            params: EntitlementUpdateParams,
        ): CompletableFuture<HttpResponseFor<PlanEntitlement>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanEntitlement>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: EntitlementUpdateParams
        ): CompletableFuture<HttpResponseFor<PlanEntitlement>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanEntitlement>>

        /**
         * Returns a raw HTTP response for `get /api/v1/plans/{planId}/entitlements`, but is
         * otherwise the same as [EntitlementServiceAsync.list].
         */
        fun list(planId: String): CompletableFuture<HttpResponseFor<EntitlementListResponse>> =
            list(planId, EntitlementListParams.none())

        /** @see list */
        fun list(
            planId: String,
            params: EntitlementListParams = EntitlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementListResponse>> =
            list(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see list */
        fun list(
            planId: String,
            params: EntitlementListParams = EntitlementListParams.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementListResponse>> =
            list(planId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: EntitlementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementListResponse>>

        /** @see list */
        fun list(
            params: EntitlementListParams
        ): CompletableFuture<HttpResponseFor<EntitlementListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            planId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntitlementListResponse>> =
            list(planId, EntitlementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/plans/{planId}/entitlements/{id}`, but is
         * otherwise the same as [EntitlementServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: EntitlementDeleteParams,
        ): CompletableFuture<HttpResponseFor<PlanEntitlement>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EntitlementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanEntitlement>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: EntitlementDeleteParams
        ): CompletableFuture<HttpResponseFor<PlanEntitlement>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EntitlementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanEntitlement>>
    }
}
