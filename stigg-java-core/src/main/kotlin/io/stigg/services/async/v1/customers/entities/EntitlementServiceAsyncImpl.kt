// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers.entities

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
import io.stigg.models.v1.customers.entities.entitlements.EntitlementListPageAsync
import io.stigg.models.v1.customers.entities.entitlements.EntitlementListPageResponse
import io.stigg.models.v1.customers.entities.entitlements.EntitlementListParams
import io.stigg.models.v1.customers.entities.entitlements.EntitlementUpsertParams
import io.stigg.models.v1.customers.entities.entitlements.EntitlementUpsertResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EntitlementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EntitlementServiceAsync {

    private val withRawResponse: EntitlementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntitlementServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementServiceAsync =
        EntitlementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: EntitlementListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementListPageAsync> =
        // get /api/v1/customers/{id}/entities/entitlements
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun upsert(
        params: EntitlementUpsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementUpsertResponse> =
        // put /api/v1/customers/{id}/entities/entitlements
        withRawResponse().upsert(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntitlementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntitlementServiceAsync.WithRawResponse =
            EntitlementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<EntitlementListPageResponse> =
            jsonHandler<EntitlementListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EntitlementListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntitlementListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "entities",
                        "entitlements",
                    )
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
                                EntitlementListPageAsync.builder()
                                    .service(EntitlementServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val upsertHandler: Handler<EntitlementUpsertResponse> =
            jsonHandler<EntitlementUpsertResponse>(clientOptions.jsonMapper)

        override fun upsert(
            params: EntitlementUpsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntitlementUpsertResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "entities",
                        "entitlements",
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
                            .use { upsertHandler.handle(it) }
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
