// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers.usage

import com.stigg.api.core.Params
import com.stigg.api.core.checkRequired
import com.stigg.api.core.http.Headers
import com.stigg.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Perform retrieval on a Usage history */
class UsageRetrieveParams
private constructor(
    private val customerId: String,
    private val featureId: String?,
    private val startDate: OffsetDateTime,
    private val endDate: OffsetDateTime?,
    private val groupBy: String?,
    private val resourceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    fun featureId(): Optional<String> = Optional.ofNullable(featureId)

    /** The start date of the range */
    fun startDate(): OffsetDateTime = startDate

    /** The end date of the range */
    fun endDate(): Optional<OffsetDateTime> = Optional.ofNullable(endDate)

    fun groupBy(): Optional<String> = Optional.ofNullable(groupBy)

    /** Resource id */
    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .startDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageRetrieveParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var featureId: String? = null
        private var startDate: OffsetDateTime? = null
        private var endDate: OffsetDateTime? = null
        private var groupBy: String? = null
        private var resourceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageRetrieveParams: UsageRetrieveParams) = apply {
            customerId = usageRetrieveParams.customerId
            featureId = usageRetrieveParams.featureId
            startDate = usageRetrieveParams.startDate
            endDate = usageRetrieveParams.endDate
            groupBy = usageRetrieveParams.groupBy
            resourceId = usageRetrieveParams.resourceId
            additionalHeaders = usageRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun featureId(featureId: String?) = apply { this.featureId = featureId }

        /** Alias for calling [Builder.featureId] with `featureId.orElse(null)`. */
        fun featureId(featureId: Optional<String>) = featureId(featureId.getOrNull())

        /** The start date of the range */
        fun startDate(startDate: OffsetDateTime) = apply { this.startDate = startDate }

        /** The end date of the range */
        fun endDate(endDate: OffsetDateTime?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

        fun groupBy(groupBy: String?) = apply { this.groupBy = groupBy }

        /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
        fun groupBy(groupBy: Optional<String>) = groupBy(groupBy.getOrNull())

        /** Resource id */
        fun resourceId(resourceId: String?) = apply { this.resourceId = resourceId }

        /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
        fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [UsageRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageRetrieveParams =
            UsageRetrieveParams(
                checkRequired("customerId", customerId),
                featureId,
                checkRequired("startDate", startDate),
                endDate,
                groupBy,
                resourceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId
            1 -> featureId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("startDate", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(startDate))
                endDate?.let { put("endDate", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                groupBy?.let { put("groupBy", it) }
                resourceId?.let { put("resourceId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageRetrieveParams &&
            customerId == other.customerId &&
            featureId == other.featureId &&
            startDate == other.startDate &&
            endDate == other.endDate &&
            groupBy == other.groupBy &&
            resourceId == other.resourceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            customerId,
            featureId,
            startDate,
            endDate,
            groupBy,
            resourceId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "UsageRetrieveParams{customerId=$customerId, featureId=$featureId, startDate=$startDate, endDate=$endDate, groupBy=$groupBy, resourceId=$resourceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
