// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.autorecharge

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

/** Response object */
class AutoRechargeGetAutoRechargeResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * Automatic recharge configuration for a customer and currency
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of
         * [AutoRechargeGetAutoRechargeResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AutoRechargeGetAutoRechargeResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            autoRechargeGetAutoRechargeResponse: AutoRechargeGetAutoRechargeResponse
        ) = apply {
            data = autoRechargeGetAutoRechargeResponse.data
            additionalProperties =
                autoRechargeGetAutoRechargeResponse.additionalProperties.toMutableMap()
        }

        /** Automatic recharge configuration for a customer and currency */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [AutoRechargeGetAutoRechargeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AutoRechargeGetAutoRechargeResponse =
            AutoRechargeGetAutoRechargeResponse(
                checkRequired("data", data),
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
    fun validate(): AutoRechargeGetAutoRechargeResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    /** Automatic recharge configuration for a customer and currency */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currencyId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val grantExpirationPeriod: JsonField<GrantExpirationPeriod>,
        private val isEnabled: JsonField<Boolean>,
        private val maxSpendLimit: JsonField<Double>,
        private val targetBalance: JsonField<Double>,
        private val thresholdType: JsonField<ThresholdType>,
        private val thresholdValue: JsonField<Double>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currencyId")
            @ExcludeMissing
            currencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customerId")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grantExpirationPeriod")
            @ExcludeMissing
            grantExpirationPeriod: JsonField<GrantExpirationPeriod> = JsonMissing.of(),
            @JsonProperty("isEnabled")
            @ExcludeMissing
            isEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("maxSpendLimit")
            @ExcludeMissing
            maxSpendLimit: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("targetBalance")
            @ExcludeMissing
            targetBalance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("thresholdType")
            @ExcludeMissing
            thresholdType: JsonField<ThresholdType> = JsonMissing.of(),
            @JsonProperty("thresholdValue")
            @ExcludeMissing
            thresholdValue: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            currencyId,
            customerId,
            grantExpirationPeriod,
            isEnabled,
            maxSpendLimit,
            targetBalance,
            thresholdType,
            thresholdValue,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * The unique configuration ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Timestamp of when the record was created
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * The currency ID for this configuration
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currencyId(): String = currencyId.getRequired("currencyId")

        /**
         * The customer ID this configuration belongs to
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customerId")

        /**
         * Expiration period for auto-recharge grants (1_MONTH or 1_YEAR)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun grantExpirationPeriod(): GrantExpirationPeriod =
            grantExpirationPeriod.getRequired("grantExpirationPeriod")

        /**
         * Whether automatic recharge is enabled
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isEnabled(): Boolean = isEnabled.getRequired("isEnabled")

        /**
         * Maximum monthly spend limit for automatic recharges
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxSpendLimit(): Optional<Double> = maxSpendLimit.getOptional("maxSpendLimit")

        /**
         * The target credit balance to recharge to
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetBalance(): Double = targetBalance.getRequired("targetBalance")

        /**
         * The threshold type (CREDIT_AMOUNT or DOLLAR_AMOUNT)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun thresholdType(): ThresholdType = thresholdType.getRequired("thresholdType")

        /**
         * The threshold value that triggers a recharge
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun thresholdValue(): Double = thresholdValue.getRequired("thresholdValue")

        /**
         * Timestamp of when the record was last updated
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [currencyId].
         *
         * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currencyId")
        @ExcludeMissing
        fun _currencyId(): JsonField<String> = currencyId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [grantExpirationPeriod].
         *
         * Unlike [grantExpirationPeriod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("grantExpirationPeriod")
        @ExcludeMissing
        fun _grantExpirationPeriod(): JsonField<GrantExpirationPeriod> = grantExpirationPeriod

        /**
         * Returns the raw JSON value of [isEnabled].
         *
         * Unlike [isEnabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isEnabled") @ExcludeMissing fun _isEnabled(): JsonField<Boolean> = isEnabled

        /**
         * Returns the raw JSON value of [maxSpendLimit].
         *
         * Unlike [maxSpendLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maxSpendLimit")
        @ExcludeMissing
        fun _maxSpendLimit(): JsonField<Double> = maxSpendLimit

        /**
         * Returns the raw JSON value of [targetBalance].
         *
         * Unlike [targetBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("targetBalance")
        @ExcludeMissing
        fun _targetBalance(): JsonField<Double> = targetBalance

        /**
         * Returns the raw JSON value of [thresholdType].
         *
         * Unlike [thresholdType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("thresholdType")
        @ExcludeMissing
        fun _thresholdType(): JsonField<ThresholdType> = thresholdType

        /**
         * Returns the raw JSON value of [thresholdValue].
         *
         * Unlike [thresholdValue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("thresholdValue")
        @ExcludeMissing
        fun _thresholdValue(): JsonField<Double> = thresholdValue

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .currencyId()
             * .customerId()
             * .grantExpirationPeriod()
             * .isEnabled()
             * .maxSpendLimit()
             * .targetBalance()
             * .thresholdType()
             * .thresholdValue()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var currencyId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var grantExpirationPeriod: JsonField<GrantExpirationPeriod>? = null
            private var isEnabled: JsonField<Boolean>? = null
            private var maxSpendLimit: JsonField<Double>? = null
            private var targetBalance: JsonField<Double>? = null
            private var thresholdType: JsonField<ThresholdType>? = null
            private var thresholdValue: JsonField<Double>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                currencyId = data.currencyId
                customerId = data.customerId
                grantExpirationPeriod = data.grantExpirationPeriod
                isEnabled = data.isEnabled
                maxSpendLimit = data.maxSpendLimit
                targetBalance = data.targetBalance
                thresholdType = data.thresholdType
                thresholdValue = data.thresholdValue
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The unique configuration ID */
            fun id(id: String?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<String>) = id(id.getOrNull())

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Timestamp of when the record was created */
            fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The currency ID for this configuration */
            fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

            /**
             * Sets [Builder.currencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

            /** The customer ID this configuration belongs to */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Expiration period for auto-recharge grants (1_MONTH or 1_YEAR) */
            fun grantExpirationPeriod(grantExpirationPeriod: GrantExpirationPeriod) =
                grantExpirationPeriod(JsonField.of(grantExpirationPeriod))

            /**
             * Sets [Builder.grantExpirationPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grantExpirationPeriod] with a well-typed
             * [GrantExpirationPeriod] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun grantExpirationPeriod(grantExpirationPeriod: JsonField<GrantExpirationPeriod>) =
                apply {
                    this.grantExpirationPeriod = grantExpirationPeriod
                }

            /** Whether automatic recharge is enabled */
            fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

            /**
             * Sets [Builder.isEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

            /** Maximum monthly spend limit for automatic recharges */
            fun maxSpendLimit(maxSpendLimit: Double?) =
                maxSpendLimit(JsonField.ofNullable(maxSpendLimit))

            /**
             * Alias for [Builder.maxSpendLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxSpendLimit(maxSpendLimit: Double) = maxSpendLimit(maxSpendLimit as Double?)

            /** Alias for calling [Builder.maxSpendLimit] with `maxSpendLimit.orElse(null)`. */
            fun maxSpendLimit(maxSpendLimit: Optional<Double>) =
                maxSpendLimit(maxSpendLimit.getOrNull())

            /**
             * Sets [Builder.maxSpendLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxSpendLimit] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxSpendLimit(maxSpendLimit: JsonField<Double>) = apply {
                this.maxSpendLimit = maxSpendLimit
            }

            /** The target credit balance to recharge to */
            fun targetBalance(targetBalance: Double) = targetBalance(JsonField.of(targetBalance))

            /**
             * Sets [Builder.targetBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetBalance(targetBalance: JsonField<Double>) = apply {
                this.targetBalance = targetBalance
            }

            /** The threshold type (CREDIT_AMOUNT or DOLLAR_AMOUNT) */
            fun thresholdType(thresholdType: ThresholdType) =
                thresholdType(JsonField.of(thresholdType))

            /**
             * Sets [Builder.thresholdType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thresholdType] with a well-typed [ThresholdType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun thresholdType(thresholdType: JsonField<ThresholdType>) = apply {
                this.thresholdType = thresholdType
            }

            /** The threshold value that triggers a recharge */
            fun thresholdValue(thresholdValue: Double) =
                thresholdValue(JsonField.of(thresholdValue))

            /**
             * Sets [Builder.thresholdValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thresholdValue] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun thresholdValue(thresholdValue: JsonField<Double>) = apply {
                this.thresholdValue = thresholdValue
            }

            /** Timestamp of when the record was last updated */
            fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

            /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
            fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .currencyId()
             * .customerId()
             * .grantExpirationPeriod()
             * .isEnabled()
             * .maxSpendLimit()
             * .targetBalance()
             * .thresholdType()
             * .thresholdValue()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("currencyId", currencyId),
                    checkRequired("customerId", customerId),
                    checkRequired("grantExpirationPeriod", grantExpirationPeriod),
                    checkRequired("isEnabled", isEnabled),
                    checkRequired("maxSpendLimit", maxSpendLimit),
                    checkRequired("targetBalance", targetBalance),
                    checkRequired("thresholdType", thresholdType),
                    checkRequired("thresholdValue", thresholdValue),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            currencyId()
            customerId()
            grantExpirationPeriod().validate()
            isEnabled()
            maxSpendLimit()
            targetBalance()
            thresholdType().validate()
            thresholdValue()
            updatedAt()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (currencyId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (grantExpirationPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (isEnabled.asKnown().isPresent) 1 else 0) +
                (if (maxSpendLimit.asKnown().isPresent) 1 else 0) +
                (if (targetBalance.asKnown().isPresent) 1 else 0) +
                (thresholdType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (thresholdValue.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /** Expiration period for auto-recharge grants (1_MONTH or 1_YEAR) */
        class GrantExpirationPeriod
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val _1_MONTH = of("1_MONTH")

                @JvmField val _1_YEAR = of("1_YEAR")

                @JvmStatic fun of(value: String) = GrantExpirationPeriod(JsonField.of(value))
            }

            /** An enum containing [GrantExpirationPeriod]'s known values. */
            enum class Known {
                _1_MONTH,
                _1_YEAR,
            }

            /**
             * An enum containing [GrantExpirationPeriod]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [GrantExpirationPeriod] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                _1_MONTH,
                _1_YEAR,
                /**
                 * An enum member indicating that [GrantExpirationPeriod] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    _1_MONTH -> Value._1_MONTH
                    _1_YEAR -> Value._1_YEAR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws StiggInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    _1_MONTH -> Known._1_MONTH
                    _1_YEAR -> Known._1_YEAR
                    else -> throw StiggInvalidDataException("Unknown GrantExpirationPeriod: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws StiggInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    StiggInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StiggInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): GrantExpirationPeriod = apply {
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

                return other is GrantExpirationPeriod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The threshold type (CREDIT_AMOUNT or DOLLAR_AMOUNT) */
        class ThresholdType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CREDIT_AMOUNT = of("CREDIT_AMOUNT")

                @JvmField val DOLLAR_AMOUNT = of("DOLLAR_AMOUNT")

                @JvmStatic fun of(value: String) = ThresholdType(JsonField.of(value))
            }

            /** An enum containing [ThresholdType]'s known values. */
            enum class Known {
                CREDIT_AMOUNT,
                DOLLAR_AMOUNT,
            }

            /**
             * An enum containing [ThresholdType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ThresholdType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREDIT_AMOUNT,
                DOLLAR_AMOUNT,
                /**
                 * An enum member indicating that [ThresholdType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CREDIT_AMOUNT -> Value.CREDIT_AMOUNT
                    DOLLAR_AMOUNT -> Value.DOLLAR_AMOUNT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws StiggInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CREDIT_AMOUNT -> Known.CREDIT_AMOUNT
                    DOLLAR_AMOUNT -> Known.DOLLAR_AMOUNT
                    else -> throw StiggInvalidDataException("Unknown ThresholdType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws StiggInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    StiggInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StiggInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): ThresholdType = apply {
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

                return other is ThresholdType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                createdAt == other.createdAt &&
                currencyId == other.currencyId &&
                customerId == other.customerId &&
                grantExpirationPeriod == other.grantExpirationPeriod &&
                isEnabled == other.isEnabled &&
                maxSpendLimit == other.maxSpendLimit &&
                targetBalance == other.targetBalance &&
                thresholdType == other.thresholdType &&
                thresholdValue == other.thresholdValue &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                currencyId,
                customerId,
                grantExpirationPeriod,
                isEnabled,
                maxSpendLimit,
                targetBalance,
                thresholdType,
                thresholdValue,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, currencyId=$currencyId, customerId=$customerId, grantExpirationPeriod=$grantExpirationPeriod, isEnabled=$isEnabled, maxSpendLimit=$maxSpendLimit, targetBalance=$targetBalance, thresholdType=$thresholdType, thresholdValue=$thresholdValue, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AutoRechargeGetAutoRechargeResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AutoRechargeGetAutoRechargeResponse{data=$data, additionalProperties=$additionalProperties}"
}
