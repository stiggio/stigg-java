// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.credits

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
import io.stigg.models.v1.credits.reservations.ReservationReleaseParams
import io.stigg.models.v1.credits.reservations.ReservationReleaseResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ReservationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReservationService {

    private val withRawResponse: ReservationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReservationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReservationService =
        ReservationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun release(
        params: ReservationReleaseParams,
        requestOptions: RequestOptions,
    ): ReservationReleaseResponse =
        // post /api/v1/credits/reservations/{reservationId}/release
        withRawResponse().release(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReservationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReservationService.WithRawResponse =
            ReservationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val releaseHandler: Handler<ReservationReleaseResponse> =
            jsonHandler<ReservationReleaseResponse>(clientOptions.jsonMapper)

        override fun release(
            params: ReservationReleaseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReservationReleaseResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
