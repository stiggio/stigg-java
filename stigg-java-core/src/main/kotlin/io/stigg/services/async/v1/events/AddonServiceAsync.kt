// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.addons.Addon
import io.stigg.models.v1.events.addons.AddonArchiveAddonParams
import io.stigg.models.v1.events.addons.AddonCreateAddonParams
import io.stigg.models.v1.events.addons.AddonListAddonsPageAsync
import io.stigg.models.v1.events.addons.AddonListAddonsParams
import io.stigg.models.v1.events.addons.AddonPublishAddonParams
import io.stigg.models.v1.events.addons.AddonPublishAddonResponse
import io.stigg.models.v1.events.addons.AddonRetrieveAddonParams
import io.stigg.models.v1.events.addons.AddonSetPricingParams
import io.stigg.models.v1.events.addons.AddonUpdateAddonParams
import io.stigg.models.v1.events.addons.SetPackagePricingResponse
import io.stigg.services.async.v1.events.addons.DraftServiceAsync
import io.stigg.services.async.v1.events.addons.EntitlementServiceAsync
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

    fun draft(): DraftServiceAsync

    fun entitlements(): EntitlementServiceAsync

    /** Archives an addon, preventing it from being used in new subscriptions. */
    fun archiveAddon(id: String): CompletableFuture<Addon> =
        archiveAddon(id, AddonArchiveAddonParams.none())

    /** @see archiveAddon */
    fun archiveAddon(
        id: String,
        params: AddonArchiveAddonParams = AddonArchiveAddonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon> = archiveAddon(params.toBuilder().id(id).build(), requestOptions)

    /** @see archiveAddon */
    fun archiveAddon(
        id: String,
        params: AddonArchiveAddonParams = AddonArchiveAddonParams.none(),
    ): CompletableFuture<Addon> = archiveAddon(id, params, RequestOptions.none())

    /** @see archiveAddon */
    fun archiveAddon(
        params: AddonArchiveAddonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon>

    /** @see archiveAddon */
    fun archiveAddon(params: AddonArchiveAddonParams): CompletableFuture<Addon> =
        archiveAddon(params, RequestOptions.none())

    /** @see archiveAddon */
    fun archiveAddon(id: String, requestOptions: RequestOptions): CompletableFuture<Addon> =
        archiveAddon(id, AddonArchiveAddonParams.none(), requestOptions)

    /** Creates a new addon in draft status, associated with a specific product. */
    fun createAddon(params: AddonCreateAddonParams): CompletableFuture<Addon> =
        createAddon(params, RequestOptions.none())

    /** @see createAddon */
    fun createAddon(
        params: AddonCreateAddonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon>

    /** Retrieves a paginated list of addons in the environment. */
    fun listAddons(): CompletableFuture<AddonListAddonsPageAsync> =
        listAddons(AddonListAddonsParams.none())

    /** @see listAddons */
    fun listAddons(
        params: AddonListAddonsParams = AddonListAddonsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonListAddonsPageAsync>

    /** @see listAddons */
    fun listAddons(
        params: AddonListAddonsParams = AddonListAddonsParams.none()
    ): CompletableFuture<AddonListAddonsPageAsync> = listAddons(params, RequestOptions.none())

    /** @see listAddons */
    fun listAddons(requestOptions: RequestOptions): CompletableFuture<AddonListAddonsPageAsync> =
        listAddons(AddonListAddonsParams.none(), requestOptions)

    /** Publishes a draft addon, making it available for use in subscriptions. */
    fun publishAddon(
        id: String,
        params: AddonPublishAddonParams,
    ): CompletableFuture<AddonPublishAddonResponse> =
        publishAddon(id, params, RequestOptions.none())

    /** @see publishAddon */
    fun publishAddon(
        id: String,
        params: AddonPublishAddonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonPublishAddonResponse> =
        publishAddon(params.toBuilder().id(id).build(), requestOptions)

    /** @see publishAddon */
    fun publishAddon(
        params: AddonPublishAddonParams
    ): CompletableFuture<AddonPublishAddonResponse> = publishAddon(params, RequestOptions.none())

    /** @see publishAddon */
    fun publishAddon(
        params: AddonPublishAddonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonPublishAddonResponse>

    /** Retrieves an addon by its unique identifier, including entitlements and pricing details. */
    fun retrieveAddon(id: String): CompletableFuture<Addon> =
        retrieveAddon(id, AddonRetrieveAddonParams.none())

    /** @see retrieveAddon */
    fun retrieveAddon(
        id: String,
        params: AddonRetrieveAddonParams = AddonRetrieveAddonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon> = retrieveAddon(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveAddon */
    fun retrieveAddon(
        id: String,
        params: AddonRetrieveAddonParams = AddonRetrieveAddonParams.none(),
    ): CompletableFuture<Addon> = retrieveAddon(id, params, RequestOptions.none())

    /** @see retrieveAddon */
    fun retrieveAddon(
        params: AddonRetrieveAddonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon>

    /** @see retrieveAddon */
    fun retrieveAddon(params: AddonRetrieveAddonParams): CompletableFuture<Addon> =
        retrieveAddon(params, RequestOptions.none())

    /** @see retrieveAddon */
    fun retrieveAddon(id: String, requestOptions: RequestOptions): CompletableFuture<Addon> =
        retrieveAddon(id, AddonRetrieveAddonParams.none(), requestOptions)

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

    /** Updates an existing addon's properties such as display name, description, and metadata. */
    fun updateAddon(id: String): CompletableFuture<Addon> =
        updateAddon(id, AddonUpdateAddonParams.none())

    /** @see updateAddon */
    fun updateAddon(
        id: String,
        params: AddonUpdateAddonParams = AddonUpdateAddonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon> = updateAddon(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateAddon */
    fun updateAddon(
        id: String,
        params: AddonUpdateAddonParams = AddonUpdateAddonParams.none(),
    ): CompletableFuture<Addon> = updateAddon(id, params, RequestOptions.none())

    /** @see updateAddon */
    fun updateAddon(
        params: AddonUpdateAddonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon>

    /** @see updateAddon */
    fun updateAddon(params: AddonUpdateAddonParams): CompletableFuture<Addon> =
        updateAddon(params, RequestOptions.none())

    /** @see updateAddon */
    fun updateAddon(id: String, requestOptions: RequestOptions): CompletableFuture<Addon> =
        updateAddon(id, AddonUpdateAddonParams.none(), requestOptions)

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

        fun draft(): DraftServiceAsync.WithRawResponse

        fun entitlements(): EntitlementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/addons/{id}/archive`, but is otherwise the
         * same as [AddonServiceAsync.archiveAddon].
         */
        fun archiveAddon(id: String): CompletableFuture<HttpResponseFor<Addon>> =
            archiveAddon(id, AddonArchiveAddonParams.none())

        /** @see archiveAddon */
        fun archiveAddon(
            id: String,
            params: AddonArchiveAddonParams = AddonArchiveAddonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            archiveAddon(params.toBuilder().id(id).build(), requestOptions)

        /** @see archiveAddon */
        fun archiveAddon(
            id: String,
            params: AddonArchiveAddonParams = AddonArchiveAddonParams.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            archiveAddon(id, params, RequestOptions.none())

        /** @see archiveAddon */
        fun archiveAddon(
            params: AddonArchiveAddonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>>

        /** @see archiveAddon */
        fun archiveAddon(
            params: AddonArchiveAddonParams
        ): CompletableFuture<HttpResponseFor<Addon>> = archiveAddon(params, RequestOptions.none())

        /** @see archiveAddon */
        fun archiveAddon(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Addon>> =
            archiveAddon(id, AddonArchiveAddonParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/addons`, but is otherwise the same as
         * [AddonServiceAsync.createAddon].
         */
        fun createAddon(params: AddonCreateAddonParams): CompletableFuture<HttpResponseFor<Addon>> =
            createAddon(params, RequestOptions.none())

        /** @see createAddon */
        fun createAddon(
            params: AddonCreateAddonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>>

        /**
         * Returns a raw HTTP response for `get /api/v1/addons`, but is otherwise the same as
         * [AddonServiceAsync.listAddons].
         */
        fun listAddons(): CompletableFuture<HttpResponseFor<AddonListAddonsPageAsync>> =
            listAddons(AddonListAddonsParams.none())

        /** @see listAddons */
        fun listAddons(
            params: AddonListAddonsParams = AddonListAddonsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonListAddonsPageAsync>>

        /** @see listAddons */
        fun listAddons(
            params: AddonListAddonsParams = AddonListAddonsParams.none()
        ): CompletableFuture<HttpResponseFor<AddonListAddonsPageAsync>> =
            listAddons(params, RequestOptions.none())

        /** @see listAddons */
        fun listAddons(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AddonListAddonsPageAsync>> =
            listAddons(AddonListAddonsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/addons/{id}/publish`, but is otherwise the
         * same as [AddonServiceAsync.publishAddon].
         */
        fun publishAddon(
            id: String,
            params: AddonPublishAddonParams,
        ): CompletableFuture<HttpResponseFor<AddonPublishAddonResponse>> =
            publishAddon(id, params, RequestOptions.none())

        /** @see publishAddon */
        fun publishAddon(
            id: String,
            params: AddonPublishAddonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonPublishAddonResponse>> =
            publishAddon(params.toBuilder().id(id).build(), requestOptions)

        /** @see publishAddon */
        fun publishAddon(
            params: AddonPublishAddonParams
        ): CompletableFuture<HttpResponseFor<AddonPublishAddonResponse>> =
            publishAddon(params, RequestOptions.none())

        /** @see publishAddon */
        fun publishAddon(
            params: AddonPublishAddonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonPublishAddonResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/addons/{id}`, but is otherwise the same as
         * [AddonServiceAsync.retrieveAddon].
         */
        fun retrieveAddon(id: String): CompletableFuture<HttpResponseFor<Addon>> =
            retrieveAddon(id, AddonRetrieveAddonParams.none())

        /** @see retrieveAddon */
        fun retrieveAddon(
            id: String,
            params: AddonRetrieveAddonParams = AddonRetrieveAddonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            retrieveAddon(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveAddon */
        fun retrieveAddon(
            id: String,
            params: AddonRetrieveAddonParams = AddonRetrieveAddonParams.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            retrieveAddon(id, params, RequestOptions.none())

        /** @see retrieveAddon */
        fun retrieveAddon(
            params: AddonRetrieveAddonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>>

        /** @see retrieveAddon */
        fun retrieveAddon(
            params: AddonRetrieveAddonParams
        ): CompletableFuture<HttpResponseFor<Addon>> = retrieveAddon(params, RequestOptions.none())

        /** @see retrieveAddon */
        fun retrieveAddon(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Addon>> =
            retrieveAddon(id, AddonRetrieveAddonParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `patch /api/v1/addons/{id}`, but is otherwise the same as
         * [AddonServiceAsync.updateAddon].
         */
        fun updateAddon(id: String): CompletableFuture<HttpResponseFor<Addon>> =
            updateAddon(id, AddonUpdateAddonParams.none())

        /** @see updateAddon */
        fun updateAddon(
            id: String,
            params: AddonUpdateAddonParams = AddonUpdateAddonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            updateAddon(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateAddon */
        fun updateAddon(
            id: String,
            params: AddonUpdateAddonParams = AddonUpdateAddonParams.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            updateAddon(id, params, RequestOptions.none())

        /** @see updateAddon */
        fun updateAddon(
            params: AddonUpdateAddonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>>

        /** @see updateAddon */
        fun updateAddon(params: AddonUpdateAddonParams): CompletableFuture<HttpResponseFor<Addon>> =
            updateAddon(params, RequestOptions.none())

        /** @see updateAddon */
        fun updateAddon(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Addon>> =
            updateAddon(id, AddonUpdateAddonParams.none(), requestOptions)
    }
}
