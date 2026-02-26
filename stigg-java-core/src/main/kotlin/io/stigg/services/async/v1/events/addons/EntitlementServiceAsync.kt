// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.addons

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.addons.entitlements.AddonPackageEntitlement
import io.stigg.models.v1.events.addons.entitlements.EntitlementCreateParams
import io.stigg.models.v1.events.addons.entitlements.EntitlementCreateResponse
import io.stigg.models.v1.events.addons.entitlements.EntitlementDeleteParams
import io.stigg.models.v1.events.addons.entitlements.EntitlementListParams
import io.stigg.models.v1.events.addons.entitlements.EntitlementListResponse
import io.stigg.models.v1.events.addons.entitlements.EntitlementUpdateParams
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

    /** Creates one or more entitlements (feature or credit) on a draft addon. */
    fun create(
        addonId: String,
        params: EntitlementCreateParams,
    ): CompletableFuture<EntitlementCreateResponse> = create(addonId, params, RequestOptions.none())

    /** @see create */
    fun create(
        addonId: String,
        params: EntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementCreateResponse> =
        create(params.toBuilder().addonId(addonId).build(), requestOptions)

    /** @see create */
    fun create(params: EntitlementCreateParams): CompletableFuture<EntitlementCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementCreateResponse>

    /** Updates an existing entitlement on a draft addon. */
    fun update(
        id: String,
        params: EntitlementUpdateParams,
    ): CompletableFuture<AddonPackageEntitlement> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonPackageEntitlement> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: EntitlementUpdateParams): CompletableFuture<AddonPackageEntitlement> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonPackageEntitlement>

    /** Retrieves a list of entitlements for an addon. */
    fun list(addonId: String): CompletableFuture<EntitlementListResponse> =
        list(addonId, EntitlementListParams.none())

    /** @see list */
    fun list(
        addonId: String,
        params: EntitlementListParams = EntitlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementListResponse> =
        list(params.toBuilder().addonId(addonId).build(), requestOptions)

    /** @see list */
    fun list(
        addonId: String,
        params: EntitlementListParams = EntitlementListParams.none(),
    ): CompletableFuture<EntitlementListResponse> = list(addonId, params, RequestOptions.none())

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
        addonId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementListResponse> =
        list(addonId, EntitlementListParams.none(), requestOptions)

    /** Deletes an entitlement from a draft addon. */
    fun delete(
        id: String,
        params: EntitlementDeleteParams,
    ): CompletableFuture<AddonPackageEntitlement> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EntitlementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonPackageEntitlement> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: EntitlementDeleteParams): CompletableFuture<AddonPackageEntitlement> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EntitlementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonPackageEntitlement>

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
         * Returns a raw HTTP response for `post /api/v1/addons/{addonId}/entitlements`, but is
         * otherwise the same as [EntitlementServiceAsync.create].
         */
        fun create(
            addonId: String,
            params: EntitlementCreateParams,
        ): CompletableFuture<HttpResponseFor<EntitlementCreateResponse>> =
            create(addonId, params, RequestOptions.none())

        /** @see create */
        fun create(
            addonId: String,
            params: EntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementCreateResponse>> =
            create(params.toBuilder().addonId(addonId).build(), requestOptions)

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
         * Returns a raw HTTP response for `patch /api/v1/addons/{addonId}/entitlements/{id}`, but
         * is otherwise the same as [EntitlementServiceAsync.update].
         */
        fun update(
            id: String,
            params: EntitlementUpdateParams,
        ): CompletableFuture<HttpResponseFor<AddonPackageEntitlement>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonPackageEntitlement>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: EntitlementUpdateParams
        ): CompletableFuture<HttpResponseFor<AddonPackageEntitlement>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonPackageEntitlement>>

        /**
         * Returns a raw HTTP response for `get /api/v1/addons/{addonId}/entitlements`, but is
         * otherwise the same as [EntitlementServiceAsync.list].
         */
        fun list(addonId: String): CompletableFuture<HttpResponseFor<EntitlementListResponse>> =
            list(addonId, EntitlementListParams.none())

        /** @see list */
        fun list(
            addonId: String,
            params: EntitlementListParams = EntitlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementListResponse>> =
            list(params.toBuilder().addonId(addonId).build(), requestOptions)

        /** @see list */
        fun list(
            addonId: String,
            params: EntitlementListParams = EntitlementListParams.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementListResponse>> =
            list(addonId, params, RequestOptions.none())

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
            addonId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntitlementListResponse>> =
            list(addonId, EntitlementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/addons/{addonId}/entitlements/{id}`, but
         * is otherwise the same as [EntitlementServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: EntitlementDeleteParams,
        ): CompletableFuture<HttpResponseFor<AddonPackageEntitlement>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EntitlementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonPackageEntitlement>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: EntitlementDeleteParams
        ): CompletableFuture<HttpResponseFor<AddonPackageEntitlement>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EntitlementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonPackageEntitlement>>
    }
}
