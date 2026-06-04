// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.beta

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.beta.entitytypes.EntityTypeListPage
import io.stigg.models.v1.events.beta.entitytypes.EntityTypeListParams
import io.stigg.models.v1.events.beta.entitytypes.EntityTypeUpsertParams
import io.stigg.models.v1.events.beta.entitytypes.EntityTypeUpsertResponse
import java.util.function.Consumer

interface EntityTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityTypeService

    /**
     * Returns a cursor-paginated list of entity types defined in the environment. Entity types are
     * vendor-defined categories of resource that can be governed (e.g. Org, Team, User).
     */
    fun list(): EntityTypeListPage = list(EntityTypeListParams.none())

    /** @see list */
    fun list(
        params: EntityTypeListParams = EntityTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityTypeListPage

    /** @see list */
    fun list(params: EntityTypeListParams = EntityTypeListParams.none()): EntityTypeListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EntityTypeListPage =
        list(EntityTypeListParams.none(), requestOptions)

    /**
     * Batched create-or-update of entity types. Existing types matched by id are updated; new ids
     * are created. Idempotent — re-submitting the same payload converges to the same state.
     */
    fun upsert(params: EntityTypeUpsertParams): EntityTypeUpsertResponse =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: EntityTypeUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityTypeUpsertResponse

    /** A view of [EntityTypeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityTypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1-beta/entity-types`, but is otherwise the
         * same as [EntityTypeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EntityTypeListPage> = list(EntityTypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EntityTypeListParams = EntityTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityTypeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EntityTypeListParams = EntityTypeListParams.none()
        ): HttpResponseFor<EntityTypeListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EntityTypeListPage> =
            list(EntityTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1-beta/entity-types`, but is otherwise the
         * same as [EntityTypeService.upsert].
         */
        @MustBeClosed
        fun upsert(params: EntityTypeUpsertParams): HttpResponseFor<EntityTypeUpsertResponse> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: EntityTypeUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityTypeUpsertResponse>
    }
}
