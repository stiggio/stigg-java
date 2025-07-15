// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v2.customers

import com.google.errorprone.annotations.MustBeClosed
import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v2.customers.subcustomer.SubCustomerGetSubCustomerParams
import com.stigg.api.models.v2.customers.subcustomer.SubCustomerGetSubCustomerResponse
import java.util.function.Consumer

interface SubCustomerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubCustomerService

    /** Get a single customer by id */
    fun getSubCustomer(
        refId: String,
        params: SubCustomerGetSubCustomerParams,
    ): SubCustomerGetSubCustomerResponse = getSubCustomer(refId, params, RequestOptions.none())

    /** @see [getSubCustomer] */
    fun getSubCustomer(
        refId: String,
        params: SubCustomerGetSubCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubCustomerGetSubCustomerResponse =
        getSubCustomer(params.toBuilder().refId(refId).build(), requestOptions)

    /** @see [getSubCustomer] */
    fun getSubCustomer(params: SubCustomerGetSubCustomerParams): SubCustomerGetSubCustomerResponse =
        getSubCustomer(params, RequestOptions.none())

    /** @see [getSubCustomer] */
    fun getSubCustomer(
        params: SubCustomerGetSubCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubCustomerGetSubCustomerResponse

    /**
     * A view of [SubCustomerService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubCustomerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{refId}`, but is otherwise the
         * same as [SubCustomerService.getSubCustomer].
         */
        @MustBeClosed
        fun getSubCustomer(
            refId: String,
            params: SubCustomerGetSubCustomerParams,
        ): HttpResponseFor<SubCustomerGetSubCustomerResponse> =
            getSubCustomer(refId, params, RequestOptions.none())

        /** @see [getSubCustomer] */
        @MustBeClosed
        fun getSubCustomer(
            refId: String,
            params: SubCustomerGetSubCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubCustomerGetSubCustomerResponse> =
            getSubCustomer(params.toBuilder().refId(refId).build(), requestOptions)

        /** @see [getSubCustomer] */
        @MustBeClosed
        fun getSubCustomer(
            params: SubCustomerGetSubCustomerParams
        ): HttpResponseFor<SubCustomerGetSubCustomerResponse> =
            getSubCustomer(params, RequestOptions.none())

        /** @see [getSubCustomer] */
        @MustBeClosed
        fun getSubCustomer(
            params: SubCustomerGetSubCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubCustomerGetSubCustomerResponse>
    }
}
