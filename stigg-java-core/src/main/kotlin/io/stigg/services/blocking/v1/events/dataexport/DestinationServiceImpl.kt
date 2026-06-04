// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.dataexport

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
import io.stigg.models.v1.events.dataexport.destinations.DestinationCreateParams
import io.stigg.models.v1.events.dataexport.destinations.DestinationCreateResponse
import io.stigg.models.v1.events.dataexport.destinations.DestinationDeleteParams
import io.stigg.models.v1.events.dataexport.destinations.DestinationDeleteResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DestinationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DestinationService {

    private val withRawResponse: DestinationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DestinationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DestinationService =
        DestinationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DestinationCreateParams,
        requestOptions: RequestOptions,
    ): DestinationCreateResponse =
        // post /api/v1/data-export/destinations
        withRawResponse().create(params, requestOptions).parse()

    override fun delete(
        params: DestinationDeleteParams,
        requestOptions: RequestOptions,
    ): DestinationDeleteResponse =
        // delete /api/v1/data-export/destinations/{destinationId}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DestinationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DestinationService.WithRawResponse =
            DestinationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DestinationCreateResponse> =
            jsonHandler<DestinationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DestinationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DestinationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-export", "destinations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<DestinationDeleteResponse> =
            jsonHandler<DestinationDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DestinationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DestinationDeleteResponse> {
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
    }
}
