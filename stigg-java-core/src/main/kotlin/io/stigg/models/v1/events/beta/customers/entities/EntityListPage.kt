// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.customers.entities

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.events.beta.customers.EntityService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EntityService.list */
class EntityListPage
private constructor(
    private val service: EntityService,
    private val params: EntityListParams,
    private val response: EntityListPageResponse,
) : Page<EntityListResponse> {

    /**
     * Delegates to [EntityListPageResponse], but gracefully handles missing data.
     *
     * @see EntityListPageResponse.data
     */
    fun data(): List<EntityListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EntityListPageResponse], but gracefully handles missing data.
     *
     * @see EntityListPageResponse.pagination
     */
    fun pagination(): Optional<EntityListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<EntityListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): EntityListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): EntityListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EntityListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EntityListParams = params

    /** The response that this page was parsed from. */
    fun response(): EntityListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntityListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntityListPage]. */
    class Builder internal constructor() {

        private var service: EntityService? = null
        private var params: EntityListParams? = null
        private var response: EntityListPageResponse? = null

        @JvmSynthetic
        internal fun from(entityListPage: EntityListPage) = apply {
            service = entityListPage.service
            params = entityListPage.params
            response = entityListPage.response
        }

        fun service(service: EntityService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EntityListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EntityListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EntityListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntityListPage =
            EntityListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "EntityListPage{service=$service, params=$params, response=$response}"
}
