// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.dataexport

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
import io.stigg.models.v1.events.dataexport.destinations.DestinationCreateParams
import io.stigg.models.v1.events.dataexport.destinations.DestinationCreateResponse
import io.stigg.models.v1.events.dataexport.destinations.DestinationDeleteParams
import io.stigg.models.v1.events.dataexport.destinations.DestinationDeleteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DestinationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DestinationServiceAsync {

    private val withRawResponse: DestinationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DestinationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DestinationServiceAsync =
        DestinationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DestinationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DestinationCreateResponse> =
        // post /api/v1/data-export/destinations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DestinationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DestinationDeleteResponse> =
        // delete /api/v1/data-export/destinations/{destinationId}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DestinationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DestinationServiceAsync.WithRawResponse =
            DestinationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DestinationCreateResponse> =
            jsonHandler<DestinationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DestinationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DestinationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-export", "destinations")
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

        private val deleteHandler: Handler<DestinationDeleteResponse> =
            jsonHandler<DestinationDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DestinationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DestinationDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("destinationId", params.destinationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "data-export",
                        "destinations",
                        params._pathParam(0),
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
                            .use { deleteHandler.handle(it) }
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
