// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async

import io.stigg.core.ClientOptions
import io.stigg.services.async.v1.CouponServiceAsync
import io.stigg.services.async.v1.CouponServiceAsyncImpl
import io.stigg.services.async.v1.CustomerServiceAsync
import io.stigg.services.async.v1.CustomerServiceAsyncImpl
import io.stigg.services.async.v1.EventServiceAsync
import io.stigg.services.async.v1.EventServiceAsyncImpl
import io.stigg.services.async.v1.SubscriptionServiceAsync
import io.stigg.services.async.v1.SubscriptionServiceAsyncImpl
import io.stigg.services.async.v1.UsageServiceAsync
import io.stigg.services.async.v1.UsageServiceAsyncImpl
import java.util.function.Consumer

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customers: CustomerServiceAsync by lazy { CustomerServiceAsyncImpl(clientOptions) }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    private val coupons: CouponServiceAsync by lazy { CouponServiceAsyncImpl(clientOptions) }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val usage: UsageServiceAsync by lazy { UsageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerServiceAsync = customers

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    override fun coupons(): CouponServiceAsync = coupons

    override fun events(): EventServiceAsync = events

    override fun usage(): UsageServiceAsync = usage

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val customers: CustomerServiceAsync.WithRawResponse by lazy {
            CustomerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val coupons: CouponServiceAsync.WithRawResponse by lazy {
            CouponServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerServiceAsync.WithRawResponse = customers

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions

        override fun coupons(): CouponServiceAsync.WithRawResponse = coupons

        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun usage(): UsageServiceAsync.WithRawResponse = usage
    }
}
