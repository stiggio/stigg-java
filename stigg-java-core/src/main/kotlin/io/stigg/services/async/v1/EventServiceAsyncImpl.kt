// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
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
import io.stigg.models.v1.events.EventEstimateCostParams
import io.stigg.models.v1.events.EventEstimateCostResponse
import io.stigg.models.v1.events.EventReportParams
import io.stigg.models.v1.events.EventReportResponse
import io.stigg.services.async.v1.events.DataExportServiceAsync
import io.stigg.services.async.v1.events.DataExportServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations related to usage & metering */
class EventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventServiceAsync {

    private val withRawResponse: EventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val dataExport: DataExportServiceAsync by lazy {
        DataExportServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): EventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync =
        EventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun dataExport(): DataExportServiceAsync = dataExport

    override fun estimateCost(
        params: EventEstimateCostParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventEstimateCostResponse> =
        // post /api/v1/events/estimate
        withRawResponse().estimateCost(params, requestOptions).thenApply { it.parse() }

    override fun report(
        params: EventReportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventReportResponse> =
        // post /api/v1/events
        withRawResponse().report(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val dataExport: DataExportServiceAsync.WithRawResponse by lazy {
            DataExportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse =
            EventServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun dataExport(): DataExportServiceAsync.WithRawResponse = dataExport

        private val estimateCostHandler: Handler<EventEstimateCostResponse> =
            jsonHandler<EventEstimateCostResponse>(clientOptions.jsonMapper)

        override fun estimateCost(
            params: EventEstimateCostParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventEstimateCostResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "events", "estimate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { estimateCostHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val reportHandler: Handler<EventReportResponse> =
            jsonHandler<EventReportResponse>(clientOptions.jsonMapper)

        override fun report(
            params: EventReportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventReportResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "events")
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
