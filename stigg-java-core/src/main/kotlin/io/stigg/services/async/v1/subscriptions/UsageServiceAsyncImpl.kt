// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.subscriptions

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.checkRequired
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
import io.stigg.models.v1.subscriptions.usage.UsageChargeUsageParams
import io.stigg.models.v1.subscriptions.usage.UsageChargeUsageResponse
import io.stigg.models.v1.subscriptions.usage.UsageSyncParams
import io.stigg.models.v1.subscriptions.usage.UsageSyncResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Operations related to subscriptions */
class UsageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageServiceAsync {

    private val withRawResponse: UsageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageServiceAsync =
        UsageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun chargeUsage(
        params: UsageChargeUsageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageChargeUsageResponse> =
        // post /api/v1/subscriptions/{id}/usage/charge
        withRawResponse().chargeUsage(params, requestOptions).thenApply { it.parse() }

    override fun sync(
        params: UsageSyncParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageSyncResponse> =
        // post /api/v1/subscriptions/{id}/usage/sync
        withRawResponse().sync(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageServiceAsync.WithRawResponse =
            UsageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val chargeUsageHandler: Handler<UsageChargeUsageResponse> =
            jsonHandler<UsageChargeUsageResponse>(clientOptions.jsonMapper)

        override fun chargeUsage(
            params: UsageChargeUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageChargeUsageResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "subscriptions",
                        params._pathParam(0),
                        "usage",
                        "charge",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { chargeUsageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val syncHandler: Handler<UsageSyncResponse> =
            jsonHandler<UsageSyncResponse>(clientOptions.jsonMapper)

        override fun sync(
            params: UsageSyncParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageSyncResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "subscriptions",
                        params._pathParam(0),
                        "usage",
                        "sync",
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
                            .use { syncHandler.handle(it) }
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
