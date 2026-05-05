// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits

import com.fasterxml.jackson.annotation.JsonCreator
import io.stigg.core.Enum
import io.stigg.core.JsonField
import io.stigg.core.Params
import io.stigg.core.checkRequired
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves credit usage time-series data for a customer, grouped by feature, over a specified time
 * range.
 */
class CreditGetUsageParams
private constructor(
    private val customerId: String,
    private val currencyId: String?,
    private val endDate: OffsetDateTime?,
    private val resourceId: String?,
    private val startDate: OffsetDateTime?,
    private val timeRange: TimeRange?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by customer ID (required) */
    fun customerId(): String = customerId

    /** Filter by currency ID */
    fun currencyId(): Optional<String> = Optional.ofNullable(currencyId)

    /**
     * End date for the credit usage time range (ISO 8601). Defaults to now when startDate is
     * provided
     */
    fun endDate(): Optional<OffsetDateTime> = Optional.ofNullable(endDate)

    /** Filter by resource ID */
    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId)

    /**
     * Start date for the credit usage time range (ISO 8601). Takes precedence over timeRange when
     * provided
     */
    fun startDate(): Optional<OffsetDateTime> = Optional.ofNullable(startDate)

    /**
     * Time range for usage data (LAST_DAY, LAST_WEEK, LAST_MONTH, LAST_YEAR). Defaults to
     * LAST_MONTH
     */
    fun timeRange(): Optional<TimeRange> = Optional.ofNullable(timeRange)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditGetUsageParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditGetUsageParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var currencyId: String? = null
        private var endDate: OffsetDateTime? = null
        private var resourceId: String? = null
        private var startDate: OffsetDateTime? = null
        private var timeRange: TimeRange? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(creditGetUsageParams: CreditGetUsageParams) = apply {
            customerId = creditGetUsageParams.customerId
            currencyId = creditGetUsageParams.currencyId
            endDate = creditGetUsageParams.endDate
            resourceId = creditGetUsageParams.resourceId
            startDate = creditGetUsageParams.startDate
            timeRange = creditGetUsageParams.timeRange
            additionalHeaders = creditGetUsageParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditGetUsageParams.additionalQueryParams.toBuilder()
        }

        /** Filter by customer ID (required) */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** Filter by currency ID */
        fun currencyId(currencyId: String?) = apply { this.currencyId = currencyId }

        /** Alias for calling [Builder.currencyId] with `currencyId.orElse(null)`. */
        fun currencyId(currencyId: Optional<String>) = currencyId(currencyId.getOrNull())

        /**
         * End date for the credit usage time range (ISO 8601). Defaults to now when startDate is
         * provided
         */
        fun endDate(endDate: OffsetDateTime?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

        /** Filter by resource ID */
        fun resourceId(resourceId: String?) = apply { this.resourceId = resourceId }

        /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
        fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

        /**
         * Start date for the credit usage time range (ISO 8601). Takes precedence over timeRange
         * when provided
         */
        fun startDate(startDate: OffsetDateTime?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<OffsetDateTime>) = startDate(startDate.getOrNull())

        /**
         * Time range for usage data (LAST_DAY, LAST_WEEK, LAST_MONTH, LAST_YEAR). Defaults to
         * LAST_MONTH
         */
        fun timeRange(timeRange: TimeRange?) = apply { this.timeRange = timeRange }

        /** Alias for calling [Builder.timeRange] with `timeRange.orElse(null)`. */
        fun timeRange(timeRange: Optional<TimeRange>) = timeRange(timeRange.getOrNull())

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
         * Returns an immutable instance of [CreditGetUsageParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditGetUsageParams =
            CreditGetUsageParams(
                checkRequired("customerId", customerId),
                currencyId,
                endDate,
                resourceId,
                startDate,
                timeRange,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("customerId", customerId)
                currencyId?.let { put("currencyId", it) }
                endDate?.let { put("endDate", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                resourceId?.let { put("resourceId", it) }
                startDate?.let {
                    put("startDate", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                timeRange?.let { put("timeRange", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Time range for usage data (LAST_DAY, LAST_WEEK, LAST_MONTH, LAST_YEAR). Defaults to
     * LAST_MONTH
     */
    class TimeRange @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LAST_DAY = of("LAST_DAY")

            @JvmField val LAST_WEEK = of("LAST_WEEK")

            @JvmField val LAST_MONTH = of("LAST_MONTH")

            @JvmField val LAST_YEAR = of("LAST_YEAR")

            @JvmStatic fun of(value: String) = TimeRange(JsonField.of(value))
        }

        /** An enum containing [TimeRange]'s known values. */
        enum class Known {
            LAST_DAY,
            LAST_WEEK,
            LAST_MONTH,
            LAST_YEAR,
        }

        /**
         * An enum containing [TimeRange]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TimeRange] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LAST_DAY,
            LAST_WEEK,
            LAST_MONTH,
            LAST_YEAR,
            /**
             * An enum member indicating that [TimeRange] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LAST_DAY -> Value.LAST_DAY
                LAST_WEEK -> Value.LAST_WEEK
                LAST_MONTH -> Value.LAST_MONTH
                LAST_YEAR -> Value.LAST_YEAR
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws StiggInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                LAST_DAY -> Known.LAST_DAY
                LAST_WEEK -> Known.LAST_WEEK
                LAST_MONTH -> Known.LAST_MONTH
                LAST_YEAR -> Known.LAST_YEAR
                else -> throw StiggInvalidDataException("Unknown TimeRange: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws StiggInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { StiggInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws StiggInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TimeRange = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: StiggInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TimeRange && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditGetUsageParams &&
            customerId == other.customerId &&
            currencyId == other.currencyId &&
            endDate == other.endDate &&
            resourceId == other.resourceId &&
            startDate == other.startDate &&
            timeRange == other.timeRange &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            customerId,
            currencyId,
            endDate,
            resourceId,
            startDate,
            timeRange,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CreditGetUsageParams{customerId=$customerId, currencyId=$currencyId, endDate=$endDate, resourceId=$resourceId, startDate=$startDate, timeRange=$timeRange, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
