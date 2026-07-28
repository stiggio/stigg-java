// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

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
import io.stigg.core.prepareAsync
import io.stigg.models.v1.customers.CustomerArchiveParams
import io.stigg.models.v1.customers.CustomerCheckEntitlementParams
import io.stigg.models.v1.customers.CustomerCheckEntitlementResponse
import io.stigg.models.v1.customers.CustomerImportParams
import io.stigg.models.v1.customers.CustomerImportResponse
import io.stigg.models.v1.customers.CustomerListContractsParams
import io.stigg.models.v1.customers.CustomerListContractsResponse
import io.stigg.models.v1.customers.CustomerListInvoicesPageAsync
import io.stigg.models.v1.customers.CustomerListInvoicesPageResponse
import io.stigg.models.v1.customers.CustomerListInvoicesParams
import io.stigg.models.v1.customers.CustomerListPageAsync
import io.stigg.models.v1.customers.CustomerListPageResponse
import io.stigg.models.v1.customers.CustomerListParams
import io.stigg.models.v1.customers.CustomerListResourcesPageAsync
import io.stigg.models.v1.customers.CustomerListResourcesPageResponse
import io.stigg.models.v1.customers.CustomerListResourcesParams
import io.stigg.models.v1.customers.CustomerProvisionParams
import io.stigg.models.v1.customers.CustomerResponse
import io.stigg.models.v1.customers.CustomerRetrieveEntitlementsParams
import io.stigg.models.v1.customers.CustomerRetrieveEntitlementsResponse
import io.stigg.models.v1.customers.CustomerRetrieveParams
import io.stigg.models.v1.customers.CustomerUnarchiveParams
import io.stigg.models.v1.customers.CustomerUpdateParams
import io.stigg.services.async.v1.customers.IntegrationServiceAsync
import io.stigg.services.async.v1.customers.IntegrationServiceAsyncImpl
import io.stigg.services.async.v1.customers.PaymentMethodServiceAsync
import io.stigg.services.async.v1.customers.PaymentMethodServiceAsyncImpl
import io.stigg.services.async.v1.customers.PromotionalEntitlementServiceAsync
import io.stigg.services.async.v1.customers.PromotionalEntitlementServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val withRawResponse: CustomerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val paymentMethod: PaymentMethodServiceAsync by lazy {
        PaymentMethodServiceAsyncImpl(clientOptions)
    }

    private val promotionalEntitlements: PromotionalEntitlementServiceAsync by lazy {
        PromotionalEntitlementServiceAsyncImpl(clientOptions)
    }

    private val integrations: IntegrationServiceAsync by lazy {
        IntegrationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerServiceAsync =
        CustomerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Operations related to customers */
    override fun paymentMethod(): PaymentMethodServiceAsync = paymentMethod

    /** Operations related to promotional entitlements */
    override fun promotionalEntitlements(): PromotionalEntitlementServiceAsync =
        promotionalEntitlements

    override fun integrations(): IntegrationServiceAsync = integrations

    override fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerResponse> =
        // get /api/v1/customers/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerResponse> =
        // patch /api/v1/customers/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListPageAsync> =
        // get /api/v1/customers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: CustomerArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerResponse> =
        // post /api/v1/customers/{id}/archive
        withRawResponse().archive(params, requestOptions).thenApply { it.parse() }

    override fun checkEntitlement(
        params: CustomerCheckEntitlementParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCheckEntitlementResponse> =
        // get /api/v1/customers/{id}/entitlements/check
        withRawResponse().checkEntitlement(params, requestOptions).thenApply { it.parse() }

    override fun import_(
        params: CustomerImportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerImportResponse> =
        // post /api/v1/customers/import
        withRawResponse().import_(params, requestOptions).thenApply { it.parse() }

    override fun listContracts(
        params: CustomerListContractsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListContractsResponse> =
        // get /api/v1/customers/{id}/contracts
        withRawResponse().listContracts(params, requestOptions).thenApply { it.parse() }

    override fun listInvoices(
        params: CustomerListInvoicesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListInvoicesPageAsync> =
        // get /api/v1/customers/{id}/invoices
        withRawResponse().listInvoices(params, requestOptions).thenApply { it.parse() }

    override fun listResources(
        params: CustomerListResourcesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListResourcesPageAsync> =
        // get /api/v1/customers/{id}/resources
        withRawResponse().listResources(params, requestOptions).thenApply { it.parse() }

    override fun provision(
        params: CustomerProvisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerResponse> =
        // post /api/v1/customers
        withRawResponse().provision(params, requestOptions).thenApply { it.parse() }

    override fun retrieveEntitlements(
        params: CustomerRetrieveEntitlementsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerRetrieveEntitlementsResponse> =
        // get /api/v1/customers/{id}/entitlements
        withRawResponse().retrieveEntitlements(params, requestOptions).thenApply { it.parse() }

    override fun unarchive(
        params: CustomerUnarchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerResponse> =
        // post /api/v1/customers/{id}/unarchive
        withRawResponse().unarchive(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val paymentMethod: PaymentMethodServiceAsync.WithRawResponse by lazy {
            PaymentMethodServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val promotionalEntitlements:
            PromotionalEntitlementServiceAsync.WithRawResponse by lazy {
            PromotionalEntitlementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val integrations: IntegrationServiceAsync.WithRawResponse by lazy {
            IntegrationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceAsync.WithRawResponse =
            CustomerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Operations related to customers */
        override fun paymentMethod(): PaymentMethodServiceAsync.WithRawResponse = paymentMethod

        /** Operations related to promotional entitlements */
        override fun promotionalEntitlements(): PromotionalEntitlementServiceAsync.WithRawResponse =
            promotionalEntitlements

        override fun integrations(): IntegrationServiceAsync.WithRawResponse = integrations

        private val retrieveHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CustomerListPageResponse> =
            jsonHandler<CustomerListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CustomerListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CustomerListPageAsync.builder()
                                    .service(CustomerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val archiveHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: CustomerArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { archiveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val checkEntitlementHandler: Handler<CustomerCheckEntitlementResponse> =
            jsonHandler<CustomerCheckEntitlementResponse>(clientOptions.jsonMapper)

        override fun checkEntitlement(
            params: CustomerCheckEntitlementParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCheckEntitlementResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "entitlements",
                        "check",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { checkEntitlementHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val importHandler: Handler<CustomerImportResponse> =
            jsonHandler<CustomerImportResponse>(clientOptions.jsonMapper)

        override fun import_(
            params: CustomerImportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerImportResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", "import")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { importHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listContractsHandler: Handler<CustomerListContractsResponse> =
            jsonHandler<CustomerListContractsResponse>(clientOptions.jsonMapper)

        override fun listContracts(
            params: CustomerListContractsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListContractsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0), "contracts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listContractsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listInvoicesHandler: Handler<CustomerListInvoicesPageResponse> =
            jsonHandler<CustomerListInvoicesPageResponse>(clientOptions.jsonMapper)

        override fun listInvoices(
            params: CustomerListInvoicesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListInvoicesPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0), "invoices")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listInvoicesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CustomerListInvoicesPageAsync.builder()
                                    .service(CustomerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listResourcesHandler: Handler<CustomerListResourcesPageResponse> =
            jsonHandler<CustomerListResourcesPageResponse>(clientOptions.jsonMapper)

        override fun listResources(
            params: CustomerListResourcesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListResourcesPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0), "resources")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listResourcesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CustomerListResourcesPageAsync.builder()
                                    .service(CustomerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val provisionHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun provision(
            params: CustomerProvisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { provisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveEntitlementsHandler: Handler<CustomerRetrieveEntitlementsResponse> =
            jsonHandler<CustomerRetrieveEntitlementsResponse>(clientOptions.jsonMapper)

        override fun retrieveEntitlements(
            params: CustomerRetrieveEntitlementsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveEntitlementsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0), "entitlements")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveEntitlementsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unarchiveHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun unarchive(
            params: CustomerUnarchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
