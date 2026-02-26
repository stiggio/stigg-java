// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.features

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.services.async.v1.FeatureServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see FeatureServiceAsync.listFeatures */
class FeatureListFeaturesPageAsync
private constructor(
    private val service: FeatureServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FeatureListFeaturesParams,
    private val response: FeatureListFeaturesPageResponse,
) : PageAsync<FeatureListFeaturesResponse> {

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

    override fun nextPage(): CompletableFuture<FeatureListFeaturesPageAsync> =
        service.listFeatures(nextPageParams())

    fun autoPager(): AutoPagerAsync<FeatureListFeaturesResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FeatureListFeaturesParams = params

    /** The response that this page was parsed from. */
    fun response(): FeatureListFeaturesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FeatureListFeaturesPageAsync].
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

    /** A builder for [FeatureListFeaturesPageAsync]. */
    class Builder internal constructor() {

        private var service: FeatureServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FeatureListFeaturesParams? = null
        private var response: FeatureListFeaturesPageResponse? = null

        @JvmSynthetic
        internal fun from(featureListFeaturesPageAsync: FeatureListFeaturesPageAsync) = apply {
            service = featureListFeaturesPageAsync.service
            streamHandlerExecutor = featureListFeaturesPageAsync.streamHandlerExecutor
            params = featureListFeaturesPageAsync.params
            response = featureListFeaturesPageAsync.response
        }

        fun service(service: FeatureServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FeatureListFeaturesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FeatureListFeaturesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FeatureListFeaturesPageAsync].
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
        fun build(): FeatureListFeaturesPageAsync =
            FeatureListFeaturesPageAsync(
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

        return other is FeatureListFeaturesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FeatureListFeaturesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
