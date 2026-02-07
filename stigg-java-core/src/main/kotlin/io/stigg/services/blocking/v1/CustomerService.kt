// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.CustomerArchiveParams
import io.stigg.models.v1.customers.CustomerImportParams
import io.stigg.models.v1.customers.CustomerImportResponse
import io.stigg.models.v1.customers.CustomerListPage
import io.stigg.models.v1.customers.CustomerListParams
import io.stigg.models.v1.customers.CustomerProvisionParams
import io.stigg.models.v1.customers.CustomerResponse
import io.stigg.models.v1.customers.CustomerRetrieveParams
import io.stigg.models.v1.customers.CustomerUnarchiveParams
import io.stigg.models.v1.customers.CustomerUpdateParams
import io.stigg.services.blocking.v1.customers.PaymentMethodService
import io.stigg.services.blocking.v1.customers.PromotionalEntitlementService
import java.util.function.Consumer

interface CustomerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService

    fun paymentMethod(): PaymentMethodService

    fun promotionalEntitlements(): PromotionalEntitlementService

    /**
     * Retrieves a customer by their unique identifier, including billing information and
     * subscription status.
     */
    fun retrieve(id: String): CustomerResponse = retrieve(id, CustomerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
    ): CustomerResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse

    /** @see retrieve */
    fun retrieve(params: CustomerRetrieveParams): CustomerResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CustomerResponse =
        retrieve(id, CustomerRetrieveParams.none(), requestOptions)

    /** Updates an existing customer's properties such as name, email, and billing information. */
    fun update(id: String): CustomerResponse = update(id, CustomerUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: CustomerUpdateParams = CustomerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: CustomerUpdateParams = CustomerUpdateParams.none(),
    ): CustomerResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse

    /** @see update */
    fun update(params: CustomerUpdateParams): CustomerResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CustomerResponse =
        update(id, CustomerUpdateParams.none(), requestOptions)

    /** Retrieves a paginated list of customers in the environment. */
    fun list(): CustomerListPage = list(CustomerListParams.none())

    /** @see list */
    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPage

    /** @see list */
    fun list(params: CustomerListParams = CustomerListParams.none()): CustomerListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CustomerListPage =
        list(CustomerListParams.none(), requestOptions)

    /**
     * Archives a customer, preventing new subscriptions. Optionally cancels existing subscriptions.
     */
    fun archive(id: String): CustomerResponse = archive(id, CustomerArchiveParams.none())

    /** @see archive */
    fun archive(
        id: String,
        params: CustomerArchiveParams = CustomerArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(
        id: String,
        params: CustomerArchiveParams = CustomerArchiveParams.none(),
    ): CustomerResponse = archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: CustomerArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse

    /** @see archive */
    fun archive(params: CustomerArchiveParams): CustomerResponse =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions): CustomerResponse =
        archive(id, CustomerArchiveParams.none(), requestOptions)

    /**
     * Imports multiple customers in bulk. Used for migrating customer data from external systems.
     */
    fun import_(params: CustomerImportParams): CustomerImportResponse =
        import_(params, RequestOptions.none())

    /** @see import_ */
    fun import_(
        params: CustomerImportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerImportResponse

    /**
     * Creates a new customer and optionally provisions an initial subscription in a single
     * operation.
     */
    fun provision(params: CustomerProvisionParams): CustomerResponse =
        provision(params, RequestOptions.none())

    /** @see provision */
    fun provision(
        params: CustomerProvisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse

    /** Restores an archived customer, allowing them to create new subscriptions again. */
    fun unarchive(id: String): CustomerResponse = unarchive(id, CustomerUnarchiveParams.none())

    /** @see unarchive */
    fun unarchive(
        id: String,
        params: CustomerUnarchiveParams = CustomerUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse = unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(
        id: String,
        params: CustomerUnarchiveParams = CustomerUnarchiveParams.none(),
    ): CustomerResponse = unarchive(id, params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        params: CustomerUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse

    /** @see unarchive */
    fun unarchive(params: CustomerUnarchiveParams): CustomerResponse =
        unarchive(params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(id: String, requestOptions: RequestOptions): CustomerResponse =
        unarchive(id, CustomerUnarchiveParams.none(), requestOptions)

    /** A view of [CustomerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService.WithRawResponse

        fun paymentMethod(): PaymentMethodService.WithRawResponse

        fun promotionalEntitlements(): PromotionalEntitlementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}`, but is otherwise the same
         * as [CustomerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CustomerResponse> =
            retrieve(id, CustomerRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        ): HttpResponseFor<CustomerResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CustomerRetrieveParams): HttpResponseFor<CustomerResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerResponse> =
            retrieve(id, CustomerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/customers/{id}`, but is otherwise the same
         * as [CustomerService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<CustomerResponse> =
            update(id, CustomerUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CustomerUpdateParams = CustomerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CustomerUpdateParams = CustomerUpdateParams.none(),
        ): HttpResponseFor<CustomerResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: CustomerUpdateParams): HttpResponseFor<CustomerResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<CustomerResponse> =
            update(id, CustomerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/customers`, but is otherwise the same as
         * [CustomerService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CustomerListPage> = list(CustomerListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none()
        ): HttpResponseFor<CustomerListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CustomerListPage> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{id}/archive`, but is otherwise
         * the same as [CustomerService.archive].
         */
        @MustBeClosed
        fun archive(id: String): HttpResponseFor<CustomerResponse> =
            archive(id, CustomerArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: CustomerArchiveParams = CustomerArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse> =
            archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: CustomerArchiveParams = CustomerArchiveParams.none(),
        ): HttpResponseFor<CustomerResponse> = archive(id, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: CustomerArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse>

        /** @see archive */
        @MustBeClosed
        fun archive(params: CustomerArchiveParams): HttpResponseFor<CustomerResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(id: String, requestOptions: RequestOptions): HttpResponseFor<CustomerResponse> =
            archive(id, CustomerArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/import`, but is otherwise the
         * same as [CustomerService.import_].
         */
        @MustBeClosed
        fun import_(params: CustomerImportParams): HttpResponseFor<CustomerImportResponse> =
            import_(params, RequestOptions.none())

        /** @see import_ */
        @MustBeClosed
        fun import_(
            params: CustomerImportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerImportResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/customers`, but is otherwise the same as
         * [CustomerService.provision].
         */
        @MustBeClosed
        fun provision(params: CustomerProvisionParams): HttpResponseFor<CustomerResponse> =
            provision(params, RequestOptions.none())

        /** @see provision */
        @MustBeClosed
        fun provision(
            params: CustomerProvisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{id}/unarchive`, but is otherwise
         * the same as [CustomerService.unarchive].
         */
        @MustBeClosed
        fun unarchive(id: String): HttpResponseFor<CustomerResponse> =
            unarchive(id, CustomerUnarchiveParams.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            id: String,
            params: CustomerUnarchiveParams = CustomerUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse> =
            unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            id: String,
            params: CustomerUnarchiveParams = CustomerUnarchiveParams.none(),
        ): HttpResponseFor<CustomerResponse> = unarchive(id, params, RequestOptions.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            params: CustomerUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse>

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(params: CustomerUnarchiveParams): HttpResponseFor<CustomerResponse> =
            unarchive(params, RequestOptions.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerResponse> =
            unarchive(id, CustomerUnarchiveParams.none(), requestOptions)
    }
}
