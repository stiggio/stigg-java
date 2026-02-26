// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.addons.Addon
import io.stigg.models.v1.events.addons.AddonArchiveAddonParams
import io.stigg.models.v1.events.addons.AddonCreateAddonParams
import io.stigg.models.v1.events.addons.AddonListAddonsPage
import io.stigg.models.v1.events.addons.AddonListAddonsParams
import io.stigg.models.v1.events.addons.AddonPublishAddonParams
import io.stigg.models.v1.events.addons.AddonPublishAddonResponse
import io.stigg.models.v1.events.addons.AddonRetrieveAddonParams
import io.stigg.models.v1.events.addons.AddonSetPricingParams
import io.stigg.models.v1.events.addons.AddonUpdateAddonParams
import io.stigg.models.v1.events.addons.SetPackagePricingResponse
import io.stigg.services.blocking.v1.events.addons.DraftService
import io.stigg.services.blocking.v1.events.addons.EntitlementService
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

    fun draft(): DraftService

    fun entitlements(): EntitlementService

    /** Archives an addon, preventing it from being used in new subscriptions. */
    fun archiveAddon(id: String): Addon = archiveAddon(id, AddonArchiveAddonParams.none())

    /** @see archiveAddon */
    fun archiveAddon(
        id: String,
        params: AddonArchiveAddonParams = AddonArchiveAddonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon = archiveAddon(params.toBuilder().id(id).build(), requestOptions)

    /** @see archiveAddon */
    fun archiveAddon(
        id: String,
        params: AddonArchiveAddonParams = AddonArchiveAddonParams.none(),
    ): Addon = archiveAddon(id, params, RequestOptions.none())

    /** @see archiveAddon */
    fun archiveAddon(
        params: AddonArchiveAddonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon

    /** @see archiveAddon */
    fun archiveAddon(params: AddonArchiveAddonParams): Addon =
        archiveAddon(params, RequestOptions.none())

    /** @see archiveAddon */
    fun archiveAddon(id: String, requestOptions: RequestOptions): Addon =
        archiveAddon(id, AddonArchiveAddonParams.none(), requestOptions)

    /** Creates a new addon in draft status, associated with a specific product. */
    fun createAddon(params: AddonCreateAddonParams): Addon =
        createAddon(params, RequestOptions.none())

    /** @see createAddon */
    fun createAddon(
        params: AddonCreateAddonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon

    /** Retrieves a paginated list of addons in the environment. */
    fun listAddons(): AddonListAddonsPage = listAddons(AddonListAddonsParams.none())

    /** @see listAddons */
    fun listAddons(
        params: AddonListAddonsParams = AddonListAddonsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonListAddonsPage

    /** @see listAddons */
    fun listAddons(
        params: AddonListAddonsParams = AddonListAddonsParams.none()
    ): AddonListAddonsPage = listAddons(params, RequestOptions.none())

    /** @see listAddons */
    fun listAddons(requestOptions: RequestOptions): AddonListAddonsPage =
        listAddons(AddonListAddonsParams.none(), requestOptions)

    /** Publishes a draft addon, making it available for use in subscriptions. */
    fun publishAddon(id: String, params: AddonPublishAddonParams): AddonPublishAddonResponse =
        publishAddon(id, params, RequestOptions.none())

    /** @see publishAddon */
    fun publishAddon(
        id: String,
        params: AddonPublishAddonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonPublishAddonResponse = publishAddon(params.toBuilder().id(id).build(), requestOptions)

    /** @see publishAddon */
    fun publishAddon(params: AddonPublishAddonParams): AddonPublishAddonResponse =
        publishAddon(params, RequestOptions.none())

    /** @see publishAddon */
    fun publishAddon(
        params: AddonPublishAddonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonPublishAddonResponse

    /** Retrieves an addon by its unique identifier, including entitlements and pricing details. */
    fun retrieveAddon(id: String): Addon = retrieveAddon(id, AddonRetrieveAddonParams.none())

    /** @see retrieveAddon */
    fun retrieveAddon(
        id: String,
        params: AddonRetrieveAddonParams = AddonRetrieveAddonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon = retrieveAddon(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveAddon */
    fun retrieveAddon(
        id: String,
        params: AddonRetrieveAddonParams = AddonRetrieveAddonParams.none(),
    ): Addon = retrieveAddon(id, params, RequestOptions.none())

    /** @see retrieveAddon */
    fun retrieveAddon(
        params: AddonRetrieveAddonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon

    /** @see retrieveAddon */
    fun retrieveAddon(params: AddonRetrieveAddonParams): Addon =
        retrieveAddon(params, RequestOptions.none())

    /** @see retrieveAddon */
    fun retrieveAddon(id: String, requestOptions: RequestOptions): Addon =
        retrieveAddon(id, AddonRetrieveAddonParams.none(), requestOptions)

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

    /** Updates an existing addon's properties such as display name, description, and metadata. */
    fun updateAddon(id: String): Addon = updateAddon(id, AddonUpdateAddonParams.none())

    /** @see updateAddon */
    fun updateAddon(
        id: String,
        params: AddonUpdateAddonParams = AddonUpdateAddonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon = updateAddon(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateAddon */
    fun updateAddon(
        id: String,
        params: AddonUpdateAddonParams = AddonUpdateAddonParams.none(),
    ): Addon = updateAddon(id, params, RequestOptions.none())

    /** @see updateAddon */
    fun updateAddon(
        params: AddonUpdateAddonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Addon

    /** @see updateAddon */
    fun updateAddon(params: AddonUpdateAddonParams): Addon =
        updateAddon(params, RequestOptions.none())

    /** @see updateAddon */
    fun updateAddon(id: String, requestOptions: RequestOptions): Addon =
        updateAddon(id, AddonUpdateAddonParams.none(), requestOptions)

    /** A view of [AddonService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddonService.WithRawResponse

        fun draft(): DraftService.WithRawResponse

        fun entitlements(): EntitlementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/addons/{id}/archive`, but is otherwise the
         * same as [AddonService.archiveAddon].
         */
        @MustBeClosed
        fun archiveAddon(id: String): HttpResponseFor<Addon> =
            archiveAddon(id, AddonArchiveAddonParams.none())

        /** @see archiveAddon */
        @MustBeClosed
        fun archiveAddon(
            id: String,
            params: AddonArchiveAddonParams = AddonArchiveAddonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon> = archiveAddon(params.toBuilder().id(id).build(), requestOptions)

        /** @see archiveAddon */
        @MustBeClosed
        fun archiveAddon(
            id: String,
            params: AddonArchiveAddonParams = AddonArchiveAddonParams.none(),
        ): HttpResponseFor<Addon> = archiveAddon(id, params, RequestOptions.none())

        /** @see archiveAddon */
        @MustBeClosed
        fun archiveAddon(
            params: AddonArchiveAddonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon>

        /** @see archiveAddon */
        @MustBeClosed
        fun archiveAddon(params: AddonArchiveAddonParams): HttpResponseFor<Addon> =
            archiveAddon(params, RequestOptions.none())

        /** @see archiveAddon */
        @MustBeClosed
        fun archiveAddon(id: String, requestOptions: RequestOptions): HttpResponseFor<Addon> =
            archiveAddon(id, AddonArchiveAddonParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/addons`, but is otherwise the same as
         * [AddonService.createAddon].
         */
        @MustBeClosed
        fun createAddon(params: AddonCreateAddonParams): HttpResponseFor<Addon> =
            createAddon(params, RequestOptions.none())

        /** @see createAddon */
        @MustBeClosed
        fun createAddon(
            params: AddonCreateAddonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon>

        /**
         * Returns a raw HTTP response for `get /api/v1/addons`, but is otherwise the same as
         * [AddonService.listAddons].
         */
        @MustBeClosed
        fun listAddons(): HttpResponseFor<AddonListAddonsPage> =
            listAddons(AddonListAddonsParams.none())

        /** @see listAddons */
        @MustBeClosed
        fun listAddons(
            params: AddonListAddonsParams = AddonListAddonsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonListAddonsPage>

        /** @see listAddons */
        @MustBeClosed
        fun listAddons(
            params: AddonListAddonsParams = AddonListAddonsParams.none()
        ): HttpResponseFor<AddonListAddonsPage> = listAddons(params, RequestOptions.none())

        /** @see listAddons */
        @MustBeClosed
        fun listAddons(requestOptions: RequestOptions): HttpResponseFor<AddonListAddonsPage> =
            listAddons(AddonListAddonsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/addons/{id}/publish`, but is otherwise the
         * same as [AddonService.publishAddon].
         */
        @MustBeClosed
        fun publishAddon(
            id: String,
            params: AddonPublishAddonParams,
        ): HttpResponseFor<AddonPublishAddonResponse> =
            publishAddon(id, params, RequestOptions.none())

        /** @see publishAddon */
        @MustBeClosed
        fun publishAddon(
            id: String,
            params: AddonPublishAddonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonPublishAddonResponse> =
            publishAddon(params.toBuilder().id(id).build(), requestOptions)

        /** @see publishAddon */
        @MustBeClosed
        fun publishAddon(
            params: AddonPublishAddonParams
        ): HttpResponseFor<AddonPublishAddonResponse> = publishAddon(params, RequestOptions.none())

        /** @see publishAddon */
        @MustBeClosed
        fun publishAddon(
            params: AddonPublishAddonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonPublishAddonResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/addons/{id}`, but is otherwise the same as
         * [AddonService.retrieveAddon].
         */
        @MustBeClosed
        fun retrieveAddon(id: String): HttpResponseFor<Addon> =
            retrieveAddon(id, AddonRetrieveAddonParams.none())

        /** @see retrieveAddon */
        @MustBeClosed
        fun retrieveAddon(
            id: String,
            params: AddonRetrieveAddonParams = AddonRetrieveAddonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon> = retrieveAddon(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveAddon */
        @MustBeClosed
        fun retrieveAddon(
            id: String,
            params: AddonRetrieveAddonParams = AddonRetrieveAddonParams.none(),
        ): HttpResponseFor<Addon> = retrieveAddon(id, params, RequestOptions.none())

        /** @see retrieveAddon */
        @MustBeClosed
        fun retrieveAddon(
            params: AddonRetrieveAddonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon>

        /** @see retrieveAddon */
        @MustBeClosed
        fun retrieveAddon(params: AddonRetrieveAddonParams): HttpResponseFor<Addon> =
            retrieveAddon(params, RequestOptions.none())

        /** @see retrieveAddon */
        @MustBeClosed
        fun retrieveAddon(id: String, requestOptions: RequestOptions): HttpResponseFor<Addon> =
            retrieveAddon(id, AddonRetrieveAddonParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `patch /api/v1/addons/{id}`, but is otherwise the same as
         * [AddonService.updateAddon].
         */
        @MustBeClosed
        fun updateAddon(id: String): HttpResponseFor<Addon> =
            updateAddon(id, AddonUpdateAddonParams.none())

        /** @see updateAddon */
        @MustBeClosed
        fun updateAddon(
            id: String,
            params: AddonUpdateAddonParams = AddonUpdateAddonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon> = updateAddon(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateAddon */
        @MustBeClosed
        fun updateAddon(
            id: String,
            params: AddonUpdateAddonParams = AddonUpdateAddonParams.none(),
        ): HttpResponseFor<Addon> = updateAddon(id, params, RequestOptions.none())

        /** @see updateAddon */
        @MustBeClosed
        fun updateAddon(
            params: AddonUpdateAddonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Addon>

        /** @see updateAddon */
        @MustBeClosed
        fun updateAddon(params: AddonUpdateAddonParams): HttpResponseFor<Addon> =
            updateAddon(params, RequestOptions.none())

        /** @see updateAddon */
        @MustBeClosed
        fun updateAddon(id: String, requestOptions: RequestOptions): HttpResponseFor<Addon> =
            updateAddon(id, AddonUpdateAddonParams.none(), requestOptions)
    }
}
