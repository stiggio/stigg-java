// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.credits

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyArchiveParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyArchiveResponse
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyCreateParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyCreateResponse
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyListAssociatedEntitiesParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyListAssociatedEntitiesResponse
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyListPageAsync
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyListParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyUnarchiveParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyUnarchiveResponse
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyUpdateParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations related to custom currencies */
interface CustomCurrencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomCurrencyServiceAsync

    /** Creates a new custom currency in the environment. */
    fun create(
        params: CustomCurrencyCreateParams
    ): CompletableFuture<CustomCurrencyCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomCurrencyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomCurrencyCreateResponse>

    /** Updates an existing custom currency. Only the supplied fields are modified. */
    fun update(currencyId: String): CompletableFuture<CustomCurrencyUpdateResponse> =
        update(currencyId, CustomCurrencyUpdateParams.none())

    /** @see update */
    fun update(
        currencyId: String,
        params: CustomCurrencyUpdateParams = CustomCurrencyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomCurrencyUpdateResponse> =
        update(params.toBuilder().currencyId(currencyId).build(), requestOptions)

    /** @see update */
    fun update(
        currencyId: String,
        params: CustomCurrencyUpdateParams = CustomCurrencyUpdateParams.none(),
    ): CompletableFuture<CustomCurrencyUpdateResponse> =
        update(currencyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomCurrencyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomCurrencyUpdateResponse>

    /** @see update */
    fun update(
        params: CustomCurrencyUpdateParams
    ): CompletableFuture<CustomCurrencyUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        currencyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomCurrencyUpdateResponse> =
        update(currencyId, CustomCurrencyUpdateParams.none(), requestOptions)

    /**
     * Retrieves a paginated list of custom currencies in the environment. Archived currencies are
     * excluded by default; pass `status=ARCHIVED` (or `status=ACTIVE,ARCHIVED`) to include them.
     */
    fun list(): CompletableFuture<CustomCurrencyListPageAsync> =
        list(CustomCurrencyListParams.none())

    /** @see list */
    fun list(
        params: CustomCurrencyListParams = CustomCurrencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomCurrencyListPageAsync>

    /** @see list */
    fun list(
        params: CustomCurrencyListParams = CustomCurrencyListParams.none()
    ): CompletableFuture<CustomCurrencyListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CustomCurrencyListPageAsync> =
        list(CustomCurrencyListParams.none(), requestOptions)

    /**
     * Archives a custom currency. Fails if the currency is still associated with any active plan or
     * addon — use the associated-entities endpoint first to inspect dependencies.
     */
    fun archive(currencyId: String): CompletableFuture<CustomCurrencyArchiveResponse> =
        archive(currencyId, CustomCurrencyArchiveParams.none())

    /** @see archive */
    fun archive(
        currencyId: String,
        params: CustomCurrencyArchiveParams = CustomCurrencyArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomCurrencyArchiveResponse> =
        archive(params.toBuilder().currencyId(currencyId).build(), requestOptions)

    /** @see archive */
    fun archive(
        currencyId: String,
        params: CustomCurrencyArchiveParams = CustomCurrencyArchiveParams.none(),
    ): CompletableFuture<CustomCurrencyArchiveResponse> =
        archive(currencyId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: CustomCurrencyArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomCurrencyArchiveResponse>

    /** @see archive */
    fun archive(
        params: CustomCurrencyArchiveParams
    ): CompletableFuture<CustomCurrencyArchiveResponse> = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        currencyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomCurrencyArchiveResponse> =
        archive(currencyId, CustomCurrencyArchiveParams.none(), requestOptions)

    /**
     * Lists the active plans and addons that reference a custom currency. Useful before archiving
     * to inspect dependencies.
     */
    fun listAssociatedEntities(
        currencyId: String
    ): CompletableFuture<CustomCurrencyListAssociatedEntitiesResponse> =
        listAssociatedEntities(currencyId, CustomCurrencyListAssociatedEntitiesParams.none())

    /** @see listAssociatedEntities */
    fun listAssociatedEntities(
        currencyId: String,
        params: CustomCurrencyListAssociatedEntitiesParams =
            CustomCurrencyListAssociatedEntitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomCurrencyListAssociatedEntitiesResponse> =
        listAssociatedEntities(params.toBuilder().currencyId(currencyId).build(), requestOptions)

    /** @see listAssociatedEntities */
    fun listAssociatedEntities(
        currencyId: String,
        params: CustomCurrencyListAssociatedEntitiesParams =
            CustomCurrencyListAssociatedEntitiesParams.none(),
    ): CompletableFuture<CustomCurrencyListAssociatedEntitiesResponse> =
        listAssociatedEntities(currencyId, params, RequestOptions.none())

    /** @see listAssociatedEntities */
    fun listAssociatedEntities(
        params: CustomCurrencyListAssociatedEntitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomCurrencyListAssociatedEntitiesResponse>

    /** @see listAssociatedEntities */
    fun listAssociatedEntities(
        params: CustomCurrencyListAssociatedEntitiesParams
    ): CompletableFuture<CustomCurrencyListAssociatedEntitiesResponse> =
        listAssociatedEntities(params, RequestOptions.none())

    /** @see listAssociatedEntities */
    fun listAssociatedEntities(
        currencyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomCurrencyListAssociatedEntitiesResponse> =
        listAssociatedEntities(
            currencyId,
            CustomCurrencyListAssociatedEntitiesParams.none(),
            requestOptions,
        )

    /**
     * Restores a previously archived custom currency. Fails if another active currency with the
     * same ID already exists.
     */
    fun unarchive(currencyId: String): CompletableFuture<CustomCurrencyUnarchiveResponse> =
        unarchive(currencyId, CustomCurrencyUnarchiveParams.none())

    /** @see unarchive */
    fun unarchive(
        currencyId: String,
        params: CustomCurrencyUnarchiveParams = CustomCurrencyUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomCurrencyUnarchiveResponse> =
        unarchive(params.toBuilder().currencyId(currencyId).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(
        currencyId: String,
        params: CustomCurrencyUnarchiveParams = CustomCurrencyUnarchiveParams.none(),
    ): CompletableFuture<CustomCurrencyUnarchiveResponse> =
        unarchive(currencyId, params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        params: CustomCurrencyUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomCurrencyUnarchiveResponse>

    /** @see unarchive */
    fun unarchive(
        params: CustomCurrencyUnarchiveParams
    ): CompletableFuture<CustomCurrencyUnarchiveResponse> = unarchive(params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        currencyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomCurrencyUnarchiveResponse> =
        unarchive(currencyId, CustomCurrencyUnarchiveParams.none(), requestOptions)

    /**
     * A view of [CustomCurrencyServiceAsync] that provides access to raw HTTP responses for each
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
        ): CustomCurrencyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/credits/custom-currencies`, but is
         * otherwise the same as [CustomCurrencyServiceAsync.create].
         */
        fun create(
            params: CustomCurrencyCreateParams
        ): CompletableFuture<HttpResponseFor<CustomCurrencyCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomCurrencyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/credits/custom-currencies/{currencyId}`,
         * but is otherwise the same as [CustomCurrencyServiceAsync.update].
         */
        fun update(
            currencyId: String
        ): CompletableFuture<HttpResponseFor<CustomCurrencyUpdateResponse>> =
            update(currencyId, CustomCurrencyUpdateParams.none())

        /** @see update */
        fun update(
            currencyId: String,
            params: CustomCurrencyUpdateParams = CustomCurrencyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyUpdateResponse>> =
            update(params.toBuilder().currencyId(currencyId).build(), requestOptions)

        /** @see update */
        fun update(
            currencyId: String,
            params: CustomCurrencyUpdateParams = CustomCurrencyUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyUpdateResponse>> =
            update(currencyId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CustomCurrencyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyUpdateResponse>>

        /** @see update */
        fun update(
            params: CustomCurrencyUpdateParams
        ): CompletableFuture<HttpResponseFor<CustomCurrencyUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            currencyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomCurrencyUpdateResponse>> =
            update(currencyId, CustomCurrencyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/credits/custom-currencies`, but is otherwise
         * the same as [CustomCurrencyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CustomCurrencyListPageAsync>> =
            list(CustomCurrencyListParams.none())

        /** @see list */
        fun list(
            params: CustomCurrencyListParams = CustomCurrencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyListPageAsync>>

        /** @see list */
        fun list(
            params: CustomCurrencyListParams = CustomCurrencyListParams.none()
        ): CompletableFuture<HttpResponseFor<CustomCurrencyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomCurrencyListPageAsync>> =
            list(CustomCurrencyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/credits/custom-currencies/{currencyId}/archive`, but is otherwise the same as
         * [CustomCurrencyServiceAsync.archive].
         */
        fun archive(
            currencyId: String
        ): CompletableFuture<HttpResponseFor<CustomCurrencyArchiveResponse>> =
            archive(currencyId, CustomCurrencyArchiveParams.none())

        /** @see archive */
        fun archive(
            currencyId: String,
            params: CustomCurrencyArchiveParams = CustomCurrencyArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyArchiveResponse>> =
            archive(params.toBuilder().currencyId(currencyId).build(), requestOptions)

        /** @see archive */
        fun archive(
            currencyId: String,
            params: CustomCurrencyArchiveParams = CustomCurrencyArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyArchiveResponse>> =
            archive(currencyId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: CustomCurrencyArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyArchiveResponse>>

        /** @see archive */
        fun archive(
            params: CustomCurrencyArchiveParams
        ): CompletableFuture<HttpResponseFor<CustomCurrencyArchiveResponse>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            currencyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomCurrencyArchiveResponse>> =
            archive(currencyId, CustomCurrencyArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/credits/custom-currencies/{currencyId}/associated-entities`, but is otherwise the
         * same as [CustomCurrencyServiceAsync.listAssociatedEntities].
         */
        fun listAssociatedEntities(
            currencyId: String
        ): CompletableFuture<HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse>> =
            listAssociatedEntities(currencyId, CustomCurrencyListAssociatedEntitiesParams.none())

        /** @see listAssociatedEntities */
        fun listAssociatedEntities(
            currencyId: String,
            params: CustomCurrencyListAssociatedEntitiesParams =
                CustomCurrencyListAssociatedEntitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse>> =
            listAssociatedEntities(
                params.toBuilder().currencyId(currencyId).build(),
                requestOptions,
            )

        /** @see listAssociatedEntities */
        fun listAssociatedEntities(
            currencyId: String,
            params: CustomCurrencyListAssociatedEntitiesParams =
                CustomCurrencyListAssociatedEntitiesParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse>> =
            listAssociatedEntities(currencyId, params, RequestOptions.none())

        /** @see listAssociatedEntities */
        fun listAssociatedEntities(
            params: CustomCurrencyListAssociatedEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse>>

        /** @see listAssociatedEntities */
        fun listAssociatedEntities(
            params: CustomCurrencyListAssociatedEntitiesParams
        ): CompletableFuture<HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse>> =
            listAssociatedEntities(params, RequestOptions.none())

        /** @see listAssociatedEntities */
        fun listAssociatedEntities(
            currencyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse>> =
            listAssociatedEntities(
                currencyId,
                CustomCurrencyListAssociatedEntitiesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/credits/custom-currencies/{currencyId}/unarchive`, but is otherwise the same as
         * [CustomCurrencyServiceAsync.unarchive].
         */
        fun unarchive(
            currencyId: String
        ): CompletableFuture<HttpResponseFor<CustomCurrencyUnarchiveResponse>> =
            unarchive(currencyId, CustomCurrencyUnarchiveParams.none())

        /** @see unarchive */
        fun unarchive(
            currencyId: String,
            params: CustomCurrencyUnarchiveParams = CustomCurrencyUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyUnarchiveResponse>> =
            unarchive(params.toBuilder().currencyId(currencyId).build(), requestOptions)

        /** @see unarchive */
        fun unarchive(
            currencyId: String,
            params: CustomCurrencyUnarchiveParams = CustomCurrencyUnarchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyUnarchiveResponse>> =
            unarchive(currencyId, params, RequestOptions.none())

        /** @see unarchive */
        fun unarchive(
            params: CustomCurrencyUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomCurrencyUnarchiveResponse>>

        /** @see unarchive */
        fun unarchive(
            params: CustomCurrencyUnarchiveParams
        ): CompletableFuture<HttpResponseFor<CustomCurrencyUnarchiveResponse>> =
            unarchive(params, RequestOptions.none())

        /** @see unarchive */
        fun unarchive(
            currencyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomCurrencyUnarchiveResponse>> =
            unarchive(currencyId, CustomCurrencyUnarchiveParams.none(), requestOptions)
    }
}
