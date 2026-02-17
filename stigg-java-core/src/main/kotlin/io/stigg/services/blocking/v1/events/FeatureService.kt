// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.features.FeatureArchiveFeatureParams
import io.stigg.models.v1.events.features.FeatureArchiveFeatureResponse
import io.stigg.models.v1.events.features.FeatureCreateFeatureParams
import io.stigg.models.v1.events.features.FeatureCreateFeatureResponse
import io.stigg.models.v1.events.features.FeatureListFeaturesPage
import io.stigg.models.v1.events.features.FeatureListFeaturesParams
import io.stigg.models.v1.events.features.FeatureRetrieveFeatureParams
import io.stigg.models.v1.events.features.FeatureRetrieveFeatureResponse
import io.stigg.models.v1.events.features.FeatureUnarchiveFeatureParams
import io.stigg.models.v1.events.features.FeatureUnarchiveFeatureResponse
import io.stigg.models.v1.events.features.FeatureUpdateFeatureParams
import io.stigg.models.v1.events.features.FeatureUpdateFeatureResponse
import java.util.function.Consumer

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
    fun archiveFeature(id: String): FeatureArchiveFeatureResponse =
        archiveFeature(id, FeatureArchiveFeatureParams.none())

    /** @see archiveFeature */
    fun archiveFeature(
        id: String,
        params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeatureArchiveFeatureResponse =
        archiveFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see archiveFeature */
    fun archiveFeature(
        id: String,
        params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
    ): FeatureArchiveFeatureResponse = archiveFeature(id, params, RequestOptions.none())

    /** @see archiveFeature */
    fun archiveFeature(
        params: FeatureArchiveFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeatureArchiveFeatureResponse

    /** @see archiveFeature */
    fun archiveFeature(params: FeatureArchiveFeatureParams): FeatureArchiveFeatureResponse =
        archiveFeature(params, RequestOptions.none())

    /** @see archiveFeature */
    fun archiveFeature(id: String, requestOptions: RequestOptions): FeatureArchiveFeatureResponse =
        archiveFeature(id, FeatureArchiveFeatureParams.none(), requestOptions)

    /** Creates a new feature with the specified type, metering, and configuration. */
    fun createFeature(params: FeatureCreateFeatureParams): FeatureCreateFeatureResponse =
        createFeature(params, RequestOptions.none())

    /** @see createFeature */
    fun createFeature(
        params: FeatureCreateFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeatureCreateFeatureResponse

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
    fun retrieveFeature(id: String): FeatureRetrieveFeatureResponse =
        retrieveFeature(id, FeatureRetrieveFeatureParams.none())

    /** @see retrieveFeature */
    fun retrieveFeature(
        id: String,
        params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeatureRetrieveFeatureResponse =
        retrieveFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveFeature */
    fun retrieveFeature(
        id: String,
        params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
    ): FeatureRetrieveFeatureResponse = retrieveFeature(id, params, RequestOptions.none())

    /** @see retrieveFeature */
    fun retrieveFeature(
        params: FeatureRetrieveFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeatureRetrieveFeatureResponse

    /** @see retrieveFeature */
    fun retrieveFeature(params: FeatureRetrieveFeatureParams): FeatureRetrieveFeatureResponse =
        retrieveFeature(params, RequestOptions.none())

    /** @see retrieveFeature */
    fun retrieveFeature(
        id: String,
        requestOptions: RequestOptions,
    ): FeatureRetrieveFeatureResponse =
        retrieveFeature(id, FeatureRetrieveFeatureParams.none(), requestOptions)

    /** Restores an archived feature, allowing it to be used in entitlements again. */
    fun unarchiveFeature(id: String): FeatureUnarchiveFeatureResponse =
        unarchiveFeature(id, FeatureUnarchiveFeatureParams.none())

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        id: String,
        params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeatureUnarchiveFeatureResponse =
        unarchiveFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        id: String,
        params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
    ): FeatureUnarchiveFeatureResponse = unarchiveFeature(id, params, RequestOptions.none())

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        params: FeatureUnarchiveFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeatureUnarchiveFeatureResponse

    /** @see unarchiveFeature */
    fun unarchiveFeature(params: FeatureUnarchiveFeatureParams): FeatureUnarchiveFeatureResponse =
        unarchiveFeature(params, RequestOptions.none())

    /** @see unarchiveFeature */
    fun unarchiveFeature(
        id: String,
        requestOptions: RequestOptions,
    ): FeatureUnarchiveFeatureResponse =
        unarchiveFeature(id, FeatureUnarchiveFeatureParams.none(), requestOptions)

    /**
     * Updates an existing feature's properties such as display name, description, and
     * configuration.
     */
    fun updateFeature(id: String): FeatureUpdateFeatureResponse =
        updateFeature(id, FeatureUpdateFeatureParams.none())

    /** @see updateFeature */
    fun updateFeature(
        id: String,
        params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeatureUpdateFeatureResponse =
        updateFeature(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateFeature */
    fun updateFeature(
        id: String,
        params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
    ): FeatureUpdateFeatureResponse = updateFeature(id, params, RequestOptions.none())

    /** @see updateFeature */
    fun updateFeature(
        params: FeatureUpdateFeatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeatureUpdateFeatureResponse

    /** @see updateFeature */
    fun updateFeature(params: FeatureUpdateFeatureParams): FeatureUpdateFeatureResponse =
        updateFeature(params, RequestOptions.none())

    /** @see updateFeature */
    fun updateFeature(id: String, requestOptions: RequestOptions): FeatureUpdateFeatureResponse =
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
        fun archiveFeature(id: String): HttpResponseFor<FeatureArchiveFeatureResponse> =
            archiveFeature(id, FeatureArchiveFeatureParams.none())

        /** @see archiveFeature */
        @MustBeClosed
        fun archiveFeature(
            id: String,
            params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeatureArchiveFeatureResponse> =
            archiveFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see archiveFeature */
        @MustBeClosed
        fun archiveFeature(
            id: String,
            params: FeatureArchiveFeatureParams = FeatureArchiveFeatureParams.none(),
        ): HttpResponseFor<FeatureArchiveFeatureResponse> =
            archiveFeature(id, params, RequestOptions.none())

        /** @see archiveFeature */
        @MustBeClosed
        fun archiveFeature(
            params: FeatureArchiveFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeatureArchiveFeatureResponse>

        /** @see archiveFeature */
        @MustBeClosed
        fun archiveFeature(
            params: FeatureArchiveFeatureParams
        ): HttpResponseFor<FeatureArchiveFeatureResponse> =
            archiveFeature(params, RequestOptions.none())

        /** @see archiveFeature */
        @MustBeClosed
        fun archiveFeature(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeatureArchiveFeatureResponse> =
            archiveFeature(id, FeatureArchiveFeatureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/features`, but is otherwise the same as
         * [FeatureService.createFeature].
         */
        @MustBeClosed
        fun createFeature(
            params: FeatureCreateFeatureParams
        ): HttpResponseFor<FeatureCreateFeatureResponse> =
            createFeature(params, RequestOptions.none())

        /** @see createFeature */
        @MustBeClosed
        fun createFeature(
            params: FeatureCreateFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeatureCreateFeatureResponse>

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
        fun retrieveFeature(id: String): HttpResponseFor<FeatureRetrieveFeatureResponse> =
            retrieveFeature(id, FeatureRetrieveFeatureParams.none())

        /** @see retrieveFeature */
        @MustBeClosed
        fun retrieveFeature(
            id: String,
            params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeatureRetrieveFeatureResponse> =
            retrieveFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveFeature */
        @MustBeClosed
        fun retrieveFeature(
            id: String,
            params: FeatureRetrieveFeatureParams = FeatureRetrieveFeatureParams.none(),
        ): HttpResponseFor<FeatureRetrieveFeatureResponse> =
            retrieveFeature(id, params, RequestOptions.none())

        /** @see retrieveFeature */
        @MustBeClosed
        fun retrieveFeature(
            params: FeatureRetrieveFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeatureRetrieveFeatureResponse>

        /** @see retrieveFeature */
        @MustBeClosed
        fun retrieveFeature(
            params: FeatureRetrieveFeatureParams
        ): HttpResponseFor<FeatureRetrieveFeatureResponse> =
            retrieveFeature(params, RequestOptions.none())

        /** @see retrieveFeature */
        @MustBeClosed
        fun retrieveFeature(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeatureRetrieveFeatureResponse> =
            retrieveFeature(id, FeatureRetrieveFeatureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/features/{id}/unarchive`, but is otherwise
         * the same as [FeatureService.unarchiveFeature].
         */
        @MustBeClosed
        fun unarchiveFeature(id: String): HttpResponseFor<FeatureUnarchiveFeatureResponse> =
            unarchiveFeature(id, FeatureUnarchiveFeatureParams.none())

        /** @see unarchiveFeature */
        @MustBeClosed
        fun unarchiveFeature(
            id: String,
            params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeatureUnarchiveFeatureResponse> =
            unarchiveFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchiveFeature */
        @MustBeClosed
        fun unarchiveFeature(
            id: String,
            params: FeatureUnarchiveFeatureParams = FeatureUnarchiveFeatureParams.none(),
        ): HttpResponseFor<FeatureUnarchiveFeatureResponse> =
            unarchiveFeature(id, params, RequestOptions.none())

        /** @see unarchiveFeature */
        @MustBeClosed
        fun unarchiveFeature(
            params: FeatureUnarchiveFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeatureUnarchiveFeatureResponse>

        /** @see unarchiveFeature */
        @MustBeClosed
        fun unarchiveFeature(
            params: FeatureUnarchiveFeatureParams
        ): HttpResponseFor<FeatureUnarchiveFeatureResponse> =
            unarchiveFeature(params, RequestOptions.none())

        /** @see unarchiveFeature */
        @MustBeClosed
        fun unarchiveFeature(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeatureUnarchiveFeatureResponse> =
            unarchiveFeature(id, FeatureUnarchiveFeatureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/features/{id}`, but is otherwise the same
         * as [FeatureService.updateFeature].
         */
        @MustBeClosed
        fun updateFeature(id: String): HttpResponseFor<FeatureUpdateFeatureResponse> =
            updateFeature(id, FeatureUpdateFeatureParams.none())

        /** @see updateFeature */
        @MustBeClosed
        fun updateFeature(
            id: String,
            params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeatureUpdateFeatureResponse> =
            updateFeature(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateFeature */
        @MustBeClosed
        fun updateFeature(
            id: String,
            params: FeatureUpdateFeatureParams = FeatureUpdateFeatureParams.none(),
        ): HttpResponseFor<FeatureUpdateFeatureResponse> =
            updateFeature(id, params, RequestOptions.none())

        /** @see updateFeature */
        @MustBeClosed
        fun updateFeature(
            params: FeatureUpdateFeatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeatureUpdateFeatureResponse>

        /** @see updateFeature */
        @MustBeClosed
        fun updateFeature(
            params: FeatureUpdateFeatureParams
        ): HttpResponseFor<FeatureUpdateFeatureResponse> =
            updateFeature(params, RequestOptions.none())

        /** @see updateFeature */
        @MustBeClosed
        fun updateFeature(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeatureUpdateFeatureResponse> =
            updateFeature(id, FeatureUpdateFeatureParams.none(), requestOptions)
    }
}
