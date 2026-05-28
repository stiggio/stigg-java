// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.AddonService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AddonService.listCharges */
class AddonListChargesPage
private constructor(
    private val service: AddonService,
    private val params: AddonListChargesParams,
    private val response: AddonListChargesPageResponse,
) : Page<AddonListChargesResponse> {

    /**
     * Delegates to [AddonListChargesPageResponse], but gracefully handles missing data.
     *
     * @see AddonListChargesPageResponse.data
     */
    fun data(): List<AddonListChargesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AddonListChargesPageResponse], but gracefully handles missing data.
     *
     * @see AddonListChargesPageResponse.pagination
     */
    fun pagination(): Optional<AddonListChargesPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<AddonListChargesResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): AddonListChargesParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): AddonListChargesPage = service.listCharges(nextPageParams())

    fun autoPager(): AutoPager<AddonListChargesResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AddonListChargesParams = params

    /** The response that this page was parsed from. */
    fun response(): AddonListChargesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AddonListChargesPage].
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

    /** A builder for [AddonListChargesPage]. */
    class Builder internal constructor() {

        private var service: AddonService? = null
        private var params: AddonListChargesParams? = null
        private var response: AddonListChargesPageResponse? = null

        @JvmSynthetic
        internal fun from(addonListChargesPage: AddonListChargesPage) = apply {
            service = addonListChargesPage.service
            params = addonListChargesPage.params
            response = addonListChargesPage.response
        }

        fun service(service: AddonService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AddonListChargesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AddonListChargesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AddonListChargesPage].
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
        fun build(): AddonListChargesPage =
            AddonListChargesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AddonListChargesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AddonListChargesPage{service=$service, params=$params, response=$response}"
}
