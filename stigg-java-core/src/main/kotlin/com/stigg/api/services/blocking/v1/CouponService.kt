// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.coupons.CouponCreateParams
import com.stigg.api.models.v1.coupons.CouponCreateResponse
import com.stigg.api.models.v1.coupons.CouponListParams
import com.stigg.api.models.v1.coupons.CouponListResponse
import com.stigg.api.models.v1.coupons.CouponRetrieveParams
import com.stigg.api.models.v1.coupons.CouponRetrieveResponse
import java.util.function.Consumer

interface CouponService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CouponService

    /** Create a new Coupon */
    fun create(params: CouponCreateParams): CouponCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CouponCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CouponCreateResponse

    /** Get a single Coupon by id */
    fun retrieve(id: String): CouponRetrieveResponse = retrieve(id, CouponRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CouponRetrieveParams = CouponRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CouponRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CouponRetrieveParams = CouponRetrieveParams.none(),
    ): CouponRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CouponRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CouponRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: CouponRetrieveParams): CouponRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CouponRetrieveResponse =
        retrieve(id, CouponRetrieveParams.none(), requestOptions)

    /** Get a list of Coupons */
    fun list(): CouponListResponse = list(CouponListParams.none())

    /** @see list */
    fun list(
        params: CouponListParams = CouponListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CouponListResponse

    /** @see list */
    fun list(params: CouponListParams = CouponListParams.none()): CouponListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CouponListResponse =
        list(CouponListParams.none(), requestOptions)

    /** A view of [CouponService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CouponService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/coupons`, but is otherwise the same as
         * [CouponService.create].
         */
        @MustBeClosed
        fun create(params: CouponCreateParams): HttpResponseFor<CouponCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CouponCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/coupons/{id}`, but is otherwise the same as
         * [CouponService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CouponRetrieveResponse> =
            retrieve(id, CouponRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CouponRetrieveParams = CouponRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CouponRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CouponRetrieveParams = CouponRetrieveParams.none(),
        ): HttpResponseFor<CouponRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CouponRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CouponRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CouponRetrieveParams): HttpResponseFor<CouponRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponRetrieveResponse> =
            retrieve(id, CouponRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/coupons`, but is otherwise the same as
         * [CouponService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CouponListResponse> = list(CouponListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CouponListParams = CouponListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CouponListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CouponListParams = CouponListParams.none()
        ): HttpResponseFor<CouponListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CouponListResponse> =
            list(CouponListParams.none(), requestOptions)
    }
}
