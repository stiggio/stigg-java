// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.plans

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.plans.Plan
import io.stigg.models.v1.events.plans.draft.DraftCreateParams
import io.stigg.models.v1.events.plans.draft.DraftRemoveParams
import io.stigg.models.v1.events.plans.draft.DraftRemoveResponse
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

    /** Creates a draft version of an existing plan for modification before publishing. */
    fun create(id: String): CompletableFuture<Plan> = create(id, DraftCreateParams.none())

    /** @see create */
    fun create(
        id: String,
        params: DraftCreateParams = DraftCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan> = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(
        id: String,
        params: DraftCreateParams = DraftCreateParams.none(),
    ): CompletableFuture<Plan> = create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DraftCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /** @see create */
    fun create(params: DraftCreateParams): CompletableFuture<Plan> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(id: String, requestOptions: RequestOptions): CompletableFuture<Plan> =
        create(id, DraftCreateParams.none(), requestOptions)

    /** Removes a draft version of a plan. */
    fun remove(id: String): CompletableFuture<DraftRemoveResponse> =
        remove(id, DraftRemoveParams.none())

    /** @see remove */
    fun remove(
        id: String,
        params: DraftRemoveParams = DraftRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DraftRemoveResponse> =
        remove(params.toBuilder().id(id).build(), requestOptions)

    /** @see remove */
    fun remove(
        id: String,
        params: DraftRemoveParams = DraftRemoveParams.none(),
    ): CompletableFuture<DraftRemoveResponse> = remove(id, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: DraftRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DraftRemoveResponse>

    /** @see remove */
    fun remove(params: DraftRemoveParams): CompletableFuture<DraftRemoveResponse> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(id: String, requestOptions: RequestOptions): CompletableFuture<DraftRemoveResponse> =
        remove(id, DraftRemoveParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /api/v1/plans/{id}/draft`, but is otherwise the
         * same as [DraftServiceAsync.create].
         */
        fun create(id: String): CompletableFuture<HttpResponseFor<Plan>> =
            create(id, DraftCreateParams.none())

        /** @see create */
        fun create(
            id: String,
            params: DraftCreateParams = DraftCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            id: String,
            params: DraftCreateParams = DraftCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> = create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DraftCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>

        /** @see create */
        fun create(params: DraftCreateParams): CompletableFuture<HttpResponseFor<Plan>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Plan>> =
            create(id, DraftCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/plans/{id}/draft`, but is otherwise the
         * same as [DraftServiceAsync.remove].
         */
        fun remove(id: String): CompletableFuture<HttpResponseFor<DraftRemoveResponse>> =
            remove(id, DraftRemoveParams.none())

        /** @see remove */
        fun remove(
            id: String,
            params: DraftRemoveParams = DraftRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DraftRemoveResponse>> =
            remove(params.toBuilder().id(id).build(), requestOptions)

        /** @see remove */
        fun remove(
            id: String,
            params: DraftRemoveParams = DraftRemoveParams.none(),
        ): CompletableFuture<HttpResponseFor<DraftRemoveResponse>> =
            remove(id, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: DraftRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DraftRemoveResponse>>

        /** @see remove */
        fun remove(
            params: DraftRemoveParams
        ): CompletableFuture<HttpResponseFor<DraftRemoveResponse>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DraftRemoveResponse>> =
            remove(id, DraftRemoveParams.none(), requestOptions)
    }
}
