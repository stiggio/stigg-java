// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.plans.PlanCreateParams
import io.stigg.models.v1.events.plans.PlanCreateResponse
import io.stigg.models.v1.events.plans.PlanListPageAsync
import io.stigg.models.v1.events.plans.PlanListParams
import io.stigg.models.v1.events.plans.PlanRetrieveParams
import io.stigg.models.v1.events.plans.PlanRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PlanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanServiceAsync

    /** Creates a new plan in draft status. */
    fun create(params: PlanCreateParams): CompletableFuture<PlanCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanCreateResponse>

    /** Retrieves a plan by its unique identifier, including entitlements and pricing details. */
    fun retrieve(id: String): CompletableFuture<PlanRetrieveResponse> =
        retrieve(id, PlanRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PlanRetrieveParams = PlanRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PlanRetrieveParams = PlanRetrieveParams.none(),
    ): CompletableFuture<PlanRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: PlanRetrieveParams): CompletableFuture<PlanRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanRetrieveResponse> =
        retrieve(id, PlanRetrieveParams.none(), requestOptions)

    /** Retrieves a paginated list of plans in the environment. */
    fun list(): CompletableFuture<PlanListPageAsync> = list(PlanListParams.none())

    /** @see list */
    fun list(
        params: PlanListParams = PlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListPageAsync>

    /** @see list */
    fun list(params: PlanListParams = PlanListParams.none()): CompletableFuture<PlanListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PlanListPageAsync> =
        list(PlanListParams.none(), requestOptions)

    /** A view of [PlanServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/plans`, but is otherwise the same as
         * [PlanServiceAsync.create].
         */
        fun create(
            params: PlanCreateParams
        ): CompletableFuture<HttpResponseFor<PlanCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/plans/{id}`, but is otherwise the same as
         * [PlanServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PlanRetrieveResponse>> =
            retrieve(id, PlanRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PlanRetrieveParams = PlanRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PlanRetrieveParams = PlanRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PlanRetrieveParams
        ): CompletableFuture<HttpResponseFor<PlanRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanRetrieveResponse>> =
            retrieve(id, PlanRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/plans`, but is otherwise the same as
         * [PlanServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(PlanListParams.none())

        /** @see list */
        fun list(
            params: PlanListParams = PlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>>

        /** @see list */
        fun list(
            params: PlanListParams = PlanListParams.none()
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(PlanListParams.none(), requestOptions)
    }
}
