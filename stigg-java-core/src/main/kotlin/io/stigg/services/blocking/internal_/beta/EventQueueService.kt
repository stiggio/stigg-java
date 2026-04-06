// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.internal_.beta

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.internal_.beta.eventqueues.EventQueueDeleteParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueDeleteResponse
import io.stigg.models.internal_.beta.eventqueues.EventQueueListParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueListResponse
import io.stigg.models.internal_.beta.eventqueues.EventQueueProvisionParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueProvisionResponse
import io.stigg.models.internal_.beta.eventqueues.EventQueueRetrieveParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueRetrieveResponse
import io.stigg.models.internal_.beta.eventqueues.EventQueueUpdateParams
import io.stigg.models.internal_.beta.eventqueues.EventQueueUpdateResponse
import java.util.function.Consumer

interface EventQueueService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventQueueService

    /** Get event queue by queue name */
    fun retrieve(queueName: String): EventQueueRetrieveResponse =
        retrieve(queueName, EventQueueRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        queueName: String,
        params: EventQueueRetrieveParams = EventQueueRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventQueueRetrieveResponse =
        retrieve(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        queueName: String,
        params: EventQueueRetrieveParams = EventQueueRetrieveParams.none(),
    ): EventQueueRetrieveResponse = retrieve(queueName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EventQueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventQueueRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: EventQueueRetrieveParams): EventQueueRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(queueName: String, requestOptions: RequestOptions): EventQueueRetrieveResponse =
        retrieve(queueName, EventQueueRetrieveParams.none(), requestOptions)

    /** Update event queue configuration */
    fun update(queueName: String): EventQueueUpdateResponse =
        update(queueName, EventQueueUpdateParams.none())

    /** @see update */
    fun update(
        queueName: String,
        params: EventQueueUpdateParams = EventQueueUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventQueueUpdateResponse =
        update(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see update */
    fun update(
        queueName: String,
        params: EventQueueUpdateParams = EventQueueUpdateParams.none(),
    ): EventQueueUpdateResponse = update(queueName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EventQueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventQueueUpdateResponse

    /** @see update */
    fun update(params: EventQueueUpdateParams): EventQueueUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(queueName: String, requestOptions: RequestOptions): EventQueueUpdateResponse =
        update(queueName, EventQueueUpdateParams.none(), requestOptions)

    /** List all event queues for the current environment */
    fun list(): EventQueueListResponse = list(EventQueueListParams.none())

    /** @see list */
    fun list(
        params: EventQueueListParams = EventQueueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventQueueListResponse

    /** @see list */
    fun list(params: EventQueueListParams = EventQueueListParams.none()): EventQueueListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EventQueueListResponse =
        list(EventQueueListParams.none(), requestOptions)

    /** Delete an event queue and tear down its infrastructure */
    fun delete(queueName: String): EventQueueDeleteResponse =
        delete(queueName, EventQueueDeleteParams.none())

    /** @see delete */
    fun delete(
        queueName: String,
        params: EventQueueDeleteParams = EventQueueDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventQueueDeleteResponse =
        delete(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see delete */
    fun delete(
        queueName: String,
        params: EventQueueDeleteParams = EventQueueDeleteParams.none(),
    ): EventQueueDeleteResponse = delete(queueName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EventQueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventQueueDeleteResponse

    /** @see delete */
    fun delete(params: EventQueueDeleteParams): EventQueueDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(queueName: String, requestOptions: RequestOptions): EventQueueDeleteResponse =
        delete(queueName, EventQueueDeleteParams.none(), requestOptions)

    /** Provision SQS queue, SNS subscriptions, and IAM role for the current environment */
    fun provision(params: EventQueueProvisionParams): EventQueueProvisionResponse =
        provision(params, RequestOptions.none())

    /** @see provision */
    fun provision(
        params: EventQueueProvisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventQueueProvisionResponse

    /** A view of [EventQueueService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventQueueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /internal/beta/event-queues/{queueName}`, but is
         * otherwise the same as [EventQueueService.retrieve].
         */
        @MustBeClosed
        fun retrieve(queueName: String): HttpResponseFor<EventQueueRetrieveResponse> =
            retrieve(queueName, EventQueueRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            queueName: String,
            params: EventQueueRetrieveParams = EventQueueRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventQueueRetrieveResponse> =
            retrieve(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            queueName: String,
            params: EventQueueRetrieveParams = EventQueueRetrieveParams.none(),
        ): HttpResponseFor<EventQueueRetrieveResponse> =
            retrieve(queueName, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EventQueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventQueueRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EventQueueRetrieveParams
        ): HttpResponseFor<EventQueueRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            queueName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventQueueRetrieveResponse> =
            retrieve(queueName, EventQueueRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /internal/beta/event-queues/{queueName}`, but is
         * otherwise the same as [EventQueueService.update].
         */
        @MustBeClosed
        fun update(queueName: String): HttpResponseFor<EventQueueUpdateResponse> =
            update(queueName, EventQueueUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            queueName: String,
            params: EventQueueUpdateParams = EventQueueUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventQueueUpdateResponse> =
            update(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            queueName: String,
            params: EventQueueUpdateParams = EventQueueUpdateParams.none(),
        ): HttpResponseFor<EventQueueUpdateResponse> =
            update(queueName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EventQueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventQueueUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: EventQueueUpdateParams): HttpResponseFor<EventQueueUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            queueName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventQueueUpdateResponse> =
            update(queueName, EventQueueUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /internal/beta/event-queues`, but is otherwise the
         * same as [EventQueueService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EventQueueListResponse> = list(EventQueueListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EventQueueListParams = EventQueueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventQueueListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EventQueueListParams = EventQueueListParams.none()
        ): HttpResponseFor<EventQueueListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventQueueListResponse> =
            list(EventQueueListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /internal/beta/event-queues/{queueName}`, but is
         * otherwise the same as [EventQueueService.delete].
         */
        @MustBeClosed
        fun delete(queueName: String): HttpResponseFor<EventQueueDeleteResponse> =
            delete(queueName, EventQueueDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueName: String,
            params: EventQueueDeleteParams = EventQueueDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventQueueDeleteResponse> =
            delete(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueName: String,
            params: EventQueueDeleteParams = EventQueueDeleteParams.none(),
        ): HttpResponseFor<EventQueueDeleteResponse> =
            delete(queueName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EventQueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventQueueDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: EventQueueDeleteParams): HttpResponseFor<EventQueueDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventQueueDeleteResponse> =
            delete(queueName, EventQueueDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /internal/beta/event-queues/provision`, but is
         * otherwise the same as [EventQueueService.provision].
         */
        @MustBeClosed
        fun provision(
            params: EventQueueProvisionParams
        ): HttpResponseFor<EventQueueProvisionResponse> = provision(params, RequestOptions.none())

        /** @see provision */
        @MustBeClosed
        fun provision(
            params: EventQueueProvisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventQueueProvisionResponse>
    }
}
