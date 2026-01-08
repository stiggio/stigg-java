// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1

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
import com.stigg.api.services.async.v1.subscriptions.FutureUpdateServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync

    fun futureUpdate(): FutureUpdateServiceAsync

    /** Create a new Subscription */
    fun create(params: SubscriptionCreateParams): CompletableFuture<SubscriptionCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionCreateResponse>

    /** Get a single Subscription by id */
    fun retrieve(id: String): CompletableFuture<SubscriptionRetrieveResponse> =
        retrieve(id, SubscriptionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
    ): CompletableFuture<SubscriptionRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: SubscriptionRetrieveParams
    ): CompletableFuture<SubscriptionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionRetrieveResponse> =
        retrieve(id, SubscriptionRetrieveParams.none(), requestOptions)

    /** Get a list of Subscriptions */
    fun list(): CompletableFuture<SubscriptionListResponse> = list(SubscriptionListParams.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse>

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none()
    ): CompletableFuture<SubscriptionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SubscriptionListResponse> =
        list(SubscriptionListParams.none(), requestOptions)

    /** Perform delegate on a Subscription */
    fun delegate(
        id: String,
        params: SubscriptionDelegateParams,
    ): CompletableFuture<SubscriptionDelegateResponse> = delegate(id, params, RequestOptions.none())

    /** @see delegate */
    fun delegate(
        id: String,
        params: SubscriptionDelegateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionDelegateResponse> =
        delegate(params.toBuilder().id(id).build(), requestOptions)

    /** @see delegate */
    fun delegate(
        params: SubscriptionDelegateParams
    ): CompletableFuture<SubscriptionDelegateResponse> = delegate(params, RequestOptions.none())

    /** @see delegate */
    fun delegate(
        params: SubscriptionDelegateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionDelegateResponse>

    /** Perform migrate to latest plan version on a Subscription */
    fun migrate(id: String): CompletableFuture<SubscriptionMigrateResponse> =
        migrate(id, SubscriptionMigrateParams.none())

    /** @see migrate */
    fun migrate(
        id: String,
        params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionMigrateResponse> =
        migrate(params.toBuilder().id(id).build(), requestOptions)

    /** @see migrate */
    fun migrate(
        id: String,
        params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
    ): CompletableFuture<SubscriptionMigrateResponse> = migrate(id, params, RequestOptions.none())

    /** @see migrate */
    fun migrate(
        params: SubscriptionMigrateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionMigrateResponse>

    /** @see migrate */
    fun migrate(params: SubscriptionMigrateParams): CompletableFuture<SubscriptionMigrateResponse> =
        migrate(params, RequestOptions.none())

    /** @see migrate */
    fun migrate(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionMigrateResponse> =
        migrate(id, SubscriptionMigrateParams.none(), requestOptions)

    /** Create a new Subscription Preview */
    fun preview(params: SubscriptionPreviewParams): CompletableFuture<SubscriptionPreviewResponse> =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: SubscriptionPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionPreviewResponse>

    /** Perform transfer to resource on a Subscription */
    fun transfer(
        id: String,
        params: SubscriptionTransferParams,
    ): CompletableFuture<SubscriptionTransferResponse> = transfer(id, params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        id: String,
        params: SubscriptionTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionTransferResponse> =
        transfer(params.toBuilder().id(id).build(), requestOptions)

    /** @see transfer */
    fun transfer(
        params: SubscriptionTransferParams
    ): CompletableFuture<SubscriptionTransferResponse> = transfer(params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        params: SubscriptionTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionTransferResponse>

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
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
        ): SubscriptionServiceAsync.WithRawResponse

        fun futureUpdate(): FutureUpdateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions`, but is otherwise the same
         * as [SubscriptionServiceAsync.create].
         */
        fun create(
            params: SubscriptionCreateParams
        ): CompletableFuture<HttpResponseFor<SubscriptionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/subscriptions/{id}`, but is otherwise the
         * same as [SubscriptionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<SubscriptionRetrieveResponse>> =
            retrieve(id, SubscriptionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SubscriptionRetrieveParams
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveResponse>> =
            retrieve(id, SubscriptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/subscriptions`, but is otherwise the same as
         * [SubscriptionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(SubscriptionListParams.none())

        /** @see list */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>>

        /** @see list */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/delegate`, but is
         * otherwise the same as [SubscriptionServiceAsync.delegate].
         */
        fun delegate(
            id: String,
            params: SubscriptionDelegateParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionDelegateResponse>> =
            delegate(id, params, RequestOptions.none())

        /** @see delegate */
        fun delegate(
            id: String,
            params: SubscriptionDelegateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionDelegateResponse>> =
            delegate(params.toBuilder().id(id).build(), requestOptions)

        /** @see delegate */
        fun delegate(
            params: SubscriptionDelegateParams
        ): CompletableFuture<HttpResponseFor<SubscriptionDelegateResponse>> =
            delegate(params, RequestOptions.none())

        /** @see delegate */
        fun delegate(
            params: SubscriptionDelegateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionDelegateResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/migrate`, but is
         * otherwise the same as [SubscriptionServiceAsync.migrate].
         */
        fun migrate(id: String): CompletableFuture<HttpResponseFor<SubscriptionMigrateResponse>> =
            migrate(id, SubscriptionMigrateParams.none())

        /** @see migrate */
        fun migrate(
            id: String,
            params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionMigrateResponse>> =
            migrate(params.toBuilder().id(id).build(), requestOptions)

        /** @see migrate */
        fun migrate(
            id: String,
            params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionMigrateResponse>> =
            migrate(id, params, RequestOptions.none())

        /** @see migrate */
        fun migrate(
            params: SubscriptionMigrateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionMigrateResponse>>

        /** @see migrate */
        fun migrate(
            params: SubscriptionMigrateParams
        ): CompletableFuture<HttpResponseFor<SubscriptionMigrateResponse>> =
            migrate(params, RequestOptions.none())

        /** @see migrate */
        fun migrate(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionMigrateResponse>> =
            migrate(id, SubscriptionMigrateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/preview`, but is otherwise
         * the same as [SubscriptionServiceAsync.preview].
         */
        fun preview(
            params: SubscriptionPreviewParams
        ): CompletableFuture<HttpResponseFor<SubscriptionPreviewResponse>> =
            preview(params, RequestOptions.none())

        /** @see preview */
        fun preview(
            params: SubscriptionPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionPreviewResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/transfer`, but is
         * otherwise the same as [SubscriptionServiceAsync.transfer].
         */
        fun transfer(
            id: String,
            params: SubscriptionTransferParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionTransferResponse>> =
            transfer(id, params, RequestOptions.none())

        /** @see transfer */
        fun transfer(
            id: String,
            params: SubscriptionTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionTransferResponse>> =
            transfer(params.toBuilder().id(id).build(), requestOptions)

        /** @see transfer */
        fun transfer(
            params: SubscriptionTransferParams
        ): CompletableFuture<HttpResponseFor<SubscriptionTransferResponse>> =
            transfer(params, RequestOptions.none())

        /** @see transfer */
        fun transfer(
            params: SubscriptionTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionTransferResponse>>
    }
}
