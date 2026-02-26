// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.AddonService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AddonService.list */
class AddonListPage
private constructor(
    private val service: AddonService,
    private val params: AddonListParams,
    private val response: AddonListPageResponse,
) : Page<AddonListResponse> {

    /**
     * Delegates to [AddonListPageResponse], but gracefully handles missing data.
     *
     * @see AddonListPageResponse.data
     */
    fun data(): List<AddonListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AddonListPageResponse], but gracefully handles missing data.
     *
     * @see AddonListPageResponse.pagination
     */
    fun pagination(): Optional<AddonListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<AddonListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): AddonListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): AddonListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AddonListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AddonListParams = params

    /** The response that this page was parsed from. */
    fun response(): AddonListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AddonListPage].
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

    /** A builder for [AddonListPage]. */
    class Builder internal constructor() {

        private var service: AddonService? = null
        private var params: AddonListParams? = null
        private var response: AddonListPageResponse? = null

        @JvmSynthetic
        internal fun from(addonListPage: AddonListPage) = apply {
            service = addonListPage.service
            params = addonListPage.params
            response = addonListPage.response
        }

        fun service(service: AddonService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AddonListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AddonListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AddonListPage].
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
        fun build(): AddonListPage =
            AddonListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AddonListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "AddonListPage{service=$service, params=$params, response=$response}"
}
