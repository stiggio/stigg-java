// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.stigg.core.Enum
import io.stigg.core.ExcludeMissing
import io.stigg.core.JsonField
import io.stigg.core.JsonMissing
import io.stigg.core.JsonValue
import io.stigg.core.checkKnown
import io.stigg.core.checkRequired
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Request to set the pricing configuration for a plan or addon. */
class SetPackagePricing
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pricingType: JsonField<PricingType>,
    private val billingId: JsonField<String>,
    private val minimumSpend: JsonField<List<MinimumSpend>>,
    private val overageBillingPeriod: JsonField<OverageBillingPeriod>,
    private val overagePricingModels: JsonField<List<OveragePricingModel>>,
    private val pricingModels: JsonField<List<PricingModel>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("pricingType")
        @ExcludeMissing
        pricingType: JsonField<PricingType> = JsonMissing.of(),
        @JsonProperty("billingId") @ExcludeMissing billingId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        minimumSpend: JsonField<List<MinimumSpend>> = JsonMissing.of(),
        @JsonProperty("overageBillingPeriod")
        @ExcludeMissing
        overageBillingPeriod: JsonField<OverageBillingPeriod> = JsonMissing.of(),
        @JsonProperty("overagePricingModels")
        @ExcludeMissing
        overagePricingModels: JsonField<List<OveragePricingModel>> = JsonMissing.of(),
        @JsonProperty("pricingModels")
        @ExcludeMissing
        pricingModels: JsonField<List<PricingModel>> = JsonMissing.of(),
    ) : this(
        pricingType,
        billingId,
        minimumSpend,
        overageBillingPeriod,
        overagePricingModels,
        pricingModels,
        mutableMapOf(),
    )

    /**
     * The pricing type (FREE, PAID, or CUSTOM)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pricingType(): PricingType = pricingType.getRequired("pricingType")

    /**
     * Deprecated: billing integration ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingId(): Optional<String> = billingId.getOptional("billingId")

    /**
     * Minimum spend configuration per billing period
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpend(): Optional<List<MinimumSpend>> = minimumSpend.getOptional("minimumSpend")

    /**
     * When overage charges are billed
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overageBillingPeriod(): Optional<OverageBillingPeriod> =
        overageBillingPeriod.getOptional("overageBillingPeriod")

    /**
     * Array of overage pricing model configurations
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overagePricingModels(): Optional<List<OveragePricingModel>> =
        overagePricingModels.getOptional("overagePricingModels")

    /**
     * Array of pricing model configurations
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pricingModels(): Optional<List<PricingModel>> = pricingModels.getOptional("pricingModels")

    /**
     * Returns the raw JSON value of [pricingType].
     *
     * Unlike [pricingType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pricingType")
    @ExcludeMissing
    fun _pricingType(): JsonField<PricingType> = pricingType

    /**
     * Returns the raw JSON value of [billingId].
     *
     * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billingId") @ExcludeMissing fun _billingId(): JsonField<String> = billingId

    /**
     * Returns the raw JSON value of [minimumSpend].
     *
     * Unlike [minimumSpend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minimumSpend")
    @ExcludeMissing
    fun _minimumSpend(): JsonField<List<MinimumSpend>> = minimumSpend

    /**
     * Returns the raw JSON value of [overageBillingPeriod].
     *
     * Unlike [overageBillingPeriod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("overageBillingPeriod")
    @ExcludeMissing
    fun _overageBillingPeriod(): JsonField<OverageBillingPeriod> = overageBillingPeriod

    /**
     * Returns the raw JSON value of [overagePricingModels].
     *
     * Unlike [overagePricingModels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("overagePricingModels")
    @ExcludeMissing
    fun _overagePricingModels(): JsonField<List<OveragePricingModel>> = overagePricingModels

    /**
     * Returns the raw JSON value of [pricingModels].
     *
     * Unlike [pricingModels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pricingModels")
    @ExcludeMissing
    fun _pricingModels(): JsonField<List<PricingModel>> = pricingModels

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
         * Returns a mutable builder for constructing an instance of [SetPackagePricing].
         *
         * The following fields are required:
         * ```java
         * .pricingType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SetPackagePricing]. */
    class Builder internal constructor() {

        private var pricingType: JsonField<PricingType>? = null
        private var billingId: JsonField<String> = JsonMissing.of()
        private var minimumSpend: JsonField<MutableList<MinimumSpend>>? = null
        private var overageBillingPeriod: JsonField<OverageBillingPeriod> = JsonMissing.of()
        private var overagePricingModels: JsonField<MutableList<OveragePricingModel>>? = null
        private var pricingModels: JsonField<MutableList<PricingModel>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(setPackagePricing: SetPackagePricing) = apply {
            pricingType = setPackagePricing.pricingType
            billingId = setPackagePricing.billingId
            minimumSpend = setPackagePricing.minimumSpend.map { it.toMutableList() }
            overageBillingPeriod = setPackagePricing.overageBillingPeriod
            overagePricingModels = setPackagePricing.overagePricingModels.map { it.toMutableList() }
            pricingModels = setPackagePricing.pricingModels.map { it.toMutableList() }
            additionalProperties = setPackagePricing.additionalProperties.toMutableMap()
        }

        /** The pricing type (FREE, PAID, or CUSTOM) */
        fun pricingType(pricingType: PricingType) = pricingType(JsonField.of(pricingType))

        /**
         * Sets [Builder.pricingType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricingType] with a well-typed [PricingType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pricingType(pricingType: JsonField<PricingType>) = apply {
            this.pricingType = pricingType
        }

        /** Deprecated: billing integration ID */
        fun billingId(billingId: String) = billingId(JsonField.of(billingId))

        /**
         * Sets [Builder.billingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billingId(billingId: JsonField<String>) = apply { this.billingId = billingId }

        /** Minimum spend configuration per billing period */
        fun minimumSpend(minimumSpend: List<MinimumSpend>?) =
            minimumSpend(JsonField.ofNullable(minimumSpend))

        /** Alias for calling [Builder.minimumSpend] with `minimumSpend.orElse(null)`. */
        fun minimumSpend(minimumSpend: Optional<List<MinimumSpend>>) =
            minimumSpend(minimumSpend.getOrNull())

        /**
         * Sets [Builder.minimumSpend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumSpend] with a well-typed `List<MinimumSpend>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun minimumSpend(minimumSpend: JsonField<List<MinimumSpend>>) = apply {
            this.minimumSpend = minimumSpend.map { it.toMutableList() }
        }

        /**
         * Adds a single [MinimumSpend] to [Builder.minimumSpend].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMinimumSpend(minimumSpend: MinimumSpend) = apply {
            this.minimumSpend =
                (this.minimumSpend ?: JsonField.of(mutableListOf())).also {
                    checkKnown("minimumSpend", it).add(minimumSpend)
                }
        }

        /** When overage charges are billed */
        fun overageBillingPeriod(overageBillingPeriod: OverageBillingPeriod) =
            overageBillingPeriod(JsonField.of(overageBillingPeriod))

        /**
         * Sets [Builder.overageBillingPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageBillingPeriod] with a well-typed
         * [OverageBillingPeriod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun overageBillingPeriod(overageBillingPeriod: JsonField<OverageBillingPeriod>) = apply {
            this.overageBillingPeriod = overageBillingPeriod
        }

        /** Array of overage pricing model configurations */
        fun overagePricingModels(overagePricingModels: List<OveragePricingModel>) =
            overagePricingModels(JsonField.of(overagePricingModels))

        /**
         * Sets [Builder.overagePricingModels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overagePricingModels] with a well-typed
         * `List<OveragePricingModel>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun overagePricingModels(overagePricingModels: JsonField<List<OveragePricingModel>>) =
            apply {
                this.overagePricingModels = overagePricingModels.map { it.toMutableList() }
            }

        /**
         * Adds a single [OveragePricingModel] to [overagePricingModels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOveragePricingModel(overagePricingModel: OveragePricingModel) = apply {
            overagePricingModels =
                (overagePricingModels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("overagePricingModels", it).add(overagePricingModel)
                }
        }

        /** Array of pricing model configurations */
        fun pricingModels(pricingModels: List<PricingModel>) =
            pricingModels(JsonField.of(pricingModels))

        /**
         * Sets [Builder.pricingModels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricingModels] with a well-typed `List<PricingModel>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pricingModels(pricingModels: JsonField<List<PricingModel>>) = apply {
            this.pricingModels = pricingModels.map { it.toMutableList() }
        }

        /**
         * Adds a single [PricingModel] to [pricingModels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPricingModel(pricingModel: PricingModel) = apply {
            pricingModels =
                (pricingModels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pricingModels", it).add(pricingModel)
                }
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
         * Returns an immutable instance of [SetPackagePricing].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pricingType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SetPackagePricing =
            SetPackagePricing(
                checkRequired("pricingType", pricingType),
                billingId,
                (minimumSpend ?: JsonMissing.of()).map { it.toImmutable() },
                overageBillingPeriod,
                (overagePricingModels ?: JsonMissing.of()).map { it.toImmutable() },
                (pricingModels ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SetPackagePricing = apply {
        if (validated) {
            return@apply
        }

        pricingType().validate()
        billingId()
        minimumSpend().ifPresent { it.forEach { it.validate() } }
        overageBillingPeriod().ifPresent { it.validate() }
        overagePricingModels().ifPresent { it.forEach { it.validate() } }
        pricingModels().ifPresent { it.forEach { it.validate() } }
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
        (pricingType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (billingId.asKnown().isPresent) 1 else 0) +
            (minimumSpend.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (overageBillingPeriod.asKnown().getOrNull()?.validity() ?: 0) +
            (overagePricingModels.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (pricingModels.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** The pricing type (FREE, PAID, or CUSTOM) */
    class PricingType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val FREE = of("FREE")

            @JvmField val PAID = of("PAID")

            @JvmField val CUSTOM = of("CUSTOM")

            @JvmStatic fun of(value: String) = PricingType(JsonField.of(value))
        }

        /** An enum containing [PricingType]'s known values. */
        enum class Known {
            FREE,
            PAID,
            CUSTOM,
        }

        /**
         * An enum containing [PricingType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PricingType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FREE,
            PAID,
            CUSTOM,
            /**
             * An enum member indicating that [PricingType] was instantiated with an unknown value.
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
                FREE -> Value.FREE
                PAID -> Value.PAID
                CUSTOM -> Value.CUSTOM
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
                FREE -> Known.FREE
                PAID -> Known.PAID
                CUSTOM -> Known.CUSTOM
                else -> throw StiggInvalidDataException("Unknown PricingType: $value")
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

        fun validate(): PricingType = apply {
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

            return other is PricingType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Minimum spend configuration for a billing period. */
    class MinimumSpend
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingPeriod: JsonField<BillingPeriod>,
        private val minimum: JsonField<Minimum>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billingPeriod")
            @ExcludeMissing
            billingPeriod: JsonField<BillingPeriod> = JsonMissing.of(),
            @JsonProperty("minimum") @ExcludeMissing minimum: JsonField<Minimum> = JsonMissing.of(),
        ) : this(billingPeriod, minimum, mutableMapOf())

        /**
         * The billing period
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingPeriod(): BillingPeriod = billingPeriod.getRequired("billingPeriod")

        /**
         * The minimum spend amount
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun minimum(): Minimum = minimum.getRequired("minimum")

        /**
         * Returns the raw JSON value of [billingPeriod].
         *
         * Unlike [billingPeriod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingPeriod")
        @ExcludeMissing
        fun _billingPeriod(): JsonField<BillingPeriod> = billingPeriod

        /**
         * Returns the raw JSON value of [minimum].
         *
         * Unlike [minimum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<Minimum> = minimum

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
             * Returns a mutable builder for constructing an instance of [MinimumSpend].
             *
             * The following fields are required:
             * ```java
             * .billingPeriod()
             * .minimum()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MinimumSpend]. */
        class Builder internal constructor() {

            private var billingPeriod: JsonField<BillingPeriod>? = null
            private var minimum: JsonField<Minimum>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimumSpend: MinimumSpend) = apply {
                billingPeriod = minimumSpend.billingPeriod
                minimum = minimumSpend.minimum
                additionalProperties = minimumSpend.additionalProperties.toMutableMap()
            }

            /** The billing period */
            fun billingPeriod(billingPeriod: BillingPeriod) =
                billingPeriod(JsonField.of(billingPeriod))

            /**
             * Sets [Builder.billingPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingPeriod] with a well-typed [BillingPeriod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingPeriod(billingPeriod: JsonField<BillingPeriod>) = apply {
                this.billingPeriod = billingPeriod
            }

            /** The minimum spend amount */
            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            /**
             * Sets [Builder.minimum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimum] with a well-typed [Minimum] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

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
             * Returns an immutable instance of [MinimumSpend].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billingPeriod()
             * .minimum()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): MinimumSpend =
                MinimumSpend(
                    checkRequired("billingPeriod", billingPeriod),
                    checkRequired("minimum", minimum),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): MinimumSpend = apply {
            if (validated) {
                return@apply
            }

            billingPeriod().validate()
            minimum().validate()
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
            (billingPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                (minimum.asKnown().getOrNull()?.validity() ?: 0)

        /** The billing period */
        class BillingPeriod @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val MONTHLY = of("MONTHLY")

                @JvmField val ANNUALLY = of("ANNUALLY")

                @JvmStatic fun of(value: String) = BillingPeriod(JsonField.of(value))
            }

            /** An enum containing [BillingPeriod]'s known values. */
            enum class Known {
                MONTHLY,
                ANNUALLY,
            }

            /**
             * An enum containing [BillingPeriod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillingPeriod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MONTHLY,
                ANNUALLY,
                /**
                 * An enum member indicating that [BillingPeriod] was instantiated with an unknown
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
                    MONTHLY -> Value.MONTHLY
                    ANNUALLY -> Value.ANNUALLY
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
                    MONTHLY -> Known.MONTHLY
                    ANNUALLY -> Known.ANNUALLY
                    else -> throw StiggInvalidDataException("Unknown BillingPeriod: $value")
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

            fun validate(): BillingPeriod = apply {
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

                return other is BillingPeriod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The minimum spend amount */
        class Minimum
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val currency: JsonField<Currency>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
            ) : this(amount, currency, mutableMapOf())

            /**
             * The price amount
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * The price currency
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<Currency> = currency.getOptional("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

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
                 * Returns a mutable builder for constructing an instance of [Minimum].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Minimum]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(minimum: Minimum) = apply {
                    amount = minimum.amount
                    currency = minimum.currency
                    additionalProperties = minimum.additionalProperties.toMutableMap()
                }

                /** The price amount */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** The price currency */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Minimum].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Minimum =
                    Minimum(
                        checkRequired("amount", amount),
                        currency,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Minimum = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency().ifPresent { it.validate() }
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (currency.asKnown().getOrNull()?.validity() ?: 0)

            /** The price currency */
            class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val USD = of("usd")

                    @JvmField val AED = of("aed")

                    @JvmField val ALL = of("all")

                    @JvmField val AMD = of("amd")

                    @JvmField val ANG = of("ang")

                    @JvmField val AUD = of("aud")

                    @JvmField val AWG = of("awg")

                    @JvmField val AZN = of("azn")

                    @JvmField val BAM = of("bam")

                    @JvmField val BBD = of("bbd")

                    @JvmField val BDT = of("bdt")

                    @JvmField val BGN = of("bgn")

                    @JvmField val BIF = of("bif")

                    @JvmField val BMD = of("bmd")

                    @JvmField val BND = of("bnd")

                    @JvmField val BSD = of("bsd")

                    @JvmField val BWP = of("bwp")

                    @JvmField val BYN = of("byn")

                    @JvmField val BZD = of("bzd")

                    @JvmField val BRL = of("brl")

                    @JvmField val CAD = of("cad")

                    @JvmField val CDF = of("cdf")

                    @JvmField val CHF = of("chf")

                    @JvmField val CNY = of("cny")

                    @JvmField val CZK = of("czk")

                    @JvmField val DKK = of("dkk")

                    @JvmField val DOP = of("dop")

                    @JvmField val DZD = of("dzd")

                    @JvmField val EGP = of("egp")

                    @JvmField val ETB = of("etb")

                    @JvmField val EUR = of("eur")

                    @JvmField val FJD = of("fjd")

                    @JvmField val GBP = of("gbp")

                    @JvmField val GEL = of("gel")

                    @JvmField val GIP = of("gip")

                    @JvmField val GMD = of("gmd")

                    @JvmField val GYD = of("gyd")

                    @JvmField val HKD = of("hkd")

                    @JvmField val HRK = of("hrk")

                    @JvmField val HTG = of("htg")

                    @JvmField val IDR = of("idr")

                    @JvmField val ILS = of("ils")

                    @JvmField val INR = of("inr")

                    @JvmField val ISK = of("isk")

                    @JvmField val JMD = of("jmd")

                    @JvmField val JPY = of("jpy")

                    @JvmField val KES = of("kes")

                    @JvmField val KGS = of("kgs")

                    @JvmField val KHR = of("khr")

                    @JvmField val KMF = of("kmf")

                    @JvmField val KRW = of("krw")

                    @JvmField val KYD = of("kyd")

                    @JvmField val KZT = of("kzt")

                    @JvmField val LBP = of("lbp")

                    @JvmField val LKR = of("lkr")

                    @JvmField val LRD = of("lrd")

                    @JvmField val LSL = of("lsl")

                    @JvmField val MAD = of("mad")

                    @JvmField val MDL = of("mdl")

                    @JvmField val MGA = of("mga")

                    @JvmField val MKD = of("mkd")

                    @JvmField val MMK = of("mmk")

                    @JvmField val MNT = of("mnt")

                    @JvmField val MOP = of("mop")

                    @JvmField val MRO = of("mro")

                    @JvmField val MVR = of("mvr")

                    @JvmField val MWK = of("mwk")

                    @JvmField val MXN = of("mxn")

                    @JvmField val MYR = of("myr")

                    @JvmField val MZN = of("mzn")

                    @JvmField val NAD = of("nad")

                    @JvmField val NGN = of("ngn")

                    @JvmField val NOK = of("nok")

                    @JvmField val NPR = of("npr")

                    @JvmField val NZD = of("nzd")

                    @JvmField val PGK = of("pgk")

                    @JvmField val PHP = of("php")

                    @JvmField val PKR = of("pkr")

                    @JvmField val PLN = of("pln")

                    @JvmField val QAR = of("qar")

                    @JvmField val RON = of("ron")

                    @JvmField val RSD = of("rsd")

                    @JvmField val RUB = of("rub")

                    @JvmField val RWF = of("rwf")

                    @JvmField val SAR = of("sar")

                    @JvmField val SBD = of("sbd")

                    @JvmField val SCR = of("scr")

                    @JvmField val SEK = of("sek")

                    @JvmField val SGD = of("sgd")

                    @JvmField val SLE = of("sle")

                    @JvmField val SLL = of("sll")

                    @JvmField val SOS = of("sos")

                    @JvmField val SZL = of("szl")

                    @JvmField val THB = of("thb")

                    @JvmField val TJS = of("tjs")

                    @JvmField val TOP = of("top")

                    @JvmField val TRY = of("try")

                    @JvmField val TTD = of("ttd")

                    @JvmField val TZS = of("tzs")

                    @JvmField val UAH = of("uah")

                    @JvmField val UZS = of("uzs")

                    @JvmField val VND = of("vnd")

                    @JvmField val VUV = of("vuv")

                    @JvmField val WST = of("wst")

                    @JvmField val XAF = of("xaf")

                    @JvmField val XCD = of("xcd")

                    @JvmField val YER = of("yer")

                    @JvmField val ZAR = of("zar")

                    @JvmField val ZMW = of("zmw")

                    @JvmField val CLP = of("clp")

                    @JvmField val DJF = of("djf")

                    @JvmField val GNF = of("gnf")

                    @JvmField val UGX = of("ugx")

                    @JvmField val PYG = of("pyg")

                    @JvmField val XOF = of("xof")

                    @JvmField val XPF = of("xpf")

                    @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                }

                /** An enum containing [Currency]'s known values. */
                enum class Known {
                    USD,
                    AED,
                    ALL,
                    AMD,
                    ANG,
                    AUD,
                    AWG,
                    AZN,
                    BAM,
                    BBD,
                    BDT,
                    BGN,
                    BIF,
                    BMD,
                    BND,
                    BSD,
                    BWP,
                    BYN,
                    BZD,
                    BRL,
                    CAD,
                    CDF,
                    CHF,
                    CNY,
                    CZK,
                    DKK,
                    DOP,
                    DZD,
                    EGP,
                    ETB,
                    EUR,
                    FJD,
                    GBP,
                    GEL,
                    GIP,
                    GMD,
                    GYD,
                    HKD,
                    HRK,
                    HTG,
                    IDR,
                    ILS,
                    INR,
                    ISK,
                    JMD,
                    JPY,
                    KES,
                    KGS,
                    KHR,
                    KMF,
                    KRW,
                    KYD,
                    KZT,
                    LBP,
                    LKR,
                    LRD,
                    LSL,
                    MAD,
                    MDL,
                    MGA,
                    MKD,
                    MMK,
                    MNT,
                    MOP,
                    MRO,
                    MVR,
                    MWK,
                    MXN,
                    MYR,
                    MZN,
                    NAD,
                    NGN,
                    NOK,
                    NPR,
                    NZD,
                    PGK,
                    PHP,
                    PKR,
                    PLN,
                    QAR,
                    RON,
                    RSD,
                    RUB,
                    RWF,
                    SAR,
                    SBD,
                    SCR,
                    SEK,
                    SGD,
                    SLE,
                    SLL,
                    SOS,
                    SZL,
                    THB,
                    TJS,
                    TOP,
                    TRY,
                    TTD,
                    TZS,
                    UAH,
                    UZS,
                    VND,
                    VUV,
                    WST,
                    XAF,
                    XCD,
                    YER,
                    ZAR,
                    ZMW,
                    CLP,
                    DJF,
                    GNF,
                    UGX,
                    PYG,
                    XOF,
                    XPF,
                }

                /**
                 * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Currency] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USD,
                    AED,
                    ALL,
                    AMD,
                    ANG,
                    AUD,
                    AWG,
                    AZN,
                    BAM,
                    BBD,
                    BDT,
                    BGN,
                    BIF,
                    BMD,
                    BND,
                    BSD,
                    BWP,
                    BYN,
                    BZD,
                    BRL,
                    CAD,
                    CDF,
                    CHF,
                    CNY,
                    CZK,
                    DKK,
                    DOP,
                    DZD,
                    EGP,
                    ETB,
                    EUR,
                    FJD,
                    GBP,
                    GEL,
                    GIP,
                    GMD,
                    GYD,
                    HKD,
                    HRK,
                    HTG,
                    IDR,
                    ILS,
                    INR,
                    ISK,
                    JMD,
                    JPY,
                    KES,
                    KGS,
                    KHR,
                    KMF,
                    KRW,
                    KYD,
                    KZT,
                    LBP,
                    LKR,
                    LRD,
                    LSL,
                    MAD,
                    MDL,
                    MGA,
                    MKD,
                    MMK,
                    MNT,
                    MOP,
                    MRO,
                    MVR,
                    MWK,
                    MXN,
                    MYR,
                    MZN,
                    NAD,
                    NGN,
                    NOK,
                    NPR,
                    NZD,
                    PGK,
                    PHP,
                    PKR,
                    PLN,
                    QAR,
                    RON,
                    RSD,
                    RUB,
                    RWF,
                    SAR,
                    SBD,
                    SCR,
                    SEK,
                    SGD,
                    SLE,
                    SLL,
                    SOS,
                    SZL,
                    THB,
                    TJS,
                    TOP,
                    TRY,
                    TTD,
                    TZS,
                    UAH,
                    UZS,
                    VND,
                    VUV,
                    WST,
                    XAF,
                    XCD,
                    YER,
                    ZAR,
                    ZMW,
                    CLP,
                    DJF,
                    GNF,
                    UGX,
                    PYG,
                    XOF,
                    XPF,
                    /**
                     * An enum member indicating that [Currency] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        USD -> Value.USD
                        AED -> Value.AED
                        ALL -> Value.ALL
                        AMD -> Value.AMD
                        ANG -> Value.ANG
                        AUD -> Value.AUD
                        AWG -> Value.AWG
                        AZN -> Value.AZN
                        BAM -> Value.BAM
                        BBD -> Value.BBD
                        BDT -> Value.BDT
                        BGN -> Value.BGN
                        BIF -> Value.BIF
                        BMD -> Value.BMD
                        BND -> Value.BND
                        BSD -> Value.BSD
                        BWP -> Value.BWP
                        BYN -> Value.BYN
                        BZD -> Value.BZD
                        BRL -> Value.BRL
                        CAD -> Value.CAD
                        CDF -> Value.CDF
                        CHF -> Value.CHF
                        CNY -> Value.CNY
                        CZK -> Value.CZK
                        DKK -> Value.DKK
                        DOP -> Value.DOP
                        DZD -> Value.DZD
                        EGP -> Value.EGP
                        ETB -> Value.ETB
                        EUR -> Value.EUR
                        FJD -> Value.FJD
                        GBP -> Value.GBP
                        GEL -> Value.GEL
                        GIP -> Value.GIP
                        GMD -> Value.GMD
                        GYD -> Value.GYD
                        HKD -> Value.HKD
                        HRK -> Value.HRK
                        HTG -> Value.HTG
                        IDR -> Value.IDR
                        ILS -> Value.ILS
                        INR -> Value.INR
                        ISK -> Value.ISK
                        JMD -> Value.JMD
                        JPY -> Value.JPY
                        KES -> Value.KES
                        KGS -> Value.KGS
                        KHR -> Value.KHR
                        KMF -> Value.KMF
                        KRW -> Value.KRW
                        KYD -> Value.KYD
                        KZT -> Value.KZT
                        LBP -> Value.LBP
                        LKR -> Value.LKR
                        LRD -> Value.LRD
                        LSL -> Value.LSL
                        MAD -> Value.MAD
                        MDL -> Value.MDL
                        MGA -> Value.MGA
                        MKD -> Value.MKD
                        MMK -> Value.MMK
                        MNT -> Value.MNT
                        MOP -> Value.MOP
                        MRO -> Value.MRO
                        MVR -> Value.MVR
                        MWK -> Value.MWK
                        MXN -> Value.MXN
                        MYR -> Value.MYR
                        MZN -> Value.MZN
                        NAD -> Value.NAD
                        NGN -> Value.NGN
                        NOK -> Value.NOK
                        NPR -> Value.NPR
                        NZD -> Value.NZD
                        PGK -> Value.PGK
                        PHP -> Value.PHP
                        PKR -> Value.PKR
                        PLN -> Value.PLN
                        QAR -> Value.QAR
                        RON -> Value.RON
                        RSD -> Value.RSD
                        RUB -> Value.RUB
                        RWF -> Value.RWF
                        SAR -> Value.SAR
                        SBD -> Value.SBD
                        SCR -> Value.SCR
                        SEK -> Value.SEK
                        SGD -> Value.SGD
                        SLE -> Value.SLE
                        SLL -> Value.SLL
                        SOS -> Value.SOS
                        SZL -> Value.SZL
                        THB -> Value.THB
                        TJS -> Value.TJS
                        TOP -> Value.TOP
                        TRY -> Value.TRY
                        TTD -> Value.TTD
                        TZS -> Value.TZS
                        UAH -> Value.UAH
                        UZS -> Value.UZS
                        VND -> Value.VND
                        VUV -> Value.VUV
                        WST -> Value.WST
                        XAF -> Value.XAF
                        XCD -> Value.XCD
                        YER -> Value.YER
                        ZAR -> Value.ZAR
                        ZMW -> Value.ZMW
                        CLP -> Value.CLP
                        DJF -> Value.DJF
                        GNF -> Value.GNF
                        UGX -> Value.UGX
                        PYG -> Value.PYG
                        XOF -> Value.XOF
                        XPF -> Value.XPF
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
                        USD -> Known.USD
                        AED -> Known.AED
                        ALL -> Known.ALL
                        AMD -> Known.AMD
                        ANG -> Known.ANG
                        AUD -> Known.AUD
                        AWG -> Known.AWG
                        AZN -> Known.AZN
                        BAM -> Known.BAM
                        BBD -> Known.BBD
                        BDT -> Known.BDT
                        BGN -> Known.BGN
                        BIF -> Known.BIF
                        BMD -> Known.BMD
                        BND -> Known.BND
                        BSD -> Known.BSD
                        BWP -> Known.BWP
                        BYN -> Known.BYN
                        BZD -> Known.BZD
                        BRL -> Known.BRL
                        CAD -> Known.CAD
                        CDF -> Known.CDF
                        CHF -> Known.CHF
                        CNY -> Known.CNY
                        CZK -> Known.CZK
                        DKK -> Known.DKK
                        DOP -> Known.DOP
                        DZD -> Known.DZD
                        EGP -> Known.EGP
                        ETB -> Known.ETB
                        EUR -> Known.EUR
                        FJD -> Known.FJD
                        GBP -> Known.GBP
                        GEL -> Known.GEL
                        GIP -> Known.GIP
                        GMD -> Known.GMD
                        GYD -> Known.GYD
                        HKD -> Known.HKD
                        HRK -> Known.HRK
                        HTG -> Known.HTG
                        IDR -> Known.IDR
                        ILS -> Known.ILS
                        INR -> Known.INR
                        ISK -> Known.ISK
                        JMD -> Known.JMD
                        JPY -> Known.JPY
                        KES -> Known.KES
                        KGS -> Known.KGS
                        KHR -> Known.KHR
                        KMF -> Known.KMF
                        KRW -> Known.KRW
                        KYD -> Known.KYD
                        KZT -> Known.KZT
                        LBP -> Known.LBP
                        LKR -> Known.LKR
                        LRD -> Known.LRD
                        LSL -> Known.LSL
                        MAD -> Known.MAD
                        MDL -> Known.MDL
                        MGA -> Known.MGA
                        MKD -> Known.MKD
                        MMK -> Known.MMK
                        MNT -> Known.MNT
                        MOP -> Known.MOP
                        MRO -> Known.MRO
                        MVR -> Known.MVR
                        MWK -> Known.MWK
                        MXN -> Known.MXN
                        MYR -> Known.MYR
                        MZN -> Known.MZN
                        NAD -> Known.NAD
                        NGN -> Known.NGN
                        NOK -> Known.NOK
                        NPR -> Known.NPR
                        NZD -> Known.NZD
                        PGK -> Known.PGK
                        PHP -> Known.PHP
                        PKR -> Known.PKR
                        PLN -> Known.PLN
                        QAR -> Known.QAR
                        RON -> Known.RON
                        RSD -> Known.RSD
                        RUB -> Known.RUB
                        RWF -> Known.RWF
                        SAR -> Known.SAR
                        SBD -> Known.SBD
                        SCR -> Known.SCR
                        SEK -> Known.SEK
                        SGD -> Known.SGD
                        SLE -> Known.SLE
                        SLL -> Known.SLL
                        SOS -> Known.SOS
                        SZL -> Known.SZL
                        THB -> Known.THB
                        TJS -> Known.TJS
                        TOP -> Known.TOP
                        TRY -> Known.TRY
                        TTD -> Known.TTD
                        TZS -> Known.TZS
                        UAH -> Known.UAH
                        UZS -> Known.UZS
                        VND -> Known.VND
                        VUV -> Known.VUV
                        WST -> Known.WST
                        XAF -> Known.XAF
                        XCD -> Known.XCD
                        YER -> Known.YER
                        ZAR -> Known.ZAR
                        ZMW -> Known.ZMW
                        CLP -> Known.CLP
                        DJF -> Known.DJF
                        GNF -> Known.GNF
                        UGX -> Known.UGX
                        PYG -> Known.PYG
                        XOF -> Known.XOF
                        XPF -> Known.XPF
                        else -> throw StiggInvalidDataException("Unknown Currency: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StiggInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Currency = apply {
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

                    return other is Currency && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Minimum{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MinimumSpend &&
                billingPeriod == other.billingPeriod &&
                minimum == other.minimum &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(billingPeriod, minimum, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MinimumSpend{billingPeriod=$billingPeriod, minimum=$minimum, additionalProperties=$additionalProperties}"
    }

    /** When overage charges are billed */
    class OverageBillingPeriod
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

            @JvmField val ON_SUBSCRIPTION_RENEWAL = of("ON_SUBSCRIPTION_RENEWAL")

            @JvmField val MONTHLY = of("MONTHLY")

            @JvmStatic fun of(value: String) = OverageBillingPeriod(JsonField.of(value))
        }

        /** An enum containing [OverageBillingPeriod]'s known values. */
        enum class Known {
            ON_SUBSCRIPTION_RENEWAL,
            MONTHLY,
        }

        /**
         * An enum containing [OverageBillingPeriod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [OverageBillingPeriod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ON_SUBSCRIPTION_RENEWAL,
            MONTHLY,
            /**
             * An enum member indicating that [OverageBillingPeriod] was instantiated with an
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
                ON_SUBSCRIPTION_RENEWAL -> Value.ON_SUBSCRIPTION_RENEWAL
                MONTHLY -> Value.MONTHLY
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
                ON_SUBSCRIPTION_RENEWAL -> Known.ON_SUBSCRIPTION_RENEWAL
                MONTHLY -> Known.MONTHLY
                else -> throw StiggInvalidDataException("Unknown OverageBillingPeriod: $value")
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

        fun validate(): OverageBillingPeriod = apply {
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

            return other is OverageBillingPeriod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Overage pricing model configuration. */
    class OveragePricingModel
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingModel: JsonField<BillingModel>,
        private val pricePeriods: JsonField<List<PricePeriod>>,
        private val billingCadence: JsonField<BillingCadence>,
        private val entitlement: JsonField<Entitlement>,
        private val featureId: JsonField<String>,
        private val topUpCustomCurrencyId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billingModel")
            @ExcludeMissing
            billingModel: JsonField<BillingModel> = JsonMissing.of(),
            @JsonProperty("pricePeriods")
            @ExcludeMissing
            pricePeriods: JsonField<List<PricePeriod>> = JsonMissing.of(),
            @JsonProperty("billingCadence")
            @ExcludeMissing
            billingCadence: JsonField<BillingCadence> = JsonMissing.of(),
            @JsonProperty("entitlement")
            @ExcludeMissing
            entitlement: JsonField<Entitlement> = JsonMissing.of(),
            @JsonProperty("featureId")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("topUpCustomCurrencyId")
            @ExcludeMissing
            topUpCustomCurrencyId: JsonField<String> = JsonMissing.of(),
        ) : this(
            billingModel,
            pricePeriods,
            billingCadence,
            entitlement,
            featureId,
            topUpCustomCurrencyId,
            mutableMapOf(),
        )

        /**
         * The billing model for overages
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingModel(): BillingModel = billingModel.getRequired("billingModel")

        /**
         * Price periods for overage pricing
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pricePeriods(): List<PricePeriod> = pricePeriods.getRequired("pricePeriods")

        /**
         * The billing cadence for overages
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingCadence(): Optional<BillingCadence> =
            billingCadence.getOptional("billingCadence")

        /**
         * Entitlement configuration for the overage feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entitlement(): Optional<Entitlement> = entitlement.getOptional("entitlement")

        /**
         * The feature ID for overage pricing
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureId(): Optional<String> = featureId.getOptional("featureId")

        /**
         * Custom currency ID for overage top-up
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun topUpCustomCurrencyId(): Optional<String> =
            topUpCustomCurrencyId.getOptional("topUpCustomCurrencyId")

        /**
         * Returns the raw JSON value of [billingModel].
         *
         * Unlike [billingModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingModel")
        @ExcludeMissing
        fun _billingModel(): JsonField<BillingModel> = billingModel

        /**
         * Returns the raw JSON value of [pricePeriods].
         *
         * Unlike [pricePeriods], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pricePeriods")
        @ExcludeMissing
        fun _pricePeriods(): JsonField<List<PricePeriod>> = pricePeriods

        /**
         * Returns the raw JSON value of [billingCadence].
         *
         * Unlike [billingCadence], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingCadence")
        @ExcludeMissing
        fun _billingCadence(): JsonField<BillingCadence> = billingCadence

        /**
         * Returns the raw JSON value of [entitlement].
         *
         * Unlike [entitlement], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entitlement")
        @ExcludeMissing
        fun _entitlement(): JsonField<Entitlement> = entitlement

        /**
         * Returns the raw JSON value of [featureId].
         *
         * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

        /**
         * Returns the raw JSON value of [topUpCustomCurrencyId].
         *
         * Unlike [topUpCustomCurrencyId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("topUpCustomCurrencyId")
        @ExcludeMissing
        fun _topUpCustomCurrencyId(): JsonField<String> = topUpCustomCurrencyId

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
             * Returns a mutable builder for constructing an instance of [OveragePricingModel].
             *
             * The following fields are required:
             * ```java
             * .billingModel()
             * .pricePeriods()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OveragePricingModel]. */
        class Builder internal constructor() {

            private var billingModel: JsonField<BillingModel>? = null
            private var pricePeriods: JsonField<MutableList<PricePeriod>>? = null
            private var billingCadence: JsonField<BillingCadence> = JsonMissing.of()
            private var entitlement: JsonField<Entitlement> = JsonMissing.of()
            private var featureId: JsonField<String> = JsonMissing.of()
            private var topUpCustomCurrencyId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overagePricingModel: OveragePricingModel) = apply {
                billingModel = overagePricingModel.billingModel
                pricePeriods = overagePricingModel.pricePeriods.map { it.toMutableList() }
                billingCadence = overagePricingModel.billingCadence
                entitlement = overagePricingModel.entitlement
                featureId = overagePricingModel.featureId
                topUpCustomCurrencyId = overagePricingModel.topUpCustomCurrencyId
                additionalProperties = overagePricingModel.additionalProperties.toMutableMap()
            }

            /** The billing model for overages */
            fun billingModel(billingModel: BillingModel) = billingModel(JsonField.of(billingModel))

            /**
             * Sets [Builder.billingModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingModel] with a well-typed [BillingModel] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingModel(billingModel: JsonField<BillingModel>) = apply {
                this.billingModel = billingModel
            }

            /** Price periods for overage pricing */
            fun pricePeriods(pricePeriods: List<PricePeriod>) =
                pricePeriods(JsonField.of(pricePeriods))

            /**
             * Sets [Builder.pricePeriods] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricePeriods] with a well-typed `List<PricePeriod>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pricePeriods(pricePeriods: JsonField<List<PricePeriod>>) = apply {
                this.pricePeriods = pricePeriods.map { it.toMutableList() }
            }

            /**
             * Adds a single [PricePeriod] to [pricePeriods].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPricePeriod(pricePeriod: PricePeriod) = apply {
                pricePeriods =
                    (pricePeriods ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pricePeriods", it).add(pricePeriod)
                    }
            }

            /** The billing cadence for overages */
            fun billingCadence(billingCadence: BillingCadence) =
                billingCadence(JsonField.of(billingCadence))

            /**
             * Sets [Builder.billingCadence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingCadence] with a well-typed [BillingCadence]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingCadence(billingCadence: JsonField<BillingCadence>) = apply {
                this.billingCadence = billingCadence
            }

            /** Entitlement configuration for the overage feature */
            fun entitlement(entitlement: Entitlement) = entitlement(JsonField.of(entitlement))

            /**
             * Sets [Builder.entitlement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entitlement] with a well-typed [Entitlement] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entitlement(entitlement: JsonField<Entitlement>) = apply {
                this.entitlement = entitlement
            }

            /** The feature ID for overage pricing */
            fun featureId(featureId: String) = featureId(JsonField.of(featureId))

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

            /** Custom currency ID for overage top-up */
            fun topUpCustomCurrencyId(topUpCustomCurrencyId: String) =
                topUpCustomCurrencyId(JsonField.of(topUpCustomCurrencyId))

            /**
             * Sets [Builder.topUpCustomCurrencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topUpCustomCurrencyId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun topUpCustomCurrencyId(topUpCustomCurrencyId: JsonField<String>) = apply {
                this.topUpCustomCurrencyId = topUpCustomCurrencyId
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
             * Returns an immutable instance of [OveragePricingModel].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billingModel()
             * .pricePeriods()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OveragePricingModel =
                OveragePricingModel(
                    checkRequired("billingModel", billingModel),
                    checkRequired("pricePeriods", pricePeriods).map { it.toImmutable() },
                    billingCadence,
                    entitlement,
                    featureId,
                    topUpCustomCurrencyId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): OveragePricingModel = apply {
            if (validated) {
                return@apply
            }

            billingModel().validate()
            pricePeriods().forEach { it.validate() }
            billingCadence().ifPresent { it.validate() }
            entitlement().ifPresent { it.validate() }
            featureId()
            topUpCustomCurrencyId()
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
            (billingModel.asKnown().getOrNull()?.validity() ?: 0) +
                (pricePeriods.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (billingCadence.asKnown().getOrNull()?.validity() ?: 0) +
                (entitlement.asKnown().getOrNull()?.validity() ?: 0) +
                (if (featureId.asKnown().isPresent) 1 else 0) +
                (if (topUpCustomCurrencyId.asKnown().isPresent) 1 else 0)

        /** The billing model for overages */
        class BillingModel @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val FLAT_FEE = of("FLAT_FEE")

                @JvmField val MINIMUM_SPEND = of("MINIMUM_SPEND")

                @JvmField val PER_UNIT = of("PER_UNIT")

                @JvmField val USAGE_BASED = of("USAGE_BASED")

                @JvmField val CREDIT_BASED = of("CREDIT_BASED")

                @JvmStatic fun of(value: String) = BillingModel(JsonField.of(value))
            }

            /** An enum containing [BillingModel]'s known values. */
            enum class Known {
                FLAT_FEE,
                MINIMUM_SPEND,
                PER_UNIT,
                USAGE_BASED,
                CREDIT_BASED,
            }

            /**
             * An enum containing [BillingModel]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillingModel] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FLAT_FEE,
                MINIMUM_SPEND,
                PER_UNIT,
                USAGE_BASED,
                CREDIT_BASED,
                /**
                 * An enum member indicating that [BillingModel] was instantiated with an unknown
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
                    FLAT_FEE -> Value.FLAT_FEE
                    MINIMUM_SPEND -> Value.MINIMUM_SPEND
                    PER_UNIT -> Value.PER_UNIT
                    USAGE_BASED -> Value.USAGE_BASED
                    CREDIT_BASED -> Value.CREDIT_BASED
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
                    FLAT_FEE -> Known.FLAT_FEE
                    MINIMUM_SPEND -> Known.MINIMUM_SPEND
                    PER_UNIT -> Known.PER_UNIT
                    USAGE_BASED -> Known.USAGE_BASED
                    CREDIT_BASED -> Known.CREDIT_BASED
                    else -> throw StiggInvalidDataException("Unknown BillingModel: $value")
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

            fun validate(): BillingModel = apply {
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

                return other is BillingModel && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Price configuration for a specific billing period. */
        class PricePeriod
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val billingPeriod: JsonField<BillingPeriod>,
            private val billingCountryCode: JsonField<String>,
            private val blockSize: JsonField<Double>,
            private val creditGrantCadence: JsonField<CreditGrantCadence>,
            private val creditRate: JsonField<CreditRate>,
            private val price: JsonField<Price>,
            private val tiers: JsonField<List<Tier>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billingPeriod")
                @ExcludeMissing
                billingPeriod: JsonField<BillingPeriod> = JsonMissing.of(),
                @JsonProperty("billingCountryCode")
                @ExcludeMissing
                billingCountryCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("blockSize")
                @ExcludeMissing
                blockSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("creditGrantCadence")
                @ExcludeMissing
                creditGrantCadence: JsonField<CreditGrantCadence> = JsonMissing.of(),
                @JsonProperty("creditRate")
                @ExcludeMissing
                creditRate: JsonField<CreditRate> = JsonMissing.of(),
                @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
                @JsonProperty("tiers")
                @ExcludeMissing
                tiers: JsonField<List<Tier>> = JsonMissing.of(),
            ) : this(
                billingPeriod,
                billingCountryCode,
                blockSize,
                creditGrantCadence,
                creditRate,
                price,
                tiers,
                mutableMapOf(),
            )

            /**
             * The billing period (MONTHLY or ANNUALLY)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun billingPeriod(): BillingPeriod = billingPeriod.getRequired("billingPeriod")

            /**
             * ISO country code for localized pricing
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billingCountryCode(): Optional<String> =
                billingCountryCode.getOptional("billingCountryCode")

            /**
             * Block size for usage-based pricing
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun blockSize(): Optional<Double> = blockSize.getOptional("blockSize")

            /**
             * When credits are granted
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun creditGrantCadence(): Optional<CreditGrantCadence> =
                creditGrantCadence.getOptional("creditGrantCadence")

            /**
             * Credit rate configuration for credit-based pricing
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun creditRate(): Optional<CreditRate> = creditRate.getOptional("creditRate")

            /**
             * The price amount and currency
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun price(): Optional<Price> = price.getOptional("price")

            /**
             * Tiered pricing configuration
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

            /**
             * Returns the raw JSON value of [billingPeriod].
             *
             * Unlike [billingPeriod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("billingPeriod")
            @ExcludeMissing
            fun _billingPeriod(): JsonField<BillingPeriod> = billingPeriod

            /**
             * Returns the raw JSON value of [billingCountryCode].
             *
             * Unlike [billingCountryCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billingCountryCode")
            @ExcludeMissing
            fun _billingCountryCode(): JsonField<String> = billingCountryCode

            /**
             * Returns the raw JSON value of [blockSize].
             *
             * Unlike [blockSize], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("blockSize")
            @ExcludeMissing
            fun _blockSize(): JsonField<Double> = blockSize

            /**
             * Returns the raw JSON value of [creditGrantCadence].
             *
             * Unlike [creditGrantCadence], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("creditGrantCadence")
            @ExcludeMissing
            fun _creditGrantCadence(): JsonField<CreditGrantCadence> = creditGrantCadence

            /**
             * Returns the raw JSON value of [creditRate].
             *
             * Unlike [creditRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("creditRate")
            @ExcludeMissing
            fun _creditRate(): JsonField<CreditRate> = creditRate

            /**
             * Returns the raw JSON value of [price].
             *
             * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

            /**
             * Returns the raw JSON value of [tiers].
             *
             * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

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
                 * Returns a mutable builder for constructing an instance of [PricePeriod].
                 *
                 * The following fields are required:
                 * ```java
                 * .billingPeriod()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PricePeriod]. */
            class Builder internal constructor() {

                private var billingPeriod: JsonField<BillingPeriod>? = null
                private var billingCountryCode: JsonField<String> = JsonMissing.of()
                private var blockSize: JsonField<Double> = JsonMissing.of()
                private var creditGrantCadence: JsonField<CreditGrantCadence> = JsonMissing.of()
                private var creditRate: JsonField<CreditRate> = JsonMissing.of()
                private var price: JsonField<Price> = JsonMissing.of()
                private var tiers: JsonField<MutableList<Tier>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pricePeriod: PricePeriod) = apply {
                    billingPeriod = pricePeriod.billingPeriod
                    billingCountryCode = pricePeriod.billingCountryCode
                    blockSize = pricePeriod.blockSize
                    creditGrantCadence = pricePeriod.creditGrantCadence
                    creditRate = pricePeriod.creditRate
                    price = pricePeriod.price
                    tiers = pricePeriod.tiers.map { it.toMutableList() }
                    additionalProperties = pricePeriod.additionalProperties.toMutableMap()
                }

                /** The billing period (MONTHLY or ANNUALLY) */
                fun billingPeriod(billingPeriod: BillingPeriod) =
                    billingPeriod(JsonField.of(billingPeriod))

                /**
                 * Sets [Builder.billingPeriod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingPeriod] with a well-typed [BillingPeriod]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billingPeriod(billingPeriod: JsonField<BillingPeriod>) = apply {
                    this.billingPeriod = billingPeriod
                }

                /** ISO country code for localized pricing */
                fun billingCountryCode(billingCountryCode: String) =
                    billingCountryCode(JsonField.of(billingCountryCode))

                /**
                 * Sets [Builder.billingCountryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingCountryCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billingCountryCode(billingCountryCode: JsonField<String>) = apply {
                    this.billingCountryCode = billingCountryCode
                }

                /** Block size for usage-based pricing */
                fun blockSize(blockSize: Double) = blockSize(JsonField.of(blockSize))

                /**
                 * Sets [Builder.blockSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blockSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blockSize(blockSize: JsonField<Double>) = apply { this.blockSize = blockSize }

                /** When credits are granted */
                fun creditGrantCadence(creditGrantCadence: CreditGrantCadence) =
                    creditGrantCadence(JsonField.of(creditGrantCadence))

                /**
                 * Sets [Builder.creditGrantCadence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditGrantCadence] with a well-typed
                 * [CreditGrantCadence] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun creditGrantCadence(creditGrantCadence: JsonField<CreditGrantCadence>) = apply {
                    this.creditGrantCadence = creditGrantCadence
                }

                /** Credit rate configuration for credit-based pricing */
                fun creditRate(creditRate: CreditRate) = creditRate(JsonField.of(creditRate))

                /**
                 * Sets [Builder.creditRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditRate] with a well-typed [CreditRate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditRate(creditRate: JsonField<CreditRate>) = apply {
                    this.creditRate = creditRate
                }

                /** The price amount and currency */
                fun price(price: Price) = price(JsonField.of(price))

                /**
                 * Sets [Builder.price] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.price] with a well-typed [Price] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun price(price: JsonField<Price>) = apply { this.price = price }

                /** Tiered pricing configuration */
                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                /**
                 * Sets [Builder.tiers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tiers(tiers: JsonField<List<Tier>>) = apply {
                    this.tiers = tiers.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Tier] to [tiers].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTier(tier: Tier) = apply {
                    tiers =
                        (tiers ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tiers", it).add(tier)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PricePeriod].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .billingPeriod()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PricePeriod =
                    PricePeriod(
                        checkRequired("billingPeriod", billingPeriod),
                        billingCountryCode,
                        blockSize,
                        creditGrantCadence,
                        creditRate,
                        price,
                        (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PricePeriod = apply {
                if (validated) {
                    return@apply
                }

                billingPeriod().validate()
                billingCountryCode()
                blockSize()
                creditGrantCadence().ifPresent { it.validate() }
                creditRate().ifPresent { it.validate() }
                price().ifPresent { it.validate() }
                tiers().ifPresent { it.forEach { it.validate() } }
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
                (billingPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (billingCountryCode.asKnown().isPresent) 1 else 0) +
                    (if (blockSize.asKnown().isPresent) 1 else 0) +
                    (creditGrantCadence.asKnown().getOrNull()?.validity() ?: 0) +
                    (creditRate.asKnown().getOrNull()?.validity() ?: 0) +
                    (price.asKnown().getOrNull()?.validity() ?: 0) +
                    (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** The billing period (MONTHLY or ANNUALLY) */
            class BillingPeriod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MONTHLY = of("MONTHLY")

                    @JvmField val ANNUALLY = of("ANNUALLY")

                    @JvmStatic fun of(value: String) = BillingPeriod(JsonField.of(value))
                }

                /** An enum containing [BillingPeriod]'s known values. */
                enum class Known {
                    MONTHLY,
                    ANNUALLY,
                }

                /**
                 * An enum containing [BillingPeriod]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [BillingPeriod] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONTHLY,
                    ANNUALLY,
                    /**
                     * An enum member indicating that [BillingPeriod] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MONTHLY -> Value.MONTHLY
                        ANNUALLY -> Value.ANNUALLY
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
                        MONTHLY -> Known.MONTHLY
                        ANNUALLY -> Known.ANNUALLY
                        else -> throw StiggInvalidDataException("Unknown BillingPeriod: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StiggInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): BillingPeriod = apply {
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

                    return other is BillingPeriod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** When credits are granted */
            class CreditGrantCadence
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BEGINNING_OF_BILLING_PERIOD = of("BEGINNING_OF_BILLING_PERIOD")

                    @JvmField val MONTHLY = of("MONTHLY")

                    @JvmStatic fun of(value: String) = CreditGrantCadence(JsonField.of(value))
                }

                /** An enum containing [CreditGrantCadence]'s known values. */
                enum class Known {
                    BEGINNING_OF_BILLING_PERIOD,
                    MONTHLY,
                }

                /**
                 * An enum containing [CreditGrantCadence]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [CreditGrantCadence] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BEGINNING_OF_BILLING_PERIOD,
                    MONTHLY,
                    /**
                     * An enum member indicating that [CreditGrantCadence] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BEGINNING_OF_BILLING_PERIOD -> Value.BEGINNING_OF_BILLING_PERIOD
                        MONTHLY -> Value.MONTHLY
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
                        BEGINNING_OF_BILLING_PERIOD -> Known.BEGINNING_OF_BILLING_PERIOD
                        MONTHLY -> Known.MONTHLY
                        else ->
                            throw StiggInvalidDataException("Unknown CreditGrantCadence: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StiggInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): CreditGrantCadence = apply {
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

                    return other is CreditGrantCadence && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Credit rate configuration for credit-based pricing */
            class CreditRate
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val currencyId: JsonField<String>,
                private val costFormula: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("currencyId")
                    @ExcludeMissing
                    currencyId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("costFormula")
                    @ExcludeMissing
                    costFormula: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currencyId, costFormula, mutableMapOf())

                /**
                 * The credit rate amount
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * The custom currency ID
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currencyId(): String = currencyId.getRequired("currencyId")

                /**
                 * Optional cost formula expression
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun costFormula(): Optional<String> = costFormula.getOptional("costFormula")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [currencyId].
                 *
                 * Unlike [currencyId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("currencyId")
                @ExcludeMissing
                fun _currencyId(): JsonField<String> = currencyId

                /**
                 * Returns the raw JSON value of [costFormula].
                 *
                 * Unlike [costFormula], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("costFormula")
                @ExcludeMissing
                fun _costFormula(): JsonField<String> = costFormula

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
                     * Returns a mutable builder for constructing an instance of [CreditRate].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currencyId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CreditRate]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var currencyId: JsonField<String>? = null
                    private var costFormula: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditRate: CreditRate) = apply {
                        amount = creditRate.amount
                        currencyId = creditRate.currencyId
                        costFormula = creditRate.costFormula
                        additionalProperties = creditRate.additionalProperties.toMutableMap()
                    }

                    /** The credit rate amount */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The custom currency ID */
                    fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

                    /**
                     * Sets [Builder.currencyId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currencyId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currencyId(currencyId: JsonField<String>) = apply {
                        this.currencyId = currencyId
                    }

                    /** Optional cost formula expression */
                    fun costFormula(costFormula: String) = costFormula(JsonField.of(costFormula))

                    /**
                     * Sets [Builder.costFormula] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.costFormula] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun costFormula(costFormula: JsonField<String>) = apply {
                        this.costFormula = costFormula
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [CreditRate].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currencyId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CreditRate =
                        CreditRate(
                            checkRequired("amount", amount),
                            checkRequired("currencyId", currencyId),
                            costFormula,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CreditRate = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currencyId()
                    costFormula()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currencyId.asKnown().isPresent) 1 else 0) +
                        (if (costFormula.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditRate &&
                        amount == other.amount &&
                        currencyId == other.currencyId &&
                        costFormula == other.costFormula &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currencyId, costFormula, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CreditRate{amount=$amount, currencyId=$currencyId, costFormula=$costFormula, additionalProperties=$additionalProperties}"
            }

            /** The price amount and currency */
            class Price
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val currency: JsonField<Currency>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<Currency> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * The price amount
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * The price currency
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun currency(): Optional<Currency> = currency.getOptional("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<Currency> = currency

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
                     * Returns a mutable builder for constructing an instance of [Price].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Price]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(price: Price) = apply {
                        amount = price.amount
                        currency = price.currency
                        additionalProperties = price.additionalProperties.toMutableMap()
                    }

                    /** The price amount */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The price currency */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [Currency] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Price].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Price =
                        Price(
                            checkRequired("amount", amount),
                            currency,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Price = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency().ifPresent { it.validate() }
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (currency.asKnown().getOrNull()?.validity() ?: 0)

                /** The price currency */
                class Currency
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val USD = of("usd")

                        @JvmField val AED = of("aed")

                        @JvmField val ALL = of("all")

                        @JvmField val AMD = of("amd")

                        @JvmField val ANG = of("ang")

                        @JvmField val AUD = of("aud")

                        @JvmField val AWG = of("awg")

                        @JvmField val AZN = of("azn")

                        @JvmField val BAM = of("bam")

                        @JvmField val BBD = of("bbd")

                        @JvmField val BDT = of("bdt")

                        @JvmField val BGN = of("bgn")

                        @JvmField val BIF = of("bif")

                        @JvmField val BMD = of("bmd")

                        @JvmField val BND = of("bnd")

                        @JvmField val BSD = of("bsd")

                        @JvmField val BWP = of("bwp")

                        @JvmField val BYN = of("byn")

                        @JvmField val BZD = of("bzd")

                        @JvmField val BRL = of("brl")

                        @JvmField val CAD = of("cad")

                        @JvmField val CDF = of("cdf")

                        @JvmField val CHF = of("chf")

                        @JvmField val CNY = of("cny")

                        @JvmField val CZK = of("czk")

                        @JvmField val DKK = of("dkk")

                        @JvmField val DOP = of("dop")

                        @JvmField val DZD = of("dzd")

                        @JvmField val EGP = of("egp")

                        @JvmField val ETB = of("etb")

                        @JvmField val EUR = of("eur")

                        @JvmField val FJD = of("fjd")

                        @JvmField val GBP = of("gbp")

                        @JvmField val GEL = of("gel")

                        @JvmField val GIP = of("gip")

                        @JvmField val GMD = of("gmd")

                        @JvmField val GYD = of("gyd")

                        @JvmField val HKD = of("hkd")

                        @JvmField val HRK = of("hrk")

                        @JvmField val HTG = of("htg")

                        @JvmField val IDR = of("idr")

                        @JvmField val ILS = of("ils")

                        @JvmField val INR = of("inr")

                        @JvmField val ISK = of("isk")

                        @JvmField val JMD = of("jmd")

                        @JvmField val JPY = of("jpy")

                        @JvmField val KES = of("kes")

                        @JvmField val KGS = of("kgs")

                        @JvmField val KHR = of("khr")

                        @JvmField val KMF = of("kmf")

                        @JvmField val KRW = of("krw")

                        @JvmField val KYD = of("kyd")

                        @JvmField val KZT = of("kzt")

                        @JvmField val LBP = of("lbp")

                        @JvmField val LKR = of("lkr")

                        @JvmField val LRD = of("lrd")

                        @JvmField val LSL = of("lsl")

                        @JvmField val MAD = of("mad")

                        @JvmField val MDL = of("mdl")

                        @JvmField val MGA = of("mga")

                        @JvmField val MKD = of("mkd")

                        @JvmField val MMK = of("mmk")

                        @JvmField val MNT = of("mnt")

                        @JvmField val MOP = of("mop")

                        @JvmField val MRO = of("mro")

                        @JvmField val MVR = of("mvr")

                        @JvmField val MWK = of("mwk")

                        @JvmField val MXN = of("mxn")

                        @JvmField val MYR = of("myr")

                        @JvmField val MZN = of("mzn")

                        @JvmField val NAD = of("nad")

                        @JvmField val NGN = of("ngn")

                        @JvmField val NOK = of("nok")

                        @JvmField val NPR = of("npr")

                        @JvmField val NZD = of("nzd")

                        @JvmField val PGK = of("pgk")

                        @JvmField val PHP = of("php")

                        @JvmField val PKR = of("pkr")

                        @JvmField val PLN = of("pln")

                        @JvmField val QAR = of("qar")

                        @JvmField val RON = of("ron")

                        @JvmField val RSD = of("rsd")

                        @JvmField val RUB = of("rub")

                        @JvmField val RWF = of("rwf")

                        @JvmField val SAR = of("sar")

                        @JvmField val SBD = of("sbd")

                        @JvmField val SCR = of("scr")

                        @JvmField val SEK = of("sek")

                        @JvmField val SGD = of("sgd")

                        @JvmField val SLE = of("sle")

                        @JvmField val SLL = of("sll")

                        @JvmField val SOS = of("sos")

                        @JvmField val SZL = of("szl")

                        @JvmField val THB = of("thb")

                        @JvmField val TJS = of("tjs")

                        @JvmField val TOP = of("top")

                        @JvmField val TRY = of("try")

                        @JvmField val TTD = of("ttd")

                        @JvmField val TZS = of("tzs")

                        @JvmField val UAH = of("uah")

                        @JvmField val UZS = of("uzs")

                        @JvmField val VND = of("vnd")

                        @JvmField val VUV = of("vuv")

                        @JvmField val WST = of("wst")

                        @JvmField val XAF = of("xaf")

                        @JvmField val XCD = of("xcd")

                        @JvmField val YER = of("yer")

                        @JvmField val ZAR = of("zar")

                        @JvmField val ZMW = of("zmw")

                        @JvmField val CLP = of("clp")

                        @JvmField val DJF = of("djf")

                        @JvmField val GNF = of("gnf")

                        @JvmField val UGX = of("ugx")

                        @JvmField val PYG = of("pyg")

                        @JvmField val XOF = of("xof")

                        @JvmField val XPF = of("xpf")

                        @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                    }

                    /** An enum containing [Currency]'s known values. */
                    enum class Known {
                        USD,
                        AED,
                        ALL,
                        AMD,
                        ANG,
                        AUD,
                        AWG,
                        AZN,
                        BAM,
                        BBD,
                        BDT,
                        BGN,
                        BIF,
                        BMD,
                        BND,
                        BSD,
                        BWP,
                        BYN,
                        BZD,
                        BRL,
                        CAD,
                        CDF,
                        CHF,
                        CNY,
                        CZK,
                        DKK,
                        DOP,
                        DZD,
                        EGP,
                        ETB,
                        EUR,
                        FJD,
                        GBP,
                        GEL,
                        GIP,
                        GMD,
                        GYD,
                        HKD,
                        HRK,
                        HTG,
                        IDR,
                        ILS,
                        INR,
                        ISK,
                        JMD,
                        JPY,
                        KES,
                        KGS,
                        KHR,
                        KMF,
                        KRW,
                        KYD,
                        KZT,
                        LBP,
                        LKR,
                        LRD,
                        LSL,
                        MAD,
                        MDL,
                        MGA,
                        MKD,
                        MMK,
                        MNT,
                        MOP,
                        MRO,
                        MVR,
                        MWK,
                        MXN,
                        MYR,
                        MZN,
                        NAD,
                        NGN,
                        NOK,
                        NPR,
                        NZD,
                        PGK,
                        PHP,
                        PKR,
                        PLN,
                        QAR,
                        RON,
                        RSD,
                        RUB,
                        RWF,
                        SAR,
                        SBD,
                        SCR,
                        SEK,
                        SGD,
                        SLE,
                        SLL,
                        SOS,
                        SZL,
                        THB,
                        TJS,
                        TOP,
                        TRY,
                        TTD,
                        TZS,
                        UAH,
                        UZS,
                        VND,
                        VUV,
                        WST,
                        XAF,
                        XCD,
                        YER,
                        ZAR,
                        ZMW,
                        CLP,
                        DJF,
                        GNF,
                        UGX,
                        PYG,
                        XOF,
                        XPF,
                    }

                    /**
                     * An enum containing [Currency]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Currency] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        USD,
                        AED,
                        ALL,
                        AMD,
                        ANG,
                        AUD,
                        AWG,
                        AZN,
                        BAM,
                        BBD,
                        BDT,
                        BGN,
                        BIF,
                        BMD,
                        BND,
                        BSD,
                        BWP,
                        BYN,
                        BZD,
                        BRL,
                        CAD,
                        CDF,
                        CHF,
                        CNY,
                        CZK,
                        DKK,
                        DOP,
                        DZD,
                        EGP,
                        ETB,
                        EUR,
                        FJD,
                        GBP,
                        GEL,
                        GIP,
                        GMD,
                        GYD,
                        HKD,
                        HRK,
                        HTG,
                        IDR,
                        ILS,
                        INR,
                        ISK,
                        JMD,
                        JPY,
                        KES,
                        KGS,
                        KHR,
                        KMF,
                        KRW,
                        KYD,
                        KZT,
                        LBP,
                        LKR,
                        LRD,
                        LSL,
                        MAD,
                        MDL,
                        MGA,
                        MKD,
                        MMK,
                        MNT,
                        MOP,
                        MRO,
                        MVR,
                        MWK,
                        MXN,
                        MYR,
                        MZN,
                        NAD,
                        NGN,
                        NOK,
                        NPR,
                        NZD,
                        PGK,
                        PHP,
                        PKR,
                        PLN,
                        QAR,
                        RON,
                        RSD,
                        RUB,
                        RWF,
                        SAR,
                        SBD,
                        SCR,
                        SEK,
                        SGD,
                        SLE,
                        SLL,
                        SOS,
                        SZL,
                        THB,
                        TJS,
                        TOP,
                        TRY,
                        TTD,
                        TZS,
                        UAH,
                        UZS,
                        VND,
                        VUV,
                        WST,
                        XAF,
                        XCD,
                        YER,
                        ZAR,
                        ZMW,
                        CLP,
                        DJF,
                        GNF,
                        UGX,
                        PYG,
                        XOF,
                        XPF,
                        /**
                         * An enum member indicating that [Currency] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            USD -> Value.USD
                            AED -> Value.AED
                            ALL -> Value.ALL
                            AMD -> Value.AMD
                            ANG -> Value.ANG
                            AUD -> Value.AUD
                            AWG -> Value.AWG
                            AZN -> Value.AZN
                            BAM -> Value.BAM
                            BBD -> Value.BBD
                            BDT -> Value.BDT
                            BGN -> Value.BGN
                            BIF -> Value.BIF
                            BMD -> Value.BMD
                            BND -> Value.BND
                            BSD -> Value.BSD
                            BWP -> Value.BWP
                            BYN -> Value.BYN
                            BZD -> Value.BZD
                            BRL -> Value.BRL
                            CAD -> Value.CAD
                            CDF -> Value.CDF
                            CHF -> Value.CHF
                            CNY -> Value.CNY
                            CZK -> Value.CZK
                            DKK -> Value.DKK
                            DOP -> Value.DOP
                            DZD -> Value.DZD
                            EGP -> Value.EGP
                            ETB -> Value.ETB
                            EUR -> Value.EUR
                            FJD -> Value.FJD
                            GBP -> Value.GBP
                            GEL -> Value.GEL
                            GIP -> Value.GIP
                            GMD -> Value.GMD
                            GYD -> Value.GYD
                            HKD -> Value.HKD
                            HRK -> Value.HRK
                            HTG -> Value.HTG
                            IDR -> Value.IDR
                            ILS -> Value.ILS
                            INR -> Value.INR
                            ISK -> Value.ISK
                            JMD -> Value.JMD
                            JPY -> Value.JPY
                            KES -> Value.KES
                            KGS -> Value.KGS
                            KHR -> Value.KHR
                            KMF -> Value.KMF
                            KRW -> Value.KRW
                            KYD -> Value.KYD
                            KZT -> Value.KZT
                            LBP -> Value.LBP
                            LKR -> Value.LKR
                            LRD -> Value.LRD
                            LSL -> Value.LSL
                            MAD -> Value.MAD
                            MDL -> Value.MDL
                            MGA -> Value.MGA
                            MKD -> Value.MKD
                            MMK -> Value.MMK
                            MNT -> Value.MNT
                            MOP -> Value.MOP
                            MRO -> Value.MRO
                            MVR -> Value.MVR
                            MWK -> Value.MWK
                            MXN -> Value.MXN
                            MYR -> Value.MYR
                            MZN -> Value.MZN
                            NAD -> Value.NAD
                            NGN -> Value.NGN
                            NOK -> Value.NOK
                            NPR -> Value.NPR
                            NZD -> Value.NZD
                            PGK -> Value.PGK
                            PHP -> Value.PHP
                            PKR -> Value.PKR
                            PLN -> Value.PLN
                            QAR -> Value.QAR
                            RON -> Value.RON
                            RSD -> Value.RSD
                            RUB -> Value.RUB
                            RWF -> Value.RWF
                            SAR -> Value.SAR
                            SBD -> Value.SBD
                            SCR -> Value.SCR
                            SEK -> Value.SEK
                            SGD -> Value.SGD
                            SLE -> Value.SLE
                            SLL -> Value.SLL
                            SOS -> Value.SOS
                            SZL -> Value.SZL
                            THB -> Value.THB
                            TJS -> Value.TJS
                            TOP -> Value.TOP
                            TRY -> Value.TRY
                            TTD -> Value.TTD
                            TZS -> Value.TZS
                            UAH -> Value.UAH
                            UZS -> Value.UZS
                            VND -> Value.VND
                            VUV -> Value.VUV
                            WST -> Value.WST
                            XAF -> Value.XAF
                            XCD -> Value.XCD
                            YER -> Value.YER
                            ZAR -> Value.ZAR
                            ZMW -> Value.ZMW
                            CLP -> Value.CLP
                            DJF -> Value.DJF
                            GNF -> Value.GNF
                            UGX -> Value.UGX
                            PYG -> Value.PYG
                            XOF -> Value.XOF
                            XPF -> Value.XPF
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws StiggInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            USD -> Known.USD
                            AED -> Known.AED
                            ALL -> Known.ALL
                            AMD -> Known.AMD
                            ANG -> Known.ANG
                            AUD -> Known.AUD
                            AWG -> Known.AWG
                            AZN -> Known.AZN
                            BAM -> Known.BAM
                            BBD -> Known.BBD
                            BDT -> Known.BDT
                            BGN -> Known.BGN
                            BIF -> Known.BIF
                            BMD -> Known.BMD
                            BND -> Known.BND
                            BSD -> Known.BSD
                            BWP -> Known.BWP
                            BYN -> Known.BYN
                            BZD -> Known.BZD
                            BRL -> Known.BRL
                            CAD -> Known.CAD
                            CDF -> Known.CDF
                            CHF -> Known.CHF
                            CNY -> Known.CNY
                            CZK -> Known.CZK
                            DKK -> Known.DKK
                            DOP -> Known.DOP
                            DZD -> Known.DZD
                            EGP -> Known.EGP
                            ETB -> Known.ETB
                            EUR -> Known.EUR
                            FJD -> Known.FJD
                            GBP -> Known.GBP
                            GEL -> Known.GEL
                            GIP -> Known.GIP
                            GMD -> Known.GMD
                            GYD -> Known.GYD
                            HKD -> Known.HKD
                            HRK -> Known.HRK
                            HTG -> Known.HTG
                            IDR -> Known.IDR
                            ILS -> Known.ILS
                            INR -> Known.INR
                            ISK -> Known.ISK
                            JMD -> Known.JMD
                            JPY -> Known.JPY
                            KES -> Known.KES
                            KGS -> Known.KGS
                            KHR -> Known.KHR
                            KMF -> Known.KMF
                            KRW -> Known.KRW
                            KYD -> Known.KYD
                            KZT -> Known.KZT
                            LBP -> Known.LBP
                            LKR -> Known.LKR
                            LRD -> Known.LRD
                            LSL -> Known.LSL
                            MAD -> Known.MAD
                            MDL -> Known.MDL
                            MGA -> Known.MGA
                            MKD -> Known.MKD
                            MMK -> Known.MMK
                            MNT -> Known.MNT
                            MOP -> Known.MOP
                            MRO -> Known.MRO
                            MVR -> Known.MVR
                            MWK -> Known.MWK
                            MXN -> Known.MXN
                            MYR -> Known.MYR
                            MZN -> Known.MZN
                            NAD -> Known.NAD
                            NGN -> Known.NGN
                            NOK -> Known.NOK
                            NPR -> Known.NPR
                            NZD -> Known.NZD
                            PGK -> Known.PGK
                            PHP -> Known.PHP
                            PKR -> Known.PKR
                            PLN -> Known.PLN
                            QAR -> Known.QAR
                            RON -> Known.RON
                            RSD -> Known.RSD
                            RUB -> Known.RUB
                            RWF -> Known.RWF
                            SAR -> Known.SAR
                            SBD -> Known.SBD
                            SCR -> Known.SCR
                            SEK -> Known.SEK
                            SGD -> Known.SGD
                            SLE -> Known.SLE
                            SLL -> Known.SLL
                            SOS -> Known.SOS
                            SZL -> Known.SZL
                            THB -> Known.THB
                            TJS -> Known.TJS
                            TOP -> Known.TOP
                            TRY -> Known.TRY
                            TTD -> Known.TTD
                            TZS -> Known.TZS
                            UAH -> Known.UAH
                            UZS -> Known.UZS
                            VND -> Known.VND
                            VUV -> Known.VUV
                            WST -> Known.WST
                            XAF -> Known.XAF
                            XCD -> Known.XCD
                            YER -> Known.YER
                            ZAR -> Known.ZAR
                            ZMW -> Known.ZMW
                            CLP -> Known.CLP
                            DJF -> Known.DJF
                            GNF -> Known.GNF
                            UGX -> Known.UGX
                            PYG -> Known.PYG
                            XOF -> Known.XOF
                            XPF -> Known.XPF
                            else -> throw StiggInvalidDataException("Unknown Currency: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws StiggInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            StiggInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Currency = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Currency && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Price &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Price{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /** A tier in tiered pricing. */
            class Tier
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val flatPrice: JsonField<FlatPrice>,
                private val unitPrice: JsonField<UnitPrice>,
                private val upTo: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("flatPrice")
                    @ExcludeMissing
                    flatPrice: JsonField<FlatPrice> = JsonMissing.of(),
                    @JsonProperty("unitPrice")
                    @ExcludeMissing
                    unitPrice: JsonField<UnitPrice> = JsonMissing.of(),
                    @JsonProperty("upTo") @ExcludeMissing upTo: JsonField<Double> = JsonMissing.of(),
                ) : this(flatPrice, unitPrice, upTo, mutableMapOf())

                /**
                 * Flat price for this tier
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun flatPrice(): Optional<FlatPrice> = flatPrice.getOptional("flatPrice")

                /**
                 * Per-unit price in this tier
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun unitPrice(): Optional<UnitPrice> = unitPrice.getOptional("unitPrice")

                /**
                 * Upper bound of this tier (null for unlimited)
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun upTo(): Optional<Double> = upTo.getOptional("upTo")

                /**
                 * Returns the raw JSON value of [flatPrice].
                 *
                 * Unlike [flatPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("flatPrice")
                @ExcludeMissing
                fun _flatPrice(): JsonField<FlatPrice> = flatPrice

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unitPrice")
                @ExcludeMissing
                fun _unitPrice(): JsonField<UnitPrice> = unitPrice

                /**
                 * Returns the raw JSON value of [upTo].
                 *
                 * Unlike [upTo], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("upTo") @ExcludeMissing fun _upTo(): JsonField<Double> = upTo

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

                    /** Returns a mutable builder for constructing an instance of [Tier]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tier]. */
                class Builder internal constructor() {

                    private var flatPrice: JsonField<FlatPrice> = JsonMissing.of()
                    private var unitPrice: JsonField<UnitPrice> = JsonMissing.of()
                    private var upTo: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tier: Tier) = apply {
                        flatPrice = tier.flatPrice
                        unitPrice = tier.unitPrice
                        upTo = tier.upTo
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    /** Flat price for this tier */
                    fun flatPrice(flatPrice: FlatPrice) = flatPrice(JsonField.of(flatPrice))

                    /**
                     * Sets [Builder.flatPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.flatPrice] with a well-typed [FlatPrice]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun flatPrice(flatPrice: JsonField<FlatPrice>) = apply {
                        this.flatPrice = flatPrice
                    }

                    /** Per-unit price in this tier */
                    fun unitPrice(unitPrice: UnitPrice) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [UnitPrice]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun unitPrice(unitPrice: JsonField<UnitPrice>) = apply {
                        this.unitPrice = unitPrice
                    }

                    /** Upper bound of this tier (null for unlimited) */
                    fun upTo(upTo: Double) = upTo(JsonField.of(upTo))

                    /**
                     * Sets [Builder.upTo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.upTo] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun upTo(upTo: JsonField<Double>) = apply { this.upTo = upTo }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Tier].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Tier =
                        Tier(flatPrice, unitPrice, upTo, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Tier = apply {
                    if (validated) {
                        return@apply
                    }

                    flatPrice().ifPresent { it.validate() }
                    unitPrice().ifPresent { it.validate() }
                    upTo()
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
                    (flatPrice.asKnown().getOrNull()?.validity() ?: 0) +
                        (unitPrice.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (upTo.asKnown().isPresent) 1 else 0)

                /** Flat price for this tier */
                class FlatPrice
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Double>,
                    private val currency: JsonField<Currency>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<Currency> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The price amount
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Double = amount.getRequired("amount")

                    /**
                     * The price currency
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun currency(): Optional<Currency> = currency.getOptional("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<Currency> = currency

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
                         * Returns a mutable builder for constructing an instance of [FlatPrice].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [FlatPrice]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Double>? = null
                        private var currency: JsonField<Currency> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(flatPrice: FlatPrice) = apply {
                            amount = flatPrice.amount
                            currency = flatPrice.currency
                            additionalProperties = flatPrice.additionalProperties.toMutableMap()
                        }

                        /** The price amount */
                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        /** The price currency */
                        fun currency(currency: Currency) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [Currency]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<Currency>) = apply {
                            this.currency = currency
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [FlatPrice].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): FlatPrice =
                            FlatPrice(
                                checkRequired("amount", amount),
                                currency,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): FlatPrice = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency().ifPresent { it.validate() }
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
                        (if (amount.asKnown().isPresent) 1 else 0) +
                            (currency.asKnown().getOrNull()?.validity() ?: 0)

                    /** The price currency */
                    class Currency
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val USD = of("usd")

                            @JvmField val AED = of("aed")

                            @JvmField val ALL = of("all")

                            @JvmField val AMD = of("amd")

                            @JvmField val ANG = of("ang")

                            @JvmField val AUD = of("aud")

                            @JvmField val AWG = of("awg")

                            @JvmField val AZN = of("azn")

                            @JvmField val BAM = of("bam")

                            @JvmField val BBD = of("bbd")

                            @JvmField val BDT = of("bdt")

                            @JvmField val BGN = of("bgn")

                            @JvmField val BIF = of("bif")

                            @JvmField val BMD = of("bmd")

                            @JvmField val BND = of("bnd")

                            @JvmField val BSD = of("bsd")

                            @JvmField val BWP = of("bwp")

                            @JvmField val BYN = of("byn")

                            @JvmField val BZD = of("bzd")

                            @JvmField val BRL = of("brl")

                            @JvmField val CAD = of("cad")

                            @JvmField val CDF = of("cdf")

                            @JvmField val CHF = of("chf")

                            @JvmField val CNY = of("cny")

                            @JvmField val CZK = of("czk")

                            @JvmField val DKK = of("dkk")

                            @JvmField val DOP = of("dop")

                            @JvmField val DZD = of("dzd")

                            @JvmField val EGP = of("egp")

                            @JvmField val ETB = of("etb")

                            @JvmField val EUR = of("eur")

                            @JvmField val FJD = of("fjd")

                            @JvmField val GBP = of("gbp")

                            @JvmField val GEL = of("gel")

                            @JvmField val GIP = of("gip")

                            @JvmField val GMD = of("gmd")

                            @JvmField val GYD = of("gyd")

                            @JvmField val HKD = of("hkd")

                            @JvmField val HRK = of("hrk")

                            @JvmField val HTG = of("htg")

                            @JvmField val IDR = of("idr")

                            @JvmField val ILS = of("ils")

                            @JvmField val INR = of("inr")

                            @JvmField val ISK = of("isk")

                            @JvmField val JMD = of("jmd")

                            @JvmField val JPY = of("jpy")

                            @JvmField val KES = of("kes")

                            @JvmField val KGS = of("kgs")

                            @JvmField val KHR = of("khr")

                            @JvmField val KMF = of("kmf")

                            @JvmField val KRW = of("krw")

                            @JvmField val KYD = of("kyd")

                            @JvmField val KZT = of("kzt")

                            @JvmField val LBP = of("lbp")

                            @JvmField val LKR = of("lkr")

                            @JvmField val LRD = of("lrd")

                            @JvmField val LSL = of("lsl")

                            @JvmField val MAD = of("mad")

                            @JvmField val MDL = of("mdl")

                            @JvmField val MGA = of("mga")

                            @JvmField val MKD = of("mkd")

                            @JvmField val MMK = of("mmk")

                            @JvmField val MNT = of("mnt")

                            @JvmField val MOP = of("mop")

                            @JvmField val MRO = of("mro")

                            @JvmField val MVR = of("mvr")

                            @JvmField val MWK = of("mwk")

                            @JvmField val MXN = of("mxn")

                            @JvmField val MYR = of("myr")

                            @JvmField val MZN = of("mzn")

                            @JvmField val NAD = of("nad")

                            @JvmField val NGN = of("ngn")

                            @JvmField val NOK = of("nok")

                            @JvmField val NPR = of("npr")

                            @JvmField val NZD = of("nzd")

                            @JvmField val PGK = of("pgk")

                            @JvmField val PHP = of("php")

                            @JvmField val PKR = of("pkr")

                            @JvmField val PLN = of("pln")

                            @JvmField val QAR = of("qar")

                            @JvmField val RON = of("ron")

                            @JvmField val RSD = of("rsd")

                            @JvmField val RUB = of("rub")

                            @JvmField val RWF = of("rwf")

                            @JvmField val SAR = of("sar")

                            @JvmField val SBD = of("sbd")

                            @JvmField val SCR = of("scr")

                            @JvmField val SEK = of("sek")

                            @JvmField val SGD = of("sgd")

                            @JvmField val SLE = of("sle")

                            @JvmField val SLL = of("sll")

                            @JvmField val SOS = of("sos")

                            @JvmField val SZL = of("szl")

                            @JvmField val THB = of("thb")

                            @JvmField val TJS = of("tjs")

                            @JvmField val TOP = of("top")

                            @JvmField val TRY = of("try")

                            @JvmField val TTD = of("ttd")

                            @JvmField val TZS = of("tzs")

                            @JvmField val UAH = of("uah")

                            @JvmField val UZS = of("uzs")

                            @JvmField val VND = of("vnd")

                            @JvmField val VUV = of("vuv")

                            @JvmField val WST = of("wst")

                            @JvmField val XAF = of("xaf")

                            @JvmField val XCD = of("xcd")

                            @JvmField val YER = of("yer")

                            @JvmField val ZAR = of("zar")

                            @JvmField val ZMW = of("zmw")

                            @JvmField val CLP = of("clp")

                            @JvmField val DJF = of("djf")

                            @JvmField val GNF = of("gnf")

                            @JvmField val UGX = of("ugx")

                            @JvmField val PYG = of("pyg")

                            @JvmField val XOF = of("xof")

                            @JvmField val XPF = of("xpf")

                            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                        }

                        /** An enum containing [Currency]'s known values. */
                        enum class Known {
                            USD,
                            AED,
                            ALL,
                            AMD,
                            ANG,
                            AUD,
                            AWG,
                            AZN,
                            BAM,
                            BBD,
                            BDT,
                            BGN,
                            BIF,
                            BMD,
                            BND,
                            BSD,
                            BWP,
                            BYN,
                            BZD,
                            BRL,
                            CAD,
                            CDF,
                            CHF,
                            CNY,
                            CZK,
                            DKK,
                            DOP,
                            DZD,
                            EGP,
                            ETB,
                            EUR,
                            FJD,
                            GBP,
                            GEL,
                            GIP,
                            GMD,
                            GYD,
                            HKD,
                            HRK,
                            HTG,
                            IDR,
                            ILS,
                            INR,
                            ISK,
                            JMD,
                            JPY,
                            KES,
                            KGS,
                            KHR,
                            KMF,
                            KRW,
                            KYD,
                            KZT,
                            LBP,
                            LKR,
                            LRD,
                            LSL,
                            MAD,
                            MDL,
                            MGA,
                            MKD,
                            MMK,
                            MNT,
                            MOP,
                            MRO,
                            MVR,
                            MWK,
                            MXN,
                            MYR,
                            MZN,
                            NAD,
                            NGN,
                            NOK,
                            NPR,
                            NZD,
                            PGK,
                            PHP,
                            PKR,
                            PLN,
                            QAR,
                            RON,
                            RSD,
                            RUB,
                            RWF,
                            SAR,
                            SBD,
                            SCR,
                            SEK,
                            SGD,
                            SLE,
                            SLL,
                            SOS,
                            SZL,
                            THB,
                            TJS,
                            TOP,
                            TRY,
                            TTD,
                            TZS,
                            UAH,
                            UZS,
                            VND,
                            VUV,
                            WST,
                            XAF,
                            XCD,
                            YER,
                            ZAR,
                            ZMW,
                            CLP,
                            DJF,
                            GNF,
                            UGX,
                            PYG,
                            XOF,
                            XPF,
                        }

                        /**
                         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Currency] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            USD,
                            AED,
                            ALL,
                            AMD,
                            ANG,
                            AUD,
                            AWG,
                            AZN,
                            BAM,
                            BBD,
                            BDT,
                            BGN,
                            BIF,
                            BMD,
                            BND,
                            BSD,
                            BWP,
                            BYN,
                            BZD,
                            BRL,
                            CAD,
                            CDF,
                            CHF,
                            CNY,
                            CZK,
                            DKK,
                            DOP,
                            DZD,
                            EGP,
                            ETB,
                            EUR,
                            FJD,
                            GBP,
                            GEL,
                            GIP,
                            GMD,
                            GYD,
                            HKD,
                            HRK,
                            HTG,
                            IDR,
                            ILS,
                            INR,
                            ISK,
                            JMD,
                            JPY,
                            KES,
                            KGS,
                            KHR,
                            KMF,
                            KRW,
                            KYD,
                            KZT,
                            LBP,
                            LKR,
                            LRD,
                            LSL,
                            MAD,
                            MDL,
                            MGA,
                            MKD,
                            MMK,
                            MNT,
                            MOP,
                            MRO,
                            MVR,
                            MWK,
                            MXN,
                            MYR,
                            MZN,
                            NAD,
                            NGN,
                            NOK,
                            NPR,
                            NZD,
                            PGK,
                            PHP,
                            PKR,
                            PLN,
                            QAR,
                            RON,
                            RSD,
                            RUB,
                            RWF,
                            SAR,
                            SBD,
                            SCR,
                            SEK,
                            SGD,
                            SLE,
                            SLL,
                            SOS,
                            SZL,
                            THB,
                            TJS,
                            TOP,
                            TRY,
                            TTD,
                            TZS,
                            UAH,
                            UZS,
                            VND,
                            VUV,
                            WST,
                            XAF,
                            XCD,
                            YER,
                            ZAR,
                            ZMW,
                            CLP,
                            DJF,
                            GNF,
                            UGX,
                            PYG,
                            XOF,
                            XPF,
                            /**
                             * An enum member indicating that [Currency] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                USD -> Value.USD
                                AED -> Value.AED
                                ALL -> Value.ALL
                                AMD -> Value.AMD
                                ANG -> Value.ANG
                                AUD -> Value.AUD
                                AWG -> Value.AWG
                                AZN -> Value.AZN
                                BAM -> Value.BAM
                                BBD -> Value.BBD
                                BDT -> Value.BDT
                                BGN -> Value.BGN
                                BIF -> Value.BIF
                                BMD -> Value.BMD
                                BND -> Value.BND
                                BSD -> Value.BSD
                                BWP -> Value.BWP
                                BYN -> Value.BYN
                                BZD -> Value.BZD
                                BRL -> Value.BRL
                                CAD -> Value.CAD
                                CDF -> Value.CDF
                                CHF -> Value.CHF
                                CNY -> Value.CNY
                                CZK -> Value.CZK
                                DKK -> Value.DKK
                                DOP -> Value.DOP
                                DZD -> Value.DZD
                                EGP -> Value.EGP
                                ETB -> Value.ETB
                                EUR -> Value.EUR
                                FJD -> Value.FJD
                                GBP -> Value.GBP
                                GEL -> Value.GEL
                                GIP -> Value.GIP
                                GMD -> Value.GMD
                                GYD -> Value.GYD
                                HKD -> Value.HKD
                                HRK -> Value.HRK
                                HTG -> Value.HTG
                                IDR -> Value.IDR
                                ILS -> Value.ILS
                                INR -> Value.INR
                                ISK -> Value.ISK
                                JMD -> Value.JMD
                                JPY -> Value.JPY
                                KES -> Value.KES
                                KGS -> Value.KGS
                                KHR -> Value.KHR
                                KMF -> Value.KMF
                                KRW -> Value.KRW
                                KYD -> Value.KYD
                                KZT -> Value.KZT
                                LBP -> Value.LBP
                                LKR -> Value.LKR
                                LRD -> Value.LRD
                                LSL -> Value.LSL
                                MAD -> Value.MAD
                                MDL -> Value.MDL
                                MGA -> Value.MGA
                                MKD -> Value.MKD
                                MMK -> Value.MMK
                                MNT -> Value.MNT
                                MOP -> Value.MOP
                                MRO -> Value.MRO
                                MVR -> Value.MVR
                                MWK -> Value.MWK
                                MXN -> Value.MXN
                                MYR -> Value.MYR
                                MZN -> Value.MZN
                                NAD -> Value.NAD
                                NGN -> Value.NGN
                                NOK -> Value.NOK
                                NPR -> Value.NPR
                                NZD -> Value.NZD
                                PGK -> Value.PGK
                                PHP -> Value.PHP
                                PKR -> Value.PKR
                                PLN -> Value.PLN
                                QAR -> Value.QAR
                                RON -> Value.RON
                                RSD -> Value.RSD
                                RUB -> Value.RUB
                                RWF -> Value.RWF
                                SAR -> Value.SAR
                                SBD -> Value.SBD
                                SCR -> Value.SCR
                                SEK -> Value.SEK
                                SGD -> Value.SGD
                                SLE -> Value.SLE
                                SLL -> Value.SLL
                                SOS -> Value.SOS
                                SZL -> Value.SZL
                                THB -> Value.THB
                                TJS -> Value.TJS
                                TOP -> Value.TOP
                                TRY -> Value.TRY
                                TTD -> Value.TTD
                                TZS -> Value.TZS
                                UAH -> Value.UAH
                                UZS -> Value.UZS
                                VND -> Value.VND
                                VUV -> Value.VUV
                                WST -> Value.WST
                                XAF -> Value.XAF
                                XCD -> Value.XCD
                                YER -> Value.YER
                                ZAR -> Value.ZAR
                                ZMW -> Value.ZMW
                                CLP -> Value.CLP
                                DJF -> Value.DJF
                                GNF -> Value.GNF
                                UGX -> Value.UGX
                                PYG -> Value.PYG
                                XOF -> Value.XOF
                                XPF -> Value.XPF
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws StiggInvalidDataException if this class instance's value is a not
                         *   a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                USD -> Known.USD
                                AED -> Known.AED
                                ALL -> Known.ALL
                                AMD -> Known.AMD
                                ANG -> Known.ANG
                                AUD -> Known.AUD
                                AWG -> Known.AWG
                                AZN -> Known.AZN
                                BAM -> Known.BAM
                                BBD -> Known.BBD
                                BDT -> Known.BDT
                                BGN -> Known.BGN
                                BIF -> Known.BIF
                                BMD -> Known.BMD
                                BND -> Known.BND
                                BSD -> Known.BSD
                                BWP -> Known.BWP
                                BYN -> Known.BYN
                                BZD -> Known.BZD
                                BRL -> Known.BRL
                                CAD -> Known.CAD
                                CDF -> Known.CDF
                                CHF -> Known.CHF
                                CNY -> Known.CNY
                                CZK -> Known.CZK
                                DKK -> Known.DKK
                                DOP -> Known.DOP
                                DZD -> Known.DZD
                                EGP -> Known.EGP
                                ETB -> Known.ETB
                                EUR -> Known.EUR
                                FJD -> Known.FJD
                                GBP -> Known.GBP
                                GEL -> Known.GEL
                                GIP -> Known.GIP
                                GMD -> Known.GMD
                                GYD -> Known.GYD
                                HKD -> Known.HKD
                                HRK -> Known.HRK
                                HTG -> Known.HTG
                                IDR -> Known.IDR
                                ILS -> Known.ILS
                                INR -> Known.INR
                                ISK -> Known.ISK
                                JMD -> Known.JMD
                                JPY -> Known.JPY
                                KES -> Known.KES
                                KGS -> Known.KGS
                                KHR -> Known.KHR
                                KMF -> Known.KMF
                                KRW -> Known.KRW
                                KYD -> Known.KYD
                                KZT -> Known.KZT
                                LBP -> Known.LBP
                                LKR -> Known.LKR
                                LRD -> Known.LRD
                                LSL -> Known.LSL
                                MAD -> Known.MAD
                                MDL -> Known.MDL
                                MGA -> Known.MGA
                                MKD -> Known.MKD
                                MMK -> Known.MMK
                                MNT -> Known.MNT
                                MOP -> Known.MOP
                                MRO -> Known.MRO
                                MVR -> Known.MVR
                                MWK -> Known.MWK
                                MXN -> Known.MXN
                                MYR -> Known.MYR
                                MZN -> Known.MZN
                                NAD -> Known.NAD
                                NGN -> Known.NGN
                                NOK -> Known.NOK
                                NPR -> Known.NPR
                                NZD -> Known.NZD
                                PGK -> Known.PGK
                                PHP -> Known.PHP
                                PKR -> Known.PKR
                                PLN -> Known.PLN
                                QAR -> Known.QAR
                                RON -> Known.RON
                                RSD -> Known.RSD
                                RUB -> Known.RUB
                                RWF -> Known.RWF
                                SAR -> Known.SAR
                                SBD -> Known.SBD
                                SCR -> Known.SCR
                                SEK -> Known.SEK
                                SGD -> Known.SGD
                                SLE -> Known.SLE
                                SLL -> Known.SLL
                                SOS -> Known.SOS
                                SZL -> Known.SZL
                                THB -> Known.THB
                                TJS -> Known.TJS
                                TOP -> Known.TOP
                                TRY -> Known.TRY
                                TTD -> Known.TTD
                                TZS -> Known.TZS
                                UAH -> Known.UAH
                                UZS -> Known.UZS
                                VND -> Known.VND
                                VUV -> Known.VUV
                                WST -> Known.WST
                                XAF -> Known.XAF
                                XCD -> Known.XCD
                                YER -> Known.YER
                                ZAR -> Known.ZAR
                                ZMW -> Known.ZMW
                                CLP -> Known.CLP
                                DJF -> Known.DJF
                                GNF -> Known.GNF
                                UGX -> Known.UGX
                                PYG -> Known.PYG
                                XOF -> Known.XOF
                                XPF -> Known.XPF
                                else -> throw StiggInvalidDataException("Unknown Currency: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws StiggInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                StiggInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Currency = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Currency && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is FlatPrice &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "FlatPrice{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                /** Per-unit price in this tier */
                class UnitPrice
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Double>,
                    private val currency: JsonField<Currency>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<Currency> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The price amount
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Double = amount.getRequired("amount")

                    /**
                     * The price currency
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun currency(): Optional<Currency> = currency.getOptional("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<Currency> = currency

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
                         * Returns a mutable builder for constructing an instance of [UnitPrice].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [UnitPrice]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Double>? = null
                        private var currency: JsonField<Currency> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unitPrice: UnitPrice) = apply {
                            amount = unitPrice.amount
                            currency = unitPrice.currency
                            additionalProperties = unitPrice.additionalProperties.toMutableMap()
                        }

                        /** The price amount */
                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        /** The price currency */
                        fun currency(currency: Currency) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [Currency]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<Currency>) = apply {
                            this.currency = currency
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [UnitPrice].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): UnitPrice =
                            UnitPrice(
                                checkRequired("amount", amount),
                                currency,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): UnitPrice = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency().ifPresent { it.validate() }
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
                        (if (amount.asKnown().isPresent) 1 else 0) +
                            (currency.asKnown().getOrNull()?.validity() ?: 0)

                    /** The price currency */
                    class Currency
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val USD = of("usd")

                            @JvmField val AED = of("aed")

                            @JvmField val ALL = of("all")

                            @JvmField val AMD = of("amd")

                            @JvmField val ANG = of("ang")

                            @JvmField val AUD = of("aud")

                            @JvmField val AWG = of("awg")

                            @JvmField val AZN = of("azn")

                            @JvmField val BAM = of("bam")

                            @JvmField val BBD = of("bbd")

                            @JvmField val BDT = of("bdt")

                            @JvmField val BGN = of("bgn")

                            @JvmField val BIF = of("bif")

                            @JvmField val BMD = of("bmd")

                            @JvmField val BND = of("bnd")

                            @JvmField val BSD = of("bsd")

                            @JvmField val BWP = of("bwp")

                            @JvmField val BYN = of("byn")

                            @JvmField val BZD = of("bzd")

                            @JvmField val BRL = of("brl")

                            @JvmField val CAD = of("cad")

                            @JvmField val CDF = of("cdf")

                            @JvmField val CHF = of("chf")

                            @JvmField val CNY = of("cny")

                            @JvmField val CZK = of("czk")

                            @JvmField val DKK = of("dkk")

                            @JvmField val DOP = of("dop")

                            @JvmField val DZD = of("dzd")

                            @JvmField val EGP = of("egp")

                            @JvmField val ETB = of("etb")

                            @JvmField val EUR = of("eur")

                            @JvmField val FJD = of("fjd")

                            @JvmField val GBP = of("gbp")

                            @JvmField val GEL = of("gel")

                            @JvmField val GIP = of("gip")

                            @JvmField val GMD = of("gmd")

                            @JvmField val GYD = of("gyd")

                            @JvmField val HKD = of("hkd")

                            @JvmField val HRK = of("hrk")

                            @JvmField val HTG = of("htg")

                            @JvmField val IDR = of("idr")

                            @JvmField val ILS = of("ils")

                            @JvmField val INR = of("inr")

                            @JvmField val ISK = of("isk")

                            @JvmField val JMD = of("jmd")

                            @JvmField val JPY = of("jpy")

                            @JvmField val KES = of("kes")

                            @JvmField val KGS = of("kgs")

                            @JvmField val KHR = of("khr")

                            @JvmField val KMF = of("kmf")

                            @JvmField val KRW = of("krw")

                            @JvmField val KYD = of("kyd")

                            @JvmField val KZT = of("kzt")

                            @JvmField val LBP = of("lbp")

                            @JvmField val LKR = of("lkr")

                            @JvmField val LRD = of("lrd")

                            @JvmField val LSL = of("lsl")

                            @JvmField val MAD = of("mad")

                            @JvmField val MDL = of("mdl")

                            @JvmField val MGA = of("mga")

                            @JvmField val MKD = of("mkd")

                            @JvmField val MMK = of("mmk")

                            @JvmField val MNT = of("mnt")

                            @JvmField val MOP = of("mop")

                            @JvmField val MRO = of("mro")

                            @JvmField val MVR = of("mvr")

                            @JvmField val MWK = of("mwk")

                            @JvmField val MXN = of("mxn")

                            @JvmField val MYR = of("myr")

                            @JvmField val MZN = of("mzn")

                            @JvmField val NAD = of("nad")

                            @JvmField val NGN = of("ngn")

                            @JvmField val NOK = of("nok")

                            @JvmField val NPR = of("npr")

                            @JvmField val NZD = of("nzd")

                            @JvmField val PGK = of("pgk")

                            @JvmField val PHP = of("php")

                            @JvmField val PKR = of("pkr")

                            @JvmField val PLN = of("pln")

                            @JvmField val QAR = of("qar")

                            @JvmField val RON = of("ron")

                            @JvmField val RSD = of("rsd")

                            @JvmField val RUB = of("rub")

                            @JvmField val RWF = of("rwf")

                            @JvmField val SAR = of("sar")

                            @JvmField val SBD = of("sbd")

                            @JvmField val SCR = of("scr")

                            @JvmField val SEK = of("sek")

                            @JvmField val SGD = of("sgd")

                            @JvmField val SLE = of("sle")

                            @JvmField val SLL = of("sll")

                            @JvmField val SOS = of("sos")

                            @JvmField val SZL = of("szl")

                            @JvmField val THB = of("thb")

                            @JvmField val TJS = of("tjs")

                            @JvmField val TOP = of("top")

                            @JvmField val TRY = of("try")

                            @JvmField val TTD = of("ttd")

                            @JvmField val TZS = of("tzs")

                            @JvmField val UAH = of("uah")

                            @JvmField val UZS = of("uzs")

                            @JvmField val VND = of("vnd")

                            @JvmField val VUV = of("vuv")

                            @JvmField val WST = of("wst")

                            @JvmField val XAF = of("xaf")

                            @JvmField val XCD = of("xcd")

                            @JvmField val YER = of("yer")

                            @JvmField val ZAR = of("zar")

                            @JvmField val ZMW = of("zmw")

                            @JvmField val CLP = of("clp")

                            @JvmField val DJF = of("djf")

                            @JvmField val GNF = of("gnf")

                            @JvmField val UGX = of("ugx")

                            @JvmField val PYG = of("pyg")

                            @JvmField val XOF = of("xof")

                            @JvmField val XPF = of("xpf")

                            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                        }

                        /** An enum containing [Currency]'s known values. */
                        enum class Known {
                            USD,
                            AED,
                            ALL,
                            AMD,
                            ANG,
                            AUD,
                            AWG,
                            AZN,
                            BAM,
                            BBD,
                            BDT,
                            BGN,
                            BIF,
                            BMD,
                            BND,
                            BSD,
                            BWP,
                            BYN,
                            BZD,
                            BRL,
                            CAD,
                            CDF,
                            CHF,
                            CNY,
                            CZK,
                            DKK,
                            DOP,
                            DZD,
                            EGP,
                            ETB,
                            EUR,
                            FJD,
                            GBP,
                            GEL,
                            GIP,
                            GMD,
                            GYD,
                            HKD,
                            HRK,
                            HTG,
                            IDR,
                            ILS,
                            INR,
                            ISK,
                            JMD,
                            JPY,
                            KES,
                            KGS,
                            KHR,
                            KMF,
                            KRW,
                            KYD,
                            KZT,
                            LBP,
                            LKR,
                            LRD,
                            LSL,
                            MAD,
                            MDL,
                            MGA,
                            MKD,
                            MMK,
                            MNT,
                            MOP,
                            MRO,
                            MVR,
                            MWK,
                            MXN,
                            MYR,
                            MZN,
                            NAD,
                            NGN,
                            NOK,
                            NPR,
                            NZD,
                            PGK,
                            PHP,
                            PKR,
                            PLN,
                            QAR,
                            RON,
                            RSD,
                            RUB,
                            RWF,
                            SAR,
                            SBD,
                            SCR,
                            SEK,
                            SGD,
                            SLE,
                            SLL,
                            SOS,
                            SZL,
                            THB,
                            TJS,
                            TOP,
                            TRY,
                            TTD,
                            TZS,
                            UAH,
                            UZS,
                            VND,
                            VUV,
                            WST,
                            XAF,
                            XCD,
                            YER,
                            ZAR,
                            ZMW,
                            CLP,
                            DJF,
                            GNF,
                            UGX,
                            PYG,
                            XOF,
                            XPF,
                        }

                        /**
                         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Currency] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            USD,
                            AED,
                            ALL,
                            AMD,
                            ANG,
                            AUD,
                            AWG,
                            AZN,
                            BAM,
                            BBD,
                            BDT,
                            BGN,
                            BIF,
                            BMD,
                            BND,
                            BSD,
                            BWP,
                            BYN,
                            BZD,
                            BRL,
                            CAD,
                            CDF,
                            CHF,
                            CNY,
                            CZK,
                            DKK,
                            DOP,
                            DZD,
                            EGP,
                            ETB,
                            EUR,
                            FJD,
                            GBP,
                            GEL,
                            GIP,
                            GMD,
                            GYD,
                            HKD,
                            HRK,
                            HTG,
                            IDR,
                            ILS,
                            INR,
                            ISK,
                            JMD,
                            JPY,
                            KES,
                            KGS,
                            KHR,
                            KMF,
                            KRW,
                            KYD,
                            KZT,
                            LBP,
                            LKR,
                            LRD,
                            LSL,
                            MAD,
                            MDL,
                            MGA,
                            MKD,
                            MMK,
                            MNT,
                            MOP,
                            MRO,
                            MVR,
                            MWK,
                            MXN,
                            MYR,
                            MZN,
                            NAD,
                            NGN,
                            NOK,
                            NPR,
                            NZD,
                            PGK,
                            PHP,
                            PKR,
                            PLN,
                            QAR,
                            RON,
                            RSD,
                            RUB,
                            RWF,
                            SAR,
                            SBD,
                            SCR,
                            SEK,
                            SGD,
                            SLE,
                            SLL,
                            SOS,
                            SZL,
                            THB,
                            TJS,
                            TOP,
                            TRY,
                            TTD,
                            TZS,
                            UAH,
                            UZS,
                            VND,
                            VUV,
                            WST,
                            XAF,
                            XCD,
                            YER,
                            ZAR,
                            ZMW,
                            CLP,
                            DJF,
                            GNF,
                            UGX,
                            PYG,
                            XOF,
                            XPF,
                            /**
                             * An enum member indicating that [Currency] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                USD -> Value.USD
                                AED -> Value.AED
                                ALL -> Value.ALL
                                AMD -> Value.AMD
                                ANG -> Value.ANG
                                AUD -> Value.AUD
                                AWG -> Value.AWG
                                AZN -> Value.AZN
                                BAM -> Value.BAM
                                BBD -> Value.BBD
                                BDT -> Value.BDT
                                BGN -> Value.BGN
                                BIF -> Value.BIF
                                BMD -> Value.BMD
                                BND -> Value.BND
                                BSD -> Value.BSD
                                BWP -> Value.BWP
                                BYN -> Value.BYN
                                BZD -> Value.BZD
                                BRL -> Value.BRL
                                CAD -> Value.CAD
                                CDF -> Value.CDF
                                CHF -> Value.CHF
                                CNY -> Value.CNY
                                CZK -> Value.CZK
                                DKK -> Value.DKK
                                DOP -> Value.DOP
                                DZD -> Value.DZD
                                EGP -> Value.EGP
                                ETB -> Value.ETB
                                EUR -> Value.EUR
                                FJD -> Value.FJD
                                GBP -> Value.GBP
                                GEL -> Value.GEL
                                GIP -> Value.GIP
                                GMD -> Value.GMD
                                GYD -> Value.GYD
                                HKD -> Value.HKD
                                HRK -> Value.HRK
                                HTG -> Value.HTG
                                IDR -> Value.IDR
                                ILS -> Value.ILS
                                INR -> Value.INR
                                ISK -> Value.ISK
                                JMD -> Value.JMD
                                JPY -> Value.JPY
                                KES -> Value.KES
                                KGS -> Value.KGS
                                KHR -> Value.KHR
                                KMF -> Value.KMF
                                KRW -> Value.KRW
                                KYD -> Value.KYD
                                KZT -> Value.KZT
                                LBP -> Value.LBP
                                LKR -> Value.LKR
                                LRD -> Value.LRD
                                LSL -> Value.LSL
                                MAD -> Value.MAD
                                MDL -> Value.MDL
                                MGA -> Value.MGA
                                MKD -> Value.MKD
                                MMK -> Value.MMK
                                MNT -> Value.MNT
                                MOP -> Value.MOP
                                MRO -> Value.MRO
                                MVR -> Value.MVR
                                MWK -> Value.MWK
                                MXN -> Value.MXN
                                MYR -> Value.MYR
                                MZN -> Value.MZN
                                NAD -> Value.NAD
                                NGN -> Value.NGN
                                NOK -> Value.NOK
                                NPR -> Value.NPR
                                NZD -> Value.NZD
                                PGK -> Value.PGK
                                PHP -> Value.PHP
                                PKR -> Value.PKR
                                PLN -> Value.PLN
                                QAR -> Value.QAR
                                RON -> Value.RON
                                RSD -> Value.RSD
                                RUB -> Value.RUB
                                RWF -> Value.RWF
                                SAR -> Value.SAR
                                SBD -> Value.SBD
                                SCR -> Value.SCR
                                SEK -> Value.SEK
                                SGD -> Value.SGD
                                SLE -> Value.SLE
                                SLL -> Value.SLL
                                SOS -> Value.SOS
                                SZL -> Value.SZL
                                THB -> Value.THB
                                TJS -> Value.TJS
                                TOP -> Value.TOP
                                TRY -> Value.TRY
                                TTD -> Value.TTD
                                TZS -> Value.TZS
                                UAH -> Value.UAH
                                UZS -> Value.UZS
                                VND -> Value.VND
                                VUV -> Value.VUV
                                WST -> Value.WST
                                XAF -> Value.XAF
                                XCD -> Value.XCD
                                YER -> Value.YER
                                ZAR -> Value.ZAR
                                ZMW -> Value.ZMW
                                CLP -> Value.CLP
                                DJF -> Value.DJF
                                GNF -> Value.GNF
                                UGX -> Value.UGX
                                PYG -> Value.PYG
                                XOF -> Value.XOF
                                XPF -> Value.XPF
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws StiggInvalidDataException if this class instance's value is a not
                         *   a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                USD -> Known.USD
                                AED -> Known.AED
                                ALL -> Known.ALL
                                AMD -> Known.AMD
                                ANG -> Known.ANG
                                AUD -> Known.AUD
                                AWG -> Known.AWG
                                AZN -> Known.AZN
                                BAM -> Known.BAM
                                BBD -> Known.BBD
                                BDT -> Known.BDT
                                BGN -> Known.BGN
                                BIF -> Known.BIF
                                BMD -> Known.BMD
                                BND -> Known.BND
                                BSD -> Known.BSD
                                BWP -> Known.BWP
                                BYN -> Known.BYN
                                BZD -> Known.BZD
                                BRL -> Known.BRL
                                CAD -> Known.CAD
                                CDF -> Known.CDF
                                CHF -> Known.CHF
                                CNY -> Known.CNY
                                CZK -> Known.CZK
                                DKK -> Known.DKK
                                DOP -> Known.DOP
                                DZD -> Known.DZD
                                EGP -> Known.EGP
                                ETB -> Known.ETB
                                EUR -> Known.EUR
                                FJD -> Known.FJD
                                GBP -> Known.GBP
                                GEL -> Known.GEL
                                GIP -> Known.GIP
                                GMD -> Known.GMD
                                GYD -> Known.GYD
                                HKD -> Known.HKD
                                HRK -> Known.HRK
                                HTG -> Known.HTG
                                IDR -> Known.IDR
                                ILS -> Known.ILS
                                INR -> Known.INR
                                ISK -> Known.ISK
                                JMD -> Known.JMD
                                JPY -> Known.JPY
                                KES -> Known.KES
                                KGS -> Known.KGS
                                KHR -> Known.KHR
                                KMF -> Known.KMF
                                KRW -> Known.KRW
                                KYD -> Known.KYD
                                KZT -> Known.KZT
                                LBP -> Known.LBP
                                LKR -> Known.LKR
                                LRD -> Known.LRD
                                LSL -> Known.LSL
                                MAD -> Known.MAD
                                MDL -> Known.MDL
                                MGA -> Known.MGA
                                MKD -> Known.MKD
                                MMK -> Known.MMK
                                MNT -> Known.MNT
                                MOP -> Known.MOP
                                MRO -> Known.MRO
                                MVR -> Known.MVR
                                MWK -> Known.MWK
                                MXN -> Known.MXN
                                MYR -> Known.MYR
                                MZN -> Known.MZN
                                NAD -> Known.NAD
                                NGN -> Known.NGN
                                NOK -> Known.NOK
                                NPR -> Known.NPR
                                NZD -> Known.NZD
                                PGK -> Known.PGK
                                PHP -> Known.PHP
                                PKR -> Known.PKR
                                PLN -> Known.PLN
                                QAR -> Known.QAR
                                RON -> Known.RON
                                RSD -> Known.RSD
                                RUB -> Known.RUB
                                RWF -> Known.RWF
                                SAR -> Known.SAR
                                SBD -> Known.SBD
                                SCR -> Known.SCR
                                SEK -> Known.SEK
                                SGD -> Known.SGD
                                SLE -> Known.SLE
                                SLL -> Known.SLL
                                SOS -> Known.SOS
                                SZL -> Known.SZL
                                THB -> Known.THB
                                TJS -> Known.TJS
                                TOP -> Known.TOP
                                TRY -> Known.TRY
                                TTD -> Known.TTD
                                TZS -> Known.TZS
                                UAH -> Known.UAH
                                UZS -> Known.UZS
                                VND -> Known.VND
                                VUV -> Known.VUV
                                WST -> Known.WST
                                XAF -> Known.XAF
                                XCD -> Known.XCD
                                YER -> Known.YER
                                ZAR -> Known.ZAR
                                ZMW -> Known.ZMW
                                CLP -> Known.CLP
                                DJF -> Known.DJF
                                GNF -> Known.GNF
                                UGX -> Known.UGX
                                PYG -> Known.PYG
                                XOF -> Known.XOF
                                XPF -> Known.XPF
                                else -> throw StiggInvalidDataException("Unknown Currency: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws StiggInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                StiggInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Currency = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Currency && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnitPrice &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "UnitPrice{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tier &&
                        flatPrice == other.flatPrice &&
                        unitPrice == other.unitPrice &&
                        upTo == other.upTo &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(flatPrice, unitPrice, upTo, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{flatPrice=$flatPrice, unitPrice=$unitPrice, upTo=$upTo, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PricePeriod &&
                    billingPeriod == other.billingPeriod &&
                    billingCountryCode == other.billingCountryCode &&
                    blockSize == other.blockSize &&
                    creditGrantCadence == other.creditGrantCadence &&
                    creditRate == other.creditRate &&
                    price == other.price &&
                    tiers == other.tiers &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    billingPeriod,
                    billingCountryCode,
                    blockSize,
                    creditGrantCadence,
                    creditRate,
                    price,
                    tiers,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PricePeriod{billingPeriod=$billingPeriod, billingCountryCode=$billingCountryCode, blockSize=$blockSize, creditGrantCadence=$creditGrantCadence, creditRate=$creditRate, price=$price, tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        /** The billing cadence for overages */
        class BillingCadence
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

                @JvmField val RECURRING = of("RECURRING")

                @JvmField val ONE_OFF = of("ONE_OFF")

                @JvmStatic fun of(value: String) = BillingCadence(JsonField.of(value))
            }

            /** An enum containing [BillingCadence]'s known values. */
            enum class Known {
                RECURRING,
                ONE_OFF,
            }

            /**
             * An enum containing [BillingCadence]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillingCadence] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                RECURRING,
                ONE_OFF,
                /**
                 * An enum member indicating that [BillingCadence] was instantiated with an unknown
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
                    RECURRING -> Value.RECURRING
                    ONE_OFF -> Value.ONE_OFF
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
                    RECURRING -> Known.RECURRING
                    ONE_OFF -> Known.ONE_OFF
                    else -> throw StiggInvalidDataException("Unknown BillingCadence: $value")
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

            fun validate(): BillingCadence = apply {
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

                return other is BillingCadence && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Entitlement configuration for the overage feature */
        class Entitlement
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val featureId: JsonField<String>,
            private val hasSoftLimit: JsonField<Boolean>,
            private val hasUnlimitedUsage: JsonField<Boolean>,
            private val monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration>,
            private val resetPeriod: JsonField<ResetPeriod>,
            private val usageLimit: JsonField<Double>,
            private val weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration>,
            private val yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("featureId")
                @ExcludeMissing
                featureId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hasSoftLimit")
                @ExcludeMissing
                hasSoftLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("hasUnlimitedUsage")
                @ExcludeMissing
                hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("monthlyResetPeriodConfiguration")
                @ExcludeMissing
                monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("resetPeriod")
                @ExcludeMissing
                resetPeriod: JsonField<ResetPeriod> = JsonMissing.of(),
                @JsonProperty("usageLimit")
                @ExcludeMissing
                usageLimit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("weeklyResetPeriodConfiguration")
                @ExcludeMissing
                weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("yearlyResetPeriodConfiguration")
                @ExcludeMissing
                yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration> =
                    JsonMissing.of(),
            ) : this(
                featureId,
                hasSoftLimit,
                hasUnlimitedUsage,
                monthlyResetPeriodConfiguration,
                resetPeriod,
                usageLimit,
                weeklyResetPeriodConfiguration,
                yearlyResetPeriodConfiguration,
                mutableMapOf(),
            )

            /**
             * The feature ID for the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun featureId(): String = featureId.getRequired("featureId")

            /**
             * Whether the limit is soft (allows overage)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasSoftLimit(): Optional<Boolean> = hasSoftLimit.getOptional("hasSoftLimit")

            /**
             * Whether usage is unlimited
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasUnlimitedUsage(): Optional<Boolean> =
                hasUnlimitedUsage.getOptional("hasUnlimitedUsage")

            /**
             * Monthly reset configuration
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun monthlyResetPeriodConfiguration(): Optional<MonthlyResetPeriodConfiguration> =
                monthlyResetPeriodConfiguration.getOptional("monthlyResetPeriodConfiguration")

            /**
             * The usage reset period
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun resetPeriod(): Optional<ResetPeriod> = resetPeriod.getOptional("resetPeriod")

            /**
             * The usage limit before overage kicks in
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usageLimit(): Optional<Double> = usageLimit.getOptional("usageLimit")

            /**
             * Weekly reset configuration
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun weeklyResetPeriodConfiguration(): Optional<WeeklyResetPeriodConfiguration> =
                weeklyResetPeriodConfiguration.getOptional("weeklyResetPeriodConfiguration")

            /**
             * Yearly reset configuration
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun yearlyResetPeriodConfiguration(): Optional<YearlyResetPeriodConfiguration> =
                yearlyResetPeriodConfiguration.getOptional("yearlyResetPeriodConfiguration")

            /**
             * Returns the raw JSON value of [featureId].
             *
             * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("featureId")
            @ExcludeMissing
            fun _featureId(): JsonField<String> = featureId

            /**
             * Returns the raw JSON value of [hasSoftLimit].
             *
             * Unlike [hasSoftLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("hasSoftLimit")
            @ExcludeMissing
            fun _hasSoftLimit(): JsonField<Boolean> = hasSoftLimit

            /**
             * Returns the raw JSON value of [hasUnlimitedUsage].
             *
             * Unlike [hasUnlimitedUsage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("hasUnlimitedUsage")
            @ExcludeMissing
            fun _hasUnlimitedUsage(): JsonField<Boolean> = hasUnlimitedUsage

            /**
             * Returns the raw JSON value of [monthlyResetPeriodConfiguration].
             *
             * Unlike [monthlyResetPeriodConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("monthlyResetPeriodConfiguration")
            @ExcludeMissing
            fun _monthlyResetPeriodConfiguration(): JsonField<MonthlyResetPeriodConfiguration> =
                monthlyResetPeriodConfiguration

            /**
             * Returns the raw JSON value of [resetPeriod].
             *
             * Unlike [resetPeriod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("resetPeriod")
            @ExcludeMissing
            fun _resetPeriod(): JsonField<ResetPeriod> = resetPeriod

            /**
             * Returns the raw JSON value of [usageLimit].
             *
             * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usageLimit")
            @ExcludeMissing
            fun _usageLimit(): JsonField<Double> = usageLimit

            /**
             * Returns the raw JSON value of [weeklyResetPeriodConfiguration].
             *
             * Unlike [weeklyResetPeriodConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("weeklyResetPeriodConfiguration")
            @ExcludeMissing
            fun _weeklyResetPeriodConfiguration(): JsonField<WeeklyResetPeriodConfiguration> =
                weeklyResetPeriodConfiguration

            /**
             * Returns the raw JSON value of [yearlyResetPeriodConfiguration].
             *
             * Unlike [yearlyResetPeriodConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("yearlyResetPeriodConfiguration")
            @ExcludeMissing
            fun _yearlyResetPeriodConfiguration(): JsonField<YearlyResetPeriodConfiguration> =
                yearlyResetPeriodConfiguration

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
                 * Returns a mutable builder for constructing an instance of [Entitlement].
                 *
                 * The following fields are required:
                 * ```java
                 * .featureId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entitlement]. */
            class Builder internal constructor() {

                private var featureId: JsonField<String>? = null
                private var hasSoftLimit: JsonField<Boolean> = JsonMissing.of()
                private var hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of()
                private var monthlyResetPeriodConfiguration:
                    JsonField<MonthlyResetPeriodConfiguration> =
                    JsonMissing.of()
                private var resetPeriod: JsonField<ResetPeriod> = JsonMissing.of()
                private var usageLimit: JsonField<Double> = JsonMissing.of()
                private var weeklyResetPeriodConfiguration:
                    JsonField<WeeklyResetPeriodConfiguration> =
                    JsonMissing.of()
                private var yearlyResetPeriodConfiguration:
                    JsonField<YearlyResetPeriodConfiguration> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entitlement: Entitlement) = apply {
                    featureId = entitlement.featureId
                    hasSoftLimit = entitlement.hasSoftLimit
                    hasUnlimitedUsage = entitlement.hasUnlimitedUsage
                    monthlyResetPeriodConfiguration = entitlement.monthlyResetPeriodConfiguration
                    resetPeriod = entitlement.resetPeriod
                    usageLimit = entitlement.usageLimit
                    weeklyResetPeriodConfiguration = entitlement.weeklyResetPeriodConfiguration
                    yearlyResetPeriodConfiguration = entitlement.yearlyResetPeriodConfiguration
                    additionalProperties = entitlement.additionalProperties.toMutableMap()
                }

                /** The feature ID for the entitlement */
                fun featureId(featureId: String) = featureId(JsonField.of(featureId))

                /**
                 * Sets [Builder.featureId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.featureId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

                /** Whether the limit is soft (allows overage) */
                fun hasSoftLimit(hasSoftLimit: Boolean) = hasSoftLimit(JsonField.of(hasSoftLimit))

                /**
                 * Sets [Builder.hasSoftLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasSoftLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hasSoftLimit(hasSoftLimit: JsonField<Boolean>) = apply {
                    this.hasSoftLimit = hasSoftLimit
                }

                /** Whether usage is unlimited */
                fun hasUnlimitedUsage(hasUnlimitedUsage: Boolean) =
                    hasUnlimitedUsage(JsonField.of(hasUnlimitedUsage))

                /**
                 * Sets [Builder.hasUnlimitedUsage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasUnlimitedUsage] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun hasUnlimitedUsage(hasUnlimitedUsage: JsonField<Boolean>) = apply {
                    this.hasUnlimitedUsage = hasUnlimitedUsage
                }

                /** Monthly reset configuration */
                fun monthlyResetPeriodConfiguration(
                    monthlyResetPeriodConfiguration: MonthlyResetPeriodConfiguration
                ) = monthlyResetPeriodConfiguration(JsonField.of(monthlyResetPeriodConfiguration))

                /**
                 * Sets [Builder.monthlyResetPeriodConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.monthlyResetPeriodConfiguration] with a
                 * well-typed [MonthlyResetPeriodConfiguration] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun monthlyResetPeriodConfiguration(
                    monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration>
                ) = apply { this.monthlyResetPeriodConfiguration = monthlyResetPeriodConfiguration }

                /** The usage reset period */
                fun resetPeriod(resetPeriod: ResetPeriod) = resetPeriod(JsonField.of(resetPeriod))

                /**
                 * Sets [Builder.resetPeriod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resetPeriod] with a well-typed [ResetPeriod]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun resetPeriod(resetPeriod: JsonField<ResetPeriod>) = apply {
                    this.resetPeriod = resetPeriod
                }

                /** The usage limit before overage kicks in */
                fun usageLimit(usageLimit: Double) = usageLimit(JsonField.of(usageLimit))

                /**
                 * Sets [Builder.usageLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageLimit] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usageLimit(usageLimit: JsonField<Double>) = apply {
                    this.usageLimit = usageLimit
                }

                /** Weekly reset configuration */
                fun weeklyResetPeriodConfiguration(
                    weeklyResetPeriodConfiguration: WeeklyResetPeriodConfiguration
                ) = weeklyResetPeriodConfiguration(JsonField.of(weeklyResetPeriodConfiguration))

                /**
                 * Sets [Builder.weeklyResetPeriodConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.weeklyResetPeriodConfiguration] with a
                 * well-typed [WeeklyResetPeriodConfiguration] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun weeklyResetPeriodConfiguration(
                    weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration>
                ) = apply { this.weeklyResetPeriodConfiguration = weeklyResetPeriodConfiguration }

                /** Yearly reset configuration */
                fun yearlyResetPeriodConfiguration(
                    yearlyResetPeriodConfiguration: YearlyResetPeriodConfiguration
                ) = yearlyResetPeriodConfiguration(JsonField.of(yearlyResetPeriodConfiguration))

                /**
                 * Sets [Builder.yearlyResetPeriodConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yearlyResetPeriodConfiguration] with a
                 * well-typed [YearlyResetPeriodConfiguration] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun yearlyResetPeriodConfiguration(
                    yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration>
                ) = apply { this.yearlyResetPeriodConfiguration = yearlyResetPeriodConfiguration }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Entitlement].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .featureId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Entitlement =
                    Entitlement(
                        checkRequired("featureId", featureId),
                        hasSoftLimit,
                        hasUnlimitedUsage,
                        monthlyResetPeriodConfiguration,
                        resetPeriod,
                        usageLimit,
                        weeklyResetPeriodConfiguration,
                        yearlyResetPeriodConfiguration,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Entitlement = apply {
                if (validated) {
                    return@apply
                }

                featureId()
                hasSoftLimit()
                hasUnlimitedUsage()
                monthlyResetPeriodConfiguration().ifPresent { it.validate() }
                resetPeriod().ifPresent { it.validate() }
                usageLimit()
                weeklyResetPeriodConfiguration().ifPresent { it.validate() }
                yearlyResetPeriodConfiguration().ifPresent { it.validate() }
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
                (if (featureId.asKnown().isPresent) 1 else 0) +
                    (if (hasSoftLimit.asKnown().isPresent) 1 else 0) +
                    (if (hasUnlimitedUsage.asKnown().isPresent) 1 else 0) +
                    (monthlyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                    (resetPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (usageLimit.asKnown().isPresent) 1 else 0) +
                    (weeklyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                    (yearlyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0)

            /** Monthly reset configuration */
            class MonthlyResetPeriodConfiguration
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accordingTo: JsonField<AccordingTo>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("accordingTo")
                    @ExcludeMissing
                    accordingTo: JsonField<AccordingTo> = JsonMissing.of()
                ) : this(accordingTo, mutableMapOf())

                /**
                 * Reset anchor (SubscriptionStart or StartOfTheMonth)
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun accordingTo(): AccordingTo = accordingTo.getRequired("accordingTo")

                /**
                 * Returns the raw JSON value of [accordingTo].
                 *
                 * Unlike [accordingTo], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("accordingTo")
                @ExcludeMissing
                fun _accordingTo(): JsonField<AccordingTo> = accordingTo

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
                     * [MonthlyResetPeriodConfiguration].
                     *
                     * The following fields are required:
                     * ```java
                     * .accordingTo()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [MonthlyResetPeriodConfiguration]. */
                class Builder internal constructor() {

                    private var accordingTo: JsonField<AccordingTo>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        monthlyResetPeriodConfiguration: MonthlyResetPeriodConfiguration
                    ) = apply {
                        accordingTo = monthlyResetPeriodConfiguration.accordingTo
                        additionalProperties =
                            monthlyResetPeriodConfiguration.additionalProperties.toMutableMap()
                    }

                    /** Reset anchor (SubscriptionStart or StartOfTheMonth) */
                    fun accordingTo(accordingTo: AccordingTo) =
                        accordingTo(JsonField.of(accordingTo))

                    /**
                     * Sets [Builder.accordingTo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accordingTo] with a well-typed [AccordingTo]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accordingTo(accordingTo: JsonField<AccordingTo>) = apply {
                        this.accordingTo = accordingTo
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [MonthlyResetPeriodConfiguration].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .accordingTo()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): MonthlyResetPeriodConfiguration =
                        MonthlyResetPeriodConfiguration(
                            checkRequired("accordingTo", accordingTo),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): MonthlyResetPeriodConfiguration = apply {
                    if (validated) {
                        return@apply
                    }

                    accordingTo().validate()
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
                internal fun validity(): Int = (accordingTo.asKnown().getOrNull()?.validity() ?: 0)

                /** Reset anchor (SubscriptionStart or StartOfTheMonth) */
                class AccordingTo
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SUBSCRIPTION_START = of("SubscriptionStart")

                        @JvmField val START_OF_THE_MONTH = of("StartOfTheMonth")

                        @JvmStatic fun of(value: String) = AccordingTo(JsonField.of(value))
                    }

                    /** An enum containing [AccordingTo]'s known values. */
                    enum class Known {
                        SUBSCRIPTION_START,
                        START_OF_THE_MONTH,
                    }

                    /**
                     * An enum containing [AccordingTo]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AccordingTo] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SUBSCRIPTION_START,
                        START_OF_THE_MONTH,
                        /**
                         * An enum member indicating that [AccordingTo] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SUBSCRIPTION_START -> Value.SUBSCRIPTION_START
                            START_OF_THE_MONTH -> Value.START_OF_THE_MONTH
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws StiggInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SUBSCRIPTION_START -> Known.SUBSCRIPTION_START
                            START_OF_THE_MONTH -> Known.START_OF_THE_MONTH
                            else -> throw StiggInvalidDataException("Unknown AccordingTo: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws StiggInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            StiggInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): AccordingTo = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AccordingTo && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MonthlyResetPeriodConfiguration &&
                        accordingTo == other.accordingTo &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accordingTo, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MonthlyResetPeriodConfiguration{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
            }

            /** The usage reset period */
            class ResetPeriod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val YEAR = of("YEAR")

                    @JvmField val MONTH = of("MONTH")

                    @JvmField val WEEK = of("WEEK")

                    @JvmField val DAY = of("DAY")

                    @JvmField val HOUR = of("HOUR")

                    @JvmStatic fun of(value: String) = ResetPeriod(JsonField.of(value))
                }

                /** An enum containing [ResetPeriod]'s known values. */
                enum class Known {
                    YEAR,
                    MONTH,
                    WEEK,
                    DAY,
                    HOUR,
                }

                /**
                 * An enum containing [ResetPeriod]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [ResetPeriod] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    YEAR,
                    MONTH,
                    WEEK,
                    DAY,
                    HOUR,
                    /**
                     * An enum member indicating that [ResetPeriod] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        YEAR -> Value.YEAR
                        MONTH -> Value.MONTH
                        WEEK -> Value.WEEK
                        DAY -> Value.DAY
                        HOUR -> Value.HOUR
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
                        YEAR -> Known.YEAR
                        MONTH -> Known.MONTH
                        WEEK -> Known.WEEK
                        DAY -> Known.DAY
                        HOUR -> Known.HOUR
                        else -> throw StiggInvalidDataException("Unknown ResetPeriod: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StiggInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): ResetPeriod = apply {
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

                    return other is ResetPeriod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Weekly reset configuration */
            class WeeklyResetPeriodConfiguration
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accordingTo: JsonField<AccordingTo>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("accordingTo")
                    @ExcludeMissing
                    accordingTo: JsonField<AccordingTo> = JsonMissing.of()
                ) : this(accordingTo, mutableMapOf())

                /**
                 * Reset anchor (SubscriptionStart or specific day)
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun accordingTo(): AccordingTo = accordingTo.getRequired("accordingTo")

                /**
                 * Returns the raw JSON value of [accordingTo].
                 *
                 * Unlike [accordingTo], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("accordingTo")
                @ExcludeMissing
                fun _accordingTo(): JsonField<AccordingTo> = accordingTo

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
                     * [WeeklyResetPeriodConfiguration].
                     *
                     * The following fields are required:
                     * ```java
                     * .accordingTo()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WeeklyResetPeriodConfiguration]. */
                class Builder internal constructor() {

                    private var accordingTo: JsonField<AccordingTo>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        weeklyResetPeriodConfiguration: WeeklyResetPeriodConfiguration
                    ) = apply {
                        accordingTo = weeklyResetPeriodConfiguration.accordingTo
                        additionalProperties =
                            weeklyResetPeriodConfiguration.additionalProperties.toMutableMap()
                    }

                    /** Reset anchor (SubscriptionStart or specific day) */
                    fun accordingTo(accordingTo: AccordingTo) =
                        accordingTo(JsonField.of(accordingTo))

                    /**
                     * Sets [Builder.accordingTo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accordingTo] with a well-typed [AccordingTo]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accordingTo(accordingTo: JsonField<AccordingTo>) = apply {
                        this.accordingTo = accordingTo
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [WeeklyResetPeriodConfiguration].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .accordingTo()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): WeeklyResetPeriodConfiguration =
                        WeeklyResetPeriodConfiguration(
                            checkRequired("accordingTo", accordingTo),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): WeeklyResetPeriodConfiguration = apply {
                    if (validated) {
                        return@apply
                    }

                    accordingTo().validate()
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
                internal fun validity(): Int = (accordingTo.asKnown().getOrNull()?.validity() ?: 0)

                /** Reset anchor (SubscriptionStart or specific day) */
                class AccordingTo
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SUBSCRIPTION_START = of("SubscriptionStart")

                        @JvmField val EVERY_SUNDAY = of("EverySunday")

                        @JvmField val EVERY_MONDAY = of("EveryMonday")

                        @JvmField val EVERY_TUESDAY = of("EveryTuesday")

                        @JvmField val EVERY_WEDNESDAY = of("EveryWednesday")

                        @JvmField val EVERY_THURSDAY = of("EveryThursday")

                        @JvmField val EVERY_FRIDAY = of("EveryFriday")

                        @JvmField val EVERY_SATURDAY = of("EverySaturday")

                        @JvmStatic fun of(value: String) = AccordingTo(JsonField.of(value))
                    }

                    /** An enum containing [AccordingTo]'s known values. */
                    enum class Known {
                        SUBSCRIPTION_START,
                        EVERY_SUNDAY,
                        EVERY_MONDAY,
                        EVERY_TUESDAY,
                        EVERY_WEDNESDAY,
                        EVERY_THURSDAY,
                        EVERY_FRIDAY,
                        EVERY_SATURDAY,
                    }

                    /**
                     * An enum containing [AccordingTo]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AccordingTo] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SUBSCRIPTION_START,
                        EVERY_SUNDAY,
                        EVERY_MONDAY,
                        EVERY_TUESDAY,
                        EVERY_WEDNESDAY,
                        EVERY_THURSDAY,
                        EVERY_FRIDAY,
                        EVERY_SATURDAY,
                        /**
                         * An enum member indicating that [AccordingTo] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SUBSCRIPTION_START -> Value.SUBSCRIPTION_START
                            EVERY_SUNDAY -> Value.EVERY_SUNDAY
                            EVERY_MONDAY -> Value.EVERY_MONDAY
                            EVERY_TUESDAY -> Value.EVERY_TUESDAY
                            EVERY_WEDNESDAY -> Value.EVERY_WEDNESDAY
                            EVERY_THURSDAY -> Value.EVERY_THURSDAY
                            EVERY_FRIDAY -> Value.EVERY_FRIDAY
                            EVERY_SATURDAY -> Value.EVERY_SATURDAY
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws StiggInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SUBSCRIPTION_START -> Known.SUBSCRIPTION_START
                            EVERY_SUNDAY -> Known.EVERY_SUNDAY
                            EVERY_MONDAY -> Known.EVERY_MONDAY
                            EVERY_TUESDAY -> Known.EVERY_TUESDAY
                            EVERY_WEDNESDAY -> Known.EVERY_WEDNESDAY
                            EVERY_THURSDAY -> Known.EVERY_THURSDAY
                            EVERY_FRIDAY -> Known.EVERY_FRIDAY
                            EVERY_SATURDAY -> Known.EVERY_SATURDAY
                            else -> throw StiggInvalidDataException("Unknown AccordingTo: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws StiggInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            StiggInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): AccordingTo = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AccordingTo && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WeeklyResetPeriodConfiguration &&
                        accordingTo == other.accordingTo &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accordingTo, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WeeklyResetPeriodConfiguration{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
            }

            /** Yearly reset configuration */
            class YearlyResetPeriodConfiguration
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accordingTo: JsonField<AccordingTo>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("accordingTo")
                    @ExcludeMissing
                    accordingTo: JsonField<AccordingTo> = JsonMissing.of()
                ) : this(accordingTo, mutableMapOf())

                /**
                 * Reset anchor (SubscriptionStart)
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun accordingTo(): AccordingTo = accordingTo.getRequired("accordingTo")

                /**
                 * Returns the raw JSON value of [accordingTo].
                 *
                 * Unlike [accordingTo], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("accordingTo")
                @ExcludeMissing
                fun _accordingTo(): JsonField<AccordingTo> = accordingTo

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
                     * [YearlyResetPeriodConfiguration].
                     *
                     * The following fields are required:
                     * ```java
                     * .accordingTo()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [YearlyResetPeriodConfiguration]. */
                class Builder internal constructor() {

                    private var accordingTo: JsonField<AccordingTo>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        yearlyResetPeriodConfiguration: YearlyResetPeriodConfiguration
                    ) = apply {
                        accordingTo = yearlyResetPeriodConfiguration.accordingTo
                        additionalProperties =
                            yearlyResetPeriodConfiguration.additionalProperties.toMutableMap()
                    }

                    /** Reset anchor (SubscriptionStart) */
                    fun accordingTo(accordingTo: AccordingTo) =
                        accordingTo(JsonField.of(accordingTo))

                    /**
                     * Sets [Builder.accordingTo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accordingTo] with a well-typed [AccordingTo]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accordingTo(accordingTo: JsonField<AccordingTo>) = apply {
                        this.accordingTo = accordingTo
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [YearlyResetPeriodConfiguration].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .accordingTo()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): YearlyResetPeriodConfiguration =
                        YearlyResetPeriodConfiguration(
                            checkRequired("accordingTo", accordingTo),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): YearlyResetPeriodConfiguration = apply {
                    if (validated) {
                        return@apply
                    }

                    accordingTo().validate()
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
                internal fun validity(): Int = (accordingTo.asKnown().getOrNull()?.validity() ?: 0)

                /** Reset anchor (SubscriptionStart) */
                class AccordingTo
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SUBSCRIPTION_START = of("SubscriptionStart")

                        @JvmStatic fun of(value: String) = AccordingTo(JsonField.of(value))
                    }

                    /** An enum containing [AccordingTo]'s known values. */
                    enum class Known {
                        SUBSCRIPTION_START
                    }

                    /**
                     * An enum containing [AccordingTo]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AccordingTo] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SUBSCRIPTION_START,
                        /**
                         * An enum member indicating that [AccordingTo] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SUBSCRIPTION_START -> Value.SUBSCRIPTION_START
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws StiggInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SUBSCRIPTION_START -> Known.SUBSCRIPTION_START
                            else -> throw StiggInvalidDataException("Unknown AccordingTo: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws StiggInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            StiggInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): AccordingTo = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AccordingTo && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is YearlyResetPeriodConfiguration &&
                        accordingTo == other.accordingTo &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accordingTo, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "YearlyResetPeriodConfiguration{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entitlement &&
                    featureId == other.featureId &&
                    hasSoftLimit == other.hasSoftLimit &&
                    hasUnlimitedUsage == other.hasUnlimitedUsage &&
                    monthlyResetPeriodConfiguration == other.monthlyResetPeriodConfiguration &&
                    resetPeriod == other.resetPeriod &&
                    usageLimit == other.usageLimit &&
                    weeklyResetPeriodConfiguration == other.weeklyResetPeriodConfiguration &&
                    yearlyResetPeriodConfiguration == other.yearlyResetPeriodConfiguration &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    featureId,
                    hasSoftLimit,
                    hasUnlimitedUsage,
                    monthlyResetPeriodConfiguration,
                    resetPeriod,
                    usageLimit,
                    weeklyResetPeriodConfiguration,
                    yearlyResetPeriodConfiguration,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entitlement{featureId=$featureId, hasSoftLimit=$hasSoftLimit, hasUnlimitedUsage=$hasUnlimitedUsage, monthlyResetPeriodConfiguration=$monthlyResetPeriodConfiguration, resetPeriod=$resetPeriod, usageLimit=$usageLimit, weeklyResetPeriodConfiguration=$weeklyResetPeriodConfiguration, yearlyResetPeriodConfiguration=$yearlyResetPeriodConfiguration, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OveragePricingModel &&
                billingModel == other.billingModel &&
                pricePeriods == other.pricePeriods &&
                billingCadence == other.billingCadence &&
                entitlement == other.entitlement &&
                featureId == other.featureId &&
                topUpCustomCurrencyId == other.topUpCustomCurrencyId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingModel,
                pricePeriods,
                billingCadence,
                entitlement,
                featureId,
                topUpCustomCurrencyId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OveragePricingModel{billingModel=$billingModel, pricePeriods=$pricePeriods, billingCadence=$billingCadence, entitlement=$entitlement, featureId=$featureId, topUpCustomCurrencyId=$topUpCustomCurrencyId, additionalProperties=$additionalProperties}"
    }

    /** A pricing model configuration with billing details and price periods. */
    class PricingModel
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingModel: JsonField<BillingModel>,
        private val pricePeriods: JsonField<List<PricePeriod>>,
        private val billingCadence: JsonField<BillingCadence>,
        private val featureId: JsonField<String>,
        private val maxUnitQuantity: JsonField<Long>,
        private val minUnitQuantity: JsonField<Long>,
        private val monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration>,
        private val resetPeriod: JsonField<ResetPeriod>,
        private val tiersMode: JsonField<TiersMode>,
        private val topUpCustomCurrencyId: JsonField<String>,
        private val weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration>,
        private val yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billingModel")
            @ExcludeMissing
            billingModel: JsonField<BillingModel> = JsonMissing.of(),
            @JsonProperty("pricePeriods")
            @ExcludeMissing
            pricePeriods: JsonField<List<PricePeriod>> = JsonMissing.of(),
            @JsonProperty("billingCadence")
            @ExcludeMissing
            billingCadence: JsonField<BillingCadence> = JsonMissing.of(),
            @JsonProperty("featureId")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maxUnitQuantity")
            @ExcludeMissing
            maxUnitQuantity: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("minUnitQuantity")
            @ExcludeMissing
            minUnitQuantity: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthlyResetPeriodConfiguration")
            @ExcludeMissing
            monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration> =
                JsonMissing.of(),
            @JsonProperty("resetPeriod")
            @ExcludeMissing
            resetPeriod: JsonField<ResetPeriod> = JsonMissing.of(),
            @JsonProperty("tiersMode")
            @ExcludeMissing
            tiersMode: JsonField<TiersMode> = JsonMissing.of(),
            @JsonProperty("topUpCustomCurrencyId")
            @ExcludeMissing
            topUpCustomCurrencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("weeklyResetPeriodConfiguration")
            @ExcludeMissing
            weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration> =
                JsonMissing.of(),
            @JsonProperty("yearlyResetPeriodConfiguration")
            @ExcludeMissing
            yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration> =
                JsonMissing.of(),
        ) : this(
            billingModel,
            pricePeriods,
            billingCadence,
            featureId,
            maxUnitQuantity,
            minUnitQuantity,
            monthlyResetPeriodConfiguration,
            resetPeriod,
            tiersMode,
            topUpCustomCurrencyId,
            weeklyResetPeriodConfiguration,
            yearlyResetPeriodConfiguration,
            mutableMapOf(),
        )

        /**
         * The billing model (FLAT_FEE, PER_UNIT, USAGE_BASED, CREDIT_BASED)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingModel(): BillingModel = billingModel.getRequired("billingModel")

        /**
         * Array of price period configurations (at least one required)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pricePeriods(): List<PricePeriod> = pricePeriods.getRequired("pricePeriods")

        /**
         * The billing cadence (RECURRING or ONE_OFF)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingCadence(): Optional<BillingCadence> =
            billingCadence.getOptional("billingCadence")

        /**
         * The feature ID this pricing model is associated with
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureId(): Optional<String> = featureId.getOptional("featureId")

        /**
         * Maximum number of units (max 999999)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxUnitQuantity(): Optional<Long> = maxUnitQuantity.getOptional("maxUnitQuantity")

        /**
         * Minimum number of units
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minUnitQuantity(): Optional<Long> = minUnitQuantity.getOptional("minUnitQuantity")

        /**
         * Monthly reset period configuration
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthlyResetPeriodConfiguration(): Optional<MonthlyResetPeriodConfiguration> =
            monthlyResetPeriodConfiguration.getOptional("monthlyResetPeriodConfiguration")

        /**
         * The usage reset period
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resetPeriod(): Optional<ResetPeriod> = resetPeriod.getOptional("resetPeriod")

        /**
         * The tiered pricing mode (VOLUME or GRADUATED)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tiersMode(): Optional<TiersMode> = tiersMode.getOptional("tiersMode")

        /**
         * The custom currency ID for top-up pricing
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun topUpCustomCurrencyId(): Optional<String> =
            topUpCustomCurrencyId.getOptional("topUpCustomCurrencyId")

        /**
         * Weekly reset period configuration
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun weeklyResetPeriodConfiguration(): Optional<WeeklyResetPeriodConfiguration> =
            weeklyResetPeriodConfiguration.getOptional("weeklyResetPeriodConfiguration")

        /**
         * Yearly reset period configuration
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun yearlyResetPeriodConfiguration(): Optional<YearlyResetPeriodConfiguration> =
            yearlyResetPeriodConfiguration.getOptional("yearlyResetPeriodConfiguration")

        /**
         * Returns the raw JSON value of [billingModel].
         *
         * Unlike [billingModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingModel")
        @ExcludeMissing
        fun _billingModel(): JsonField<BillingModel> = billingModel

        /**
         * Returns the raw JSON value of [pricePeriods].
         *
         * Unlike [pricePeriods], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pricePeriods")
        @ExcludeMissing
        fun _pricePeriods(): JsonField<List<PricePeriod>> = pricePeriods

        /**
         * Returns the raw JSON value of [billingCadence].
         *
         * Unlike [billingCadence], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingCadence")
        @ExcludeMissing
        fun _billingCadence(): JsonField<BillingCadence> = billingCadence

        /**
         * Returns the raw JSON value of [featureId].
         *
         * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

        /**
         * Returns the raw JSON value of [maxUnitQuantity].
         *
         * Unlike [maxUnitQuantity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maxUnitQuantity")
        @ExcludeMissing
        fun _maxUnitQuantity(): JsonField<Long> = maxUnitQuantity

        /**
         * Returns the raw JSON value of [minUnitQuantity].
         *
         * Unlike [minUnitQuantity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minUnitQuantity")
        @ExcludeMissing
        fun _minUnitQuantity(): JsonField<Long> = minUnitQuantity

        /**
         * Returns the raw JSON value of [monthlyResetPeriodConfiguration].
         *
         * Unlike [monthlyResetPeriodConfiguration], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("monthlyResetPeriodConfiguration")
        @ExcludeMissing
        fun _monthlyResetPeriodConfiguration(): JsonField<MonthlyResetPeriodConfiguration> =
            monthlyResetPeriodConfiguration

        /**
         * Returns the raw JSON value of [resetPeriod].
         *
         * Unlike [resetPeriod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resetPeriod")
        @ExcludeMissing
        fun _resetPeriod(): JsonField<ResetPeriod> = resetPeriod

        /**
         * Returns the raw JSON value of [tiersMode].
         *
         * Unlike [tiersMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tiersMode")
        @ExcludeMissing
        fun _tiersMode(): JsonField<TiersMode> = tiersMode

        /**
         * Returns the raw JSON value of [topUpCustomCurrencyId].
         *
         * Unlike [topUpCustomCurrencyId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("topUpCustomCurrencyId")
        @ExcludeMissing
        fun _topUpCustomCurrencyId(): JsonField<String> = topUpCustomCurrencyId

        /**
         * Returns the raw JSON value of [weeklyResetPeriodConfiguration].
         *
         * Unlike [weeklyResetPeriodConfiguration], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("weeklyResetPeriodConfiguration")
        @ExcludeMissing
        fun _weeklyResetPeriodConfiguration(): JsonField<WeeklyResetPeriodConfiguration> =
            weeklyResetPeriodConfiguration

        /**
         * Returns the raw JSON value of [yearlyResetPeriodConfiguration].
         *
         * Unlike [yearlyResetPeriodConfiguration], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("yearlyResetPeriodConfiguration")
        @ExcludeMissing
        fun _yearlyResetPeriodConfiguration(): JsonField<YearlyResetPeriodConfiguration> =
            yearlyResetPeriodConfiguration

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
             * Returns a mutable builder for constructing an instance of [PricingModel].
             *
             * The following fields are required:
             * ```java
             * .billingModel()
             * .pricePeriods()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PricingModel]. */
        class Builder internal constructor() {

            private var billingModel: JsonField<BillingModel>? = null
            private var pricePeriods: JsonField<MutableList<PricePeriod>>? = null
            private var billingCadence: JsonField<BillingCadence> = JsonMissing.of()
            private var featureId: JsonField<String> = JsonMissing.of()
            private var maxUnitQuantity: JsonField<Long> = JsonMissing.of()
            private var minUnitQuantity: JsonField<Long> = JsonMissing.of()
            private var monthlyResetPeriodConfiguration:
                JsonField<MonthlyResetPeriodConfiguration> =
                JsonMissing.of()
            private var resetPeriod: JsonField<ResetPeriod> = JsonMissing.of()
            private var tiersMode: JsonField<TiersMode> = JsonMissing.of()
            private var topUpCustomCurrencyId: JsonField<String> = JsonMissing.of()
            private var weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration> =
                JsonMissing.of()
            private var yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pricingModel: PricingModel) = apply {
                billingModel = pricingModel.billingModel
                pricePeriods = pricingModel.pricePeriods.map { it.toMutableList() }
                billingCadence = pricingModel.billingCadence
                featureId = pricingModel.featureId
                maxUnitQuantity = pricingModel.maxUnitQuantity
                minUnitQuantity = pricingModel.minUnitQuantity
                monthlyResetPeriodConfiguration = pricingModel.monthlyResetPeriodConfiguration
                resetPeriod = pricingModel.resetPeriod
                tiersMode = pricingModel.tiersMode
                topUpCustomCurrencyId = pricingModel.topUpCustomCurrencyId
                weeklyResetPeriodConfiguration = pricingModel.weeklyResetPeriodConfiguration
                yearlyResetPeriodConfiguration = pricingModel.yearlyResetPeriodConfiguration
                additionalProperties = pricingModel.additionalProperties.toMutableMap()
            }

            /** The billing model (FLAT_FEE, PER_UNIT, USAGE_BASED, CREDIT_BASED) */
            fun billingModel(billingModel: BillingModel) = billingModel(JsonField.of(billingModel))

            /**
             * Sets [Builder.billingModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingModel] with a well-typed [BillingModel] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingModel(billingModel: JsonField<BillingModel>) = apply {
                this.billingModel = billingModel
            }

            /** Array of price period configurations (at least one required) */
            fun pricePeriods(pricePeriods: List<PricePeriod>) =
                pricePeriods(JsonField.of(pricePeriods))

            /**
             * Sets [Builder.pricePeriods] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricePeriods] with a well-typed `List<PricePeriod>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pricePeriods(pricePeriods: JsonField<List<PricePeriod>>) = apply {
                this.pricePeriods = pricePeriods.map { it.toMutableList() }
            }

            /**
             * Adds a single [PricePeriod] to [pricePeriods].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPricePeriod(pricePeriod: PricePeriod) = apply {
                pricePeriods =
                    (pricePeriods ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pricePeriods", it).add(pricePeriod)
                    }
            }

            /** The billing cadence (RECURRING or ONE_OFF) */
            fun billingCadence(billingCadence: BillingCadence) =
                billingCadence(JsonField.of(billingCadence))

            /**
             * Sets [Builder.billingCadence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingCadence] with a well-typed [BillingCadence]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingCadence(billingCadence: JsonField<BillingCadence>) = apply {
                this.billingCadence = billingCadence
            }

            /** The feature ID this pricing model is associated with */
            fun featureId(featureId: String) = featureId(JsonField.of(featureId))

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

            /** Maximum number of units (max 999999) */
            fun maxUnitQuantity(maxUnitQuantity: Long) =
                maxUnitQuantity(JsonField.of(maxUnitQuantity))

            /**
             * Sets [Builder.maxUnitQuantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxUnitQuantity] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxUnitQuantity(maxUnitQuantity: JsonField<Long>) = apply {
                this.maxUnitQuantity = maxUnitQuantity
            }

            /** Minimum number of units */
            fun minUnitQuantity(minUnitQuantity: Long) =
                minUnitQuantity(JsonField.of(minUnitQuantity))

            /**
             * Sets [Builder.minUnitQuantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minUnitQuantity] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minUnitQuantity(minUnitQuantity: JsonField<Long>) = apply {
                this.minUnitQuantity = minUnitQuantity
            }

            /** Monthly reset period configuration */
            fun monthlyResetPeriodConfiguration(
                monthlyResetPeriodConfiguration: MonthlyResetPeriodConfiguration
            ) = monthlyResetPeriodConfiguration(JsonField.of(monthlyResetPeriodConfiguration))

            /**
             * Sets [Builder.monthlyResetPeriodConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyResetPeriodConfiguration] with a well-typed
             * [MonthlyResetPeriodConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun monthlyResetPeriodConfiguration(
                monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration>
            ) = apply { this.monthlyResetPeriodConfiguration = monthlyResetPeriodConfiguration }

            /** The usage reset period */
            fun resetPeriod(resetPeriod: ResetPeriod) = resetPeriod(JsonField.of(resetPeriod))

            /**
             * Sets [Builder.resetPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resetPeriod] with a well-typed [ResetPeriod] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resetPeriod(resetPeriod: JsonField<ResetPeriod>) = apply {
                this.resetPeriod = resetPeriod
            }

            /** The tiered pricing mode (VOLUME or GRADUATED) */
            fun tiersMode(tiersMode: TiersMode) = tiersMode(JsonField.of(tiersMode))

            /**
             * Sets [Builder.tiersMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiersMode] with a well-typed [TiersMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tiersMode(tiersMode: JsonField<TiersMode>) = apply { this.tiersMode = tiersMode }

            /** The custom currency ID for top-up pricing */
            fun topUpCustomCurrencyId(topUpCustomCurrencyId: String) =
                topUpCustomCurrencyId(JsonField.of(topUpCustomCurrencyId))

            /**
             * Sets [Builder.topUpCustomCurrencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topUpCustomCurrencyId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun topUpCustomCurrencyId(topUpCustomCurrencyId: JsonField<String>) = apply {
                this.topUpCustomCurrencyId = topUpCustomCurrencyId
            }

            /** Weekly reset period configuration */
            fun weeklyResetPeriodConfiguration(
                weeklyResetPeriodConfiguration: WeeklyResetPeriodConfiguration
            ) = weeklyResetPeriodConfiguration(JsonField.of(weeklyResetPeriodConfiguration))

            /**
             * Sets [Builder.weeklyResetPeriodConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weeklyResetPeriodConfiguration] with a well-typed
             * [WeeklyResetPeriodConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun weeklyResetPeriodConfiguration(
                weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration>
            ) = apply { this.weeklyResetPeriodConfiguration = weeklyResetPeriodConfiguration }

            /** Yearly reset period configuration */
            fun yearlyResetPeriodConfiguration(
                yearlyResetPeriodConfiguration: YearlyResetPeriodConfiguration
            ) = yearlyResetPeriodConfiguration(JsonField.of(yearlyResetPeriodConfiguration))

            /**
             * Sets [Builder.yearlyResetPeriodConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.yearlyResetPeriodConfiguration] with a well-typed
             * [YearlyResetPeriodConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun yearlyResetPeriodConfiguration(
                yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration>
            ) = apply { this.yearlyResetPeriodConfiguration = yearlyResetPeriodConfiguration }

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
             * Returns an immutable instance of [PricingModel].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billingModel()
             * .pricePeriods()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PricingModel =
                PricingModel(
                    checkRequired("billingModel", billingModel),
                    checkRequired("pricePeriods", pricePeriods).map { it.toImmutable() },
                    billingCadence,
                    featureId,
                    maxUnitQuantity,
                    minUnitQuantity,
                    monthlyResetPeriodConfiguration,
                    resetPeriod,
                    tiersMode,
                    topUpCustomCurrencyId,
                    weeklyResetPeriodConfiguration,
                    yearlyResetPeriodConfiguration,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PricingModel = apply {
            if (validated) {
                return@apply
            }

            billingModel().validate()
            pricePeriods().forEach { it.validate() }
            billingCadence().ifPresent { it.validate() }
            featureId()
            maxUnitQuantity()
            minUnitQuantity()
            monthlyResetPeriodConfiguration().ifPresent { it.validate() }
            resetPeriod().ifPresent { it.validate() }
            tiersMode().ifPresent { it.validate() }
            topUpCustomCurrencyId()
            weeklyResetPeriodConfiguration().ifPresent { it.validate() }
            yearlyResetPeriodConfiguration().ifPresent { it.validate() }
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
            (billingModel.asKnown().getOrNull()?.validity() ?: 0) +
                (pricePeriods.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (billingCadence.asKnown().getOrNull()?.validity() ?: 0) +
                (if (featureId.asKnown().isPresent) 1 else 0) +
                (if (maxUnitQuantity.asKnown().isPresent) 1 else 0) +
                (if (minUnitQuantity.asKnown().isPresent) 1 else 0) +
                (monthlyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (resetPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                (tiersMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (topUpCustomCurrencyId.asKnown().isPresent) 1 else 0) +
                (weeklyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (yearlyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0)

        /** The billing model (FLAT_FEE, PER_UNIT, USAGE_BASED, CREDIT_BASED) */
        class BillingModel @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val FLAT_FEE = of("FLAT_FEE")

                @JvmField val MINIMUM_SPEND = of("MINIMUM_SPEND")

                @JvmField val PER_UNIT = of("PER_UNIT")

                @JvmField val USAGE_BASED = of("USAGE_BASED")

                @JvmField val CREDIT_BASED = of("CREDIT_BASED")

                @JvmStatic fun of(value: String) = BillingModel(JsonField.of(value))
            }

            /** An enum containing [BillingModel]'s known values. */
            enum class Known {
                FLAT_FEE,
                MINIMUM_SPEND,
                PER_UNIT,
                USAGE_BASED,
                CREDIT_BASED,
            }

            /**
             * An enum containing [BillingModel]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillingModel] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FLAT_FEE,
                MINIMUM_SPEND,
                PER_UNIT,
                USAGE_BASED,
                CREDIT_BASED,
                /**
                 * An enum member indicating that [BillingModel] was instantiated with an unknown
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
                    FLAT_FEE -> Value.FLAT_FEE
                    MINIMUM_SPEND -> Value.MINIMUM_SPEND
                    PER_UNIT -> Value.PER_UNIT
                    USAGE_BASED -> Value.USAGE_BASED
                    CREDIT_BASED -> Value.CREDIT_BASED
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
                    FLAT_FEE -> Known.FLAT_FEE
                    MINIMUM_SPEND -> Known.MINIMUM_SPEND
                    PER_UNIT -> Known.PER_UNIT
                    USAGE_BASED -> Known.USAGE_BASED
                    CREDIT_BASED -> Known.CREDIT_BASED
                    else -> throw StiggInvalidDataException("Unknown BillingModel: $value")
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

            fun validate(): BillingModel = apply {
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

                return other is BillingModel && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Price configuration for a specific billing period. */
        class PricePeriod
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val billingPeriod: JsonField<BillingPeriod>,
            private val billingCountryCode: JsonField<String>,
            private val blockSize: JsonField<Double>,
            private val creditGrantCadence: JsonField<CreditGrantCadence>,
            private val creditRate: JsonField<CreditRate>,
            private val price: JsonField<Price>,
            private val tiers: JsonField<List<Tier>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billingPeriod")
                @ExcludeMissing
                billingPeriod: JsonField<BillingPeriod> = JsonMissing.of(),
                @JsonProperty("billingCountryCode")
                @ExcludeMissing
                billingCountryCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("blockSize")
                @ExcludeMissing
                blockSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("creditGrantCadence")
                @ExcludeMissing
                creditGrantCadence: JsonField<CreditGrantCadence> = JsonMissing.of(),
                @JsonProperty("creditRate")
                @ExcludeMissing
                creditRate: JsonField<CreditRate> = JsonMissing.of(),
                @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
                @JsonProperty("tiers")
                @ExcludeMissing
                tiers: JsonField<List<Tier>> = JsonMissing.of(),
            ) : this(
                billingPeriod,
                billingCountryCode,
                blockSize,
                creditGrantCadence,
                creditRate,
                price,
                tiers,
                mutableMapOf(),
            )

            /**
             * The billing period (MONTHLY or ANNUALLY)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun billingPeriod(): BillingPeriod = billingPeriod.getRequired("billingPeriod")

            /**
             * ISO country code for localized pricing
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billingCountryCode(): Optional<String> =
                billingCountryCode.getOptional("billingCountryCode")

            /**
             * Block size for usage-based pricing
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun blockSize(): Optional<Double> = blockSize.getOptional("blockSize")

            /**
             * When credits are granted
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun creditGrantCadence(): Optional<CreditGrantCadence> =
                creditGrantCadence.getOptional("creditGrantCadence")

            /**
             * Credit rate configuration for credit-based pricing
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun creditRate(): Optional<CreditRate> = creditRate.getOptional("creditRate")

            /**
             * The price amount and currency
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun price(): Optional<Price> = price.getOptional("price")

            /**
             * Tiered pricing configuration
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

            /**
             * Returns the raw JSON value of [billingPeriod].
             *
             * Unlike [billingPeriod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("billingPeriod")
            @ExcludeMissing
            fun _billingPeriod(): JsonField<BillingPeriod> = billingPeriod

            /**
             * Returns the raw JSON value of [billingCountryCode].
             *
             * Unlike [billingCountryCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billingCountryCode")
            @ExcludeMissing
            fun _billingCountryCode(): JsonField<String> = billingCountryCode

            /**
             * Returns the raw JSON value of [blockSize].
             *
             * Unlike [blockSize], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("blockSize")
            @ExcludeMissing
            fun _blockSize(): JsonField<Double> = blockSize

            /**
             * Returns the raw JSON value of [creditGrantCadence].
             *
             * Unlike [creditGrantCadence], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("creditGrantCadence")
            @ExcludeMissing
            fun _creditGrantCadence(): JsonField<CreditGrantCadence> = creditGrantCadence

            /**
             * Returns the raw JSON value of [creditRate].
             *
             * Unlike [creditRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("creditRate")
            @ExcludeMissing
            fun _creditRate(): JsonField<CreditRate> = creditRate

            /**
             * Returns the raw JSON value of [price].
             *
             * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

            /**
             * Returns the raw JSON value of [tiers].
             *
             * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

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
                 * Returns a mutable builder for constructing an instance of [PricePeriod].
                 *
                 * The following fields are required:
                 * ```java
                 * .billingPeriod()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PricePeriod]. */
            class Builder internal constructor() {

                private var billingPeriod: JsonField<BillingPeriod>? = null
                private var billingCountryCode: JsonField<String> = JsonMissing.of()
                private var blockSize: JsonField<Double> = JsonMissing.of()
                private var creditGrantCadence: JsonField<CreditGrantCadence> = JsonMissing.of()
                private var creditRate: JsonField<CreditRate> = JsonMissing.of()
                private var price: JsonField<Price> = JsonMissing.of()
                private var tiers: JsonField<MutableList<Tier>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pricePeriod: PricePeriod) = apply {
                    billingPeriod = pricePeriod.billingPeriod
                    billingCountryCode = pricePeriod.billingCountryCode
                    blockSize = pricePeriod.blockSize
                    creditGrantCadence = pricePeriod.creditGrantCadence
                    creditRate = pricePeriod.creditRate
                    price = pricePeriod.price
                    tiers = pricePeriod.tiers.map { it.toMutableList() }
                    additionalProperties = pricePeriod.additionalProperties.toMutableMap()
                }

                /** The billing period (MONTHLY or ANNUALLY) */
                fun billingPeriod(billingPeriod: BillingPeriod) =
                    billingPeriod(JsonField.of(billingPeriod))

                /**
                 * Sets [Builder.billingPeriod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingPeriod] with a well-typed [BillingPeriod]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billingPeriod(billingPeriod: JsonField<BillingPeriod>) = apply {
                    this.billingPeriod = billingPeriod
                }

                /** ISO country code for localized pricing */
                fun billingCountryCode(billingCountryCode: String) =
                    billingCountryCode(JsonField.of(billingCountryCode))

                /**
                 * Sets [Builder.billingCountryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingCountryCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billingCountryCode(billingCountryCode: JsonField<String>) = apply {
                    this.billingCountryCode = billingCountryCode
                }

                /** Block size for usage-based pricing */
                fun blockSize(blockSize: Double) = blockSize(JsonField.of(blockSize))

                /**
                 * Sets [Builder.blockSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blockSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blockSize(blockSize: JsonField<Double>) = apply { this.blockSize = blockSize }

                /** When credits are granted */
                fun creditGrantCadence(creditGrantCadence: CreditGrantCadence) =
                    creditGrantCadence(JsonField.of(creditGrantCadence))

                /**
                 * Sets [Builder.creditGrantCadence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditGrantCadence] with a well-typed
                 * [CreditGrantCadence] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun creditGrantCadence(creditGrantCadence: JsonField<CreditGrantCadence>) = apply {
                    this.creditGrantCadence = creditGrantCadence
                }

                /** Credit rate configuration for credit-based pricing */
                fun creditRate(creditRate: CreditRate) = creditRate(JsonField.of(creditRate))

                /**
                 * Sets [Builder.creditRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditRate] with a well-typed [CreditRate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditRate(creditRate: JsonField<CreditRate>) = apply {
                    this.creditRate = creditRate
                }

                /** The price amount and currency */
                fun price(price: Price) = price(JsonField.of(price))

                /**
                 * Sets [Builder.price] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.price] with a well-typed [Price] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun price(price: JsonField<Price>) = apply { this.price = price }

                /** Tiered pricing configuration */
                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                /**
                 * Sets [Builder.tiers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tiers(tiers: JsonField<List<Tier>>) = apply {
                    this.tiers = tiers.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Tier] to [tiers].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTier(tier: Tier) = apply {
                    tiers =
                        (tiers ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tiers", it).add(tier)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PricePeriod].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .billingPeriod()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PricePeriod =
                    PricePeriod(
                        checkRequired("billingPeriod", billingPeriod),
                        billingCountryCode,
                        blockSize,
                        creditGrantCadence,
                        creditRate,
                        price,
                        (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PricePeriod = apply {
                if (validated) {
                    return@apply
                }

                billingPeriod().validate()
                billingCountryCode()
                blockSize()
                creditGrantCadence().ifPresent { it.validate() }
                creditRate().ifPresent { it.validate() }
                price().ifPresent { it.validate() }
                tiers().ifPresent { it.forEach { it.validate() } }
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
                (billingPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (billingCountryCode.asKnown().isPresent) 1 else 0) +
                    (if (blockSize.asKnown().isPresent) 1 else 0) +
                    (creditGrantCadence.asKnown().getOrNull()?.validity() ?: 0) +
                    (creditRate.asKnown().getOrNull()?.validity() ?: 0) +
                    (price.asKnown().getOrNull()?.validity() ?: 0) +
                    (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** The billing period (MONTHLY or ANNUALLY) */
            class BillingPeriod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MONTHLY = of("MONTHLY")

                    @JvmField val ANNUALLY = of("ANNUALLY")

                    @JvmStatic fun of(value: String) = BillingPeriod(JsonField.of(value))
                }

                /** An enum containing [BillingPeriod]'s known values. */
                enum class Known {
                    MONTHLY,
                    ANNUALLY,
                }

                /**
                 * An enum containing [BillingPeriod]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [BillingPeriod] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONTHLY,
                    ANNUALLY,
                    /**
                     * An enum member indicating that [BillingPeriod] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MONTHLY -> Value.MONTHLY
                        ANNUALLY -> Value.ANNUALLY
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
                        MONTHLY -> Known.MONTHLY
                        ANNUALLY -> Known.ANNUALLY
                        else -> throw StiggInvalidDataException("Unknown BillingPeriod: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StiggInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): BillingPeriod = apply {
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

                    return other is BillingPeriod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** When credits are granted */
            class CreditGrantCadence
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BEGINNING_OF_BILLING_PERIOD = of("BEGINNING_OF_BILLING_PERIOD")

                    @JvmField val MONTHLY = of("MONTHLY")

                    @JvmStatic fun of(value: String) = CreditGrantCadence(JsonField.of(value))
                }

                /** An enum containing [CreditGrantCadence]'s known values. */
                enum class Known {
                    BEGINNING_OF_BILLING_PERIOD,
                    MONTHLY,
                }

                /**
                 * An enum containing [CreditGrantCadence]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [CreditGrantCadence] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BEGINNING_OF_BILLING_PERIOD,
                    MONTHLY,
                    /**
                     * An enum member indicating that [CreditGrantCadence] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BEGINNING_OF_BILLING_PERIOD -> Value.BEGINNING_OF_BILLING_PERIOD
                        MONTHLY -> Value.MONTHLY
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
                        BEGINNING_OF_BILLING_PERIOD -> Known.BEGINNING_OF_BILLING_PERIOD
                        MONTHLY -> Known.MONTHLY
                        else ->
                            throw StiggInvalidDataException("Unknown CreditGrantCadence: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StiggInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): CreditGrantCadence = apply {
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

                    return other is CreditGrantCadence && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Credit rate configuration for credit-based pricing */
            class CreditRate
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val currencyId: JsonField<String>,
                private val costFormula: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("currencyId")
                    @ExcludeMissing
                    currencyId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("costFormula")
                    @ExcludeMissing
                    costFormula: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currencyId, costFormula, mutableMapOf())

                /**
                 * The credit rate amount
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * The custom currency ID
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currencyId(): String = currencyId.getRequired("currencyId")

                /**
                 * Optional cost formula expression
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun costFormula(): Optional<String> = costFormula.getOptional("costFormula")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [currencyId].
                 *
                 * Unlike [currencyId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("currencyId")
                @ExcludeMissing
                fun _currencyId(): JsonField<String> = currencyId

                /**
                 * Returns the raw JSON value of [costFormula].
                 *
                 * Unlike [costFormula], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("costFormula")
                @ExcludeMissing
                fun _costFormula(): JsonField<String> = costFormula

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
                     * Returns a mutable builder for constructing an instance of [CreditRate].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currencyId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CreditRate]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var currencyId: JsonField<String>? = null
                    private var costFormula: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditRate: CreditRate) = apply {
                        amount = creditRate.amount
                        currencyId = creditRate.currencyId
                        costFormula = creditRate.costFormula
                        additionalProperties = creditRate.additionalProperties.toMutableMap()
                    }

                    /** The credit rate amount */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The custom currency ID */
                    fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

                    /**
                     * Sets [Builder.currencyId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currencyId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currencyId(currencyId: JsonField<String>) = apply {
                        this.currencyId = currencyId
                    }

                    /** Optional cost formula expression */
                    fun costFormula(costFormula: String) = costFormula(JsonField.of(costFormula))

                    /**
                     * Sets [Builder.costFormula] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.costFormula] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun costFormula(costFormula: JsonField<String>) = apply {
                        this.costFormula = costFormula
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [CreditRate].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currencyId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CreditRate =
                        CreditRate(
                            checkRequired("amount", amount),
                            checkRequired("currencyId", currencyId),
                            costFormula,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CreditRate = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currencyId()
                    costFormula()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currencyId.asKnown().isPresent) 1 else 0) +
                        (if (costFormula.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditRate &&
                        amount == other.amount &&
                        currencyId == other.currencyId &&
                        costFormula == other.costFormula &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currencyId, costFormula, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CreditRate{amount=$amount, currencyId=$currencyId, costFormula=$costFormula, additionalProperties=$additionalProperties}"
            }

            /** The price amount and currency */
            class Price
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val currency: JsonField<Currency>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<Currency> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * The price amount
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * The price currency
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun currency(): Optional<Currency> = currency.getOptional("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<Currency> = currency

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
                     * Returns a mutable builder for constructing an instance of [Price].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Price]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(price: Price) = apply {
                        amount = price.amount
                        currency = price.currency
                        additionalProperties = price.additionalProperties.toMutableMap()
                    }

                    /** The price amount */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The price currency */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [Currency] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Price].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Price =
                        Price(
                            checkRequired("amount", amount),
                            currency,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Price = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency().ifPresent { it.validate() }
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (currency.asKnown().getOrNull()?.validity() ?: 0)

                /** The price currency */
                class Currency
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val USD = of("usd")

                        @JvmField val AED = of("aed")

                        @JvmField val ALL = of("all")

                        @JvmField val AMD = of("amd")

                        @JvmField val ANG = of("ang")

                        @JvmField val AUD = of("aud")

                        @JvmField val AWG = of("awg")

                        @JvmField val AZN = of("azn")

                        @JvmField val BAM = of("bam")

                        @JvmField val BBD = of("bbd")

                        @JvmField val BDT = of("bdt")

                        @JvmField val BGN = of("bgn")

                        @JvmField val BIF = of("bif")

                        @JvmField val BMD = of("bmd")

                        @JvmField val BND = of("bnd")

                        @JvmField val BSD = of("bsd")

                        @JvmField val BWP = of("bwp")

                        @JvmField val BYN = of("byn")

                        @JvmField val BZD = of("bzd")

                        @JvmField val BRL = of("brl")

                        @JvmField val CAD = of("cad")

                        @JvmField val CDF = of("cdf")

                        @JvmField val CHF = of("chf")

                        @JvmField val CNY = of("cny")

                        @JvmField val CZK = of("czk")

                        @JvmField val DKK = of("dkk")

                        @JvmField val DOP = of("dop")

                        @JvmField val DZD = of("dzd")

                        @JvmField val EGP = of("egp")

                        @JvmField val ETB = of("etb")

                        @JvmField val EUR = of("eur")

                        @JvmField val FJD = of("fjd")

                        @JvmField val GBP = of("gbp")

                        @JvmField val GEL = of("gel")

                        @JvmField val GIP = of("gip")

                        @JvmField val GMD = of("gmd")

                        @JvmField val GYD = of("gyd")

                        @JvmField val HKD = of("hkd")

                        @JvmField val HRK = of("hrk")

                        @JvmField val HTG = of("htg")

                        @JvmField val IDR = of("idr")

                        @JvmField val ILS = of("ils")

                        @JvmField val INR = of("inr")

                        @JvmField val ISK = of("isk")

                        @JvmField val JMD = of("jmd")

                        @JvmField val JPY = of("jpy")

                        @JvmField val KES = of("kes")

                        @JvmField val KGS = of("kgs")

                        @JvmField val KHR = of("khr")

                        @JvmField val KMF = of("kmf")

                        @JvmField val KRW = of("krw")

                        @JvmField val KYD = of("kyd")

                        @JvmField val KZT = of("kzt")

                        @JvmField val LBP = of("lbp")

                        @JvmField val LKR = of("lkr")

                        @JvmField val LRD = of("lrd")

                        @JvmField val LSL = of("lsl")

                        @JvmField val MAD = of("mad")

                        @JvmField val MDL = of("mdl")

                        @JvmField val MGA = of("mga")

                        @JvmField val MKD = of("mkd")

                        @JvmField val MMK = of("mmk")

                        @JvmField val MNT = of("mnt")

                        @JvmField val MOP = of("mop")

                        @JvmField val MRO = of("mro")

                        @JvmField val MVR = of("mvr")

                        @JvmField val MWK = of("mwk")

                        @JvmField val MXN = of("mxn")

                        @JvmField val MYR = of("myr")

                        @JvmField val MZN = of("mzn")

                        @JvmField val NAD = of("nad")

                        @JvmField val NGN = of("ngn")

                        @JvmField val NOK = of("nok")

                        @JvmField val NPR = of("npr")

                        @JvmField val NZD = of("nzd")

                        @JvmField val PGK = of("pgk")

                        @JvmField val PHP = of("php")

                        @JvmField val PKR = of("pkr")

                        @JvmField val PLN = of("pln")

                        @JvmField val QAR = of("qar")

                        @JvmField val RON = of("ron")

                        @JvmField val RSD = of("rsd")

                        @JvmField val RUB = of("rub")

                        @JvmField val RWF = of("rwf")

                        @JvmField val SAR = of("sar")

                        @JvmField val SBD = of("sbd")

                        @JvmField val SCR = of("scr")

                        @JvmField val SEK = of("sek")

                        @JvmField val SGD = of("sgd")

                        @JvmField val SLE = of("sle")

                        @JvmField val SLL = of("sll")

                        @JvmField val SOS = of("sos")

                        @JvmField val SZL = of("szl")

                        @JvmField val THB = of("thb")

                        @JvmField val TJS = of("tjs")

                        @JvmField val TOP = of("top")

                        @JvmField val TRY = of("try")

                        @JvmField val TTD = of("ttd")

                        @JvmField val TZS = of("tzs")

                        @JvmField val UAH = of("uah")

                        @JvmField val UZS = of("uzs")

                        @JvmField val VND = of("vnd")

                        @JvmField val VUV = of("vuv")

                        @JvmField val WST = of("wst")

                        @JvmField val XAF = of("xaf")

                        @JvmField val XCD = of("xcd")

                        @JvmField val YER = of("yer")

                        @JvmField val ZAR = of("zar")

                        @JvmField val ZMW = of("zmw")

                        @JvmField val CLP = of("clp")

                        @JvmField val DJF = of("djf")

                        @JvmField val GNF = of("gnf")

                        @JvmField val UGX = of("ugx")

                        @JvmField val PYG = of("pyg")

                        @JvmField val XOF = of("xof")

                        @JvmField val XPF = of("xpf")

                        @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                    }

                    /** An enum containing [Currency]'s known values. */
                    enum class Known {
                        USD,
                        AED,
                        ALL,
                        AMD,
                        ANG,
                        AUD,
                        AWG,
                        AZN,
                        BAM,
                        BBD,
                        BDT,
                        BGN,
                        BIF,
                        BMD,
                        BND,
                        BSD,
                        BWP,
                        BYN,
                        BZD,
                        BRL,
                        CAD,
                        CDF,
                        CHF,
                        CNY,
                        CZK,
                        DKK,
                        DOP,
                        DZD,
                        EGP,
                        ETB,
                        EUR,
                        FJD,
                        GBP,
                        GEL,
                        GIP,
                        GMD,
                        GYD,
                        HKD,
                        HRK,
                        HTG,
                        IDR,
                        ILS,
                        INR,
                        ISK,
                        JMD,
                        JPY,
                        KES,
                        KGS,
                        KHR,
                        KMF,
                        KRW,
                        KYD,
                        KZT,
                        LBP,
                        LKR,
                        LRD,
                        LSL,
                        MAD,
                        MDL,
                        MGA,
                        MKD,
                        MMK,
                        MNT,
                        MOP,
                        MRO,
                        MVR,
                        MWK,
                        MXN,
                        MYR,
                        MZN,
                        NAD,
                        NGN,
                        NOK,
                        NPR,
                        NZD,
                        PGK,
                        PHP,
                        PKR,
                        PLN,
                        QAR,
                        RON,
                        RSD,
                        RUB,
                        RWF,
                        SAR,
                        SBD,
                        SCR,
                        SEK,
                        SGD,
                        SLE,
                        SLL,
                        SOS,
                        SZL,
                        THB,
                        TJS,
                        TOP,
                        TRY,
                        TTD,
                        TZS,
                        UAH,
                        UZS,
                        VND,
                        VUV,
                        WST,
                        XAF,
                        XCD,
                        YER,
                        ZAR,
                        ZMW,
                        CLP,
                        DJF,
                        GNF,
                        UGX,
                        PYG,
                        XOF,
                        XPF,
                    }

                    /**
                     * An enum containing [Currency]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Currency] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        USD,
                        AED,
                        ALL,
                        AMD,
                        ANG,
                        AUD,
                        AWG,
                        AZN,
                        BAM,
                        BBD,
                        BDT,
                        BGN,
                        BIF,
                        BMD,
                        BND,
                        BSD,
                        BWP,
                        BYN,
                        BZD,
                        BRL,
                        CAD,
                        CDF,
                        CHF,
                        CNY,
                        CZK,
                        DKK,
                        DOP,
                        DZD,
                        EGP,
                        ETB,
                        EUR,
                        FJD,
                        GBP,
                        GEL,
                        GIP,
                        GMD,
                        GYD,
                        HKD,
                        HRK,
                        HTG,
                        IDR,
                        ILS,
                        INR,
                        ISK,
                        JMD,
                        JPY,
                        KES,
                        KGS,
                        KHR,
                        KMF,
                        KRW,
                        KYD,
                        KZT,
                        LBP,
                        LKR,
                        LRD,
                        LSL,
                        MAD,
                        MDL,
                        MGA,
                        MKD,
                        MMK,
                        MNT,
                        MOP,
                        MRO,
                        MVR,
                        MWK,
                        MXN,
                        MYR,
                        MZN,
                        NAD,
                        NGN,
                        NOK,
                        NPR,
                        NZD,
                        PGK,
                        PHP,
                        PKR,
                        PLN,
                        QAR,
                        RON,
                        RSD,
                        RUB,
                        RWF,
                        SAR,
                        SBD,
                        SCR,
                        SEK,
                        SGD,
                        SLE,
                        SLL,
                        SOS,
                        SZL,
                        THB,
                        TJS,
                        TOP,
                        TRY,
                        TTD,
                        TZS,
                        UAH,
                        UZS,
                        VND,
                        VUV,
                        WST,
                        XAF,
                        XCD,
                        YER,
                        ZAR,
                        ZMW,
                        CLP,
                        DJF,
                        GNF,
                        UGX,
                        PYG,
                        XOF,
                        XPF,
                        /**
                         * An enum member indicating that [Currency] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            USD -> Value.USD
                            AED -> Value.AED
                            ALL -> Value.ALL
                            AMD -> Value.AMD
                            ANG -> Value.ANG
                            AUD -> Value.AUD
                            AWG -> Value.AWG
                            AZN -> Value.AZN
                            BAM -> Value.BAM
                            BBD -> Value.BBD
                            BDT -> Value.BDT
                            BGN -> Value.BGN
                            BIF -> Value.BIF
                            BMD -> Value.BMD
                            BND -> Value.BND
                            BSD -> Value.BSD
                            BWP -> Value.BWP
                            BYN -> Value.BYN
                            BZD -> Value.BZD
                            BRL -> Value.BRL
                            CAD -> Value.CAD
                            CDF -> Value.CDF
                            CHF -> Value.CHF
                            CNY -> Value.CNY
                            CZK -> Value.CZK
                            DKK -> Value.DKK
                            DOP -> Value.DOP
                            DZD -> Value.DZD
                            EGP -> Value.EGP
                            ETB -> Value.ETB
                            EUR -> Value.EUR
                            FJD -> Value.FJD
                            GBP -> Value.GBP
                            GEL -> Value.GEL
                            GIP -> Value.GIP
                            GMD -> Value.GMD
                            GYD -> Value.GYD
                            HKD -> Value.HKD
                            HRK -> Value.HRK
                            HTG -> Value.HTG
                            IDR -> Value.IDR
                            ILS -> Value.ILS
                            INR -> Value.INR
                            ISK -> Value.ISK
                            JMD -> Value.JMD
                            JPY -> Value.JPY
                            KES -> Value.KES
                            KGS -> Value.KGS
                            KHR -> Value.KHR
                            KMF -> Value.KMF
                            KRW -> Value.KRW
                            KYD -> Value.KYD
                            KZT -> Value.KZT
                            LBP -> Value.LBP
                            LKR -> Value.LKR
                            LRD -> Value.LRD
                            LSL -> Value.LSL
                            MAD -> Value.MAD
                            MDL -> Value.MDL
                            MGA -> Value.MGA
                            MKD -> Value.MKD
                            MMK -> Value.MMK
                            MNT -> Value.MNT
                            MOP -> Value.MOP
                            MRO -> Value.MRO
                            MVR -> Value.MVR
                            MWK -> Value.MWK
                            MXN -> Value.MXN
                            MYR -> Value.MYR
                            MZN -> Value.MZN
                            NAD -> Value.NAD
                            NGN -> Value.NGN
                            NOK -> Value.NOK
                            NPR -> Value.NPR
                            NZD -> Value.NZD
                            PGK -> Value.PGK
                            PHP -> Value.PHP
                            PKR -> Value.PKR
                            PLN -> Value.PLN
                            QAR -> Value.QAR
                            RON -> Value.RON
                            RSD -> Value.RSD
                            RUB -> Value.RUB
                            RWF -> Value.RWF
                            SAR -> Value.SAR
                            SBD -> Value.SBD
                            SCR -> Value.SCR
                            SEK -> Value.SEK
                            SGD -> Value.SGD
                            SLE -> Value.SLE
                            SLL -> Value.SLL
                            SOS -> Value.SOS
                            SZL -> Value.SZL
                            THB -> Value.THB
                            TJS -> Value.TJS
                            TOP -> Value.TOP
                            TRY -> Value.TRY
                            TTD -> Value.TTD
                            TZS -> Value.TZS
                            UAH -> Value.UAH
                            UZS -> Value.UZS
                            VND -> Value.VND
                            VUV -> Value.VUV
                            WST -> Value.WST
                            XAF -> Value.XAF
                            XCD -> Value.XCD
                            YER -> Value.YER
                            ZAR -> Value.ZAR
                            ZMW -> Value.ZMW
                            CLP -> Value.CLP
                            DJF -> Value.DJF
                            GNF -> Value.GNF
                            UGX -> Value.UGX
                            PYG -> Value.PYG
                            XOF -> Value.XOF
                            XPF -> Value.XPF
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws StiggInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            USD -> Known.USD
                            AED -> Known.AED
                            ALL -> Known.ALL
                            AMD -> Known.AMD
                            ANG -> Known.ANG
                            AUD -> Known.AUD
                            AWG -> Known.AWG
                            AZN -> Known.AZN
                            BAM -> Known.BAM
                            BBD -> Known.BBD
                            BDT -> Known.BDT
                            BGN -> Known.BGN
                            BIF -> Known.BIF
                            BMD -> Known.BMD
                            BND -> Known.BND
                            BSD -> Known.BSD
                            BWP -> Known.BWP
                            BYN -> Known.BYN
                            BZD -> Known.BZD
                            BRL -> Known.BRL
                            CAD -> Known.CAD
                            CDF -> Known.CDF
                            CHF -> Known.CHF
                            CNY -> Known.CNY
                            CZK -> Known.CZK
                            DKK -> Known.DKK
                            DOP -> Known.DOP
                            DZD -> Known.DZD
                            EGP -> Known.EGP
                            ETB -> Known.ETB
                            EUR -> Known.EUR
                            FJD -> Known.FJD
                            GBP -> Known.GBP
                            GEL -> Known.GEL
                            GIP -> Known.GIP
                            GMD -> Known.GMD
                            GYD -> Known.GYD
                            HKD -> Known.HKD
                            HRK -> Known.HRK
                            HTG -> Known.HTG
                            IDR -> Known.IDR
                            ILS -> Known.ILS
                            INR -> Known.INR
                            ISK -> Known.ISK
                            JMD -> Known.JMD
                            JPY -> Known.JPY
                            KES -> Known.KES
                            KGS -> Known.KGS
                            KHR -> Known.KHR
                            KMF -> Known.KMF
                            KRW -> Known.KRW
                            KYD -> Known.KYD
                            KZT -> Known.KZT
                            LBP -> Known.LBP
                            LKR -> Known.LKR
                            LRD -> Known.LRD
                            LSL -> Known.LSL
                            MAD -> Known.MAD
                            MDL -> Known.MDL
                            MGA -> Known.MGA
                            MKD -> Known.MKD
                            MMK -> Known.MMK
                            MNT -> Known.MNT
                            MOP -> Known.MOP
                            MRO -> Known.MRO
                            MVR -> Known.MVR
                            MWK -> Known.MWK
                            MXN -> Known.MXN
                            MYR -> Known.MYR
                            MZN -> Known.MZN
                            NAD -> Known.NAD
                            NGN -> Known.NGN
                            NOK -> Known.NOK
                            NPR -> Known.NPR
                            NZD -> Known.NZD
                            PGK -> Known.PGK
                            PHP -> Known.PHP
                            PKR -> Known.PKR
                            PLN -> Known.PLN
                            QAR -> Known.QAR
                            RON -> Known.RON
                            RSD -> Known.RSD
                            RUB -> Known.RUB
                            RWF -> Known.RWF
                            SAR -> Known.SAR
                            SBD -> Known.SBD
                            SCR -> Known.SCR
                            SEK -> Known.SEK
                            SGD -> Known.SGD
                            SLE -> Known.SLE
                            SLL -> Known.SLL
                            SOS -> Known.SOS
                            SZL -> Known.SZL
                            THB -> Known.THB
                            TJS -> Known.TJS
                            TOP -> Known.TOP
                            TRY -> Known.TRY
                            TTD -> Known.TTD
                            TZS -> Known.TZS
                            UAH -> Known.UAH
                            UZS -> Known.UZS
                            VND -> Known.VND
                            VUV -> Known.VUV
                            WST -> Known.WST
                            XAF -> Known.XAF
                            XCD -> Known.XCD
                            YER -> Known.YER
                            ZAR -> Known.ZAR
                            ZMW -> Known.ZMW
                            CLP -> Known.CLP
                            DJF -> Known.DJF
                            GNF -> Known.GNF
                            UGX -> Known.UGX
                            PYG -> Known.PYG
                            XOF -> Known.XOF
                            XPF -> Known.XPF
                            else -> throw StiggInvalidDataException("Unknown Currency: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws StiggInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            StiggInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Currency = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Currency && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Price &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Price{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /** A tier in tiered pricing. */
            class Tier
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val flatPrice: JsonField<FlatPrice>,
                private val unitPrice: JsonField<UnitPrice>,
                private val upTo: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("flatPrice")
                    @ExcludeMissing
                    flatPrice: JsonField<FlatPrice> = JsonMissing.of(),
                    @JsonProperty("unitPrice")
                    @ExcludeMissing
                    unitPrice: JsonField<UnitPrice> = JsonMissing.of(),
                    @JsonProperty("upTo") @ExcludeMissing upTo: JsonField<Double> = JsonMissing.of(),
                ) : this(flatPrice, unitPrice, upTo, mutableMapOf())

                /**
                 * Flat price for this tier
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun flatPrice(): Optional<FlatPrice> = flatPrice.getOptional("flatPrice")

                /**
                 * Per-unit price in this tier
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun unitPrice(): Optional<UnitPrice> = unitPrice.getOptional("unitPrice")

                /**
                 * Upper bound of this tier (null for unlimited)
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun upTo(): Optional<Double> = upTo.getOptional("upTo")

                /**
                 * Returns the raw JSON value of [flatPrice].
                 *
                 * Unlike [flatPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("flatPrice")
                @ExcludeMissing
                fun _flatPrice(): JsonField<FlatPrice> = flatPrice

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unitPrice")
                @ExcludeMissing
                fun _unitPrice(): JsonField<UnitPrice> = unitPrice

                /**
                 * Returns the raw JSON value of [upTo].
                 *
                 * Unlike [upTo], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("upTo") @ExcludeMissing fun _upTo(): JsonField<Double> = upTo

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

                    /** Returns a mutable builder for constructing an instance of [Tier]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tier]. */
                class Builder internal constructor() {

                    private var flatPrice: JsonField<FlatPrice> = JsonMissing.of()
                    private var unitPrice: JsonField<UnitPrice> = JsonMissing.of()
                    private var upTo: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tier: Tier) = apply {
                        flatPrice = tier.flatPrice
                        unitPrice = tier.unitPrice
                        upTo = tier.upTo
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    /** Flat price for this tier */
                    fun flatPrice(flatPrice: FlatPrice) = flatPrice(JsonField.of(flatPrice))

                    /**
                     * Sets [Builder.flatPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.flatPrice] with a well-typed [FlatPrice]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun flatPrice(flatPrice: JsonField<FlatPrice>) = apply {
                        this.flatPrice = flatPrice
                    }

                    /** Per-unit price in this tier */
                    fun unitPrice(unitPrice: UnitPrice) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [UnitPrice]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun unitPrice(unitPrice: JsonField<UnitPrice>) = apply {
                        this.unitPrice = unitPrice
                    }

                    /** Upper bound of this tier (null for unlimited) */
                    fun upTo(upTo: Double) = upTo(JsonField.of(upTo))

                    /**
                     * Sets [Builder.upTo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.upTo] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun upTo(upTo: JsonField<Double>) = apply { this.upTo = upTo }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Tier].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Tier =
                        Tier(flatPrice, unitPrice, upTo, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Tier = apply {
                    if (validated) {
                        return@apply
                    }

                    flatPrice().ifPresent { it.validate() }
                    unitPrice().ifPresent { it.validate() }
                    upTo()
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
                    (flatPrice.asKnown().getOrNull()?.validity() ?: 0) +
                        (unitPrice.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (upTo.asKnown().isPresent) 1 else 0)

                /** Flat price for this tier */
                class FlatPrice
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Double>,
                    private val currency: JsonField<Currency>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<Currency> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The price amount
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Double = amount.getRequired("amount")

                    /**
                     * The price currency
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun currency(): Optional<Currency> = currency.getOptional("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<Currency> = currency

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
                         * Returns a mutable builder for constructing an instance of [FlatPrice].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [FlatPrice]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Double>? = null
                        private var currency: JsonField<Currency> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(flatPrice: FlatPrice) = apply {
                            amount = flatPrice.amount
                            currency = flatPrice.currency
                            additionalProperties = flatPrice.additionalProperties.toMutableMap()
                        }

                        /** The price amount */
                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        /** The price currency */
                        fun currency(currency: Currency) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [Currency]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<Currency>) = apply {
                            this.currency = currency
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [FlatPrice].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): FlatPrice =
                            FlatPrice(
                                checkRequired("amount", amount),
                                currency,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): FlatPrice = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency().ifPresent { it.validate() }
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
                        (if (amount.asKnown().isPresent) 1 else 0) +
                            (currency.asKnown().getOrNull()?.validity() ?: 0)

                    /** The price currency */
                    class Currency
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val USD = of("usd")

                            @JvmField val AED = of("aed")

                            @JvmField val ALL = of("all")

                            @JvmField val AMD = of("amd")

                            @JvmField val ANG = of("ang")

                            @JvmField val AUD = of("aud")

                            @JvmField val AWG = of("awg")

                            @JvmField val AZN = of("azn")

                            @JvmField val BAM = of("bam")

                            @JvmField val BBD = of("bbd")

                            @JvmField val BDT = of("bdt")

                            @JvmField val BGN = of("bgn")

                            @JvmField val BIF = of("bif")

                            @JvmField val BMD = of("bmd")

                            @JvmField val BND = of("bnd")

                            @JvmField val BSD = of("bsd")

                            @JvmField val BWP = of("bwp")

                            @JvmField val BYN = of("byn")

                            @JvmField val BZD = of("bzd")

                            @JvmField val BRL = of("brl")

                            @JvmField val CAD = of("cad")

                            @JvmField val CDF = of("cdf")

                            @JvmField val CHF = of("chf")

                            @JvmField val CNY = of("cny")

                            @JvmField val CZK = of("czk")

                            @JvmField val DKK = of("dkk")

                            @JvmField val DOP = of("dop")

                            @JvmField val DZD = of("dzd")

                            @JvmField val EGP = of("egp")

                            @JvmField val ETB = of("etb")

                            @JvmField val EUR = of("eur")

                            @JvmField val FJD = of("fjd")

                            @JvmField val GBP = of("gbp")

                            @JvmField val GEL = of("gel")

                            @JvmField val GIP = of("gip")

                            @JvmField val GMD = of("gmd")

                            @JvmField val GYD = of("gyd")

                            @JvmField val HKD = of("hkd")

                            @JvmField val HRK = of("hrk")

                            @JvmField val HTG = of("htg")

                            @JvmField val IDR = of("idr")

                            @JvmField val ILS = of("ils")

                            @JvmField val INR = of("inr")

                            @JvmField val ISK = of("isk")

                            @JvmField val JMD = of("jmd")

                            @JvmField val JPY = of("jpy")

                            @JvmField val KES = of("kes")

                            @JvmField val KGS = of("kgs")

                            @JvmField val KHR = of("khr")

                            @JvmField val KMF = of("kmf")

                            @JvmField val KRW = of("krw")

                            @JvmField val KYD = of("kyd")

                            @JvmField val KZT = of("kzt")

                            @JvmField val LBP = of("lbp")

                            @JvmField val LKR = of("lkr")

                            @JvmField val LRD = of("lrd")

                            @JvmField val LSL = of("lsl")

                            @JvmField val MAD = of("mad")

                            @JvmField val MDL = of("mdl")

                            @JvmField val MGA = of("mga")

                            @JvmField val MKD = of("mkd")

                            @JvmField val MMK = of("mmk")

                            @JvmField val MNT = of("mnt")

                            @JvmField val MOP = of("mop")

                            @JvmField val MRO = of("mro")

                            @JvmField val MVR = of("mvr")

                            @JvmField val MWK = of("mwk")

                            @JvmField val MXN = of("mxn")

                            @JvmField val MYR = of("myr")

                            @JvmField val MZN = of("mzn")

                            @JvmField val NAD = of("nad")

                            @JvmField val NGN = of("ngn")

                            @JvmField val NOK = of("nok")

                            @JvmField val NPR = of("npr")

                            @JvmField val NZD = of("nzd")

                            @JvmField val PGK = of("pgk")

                            @JvmField val PHP = of("php")

                            @JvmField val PKR = of("pkr")

                            @JvmField val PLN = of("pln")

                            @JvmField val QAR = of("qar")

                            @JvmField val RON = of("ron")

                            @JvmField val RSD = of("rsd")

                            @JvmField val RUB = of("rub")

                            @JvmField val RWF = of("rwf")

                            @JvmField val SAR = of("sar")

                            @JvmField val SBD = of("sbd")

                            @JvmField val SCR = of("scr")

                            @JvmField val SEK = of("sek")

                            @JvmField val SGD = of("sgd")

                            @JvmField val SLE = of("sle")

                            @JvmField val SLL = of("sll")

                            @JvmField val SOS = of("sos")

                            @JvmField val SZL = of("szl")

                            @JvmField val THB = of("thb")

                            @JvmField val TJS = of("tjs")

                            @JvmField val TOP = of("top")

                            @JvmField val TRY = of("try")

                            @JvmField val TTD = of("ttd")

                            @JvmField val TZS = of("tzs")

                            @JvmField val UAH = of("uah")

                            @JvmField val UZS = of("uzs")

                            @JvmField val VND = of("vnd")

                            @JvmField val VUV = of("vuv")

                            @JvmField val WST = of("wst")

                            @JvmField val XAF = of("xaf")

                            @JvmField val XCD = of("xcd")

                            @JvmField val YER = of("yer")

                            @JvmField val ZAR = of("zar")

                            @JvmField val ZMW = of("zmw")

                            @JvmField val CLP = of("clp")

                            @JvmField val DJF = of("djf")

                            @JvmField val GNF = of("gnf")

                            @JvmField val UGX = of("ugx")

                            @JvmField val PYG = of("pyg")

                            @JvmField val XOF = of("xof")

                            @JvmField val XPF = of("xpf")

                            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                        }

                        /** An enum containing [Currency]'s known values. */
                        enum class Known {
                            USD,
                            AED,
                            ALL,
                            AMD,
                            ANG,
                            AUD,
                            AWG,
                            AZN,
                            BAM,
                            BBD,
                            BDT,
                            BGN,
                            BIF,
                            BMD,
                            BND,
                            BSD,
                            BWP,
                            BYN,
                            BZD,
                            BRL,
                            CAD,
                            CDF,
                            CHF,
                            CNY,
                            CZK,
                            DKK,
                            DOP,
                            DZD,
                            EGP,
                            ETB,
                            EUR,
                            FJD,
                            GBP,
                            GEL,
                            GIP,
                            GMD,
                            GYD,
                            HKD,
                            HRK,
                            HTG,
                            IDR,
                            ILS,
                            INR,
                            ISK,
                            JMD,
                            JPY,
                            KES,
                            KGS,
                            KHR,
                            KMF,
                            KRW,
                            KYD,
                            KZT,
                            LBP,
                            LKR,
                            LRD,
                            LSL,
                            MAD,
                            MDL,
                            MGA,
                            MKD,
                            MMK,
                            MNT,
                            MOP,
                            MRO,
                            MVR,
                            MWK,
                            MXN,
                            MYR,
                            MZN,
                            NAD,
                            NGN,
                            NOK,
                            NPR,
                            NZD,
                            PGK,
                            PHP,
                            PKR,
                            PLN,
                            QAR,
                            RON,
                            RSD,
                            RUB,
                            RWF,
                            SAR,
                            SBD,
                            SCR,
                            SEK,
                            SGD,
                            SLE,
                            SLL,
                            SOS,
                            SZL,
                            THB,
                            TJS,
                            TOP,
                            TRY,
                            TTD,
                            TZS,
                            UAH,
                            UZS,
                            VND,
                            VUV,
                            WST,
                            XAF,
                            XCD,
                            YER,
                            ZAR,
                            ZMW,
                            CLP,
                            DJF,
                            GNF,
                            UGX,
                            PYG,
                            XOF,
                            XPF,
                        }

                        /**
                         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Currency] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            USD,
                            AED,
                            ALL,
                            AMD,
                            ANG,
                            AUD,
                            AWG,
                            AZN,
                            BAM,
                            BBD,
                            BDT,
                            BGN,
                            BIF,
                            BMD,
                            BND,
                            BSD,
                            BWP,
                            BYN,
                            BZD,
                            BRL,
                            CAD,
                            CDF,
                            CHF,
                            CNY,
                            CZK,
                            DKK,
                            DOP,
                            DZD,
                            EGP,
                            ETB,
                            EUR,
                            FJD,
                            GBP,
                            GEL,
                            GIP,
                            GMD,
                            GYD,
                            HKD,
                            HRK,
                            HTG,
                            IDR,
                            ILS,
                            INR,
                            ISK,
                            JMD,
                            JPY,
                            KES,
                            KGS,
                            KHR,
                            KMF,
                            KRW,
                            KYD,
                            KZT,
                            LBP,
                            LKR,
                            LRD,
                            LSL,
                            MAD,
                            MDL,
                            MGA,
                            MKD,
                            MMK,
                            MNT,
                            MOP,
                            MRO,
                            MVR,
                            MWK,
                            MXN,
                            MYR,
                            MZN,
                            NAD,
                            NGN,
                            NOK,
                            NPR,
                            NZD,
                            PGK,
                            PHP,
                            PKR,
                            PLN,
                            QAR,
                            RON,
                            RSD,
                            RUB,
                            RWF,
                            SAR,
                            SBD,
                            SCR,
                            SEK,
                            SGD,
                            SLE,
                            SLL,
                            SOS,
                            SZL,
                            THB,
                            TJS,
                            TOP,
                            TRY,
                            TTD,
                            TZS,
                            UAH,
                            UZS,
                            VND,
                            VUV,
                            WST,
                            XAF,
                            XCD,
                            YER,
                            ZAR,
                            ZMW,
                            CLP,
                            DJF,
                            GNF,
                            UGX,
                            PYG,
                            XOF,
                            XPF,
                            /**
                             * An enum member indicating that [Currency] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                USD -> Value.USD
                                AED -> Value.AED
                                ALL -> Value.ALL
                                AMD -> Value.AMD
                                ANG -> Value.ANG
                                AUD -> Value.AUD
                                AWG -> Value.AWG
                                AZN -> Value.AZN
                                BAM -> Value.BAM
                                BBD -> Value.BBD
                                BDT -> Value.BDT
                                BGN -> Value.BGN
                                BIF -> Value.BIF
                                BMD -> Value.BMD
                                BND -> Value.BND
                                BSD -> Value.BSD
                                BWP -> Value.BWP
                                BYN -> Value.BYN
                                BZD -> Value.BZD
                                BRL -> Value.BRL
                                CAD -> Value.CAD
                                CDF -> Value.CDF
                                CHF -> Value.CHF
                                CNY -> Value.CNY
                                CZK -> Value.CZK
                                DKK -> Value.DKK
                                DOP -> Value.DOP
                                DZD -> Value.DZD
                                EGP -> Value.EGP
                                ETB -> Value.ETB
                                EUR -> Value.EUR
                                FJD -> Value.FJD
                                GBP -> Value.GBP
                                GEL -> Value.GEL
                                GIP -> Value.GIP
                                GMD -> Value.GMD
                                GYD -> Value.GYD
                                HKD -> Value.HKD
                                HRK -> Value.HRK
                                HTG -> Value.HTG
                                IDR -> Value.IDR
                                ILS -> Value.ILS
                                INR -> Value.INR
                                ISK -> Value.ISK
                                JMD -> Value.JMD
                                JPY -> Value.JPY
                                KES -> Value.KES
                                KGS -> Value.KGS
                                KHR -> Value.KHR
                                KMF -> Value.KMF
                                KRW -> Value.KRW
                                KYD -> Value.KYD
                                KZT -> Value.KZT
                                LBP -> Value.LBP
                                LKR -> Value.LKR
                                LRD -> Value.LRD
                                LSL -> Value.LSL
                                MAD -> Value.MAD
                                MDL -> Value.MDL
                                MGA -> Value.MGA
                                MKD -> Value.MKD
                                MMK -> Value.MMK
                                MNT -> Value.MNT
                                MOP -> Value.MOP
                                MRO -> Value.MRO
                                MVR -> Value.MVR
                                MWK -> Value.MWK
                                MXN -> Value.MXN
                                MYR -> Value.MYR
                                MZN -> Value.MZN
                                NAD -> Value.NAD
                                NGN -> Value.NGN
                                NOK -> Value.NOK
                                NPR -> Value.NPR
                                NZD -> Value.NZD
                                PGK -> Value.PGK
                                PHP -> Value.PHP
                                PKR -> Value.PKR
                                PLN -> Value.PLN
                                QAR -> Value.QAR
                                RON -> Value.RON
                                RSD -> Value.RSD
                                RUB -> Value.RUB
                                RWF -> Value.RWF
                                SAR -> Value.SAR
                                SBD -> Value.SBD
                                SCR -> Value.SCR
                                SEK -> Value.SEK
                                SGD -> Value.SGD
                                SLE -> Value.SLE
                                SLL -> Value.SLL
                                SOS -> Value.SOS
                                SZL -> Value.SZL
                                THB -> Value.THB
                                TJS -> Value.TJS
                                TOP -> Value.TOP
                                TRY -> Value.TRY
                                TTD -> Value.TTD
                                TZS -> Value.TZS
                                UAH -> Value.UAH
                                UZS -> Value.UZS
                                VND -> Value.VND
                                VUV -> Value.VUV
                                WST -> Value.WST
                                XAF -> Value.XAF
                                XCD -> Value.XCD
                                YER -> Value.YER
                                ZAR -> Value.ZAR
                                ZMW -> Value.ZMW
                                CLP -> Value.CLP
                                DJF -> Value.DJF
                                GNF -> Value.GNF
                                UGX -> Value.UGX
                                PYG -> Value.PYG
                                XOF -> Value.XOF
                                XPF -> Value.XPF
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws StiggInvalidDataException if this class instance's value is a not
                         *   a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                USD -> Known.USD
                                AED -> Known.AED
                                ALL -> Known.ALL
                                AMD -> Known.AMD
                                ANG -> Known.ANG
                                AUD -> Known.AUD
                                AWG -> Known.AWG
                                AZN -> Known.AZN
                                BAM -> Known.BAM
                                BBD -> Known.BBD
                                BDT -> Known.BDT
                                BGN -> Known.BGN
                                BIF -> Known.BIF
                                BMD -> Known.BMD
                                BND -> Known.BND
                                BSD -> Known.BSD
                                BWP -> Known.BWP
                                BYN -> Known.BYN
                                BZD -> Known.BZD
                                BRL -> Known.BRL
                                CAD -> Known.CAD
                                CDF -> Known.CDF
                                CHF -> Known.CHF
                                CNY -> Known.CNY
                                CZK -> Known.CZK
                                DKK -> Known.DKK
                                DOP -> Known.DOP
                                DZD -> Known.DZD
                                EGP -> Known.EGP
                                ETB -> Known.ETB
                                EUR -> Known.EUR
                                FJD -> Known.FJD
                                GBP -> Known.GBP
                                GEL -> Known.GEL
                                GIP -> Known.GIP
                                GMD -> Known.GMD
                                GYD -> Known.GYD
                                HKD -> Known.HKD
                                HRK -> Known.HRK
                                HTG -> Known.HTG
                                IDR -> Known.IDR
                                ILS -> Known.ILS
                                INR -> Known.INR
                                ISK -> Known.ISK
                                JMD -> Known.JMD
                                JPY -> Known.JPY
                                KES -> Known.KES
                                KGS -> Known.KGS
                                KHR -> Known.KHR
                                KMF -> Known.KMF
                                KRW -> Known.KRW
                                KYD -> Known.KYD
                                KZT -> Known.KZT
                                LBP -> Known.LBP
                                LKR -> Known.LKR
                                LRD -> Known.LRD
                                LSL -> Known.LSL
                                MAD -> Known.MAD
                                MDL -> Known.MDL
                                MGA -> Known.MGA
                                MKD -> Known.MKD
                                MMK -> Known.MMK
                                MNT -> Known.MNT
                                MOP -> Known.MOP
                                MRO -> Known.MRO
                                MVR -> Known.MVR
                                MWK -> Known.MWK
                                MXN -> Known.MXN
                                MYR -> Known.MYR
                                MZN -> Known.MZN
                                NAD -> Known.NAD
                                NGN -> Known.NGN
                                NOK -> Known.NOK
                                NPR -> Known.NPR
                                NZD -> Known.NZD
                                PGK -> Known.PGK
                                PHP -> Known.PHP
                                PKR -> Known.PKR
                                PLN -> Known.PLN
                                QAR -> Known.QAR
                                RON -> Known.RON
                                RSD -> Known.RSD
                                RUB -> Known.RUB
                                RWF -> Known.RWF
                                SAR -> Known.SAR
                                SBD -> Known.SBD
                                SCR -> Known.SCR
                                SEK -> Known.SEK
                                SGD -> Known.SGD
                                SLE -> Known.SLE
                                SLL -> Known.SLL
                                SOS -> Known.SOS
                                SZL -> Known.SZL
                                THB -> Known.THB
                                TJS -> Known.TJS
                                TOP -> Known.TOP
                                TRY -> Known.TRY
                                TTD -> Known.TTD
                                TZS -> Known.TZS
                                UAH -> Known.UAH
                                UZS -> Known.UZS
                                VND -> Known.VND
                                VUV -> Known.VUV
                                WST -> Known.WST
                                XAF -> Known.XAF
                                XCD -> Known.XCD
                                YER -> Known.YER
                                ZAR -> Known.ZAR
                                ZMW -> Known.ZMW
                                CLP -> Known.CLP
                                DJF -> Known.DJF
                                GNF -> Known.GNF
                                UGX -> Known.UGX
                                PYG -> Known.PYG
                                XOF -> Known.XOF
                                XPF -> Known.XPF
                                else -> throw StiggInvalidDataException("Unknown Currency: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws StiggInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                StiggInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Currency = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Currency && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is FlatPrice &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "FlatPrice{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                /** Per-unit price in this tier */
                class UnitPrice
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Double>,
                    private val currency: JsonField<Currency>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<Currency> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The price amount
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Double = amount.getRequired("amount")

                    /**
                     * The price currency
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun currency(): Optional<Currency> = currency.getOptional("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<Currency> = currency

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
                         * Returns a mutable builder for constructing an instance of [UnitPrice].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [UnitPrice]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Double>? = null
                        private var currency: JsonField<Currency> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unitPrice: UnitPrice) = apply {
                            amount = unitPrice.amount
                            currency = unitPrice.currency
                            additionalProperties = unitPrice.additionalProperties.toMutableMap()
                        }

                        /** The price amount */
                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        /** The price currency */
                        fun currency(currency: Currency) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [Currency]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<Currency>) = apply {
                            this.currency = currency
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [UnitPrice].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): UnitPrice =
                            UnitPrice(
                                checkRequired("amount", amount),
                                currency,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): UnitPrice = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency().ifPresent { it.validate() }
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
                        (if (amount.asKnown().isPresent) 1 else 0) +
                            (currency.asKnown().getOrNull()?.validity() ?: 0)

                    /** The price currency */
                    class Currency
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val USD = of("usd")

                            @JvmField val AED = of("aed")

                            @JvmField val ALL = of("all")

                            @JvmField val AMD = of("amd")

                            @JvmField val ANG = of("ang")

                            @JvmField val AUD = of("aud")

                            @JvmField val AWG = of("awg")

                            @JvmField val AZN = of("azn")

                            @JvmField val BAM = of("bam")

                            @JvmField val BBD = of("bbd")

                            @JvmField val BDT = of("bdt")

                            @JvmField val BGN = of("bgn")

                            @JvmField val BIF = of("bif")

                            @JvmField val BMD = of("bmd")

                            @JvmField val BND = of("bnd")

                            @JvmField val BSD = of("bsd")

                            @JvmField val BWP = of("bwp")

                            @JvmField val BYN = of("byn")

                            @JvmField val BZD = of("bzd")

                            @JvmField val BRL = of("brl")

                            @JvmField val CAD = of("cad")

                            @JvmField val CDF = of("cdf")

                            @JvmField val CHF = of("chf")

                            @JvmField val CNY = of("cny")

                            @JvmField val CZK = of("czk")

                            @JvmField val DKK = of("dkk")

                            @JvmField val DOP = of("dop")

                            @JvmField val DZD = of("dzd")

                            @JvmField val EGP = of("egp")

                            @JvmField val ETB = of("etb")

                            @JvmField val EUR = of("eur")

                            @JvmField val FJD = of("fjd")

                            @JvmField val GBP = of("gbp")

                            @JvmField val GEL = of("gel")

                            @JvmField val GIP = of("gip")

                            @JvmField val GMD = of("gmd")

                            @JvmField val GYD = of("gyd")

                            @JvmField val HKD = of("hkd")

                            @JvmField val HRK = of("hrk")

                            @JvmField val HTG = of("htg")

                            @JvmField val IDR = of("idr")

                            @JvmField val ILS = of("ils")

                            @JvmField val INR = of("inr")

                            @JvmField val ISK = of("isk")

                            @JvmField val JMD = of("jmd")

                            @JvmField val JPY = of("jpy")

                            @JvmField val KES = of("kes")

                            @JvmField val KGS = of("kgs")

                            @JvmField val KHR = of("khr")

                            @JvmField val KMF = of("kmf")

                            @JvmField val KRW = of("krw")

                            @JvmField val KYD = of("kyd")

                            @JvmField val KZT = of("kzt")

                            @JvmField val LBP = of("lbp")

                            @JvmField val LKR = of("lkr")

                            @JvmField val LRD = of("lrd")

                            @JvmField val LSL = of("lsl")

                            @JvmField val MAD = of("mad")

                            @JvmField val MDL = of("mdl")

                            @JvmField val MGA = of("mga")

                            @JvmField val MKD = of("mkd")

                            @JvmField val MMK = of("mmk")

                            @JvmField val MNT = of("mnt")

                            @JvmField val MOP = of("mop")

                            @JvmField val MRO = of("mro")

                            @JvmField val MVR = of("mvr")

                            @JvmField val MWK = of("mwk")

                            @JvmField val MXN = of("mxn")

                            @JvmField val MYR = of("myr")

                            @JvmField val MZN = of("mzn")

                            @JvmField val NAD = of("nad")

                            @JvmField val NGN = of("ngn")

                            @JvmField val NOK = of("nok")

                            @JvmField val NPR = of("npr")

                            @JvmField val NZD = of("nzd")

                            @JvmField val PGK = of("pgk")

                            @JvmField val PHP = of("php")

                            @JvmField val PKR = of("pkr")

                            @JvmField val PLN = of("pln")

                            @JvmField val QAR = of("qar")

                            @JvmField val RON = of("ron")

                            @JvmField val RSD = of("rsd")

                            @JvmField val RUB = of("rub")

                            @JvmField val RWF = of("rwf")

                            @JvmField val SAR = of("sar")

                            @JvmField val SBD = of("sbd")

                            @JvmField val SCR = of("scr")

                            @JvmField val SEK = of("sek")

                            @JvmField val SGD = of("sgd")

                            @JvmField val SLE = of("sle")

                            @JvmField val SLL = of("sll")

                            @JvmField val SOS = of("sos")

                            @JvmField val SZL = of("szl")

                            @JvmField val THB = of("thb")

                            @JvmField val TJS = of("tjs")

                            @JvmField val TOP = of("top")

                            @JvmField val TRY = of("try")

                            @JvmField val TTD = of("ttd")

                            @JvmField val TZS = of("tzs")

                            @JvmField val UAH = of("uah")

                            @JvmField val UZS = of("uzs")

                            @JvmField val VND = of("vnd")

                            @JvmField val VUV = of("vuv")

                            @JvmField val WST = of("wst")

                            @JvmField val XAF = of("xaf")

                            @JvmField val XCD = of("xcd")

                            @JvmField val YER = of("yer")

                            @JvmField val ZAR = of("zar")

                            @JvmField val ZMW = of("zmw")

                            @JvmField val CLP = of("clp")

                            @JvmField val DJF = of("djf")

                            @JvmField val GNF = of("gnf")

                            @JvmField val UGX = of("ugx")

                            @JvmField val PYG = of("pyg")

                            @JvmField val XOF = of("xof")

                            @JvmField val XPF = of("xpf")

                            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                        }

                        /** An enum containing [Currency]'s known values. */
                        enum class Known {
                            USD,
                            AED,
                            ALL,
                            AMD,
                            ANG,
                            AUD,
                            AWG,
                            AZN,
                            BAM,
                            BBD,
                            BDT,
                            BGN,
                            BIF,
                            BMD,
                            BND,
                            BSD,
                            BWP,
                            BYN,
                            BZD,
                            BRL,
                            CAD,
                            CDF,
                            CHF,
                            CNY,
                            CZK,
                            DKK,
                            DOP,
                            DZD,
                            EGP,
                            ETB,
                            EUR,
                            FJD,
                            GBP,
                            GEL,
                            GIP,
                            GMD,
                            GYD,
                            HKD,
                            HRK,
                            HTG,
                            IDR,
                            ILS,
                            INR,
                            ISK,
                            JMD,
                            JPY,
                            KES,
                            KGS,
                            KHR,
                            KMF,
                            KRW,
                            KYD,
                            KZT,
                            LBP,
                            LKR,
                            LRD,
                            LSL,
                            MAD,
                            MDL,
                            MGA,
                            MKD,
                            MMK,
                            MNT,
                            MOP,
                            MRO,
                            MVR,
                            MWK,
                            MXN,
                            MYR,
                            MZN,
                            NAD,
                            NGN,
                            NOK,
                            NPR,
                            NZD,
                            PGK,
                            PHP,
                            PKR,
                            PLN,
                            QAR,
                            RON,
                            RSD,
                            RUB,
                            RWF,
                            SAR,
                            SBD,
                            SCR,
                            SEK,
                            SGD,
                            SLE,
                            SLL,
                            SOS,
                            SZL,
                            THB,
                            TJS,
                            TOP,
                            TRY,
                            TTD,
                            TZS,
                            UAH,
                            UZS,
                            VND,
                            VUV,
                            WST,
                            XAF,
                            XCD,
                            YER,
                            ZAR,
                            ZMW,
                            CLP,
                            DJF,
                            GNF,
                            UGX,
                            PYG,
                            XOF,
                            XPF,
                        }

                        /**
                         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Currency] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            USD,
                            AED,
                            ALL,
                            AMD,
                            ANG,
                            AUD,
                            AWG,
                            AZN,
                            BAM,
                            BBD,
                            BDT,
                            BGN,
                            BIF,
                            BMD,
                            BND,
                            BSD,
                            BWP,
                            BYN,
                            BZD,
                            BRL,
                            CAD,
                            CDF,
                            CHF,
                            CNY,
                            CZK,
                            DKK,
                            DOP,
                            DZD,
                            EGP,
                            ETB,
                            EUR,
                            FJD,
                            GBP,
                            GEL,
                            GIP,
                            GMD,
                            GYD,
                            HKD,
                            HRK,
                            HTG,
                            IDR,
                            ILS,
                            INR,
                            ISK,
                            JMD,
                            JPY,
                            KES,
                            KGS,
                            KHR,
                            KMF,
                            KRW,
                            KYD,
                            KZT,
                            LBP,
                            LKR,
                            LRD,
                            LSL,
                            MAD,
                            MDL,
                            MGA,
                            MKD,
                            MMK,
                            MNT,
                            MOP,
                            MRO,
                            MVR,
                            MWK,
                            MXN,
                            MYR,
                            MZN,
                            NAD,
                            NGN,
                            NOK,
                            NPR,
                            NZD,
                            PGK,
                            PHP,
                            PKR,
                            PLN,
                            QAR,
                            RON,
                            RSD,
                            RUB,
                            RWF,
                            SAR,
                            SBD,
                            SCR,
                            SEK,
                            SGD,
                            SLE,
                            SLL,
                            SOS,
                            SZL,
                            THB,
                            TJS,
                            TOP,
                            TRY,
                            TTD,
                            TZS,
                            UAH,
                            UZS,
                            VND,
                            VUV,
                            WST,
                            XAF,
                            XCD,
                            YER,
                            ZAR,
                            ZMW,
                            CLP,
                            DJF,
                            GNF,
                            UGX,
                            PYG,
                            XOF,
                            XPF,
                            /**
                             * An enum member indicating that [Currency] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                USD -> Value.USD
                                AED -> Value.AED
                                ALL -> Value.ALL
                                AMD -> Value.AMD
                                ANG -> Value.ANG
                                AUD -> Value.AUD
                                AWG -> Value.AWG
                                AZN -> Value.AZN
                                BAM -> Value.BAM
                                BBD -> Value.BBD
                                BDT -> Value.BDT
                                BGN -> Value.BGN
                                BIF -> Value.BIF
                                BMD -> Value.BMD
                                BND -> Value.BND
                                BSD -> Value.BSD
                                BWP -> Value.BWP
                                BYN -> Value.BYN
                                BZD -> Value.BZD
                                BRL -> Value.BRL
                                CAD -> Value.CAD
                                CDF -> Value.CDF
                                CHF -> Value.CHF
                                CNY -> Value.CNY
                                CZK -> Value.CZK
                                DKK -> Value.DKK
                                DOP -> Value.DOP
                                DZD -> Value.DZD
                                EGP -> Value.EGP
                                ETB -> Value.ETB
                                EUR -> Value.EUR
                                FJD -> Value.FJD
                                GBP -> Value.GBP
                                GEL -> Value.GEL
                                GIP -> Value.GIP
                                GMD -> Value.GMD
                                GYD -> Value.GYD
                                HKD -> Value.HKD
                                HRK -> Value.HRK
                                HTG -> Value.HTG
                                IDR -> Value.IDR
                                ILS -> Value.ILS
                                INR -> Value.INR
                                ISK -> Value.ISK
                                JMD -> Value.JMD
                                JPY -> Value.JPY
                                KES -> Value.KES
                                KGS -> Value.KGS
                                KHR -> Value.KHR
                                KMF -> Value.KMF
                                KRW -> Value.KRW
                                KYD -> Value.KYD
                                KZT -> Value.KZT
                                LBP -> Value.LBP
                                LKR -> Value.LKR
                                LRD -> Value.LRD
                                LSL -> Value.LSL
                                MAD -> Value.MAD
                                MDL -> Value.MDL
                                MGA -> Value.MGA
                                MKD -> Value.MKD
                                MMK -> Value.MMK
                                MNT -> Value.MNT
                                MOP -> Value.MOP
                                MRO -> Value.MRO
                                MVR -> Value.MVR
                                MWK -> Value.MWK
                                MXN -> Value.MXN
                                MYR -> Value.MYR
                                MZN -> Value.MZN
                                NAD -> Value.NAD
                                NGN -> Value.NGN
                                NOK -> Value.NOK
                                NPR -> Value.NPR
                                NZD -> Value.NZD
                                PGK -> Value.PGK
                                PHP -> Value.PHP
                                PKR -> Value.PKR
                                PLN -> Value.PLN
                                QAR -> Value.QAR
                                RON -> Value.RON
                                RSD -> Value.RSD
                                RUB -> Value.RUB
                                RWF -> Value.RWF
                                SAR -> Value.SAR
                                SBD -> Value.SBD
                                SCR -> Value.SCR
                                SEK -> Value.SEK
                                SGD -> Value.SGD
                                SLE -> Value.SLE
                                SLL -> Value.SLL
                                SOS -> Value.SOS
                                SZL -> Value.SZL
                                THB -> Value.THB
                                TJS -> Value.TJS
                                TOP -> Value.TOP
                                TRY -> Value.TRY
                                TTD -> Value.TTD
                                TZS -> Value.TZS
                                UAH -> Value.UAH
                                UZS -> Value.UZS
                                VND -> Value.VND
                                VUV -> Value.VUV
                                WST -> Value.WST
                                XAF -> Value.XAF
                                XCD -> Value.XCD
                                YER -> Value.YER
                                ZAR -> Value.ZAR
                                ZMW -> Value.ZMW
                                CLP -> Value.CLP
                                DJF -> Value.DJF
                                GNF -> Value.GNF
                                UGX -> Value.UGX
                                PYG -> Value.PYG
                                XOF -> Value.XOF
                                XPF -> Value.XPF
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws StiggInvalidDataException if this class instance's value is a not
                         *   a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                USD -> Known.USD
                                AED -> Known.AED
                                ALL -> Known.ALL
                                AMD -> Known.AMD
                                ANG -> Known.ANG
                                AUD -> Known.AUD
                                AWG -> Known.AWG
                                AZN -> Known.AZN
                                BAM -> Known.BAM
                                BBD -> Known.BBD
                                BDT -> Known.BDT
                                BGN -> Known.BGN
                                BIF -> Known.BIF
                                BMD -> Known.BMD
                                BND -> Known.BND
                                BSD -> Known.BSD
                                BWP -> Known.BWP
                                BYN -> Known.BYN
                                BZD -> Known.BZD
                                BRL -> Known.BRL
                                CAD -> Known.CAD
                                CDF -> Known.CDF
                                CHF -> Known.CHF
                                CNY -> Known.CNY
                                CZK -> Known.CZK
                                DKK -> Known.DKK
                                DOP -> Known.DOP
                                DZD -> Known.DZD
                                EGP -> Known.EGP
                                ETB -> Known.ETB
                                EUR -> Known.EUR
                                FJD -> Known.FJD
                                GBP -> Known.GBP
                                GEL -> Known.GEL
                                GIP -> Known.GIP
                                GMD -> Known.GMD
                                GYD -> Known.GYD
                                HKD -> Known.HKD
                                HRK -> Known.HRK
                                HTG -> Known.HTG
                                IDR -> Known.IDR
                                ILS -> Known.ILS
                                INR -> Known.INR
                                ISK -> Known.ISK
                                JMD -> Known.JMD
                                JPY -> Known.JPY
                                KES -> Known.KES
                                KGS -> Known.KGS
                                KHR -> Known.KHR
                                KMF -> Known.KMF
                                KRW -> Known.KRW
                                KYD -> Known.KYD
                                KZT -> Known.KZT
                                LBP -> Known.LBP
                                LKR -> Known.LKR
                                LRD -> Known.LRD
                                LSL -> Known.LSL
                                MAD -> Known.MAD
                                MDL -> Known.MDL
                                MGA -> Known.MGA
                                MKD -> Known.MKD
                                MMK -> Known.MMK
                                MNT -> Known.MNT
                                MOP -> Known.MOP
                                MRO -> Known.MRO
                                MVR -> Known.MVR
                                MWK -> Known.MWK
                                MXN -> Known.MXN
                                MYR -> Known.MYR
                                MZN -> Known.MZN
                                NAD -> Known.NAD
                                NGN -> Known.NGN
                                NOK -> Known.NOK
                                NPR -> Known.NPR
                                NZD -> Known.NZD
                                PGK -> Known.PGK
                                PHP -> Known.PHP
                                PKR -> Known.PKR
                                PLN -> Known.PLN
                                QAR -> Known.QAR
                                RON -> Known.RON
                                RSD -> Known.RSD
                                RUB -> Known.RUB
                                RWF -> Known.RWF
                                SAR -> Known.SAR
                                SBD -> Known.SBD
                                SCR -> Known.SCR
                                SEK -> Known.SEK
                                SGD -> Known.SGD
                                SLE -> Known.SLE
                                SLL -> Known.SLL
                                SOS -> Known.SOS
                                SZL -> Known.SZL
                                THB -> Known.THB
                                TJS -> Known.TJS
                                TOP -> Known.TOP
                                TRY -> Known.TRY
                                TTD -> Known.TTD
                                TZS -> Known.TZS
                                UAH -> Known.UAH
                                UZS -> Known.UZS
                                VND -> Known.VND
                                VUV -> Known.VUV
                                WST -> Known.WST
                                XAF -> Known.XAF
                                XCD -> Known.XCD
                                YER -> Known.YER
                                ZAR -> Known.ZAR
                                ZMW -> Known.ZMW
                                CLP -> Known.CLP
                                DJF -> Known.DJF
                                GNF -> Known.GNF
                                UGX -> Known.UGX
                                PYG -> Known.PYG
                                XOF -> Known.XOF
                                XPF -> Known.XPF
                                else -> throw StiggInvalidDataException("Unknown Currency: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws StiggInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                StiggInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Currency = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Currency && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnitPrice &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "UnitPrice{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tier &&
                        flatPrice == other.flatPrice &&
                        unitPrice == other.unitPrice &&
                        upTo == other.upTo &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(flatPrice, unitPrice, upTo, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{flatPrice=$flatPrice, unitPrice=$unitPrice, upTo=$upTo, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PricePeriod &&
                    billingPeriod == other.billingPeriod &&
                    billingCountryCode == other.billingCountryCode &&
                    blockSize == other.blockSize &&
                    creditGrantCadence == other.creditGrantCadence &&
                    creditRate == other.creditRate &&
                    price == other.price &&
                    tiers == other.tiers &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    billingPeriod,
                    billingCountryCode,
                    blockSize,
                    creditGrantCadence,
                    creditRate,
                    price,
                    tiers,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PricePeriod{billingPeriod=$billingPeriod, billingCountryCode=$billingCountryCode, blockSize=$blockSize, creditGrantCadence=$creditGrantCadence, creditRate=$creditRate, price=$price, tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        /** The billing cadence (RECURRING or ONE_OFF) */
        class BillingCadence
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

                @JvmField val RECURRING = of("RECURRING")

                @JvmField val ONE_OFF = of("ONE_OFF")

                @JvmStatic fun of(value: String) = BillingCadence(JsonField.of(value))
            }

            /** An enum containing [BillingCadence]'s known values. */
            enum class Known {
                RECURRING,
                ONE_OFF,
            }

            /**
             * An enum containing [BillingCadence]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillingCadence] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                RECURRING,
                ONE_OFF,
                /**
                 * An enum member indicating that [BillingCadence] was instantiated with an unknown
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
                    RECURRING -> Value.RECURRING
                    ONE_OFF -> Value.ONE_OFF
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
                    RECURRING -> Known.RECURRING
                    ONE_OFF -> Known.ONE_OFF
                    else -> throw StiggInvalidDataException("Unknown BillingCadence: $value")
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

            fun validate(): BillingCadence = apply {
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

                return other is BillingCadence && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Monthly reset period configuration */
        class MonthlyResetPeriodConfiguration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accordingTo: JsonField<AccordingTo>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accordingTo")
                @ExcludeMissing
                accordingTo: JsonField<AccordingTo> = JsonMissing.of()
            ) : this(accordingTo, mutableMapOf())

            /**
             * Reset anchor (SubscriptionStart or StartOfTheMonth)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accordingTo(): AccordingTo = accordingTo.getRequired("accordingTo")

            /**
             * Returns the raw JSON value of [accordingTo].
             *
             * Unlike [accordingTo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accordingTo")
            @ExcludeMissing
            fun _accordingTo(): JsonField<AccordingTo> = accordingTo

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
                 * [MonthlyResetPeriodConfiguration].
                 *
                 * The following fields are required:
                 * ```java
                 * .accordingTo()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MonthlyResetPeriodConfiguration]. */
            class Builder internal constructor() {

                private var accordingTo: JsonField<AccordingTo>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    monthlyResetPeriodConfiguration: MonthlyResetPeriodConfiguration
                ) = apply {
                    accordingTo = monthlyResetPeriodConfiguration.accordingTo
                    additionalProperties =
                        monthlyResetPeriodConfiguration.additionalProperties.toMutableMap()
                }

                /** Reset anchor (SubscriptionStart or StartOfTheMonth) */
                fun accordingTo(accordingTo: AccordingTo) = accordingTo(JsonField.of(accordingTo))

                /**
                 * Sets [Builder.accordingTo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accordingTo] with a well-typed [AccordingTo]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accordingTo(accordingTo: JsonField<AccordingTo>) = apply {
                    this.accordingTo = accordingTo
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [MonthlyResetPeriodConfiguration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accordingTo()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MonthlyResetPeriodConfiguration =
                    MonthlyResetPeriodConfiguration(
                        checkRequired("accordingTo", accordingTo),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MonthlyResetPeriodConfiguration = apply {
                if (validated) {
                    return@apply
                }

                accordingTo().validate()
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
            internal fun validity(): Int = (accordingTo.asKnown().getOrNull()?.validity() ?: 0)

            /** Reset anchor (SubscriptionStart or StartOfTheMonth) */
            class AccordingTo
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SUBSCRIPTION_START = of("SubscriptionStart")

                    @JvmField val START_OF_THE_MONTH = of("StartOfTheMonth")

                    @JvmStatic fun of(value: String) = AccordingTo(JsonField.of(value))
                }

                /** An enum containing [AccordingTo]'s known values. */
                enum class Known {
                    SUBSCRIPTION_START,
                    START_OF_THE_MONTH,
                }

                /**
                 * An enum containing [AccordingTo]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccordingTo] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SUBSCRIPTION_START,
                    START_OF_THE_MONTH,
                    /**
                     * An enum member indicating that [AccordingTo] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SUBSCRIPTION_START -> Value.SUBSCRIPTION_START
                        START_OF_THE_MONTH -> Value.START_OF_THE_MONTH
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
                        SUBSCRIPTION_START -> Known.SUBSCRIPTION_START
                        START_OF_THE_MONTH -> Known.START_OF_THE_MONTH
                        else -> throw StiggInvalidDataException("Unknown AccordingTo: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StiggInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): AccordingTo = apply {
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

                    return other is AccordingTo && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MonthlyResetPeriodConfiguration &&
                    accordingTo == other.accordingTo &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(accordingTo, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MonthlyResetPeriodConfiguration{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
        }

        /** The usage reset period */
        class ResetPeriod @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val YEAR = of("YEAR")

                @JvmField val MONTH = of("MONTH")

                @JvmField val WEEK = of("WEEK")

                @JvmField val DAY = of("DAY")

                @JvmField val HOUR = of("HOUR")

                @JvmStatic fun of(value: String) = ResetPeriod(JsonField.of(value))
            }

            /** An enum containing [ResetPeriod]'s known values. */
            enum class Known {
                YEAR,
                MONTH,
                WEEK,
                DAY,
                HOUR,
            }

            /**
             * An enum containing [ResetPeriod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ResetPeriod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                YEAR,
                MONTH,
                WEEK,
                DAY,
                HOUR,
                /**
                 * An enum member indicating that [ResetPeriod] was instantiated with an unknown
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
                    YEAR -> Value.YEAR
                    MONTH -> Value.MONTH
                    WEEK -> Value.WEEK
                    DAY -> Value.DAY
                    HOUR -> Value.HOUR
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
                    YEAR -> Known.YEAR
                    MONTH -> Known.MONTH
                    WEEK -> Known.WEEK
                    DAY -> Known.DAY
                    HOUR -> Known.HOUR
                    else -> throw StiggInvalidDataException("Unknown ResetPeriod: $value")
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

            fun validate(): ResetPeriod = apply {
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

                return other is ResetPeriod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The tiered pricing mode (VOLUME or GRADUATED) */
        class TiersMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val VOLUME = of("VOLUME")

                @JvmField val GRADUATED = of("GRADUATED")

                @JvmStatic fun of(value: String) = TiersMode(JsonField.of(value))
            }

            /** An enum containing [TiersMode]'s known values. */
            enum class Known {
                VOLUME,
                GRADUATED,
            }

            /**
             * An enum containing [TiersMode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TiersMode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VOLUME,
                GRADUATED,
                /**
                 * An enum member indicating that [TiersMode] was instantiated with an unknown
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
                    VOLUME -> Value.VOLUME
                    GRADUATED -> Value.GRADUATED
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
                    VOLUME -> Known.VOLUME
                    GRADUATED -> Known.GRADUATED
                    else -> throw StiggInvalidDataException("Unknown TiersMode: $value")
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

            fun validate(): TiersMode = apply {
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

                return other is TiersMode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Weekly reset period configuration */
        class WeeklyResetPeriodConfiguration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accordingTo: JsonField<AccordingTo>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accordingTo")
                @ExcludeMissing
                accordingTo: JsonField<AccordingTo> = JsonMissing.of()
            ) : this(accordingTo, mutableMapOf())

            /**
             * Reset anchor (SubscriptionStart or specific day)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accordingTo(): AccordingTo = accordingTo.getRequired("accordingTo")

            /**
             * Returns the raw JSON value of [accordingTo].
             *
             * Unlike [accordingTo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accordingTo")
            @ExcludeMissing
            fun _accordingTo(): JsonField<AccordingTo> = accordingTo

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
                 * [WeeklyResetPeriodConfiguration].
                 *
                 * The following fields are required:
                 * ```java
                 * .accordingTo()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WeeklyResetPeriodConfiguration]. */
            class Builder internal constructor() {

                private var accordingTo: JsonField<AccordingTo>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(weeklyResetPeriodConfiguration: WeeklyResetPeriodConfiguration) =
                    apply {
                        accordingTo = weeklyResetPeriodConfiguration.accordingTo
                        additionalProperties =
                            weeklyResetPeriodConfiguration.additionalProperties.toMutableMap()
                    }

                /** Reset anchor (SubscriptionStart or specific day) */
                fun accordingTo(accordingTo: AccordingTo) = accordingTo(JsonField.of(accordingTo))

                /**
                 * Sets [Builder.accordingTo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accordingTo] with a well-typed [AccordingTo]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accordingTo(accordingTo: JsonField<AccordingTo>) = apply {
                    this.accordingTo = accordingTo
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [WeeklyResetPeriodConfiguration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accordingTo()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WeeklyResetPeriodConfiguration =
                    WeeklyResetPeriodConfiguration(
                        checkRequired("accordingTo", accordingTo),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WeeklyResetPeriodConfiguration = apply {
                if (validated) {
                    return@apply
                }

                accordingTo().validate()
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
            internal fun validity(): Int = (accordingTo.asKnown().getOrNull()?.validity() ?: 0)

            /** Reset anchor (SubscriptionStart or specific day) */
            class AccordingTo
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SUBSCRIPTION_START = of("SubscriptionStart")

                    @JvmField val EVERY_SUNDAY = of("EverySunday")

                    @JvmField val EVERY_MONDAY = of("EveryMonday")

                    @JvmField val EVERY_TUESDAY = of("EveryTuesday")

                    @JvmField val EVERY_WEDNESDAY = of("EveryWednesday")

                    @JvmField val EVERY_THURSDAY = of("EveryThursday")

                    @JvmField val EVERY_FRIDAY = of("EveryFriday")

                    @JvmField val EVERY_SATURDAY = of("EverySaturday")

                    @JvmStatic fun of(value: String) = AccordingTo(JsonField.of(value))
                }

                /** An enum containing [AccordingTo]'s known values. */
                enum class Known {
                    SUBSCRIPTION_START,
                    EVERY_SUNDAY,
                    EVERY_MONDAY,
                    EVERY_TUESDAY,
                    EVERY_WEDNESDAY,
                    EVERY_THURSDAY,
                    EVERY_FRIDAY,
                    EVERY_SATURDAY,
                }

                /**
                 * An enum containing [AccordingTo]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccordingTo] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SUBSCRIPTION_START,
                    EVERY_SUNDAY,
                    EVERY_MONDAY,
                    EVERY_TUESDAY,
                    EVERY_WEDNESDAY,
                    EVERY_THURSDAY,
                    EVERY_FRIDAY,
                    EVERY_SATURDAY,
                    /**
                     * An enum member indicating that [AccordingTo] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SUBSCRIPTION_START -> Value.SUBSCRIPTION_START
                        EVERY_SUNDAY -> Value.EVERY_SUNDAY
                        EVERY_MONDAY -> Value.EVERY_MONDAY
                        EVERY_TUESDAY -> Value.EVERY_TUESDAY
                        EVERY_WEDNESDAY -> Value.EVERY_WEDNESDAY
                        EVERY_THURSDAY -> Value.EVERY_THURSDAY
                        EVERY_FRIDAY -> Value.EVERY_FRIDAY
                        EVERY_SATURDAY -> Value.EVERY_SATURDAY
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
                        SUBSCRIPTION_START -> Known.SUBSCRIPTION_START
                        EVERY_SUNDAY -> Known.EVERY_SUNDAY
                        EVERY_MONDAY -> Known.EVERY_MONDAY
                        EVERY_TUESDAY -> Known.EVERY_TUESDAY
                        EVERY_WEDNESDAY -> Known.EVERY_WEDNESDAY
                        EVERY_THURSDAY -> Known.EVERY_THURSDAY
                        EVERY_FRIDAY -> Known.EVERY_FRIDAY
                        EVERY_SATURDAY -> Known.EVERY_SATURDAY
                        else -> throw StiggInvalidDataException("Unknown AccordingTo: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StiggInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): AccordingTo = apply {
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

                    return other is AccordingTo && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WeeklyResetPeriodConfiguration &&
                    accordingTo == other.accordingTo &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(accordingTo, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WeeklyResetPeriodConfiguration{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
        }

        /** Yearly reset period configuration */
        class YearlyResetPeriodConfiguration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accordingTo: JsonField<AccordingTo>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accordingTo")
                @ExcludeMissing
                accordingTo: JsonField<AccordingTo> = JsonMissing.of()
            ) : this(accordingTo, mutableMapOf())

            /**
             * Reset anchor (SubscriptionStart)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accordingTo(): AccordingTo = accordingTo.getRequired("accordingTo")

            /**
             * Returns the raw JSON value of [accordingTo].
             *
             * Unlike [accordingTo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accordingTo")
            @ExcludeMissing
            fun _accordingTo(): JsonField<AccordingTo> = accordingTo

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
                 * [YearlyResetPeriodConfiguration].
                 *
                 * The following fields are required:
                 * ```java
                 * .accordingTo()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [YearlyResetPeriodConfiguration]. */
            class Builder internal constructor() {

                private var accordingTo: JsonField<AccordingTo>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(yearlyResetPeriodConfiguration: YearlyResetPeriodConfiguration) =
                    apply {
                        accordingTo = yearlyResetPeriodConfiguration.accordingTo
                        additionalProperties =
                            yearlyResetPeriodConfiguration.additionalProperties.toMutableMap()
                    }

                /** Reset anchor (SubscriptionStart) */
                fun accordingTo(accordingTo: AccordingTo) = accordingTo(JsonField.of(accordingTo))

                /**
                 * Sets [Builder.accordingTo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accordingTo] with a well-typed [AccordingTo]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accordingTo(accordingTo: JsonField<AccordingTo>) = apply {
                    this.accordingTo = accordingTo
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [YearlyResetPeriodConfiguration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accordingTo()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): YearlyResetPeriodConfiguration =
                    YearlyResetPeriodConfiguration(
                        checkRequired("accordingTo", accordingTo),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): YearlyResetPeriodConfiguration = apply {
                if (validated) {
                    return@apply
                }

                accordingTo().validate()
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
            internal fun validity(): Int = (accordingTo.asKnown().getOrNull()?.validity() ?: 0)

            /** Reset anchor (SubscriptionStart) */
            class AccordingTo
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SUBSCRIPTION_START = of("SubscriptionStart")

                    @JvmStatic fun of(value: String) = AccordingTo(JsonField.of(value))
                }

                /** An enum containing [AccordingTo]'s known values. */
                enum class Known {
                    SUBSCRIPTION_START
                }

                /**
                 * An enum containing [AccordingTo]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccordingTo] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SUBSCRIPTION_START,
                    /**
                     * An enum member indicating that [AccordingTo] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SUBSCRIPTION_START -> Value.SUBSCRIPTION_START
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
                        SUBSCRIPTION_START -> Known.SUBSCRIPTION_START
                        else -> throw StiggInvalidDataException("Unknown AccordingTo: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StiggInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): AccordingTo = apply {
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

                    return other is AccordingTo && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is YearlyResetPeriodConfiguration &&
                    accordingTo == other.accordingTo &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(accordingTo, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "YearlyResetPeriodConfiguration{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PricingModel &&
                billingModel == other.billingModel &&
                pricePeriods == other.pricePeriods &&
                billingCadence == other.billingCadence &&
                featureId == other.featureId &&
                maxUnitQuantity == other.maxUnitQuantity &&
                minUnitQuantity == other.minUnitQuantity &&
                monthlyResetPeriodConfiguration == other.monthlyResetPeriodConfiguration &&
                resetPeriod == other.resetPeriod &&
                tiersMode == other.tiersMode &&
                topUpCustomCurrencyId == other.topUpCustomCurrencyId &&
                weeklyResetPeriodConfiguration == other.weeklyResetPeriodConfiguration &&
                yearlyResetPeriodConfiguration == other.yearlyResetPeriodConfiguration &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingModel,
                pricePeriods,
                billingCadence,
                featureId,
                maxUnitQuantity,
                minUnitQuantity,
                monthlyResetPeriodConfiguration,
                resetPeriod,
                tiersMode,
                topUpCustomCurrencyId,
                weeklyResetPeriodConfiguration,
                yearlyResetPeriodConfiguration,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PricingModel{billingModel=$billingModel, pricePeriods=$pricePeriods, billingCadence=$billingCadence, featureId=$featureId, maxUnitQuantity=$maxUnitQuantity, minUnitQuantity=$minUnitQuantity, monthlyResetPeriodConfiguration=$monthlyResetPeriodConfiguration, resetPeriod=$resetPeriod, tiersMode=$tiersMode, topUpCustomCurrencyId=$topUpCustomCurrencyId, weeklyResetPeriodConfiguration=$weeklyResetPeriodConfiguration, yearlyResetPeriodConfiguration=$yearlyResetPeriodConfiguration, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SetPackagePricing &&
            pricingType == other.pricingType &&
            billingId == other.billingId &&
            minimumSpend == other.minimumSpend &&
            overageBillingPeriod == other.overageBillingPeriod &&
            overagePricingModels == other.overagePricingModels &&
            pricingModels == other.pricingModels &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            pricingType,
            billingId,
            minimumSpend,
            overageBillingPeriod,
            overagePricingModels,
            pricingModels,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SetPackagePricing{pricingType=$pricingType, billingId=$billingId, minimumSpend=$minimumSpend, overageBillingPeriod=$overageBillingPeriod, overagePricingModels=$overagePricingModels, pricingModels=$pricingModels, additionalProperties=$additionalProperties}"
}
