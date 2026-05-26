// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.models.v1.addons.ChargeList
import io.stigg.services.blocking.v1.PlanService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PlanService.listCharges */
class PlanListChargesPage
private constructor(
    private val service: PlanService,
    private val params: PlanListChargesParams,
    private val response: ChargeList,
) : Page<ChargeList.Data> {

    /**
     * Delegates to [ChargeList], but gracefully handles missing data.
     *
     * @see ChargeList.data
     */
    fun data(): List<ChargeList.Data> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ChargeList], but gracefully handles missing data.
     *
     * @see ChargeList.pagination
     */
    fun pagination(): Optional<ChargeList.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<ChargeList.Data> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): PlanListChargesParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): PlanListChargesPage = service.listCharges(nextPageParams())

    fun autoPager(): AutoPager<ChargeList.Data> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanListChargesParams = params

    /** The response that this page was parsed from. */
    fun response(): ChargeList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanListChargesPage].
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

    /** A builder for [PlanListChargesPage]. */
    class Builder internal constructor() {

        private var service: PlanService? = null
        private var params: PlanListChargesParams? = null
        private var response: ChargeList? = null

        @JvmSynthetic
        internal fun from(planListChargesPage: PlanListChargesPage) = apply {
            service = planListChargesPage.service
            params = planListChargesPage.params
            response = planListChargesPage.response
        }

        fun service(service: PlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListChargesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ChargeList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanListChargesPage].
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
        fun build(): PlanListChargesPage =
            PlanListChargesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListChargesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PlanListChargesPage{service=$service, params=$params, response=$response}"
}
