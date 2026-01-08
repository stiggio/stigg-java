// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1.customers

import com.google.errorprone.annotations.MustBeClosed
import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.customers.usage.UsageRetrieveParams
import com.stigg.api.models.v1.customers.usage.UsageRetrieveResponse
import java.util.function.Consumer

interface UsageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService

    /** Perform retrieval on a Usage history */
    fun retrieve(featureId: String, params: UsageRetrieveParams): UsageRetrieveResponse =
        retrieve(featureId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        featureId: String,
        params: UsageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageRetrieveResponse =
        retrieve(params.toBuilder().featureId(featureId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: UsageRetrieveParams): UsageRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UsageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageRetrieveResponse

    /** A view of [UsageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/customers/{customerId}/usage/features/{featureId}`, but is otherwise the same as
         * [UsageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            featureId: String,
            params: UsageRetrieveParams,
        ): HttpResponseFor<UsageRetrieveResponse> =
            retrieve(featureId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            featureId: String,
            params: UsageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageRetrieveResponse> =
            retrieve(params.toBuilder().featureId(featureId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: UsageRetrieveParams): HttpResponseFor<UsageRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UsageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageRetrieveResponse>
    }
}
