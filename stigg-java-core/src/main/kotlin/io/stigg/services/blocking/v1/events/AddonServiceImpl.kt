// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

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
import io.stigg.models.v1.events.addons.Addon
import io.stigg.models.v1.events.addons.AddonArchiveAddonParams
import io.stigg.models.v1.events.addons.AddonCreateAddonParams
import io.stigg.models.v1.events.addons.AddonListAddonsPage
import io.stigg.models.v1.events.addons.AddonListAddonsPageResponse
import io.stigg.models.v1.events.addons.AddonListAddonsParams
import io.stigg.models.v1.events.addons.AddonPublishAddonParams
import io.stigg.models.v1.events.addons.AddonPublishAddonResponse
import io.stigg.models.v1.events.addons.AddonRetrieveAddonParams
import io.stigg.models.v1.events.addons.AddonSetPricingParams
import io.stigg.models.v1.events.addons.AddonUpdateAddonParams
import io.stigg.models.v1.events.addons.SetPackagePricingResponse
import io.stigg.services.blocking.v1.events.addons.DraftService
import io.stigg.services.blocking.v1.events.addons.DraftServiceImpl
import io.stigg.services.blocking.v1.events.addons.EntitlementService
import io.stigg.services.blocking.v1.events.addons.EntitlementServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AddonServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AddonService {

    private val withRawResponse: AddonService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val draft: DraftService by lazy { DraftServiceImpl(clientOptions) }

    private val entitlements: EntitlementService by lazy { EntitlementServiceImpl(clientOptions) }

    override fun withRawResponse(): AddonService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddonService =
        AddonServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun draft(): DraftService = draft

    override fun entitlements(): EntitlementService = entitlements

    override fun archiveAddon(
        params: AddonArchiveAddonParams,
        requestOptions: RequestOptions,
    ): Addon =
        // post /api/v1/addons/{id}/archive
        withRawResponse().archiveAddon(params, requestOptions).parse()

    override fun createAddon(
        params: AddonCreateAddonParams,
        requestOptions: RequestOptions,
    ): Addon =
        // post /api/v1/addons
        withRawResponse().createAddon(params, requestOptions).parse()

    override fun listAddons(
        params: AddonListAddonsParams,
        requestOptions: RequestOptions,
    ): AddonListAddonsPage =
        // get /api/v1/addons
        withRawResponse().listAddons(params, requestOptions).parse()

    override fun publishAddon(
        params: AddonPublishAddonParams,
        requestOptions: RequestOptions,
    ): AddonPublishAddonResponse =
        // post /api/v1/addons/{id}/publish
        withRawResponse().publishAddon(params, requestOptions).parse()

    override fun retrieveAddon(
        params: AddonRetrieveAddonParams,
        requestOptions: RequestOptions,
    ): Addon =
        // get /api/v1/addons/{id}
        withRawResponse().retrieveAddon(params, requestOptions).parse()

    override fun setPricing(
        params: AddonSetPricingParams,
        requestOptions: RequestOptions,
    ): SetPackagePricingResponse =
        // put /api/v1/addons/{id}/charges
        withRawResponse().setPricing(params, requestOptions).parse()

    override fun updateAddon(
        params: AddonUpdateAddonParams,
        requestOptions: RequestOptions,
    ): Addon =
        // patch /api/v1/addons/{id}
        withRawResponse().updateAddon(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AddonService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val draft: DraftService.WithRawResponse by lazy {
            DraftServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val entitlements: EntitlementService.WithRawResponse by lazy {
            EntitlementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AddonService.WithRawResponse =
            AddonServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun draft(): DraftService.WithRawResponse = draft

        override fun entitlements(): EntitlementService.WithRawResponse = entitlements

        private val archiveAddonHandler: Handler<Addon> =
            jsonHandler<Addon>(clientOptions.jsonMapper)

        override fun archiveAddon(
            params: AddonArchiveAddonParams,
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
                    .use { archiveAddonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createAddonHandler: Handler<Addon> =
            jsonHandler<Addon>(clientOptions.jsonMapper)

        override fun createAddon(
            params: AddonCreateAddonParams,
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
                    .use { createAddonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listAddonsHandler: Handler<AddonListAddonsPageResponse> =
            jsonHandler<AddonListAddonsPageResponse>(clientOptions.jsonMapper)

        override fun listAddons(
            params: AddonListAddonsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonListAddonsPage> {
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
                    .use { listAddonsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AddonListAddonsPage.builder()
                            .service(AddonServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val publishAddonHandler: Handler<AddonPublishAddonResponse> =
            jsonHandler<AddonPublishAddonResponse>(clientOptions.jsonMapper)

        override fun publishAddon(
            params: AddonPublishAddonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonPublishAddonResponse> {
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
                    .use { publishAddonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveAddonHandler: Handler<Addon> =
            jsonHandler<Addon>(clientOptions.jsonMapper)

        override fun retrieveAddon(
            params: AddonRetrieveAddonParams,
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
                    .use { retrieveAddonHandler.handle(it) }
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

        private val updateAddonHandler: Handler<Addon> =
            jsonHandler<Addon>(clientOptions.jsonMapper)

        override fun updateAddon(
            params: AddonUpdateAddonParams,
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
                    .use { updateAddonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
