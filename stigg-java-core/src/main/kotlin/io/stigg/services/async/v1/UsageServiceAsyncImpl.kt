// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

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
import io.stigg.models.v1.usage.UsageHistoryParams
import io.stigg.models.v1.usage.UsageHistoryResponse
import io.stigg.models.v1.usage.UsageReportParams
import io.stigg.models.v1.usage.UsageReportResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UsageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageServiceAsync {

    private val withRawResponse: UsageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageServiceAsync =
        UsageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(
        params: UsageHistoryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageHistoryResponse> =
        // get /api/v1/usage/{customerId}/history/{featureId}
        withRawResponse().history(params, requestOptions).thenApply { it.parse() }

    override fun report(
        params: UsageReportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageReportResponse> =
        // post /api/v1/usage
        withRawResponse().report(params, requestOptions).thenApply { it.parse() }

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

        private val historyHandler: Handler<UsageHistoryResponse> =
            jsonHandler<UsageHistoryResponse>(clientOptions.jsonMapper)

        override fun history(
            params: UsageHistoryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageHistoryResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("featureId", params.featureId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "usage",
                        params._pathParam(0),
                        "history",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { historyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val reportHandler: Handler<UsageReportResponse> =
            jsonHandler<UsageReportResponse>(clientOptions.jsonMapper)

        override fun report(
            params: UsageReportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageReportResponse>> {
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
                            .use { reportHandler.handle(it) }
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
