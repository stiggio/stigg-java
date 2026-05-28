// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.customers.entitlements

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
class EntitlementCheckResponse
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
     * Feature entitlement with optional governance chains attached.
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
         * Returns a mutable builder for constructing an instance of [EntitlementCheckResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntitlementCheckResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entitlementCheckResponse: EntitlementCheckResponse) = apply {
            data = entitlementCheckResponse.data
            additionalProperties = entitlementCheckResponse.additionalProperties.toMutableMap()
        }

        /** Feature entitlement with optional governance chains attached. */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** Alias for calling [data] with `Data.ofFeature(feature)`. */
        fun data(feature: Data.Feature) = data(Data.ofFeature(feature))

        /** Alias for calling [data] with `Data.ofCredit(credit)`. */
        fun data(credit: Data.Credit) = data(Data.ofCredit(credit))

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
         * Returns an immutable instance of [EntitlementCheckResponse].
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
        fun build(): EntitlementCheckResponse =
            EntitlementCheckResponse(
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
    fun validate(): EntitlementCheckResponse = apply {
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

    /** Feature entitlement with optional governance chains attached. */
    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val feature: Feature? = null,
        private val credit: Credit? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Feature entitlement with optional governance chains attached. */
        fun feature(): Optional<Feature> = Optional.ofNullable(feature)

        /** Credit entitlement with optional governance chains attached. */
        fun credit(): Optional<Credit> = Optional.ofNullable(credit)

        fun isFeature(): Boolean = feature != null

        fun isCredit(): Boolean = credit != null

        /** Feature entitlement with optional governance chains attached. */
        fun asFeature(): Feature = feature.getOrThrow("feature")

        /** Credit entitlement with optional governance chains attached. */
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

            /** Feature entitlement with optional governance chains attached. */
            @JvmStatic fun ofFeature(feature: Feature) = Data(feature = feature)

            /** Credit entitlement with optional governance chains attached. */
            @JvmStatic fun ofCredit(credit: Credit) = Data(credit = credit)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            /** Feature entitlement with optional governance chains attached. */
            fun visitFeature(feature: Feature): T

            /** Credit entitlement with optional governance chains attached. */
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

        /** Feature entitlement with optional governance chains attached. */
        class Feature
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accessDeniedReason: JsonField<AccessDeniedReason>,
            private val isGranted: JsonField<Boolean>,
            private val type: JsonValue,
            private val chains: JsonField<List<List<BetaChainNode>>>,
            private val currentUsage: JsonField<Double>,
            private val entitlementUpdatedAt: JsonField<OffsetDateTime>,
            private val feature: JsonField<InnerFeature>,
            private val hasUnlimitedUsage: JsonField<Boolean>,
            private val resetPeriod: JsonField<ResetPeriod>,
            private val usageLimit: JsonField<Double>,
            private val usagePeriodAnchor: JsonField<OffsetDateTime>,
            private val usagePeriodEnd: JsonField<OffsetDateTime>,
            private val usagePeriodStart: JsonField<OffsetDateTime>,
            private val validUntil: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accessDeniedReason")
                @ExcludeMissing
                accessDeniedReason: JsonField<AccessDeniedReason> = JsonMissing.of(),
                @JsonProperty("isGranted")
                @ExcludeMissing
                isGranted: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("chains")
                @ExcludeMissing
                chains: JsonField<List<List<BetaChainNode>>> = JsonMissing.of(),
                @JsonProperty("currentUsage")
                @ExcludeMissing
                currentUsage: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("entitlementUpdatedAt")
                @ExcludeMissing
                entitlementUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("feature")
                @ExcludeMissing
                feature: JsonField<InnerFeature> = JsonMissing.of(),
                @JsonProperty("hasUnlimitedUsage")
                @ExcludeMissing
                hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("resetPeriod")
                @ExcludeMissing
                resetPeriod: JsonField<ResetPeriod> = JsonMissing.of(),
                @JsonProperty("usageLimit")
                @ExcludeMissing
                usageLimit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("usagePeriodAnchor")
                @ExcludeMissing
                usagePeriodAnchor: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("usagePeriodEnd")
                @ExcludeMissing
                usagePeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("usagePeriodStart")
                @ExcludeMissing
                usagePeriodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("validUntil")
                @ExcludeMissing
                validUntil: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                accessDeniedReason,
                isGranted,
                type,
                chains,
                currentUsage,
                entitlementUpdatedAt,
                feature,
                hasUnlimitedUsage,
                resetPeriod,
                usageLimit,
                usagePeriodAnchor,
                usagePeriodEnd,
                usagePeriodStart,
                validUntil,
                mutableMapOf(),
            )

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accessDeniedReason(): Optional<AccessDeniedReason> =
                accessDeniedReason.getOptional("accessDeniedReason")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isGranted(): Boolean = isGranted.getRequired("isGranted")

            /**
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
             * Per-entity rollups, one chain per resolved dimension. Omitted when dimensions was not
             * provided.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun chains(): Optional<List<List<BetaChainNode>>> = chains.getOptional("chains")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currentUsage(): Optional<Double> = currentUsage.getOptional("currentUsage")

            /**
             * Timestamp of the last update to the entitlement grant or configuration.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun entitlementUpdatedAt(): Optional<OffsetDateTime> =
                entitlementUpdatedAt.getOptional("entitlementUpdatedAt")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun feature(): Optional<InnerFeature> = feature.getOptional("feature")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasUnlimitedUsage(): Optional<Boolean> =
                hasUnlimitedUsage.getOptional("hasUnlimitedUsage")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun resetPeriod(): Optional<ResetPeriod> = resetPeriod.getOptional("resetPeriod")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usageLimit(): Optional<Double> = usageLimit.getOptional("usageLimit")

            /**
             * The anchor for calculating the usage period for metered entitlements with a reset
             * period configured
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usagePeriodAnchor(): Optional<OffsetDateTime> =
                usagePeriodAnchor.getOptional("usagePeriodAnchor")

            /**
             * The end date of the usage period for metered entitlements with a reset period
             * configured
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usagePeriodEnd(): Optional<OffsetDateTime> =
                usagePeriodEnd.getOptional("usagePeriodEnd")

            /**
             * The start date of the usage period for metered entitlements with a reset period
             * configured
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usagePeriodStart(): Optional<OffsetDateTime> =
                usagePeriodStart.getOptional("usagePeriodStart")

            /**
             * The next time the entitlement should be recalculated
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun validUntil(): Optional<OffsetDateTime> = validUntil.getOptional("validUntil")

            /**
             * Returns the raw JSON value of [accessDeniedReason].
             *
             * Unlike [accessDeniedReason], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("accessDeniedReason")
            @ExcludeMissing
            fun _accessDeniedReason(): JsonField<AccessDeniedReason> = accessDeniedReason

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
             * Returns the raw JSON value of [chains].
             *
             * Unlike [chains], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("chains")
            @ExcludeMissing
            fun _chains(): JsonField<List<List<BetaChainNode>>> = chains

            /**
             * Returns the raw JSON value of [currentUsage].
             *
             * Unlike [currentUsage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currentUsage")
            @ExcludeMissing
            fun _currentUsage(): JsonField<Double> = currentUsage

            /**
             * Returns the raw JSON value of [entitlementUpdatedAt].
             *
             * Unlike [entitlementUpdatedAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("entitlementUpdatedAt")
            @ExcludeMissing
            fun _entitlementUpdatedAt(): JsonField<OffsetDateTime> = entitlementUpdatedAt

            /**
             * Returns the raw JSON value of [feature].
             *
             * Unlike [feature], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("feature")
            @ExcludeMissing
            fun _feature(): JsonField<InnerFeature> = feature

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
             * Returns the raw JSON value of [usagePeriodAnchor].
             *
             * Unlike [usagePeriodAnchor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usagePeriodAnchor")
            @ExcludeMissing
            fun _usagePeriodAnchor(): JsonField<OffsetDateTime> = usagePeriodAnchor

            /**
             * Returns the raw JSON value of [usagePeriodEnd].
             *
             * Unlike [usagePeriodEnd], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usagePeriodEnd")
            @ExcludeMissing
            fun _usagePeriodEnd(): JsonField<OffsetDateTime> = usagePeriodEnd

            /**
             * Returns the raw JSON value of [usagePeriodStart].
             *
             * Unlike [usagePeriodStart], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usagePeriodStart")
            @ExcludeMissing
            fun _usagePeriodStart(): JsonField<OffsetDateTime> = usagePeriodStart

            /**
             * Returns the raw JSON value of [validUntil].
             *
             * Unlike [validUntil], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("validUntil")
            @ExcludeMissing
            fun _validUntil(): JsonField<OffsetDateTime> = validUntil

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
                 * .accessDeniedReason()
                 * .isGranted()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Feature]. */
            class Builder internal constructor() {

                private var accessDeniedReason: JsonField<AccessDeniedReason>? = null
                private var isGranted: JsonField<Boolean>? = null
                private var type: JsonValue = JsonValue.from("FEATURE")
                private var chains: JsonField<MutableList<List<BetaChainNode>>>? = null
                private var currentUsage: JsonField<Double> = JsonMissing.of()
                private var entitlementUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var feature: JsonField<InnerFeature> = JsonMissing.of()
                private var hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of()
                private var resetPeriod: JsonField<ResetPeriod> = JsonMissing.of()
                private var usageLimit: JsonField<Double> = JsonMissing.of()
                private var usagePeriodAnchor: JsonField<OffsetDateTime> = JsonMissing.of()
                private var usagePeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                private var usagePeriodStart: JsonField<OffsetDateTime> = JsonMissing.of()
                private var validUntil: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(feature: Feature) = apply {
                    accessDeniedReason = feature.accessDeniedReason
                    isGranted = feature.isGranted
                    type = feature.type
                    chains = feature.chains.map { it.toMutableList() }
                    currentUsage = feature.currentUsage
                    entitlementUpdatedAt = feature.entitlementUpdatedAt
                    this.feature = feature.feature
                    hasUnlimitedUsage = feature.hasUnlimitedUsage
                    resetPeriod = feature.resetPeriod
                    usageLimit = feature.usageLimit
                    usagePeriodAnchor = feature.usagePeriodAnchor
                    usagePeriodEnd = feature.usagePeriodEnd
                    usagePeriodStart = feature.usagePeriodStart
                    validUntil = feature.validUntil
                    additionalProperties = feature.additionalProperties.toMutableMap()
                }

                fun accessDeniedReason(accessDeniedReason: AccessDeniedReason?) =
                    accessDeniedReason(JsonField.ofNullable(accessDeniedReason))

                /**
                 * Alias for calling [Builder.accessDeniedReason] with
                 * `accessDeniedReason.orElse(null)`.
                 */
                fun accessDeniedReason(accessDeniedReason: Optional<AccessDeniedReason>) =
                    accessDeniedReason(accessDeniedReason.getOrNull())

                /**
                 * Sets [Builder.accessDeniedReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accessDeniedReason] with a well-typed
                 * [AccessDeniedReason] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun accessDeniedReason(accessDeniedReason: JsonField<AccessDeniedReason>) = apply {
                    this.accessDeniedReason = accessDeniedReason
                }

                fun isGranted(isGranted: Boolean) = isGranted(JsonField.of(isGranted))

                /**
                 * Sets [Builder.isGranted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isGranted] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isGranted(isGranted: JsonField<Boolean>) = apply { this.isGranted = isGranted }

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

                /**
                 * Per-entity rollups, one chain per resolved dimension. Omitted when dimensions was
                 * not provided.
                 */
                fun chains(chains: List<List<BetaChainNode>>) = chains(JsonField.of(chains))

                /**
                 * Sets [Builder.chains] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chains] with a well-typed
                 * `List<List<BetaChainNode>>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun chains(chains: JsonField<List<List<BetaChainNode>>>) = apply {
                    this.chains = chains.map { it.toMutableList() }
                }

                /**
                 * Adds a single [List<BetaChainNode>] to [chains].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addChain(chain: List<BetaChainNode>) = apply {
                    chains =
                        (chains ?: JsonField.of(mutableListOf())).also {
                            checkKnown("chains", it).add(chain)
                        }
                }

                fun currentUsage(currentUsage: Double) = currentUsage(JsonField.of(currentUsage))

                /**
                 * Sets [Builder.currentUsage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currentUsage] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currentUsage(currentUsage: JsonField<Double>) = apply {
                    this.currentUsage = currentUsage
                }

                /** Timestamp of the last update to the entitlement grant or configuration. */
                fun entitlementUpdatedAt(entitlementUpdatedAt: OffsetDateTime) =
                    entitlementUpdatedAt(JsonField.of(entitlementUpdatedAt))

                /**
                 * Sets [Builder.entitlementUpdatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entitlementUpdatedAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun entitlementUpdatedAt(entitlementUpdatedAt: JsonField<OffsetDateTime>) = apply {
                    this.entitlementUpdatedAt = entitlementUpdatedAt
                }

                fun feature(feature: InnerFeature) = feature(JsonField.of(feature))

                /**
                 * Sets [Builder.feature] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.feature] with a well-typed [InnerFeature] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun feature(feature: JsonField<InnerFeature>) = apply { this.feature = feature }

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

                /**
                 * The anchor for calculating the usage period for metered entitlements with a reset
                 * period configured
                 */
                fun usagePeriodAnchor(usagePeriodAnchor: OffsetDateTime) =
                    usagePeriodAnchor(JsonField.of(usagePeriodAnchor))

                /**
                 * Sets [Builder.usagePeriodAnchor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usagePeriodAnchor] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun usagePeriodAnchor(usagePeriodAnchor: JsonField<OffsetDateTime>) = apply {
                    this.usagePeriodAnchor = usagePeriodAnchor
                }

                /**
                 * The end date of the usage period for metered entitlements with a reset period
                 * configured
                 */
                fun usagePeriodEnd(usagePeriodEnd: OffsetDateTime) =
                    usagePeriodEnd(JsonField.of(usagePeriodEnd))

                /**
                 * Sets [Builder.usagePeriodEnd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usagePeriodEnd] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun usagePeriodEnd(usagePeriodEnd: JsonField<OffsetDateTime>) = apply {
                    this.usagePeriodEnd = usagePeriodEnd
                }

                /**
                 * The start date of the usage period for metered entitlements with a reset period
                 * configured
                 */
                fun usagePeriodStart(usagePeriodStart: OffsetDateTime) =
                    usagePeriodStart(JsonField.of(usagePeriodStart))

                /**
                 * Sets [Builder.usagePeriodStart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usagePeriodStart] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun usagePeriodStart(usagePeriodStart: JsonField<OffsetDateTime>) = apply {
                    this.usagePeriodStart = usagePeriodStart
                }

                /** The next time the entitlement should be recalculated */
                fun validUntil(validUntil: OffsetDateTime) = validUntil(JsonField.of(validUntil))

                /**
                 * Sets [Builder.validUntil] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.validUntil] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun validUntil(validUntil: JsonField<OffsetDateTime>) = apply {
                    this.validUntil = validUntil
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
                 * .accessDeniedReason()
                 * .isGranted()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Feature =
                    Feature(
                        checkRequired("accessDeniedReason", accessDeniedReason),
                        checkRequired("isGranted", isGranted),
                        type,
                        (chains ?: JsonMissing.of()).map { it.toImmutable() },
                        currentUsage,
                        entitlementUpdatedAt,
                        feature,
                        hasUnlimitedUsage,
                        resetPeriod,
                        usageLimit,
                        usagePeriodAnchor,
                        usagePeriodEnd,
                        usagePeriodStart,
                        validUntil,
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

                accessDeniedReason().ifPresent { it.validate() }
                isGranted()
                _type().let {
                    if (it != JsonValue.from("FEATURE")) {
                        throw StiggInvalidDataException("'type' is invalid, received $it")
                    }
                }
                chains().ifPresent { it.forEach { it.forEach { it.validate() } } }
                currentUsage()
                entitlementUpdatedAt()
                feature().ifPresent { it.validate() }
                hasUnlimitedUsage()
                resetPeriod().ifPresent { it.validate() }
                usageLimit()
                usagePeriodAnchor()
                usagePeriodEnd()
                usagePeriodStart()
                validUntil()
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
                (accessDeniedReason.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (isGranted.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("FEATURE")) 1 else 0 } +
                    (chains.asKnown().getOrNull()?.sumOf {
                        it.sumOf { it.validity().toInt() }.toInt()
                    } ?: 0) +
                    (if (currentUsage.asKnown().isPresent) 1 else 0) +
                    (if (entitlementUpdatedAt.asKnown().isPresent) 1 else 0) +
                    (feature.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (hasUnlimitedUsage.asKnown().isPresent) 1 else 0) +
                    (resetPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (usageLimit.asKnown().isPresent) 1 else 0) +
                    (if (usagePeriodAnchor.asKnown().isPresent) 1 else 0) +
                    (if (usagePeriodEnd.asKnown().isPresent) 1 else 0) +
                    (if (usagePeriodStart.asKnown().isPresent) 1 else 0) +
                    (if (validUntil.asKnown().isPresent) 1 else 0)

            class AccessDeniedReason
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

                    @JvmField val FEATURE_NOT_FOUND = of("FeatureNotFound")

                    @JvmField val CUSTOMER_NOT_FOUND = of("CustomerNotFound")

                    @JvmField val CUSTOMER_IS_ARCHIVED = of("CustomerIsArchived")

                    @JvmField val CUSTOMER_RESOURCE_NOT_FOUND = of("CustomerResourceNotFound")

                    @JvmField val NO_ACTIVE_SUBSCRIPTION = of("NoActiveSubscription")

                    @JvmField
                    val NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION =
                        of("NoFeatureEntitlementInSubscription")

                    @JvmField
                    val REQUESTED_USAGE_EXCEEDING_LIMIT = of("RequestedUsageExceedingLimit")

                    @JvmField val REQUESTED_VALUES_MISMATCH = of("RequestedValuesMismatch")

                    @JvmField val BUDGET_EXCEEDED = of("BudgetExceeded")

                    @JvmField val UNKNOWN = of("Unknown")

                    @JvmField val FEATURE_TYPE_MISMATCH = of("FeatureTypeMismatch")

                    @JvmField val REVOKED = of("Revoked")

                    @JvmField val INSUFFICIENT_CREDITS = of("InsufficientCredits")

                    @JvmField val ENTITLEMENT_NOT_FOUND = of("EntitlementNotFound")

                    @JvmStatic fun of(value: String) = AccessDeniedReason(JsonField.of(value))
                }

                /** An enum containing [AccessDeniedReason]'s known values. */
                enum class Known {
                    FEATURE_NOT_FOUND,
                    CUSTOMER_NOT_FOUND,
                    CUSTOMER_IS_ARCHIVED,
                    CUSTOMER_RESOURCE_NOT_FOUND,
                    NO_ACTIVE_SUBSCRIPTION,
                    NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION,
                    REQUESTED_USAGE_EXCEEDING_LIMIT,
                    REQUESTED_VALUES_MISMATCH,
                    BUDGET_EXCEEDED,
                    UNKNOWN,
                    FEATURE_TYPE_MISMATCH,
                    REVOKED,
                    INSUFFICIENT_CREDITS,
                    ENTITLEMENT_NOT_FOUND,
                }

                /**
                 * An enum containing [AccessDeniedReason]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AccessDeniedReason] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FEATURE_NOT_FOUND,
                    CUSTOMER_NOT_FOUND,
                    CUSTOMER_IS_ARCHIVED,
                    CUSTOMER_RESOURCE_NOT_FOUND,
                    NO_ACTIVE_SUBSCRIPTION,
                    NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION,
                    REQUESTED_USAGE_EXCEEDING_LIMIT,
                    REQUESTED_VALUES_MISMATCH,
                    BUDGET_EXCEEDED,
                    UNKNOWN,
                    FEATURE_TYPE_MISMATCH,
                    REVOKED,
                    INSUFFICIENT_CREDITS,
                    ENTITLEMENT_NOT_FOUND,
                    /**
                     * An enum member indicating that [AccessDeniedReason] was instantiated with an
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
                        FEATURE_NOT_FOUND -> Value.FEATURE_NOT_FOUND
                        CUSTOMER_NOT_FOUND -> Value.CUSTOMER_NOT_FOUND
                        CUSTOMER_IS_ARCHIVED -> Value.CUSTOMER_IS_ARCHIVED
                        CUSTOMER_RESOURCE_NOT_FOUND -> Value.CUSTOMER_RESOURCE_NOT_FOUND
                        NO_ACTIVE_SUBSCRIPTION -> Value.NO_ACTIVE_SUBSCRIPTION
                        NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION ->
                            Value.NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION
                        REQUESTED_USAGE_EXCEEDING_LIMIT -> Value.REQUESTED_USAGE_EXCEEDING_LIMIT
                        REQUESTED_VALUES_MISMATCH -> Value.REQUESTED_VALUES_MISMATCH
                        BUDGET_EXCEEDED -> Value.BUDGET_EXCEEDED
                        UNKNOWN -> Value.UNKNOWN
                        FEATURE_TYPE_MISMATCH -> Value.FEATURE_TYPE_MISMATCH
                        REVOKED -> Value.REVOKED
                        INSUFFICIENT_CREDITS -> Value.INSUFFICIENT_CREDITS
                        ENTITLEMENT_NOT_FOUND -> Value.ENTITLEMENT_NOT_FOUND
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
                        FEATURE_NOT_FOUND -> Known.FEATURE_NOT_FOUND
                        CUSTOMER_NOT_FOUND -> Known.CUSTOMER_NOT_FOUND
                        CUSTOMER_IS_ARCHIVED -> Known.CUSTOMER_IS_ARCHIVED
                        CUSTOMER_RESOURCE_NOT_FOUND -> Known.CUSTOMER_RESOURCE_NOT_FOUND
                        NO_ACTIVE_SUBSCRIPTION -> Known.NO_ACTIVE_SUBSCRIPTION
                        NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION ->
                            Known.NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION
                        REQUESTED_USAGE_EXCEEDING_LIMIT -> Known.REQUESTED_USAGE_EXCEEDING_LIMIT
                        REQUESTED_VALUES_MISMATCH -> Known.REQUESTED_VALUES_MISMATCH
                        BUDGET_EXCEEDED -> Known.BUDGET_EXCEEDED
                        UNKNOWN -> Known.UNKNOWN
                        FEATURE_TYPE_MISMATCH -> Known.FEATURE_TYPE_MISMATCH
                        REVOKED -> Known.REVOKED
                        INSUFFICIENT_CREDITS -> Known.INSUFFICIENT_CREDITS
                        ENTITLEMENT_NOT_FOUND -> Known.ENTITLEMENT_NOT_FOUND
                        else ->
                            throw StiggInvalidDataException("Unknown AccessDeniedReason: $value")
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
                fun validate(): AccessDeniedReason = apply {
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

                    return other is AccessDeniedReason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Per-entity governance node — limit and current usage for a single resolved entity.
             */
            class BetaChainNode
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val currentUsage: JsonField<Double>,
                private val entityId: JsonField<String>,
                private val isGranted: JsonField<Boolean>,
                private val usageLimit: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("currentUsage")
                    @ExcludeMissing
                    currentUsage: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("entityId")
                    @ExcludeMissing
                    entityId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("isGranted")
                    @ExcludeMissing
                    isGranted: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("usageLimit")
                    @ExcludeMissing
                    usageLimit: JsonField<Double> = JsonMissing.of(),
                ) : this(currentUsage, entityId, isGranted, usageLimit, mutableMapOf())

                /**
                 * Amount consumed by this entity in the current cadence period.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currentUsage(): Double = currentUsage.getRequired("currentUsage")

                /**
                 * External id of the entity within the customer.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun entityId(): String = entityId.getRequired("entityId")

                /**
                 * Whether this node alone permits the requested usage.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isGranted(): Boolean = isGranted.getRequired("isGranted")

                /**
                 * Hard usage limit for this node; null when no assignment is configured.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun usageLimit(): Optional<Double> = usageLimit.getOptional("usageLimit")

                /**
                 * Returns the raw JSON value of [currentUsage].
                 *
                 * Unlike [currentUsage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("currentUsage")
                @ExcludeMissing
                fun _currentUsage(): JsonField<Double> = currentUsage

                /**
                 * Returns the raw JSON value of [entityId].
                 *
                 * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("entityId")
                @ExcludeMissing
                fun _entityId(): JsonField<String> = entityId

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
                 * Returns the raw JSON value of [usageLimit].
                 *
                 * Unlike [usageLimit], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                     * Returns a mutable builder for constructing an instance of [BetaChainNode].
                     *
                     * The following fields are required:
                     * ```java
                     * .currentUsage()
                     * .entityId()
                     * .isGranted()
                     * .usageLimit()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [BetaChainNode]. */
                class Builder internal constructor() {

                    private var currentUsage: JsonField<Double>? = null
                    private var entityId: JsonField<String>? = null
                    private var isGranted: JsonField<Boolean>? = null
                    private var usageLimit: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(betaChainNode: BetaChainNode) = apply {
                        currentUsage = betaChainNode.currentUsage
                        entityId = betaChainNode.entityId
                        isGranted = betaChainNode.isGranted
                        usageLimit = betaChainNode.usageLimit
                        additionalProperties = betaChainNode.additionalProperties.toMutableMap()
                    }

                    /** Amount consumed by this entity in the current cadence period. */
                    fun currentUsage(currentUsage: Double) =
                        currentUsage(JsonField.of(currentUsage))

                    /**
                     * Sets [Builder.currentUsage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currentUsage] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun currentUsage(currentUsage: JsonField<Double>) = apply {
                        this.currentUsage = currentUsage
                    }

                    /** External id of the entity within the customer. */
                    fun entityId(entityId: String) = entityId(JsonField.of(entityId))

                    /**
                     * Sets [Builder.entityId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.entityId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

                    /** Whether this node alone permits the requested usage. */
                    fun isGranted(isGranted: Boolean) = isGranted(JsonField.of(isGranted))

                    /**
                     * Sets [Builder.isGranted] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isGranted] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun isGranted(isGranted: JsonField<Boolean>) = apply {
                        this.isGranted = isGranted
                    }

                    /** Hard usage limit for this node; null when no assignment is configured. */
                    fun usageLimit(usageLimit: Double?) =
                        usageLimit(JsonField.ofNullable(usageLimit))

                    /**
                     * Alias for [Builder.usageLimit].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun usageLimit(usageLimit: Double) = usageLimit(usageLimit as Double?)

                    /** Alias for calling [Builder.usageLimit] with `usageLimit.orElse(null)`. */
                    fun usageLimit(usageLimit: Optional<Double>) =
                        usageLimit(usageLimit.getOrNull())

                    /**
                     * Sets [Builder.usageLimit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.usageLimit] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [BetaChainNode].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .currentUsage()
                     * .entityId()
                     * .isGranted()
                     * .usageLimit()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): BetaChainNode =
                        BetaChainNode(
                            checkRequired("currentUsage", currentUsage),
                            checkRequired("entityId", entityId),
                            checkRequired("isGranted", isGranted),
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
                 * @throws StiggInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): BetaChainNode = apply {
                    if (validated) {
                        return@apply
                    }

                    currentUsage()
                    entityId()
                    isGranted()
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
                    (if (currentUsage.asKnown().isPresent) 1 else 0) +
                        (if (entityId.asKnown().isPresent) 1 else 0) +
                        (if (isGranted.asKnown().isPresent) 1 else 0) +
                        (if (usageLimit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BetaChainNode &&
                        currentUsage == other.currentUsage &&
                        entityId == other.entityId &&
                        isGranted == other.isGranted &&
                        usageLimit == other.usageLimit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        currentUsage,
                        entityId,
                        isGranted,
                        usageLimit,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BetaChainNode{currentUsage=$currentUsage, entityId=$entityId, isGranted=$isGranted, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
            }

            class InnerFeature
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val displayName: JsonField<String>,
                private val featureStatus: JsonField<FeatureStatus>,
                private val featureType: JsonField<FeatureType>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("displayName")
                    @ExcludeMissing
                    displayName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("featureStatus")
                    @ExcludeMissing
                    featureStatus: JsonField<FeatureStatus> = JsonMissing.of(),
                    @JsonProperty("featureType")
                    @ExcludeMissing
                    featureType: JsonField<FeatureType> = JsonMissing.of(),
                ) : this(id, displayName, featureStatus, featureType, mutableMapOf())

                /**
                 * The unique reference ID of the entitlement.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * The human-readable name of the entitlement, shown in UI elements.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun displayName(): String = displayName.getRequired("displayName")

                /**
                 * The current status of the feature.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun featureStatus(): FeatureStatus = featureStatus.getRequired("featureStatus")

                /**
                 * The type of feature associated with the entitlement.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun featureType(): FeatureType = featureType.getRequired("featureType")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [displayName].
                 *
                 * Unlike [displayName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("displayName")
                @ExcludeMissing
                fun _displayName(): JsonField<String> = displayName

                /**
                 * Returns the raw JSON value of [featureStatus].
                 *
                 * Unlike [featureStatus], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("featureStatus")
                @ExcludeMissing
                fun _featureStatus(): JsonField<FeatureStatus> = featureStatus

                /**
                 * Returns the raw JSON value of [featureType].
                 *
                 * Unlike [featureType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("featureType")
                @ExcludeMissing
                fun _featureType(): JsonField<FeatureType> = featureType

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
                     * Returns a mutable builder for constructing an instance of [InnerFeature].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .displayName()
                     * .featureStatus()
                     * .featureType()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [InnerFeature]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var displayName: JsonField<String>? = null
                    private var featureStatus: JsonField<FeatureStatus>? = null
                    private var featureType: JsonField<FeatureType>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(innerFeature: InnerFeature) = apply {
                        id = innerFeature.id
                        displayName = innerFeature.displayName
                        featureStatus = innerFeature.featureStatus
                        featureType = innerFeature.featureType
                        additionalProperties = innerFeature.additionalProperties.toMutableMap()
                    }

                    /** The unique reference ID of the entitlement. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The human-readable name of the entitlement, shown in UI elements. */
                    fun displayName(displayName: String) = displayName(JsonField.of(displayName))

                    /**
                     * Sets [Builder.displayName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.displayName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun displayName(displayName: JsonField<String>) = apply {
                        this.displayName = displayName
                    }

                    /** The current status of the feature. */
                    fun featureStatus(featureStatus: FeatureStatus) =
                        featureStatus(JsonField.of(featureStatus))

                    /**
                     * Sets [Builder.featureStatus] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.featureStatus] with a well-typed
                     * [FeatureStatus] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun featureStatus(featureStatus: JsonField<FeatureStatus>) = apply {
                        this.featureStatus = featureStatus
                    }

                    /** The type of feature associated with the entitlement. */
                    fun featureType(featureType: FeatureType) =
                        featureType(JsonField.of(featureType))

                    /**
                     * Sets [Builder.featureType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.featureType] with a well-typed [FeatureType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun featureType(featureType: JsonField<FeatureType>) = apply {
                        this.featureType = featureType
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
                     * Returns an immutable instance of [InnerFeature].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .displayName()
                     * .featureStatus()
                     * .featureType()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): InnerFeature =
                        InnerFeature(
                            checkRequired("id", id),
                            checkRequired("displayName", displayName),
                            checkRequired("featureStatus", featureStatus),
                            checkRequired("featureType", featureType),
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
                 * @throws StiggInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): InnerFeature = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    displayName()
                    featureStatus().validate()
                    featureType().validate()
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
                        (if (displayName.asKnown().isPresent) 1 else 0) +
                        (featureStatus.asKnown().getOrNull()?.validity() ?: 0) +
                        (featureType.asKnown().getOrNull()?.validity() ?: 0)

                /** The current status of the feature. */
                class FeatureStatus
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

                        @JvmField val NEW = of("NEW")

                        @JvmField val SUSPENDED = of("SUSPENDED")

                        @JvmField val ACTIVE = of("ACTIVE")

                        @JvmStatic fun of(value: String) = FeatureStatus(JsonField.of(value))
                    }

                    /** An enum containing [FeatureStatus]'s known values. */
                    enum class Known {
                        NEW,
                        SUSPENDED,
                        ACTIVE,
                    }

                    /**
                     * An enum containing [FeatureStatus]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [FeatureStatus] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        NEW,
                        SUSPENDED,
                        ACTIVE,
                        /**
                         * An enum member indicating that [FeatureStatus] was instantiated with an
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
                            NEW -> Value.NEW
                            SUSPENDED -> Value.SUSPENDED
                            ACTIVE -> Value.ACTIVE
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
                            NEW -> Known.NEW
                            SUSPENDED -> Known.SUSPENDED
                            ACTIVE -> Known.ACTIVE
                            else -> throw StiggInvalidDataException("Unknown FeatureStatus: $value")
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
                    fun validate(): FeatureStatus = apply {
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

                        return other is FeatureStatus && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** The type of feature associated with the entitlement. */
                class FeatureType
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

                        @JvmField val BOOLEAN = of("BOOLEAN")

                        @JvmField val NUMBER = of("NUMBER")

                        @JvmField val ENUM = of("ENUM")

                        @JvmStatic fun of(value: String) = FeatureType(JsonField.of(value))
                    }

                    /** An enum containing [FeatureType]'s known values. */
                    enum class Known {
                        BOOLEAN,
                        NUMBER,
                        ENUM,
                    }

                    /**
                     * An enum containing [FeatureType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [FeatureType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        BOOLEAN,
                        NUMBER,
                        ENUM,
                        /**
                         * An enum member indicating that [FeatureType] was instantiated with an
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
                            BOOLEAN -> Value.BOOLEAN
                            NUMBER -> Value.NUMBER
                            ENUM -> Value.ENUM
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
                            BOOLEAN -> Known.BOOLEAN
                            NUMBER -> Known.NUMBER
                            ENUM -> Known.ENUM
                            else -> throw StiggInvalidDataException("Unknown FeatureType: $value")
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
                    fun validate(): FeatureType = apply {
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

                        return other is FeatureType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InnerFeature &&
                        id == other.id &&
                        displayName == other.displayName &&
                        featureStatus == other.featureStatus &&
                        featureType == other.featureType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, displayName, featureStatus, featureType, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InnerFeature{id=$id, displayName=$displayName, featureStatus=$featureStatus, featureType=$featureType, additionalProperties=$additionalProperties}"
            }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Feature &&
                    accessDeniedReason == other.accessDeniedReason &&
                    isGranted == other.isGranted &&
                    type == other.type &&
                    chains == other.chains &&
                    currentUsage == other.currentUsage &&
                    entitlementUpdatedAt == other.entitlementUpdatedAt &&
                    feature == other.feature &&
                    hasUnlimitedUsage == other.hasUnlimitedUsage &&
                    resetPeriod == other.resetPeriod &&
                    usageLimit == other.usageLimit &&
                    usagePeriodAnchor == other.usagePeriodAnchor &&
                    usagePeriodEnd == other.usagePeriodEnd &&
                    usagePeriodStart == other.usagePeriodStart &&
                    validUntil == other.validUntil &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accessDeniedReason,
                    isGranted,
                    type,
                    chains,
                    currentUsage,
                    entitlementUpdatedAt,
                    feature,
                    hasUnlimitedUsage,
                    resetPeriod,
                    usageLimit,
                    usagePeriodAnchor,
                    usagePeriodEnd,
                    usagePeriodStart,
                    validUntil,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Feature{accessDeniedReason=$accessDeniedReason, isGranted=$isGranted, type=$type, chains=$chains, currentUsage=$currentUsage, entitlementUpdatedAt=$entitlementUpdatedAt, feature=$feature, hasUnlimitedUsage=$hasUnlimitedUsage, resetPeriod=$resetPeriod, usageLimit=$usageLimit, usagePeriodAnchor=$usagePeriodAnchor, usagePeriodEnd=$usagePeriodEnd, usagePeriodStart=$usagePeriodStart, validUntil=$validUntil, additionalProperties=$additionalProperties}"
        }

        /** Credit entitlement with optional governance chains attached. */
        class Credit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accessDeniedReason: JsonField<AccessDeniedReason>,
            private val currency: JsonField<Currency>,
            private val currentUsage: JsonField<Double>,
            private val isGranted: JsonField<Boolean>,
            private val type: JsonValue,
            private val usageLimit: JsonField<Double>,
            private val usageUpdatedAt: JsonField<OffsetDateTime>,
            private val chains: JsonField<List<List<BetaChainNode>>>,
            private val entitlementUpdatedAt: JsonField<OffsetDateTime>,
            private val usagePeriodEnd: JsonField<OffsetDateTime>,
            private val validUntil: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accessDeniedReason")
                @ExcludeMissing
                accessDeniedReason: JsonField<AccessDeniedReason> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("currentUsage")
                @ExcludeMissing
                currentUsage: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("isGranted")
                @ExcludeMissing
                isGranted: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("usageLimit")
                @ExcludeMissing
                usageLimit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("usageUpdatedAt")
                @ExcludeMissing
                usageUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("chains")
                @ExcludeMissing
                chains: JsonField<List<List<BetaChainNode>>> = JsonMissing.of(),
                @JsonProperty("entitlementUpdatedAt")
                @ExcludeMissing
                entitlementUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("usagePeriodEnd")
                @ExcludeMissing
                usagePeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("validUntil")
                @ExcludeMissing
                validUntil: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                accessDeniedReason,
                currency,
                currentUsage,
                isGranted,
                type,
                usageLimit,
                usageUpdatedAt,
                chains,
                entitlementUpdatedAt,
                usagePeriodEnd,
                validUntil,
                mutableMapOf(),
            )

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accessDeniedReason(): Optional<AccessDeniedReason> =
                accessDeniedReason.getOptional("accessDeniedReason")

            /**
             * The currency associated with a credit entitlement.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currentUsage(): Double = currentUsage.getRequired("currentUsage")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isGranted(): Boolean = isGranted.getRequired("isGranted")

            /**
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
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usageLimit(): Double = usageLimit.getRequired("usageLimit")

            /**
             * Timestamp of the last update to the credit usage.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usageUpdatedAt(): OffsetDateTime = usageUpdatedAt.getRequired("usageUpdatedAt")

            /**
             * Per-entity rollups, one chain per resolved dimension. Omitted when dimensions was not
             * provided.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun chains(): Optional<List<List<BetaChainNode>>> = chains.getOptional("chains")

            /**
             * Timestamp of the last update to the entitlement grant or configuration.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun entitlementUpdatedAt(): Optional<OffsetDateTime> =
                entitlementUpdatedAt.getOptional("entitlementUpdatedAt")

            /**
             * The end date of the current billing period for recurring credit grants.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usagePeriodEnd(): Optional<OffsetDateTime> =
                usagePeriodEnd.getOptional("usagePeriodEnd")

            /**
             * The next time the entitlement should be recalculated
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun validUntil(): Optional<OffsetDateTime> = validUntil.getOptional("validUntil")

            /**
             * Returns the raw JSON value of [accessDeniedReason].
             *
             * Unlike [accessDeniedReason], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("accessDeniedReason")
            @ExcludeMissing
            fun _accessDeniedReason(): JsonField<AccessDeniedReason> = accessDeniedReason

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [currentUsage].
             *
             * Unlike [currentUsage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currentUsage")
            @ExcludeMissing
            fun _currentUsage(): JsonField<Double> = currentUsage

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
             * Returns the raw JSON value of [usageLimit].
             *
             * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usageLimit")
            @ExcludeMissing
            fun _usageLimit(): JsonField<Double> = usageLimit

            /**
             * Returns the raw JSON value of [usageUpdatedAt].
             *
             * Unlike [usageUpdatedAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usageUpdatedAt")
            @ExcludeMissing
            fun _usageUpdatedAt(): JsonField<OffsetDateTime> = usageUpdatedAt

            /**
             * Returns the raw JSON value of [chains].
             *
             * Unlike [chains], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("chains")
            @ExcludeMissing
            fun _chains(): JsonField<List<List<BetaChainNode>>> = chains

            /**
             * Returns the raw JSON value of [entitlementUpdatedAt].
             *
             * Unlike [entitlementUpdatedAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("entitlementUpdatedAt")
            @ExcludeMissing
            fun _entitlementUpdatedAt(): JsonField<OffsetDateTime> = entitlementUpdatedAt

            /**
             * Returns the raw JSON value of [usagePeriodEnd].
             *
             * Unlike [usagePeriodEnd], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usagePeriodEnd")
            @ExcludeMissing
            fun _usagePeriodEnd(): JsonField<OffsetDateTime> = usagePeriodEnd

            /**
             * Returns the raw JSON value of [validUntil].
             *
             * Unlike [validUntil], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("validUntil")
            @ExcludeMissing
            fun _validUntil(): JsonField<OffsetDateTime> = validUntil

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
                 * .accessDeniedReason()
                 * .currency()
                 * .currentUsage()
                 * .isGranted()
                 * .usageLimit()
                 * .usageUpdatedAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Credit]. */
            class Builder internal constructor() {

                private var accessDeniedReason: JsonField<AccessDeniedReason>? = null
                private var currency: JsonField<Currency>? = null
                private var currentUsage: JsonField<Double>? = null
                private var isGranted: JsonField<Boolean>? = null
                private var type: JsonValue = JsonValue.from("CREDIT")
                private var usageLimit: JsonField<Double>? = null
                private var usageUpdatedAt: JsonField<OffsetDateTime>? = null
                private var chains: JsonField<MutableList<List<BetaChainNode>>>? = null
                private var entitlementUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var usagePeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                private var validUntil: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(credit: Credit) = apply {
                    accessDeniedReason = credit.accessDeniedReason
                    currency = credit.currency
                    currentUsage = credit.currentUsage
                    isGranted = credit.isGranted
                    type = credit.type
                    usageLimit = credit.usageLimit
                    usageUpdatedAt = credit.usageUpdatedAt
                    chains = credit.chains.map { it.toMutableList() }
                    entitlementUpdatedAt = credit.entitlementUpdatedAt
                    usagePeriodEnd = credit.usagePeriodEnd
                    validUntil = credit.validUntil
                    additionalProperties = credit.additionalProperties.toMutableMap()
                }

                fun accessDeniedReason(accessDeniedReason: AccessDeniedReason?) =
                    accessDeniedReason(JsonField.ofNullable(accessDeniedReason))

                /**
                 * Alias for calling [Builder.accessDeniedReason] with
                 * `accessDeniedReason.orElse(null)`.
                 */
                fun accessDeniedReason(accessDeniedReason: Optional<AccessDeniedReason>) =
                    accessDeniedReason(accessDeniedReason.getOrNull())

                /**
                 * Sets [Builder.accessDeniedReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accessDeniedReason] with a well-typed
                 * [AccessDeniedReason] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun accessDeniedReason(accessDeniedReason: JsonField<AccessDeniedReason>) = apply {
                    this.accessDeniedReason = accessDeniedReason
                }

                /** The currency associated with a credit entitlement. */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                fun currentUsage(currentUsage: Double) = currentUsage(JsonField.of(currentUsage))

                /**
                 * Sets [Builder.currentUsage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currentUsage] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currentUsage(currentUsage: JsonField<Double>) = apply {
                    this.currentUsage = currentUsage
                }

                fun isGranted(isGranted: Boolean) = isGranted(JsonField.of(isGranted))

                /**
                 * Sets [Builder.isGranted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isGranted] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isGranted(isGranted: JsonField<Boolean>) = apply { this.isGranted = isGranted }

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

                /** Timestamp of the last update to the credit usage. */
                fun usageUpdatedAt(usageUpdatedAt: OffsetDateTime) =
                    usageUpdatedAt(JsonField.of(usageUpdatedAt))

                /**
                 * Sets [Builder.usageUpdatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageUpdatedAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun usageUpdatedAt(usageUpdatedAt: JsonField<OffsetDateTime>) = apply {
                    this.usageUpdatedAt = usageUpdatedAt
                }

                /**
                 * Per-entity rollups, one chain per resolved dimension. Omitted when dimensions was
                 * not provided.
                 */
                fun chains(chains: List<List<BetaChainNode>>) = chains(JsonField.of(chains))

                /**
                 * Sets [Builder.chains] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chains] with a well-typed
                 * `List<List<BetaChainNode>>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun chains(chains: JsonField<List<List<BetaChainNode>>>) = apply {
                    this.chains = chains.map { it.toMutableList() }
                }

                /**
                 * Adds a single [List<BetaChainNode>] to [chains].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addChain(chain: List<BetaChainNode>) = apply {
                    chains =
                        (chains ?: JsonField.of(mutableListOf())).also {
                            checkKnown("chains", it).add(chain)
                        }
                }

                /** Timestamp of the last update to the entitlement grant or configuration. */
                fun entitlementUpdatedAt(entitlementUpdatedAt: OffsetDateTime) =
                    entitlementUpdatedAt(JsonField.of(entitlementUpdatedAt))

                /**
                 * Sets [Builder.entitlementUpdatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entitlementUpdatedAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun entitlementUpdatedAt(entitlementUpdatedAt: JsonField<OffsetDateTime>) = apply {
                    this.entitlementUpdatedAt = entitlementUpdatedAt
                }

                /** The end date of the current billing period for recurring credit grants. */
                fun usagePeriodEnd(usagePeriodEnd: OffsetDateTime) =
                    usagePeriodEnd(JsonField.of(usagePeriodEnd))

                /**
                 * Sets [Builder.usagePeriodEnd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usagePeriodEnd] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun usagePeriodEnd(usagePeriodEnd: JsonField<OffsetDateTime>) = apply {
                    this.usagePeriodEnd = usagePeriodEnd
                }

                /** The next time the entitlement should be recalculated */
                fun validUntil(validUntil: OffsetDateTime) = validUntil(JsonField.of(validUntil))

                /**
                 * Sets [Builder.validUntil] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.validUntil] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun validUntil(validUntil: JsonField<OffsetDateTime>) = apply {
                    this.validUntil = validUntil
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
                 * .accessDeniedReason()
                 * .currency()
                 * .currentUsage()
                 * .isGranted()
                 * .usageLimit()
                 * .usageUpdatedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Credit =
                    Credit(
                        checkRequired("accessDeniedReason", accessDeniedReason),
                        checkRequired("currency", currency),
                        checkRequired("currentUsage", currentUsage),
                        checkRequired("isGranted", isGranted),
                        type,
                        checkRequired("usageLimit", usageLimit),
                        checkRequired("usageUpdatedAt", usageUpdatedAt),
                        (chains ?: JsonMissing.of()).map { it.toImmutable() },
                        entitlementUpdatedAt,
                        usagePeriodEnd,
                        validUntil,
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

                accessDeniedReason().ifPresent { it.validate() }
                currency().validate()
                currentUsage()
                isGranted()
                _type().let {
                    if (it != JsonValue.from("CREDIT")) {
                        throw StiggInvalidDataException("'type' is invalid, received $it")
                    }
                }
                usageLimit()
                usageUpdatedAt()
                chains().ifPresent { it.forEach { it.forEach { it.validate() } } }
                entitlementUpdatedAt()
                usagePeriodEnd()
                validUntil()
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
                (accessDeniedReason.asKnown().getOrNull()?.validity() ?: 0) +
                    (currency.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (currentUsage.asKnown().isPresent) 1 else 0) +
                    (if (isGranted.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("CREDIT")) 1 else 0 } +
                    (if (usageLimit.asKnown().isPresent) 1 else 0) +
                    (if (usageUpdatedAt.asKnown().isPresent) 1 else 0) +
                    (chains.asKnown().getOrNull()?.sumOf {
                        it.sumOf { it.validity().toInt() }.toInt()
                    } ?: 0) +
                    (if (entitlementUpdatedAt.asKnown().isPresent) 1 else 0) +
                    (if (usagePeriodEnd.asKnown().isPresent) 1 else 0) +
                    (if (validUntil.asKnown().isPresent) 1 else 0)

            class AccessDeniedReason
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

                    @JvmField val FEATURE_NOT_FOUND = of("FeatureNotFound")

                    @JvmField val CUSTOMER_NOT_FOUND = of("CustomerNotFound")

                    @JvmField val CUSTOMER_IS_ARCHIVED = of("CustomerIsArchived")

                    @JvmField val CUSTOMER_RESOURCE_NOT_FOUND = of("CustomerResourceNotFound")

                    @JvmField val NO_ACTIVE_SUBSCRIPTION = of("NoActiveSubscription")

                    @JvmField
                    val NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION =
                        of("NoFeatureEntitlementInSubscription")

                    @JvmField
                    val REQUESTED_USAGE_EXCEEDING_LIMIT = of("RequestedUsageExceedingLimit")

                    @JvmField val REQUESTED_VALUES_MISMATCH = of("RequestedValuesMismatch")

                    @JvmField val BUDGET_EXCEEDED = of("BudgetExceeded")

                    @JvmField val UNKNOWN = of("Unknown")

                    @JvmField val FEATURE_TYPE_MISMATCH = of("FeatureTypeMismatch")

                    @JvmField val REVOKED = of("Revoked")

                    @JvmField val INSUFFICIENT_CREDITS = of("InsufficientCredits")

                    @JvmField val ENTITLEMENT_NOT_FOUND = of("EntitlementNotFound")

                    @JvmStatic fun of(value: String) = AccessDeniedReason(JsonField.of(value))
                }

                /** An enum containing [AccessDeniedReason]'s known values. */
                enum class Known {
                    FEATURE_NOT_FOUND,
                    CUSTOMER_NOT_FOUND,
                    CUSTOMER_IS_ARCHIVED,
                    CUSTOMER_RESOURCE_NOT_FOUND,
                    NO_ACTIVE_SUBSCRIPTION,
                    NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION,
                    REQUESTED_USAGE_EXCEEDING_LIMIT,
                    REQUESTED_VALUES_MISMATCH,
                    BUDGET_EXCEEDED,
                    UNKNOWN,
                    FEATURE_TYPE_MISMATCH,
                    REVOKED,
                    INSUFFICIENT_CREDITS,
                    ENTITLEMENT_NOT_FOUND,
                }

                /**
                 * An enum containing [AccessDeniedReason]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AccessDeniedReason] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FEATURE_NOT_FOUND,
                    CUSTOMER_NOT_FOUND,
                    CUSTOMER_IS_ARCHIVED,
                    CUSTOMER_RESOURCE_NOT_FOUND,
                    NO_ACTIVE_SUBSCRIPTION,
                    NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION,
                    REQUESTED_USAGE_EXCEEDING_LIMIT,
                    REQUESTED_VALUES_MISMATCH,
                    BUDGET_EXCEEDED,
                    UNKNOWN,
                    FEATURE_TYPE_MISMATCH,
                    REVOKED,
                    INSUFFICIENT_CREDITS,
                    ENTITLEMENT_NOT_FOUND,
                    /**
                     * An enum member indicating that [AccessDeniedReason] was instantiated with an
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
                        FEATURE_NOT_FOUND -> Value.FEATURE_NOT_FOUND
                        CUSTOMER_NOT_FOUND -> Value.CUSTOMER_NOT_FOUND
                        CUSTOMER_IS_ARCHIVED -> Value.CUSTOMER_IS_ARCHIVED
                        CUSTOMER_RESOURCE_NOT_FOUND -> Value.CUSTOMER_RESOURCE_NOT_FOUND
                        NO_ACTIVE_SUBSCRIPTION -> Value.NO_ACTIVE_SUBSCRIPTION
                        NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION ->
                            Value.NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION
                        REQUESTED_USAGE_EXCEEDING_LIMIT -> Value.REQUESTED_USAGE_EXCEEDING_LIMIT
                        REQUESTED_VALUES_MISMATCH -> Value.REQUESTED_VALUES_MISMATCH
                        BUDGET_EXCEEDED -> Value.BUDGET_EXCEEDED
                        UNKNOWN -> Value.UNKNOWN
                        FEATURE_TYPE_MISMATCH -> Value.FEATURE_TYPE_MISMATCH
                        REVOKED -> Value.REVOKED
                        INSUFFICIENT_CREDITS -> Value.INSUFFICIENT_CREDITS
                        ENTITLEMENT_NOT_FOUND -> Value.ENTITLEMENT_NOT_FOUND
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
                        FEATURE_NOT_FOUND -> Known.FEATURE_NOT_FOUND
                        CUSTOMER_NOT_FOUND -> Known.CUSTOMER_NOT_FOUND
                        CUSTOMER_IS_ARCHIVED -> Known.CUSTOMER_IS_ARCHIVED
                        CUSTOMER_RESOURCE_NOT_FOUND -> Known.CUSTOMER_RESOURCE_NOT_FOUND
                        NO_ACTIVE_SUBSCRIPTION -> Known.NO_ACTIVE_SUBSCRIPTION
                        NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION ->
                            Known.NO_FEATURE_ENTITLEMENT_IN_SUBSCRIPTION
                        REQUESTED_USAGE_EXCEEDING_LIMIT -> Known.REQUESTED_USAGE_EXCEEDING_LIMIT
                        REQUESTED_VALUES_MISMATCH -> Known.REQUESTED_VALUES_MISMATCH
                        BUDGET_EXCEEDED -> Known.BUDGET_EXCEEDED
                        UNKNOWN -> Known.UNKNOWN
                        FEATURE_TYPE_MISMATCH -> Known.FEATURE_TYPE_MISMATCH
                        REVOKED -> Known.REVOKED
                        INSUFFICIENT_CREDITS -> Known.INSUFFICIENT_CREDITS
                        ENTITLEMENT_NOT_FOUND -> Known.ENTITLEMENT_NOT_FOUND
                        else ->
                            throw StiggInvalidDataException("Unknown AccessDeniedReason: $value")
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
                fun validate(): AccessDeniedReason = apply {
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

                    return other is AccessDeniedReason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The currency associated with a credit entitlement. */
            class Currency
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val currencyId: JsonField<String>,
                private val displayName: JsonField<String>,
                private val description: JsonField<String>,
                private val metadata: JsonField<Metadata>,
                private val unitPlural: JsonField<String>,
                private val unitSingular: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("currencyId")
                    @ExcludeMissing
                    currencyId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("displayName")
                    @ExcludeMissing
                    displayName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonProperty("unitPlural")
                    @ExcludeMissing
                    unitPlural: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("unitSingular")
                    @ExcludeMissing
                    unitSingular: JsonField<String> = JsonMissing.of(),
                ) : this(
                    currencyId,
                    displayName,
                    description,
                    metadata,
                    unitPlural,
                    unitSingular,
                    mutableMapOf(),
                )

                /**
                 * The unique identifier of the custom currency.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currencyId(): String = currencyId.getRequired("currencyId")

                /**
                 * The display name of the currency.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun displayName(): String = displayName.getRequired("displayName")

                /**
                 * A description of the currency.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun description(): Optional<String> = description.getOptional("description")

                /**
                 * Additional metadata associated with the currency.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

                /**
                 * The plural form of the currency unit.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun unitPlural(): Optional<String> = unitPlural.getOptional("unitPlural")

                /**
                 * The singular form of the currency unit.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun unitSingular(): Optional<String> = unitSingular.getOptional("unitSingular")

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
                 * Returns the raw JSON value of [displayName].
                 *
                 * Unlike [displayName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("displayName")
                @ExcludeMissing
                fun _displayName(): JsonField<String> = displayName

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * Returns the raw JSON value of [unitPlural].
                 *
                 * Unlike [unitPlural], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("unitPlural")
                @ExcludeMissing
                fun _unitPlural(): JsonField<String> = unitPlural

                /**
                 * Returns the raw JSON value of [unitSingular].
                 *
                 * Unlike [unitSingular], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("unitSingular")
                @ExcludeMissing
                fun _unitSingular(): JsonField<String> = unitSingular

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
                     * Returns a mutable builder for constructing an instance of [Currency].
                     *
                     * The following fields are required:
                     * ```java
                     * .currencyId()
                     * .displayName()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Currency]. */
                class Builder internal constructor() {

                    private var currencyId: JsonField<String>? = null
                    private var displayName: JsonField<String>? = null
                    private var description: JsonField<String> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var unitPlural: JsonField<String> = JsonMissing.of()
                    private var unitSingular: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(currency: Currency) = apply {
                        currencyId = currency.currencyId
                        displayName = currency.displayName
                        description = currency.description
                        metadata = currency.metadata
                        unitPlural = currency.unitPlural
                        unitSingular = currency.unitSingular
                        additionalProperties = currency.additionalProperties.toMutableMap()
                    }

                    /** The unique identifier of the custom currency. */
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

                    /** The display name of the currency. */
                    fun displayName(displayName: String) = displayName(JsonField.of(displayName))

                    /**
                     * Sets [Builder.displayName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.displayName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun displayName(displayName: JsonField<String>) = apply {
                        this.displayName = displayName
                    }

                    /** A description of the currency. */
                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /** Alias for calling [Builder.description] with `description.orElse(null)`. */
                    fun description(description: Optional<String>) =
                        description(description.getOrNull())

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /** Additional metadata associated with the currency. */
                    fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                    /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
                    fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /** The plural form of the currency unit. */
                    fun unitPlural(unitPlural: String?) =
                        unitPlural(JsonField.ofNullable(unitPlural))

                    /** Alias for calling [Builder.unitPlural] with `unitPlural.orElse(null)`. */
                    fun unitPlural(unitPlural: Optional<String>) =
                        unitPlural(unitPlural.getOrNull())

                    /**
                     * Sets [Builder.unitPlural] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPlural] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitPlural(unitPlural: JsonField<String>) = apply {
                        this.unitPlural = unitPlural
                    }

                    /** The singular form of the currency unit. */
                    fun unitSingular(unitSingular: String?) =
                        unitSingular(JsonField.ofNullable(unitSingular))

                    /**
                     * Alias for calling [Builder.unitSingular] with `unitSingular.orElse(null)`.
                     */
                    fun unitSingular(unitSingular: Optional<String>) =
                        unitSingular(unitSingular.getOrNull())

                    /**
                     * Sets [Builder.unitSingular] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitSingular] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun unitSingular(unitSingular: JsonField<String>) = apply {
                        this.unitSingular = unitSingular
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
                     * Returns an immutable instance of [Currency].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .currencyId()
                     * .displayName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Currency =
                        Currency(
                            checkRequired("currencyId", currencyId),
                            checkRequired("displayName", displayName),
                            description,
                            metadata,
                            unitPlural,
                            unitSingular,
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
                 * @throws StiggInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Currency = apply {
                    if (validated) {
                        return@apply
                    }

                    currencyId()
                    displayName()
                    description()
                    metadata().ifPresent { it.validate() }
                    unitPlural()
                    unitSingular()
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
                    (if (currencyId.asKnown().isPresent) 1 else 0) +
                        (if (displayName.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (unitPlural.asKnown().isPresent) 1 else 0) +
                        (if (unitSingular.asKnown().isPresent) 1 else 0)

                /** Additional metadata associated with the currency. */
                class Metadata
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
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
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Currency &&
                        currencyId == other.currencyId &&
                        displayName == other.displayName &&
                        description == other.description &&
                        metadata == other.metadata &&
                        unitPlural == other.unitPlural &&
                        unitSingular == other.unitSingular &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        currencyId,
                        displayName,
                        description,
                        metadata,
                        unitPlural,
                        unitSingular,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Currency{currencyId=$currencyId, displayName=$displayName, description=$description, metadata=$metadata, unitPlural=$unitPlural, unitSingular=$unitSingular, additionalProperties=$additionalProperties}"
            }

            /**
             * Per-entity governance node — limit and current usage for a single resolved entity.
             */
            class BetaChainNode
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val currentUsage: JsonField<Double>,
                private val entityId: JsonField<String>,
                private val isGranted: JsonField<Boolean>,
                private val usageLimit: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("currentUsage")
                    @ExcludeMissing
                    currentUsage: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("entityId")
                    @ExcludeMissing
                    entityId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("isGranted")
                    @ExcludeMissing
                    isGranted: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("usageLimit")
                    @ExcludeMissing
                    usageLimit: JsonField<Double> = JsonMissing.of(),
                ) : this(currentUsage, entityId, isGranted, usageLimit, mutableMapOf())

                /**
                 * Amount consumed by this entity in the current cadence period.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currentUsage(): Double = currentUsage.getRequired("currentUsage")

                /**
                 * External id of the entity within the customer.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun entityId(): String = entityId.getRequired("entityId")

                /**
                 * Whether this node alone permits the requested usage.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isGranted(): Boolean = isGranted.getRequired("isGranted")

                /**
                 * Hard usage limit for this node; null when no assignment is configured.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun usageLimit(): Optional<Double> = usageLimit.getOptional("usageLimit")

                /**
                 * Returns the raw JSON value of [currentUsage].
                 *
                 * Unlike [currentUsage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("currentUsage")
                @ExcludeMissing
                fun _currentUsage(): JsonField<Double> = currentUsage

                /**
                 * Returns the raw JSON value of [entityId].
                 *
                 * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("entityId")
                @ExcludeMissing
                fun _entityId(): JsonField<String> = entityId

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
                 * Returns the raw JSON value of [usageLimit].
                 *
                 * Unlike [usageLimit], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                     * Returns a mutable builder for constructing an instance of [BetaChainNode].
                     *
                     * The following fields are required:
                     * ```java
                     * .currentUsage()
                     * .entityId()
                     * .isGranted()
                     * .usageLimit()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [BetaChainNode]. */
                class Builder internal constructor() {

                    private var currentUsage: JsonField<Double>? = null
                    private var entityId: JsonField<String>? = null
                    private var isGranted: JsonField<Boolean>? = null
                    private var usageLimit: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(betaChainNode: BetaChainNode) = apply {
                        currentUsage = betaChainNode.currentUsage
                        entityId = betaChainNode.entityId
                        isGranted = betaChainNode.isGranted
                        usageLimit = betaChainNode.usageLimit
                        additionalProperties = betaChainNode.additionalProperties.toMutableMap()
                    }

                    /** Amount consumed by this entity in the current cadence period. */
                    fun currentUsage(currentUsage: Double) =
                        currentUsage(JsonField.of(currentUsage))

                    /**
                     * Sets [Builder.currentUsage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currentUsage] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun currentUsage(currentUsage: JsonField<Double>) = apply {
                        this.currentUsage = currentUsage
                    }

                    /** External id of the entity within the customer. */
                    fun entityId(entityId: String) = entityId(JsonField.of(entityId))

                    /**
                     * Sets [Builder.entityId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.entityId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

                    /** Whether this node alone permits the requested usage. */
                    fun isGranted(isGranted: Boolean) = isGranted(JsonField.of(isGranted))

                    /**
                     * Sets [Builder.isGranted] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isGranted] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun isGranted(isGranted: JsonField<Boolean>) = apply {
                        this.isGranted = isGranted
                    }

                    /** Hard usage limit for this node; null when no assignment is configured. */
                    fun usageLimit(usageLimit: Double?) =
                        usageLimit(JsonField.ofNullable(usageLimit))

                    /**
                     * Alias for [Builder.usageLimit].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun usageLimit(usageLimit: Double) = usageLimit(usageLimit as Double?)

                    /** Alias for calling [Builder.usageLimit] with `usageLimit.orElse(null)`. */
                    fun usageLimit(usageLimit: Optional<Double>) =
                        usageLimit(usageLimit.getOrNull())

                    /**
                     * Sets [Builder.usageLimit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.usageLimit] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [BetaChainNode].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .currentUsage()
                     * .entityId()
                     * .isGranted()
                     * .usageLimit()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): BetaChainNode =
                        BetaChainNode(
                            checkRequired("currentUsage", currentUsage),
                            checkRequired("entityId", entityId),
                            checkRequired("isGranted", isGranted),
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
                 * @throws StiggInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): BetaChainNode = apply {
                    if (validated) {
                        return@apply
                    }

                    currentUsage()
                    entityId()
                    isGranted()
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
                    (if (currentUsage.asKnown().isPresent) 1 else 0) +
                        (if (entityId.asKnown().isPresent) 1 else 0) +
                        (if (isGranted.asKnown().isPresent) 1 else 0) +
                        (if (usageLimit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BetaChainNode &&
                        currentUsage == other.currentUsage &&
                        entityId == other.entityId &&
                        isGranted == other.isGranted &&
                        usageLimit == other.usageLimit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        currentUsage,
                        entityId,
                        isGranted,
                        usageLimit,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BetaChainNode{currentUsage=$currentUsage, entityId=$entityId, isGranted=$isGranted, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Credit &&
                    accessDeniedReason == other.accessDeniedReason &&
                    currency == other.currency &&
                    currentUsage == other.currentUsage &&
                    isGranted == other.isGranted &&
                    type == other.type &&
                    usageLimit == other.usageLimit &&
                    usageUpdatedAt == other.usageUpdatedAt &&
                    chains == other.chains &&
                    entitlementUpdatedAt == other.entitlementUpdatedAt &&
                    usagePeriodEnd == other.usagePeriodEnd &&
                    validUntil == other.validUntil &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accessDeniedReason,
                    currency,
                    currentUsage,
                    isGranted,
                    type,
                    usageLimit,
                    usageUpdatedAt,
                    chains,
                    entitlementUpdatedAt,
                    usagePeriodEnd,
                    validUntil,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Credit{accessDeniedReason=$accessDeniedReason, currency=$currency, currentUsage=$currentUsage, isGranted=$isGranted, type=$type, usageLimit=$usageLimit, usageUpdatedAt=$usageUpdatedAt, chains=$chains, entitlementUpdatedAt=$entitlementUpdatedAt, usagePeriodEnd=$usagePeriodEnd, validUntil=$validUntil, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntitlementCheckResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EntitlementCheckResponse{data=$data, additionalProperties=$additionalProperties}"
}
