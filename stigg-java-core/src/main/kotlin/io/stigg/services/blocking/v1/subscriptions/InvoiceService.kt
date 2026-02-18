// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.subscriptions

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.subscriptions.invoice.InvoiceMarkAsPaidParams
import io.stigg.models.v1.subscriptions.invoice.InvoiceMarkAsPaidResponse
import java.util.function.Consumer

interface InvoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceService

    /**
     * Marks the latest invoice of a subscription as paid in the billing provider. The invoice must
     * exist and have an OPEN status.
     */
    fun markAsPaid(id: String): InvoiceMarkAsPaidResponse =
        markAsPaid(id, InvoiceMarkAsPaidParams.none())

    /** @see markAsPaid */
    fun markAsPaid(
        id: String,
        params: InvoiceMarkAsPaidParams = InvoiceMarkAsPaidParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceMarkAsPaidResponse = markAsPaid(params.toBuilder().id(id).build(), requestOptions)

    /** @see markAsPaid */
    fun markAsPaid(
        id: String,
        params: InvoiceMarkAsPaidParams = InvoiceMarkAsPaidParams.none(),
    ): InvoiceMarkAsPaidResponse = markAsPaid(id, params, RequestOptions.none())

    /** @see markAsPaid */
    fun markAsPaid(
        params: InvoiceMarkAsPaidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceMarkAsPaidResponse

    /** @see markAsPaid */
    fun markAsPaid(params: InvoiceMarkAsPaidParams): InvoiceMarkAsPaidResponse =
        markAsPaid(params, RequestOptions.none())

    /** @see markAsPaid */
    fun markAsPaid(id: String, requestOptions: RequestOptions): InvoiceMarkAsPaidResponse =
        markAsPaid(id, InvoiceMarkAsPaidParams.none(), requestOptions)

    /** A view of [InvoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/invoice/paid`, but is
         * otherwise the same as [InvoiceService.markAsPaid].
         */
        @MustBeClosed
        fun markAsPaid(id: String): HttpResponseFor<InvoiceMarkAsPaidResponse> =
            markAsPaid(id, InvoiceMarkAsPaidParams.none())

        /** @see markAsPaid */
        @MustBeClosed
        fun markAsPaid(
            id: String,
            params: InvoiceMarkAsPaidParams = InvoiceMarkAsPaidParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceMarkAsPaidResponse> =
            markAsPaid(params.toBuilder().id(id).build(), requestOptions)

        /** @see markAsPaid */
        @MustBeClosed
        fun markAsPaid(
            id: String,
            params: InvoiceMarkAsPaidParams = InvoiceMarkAsPaidParams.none(),
        ): HttpResponseFor<InvoiceMarkAsPaidResponse> =
            markAsPaid(id, params, RequestOptions.none())

        /** @see markAsPaid */
        @MustBeClosed
        fun markAsPaid(
            params: InvoiceMarkAsPaidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceMarkAsPaidResponse>

        /** @see markAsPaid */
        @MustBeClosed
        fun markAsPaid(
            params: InvoiceMarkAsPaidParams
        ): HttpResponseFor<InvoiceMarkAsPaidResponse> = markAsPaid(params, RequestOptions.none())

        /** @see markAsPaid */
        @MustBeClosed
        fun markAsPaid(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceMarkAsPaidResponse> =
            markAsPaid(id, InvoiceMarkAsPaidParams.none(), requestOptions)
    }
}
