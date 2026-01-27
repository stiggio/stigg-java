// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.coupons.CouponCreateParams
import io.stigg.models.v1.coupons.CouponCreateResponse
import io.stigg.models.v1.coupons.CouponListPageAsync
import io.stigg.models.v1.coupons.CouponListParams
import io.stigg.models.v1.coupons.CouponRetrieveParams
import io.stigg.models.v1.coupons.CouponRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CouponServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CouponServiceAsync

    /** Create a new Coupon */
    fun create(params: CouponCreateParams): CompletableFuture<CouponCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CouponCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CouponCreateResponse>

    /** Get a single Coupon by id */
    fun retrieve(id: String): CompletableFuture<CouponRetrieveResponse> =
        retrieve(id, CouponRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CouponRetrieveParams = CouponRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CouponRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CouponRetrieveParams = CouponRetrieveParams.none(),
    ): CompletableFuture<CouponRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CouponRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CouponRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: CouponRetrieveParams): CompletableFuture<CouponRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CouponRetrieveResponse> =
        retrieve(id, CouponRetrieveParams.none(), requestOptions)

    /** Get a list of Coupons */
    fun list(): CompletableFuture<CouponListPageAsync> = list(CouponListParams.none())

    /** @see list */
    fun list(
        params: CouponListParams = CouponListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CouponListPageAsync>

    /** @see list */
    fun list(
        params: CouponListParams = CouponListParams.none()
    ): CompletableFuture<CouponListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CouponListPageAsync> =
        list(CouponListParams.none(), requestOptions)

    /**
     * A view of [CouponServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CouponServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/coupons`, but is otherwise the same as
         * [CouponServiceAsync.create].
         */
        fun create(
            params: CouponCreateParams
        ): CompletableFuture<HttpResponseFor<CouponCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CouponCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/coupons/{id}`, but is otherwise the same as
         * [CouponServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CouponRetrieveResponse>> =
            retrieve(id, CouponRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CouponRetrieveParams = CouponRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CouponRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CouponRetrieveParams = CouponRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CouponRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CouponRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CouponRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CouponRetrieveParams
        ): CompletableFuture<HttpResponseFor<CouponRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CouponRetrieveResponse>> =
            retrieve(id, CouponRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/coupons`, but is otherwise the same as
         * [CouponServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CouponListPageAsync>> =
            list(CouponListParams.none())

        /** @see list */
        fun list(
            params: CouponListParams = CouponListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CouponListPageAsync>>

        /** @see list */
        fun list(
            params: CouponListParams = CouponListParams.none()
        ): CompletableFuture<HttpResponseFor<CouponListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CouponListPageAsync>> =
            list(CouponListParams.none(), requestOptions)
    }
}
