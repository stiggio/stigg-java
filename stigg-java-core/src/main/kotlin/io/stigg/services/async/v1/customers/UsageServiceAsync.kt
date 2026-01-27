// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.usage.UsageRetrieveParams
import io.stigg.models.v1.customers.usage.UsageRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UsageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageServiceAsync

    /** Perform retrieval on a Usage history */
    fun retrieve(
        featureId: String,
        params: UsageRetrieveParams,
    ): CompletableFuture<UsageRetrieveResponse> = retrieve(featureId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        featureId: String,
        params: UsageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageRetrieveResponse> =
        retrieve(params.toBuilder().featureId(featureId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: UsageRetrieveParams): CompletableFuture<UsageRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UsageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageRetrieveResponse>

    /** A view of [UsageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/customers/{customerId}/usage/features/{featureId}`, but is otherwise the same as
         * [UsageServiceAsync.retrieve].
         */
        fun retrieve(
            featureId: String,
            params: UsageRetrieveParams,
        ): CompletableFuture<HttpResponseFor<UsageRetrieveResponse>> =
            retrieve(featureId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            featureId: String,
            params: UsageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageRetrieveResponse>> =
            retrieve(params.toBuilder().featureId(featureId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: UsageRetrieveParams
        ): CompletableFuture<HttpResponseFor<UsageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: UsageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageRetrieveResponse>>
    }
}
