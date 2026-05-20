// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.credits

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
import io.stigg.models.v1.credits.grants.CreditGrantResponse
import io.stigg.models.v1.credits.grants.GrantCreateParams
import io.stigg.models.v1.credits.grants.GrantListPageAsync
import io.stigg.models.v1.credits.grants.GrantListPageResponse
import io.stigg.models.v1.credits.grants.GrantListParams
import io.stigg.models.v1.credits.grants.GrantVoidParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Operations related to credit grants */
class GrantServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GrantServiceAsync {

    private val withRawResponse: GrantServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GrantServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GrantServiceAsync =
        GrantServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GrantCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditGrantResponse> =
        // post /api/v1/credits/grants
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: GrantListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GrantListPageAsync> =
        // get /api/v1/credits/grants
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun void_(
        params: GrantVoidParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditGrantResponse> =
        // post /api/v1/credits/grants/{id}/void
        withRawResponse().void_(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GrantServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GrantServiceAsync.WithRawResponse =
            GrantServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CreditGrantResponse> =
            jsonHandler<CreditGrantResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GrantCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditGrantResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "grants")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<GrantListPageResponse> =
            jsonHandler<GrantListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GrantListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GrantListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "grants")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                GrantListPageAsync.builder()
                                    .service(GrantServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val voidHandler: Handler<CreditGrantResponse> =
            jsonHandler<CreditGrantResponse>(clientOptions.jsonMapper)

        override fun void_(
            params: GrantVoidParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditGrantResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "grants", params._pathParam(0), "void")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { voidHandler.handle(it) }
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
