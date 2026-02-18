// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.plans

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.events.PlanService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PlanService.list */
class PlanListPage
private constructor(
    private val service: PlanService,
    private val params: PlanListParams,
    private val response: PlanListPageResponse,
) : Page<PlanListResponse> {

    /**
     * Delegates to [PlanListPageResponse], but gracefully handles missing data.
     *
     * @see PlanListPageResponse.data
     */
    fun data(): List<PlanListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanListPageResponse], but gracefully handles missing data.
     *
     * @see PlanListPageResponse.pagination
     */
    fun pagination(): Optional<PlanListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<PlanListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): PlanListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): PlanListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PlanListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanListPage].
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

    /** A builder for [PlanListPage]. */
    class Builder internal constructor() {

        private var service: PlanService? = null
        private var params: PlanListParams? = null
        private var response: PlanListPageResponse? = null

        @JvmSynthetic
        internal fun from(planListPage: PlanListPage) = apply {
            service = planListPage.service
            params = planListPage.params
            response = planListPage.response
        }

        fun service(service: PlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanListPage].
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
        fun build(): PlanListPage =
            PlanListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "PlanListPage{service=$service, params=$params, response=$response}"
}
