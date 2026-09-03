// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.plans.Plan
import io.stigg.models.v1.plans.PlanArchiveParams
import io.stigg.models.v1.plans.PlanCreateDraftParams
import io.stigg.models.v1.plans.PlanCreateParams
import io.stigg.models.v1.plans.PlanListChargesPageAsync
import io.stigg.models.v1.plans.PlanListChargesParams
import io.stigg.models.v1.plans.PlanListOverageChargesPageAsync
import io.stigg.models.v1.plans.PlanListOverageChargesParams
import io.stigg.models.v1.plans.PlanListPageAsync
import io.stigg.models.v1.plans.PlanListParams
import io.stigg.models.v1.plans.PlanPublishParams
import io.stigg.models.v1.plans.PlanPublishResponse
import io.stigg.models.v1.plans.PlanRemoveDraftParams
import io.stigg.models.v1.plans.PlanRemoveDraftResponse
import io.stigg.models.v1.plans.PlanRetrieveParams
import io.stigg.models.v1.plans.PlanUpdateParams
import io.stigg.services.async.v1.plans.EntitlementServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations related to plans */
interface PlanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanServiceAsync

    fun entitlements(): EntitlementServiceAsync

    /** Creates a new plan in draft status. */
    fun create(params: PlanCreateParams): CompletableFuture<Plan> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /** Retrieves a plan by its unique identifier, including entitlements and pricing details. */
    fun retrieve(id: String): CompletableFuture<Plan> = retrieve(id, PlanRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PlanRetrieveParams = PlanRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PlanRetrieveParams = PlanRetrieveParams.none(),
    ): CompletableFuture<Plan> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /** @see retrieve */
    fun retrieve(params: PlanRetrieveParams): CompletableFuture<Plan> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Plan> =
        retrieve(id, PlanRetrieveParams.none(), requestOptions)

    /** Updates an existing plan's properties such as display name, description, and metadata. */
    fun update(id: String): CompletableFuture<Plan> = update(id, PlanUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: PlanUpdateParams = PlanUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: PlanUpdateParams = PlanUpdateParams.none(),
    ): CompletableFuture<Plan> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /** @see update */
    fun update(params: PlanUpdateParams): CompletableFuture<Plan> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Plan> =
        update(id, PlanUpdateParams.none(), requestOptions)

    /** Retrieves a paginated list of plans in the environment. */
    fun list(): CompletableFuture<PlanListPageAsync> = list(PlanListParams.none())

    /** @see list */
    fun list(
        params: PlanListParams = PlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListPageAsync>

    /** @see list */
    fun list(params: PlanListParams = PlanListParams.none()): CompletableFuture<PlanListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PlanListPageAsync> =
        list(PlanListParams.none(), requestOptions)

    /** Archives a plan, preventing it from being used in new subscriptions. */
    fun archive(id: String): CompletableFuture<Plan> = archive(id, PlanArchiveParams.none())

    /** @see archive */
    fun archive(
        id: String,
        params: PlanArchiveParams = PlanArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan> = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(
        id: String,
        params: PlanArchiveParams = PlanArchiveParams.none(),
    ): CompletableFuture<Plan> = archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: PlanArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /** @see archive */
    fun archive(params: PlanArchiveParams): CompletableFuture<Plan> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions): CompletableFuture<Plan> =
        archive(id, PlanArchiveParams.none(), requestOptions)

    /** Creates a draft version of an existing plan for modification before publishing. */
    fun createDraft(id: String): CompletableFuture<Plan> =
        createDraft(id, PlanCreateDraftParams.none())

    /** @see createDraft */
    fun createDraft(
        id: String,
        params: PlanCreateDraftParams = PlanCreateDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan> = createDraft(params.toBuilder().id(id).build(), requestOptions)

    /** @see createDraft */
    fun createDraft(
        id: String,
        params: PlanCreateDraftParams = PlanCreateDraftParams.none(),
    ): CompletableFuture<Plan> = createDraft(id, params, RequestOptions.none())

    /** @see createDraft */
    fun createDraft(
        params: PlanCreateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /** @see createDraft */
    fun createDraft(params: PlanCreateDraftParams): CompletableFuture<Plan> =
        createDraft(params, RequestOptions.none())

    /** @see createDraft */
    fun createDraft(id: String, requestOptions: RequestOptions): CompletableFuture<Plan> =
        createDraft(id, PlanCreateDraftParams.none(), requestOptions)

    /** Retrieves the list of charges configured on a plan. */
    fun listCharges(id: String): CompletableFuture<PlanListChargesPageAsync> =
        listCharges(id, PlanListChargesParams.none())

    /** @see listCharges */
    fun listCharges(
        id: String,
        params: PlanListChargesParams = PlanListChargesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListChargesPageAsync> =
        listCharges(params.toBuilder().id(id).build(), requestOptions)

    /** @see listCharges */
    fun listCharges(
        id: String,
        params: PlanListChargesParams = PlanListChargesParams.none(),
    ): CompletableFuture<PlanListChargesPageAsync> = listCharges(id, params, RequestOptions.none())

    /** @see listCharges */
    fun listCharges(
        params: PlanListChargesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListChargesPageAsync>

    /** @see listCharges */
    fun listCharges(params: PlanListChargesParams): CompletableFuture<PlanListChargesPageAsync> =
        listCharges(params, RequestOptions.none())

    /** @see listCharges */
    fun listCharges(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanListChargesPageAsync> =
        listCharges(id, PlanListChargesParams.none(), requestOptions)

    /** Retrieves the list of overage charges configured on a plan. */
    fun listOverageCharges(id: String): CompletableFuture<PlanListOverageChargesPageAsync> =
        listOverageCharges(id, PlanListOverageChargesParams.none())

    /** @see listOverageCharges */
    fun listOverageCharges(
        id: String,
        params: PlanListOverageChargesParams = PlanListOverageChargesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListOverageChargesPageAsync> =
        listOverageCharges(params.toBuilder().id(id).build(), requestOptions)

    /** @see listOverageCharges */
    fun listOverageCharges(
        id: String,
        params: PlanListOverageChargesParams = PlanListOverageChargesParams.none(),
    ): CompletableFuture<PlanListOverageChargesPageAsync> =
        listOverageCharges(id, params, RequestOptions.none())

    /** @see listOverageCharges */
    fun listOverageCharges(
        params: PlanListOverageChargesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListOverageChargesPageAsync>

    /** @see listOverageCharges */
    fun listOverageCharges(
        params: PlanListOverageChargesParams
    ): CompletableFuture<PlanListOverageChargesPageAsync> =
        listOverageCharges(params, RequestOptions.none())

    /** @see listOverageCharges */
    fun listOverageCharges(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanListOverageChargesPageAsync> =
        listOverageCharges(id, PlanListOverageChargesParams.none(), requestOptions)

    /**
     * Publishes a draft plan, making it available for use in subscriptions. The required
     * `migrationType` field controls whether existing subscribers are moved onto the new version
     * immediately (`ALL_CUSTOMERS`) or stay on the version they subscribed to — grandfathered —
     * until you explicitly migrate them, e.g. via the migrate subscription endpoint
     * (`NEW_CUSTOMERS`).
     */
    fun publish(id: String, params: PlanPublishParams): CompletableFuture<PlanPublishResponse> =
        publish(id, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        id: String,
        params: PlanPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanPublishResponse> =
        publish(params.toBuilder().id(id).build(), requestOptions)

    /** @see publish */
    fun publish(params: PlanPublishParams): CompletableFuture<PlanPublishResponse> =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: PlanPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanPublishResponse>

    /** Removes a draft version of a plan. */
    fun removeDraft(id: String): CompletableFuture<PlanRemoveDraftResponse> =
        removeDraft(id, PlanRemoveDraftParams.none())

    /** @see removeDraft */
    fun removeDraft(
        id: String,
        params: PlanRemoveDraftParams = PlanRemoveDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanRemoveDraftResponse> =
        removeDraft(params.toBuilder().id(id).build(), requestOptions)

    /** @see removeDraft */
    fun removeDraft(
        id: String,
        params: PlanRemoveDraftParams = PlanRemoveDraftParams.none(),
    ): CompletableFuture<PlanRemoveDraftResponse> = removeDraft(id, params, RequestOptions.none())

    /** @see removeDraft */
    fun removeDraft(
        params: PlanRemoveDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanRemoveDraftResponse>

    /** @see removeDraft */
    fun removeDraft(params: PlanRemoveDraftParams): CompletableFuture<PlanRemoveDraftResponse> =
        removeDraft(params, RequestOptions.none())

    /** @see removeDraft */
    fun removeDraft(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanRemoveDraftResponse> =
        removeDraft(id, PlanRemoveDraftParams.none(), requestOptions)

    /** A view of [PlanServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanServiceAsync.WithRawResponse

        fun entitlements(): EntitlementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/plans`, but is otherwise the same as
         * [PlanServiceAsync.create].
         */
        fun create(params: PlanCreateParams): CompletableFuture<HttpResponseFor<Plan>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>

        /**
         * Returns a raw HTTP response for `get /api/v1/plans/{id}`, but is otherwise the same as
         * [PlanServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Plan>> =
            retrieve(id, PlanRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PlanRetrieveParams = PlanRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PlanRetrieveParams = PlanRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>

        /** @see retrieve */
        fun retrieve(params: PlanRetrieveParams): CompletableFuture<HttpResponseFor<Plan>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Plan>> =
            retrieve(id, PlanRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/plans/{id}`, but is otherwise the same as
         * [PlanServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<Plan>> =
            update(id, PlanUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: PlanUpdateParams = PlanUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: PlanUpdateParams = PlanUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>

        /** @see update */
        fun update(params: PlanUpdateParams): CompletableFuture<HttpResponseFor<Plan>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Plan>> =
            update(id, PlanUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/plans`, but is otherwise the same as
         * [PlanServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(PlanListParams.none())

        /** @see list */
        fun list(
            params: PlanListParams = PlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>>

        /** @see list */
        fun list(
            params: PlanListParams = PlanListParams.none()
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(PlanListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/plans/{id}/archive`, but is otherwise the
         * same as [PlanServiceAsync.archive].
         */
        fun archive(id: String): CompletableFuture<HttpResponseFor<Plan>> =
            archive(id, PlanArchiveParams.none())

        /** @see archive */
        fun archive(
            id: String,
            params: PlanArchiveParams = PlanArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> =
            archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        fun archive(
            id: String,
            params: PlanArchiveParams = PlanArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> = archive(id, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: PlanArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>

        /** @see archive */
        fun archive(params: PlanArchiveParams): CompletableFuture<HttpResponseFor<Plan>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Plan>> =
            archive(id, PlanArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/plans/{id}/draft`, but is otherwise the
         * same as [PlanServiceAsync.createDraft].
         */
        fun createDraft(id: String): CompletableFuture<HttpResponseFor<Plan>> =
            createDraft(id, PlanCreateDraftParams.none())

        /** @see createDraft */
        fun createDraft(
            id: String,
            params: PlanCreateDraftParams = PlanCreateDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> =
            createDraft(params.toBuilder().id(id).build(), requestOptions)

        /** @see createDraft */
        fun createDraft(
            id: String,
            params: PlanCreateDraftParams = PlanCreateDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> = createDraft(id, params, RequestOptions.none())

        /** @see createDraft */
        fun createDraft(
            params: PlanCreateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>

        /** @see createDraft */
        fun createDraft(params: PlanCreateDraftParams): CompletableFuture<HttpResponseFor<Plan>> =
            createDraft(params, RequestOptions.none())

        /** @see createDraft */
        fun createDraft(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Plan>> =
            createDraft(id, PlanCreateDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/plans/{id}/charges`, but is otherwise the
         * same as [PlanServiceAsync.listCharges].
         */
        fun listCharges(id: String): CompletableFuture<HttpResponseFor<PlanListChargesPageAsync>> =
            listCharges(id, PlanListChargesParams.none())

        /** @see listCharges */
        fun listCharges(
            id: String,
            params: PlanListChargesParams = PlanListChargesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListChargesPageAsync>> =
            listCharges(params.toBuilder().id(id).build(), requestOptions)

        /** @see listCharges */
        fun listCharges(
            id: String,
            params: PlanListChargesParams = PlanListChargesParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanListChargesPageAsync>> =
            listCharges(id, params, RequestOptions.none())

        /** @see listCharges */
        fun listCharges(
            params: PlanListChargesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListChargesPageAsync>>

        /** @see listCharges */
        fun listCharges(
            params: PlanListChargesParams
        ): CompletableFuture<HttpResponseFor<PlanListChargesPageAsync>> =
            listCharges(params, RequestOptions.none())

        /** @see listCharges */
        fun listCharges(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanListChargesPageAsync>> =
            listCharges(id, PlanListChargesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/plans/{id}/overage-charges`, but is
         * otherwise the same as [PlanServiceAsync.listOverageCharges].
         */
        fun listOverageCharges(
            id: String
        ): CompletableFuture<HttpResponseFor<PlanListOverageChargesPageAsync>> =
            listOverageCharges(id, PlanListOverageChargesParams.none())

        /** @see listOverageCharges */
        fun listOverageCharges(
            id: String,
            params: PlanListOverageChargesParams = PlanListOverageChargesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListOverageChargesPageAsync>> =
            listOverageCharges(params.toBuilder().id(id).build(), requestOptions)

        /** @see listOverageCharges */
        fun listOverageCharges(
            id: String,
            params: PlanListOverageChargesParams = PlanListOverageChargesParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanListOverageChargesPageAsync>> =
            listOverageCharges(id, params, RequestOptions.none())

        /** @see listOverageCharges */
        fun listOverageCharges(
            params: PlanListOverageChargesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListOverageChargesPageAsync>>

        /** @see listOverageCharges */
        fun listOverageCharges(
            params: PlanListOverageChargesParams
        ): CompletableFuture<HttpResponseFor<PlanListOverageChargesPageAsync>> =
            listOverageCharges(params, RequestOptions.none())

        /** @see listOverageCharges */
        fun listOverageCharges(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanListOverageChargesPageAsync>> =
            listOverageCharges(id, PlanListOverageChargesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/plans/{id}/publish`, but is otherwise the
         * same as [PlanServiceAsync.publish].
         */
        fun publish(
            id: String,
            params: PlanPublishParams,
        ): CompletableFuture<HttpResponseFor<PlanPublishResponse>> =
            publish(id, params, RequestOptions.none())

        /** @see publish */
        fun publish(
            id: String,
            params: PlanPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanPublishResponse>> =
            publish(params.toBuilder().id(id).build(), requestOptions)

        /** @see publish */
        fun publish(
            params: PlanPublishParams
        ): CompletableFuture<HttpResponseFor<PlanPublishResponse>> =
            publish(params, RequestOptions.none())

        /** @see publish */
        fun publish(
            params: PlanPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanPublishResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/plans/{id}/draft`, but is otherwise the
         * same as [PlanServiceAsync.removeDraft].
         */
        fun removeDraft(id: String): CompletableFuture<HttpResponseFor<PlanRemoveDraftResponse>> =
            removeDraft(id, PlanRemoveDraftParams.none())

        /** @see removeDraft */
        fun removeDraft(
            id: String,
            params: PlanRemoveDraftParams = PlanRemoveDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanRemoveDraftResponse>> =
            removeDraft(params.toBuilder().id(id).build(), requestOptions)

        /** @see removeDraft */
        fun removeDraft(
            id: String,
            params: PlanRemoveDraftParams = PlanRemoveDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanRemoveDraftResponse>> =
            removeDraft(id, params, RequestOptions.none())

        /** @see removeDraft */
        fun removeDraft(
            params: PlanRemoveDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanRemoveDraftResponse>>

        /** @see removeDraft */
        fun removeDraft(
            params: PlanRemoveDraftParams
        ): CompletableFuture<HttpResponseFor<PlanRemoveDraftResponse>> =
            removeDraft(params, RequestOptions.none())

        /** @see removeDraft */
        fun removeDraft(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanRemoveDraftResponse>> =
            removeDraft(id, PlanRemoveDraftParams.none(), requestOptions)
    }
}
