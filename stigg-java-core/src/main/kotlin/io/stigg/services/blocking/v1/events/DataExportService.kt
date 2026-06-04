// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.dataexport.DataExportMintScopedTokenParams
import io.stigg.models.v1.events.dataexport.DataExportMintScopedTokenResponse
import io.stigg.models.v1.events.dataexport.DataExportTriggerSyncParams
import io.stigg.models.v1.events.dataexport.DataExportTriggerSyncResponse
import io.stigg.services.blocking.v1.events.dataexport.DestinationService
import java.util.function.Consumer

interface DataExportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataExportService

    fun destinations(): DestinationService

    /**
     * Mint a scoped JWT for the FE embedded SDK. Lazy-creates the DATA_EXPORT integration if
     * needed.
     */
    fun mintScopedToken(
        params: DataExportMintScopedTokenParams
    ): DataExportMintScopedTokenResponse = mintScopedToken(params, RequestOptions.none())

    /** @see mintScopedToken */
    fun mintScopedToken(
        params: DataExportMintScopedTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportMintScopedTokenResponse

    /** Trigger a sync for one destination or all destinations under the provider entity. */
    fun triggerSync(): DataExportTriggerSyncResponse =
        triggerSync(DataExportTriggerSyncParams.none())

    /** @see triggerSync */
    fun triggerSync(
        params: DataExportTriggerSyncParams = DataExportTriggerSyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportTriggerSyncResponse

    /** @see triggerSync */
    fun triggerSync(
        params: DataExportTriggerSyncParams = DataExportTriggerSyncParams.none()
    ): DataExportTriggerSyncResponse = triggerSync(params, RequestOptions.none())

    /** @see triggerSync */
    fun triggerSync(requestOptions: RequestOptions): DataExportTriggerSyncResponse =
        triggerSync(DataExportTriggerSyncParams.none(), requestOptions)

    /** A view of [DataExportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataExportService.WithRawResponse

        fun destinations(): DestinationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/data-export/scoped-token`, but is otherwise
         * the same as [DataExportService.mintScopedToken].
         */
        @MustBeClosed
        fun mintScopedToken(
            params: DataExportMintScopedTokenParams
        ): HttpResponseFor<DataExportMintScopedTokenResponse> =
            mintScopedToken(params, RequestOptions.none())

        /** @see mintScopedToken */
        @MustBeClosed
        fun mintScopedToken(
            params: DataExportMintScopedTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportMintScopedTokenResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/data-export/sync`, but is otherwise the
         * same as [DataExportService.triggerSync].
         */
        @MustBeClosed
        fun triggerSync(): HttpResponseFor<DataExportTriggerSyncResponse> =
            triggerSync(DataExportTriggerSyncParams.none())

        /** @see triggerSync */
        @MustBeClosed
        fun triggerSync(
            params: DataExportTriggerSyncParams = DataExportTriggerSyncParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportTriggerSyncResponse>

        /** @see triggerSync */
        @MustBeClosed
        fun triggerSync(
            params: DataExportTriggerSyncParams = DataExportTriggerSyncParams.none()
        ): HttpResponseFor<DataExportTriggerSyncResponse> =
            triggerSync(params, RequestOptions.none())

        /** @see triggerSync */
        @MustBeClosed
        fun triggerSync(
            requestOptions: RequestOptions
        ): HttpResponseFor<DataExportTriggerSyncResponse> =
            triggerSync(DataExportTriggerSyncParams.none(), requestOptions)
    }
}
