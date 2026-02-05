// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.CustomerArchiveParams
import io.stigg.models.v1.customers.CustomerImportParams
import io.stigg.models.v1.customers.CustomerImportResponse
import io.stigg.models.v1.customers.CustomerListPageAsync
import io.stigg.models.v1.customers.CustomerListParams
import io.stigg.models.v1.customers.CustomerProvisionParams
import io.stigg.models.v1.customers.CustomerResponse
import io.stigg.models.v1.customers.CustomerRetrieveParams
import io.stigg.models.v1.customers.CustomerUnarchiveParams
import io.stigg.models.v1.customers.CustomerUpdateParams
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

    fun paymentMethod(): PaymentMethodServiceAsync

    fun promotionalEntitlements(): PromotionalEntitlementServiceAsync

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
     * Creates a new customer and optionally provisions an initial subscription in a single
     * operation.
     */
    fun provision(params: CustomerProvisionParams): CompletableFuture<CustomerResponse> =
        provision(params, RequestOptions.none())

    /** @see provision */
    fun provision(
        params: CustomerProvisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse>

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

        fun paymentMethod(): PaymentMethodServiceAsync.WithRawResponse

        fun promotionalEntitlements(): PromotionalEntitlementServiceAsync.WithRawResponse

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
