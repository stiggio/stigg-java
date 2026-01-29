// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.v1.CouponService
import io.stigg.services.blocking.v1.CouponServiceImpl
import io.stigg.services.blocking.v1.CustomerService
import io.stigg.services.blocking.v1.CustomerServiceImpl
import io.stigg.services.blocking.v1.EventService
import io.stigg.services.blocking.v1.EventServiceImpl
import io.stigg.services.blocking.v1.SubscriptionService
import io.stigg.services.blocking.v1.SubscriptionServiceImpl
import io.stigg.services.blocking.v1.UsageService
import io.stigg.services.blocking.v1.UsageServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customers: CustomerService by lazy { CustomerServiceImpl(clientOptions) }

    private val subscriptions: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptions)
    }

    private val coupons: CouponService by lazy { CouponServiceImpl(clientOptions) }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerService = customers

    override fun subscriptions(): SubscriptionService = subscriptions

    override fun coupons(): CouponService = coupons

    override fun events(): EventService = events

    override fun usage(): UsageService = usage

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val customers: CustomerService.WithRawResponse by lazy {
            CustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionService.WithRawResponse by lazy {
            SubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val coupons: CouponService.WithRawResponse by lazy {
            CouponServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageService.WithRawResponse by lazy {
            UsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerService.WithRawResponse = customers

        override fun subscriptions(): SubscriptionService.WithRawResponse = subscriptions

        override fun coupons(): CouponService.WithRawResponse = coupons

        override fun events(): EventService.WithRawResponse = events

        override fun usage(): UsageService.WithRawResponse = usage
    }
}
