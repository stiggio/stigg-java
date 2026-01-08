// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.V1CreateEventParams
import com.stigg.api.models.v1.V1CreateEventResponse
import com.stigg.api.models.v1.V1CreateUsageParams
import com.stigg.api.models.v1.V1CreateUsageResponse
import com.stigg.api.services.async.v1.CouponServiceAsync
import com.stigg.api.services.async.v1.CustomerServiceAsync
import com.stigg.api.services.async.v1.SubscriptionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    fun customers(): CustomerServiceAsync

    fun subscriptions(): SubscriptionServiceAsync

    fun coupons(): CouponServiceAsync

    /** Create events */
    fun createEvent(params: V1CreateEventParams): CompletableFuture<V1CreateEventResponse> =
        createEvent(params, RequestOptions.none())

    /** @see createEvent */
    fun createEvent(
        params: V1CreateEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CreateEventResponse>

    /** Create a new Usage */
    fun createUsage(params: V1CreateUsageParams): CompletableFuture<V1CreateUsageResponse> =
        createUsage(params, RequestOptions.none())

    /** @see createUsage */
    fun createUsage(
        params: V1CreateUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CreateUsageResponse>

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        fun customers(): CustomerServiceAsync.WithRawResponse

        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        fun coupons(): CouponServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/events`, but is otherwise the same as
         * [V1ServiceAsync.createEvent].
         */
        fun createEvent(
            params: V1CreateEventParams
        ): CompletableFuture<HttpResponseFor<V1CreateEventResponse>> =
            createEvent(params, RequestOptions.none())

        /** @see createEvent */
        fun createEvent(
            params: V1CreateEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1CreateEventResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/usage`, but is otherwise the same as
         * [V1ServiceAsync.createUsage].
         */
        fun createUsage(
            params: V1CreateUsageParams
        ): CompletableFuture<HttpResponseFor<V1CreateUsageResponse>> =
            createUsage(params, RequestOptions.none())

        /** @see createUsage */
        fun createUsage(
            params: V1CreateUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1CreateUsageResponse>>
    }
}
