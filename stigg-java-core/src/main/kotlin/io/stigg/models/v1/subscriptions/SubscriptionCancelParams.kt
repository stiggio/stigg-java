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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Cancel subscription */
class SubscriptionCancelParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Action on cancellation (downgrade or revoke)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancellationAction(): Optional<CancellationAction> = body.cancellationAction()

    /**
     * When to cancel (immediate, period end, or date)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancellationTime(): Optional<CancellationTime> = body.cancellationTime()

    /**
     * Subscription end date
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<OffsetDateTime> = body.endDate()

    /**
     * If set, enables or disables prorating of credits on subscription cancellation.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prorate(): Optional<Boolean> = body.prorate()

    /**
     * Returns the raw JSON value of [cancellationAction].
     *
     * Unlike [cancellationAction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cancellationAction(): JsonField<CancellationAction> = body._cancellationAction()

    /**
     * Returns the raw JSON value of [cancellationTime].
     *
     * Unlike [cancellationTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cancellationTime(): JsonField<CancellationTime> = body._cancellationTime()

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    /**
     * Returns the raw JSON value of [prorate].
     *
     * Unlike [prorate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prorate(): JsonField<Boolean> = body._prorate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SubscriptionCancelParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SubscriptionCancelParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionCancelParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionCancelParams: SubscriptionCancelParams) = apply {
            id = subscriptionCancelParams.id
            body = subscriptionCancelParams.body.toBuilder()
            additionalHeaders = subscriptionCancelParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionCancelParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [cancellationAction]
         * - [cancellationTime]
         * - [endDate]
         * - [prorate]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Action on cancellation (downgrade or revoke) */
        fun cancellationAction(cancellationAction: CancellationAction) = apply {
            body.cancellationAction(cancellationAction)
        }

        /**
         * Sets [Builder.cancellationAction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancellationAction] with a well-typed
         * [CancellationAction] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun cancellationAction(cancellationAction: JsonField<CancellationAction>) = apply {
            body.cancellationAction(cancellationAction)
        }

        /** When to cancel (immediate, period end, or date) */
        fun cancellationTime(cancellationTime: CancellationTime) = apply {
            body.cancellationTime(cancellationTime)
        }

        /**
         * Sets [Builder.cancellationTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancellationTime] with a well-typed [CancellationTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cancellationTime(cancellationTime: JsonField<CancellationTime>) = apply {
            body.cancellationTime(cancellationTime)
        }

        /** Subscription end date */
        fun endDate(endDate: OffsetDateTime) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        /** If set, enables or disables prorating of credits on subscription cancellation. */
        fun prorate(prorate: Boolean) = apply { body.prorate(prorate) }

        /**
         * Sets [Builder.prorate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prorate] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prorate(prorate: JsonField<Boolean>) = apply { body.prorate(prorate) }

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
         * Returns an immutable instance of [SubscriptionCancelParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionCancelParams =
            SubscriptionCancelParams(
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
     * Cancel a subscription with configurable timing and action. Supports immediate cancellation,
     * end-of-period cancellation, or cancellation on a specific date with optional prorated
     * refunds.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cancellationAction: JsonField<CancellationAction>,
        private val cancellationTime: JsonField<CancellationTime>,
        private val endDate: JsonField<OffsetDateTime>,
        private val prorate: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cancellationAction")
            @ExcludeMissing
            cancellationAction: JsonField<CancellationAction> = JsonMissing.of(),
            @JsonProperty("cancellationTime")
            @ExcludeMissing
            cancellationTime: JsonField<CancellationTime> = JsonMissing.of(),
            @JsonProperty("endDate")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("prorate") @ExcludeMissing prorate: JsonField<Boolean> = JsonMissing.of(),
        ) : this(cancellationAction, cancellationTime, endDate, prorate, mutableMapOf())

        /**
         * Action on cancellation (downgrade or revoke)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cancellationAction(): Optional<CancellationAction> =
            cancellationAction.getOptional("cancellationAction")

        /**
         * When to cancel (immediate, period end, or date)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cancellationTime(): Optional<CancellationTime> =
            cancellationTime.getOptional("cancellationTime")

        /**
         * Subscription end date
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("endDate")

        /**
         * If set, enables or disables prorating of credits on subscription cancellation.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prorate(): Optional<Boolean> = prorate.getOptional("prorate")

        /**
         * Returns the raw JSON value of [cancellationAction].
         *
         * Unlike [cancellationAction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cancellationAction")
        @ExcludeMissing
        fun _cancellationAction(): JsonField<CancellationAction> = cancellationAction

        /**
         * Returns the raw JSON value of [cancellationTime].
         *
         * Unlike [cancellationTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cancellationTime")
        @ExcludeMissing
        fun _cancellationTime(): JsonField<CancellationTime> = cancellationTime

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [prorate].
         *
         * Unlike [prorate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prorate") @ExcludeMissing fun _prorate(): JsonField<Boolean> = prorate

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

            private var cancellationAction: JsonField<CancellationAction> = JsonMissing.of()
            private var cancellationTime: JsonField<CancellationTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var prorate: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                cancellationAction = body.cancellationAction
                cancellationTime = body.cancellationTime
                endDate = body.endDate
                prorate = body.prorate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Action on cancellation (downgrade or revoke) */
            fun cancellationAction(cancellationAction: CancellationAction) =
                cancellationAction(JsonField.of(cancellationAction))

            /**
             * Sets [Builder.cancellationAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancellationAction] with a well-typed
             * [CancellationAction] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun cancellationAction(cancellationAction: JsonField<CancellationAction>) = apply {
                this.cancellationAction = cancellationAction
            }

            /** When to cancel (immediate, period end, or date) */
            fun cancellationTime(cancellationTime: CancellationTime) =
                cancellationTime(JsonField.of(cancellationTime))

            /**
             * Sets [Builder.cancellationTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancellationTime] with a well-typed
             * [CancellationTime] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun cancellationTime(cancellationTime: JsonField<CancellationTime>) = apply {
                this.cancellationTime = cancellationTime
            }

            /** Subscription end date */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** If set, enables or disables prorating of credits on subscription cancellation. */
            fun prorate(prorate: Boolean) = prorate(JsonField.of(prorate))

            /**
             * Sets [Builder.prorate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prorate] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prorate(prorate: JsonField<Boolean>) = apply { this.prorate = prorate }

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
            fun build(): Body =
                Body(
                    cancellationAction,
                    cancellationTime,
                    endDate,
                    prorate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            cancellationAction().ifPresent { it.validate() }
            cancellationTime().ifPresent { it.validate() }
            endDate()
            prorate()
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
            (cancellationAction.asKnown().getOrNull()?.validity() ?: 0) +
                (cancellationTime.asKnown().getOrNull()?.validity() ?: 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (prorate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                cancellationAction == other.cancellationAction &&
                cancellationTime == other.cancellationTime &&
                endDate == other.endDate &&
                prorate == other.prorate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cancellationAction,
                cancellationTime,
                endDate,
                prorate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{cancellationAction=$cancellationAction, cancellationTime=$cancellationTime, endDate=$endDate, prorate=$prorate, additionalProperties=$additionalProperties}"
    }

    /** Action on cancellation (downgrade or revoke) */
    class CancellationAction
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

            @JvmField val DEFAULT = of("DEFAULT")

            @JvmField val REVOKE_ENTITLEMENTS = of("REVOKE_ENTITLEMENTS")

            @JvmStatic fun of(value: String) = CancellationAction(JsonField.of(value))
        }

        /** An enum containing [CancellationAction]'s known values. */
        enum class Known {
            DEFAULT,
            REVOKE_ENTITLEMENTS,
        }

        /**
         * An enum containing [CancellationAction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CancellationAction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEFAULT,
            REVOKE_ENTITLEMENTS,
            /**
             * An enum member indicating that [CancellationAction] was instantiated with an unknown
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
                DEFAULT -> Value.DEFAULT
                REVOKE_ENTITLEMENTS -> Value.REVOKE_ENTITLEMENTS
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
                DEFAULT -> Known.DEFAULT
                REVOKE_ENTITLEMENTS -> Known.REVOKE_ENTITLEMENTS
                else -> throw StiggInvalidDataException("Unknown CancellationAction: $value")
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

        fun validate(): CancellationAction = apply {
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

            return other is CancellationAction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** When to cancel (immediate, period end, or date) */
    class CancellationTime @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val END_OF_BILLING_PERIOD = of("END_OF_BILLING_PERIOD")

            @JvmField val IMMEDIATE = of("IMMEDIATE")

            @JvmField val SPECIFIC_DATE = of("SPECIFIC_DATE")

            @JvmStatic fun of(value: String) = CancellationTime(JsonField.of(value))
        }

        /** An enum containing [CancellationTime]'s known values. */
        enum class Known {
            END_OF_BILLING_PERIOD,
            IMMEDIATE,
            SPECIFIC_DATE,
        }

        /**
         * An enum containing [CancellationTime]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CancellationTime] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            END_OF_BILLING_PERIOD,
            IMMEDIATE,
            SPECIFIC_DATE,
            /**
             * An enum member indicating that [CancellationTime] was instantiated with an unknown
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
                END_OF_BILLING_PERIOD -> Value.END_OF_BILLING_PERIOD
                IMMEDIATE -> Value.IMMEDIATE
                SPECIFIC_DATE -> Value.SPECIFIC_DATE
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
                SPECIFIC_DATE -> Known.SPECIFIC_DATE
                else -> throw StiggInvalidDataException("Unknown CancellationTime: $value")
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

        fun validate(): CancellationTime = apply {
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

            return other is CancellationTime && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionCancelParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionCancelParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
