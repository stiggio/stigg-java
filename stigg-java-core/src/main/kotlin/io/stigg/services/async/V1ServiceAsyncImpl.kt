// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.handlers.errorBodyHandler
import io.stigg.core.handlers.errorHandler
import io.stigg.core.handlers.jsonHandler
import io.stigg.core.http.HttpMethod
import io.stigg.core.http.HttpRequest
import io.stigg.core.http.HttpResponse
import io.stigg.core.http.HttpResponse.Handler
import io.stigg.core.http.HttpResponseFor
import io.stigg.core.http.json
import io.stigg.core.http.parseable
import io.stigg.core.prepareAsync
import io.stigg.models.v1.V1CreateEventParams
import io.stigg.models.v1.V1CreateEventResponse
import io.stigg.models.v1.V1CreateUsageParams
import io.stigg.models.v1.V1CreateUsageResponse
import io.stigg.services.async.v1.CouponServiceAsync
import io.stigg.services.async.v1.CouponServiceAsyncImpl
import io.stigg.services.async.v1.CustomerServiceAsync
import io.stigg.services.async.v1.CustomerServiceAsyncImpl
import io.stigg.services.async.v1.SubscriptionServiceAsync
import io.stigg.services.async.v1.SubscriptionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
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

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerServiceAsync = customers

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    override fun coupons(): CouponServiceAsync = coupons

    override fun createEvent(
        params: V1CreateEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CreateEventResponse> =
        // post /api/v1/events
        withRawResponse().createEvent(params, requestOptions).thenApply { it.parse() }

    override fun createUsage(
        params: V1CreateUsageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CreateUsageResponse> =
        // post /api/v1/usage
        withRawResponse().createUsage(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val customers: CustomerServiceAsync.WithRawResponse by lazy {
            CustomerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val coupons: CouponServiceAsync.WithRawResponse by lazy {
            CouponServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        private val createEventHandler: Handler<V1CreateEventResponse> =
            jsonHandler<V1CreateEventResponse>(clientOptions.jsonMapper)

        override fun createEvent(
            params: V1CreateEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1CreateEventResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "events")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createEventHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createUsageHandler: Handler<V1CreateUsageResponse> =
            jsonHandler<V1CreateUsageResponse>(clientOptions.jsonMapper)

        override fun createUsage(
            params: V1CreateUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1CreateUsageResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "usage")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
