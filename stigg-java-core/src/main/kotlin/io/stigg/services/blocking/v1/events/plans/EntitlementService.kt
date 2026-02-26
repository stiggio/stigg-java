// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.plans

import com.google.errorprone.annotations.MustBeClosed
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

    /** Creates one or more entitlements (feature or credit) on a draft plan. */
    fun create(planId: String, params: EntitlementCreateParams): EntitlementCreateResponse =
        create(planId, params, RequestOptions.none())

    /** @see create */
    fun create(
        planId: String,
        params: EntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementCreateResponse = create(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see create */
    fun create(params: EntitlementCreateParams): EntitlementCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementCreateResponse

    /** Updates an existing entitlement on a draft plan. */
    fun update(id: String, params: EntitlementUpdateParams): PlanEntitlement =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanEntitlement = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: EntitlementUpdateParams): PlanEntitlement =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanEntitlement

    /** Retrieves a list of entitlements for a plan. */
    fun list(planId: String): EntitlementListResponse = list(planId, EntitlementListParams.none())

    /** @see list */
    fun list(
        planId: String,
        params: EntitlementListParams = EntitlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementListResponse = list(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see list */
    fun list(
        planId: String,
        params: EntitlementListParams = EntitlementListParams.none(),
    ): EntitlementListResponse = list(planId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EntitlementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementListResponse

    /** @see list */
    fun list(params: EntitlementListParams): EntitlementListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(planId: String, requestOptions: RequestOptions): EntitlementListResponse =
        list(planId, EntitlementListParams.none(), requestOptions)

    /** Deletes an entitlement from a draft plan. */
    fun delete(id: String, params: EntitlementDeleteParams): PlanEntitlement =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EntitlementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanEntitlement = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: EntitlementDeleteParams): PlanEntitlement =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EntitlementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanEntitlement

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
         * Returns a raw HTTP response for `post /api/v1/plans/{planId}/entitlements`, but is
         * otherwise the same as [EntitlementService.create].
         */
        @MustBeClosed
        fun create(
            planId: String,
            params: EntitlementCreateParams,
        ): HttpResponseFor<EntitlementCreateResponse> =
            create(planId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            planId: String,
            params: EntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementCreateResponse> =
            create(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: EntitlementCreateParams): HttpResponseFor<EntitlementCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/plans/{planId}/entitlements/{id}`, but is
         * otherwise the same as [EntitlementService.update].
         */
        @MustBeClosed
        fun update(id: String, params: EntitlementUpdateParams): HttpResponseFor<PlanEntitlement> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanEntitlement> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: EntitlementUpdateParams): HttpResponseFor<PlanEntitlement> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanEntitlement>

        /**
         * Returns a raw HTTP response for `get /api/v1/plans/{planId}/entitlements`, but is
         * otherwise the same as [EntitlementService.list].
         */
        @MustBeClosed
        fun list(planId: String): HttpResponseFor<EntitlementListResponse> =
            list(planId, EntitlementListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            planId: String,
            params: EntitlementListParams = EntitlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementListResponse> =
            list(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            planId: String,
            params: EntitlementListParams = EntitlementListParams.none(),
        ): HttpResponseFor<EntitlementListResponse> = list(planId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EntitlementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: EntitlementListParams): HttpResponseFor<EntitlementListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            planId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementListResponse> =
            list(planId, EntitlementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/plans/{planId}/entitlements/{id}`, but is
         * otherwise the same as [EntitlementService.delete].
         */
        @MustBeClosed
        fun delete(id: String, params: EntitlementDeleteParams): HttpResponseFor<PlanEntitlement> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EntitlementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanEntitlement> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: EntitlementDeleteParams): HttpResponseFor<PlanEntitlement> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EntitlementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanEntitlement>
    }
}
