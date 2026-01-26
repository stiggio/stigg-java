// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.customers.CustomerArchiveParams
import com.stigg.api.models.v1.customers.CustomerCreateParams
import com.stigg.api.models.v1.customers.CustomerListParams
import com.stigg.api.models.v1.customers.CustomerListResponse
import com.stigg.api.models.v1.customers.CustomerResponse
import com.stigg.api.models.v1.customers.CustomerRetrieveParams
import com.stigg.api.models.v1.customers.CustomerUnarchiveParams
import com.stigg.api.models.v1.customers.CustomerUpdateParams
import com.stigg.api.services.blocking.v1.customers.PaymentMethodService
import com.stigg.api.services.blocking.v1.customers.UsageService
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

    fun usage(): UsageService

    /** Create a new Customer */
    fun create(params: CustomerCreateParams): CustomerResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse

    /** Get a single Customer by id */
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

    /** Update an existing Customer */
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

    /** Get a list of Customers */
    fun list(): CustomerListResponse = list(CustomerListParams.none())

    /** @see list */
    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListResponse

    /** @see list */
    fun list(params: CustomerListParams = CustomerListParams.none()): CustomerListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CustomerListResponse =
        list(CustomerListParams.none(), requestOptions)

    /** Perform archive on a Customer */
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

    /** Perform unarchive on a Customer */
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

        fun usage(): UsageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/customers`, but is otherwise the same as
         * [CustomerService.create].
         */
        @MustBeClosed
        fun create(params: CustomerCreateParams): HttpResponseFor<CustomerResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse>

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
        fun list(): HttpResponseFor<CustomerListResponse> = list(CustomerListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none()
        ): HttpResponseFor<CustomerListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CustomerListResponse> =
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
