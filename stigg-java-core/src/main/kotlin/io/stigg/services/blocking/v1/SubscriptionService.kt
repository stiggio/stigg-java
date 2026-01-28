// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.subscriptions.SubscriptionCreateParams
import io.stigg.models.v1.subscriptions.SubscriptionCreateResponse
import io.stigg.models.v1.subscriptions.SubscriptionDelegateParams
import io.stigg.models.v1.subscriptions.SubscriptionDelegateResponse
import io.stigg.models.v1.subscriptions.SubscriptionListPage
import io.stigg.models.v1.subscriptions.SubscriptionListParams
import io.stigg.models.v1.subscriptions.SubscriptionMigrateParams
import io.stigg.models.v1.subscriptions.SubscriptionMigrateResponse
import io.stigg.models.v1.subscriptions.SubscriptionPreviewParams
import io.stigg.models.v1.subscriptions.SubscriptionPreviewResponse
import io.stigg.models.v1.subscriptions.SubscriptionRetrieveParams
import io.stigg.models.v1.subscriptions.SubscriptionRetrieveResponse
import io.stigg.models.v1.subscriptions.SubscriptionTransferParams
import io.stigg.models.v1.subscriptions.SubscriptionTransferResponse
import io.stigg.services.blocking.v1.subscriptions.FutureUpdateService
import java.util.function.Consumer

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionService

    fun futureUpdate(): FutureUpdateService

    /** Provision subscription */
    fun create(params: SubscriptionCreateParams): SubscriptionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionCreateResponse

    /** Get a single subscription by ID */
    fun retrieve(id: String): SubscriptionRetrieveResponse =
        retrieve(id, SubscriptionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
    ): SubscriptionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SubscriptionRetrieveParams): SubscriptionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): SubscriptionRetrieveResponse =
        retrieve(id, SubscriptionRetrieveParams.none(), requestOptions)

    /** Get a list of subscriptions */
    fun list(): SubscriptionListPage = list(SubscriptionListParams.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListPage

    /** @see list */
    fun list(params: SubscriptionListParams = SubscriptionListParams.none()): SubscriptionListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SubscriptionListPage =
        list(SubscriptionListParams.none(), requestOptions)

    /** Delegate subscription payment to customer */
    fun delegate(id: String, params: SubscriptionDelegateParams): SubscriptionDelegateResponse =
        delegate(id, params, RequestOptions.none())

    /** @see delegate */
    fun delegate(
        id: String,
        params: SubscriptionDelegateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionDelegateResponse = delegate(params.toBuilder().id(id).build(), requestOptions)

    /** @see delegate */
    fun delegate(params: SubscriptionDelegateParams): SubscriptionDelegateResponse =
        delegate(params, RequestOptions.none())

    /** @see delegate */
    fun delegate(
        params: SubscriptionDelegateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionDelegateResponse

    /** Migrate subscription to latest plan version */
    fun migrate(id: String): SubscriptionMigrateResponse =
        migrate(id, SubscriptionMigrateParams.none())

    /** @see migrate */
    fun migrate(
        id: String,
        params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionMigrateResponse = migrate(params.toBuilder().id(id).build(), requestOptions)

    /** @see migrate */
    fun migrate(
        id: String,
        params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
    ): SubscriptionMigrateResponse = migrate(id, params, RequestOptions.none())

    /** @see migrate */
    fun migrate(
        params: SubscriptionMigrateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionMigrateResponse

    /** @see migrate */
    fun migrate(params: SubscriptionMigrateParams): SubscriptionMigrateResponse =
        migrate(params, RequestOptions.none())

    /** @see migrate */
    fun migrate(id: String, requestOptions: RequestOptions): SubscriptionMigrateResponse =
        migrate(id, SubscriptionMigrateParams.none(), requestOptions)

    /** Preview subscription */
    fun preview(params: SubscriptionPreviewParams): SubscriptionPreviewResponse =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: SubscriptionPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionPreviewResponse

    /** Transfer subscription to resource */
    fun transfer(id: String, params: SubscriptionTransferParams): SubscriptionTransferResponse =
        transfer(id, params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        id: String,
        params: SubscriptionTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionTransferResponse = transfer(params.toBuilder().id(id).build(), requestOptions)

    /** @see transfer */
    fun transfer(params: SubscriptionTransferParams): SubscriptionTransferResponse =
        transfer(params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        params: SubscriptionTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionTransferResponse

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionService.WithRawResponse

        fun futureUpdate(): FutureUpdateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions`, but is otherwise the same
         * as [SubscriptionService.create].
         */
        @MustBeClosed
        fun create(params: SubscriptionCreateParams): HttpResponseFor<SubscriptionCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/subscriptions/{id}`, but is otherwise the
         * same as [SubscriptionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<SubscriptionRetrieveResponse> =
            retrieve(id, SubscriptionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
        ): HttpResponseFor<SubscriptionRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubscriptionRetrieveParams
        ): HttpResponseFor<SubscriptionRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionRetrieveResponse> =
            retrieve(id, SubscriptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/subscriptions`, but is otherwise the same as
         * [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SubscriptionListPage> = list(SubscriptionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): HttpResponseFor<SubscriptionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SubscriptionListPage> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/delegate`, but is
         * otherwise the same as [SubscriptionService.delegate].
         */
        @MustBeClosed
        fun delegate(
            id: String,
            params: SubscriptionDelegateParams,
        ): HttpResponseFor<SubscriptionDelegateResponse> =
            delegate(id, params, RequestOptions.none())

        /** @see delegate */
        @MustBeClosed
        fun delegate(
            id: String,
            params: SubscriptionDelegateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionDelegateResponse> =
            delegate(params.toBuilder().id(id).build(), requestOptions)

        /** @see delegate */
        @MustBeClosed
        fun delegate(
            params: SubscriptionDelegateParams
        ): HttpResponseFor<SubscriptionDelegateResponse> = delegate(params, RequestOptions.none())

        /** @see delegate */
        @MustBeClosed
        fun delegate(
            params: SubscriptionDelegateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionDelegateResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/migrate`, but is
         * otherwise the same as [SubscriptionService.migrate].
         */
        @MustBeClosed
        fun migrate(id: String): HttpResponseFor<SubscriptionMigrateResponse> =
            migrate(id, SubscriptionMigrateParams.none())

        /** @see migrate */
        @MustBeClosed
        fun migrate(
            id: String,
            params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionMigrateResponse> =
            migrate(params.toBuilder().id(id).build(), requestOptions)

        /** @see migrate */
        @MustBeClosed
        fun migrate(
            id: String,
            params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
        ): HttpResponseFor<SubscriptionMigrateResponse> = migrate(id, params, RequestOptions.none())

        /** @see migrate */
        @MustBeClosed
        fun migrate(
            params: SubscriptionMigrateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionMigrateResponse>

        /** @see migrate */
        @MustBeClosed
        fun migrate(
            params: SubscriptionMigrateParams
        ): HttpResponseFor<SubscriptionMigrateResponse> = migrate(params, RequestOptions.none())

        /** @see migrate */
        @MustBeClosed
        fun migrate(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionMigrateResponse> =
            migrate(id, SubscriptionMigrateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/preview`, but is otherwise
         * the same as [SubscriptionService.preview].
         */
        @MustBeClosed
        fun preview(
            params: SubscriptionPreviewParams
        ): HttpResponseFor<SubscriptionPreviewResponse> = preview(params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: SubscriptionPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionPreviewResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/transfer`, but is
         * otherwise the same as [SubscriptionService.transfer].
         */
        @MustBeClosed
        fun transfer(
            id: String,
            params: SubscriptionTransferParams,
        ): HttpResponseFor<SubscriptionTransferResponse> =
            transfer(id, params, RequestOptions.none())

        /** @see transfer */
        @MustBeClosed
        fun transfer(
            id: String,
            params: SubscriptionTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionTransferResponse> =
            transfer(params.toBuilder().id(id).build(), requestOptions)

        /** @see transfer */
        @MustBeClosed
        fun transfer(
            params: SubscriptionTransferParams
        ): HttpResponseFor<SubscriptionTransferResponse> = transfer(params, RequestOptions.none())

        /** @see transfer */
        @MustBeClosed
        fun transfer(
            params: SubscriptionTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionTransferResponse>
    }
}
