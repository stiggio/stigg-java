// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.addons.Addon
import io.stigg.models.v1.addons.AddonArchiveParams
import io.stigg.models.v1.addons.AddonCreateDraftParams
import io.stigg.models.v1.addons.AddonCreateParams
import io.stigg.models.v1.addons.AddonListPage
import io.stigg.models.v1.addons.AddonListParams
import io.stigg.models.v1.addons.AddonPublishParams
import io.stigg.models.v1.addons.AddonPublishResponse
import io.stigg.models.v1.addons.AddonRemoveDraftParams
import io.stigg.models.v1.addons.AddonRemoveDraftResponse
import io.stigg.models.v1.addons.AddonRetrieveParams
import io.stigg.models.v1.addons.AddonSetPricingParams
import io.stigg.models.v1.addons.AddonUpdateParams
import io.stigg.models.v1.addons.SetPackagePricingResponse
import io.stigg.services.blocking.v1.addons.EntitlementService
import java.util.function.Consumer

interface AddonService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddonService

    fun entitlements(): EntitlementService

    /** Creates a new addon in draft status, associated with a specific product. */
    fun create(params: AddonCreateParams): Addon = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AddonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon

    /** Retrieves an addon by its unique identifier, including entitlements and pricing details. */
    fun retrieve(id: String): Addon = retrieve(id, AddonRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AddonRetrieveParams = AddonRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: AddonRetrieveParams = AddonRetrieveParams.none()): Addon =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AddonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon

    /** @see retrieve */
    fun retrieve(params: AddonRetrieveParams): Addon = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Addon =
        retrieve(id, AddonRetrieveParams.none(), requestOptions)

    /** Updates an existing addon's properties such as display name, description, and metadata. */
    fun update(id: String): Addon = update(id, AddonUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AddonUpdateParams = AddonUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: AddonUpdateParams = AddonUpdateParams.none()): Addon =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AddonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon

    /** @see update */
    fun update(params: AddonUpdateParams): Addon = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): Addon =
        update(id, AddonUpdateParams.none(), requestOptions)

    /** Retrieves a paginated list of addons in the environment. */
    fun list(): AddonListPage = list(AddonListParams.none())

    /** @see list */
    fun list(
        params: AddonListParams = AddonListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonListPage

    /** @see list */
    fun list(params: AddonListParams = AddonListParams.none()): AddonListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AddonListPage =
        list(AddonListParams.none(), requestOptions)

    /** Archives an addon, preventing it from being used in new subscriptions. */
    fun archive(id: String): Addon = archive(id, AddonArchiveParams.none())

    /** @see archive */
    fun archive(
        id: String,
        params: AddonArchiveParams = AddonArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(id: String, params: AddonArchiveParams = AddonArchiveParams.none()): Addon =
        archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: AddonArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon

    /** @see archive */
    fun archive(params: AddonArchiveParams): Addon = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions): Addon =
        archive(id, AddonArchiveParams.none(), requestOptions)

    /** Creates a draft version of an existing addon for modification before publishing. */
    fun createDraft(id: String): Addon = createDraft(id, AddonCreateDraftParams.none())

    /** @see createDraft */
    fun createDraft(
        id: String,
        params: AddonCreateDraftParams = AddonCreateDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon = createDraft(params.toBuilder().id(id).build(), requestOptions)

    /** @see createDraft */
    fun createDraft(
        id: String,
        params: AddonCreateDraftParams = AddonCreateDraftParams.none(),
    ): Addon = createDraft(id, params, RequestOptions.none())

    /** @see createDraft */
    fun createDraft(
        params: AddonCreateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon

    /** @see createDraft */
    fun createDraft(params: AddonCreateDraftParams): Addon =
        createDraft(params, RequestOptions.none())

    /** @see createDraft */
    fun createDraft(id: String, requestOptions: RequestOptions): Addon =
        createDraft(id, AddonCreateDraftParams.none(), requestOptions)

    /** Publishes a draft addon, making it available for use in subscriptions. */
    fun publish(id: String, params: AddonPublishParams): AddonPublishResponse =
        publish(id, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        id: String,
        params: AddonPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonPublishResponse = publish(params.toBuilder().id(id).build(), requestOptions)

    /** @see publish */
    fun publish(params: AddonPublishParams): AddonPublishResponse =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: AddonPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonPublishResponse

    /** Removes a draft version of an addon. */
    fun removeDraft(id: String): AddonRemoveDraftResponse =
        removeDraft(id, AddonRemoveDraftParams.none())

    /** @see removeDraft */
    fun removeDraft(
        id: String,
        params: AddonRemoveDraftParams = AddonRemoveDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonRemoveDraftResponse = removeDraft(params.toBuilder().id(id).build(), requestOptions)

    /** @see removeDraft */
    fun removeDraft(
        id: String,
        params: AddonRemoveDraftParams = AddonRemoveDraftParams.none(),
    ): AddonRemoveDraftResponse = removeDraft(id, params, RequestOptions.none())

    /** @see removeDraft */
    fun removeDraft(
        params: AddonRemoveDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonRemoveDraftResponse

    /** @see removeDraft */
    fun removeDraft(params: AddonRemoveDraftParams): AddonRemoveDraftResponse =
        removeDraft(params, RequestOptions.none())

    /** @see removeDraft */
    fun removeDraft(id: String, requestOptions: RequestOptions): AddonRemoveDraftResponse =
        removeDraft(id, AddonRemoveDraftParams.none(), requestOptions)

    /** Sets the pricing configuration for an addon. */
    fun setPricing(id: String, params: AddonSetPricingParams): SetPackagePricingResponse =
        setPricing(id, params, RequestOptions.none())

    /** @see setPricing */
    fun setPricing(
        id: String,
        params: AddonSetPricingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SetPackagePricingResponse = setPricing(params.toBuilder().id(id).build(), requestOptions)

    /** @see setPricing */
    fun setPricing(params: AddonSetPricingParams): SetPackagePricingResponse =
        setPricing(params, RequestOptions.none())

    /** @see setPricing */
    fun setPricing(
        params: AddonSetPricingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SetPackagePricingResponse

    /** A view of [AddonService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddonService.WithRawResponse

        fun entitlements(): EntitlementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/addons`, but is otherwise the same as
         * [AddonService.create].
         */
        @MustBeClosed
        fun create(params: AddonCreateParams): HttpResponseFor<Addon> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AddonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon>

        /**
         * Returns a raw HTTP response for `get /api/v1/addons/{id}`, but is otherwise the same as
         * [AddonService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Addon> = retrieve(id, AddonRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AddonRetrieveParams = AddonRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AddonRetrieveParams = AddonRetrieveParams.none(),
        ): HttpResponseFor<Addon> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AddonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AddonRetrieveParams): HttpResponseFor<Addon> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Addon> =
            retrieve(id, AddonRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/addons/{id}`, but is otherwise the same as
         * [AddonService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<Addon> = update(id, AddonUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AddonUpdateParams = AddonUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AddonUpdateParams = AddonUpdateParams.none(),
        ): HttpResponseFor<Addon> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AddonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon>

        /** @see update */
        @MustBeClosed
        fun update(params: AddonUpdateParams): HttpResponseFor<Addon> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<Addon> =
            update(id, AddonUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/addons`, but is otherwise the same as
         * [AddonService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AddonListPage> = list(AddonListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AddonListParams = AddonListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AddonListParams = AddonListParams.none()): HttpResponseFor<AddonListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AddonListPage> =
            list(AddonListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/addons/{id}/archive`, but is otherwise the
         * same as [AddonService.archive].
         */
        @MustBeClosed
        fun archive(id: String): HttpResponseFor<Addon> = archive(id, AddonArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: AddonArchiveParams = AddonArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon> = archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: AddonArchiveParams = AddonArchiveParams.none(),
        ): HttpResponseFor<Addon> = archive(id, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: AddonArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon>

        /** @see archive */
        @MustBeClosed
        fun archive(params: AddonArchiveParams): HttpResponseFor<Addon> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(id: String, requestOptions: RequestOptions): HttpResponseFor<Addon> =
            archive(id, AddonArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/addons/{id}/draft`, but is otherwise the
         * same as [AddonService.createDraft].
         */
        @MustBeClosed
        fun createDraft(id: String): HttpResponseFor<Addon> =
            createDraft(id, AddonCreateDraftParams.none())

        /** @see createDraft */
        @MustBeClosed
        fun createDraft(
            id: String,
            params: AddonCreateDraftParams = AddonCreateDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon> = createDraft(params.toBuilder().id(id).build(), requestOptions)

        /** @see createDraft */
        @MustBeClosed
        fun createDraft(
            id: String,
            params: AddonCreateDraftParams = AddonCreateDraftParams.none(),
        ): HttpResponseFor<Addon> = createDraft(id, params, RequestOptions.none())

        /** @see createDraft */
        @MustBeClosed
        fun createDraft(
            params: AddonCreateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon>

        /** @see createDraft */
        @MustBeClosed
        fun createDraft(params: AddonCreateDraftParams): HttpResponseFor<Addon> =
            createDraft(params, RequestOptions.none())

        /** @see createDraft */
        @MustBeClosed
        fun createDraft(id: String, requestOptions: RequestOptions): HttpResponseFor<Addon> =
            createDraft(id, AddonCreateDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/addons/{id}/publish`, but is otherwise the
         * same as [AddonService.publish].
         */
        @MustBeClosed
        fun publish(id: String, params: AddonPublishParams): HttpResponseFor<AddonPublishResponse> =
            publish(id, params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            id: String,
            params: AddonPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonPublishResponse> =
            publish(params.toBuilder().id(id).build(), requestOptions)

        /** @see publish */
        @MustBeClosed
        fun publish(params: AddonPublishParams): HttpResponseFor<AddonPublishResponse> =
            publish(params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: AddonPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonPublishResponse>

        /**
         * Returns a raw HTTP response for `delete /api/v1/addons/{id}/draft`, but is otherwise the
         * same as [AddonService.removeDraft].
         */
        @MustBeClosed
        fun removeDraft(id: String): HttpResponseFor<AddonRemoveDraftResponse> =
            removeDraft(id, AddonRemoveDraftParams.none())

        /** @see removeDraft */
        @MustBeClosed
        fun removeDraft(
            id: String,
            params: AddonRemoveDraftParams = AddonRemoveDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonRemoveDraftResponse> =
            removeDraft(params.toBuilder().id(id).build(), requestOptions)

        /** @see removeDraft */
        @MustBeClosed
        fun removeDraft(
            id: String,
            params: AddonRemoveDraftParams = AddonRemoveDraftParams.none(),
        ): HttpResponseFor<AddonRemoveDraftResponse> =
            removeDraft(id, params, RequestOptions.none())

        /** @see removeDraft */
        @MustBeClosed
        fun removeDraft(
            params: AddonRemoveDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonRemoveDraftResponse>

        /** @see removeDraft */
        @MustBeClosed
        fun removeDraft(params: AddonRemoveDraftParams): HttpResponseFor<AddonRemoveDraftResponse> =
            removeDraft(params, RequestOptions.none())

        /** @see removeDraft */
        @MustBeClosed
        fun removeDraft(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonRemoveDraftResponse> =
            removeDraft(id, AddonRemoveDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/addons/{id}/charges`, but is otherwise the
         * same as [AddonService.setPricing].
         */
        @MustBeClosed
        fun setPricing(
            id: String,
            params: AddonSetPricingParams,
        ): HttpResponseFor<SetPackagePricingResponse> =
            setPricing(id, params, RequestOptions.none())

        /** @see setPricing */
        @MustBeClosed
        fun setPricing(
            id: String,
            params: AddonSetPricingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SetPackagePricingResponse> =
            setPricing(params.toBuilder().id(id).build(), requestOptions)

        /** @see setPricing */
        @MustBeClosed
        fun setPricing(params: AddonSetPricingParams): HttpResponseFor<SetPackagePricingResponse> =
            setPricing(params, RequestOptions.none())

        /** @see setPricing */
        @MustBeClosed
        fun setPricing(
            params: AddonSetPricingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SetPackagePricingResponse>
    }
}
