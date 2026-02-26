// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.addons.SetPackagePricingResponse
import io.stigg.models.v1.plans.Plan
import io.stigg.models.v1.plans.PlanArchiveParams
import io.stigg.models.v1.plans.PlanCreateDraftParams
import io.stigg.models.v1.plans.PlanCreateParams
import io.stigg.models.v1.plans.PlanListPage
import io.stigg.models.v1.plans.PlanListParams
import io.stigg.models.v1.plans.PlanPublishParams
import io.stigg.models.v1.plans.PlanPublishResponse
import io.stigg.models.v1.plans.PlanRemoveDraftParams
import io.stigg.models.v1.plans.PlanRemoveDraftResponse
import io.stigg.models.v1.plans.PlanRetrieveParams
import io.stigg.models.v1.plans.PlanSetPricingParams
import io.stigg.models.v1.plans.PlanUpdateParams
import io.stigg.services.blocking.v1.plans.EntitlementService
import java.util.function.Consumer

interface PlanService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService

    fun entitlements(): EntitlementService

    /** Creates a new plan in draft status. */
    fun create(params: PlanCreateParams): Plan = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** Retrieves a plan by its unique identifier, including entitlements and pricing details. */
    fun retrieve(id: String): Plan = retrieve(id, PlanRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PlanRetrieveParams = PlanRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: PlanRetrieveParams = PlanRetrieveParams.none()): Plan =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** @see retrieve */
    fun retrieve(params: PlanRetrieveParams): Plan = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Plan =
        retrieve(id, PlanRetrieveParams.none(), requestOptions)

    /** Updates an existing plan's properties such as display name, description, and metadata. */
    fun update(id: String): Plan = update(id, PlanUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: PlanUpdateParams = PlanUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: PlanUpdateParams = PlanUpdateParams.none()): Plan =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** @see update */
    fun update(params: PlanUpdateParams): Plan = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): Plan =
        update(id, PlanUpdateParams.none(), requestOptions)

    /** Retrieves a paginated list of plans in the environment. */
    fun list(): PlanListPage = list(PlanListParams.none())

    /** @see list */
    fun list(
        params: PlanListParams = PlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListPage

    /** @see list */
    fun list(params: PlanListParams = PlanListParams.none()): PlanListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PlanListPage =
        list(PlanListParams.none(), requestOptions)

    /** Archives a plan, preventing it from being used in new subscriptions. */
    fun archive(id: String): Plan = archive(id, PlanArchiveParams.none())

    /** @see archive */
    fun archive(
        id: String,
        params: PlanArchiveParams = PlanArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(id: String, params: PlanArchiveParams = PlanArchiveParams.none()): Plan =
        archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: PlanArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** @see archive */
    fun archive(params: PlanArchiveParams): Plan = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions): Plan =
        archive(id, PlanArchiveParams.none(), requestOptions)

    /** Creates a draft version of an existing plan for modification before publishing. */
    fun createDraft(id: String): Plan = createDraft(id, PlanCreateDraftParams.none())

    /** @see createDraft */
    fun createDraft(
        id: String,
        params: PlanCreateDraftParams = PlanCreateDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan = createDraft(params.toBuilder().id(id).build(), requestOptions)

    /** @see createDraft */
    fun createDraft(
        id: String,
        params: PlanCreateDraftParams = PlanCreateDraftParams.none(),
    ): Plan = createDraft(id, params, RequestOptions.none())

    /** @see createDraft */
    fun createDraft(
        params: PlanCreateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** @see createDraft */
    fun createDraft(params: PlanCreateDraftParams): Plan =
        createDraft(params, RequestOptions.none())

    /** @see createDraft */
    fun createDraft(id: String, requestOptions: RequestOptions): Plan =
        createDraft(id, PlanCreateDraftParams.none(), requestOptions)

    /** Publishes a draft plan, making it available for use in subscriptions. */
    fun publish(id: String, params: PlanPublishParams): PlanPublishResponse =
        publish(id, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        id: String,
        params: PlanPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanPublishResponse = publish(params.toBuilder().id(id).build(), requestOptions)

    /** @see publish */
    fun publish(params: PlanPublishParams): PlanPublishResponse =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: PlanPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanPublishResponse

    /** Removes a draft version of a plan. */
    fun removeDraft(id: String): PlanRemoveDraftResponse =
        removeDraft(id, PlanRemoveDraftParams.none())

    /** @see removeDraft */
    fun removeDraft(
        id: String,
        params: PlanRemoveDraftParams = PlanRemoveDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanRemoveDraftResponse = removeDraft(params.toBuilder().id(id).build(), requestOptions)

    /** @see removeDraft */
    fun removeDraft(
        id: String,
        params: PlanRemoveDraftParams = PlanRemoveDraftParams.none(),
    ): PlanRemoveDraftResponse = removeDraft(id, params, RequestOptions.none())

    /** @see removeDraft */
    fun removeDraft(
        params: PlanRemoveDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanRemoveDraftResponse

    /** @see removeDraft */
    fun removeDraft(params: PlanRemoveDraftParams): PlanRemoveDraftResponse =
        removeDraft(params, RequestOptions.none())

    /** @see removeDraft */
    fun removeDraft(id: String, requestOptions: RequestOptions): PlanRemoveDraftResponse =
        removeDraft(id, PlanRemoveDraftParams.none(), requestOptions)

    /**
     * Sets the pricing configuration for a plan, including pricing models, overage pricing, and
     * minimum spend.
     */
    fun setPricing(id: String, params: PlanSetPricingParams): SetPackagePricingResponse =
        setPricing(id, params, RequestOptions.none())

    /** @see setPricing */
    fun setPricing(
        id: String,
        params: PlanSetPricingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SetPackagePricingResponse = setPricing(params.toBuilder().id(id).build(), requestOptions)

    /** @see setPricing */
    fun setPricing(params: PlanSetPricingParams): SetPackagePricingResponse =
        setPricing(params, RequestOptions.none())

    /** @see setPricing */
    fun setPricing(
        params: PlanSetPricingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SetPackagePricingResponse

    /** A view of [PlanService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService.WithRawResponse

        fun entitlements(): EntitlementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/plans`, but is otherwise the same as
         * [PlanService.create].
         */
        @MustBeClosed
        fun create(params: PlanCreateParams): HttpResponseFor<Plan> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /**
         * Returns a raw HTTP response for `get /api/v1/plans/{id}`, but is otherwise the same as
         * [PlanService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Plan> = retrieve(id, PlanRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanRetrieveParams = PlanRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanRetrieveParams = PlanRetrieveParams.none(),
        ): HttpResponseFor<Plan> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PlanRetrieveParams): HttpResponseFor<Plan> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Plan> =
            retrieve(id, PlanRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/plans/{id}`, but is otherwise the same as
         * [PlanService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<Plan> = update(id, PlanUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: PlanUpdateParams = PlanUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: PlanUpdateParams = PlanUpdateParams.none(),
        ): HttpResponseFor<Plan> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /** @see update */
        @MustBeClosed
        fun update(params: PlanUpdateParams): HttpResponseFor<Plan> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<Plan> =
            update(id, PlanUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/plans`, but is otherwise the same as
         * [PlanService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PlanListPage> = list(PlanListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PlanListParams = PlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: PlanListParams = PlanListParams.none()): HttpResponseFor<PlanListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PlanListPage> =
            list(PlanListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/plans/{id}/archive`, but is otherwise the
         * same as [PlanService.archive].
         */
        @MustBeClosed
        fun archive(id: String): HttpResponseFor<Plan> = archive(id, PlanArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: PlanArchiveParams = PlanArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan> = archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: PlanArchiveParams = PlanArchiveParams.none(),
        ): HttpResponseFor<Plan> = archive(id, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: PlanArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /** @see archive */
        @MustBeClosed
        fun archive(params: PlanArchiveParams): HttpResponseFor<Plan> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(id: String, requestOptions: RequestOptions): HttpResponseFor<Plan> =
            archive(id, PlanArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/plans/{id}/draft`, but is otherwise the
         * same as [PlanService.createDraft].
         */
        @MustBeClosed
        fun createDraft(id: String): HttpResponseFor<Plan> =
            createDraft(id, PlanCreateDraftParams.none())

        /** @see createDraft */
        @MustBeClosed
        fun createDraft(
            id: String,
            params: PlanCreateDraftParams = PlanCreateDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan> = createDraft(params.toBuilder().id(id).build(), requestOptions)

        /** @see createDraft */
        @MustBeClosed
        fun createDraft(
            id: String,
            params: PlanCreateDraftParams = PlanCreateDraftParams.none(),
        ): HttpResponseFor<Plan> = createDraft(id, params, RequestOptions.none())

        /** @see createDraft */
        @MustBeClosed
        fun createDraft(
            params: PlanCreateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /** @see createDraft */
        @MustBeClosed
        fun createDraft(params: PlanCreateDraftParams): HttpResponseFor<Plan> =
            createDraft(params, RequestOptions.none())

        /** @see createDraft */
        @MustBeClosed
        fun createDraft(id: String, requestOptions: RequestOptions): HttpResponseFor<Plan> =
            createDraft(id, PlanCreateDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/plans/{id}/publish`, but is otherwise the
         * same as [PlanService.publish].
         */
        @MustBeClosed
        fun publish(id: String, params: PlanPublishParams): HttpResponseFor<PlanPublishResponse> =
            publish(id, params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            id: String,
            params: PlanPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanPublishResponse> =
            publish(params.toBuilder().id(id).build(), requestOptions)

        /** @see publish */
        @MustBeClosed
        fun publish(params: PlanPublishParams): HttpResponseFor<PlanPublishResponse> =
            publish(params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: PlanPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanPublishResponse>

        /**
         * Returns a raw HTTP response for `delete /api/v1/plans/{id}/draft`, but is otherwise the
         * same as [PlanService.removeDraft].
         */
        @MustBeClosed
        fun removeDraft(id: String): HttpResponseFor<PlanRemoveDraftResponse> =
            removeDraft(id, PlanRemoveDraftParams.none())

        /** @see removeDraft */
        @MustBeClosed
        fun removeDraft(
            id: String,
            params: PlanRemoveDraftParams = PlanRemoveDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanRemoveDraftResponse> =
            removeDraft(params.toBuilder().id(id).build(), requestOptions)

        /** @see removeDraft */
        @MustBeClosed
        fun removeDraft(
            id: String,
            params: PlanRemoveDraftParams = PlanRemoveDraftParams.none(),
        ): HttpResponseFor<PlanRemoveDraftResponse> = removeDraft(id, params, RequestOptions.none())

        /** @see removeDraft */
        @MustBeClosed
        fun removeDraft(
            params: PlanRemoveDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanRemoveDraftResponse>

        /** @see removeDraft */
        @MustBeClosed
        fun removeDraft(params: PlanRemoveDraftParams): HttpResponseFor<PlanRemoveDraftResponse> =
            removeDraft(params, RequestOptions.none())

        /** @see removeDraft */
        @MustBeClosed
        fun removeDraft(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanRemoveDraftResponse> =
            removeDraft(id, PlanRemoveDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/plans/{id}/charges`, but is otherwise the
         * same as [PlanService.setPricing].
         */
        @MustBeClosed
        fun setPricing(
            id: String,
            params: PlanSetPricingParams,
        ): HttpResponseFor<SetPackagePricingResponse> =
            setPricing(id, params, RequestOptions.none())

        /** @see setPricing */
        @MustBeClosed
        fun setPricing(
            id: String,
            params: PlanSetPricingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SetPackagePricingResponse> =
            setPricing(params.toBuilder().id(id).build(), requestOptions)

        /** @see setPricing */
        @MustBeClosed
        fun setPricing(params: PlanSetPricingParams): HttpResponseFor<SetPackagePricingResponse> =
            setPricing(params, RequestOptions.none())

        /** @see setPricing */
        @MustBeClosed
        fun setPricing(
            params: PlanSetPricingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SetPackagePricingResponse>
    }
}
