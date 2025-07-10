// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.customers.CustomerGetCustomerParams
import com.stigg.api.models.v1.customers.CustomerGetCustomerResponse
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
    fun getCustomer(refId: String, params: CustomerGetCustomerParams): CustomerGetCustomerResponse =
        getCustomer(refId, params, RequestOptions.none())

    /** @see [getCustomer] */
    fun getCustomer(
        refId: String,
        params: CustomerGetCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerGetCustomerResponse =
        getCustomer(params.toBuilder().refId(refId).build(), requestOptions)

    /** @see [getCustomer] */
    fun getCustomer(params: CustomerGetCustomerParams): CustomerGetCustomerResponse =
        getCustomer(params, RequestOptions.none())

    /** @see [getCustomer] */
    fun getCustomer(
        params: CustomerGetCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerGetCustomerResponse

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
         * same as [CustomerService.getCustomer].
         */
        @MustBeClosed
        fun getCustomer(
            refId: String,
            params: CustomerGetCustomerParams,
        ): HttpResponseFor<CustomerGetCustomerResponse> =
            getCustomer(refId, params, RequestOptions.none())

        /** @see [getCustomer] */
        @MustBeClosed
        fun getCustomer(
            refId: String,
            params: CustomerGetCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerGetCustomerResponse> =
            getCustomer(params.toBuilder().refId(refId).build(), requestOptions)

        /** @see [getCustomer] */
        @MustBeClosed
        fun getCustomer(
            params: CustomerGetCustomerParams
        ): HttpResponseFor<CustomerGetCustomerResponse> = getCustomer(params, RequestOptions.none())

        /** @see [getCustomer] */
        @MustBeClosed
        fun getCustomer(
            params: CustomerGetCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerGetCustomerResponse>
    }
}
