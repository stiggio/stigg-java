// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v2

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v2.customers.CustomerRetrieveParams
import com.stigg.api.models.v2.customers.CustomerRetrieveResponse
import com.stigg.api.services.async.v2.customers.SubCustomerServiceAsync
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
    fun retrieve(
        refId: String,
        params: CustomerRetrieveParams,
    ): CompletableFuture<CustomerRetrieveResponse> = retrieve(refId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        refId: String,
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerRetrieveResponse> =
        retrieve(params.toBuilder().refId(refId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: CustomerRetrieveParams): CompletableFuture<CustomerRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerRetrieveResponse>

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
         * same as [CustomerServiceAsync.retrieve].
         */
        fun retrieve(
            refId: String,
            params: CustomerRetrieveParams,
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveResponse>> =
            retrieve(refId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            refId: String,
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveResponse>> =
            retrieve(params.toBuilder().refId(refId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            params: CustomerRetrieveParams
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveResponse>>
    }
}
