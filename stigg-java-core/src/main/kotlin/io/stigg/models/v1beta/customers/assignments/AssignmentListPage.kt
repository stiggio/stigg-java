// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.assignments

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1beta.customers.AssignmentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AssignmentService.list */
class AssignmentListPage
private constructor(
    private val service: AssignmentService,
    private val params: AssignmentListParams,
    private val response: AssignmentListPageResponse,
) : Page<AssignmentListResponse> {

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

    override fun nextPage(): AssignmentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AssignmentListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AssignmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): AssignmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AssignmentListPage].
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

    /** A builder for [AssignmentListPage]. */
    class Builder internal constructor() {

        private var service: AssignmentService? = null
        private var params: AssignmentListParams? = null
        private var response: AssignmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(assignmentListPage: AssignmentListPage) = apply {
            service = assignmentListPage.service
            params = assignmentListPage.params
            response = assignmentListPage.response
        }

        fun service(service: AssignmentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AssignmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AssignmentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AssignmentListPage].
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
        fun build(): AssignmentListPage =
            AssignmentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssignmentListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AssignmentListPage{service=$service, params=$params, response=$response}"
}
