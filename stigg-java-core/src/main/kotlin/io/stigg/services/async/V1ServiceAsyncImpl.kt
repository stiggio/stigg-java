// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async

import io.stigg.core.ClientOptions
import io.stigg.services.async.v1.AddonServiceAsync
import io.stigg.services.async.v1.AddonServiceAsyncImpl
import io.stigg.services.async.v1.CouponServiceAsync
import io.stigg.services.async.v1.CouponServiceAsyncImpl
import io.stigg.services.async.v1.CreditServiceAsync
import io.stigg.services.async.v1.CreditServiceAsyncImpl
import io.stigg.services.async.v1.CustomerServiceAsync
import io.stigg.services.async.v1.CustomerServiceAsyncImpl
import io.stigg.services.async.v1.EventServiceAsync
import io.stigg.services.async.v1.EventServiceAsyncImpl
import io.stigg.services.async.v1.FeatureServiceAsync
import io.stigg.services.async.v1.FeatureServiceAsyncImpl
import io.stigg.services.async.v1.PlanServiceAsync
import io.stigg.services.async.v1.PlanServiceAsyncImpl
import io.stigg.services.async.v1.ProductServiceAsync
import io.stigg.services.async.v1.ProductServiceAsyncImpl
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

    private val credits: CreditServiceAsync by lazy { CreditServiceAsyncImpl(clientOptions) }

    private val features: FeatureServiceAsync by lazy { FeatureServiceAsyncImpl(clientOptions) }

    private val addons: AddonServiceAsync by lazy { AddonServiceAsyncImpl(clientOptions) }

    private val plans: PlanServiceAsync by lazy { PlanServiceAsyncImpl(clientOptions) }

    private val usage: UsageServiceAsync by lazy { UsageServiceAsyncImpl(clientOptions) }

    private val products: ProductServiceAsync by lazy { ProductServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerServiceAsync = customers

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    /** Operations related to coupons */
    override fun coupons(): CouponServiceAsync = coupons

    /** Operations related to usage & metering */
    override fun events(): EventServiceAsync = events

    override fun credits(): CreditServiceAsync = credits

    /** Operations related to features */
    override fun features(): FeatureServiceAsync = features

    /** Operations related to addons */
    override fun addons(): AddonServiceAsync = addons

    /** Operations related to plans */
    override fun plans(): PlanServiceAsync = plans

    /** Operations related to usage & metering */
    override fun usage(): UsageServiceAsync = usage

    /** Operations related to products */
    override fun products(): ProductServiceAsync = products

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

        private val credits: CreditServiceAsync.WithRawResponse by lazy {
            CreditServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val features: FeatureServiceAsync.WithRawResponse by lazy {
            FeatureServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val addons: AddonServiceAsync.WithRawResponse by lazy {
            AddonServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val plans: PlanServiceAsync.WithRawResponse by lazy {
            PlanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val products: ProductServiceAsync.WithRawResponse by lazy {
            ProductServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerServiceAsync.WithRawResponse = customers

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions

        /** Operations related to coupons */
        override fun coupons(): CouponServiceAsync.WithRawResponse = coupons

        /** Operations related to usage & metering */
        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun credits(): CreditServiceAsync.WithRawResponse = credits

        /** Operations related to features */
        override fun features(): FeatureServiceAsync.WithRawResponse = features

        /** Operations related to addons */
        override fun addons(): AddonServiceAsync.WithRawResponse = addons

        /** Operations related to plans */
        override fun plans(): PlanServiceAsync.WithRawResponse = plans

        /** Operations related to usage & metering */
        override fun usage(): UsageServiceAsync.WithRawResponse = usage

        /** Operations related to products */
        override fun products(): ProductServiceAsync.WithRawResponse = products
    }
}
