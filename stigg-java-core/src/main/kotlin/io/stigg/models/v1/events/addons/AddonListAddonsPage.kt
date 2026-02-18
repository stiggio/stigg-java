// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.events.AddonService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AddonService.listAddons */
class AddonListAddonsPage
private constructor(
    private val service: AddonService,
    private val params: AddonListAddonsParams,
    private val response: AddonListAddonsPageResponse,
) : Page<AddonListAddonsResponse> {

    /**
     * Delegates to [AddonListAddonsPageResponse], but gracefully handles missing data.
     *
     * @see AddonListAddonsPageResponse.data
     */
    fun data(): List<AddonListAddonsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AddonListAddonsPageResponse], but gracefully handles missing data.
     *
     * @see AddonListAddonsPageResponse.pagination
     */
    fun pagination(): Optional<AddonListAddonsPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<AddonListAddonsResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): AddonListAddonsParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): AddonListAddonsPage = service.listAddons(nextPageParams())

    fun autoPager(): AutoPager<AddonListAddonsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AddonListAddonsParams = params

    /** The response that this page was parsed from. */
    fun response(): AddonListAddonsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AddonListAddonsPage].
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

    /** A builder for [AddonListAddonsPage]. */
    class Builder internal constructor() {

        private var service: AddonService? = null
        private var params: AddonListAddonsParams? = null
        private var response: AddonListAddonsPageResponse? = null

        @JvmSynthetic
        internal fun from(addonListAddonsPage: AddonListAddonsPage) = apply {
            service = addonListAddonsPage.service
            params = addonListAddonsPage.params
            response = addonListAddonsPage.response
        }

        fun service(service: AddonService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AddonListAddonsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AddonListAddonsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AddonListAddonsPage].
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
        fun build(): AddonListAddonsPage =
            AddonListAddonsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AddonListAddonsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AddonListAddonsPage{service=$service, params=$params, response=$response}"
}
