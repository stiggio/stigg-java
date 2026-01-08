// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.subscriptions.SubscriptionCreateParams
import com.stigg.api.models.v1.subscriptions.SubscriptionCreateResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionDelegateParams
import com.stigg.api.models.v1.subscriptions.SubscriptionDelegateResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionListParams
import com.stigg.api.models.v1.subscriptions.SubscriptionListResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionMigrateParams
import com.stigg.api.models.v1.subscriptions.SubscriptionMigrateResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionPreviewParams
import com.stigg.api.models.v1.subscriptions.SubscriptionPreviewResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionRetrieveParams
import com.stigg.api.models.v1.subscriptions.SubscriptionRetrieveResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionTransferParams
import com.stigg.api.models.v1.subscriptions.SubscriptionTransferResponse
import com.stigg.api.services.blocking.v1.subscriptions.FutureUpdateService
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

    /** Create a new Subscription */
    fun create(params: SubscriptionCreateParams): SubscriptionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionCreateResponse

    /** Get a single Subscription by id */
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

    /** Get a list of Subscriptions */
    fun list(): SubscriptionListResponse = list(SubscriptionListParams.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none()
    ): SubscriptionListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SubscriptionListResponse =
        list(SubscriptionListParams.none(), requestOptions)

    /** Perform delegate on a Subscription */
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

    /** Perform migrate to latest plan version on a Subscription */
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

    /** Create a new Subscription Preview */
    fun preview(params: SubscriptionPreviewParams): SubscriptionPreviewResponse =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: SubscriptionPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionPreviewResponse

    /** Perform transfer to resource on a Subscription */
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
        fun list(): HttpResponseFor<SubscriptionListResponse> = list(SubscriptionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): HttpResponseFor<SubscriptionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SubscriptionListResponse> =
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
