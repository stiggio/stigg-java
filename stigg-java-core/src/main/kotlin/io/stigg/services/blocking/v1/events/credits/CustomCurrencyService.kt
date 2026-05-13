// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.credits

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyArchiveParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyArchiveResponse
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyCreateParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyCreateResponse
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyListAssociatedEntitiesParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyListAssociatedEntitiesResponse
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyListPage
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyListParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyUnarchiveParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyUnarchiveResponse
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyUpdateParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyUpdateResponse
import java.util.function.Consumer

/** Operations related to custom currencies */
interface CustomCurrencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomCurrencyService

    /** Creates a new custom currency in the environment. */
    fun create(params: CustomCurrencyCreateParams): CustomCurrencyCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomCurrencyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomCurrencyCreateResponse

    /** Updates an existing custom currency. Only the supplied fields are modified. */
    fun update(currencyId: String): CustomCurrencyUpdateResponse =
        update(currencyId, CustomCurrencyUpdateParams.none())

    /** @see update */
    fun update(
        currencyId: String,
        params: CustomCurrencyUpdateParams = CustomCurrencyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomCurrencyUpdateResponse =
        update(params.toBuilder().currencyId(currencyId).build(), requestOptions)

    /** @see update */
    fun update(
        currencyId: String,
        params: CustomCurrencyUpdateParams = CustomCurrencyUpdateParams.none(),
    ): CustomCurrencyUpdateResponse = update(currencyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomCurrencyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomCurrencyUpdateResponse

    /** @see update */
    fun update(params: CustomCurrencyUpdateParams): CustomCurrencyUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(currencyId: String, requestOptions: RequestOptions): CustomCurrencyUpdateResponse =
        update(currencyId, CustomCurrencyUpdateParams.none(), requestOptions)

    /**
     * Retrieves a paginated list of custom currencies in the environment. Archived currencies are
     * excluded by default; pass `status=ARCHIVED` (or `status=ACTIVE,ARCHIVED`) to include them.
     */
    fun list(): CustomCurrencyListPage = list(CustomCurrencyListParams.none())

    /** @see list */
    fun list(
        params: CustomCurrencyListParams = CustomCurrencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomCurrencyListPage

    /** @see list */
    fun list(
        params: CustomCurrencyListParams = CustomCurrencyListParams.none()
    ): CustomCurrencyListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CustomCurrencyListPage =
        list(CustomCurrencyListParams.none(), requestOptions)

    /**
     * Archives a custom currency. Fails if the currency is still associated with any active plan or
     * addon — use the associated-entities endpoint first to inspect dependencies.
     */
    fun archive(currencyId: String): CustomCurrencyArchiveResponse =
        archive(currencyId, CustomCurrencyArchiveParams.none())

    /** @see archive */
    fun archive(
        currencyId: String,
        params: CustomCurrencyArchiveParams = CustomCurrencyArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomCurrencyArchiveResponse =
        archive(params.toBuilder().currencyId(currencyId).build(), requestOptions)

    /** @see archive */
    fun archive(
        currencyId: String,
        params: CustomCurrencyArchiveParams = CustomCurrencyArchiveParams.none(),
    ): CustomCurrencyArchiveResponse = archive(currencyId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: CustomCurrencyArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomCurrencyArchiveResponse

    /** @see archive */
    fun archive(params: CustomCurrencyArchiveParams): CustomCurrencyArchiveResponse =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(currencyId: String, requestOptions: RequestOptions): CustomCurrencyArchiveResponse =
        archive(currencyId, CustomCurrencyArchiveParams.none(), requestOptions)

    /**
     * Lists the active plans and addons that reference a custom currency. Useful before archiving
     * to inspect dependencies.
     */
    fun listAssociatedEntities(currencyId: String): CustomCurrencyListAssociatedEntitiesResponse =
        listAssociatedEntities(currencyId, CustomCurrencyListAssociatedEntitiesParams.none())

    /** @see listAssociatedEntities */
    fun listAssociatedEntities(
        currencyId: String,
        params: CustomCurrencyListAssociatedEntitiesParams =
            CustomCurrencyListAssociatedEntitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomCurrencyListAssociatedEntitiesResponse =
        listAssociatedEntities(params.toBuilder().currencyId(currencyId).build(), requestOptions)

    /** @see listAssociatedEntities */
    fun listAssociatedEntities(
        currencyId: String,
        params: CustomCurrencyListAssociatedEntitiesParams =
            CustomCurrencyListAssociatedEntitiesParams.none(),
    ): CustomCurrencyListAssociatedEntitiesResponse =
        listAssociatedEntities(currencyId, params, RequestOptions.none())

    /** @see listAssociatedEntities */
    fun listAssociatedEntities(
        params: CustomCurrencyListAssociatedEntitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomCurrencyListAssociatedEntitiesResponse

    /** @see listAssociatedEntities */
    fun listAssociatedEntities(
        params: CustomCurrencyListAssociatedEntitiesParams
    ): CustomCurrencyListAssociatedEntitiesResponse =
        listAssociatedEntities(params, RequestOptions.none())

    /** @see listAssociatedEntities */
    fun listAssociatedEntities(
        currencyId: String,
        requestOptions: RequestOptions,
    ): CustomCurrencyListAssociatedEntitiesResponse =
        listAssociatedEntities(
            currencyId,
            CustomCurrencyListAssociatedEntitiesParams.none(),
            requestOptions,
        )

    /**
     * Restores a previously archived custom currency. Fails if another active currency with the
     * same ID already exists.
     */
    fun unarchive(currencyId: String): CustomCurrencyUnarchiveResponse =
        unarchive(currencyId, CustomCurrencyUnarchiveParams.none())

    /** @see unarchive */
    fun unarchive(
        currencyId: String,
        params: CustomCurrencyUnarchiveParams = CustomCurrencyUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomCurrencyUnarchiveResponse =
        unarchive(params.toBuilder().currencyId(currencyId).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(
        currencyId: String,
        params: CustomCurrencyUnarchiveParams = CustomCurrencyUnarchiveParams.none(),
    ): CustomCurrencyUnarchiveResponse = unarchive(currencyId, params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        params: CustomCurrencyUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomCurrencyUnarchiveResponse

    /** @see unarchive */
    fun unarchive(params: CustomCurrencyUnarchiveParams): CustomCurrencyUnarchiveResponse =
        unarchive(params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        currencyId: String,
        requestOptions: RequestOptions,
    ): CustomCurrencyUnarchiveResponse =
        unarchive(currencyId, CustomCurrencyUnarchiveParams.none(), requestOptions)

    /**
     * A view of [CustomCurrencyService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomCurrencyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/credits/custom-currencies`, but is
         * otherwise the same as [CustomCurrencyService.create].
         */
        @MustBeClosed
        fun create(
            params: CustomCurrencyCreateParams
        ): HttpResponseFor<CustomCurrencyCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CustomCurrencyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomCurrencyCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/credits/custom-currencies/{currencyId}`,
         * but is otherwise the same as [CustomCurrencyService.update].
         */
        @MustBeClosed
        fun update(currencyId: String): HttpResponseFor<CustomCurrencyUpdateResponse> =
            update(currencyId, CustomCurrencyUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            currencyId: String,
            params: CustomCurrencyUpdateParams = CustomCurrencyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomCurrencyUpdateResponse> =
            update(params.toBuilder().currencyId(currencyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            currencyId: String,
            params: CustomCurrencyUpdateParams = CustomCurrencyUpdateParams.none(),
        ): HttpResponseFor<CustomCurrencyUpdateResponse> =
            update(currencyId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomCurrencyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomCurrencyUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomCurrencyUpdateParams
        ): HttpResponseFor<CustomCurrencyUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            currencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomCurrencyUpdateResponse> =
            update(currencyId, CustomCurrencyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/credits/custom-currencies`, but is otherwise
         * the same as [CustomCurrencyService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CustomCurrencyListPage> = list(CustomCurrencyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomCurrencyListParams = CustomCurrencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomCurrencyListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomCurrencyListParams = CustomCurrencyListParams.none()
        ): HttpResponseFor<CustomCurrencyListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CustomCurrencyListPage> =
            list(CustomCurrencyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/credits/custom-currencies/{currencyId}/archive`, but is otherwise the same as
         * [CustomCurrencyService.archive].
         */
        @MustBeClosed
        fun archive(currencyId: String): HttpResponseFor<CustomCurrencyArchiveResponse> =
            archive(currencyId, CustomCurrencyArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            currencyId: String,
            params: CustomCurrencyArchiveParams = CustomCurrencyArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomCurrencyArchiveResponse> =
            archive(params.toBuilder().currencyId(currencyId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            currencyId: String,
            params: CustomCurrencyArchiveParams = CustomCurrencyArchiveParams.none(),
        ): HttpResponseFor<CustomCurrencyArchiveResponse> =
            archive(currencyId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: CustomCurrencyArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomCurrencyArchiveResponse>

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: CustomCurrencyArchiveParams
        ): HttpResponseFor<CustomCurrencyArchiveResponse> = archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            currencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomCurrencyArchiveResponse> =
            archive(currencyId, CustomCurrencyArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/credits/custom-currencies/{currencyId}/associated-entities`, but is otherwise the
         * same as [CustomCurrencyService.listAssociatedEntities].
         */
        @MustBeClosed
        fun listAssociatedEntities(
            currencyId: String
        ): HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse> =
            listAssociatedEntities(currencyId, CustomCurrencyListAssociatedEntitiesParams.none())

        /** @see listAssociatedEntities */
        @MustBeClosed
        fun listAssociatedEntities(
            currencyId: String,
            params: CustomCurrencyListAssociatedEntitiesParams =
                CustomCurrencyListAssociatedEntitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse> =
            listAssociatedEntities(
                params.toBuilder().currencyId(currencyId).build(),
                requestOptions,
            )

        /** @see listAssociatedEntities */
        @MustBeClosed
        fun listAssociatedEntities(
            currencyId: String,
            params: CustomCurrencyListAssociatedEntitiesParams =
                CustomCurrencyListAssociatedEntitiesParams.none(),
        ): HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse> =
            listAssociatedEntities(currencyId, params, RequestOptions.none())

        /** @see listAssociatedEntities */
        @MustBeClosed
        fun listAssociatedEntities(
            params: CustomCurrencyListAssociatedEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse>

        /** @see listAssociatedEntities */
        @MustBeClosed
        fun listAssociatedEntities(
            params: CustomCurrencyListAssociatedEntitiesParams
        ): HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse> =
            listAssociatedEntities(params, RequestOptions.none())

        /** @see listAssociatedEntities */
        @MustBeClosed
        fun listAssociatedEntities(
            currencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomCurrencyListAssociatedEntitiesResponse> =
            listAssociatedEntities(
                currencyId,
                CustomCurrencyListAssociatedEntitiesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/credits/custom-currencies/{currencyId}/unarchive`, but is otherwise the same as
         * [CustomCurrencyService.unarchive].
         */
        @MustBeClosed
        fun unarchive(currencyId: String): HttpResponseFor<CustomCurrencyUnarchiveResponse> =
            unarchive(currencyId, CustomCurrencyUnarchiveParams.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            currencyId: String,
            params: CustomCurrencyUnarchiveParams = CustomCurrencyUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomCurrencyUnarchiveResponse> =
            unarchive(params.toBuilder().currencyId(currencyId).build(), requestOptions)

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            currencyId: String,
            params: CustomCurrencyUnarchiveParams = CustomCurrencyUnarchiveParams.none(),
        ): HttpResponseFor<CustomCurrencyUnarchiveResponse> =
            unarchive(currencyId, params, RequestOptions.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            params: CustomCurrencyUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomCurrencyUnarchiveResponse>

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            params: CustomCurrencyUnarchiveParams
        ): HttpResponseFor<CustomCurrencyUnarchiveResponse> =
            unarchive(params, RequestOptions.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            currencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomCurrencyUnarchiveResponse> =
            unarchive(currencyId, CustomCurrencyUnarchiveParams.none(), requestOptions)
    }
}
