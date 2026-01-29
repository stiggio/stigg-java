// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.subscriptions.Subscription
import io.stigg.models.v1.subscriptions.SubscriptionCancelParams
import io.stigg.models.v1.subscriptions.SubscriptionDelegateParams
import io.stigg.models.v1.subscriptions.SubscriptionImportParams
import io.stigg.models.v1.subscriptions.SubscriptionImportResponse
import io.stigg.models.v1.subscriptions.SubscriptionListPageAsync
import io.stigg.models.v1.subscriptions.SubscriptionListParams
import io.stigg.models.v1.subscriptions.SubscriptionMigrateParams
import io.stigg.models.v1.subscriptions.SubscriptionPreviewParams
import io.stigg.models.v1.subscriptions.SubscriptionPreviewResponse
import io.stigg.models.v1.subscriptions.SubscriptionProvisionParams
import io.stigg.models.v1.subscriptions.SubscriptionProvisionResponse
import io.stigg.models.v1.subscriptions.SubscriptionRetrieveParams
import io.stigg.models.v1.subscriptions.SubscriptionTransferParams
import io.stigg.models.v1.subscriptions.SubscriptionUpdateParams
import io.stigg.services.async.v1.subscriptions.FutureUpdateServiceAsync
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

    /** Get a single subscription by ID */
    fun retrieve(id: String): CompletableFuture<Subscription> =
        retrieve(id, SubscriptionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
    ): CompletableFuture<Subscription> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription>

    /** @see retrieve */
    fun retrieve(params: SubscriptionRetrieveParams): CompletableFuture<Subscription> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Subscription> =
        retrieve(id, SubscriptionRetrieveParams.none(), requestOptions)

    /** Update a subscription */
    fun update(id: String): CompletableFuture<Subscription> =
        update(id, SubscriptionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
    ): CompletableFuture<Subscription> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription>

    /** @see update */
    fun update(params: SubscriptionUpdateParams): CompletableFuture<Subscription> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Subscription> =
        update(id, SubscriptionUpdateParams.none(), requestOptions)

    /** Get a list of subscriptions */
    fun list(): CompletableFuture<SubscriptionListPageAsync> = list(SubscriptionListParams.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListPageAsync>

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none()
    ): CompletableFuture<SubscriptionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SubscriptionListPageAsync> =
        list(SubscriptionListParams.none(), requestOptions)

    /** Cancel subscription */
    fun cancel(id: String): CompletableFuture<Subscription> =
        cancel(id, SubscriptionCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription> = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
    ): CompletableFuture<Subscription> = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: SubscriptionCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription>

    /** @see cancel */
    fun cancel(params: SubscriptionCancelParams): CompletableFuture<Subscription> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions): CompletableFuture<Subscription> =
        cancel(id, SubscriptionCancelParams.none(), requestOptions)

    /** Delegate subscription payment to customer */
    fun delegate(id: String, params: SubscriptionDelegateParams): CompletableFuture<Subscription> =
        delegate(id, params, RequestOptions.none())

    /** @see delegate */
    fun delegate(
        id: String,
        params: SubscriptionDelegateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription> = delegate(params.toBuilder().id(id).build(), requestOptions)

    /** @see delegate */
    fun delegate(params: SubscriptionDelegateParams): CompletableFuture<Subscription> =
        delegate(params, RequestOptions.none())

    /** @see delegate */
    fun delegate(
        params: SubscriptionDelegateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription>

    /** Bulk import subscriptions */
    fun import_(params: SubscriptionImportParams): CompletableFuture<SubscriptionImportResponse> =
        import_(params, RequestOptions.none())

    /** @see import_ */
    fun import_(
        params: SubscriptionImportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionImportResponse>

    /** Migrate subscription to latest plan version */
    fun migrate(id: String): CompletableFuture<Subscription> =
        migrate(id, SubscriptionMigrateParams.none())

    /** @see migrate */
    fun migrate(
        id: String,
        params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription> = migrate(params.toBuilder().id(id).build(), requestOptions)

    /** @see migrate */
    fun migrate(
        id: String,
        params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
    ): CompletableFuture<Subscription> = migrate(id, params, RequestOptions.none())

    /** @see migrate */
    fun migrate(
        params: SubscriptionMigrateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription>

    /** @see migrate */
    fun migrate(params: SubscriptionMigrateParams): CompletableFuture<Subscription> =
        migrate(params, RequestOptions.none())

    /** @see migrate */
    fun migrate(id: String, requestOptions: RequestOptions): CompletableFuture<Subscription> =
        migrate(id, SubscriptionMigrateParams.none(), requestOptions)

    /** Preview subscription */
    fun preview(params: SubscriptionPreviewParams): CompletableFuture<SubscriptionPreviewResponse> =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: SubscriptionPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionPreviewResponse>

    /** Provision subscription */
    fun provision(
        params: SubscriptionProvisionParams
    ): CompletableFuture<SubscriptionProvisionResponse> = provision(params, RequestOptions.none())

    /** @see provision */
    fun provision(
        params: SubscriptionProvisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionProvisionResponse>

    /** Transfer subscription to resource */
    fun transfer(id: String, params: SubscriptionTransferParams): CompletableFuture<Subscription> =
        transfer(id, params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        id: String,
        params: SubscriptionTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription> = transfer(params.toBuilder().id(id).build(), requestOptions)

    /** @see transfer */
    fun transfer(params: SubscriptionTransferParams): CompletableFuture<Subscription> =
        transfer(params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        params: SubscriptionTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription>

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
         * Returns a raw HTTP response for `get /api/v1/subscriptions/{id}`, but is otherwise the
         * same as [SubscriptionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Subscription>> =
            retrieve(id, SubscriptionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>>

        /** @see retrieve */
        fun retrieve(
            params: SubscriptionRetrieveParams
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            retrieve(id, SubscriptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/subscriptions/{id}`, but is otherwise the
         * same as [SubscriptionServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<Subscription>> =
            update(id, SubscriptionUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>>

        /** @see update */
        fun update(
            params: SubscriptionUpdateParams
        ): CompletableFuture<HttpResponseFor<Subscription>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            update(id, SubscriptionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/subscriptions`, but is otherwise the same as
         * [SubscriptionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>> =
            list(SubscriptionListParams.none())

        /** @see list */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>>

        /** @see list */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/cancel`, but is
         * otherwise the same as [SubscriptionServiceAsync.cancel].
         */
        fun cancel(id: String): CompletableFuture<HttpResponseFor<Subscription>> =
            cancel(id, SubscriptionCancelParams.none())

        /** @see cancel */
        fun cancel(
            id: String,
            params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            id: String,
            params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            cancel(id, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: SubscriptionCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>>

        /** @see cancel */
        fun cancel(
            params: SubscriptionCancelParams
        ): CompletableFuture<HttpResponseFor<Subscription>> = cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            cancel(id, SubscriptionCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/delegate`, but is
         * otherwise the same as [SubscriptionServiceAsync.delegate].
         */
        fun delegate(
            id: String,
            params: SubscriptionDelegateParams,
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            delegate(id, params, RequestOptions.none())

        /** @see delegate */
        fun delegate(
            id: String,
            params: SubscriptionDelegateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            delegate(params.toBuilder().id(id).build(), requestOptions)

        /** @see delegate */
        fun delegate(
            params: SubscriptionDelegateParams
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            delegate(params, RequestOptions.none())

        /** @see delegate */
        fun delegate(
            params: SubscriptionDelegateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>>

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/import`, but is otherwise the
         * same as [SubscriptionServiceAsync.import_].
         */
        fun import_(
            params: SubscriptionImportParams
        ): CompletableFuture<HttpResponseFor<SubscriptionImportResponse>> =
            import_(params, RequestOptions.none())

        /** @see import_ */
        fun import_(
            params: SubscriptionImportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionImportResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/migrate`, but is
         * otherwise the same as [SubscriptionServiceAsync.migrate].
         */
        fun migrate(id: String): CompletableFuture<HttpResponseFor<Subscription>> =
            migrate(id, SubscriptionMigrateParams.none())

        /** @see migrate */
        fun migrate(
            id: String,
            params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            migrate(params.toBuilder().id(id).build(), requestOptions)

        /** @see migrate */
        fun migrate(
            id: String,
            params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            migrate(id, params, RequestOptions.none())

        /** @see migrate */
        fun migrate(
            params: SubscriptionMigrateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>>

        /** @see migrate */
        fun migrate(
            params: SubscriptionMigrateParams
        ): CompletableFuture<HttpResponseFor<Subscription>> = migrate(params, RequestOptions.none())

        /** @see migrate */
        fun migrate(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Subscription>> =
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
         * Returns a raw HTTP response for `post /api/v1/subscriptions`, but is otherwise the same
         * as [SubscriptionServiceAsync.provision].
         */
        fun provision(
            params: SubscriptionProvisionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionProvisionResponse>> =
            provision(params, RequestOptions.none())

        /** @see provision */
        fun provision(
            params: SubscriptionProvisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionProvisionResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/transfer`, but is
         * otherwise the same as [SubscriptionServiceAsync.transfer].
         */
        fun transfer(
            id: String,
            params: SubscriptionTransferParams,
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            transfer(id, params, RequestOptions.none())

        /** @see transfer */
        fun transfer(
            id: String,
            params: SubscriptionTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            transfer(params.toBuilder().id(id).build(), requestOptions)

        /** @see transfer */
        fun transfer(
            params: SubscriptionTransferParams
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            transfer(params, RequestOptions.none())

        /** @see transfer */
        fun transfer(
            params: SubscriptionTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>>
    }
}
