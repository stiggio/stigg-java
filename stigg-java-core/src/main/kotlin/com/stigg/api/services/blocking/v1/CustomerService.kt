// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.customers.CustomerRetrieveParams
import com.stigg.api.models.v1.customers.CustomerRetrieveResponse
import com.stigg.api.services.blocking.v1.customers.SubCustomerService
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

    fun subCustomer(): SubCustomerService

    /** Get a single customer by id */
    fun retrieve(refId: String, params: CustomerRetrieveParams): CustomerRetrieveResponse =
        retrieve(refId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        refId: String,
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerRetrieveResponse = retrieve(params.toBuilder().refId(refId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: CustomerRetrieveParams): CustomerRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerRetrieveResponse

    /** A view of [CustomerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService.WithRawResponse

        fun subCustomer(): SubCustomerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{refId}`, but is otherwise the
         * same as [CustomerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            refId: String,
            params: CustomerRetrieveParams,
        ): HttpResponseFor<CustomerRetrieveResponse> =
            retrieve(refId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            refId: String,
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerRetrieveResponse> =
            retrieve(params.toBuilder().refId(refId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: CustomerRetrieveParams): HttpResponseFor<CustomerRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerRetrieveResponse>
    }
}
