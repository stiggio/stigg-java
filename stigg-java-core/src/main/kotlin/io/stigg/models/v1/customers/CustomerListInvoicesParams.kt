// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.annotation.JsonCreator
import io.stigg.core.Enum
import io.stigg.core.JsonField
import io.stigg.core.Params
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a cursor-paginated list of a customer's invoices, fetched live from the connected
 * billing provider. Ordered by issue date ascending by default; override with orderBy (issueDate |
 * dueDate | total) and orderDir (ASC | DESC). Optionally narrowed to one contract, an issue-date
 * range, and/or a set of invoice states. Returns an empty list when no billing provider is
 * connected or the customer is not synced.
 */
class CustomerListInvoicesParams
private constructor(
    private val id: String?,
    private val after: String?,
    private val before: String?,
    private val contractExternalId: String?,
    private val issuedAfter: OffsetDateTime?,
    private val issuedBefore: OffsetDateTime?,
    private val limit: Long?,
    private val orderBy: OrderBy?,
    private val orderDir: OrderDir?,
    private val stateIn: String?,
    private val xAccountId: String?,
    private val xEnvironmentId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Return items that come after this cursor */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** Return items that come before this cursor */
    fun before(): Optional<String> = Optional.ofNullable(before)

    /**
     * Filter to invoices for this contract only (contract external ID or Received contract ID).
     * Omit for all contracts.
     */
    fun contractExternalId(): Optional<String> = Optional.ofNullable(contractExternalId)

    /** Filter to invoices issued on or after this date, inclusive (ISO 8601) */
    fun issuedAfter(): Optional<OffsetDateTime> = Optional.ofNullable(issuedAfter)

    /** Filter to invoices issued on or before this date, inclusive (ISO 8601) */
    fun issuedBefore(): Optional<OffsetDateTime> = Optional.ofNullable(issuedBefore)

    /** Maximum number of items to return */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Field to sort by: issueDate (default), dueDate, or total */
    fun orderBy(): Optional<OrderBy> = Optional.ofNullable(orderBy)

    /** Sort direction: ASC (default) or DESC */
    fun orderDir(): Optional<OrderDir> = Optional.ofNullable(orderDir)

    /** Filter by invoice state. Supports comma-separated values for multiple states */
    fun stateIn(): Optional<String> = Optional.ofNullable(stateIn)

    fun xAccountId(): Optional<String> = Optional.ofNullable(xAccountId)

    fun xEnvironmentId(): Optional<String> = Optional.ofNullable(xEnvironmentId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CustomerListInvoicesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [CustomerListInvoicesParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerListInvoicesParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var after: String? = null
        private var before: String? = null
        private var contractExternalId: String? = null
        private var issuedAfter: OffsetDateTime? = null
        private var issuedBefore: OffsetDateTime? = null
        private var limit: Long? = null
        private var orderBy: OrderBy? = null
        private var orderDir: OrderDir? = null
        private var stateIn: String? = null
        private var xAccountId: String? = null
        private var xEnvironmentId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerListInvoicesParams: CustomerListInvoicesParams) = apply {
            id = customerListInvoicesParams.id
            after = customerListInvoicesParams.after
            before = customerListInvoicesParams.before
            contractExternalId = customerListInvoicesParams.contractExternalId
            issuedAfter = customerListInvoicesParams.issuedAfter
            issuedBefore = customerListInvoicesParams.issuedBefore
            limit = customerListInvoicesParams.limit
            orderBy = customerListInvoicesParams.orderBy
            orderDir = customerListInvoicesParams.orderDir
            stateIn = customerListInvoicesParams.stateIn
            xAccountId = customerListInvoicesParams.xAccountId
            xEnvironmentId = customerListInvoicesParams.xEnvironmentId
            additionalHeaders = customerListInvoicesParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerListInvoicesParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Return items that come after this cursor */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** Return items that come before this cursor */
        fun before(before: String?) = apply { this.before = before }

        /** Alias for calling [Builder.before] with `before.orElse(null)`. */
        fun before(before: Optional<String>) = before(before.getOrNull())

        /**
         * Filter to invoices for this contract only (contract external ID or Received contract ID).
         * Omit for all contracts.
         */
        fun contractExternalId(contractExternalId: String?) = apply {
            this.contractExternalId = contractExternalId
        }

        /**
         * Alias for calling [Builder.contractExternalId] with `contractExternalId.orElse(null)`.
         */
        fun contractExternalId(contractExternalId: Optional<String>) =
            contractExternalId(contractExternalId.getOrNull())

        /** Filter to invoices issued on or after this date, inclusive (ISO 8601) */
        fun issuedAfter(issuedAfter: OffsetDateTime?) = apply { this.issuedAfter = issuedAfter }

        /** Alias for calling [Builder.issuedAfter] with `issuedAfter.orElse(null)`. */
        fun issuedAfter(issuedAfter: Optional<OffsetDateTime>) =
            issuedAfter(issuedAfter.getOrNull())

        /** Filter to invoices issued on or before this date, inclusive (ISO 8601) */
        fun issuedBefore(issuedBefore: OffsetDateTime?) = apply { this.issuedBefore = issuedBefore }

        /** Alias for calling [Builder.issuedBefore] with `issuedBefore.orElse(null)`. */
        fun issuedBefore(issuedBefore: Optional<OffsetDateTime>) =
            issuedBefore(issuedBefore.getOrNull())

        /** Maximum number of items to return */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Field to sort by: issueDate (default), dueDate, or total */
        fun orderBy(orderBy: OrderBy?) = apply { this.orderBy = orderBy }

        /** Alias for calling [Builder.orderBy] with `orderBy.orElse(null)`. */
        fun orderBy(orderBy: Optional<OrderBy>) = orderBy(orderBy.getOrNull())

        /** Sort direction: ASC (default) or DESC */
        fun orderDir(orderDir: OrderDir?) = apply { this.orderDir = orderDir }

        /** Alias for calling [Builder.orderDir] with `orderDir.orElse(null)`. */
        fun orderDir(orderDir: Optional<OrderDir>) = orderDir(orderDir.getOrNull())

        /** Filter by invoice state. Supports comma-separated values for multiple states */
        fun stateIn(stateIn: String?) = apply { this.stateIn = stateIn }

        /** Alias for calling [Builder.stateIn] with `stateIn.orElse(null)`. */
        fun stateIn(stateIn: Optional<String>) = stateIn(stateIn.getOrNull())

        fun xAccountId(xAccountId: String?) = apply { this.xAccountId = xAccountId }

        /** Alias for calling [Builder.xAccountId] with `xAccountId.orElse(null)`. */
        fun xAccountId(xAccountId: Optional<String>) = xAccountId(xAccountId.getOrNull())

        fun xEnvironmentId(xEnvironmentId: String?) = apply { this.xEnvironmentId = xEnvironmentId }

        /** Alias for calling [Builder.xEnvironmentId] with `xEnvironmentId.orElse(null)`. */
        fun xEnvironmentId(xEnvironmentId: Optional<String>) =
            xEnvironmentId(xEnvironmentId.getOrNull())

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
         * Returns an immutable instance of [CustomerListInvoicesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerListInvoicesParams =
            CustomerListInvoicesParams(
                id,
                after,
                before,
                contractExternalId,
                issuedAfter,
                issuedBefore,
                limit,
                orderBy,
                orderDir,
                stateIn,
                xAccountId,
                xEnvironmentId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                xAccountId?.let { put("X-ACCOUNT-ID", it) }
                xEnvironmentId?.let { put("X-ENVIRONMENT-ID", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                before?.let { put("before", it) }
                contractExternalId?.let { put("contractExternalId", it) }
                issuedAfter?.let {
                    put("issuedAfter", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                issuedBefore?.let {
                    put("issuedBefore", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                limit?.let { put("limit", it.toString()) }
                orderBy?.let { put("orderBy", it.toString()) }
                orderDir?.let { put("orderDir", it.toString()) }
                stateIn?.let { put("stateIn", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Field to sort by: issueDate (default), dueDate, or total */
    class OrderBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ISSUE_DATE = of("issueDate")

            @JvmField val DUE_DATE = of("dueDate")

            @JvmField val TOTAL = of("total")

            @JvmStatic fun of(value: String) = OrderBy(JsonField.of(value))
        }

        /** An enum containing [OrderBy]'s known values. */
        enum class Known {
            ISSUE_DATE,
            DUE_DATE,
            TOTAL,
        }

        /**
         * An enum containing [OrderBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OrderBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ISSUE_DATE,
            DUE_DATE,
            TOTAL,
            /** An enum member indicating that [OrderBy] was instantiated with an unknown value. */
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
                ISSUE_DATE -> Value.ISSUE_DATE
                DUE_DATE -> Value.DUE_DATE
                TOTAL -> Value.TOTAL
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
                ISSUE_DATE -> Known.ISSUE_DATE
                DUE_DATE -> Known.DUE_DATE
                TOTAL -> Known.TOTAL
                else -> throw StiggInvalidDataException("Unknown OrderBy: $value")
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
        fun validate(): OrderBy = apply {
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

            return other is OrderBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Sort direction: ASC (default) or DESC */
    class OrderDir @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ASC = of("ASC")

            @JvmField val DESC = of("DESC")

            @JvmStatic fun of(value: String) = OrderDir(JsonField.of(value))
        }

        /** An enum containing [OrderDir]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [OrderDir]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OrderDir] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /** An enum member indicating that [OrderDir] was instantiated with an unknown value. */
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
                ASC -> Value.ASC
                DESC -> Value.DESC
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
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw StiggInvalidDataException("Unknown OrderDir: $value")
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
        fun validate(): OrderDir = apply {
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

            return other is OrderDir && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListInvoicesParams &&
            id == other.id &&
            after == other.after &&
            before == other.before &&
            contractExternalId == other.contractExternalId &&
            issuedAfter == other.issuedAfter &&
            issuedBefore == other.issuedBefore &&
            limit == other.limit &&
            orderBy == other.orderBy &&
            orderDir == other.orderDir &&
            stateIn == other.stateIn &&
            xAccountId == other.xAccountId &&
            xEnvironmentId == other.xEnvironmentId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            after,
            before,
            contractExternalId,
            issuedAfter,
            issuedBefore,
            limit,
            orderBy,
            orderDir,
            stateIn,
            xAccountId,
            xEnvironmentId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CustomerListInvoicesParams{id=$id, after=$after, before=$before, contractExternalId=$contractExternalId, issuedAfter=$issuedAfter, issuedBefore=$issuedBefore, limit=$limit, orderBy=$orderBy, orderDir=$orderDir, stateIn=$stateIn, xAccountId=$xAccountId, xEnvironmentId=$xEnvironmentId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
