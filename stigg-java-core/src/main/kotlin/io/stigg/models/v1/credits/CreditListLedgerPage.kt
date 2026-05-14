// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.CreditService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CreditService.listLedger */
class CreditListLedgerPage
private constructor(
    private val service: CreditService,
    private val params: CreditListLedgerParams,
    private val response: CreditListLedgerPageResponse,
) : Page<CreditListLedgerResponse> {

    /**
     * Delegates to [CreditListLedgerPageResponse], but gracefully handles missing data.
     *
     * @see CreditListLedgerPageResponse.data
     */
    fun data(): List<CreditListLedgerResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CreditListLedgerPageResponse], but gracefully handles missing data.
     *
     * @see CreditListLedgerPageResponse.pagination
     */
    fun pagination(): Optional<CreditListLedgerPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<CreditListLedgerResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): CreditListLedgerParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CreditListLedgerPage = service.listLedger(nextPageParams())

    fun autoPager(): AutoPager<CreditListLedgerResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CreditListLedgerParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditListLedgerPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditListLedgerPage].
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

    /** A builder for [CreditListLedgerPage]. */
    class Builder internal constructor() {

        private var service: CreditService? = null
        private var params: CreditListLedgerParams? = null
        private var response: CreditListLedgerPageResponse? = null

        @JvmSynthetic
        internal fun from(creditListLedgerPage: CreditListLedgerPage) = apply {
            service = creditListLedgerPage.service
            params = creditListLedgerPage.params
            response = creditListLedgerPage.response
        }

        fun service(service: CreditService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CreditListLedgerParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditListLedgerPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditListLedgerPage].
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
        fun build(): CreditListLedgerPage =
            CreditListLedgerPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditListLedgerPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CreditListLedgerPage{service=$service, params=$params, response=$response}"
}
