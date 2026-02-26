// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.addons

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.addons.Addon
import io.stigg.models.v1.events.addons.draft.DraftCreateAddonDraftParams
import io.stigg.models.v1.events.addons.draft.DraftRemoveAddonDraftParams
import io.stigg.models.v1.events.addons.draft.DraftRemoveAddonDraftResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DraftServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftServiceAsync

    /** Creates a draft version of an existing addon for modification before publishing. */
    fun createAddonDraft(id: String): CompletableFuture<Addon> =
        createAddonDraft(id, DraftCreateAddonDraftParams.none())

    /** @see createAddonDraft */
    fun createAddonDraft(
        id: String,
        params: DraftCreateAddonDraftParams = DraftCreateAddonDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon> =
        createAddonDraft(params.toBuilder().id(id).build(), requestOptions)

    /** @see createAddonDraft */
    fun createAddonDraft(
        id: String,
        params: DraftCreateAddonDraftParams = DraftCreateAddonDraftParams.none(),
    ): CompletableFuture<Addon> = createAddonDraft(id, params, RequestOptions.none())

    /** @see createAddonDraft */
    fun createAddonDraft(
        params: DraftCreateAddonDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Addon>

    /** @see createAddonDraft */
    fun createAddonDraft(params: DraftCreateAddonDraftParams): CompletableFuture<Addon> =
        createAddonDraft(params, RequestOptions.none())

    /** @see createAddonDraft */
    fun createAddonDraft(id: String, requestOptions: RequestOptions): CompletableFuture<Addon> =
        createAddonDraft(id, DraftCreateAddonDraftParams.none(), requestOptions)

    /** Removes a draft version of an addon. */
    fun removeAddonDraft(id: String): CompletableFuture<DraftRemoveAddonDraftResponse> =
        removeAddonDraft(id, DraftRemoveAddonDraftParams.none())

    /** @see removeAddonDraft */
    fun removeAddonDraft(
        id: String,
        params: DraftRemoveAddonDraftParams = DraftRemoveAddonDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DraftRemoveAddonDraftResponse> =
        removeAddonDraft(params.toBuilder().id(id).build(), requestOptions)

    /** @see removeAddonDraft */
    fun removeAddonDraft(
        id: String,
        params: DraftRemoveAddonDraftParams = DraftRemoveAddonDraftParams.none(),
    ): CompletableFuture<DraftRemoveAddonDraftResponse> =
        removeAddonDraft(id, params, RequestOptions.none())

    /** @see removeAddonDraft */
    fun removeAddonDraft(
        params: DraftRemoveAddonDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DraftRemoveAddonDraftResponse>

    /** @see removeAddonDraft */
    fun removeAddonDraft(
        params: DraftRemoveAddonDraftParams
    ): CompletableFuture<DraftRemoveAddonDraftResponse> =
        removeAddonDraft(params, RequestOptions.none())

    /** @see removeAddonDraft */
    fun removeAddonDraft(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DraftRemoveAddonDraftResponse> =
        removeAddonDraft(id, DraftRemoveAddonDraftParams.none(), requestOptions)

    /** A view of [DraftServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DraftServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/addons/{id}/draft`, but is otherwise the
         * same as [DraftServiceAsync.createAddonDraft].
         */
        fun createAddonDraft(id: String): CompletableFuture<HttpResponseFor<Addon>> =
            createAddonDraft(id, DraftCreateAddonDraftParams.none())

        /** @see createAddonDraft */
        fun createAddonDraft(
            id: String,
            params: DraftCreateAddonDraftParams = DraftCreateAddonDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            createAddonDraft(params.toBuilder().id(id).build(), requestOptions)

        /** @see createAddonDraft */
        fun createAddonDraft(
            id: String,
            params: DraftCreateAddonDraftParams = DraftCreateAddonDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<Addon>> =
            createAddonDraft(id, params, RequestOptions.none())

        /** @see createAddonDraft */
        fun createAddonDraft(
            params: DraftCreateAddonDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Addon>>

        /** @see createAddonDraft */
        fun createAddonDraft(
            params: DraftCreateAddonDraftParams
        ): CompletableFuture<HttpResponseFor<Addon>> =
            createAddonDraft(params, RequestOptions.none())

        /** @see createAddonDraft */
        fun createAddonDraft(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Addon>> =
            createAddonDraft(id, DraftCreateAddonDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/addons/{id}/draft`, but is otherwise the
         * same as [DraftServiceAsync.removeAddonDraft].
         */
        fun removeAddonDraft(
            id: String
        ): CompletableFuture<HttpResponseFor<DraftRemoveAddonDraftResponse>> =
            removeAddonDraft(id, DraftRemoveAddonDraftParams.none())

        /** @see removeAddonDraft */
        fun removeAddonDraft(
            id: String,
            params: DraftRemoveAddonDraftParams = DraftRemoveAddonDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DraftRemoveAddonDraftResponse>> =
            removeAddonDraft(params.toBuilder().id(id).build(), requestOptions)

        /** @see removeAddonDraft */
        fun removeAddonDraft(
            id: String,
            params: DraftRemoveAddonDraftParams = DraftRemoveAddonDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<DraftRemoveAddonDraftResponse>> =
            removeAddonDraft(id, params, RequestOptions.none())

        /** @see removeAddonDraft */
        fun removeAddonDraft(
            params: DraftRemoveAddonDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DraftRemoveAddonDraftResponse>>

        /** @see removeAddonDraft */
        fun removeAddonDraft(
            params: DraftRemoveAddonDraftParams
        ): CompletableFuture<HttpResponseFor<DraftRemoveAddonDraftResponse>> =
            removeAddonDraft(params, RequestOptions.none())

        /** @see removeAddonDraft */
        fun removeAddonDraft(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DraftRemoveAddonDraftResponse>> =
            removeAddonDraft(id, DraftRemoveAddonDraftParams.none(), requestOptions)
    }
}
