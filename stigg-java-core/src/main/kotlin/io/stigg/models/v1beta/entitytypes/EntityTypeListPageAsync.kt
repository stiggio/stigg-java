// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.entitytypes

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.services.async.v1beta.EntityTypeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EntityTypeServiceAsync.list */
class EntityTypeListPageAsync
private constructor(
    private val service: EntityTypeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EntityTypeListParams,
    private val response: EntityTypeListPageResponse,
) : PageAsync<EntityTypeListResponse> {

    /**
     * Delegates to [EntityTypeListPageResponse], but gracefully handles missing data.
     *
     * @see EntityTypeListPageResponse.data
     */
    fun data(): List<EntityTypeListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EntityTypeListPageResponse], but gracefully handles missing data.
     *
     * @see EntityTypeListPageResponse.pagination
     */
    fun pagination(): Optional<EntityTypeListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<EntityTypeListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): EntityTypeListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EntityTypeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EntityTypeListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EntityTypeListParams = params

    /** The response that this page was parsed from. */
    fun response(): EntityTypeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntityTypeListPageAsync].
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

    /** A builder for [EntityTypeListPageAsync]. */
    class Builder internal constructor() {

        private var service: EntityTypeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EntityTypeListParams? = null
        private var response: EntityTypeListPageResponse? = null

        @JvmSynthetic
        internal fun from(entityTypeListPageAsync: EntityTypeListPageAsync) = apply {
            service = entityTypeListPageAsync.service
            streamHandlerExecutor = entityTypeListPageAsync.streamHandlerExecutor
            params = entityTypeListPageAsync.params
            response = entityTypeListPageAsync.response
        }

        fun service(service: EntityTypeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EntityTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EntityTypeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EntityTypeListPageAsync].
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
        fun build(): EntityTypeListPageAsync =
            EntityTypeListPageAsync(
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

        return other is EntityTypeListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EntityTypeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
