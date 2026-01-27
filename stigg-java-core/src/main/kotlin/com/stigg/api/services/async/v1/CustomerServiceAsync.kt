// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.customers.CustomerArchiveParams
import com.stigg.api.models.v1.customers.CustomerCreateParams
import com.stigg.api.models.v1.customers.CustomerListPageAsync
import com.stigg.api.models.v1.customers.CustomerListParams
import com.stigg.api.models.v1.customers.CustomerResponse
import com.stigg.api.models.v1.customers.CustomerRetrieveParams
import com.stigg.api.models.v1.customers.CustomerUnarchiveParams
import com.stigg.api.models.v1.customers.CustomerUpdateParams
import com.stigg.api.services.async.v1.customers.PaymentMethodServiceAsync
import com.stigg.api.services.async.v1.customers.UsageServiceAsync
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

    fun usage(): UsageServiceAsync

    /** Create a new Customer */
    fun create(params: CustomerCreateParams): CompletableFuture<CustomerResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse>

    /** Get a single Customer by id */
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

    /** Update an existing Customer */
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

    /** Get a list of Customers */
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

    /** Perform archive on a Customer */
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

    /** Perform unarchive on a Customer */
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

        fun usage(): UsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/customers`, but is otherwise the same as
         * [CustomerServiceAsync.create].
         */
        fun create(
            params: CustomerCreateParams
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>>

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
