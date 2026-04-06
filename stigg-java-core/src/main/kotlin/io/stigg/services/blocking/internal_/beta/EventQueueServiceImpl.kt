// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.internal_.beta

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
import io.stigg.core.prepare
import io.stigg.models.internal_.beta.eventqueues.EventQueueDeleteParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueDeleteResponse
import io.stigg.models.internal_.beta.eventqueues.EventQueueListParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueListResponse
import io.stigg.models.internal_.beta.eventqueues.EventQueueProvisionParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueProvisionResponse
import io.stigg.models.internal_.beta.eventqueues.EventQueueRetrieveParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueRetrieveResponse
import io.stigg.models.internal_.beta.eventqueues.EventQueueUpdateParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EventQueueServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventQueueService {

    private val withRawResponse: EventQueueService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventQueueService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventQueueService =
        EventQueueServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: EventQueueRetrieveParams,
        requestOptions: RequestOptions,
    ): EventQueueRetrieveResponse =
        // get /internal/beta/event-queues/{queueName}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: EventQueueUpdateParams,
        requestOptions: RequestOptions,
    ): EventQueueUpdateResponse =
        // patch /internal/beta/event-queues/{queueName}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: EventQueueListParams,
        requestOptions: RequestOptions,
    ): EventQueueListResponse =
        // get /internal/beta/event-queues
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: EventQueueDeleteParams,
        requestOptions: RequestOptions,
    ): EventQueueDeleteResponse =
        // delete /internal/beta/event-queues/{queueName}
        withRawResponse().delete(params, requestOptions).parse()

    override fun provision(
        params: EventQueueProvisionParams,
        requestOptions: RequestOptions,
    ): EventQueueProvisionResponse =
        // post /internal/beta/event-queues/provision
        withRawResponse().provision(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventQueueService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventQueueService.WithRawResponse =
            EventQueueServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<EventQueueRetrieveResponse> =
            jsonHandler<EventQueueRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EventQueueRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventQueueRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueName", params.queueName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("internal", "beta", "event-queues", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<EventQueueUpdateResponse> =
            jsonHandler<EventQueueUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: EventQueueUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventQueueUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<EventQueueListResponse> =
            jsonHandler<EventQueueListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EventQueueListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventQueueListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("internal", "beta", "event-queues")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<EventQueueDeleteResponse> =
            jsonHandler<EventQueueDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: EventQueueDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventQueueDeleteResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val provisionHandler: Handler<EventQueueProvisionResponse> =
            jsonHandler<EventQueueProvisionResponse>(clientOptions.jsonMapper)

        override fun provision(
            params: EventQueueProvisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventQueueProvisionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("internal", "beta", "event-queues", "provision")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
