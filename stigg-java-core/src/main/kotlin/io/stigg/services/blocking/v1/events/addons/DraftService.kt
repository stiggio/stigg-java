// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.addons

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.addons.draft.DraftCreateAddonDraftParams
import io.stigg.models.v1.events.addons.draft.DraftCreateAddonDraftResponse
import io.stigg.models.v1.events.addons.draft.DraftRemoveAddonDraftParams
import io.stigg.models.v1.events.addons.draft.DraftRemoveAddonDraftResponse
import java.util.function.Consumer

interface DraftService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService

    /** Creates a draft version of an existing addon for modification before publishing. */
    fun createAddonDraft(id: String): DraftCreateAddonDraftResponse =
        createAddonDraft(id, DraftCreateAddonDraftParams.none())

    /** @see createAddonDraft */
    fun createAddonDraft(
        id: String,
        params: DraftCreateAddonDraftParams = DraftCreateAddonDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DraftCreateAddonDraftResponse =
        createAddonDraft(params.toBuilder().id(id).build(), requestOptions)

    /** @see createAddonDraft */
    fun createAddonDraft(
        id: String,
        params: DraftCreateAddonDraftParams = DraftCreateAddonDraftParams.none(),
    ): DraftCreateAddonDraftResponse = createAddonDraft(id, params, RequestOptions.none())

    /** @see createAddonDraft */
    fun createAddonDraft(
        params: DraftCreateAddonDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DraftCreateAddonDraftResponse

    /** @see createAddonDraft */
    fun createAddonDraft(params: DraftCreateAddonDraftParams): DraftCreateAddonDraftResponse =
        createAddonDraft(params, RequestOptions.none())

    /** @see createAddonDraft */
    fun createAddonDraft(
        id: String,
        requestOptions: RequestOptions,
    ): DraftCreateAddonDraftResponse =
        createAddonDraft(id, DraftCreateAddonDraftParams.none(), requestOptions)

    /** Removes a draft version of an addon. */
    fun removeAddonDraft(id: String): DraftRemoveAddonDraftResponse =
        removeAddonDraft(id, DraftRemoveAddonDraftParams.none())

    /** @see removeAddonDraft */
    fun removeAddonDraft(
        id: String,
        params: DraftRemoveAddonDraftParams = DraftRemoveAddonDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DraftRemoveAddonDraftResponse =
        removeAddonDraft(params.toBuilder().id(id).build(), requestOptions)

    /** @see removeAddonDraft */
    fun removeAddonDraft(
        id: String,
        params: DraftRemoveAddonDraftParams = DraftRemoveAddonDraftParams.none(),
    ): DraftRemoveAddonDraftResponse = removeAddonDraft(id, params, RequestOptions.none())

    /** @see removeAddonDraft */
    fun removeAddonDraft(
        params: DraftRemoveAddonDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DraftRemoveAddonDraftResponse

    /** @see removeAddonDraft */
    fun removeAddonDraft(params: DraftRemoveAddonDraftParams): DraftRemoveAddonDraftResponse =
        removeAddonDraft(params, RequestOptions.none())

    /** @see removeAddonDraft */
    fun removeAddonDraft(
        id: String,
        requestOptions: RequestOptions,
    ): DraftRemoveAddonDraftResponse =
        removeAddonDraft(id, DraftRemoveAddonDraftParams.none(), requestOptions)

    /** A view of [DraftService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/addons/{id}/draft`, but is otherwise the
         * same as [DraftService.createAddonDraft].
         */
        @MustBeClosed
        fun createAddonDraft(id: String): HttpResponseFor<DraftCreateAddonDraftResponse> =
            createAddonDraft(id, DraftCreateAddonDraftParams.none())

        /** @see createAddonDraft */
        @MustBeClosed
        fun createAddonDraft(
            id: String,
            params: DraftCreateAddonDraftParams = DraftCreateAddonDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DraftCreateAddonDraftResponse> =
            createAddonDraft(params.toBuilder().id(id).build(), requestOptions)

        /** @see createAddonDraft */
        @MustBeClosed
        fun createAddonDraft(
            id: String,
            params: DraftCreateAddonDraftParams = DraftCreateAddonDraftParams.none(),
        ): HttpResponseFor<DraftCreateAddonDraftResponse> =
            createAddonDraft(id, params, RequestOptions.none())

        /** @see createAddonDraft */
        @MustBeClosed
        fun createAddonDraft(
            params: DraftCreateAddonDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DraftCreateAddonDraftResponse>

        /** @see createAddonDraft */
        @MustBeClosed
        fun createAddonDraft(
            params: DraftCreateAddonDraftParams
        ): HttpResponseFor<DraftCreateAddonDraftResponse> =
            createAddonDraft(params, RequestOptions.none())

        /** @see createAddonDraft */
        @MustBeClosed
        fun createAddonDraft(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DraftCreateAddonDraftResponse> =
            createAddonDraft(id, DraftCreateAddonDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/addons/{id}/draft`, but is otherwise the
         * same as [DraftService.removeAddonDraft].
         */
        @MustBeClosed
        fun removeAddonDraft(id: String): HttpResponseFor<DraftRemoveAddonDraftResponse> =
            removeAddonDraft(id, DraftRemoveAddonDraftParams.none())

        /** @see removeAddonDraft */
        @MustBeClosed
        fun removeAddonDraft(
            id: String,
            params: DraftRemoveAddonDraftParams = DraftRemoveAddonDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DraftRemoveAddonDraftResponse> =
            removeAddonDraft(params.toBuilder().id(id).build(), requestOptions)

        /** @see removeAddonDraft */
        @MustBeClosed
        fun removeAddonDraft(
            id: String,
            params: DraftRemoveAddonDraftParams = DraftRemoveAddonDraftParams.none(),
        ): HttpResponseFor<DraftRemoveAddonDraftResponse> =
            removeAddonDraft(id, params, RequestOptions.none())

        /** @see removeAddonDraft */
        @MustBeClosed
        fun removeAddonDraft(
            params: DraftRemoveAddonDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DraftRemoveAddonDraftResponse>

        /** @see removeAddonDraft */
        @MustBeClosed
        fun removeAddonDraft(
            params: DraftRemoveAddonDraftParams
        ): HttpResponseFor<DraftRemoveAddonDraftResponse> =
            removeAddonDraft(params, RequestOptions.none())

        /** @see removeAddonDraft */
        @MustBeClosed
        fun removeAddonDraft(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DraftRemoveAddonDraftResponse> =
            removeAddonDraft(id, DraftRemoveAddonDraftParams.none(), requestOptions)
    }
}
