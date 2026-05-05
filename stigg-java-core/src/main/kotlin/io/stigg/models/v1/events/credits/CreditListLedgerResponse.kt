// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.stigg.core.Enum
import io.stigg.core.ExcludeMissing
import io.stigg.core.JsonField
import io.stigg.core.JsonMissing
import io.stigg.core.JsonValue
import io.stigg.core.checkRequired
import io.stigg.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A credit ledger event representing a change to credit balance */
class CreditListLedgerResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Double>,
    private val creditCurrencyId: JsonField<String>,
    private val creditGrantId: JsonField<String>,
    private val customerId: JsonField<String>,
    private val eventId: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val featureId: JsonField<String>,
    private val resourceId: JsonField<String>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("creditCurrencyId")
        @ExcludeMissing
        creditCurrencyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creditGrantId")
        @ExcludeMissing
        creditGrantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventId") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventType")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("featureId") @ExcludeMissing featureId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resourceId")
        @ExcludeMissing
        resourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        amount,
        creditCurrencyId,
        creditGrantId,
        customerId,
        eventId,
        eventType,
        featureId,
        resourceId,
        timestamp,
        mutableMapOf(),
    )

    /**
     * The credit amount for this event
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Double = amount.getRequired("amount")

    /**
     * The credit currency ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditCurrencyId(): String = creditCurrencyId.getRequired("creditCurrencyId")

    /**
     * The credit grant ID associated with this event
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditGrantId(): String = creditGrantId.getRequired("creditGrantId")

    /**
     * The customer ID this event belongs to
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customerId")

    /**
     * The unique event identifier
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventId(): Optional<String> = eventId.getOptional("eventId")

    /**
     * The type of credit event
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("eventType")

    /**
     * The feature ID associated with this event
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun featureId(): Optional<String> = featureId.getOptional("featureId")

    /**
     * The resource ID this event is scoped to
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceId(): Optional<String> = resourceId.getOptional("resourceId")

    /**
     * The timestamp when the event occurred
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /**
     * Returns the raw JSON value of [creditCurrencyId].
     *
     * Unlike [creditCurrencyId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("creditCurrencyId")
    @ExcludeMissing
    fun _creditCurrencyId(): JsonField<String> = creditCurrencyId

    /**
     * Returns the raw JSON value of [creditGrantId].
     *
     * Unlike [creditGrantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creditGrantId")
    @ExcludeMissing
    fun _creditGrantId(): JsonField<String> = creditGrantId

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [eventId].
     *
     * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventId") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventType") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [featureId].
     *
     * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

    /**
     * Returns the raw JSON value of [resourceId].
     *
     * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resourceId") @ExcludeMissing fun _resourceId(): JsonField<String> = resourceId

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

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

        /**
         * Returns a mutable builder for constructing an instance of [CreditListLedgerResponse].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .creditCurrencyId()
         * .creditGrantId()
         * .customerId()
         * .eventId()
         * .eventType()
         * .featureId()
         * .resourceId()
         * .timestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditListLedgerResponse]. */
    class Builder internal constructor() {

        private var amount: JsonField<Double>? = null
        private var creditCurrencyId: JsonField<String>? = null
        private var creditGrantId: JsonField<String>? = null
        private var customerId: JsonField<String>? = null
        private var eventId: JsonField<String>? = null
        private var eventType: JsonField<EventType>? = null
        private var featureId: JsonField<String>? = null
        private var resourceId: JsonField<String>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditListLedgerResponse: CreditListLedgerResponse) = apply {
            amount = creditListLedgerResponse.amount
            creditCurrencyId = creditListLedgerResponse.creditCurrencyId
            creditGrantId = creditListLedgerResponse.creditGrantId
            customerId = creditListLedgerResponse.customerId
            eventId = creditListLedgerResponse.eventId
            eventType = creditListLedgerResponse.eventType
            featureId = creditListLedgerResponse.featureId
            resourceId = creditListLedgerResponse.resourceId
            timestamp = creditListLedgerResponse.timestamp
            additionalProperties = creditListLedgerResponse.additionalProperties.toMutableMap()
        }

        /** The credit amount for this event */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /** The credit currency ID */
        fun creditCurrencyId(creditCurrencyId: String) =
            creditCurrencyId(JsonField.of(creditCurrencyId))

        /**
         * Sets [Builder.creditCurrencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditCurrencyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditCurrencyId(creditCurrencyId: JsonField<String>) = apply {
            this.creditCurrencyId = creditCurrencyId
        }

        /** The credit grant ID associated with this event */
        fun creditGrantId(creditGrantId: String) = creditGrantId(JsonField.of(creditGrantId))

        /**
         * Sets [Builder.creditGrantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditGrantId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditGrantId(creditGrantId: JsonField<String>) = apply {
            this.creditGrantId = creditGrantId
        }

        /** The customer ID this event belongs to */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** The unique event identifier */
        fun eventId(eventId: String?) = eventId(JsonField.ofNullable(eventId))

        /** Alias for calling [Builder.eventId] with `eventId.orElse(null)`. */
        fun eventId(eventId: Optional<String>) = eventId(eventId.getOrNull())

        /**
         * Sets [Builder.eventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

        /** The type of credit event */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        /** The feature ID associated with this event */
        fun featureId(featureId: String?) = featureId(JsonField.ofNullable(featureId))

        /** Alias for calling [Builder.featureId] with `featureId.orElse(null)`. */
        fun featureId(featureId: Optional<String>) = featureId(featureId.getOrNull())

        /**
         * Sets [Builder.featureId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

        /** The resource ID this event is scoped to */
        fun resourceId(resourceId: String?) = resourceId(JsonField.ofNullable(resourceId))

        /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
        fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

        /**
         * Sets [Builder.resourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

        /** The timestamp when the event occurred */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

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
         * Returns an immutable instance of [CreditListLedgerResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .creditCurrencyId()
         * .creditGrantId()
         * .customerId()
         * .eventId()
         * .eventType()
         * .featureId()
         * .resourceId()
         * .timestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditListLedgerResponse =
            CreditListLedgerResponse(
                checkRequired("amount", amount),
                checkRequired("creditCurrencyId", creditCurrencyId),
                checkRequired("creditGrantId", creditGrantId),
                checkRequired("customerId", customerId),
                checkRequired("eventId", eventId),
                checkRequired("eventType", eventType),
                checkRequired("featureId", featureId),
                checkRequired("resourceId", resourceId),
                checkRequired("timestamp", timestamp),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws StiggInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): CreditListLedgerResponse = apply {
        if (validated) {
            return@apply
        }

        amount()
        creditCurrencyId()
        creditGrantId()
        customerId()
        eventId()
        eventType().validate()
        featureId()
        resourceId()
        timestamp()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (amount.asKnown().isPresent) 1 else 0) +
            (if (creditCurrencyId.asKnown().isPresent) 1 else 0) +
            (if (creditGrantId.asKnown().isPresent) 1 else 0) +
            (if (customerId.asKnown().isPresent) 1 else 0) +
            (if (eventId.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (featureId.asKnown().isPresent) 1 else 0) +
            (if (resourceId.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0)

    /** The type of credit event */
    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CREDITS_GRANTED = of("CREDITS_GRANTED")

            @JvmField val CREDITS_EXPIRED = of("CREDITS_EXPIRED")

            @JvmField val CREDITS_CONSUMED = of("CREDITS_CONSUMED")

            @JvmField val CREDITS_VOIDED = of("CREDITS_VOIDED")

            @JvmField val CREDITS_UPDATED = of("CREDITS_UPDATED")

            @JvmField
            val CREDITS_CONSUMPTION_TRANSFER_SOURCE = of("CREDITS_CONSUMPTION_TRANSFER_SOURCE")

            @JvmField
            val CREDITS_CONSUMPTION_TRANSFER_TARGET = of("CREDITS_CONSUMPTION_TRANSFER_TARGET")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            CREDITS_GRANTED,
            CREDITS_EXPIRED,
            CREDITS_CONSUMED,
            CREDITS_VOIDED,
            CREDITS_UPDATED,
            CREDITS_CONSUMPTION_TRANSFER_SOURCE,
            CREDITS_CONSUMPTION_TRANSFER_TARGET,
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDITS_GRANTED,
            CREDITS_EXPIRED,
            CREDITS_CONSUMED,
            CREDITS_VOIDED,
            CREDITS_UPDATED,
            CREDITS_CONSUMPTION_TRANSFER_SOURCE,
            CREDITS_CONSUMPTION_TRANSFER_TARGET,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                CREDITS_GRANTED -> Value.CREDITS_GRANTED
                CREDITS_EXPIRED -> Value.CREDITS_EXPIRED
                CREDITS_CONSUMED -> Value.CREDITS_CONSUMED
                CREDITS_VOIDED -> Value.CREDITS_VOIDED
                CREDITS_UPDATED -> Value.CREDITS_UPDATED
                CREDITS_CONSUMPTION_TRANSFER_SOURCE -> Value.CREDITS_CONSUMPTION_TRANSFER_SOURCE
                CREDITS_CONSUMPTION_TRANSFER_TARGET -> Value.CREDITS_CONSUMPTION_TRANSFER_TARGET
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
                CREDITS_GRANTED -> Known.CREDITS_GRANTED
                CREDITS_EXPIRED -> Known.CREDITS_EXPIRED
                CREDITS_CONSUMED -> Known.CREDITS_CONSUMED
                CREDITS_VOIDED -> Known.CREDITS_VOIDED
                CREDITS_UPDATED -> Known.CREDITS_UPDATED
                CREDITS_CONSUMPTION_TRANSFER_SOURCE -> Known.CREDITS_CONSUMPTION_TRANSFER_SOURCE
                CREDITS_CONSUMPTION_TRANSFER_TARGET -> Known.CREDITS_CONSUMPTION_TRANSFER_TARGET
                else -> throw StiggInvalidDataException("Unknown EventType: $value")
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
        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditListLedgerResponse &&
            amount == other.amount &&
            creditCurrencyId == other.creditCurrencyId &&
            creditGrantId == other.creditGrantId &&
            customerId == other.customerId &&
            eventId == other.eventId &&
            eventType == other.eventType &&
            featureId == other.featureId &&
            resourceId == other.resourceId &&
            timestamp == other.timestamp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            creditCurrencyId,
            creditGrantId,
            customerId,
            eventId,
            eventType,
            featureId,
            resourceId,
            timestamp,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditListLedgerResponse{amount=$amount, creditCurrencyId=$creditCurrencyId, creditGrantId=$creditGrantId, customerId=$customerId, eventId=$eventId, eventType=$eventType, featureId=$featureId, resourceId=$resourceId, timestamp=$timestamp, additionalProperties=$additionalProperties}"
}
