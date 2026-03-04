// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.features.Feature
import io.stigg.models.v1.features.FeatureArchiveFeatureParams
import io.stigg.models.v1.features.FeatureCreateFeatureParams
import io.stigg.models.v1.features.FeatureListFeaturesPageAsync
import io.stigg.models.v1.features.FeatureListFeaturesParams
import io.stigg.models.v1.features.FeatureRetrieveFeatureParams
import io.stigg.models.v1.features.FeatureUnarchiveFeatureParams
import io.stigg.models.v1.features.FeatureUpdateFeatureParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations related to features */
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
    fun archiveFeature(id: String): CompletableFuture<Feature> =
        archiveFeature(id, FeatureArchiveFeatureParams.none())

    /** @see archiveFeature */
    fun archiveFeature(
        id: String,
        params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Feature> =
        archiveFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see archiveFeature */
    fun archiveFeature(
        id: String,
        params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
    ): CompletableFuture<Feature> = archiveFeature(id, params, RequestOptions.none())

    /** @see archiveFeature */
    fun archiveFeature(
        params: FeatureArchiveFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Feature>

    /** @see archiveFeature */
    fun archiveFeature(params: FeatureArchiveFeatureParams): CompletableFuture<Feature> =
        archiveFeature(params, RequestOptions.none())

    /** @see archiveFeature */
    fun archiveFeature(id: String, requestOptions: RequestOptions): CompletableFuture<Feature> =
        archiveFeature(id, FeatureArchiveFeatureParams.none(), requestOptions)

    /** Creates a new feature with the specified type, metering, and configuration. */
    fun createFeature(params: FeatureCreateFeatureParams): CompletableFuture<Feature> =
        createFeature(params, RequestOptions.none())

    /** @see createFeature */
    fun createFeature(
        params: FeatureCreateFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Feature>

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
    fun retrieveFeature(id: String): CompletableFuture<Feature> =
        retrieveFeature(id, FeatureRetrieveFeatureParams.none())

    /** @see retrieveFeature */
    fun retrieveFeature(
        id: String,
        params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Feature> =
        retrieveFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveFeature */
    fun retrieveFeature(
        id: String,
        params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
    ): CompletableFuture<Feature> = retrieveFeature(id, params, RequestOptions.none())

    /** @see retrieveFeature */
    fun retrieveFeature(
        params: FeatureRetrieveFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Feature>

    /** @see retrieveFeature */
    fun retrieveFeature(params: FeatureRetrieveFeatureParams): CompletableFuture<Feature> =
        retrieveFeature(params, RequestOptions.none())

    /** @see retrieveFeature */
    fun retrieveFeature(id: String, requestOptions: RequestOptions): CompletableFuture<Feature> =
        retrieveFeature(id, FeatureRetrieveFeatureParams.none(), requestOptions)

    /** Restores an archived feature, allowing it to be used in entitlements again. */
    fun unarchiveFeature(id: String): CompletableFuture<Feature> =
        unarchiveFeature(id, FeatureUnarchiveFeatureParams.none())

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        id: String,
        params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Feature> =
        unarchiveFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        id: String,
        params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
    ): CompletableFuture<Feature> = unarchiveFeature(id, params, RequestOptions.none())

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        params: FeatureUnarchiveFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Feature>

    /** @see unarchiveFeature */
    fun unarchiveFeature(params: FeatureUnarchiveFeatureParams): CompletableFuture<Feature> =
        unarchiveFeature(params, RequestOptions.none())

    /** @see unarchiveFeature */
    fun unarchiveFeature(id: String, requestOptions: RequestOptions): CompletableFuture<Feature> =
        unarchiveFeature(id, FeatureUnarchiveFeatureParams.none(), requestOptions)

    /**
     * Updates an existing feature's properties such as display name, description, and
     * configuration.
     */
    fun updateFeature(id: String): CompletableFuture<Feature> =
        updateFeature(id, FeatureUpdateFeatureParams.none())

    /** @see updateFeature */
    fun updateFeature(
        id: String,
        params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Feature> = updateFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateFeature */
    fun updateFeature(
        id: String,
        params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
    ): CompletableFuture<Feature> = updateFeature(id, params, RequestOptions.none())

    /** @see updateFeature */
    fun updateFeature(
        params: FeatureUpdateFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Feature>

    /** @see updateFeature */
    fun updateFeature(params: FeatureUpdateFeatureParams): CompletableFuture<Feature> =
        updateFeature(params, RequestOptions.none())

    /** @see updateFeature */
    fun updateFeature(id: String, requestOptions: RequestOptions): CompletableFuture<Feature> =
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
        fun archiveFeature(id: String): CompletableFuture<HttpResponseFor<Feature>> =
            archiveFeature(id, FeatureArchiveFeatureParams.none())

        /** @see archiveFeature */
        fun archiveFeature(
            id: String,
            params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Feature>> =
            archiveFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see archiveFeature */
        fun archiveFeature(
            id: String,
            params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
        ): CompletableFuture<HttpResponseFor<Feature>> =
            archiveFeature(id, params, RequestOptions.none())

        /** @see archiveFeature */
        fun archiveFeature(
            params: FeatureArchiveFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Feature>>

        /** @see archiveFeature */
        fun archiveFeature(
            params: FeatureArchiveFeatureParams
        ): CompletableFuture<HttpResponseFor<Feature>> =
            archiveFeature(params, RequestOptions.none())

        /** @see archiveFeature */
        fun archiveFeature(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Feature>> =
            archiveFeature(id, FeatureArchiveFeatureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/features`, but is otherwise the same as
         * [FeatureServiceAsync.createFeature].
         */
        fun createFeature(
            params: FeatureCreateFeatureParams
        ): CompletableFuture<HttpResponseFor<Feature>> =
            createFeature(params, RequestOptions.none())

        /** @see createFeature */
        fun createFeature(
            params: FeatureCreateFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Feature>>

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
        fun retrieveFeature(id: String): CompletableFuture<HttpResponseFor<Feature>> =
            retrieveFeature(id, FeatureRetrieveFeatureParams.none())

        /** @see retrieveFeature */
        fun retrieveFeature(
            id: String,
            params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Feature>> =
            retrieveFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveFeature */
        fun retrieveFeature(
            id: String,
            params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
        ): CompletableFuture<HttpResponseFor<Feature>> =
            retrieveFeature(id, params, RequestOptions.none())

        /** @see retrieveFeature */
        fun retrieveFeature(
            params: FeatureRetrieveFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Feature>>

        /** @see retrieveFeature */
        fun retrieveFeature(
            params: FeatureRetrieveFeatureParams
        ): CompletableFuture<HttpResponseFor<Feature>> =
            retrieveFeature(params, RequestOptions.none())

        /** @see retrieveFeature */
        fun retrieveFeature(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Feature>> =
            retrieveFeature(id, FeatureRetrieveFeatureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/features/{id}/unarchive`, but is otherwise
         * the same as [FeatureServiceAsync.unarchiveFeature].
         */
        fun unarchiveFeature(id: String): CompletableFuture<HttpResponseFor<Feature>> =
            unarchiveFeature(id, FeatureUnarchiveFeatureParams.none())

        /** @see unarchiveFeature */
        fun unarchiveFeature(
            id: String,
            params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Feature>> =
            unarchiveFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchiveFeature */
        fun unarchiveFeature(
            id: String,
            params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
        ): CompletableFuture<HttpResponseFor<Feature>> =
            unarchiveFeature(id, params, RequestOptions.none())

        /** @see unarchiveFeature */
        fun unarchiveFeature(
            params: FeatureUnarchiveFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Feature>>

        /** @see unarchiveFeature */
        fun unarchiveFeature(
            params: FeatureUnarchiveFeatureParams
        ): CompletableFuture<HttpResponseFor<Feature>> =
            unarchiveFeature(params, RequestOptions.none())

        /** @see unarchiveFeature */
        fun unarchiveFeature(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Feature>> =
            unarchiveFeature(id, FeatureUnarchiveFeatureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/features/{id}`, but is otherwise the same
         * as [FeatureServiceAsync.updateFeature].
         */
        fun updateFeature(id: String): CompletableFuture<HttpResponseFor<Feature>> =
            updateFeature(id, FeatureUpdateFeatureParams.none())

        /** @see updateFeature */
        fun updateFeature(
            id: String,
            params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Feature>> =
            updateFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateFeature */
        fun updateFeature(
            id: String,
            params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
        ): CompletableFuture<HttpResponseFor<Feature>> =
            updateFeature(id, params, RequestOptions.none())

        /** @see updateFeature */
        fun updateFeature(
            params: FeatureUpdateFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Feature>>

        /** @see updateFeature */
        fun updateFeature(
            params: FeatureUpdateFeatureParams
        ): CompletableFuture<HttpResponseFor<Feature>> =
            updateFeature(params, RequestOptions.none())

        /** @see updateFeature */
        fun updateFeature(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Feature>> =
            updateFeature(id, FeatureUpdateFeatureParams.none(), requestOptions)
    }
}
