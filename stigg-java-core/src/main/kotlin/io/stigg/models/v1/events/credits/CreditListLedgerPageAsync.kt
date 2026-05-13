// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.services.async.v1.events.CreditServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CreditServiceAsync.listLedger */
class CreditListLedgerPageAsync
private constructor(
    private val service: CreditServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CreditListLedgerParams,
    private val response: CreditListLedgerPageResponse,
) : PageAsync<CreditListLedgerResponse> {

    /**
     * Delegates to [CreditListLedgerPageResponse], but gracefully handles missing data.
     *
     * @see CreditListLedgerPageResponse.data
     */
    fun data(): List<CreditListLedgerResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CreditListLedgerPageResponse], but gracefully handles missing data.
     *
     * @see CreditListLedgerPageResponse.pagination
     */
    fun pagination(): Optional<CreditListLedgerPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<CreditListLedgerResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): CreditListLedgerParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CreditListLedgerPageAsync> =
        service.listLedger(nextPageParams())

    fun autoPager(): AutoPagerAsync<CreditListLedgerResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CreditListLedgerParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditListLedgerPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditListLedgerPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditListLedgerPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CreditListLedgerParams? = null
        private var response: CreditListLedgerPageResponse? = null

        @JvmSynthetic
        internal fun from(creditListLedgerPageAsync: CreditListLedgerPageAsync) = apply {
            service = creditListLedgerPageAsync.service
            streamHandlerExecutor = creditListLedgerPageAsync.streamHandlerExecutor
            params = creditListLedgerPageAsync.params
            response = creditListLedgerPageAsync.response
        }

        fun service(service: CreditServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CreditListLedgerParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditListLedgerPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditListLedgerPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditListLedgerPageAsync =
            CreditListLedgerPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditListLedgerPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CreditListLedgerPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
