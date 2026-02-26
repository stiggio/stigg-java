// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.addons

import com.google.errorprone.annotations.MustBeClosed
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

    /** Creates one or more entitlements (feature or credit) on a draft addon. */
    fun create(addonId: String, params: EntitlementCreateParams): EntitlementCreateResponse =
        create(addonId, params, RequestOptions.none())

    /** @see create */
    fun create(
        addonId: String,
        params: EntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementCreateResponse =
        create(params.toBuilder().addonId(addonId).build(), requestOptions)

    /** @see create */
    fun create(params: EntitlementCreateParams): EntitlementCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementCreateResponse

    /** Updates an existing entitlement on a draft addon. */
    fun update(id: String, params: EntitlementUpdateParams): AddonPackageEntitlement =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonPackageEntitlement = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: EntitlementUpdateParams): AddonPackageEntitlement =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonPackageEntitlement

    /** Retrieves a list of entitlements for an addon. */
    fun list(addonId: String): EntitlementListResponse = list(addonId, EntitlementListParams.none())

    /** @see list */
    fun list(
        addonId: String,
        params: EntitlementListParams = EntitlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementListResponse = list(params.toBuilder().addonId(addonId).build(), requestOptions)

    /** @see list */
    fun list(
        addonId: String,
        params: EntitlementListParams = EntitlementListParams.none(),
    ): EntitlementListResponse = list(addonId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EntitlementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementListResponse

    /** @see list */
    fun list(params: EntitlementListParams): EntitlementListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(addonId: String, requestOptions: RequestOptions): EntitlementListResponse =
        list(addonId, EntitlementListParams.none(), requestOptions)

    /** Deletes an entitlement from a draft addon. */
    fun delete(id: String, params: EntitlementDeleteParams): AddonPackageEntitlement =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EntitlementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonPackageEntitlement = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: EntitlementDeleteParams): AddonPackageEntitlement =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EntitlementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonPackageEntitlement

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
         * Returns a raw HTTP response for `post /api/v1/addons/{addonId}/entitlements`, but is
         * otherwise the same as [EntitlementService.create].
         */
        @MustBeClosed
        fun create(
            addonId: String,
            params: EntitlementCreateParams,
        ): HttpResponseFor<EntitlementCreateResponse> =
            create(addonId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            addonId: String,
            params: EntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementCreateResponse> =
            create(params.toBuilder().addonId(addonId).build(), requestOptions)

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
         * Returns a raw HTTP response for `patch /api/v1/addons/{addonId}/entitlements/{id}`, but
         * is otherwise the same as [EntitlementService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: EntitlementUpdateParams,
        ): HttpResponseFor<AddonPackageEntitlement> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonPackageEntitlement> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: EntitlementUpdateParams): HttpResponseFor<AddonPackageEntitlement> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonPackageEntitlement>

        /**
         * Returns a raw HTTP response for `get /api/v1/addons/{addonId}/entitlements`, but is
         * otherwise the same as [EntitlementService.list].
         */
        @MustBeClosed
        fun list(addonId: String): HttpResponseFor<EntitlementListResponse> =
            list(addonId, EntitlementListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            addonId: String,
            params: EntitlementListParams = EntitlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementListResponse> =
            list(params.toBuilder().addonId(addonId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            addonId: String,
            params: EntitlementListParams = EntitlementListParams.none(),
        ): HttpResponseFor<EntitlementListResponse> = list(addonId, params, RequestOptions.none())

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
            addonId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementListResponse> =
            list(addonId, EntitlementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/addons/{addonId}/entitlements/{id}`, but
         * is otherwise the same as [EntitlementService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: EntitlementDeleteParams,
        ): HttpResponseFor<AddonPackageEntitlement> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EntitlementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonPackageEntitlement> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: EntitlementDeleteParams): HttpResponseFor<AddonPackageEntitlement> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EntitlementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonPackageEntitlement>
    }
}
