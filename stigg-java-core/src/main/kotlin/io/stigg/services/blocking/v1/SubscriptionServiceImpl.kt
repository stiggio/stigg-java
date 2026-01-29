// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

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
import io.stigg.models.v1.subscriptions.Subscription
import io.stigg.models.v1.subscriptions.SubscriptionCancelParams
import io.stigg.models.v1.subscriptions.SubscriptionDelegateParams
import io.stigg.models.v1.subscriptions.SubscriptionImportParams
import io.stigg.models.v1.subscriptions.SubscriptionImportResponse
import io.stigg.models.v1.subscriptions.SubscriptionListPage
import io.stigg.models.v1.subscriptions.SubscriptionListPageResponse
import io.stigg.models.v1.subscriptions.SubscriptionListParams
import io.stigg.models.v1.subscriptions.SubscriptionMigrateParams
import io.stigg.models.v1.subscriptions.SubscriptionPreviewParams
import io.stigg.models.v1.subscriptions.SubscriptionPreviewResponse
import io.stigg.models.v1.subscriptions.SubscriptionProvisionParams
import io.stigg.models.v1.subscriptions.SubscriptionProvisionResponse
import io.stigg.models.v1.subscriptions.SubscriptionRetrieveParams
import io.stigg.models.v1.subscriptions.SubscriptionTransferParams
import io.stigg.models.v1.subscriptions.SubscriptionUpdateParams
import io.stigg.services.blocking.v1.subscriptions.FutureUpdateService
import io.stigg.services.blocking.v1.subscriptions.FutureUpdateServiceImpl
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

    override fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): Subscription =
        // get /api/v1/subscriptions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions,
    ): Subscription =
        // patch /api/v1/subscriptions/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions,
    ): SubscriptionListPage =
        // get /api/v1/subscriptions
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(
        params: SubscriptionCancelParams,
        requestOptions: RequestOptions,
    ): Subscription =
        // post /api/v1/subscriptions/{id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun delegate(
        params: SubscriptionDelegateParams,
        requestOptions: RequestOptions,
    ): Subscription =
        // post /api/v1/subscriptions/{id}/delegate
        withRawResponse().delegate(params, requestOptions).parse()

    override fun import_(
        params: SubscriptionImportParams,
        requestOptions: RequestOptions,
    ): SubscriptionImportResponse =
        // post /api/v1/subscriptions/import
        withRawResponse().import_(params, requestOptions).parse()

    override fun migrate(
        params: SubscriptionMigrateParams,
        requestOptions: RequestOptions,
    ): Subscription =
        // post /api/v1/subscriptions/{id}/migrate
        withRawResponse().migrate(params, requestOptions).parse()

    override fun preview(
        params: SubscriptionPreviewParams,
        requestOptions: RequestOptions,
    ): SubscriptionPreviewResponse =
        // post /api/v1/subscriptions/preview
        withRawResponse().preview(params, requestOptions).parse()

    override fun provision(
        params: SubscriptionProvisionParams,
        requestOptions: RequestOptions,
    ): SubscriptionProvisionResponse =
        // post /api/v1/subscriptions
        withRawResponse().provision(params, requestOptions).parse()

    override fun transfer(
        params: SubscriptionTransferParams,
        requestOptions: RequestOptions,
    ): Subscription =
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

        private val retrieveHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Subscription> {
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

        private val updateHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Subscription> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", params._pathParam(0))
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

        private val listHandler: Handler<SubscriptionListPageResponse> =
            jsonHandler<SubscriptionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListPage> {
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
                    .let {
                        SubscriptionListPage.builder()
                            .service(SubscriptionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override fun cancel(
            params: SubscriptionCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Subscription> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", params._pathParam(0), "cancel")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val delegateHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override fun delegate(
            params: SubscriptionDelegateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Subscription> {
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

        private val importHandler: Handler<SubscriptionImportResponse> =
            jsonHandler<SubscriptionImportResponse>(clientOptions.jsonMapper)

        override fun import_(
            params: SubscriptionImportParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionImportResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", "import")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { importHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val migrateHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override fun migrate(
            params: SubscriptionMigrateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Subscription> {
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

        private val provisionHandler: Handler<SubscriptionProvisionResponse> =
            jsonHandler<SubscriptionProvisionResponse>(clientOptions.jsonMapper)

        override fun provision(
            params: SubscriptionProvisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionProvisionResponse> {
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
                    .use { provisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val transferHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override fun transfer(
            params: SubscriptionTransferParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Subscription> {
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
