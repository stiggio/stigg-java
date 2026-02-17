// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.features

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.events.FeatureService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see FeatureService.listFeatures */
class FeatureListFeaturesPage
private constructor(
    private val service: FeatureService,
    private val params: FeatureListFeaturesParams,
    private val response: FeatureListFeaturesPageResponse,
) : Page<FeatureListFeaturesResponse> {

    /**
     * Delegates to [FeatureListFeaturesPageResponse], but gracefully handles missing data.
     *
     * @see FeatureListFeaturesPageResponse.data
     */
    fun data(): List<FeatureListFeaturesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FeatureListFeaturesPageResponse], but gracefully handles missing data.
     *
     * @see FeatureListFeaturesPageResponse.pagination
     */
    fun pagination(): Optional<FeatureListFeaturesPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<FeatureListFeaturesResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): FeatureListFeaturesParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): FeatureListFeaturesPage = service.listFeatures(nextPageParams())

    fun autoPager(): AutoPager<FeatureListFeaturesResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FeatureListFeaturesParams = params

    /** The response that this page was parsed from. */
    fun response(): FeatureListFeaturesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FeatureListFeaturesPage].
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

    /** A builder for [FeatureListFeaturesPage]. */
    class Builder internal constructor() {

        private var service: FeatureService? = null
        private var params: FeatureListFeaturesParams? = null
        private var response: FeatureListFeaturesPageResponse? = null

        @JvmSynthetic
        internal fun from(featureListFeaturesPage: FeatureListFeaturesPage) = apply {
            service = featureListFeaturesPage.service
            params = featureListFeaturesPage.params
            response = featureListFeaturesPage.response
        }

        fun service(service: FeatureService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FeatureListFeaturesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FeatureListFeaturesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FeatureListFeaturesPage].
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
        fun build(): FeatureListFeaturesPage =
            FeatureListFeaturesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeatureListFeaturesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FeatureListFeaturesPage{service=$service, params=$params, response=$response}"
}
