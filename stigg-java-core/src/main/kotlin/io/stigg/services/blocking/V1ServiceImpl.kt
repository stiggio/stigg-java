// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking

import io.stigg.core.ClientOptions
import io.stigg.services.blocking.v1.AddonService
import io.stigg.services.blocking.v1.AddonServiceImpl
import io.stigg.services.blocking.v1.ContractService
import io.stigg.services.blocking.v1.ContractServiceImpl
import io.stigg.services.blocking.v1.CouponService
import io.stigg.services.blocking.v1.CouponServiceImpl
import io.stigg.services.blocking.v1.CreditService
import io.stigg.services.blocking.v1.CreditServiceImpl
import io.stigg.services.blocking.v1.CustomerService
import io.stigg.services.blocking.v1.CustomerServiceImpl
import io.stigg.services.blocking.v1.EventService
import io.stigg.services.blocking.v1.EventServiceImpl
import io.stigg.services.blocking.v1.FeatureService
import io.stigg.services.blocking.v1.FeatureServiceImpl
import io.stigg.services.blocking.v1.PlanService
import io.stigg.services.blocking.v1.PlanServiceImpl
import io.stigg.services.blocking.v1.ProductService
import io.stigg.services.blocking.v1.ProductServiceImpl
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

    private val credits: CreditService by lazy { CreditServiceImpl(clientOptions) }

    private val features: FeatureService by lazy { FeatureServiceImpl(clientOptions) }

    private val addons: AddonService by lazy { AddonServiceImpl(clientOptions) }

    private val plans: PlanService by lazy { PlanServiceImpl(clientOptions) }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptions) }

    private val products: ProductService by lazy { ProductServiceImpl(clientOptions) }

    private val contracts: ContractService by lazy { ContractServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerService = customers

    override fun subscriptions(): SubscriptionService = subscriptions

    /** Operations related to coupons */
    override fun coupons(): CouponService = coupons

    /** Operations related to usage & metering */
    override fun events(): EventService = events

    override fun credits(): CreditService = credits

    /** Operations related to features */
    override fun features(): FeatureService = features

    /** Operations related to addons */
    override fun addons(): AddonService = addons

    /** Operations related to plans */
    override fun plans(): PlanService = plans

    /** Operations related to usage & metering */
    override fun usage(): UsageService = usage

    /** Operations related to products */
    override fun products(): ProductService = products

    override fun contracts(): ContractService = contracts

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

        private val credits: CreditService.WithRawResponse by lazy {
            CreditServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val features: FeatureService.WithRawResponse by lazy {
            FeatureServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val addons: AddonService.WithRawResponse by lazy {
            AddonServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val plans: PlanService.WithRawResponse by lazy {
            PlanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageService.WithRawResponse by lazy {
            UsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val products: ProductService.WithRawResponse by lazy {
            ProductServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val contracts: ContractService.WithRawResponse by lazy {
            ContractServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerService.WithRawResponse = customers

        override fun subscriptions(): SubscriptionService.WithRawResponse = subscriptions

        /** Operations related to coupons */
        override fun coupons(): CouponService.WithRawResponse = coupons

        /** Operations related to usage & metering */
        override fun events(): EventService.WithRawResponse = events

        override fun credits(): CreditService.WithRawResponse = credits

        /** Operations related to features */
        override fun features(): FeatureService.WithRawResponse = features

        /** Operations related to addons */
        override fun addons(): AddonService.WithRawResponse = addons

        /** Operations related to plans */
        override fun plans(): PlanService.WithRawResponse = plans

        /** Operations related to usage & metering */
        override fun usage(): UsageService.WithRawResponse = usage

        /** Operations related to products */
        override fun products(): ProductService.WithRawResponse = products

        override fun contracts(): ContractService.WithRawResponse = contracts
    }
}
