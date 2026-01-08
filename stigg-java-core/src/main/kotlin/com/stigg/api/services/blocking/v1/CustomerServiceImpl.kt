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
import com.stigg.api.models.v1.customers.CustomerArchiveParams
import com.stigg.api.models.v1.customers.CustomerCreateParams
import com.stigg.api.models.v1.customers.CustomerListPage
import com.stigg.api.models.v1.customers.CustomerListPageResponse
import com.stigg.api.models.v1.customers.CustomerListParams
import com.stigg.api.models.v1.customers.CustomerResponse
import com.stigg.api.models.v1.customers.CustomerRetrieveParams
import com.stigg.api.models.v1.customers.CustomerUnarchiveParams
import com.stigg.api.models.v1.customers.CustomerUpdateParams
import com.stigg.api.services.blocking.v1.customers.PaymentMethodService
import com.stigg.api.services.blocking.v1.customers.PaymentMethodServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CustomerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerService {

    private val withRawResponse: CustomerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val paymentMethod: PaymentMethodService by lazy {
        PaymentMethodServiceImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService =
        CustomerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun paymentMethod(): PaymentMethodService = paymentMethod

    override fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions,
    ): CustomerResponse =
        // post /api/v1/customers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions,
    ): CustomerResponse =
        // get /api/v1/customers/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions,
    ): CustomerResponse =
        // patch /api/v1/customers/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CustomerListPage =
        // get /api/v1/customers
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: CustomerArchiveParams,
        requestOptions: RequestOptions,
    ): CustomerResponse =
        // post /api/v1/customers/{id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun unarchive(
        params: CustomerUnarchiveParams,
        requestOptions: RequestOptions,
    ): CustomerResponse =
        // post /api/v1/customers/{id}/unarchive
        withRawResponse().unarchive(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val paymentMethod: PaymentMethodService.WithRawResponse by lazy {
            PaymentMethodServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerService.WithRawResponse =
            CustomerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun paymentMethod(): PaymentMethodService.WithRawResponse = paymentMethod

        private val createHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers")
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

        private val retrieveHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0))
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

        private val updateHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0))
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

        private val listHandler: Handler<CustomerListPageResponse> =
            jsonHandler<CustomerListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CustomerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers")
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
                        CustomerListPage.builder()
                            .service(CustomerServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: CustomerArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0), "archive")
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

        private val unarchiveHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun unarchive(
            params: CustomerUnarchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0), "unarchive")
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
