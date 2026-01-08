// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.V1CreateEventParams
import com.stigg.api.models.v1.V1CreateEventResponse
import com.stigg.api.models.v1.V1CreateUsageParams
import com.stigg.api.models.v1.V1CreateUsageResponse
import com.stigg.api.services.blocking.v1.CouponService
import com.stigg.api.services.blocking.v1.CustomerService
import com.stigg.api.services.blocking.v1.SubscriptionService
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    fun customers(): CustomerService

    fun subscriptions(): SubscriptionService

    fun coupons(): CouponService

    /** Create events */
    fun createEvent(params: V1CreateEventParams): V1CreateEventResponse =
        createEvent(params, RequestOptions.none())

    /** @see createEvent */
    fun createEvent(
        params: V1CreateEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1CreateEventResponse

    /** Create a new Usage */
    fun createUsage(params: V1CreateUsageParams): V1CreateUsageResponse =
        createUsage(params, RequestOptions.none())

    /** @see createUsage */
    fun createUsage(
        params: V1CreateUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1CreateUsageResponse

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        fun customers(): CustomerService.WithRawResponse

        fun subscriptions(): SubscriptionService.WithRawResponse

        fun coupons(): CouponService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/events`, but is otherwise the same as
         * [V1Service.createEvent].
         */
        @MustBeClosed
        fun createEvent(params: V1CreateEventParams): HttpResponseFor<V1CreateEventResponse> =
            createEvent(params, RequestOptions.none())

        /** @see createEvent */
        @MustBeClosed
        fun createEvent(
            params: V1CreateEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1CreateEventResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/usage`, but is otherwise the same as
         * [V1Service.createUsage].
         */
        @MustBeClosed
        fun createUsage(params: V1CreateUsageParams): HttpResponseFor<V1CreateUsageResponse> =
            createUsage(params, RequestOptions.none())

        /** @see createUsage */
        @MustBeClosed
        fun createUsage(
            params: V1CreateUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1CreateUsageResponse>
    }
}
