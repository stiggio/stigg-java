// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.internal_.beta

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.internal_.beta.eventqueues.EventQueueDeleteParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueListParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueListResponse
import io.stigg.models.internal_.beta.eventqueues.EventQueueProvisionParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueResponse
import io.stigg.models.internal_.beta.eventqueues.EventQueueRetrieveParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EventQueueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventQueueServiceAsync

    /** Get event queue by queue name */
    fun retrieve(queueName: String): CompletableFuture<EventQueueResponse> =
        retrieve(queueName, EventQueueRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        queueName: String,
        params: EventQueueRetrieveParams = EventQueueRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventQueueResponse> =
        retrieve(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        queueName: String,
        params: EventQueueRetrieveParams = EventQueueRetrieveParams.none(),
    ): CompletableFuture<EventQueueResponse> = retrieve(queueName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EventQueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventQueueResponse>

    /** @see retrieve */
    fun retrieve(params: EventQueueRetrieveParams): CompletableFuture<EventQueueResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        queueName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventQueueResponse> =
        retrieve(queueName, EventQueueRetrieveParams.none(), requestOptions)

    /** Update event queue configuration */
    fun update(queueName: String): CompletableFuture<EventQueueResponse> =
        update(queueName, EventQueueUpdateParams.none())

    /** @see update */
    fun update(
        queueName: String,
        params: EventQueueUpdateParams = EventQueueUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventQueueResponse> =
        update(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see update */
    fun update(
        queueName: String,
        params: EventQueueUpdateParams = EventQueueUpdateParams.none(),
    ): CompletableFuture<EventQueueResponse> = update(queueName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EventQueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventQueueResponse>

    /** @see update */
    fun update(params: EventQueueUpdateParams): CompletableFuture<EventQueueResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        queueName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventQueueResponse> =
        update(queueName, EventQueueUpdateParams.none(), requestOptions)

    /** List all event queues for the current environment */
    fun list(): CompletableFuture<EventQueueListResponse> = list(EventQueueListParams.none())

    /** @see list */
    fun list(
        params: EventQueueListParams = EventQueueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventQueueListResponse>

    /** @see list */
    fun list(
        params: EventQueueListParams = EventQueueListParams.none()
    ): CompletableFuture<EventQueueListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventQueueListResponse> =
        list(EventQueueListParams.none(), requestOptions)

    /** Delete an event queue and tear down its infrastructure */
    fun delete(queueName: String): CompletableFuture<EventQueueResponse> =
        delete(queueName, EventQueueDeleteParams.none())

    /** @see delete */
    fun delete(
        queueName: String,
        params: EventQueueDeleteParams = EventQueueDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventQueueResponse> =
        delete(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see delete */
    fun delete(
        queueName: String,
        params: EventQueueDeleteParams = EventQueueDeleteParams.none(),
    ): CompletableFuture<EventQueueResponse> = delete(queueName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EventQueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventQueueResponse>

    /** @see delete */
    fun delete(params: EventQueueDeleteParams): CompletableFuture<EventQueueResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        queueName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventQueueResponse> =
        delete(queueName, EventQueueDeleteParams.none(), requestOptions)

    /** Provision SQS queue, SNS subscriptions, and IAM role for the current environment */
    fun provision(params: EventQueueProvisionParams): CompletableFuture<EventQueueResponse> =
        provision(params, RequestOptions.none())

    /** @see provision */
    fun provision(
        params: EventQueueProvisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventQueueResponse>

    /**
     * A view of [EventQueueServiceAsync] that provides access to raw HTTP responses for each
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
        ): EventQueueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /internal/beta/event-queues/{queueName}`, but is
         * otherwise the same as [EventQueueServiceAsync.retrieve].
         */
        fun retrieve(queueName: String): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            retrieve(queueName, EventQueueRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            queueName: String,
            params: EventQueueRetrieveParams = EventQueueRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            retrieve(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            queueName: String,
            params: EventQueueRetrieveParams = EventQueueRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            retrieve(queueName, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EventQueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EventQueueRetrieveParams
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            queueName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            retrieve(queueName, EventQueueRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /internal/beta/event-queues/{queueName}`, but is
         * otherwise the same as [EventQueueServiceAsync.update].
         */
        fun update(queueName: String): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            update(queueName, EventQueueUpdateParams.none())

        /** @see update */
        fun update(
            queueName: String,
            params: EventQueueUpdateParams = EventQueueUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            update(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see update */
        fun update(
            queueName: String,
            params: EventQueueUpdateParams = EventQueueUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            update(queueName, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EventQueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>>

        /** @see update */
        fun update(
            params: EventQueueUpdateParams
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            queueName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            update(queueName, EventQueueUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /internal/beta/event-queues`, but is otherwise the
         * same as [EventQueueServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EventQueueListResponse>> =
            list(EventQueueListParams.none())

        /** @see list */
        fun list(
            params: EventQueueListParams = EventQueueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventQueueListResponse>>

        /** @see list */
        fun list(
            params: EventQueueListParams = EventQueueListParams.none()
        ): CompletableFuture<HttpResponseFor<EventQueueListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventQueueListResponse>> =
            list(EventQueueListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /internal/beta/event-queues/{queueName}`, but is
         * otherwise the same as [EventQueueServiceAsync.delete].
         */
        fun delete(queueName: String): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            delete(queueName, EventQueueDeleteParams.none())

        /** @see delete */
        fun delete(
            queueName: String,
            params: EventQueueDeleteParams = EventQueueDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            delete(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see delete */
        fun delete(
            queueName: String,
            params: EventQueueDeleteParams = EventQueueDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            delete(queueName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EventQueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>>

        /** @see delete */
        fun delete(
            params: EventQueueDeleteParams
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            queueName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            delete(queueName, EventQueueDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /internal/beta/event-queues/provision`, but is
         * otherwise the same as [EventQueueServiceAsync.provision].
         */
        fun provision(
            params: EventQueueProvisionParams
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>> =
            provision(params, RequestOptions.none())

        /** @see provision */
        fun provision(
            params: EventQueueProvisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventQueueResponse>>
    }
}
