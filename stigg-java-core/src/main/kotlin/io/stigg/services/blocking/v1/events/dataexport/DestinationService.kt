// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.dataexport

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.dataexport.destinations.DestinationCreateParams
import io.stigg.models.v1.events.dataexport.destinations.DestinationCreateResponse
import io.stigg.models.v1.events.dataexport.destinations.DestinationDeleteParams
import io.stigg.models.v1.events.dataexport.destinations.DestinationDeleteResponse
import io.stigg.models.v1.events.dataexport.destinations.DestinationUpdateParams
import io.stigg.models.v1.events.dataexport.destinations.DestinationUpdateResponse
import java.util.function.Consumer

interface DestinationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DestinationService

    /**
     * Register a destination on the environment's DATA_EXPORT integration. Lazy-creates the
     * integration row + provider recipient on first call. Idempotent on destinationId.
     */
    fun create(params: DestinationCreateParams): DestinationCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DestinationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DestinationCreateResponse

    /**
     * Update a destination's entity selection. Pushes the new enabled_models to the provider first,
     * then persists the selection. Applies on the next scheduled transfer.
     */
    fun update(destinationId: String, params: DestinationUpdateParams): DestinationUpdateResponse =
        update(destinationId, params, RequestOptions.none())

    /** @see update */
    fun update(
        destinationId: String,
        params: DestinationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DestinationUpdateResponse =
        update(params.toBuilder().destinationId(destinationId).build(), requestOptions)

    /** @see update */
    fun update(params: DestinationUpdateParams): DestinationUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DestinationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DestinationUpdateResponse

    /** Remove a destination from the DATA_EXPORT integration metadata. Idempotent. */
    fun delete(destinationId: String): DestinationDeleteResponse =
        delete(destinationId, DestinationDeleteParams.none())

    /** @see delete */
    fun delete(
        destinationId: String,
        params: DestinationDeleteParams = DestinationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DestinationDeleteResponse =
        delete(params.toBuilder().destinationId(destinationId).build(), requestOptions)

    /** @see delete */
    fun delete(
        destinationId: String,
        params: DestinationDeleteParams = DestinationDeleteParams.none(),
    ): DestinationDeleteResponse = delete(destinationId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DestinationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DestinationDeleteResponse

    /** @see delete */
    fun delete(params: DestinationDeleteParams): DestinationDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(destinationId: String, requestOptions: RequestOptions): DestinationDeleteResponse =
        delete(destinationId, DestinationDeleteParams.none(), requestOptions)

    /**
     * A view of [DestinationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DestinationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/data-export/destinations`, but is otherwise
         * the same as [DestinationService.create].
         */
        @MustBeClosed
        fun create(params: DestinationCreateParams): HttpResponseFor<DestinationCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DestinationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DestinationCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/data-export/destinations/{destinationId}`,
         * but is otherwise the same as [DestinationService.update].
         */
        @MustBeClosed
        fun update(
            destinationId: String,
            params: DestinationUpdateParams,
        ): HttpResponseFor<DestinationUpdateResponse> =
            update(destinationId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            destinationId: String,
            params: DestinationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DestinationUpdateResponse> =
            update(params.toBuilder().destinationId(destinationId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DestinationUpdateParams): HttpResponseFor<DestinationUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DestinationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DestinationUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/data-export/destinations/{destinationId}`, but is otherwise the same as
         * [DestinationService.delete].
         */
        @MustBeClosed
        fun delete(destinationId: String): HttpResponseFor<DestinationDeleteResponse> =
            delete(destinationId, DestinationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            destinationId: String,
            params: DestinationDeleteParams = DestinationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DestinationDeleteResponse> =
            delete(params.toBuilder().destinationId(destinationId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            destinationId: String,
            params: DestinationDeleteParams = DestinationDeleteParams.none(),
        ): HttpResponseFor<DestinationDeleteResponse> =
            delete(destinationId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DestinationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DestinationDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: DestinationDeleteParams): HttpResponseFor<DestinationDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            destinationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DestinationDeleteResponse> =
            delete(destinationId, DestinationDeleteParams.none(), requestOptions)
    }
}
