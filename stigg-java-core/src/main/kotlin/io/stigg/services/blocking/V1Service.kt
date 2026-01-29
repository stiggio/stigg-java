// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.v1.CouponService
import io.stigg.services.blocking.v1.CustomerService
import io.stigg.services.blocking.v1.EventService
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

    fun coupons(): CouponService

    fun events(): EventService

    fun usage(): UsageService

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

        fun events(): EventService.WithRawResponse

        fun usage(): UsageService.WithRawResponse
    }
}
