// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.features.FeatureArchiveFeatureParams
import io.stigg.models.v1.events.features.FeatureArchiveFeatureResponse
import io.stigg.models.v1.events.features.FeatureCreateFeatureParams
import io.stigg.models.v1.events.features.FeatureCreateFeatureResponse
import io.stigg.models.v1.events.features.FeatureListFeaturesPageAsync
import io.stigg.models.v1.events.features.FeatureListFeaturesParams
import io.stigg.models.v1.events.features.FeatureRetrieveFeatureParams
import io.stigg.models.v1.events.features.FeatureRetrieveFeatureResponse
import io.stigg.models.v1.events.features.FeatureUnarchiveFeatureParams
import io.stigg.models.v1.events.features.FeatureUnarchiveFeatureResponse
import io.stigg.models.v1.events.features.FeatureUpdateFeatureParams
import io.stigg.models.v1.events.features.FeatureUpdateFeatureResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FeatureServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureServiceAsync

    /** Archives a feature, preventing it from being used in new entitlements. */
    fun archiveFeature(id: String): CompletableFuture<FeatureArchiveFeatureResponse> =
        archiveFeature(id, FeatureArchiveFeatureParams.none())

    /** @see archiveFeature */
    fun archiveFeature(
        id: String,
        params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeatureArchiveFeatureResponse> =
        archiveFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see archiveFeature */
    fun archiveFeature(
        id: String,
        params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
    ): CompletableFuture<FeatureArchiveFeatureResponse> =
        archiveFeature(id, params, RequestOptions.none())

    /** @see archiveFeature */
    fun archiveFeature(
        params: FeatureArchiveFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeatureArchiveFeatureResponse>

    /** @see archiveFeature */
    fun archiveFeature(
        params: FeatureArchiveFeatureParams
    ): CompletableFuture<FeatureArchiveFeatureResponse> =
        archiveFeature(params, RequestOptions.none())

    /** @see archiveFeature */
    fun archiveFeature(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeatureArchiveFeatureResponse> =
        archiveFeature(id, FeatureArchiveFeatureParams.none(), requestOptions)

    /** Creates a new feature with the specified type, metering, and configuration. */
    fun createFeature(
        params: FeatureCreateFeatureParams
    ): CompletableFuture<FeatureCreateFeatureResponse> =
        createFeature(params, RequestOptions.none())

    /** @see createFeature */
    fun createFeature(
        params: FeatureCreateFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeatureCreateFeatureResponse>

    /** Retrieves a paginated list of features in the environment. */
    fun listFeatures(): CompletableFuture<FeatureListFeaturesPageAsync> =
        listFeatures(FeatureListFeaturesParams.none())

    /** @see listFeatures */
    fun listFeatures(
        params: FeatureListFeaturesParams = FeatureListFeaturesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeatureListFeaturesPageAsync>

    /** @see listFeatures */
    fun listFeatures(
        params: FeatureListFeaturesParams = FeatureListFeaturesParams.none()
    ): CompletableFuture<FeatureListFeaturesPageAsync> = listFeatures(params, RequestOptions.none())

    /** @see listFeatures */
    fun listFeatures(
        requestOptions: RequestOptions
    ): CompletableFuture<FeatureListFeaturesPageAsync> =
        listFeatures(FeatureListFeaturesParams.none(), requestOptions)

    /** Retrieves a feature by its unique identifier. */
    fun retrieveFeature(id: String): CompletableFuture<FeatureRetrieveFeatureResponse> =
        retrieveFeature(id, FeatureRetrieveFeatureParams.none())

    /** @see retrieveFeature */
    fun retrieveFeature(
        id: String,
        params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeatureRetrieveFeatureResponse> =
        retrieveFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveFeature */
    fun retrieveFeature(
        id: String,
        params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
    ): CompletableFuture<FeatureRetrieveFeatureResponse> =
        retrieveFeature(id, params, RequestOptions.none())

    /** @see retrieveFeature */
    fun retrieveFeature(
        params: FeatureRetrieveFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeatureRetrieveFeatureResponse>

    /** @see retrieveFeature */
    fun retrieveFeature(
        params: FeatureRetrieveFeatureParams
    ): CompletableFuture<FeatureRetrieveFeatureResponse> =
        retrieveFeature(params, RequestOptions.none())

    /** @see retrieveFeature */
    fun retrieveFeature(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeatureRetrieveFeatureResponse> =
        retrieveFeature(id, FeatureRetrieveFeatureParams.none(), requestOptions)

    /** Restores an archived feature, allowing it to be used in entitlements again. */
    fun unarchiveFeature(id: String): CompletableFuture<FeatureUnarchiveFeatureResponse> =
        unarchiveFeature(id, FeatureUnarchiveFeatureParams.none())

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        id: String,
        params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeatureUnarchiveFeatureResponse> =
        unarchiveFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        id: String,
        params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
    ): CompletableFuture<FeatureUnarchiveFeatureResponse> =
        unarchiveFeature(id, params, RequestOptions.none())

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        params: FeatureUnarchiveFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeatureUnarchiveFeatureResponse>

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        params: FeatureUnarchiveFeatureParams
    ): CompletableFuture<FeatureUnarchiveFeatureResponse> =
        unarchiveFeature(params, RequestOptions.none())

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeatureUnarchiveFeatureResponse> =
        unarchiveFeature(id, FeatureUnarchiveFeatureParams.none(), requestOptions)

    /**
     * Updates an existing feature's properties such as display name, description, and
     * configuration.
     */
    fun updateFeature(id: String): CompletableFuture<FeatureUpdateFeatureResponse> =
        updateFeature(id, FeatureUpdateFeatureParams.none())

    /** @see updateFeature */
    fun updateFeature(
        id: String,
        params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeatureUpdateFeatureResponse> =
        updateFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateFeature */
    fun updateFeature(
        id: String,
        params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
    ): CompletableFuture<FeatureUpdateFeatureResponse> =
        updateFeature(id, params, RequestOptions.none())

    /** @see updateFeature */
    fun updateFeature(
        params: FeatureUpdateFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeatureUpdateFeatureResponse>

    /** @see updateFeature */
    fun updateFeature(
        params: FeatureUpdateFeatureParams
    ): CompletableFuture<FeatureUpdateFeatureResponse> =
        updateFeature(params, RequestOptions.none())

    /** @see updateFeature */
    fun updateFeature(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeatureUpdateFeatureResponse> =
        updateFeature(id, FeatureUpdateFeatureParams.none(), requestOptions)

    /**
     * A view of [FeatureServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeatureServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/features/{id}/archive`, but is otherwise
         * the same as [FeatureServiceAsync.archiveFeature].
         */
        fun archiveFeature(
            id: String
        ): CompletableFuture<HttpResponseFor<FeatureArchiveFeatureResponse>> =
            archiveFeature(id, FeatureArchiveFeatureParams.none())

        /** @see archiveFeature */
        fun archiveFeature(
            id: String,
            params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeatureArchiveFeatureResponse>> =
            archiveFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see archiveFeature */
        fun archiveFeature(
            id: String,
            params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
        ): CompletableFuture<HttpResponseFor<FeatureArchiveFeatureResponse>> =
            archiveFeature(id, params, RequestOptions.none())

        /** @see archiveFeature */
        fun archiveFeature(
            params: FeatureArchiveFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeatureArchiveFeatureResponse>>

        /** @see archiveFeature */
        fun archiveFeature(
            params: FeatureArchiveFeatureParams
        ): CompletableFuture<HttpResponseFor<FeatureArchiveFeatureResponse>> =
            archiveFeature(params, RequestOptions.none())

        /** @see archiveFeature */
        fun archiveFeature(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeatureArchiveFeatureResponse>> =
            archiveFeature(id, FeatureArchiveFeatureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/features`, but is otherwise the same as
         * [FeatureServiceAsync.createFeature].
         */
        fun createFeature(
            params: FeatureCreateFeatureParams
        ): CompletableFuture<HttpResponseFor<FeatureCreateFeatureResponse>> =
            createFeature(params, RequestOptions.none())

        /** @see createFeature */
        fun createFeature(
            params: FeatureCreateFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeatureCreateFeatureResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/features`, but is otherwise the same as
         * [FeatureServiceAsync.listFeatures].
         */
        fun listFeatures(): CompletableFuture<HttpResponseFor<FeatureListFeaturesPageAsync>> =
            listFeatures(FeatureListFeaturesParams.none())

        /** @see listFeatures */
        fun listFeatures(
            params: FeatureListFeaturesParams = FeatureListFeaturesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeatureListFeaturesPageAsync>>

        /** @see listFeatures */
        fun listFeatures(
            params: FeatureListFeaturesParams = FeatureListFeaturesParams.none()
        ): CompletableFuture<HttpResponseFor<FeatureListFeaturesPageAsync>> =
            listFeatures(params, RequestOptions.none())

        /** @see listFeatures */
        fun listFeatures(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FeatureListFeaturesPageAsync>> =
            listFeatures(FeatureListFeaturesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/features/{id}`, but is otherwise the same as
         * [FeatureServiceAsync.retrieveFeature].
         */
        fun retrieveFeature(
            id: String
        ): CompletableFuture<HttpResponseFor<FeatureRetrieveFeatureResponse>> =
            retrieveFeature(id, FeatureRetrieveFeatureParams.none())

        /** @see retrieveFeature */
        fun retrieveFeature(
            id: String,
            params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeatureRetrieveFeatureResponse>> =
            retrieveFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveFeature */
        fun retrieveFeature(
            id: String,
            params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
        ): CompletableFuture<HttpResponseFor<FeatureRetrieveFeatureResponse>> =
            retrieveFeature(id, params, RequestOptions.none())

        /** @see retrieveFeature */
        fun retrieveFeature(
            params: FeatureRetrieveFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeatureRetrieveFeatureResponse>>

        /** @see retrieveFeature */
        fun retrieveFeature(
            params: FeatureRetrieveFeatureParams
        ): CompletableFuture<HttpResponseFor<FeatureRetrieveFeatureResponse>> =
            retrieveFeature(params, RequestOptions.none())

        /** @see retrieveFeature */
        fun retrieveFeature(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeatureRetrieveFeatureResponse>> =
            retrieveFeature(id, FeatureRetrieveFeatureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/features/{id}/unarchive`, but is otherwise
         * the same as [FeatureServiceAsync.unarchiveFeature].
         */
        fun unarchiveFeature(
            id: String
        ): CompletableFuture<HttpResponseFor<FeatureUnarchiveFeatureResponse>> =
            unarchiveFeature(id, FeatureUnarchiveFeatureParams.none())

        /** @see unarchiveFeature */
        fun unarchiveFeature(
            id: String,
            params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeatureUnarchiveFeatureResponse>> =
            unarchiveFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchiveFeature */
        fun unarchiveFeature(
            id: String,
            params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
        ): CompletableFuture<HttpResponseFor<FeatureUnarchiveFeatureResponse>> =
            unarchiveFeature(id, params, RequestOptions.none())

        /** @see unarchiveFeature */
        fun unarchiveFeature(
            params: FeatureUnarchiveFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeatureUnarchiveFeatureResponse>>

        /** @see unarchiveFeature */
        fun unarchiveFeature(
            params: FeatureUnarchiveFeatureParams
        ): CompletableFuture<HttpResponseFor<FeatureUnarchiveFeatureResponse>> =
            unarchiveFeature(params, RequestOptions.none())

        /** @see unarchiveFeature */
        fun unarchiveFeature(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeatureUnarchiveFeatureResponse>> =
            unarchiveFeature(id, FeatureUnarchiveFeatureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/features/{id}`, but is otherwise the same
         * as [FeatureServiceAsync.updateFeature].
         */
        fun updateFeature(
            id: String
        ): CompletableFuture<HttpResponseFor<FeatureUpdateFeatureResponse>> =
            updateFeature(id, FeatureUpdateFeatureParams.none())

        /** @see updateFeature */
        fun updateFeature(
            id: String,
            params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeatureUpdateFeatureResponse>> =
            updateFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateFeature */
        fun updateFeature(
            id: String,
            params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
        ): CompletableFuture<HttpResponseFor<FeatureUpdateFeatureResponse>> =
            updateFeature(id, params, RequestOptions.none())

        /** @see updateFeature */
        fun updateFeature(
            params: FeatureUpdateFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeatureUpdateFeatureResponse>>

        /** @see updateFeature */
        fun updateFeature(
            params: FeatureUpdateFeatureParams
        ): CompletableFuture<HttpResponseFor<FeatureUpdateFeatureResponse>> =
            updateFeature(params, RequestOptions.none())

        /** @see updateFeature */
        fun updateFeature(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeatureUpdateFeatureResponse>> =
            updateFeature(id, FeatureUpdateFeatureParams.none(), requestOptions)
    }
}
