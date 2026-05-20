// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits.customcurrencies

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.services.async.v1.events.credits.CustomCurrencyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CustomCurrencyServiceAsync.list */
class CustomCurrencyListPageAsync
private constructor(
    private val service: CustomCurrencyServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomCurrencyListParams,
    private val response: CustomCurrencyListPageResponse,
) : PageAsync<CustomCurrencyListResponse> {

    /**
     * Delegates to [CustomCurrencyListPageResponse], but gracefully handles missing data.
     *
     * @see CustomCurrencyListPageResponse.data
     */
    fun data(): List<CustomCurrencyListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomCurrencyListPageResponse], but gracefully handles missing data.
     *
     * @see CustomCurrencyListPageResponse.pagination
     */
    fun pagination(): Optional<CustomCurrencyListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<CustomCurrencyListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): CustomCurrencyListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CustomCurrencyListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomCurrencyListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomCurrencyListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomCurrencyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomCurrencyListPageAsync].
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

    /** A builder for [CustomCurrencyListPageAsync]. */
    class Builder internal constructor() {

        private var service: CustomCurrencyServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomCurrencyListParams? = null
        private var response: CustomCurrencyListPageResponse? = null

        @JvmSynthetic
        internal fun from(customCurrencyListPageAsync: CustomCurrencyListPageAsync) = apply {
            service = customCurrencyListPageAsync.service
            streamHandlerExecutor = customCurrencyListPageAsync.streamHandlerExecutor
            params = customCurrencyListPageAsync.params
            response = customCurrencyListPageAsync.response
        }

        fun service(service: CustomCurrencyServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomCurrencyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomCurrencyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomCurrencyListPageAsync].
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
        fun build(): CustomCurrencyListPageAsync =
            CustomCurrencyListPageAsync(
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

        return other is CustomCurrencyListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CustomCurrencyListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
