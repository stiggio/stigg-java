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
import io.stigg.models.v1.addons.Addon
import io.stigg.models.v1.addons.AddonArchiveParams
import io.stigg.models.v1.addons.AddonCreateDraftParams
import io.stigg.models.v1.addons.AddonCreateParams
import io.stigg.models.v1.addons.AddonListPage
import io.stigg.models.v1.addons.AddonListPageResponse
import io.stigg.models.v1.addons.AddonListParams
import io.stigg.models.v1.addons.AddonPublishParams
import io.stigg.models.v1.addons.AddonPublishResponse
import io.stigg.models.v1.addons.AddonRemoveDraftParams
import io.stigg.models.v1.addons.AddonRemoveDraftResponse
import io.stigg.models.v1.addons.AddonRetrieveParams
import io.stigg.models.v1.addons.AddonSetPricingParams
import io.stigg.models.v1.addons.AddonUpdateParams
import io.stigg.models.v1.addons.SetPackagePricingResponse
import io.stigg.services.blocking.v1.addons.EntitlementService
import io.stigg.services.blocking.v1.addons.EntitlementServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Operations related to addons */
class AddonServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AddonService {

    private val withRawResponse: AddonService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val entitlements: EntitlementService by lazy { EntitlementServiceImpl(clientOptions) }

    override fun withRawResponse(): AddonService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddonService =
        AddonServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun entitlements(): EntitlementService = entitlements

    override fun create(params: AddonCreateParams, requestOptions: RequestOptions): Addon =
        // post /api/v1/addons
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: AddonRetrieveParams, requestOptions: RequestOptions): Addon =
        // get /api/v1/addons/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AddonUpdateParams, requestOptions: RequestOptions): Addon =
        // patch /api/v1/addons/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: AddonListParams, requestOptions: RequestOptions): AddonListPage =
        // get /api/v1/addons
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: AddonArchiveParams, requestOptions: RequestOptions): Addon =
        // post /api/v1/addons/{id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun createDraft(
        params: AddonCreateDraftParams,
        requestOptions: RequestOptions,
    ): Addon =
        // post /api/v1/addons/{id}/draft
        withRawResponse().createDraft(params, requestOptions).parse()

    override fun publish(
        params: AddonPublishParams,
        requestOptions: RequestOptions,
    ): AddonPublishResponse =
        // post /api/v1/addons/{id}/publish
        withRawResponse().publish(params, requestOptions).parse()

    override fun removeDraft(
        params: AddonRemoveDraftParams,
        requestOptions: RequestOptions,
    ): AddonRemoveDraftResponse =
        // delete /api/v1/addons/{id}/draft
        withRawResponse().removeDraft(params, requestOptions).parse()

    override fun setPricing(
        params: AddonSetPricingParams,
        requestOptions: RequestOptions,
    ): SetPackagePricingResponse =
        // put /api/v1/addons/{id}/charges
        withRawResponse().setPricing(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AddonService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val entitlements: EntitlementService.WithRawResponse by lazy {
            EntitlementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AddonService.WithRawResponse =
            AddonServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun entitlements(): EntitlementService.WithRawResponse = entitlements

        private val createHandler: Handler<Addon> = jsonHandler<Addon>(clientOptions.jsonMapper)

        override fun create(
            params: AddonCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Addon> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons")
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

        private val retrieveHandler: Handler<Addon> = jsonHandler<Addon>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AddonRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Addon> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0))
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

        private val updateHandler: Handler<Addon> = jsonHandler<Addon>(clientOptions.jsonMapper)

        override fun update(
            params: AddonUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Addon> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0))
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

        private val listHandler: Handler<AddonListPageResponse> =
            jsonHandler<AddonListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AddonListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons")
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
                        AddonListPage.builder()
                            .service(AddonServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<Addon> = jsonHandler<Addon>(clientOptions.jsonMapper)

        override fun archive(
            params: AddonArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Addon> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0), "archive")
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

        private val createDraftHandler: Handler<Addon> =
            jsonHandler<Addon>(clientOptions.jsonMapper)

        override fun createDraft(
            params: AddonCreateDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Addon> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0), "draft")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val publishHandler: Handler<AddonPublishResponse> =
            jsonHandler<AddonPublishResponse>(clientOptions.jsonMapper)

        override fun publish(
            params: AddonPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonPublishResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0), "publish")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { publishHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val removeDraftHandler: Handler<AddonRemoveDraftResponse> =
            jsonHandler<AddonRemoveDraftResponse>(clientOptions.jsonMapper)

        override fun removeDraft(
            params: AddonRemoveDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonRemoveDraftResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0), "draft")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { removeDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setPricingHandler: Handler<SetPackagePricingResponse> =
            jsonHandler<SetPackagePricingResponse>(clientOptions.jsonMapper)

        override fun setPricing(
            params: AddonSetPricingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SetPackagePricingResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0), "charges")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setPricingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
