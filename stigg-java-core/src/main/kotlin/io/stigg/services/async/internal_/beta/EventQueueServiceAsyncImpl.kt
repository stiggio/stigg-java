// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.internal_.beta

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
import io.stigg.models.internal_.beta.eventqueues.EventQueueDeleteParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueListParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueListResponse
import io.stigg.models.internal_.beta.eventqueues.EventQueueProvisionParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueResponse
import io.stigg.models.internal_.beta.eventqueues.EventQueueRetrieveParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EventQueueServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventQueueServiceAsync {

    private val withRawResponse: EventQueueServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventQueueServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventQueueServiceAsync =
        EventQueueServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: EventQueueRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventQueueResponse> =
        // get /internal/beta/event-queues/{queueName}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: EventQueueUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventQueueResponse> =
        // patch /internal/beta/event-queues/{queueName}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EventQueueListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventQueueListResponse> =
        // get /internal/beta/event-queues
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EventQueueDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventQueueResponse> =
        // delete /internal/beta/event-queues/{queueName}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun provision(
        params: EventQueueProvisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventQueueResponse> =
        // post /internal/beta/event-queues/provision
        withRawResponse().provision(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventQueueServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventQueueServiceAsync.WithRawResponse =
            EventQueueServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<EventQueueResponse> =
            jsonHandler<EventQueueResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EventQueueRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueName", params.queueName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("internal", "beta", "event-queues", params._pathParam(0))
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

        private val updateHandler: Handler<EventQueueResponse> =
            jsonHandler<EventQueueResponse>(clientOptions.jsonMapper)

        override fun update(
            params: EventQueueUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueName", params.queueName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("internal", "beta", "event-queues", params._pathParam(0))
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

        private val listHandler: Handler<EventQueueListResponse> =
            jsonHandler<EventQueueListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EventQueueListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventQueueListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("internal", "beta", "event-queues")
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
                    }
                }
        }

        private val deleteHandler: Handler<EventQueueResponse> =
            jsonHandler<EventQueueResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: EventQueueDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueName", params.queueName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("internal", "beta", "event-queues", params._pathParam(0))
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

        private val provisionHandler: Handler<EventQueueResponse> =
            jsonHandler<EventQueueResponse>(clientOptions.jsonMapper)

        override fun provision(
            params: EventQueueProvisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("internal", "beta", "event-queues", "provision")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { provisionHandler.handle(it) }
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
