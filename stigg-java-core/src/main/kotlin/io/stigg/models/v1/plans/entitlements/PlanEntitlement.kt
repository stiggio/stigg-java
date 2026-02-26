// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans.entitlements

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.BaseDeserializer
import io.stigg.core.BaseSerializer
import io.stigg.core.Enum
import io.stigg.core.ExcludeMissing
import io.stigg.core.JsonField
import io.stigg.core.JsonMissing
import io.stigg.core.JsonValue
import io.stigg.core.allMaxBy
import io.stigg.core.checkKnown
import io.stigg.core.checkRequired
import io.stigg.core.getOrThrow
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response object */
class PlanEntitlement
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
     * Feature or credit entitlement on a plan
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
         * Returns a mutable builder for constructing an instance of [PlanEntitlement].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanEntitlement]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planEntitlement: PlanEntitlement) = apply {
            data = planEntitlement.data
            additionalProperties = planEntitlement.additionalProperties.toMutableMap()
        }

        /** Feature or credit entitlement on a plan */
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
         * Returns an immutable instance of [PlanEntitlement].
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
        fun build(): PlanEntitlement =
            PlanEntitlement(checkRequired("data", data), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PlanEntitlement = apply {
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

    /** Feature or credit entitlement on a plan */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Double>,
        private val behavior: JsonField<Behavior>,
        private val cadence: JsonField<Cadence>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val customCurrencyId: JsonField<String>,
        private val description: JsonField<String>,
        private val displayNameOverride: JsonField<String>,
        private val enumValues: JsonField<List<String>>,
        private val featureId: JsonField<String>,
        private val hasSoftLimit: JsonField<Boolean>,
        private val hasUnlimitedUsage: JsonField<Boolean>,
        private val hiddenFromWidgets: JsonField<List<HiddenFromWidget>>,
        private val isCustom: JsonField<Boolean>,
        private val isGranted: JsonField<Boolean>,
        private val order: JsonField<Double>,
        private val resetPeriod: JsonField<ResetPeriod>,
        private val resetPeriodConfiguration: JsonField<ResetPeriodConfiguration>,
        private val type: JsonField<Type>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val usageLimit: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("behavior")
            @ExcludeMissing
            behavior: JsonField<Behavior> = JsonMissing.of(),
            @JsonProperty("cadence") @ExcludeMissing cadence: JsonField<Cadence> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customCurrencyId")
            @ExcludeMissing
            customCurrencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("displayNameOverride")
            @ExcludeMissing
            displayNameOverride: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enumValues")
            @ExcludeMissing
            enumValues: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("featureId")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hasSoftLimit")
            @ExcludeMissing
            hasSoftLimit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hasUnlimitedUsage")
            @ExcludeMissing
            hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hiddenFromWidgets")
            @ExcludeMissing
            hiddenFromWidgets: JsonField<List<HiddenFromWidget>> = JsonMissing.of(),
            @JsonProperty("isCustom")
            @ExcludeMissing
            isCustom: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isGranted")
            @ExcludeMissing
            isGranted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("resetPeriod")
            @ExcludeMissing
            resetPeriod: JsonField<ResetPeriod> = JsonMissing.of(),
            @JsonProperty("resetPeriodConfiguration")
            @ExcludeMissing
            resetPeriodConfiguration: JsonField<ResetPeriodConfiguration> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("usageLimit")
            @ExcludeMissing
            usageLimit: JsonField<Double> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            behavior,
            cadence,
            createdAt,
            customCurrencyId,
            description,
            displayNameOverride,
            enumValues,
            featureId,
            hasSoftLimit,
            hasUnlimitedUsage,
            hiddenFromWidgets,
            isCustom,
            isGranted,
            order,
            resetPeriod,
            resetPeriodConfiguration,
            type,
            updatedAt,
            usageLimit,
            mutableMapOf(),
        )

        /**
         * Unique identifier of the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Credit amount (for credit entitlements)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<Double> = amount.getOptional("amount")

        /**
         * Entitlement behavior (Increment or Override)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun behavior(): Behavior = behavior.getRequired("behavior")

        /**
         * Credit grant cadence (for credit entitlements)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cadence(): Optional<Cadence> = cadence.getOptional("cadence")

        /**
         * Timestamp of when the record was created
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * Custom currency ID (for credit entitlements)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customCurrencyId(): Optional<String> = customCurrencyId.getOptional("customCurrencyId")

        /**
         * Optional description of the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Override display name for the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayNameOverride(): Optional<String> =
            displayNameOverride.getOptional("displayNameOverride")

        /**
         * Allowed enum values (for feature entitlements)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enumValues(): Optional<List<String>> = enumValues.getOptional("enumValues")

        /**
         * Feature ID (for feature entitlements)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureId(): Optional<String> = featureId.getOptional("featureId")

        /**
         * Whether the usage limit is a soft limit (for feature entitlements)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasSoftLimit(): Optional<Boolean> = hasSoftLimit.getOptional("hasSoftLimit")

        /**
         * Whether usage is unlimited (for feature entitlements)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasUnlimitedUsage(): Optional<Boolean> =
            hasUnlimitedUsage.getOptional("hasUnlimitedUsage")

        /**
         * Widget types where this entitlement is hidden
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hiddenFromWidgets(): List<HiddenFromWidget> =
            hiddenFromWidgets.getRequired("hiddenFromWidgets")

        /**
         * Whether this is a custom entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isCustom(): Optional<Boolean> = isCustom.getOptional("isCustom")

        /**
         * Whether the entitlement is granted
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isGranted(): Boolean = isGranted.getRequired("isGranted")

        /**
         * Display order of the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun order(): Optional<Double> = order.getOptional("order")

        /**
         * Usage reset period (for feature entitlements)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resetPeriod(): Optional<ResetPeriod> = resetPeriod.getOptional("resetPeriod")

        /**
         * Reset period configuration (for feature entitlements)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resetPeriodConfiguration(): Optional<ResetPeriodConfiguration> =
            resetPeriodConfiguration.getOptional("resetPeriodConfiguration")

        /**
         * Entitlement type (FEATURE or CREDIT)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Timestamp of when the record was last updated
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

        /**
         * Usage limit (for feature entitlements)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageLimit(): Optional<Double> = usageLimit.getOptional("usageLimit")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [behavior].
         *
         * Unlike [behavior], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("behavior") @ExcludeMissing fun _behavior(): JsonField<Behavior> = behavior

        /**
         * Returns the raw JSON value of [cadence].
         *
         * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [customCurrencyId].
         *
         * Unlike [customCurrencyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customCurrencyId")
        @ExcludeMissing
        fun _customCurrencyId(): JsonField<String> = customCurrencyId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [displayNameOverride].
         *
         * Unlike [displayNameOverride], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("displayNameOverride")
        @ExcludeMissing
        fun _displayNameOverride(): JsonField<String> = displayNameOverride

        /**
         * Returns the raw JSON value of [enumValues].
         *
         * Unlike [enumValues], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enumValues")
        @ExcludeMissing
        fun _enumValues(): JsonField<List<String>> = enumValues

        /**
         * Returns the raw JSON value of [featureId].
         *
         * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

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
         * Unlike [hasUnlimitedUsage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hasUnlimitedUsage")
        @ExcludeMissing
        fun _hasUnlimitedUsage(): JsonField<Boolean> = hasUnlimitedUsage

        /**
         * Returns the raw JSON value of [hiddenFromWidgets].
         *
         * Unlike [hiddenFromWidgets], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hiddenFromWidgets")
        @ExcludeMissing
        fun _hiddenFromWidgets(): JsonField<List<HiddenFromWidget>> = hiddenFromWidgets

        /**
         * Returns the raw JSON value of [isCustom].
         *
         * Unlike [isCustom], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isCustom") @ExcludeMissing fun _isCustom(): JsonField<Boolean> = isCustom

        /**
         * Returns the raw JSON value of [isGranted].
         *
         * Unlike [isGranted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isGranted") @ExcludeMissing fun _isGranted(): JsonField<Boolean> = isGranted

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Double> = order

        /**
         * Returns the raw JSON value of [resetPeriod].
         *
         * Unlike [resetPeriod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resetPeriod")
        @ExcludeMissing
        fun _resetPeriod(): JsonField<ResetPeriod> = resetPeriod

        /**
         * Returns the raw JSON value of [resetPeriodConfiguration].
         *
         * Unlike [resetPeriodConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("resetPeriodConfiguration")
        @ExcludeMissing
        fun _resetPeriodConfiguration(): JsonField<ResetPeriodConfiguration> =
            resetPeriodConfiguration

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [usageLimit].
         *
         * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usageLimit")
        @ExcludeMissing
        fun _usageLimit(): JsonField<Double> = usageLimit

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
             * .amount()
             * .behavior()
             * .cadence()
             * .createdAt()
             * .customCurrencyId()
             * .description()
             * .displayNameOverride()
             * .enumValues()
             * .featureId()
             * .hasSoftLimit()
             * .hasUnlimitedUsage()
             * .hiddenFromWidgets()
             * .isCustom()
             * .isGranted()
             * .order()
             * .resetPeriod()
             * .resetPeriodConfiguration()
             * .type()
             * .updatedAt()
             * .usageLimit()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var behavior: JsonField<Behavior>? = null
            private var cadence: JsonField<Cadence>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var customCurrencyId: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var displayNameOverride: JsonField<String>? = null
            private var enumValues: JsonField<MutableList<String>>? = null
            private var featureId: JsonField<String>? = null
            private var hasSoftLimit: JsonField<Boolean>? = null
            private var hasUnlimitedUsage: JsonField<Boolean>? = null
            private var hiddenFromWidgets: JsonField<MutableList<HiddenFromWidget>>? = null
            private var isCustom: JsonField<Boolean>? = null
            private var isGranted: JsonField<Boolean>? = null
            private var order: JsonField<Double>? = null
            private var resetPeriod: JsonField<ResetPeriod>? = null
            private var resetPeriodConfiguration: JsonField<ResetPeriodConfiguration>? = null
            private var type: JsonField<Type>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var usageLimit: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                amount = data.amount
                behavior = data.behavior
                cadence = data.cadence
                createdAt = data.createdAt
                customCurrencyId = data.customCurrencyId
                description = data.description
                displayNameOverride = data.displayNameOverride
                enumValues = data.enumValues.map { it.toMutableList() }
                featureId = data.featureId
                hasSoftLimit = data.hasSoftLimit
                hasUnlimitedUsage = data.hasUnlimitedUsage
                hiddenFromWidgets = data.hiddenFromWidgets.map { it.toMutableList() }
                isCustom = data.isCustom
                isGranted = data.isGranted
                order = data.order
                resetPeriod = data.resetPeriod
                resetPeriodConfiguration = data.resetPeriodConfiguration
                type = data.type
                updatedAt = data.updatedAt
                usageLimit = data.usageLimit
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Unique identifier of the entitlement */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Credit amount (for credit entitlements) */
            fun amount(amount: Double?) = amount(JsonField.ofNullable(amount))

            /**
             * Alias for [Builder.amount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun amount(amount: Double) = amount(amount as Double?)

            /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
            fun amount(amount: Optional<Double>) = amount(amount.getOrNull())

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** Entitlement behavior (Increment or Override) */
            fun behavior(behavior: Behavior) = behavior(JsonField.of(behavior))

            /**
             * Sets [Builder.behavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.behavior] with a well-typed [Behavior] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun behavior(behavior: JsonField<Behavior>) = apply { this.behavior = behavior }

            /** Credit grant cadence (for credit entitlements) */
            fun cadence(cadence: Cadence?) = cadence(JsonField.ofNullable(cadence))

            /** Alias for calling [Builder.cadence] with `cadence.orElse(null)`. */
            fun cadence(cadence: Optional<Cadence>) = cadence(cadence.getOrNull())

            /**
             * Sets [Builder.cadence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cadence] with a well-typed [Cadence] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            /** Timestamp of when the record was created */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

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

            /** Custom currency ID (for credit entitlements) */
            fun customCurrencyId(customCurrencyId: String?) =
                customCurrencyId(JsonField.ofNullable(customCurrencyId))

            /**
             * Alias for calling [Builder.customCurrencyId] with `customCurrencyId.orElse(null)`.
             */
            fun customCurrencyId(customCurrencyId: Optional<String>) =
                customCurrencyId(customCurrencyId.getOrNull())

            /**
             * Sets [Builder.customCurrencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customCurrencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customCurrencyId(customCurrencyId: JsonField<String>) = apply {
                this.customCurrencyId = customCurrencyId
            }

            /** Optional description of the entitlement */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Override display name for the entitlement */
            fun displayNameOverride(displayNameOverride: String?) =
                displayNameOverride(JsonField.ofNullable(displayNameOverride))

            /**
             * Alias for calling [Builder.displayNameOverride] with
             * `displayNameOverride.orElse(null)`.
             */
            fun displayNameOverride(displayNameOverride: Optional<String>) =
                displayNameOverride(displayNameOverride.getOrNull())

            /**
             * Sets [Builder.displayNameOverride] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayNameOverride] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun displayNameOverride(displayNameOverride: JsonField<String>) = apply {
                this.displayNameOverride = displayNameOverride
            }

            /** Allowed enum values (for feature entitlements) */
            fun enumValues(enumValues: List<String>?) = enumValues(JsonField.ofNullable(enumValues))

            /** Alias for calling [Builder.enumValues] with `enumValues.orElse(null)`. */
            fun enumValues(enumValues: Optional<List<String>>) = enumValues(enumValues.getOrNull())

            /**
             * Sets [Builder.enumValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enumValues] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enumValues(enumValues: JsonField<List<String>>) = apply {
                this.enumValues = enumValues.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [enumValues].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEnumValue(enumValue: String) = apply {
                enumValues =
                    (enumValues ?: JsonField.of(mutableListOf())).also {
                        checkKnown("enumValues", it).add(enumValue)
                    }
            }

            /** Feature ID (for feature entitlements) */
            fun featureId(featureId: String?) = featureId(JsonField.ofNullable(featureId))

            /** Alias for calling [Builder.featureId] with `featureId.orElse(null)`. */
            fun featureId(featureId: Optional<String>) = featureId(featureId.getOrNull())

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

            /** Whether the usage limit is a soft limit (for feature entitlements) */
            fun hasSoftLimit(hasSoftLimit: Boolean?) =
                hasSoftLimit(JsonField.ofNullable(hasSoftLimit))

            /**
             * Alias for [Builder.hasSoftLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun hasSoftLimit(hasSoftLimit: Boolean) = hasSoftLimit(hasSoftLimit as Boolean?)

            /** Alias for calling [Builder.hasSoftLimit] with `hasSoftLimit.orElse(null)`. */
            fun hasSoftLimit(hasSoftLimit: Optional<Boolean>) =
                hasSoftLimit(hasSoftLimit.getOrNull())

            /**
             * Sets [Builder.hasSoftLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasSoftLimit] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasSoftLimit(hasSoftLimit: JsonField<Boolean>) = apply {
                this.hasSoftLimit = hasSoftLimit
            }

            /** Whether usage is unlimited (for feature entitlements) */
            fun hasUnlimitedUsage(hasUnlimitedUsage: Boolean?) =
                hasUnlimitedUsage(JsonField.ofNullable(hasUnlimitedUsage))

            /**
             * Alias for [Builder.hasUnlimitedUsage].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun hasUnlimitedUsage(hasUnlimitedUsage: Boolean) =
                hasUnlimitedUsage(hasUnlimitedUsage as Boolean?)

            /**
             * Alias for calling [Builder.hasUnlimitedUsage] with `hasUnlimitedUsage.orElse(null)`.
             */
            fun hasUnlimitedUsage(hasUnlimitedUsage: Optional<Boolean>) =
                hasUnlimitedUsage(hasUnlimitedUsage.getOrNull())

            /**
             * Sets [Builder.hasUnlimitedUsage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasUnlimitedUsage] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasUnlimitedUsage(hasUnlimitedUsage: JsonField<Boolean>) = apply {
                this.hasUnlimitedUsage = hasUnlimitedUsage
            }

            /** Widget types where this entitlement is hidden */
            fun hiddenFromWidgets(hiddenFromWidgets: List<HiddenFromWidget>) =
                hiddenFromWidgets(JsonField.of(hiddenFromWidgets))

            /**
             * Sets [Builder.hiddenFromWidgets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hiddenFromWidgets] with a well-typed
             * `List<HiddenFromWidget>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun hiddenFromWidgets(hiddenFromWidgets: JsonField<List<HiddenFromWidget>>) = apply {
                this.hiddenFromWidgets = hiddenFromWidgets.map { it.toMutableList() }
            }

            /**
             * Adds a single [HiddenFromWidget] to [hiddenFromWidgets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addHiddenFromWidget(hiddenFromWidget: HiddenFromWidget) = apply {
                hiddenFromWidgets =
                    (hiddenFromWidgets ?: JsonField.of(mutableListOf())).also {
                        checkKnown("hiddenFromWidgets", it).add(hiddenFromWidget)
                    }
            }

            /** Whether this is a custom entitlement */
            fun isCustom(isCustom: Boolean?) = isCustom(JsonField.ofNullable(isCustom))

            /**
             * Alias for [Builder.isCustom].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isCustom(isCustom: Boolean) = isCustom(isCustom as Boolean?)

            /** Alias for calling [Builder.isCustom] with `isCustom.orElse(null)`. */
            fun isCustom(isCustom: Optional<Boolean>) = isCustom(isCustom.getOrNull())

            /**
             * Sets [Builder.isCustom] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isCustom] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isCustom(isCustom: JsonField<Boolean>) = apply { this.isCustom = isCustom }

            /** Whether the entitlement is granted */
            fun isGranted(isGranted: Boolean) = isGranted(JsonField.of(isGranted))

            /**
             * Sets [Builder.isGranted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isGranted] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isGranted(isGranted: JsonField<Boolean>) = apply { this.isGranted = isGranted }

            /** Display order of the entitlement */
            fun order(order: Double?) = order(JsonField.ofNullable(order))

            /**
             * Alias for [Builder.order].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun order(order: Double) = order(order as Double?)

            /** Alias for calling [Builder.order] with `order.orElse(null)`. */
            fun order(order: Optional<Double>) = order(order.getOrNull())

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun order(order: JsonField<Double>) = apply { this.order = order }

            /** Usage reset period (for feature entitlements) */
            fun resetPeriod(resetPeriod: ResetPeriod?) =
                resetPeriod(JsonField.ofNullable(resetPeriod))

            /** Alias for calling [Builder.resetPeriod] with `resetPeriod.orElse(null)`. */
            fun resetPeriod(resetPeriod: Optional<ResetPeriod>) =
                resetPeriod(resetPeriod.getOrNull())

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

            /** Reset period configuration (for feature entitlements) */
            fun resetPeriodConfiguration(resetPeriodConfiguration: ResetPeriodConfiguration?) =
                resetPeriodConfiguration(JsonField.ofNullable(resetPeriodConfiguration))

            /**
             * Alias for calling [Builder.resetPeriodConfiguration] with
             * `resetPeriodConfiguration.orElse(null)`.
             */
            fun resetPeriodConfiguration(
                resetPeriodConfiguration: Optional<ResetPeriodConfiguration>
            ) = resetPeriodConfiguration(resetPeriodConfiguration.getOrNull())

            /**
             * Sets [Builder.resetPeriodConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resetPeriodConfiguration] with a well-typed
             * [ResetPeriodConfiguration] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun resetPeriodConfiguration(
                resetPeriodConfiguration: JsonField<ResetPeriodConfiguration>
            ) = apply { this.resetPeriodConfiguration = resetPeriodConfiguration }

            /**
             * Alias for calling [resetPeriodConfiguration] with
             * `ResetPeriodConfiguration.ofYearlyResetPeriodConfig(yearlyResetPeriodConfig)`.
             */
            fun resetPeriodConfiguration(
                yearlyResetPeriodConfig: ResetPeriodConfiguration.YearlyResetPeriodConfig
            ) =
                resetPeriodConfiguration(
                    ResetPeriodConfiguration.ofYearlyResetPeriodConfig(yearlyResetPeriodConfig)
                )

            /**
             * Alias for calling [resetPeriodConfiguration] with
             * `ResetPeriodConfiguration.ofMonthlyResetPeriodConfig(monthlyResetPeriodConfig)`.
             */
            fun resetPeriodConfiguration(
                monthlyResetPeriodConfig: ResetPeriodConfiguration.MonthlyResetPeriodConfig
            ) =
                resetPeriodConfiguration(
                    ResetPeriodConfiguration.ofMonthlyResetPeriodConfig(monthlyResetPeriodConfig)
                )

            /**
             * Alias for calling [resetPeriodConfiguration] with
             * `ResetPeriodConfiguration.ofWeeklyResetPeriodConfig(weeklyResetPeriodConfig)`.
             */
            fun resetPeriodConfiguration(
                weeklyResetPeriodConfig: ResetPeriodConfiguration.WeeklyResetPeriodConfig
            ) =
                resetPeriodConfiguration(
                    ResetPeriodConfiguration.ofWeeklyResetPeriodConfig(weeklyResetPeriodConfig)
                )

            /** Entitlement type (FEATURE or CREDIT) */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Timestamp of when the record was last updated */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

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

            /** Usage limit (for feature entitlements) */
            fun usageLimit(usageLimit: Double?) = usageLimit(JsonField.ofNullable(usageLimit))

            /**
             * Alias for [Builder.usageLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun usageLimit(usageLimit: Double) = usageLimit(usageLimit as Double?)

            /** Alias for calling [Builder.usageLimit] with `usageLimit.orElse(null)`. */
            fun usageLimit(usageLimit: Optional<Double>) = usageLimit(usageLimit.getOrNull())

            /**
             * Sets [Builder.usageLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageLimit] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun usageLimit(usageLimit: JsonField<Double>) = apply { this.usageLimit = usageLimit }

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
             * .amount()
             * .behavior()
             * .cadence()
             * .createdAt()
             * .customCurrencyId()
             * .description()
             * .displayNameOverride()
             * .enumValues()
             * .featureId()
             * .hasSoftLimit()
             * .hasUnlimitedUsage()
             * .hiddenFromWidgets()
             * .isCustom()
             * .isGranted()
             * .order()
             * .resetPeriod()
             * .resetPeriodConfiguration()
             * .type()
             * .updatedAt()
             * .usageLimit()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("behavior", behavior),
                    checkRequired("cadence", cadence),
                    checkRequired("createdAt", createdAt),
                    checkRequired("customCurrencyId", customCurrencyId),
                    checkRequired("description", description),
                    checkRequired("displayNameOverride", displayNameOverride),
                    checkRequired("enumValues", enumValues).map { it.toImmutable() },
                    checkRequired("featureId", featureId),
                    checkRequired("hasSoftLimit", hasSoftLimit),
                    checkRequired("hasUnlimitedUsage", hasUnlimitedUsage),
                    checkRequired("hiddenFromWidgets", hiddenFromWidgets).map { it.toImmutable() },
                    checkRequired("isCustom", isCustom),
                    checkRequired("isGranted", isGranted),
                    checkRequired("order", order),
                    checkRequired("resetPeriod", resetPeriod),
                    checkRequired("resetPeriodConfiguration", resetPeriodConfiguration),
                    checkRequired("type", type),
                    checkRequired("updatedAt", updatedAt),
                    checkRequired("usageLimit", usageLimit),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            behavior().validate()
            cadence().ifPresent { it.validate() }
            createdAt()
            customCurrencyId()
            description()
            displayNameOverride()
            enumValues()
            featureId()
            hasSoftLimit()
            hasUnlimitedUsage()
            hiddenFromWidgets().forEach { it.validate() }
            isCustom()
            isGranted()
            order()
            resetPeriod().ifPresent { it.validate() }
            resetPeriodConfiguration().ifPresent { it.validate() }
            type().validate()
            updatedAt()
            usageLimit()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                (behavior.asKnown().getOrNull()?.validity() ?: 0) +
                (cadence.asKnown().getOrNull()?.validity() ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (customCurrencyId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (displayNameOverride.asKnown().isPresent) 1 else 0) +
                (enumValues.asKnown().getOrNull()?.size ?: 0) +
                (if (featureId.asKnown().isPresent) 1 else 0) +
                (if (hasSoftLimit.asKnown().isPresent) 1 else 0) +
                (if (hasUnlimitedUsage.asKnown().isPresent) 1 else 0) +
                (hiddenFromWidgets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (isCustom.asKnown().isPresent) 1 else 0) +
                (if (isGranted.asKnown().isPresent) 1 else 0) +
                (if (order.asKnown().isPresent) 1 else 0) +
                (resetPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                (resetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (usageLimit.asKnown().isPresent) 1 else 0)

        /** Entitlement behavior (Increment or Override) */
        class Behavior @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val INCREMENT = of("Increment")

                @JvmField val OVERRIDE = of("Override")

                @JvmStatic fun of(value: String) = Behavior(JsonField.of(value))
            }

            /** An enum containing [Behavior]'s known values. */
            enum class Known {
                INCREMENT,
                OVERRIDE,
            }

            /**
             * An enum containing [Behavior]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Behavior] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INCREMENT,
                OVERRIDE,
                /**
                 * An enum member indicating that [Behavior] was instantiated with an unknown value.
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
                    INCREMENT -> Value.INCREMENT
                    OVERRIDE -> Value.OVERRIDE
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
                    INCREMENT -> Known.INCREMENT
                    OVERRIDE -> Known.OVERRIDE
                    else -> throw StiggInvalidDataException("Unknown Behavior: $value")
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

            fun validate(): Behavior = apply {
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

                return other is Behavior && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Credit grant cadence (for credit entitlements) */
        class Cadence @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val MONTH = of("MONTH")

                @JvmField val YEAR = of("YEAR")

                @JvmStatic fun of(value: String) = Cadence(JsonField.of(value))
            }

            /** An enum containing [Cadence]'s known values. */
            enum class Known {
                MONTH,
                YEAR,
            }

            /**
             * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Cadence] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MONTH,
                YEAR,
                /**
                 * An enum member indicating that [Cadence] was instantiated with an unknown value.
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
                    MONTH -> Value.MONTH
                    YEAR -> Value.YEAR
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
                    MONTH -> Known.MONTH
                    YEAR -> Known.YEAR
                    else -> throw StiggInvalidDataException("Unknown Cadence: $value")
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

            fun validate(): Cadence = apply {
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

                return other is Cadence && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class HiddenFromWidget
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

                @JvmField val PAYWALL = of("PAYWALL")

                @JvmField val CUSTOMER_PORTAL = of("CUSTOMER_PORTAL")

                @JvmField val CHECKOUT = of("CHECKOUT")

                @JvmStatic fun of(value: String) = HiddenFromWidget(JsonField.of(value))
            }

            /** An enum containing [HiddenFromWidget]'s known values. */
            enum class Known {
                PAYWALL,
                CUSTOMER_PORTAL,
                CHECKOUT,
            }

            /**
             * An enum containing [HiddenFromWidget]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [HiddenFromWidget] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PAYWALL,
                CUSTOMER_PORTAL,
                CHECKOUT,
                /**
                 * An enum member indicating that [HiddenFromWidget] was instantiated with an
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
                    PAYWALL -> Value.PAYWALL
                    CUSTOMER_PORTAL -> Value.CUSTOMER_PORTAL
                    CHECKOUT -> Value.CHECKOUT
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
                    PAYWALL -> Known.PAYWALL
                    CUSTOMER_PORTAL -> Known.CUSTOMER_PORTAL
                    CHECKOUT -> Known.CHECKOUT
                    else -> throw StiggInvalidDataException("Unknown HiddenFromWidget: $value")
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

            fun validate(): HiddenFromWidget = apply {
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

                return other is HiddenFromWidget && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Usage reset period (for feature entitlements) */
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

        /** Reset period configuration (for feature entitlements) */
        @JsonDeserialize(using = ResetPeriodConfiguration.Deserializer::class)
        @JsonSerialize(using = ResetPeriodConfiguration.Serializer::class)
        class ResetPeriodConfiguration
        private constructor(
            private val yearlyResetPeriodConfig: YearlyResetPeriodConfig? = null,
            private val monthlyResetPeriodConfig: MonthlyResetPeriodConfig? = null,
            private val weeklyResetPeriodConfig: WeeklyResetPeriodConfig? = null,
            private val _json: JsonValue? = null,
        ) {

            /** Yearly reset configuration */
            fun yearlyResetPeriodConfig(): Optional<YearlyResetPeriodConfig> =
                Optional.ofNullable(yearlyResetPeriodConfig)

            /** Monthly reset configuration */
            fun monthlyResetPeriodConfig(): Optional<MonthlyResetPeriodConfig> =
                Optional.ofNullable(monthlyResetPeriodConfig)

            /** Weekly reset configuration */
            fun weeklyResetPeriodConfig(): Optional<WeeklyResetPeriodConfig> =
                Optional.ofNullable(weeklyResetPeriodConfig)

            fun isYearlyResetPeriodConfig(): Boolean = yearlyResetPeriodConfig != null

            fun isMonthlyResetPeriodConfig(): Boolean = monthlyResetPeriodConfig != null

            fun isWeeklyResetPeriodConfig(): Boolean = weeklyResetPeriodConfig != null

            /** Yearly reset configuration */
            fun asYearlyResetPeriodConfig(): YearlyResetPeriodConfig =
                yearlyResetPeriodConfig.getOrThrow("yearlyResetPeriodConfig")

            /** Monthly reset configuration */
            fun asMonthlyResetPeriodConfig(): MonthlyResetPeriodConfig =
                monthlyResetPeriodConfig.getOrThrow("monthlyResetPeriodConfig")

            /** Weekly reset configuration */
            fun asWeeklyResetPeriodConfig(): WeeklyResetPeriodConfig =
                weeklyResetPeriodConfig.getOrThrow("weeklyResetPeriodConfig")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    yearlyResetPeriodConfig != null ->
                        visitor.visitYearlyResetPeriodConfig(yearlyResetPeriodConfig)
                    monthlyResetPeriodConfig != null ->
                        visitor.visitMonthlyResetPeriodConfig(monthlyResetPeriodConfig)
                    weeklyResetPeriodConfig != null ->
                        visitor.visitWeeklyResetPeriodConfig(weeklyResetPeriodConfig)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): ResetPeriodConfiguration = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitYearlyResetPeriodConfig(
                            yearlyResetPeriodConfig: YearlyResetPeriodConfig
                        ) {
                            yearlyResetPeriodConfig.validate()
                        }

                        override fun visitMonthlyResetPeriodConfig(
                            monthlyResetPeriodConfig: MonthlyResetPeriodConfig
                        ) {
                            monthlyResetPeriodConfig.validate()
                        }

                        override fun visitWeeklyResetPeriodConfig(
                            weeklyResetPeriodConfig: WeeklyResetPeriodConfig
                        ) {
                            weeklyResetPeriodConfig.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitYearlyResetPeriodConfig(
                            yearlyResetPeriodConfig: YearlyResetPeriodConfig
                        ) = yearlyResetPeriodConfig.validity()

                        override fun visitMonthlyResetPeriodConfig(
                            monthlyResetPeriodConfig: MonthlyResetPeriodConfig
                        ) = monthlyResetPeriodConfig.validity()

                        override fun visitWeeklyResetPeriodConfig(
                            weeklyResetPeriodConfig: WeeklyResetPeriodConfig
                        ) = weeklyResetPeriodConfig.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ResetPeriodConfiguration &&
                    yearlyResetPeriodConfig == other.yearlyResetPeriodConfig &&
                    monthlyResetPeriodConfig == other.monthlyResetPeriodConfig &&
                    weeklyResetPeriodConfig == other.weeklyResetPeriodConfig
            }

            override fun hashCode(): Int =
                Objects.hash(
                    yearlyResetPeriodConfig,
                    monthlyResetPeriodConfig,
                    weeklyResetPeriodConfig,
                )

            override fun toString(): String =
                when {
                    yearlyResetPeriodConfig != null ->
                        "ResetPeriodConfiguration{yearlyResetPeriodConfig=$yearlyResetPeriodConfig}"
                    monthlyResetPeriodConfig != null ->
                        "ResetPeriodConfiguration{monthlyResetPeriodConfig=$monthlyResetPeriodConfig}"
                    weeklyResetPeriodConfig != null ->
                        "ResetPeriodConfiguration{weeklyResetPeriodConfig=$weeklyResetPeriodConfig}"
                    _json != null -> "ResetPeriodConfiguration{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid ResetPeriodConfiguration")
                }

            companion object {

                /** Yearly reset configuration */
                @JvmStatic
                fun ofYearlyResetPeriodConfig(yearlyResetPeriodConfig: YearlyResetPeriodConfig) =
                    ResetPeriodConfiguration(yearlyResetPeriodConfig = yearlyResetPeriodConfig)

                /** Monthly reset configuration */
                @JvmStatic
                fun ofMonthlyResetPeriodConfig(monthlyResetPeriodConfig: MonthlyResetPeriodConfig) =
                    ResetPeriodConfiguration(monthlyResetPeriodConfig = monthlyResetPeriodConfig)

                /** Weekly reset configuration */
                @JvmStatic
                fun ofWeeklyResetPeriodConfig(weeklyResetPeriodConfig: WeeklyResetPeriodConfig) =
                    ResetPeriodConfiguration(weeklyResetPeriodConfig = weeklyResetPeriodConfig)
            }

            /**
             * An interface that defines how to map each variant of [ResetPeriodConfiguration] to a
             * value of type [T].
             */
            interface Visitor<out T> {

                /** Yearly reset configuration */
                fun visitYearlyResetPeriodConfig(
                    yearlyResetPeriodConfig: YearlyResetPeriodConfig
                ): T

                /** Monthly reset configuration */
                fun visitMonthlyResetPeriodConfig(
                    monthlyResetPeriodConfig: MonthlyResetPeriodConfig
                ): T

                /** Weekly reset configuration */
                fun visitWeeklyResetPeriodConfig(
                    weeklyResetPeriodConfig: WeeklyResetPeriodConfig
                ): T

                /**
                 * Maps an unknown variant of [ResetPeriodConfiguration] to a value of type [T].
                 *
                 * An instance of [ResetPeriodConfiguration] can contain an unknown variant if it
                 * was deserialized from data that doesn't match any known variant. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws StiggInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw StiggInvalidDataException("Unknown ResetPeriodConfiguration: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<ResetPeriodConfiguration>(ResetPeriodConfiguration::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): ResetPeriodConfiguration {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<YearlyResetPeriodConfig>())
                                    ?.let {
                                        ResetPeriodConfiguration(
                                            yearlyResetPeriodConfig = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(node, jacksonTypeRef<MonthlyResetPeriodConfig>())
                                    ?.let {
                                        ResetPeriodConfiguration(
                                            monthlyResetPeriodConfig = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(node, jacksonTypeRef<WeeklyResetPeriodConfig>())
                                    ?.let {
                                        ResetPeriodConfiguration(
                                            weeklyResetPeriodConfig = it,
                                            _json = json,
                                        )
                                    },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> ResetPeriodConfiguration(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<ResetPeriodConfiguration>(ResetPeriodConfiguration::class) {

                override fun serialize(
                    value: ResetPeriodConfiguration,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.yearlyResetPeriodConfig != null ->
                            generator.writeObject(value.yearlyResetPeriodConfig)
                        value.monthlyResetPeriodConfig != null ->
                            generator.writeObject(value.monthlyResetPeriodConfig)
                        value.weeklyResetPeriodConfig != null ->
                            generator.writeObject(value.weeklyResetPeriodConfig)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid ResetPeriodConfiguration")
                    }
                }
            }

            /** Yearly reset configuration */
            class YearlyResetPeriodConfig
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
                     * [YearlyResetPeriodConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .accordingTo()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [YearlyResetPeriodConfig]. */
                class Builder internal constructor() {

                    private var accordingTo: JsonField<AccordingTo>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(yearlyResetPeriodConfig: YearlyResetPeriodConfig) = apply {
                        accordingTo = yearlyResetPeriodConfig.accordingTo
                        additionalProperties =
                            yearlyResetPeriodConfig.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [YearlyResetPeriodConfig].
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
                    fun build(): YearlyResetPeriodConfig =
                        YearlyResetPeriodConfig(
                            checkRequired("accordingTo", accordingTo),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): YearlyResetPeriodConfig = apply {
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

                    return other is YearlyResetPeriodConfig &&
                        accordingTo == other.accordingTo &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accordingTo, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "YearlyResetPeriodConfig{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
            }

            /** Monthly reset configuration */
            class MonthlyResetPeriodConfig
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
                     * [MonthlyResetPeriodConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .accordingTo()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [MonthlyResetPeriodConfig]. */
                class Builder internal constructor() {

                    private var accordingTo: JsonField<AccordingTo>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(monthlyResetPeriodConfig: MonthlyResetPeriodConfig) = apply {
                        accordingTo = monthlyResetPeriodConfig.accordingTo
                        additionalProperties =
                            monthlyResetPeriodConfig.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [MonthlyResetPeriodConfig].
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
                    fun build(): MonthlyResetPeriodConfig =
                        MonthlyResetPeriodConfig(
                            checkRequired("accordingTo", accordingTo),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): MonthlyResetPeriodConfig = apply {
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

                    return other is MonthlyResetPeriodConfig &&
                        accordingTo == other.accordingTo &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accordingTo, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MonthlyResetPeriodConfig{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
            }

            /** Weekly reset configuration */
            class WeeklyResetPeriodConfig
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
                     * [WeeklyResetPeriodConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .accordingTo()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WeeklyResetPeriodConfig]. */
                class Builder internal constructor() {

                    private var accordingTo: JsonField<AccordingTo>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(weeklyResetPeriodConfig: WeeklyResetPeriodConfig) = apply {
                        accordingTo = weeklyResetPeriodConfig.accordingTo
                        additionalProperties =
                            weeklyResetPeriodConfig.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [WeeklyResetPeriodConfig].
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
                    fun build(): WeeklyResetPeriodConfig =
                        WeeklyResetPeriodConfig(
                            checkRequired("accordingTo", accordingTo),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): WeeklyResetPeriodConfig = apply {
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

                    return other is WeeklyResetPeriodConfig &&
                        accordingTo == other.accordingTo &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accordingTo, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WeeklyResetPeriodConfig{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
            }
        }

        /** Entitlement type (FEATURE or CREDIT) */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val FEATURE = of("FEATURE")

                @JvmField val CREDIT = of("CREDIT")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                FEATURE,
                CREDIT,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FEATURE,
                CREDIT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    FEATURE -> Value.FEATURE
                    CREDIT -> Value.CREDIT
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
                    FEATURE -> Known.FEATURE
                    CREDIT -> Known.CREDIT
                    else -> throw StiggInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
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
                amount == other.amount &&
                behavior == other.behavior &&
                cadence == other.cadence &&
                createdAt == other.createdAt &&
                customCurrencyId == other.customCurrencyId &&
                description == other.description &&
                displayNameOverride == other.displayNameOverride &&
                enumValues == other.enumValues &&
                featureId == other.featureId &&
                hasSoftLimit == other.hasSoftLimit &&
                hasUnlimitedUsage == other.hasUnlimitedUsage &&
                hiddenFromWidgets == other.hiddenFromWidgets &&
                isCustom == other.isCustom &&
                isGranted == other.isGranted &&
                order == other.order &&
                resetPeriod == other.resetPeriod &&
                resetPeriodConfiguration == other.resetPeriodConfiguration &&
                type == other.type &&
                updatedAt == other.updatedAt &&
                usageLimit == other.usageLimit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amount,
                behavior,
                cadence,
                createdAt,
                customCurrencyId,
                description,
                displayNameOverride,
                enumValues,
                featureId,
                hasSoftLimit,
                hasUnlimitedUsage,
                hiddenFromWidgets,
                isCustom,
                isGranted,
                order,
                resetPeriod,
                resetPeriodConfiguration,
                type,
                updatedAt,
                usageLimit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, amount=$amount, behavior=$behavior, cadence=$cadence, createdAt=$createdAt, customCurrencyId=$customCurrencyId, description=$description, displayNameOverride=$displayNameOverride, enumValues=$enumValues, featureId=$featureId, hasSoftLimit=$hasSoftLimit, hasUnlimitedUsage=$hasUnlimitedUsage, hiddenFromWidgets=$hiddenFromWidgets, isCustom=$isCustom, isGranted=$isGranted, order=$order, resetPeriod=$resetPeriod, resetPeriodConfiguration=$resetPeriodConfiguration, type=$type, updatedAt=$updatedAt, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanEntitlement &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanEntitlement{data=$data, additionalProperties=$additionalProperties}"
}
