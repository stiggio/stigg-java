// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.dataexport

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.dataexport.destinations.DestinationCreateParams
import io.stigg.models.v1.events.dataexport.destinations.DestinationCreateResponse
import io.stigg.models.v1.events.dataexport.destinations.DestinationDeleteParams
import io.stigg.models.v1.events.dataexport.destinations.DestinationDeleteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DestinationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DestinationServiceAsync

    /**
     * Register a destination on the environment's DATA_EXPORT integration. Lazy-creates the
     * integration row + provider recipient on first call. Idempotent on destinationId.
     */
    fun create(params: DestinationCreateParams): CompletableFuture<DestinationCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DestinationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DestinationCreateResponse>

    /** Remove a destination from the DATA_EXPORT integration metadata. Idempotent. */
    fun delete(destinationId: String): CompletableFuture<DestinationDeleteResponse> =
        delete(destinationId, DestinationDeleteParams.none())

    /** @see delete */
    fun delete(
        destinationId: String,
        params: DestinationDeleteParams = DestinationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DestinationDeleteResponse> =
        delete(params.toBuilder().destinationId(destinationId).build(), requestOptions)

    /** @see delete */
    fun delete(
        destinationId: String,
        params: DestinationDeleteParams = DestinationDeleteParams.none(),
    ): CompletableFuture<DestinationDeleteResponse> =
        delete(destinationId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DestinationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DestinationDeleteResponse>

    /** @see delete */
    fun delete(params: DestinationDeleteParams): CompletableFuture<DestinationDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        destinationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DestinationDeleteResponse> =
        delete(destinationId, DestinationDeleteParams.none(), requestOptions)

    /**
     * A view of [DestinationServiceAsync] that provides access to raw HTTP responses for each
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
        ): DestinationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/data-export/destinations`, but is otherwise
         * the same as [DestinationServiceAsync.create].
         */
        fun create(
            params: DestinationCreateParams
        ): CompletableFuture<HttpResponseFor<DestinationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DestinationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DestinationCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/data-export/destinations/{destinationId}`, but is otherwise the same as
         * [DestinationServiceAsync.delete].
         */
        fun delete(
            destinationId: String
        ): CompletableFuture<HttpResponseFor<DestinationDeleteResponse>> =
            delete(destinationId, DestinationDeleteParams.none())

        /** @see delete */
        fun delete(
            destinationId: String,
            params: DestinationDeleteParams = DestinationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DestinationDeleteResponse>> =
            delete(params.toBuilder().destinationId(destinationId).build(), requestOptions)

        /** @see delete */
        fun delete(
            destinationId: String,
            params: DestinationDeleteParams = DestinationDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DestinationDeleteResponse>> =
            delete(destinationId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DestinationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DestinationDeleteResponse>>

        /** @see delete */
        fun delete(
            params: DestinationDeleteParams
        ): CompletableFuture<HttpResponseFor<DestinationDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            destinationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DestinationDeleteResponse>> =
            delete(destinationId, DestinationDeleteParams.none(), requestOptions)
    }
}
