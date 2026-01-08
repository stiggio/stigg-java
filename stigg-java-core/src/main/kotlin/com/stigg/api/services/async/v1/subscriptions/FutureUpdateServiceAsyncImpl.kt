// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1.subscriptions

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.checkRequired
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
import com.stigg.api.core.prepareAsync
import com.stigg.api.models.v1.subscriptions.futureupdate.FutureUpdateCancelPendingPaymentParams
import com.stigg.api.models.v1.subscriptions.futureupdate.FutureUpdateCancelPendingPaymentResponse
import com.stigg.api.models.v1.subscriptions.futureupdate.FutureUpdateCancelScheduleParams
import com.stigg.api.models.v1.subscriptions.futureupdate.FutureUpdateCancelScheduleResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FutureUpdateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FutureUpdateServiceAsync {

    private val withRawResponse: FutureUpdateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FutureUpdateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FutureUpdateServiceAsync =
        FutureUpdateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cancelPendingPayment(
        params: FutureUpdateCancelPendingPaymentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FutureUpdateCancelPendingPaymentResponse> =
        // delete /api/v1/subscriptions/{id}/future-update/pending-payment
        withRawResponse().cancelPendingPayment(params, requestOptions).thenApply { it.parse() }

    override fun cancelSchedule(
        params: FutureUpdateCancelScheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FutureUpdateCancelScheduleResponse> =
        // delete /api/v1/subscriptions/{id}/future-update/schedule
        withRawResponse().cancelSchedule(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FutureUpdateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FutureUpdateServiceAsync.WithRawResponse =
            FutureUpdateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val cancelPendingPaymentHandler: Handler<FutureUpdateCancelPendingPaymentResponse> =
            jsonHandler<FutureUpdateCancelPendingPaymentResponse>(clientOptions.jsonMapper)

        override fun cancelPendingPayment(
            params: FutureUpdateCancelPendingPaymentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelPendingPaymentResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "subscriptions",
                        params._pathParam(0),
                        "future-update",
                        "pending-payment",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelPendingPaymentHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cancelScheduleHandler: Handler<FutureUpdateCancelScheduleResponse> =
            jsonHandler<FutureUpdateCancelScheduleResponse>(clientOptions.jsonMapper)

        override fun cancelSchedule(
            params: FutureUpdateCancelScheduleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelScheduleResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "subscriptions",
                        params._pathParam(0),
                        "future-update",
                        "schedule",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelScheduleHandler.handle(it) }
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
