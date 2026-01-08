// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.handlers.errorBodyHandler
import com.stigg.api.core.handlers.errorHandler
import com.stigg.api.core.handlers.jsonHandler
import com.stigg.api.core.http.HttpMethod
import com.stigg.api.core.http.HttpRequest
import com.stigg.api.core.http.HttpResponse
import com.stigg.api.core.http.HttpResponse.Handler
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.core.http.json
import com.stigg.api.core.http.parseable
import com.stigg.api.core.prepare
import com.stigg.api.models.v1.V1CreateEventParams
import com.stigg.api.models.v1.V1CreateEventResponse
import com.stigg.api.models.v1.V1CreateUsageParams
import com.stigg.api.models.v1.V1CreateUsageResponse
import com.stigg.api.services.blocking.v1.CouponService
import com.stigg.api.services.blocking.v1.CouponServiceImpl
import com.stigg.api.services.blocking.v1.CustomerService
import com.stigg.api.services.blocking.v1.CustomerServiceImpl
import com.stigg.api.services.blocking.v1.SubscriptionService
import com.stigg.api.services.blocking.v1.SubscriptionServiceImpl
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

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerService = customers

    override fun subscriptions(): SubscriptionService = subscriptions

    override fun coupons(): CouponService = coupons

    override fun createEvent(
        params: V1CreateEventParams,
        requestOptions: RequestOptions,
    ): V1CreateEventResponse =
        // post /api/v1/events
        withRawResponse().createEvent(params, requestOptions).parse()

    override fun createUsage(
        params: V1CreateUsageParams,
        requestOptions: RequestOptions,
    ): V1CreateUsageResponse =
        // post /api/v1/usage
        withRawResponse().createUsage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val customers: CustomerService.WithRawResponse by lazy {
            CustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionService.WithRawResponse by lazy {
            SubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val coupons: CouponService.WithRawResponse by lazy {
            CouponServiceImpl.WithRawResponseImpl(clientOptions)
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

        private val createEventHandler: Handler<V1CreateEventResponse> =
            jsonHandler<V1CreateEventResponse>(clientOptions.jsonMapper)

        override fun createEvent(
            params: V1CreateEventParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1CreateEventResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "events")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createEventHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createUsageHandler: Handler<V1CreateUsageResponse> =
            jsonHandler<V1CreateUsageResponse>(clientOptions.jsonMapper)

        override fun createUsage(
            params: V1CreateUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1CreateUsageResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "usage")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
