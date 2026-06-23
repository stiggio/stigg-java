// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons.entitlements

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
class EntitlementCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * Returns a mutable builder for constructing an instance of [EntitlementCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntitlementCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entitlementCreateResponse: EntitlementCreateResponse) = apply {
            data = entitlementCreateResponse.data.map { it.toMutableList() }
            additionalProperties = entitlementCreateResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /** Alias for calling [addData] with `Data.ofFeature(feature)`. */
        fun addData(feature: Data.Feature) = addData(Data.ofFeature(feature))

        /** Alias for calling [addData] with `Data.ofCredit(credit)`. */
        fun addData(credit: Data.Credit) = addData(Data.ofCredit(credit))

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
         * Returns an immutable instance of [EntitlementCreateResponse].
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
        fun build(): EntitlementCreateResponse =
            EntitlementCreateResponse(
                checkRequired("data", data).map { it.toImmutable() },
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
    fun validate(): EntitlementCreateResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Feature entitlement response */
    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val feature: Feature? = null,
        private val credit: Credit? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Feature entitlement response */
        fun feature(): Optional<Feature> = Optional.ofNullable(feature)

        /** Credit entitlement response */
        fun credit(): Optional<Credit> = Optional.ofNullable(credit)

        fun isFeature(): Boolean = feature != null

        fun isCredit(): Boolean = credit != null

        /** Feature entitlement response */
        fun asFeature(): Feature = feature.getOrThrow("feature")

        /** Credit entitlement response */
        fun asCredit(): Credit = credit.getOrThrow("credit")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import io.stigg.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = data.accept(new Data.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitFeature(Feature feature) {
         *         return Optional.of(feature.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws StiggInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
         *   the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                feature != null -> visitor.visitFeature(feature)
                credit != null -> visitor.visitCredit(credit)
                else -> visitor.unknown(_json)
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

            accept(
                object : Visitor<Unit> {
                    override fun visitFeature(feature: Feature) {
                        feature.validate()
                    }

                    override fun visitCredit(credit: Credit) {
                        credit.validate()
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
                    override fun visitFeature(feature: Feature) = feature.validity()

                    override fun visitCredit(credit: Credit) = credit.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data && feature == other.feature && credit == other.credit
        }

        override fun hashCode(): Int = Objects.hash(feature, credit)

        override fun toString(): String =
            when {
                feature != null -> "Data{feature=$feature}"
                credit != null -> "Data{credit=$credit}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            /** Feature entitlement response */
            @JvmStatic fun ofFeature(feature: Feature) = Data(feature = feature)

            /** Credit entitlement response */
            @JvmStatic fun ofCredit(credit: Credit) = Data(credit = credit)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            /** Feature entitlement response */
            fun visitFeature(feature: Feature): T

            /** Credit entitlement response */
            fun visitCredit(credit: Credit): T

            /**
             * Maps an unknown variant of [Data] to a value of type [T].
             *
             * An instance of [Data] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws StiggInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw StiggInvalidDataException("Unknown Data: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Data>(Data::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Data {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "FEATURE" -> {
                        return tryDeserialize(node, jacksonTypeRef<Feature>())?.let {
                            Data(feature = it, _json = json)
                        } ?: Data(_json = json)
                    }
                    "CREDIT" -> {
                        return tryDeserialize(node, jacksonTypeRef<Credit>())?.let {
                            Data(credit = it, _json = json)
                        } ?: Data(_json = json)
                    }
                }

                return Data(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.feature != null -> generator.writeObject(value.feature)
                    value.credit != null -> generator.writeObject(value.credit)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

        /** Feature entitlement response */
        class Feature
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val behavior: JsonField<Behavior>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val description: JsonField<String>,
            private val displayNameOverride: JsonField<String>,
            private val enumValues: JsonField<List<String>>,
            private val hasSoftLimit: JsonField<Boolean>,
            private val hasUnlimitedUsage: JsonField<Boolean>,
            private val hiddenFromWidgets: JsonField<List<HiddenFromWidget>>,
            private val isCustom: JsonField<Boolean>,
            private val isGranted: JsonField<Boolean>,
            private val order: JsonField<Double>,
            private val resetPeriod: JsonField<ResetPeriod>,
            private val resetPeriodConfiguration: JsonField<ResetPeriodConfiguration>,
            private val type: JsonValue,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val usageLimit: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("behavior")
                @ExcludeMissing
                behavior: JsonField<Behavior> = JsonMissing.of(),
                @JsonProperty("createdAt")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("displayNameOverride")
                @ExcludeMissing
                displayNameOverride: JsonField<String> = JsonMissing.of(),
                @JsonProperty("enumValues")
                @ExcludeMissing
                enumValues: JsonField<List<String>> = JsonMissing.of(),
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
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("updatedAt")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("usageLimit")
                @ExcludeMissing
                usageLimit: JsonField<Double> = JsonMissing.of(),
            ) : this(
                id,
                behavior,
                createdAt,
                description,
                displayNameOverride,
                enumValues,
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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Entitlement behavior (Increment or Override)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun behavior(): Behavior = behavior.getRequired("behavior")

            /**
             * Timestamp of when the record was created
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

            /**
             * Optional description of the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Override display name for the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun displayNameOverride(): Optional<String> =
                displayNameOverride.getOptional("displayNameOverride")

            /**
             * Allowed enum values (for feature entitlements)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun enumValues(): Optional<List<String>> = enumValues.getOptional("enumValues")

            /**
             * Whether the usage limit is a soft limit (for feature entitlements)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasSoftLimit(): Optional<Boolean> = hasSoftLimit.getOptional("hasSoftLimit")

            /**
             * Whether usage is unlimited (for feature entitlements)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasUnlimitedUsage(): Optional<Boolean> =
                hasUnlimitedUsage.getOptional("hasUnlimitedUsage")

            /**
             * Widget types where this entitlement is hidden
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun hiddenFromWidgets(): List<HiddenFromWidget> =
                hiddenFromWidgets.getRequired("hiddenFromWidgets")

            /**
             * Whether this is a custom entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isCustom(): Optional<Boolean> = isCustom.getOptional("isCustom")

            /**
             * Whether the entitlement is granted
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isGranted(): Boolean = isGranted.getRequired("isGranted")

            /**
             * Display order of the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun order(): Optional<Double> = order.getOptional("order")

            /**
             * Usage reset period (for feature entitlements)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun resetPeriod(): Optional<ResetPeriod> = resetPeriod.getOptional("resetPeriod")

            /**
             * Reset period configuration (for feature entitlements)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun resetPeriodConfiguration(): Optional<ResetPeriodConfiguration> =
                resetPeriodConfiguration.getOptional("resetPeriodConfiguration")

            /**
             * Entitlement type (FEATURE or CREDIT)
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("FEATURE")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Timestamp of when the record was last updated
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

            /**
             * Usage limit (for feature entitlements)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usageLimit(): Optional<Double> = usageLimit.getOptional("usageLimit")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [behavior].
             *
             * Unlike [behavior], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("behavior")
            @ExcludeMissing
            fun _behavior(): JsonField<Behavior> = behavior

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("createdAt")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [enumValues], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("enumValues")
            @ExcludeMissing
            fun _enumValues(): JsonField<List<String>> = enumValues

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
             * Returns the raw JSON value of [hiddenFromWidgets].
             *
             * Unlike [hiddenFromWidgets], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("hiddenFromWidgets")
            @ExcludeMissing
            fun _hiddenFromWidgets(): JsonField<List<HiddenFromWidget>> = hiddenFromWidgets

            /**
             * Returns the raw JSON value of [isCustom].
             *
             * Unlike [isCustom], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("isCustom") @ExcludeMissing fun _isCustom(): JsonField<Boolean> = isCustom

            /**
             * Returns the raw JSON value of [isGranted].
             *
             * Unlike [isGranted], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("isGranted")
            @ExcludeMissing
            fun _isGranted(): JsonField<Boolean> = isGranted

            /**
             * Returns the raw JSON value of [order].
             *
             * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Double> = order

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
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updatedAt")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

            /**
             * Returns the raw JSON value of [usageLimit].
             *
             * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [Feature].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .behavior()
                 * .createdAt()
                 * .description()
                 * .displayNameOverride()
                 * .enumValues()
                 * .hasSoftLimit()
                 * .hasUnlimitedUsage()
                 * .hiddenFromWidgets()
                 * .isCustom()
                 * .isGranted()
                 * .order()
                 * .resetPeriod()
                 * .resetPeriodConfiguration()
                 * .updatedAt()
                 * .usageLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Feature]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var behavior: JsonField<Behavior>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var description: JsonField<String>? = null
                private var displayNameOverride: JsonField<String>? = null
                private var enumValues: JsonField<MutableList<String>>? = null
                private var hasSoftLimit: JsonField<Boolean>? = null
                private var hasUnlimitedUsage: JsonField<Boolean>? = null
                private var hiddenFromWidgets: JsonField<MutableList<HiddenFromWidget>>? = null
                private var isCustom: JsonField<Boolean>? = null
                private var isGranted: JsonField<Boolean>? = null
                private var order: JsonField<Double>? = null
                private var resetPeriod: JsonField<ResetPeriod>? = null
                private var resetPeriodConfiguration: JsonField<ResetPeriodConfiguration>? = null
                private var type: JsonValue = JsonValue.from("FEATURE")
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var usageLimit: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(feature: Feature) = apply {
                    id = feature.id
                    behavior = feature.behavior
                    createdAt = feature.createdAt
                    description = feature.description
                    displayNameOverride = feature.displayNameOverride
                    enumValues = feature.enumValues.map { it.toMutableList() }
                    hasSoftLimit = feature.hasSoftLimit
                    hasUnlimitedUsage = feature.hasUnlimitedUsage
                    hiddenFromWidgets = feature.hiddenFromWidgets.map { it.toMutableList() }
                    isCustom = feature.isCustom
                    isGranted = feature.isGranted
                    order = feature.order
                    resetPeriod = feature.resetPeriod
                    resetPeriodConfiguration = feature.resetPeriodConfiguration
                    type = feature.type
                    updatedAt = feature.updatedAt
                    usageLimit = feature.usageLimit
                    additionalProperties = feature.additionalProperties.toMutableMap()
                }

                /** Unique identifier of the entitlement */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Entitlement behavior (Increment or Override) */
                fun behavior(behavior: Behavior) = behavior(JsonField.of(behavior))

                /**
                 * Sets [Builder.behavior] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.behavior] with a well-typed [Behavior] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun behavior(behavior: JsonField<Behavior>) = apply { this.behavior = behavior }

                /** Timestamp of when the record was created */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Optional description of the entitlement */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** Alias for calling [Builder.description] with `description.orElse(null)`. */
                fun description(description: Optional<String>) =
                    description(description.getOrNull())

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun displayNameOverride(displayNameOverride: JsonField<String>) = apply {
                    this.displayNameOverride = displayNameOverride
                }

                /** Allowed enum values (for feature entitlements) */
                fun enumValues(enumValues: List<String>?) =
                    enumValues(JsonField.ofNullable(enumValues))

                /** Alias for calling [Builder.enumValues] with `enumValues.orElse(null)`. */
                fun enumValues(enumValues: Optional<List<String>>) =
                    enumValues(enumValues.getOrNull())

                /**
                 * Sets [Builder.enumValues] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enumValues] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Alias for calling [Builder.hasUnlimitedUsage] with
                 * `hasUnlimitedUsage.orElse(null)`.
                 */
                fun hasUnlimitedUsage(hasUnlimitedUsage: Optional<Boolean>) =
                    hasUnlimitedUsage(hasUnlimitedUsage.getOrNull())

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
                fun hiddenFromWidgets(hiddenFromWidgets: JsonField<List<HiddenFromWidget>>) =
                    apply {
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
                 * You should usually call [Builder.isCustom] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isCustom(isCustom: JsonField<Boolean>) = apply { this.isCustom = isCustom }

                /** Whether the entitlement is granted */
                fun isGranted(isGranted: Boolean) = isGranted(JsonField.of(isGranted))

                /**
                 * Sets [Builder.isGranted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isGranted] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.resetPeriod] with a well-typed [ResetPeriod]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * [ResetPeriodConfiguration] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
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
                        ResetPeriodConfiguration.ofMonthlyResetPeriodConfig(
                            monthlyResetPeriodConfig
                        )
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("FEATURE")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /** Timestamp of when the record was last updated */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usageLimit(usageLimit: JsonField<Double>) = apply {
                    this.usageLimit = usageLimit
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
                 * Returns an immutable instance of [Feature].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .behavior()
                 * .createdAt()
                 * .description()
                 * .displayNameOverride()
                 * .enumValues()
                 * .hasSoftLimit()
                 * .hasUnlimitedUsage()
                 * .hiddenFromWidgets()
                 * .isCustom()
                 * .isGranted()
                 * .order()
                 * .resetPeriod()
                 * .resetPeriodConfiguration()
                 * .updatedAt()
                 * .usageLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Feature =
                    Feature(
                        checkRequired("id", id),
                        checkRequired("behavior", behavior),
                        checkRequired("createdAt", createdAt),
                        checkRequired("description", description),
                        checkRequired("displayNameOverride", displayNameOverride),
                        checkRequired("enumValues", enumValues).map { it.toImmutable() },
                        checkRequired("hasSoftLimit", hasSoftLimit),
                        checkRequired("hasUnlimitedUsage", hasUnlimitedUsage),
                        checkRequired("hiddenFromWidgets", hiddenFromWidgets).map {
                            it.toImmutable()
                        },
                        checkRequired("isCustom", isCustom),
                        checkRequired("isGranted", isGranted),
                        checkRequired("order", order),
                        checkRequired("resetPeriod", resetPeriod),
                        checkRequired("resetPeriodConfiguration", resetPeriodConfiguration),
                        type,
                        checkRequired("updatedAt", updatedAt),
                        checkRequired("usageLimit", usageLimit),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Feature = apply {
                if (validated) {
                    return@apply
                }

                id()
                behavior().validate()
                createdAt()
                description()
                displayNameOverride()
                enumValues()
                hasSoftLimit()
                hasUnlimitedUsage()
                hiddenFromWidgets().forEach { it.validate() }
                isCustom()
                isGranted()
                order()
                resetPeriod().ifPresent { it.validate() }
                resetPeriodConfiguration().ifPresent { it.validate() }
                _type().let {
                    if (it != JsonValue.from("FEATURE")) {
                        throw StiggInvalidDataException("'type' is invalid, received $it")
                    }
                }
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
                    (behavior.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (displayNameOverride.asKnown().isPresent) 1 else 0) +
                    (enumValues.asKnown().getOrNull()?.size ?: 0) +
                    (if (hasSoftLimit.asKnown().isPresent) 1 else 0) +
                    (if (hasUnlimitedUsage.asKnown().isPresent) 1 else 0) +
                    (hiddenFromWidgets.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (if (isCustom.asKnown().isPresent) 1 else 0) +
                    (if (isGranted.asKnown().isPresent) 1 else 0) +
                    (if (order.asKnown().isPresent) 1 else 0) +
                    (resetPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                    (resetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("FEATURE")) 1 else 0 } +
                    (if (updatedAt.asKnown().isPresent) 1 else 0) +
                    (if (usageLimit.asKnown().isPresent) 1 else 0)

            /** Entitlement behavior (Increment or Override) */
            class Behavior @JsonCreator private constructor(private val value: JsonField<String>) :
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INCREMENT,
                    OVERRIDE,
                    /**
                     * An enum member indicating that [Behavior] was instantiated with an unknown
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
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws StiggInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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

            class HiddenFromWidget
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
                 * An instance of [HiddenFromWidget] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws StiggInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws StiggInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import io.stigg.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = resetPeriodConfiguration.accept(new ResetPeriodConfiguration.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitYearlyResetPeriodConfig(YearlyResetPeriodConfig yearlyResetPeriodConfig) {
                 *         return Optional.of(yearlyResetPeriodConfig.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws StiggInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws StiggInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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
                    fun ofYearlyResetPeriodConfig(
                        yearlyResetPeriodConfig: YearlyResetPeriodConfig
                    ) = ResetPeriodConfiguration(yearlyResetPeriodConfig = yearlyResetPeriodConfig)

                    /** Monthly reset configuration */
                    @JvmStatic
                    fun ofMonthlyResetPeriodConfig(
                        monthlyResetPeriodConfig: MonthlyResetPeriodConfig
                    ) =
                        ResetPeriodConfiguration(
                            monthlyResetPeriodConfig = monthlyResetPeriodConfig
                        )

                    /** Weekly reset configuration */
                    @JvmStatic
                    fun ofWeeklyResetPeriodConfig(
                        weeklyResetPeriodConfig: WeeklyResetPeriodConfig
                    ) = ResetPeriodConfiguration(weeklyResetPeriodConfig = weeklyResetPeriodConfig)
                }

                /**
                 * An interface that defines how to map each variant of [ResetPeriodConfiguration]
                 * to a value of type [T].
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
                     * An instance of [ResetPeriodConfiguration] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
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
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> ResetPeriodConfiguration(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
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
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(yearlyResetPeriodConfig: YearlyResetPeriodConfig) =
                            apply {
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
                         * You should usually call [Builder.accordingTo] with a well-typed
                         * [AccordingTo] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun accordingTo(accordingTo: JsonField<AccordingTo>) = apply {
                            this.accordingTo = accordingTo
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StiggInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
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
                    internal fun validity(): Int =
                        (accordingTo.asKnown().getOrNull()?.validity() ?: 0)

                    /** Reset anchor (SubscriptionStart) */
                    class AccordingTo
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
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
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
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                SUBSCRIPTION_START -> Value.SUBSCRIPTION_START
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
                                SUBSCRIPTION_START -> Known.SUBSCRIPTION_START
                                else ->
                                    throw StiggInvalidDataException("Unknown AccordingTo: $value")
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

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws StiggInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
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
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(monthlyResetPeriodConfig: MonthlyResetPeriodConfig) =
                            apply {
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
                         * You should usually call [Builder.accordingTo] with a well-typed
                         * [AccordingTo] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun accordingTo(accordingTo: JsonField<AccordingTo>) = apply {
                            this.accordingTo = accordingTo
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StiggInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
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
                    internal fun validity(): Int =
                        (accordingTo.asKnown().getOrNull()?.validity() ?: 0)

                    /** Reset anchor (SubscriptionStart or StartOfTheMonth) */
                    class AccordingTo
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
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
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
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws StiggInvalidDataException if this class instance's value is a not
                         *   a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                SUBSCRIPTION_START -> Known.SUBSCRIPTION_START
                                START_OF_THE_MONTH -> Known.START_OF_THE_MONTH
                                else ->
                                    throw StiggInvalidDataException("Unknown AccordingTo: $value")
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

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws StiggInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
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
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(weeklyResetPeriodConfig: WeeklyResetPeriodConfig) =
                            apply {
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
                         * You should usually call [Builder.accordingTo] with a well-typed
                         * [AccordingTo] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun accordingTo(accordingTo: JsonField<AccordingTo>) = apply {
                            this.accordingTo = accordingTo
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StiggInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
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
                    internal fun validity(): Int =
                        (accordingTo.asKnown().getOrNull()?.validity() ?: 0)

                    /** Reset anchor (SubscriptionStart or specific day) */
                    class AccordingTo
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
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
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
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws StiggInvalidDataException if this class instance's value is a not
                         *   a known member.
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
                                else ->
                                    throw StiggInvalidDataException("Unknown AccordingTo: $value")
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

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws StiggInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Feature &&
                    id == other.id &&
                    behavior == other.behavior &&
                    createdAt == other.createdAt &&
                    description == other.description &&
                    displayNameOverride == other.displayNameOverride &&
                    enumValues == other.enumValues &&
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
                    behavior,
                    createdAt,
                    description,
                    displayNameOverride,
                    enumValues,
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
                "Feature{id=$id, behavior=$behavior, createdAt=$createdAt, description=$description, displayNameOverride=$displayNameOverride, enumValues=$enumValues, hasSoftLimit=$hasSoftLimit, hasUnlimitedUsage=$hasUnlimitedUsage, hiddenFromWidgets=$hiddenFromWidgets, isCustom=$isCustom, isGranted=$isGranted, order=$order, resetPeriod=$resetPeriod, resetPeriodConfiguration=$resetPeriodConfiguration, type=$type, updatedAt=$updatedAt, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
        }

        /** Credit entitlement response */
        class Credit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val amount: JsonField<Double>,
            private val behavior: JsonField<Behavior>,
            private val cadence: JsonField<Cadence>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val description: JsonField<String>,
            private val displayNameOverride: JsonField<String>,
            private val hasSoftLimit: JsonField<Boolean>,
            private val hiddenFromWidgets: JsonField<List<HiddenFromWidget>>,
            private val isCustom: JsonField<Boolean>,
            private val isGranted: JsonField<Boolean>,
            private val order: JsonField<Double>,
            private val type: JsonValue,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val dependencyFeatureId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("behavior")
                @ExcludeMissing
                behavior: JsonField<Behavior> = JsonMissing.of(),
                @JsonProperty("cadence")
                @ExcludeMissing
                cadence: JsonField<Cadence> = JsonMissing.of(),
                @JsonProperty("createdAt")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("displayNameOverride")
                @ExcludeMissing
                displayNameOverride: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hasSoftLimit")
                @ExcludeMissing
                hasSoftLimit: JsonField<Boolean> = JsonMissing.of(),
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
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("updatedAt")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("dependencyFeatureId")
                @ExcludeMissing
                dependencyFeatureId: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                amount,
                behavior,
                cadence,
                createdAt,
                description,
                displayNameOverride,
                hasSoftLimit,
                hiddenFromWidgets,
                isCustom,
                isGranted,
                order,
                type,
                updatedAt,
                dependencyFeatureId,
                mutableMapOf(),
            )

            /**
             * Unique identifier of the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Credit amount (for credit entitlements)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<Double> = amount.getOptional("amount")

            /**
             * Entitlement behavior (Increment or Override)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun behavior(): Behavior = behavior.getRequired("behavior")

            /**
             * Credit grant cadence (for credit entitlements)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cadence(): Optional<Cadence> = cadence.getOptional("cadence")

            /**
             * Timestamp of when the record was created
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

            /**
             * Optional description of the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Override display name for the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun displayNameOverride(): Optional<String> =
                displayNameOverride.getOptional("displayNameOverride")

            /**
             * Whether the credit wallet is soft-limited. When true, getEntitlement returns
             * hasAccess=true past the limit; vendors decide whether to enforce. Defaults to false.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasSoftLimit(): Optional<Boolean> = hasSoftLimit.getOptional("hasSoftLimit")

            /**
             * Widget types where this entitlement is hidden
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun hiddenFromWidgets(): List<HiddenFromWidget> =
                hiddenFromWidgets.getRequired("hiddenFromWidgets")

            /**
             * Whether this is a custom entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isCustom(): Optional<Boolean> = isCustom.getOptional("isCustom")

            /**
             * Whether the entitlement is granted
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isGranted(): Boolean = isGranted.getRequired("isGranted")

            /**
             * Display order of the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun order(): Optional<Double> = order.getOptional("order")

            /**
             * Entitlement type (FEATURE or CREDIT)
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("CREDIT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Timestamp of when the record was last updated
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

            /**
             * The feature ID this entitlement depends on (for credit entitlements). The entitlement
             * value will be calculated as: base amount × dependency feature usage limit
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun dependencyFeatureId(): Optional<String> =
                dependencyFeatureId.getOptional("dependencyFeatureId")

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
             * Unlike [behavior], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("behavior")
            @ExcludeMissing
            fun _behavior(): JsonField<Behavior> = behavior

            /**
             * Returns the raw JSON value of [cadence].
             *
             * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("createdAt")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Returns the raw JSON value of [hasSoftLimit].
             *
             * Unlike [hasSoftLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("hasSoftLimit")
            @ExcludeMissing
            fun _hasSoftLimit(): JsonField<Boolean> = hasSoftLimit

            /**
             * Returns the raw JSON value of [hiddenFromWidgets].
             *
             * Unlike [hiddenFromWidgets], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("hiddenFromWidgets")
            @ExcludeMissing
            fun _hiddenFromWidgets(): JsonField<List<HiddenFromWidget>> = hiddenFromWidgets

            /**
             * Returns the raw JSON value of [isCustom].
             *
             * Unlike [isCustom], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("isCustom") @ExcludeMissing fun _isCustom(): JsonField<Boolean> = isCustom

            /**
             * Returns the raw JSON value of [isGranted].
             *
             * Unlike [isGranted], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("isGranted")
            @ExcludeMissing
            fun _isGranted(): JsonField<Boolean> = isGranted

            /**
             * Returns the raw JSON value of [order].
             *
             * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Double> = order

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updatedAt")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

            /**
             * Returns the raw JSON value of [dependencyFeatureId].
             *
             * Unlike [dependencyFeatureId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("dependencyFeatureId")
            @ExcludeMissing
            fun _dependencyFeatureId(): JsonField<String> = dependencyFeatureId

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
                 * Returns a mutable builder for constructing an instance of [Credit].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .amount()
                 * .behavior()
                 * .cadence()
                 * .createdAt()
                 * .description()
                 * .displayNameOverride()
                 * .hasSoftLimit()
                 * .hiddenFromWidgets()
                 * .isCustom()
                 * .isGranted()
                 * .order()
                 * .updatedAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Credit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var amount: JsonField<Double>? = null
                private var behavior: JsonField<Behavior>? = null
                private var cadence: JsonField<Cadence>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var description: JsonField<String>? = null
                private var displayNameOverride: JsonField<String>? = null
                private var hasSoftLimit: JsonField<Boolean>? = null
                private var hiddenFromWidgets: JsonField<MutableList<HiddenFromWidget>>? = null
                private var isCustom: JsonField<Boolean>? = null
                private var isGranted: JsonField<Boolean>? = null
                private var order: JsonField<Double>? = null
                private var type: JsonValue = JsonValue.from("CREDIT")
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var dependencyFeatureId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(credit: Credit) = apply {
                    id = credit.id
                    amount = credit.amount
                    behavior = credit.behavior
                    cadence = credit.cadence
                    createdAt = credit.createdAt
                    description = credit.description
                    displayNameOverride = credit.displayNameOverride
                    hasSoftLimit = credit.hasSoftLimit
                    hiddenFromWidgets = credit.hiddenFromWidgets.map { it.toMutableList() }
                    isCustom = credit.isCustom
                    isGranted = credit.isGranted
                    order = credit.order
                    type = credit.type
                    updatedAt = credit.updatedAt
                    dependencyFeatureId = credit.dependencyFeatureId
                    additionalProperties = credit.additionalProperties.toMutableMap()
                }

                /** Unique identifier of the entitlement */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** Entitlement behavior (Increment or Override) */
                fun behavior(behavior: Behavior) = behavior(JsonField.of(behavior))

                /**
                 * Sets [Builder.behavior] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.behavior] with a well-typed [Behavior] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun behavior(behavior: JsonField<Behavior>) = apply { this.behavior = behavior }

                /** Credit grant cadence (for credit entitlements) */
                fun cadence(cadence: Cadence?) = cadence(JsonField.ofNullable(cadence))

                /** Alias for calling [Builder.cadence] with `cadence.orElse(null)`. */
                fun cadence(cadence: Optional<Cadence>) = cadence(cadence.getOrNull())

                /**
                 * Sets [Builder.cadence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                /** Timestamp of when the record was created */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Optional description of the entitlement */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** Alias for calling [Builder.description] with `description.orElse(null)`. */
                fun description(description: Optional<String>) =
                    description(description.getOrNull())

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun displayNameOverride(displayNameOverride: JsonField<String>) = apply {
                    this.displayNameOverride = displayNameOverride
                }

                /**
                 * Whether the credit wallet is soft-limited. When true, getEntitlement returns
                 * hasAccess=true past the limit; vendors decide whether to enforce. Defaults to
                 * false.
                 */
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hasSoftLimit(hasSoftLimit: JsonField<Boolean>) = apply {
                    this.hasSoftLimit = hasSoftLimit
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
                fun hiddenFromWidgets(hiddenFromWidgets: JsonField<List<HiddenFromWidget>>) =
                    apply {
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
                 * You should usually call [Builder.isCustom] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isCustom(isCustom: JsonField<Boolean>) = apply { this.isCustom = isCustom }

                /** Whether the entitlement is granted */
                fun isGranted(isGranted: Boolean) = isGranted(JsonField.of(isGranted))

                /**
                 * Sets [Builder.isGranted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isGranted] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("CREDIT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /** Timestamp of when the record was last updated */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                /**
                 * The feature ID this entitlement depends on (for credit entitlements). The
                 * entitlement value will be calculated as: base amount × dependency feature usage
                 * limit
                 */
                fun dependencyFeatureId(dependencyFeatureId: String?) =
                    dependencyFeatureId(JsonField.ofNullable(dependencyFeatureId))

                /**
                 * Alias for calling [Builder.dependencyFeatureId] with
                 * `dependencyFeatureId.orElse(null)`.
                 */
                fun dependencyFeatureId(dependencyFeatureId: Optional<String>) =
                    dependencyFeatureId(dependencyFeatureId.getOrNull())

                /**
                 * Sets [Builder.dependencyFeatureId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dependencyFeatureId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dependencyFeatureId(dependencyFeatureId: JsonField<String>) = apply {
                    this.dependencyFeatureId = dependencyFeatureId
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
                 * Returns an immutable instance of [Credit].
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
                 * .description()
                 * .displayNameOverride()
                 * .hasSoftLimit()
                 * .hiddenFromWidgets()
                 * .isCustom()
                 * .isGranted()
                 * .order()
                 * .updatedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Credit =
                    Credit(
                        checkRequired("id", id),
                        checkRequired("amount", amount),
                        checkRequired("behavior", behavior),
                        checkRequired("cadence", cadence),
                        checkRequired("createdAt", createdAt),
                        checkRequired("description", description),
                        checkRequired("displayNameOverride", displayNameOverride),
                        checkRequired("hasSoftLimit", hasSoftLimit),
                        checkRequired("hiddenFromWidgets", hiddenFromWidgets).map {
                            it.toImmutable()
                        },
                        checkRequired("isCustom", isCustom),
                        checkRequired("isGranted", isGranted),
                        checkRequired("order", order),
                        type,
                        checkRequired("updatedAt", updatedAt),
                        dependencyFeatureId,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Credit = apply {
                if (validated) {
                    return@apply
                }

                id()
                amount()
                behavior().validate()
                cadence().ifPresent { it.validate() }
                createdAt()
                description()
                displayNameOverride()
                hasSoftLimit()
                hiddenFromWidgets().forEach { it.validate() }
                isCustom()
                isGranted()
                order()
                _type().let {
                    if (it != JsonValue.from("CREDIT")) {
                        throw StiggInvalidDataException("'type' is invalid, received $it")
                    }
                }
                updatedAt()
                dependencyFeatureId()
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
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (displayNameOverride.asKnown().isPresent) 1 else 0) +
                    (if (hasSoftLimit.asKnown().isPresent) 1 else 0) +
                    (hiddenFromWidgets.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (if (isCustom.asKnown().isPresent) 1 else 0) +
                    (if (isGranted.asKnown().isPresent) 1 else 0) +
                    (if (order.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("CREDIT")) 1 else 0 } +
                    (if (updatedAt.asKnown().isPresent) 1 else 0) +
                    (if (dependencyFeatureId.asKnown().isPresent) 1 else 0)

            /** Entitlement behavior (Increment or Override) */
            class Behavior @JsonCreator private constructor(private val value: JsonField<String>) :
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INCREMENT,
                    OVERRIDE,
                    /**
                     * An enum member indicating that [Behavior] was instantiated with an unknown
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
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws StiggInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONTH,
                    YEAR,
                    /**
                     * An enum member indicating that [Cadence] was instantiated with an unknown
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
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws StiggInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An instance of [HiddenFromWidget] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws StiggInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Credit &&
                    id == other.id &&
                    amount == other.amount &&
                    behavior == other.behavior &&
                    cadence == other.cadence &&
                    createdAt == other.createdAt &&
                    description == other.description &&
                    displayNameOverride == other.displayNameOverride &&
                    hasSoftLimit == other.hasSoftLimit &&
                    hiddenFromWidgets == other.hiddenFromWidgets &&
                    isCustom == other.isCustom &&
                    isGranted == other.isGranted &&
                    order == other.order &&
                    type == other.type &&
                    updatedAt == other.updatedAt &&
                    dependencyFeatureId == other.dependencyFeatureId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    amount,
                    behavior,
                    cadence,
                    createdAt,
                    description,
                    displayNameOverride,
                    hasSoftLimit,
                    hiddenFromWidgets,
                    isCustom,
                    isGranted,
                    order,
                    type,
                    updatedAt,
                    dependencyFeatureId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Credit{id=$id, amount=$amount, behavior=$behavior, cadence=$cadence, createdAt=$createdAt, description=$description, displayNameOverride=$displayNameOverride, hasSoftLimit=$hasSoftLimit, hiddenFromWidgets=$hiddenFromWidgets, isCustom=$isCustom, isGranted=$isGranted, order=$order, type=$type, updatedAt=$updatedAt, dependencyFeatureId=$dependencyFeatureId, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntitlementCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EntitlementCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
