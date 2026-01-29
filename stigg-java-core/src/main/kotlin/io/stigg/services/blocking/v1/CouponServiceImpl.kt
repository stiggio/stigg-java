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
import io.stigg.models.v1.coupons.Coupon
import io.stigg.models.v1.coupons.CouponCreateParams
import io.stigg.models.v1.coupons.CouponListPage
import io.stigg.models.v1.coupons.CouponListPageResponse
import io.stigg.models.v1.coupons.CouponListParams
import io.stigg.models.v1.coupons.CouponRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CouponServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CouponService {

    private val withRawResponse: CouponService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CouponService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CouponService =
        CouponServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: CouponCreateParams, requestOptions: RequestOptions): Coupon =
        // post /api/v1/coupons
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: CouponRetrieveParams, requestOptions: RequestOptions): Coupon =
        // get /api/v1/coupons/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: CouponListParams, requestOptions: RequestOptions): CouponListPage =
        // get /api/v1/coupons
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CouponService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CouponService.WithRawResponse =
            CouponServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Coupon> = jsonHandler<Coupon>(clientOptions.jsonMapper)

        override fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Coupon> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "coupons")
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

        private val retrieveHandler: Handler<Coupon> = jsonHandler<Coupon>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CouponRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Coupon> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "coupons", params._pathParam(0))
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

        private val listHandler: Handler<CouponListPageResponse> =
            jsonHandler<CouponListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CouponListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "coupons")
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
                        CouponListPage.builder()
                            .service(CouponServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
