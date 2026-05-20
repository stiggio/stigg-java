// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.customcurrencies

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.credits.CustomCurrencyService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CustomCurrencyService.list */
class CustomCurrencyListPage
private constructor(
    private val service: CustomCurrencyService,
    private val params: CustomCurrencyListParams,
    private val response: CustomCurrencyListPageResponse,
) : Page<CustomCurrencyListResponse> {

    /**
     * Delegates to [CustomCurrencyListPageResponse], but gracefully handles missing data.
     *
     * @see CustomCurrencyListPageResponse.data
     */
    fun data(): List<CustomCurrencyListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomCurrencyListPageResponse], but gracefully handles missing data.
     *
     * @see CustomCurrencyListPageResponse.pagination
     */
    fun pagination(): Optional<CustomCurrencyListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<CustomCurrencyListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): CustomCurrencyListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CustomCurrencyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CustomCurrencyListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomCurrencyListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomCurrencyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomCurrencyListPage].
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

    /** A builder for [CustomCurrencyListPage]. */
    class Builder internal constructor() {

        private var service: CustomCurrencyService? = null
        private var params: CustomCurrencyListParams? = null
        private var response: CustomCurrencyListPageResponse? = null

        @JvmSynthetic
        internal fun from(customCurrencyListPage: CustomCurrencyListPage) = apply {
            service = customCurrencyListPage.service
            params = customCurrencyListPage.params
            response = customCurrencyListPage.response
        }

        fun service(service: CustomCurrencyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomCurrencyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomCurrencyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomCurrencyListPage].
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
        fun build(): CustomCurrencyListPage =
            CustomCurrencyListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomCurrencyListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomCurrencyListPage{service=$service, params=$params, response=$response}"
}
