// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.customers

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.usage.UsageRetrieveParams
import io.stigg.models.v1.customers.usage.UsageRetrieveResponse
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
