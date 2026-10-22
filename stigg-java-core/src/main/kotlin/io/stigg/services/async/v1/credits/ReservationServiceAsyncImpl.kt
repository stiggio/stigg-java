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
import io.stigg.models.v1.credits.reservations.ReservationReleaseParams
import io.stigg.models.v1.credits.reservations.ReservationReleaseResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ReservationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReservationServiceAsync {

    private val withRawResponse: ReservationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReservationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReservationServiceAsync =
        ReservationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun release(
        params: ReservationReleaseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReservationReleaseResponse> =
        // post /api/v1/credits/reservations/{reservationId}/release
        withRawResponse().release(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReservationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReservationServiceAsync.WithRawResponse =
            ReservationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val releaseHandler: Handler<ReservationReleaseResponse> =
            jsonHandler<ReservationReleaseResponse>(clientOptions.jsonMapper)

        override fun release(
            params: ReservationReleaseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReservationReleaseResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reservationId", params.reservationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "credits",
                        "reservations",
                        params._pathParam(0),
                        "release",
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
                            .use { releaseHandler.handle(it) }
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
