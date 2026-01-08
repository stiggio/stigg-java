// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.checkRequired
import com.stigg.api.core.handlers.errorBodyHandler
import com.stigg.api.core.handlers.errorHandler
import com.stigg.api.core.handlers.jsonHandler
import com.stigg.api.core.http.HttpMethod
import com.stigg.api.core.http.HttpRequest
import com.stigg.api.core.http.HttpResponse
import com.stigg.api.core.http.HttpResponse.Handler
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.core.http.json
import com.stigg.api.core.http.parseable
import com.stigg.api.core.prepare
import com.stigg.api.models.v1.subscriptions.SubscriptionCreateParams
import com.stigg.api.models.v1.subscriptions.SubscriptionCreateResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionDelegateParams
import com.stigg.api.models.v1.subscriptions.SubscriptionDelegateResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionListParams
import com.stigg.api.models.v1.subscriptions.SubscriptionListResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionMigrateParams
import com.stigg.api.models.v1.subscriptions.SubscriptionMigrateResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionPreviewParams
import com.stigg.api.models.v1.subscriptions.SubscriptionPreviewResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionRetrieveParams
import com.stigg.api.models.v1.subscriptions.SubscriptionRetrieveResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionTransferParams
import com.stigg.api.models.v1.subscriptions.SubscriptionTransferResponse
import com.stigg.api.services.blocking.v1.subscriptions.FutureUpdateService
import com.stigg.api.services.blocking.v1.subscriptions.FutureUpdateServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubscriptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionService {

    private val withRawResponse: SubscriptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val futureUpdate: FutureUpdateService by lazy { FutureUpdateServiceImpl(clientOptions) }

    override fun withRawResponse(): SubscriptionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionService =
        SubscriptionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun futureUpdate(): FutureUpdateService = futureUpdate

    override fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions,
    ): SubscriptionCreateResponse =
        // post /api/v1/subscriptions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): SubscriptionRetrieveResponse =
        // get /api/v1/subscriptions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions,
    ): SubscriptionListResponse =
        // get /api/v1/subscriptions
        withRawResponse().list(params, requestOptions).parse()

    override fun delegate(
        params: SubscriptionDelegateParams,
        requestOptions: RequestOptions,
    ): SubscriptionDelegateResponse =
        // post /api/v1/subscriptions/{id}/delegate
        withRawResponse().delegate(params, requestOptions).parse()

    override fun migrate(
        params: SubscriptionMigrateParams,
        requestOptions: RequestOptions,
    ): SubscriptionMigrateResponse =
        // post /api/v1/subscriptions/{id}/migrate
        withRawResponse().migrate(params, requestOptions).parse()

    override fun preview(
        params: SubscriptionPreviewParams,
        requestOptions: RequestOptions,
    ): SubscriptionPreviewResponse =
        // post /api/v1/subscriptions/preview
        withRawResponse().preview(params, requestOptions).parse()

    override fun transfer(
        params: SubscriptionTransferParams,
        requestOptions: RequestOptions,
    ): SubscriptionTransferResponse =
        // post /api/v1/subscriptions/{id}/transfer
        withRawResponse().transfer(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val futureUpdate: FutureUpdateService.WithRawResponse by lazy {
            FutureUpdateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionService.WithRawResponse =
            SubscriptionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun futureUpdate(): FutureUpdateService.WithRawResponse = futureUpdate

        private val createHandler: Handler<SubscriptionCreateResponse> =
            jsonHandler<SubscriptionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions")
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

        private val retrieveHandler: Handler<SubscriptionRetrieveResponse> =
            jsonHandler<SubscriptionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", params._pathParam(0))
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

        private val listHandler: Handler<SubscriptionListResponse> =
            jsonHandler<SubscriptionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions")
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

        private val delegateHandler: Handler<SubscriptionDelegateResponse> =
            jsonHandler<SubscriptionDelegateResponse>(clientOptions.jsonMapper)

        override fun delegate(
            params: SubscriptionDelegateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionDelegateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", params._pathParam(0), "delegate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { delegateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val migrateHandler: Handler<SubscriptionMigrateResponse> =
            jsonHandler<SubscriptionMigrateResponse>(clientOptions.jsonMapper)

        override fun migrate(
            params: SubscriptionMigrateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionMigrateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", params._pathParam(0), "migrate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { migrateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val previewHandler: Handler<SubscriptionPreviewResponse> =
            jsonHandler<SubscriptionPreviewResponse>(clientOptions.jsonMapper)

        override fun preview(
            params: SubscriptionPreviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionPreviewResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", "preview")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { previewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val transferHandler: Handler<SubscriptionTransferResponse> =
            jsonHandler<SubscriptionTransferResponse>(clientOptions.jsonMapper)

        override fun transfer(
            params: SubscriptionTransferParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionTransferResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", params._pathParam(0), "transfer")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { transferHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
