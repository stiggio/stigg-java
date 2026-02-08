// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.coupons.Coupon
import io.stigg.models.v1.coupons.CouponCreateParams
import io.stigg.models.v1.coupons.CouponListPageAsync
import io.stigg.models.v1.coupons.CouponListParams
import io.stigg.models.v1.coupons.CouponRetrieveParams
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

    /**
     * Creates a new discount coupon with percentage or fixed amount off, applicable to customer
     * subscriptions.
     */
    fun create(params: CouponCreateParams): CompletableFuture<Coupon> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CouponCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Coupon>

    /** Retrieves a coupon by its unique identifier. */
    fun retrieve(id: String): CompletableFuture<Coupon> = retrieve(id, CouponRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CouponRetrieveParams = CouponRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Coupon> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CouponRetrieveParams = CouponRetrieveParams.none(),
    ): CompletableFuture<Coupon> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CouponRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Coupon>

    /** @see retrieve */
    fun retrieve(params: CouponRetrieveParams): CompletableFuture<Coupon> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Coupon> =
        retrieve(id, CouponRetrieveParams.none(), requestOptions)

    /** Retrieves a paginated list of coupons in the environment. */
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
        fun create(params: CouponCreateParams): CompletableFuture<HttpResponseFor<Coupon>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Coupon>>

        /**
         * Returns a raw HTTP response for `get /api/v1/coupons/{id}`, but is otherwise the same as
         * [CouponServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Coupon>> =
            retrieve(id, CouponRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CouponRetrieveParams = CouponRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Coupon>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CouponRetrieveParams = CouponRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Coupon>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CouponRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Coupon>>

        /** @see retrieve */
        fun retrieve(params: CouponRetrieveParams): CompletableFuture<HttpResponseFor<Coupon>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Coupon>> =
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
