// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.CustomerArchiveParams
import io.stigg.models.v1.customers.CustomerCheckEntitlementParams
import io.stigg.models.v1.customers.CustomerCheckEntitlementResponse
import io.stigg.models.v1.customers.CustomerImportParams
import io.stigg.models.v1.customers.CustomerImportResponse
import io.stigg.models.v1.customers.CustomerListContractsParams
import io.stigg.models.v1.customers.CustomerListContractsResponse
import io.stigg.models.v1.customers.CustomerListInvoicesPageAsync
import io.stigg.models.v1.customers.CustomerListInvoicesParams
import io.stigg.models.v1.customers.CustomerListPageAsync
import io.stigg.models.v1.customers.CustomerListParams
import io.stigg.models.v1.customers.CustomerListResourcesPageAsync
import io.stigg.models.v1.customers.CustomerListResourcesParams
import io.stigg.models.v1.customers.CustomerProvisionParams
import io.stigg.models.v1.customers.CustomerResponse
import io.stigg.models.v1.customers.CustomerRetrieveEntitlementsParams
import io.stigg.models.v1.customers.CustomerRetrieveEntitlementsResponse
import io.stigg.models.v1.customers.CustomerRetrieveParams
import io.stigg.models.v1.customers.CustomerUnarchiveParams
import io.stigg.models.v1.customers.CustomerUpdateParams
import io.stigg.services.async.v1.customers.IntegrationServiceAsync
import io.stigg.services.async.v1.customers.PaymentMethodServiceAsync
import io.stigg.services.async.v1.customers.PromotionalEntitlementServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CustomerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerServiceAsync

    /** Operations related to customers */
    fun paymentMethod(): PaymentMethodServiceAsync

    /** Operations related to promotional entitlements */
    fun promotionalEntitlements(): PromotionalEntitlementServiceAsync

    fun integrations(): IntegrationServiceAsync

    /**
     * Retrieves a customer by their unique identifier, including billing information and
     * subscription status.
     */
    fun retrieve(id: String): CompletableFuture<CustomerResponse> =
        retrieve(id, CustomerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
    ): CompletableFuture<CustomerResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse>

    /** @see retrieve */
    fun retrieve(params: CustomerRetrieveParams): CompletableFuture<CustomerResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<CustomerResponse> =
        retrieve(id, CustomerRetrieveParams.none(), requestOptions)

    /** Updates an existing customer's properties such as name, email, and billing information. */
    fun update(id: String): CompletableFuture<CustomerResponse> =
        update(id, CustomerUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: CustomerUpdateParams = CustomerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: CustomerUpdateParams = CustomerUpdateParams.none(),
    ): CompletableFuture<CustomerResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse>

    /** @see update */
    fun update(params: CustomerUpdateParams): CompletableFuture<CustomerResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<CustomerResponse> =
        update(id, CustomerUpdateParams.none(), requestOptions)

    /** Retrieves a paginated list of customers in the environment. */
    fun list(): CompletableFuture<CustomerListPageAsync> = list(CustomerListParams.none())

    /** @see list */
    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListPageAsync>

    /** @see list */
    fun list(
        params: CustomerListParams = CustomerListParams.none()
    ): CompletableFuture<CustomerListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CustomerListPageAsync> =
        list(CustomerListParams.none(), requestOptions)

    /**
     * Archives a customer, preventing new subscriptions. Optionally cancels existing subscriptions.
     */
    fun archive(id: String): CompletableFuture<CustomerResponse> =
        archive(id, CustomerArchiveParams.none())

    /** @see archive */
    fun archive(
        id: String,
        params: CustomerArchiveParams = CustomerArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse> =
        archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(
        id: String,
        params: CustomerArchiveParams = CustomerArchiveParams.none(),
    ): CompletableFuture<CustomerResponse> = archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: CustomerArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse>

    /** @see archive */
    fun archive(params: CustomerArchiveParams): CompletableFuture<CustomerResponse> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions): CompletableFuture<CustomerResponse> =
        archive(id, CustomerArchiveParams.none(), requestOptions)

    /**
     * Checks a single entitlement (feature or credit) for a customer or resource. Supports
     * `requestedUsage` and `requestedValues` to evaluate against limits or enum values.
     *
     * **Warning:** This REST API endpoint lacks built-in client-side caching, fallback mechanisms,
     * and low-latency guarantees. It is not recommended for hot-path entitlement checks. For
     * production use, consider using the Stigg Node Server SDK with caching or the Sidecar for
     * low-latency cached responses.
     */
    fun checkEntitlement(id: String): CompletableFuture<CustomerCheckEntitlementResponse> =
        checkEntitlement(id, CustomerCheckEntitlementParams.none())

    /** @see checkEntitlement */
    fun checkEntitlement(
        id: String,
        params: CustomerCheckEntitlementParams = CustomerCheckEntitlementParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCheckEntitlementResponse> =
        checkEntitlement(params.toBuilder().id(id).build(), requestOptions)

    /** @see checkEntitlement */
    fun checkEntitlement(
        id: String,
        params: CustomerCheckEntitlementParams = CustomerCheckEntitlementParams.none(),
    ): CompletableFuture<CustomerCheckEntitlementResponse> =
        checkEntitlement(id, params, RequestOptions.none())

    /** @see checkEntitlement */
    fun checkEntitlement(
        params: CustomerCheckEntitlementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCheckEntitlementResponse>

    /** @see checkEntitlement */
    fun checkEntitlement(
        params: CustomerCheckEntitlementParams
    ): CompletableFuture<CustomerCheckEntitlementResponse> =
        checkEntitlement(params, RequestOptions.none())

    /** @see checkEntitlement */
    fun checkEntitlement(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCheckEntitlementResponse> =
        checkEntitlement(id, CustomerCheckEntitlementParams.none(), requestOptions)

    /**
     * Imports multiple customers in bulk. Used for migrating customer data from external systems.
     */
    fun import_(params: CustomerImportParams): CompletableFuture<CustomerImportResponse> =
        import_(params, RequestOptions.none())

    /** @see import_ */
    fun import_(
        params: CustomerImportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerImportResponse>

    /**
     * Retrieves a customer's contracts, fetched live from the connected billing provider, each
     * enriched with a preview of its upcoming (next) invoice when available. Returns an empty list
     * when no billing provider is connected or the customer is not synced.
     */
    fun listContracts(id: String): CompletableFuture<CustomerListContractsResponse> =
        listContracts(id, CustomerListContractsParams.none())

    /** @see listContracts */
    fun listContracts(
        id: String,
        params: CustomerListContractsParams = CustomerListContractsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListContractsResponse> =
        listContracts(params.toBuilder().id(id).build(), requestOptions)

    /** @see listContracts */
    fun listContracts(
        id: String,
        params: CustomerListContractsParams = CustomerListContractsParams.none(),
    ): CompletableFuture<CustomerListContractsResponse> =
        listContracts(id, params, RequestOptions.none())

    /** @see listContracts */
    fun listContracts(
        params: CustomerListContractsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListContractsResponse>

    /** @see listContracts */
    fun listContracts(
        params: CustomerListContractsParams
    ): CompletableFuture<CustomerListContractsResponse> =
        listContracts(params, RequestOptions.none())

    /** @see listContracts */
    fun listContracts(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListContractsResponse> =
        listContracts(id, CustomerListContractsParams.none(), requestOptions)

    /**
     * Retrieves a cursor-paginated list of a customer's invoices, fetched live from the connected
     * billing provider. Ordered by issue date ascending by default; override with orderBy
     * (issueDate | dueDate | total) and orderDir (ASC | DESC). Optionally narrowed to one contract,
     * an issue-date range, and/or a set of invoice states. Returns an empty list when no billing
     * provider is connected or the customer is not synced.
     */
    fun listInvoices(id: String): CompletableFuture<CustomerListInvoicesPageAsync> =
        listInvoices(id, CustomerListInvoicesParams.none())

    /** @see listInvoices */
    fun listInvoices(
        id: String,
        params: CustomerListInvoicesParams = CustomerListInvoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListInvoicesPageAsync> =
        listInvoices(params.toBuilder().id(id).build(), requestOptions)

    /** @see listInvoices */
    fun listInvoices(
        id: String,
        params: CustomerListInvoicesParams = CustomerListInvoicesParams.none(),
    ): CompletableFuture<CustomerListInvoicesPageAsync> =
        listInvoices(id, params, RequestOptions.none())

    /** @see listInvoices */
    fun listInvoices(
        params: CustomerListInvoicesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListInvoicesPageAsync>

    /** @see listInvoices */
    fun listInvoices(
        params: CustomerListInvoicesParams
    ): CompletableFuture<CustomerListInvoicesPageAsync> =
        listInvoices(params, RequestOptions.none())

    /** @see listInvoices */
    fun listInvoices(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListInvoicesPageAsync> =
        listInvoices(id, CustomerListInvoicesParams.none(), requestOptions)

    /** Retrieves a paginated list of resources within the same customer. */
    fun listResources(id: String): CompletableFuture<CustomerListResourcesPageAsync> =
        listResources(id, CustomerListResourcesParams.none())

    /** @see listResources */
    fun listResources(
        id: String,
        params: CustomerListResourcesParams = CustomerListResourcesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListResourcesPageAsync> =
        listResources(params.toBuilder().id(id).build(), requestOptions)

    /** @see listResources */
    fun listResources(
        id: String,
        params: CustomerListResourcesParams = CustomerListResourcesParams.none(),
    ): CompletableFuture<CustomerListResourcesPageAsync> =
        listResources(id, params, RequestOptions.none())

    /** @see listResources */
    fun listResources(
        params: CustomerListResourcesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListResourcesPageAsync>

    /** @see listResources */
    fun listResources(
        params: CustomerListResourcesParams
    ): CompletableFuture<CustomerListResourcesPageAsync> =
        listResources(params, RequestOptions.none())

    /** @see listResources */
    fun listResources(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListResourcesPageAsync> =
        listResources(id, CustomerListResourcesParams.none(), requestOptions)

    /** Creates a new customer. */
    fun provision(params: CustomerProvisionParams): CompletableFuture<CustomerResponse> =
        provision(params, RequestOptions.none())

    /** @see provision */
    fun provision(
        params: CustomerProvisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse>

    /**
     * Retrieves the effective entitlements for a customer or resource, including feature and credit
     * entitlements.
     *
     * **Warning:** This REST API endpoint lacks built-in client-side caching, fallback mechanisms,
     * and low-latency guarantees. It is not recommended for hot-path entitlement checks. For
     * production use, consider using the Stigg Node Server SDK with caching or the Sidecar for
     * low-latency cached responses.
     */
    fun retrieveEntitlements(id: String): CompletableFuture<CustomerRetrieveEntitlementsResponse> =
        retrieveEntitlements(id, CustomerRetrieveEntitlementsParams.none())

    /** @see retrieveEntitlements */
    fun retrieveEntitlements(
        id: String,
        params: CustomerRetrieveEntitlementsParams = CustomerRetrieveEntitlementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerRetrieveEntitlementsResponse> =
        retrieveEntitlements(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveEntitlements */
    fun retrieveEntitlements(
        id: String,
        params: CustomerRetrieveEntitlementsParams = CustomerRetrieveEntitlementsParams.none(),
    ): CompletableFuture<CustomerRetrieveEntitlementsResponse> =
        retrieveEntitlements(id, params, RequestOptions.none())

    /** @see retrieveEntitlements */
    fun retrieveEntitlements(
        params: CustomerRetrieveEntitlementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerRetrieveEntitlementsResponse>

    /** @see retrieveEntitlements */
    fun retrieveEntitlements(
        params: CustomerRetrieveEntitlementsParams
    ): CompletableFuture<CustomerRetrieveEntitlementsResponse> =
        retrieveEntitlements(params, RequestOptions.none())

    /** @see retrieveEntitlements */
    fun retrieveEntitlements(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerRetrieveEntitlementsResponse> =
        retrieveEntitlements(id, CustomerRetrieveEntitlementsParams.none(), requestOptions)

    /** Restores an archived customer, allowing them to create new subscriptions again. */
    fun unarchive(id: String): CompletableFuture<CustomerResponse> =
        unarchive(id, CustomerUnarchiveParams.none())

    /** @see unarchive */
    fun unarchive(
        id: String,
        params: CustomerUnarchiveParams = CustomerUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse> =
        unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(
        id: String,
        params: CustomerUnarchiveParams = CustomerUnarchiveParams.none(),
    ): CompletableFuture<CustomerResponse> = unarchive(id, params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        params: CustomerUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse>

    /** @see unarchive */
    fun unarchive(params: CustomerUnarchiveParams): CompletableFuture<CustomerResponse> =
        unarchive(params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(id: String, requestOptions: RequestOptions): CompletableFuture<CustomerResponse> =
        unarchive(id, CustomerUnarchiveParams.none(), requestOptions)

    /**
     * A view of [CustomerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceAsync.WithRawResponse

        /** Operations related to customers */
        fun paymentMethod(): PaymentMethodServiceAsync.WithRawResponse

        /** Operations related to promotional entitlements */
        fun promotionalEntitlements(): PromotionalEntitlementServiceAsync.WithRawResponse

        fun integrations(): IntegrationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}`, but is otherwise the same
         * as [CustomerServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            retrieve(id, CustomerRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CustomerRetrieveParams
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            retrieve(id, CustomerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/customers/{id}`, but is otherwise the same
         * as [CustomerServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            update(id, CustomerUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: CustomerUpdateParams = CustomerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: CustomerUpdateParams = CustomerUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>>

        /** @see update */
        fun update(
            params: CustomerUpdateParams
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            update(id, CustomerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/customers`, but is otherwise the same as
         * [CustomerServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(CustomerListParams.none())

        /** @see list */
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>>

        /** @see list */
        fun list(
            params: CustomerListParams = CustomerListParams.none()
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{id}/archive`, but is otherwise
         * the same as [CustomerServiceAsync.archive].
         */
        fun archive(id: String): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            archive(id, CustomerArchiveParams.none())

        /** @see archive */
        fun archive(
            id: String,
            params: CustomerArchiveParams = CustomerArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        fun archive(
            id: String,
            params: CustomerArchiveParams = CustomerArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            archive(id, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: CustomerArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>>

        /** @see archive */
        fun archive(
            params: CustomerArchiveParams
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            archive(id, CustomerArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/entitlements/check`, but is
         * otherwise the same as [CustomerServiceAsync.checkEntitlement].
         */
        fun checkEntitlement(
            id: String
        ): CompletableFuture<HttpResponseFor<CustomerCheckEntitlementResponse>> =
            checkEntitlement(id, CustomerCheckEntitlementParams.none())

        /** @see checkEntitlement */
        fun checkEntitlement(
            id: String,
            params: CustomerCheckEntitlementParams = CustomerCheckEntitlementParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCheckEntitlementResponse>> =
            checkEntitlement(params.toBuilder().id(id).build(), requestOptions)

        /** @see checkEntitlement */
        fun checkEntitlement(
            id: String,
            params: CustomerCheckEntitlementParams = CustomerCheckEntitlementParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCheckEntitlementResponse>> =
            checkEntitlement(id, params, RequestOptions.none())

        /** @see checkEntitlement */
        fun checkEntitlement(
            params: CustomerCheckEntitlementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCheckEntitlementResponse>>

        /** @see checkEntitlement */
        fun checkEntitlement(
            params: CustomerCheckEntitlementParams
        ): CompletableFuture<HttpResponseFor<CustomerCheckEntitlementResponse>> =
            checkEntitlement(params, RequestOptions.none())

        /** @see checkEntitlement */
        fun checkEntitlement(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCheckEntitlementResponse>> =
            checkEntitlement(id, CustomerCheckEntitlementParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/import`, but is otherwise the
         * same as [CustomerServiceAsync.import_].
         */
        fun import_(
            params: CustomerImportParams
        ): CompletableFuture<HttpResponseFor<CustomerImportResponse>> =
            import_(params, RequestOptions.none())

        /** @see import_ */
        fun import_(
            params: CustomerImportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerImportResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/contracts`, but is otherwise
         * the same as [CustomerServiceAsync.listContracts].
         */
        fun listContracts(
            id: String
        ): CompletableFuture<HttpResponseFor<CustomerListContractsResponse>> =
            listContracts(id, CustomerListContractsParams.none())

        /** @see listContracts */
        fun listContracts(
            id: String,
            params: CustomerListContractsParams = CustomerListContractsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListContractsResponse>> =
            listContracts(params.toBuilder().id(id).build(), requestOptions)

        /** @see listContracts */
        fun listContracts(
            id: String,
            params: CustomerListContractsParams = CustomerListContractsParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListContractsResponse>> =
            listContracts(id, params, RequestOptions.none())

        /** @see listContracts */
        fun listContracts(
            params: CustomerListContractsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListContractsResponse>>

        /** @see listContracts */
        fun listContracts(
            params: CustomerListContractsParams
        ): CompletableFuture<HttpResponseFor<CustomerListContractsResponse>> =
            listContracts(params, RequestOptions.none())

        /** @see listContracts */
        fun listContracts(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListContractsResponse>> =
            listContracts(id, CustomerListContractsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/invoices`, but is otherwise
         * the same as [CustomerServiceAsync.listInvoices].
         */
        fun listInvoices(
            id: String
        ): CompletableFuture<HttpResponseFor<CustomerListInvoicesPageAsync>> =
            listInvoices(id, CustomerListInvoicesParams.none())

        /** @see listInvoices */
        fun listInvoices(
            id: String,
            params: CustomerListInvoicesParams = CustomerListInvoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListInvoicesPageAsync>> =
            listInvoices(params.toBuilder().id(id).build(), requestOptions)

        /** @see listInvoices */
        fun listInvoices(
            id: String,
            params: CustomerListInvoicesParams = CustomerListInvoicesParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListInvoicesPageAsync>> =
            listInvoices(id, params, RequestOptions.none())

        /** @see listInvoices */
        fun listInvoices(
            params: CustomerListInvoicesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListInvoicesPageAsync>>

        /** @see listInvoices */
        fun listInvoices(
            params: CustomerListInvoicesParams
        ): CompletableFuture<HttpResponseFor<CustomerListInvoicesPageAsync>> =
            listInvoices(params, RequestOptions.none())

        /** @see listInvoices */
        fun listInvoices(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListInvoicesPageAsync>> =
            listInvoices(id, CustomerListInvoicesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/resources`, but is otherwise
         * the same as [CustomerServiceAsync.listResources].
         */
        fun listResources(
            id: String
        ): CompletableFuture<HttpResponseFor<CustomerListResourcesPageAsync>> =
            listResources(id, CustomerListResourcesParams.none())

        /** @see listResources */
        fun listResources(
            id: String,
            params: CustomerListResourcesParams = CustomerListResourcesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListResourcesPageAsync>> =
            listResources(params.toBuilder().id(id).build(), requestOptions)

        /** @see listResources */
        fun listResources(
            id: String,
            params: CustomerListResourcesParams = CustomerListResourcesParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListResourcesPageAsync>> =
            listResources(id, params, RequestOptions.none())

        /** @see listResources */
        fun listResources(
            params: CustomerListResourcesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListResourcesPageAsync>>

        /** @see listResources */
        fun listResources(
            params: CustomerListResourcesParams
        ): CompletableFuture<HttpResponseFor<CustomerListResourcesPageAsync>> =
            listResources(params, RequestOptions.none())

        /** @see listResources */
        fun listResources(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListResourcesPageAsync>> =
            listResources(id, CustomerListResourcesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/customers`, but is otherwise the same as
         * [CustomerServiceAsync.provision].
         */
        fun provision(
            params: CustomerProvisionParams
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            provision(params, RequestOptions.none())

        /** @see provision */
        fun provision(
            params: CustomerProvisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/entitlements`, but is
         * otherwise the same as [CustomerServiceAsync.retrieveEntitlements].
         */
        fun retrieveEntitlements(
            id: String
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveEntitlementsResponse>> =
            retrieveEntitlements(id, CustomerRetrieveEntitlementsParams.none())

        /** @see retrieveEntitlements */
        fun retrieveEntitlements(
            id: String,
            params: CustomerRetrieveEntitlementsParams = CustomerRetrieveEntitlementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveEntitlementsResponse>> =
            retrieveEntitlements(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveEntitlements */
        fun retrieveEntitlements(
            id: String,
            params: CustomerRetrieveEntitlementsParams = CustomerRetrieveEntitlementsParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveEntitlementsResponse>> =
            retrieveEntitlements(id, params, RequestOptions.none())

        /** @see retrieveEntitlements */
        fun retrieveEntitlements(
            params: CustomerRetrieveEntitlementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveEntitlementsResponse>>

        /** @see retrieveEntitlements */
        fun retrieveEntitlements(
            params: CustomerRetrieveEntitlementsParams
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveEntitlementsResponse>> =
            retrieveEntitlements(params, RequestOptions.none())

        /** @see retrieveEntitlements */
        fun retrieveEntitlements(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveEntitlementsResponse>> =
            retrieveEntitlements(id, CustomerRetrieveEntitlementsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{id}/unarchive`, but is otherwise
         * the same as [CustomerServiceAsync.unarchive].
         */
        fun unarchive(id: String): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            unarchive(id, CustomerUnarchiveParams.none())

        /** @see unarchive */
        fun unarchive(
            id: String,
            params: CustomerUnarchiveParams = CustomerUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchive */
        fun unarchive(
            id: String,
            params: CustomerUnarchiveParams = CustomerUnarchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            unarchive(id, params, RequestOptions.none())

        /** @see unarchive */
        fun unarchive(
            params: CustomerUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>>

        /** @see unarchive */
        fun unarchive(
            params: CustomerUnarchiveParams
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            unarchive(params, RequestOptions.none())

        /** @see unarchive */
        fun unarchive(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            unarchive(id, CustomerUnarchiveParams.none(), requestOptions)
    }
}
