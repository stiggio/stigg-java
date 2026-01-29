// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.subscriptions.Subscription
import io.stigg.models.v1.subscriptions.SubscriptionCancelParams
import io.stigg.models.v1.subscriptions.SubscriptionDelegateParams
import io.stigg.models.v1.subscriptions.SubscriptionImportParams
import io.stigg.models.v1.subscriptions.SubscriptionImportResponse
import io.stigg.models.v1.subscriptions.SubscriptionListPage
import io.stigg.models.v1.subscriptions.SubscriptionListParams
import io.stigg.models.v1.subscriptions.SubscriptionMigrateParams
import io.stigg.models.v1.subscriptions.SubscriptionPreviewParams
import io.stigg.models.v1.subscriptions.SubscriptionPreviewResponse
import io.stigg.models.v1.subscriptions.SubscriptionProvisionParams
import io.stigg.models.v1.subscriptions.SubscriptionProvisionResponse
import io.stigg.models.v1.subscriptions.SubscriptionRetrieveParams
import io.stigg.models.v1.subscriptions.SubscriptionTransferParams
import io.stigg.models.v1.subscriptions.SubscriptionUpdateParams
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

    /** Get a single subscription by ID */
    fun retrieve(id: String): Subscription = retrieve(id, SubscriptionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
    ): Subscription = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    /** @see retrieve */
    fun retrieve(params: SubscriptionRetrieveParams): Subscription =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Subscription =
        retrieve(id, SubscriptionRetrieveParams.none(), requestOptions)

    /** Update a subscription */
    fun update(id: String): Subscription = update(id, SubscriptionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
    ): Subscription = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    /** @see update */
    fun update(params: SubscriptionUpdateParams): Subscription =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): Subscription =
        update(id, SubscriptionUpdateParams.none(), requestOptions)

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

    /** Cancel subscription */
    fun cancel(id: String): Subscription = cancel(id, SubscriptionCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
    ): Subscription = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: SubscriptionCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    /** @see cancel */
    fun cancel(params: SubscriptionCancelParams): Subscription =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions): Subscription =
        cancel(id, SubscriptionCancelParams.none(), requestOptions)

    /** Delegate subscription payment to customer */
    fun delegate(id: String, params: SubscriptionDelegateParams): Subscription =
        delegate(id, params, RequestOptions.none())

    /** @see delegate */
    fun delegate(
        id: String,
        params: SubscriptionDelegateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription = delegate(params.toBuilder().id(id).build(), requestOptions)

    /** @see delegate */
    fun delegate(params: SubscriptionDelegateParams): Subscription =
        delegate(params, RequestOptions.none())

    /** @see delegate */
    fun delegate(
        params: SubscriptionDelegateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    /** Bulk import subscriptions */
    fun import_(params: SubscriptionImportParams): SubscriptionImportResponse =
        import_(params, RequestOptions.none())

    /** @see import_ */
    fun import_(
        params: SubscriptionImportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionImportResponse

    /** Migrate subscription to latest plan version */
    fun migrate(id: String): Subscription = migrate(id, SubscriptionMigrateParams.none())

    /** @see migrate */
    fun migrate(
        id: String,
        params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription = migrate(params.toBuilder().id(id).build(), requestOptions)

    /** @see migrate */
    fun migrate(
        id: String,
        params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
    ): Subscription = migrate(id, params, RequestOptions.none())

    /** @see migrate */
    fun migrate(
        params: SubscriptionMigrateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    /** @see migrate */
    fun migrate(params: SubscriptionMigrateParams): Subscription =
        migrate(params, RequestOptions.none())

    /** @see migrate */
    fun migrate(id: String, requestOptions: RequestOptions): Subscription =
        migrate(id, SubscriptionMigrateParams.none(), requestOptions)

    /** Preview subscription */
    fun preview(params: SubscriptionPreviewParams): SubscriptionPreviewResponse =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: SubscriptionPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionPreviewResponse

    /** Provision subscription */
    fun provision(params: SubscriptionProvisionParams): SubscriptionProvisionResponse =
        provision(params, RequestOptions.none())

    /** @see provision */
    fun provision(
        params: SubscriptionProvisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionProvisionResponse

    /** Transfer subscription to resource */
    fun transfer(id: String, params: SubscriptionTransferParams): Subscription =
        transfer(id, params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        id: String,
        params: SubscriptionTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription = transfer(params.toBuilder().id(id).build(), requestOptions)

    /** @see transfer */
    fun transfer(params: SubscriptionTransferParams): Subscription =
        transfer(params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        params: SubscriptionTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

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
         * Returns a raw HTTP response for `get /api/v1/subscriptions/{id}`, but is otherwise the
         * same as [SubscriptionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Subscription> =
            retrieve(id, SubscriptionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
        ): HttpResponseFor<Subscription> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: SubscriptionRetrieveParams): HttpResponseFor<Subscription> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Subscription> =
            retrieve(id, SubscriptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/subscriptions/{id}`, but is otherwise the
         * same as [SubscriptionService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<Subscription> =
            update(id, SubscriptionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        ): HttpResponseFor<Subscription> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /** @see update */
        @MustBeClosed
        fun update(params: SubscriptionUpdateParams): HttpResponseFor<Subscription> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<Subscription> =
            update(id, SubscriptionUpdateParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/cancel`, but is
         * otherwise the same as [SubscriptionService.cancel].
         */
        @MustBeClosed
        fun cancel(id: String): HttpResponseFor<Subscription> =
            cancel(id, SubscriptionCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription> = cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
        ): HttpResponseFor<Subscription> = cancel(id, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: SubscriptionCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: SubscriptionCancelParams): HttpResponseFor<Subscription> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(id: String, requestOptions: RequestOptions): HttpResponseFor<Subscription> =
            cancel(id, SubscriptionCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/delegate`, but is
         * otherwise the same as [SubscriptionService.delegate].
         */
        @MustBeClosed
        fun delegate(
            id: String,
            params: SubscriptionDelegateParams,
        ): HttpResponseFor<Subscription> = delegate(id, params, RequestOptions.none())

        /** @see delegate */
        @MustBeClosed
        fun delegate(
            id: String,
            params: SubscriptionDelegateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription> =
            delegate(params.toBuilder().id(id).build(), requestOptions)

        /** @see delegate */
        @MustBeClosed
        fun delegate(params: SubscriptionDelegateParams): HttpResponseFor<Subscription> =
            delegate(params, RequestOptions.none())

        /** @see delegate */
        @MustBeClosed
        fun delegate(
            params: SubscriptionDelegateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/import`, but is otherwise the
         * same as [SubscriptionService.import_].
         */
        @MustBeClosed
        fun import_(params: SubscriptionImportParams): HttpResponseFor<SubscriptionImportResponse> =
            import_(params, RequestOptions.none())

        /** @see import_ */
        @MustBeClosed
        fun import_(
            params: SubscriptionImportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionImportResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/migrate`, but is
         * otherwise the same as [SubscriptionService.migrate].
         */
        @MustBeClosed
        fun migrate(id: String): HttpResponseFor<Subscription> =
            migrate(id, SubscriptionMigrateParams.none())

        /** @see migrate */
        @MustBeClosed
        fun migrate(
            id: String,
            params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription> =
            migrate(params.toBuilder().id(id).build(), requestOptions)

        /** @see migrate */
        @MustBeClosed
        fun migrate(
            id: String,
            params: SubscriptionMigrateParams = SubscriptionMigrateParams.none(),
        ): HttpResponseFor<Subscription> = migrate(id, params, RequestOptions.none())

        /** @see migrate */
        @MustBeClosed
        fun migrate(
            params: SubscriptionMigrateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /** @see migrate */
        @MustBeClosed
        fun migrate(params: SubscriptionMigrateParams): HttpResponseFor<Subscription> =
            migrate(params, RequestOptions.none())

        /** @see migrate */
        @MustBeClosed
        fun migrate(id: String, requestOptions: RequestOptions): HttpResponseFor<Subscription> =
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
         * Returns a raw HTTP response for `post /api/v1/subscriptions`, but is otherwise the same
         * as [SubscriptionService.provision].
         */
        @MustBeClosed
        fun provision(
            params: SubscriptionProvisionParams
        ): HttpResponseFor<SubscriptionProvisionResponse> = provision(params, RequestOptions.none())

        /** @see provision */
        @MustBeClosed
        fun provision(
            params: SubscriptionProvisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionProvisionResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/transfer`, but is
         * otherwise the same as [SubscriptionService.transfer].
         */
        @MustBeClosed
        fun transfer(
            id: String,
            params: SubscriptionTransferParams,
        ): HttpResponseFor<Subscription> = transfer(id, params, RequestOptions.none())

        /** @see transfer */
        @MustBeClosed
        fun transfer(
            id: String,
            params: SubscriptionTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription> =
            transfer(params.toBuilder().id(id).build(), requestOptions)

        /** @see transfer */
        @MustBeClosed
        fun transfer(params: SubscriptionTransferParams): HttpResponseFor<Subscription> =
            transfer(params, RequestOptions.none())

        /** @see transfer */
        @MustBeClosed
        fun transfer(
            params: SubscriptionTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>
    }
}
