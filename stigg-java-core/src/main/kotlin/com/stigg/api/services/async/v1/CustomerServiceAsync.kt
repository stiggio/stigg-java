// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.customers.CustomerGetCustomerParams
import com.stigg.api.models.v1.customers.CustomerGetCustomerResponse
import com.stigg.api.services.async.v1.customers.SubCustomerServiceAsync
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

    fun subCustomer(): SubCustomerServiceAsync

    /** Get a single customer by id */
    fun getCustomer(
        refId: String,
        params: CustomerGetCustomerParams,
    ): CompletableFuture<CustomerGetCustomerResponse> =
        getCustomer(refId, params, RequestOptions.none())

    /** @see [getCustomer] */
    fun getCustomer(
        refId: String,
        params: CustomerGetCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerGetCustomerResponse> =
        getCustomer(params.toBuilder().refId(refId).build(), requestOptions)

    /** @see [getCustomer] */
    fun getCustomer(
        params: CustomerGetCustomerParams
    ): CompletableFuture<CustomerGetCustomerResponse> = getCustomer(params, RequestOptions.none())

    /** @see [getCustomer] */
    fun getCustomer(
        params: CustomerGetCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerGetCustomerResponse>

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

        fun subCustomer(): SubCustomerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{refId}`, but is otherwise the
         * same as [CustomerServiceAsync.getCustomer].
         */
        fun getCustomer(
            refId: String,
            params: CustomerGetCustomerParams,
        ): CompletableFuture<HttpResponseFor<CustomerGetCustomerResponse>> =
            getCustomer(refId, params, RequestOptions.none())

        /** @see [getCustomer] */
        fun getCustomer(
            refId: String,
            params: CustomerGetCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerGetCustomerResponse>> =
            getCustomer(params.toBuilder().refId(refId).build(), requestOptions)

        /** @see [getCustomer] */
        fun getCustomer(
            params: CustomerGetCustomerParams
        ): CompletableFuture<HttpResponseFor<CustomerGetCustomerResponse>> =
            getCustomer(params, RequestOptions.none())

        /** @see [getCustomer] */
        fun getCustomer(
            params: CustomerGetCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerGetCustomerResponse>>
    }
}
