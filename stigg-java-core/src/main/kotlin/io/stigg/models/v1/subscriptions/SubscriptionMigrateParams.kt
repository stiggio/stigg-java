// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.stigg.core.Enum
import io.stigg.core.ExcludeMissing
import io.stigg.core.JsonField
import io.stigg.core.JsonMissing
import io.stigg.core.JsonValue
import io.stigg.core.Params
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.errors.StiggInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Migrate subscription to latest plan version */
class SubscriptionMigrateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * When to migrate (immediate or period end)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionMigrationTime(): Optional<SubscriptionMigrationTime> =
        body.subscriptionMigrationTime()

    /**
     * Returns the raw JSON value of [subscriptionMigrationTime].
     *
     * Unlike [subscriptionMigrationTime], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _subscriptionMigrationTime(): JsonField<SubscriptionMigrationTime> =
        body._subscriptionMigrationTime()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SubscriptionMigrateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionMigrateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionMigrateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionMigrateParams: SubscriptionMigrateParams) = apply {
            id = subscriptionMigrateParams.id
            body = subscriptionMigrateParams.body.toBuilder()
            additionalHeaders = subscriptionMigrateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionMigrateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [subscriptionMigrationTime]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** When to migrate (immediate or period end) */
        fun subscriptionMigrationTime(subscriptionMigrationTime: SubscriptionMigrationTime) =
            apply {
                body.subscriptionMigrationTime(subscriptionMigrationTime)
            }

        /**
         * Sets [Builder.subscriptionMigrationTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionMigrationTime] with a well-typed
         * [SubscriptionMigrationTime] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun subscriptionMigrationTime(
            subscriptionMigrationTime: JsonField<SubscriptionMigrationTime>
        ) = apply { body.subscriptionMigrationTime(subscriptionMigrationTime) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [SubscriptionMigrateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionMigrateParams =
            SubscriptionMigrateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Migrate a subscription to the latest version of its plan or add-on. This updates pricing,
     * entitlements, and features to match the currently published version while maintaining the
     * subscription continuity.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val subscriptionMigrationTime: JsonField<SubscriptionMigrationTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("subscriptionMigrationTime")
            @ExcludeMissing
            subscriptionMigrationTime: JsonField<SubscriptionMigrationTime> = JsonMissing.of()
        ) : this(subscriptionMigrationTime, mutableMapOf())

        /**
         * When to migrate (immediate or period end)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscriptionMigrationTime(): Optional<SubscriptionMigrationTime> =
            subscriptionMigrationTime.getOptional("subscriptionMigrationTime")

        /**
         * Returns the raw JSON value of [subscriptionMigrationTime].
         *
         * Unlike [subscriptionMigrationTime], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscriptionMigrationTime")
        @ExcludeMissing
        fun _subscriptionMigrationTime(): JsonField<SubscriptionMigrationTime> =
            subscriptionMigrationTime

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var subscriptionMigrationTime: JsonField<SubscriptionMigrationTime> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                subscriptionMigrationTime = body.subscriptionMigrationTime
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** When to migrate (immediate or period end) */
            fun subscriptionMigrationTime(subscriptionMigrationTime: SubscriptionMigrationTime) =
                subscriptionMigrationTime(JsonField.of(subscriptionMigrationTime))

            /**
             * Sets [Builder.subscriptionMigrationTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionMigrationTime] with a well-typed
             * [SubscriptionMigrationTime] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun subscriptionMigrationTime(
                subscriptionMigrationTime: JsonField<SubscriptionMigrationTime>
            ) = apply { this.subscriptionMigrationTime = subscriptionMigrationTime }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(subscriptionMigrationTime, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            subscriptionMigrationTime().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (subscriptionMigrationTime.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                subscriptionMigrationTime == other.subscriptionMigrationTime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(subscriptionMigrationTime, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{subscriptionMigrationTime=$subscriptionMigrationTime, additionalProperties=$additionalProperties}"
    }

    /** When to migrate (immediate or period end) */
    class SubscriptionMigrationTime
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val END_OF_BILLING_PERIOD = of("END_OF_BILLING_PERIOD")

            @JvmField val IMMEDIATE = of("IMMEDIATE")

            @JvmStatic fun of(value: String) = SubscriptionMigrationTime(JsonField.of(value))
        }

        /** An enum containing [SubscriptionMigrationTime]'s known values. */
        enum class Known {
            END_OF_BILLING_PERIOD,
            IMMEDIATE,
        }

        /**
         * An enum containing [SubscriptionMigrationTime]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SubscriptionMigrationTime] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            END_OF_BILLING_PERIOD,
            IMMEDIATE,
            /**
             * An enum member indicating that [SubscriptionMigrationTime] was instantiated with an
             * unknown value.
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
                END_OF_BILLING_PERIOD -> Value.END_OF_BILLING_PERIOD
                IMMEDIATE -> Value.IMMEDIATE
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
                END_OF_BILLING_PERIOD -> Known.END_OF_BILLING_PERIOD
                IMMEDIATE -> Known.IMMEDIATE
                else -> throw StiggInvalidDataException("Unknown SubscriptionMigrationTime: $value")
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

        fun validate(): SubscriptionMigrationTime = apply {
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

            return other is SubscriptionMigrationTime && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionMigrateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionMigrateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
