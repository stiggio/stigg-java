// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.V1RetrieveCustomerParams
import com.stigg.api.models.v1.V1RetrieveCustomerResponse
import com.stigg.api.services.blocking.v1.PermissionService
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    fun permissions(): PermissionService

    /** Get a single customer by id */
    fun retrieveCustomer(
        refId: String,
        params: V1RetrieveCustomerParams,
    ): V1RetrieveCustomerResponse = retrieveCustomer(refId, params, RequestOptions.none())

    /** @see [retrieveCustomer] */
    fun retrieveCustomer(
        refId: String,
        params: V1RetrieveCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1RetrieveCustomerResponse =
        retrieveCustomer(params.toBuilder().refId(refId).build(), requestOptions)

    /** @see [retrieveCustomer] */
    fun retrieveCustomer(params: V1RetrieveCustomerParams): V1RetrieveCustomerResponse =
        retrieveCustomer(params, RequestOptions.none())

    /** @see [retrieveCustomer] */
    fun retrieveCustomer(
        params: V1RetrieveCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1RetrieveCustomerResponse

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        fun permissions(): PermissionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{refId}`, but is otherwise the
         * same as [V1Service.retrieveCustomer].
         */
        @MustBeClosed
        fun retrieveCustomer(
            refId: String,
            params: V1RetrieveCustomerParams,
        ): HttpResponseFor<V1RetrieveCustomerResponse> =
            retrieveCustomer(refId, params, RequestOptions.none())

        /** @see [retrieveCustomer] */
        @MustBeClosed
        fun retrieveCustomer(
            refId: String,
            params: V1RetrieveCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1RetrieveCustomerResponse> =
            retrieveCustomer(params.toBuilder().refId(refId).build(), requestOptions)

        /** @see [retrieveCustomer] */
        @MustBeClosed
        fun retrieveCustomer(
            params: V1RetrieveCustomerParams
        ): HttpResponseFor<V1RetrieveCustomerResponse> =
            retrieveCustomer(params, RequestOptions.none())

        /** @see [retrieveCustomer] */
        @MustBeClosed
        fun retrieveCustomer(
            params: V1RetrieveCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1RetrieveCustomerResponse>
    }
}
