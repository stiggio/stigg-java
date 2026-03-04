// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.features.Feature
import io.stigg.models.v1.features.FeatureArchiveFeatureParams
import io.stigg.models.v1.features.FeatureCreateFeatureParams
import io.stigg.models.v1.features.FeatureListFeaturesPage
import io.stigg.models.v1.features.FeatureListFeaturesParams
import io.stigg.models.v1.features.FeatureRetrieveFeatureParams
import io.stigg.models.v1.features.FeatureUnarchiveFeatureParams
import io.stigg.models.v1.features.FeatureUpdateFeatureParams
import java.util.function.Consumer

/** Operations related to features */
interface FeatureService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureService

    /** Archives a feature, preventing it from being used in new entitlements. */
    fun archiveFeature(id: String): Feature = archiveFeature(id, FeatureArchiveFeatureParams.none())

    /** @see archiveFeature */
    fun archiveFeature(
        id: String,
        params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Feature = archiveFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see archiveFeature */
    fun archiveFeature(
        id: String,
        params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
    ): Feature = archiveFeature(id, params, RequestOptions.none())

    /** @see archiveFeature */
    fun archiveFeature(
        params: FeatureArchiveFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Feature

    /** @see archiveFeature */
    fun archiveFeature(params: FeatureArchiveFeatureParams): Feature =
        archiveFeature(params, RequestOptions.none())

    /** @see archiveFeature */
    fun archiveFeature(id: String, requestOptions: RequestOptions): Feature =
        archiveFeature(id, FeatureArchiveFeatureParams.none(), requestOptions)

    /** Creates a new feature with the specified type, metering, and configuration. */
    fun createFeature(params: FeatureCreateFeatureParams): Feature =
        createFeature(params, RequestOptions.none())

    /** @see createFeature */
    fun createFeature(
        params: FeatureCreateFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Feature

    /** Retrieves a paginated list of features in the environment. */
    fun listFeatures(): FeatureListFeaturesPage = listFeatures(FeatureListFeaturesParams.none())

    /** @see listFeatures */
    fun listFeatures(
        params: FeatureListFeaturesParams = FeatureListFeaturesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeatureListFeaturesPage

    /** @see listFeatures */
    fun listFeatures(
        params: FeatureListFeaturesParams = FeatureListFeaturesParams.none()
    ): FeatureListFeaturesPage = listFeatures(params, RequestOptions.none())

    /** @see listFeatures */
    fun listFeatures(requestOptions: RequestOptions): FeatureListFeaturesPage =
        listFeatures(FeatureListFeaturesParams.none(), requestOptions)

    /** Retrieves a feature by its unique identifier. */
    fun retrieveFeature(id: String): Feature =
        retrieveFeature(id, FeatureRetrieveFeatureParams.none())

    /** @see retrieveFeature */
    fun retrieveFeature(
        id: String,
        params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Feature = retrieveFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveFeature */
    fun retrieveFeature(
        id: String,
        params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
    ): Feature = retrieveFeature(id, params, RequestOptions.none())

    /** @see retrieveFeature */
    fun retrieveFeature(
        params: FeatureRetrieveFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Feature

    /** @see retrieveFeature */
    fun retrieveFeature(params: FeatureRetrieveFeatureParams): Feature =
        retrieveFeature(params, RequestOptions.none())

    /** @see retrieveFeature */
    fun retrieveFeature(id: String, requestOptions: RequestOptions): Feature =
        retrieveFeature(id, FeatureRetrieveFeatureParams.none(), requestOptions)

    /** Restores an archived feature, allowing it to be used in entitlements again. */
    fun unarchiveFeature(id: String): Feature =
        unarchiveFeature(id, FeatureUnarchiveFeatureParams.none())

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        id: String,
        params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Feature = unarchiveFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        id: String,
        params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
    ): Feature = unarchiveFeature(id, params, RequestOptions.none())

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        params: FeatureUnarchiveFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Feature

    /** @see unarchiveFeature */
    fun unarchiveFeature(params: FeatureUnarchiveFeatureParams): Feature =
        unarchiveFeature(params, RequestOptions.none())

    /** @see unarchiveFeature */
    fun unarchiveFeature(id: String, requestOptions: RequestOptions): Feature =
        unarchiveFeature(id, FeatureUnarchiveFeatureParams.none(), requestOptions)

    /**
     * Updates an existing feature's properties such as display name, description, and
     * configuration.
     */
    fun updateFeature(id: String): Feature = updateFeature(id, FeatureUpdateFeatureParams.none())

    /** @see updateFeature */
    fun updateFeature(
        id: String,
        params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Feature = updateFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateFeature */
    fun updateFeature(
        id: String,
        params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
    ): Feature = updateFeature(id, params, RequestOptions.none())

    /** @see updateFeature */
    fun updateFeature(
        params: FeatureUpdateFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Feature

    /** @see updateFeature */
    fun updateFeature(params: FeatureUpdateFeatureParams): Feature =
        updateFeature(params, RequestOptions.none())

    /** @see updateFeature */
    fun updateFeature(id: String, requestOptions: RequestOptions): Feature =
        updateFeature(id, FeatureUpdateFeatureParams.none(), requestOptions)

    /** A view of [FeatureService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/features/{id}/archive`, but is otherwise
         * the same as [FeatureService.archiveFeature].
         */
        @MustBeClosed
        fun archiveFeature(id: String): HttpResponseFor<Feature> =
            archiveFeature(id, FeatureArchiveFeatureParams.none())

        /** @see archiveFeature */
        @MustBeClosed
        fun archiveFeature(
            id: String,
            params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Feature> =
            archiveFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see archiveFeature */
        @MustBeClosed
        fun archiveFeature(
            id: String,
            params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
        ): HttpResponseFor<Feature> = archiveFeature(id, params, RequestOptions.none())

        /** @see archiveFeature */
        @MustBeClosed
        fun archiveFeature(
            params: FeatureArchiveFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Feature>

        /** @see archiveFeature */
        @MustBeClosed
        fun archiveFeature(params: FeatureArchiveFeatureParams): HttpResponseFor<Feature> =
            archiveFeature(params, RequestOptions.none())

        /** @see archiveFeature */
        @MustBeClosed
        fun archiveFeature(id: String, requestOptions: RequestOptions): HttpResponseFor<Feature> =
            archiveFeature(id, FeatureArchiveFeatureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/features`, but is otherwise the same as
         * [FeatureService.createFeature].
         */
        @MustBeClosed
        fun createFeature(params: FeatureCreateFeatureParams): HttpResponseFor<Feature> =
            createFeature(params, RequestOptions.none())

        /** @see createFeature */
        @MustBeClosed
        fun createFeature(
            params: FeatureCreateFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Feature>

        /**
         * Returns a raw HTTP response for `get /api/v1/features`, but is otherwise the same as
         * [FeatureService.listFeatures].
         */
        @MustBeClosed
        fun listFeatures(): HttpResponseFor<FeatureListFeaturesPage> =
            listFeatures(FeatureListFeaturesParams.none())

        /** @see listFeatures */
        @MustBeClosed
        fun listFeatures(
            params: FeatureListFeaturesParams = FeatureListFeaturesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeatureListFeaturesPage>

        /** @see listFeatures */
        @MustBeClosed
        fun listFeatures(
            params: FeatureListFeaturesParams = FeatureListFeaturesParams.none()
        ): HttpResponseFor<FeatureListFeaturesPage> = listFeatures(params, RequestOptions.none())

        /** @see listFeatures */
        @MustBeClosed
        fun listFeatures(requestOptions: RequestOptions): HttpResponseFor<FeatureListFeaturesPage> =
            listFeatures(FeatureListFeaturesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/features/{id}`, but is otherwise the same as
         * [FeatureService.retrieveFeature].
         */
        @MustBeClosed
        fun retrieveFeature(id: String): HttpResponseFor<Feature> =
            retrieveFeature(id, FeatureRetrieveFeatureParams.none())

        /** @see retrieveFeature */
        @MustBeClosed
        fun retrieveFeature(
            id: String,
            params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Feature> =
            retrieveFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveFeature */
        @MustBeClosed
        fun retrieveFeature(
            id: String,
            params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
        ): HttpResponseFor<Feature> = retrieveFeature(id, params, RequestOptions.none())

        /** @see retrieveFeature */
        @MustBeClosed
        fun retrieveFeature(
            params: FeatureRetrieveFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Feature>

        /** @see retrieveFeature */
        @MustBeClosed
        fun retrieveFeature(params: FeatureRetrieveFeatureParams): HttpResponseFor<Feature> =
            retrieveFeature(params, RequestOptions.none())

        /** @see retrieveFeature */
        @MustBeClosed
        fun retrieveFeature(id: String, requestOptions: RequestOptions): HttpResponseFor<Feature> =
            retrieveFeature(id, FeatureRetrieveFeatureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/features/{id}/unarchive`, but is otherwise
         * the same as [FeatureService.unarchiveFeature].
         */
        @MustBeClosed
        fun unarchiveFeature(id: String): HttpResponseFor<Feature> =
            unarchiveFeature(id, FeatureUnarchiveFeatureParams.none())

        /** @see unarchiveFeature */
        @MustBeClosed
        fun unarchiveFeature(
            id: String,
            params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Feature> =
            unarchiveFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchiveFeature */
        @MustBeClosed
        fun unarchiveFeature(
            id: String,
            params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
        ): HttpResponseFor<Feature> = unarchiveFeature(id, params, RequestOptions.none())

        /** @see unarchiveFeature */
        @MustBeClosed
        fun unarchiveFeature(
            params: FeatureUnarchiveFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Feature>

        /** @see unarchiveFeature */
        @MustBeClosed
        fun unarchiveFeature(params: FeatureUnarchiveFeatureParams): HttpResponseFor<Feature> =
            unarchiveFeature(params, RequestOptions.none())

        /** @see unarchiveFeature */
        @MustBeClosed
        fun unarchiveFeature(id: String, requestOptions: RequestOptions): HttpResponseFor<Feature> =
            unarchiveFeature(id, FeatureUnarchiveFeatureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/features/{id}`, but is otherwise the same
         * as [FeatureService.updateFeature].
         */
        @MustBeClosed
        fun updateFeature(id: String): HttpResponseFor<Feature> =
            updateFeature(id, FeatureUpdateFeatureParams.none())

        /** @see updateFeature */
        @MustBeClosed
        fun updateFeature(
            id: String,
            params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Feature> =
            updateFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateFeature */
        @MustBeClosed
        fun updateFeature(
            id: String,
            params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
        ): HttpResponseFor<Feature> = updateFeature(id, params, RequestOptions.none())

        /** @see updateFeature */
        @MustBeClosed
        fun updateFeature(
            params: FeatureUpdateFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Feature>

        /** @see updateFeature */
        @MustBeClosed
        fun updateFeature(params: FeatureUpdateFeatureParams): HttpResponseFor<Feature> =
            updateFeature(params, RequestOptions.none())

        /** @see updateFeature */
        @MustBeClosed
        fun updateFeature(id: String, requestOptions: RequestOptions): HttpResponseFor<Feature> =
            updateFeature(id, FeatureUpdateFeatureParams.none(), requestOptions)
    }
}
