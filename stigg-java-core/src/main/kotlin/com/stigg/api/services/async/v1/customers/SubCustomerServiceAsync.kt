// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1.customers

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.customers.subcustomer.SubCustomerRetrieveParams
import com.stigg.api.models.v1.customers.subcustomer.SubCustomerRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubCustomerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubCustomerServiceAsync

    /** Get a single customer by id */
    fun retrieve(
        refId: String,
        params: SubCustomerRetrieveParams,
    ): CompletableFuture<SubCustomerRetrieveResponse> =
        retrieve(refId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        refId: String,
        params: SubCustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubCustomerRetrieveResponse> =
        retrieve(params.toBuilder().refId(refId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: SubCustomerRetrieveParams
    ): CompletableFuture<SubCustomerRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SubCustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubCustomerRetrieveResponse>

    /**
     * A view of [SubCustomerServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubCustomerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{refId}`, but is otherwise the
         * same as [SubCustomerServiceAsync.retrieve].
         */
        fun retrieve(
            refId: String,
            params: SubCustomerRetrieveParams,
        ): CompletableFuture<HttpResponseFor<SubCustomerRetrieveResponse>> =
            retrieve(refId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            refId: String,
            params: SubCustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubCustomerRetrieveResponse>> =
            retrieve(params.toBuilder().refId(refId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            params: SubCustomerRetrieveParams
        ): CompletableFuture<HttpResponseFor<SubCustomerRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: SubCustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubCustomerRetrieveResponse>>
    }
}
