// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v2.customers

import com.google.errorprone.annotations.MustBeClosed
import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v2.customers.subcustomer.SubCustomerRetrieveParams
import com.stigg.api.models.v2.customers.subcustomer.SubCustomerRetrieveResponse
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
    fun retrieve(refId: String, params: SubCustomerRetrieveParams): SubCustomerRetrieveResponse =
        retrieve(refId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        refId: String,
        params: SubCustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubCustomerRetrieveResponse =
        retrieve(params.toBuilder().refId(refId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: SubCustomerRetrieveParams): SubCustomerRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SubCustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubCustomerRetrieveResponse

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
         * same as [SubCustomerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            refId: String,
            params: SubCustomerRetrieveParams,
        ): HttpResponseFor<SubCustomerRetrieveResponse> =
            retrieve(refId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            refId: String,
            params: SubCustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubCustomerRetrieveResponse> =
            retrieve(params.toBuilder().refId(refId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubCustomerRetrieveParams
        ): HttpResponseFor<SubCustomerRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubCustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubCustomerRetrieveResponse>
    }
}
