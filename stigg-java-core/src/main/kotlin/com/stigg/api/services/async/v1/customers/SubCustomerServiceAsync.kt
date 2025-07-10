// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1.customers

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.customers.subcustomer.SubCustomerGetSubCustomerParams
import com.stigg.api.models.v1.customers.subcustomer.SubCustomerGetSubCustomerResponse
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
    fun getSubCustomer(
        refId: String,
        params: SubCustomerGetSubCustomerParams,
    ): CompletableFuture<SubCustomerGetSubCustomerResponse> =
        getSubCustomer(refId, params, RequestOptions.none())

    /** @see [getSubCustomer] */
    fun getSubCustomer(
        refId: String,
        params: SubCustomerGetSubCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubCustomerGetSubCustomerResponse> =
        getSubCustomer(params.toBuilder().refId(refId).build(), requestOptions)

    /** @see [getSubCustomer] */
    fun getSubCustomer(
        params: SubCustomerGetSubCustomerParams
    ): CompletableFuture<SubCustomerGetSubCustomerResponse> =
        getSubCustomer(params, RequestOptions.none())

    /** @see [getSubCustomer] */
    fun getSubCustomer(
        params: SubCustomerGetSubCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubCustomerGetSubCustomerResponse>

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
         * same as [SubCustomerServiceAsync.getSubCustomer].
         */
        fun getSubCustomer(
            refId: String,
            params: SubCustomerGetSubCustomerParams,
        ): CompletableFuture<HttpResponseFor<SubCustomerGetSubCustomerResponse>> =
            getSubCustomer(refId, params, RequestOptions.none())

        /** @see [getSubCustomer] */
        fun getSubCustomer(
            refId: String,
            params: SubCustomerGetSubCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubCustomerGetSubCustomerResponse>> =
            getSubCustomer(params.toBuilder().refId(refId).build(), requestOptions)

        /** @see [getSubCustomer] */
        fun getSubCustomer(
            params: SubCustomerGetSubCustomerParams
        ): CompletableFuture<HttpResponseFor<SubCustomerGetSubCustomerResponse>> =
            getSubCustomer(params, RequestOptions.none())

        /** @see [getSubCustomer] */
        fun getSubCustomer(
            params: SubCustomerGetSubCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubCustomerGetSubCustomerResponse>>
    }
}
