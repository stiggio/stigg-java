// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

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
import io.stigg.models.v1.customers.integrations.IntegrationLinkParams
import io.stigg.models.v1.customers.integrations.IntegrationLinkResponse
import io.stigg.models.v1.customers.integrations.IntegrationListPageAsync
import io.stigg.models.v1.customers.integrations.IntegrationListPageResponse
import io.stigg.models.v1.customers.integrations.IntegrationListParams
import io.stigg.models.v1.customers.integrations.IntegrationRetrieveParams
import io.stigg.models.v1.customers.integrations.IntegrationRetrieveResponse
import io.stigg.models.v1.customers.integrations.IntegrationUnlinkParams
import io.stigg.models.v1.customers.integrations.IntegrationUnlinkResponse
import io.stigg.models.v1.customers.integrations.IntegrationUpdateParams
import io.stigg.models.v1.customers.integrations.IntegrationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class IntegrationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IntegrationServiceAsync {

    private val withRawResponse: IntegrationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntegrationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegrationServiceAsync =
        IntegrationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: IntegrationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationRetrieveResponse> =
        // get /api/v1/customers/{id}/integrations/{integrationId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: IntegrationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationUpdateResponse> =
        // patch /api/v1/customers/{id}/integrations/{integrationId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: IntegrationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationListPageAsync> =
        // get /api/v1/customers/{id}/integrations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun link(
        params: IntegrationLinkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationLinkResponse> =
        // post /api/v1/customers/{id}/integrations
        withRawResponse().link(params, requestOptions).thenApply { it.parse() }

    override fun unlink(
        params: IntegrationUnlinkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationUnlinkResponse> =
        // delete /api/v1/customers/{id}/integrations/{integrationId}
        withRawResponse().unlink(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntegrationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegrationServiceAsync.WithRawResponse =
            IntegrationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<IntegrationRetrieveResponse> =
            jsonHandler<IntegrationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: IntegrationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("integrationId", params.integrationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "integrations",
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
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<IntegrationUpdateResponse> =
            jsonHandler<IntegrationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: IntegrationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("integrationId", params.integrationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "integrations",
                        params._pathParam(1),
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
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<IntegrationListPageResponse> =
            jsonHandler<IntegrationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: IntegrationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0), "integrations")
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
                                IntegrationListPageAsync.builder()
                                    .service(IntegrationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val linkHandler: Handler<IntegrationLinkResponse> =
            jsonHandler<IntegrationLinkResponse>(clientOptions.jsonMapper)

        override fun link(
            params: IntegrationLinkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationLinkResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0), "integrations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { linkHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unlinkHandler: Handler<IntegrationUnlinkResponse> =
            jsonHandler<IntegrationUnlinkResponse>(clientOptions.jsonMapper)

        override fun unlink(
            params: IntegrationUnlinkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationUnlinkResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("integrationId", params.integrationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "integrations",
                        params._pathParam(1),
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
                            .use { unlinkHandler.handle(it) }
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
