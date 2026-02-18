// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.plans.PlanCreateParams
import io.stigg.models.v1.events.plans.PlanCreateResponse
import io.stigg.models.v1.events.plans.PlanListPage
import io.stigg.models.v1.events.plans.PlanListParams
import io.stigg.models.v1.events.plans.PlanRetrieveParams
import io.stigg.models.v1.events.plans.PlanRetrieveResponse
import java.util.function.Consumer

interface PlanService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService

    /** Creates a new plan in draft status. */
    fun create(params: PlanCreateParams): PlanCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanCreateResponse

    /** Retrieves a plan by its unique identifier, including entitlements and pricing details. */
    fun retrieve(id: String): PlanRetrieveResponse = retrieve(id, PlanRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PlanRetrieveParams = PlanRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PlanRetrieveParams = PlanRetrieveParams.none(),
    ): PlanRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PlanRetrieveParams): PlanRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): PlanRetrieveResponse =
        retrieve(id, PlanRetrieveParams.none(), requestOptions)

    /** Retrieves a paginated list of plans in the environment. */
    fun list(): PlanListPage = list(PlanListParams.none())

    /** @see list */
    fun list(
        params: PlanListParams = PlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListPage

    /** @see list */
    fun list(params: PlanListParams = PlanListParams.none()): PlanListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PlanListPage =
        list(PlanListParams.none(), requestOptions)

    /** A view of [PlanService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/plans`, but is otherwise the same as
         * [PlanService.create].
         */
        @MustBeClosed
        fun create(params: PlanCreateParams): HttpResponseFor<PlanCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/plans/{id}`, but is otherwise the same as
         * [PlanService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PlanRetrieveResponse> =
            retrieve(id, PlanRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanRetrieveParams = PlanRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanRetrieveParams = PlanRetrieveParams.none(),
        ): HttpResponseFor<PlanRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PlanRetrieveParams): HttpResponseFor<PlanRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanRetrieveResponse> =
            retrieve(id, PlanRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/plans`, but is otherwise the same as
         * [PlanService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PlanListPage> = list(PlanListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PlanListParams = PlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: PlanListParams = PlanListParams.none()): HttpResponseFor<PlanListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PlanListPage> =
            list(PlanListParams.none(), requestOptions)
    }
}
