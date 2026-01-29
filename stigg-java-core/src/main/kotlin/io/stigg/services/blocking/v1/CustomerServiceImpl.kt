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
import io.stigg.models.v1.customers.CustomerArchiveParams
import io.stigg.models.v1.customers.CustomerImportParams
import io.stigg.models.v1.customers.CustomerImportResponse
import io.stigg.models.v1.customers.CustomerListPage
import io.stigg.models.v1.customers.CustomerListPageResponse
import io.stigg.models.v1.customers.CustomerListParams
import io.stigg.models.v1.customers.CustomerProvisionParams
import io.stigg.models.v1.customers.CustomerResponse
import io.stigg.models.v1.customers.CustomerRetrieveParams
import io.stigg.models.v1.customers.CustomerUnarchiveParams
import io.stigg.models.v1.customers.CustomerUpdateParams
import io.stigg.services.blocking.v1.customers.PaymentMethodService
import io.stigg.services.blocking.v1.customers.PaymentMethodServiceImpl
import io.stigg.services.blocking.v1.customers.PromotionalEntitlementService
import io.stigg.services.blocking.v1.customers.PromotionalEntitlementServiceImpl
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

    private val promotionalEntitlements: PromotionalEntitlementService by lazy {
        PromotionalEntitlementServiceImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService =
        CustomerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun paymentMethod(): PaymentMethodService = paymentMethod

    override fun promotionalEntitlements(): PromotionalEntitlementService = promotionalEntitlements

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

    override fun import_(
        params: CustomerImportParams,
        requestOptions: RequestOptions,
    ): CustomerImportResponse =
        // post /api/v1/customers/import
        withRawResponse().import_(params, requestOptions).parse()

    override fun provision(
        params: CustomerProvisionParams,
        requestOptions: RequestOptions,
    ): CustomerResponse =
        // post /api/v1/customers
        withRawResponse().provision(params, requestOptions).parse()

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

        private val promotionalEntitlements: PromotionalEntitlementService.WithRawResponse by lazy {
            PromotionalEntitlementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerService.WithRawResponse =
            CustomerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun paymentMethod(): PaymentMethodService.WithRawResponse = paymentMethod

        override fun promotionalEntitlements(): PromotionalEntitlementService.WithRawResponse =
            promotionalEntitlements

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

        private val importHandler: Handler<CustomerImportResponse> =
            jsonHandler<CustomerImportResponse>(clientOptions.jsonMapper)

        override fun import_(
            params: CustomerImportParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerImportResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", "import")
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

        private val provisionHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun provision(
            params: CustomerProvisionParams,
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
                    .use { provisionHandler.handle(it) }
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
