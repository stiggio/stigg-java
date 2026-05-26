// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.models.v1.addons.ChargeList
import io.stigg.services.async.v1.PlanServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PlanServiceAsync.listOverageCharges */
class PlanListOverageChargesPageAsync
private constructor(
    private val service: PlanServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PlanListOverageChargesParams,
    private val response: ChargeList,
) : PageAsync<ChargeList.Data> {

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

    fun nextPageParams(): PlanListOverageChargesParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PlanListOverageChargesPageAsync> =
        service.listOverageCharges(nextPageParams())

    fun autoPager(): AutoPagerAsync<ChargeList.Data> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PlanListOverageChargesParams = params

    /** The response that this page was parsed from. */
    fun response(): ChargeList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PlanListOverageChargesPageAsync].
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

    /** A builder for [PlanListOverageChargesPageAsync]. */
    class Builder internal constructor() {

        private var service: PlanServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PlanListOverageChargesParams? = null
        private var response: ChargeList? = null

        @JvmSynthetic
        internal fun from(planListOverageChargesPageAsync: PlanListOverageChargesPageAsync) =
            apply {
                service = planListOverageChargesPageAsync.service
                streamHandlerExecutor = planListOverageChargesPageAsync.streamHandlerExecutor
                params = planListOverageChargesPageAsync.params
                response = planListOverageChargesPageAsync.response
            }

        fun service(service: PlanServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListOverageChargesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ChargeList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanListOverageChargesPageAsync].
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
        fun build(): PlanListOverageChargesPageAsync =
            PlanListOverageChargesPageAsync(
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

        return other is PlanListOverageChargesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PlanListOverageChargesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
