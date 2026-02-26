// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.addons.Addon
import io.stigg.models.v1.addons.AddonArchiveParams
import io.stigg.models.v1.addons.AddonCreateDraftParams
import io.stigg.models.v1.addons.AddonCreateParams
import io.stigg.models.v1.addons.AddonListPageAsync
import io.stigg.models.v1.addons.AddonListParams
import io.stigg.models.v1.addons.AddonPublishParams
import io.stigg.models.v1.addons.AddonPublishResponse
import io.stigg.models.v1.addons.AddonRemoveDraftParams
import io.stigg.models.v1.addons.AddonRemoveDraftResponse
import io.stigg.models.v1.addons.AddonRetrieveParams
import io.stigg.models.v1.addons.AddonSetPricingParams
import io.stigg.models.v1.addons.AddonUpdateParams
import io.stigg.models.v1.addons.SetPackagePricingResponse
import io.stigg.services.async.v1.addons.EntitlementServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AddonServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddonServiceAsync

    fun entitlements(): EntitlementServiceAsync

    /** Creates a new addon in draft status, associated with a specific product. */
    fun create(params: AddonCreateParams): CompletableFuture<Addon> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AddonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon>

    /** Retrieves an addon by its unique identifier, including entitlements and pricing details. */
    fun retrieve(id: String): CompletableFuture<Addon> = retrieve(id, AddonRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AddonRetrieveParams = AddonRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AddonRetrieveParams = AddonRetrieveParams.none(),
    ): CompletableFuture<Addon> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AddonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon>

    /** @see retrieve */
    fun retrieve(params: AddonRetrieveParams): CompletableFuture<Addon> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Addon> =
        retrieve(id, AddonRetrieveParams.none(), requestOptions)

    /** Updates an existing addon's properties such as display name, description, and metadata. */
    fun update(id: String): CompletableFuture<Addon> = update(id, AddonUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AddonUpdateParams = AddonUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: AddonUpdateParams = AddonUpdateParams.none(),
    ): CompletableFuture<Addon> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AddonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon>

    /** @see update */
    fun update(params: AddonUpdateParams): CompletableFuture<Addon> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Addon> =
        update(id, AddonUpdateParams.none(), requestOptions)

    /** Retrieves a paginated list of addons in the environment. */
    fun list(): CompletableFuture<AddonListPageAsync> = list(AddonListParams.none())

    /** @see list */
    fun list(
        params: AddonListParams = AddonListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonListPageAsync>

    /** @see list */
    fun list(
        params: AddonListParams = AddonListParams.none()
    ): CompletableFuture<AddonListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AddonListPageAsync> =
        list(AddonListParams.none(), requestOptions)

    /** Archives an addon, preventing it from being used in new subscriptions. */
    fun archive(id: String): CompletableFuture<Addon> = archive(id, AddonArchiveParams.none())

    /** @see archive */
    fun archive(
        id: String,
        params: AddonArchiveParams = AddonArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon> = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(
        id: String,
        params: AddonArchiveParams = AddonArchiveParams.none(),
    ): CompletableFuture<Addon> = archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: AddonArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon>

    /** @see archive */
    fun archive(params: AddonArchiveParams): CompletableFuture<Addon> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions): CompletableFuture<Addon> =
        archive(id, AddonArchiveParams.none(), requestOptions)

    /** Creates a draft version of an existing addon for modification before publishing. */
    fun createDraft(id: String): CompletableFuture<Addon> =
        createDraft(id, AddonCreateDraftParams.none())

    /** @see createDraft */
    fun createDraft(
        id: String,
        params: AddonCreateDraftParams = AddonCreateDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon> = createDraft(params.toBuilder().id(id).build(), requestOptions)

    /** @see createDraft */
    fun createDraft(
        id: String,
        params: AddonCreateDraftParams = AddonCreateDraftParams.none(),
    ): CompletableFuture<Addon> = createDraft(id, params, RequestOptions.none())

    /** @see createDraft */
    fun createDraft(
        params: AddonCreateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon>

    /** @see createDraft */
    fun createDraft(params: AddonCreateDraftParams): CompletableFuture<Addon> =
        createDraft(params, RequestOptions.none())

    /** @see createDraft */
    fun createDraft(id: String, requestOptions: RequestOptions): CompletableFuture<Addon> =
        createDraft(id, AddonCreateDraftParams.none(), requestOptions)

    /** Publishes a draft addon, making it available for use in subscriptions. */
    fun publish(id: String, params: AddonPublishParams): CompletableFuture<AddonPublishResponse> =
        publish(id, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        id: String,
        params: AddonPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonPublishResponse> =
        publish(params.toBuilder().id(id).build(), requestOptions)

    /** @see publish */
    fun publish(params: AddonPublishParams): CompletableFuture<AddonPublishResponse> =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: AddonPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonPublishResponse>

    /** Removes a draft version of an addon. */
    fun removeDraft(id: String): CompletableFuture<AddonRemoveDraftResponse> =
        removeDraft(id, AddonRemoveDraftParams.none())

    /** @see removeDraft */
    fun removeDraft(
        id: String,
        params: AddonRemoveDraftParams = AddonRemoveDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonRemoveDraftResponse> =
        removeDraft(params.toBuilder().id(id).build(), requestOptions)

    /** @see removeDraft */
    fun removeDraft(
        id: String,
        params: AddonRemoveDraftParams = AddonRemoveDraftParams.none(),
    ): CompletableFuture<AddonRemoveDraftResponse> = removeDraft(id, params, RequestOptions.none())

    /** @see removeDraft */
    fun removeDraft(
        params: AddonRemoveDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonRemoveDraftResponse>

    /** @see removeDraft */
    fun removeDraft(params: AddonRemoveDraftParams): CompletableFuture<AddonRemoveDraftResponse> =
        removeDraft(params, RequestOptions.none())

    /** @see removeDraft */
    fun removeDraft(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddonRemoveDraftResponse> =
        removeDraft(id, AddonRemoveDraftParams.none(), requestOptions)

    /** Sets the pricing configuration for an addon. */
    fun setPricing(
        id: String,
        params: AddonSetPricingParams,
    ): CompletableFuture<SetPackagePricingResponse> = setPricing(id, params, RequestOptions.none())

    /** @see setPricing */
    fun setPricing(
        id: String,
        params: AddonSetPricingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SetPackagePricingResponse> =
        setPricing(params.toBuilder().id(id).build(), requestOptions)

    /** @see setPricing */
    fun setPricing(params: AddonSetPricingParams): CompletableFuture<SetPackagePricingResponse> =
        setPricing(params, RequestOptions.none())

    /** @see setPricing */
    fun setPricing(
        params: AddonSetPricingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SetPackagePricingResponse>

    /** A view of [AddonServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AddonServiceAsync.WithRawResponse

        fun entitlements(): EntitlementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/addons`, but is otherwise the same as
         * [AddonServiceAsync.create].
         */
        fun create(params: AddonCreateParams): CompletableFuture<HttpResponseFor<Addon>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AddonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>>

        /**
         * Returns a raw HTTP response for `get /api/v1/addons/{id}`, but is otherwise the same as
         * [AddonServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Addon>> =
            retrieve(id, AddonRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AddonRetrieveParams = AddonRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AddonRetrieveParams = AddonRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AddonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>>

        /** @see retrieve */
        fun retrieve(params: AddonRetrieveParams): CompletableFuture<HttpResponseFor<Addon>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Addon>> =
            retrieve(id, AddonRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/addons/{id}`, but is otherwise the same as
         * [AddonServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<Addon>> =
            update(id, AddonUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: AddonUpdateParams = AddonUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: AddonUpdateParams = AddonUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AddonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>>

        /** @see update */
        fun update(params: AddonUpdateParams): CompletableFuture<HttpResponseFor<Addon>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Addon>> =
            update(id, AddonUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/addons`, but is otherwise the same as
         * [AddonServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AddonListPageAsync>> =
            list(AddonListParams.none())

        /** @see list */
        fun list(
            params: AddonListParams = AddonListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonListPageAsync>>

        /** @see list */
        fun list(
            params: AddonListParams = AddonListParams.none()
        ): CompletableFuture<HttpResponseFor<AddonListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AddonListPageAsync>> =
            list(AddonListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/addons/{id}/archive`, but is otherwise the
         * same as [AddonServiceAsync.archive].
         */
        fun archive(id: String): CompletableFuture<HttpResponseFor<Addon>> =
            archive(id, AddonArchiveParams.none())

        /** @see archive */
        fun archive(
            id: String,
            params: AddonArchiveParams = AddonArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        fun archive(
            id: String,
            params: AddonArchiveParams = AddonArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> = archive(id, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: AddonArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>>

        /** @see archive */
        fun archive(params: AddonArchiveParams): CompletableFuture<HttpResponseFor<Addon>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Addon>> =
            archive(id, AddonArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/addons/{id}/draft`, but is otherwise the
         * same as [AddonServiceAsync.createDraft].
         */
        fun createDraft(id: String): CompletableFuture<HttpResponseFor<Addon>> =
            createDraft(id, AddonCreateDraftParams.none())

        /** @see createDraft */
        fun createDraft(
            id: String,
            params: AddonCreateDraftParams = AddonCreateDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            createDraft(params.toBuilder().id(id).build(), requestOptions)

        /** @see createDraft */
        fun createDraft(
            id: String,
            params: AddonCreateDraftParams = AddonCreateDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            createDraft(id, params, RequestOptions.none())

        /** @see createDraft */
        fun createDraft(
            params: AddonCreateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>>

        /** @see createDraft */
        fun createDraft(params: AddonCreateDraftParams): CompletableFuture<HttpResponseFor<Addon>> =
            createDraft(params, RequestOptions.none())

        /** @see createDraft */
        fun createDraft(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Addon>> =
            createDraft(id, AddonCreateDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/addons/{id}/publish`, but is otherwise the
         * same as [AddonServiceAsync.publish].
         */
        fun publish(
            id: String,
            params: AddonPublishParams,
        ): CompletableFuture<HttpResponseFor<AddonPublishResponse>> =
            publish(id, params, RequestOptions.none())

        /** @see publish */
        fun publish(
            id: String,
            params: AddonPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonPublishResponse>> =
            publish(params.toBuilder().id(id).build(), requestOptions)

        /** @see publish */
        fun publish(
            params: AddonPublishParams
        ): CompletableFuture<HttpResponseFor<AddonPublishResponse>> =
            publish(params, RequestOptions.none())

        /** @see publish */
        fun publish(
            params: AddonPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonPublishResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/addons/{id}/draft`, but is otherwise the
         * same as [AddonServiceAsync.removeDraft].
         */
        fun removeDraft(id: String): CompletableFuture<HttpResponseFor<AddonRemoveDraftResponse>> =
            removeDraft(id, AddonRemoveDraftParams.none())

        /** @see removeDraft */
        fun removeDraft(
            id: String,
            params: AddonRemoveDraftParams = AddonRemoveDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonRemoveDraftResponse>> =
            removeDraft(params.toBuilder().id(id).build(), requestOptions)

        /** @see removeDraft */
        fun removeDraft(
            id: String,
            params: AddonRemoveDraftParams = AddonRemoveDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<AddonRemoveDraftResponse>> =
            removeDraft(id, params, RequestOptions.none())

        /** @see removeDraft */
        fun removeDraft(
            params: AddonRemoveDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonRemoveDraftResponse>>

        /** @see removeDraft */
        fun removeDraft(
            params: AddonRemoveDraftParams
        ): CompletableFuture<HttpResponseFor<AddonRemoveDraftResponse>> =
            removeDraft(params, RequestOptions.none())

        /** @see removeDraft */
        fun removeDraft(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddonRemoveDraftResponse>> =
            removeDraft(id, AddonRemoveDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/addons/{id}/charges`, but is otherwise the
         * same as [AddonServiceAsync.setPricing].
         */
        fun setPricing(
            id: String,
            params: AddonSetPricingParams,
        ): CompletableFuture<HttpResponseFor<SetPackagePricingResponse>> =
            setPricing(id, params, RequestOptions.none())

        /** @see setPricing */
        fun setPricing(
            id: String,
            params: AddonSetPricingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SetPackagePricingResponse>> =
            setPricing(params.toBuilder().id(id).build(), requestOptions)

        /** @see setPricing */
        fun setPricing(
            params: AddonSetPricingParams
        ): CompletableFuture<HttpResponseFor<SetPackagePricingResponse>> =
            setPricing(params, RequestOptions.none())

        /** @see setPricing */
        fun setPricing(
            params: AddonSetPricingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SetPackagePricingResponse>>
    }
}
