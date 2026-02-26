// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.plans

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.plans.Plan
import io.stigg.models.v1.events.plans.draft.DraftCreateParams
import io.stigg.models.v1.events.plans.draft.DraftRemoveParams
import io.stigg.models.v1.events.plans.draft.DraftRemoveResponse
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

    /** Creates a draft version of an existing plan for modification before publishing. */
    fun create(id: String): Plan = create(id, DraftCreateParams.none())

    /** @see create */
    fun create(
        id: String,
        params: DraftCreateParams = DraftCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(id: String, params: DraftCreateParams = DraftCreateParams.none()): Plan =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DraftCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** @see create */
    fun create(params: DraftCreateParams): Plan = create(params, RequestOptions.none())

    /** @see create */
    fun create(id: String, requestOptions: RequestOptions): Plan =
        create(id, DraftCreateParams.none(), requestOptions)

    /** Removes a draft version of a plan. */
    fun remove(id: String): DraftRemoveResponse = remove(id, DraftRemoveParams.none())

    /** @see remove */
    fun remove(
        id: String,
        params: DraftRemoveParams = DraftRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DraftRemoveResponse = remove(params.toBuilder().id(id).build(), requestOptions)

    /** @see remove */
    fun remove(
        id: String,
        params: DraftRemoveParams = DraftRemoveParams.none(),
    ): DraftRemoveResponse = remove(id, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: DraftRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DraftRemoveResponse

    /** @see remove */
    fun remove(params: DraftRemoveParams): DraftRemoveResponse =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(id: String, requestOptions: RequestOptions): DraftRemoveResponse =
        remove(id, DraftRemoveParams.none(), requestOptions)

    /** A view of [DraftService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/plans/{id}/draft`, but is otherwise the
         * same as [DraftService.create].
         */
        @MustBeClosed
        fun create(id: String): HttpResponseFor<Plan> = create(id, DraftCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: DraftCreateParams = DraftCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan> = create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: DraftCreateParams = DraftCreateParams.none(),
        ): HttpResponseFor<Plan> = create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DraftCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /** @see create */
        @MustBeClosed
        fun create(params: DraftCreateParams): HttpResponseFor<Plan> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(id: String, requestOptions: RequestOptions): HttpResponseFor<Plan> =
            create(id, DraftCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/plans/{id}/draft`, but is otherwise the
         * same as [DraftService.remove].
         */
        @MustBeClosed
        fun remove(id: String): HttpResponseFor<DraftRemoveResponse> =
            remove(id, DraftRemoveParams.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            id: String,
            params: DraftRemoveParams = DraftRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DraftRemoveResponse> =
            remove(params.toBuilder().id(id).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(
            id: String,
            params: DraftRemoveParams = DraftRemoveParams.none(),
        ): HttpResponseFor<DraftRemoveResponse> = remove(id, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: DraftRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DraftRemoveResponse>

        /** @see remove */
        @MustBeClosed
        fun remove(params: DraftRemoveParams): HttpResponseFor<DraftRemoveResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DraftRemoveResponse> =
            remove(id, DraftRemoveParams.none(), requestOptions)
    }
}
