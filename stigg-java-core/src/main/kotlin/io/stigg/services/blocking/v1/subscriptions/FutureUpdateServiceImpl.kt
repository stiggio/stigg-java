// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.subscriptions

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
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelPendingPaymentParams
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelPendingPaymentResponse
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelScheduleParams
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelScheduleResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FutureUpdateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FutureUpdateService {

    private val withRawResponse: FutureUpdateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FutureUpdateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FutureUpdateService =
        FutureUpdateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cancelPendingPayment(
        params: FutureUpdateCancelPendingPaymentParams,
        requestOptions: RequestOptions,
    ): FutureUpdateCancelPendingPaymentResponse =
        // delete /api/v1/subscriptions/{id}/future-update/pending-payment
        withRawResponse().cancelPendingPayment(params, requestOptions).parse()

    override fun cancelSchedule(
        params: FutureUpdateCancelScheduleParams,
        requestOptions: RequestOptions,
    ): FutureUpdateCancelScheduleResponse =
        // delete /api/v1/subscriptions/{id}/future-update/schedule
        withRawResponse().cancelSchedule(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FutureUpdateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FutureUpdateService.WithRawResponse =
            FutureUpdateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val cancelPendingPaymentHandler: Handler<FutureUpdateCancelPendingPaymentResponse> =
            jsonHandler<FutureUpdateCancelPendingPaymentResponse>(clientOptions.jsonMapper)

        override fun cancelPendingPayment(
            params: FutureUpdateCancelPendingPaymentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FutureUpdateCancelPendingPaymentResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "subscriptions",
                        params._pathParam(0),
                        "future-update",
                        "pending-payment",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelPendingPaymentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelScheduleHandler: Handler<FutureUpdateCancelScheduleResponse> =
            jsonHandler<FutureUpdateCancelScheduleResponse>(clientOptions.jsonMapper)

        override fun cancelSchedule(
            params: FutureUpdateCancelScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FutureUpdateCancelScheduleResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "subscriptions",
                        params._pathParam(0),
                        "future-update",
                        "schedule",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelScheduleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
