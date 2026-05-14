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
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyArchiveParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyCreateParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyListAssociatedEntitiesParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyListAssociatedEntitiesResponse
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyListPage
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyListPageResponse
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyListParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyResponse
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyUnarchiveParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Operations related to custom currencies */
class CustomCurrencyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomCurrencyService {

    private val withRawResponse: CustomCurrencyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomCurrencyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomCurrencyService =
        CustomCurrencyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CustomCurrencyCreateParams,
        requestOptions: RequestOptions,
    ): CustomCurrencyResponse =
        // post /api/v1/credits/custom-currencies
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: CustomCurrencyUpdateParams,
        requestOptions: RequestOptions,
    ): CustomCurrencyResponse =
        // patch /api/v1/credits/custom-currencies/{currencyId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CustomCurrencyListParams,
        requestOptions: RequestOptions,
    ): CustomCurrencyListPage =
        // get /api/v1/credits/custom-currencies
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: CustomCurrencyArchiveParams,
        requestOptions: RequestOptions,
    ): CustomCurrencyResponse =
        // post /api/v1/credits/custom-currencies/{currencyId}/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun listAssociatedEntities(
        params: CustomCurrencyListAssociatedEntitiesParams,
        requestOptions: RequestOptions,
    ): CustomCurrencyListAssociatedEntitiesResponse =
        // get /api/v1/credits/custom-currencies/{currencyId}/associated-entities
        withRawResponse().listAssociatedEntities(params, requestOptions).parse()

    override fun unarchive(
        params: CustomCurrencyUnarchiveParams,
        requestOptions: RequestOptions,
    ): CustomCurrencyResponse =
        // post /api/v1/credits/custom-currencies/{currencyId}/unarchive
        withRawResponse().unarchive(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomCurrencyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomCurrencyService.WithRawResponse =
            CustomCurrencyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CustomCurrencyResponse> =
            jsonHandler<CustomCurrencyResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CustomCurrencyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomCurrencyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "custom-currencies")
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

        private val updateHandler: Handler<CustomCurrencyResponse> =
            jsonHandler<CustomCurrencyResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CustomCurrencyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomCurrencyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("currencyId", params.currencyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "credits",
                        "custom-currencies",
                        params._pathParam(0),
                    )
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

        private val listHandler: Handler<CustomCurrencyListPageResponse> =
            jsonHandler<CustomCurrencyListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CustomCurrencyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomCurrencyListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "custom-currencies")
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
                        CustomCurrencyListPage.builder()
                            .service(CustomCurrencyServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<CustomCurrencyResponse> =
            jsonHandler<CustomCurrencyResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: CustomCurrencyArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomCurrencyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("currencyId", params.currencyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "credits",
                        "custom-currencies",
                        params._pathParam(0),
                        "archive",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listAssociatedEntitiesHandler:
            Handler<CustomCurrencyListAssociatedEntitiesResponse> =
            jsonHandler<CustomCurrencyListAssociatedEntitiesResponse>(clientOptions.jsonMapper)

        override fun listAssociatedEntities(
            params: CustomCurrencyListAssociatedEntitiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("currencyId", params.currencyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "credits",
                        "custom-currencies",
                        params._pathParam(0),
                        "associated-entities",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAssociatedEntitiesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unarchiveHandler: Handler<CustomCurrencyResponse> =
            jsonHandler<CustomCurrencyResponse>(clientOptions.jsonMapper)

        override fun unarchive(
            params: CustomCurrencyUnarchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomCurrencyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("currencyId", params.currencyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "credits",
                        "custom-currencies",
                        params._pathParam(0),
                        "unarchive",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unarchiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
