// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.PlanService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PlanService.listOverageCharges */
class PlanListOverageChargesPage
private constructor(
    private val service: PlanService,
    private val params: PlanListOverageChargesParams,
    private val response: PlanListOverageChargesPageResponse,
) : Page<PlanListOverageChargesResponse> {

    /**
     * Delegates to [PlanListOverageChargesPageResponse], but gracefully handles missing data.
     *
     * @see PlanListOverageChargesPageResponse.data
     */
    fun data(): List<PlanListOverageChargesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanListOverageChargesPageResponse], but gracefully handles missing data.
     *
     * @see PlanListOverageChargesPageResponse.pagination
     */
    fun pagination(): Optional<PlanListOverageChargesPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<PlanListOverageChargesResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): PlanListOverageChargesParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): PlanListOverageChargesPage =
        service.listOverageCharges(nextPageParams())

    fun autoPager(): AutoPager<PlanListOverageChargesResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanListOverageChargesParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanListOverageChargesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanListOverageChargesPage].
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

    /** A builder for [PlanListOverageChargesPage]. */
    class Builder internal constructor() {

        private var service: PlanService? = null
        private var params: PlanListOverageChargesParams? = null
        private var response: PlanListOverageChargesPageResponse? = null

        @JvmSynthetic
        internal fun from(planListOverageChargesPage: PlanListOverageChargesPage) = apply {
            service = planListOverageChargesPage.service
            params = planListOverageChargesPage.params
            response = planListOverageChargesPage.response
        }

        fun service(service: PlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListOverageChargesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanListOverageChargesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PlanListOverageChargesPage].
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
        fun build(): PlanListOverageChargesPage =
            PlanListOverageChargesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListOverageChargesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PlanListOverageChargesPage{service=$service, params=$params, response=$response}"
}
