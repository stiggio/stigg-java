// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import com.fasterxml.jackson.annotation.JsonCreator
import io.stigg.core.Enum
import io.stigg.core.JsonField
import io.stigg.core.Params
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves a paginated list of a customer's external integrations (billing, CRM, etc.). */
class IntegrationListParams
private constructor(
    private val id: String?,
    private val after: String?,
    private val before: String?,
    private val limit: Long?,
    private val vendorIdentifier: List<VendorIdentifier>?,
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

    /** Maximum number of items to return */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /**
     * Filter by vendor identifier. Supports comma-separated values for multiple vendors (e.g.,
     * STRIPE,HUBSPOT)
     */
    fun vendorIdentifier(): Optional<List<VendorIdentifier>> = Optional.ofNullable(vendorIdentifier)

    fun xAccountId(): Optional<String> = Optional.ofNullable(xAccountId)

    fun xEnvironmentId(): Optional<String> = Optional.ofNullable(xEnvironmentId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): IntegrationListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [IntegrationListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegrationListParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var after: String? = null
        private var before: String? = null
        private var limit: Long? = null
        private var vendorIdentifier: MutableList<VendorIdentifier>? = null
        private var xAccountId: String? = null
        private var xEnvironmentId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(integrationListParams: IntegrationListParams) = apply {
            id = integrationListParams.id
            after = integrationListParams.after
            before = integrationListParams.before
            limit = integrationListParams.limit
            vendorIdentifier = integrationListParams.vendorIdentifier?.toMutableList()
            xAccountId = integrationListParams.xAccountId
            xEnvironmentId = integrationListParams.xEnvironmentId
            additionalHeaders = integrationListParams.additionalHeaders.toBuilder()
            additionalQueryParams = integrationListParams.additionalQueryParams.toBuilder()
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

        /**
         * Filter by vendor identifier. Supports comma-separated values for multiple vendors (e.g.,
         * STRIPE,HUBSPOT)
         */
        fun vendorIdentifier(vendorIdentifier: List<VendorIdentifier>?) = apply {
            this.vendorIdentifier = vendorIdentifier?.toMutableList()
        }

        /** Alias for calling [Builder.vendorIdentifier] with `vendorIdentifier.orElse(null)`. */
        fun vendorIdentifier(vendorIdentifier: Optional<List<VendorIdentifier>>) =
            vendorIdentifier(vendorIdentifier.getOrNull())

        /**
         * Adds a single [VendorIdentifier] to [Builder.vendorIdentifier].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVendorIdentifier(vendorIdentifier: VendorIdentifier) = apply {
            this.vendorIdentifier =
                (this.vendorIdentifier ?: mutableListOf()).apply { add(vendorIdentifier) }
        }

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
         * Returns an immutable instance of [IntegrationListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IntegrationListParams =
            IntegrationListParams(
                id,
                after,
                before,
                limit,
                vendorIdentifier?.toImmutable(),
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
                limit?.let { put("limit", it.toString()) }
                vendorIdentifier?.let {
                    put("vendorIdentifier", it.joinToString(",") { it.toString() })
                }
                putAll(additionalQueryParams)
            }
            .build()

    class VendorIdentifier @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val AUTH0 = of("AUTH0")

            @JvmField val ZUORA = of("ZUORA")

            @JvmField val STRIPE = of("STRIPE")

            @JvmField val HUBSPOT = of("HUBSPOT")

            @JvmField val AWS_MARKETPLACE = of("AWS_MARKETPLACE")

            @JvmField val SNOWFLAKE = of("SNOWFLAKE")

            @JvmField val SALESFORCE = of("SALESFORCE")

            @JvmField val BIG_QUERY = of("BIG_QUERY")

            @JvmField val OPEN_FGA = of("OPEN_FGA")

            @JvmField val APP_STORE = of("APP_STORE")

            @JvmField val RECEIVED = of("RECEIVED")

            @JvmField val PREQUEL = of("PREQUEL")

            @JvmField val AIRWALLEX = of("AIRWALLEX")

            @JvmField val STRIPE_INVOICING = of("STRIPE_INVOICING")

            @JvmStatic fun of(value: String) = VendorIdentifier(JsonField.of(value))
        }

        /** An enum containing [VendorIdentifier]'s known values. */
        enum class Known {
            AUTH0,
            ZUORA,
            STRIPE,
            HUBSPOT,
            AWS_MARKETPLACE,
            SNOWFLAKE,
            SALESFORCE,
            BIG_QUERY,
            OPEN_FGA,
            APP_STORE,
            RECEIVED,
            PREQUEL,
            AIRWALLEX,
            STRIPE_INVOICING,
        }

        /**
         * An enum containing [VendorIdentifier]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VendorIdentifier] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTH0,
            ZUORA,
            STRIPE,
            HUBSPOT,
            AWS_MARKETPLACE,
            SNOWFLAKE,
            SALESFORCE,
            BIG_QUERY,
            OPEN_FGA,
            APP_STORE,
            RECEIVED,
            PREQUEL,
            AIRWALLEX,
            STRIPE_INVOICING,
            /**
             * An enum member indicating that [VendorIdentifier] was instantiated with an unknown
             * value.
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
                AUTH0 -> Value.AUTH0
                ZUORA -> Value.ZUORA
                STRIPE -> Value.STRIPE
                HUBSPOT -> Value.HUBSPOT
                AWS_MARKETPLACE -> Value.AWS_MARKETPLACE
                SNOWFLAKE -> Value.SNOWFLAKE
                SALESFORCE -> Value.SALESFORCE
                BIG_QUERY -> Value.BIG_QUERY
                OPEN_FGA -> Value.OPEN_FGA
                APP_STORE -> Value.APP_STORE
                RECEIVED -> Value.RECEIVED
                PREQUEL -> Value.PREQUEL
                AIRWALLEX -> Value.AIRWALLEX
                STRIPE_INVOICING -> Value.STRIPE_INVOICING
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
                AUTH0 -> Known.AUTH0
                ZUORA -> Known.ZUORA
                STRIPE -> Known.STRIPE
                HUBSPOT -> Known.HUBSPOT
                AWS_MARKETPLACE -> Known.AWS_MARKETPLACE
                SNOWFLAKE -> Known.SNOWFLAKE
                SALESFORCE -> Known.SALESFORCE
                BIG_QUERY -> Known.BIG_QUERY
                OPEN_FGA -> Known.OPEN_FGA
                APP_STORE -> Known.APP_STORE
                RECEIVED -> Known.RECEIVED
                PREQUEL -> Known.PREQUEL
                AIRWALLEX -> Known.AIRWALLEX
                STRIPE_INVOICING -> Known.STRIPE_INVOICING
                else -> throw StiggInvalidDataException("Unknown VendorIdentifier: $value")
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
        fun validate(): VendorIdentifier = apply {
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

            return other is VendorIdentifier && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegrationListParams &&
            id == other.id &&
            after == other.after &&
            before == other.before &&
            limit == other.limit &&
            vendorIdentifier == other.vendorIdentifier &&
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
            limit,
            vendorIdentifier,
            xAccountId,
            xEnvironmentId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "IntegrationListParams{id=$id, after=$after, before=$before, limit=$limit, vendorIdentifier=$vendorIdentifier, xAccountId=$xAccountId, xEnvironmentId=$xEnvironmentId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
