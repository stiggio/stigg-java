// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.assignments

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.services.async.v1beta.customers.AssignmentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AssignmentServiceAsync.list */
class AssignmentListPageAsync
private constructor(
    private val service: AssignmentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AssignmentListParams,
    private val response: AssignmentListPageResponse,
) : PageAsync<AssignmentListResponse> {

    /**
     * Delegates to [AssignmentListPageResponse], but gracefully handles missing data.
     *
     * @see AssignmentListPageResponse.data
     */
    fun data(): List<AssignmentListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AssignmentListPageResponse], but gracefully handles missing data.
     *
     * @see AssignmentListPageResponse.pagination
     */
    fun pagination(): Optional<AssignmentListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<AssignmentListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): AssignmentListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AssignmentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AssignmentListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AssignmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): AssignmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AssignmentListPageAsync].
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

    /** A builder for [AssignmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: AssignmentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AssignmentListParams? = null
        private var response: AssignmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(assignmentListPageAsync: AssignmentListPageAsync) = apply {
            service = assignmentListPageAsync.service
            streamHandlerExecutor = assignmentListPageAsync.streamHandlerExecutor
            params = assignmentListPageAsync.params
            response = assignmentListPageAsync.response
        }

        fun service(service: AssignmentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AssignmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AssignmentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AssignmentListPageAsync].
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
        fun build(): AssignmentListPageAsync =
            AssignmentListPageAsync(
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

        return other is AssignmentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AssignmentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
