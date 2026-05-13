// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits.grants

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.events.credits.GrantService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see GrantService.list */
class GrantListPage
private constructor(
    private val service: GrantService,
    private val params: GrantListParams,
    private val response: GrantListPageResponse,
) : Page<GrantListResponse> {

    /**
     * Delegates to [GrantListPageResponse], but gracefully handles missing data.
     *
     * @see GrantListPageResponse.data
     */
    fun data(): List<GrantListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [GrantListPageResponse], but gracefully handles missing data.
     *
     * @see GrantListPageResponse.pagination
     */
    fun pagination(): Optional<GrantListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<GrantListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): GrantListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): GrantListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GrantListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GrantListParams = params

    /** The response that this page was parsed from. */
    fun response(): GrantListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GrantListPage].
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

    /** A builder for [GrantListPage]. */
    class Builder internal constructor() {

        private var service: GrantService? = null
        private var params: GrantListParams? = null
        private var response: GrantListPageResponse? = null

        @JvmSynthetic
        internal fun from(grantListPage: GrantListPage) = apply {
            service = grantListPage.service
            params = grantListPage.params
            response = grantListPage.response
        }

        fun service(service: GrantService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GrantListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: GrantListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [GrantListPage].
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
        fun build(): GrantListPage =
            GrantListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GrantListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "GrantListPage{service=$service, params=$params, response=$response}"
}
