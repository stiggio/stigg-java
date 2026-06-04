// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.dataexport.DataExportMintScopedTokenParams
import io.stigg.models.v1.events.dataexport.DataExportMintScopedTokenResponse
import io.stigg.models.v1.events.dataexport.DataExportTriggerSyncParams
import io.stigg.models.v1.events.dataexport.DataExportTriggerSyncResponse
import io.stigg.services.async.v1.events.dataexport.DestinationServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DataExportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataExportServiceAsync

    fun destinations(): DestinationServiceAsync

    /**
     * Mint a scoped JWT for the FE embedded SDK. Lazy-creates the DATA_EXPORT integration if
     * needed.
     */
    fun mintScopedToken(
        params: DataExportMintScopedTokenParams
    ): CompletableFuture<DataExportMintScopedTokenResponse> =
        mintScopedToken(params, RequestOptions.none())

    /** @see mintScopedToken */
    fun mintScopedToken(
        params: DataExportMintScopedTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportMintScopedTokenResponse>

    /** Trigger a sync for one destination or all destinations under the provider entity. */
    fun triggerSync(): CompletableFuture<DataExportTriggerSyncResponse> =
        triggerSync(DataExportTriggerSyncParams.none())

    /** @see triggerSync */
    fun triggerSync(
        params: DataExportTriggerSyncParams = DataExportTriggerSyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportTriggerSyncResponse>

    /** @see triggerSync */
    fun triggerSync(
        params: DataExportTriggerSyncParams = DataExportTriggerSyncParams.none()
    ): CompletableFuture<DataExportTriggerSyncResponse> = triggerSync(params, RequestOptions.none())

    /** @see triggerSync */
    fun triggerSync(
        requestOptions: RequestOptions
    ): CompletableFuture<DataExportTriggerSyncResponse> =
        triggerSync(DataExportTriggerSyncParams.none(), requestOptions)

    /**
     * A view of [DataExportServiceAsync] that provides access to raw HTTP responses for each
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
        ): DataExportServiceAsync.WithRawResponse

        fun destinations(): DestinationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/data-export/scoped-token`, but is otherwise
         * the same as [DataExportServiceAsync.mintScopedToken].
         */
        fun mintScopedToken(
            params: DataExportMintScopedTokenParams
        ): CompletableFuture<HttpResponseFor<DataExportMintScopedTokenResponse>> =
            mintScopedToken(params, RequestOptions.none())

        /** @see mintScopedToken */
        fun mintScopedToken(
            params: DataExportMintScopedTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportMintScopedTokenResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/data-export/sync`, but is otherwise the
         * same as [DataExportServiceAsync.triggerSync].
         */
        fun triggerSync(): CompletableFuture<HttpResponseFor<DataExportTriggerSyncResponse>> =
            triggerSync(DataExportTriggerSyncParams.none())

        /** @see triggerSync */
        fun triggerSync(
            params: DataExportTriggerSyncParams = DataExportTriggerSyncParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportTriggerSyncResponse>>

        /** @see triggerSync */
        fun triggerSync(
            params: DataExportTriggerSyncParams = DataExportTriggerSyncParams.none()
        ): CompletableFuture<HttpResponseFor<DataExportTriggerSyncResponse>> =
            triggerSync(params, RequestOptions.none())

        /** @see triggerSync */
        fun triggerSync(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DataExportTriggerSyncResponse>> =
            triggerSync(DataExportTriggerSyncParams.none(), requestOptions)
    }
}
