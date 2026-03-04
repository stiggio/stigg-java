// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.v1.AddonService
import io.stigg.services.blocking.v1.CouponService
import io.stigg.services.blocking.v1.CustomerService
import io.stigg.services.blocking.v1.EventService
import io.stigg.services.blocking.v1.FeatureService
import io.stigg.services.blocking.v1.PlanService
import io.stigg.services.blocking.v1.ProductService
import io.stigg.services.blocking.v1.SubscriptionService
import io.stigg.services.blocking.v1.UsageService
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

    /** Operations related to coupons */
    fun coupons(): CouponService

    /** Operations related to usage & metering */
    fun events(): EventService

    /** Operations related to features */
    fun features(): FeatureService

    /** Operations related to addons */
    fun addons(): AddonService

    /** Operations related to plans */
    fun plans(): PlanService

    /** Operations related to usage & metering */
    fun usage(): UsageService

    /** Operations related to products */
    fun products(): ProductService

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

        /** Operations related to coupons */
        fun coupons(): CouponService.WithRawResponse

        /** Operations related to usage & metering */
        fun events(): EventService.WithRawResponse

        /** Operations related to features */
        fun features(): FeatureService.WithRawResponse

        /** Operations related to addons */
        fun addons(): AddonService.WithRawResponse

        /** Operations related to plans */
        fun plans(): PlanService.WithRawResponse

        /** Operations related to usage & metering */
        fun usage(): UsageService.WithRawResponse

        /** Operations related to products */
        fun products(): ProductService.WithRawResponse
    }
}
