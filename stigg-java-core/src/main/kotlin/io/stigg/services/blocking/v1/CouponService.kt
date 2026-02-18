// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.coupons.Coupon
import io.stigg.models.v1.coupons.CouponArchiveCouponParams
import io.stigg.models.v1.coupons.CouponCreateParams
import io.stigg.models.v1.coupons.CouponListPage
import io.stigg.models.v1.coupons.CouponListParams
import io.stigg.models.v1.coupons.CouponRetrieveParams
import io.stigg.models.v1.coupons.CouponUpdateCouponParams
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

    /**
     * Creates a new discount coupon with percentage or fixed amount off, applicable to customer
     * subscriptions.
     */
    fun create(params: CouponCreateParams): Coupon = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CouponCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon

    /** Retrieves a coupon by its unique identifier. */
    fun retrieve(id: String): Coupon = retrieve(id, CouponRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CouponRetrieveParams = CouponRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: CouponRetrieveParams = CouponRetrieveParams.none()): Coupon =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CouponRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon

    /** @see retrieve */
    fun retrieve(params: CouponRetrieveParams): Coupon = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Coupon =
        retrieve(id, CouponRetrieveParams.none(), requestOptions)

    /** Retrieves a paginated list of coupons in the environment. */
    fun list(): CouponListPage = list(CouponListParams.none())

    /** @see list */
    fun list(
        params: CouponListParams = CouponListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CouponListPage

    /** @see list */
    fun list(params: CouponListParams = CouponListParams.none()): CouponListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CouponListPage =
        list(CouponListParams.none(), requestOptions)

    /** Archives a coupon, preventing it from being applied to new subscriptions. */
    fun archiveCoupon(id: String): Coupon = archiveCoupon(id, CouponArchiveCouponParams.none())

    /** @see archiveCoupon */
    fun archiveCoupon(
        id: String,
        params: CouponArchiveCouponParams = CouponArchiveCouponParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon = archiveCoupon(params.toBuilder().id(id).build(), requestOptions)

    /** @see archiveCoupon */
    fun archiveCoupon(
        id: String,
        params: CouponArchiveCouponParams = CouponArchiveCouponParams.none(),
    ): Coupon = archiveCoupon(id, params, RequestOptions.none())

    /** @see archiveCoupon */
    fun archiveCoupon(
        params: CouponArchiveCouponParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon

    /** @see archiveCoupon */
    fun archiveCoupon(params: CouponArchiveCouponParams): Coupon =
        archiveCoupon(params, RequestOptions.none())

    /** @see archiveCoupon */
    fun archiveCoupon(id: String, requestOptions: RequestOptions): Coupon =
        archiveCoupon(id, CouponArchiveCouponParams.none(), requestOptions)

    /** Updates an existing coupon's properties such as name, description, and metadata. */
    fun updateCoupon(id: String): Coupon = updateCoupon(id, CouponUpdateCouponParams.none())

    /** @see updateCoupon */
    fun updateCoupon(
        id: String,
        params: CouponUpdateCouponParams = CouponUpdateCouponParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon = updateCoupon(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateCoupon */
    fun updateCoupon(
        id: String,
        params: CouponUpdateCouponParams = CouponUpdateCouponParams.none(),
    ): Coupon = updateCoupon(id, params, RequestOptions.none())

    /** @see updateCoupon */
    fun updateCoupon(
        params: CouponUpdateCouponParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon

    /** @see updateCoupon */
    fun updateCoupon(params: CouponUpdateCouponParams): Coupon =
        updateCoupon(params, RequestOptions.none())

    /** @see updateCoupon */
    fun updateCoupon(id: String, requestOptions: RequestOptions): Coupon =
        updateCoupon(id, CouponUpdateCouponParams.none(), requestOptions)

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
        fun create(params: CouponCreateParams): HttpResponseFor<Coupon> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon>

        /**
         * Returns a raw HTTP response for `get /api/v1/coupons/{id}`, but is otherwise the same as
         * [CouponService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Coupon> =
            retrieve(id, CouponRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CouponRetrieveParams = CouponRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CouponRetrieveParams = CouponRetrieveParams.none(),
        ): HttpResponseFor<Coupon> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CouponRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CouponRetrieveParams): HttpResponseFor<Coupon> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Coupon> =
            retrieve(id, CouponRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/coupons`, but is otherwise the same as
         * [CouponService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<CouponListPage> = list(CouponListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CouponListParams = CouponListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CouponListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CouponListParams = CouponListParams.none()
        ): HttpResponseFor<CouponListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CouponListPage> =
            list(CouponListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/coupons/{id}/archive`, but is otherwise the
         * same as [CouponService.archiveCoupon].
         */
        @MustBeClosed
        fun archiveCoupon(id: String): HttpResponseFor<Coupon> =
            archiveCoupon(id, CouponArchiveCouponParams.none())

        /** @see archiveCoupon */
        @MustBeClosed
        fun archiveCoupon(
            id: String,
            params: CouponArchiveCouponParams = CouponArchiveCouponParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon> =
            archiveCoupon(params.toBuilder().id(id).build(), requestOptions)

        /** @see archiveCoupon */
        @MustBeClosed
        fun archiveCoupon(
            id: String,
            params: CouponArchiveCouponParams = CouponArchiveCouponParams.none(),
        ): HttpResponseFor<Coupon> = archiveCoupon(id, params, RequestOptions.none())

        /** @see archiveCoupon */
        @MustBeClosed
        fun archiveCoupon(
            params: CouponArchiveCouponParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon>

        /** @see archiveCoupon */
        @MustBeClosed
        fun archiveCoupon(params: CouponArchiveCouponParams): HttpResponseFor<Coupon> =
            archiveCoupon(params, RequestOptions.none())

        /** @see archiveCoupon */
        @MustBeClosed
        fun archiveCoupon(id: String, requestOptions: RequestOptions): HttpResponseFor<Coupon> =
            archiveCoupon(id, CouponArchiveCouponParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/coupons/{id}`, but is otherwise the same
         * as [CouponService.updateCoupon].
         */
        @MustBeClosed
        fun updateCoupon(id: String): HttpResponseFor<Coupon> =
            updateCoupon(id, CouponUpdateCouponParams.none())

        /** @see updateCoupon */
        @MustBeClosed
        fun updateCoupon(
            id: String,
            params: CouponUpdateCouponParams = CouponUpdateCouponParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon> = updateCoupon(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateCoupon */
        @MustBeClosed
        fun updateCoupon(
            id: String,
            params: CouponUpdateCouponParams = CouponUpdateCouponParams.none(),
        ): HttpResponseFor<Coupon> = updateCoupon(id, params, RequestOptions.none())

        /** @see updateCoupon */
        @MustBeClosed
        fun updateCoupon(
            params: CouponUpdateCouponParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon>

        /** @see updateCoupon */
        @MustBeClosed
        fun updateCoupon(params: CouponUpdateCouponParams): HttpResponseFor<Coupon> =
            updateCoupon(params, RequestOptions.none())

        /** @see updateCoupon */
        @MustBeClosed
        fun updateCoupon(id: String, requestOptions: RequestOptions): HttpResponseFor<Coupon> =
            updateCoupon(id, CouponUpdateCouponParams.none(), requestOptions)
    }
}
