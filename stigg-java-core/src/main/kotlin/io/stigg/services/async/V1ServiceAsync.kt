// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async

import io.stigg.core.ClientOptions
import io.stigg.services.async.v1.CouponServiceAsync
import io.stigg.services.async.v1.CustomerServiceAsync
import io.stigg.services.async.v1.EventServiceAsync
import io.stigg.services.async.v1.SubscriptionServiceAsync
import io.stigg.services.async.v1.UsageServiceAsync
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

    fun events(): EventServiceAsync

    fun usage(): UsageServiceAsync

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

        fun events(): EventServiceAsync.WithRawResponse

        fun usage(): UsageServiceAsync.WithRawResponse
    }
}
