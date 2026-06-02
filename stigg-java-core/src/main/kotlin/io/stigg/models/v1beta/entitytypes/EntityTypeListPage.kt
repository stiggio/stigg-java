// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.entitytypes

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1beta.EntityTypeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EntityTypeService.list */
class EntityTypeListPage
private constructor(
    private val service: EntityTypeService,
    private val params: EntityTypeListParams,
    private val response: EntityTypeListPageResponse,
) : Page<EntityTypeListResponse> {

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

    override fun nextPage(): EntityTypeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EntityTypeListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EntityTypeListParams = params

    /** The response that this page was parsed from. */
    fun response(): EntityTypeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntityTypeListPage].
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

    /** A builder for [EntityTypeListPage]. */
    class Builder internal constructor() {

        private var service: EntityTypeService? = null
        private var params: EntityTypeListParams? = null
        private var response: EntityTypeListPageResponse? = null

        @JvmSynthetic
        internal fun from(entityTypeListPage: EntityTypeListPage) = apply {
            service = entityTypeListPage.service
            params = entityTypeListPage.params
            response = entityTypeListPage.response
        }

        fun service(service: EntityTypeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EntityTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EntityTypeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EntityTypeListPage].
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
        fun build(): EntityTypeListPage =
            EntityTypeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityTypeListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EntityTypeListPage{service=$service, params=$params, response=$response}"
}
