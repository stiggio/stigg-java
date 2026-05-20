// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async

import io.stigg.core.ClientOptions
import io.stigg.services.async.v1.AddonServiceAsync
import io.stigg.services.async.v1.CouponServiceAsync
import io.stigg.services.async.v1.CreditServiceAsync
import io.stigg.services.async.v1.CustomerServiceAsync
import io.stigg.services.async.v1.EventServiceAsync
import io.stigg.services.async.v1.FeatureServiceAsync
import io.stigg.services.async.v1.PlanServiceAsync
import io.stigg.services.async.v1.ProductServiceAsync
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

    /** Operations related to coupons */
    fun coupons(): CouponServiceAsync

    /** Operations related to usage & metering */
    fun events(): EventServiceAsync

    fun credits(): CreditServiceAsync

    /** Operations related to features */
    fun features(): FeatureServiceAsync

    /** Operations related to addons */
    fun addons(): AddonServiceAsync

    /** Operations related to plans */
    fun plans(): PlanServiceAsync

    /** Operations related to usage & metering */
    fun usage(): UsageServiceAsync

    /** Operations related to products */
    fun products(): ProductServiceAsync

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

        /** Operations related to coupons */
        fun coupons(): CouponServiceAsync.WithRawResponse

        /** Operations related to usage & metering */
        fun events(): EventServiceAsync.WithRawResponse

        fun credits(): CreditServiceAsync.WithRawResponse

        /** Operations related to features */
        fun features(): FeatureServiceAsync.WithRawResponse

        /** Operations related to addons */
        fun addons(): AddonServiceAsync.WithRawResponse

        /** Operations related to plans */
        fun plans(): PlanServiceAsync.WithRawResponse

        /** Operations related to usage & metering */
        fun usage(): UsageServiceAsync.WithRawResponse

        /** Operations related to products */
        fun products(): ProductServiceAsync.WithRawResponse
    }
}
