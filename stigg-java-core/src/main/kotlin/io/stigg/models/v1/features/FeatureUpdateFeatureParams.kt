// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.features

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
import io.stigg.core.checkKnown
import io.stigg.core.checkRequired
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Updates an existing feature's properties such as display name, description, and configuration.
 */
class FeatureUpdateFeatureParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The description for the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The display name for the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = body.displayName()

    /**
     * The configuration data for the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enumConfiguration(): Optional<List<EnumConfiguration>> = body.enumConfiguration()

    /**
     * The units for the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun featureUnits(): Optional<String> = body.featureUnits()

    /**
     * The plural units for the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun featureUnitsPlural(): Optional<String> = body.featureUnitsPlural()

    /**
     * The additional metadata for the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meter(): Optional<Meter> = body.meter()

    /**
     * Unit transformation to be applied to the reported usage
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unitTransformation(): Optional<UnitTransformation> = body.unitTransformation()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [enumConfiguration].
     *
     * Unlike [enumConfiguration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _enumConfiguration(): JsonField<List<EnumConfiguration>> = body._enumConfiguration()

    /**
     * Returns the raw JSON value of [featureUnits].
     *
     * Unlike [featureUnits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _featureUnits(): JsonField<String> = body._featureUnits()

    /**
     * Returns the raw JSON value of [featureUnitsPlural].
     *
     * Unlike [featureUnitsPlural], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _featureUnitsPlural(): JsonField<String> = body._featureUnitsPlural()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [meter].
     *
     * Unlike [meter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _meter(): JsonField<Meter> = body._meter()

    /**
     * Returns the raw JSON value of [unitTransformation].
     *
     * Unlike [unitTransformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _unitTransformation(): JsonField<UnitTransformation> = body._unitTransformation()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FeatureUpdateFeatureParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [FeatureUpdateFeatureParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeatureUpdateFeatureParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(featureUpdateFeatureParams: FeatureUpdateFeatureParams) = apply {
            id = featureUpdateFeatureParams.id
            body = featureUpdateFeatureParams.body.toBuilder()
            additionalHeaders = featureUpdateFeatureParams.additionalHeaders.toBuilder()
            additionalQueryParams = featureUpdateFeatureParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [description]
         * - [displayName]
         * - [enumConfiguration]
         * - [featureUnits]
         * - [featureUnitsPlural]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The description for the feature */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The display name for the feature */
        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        /** The configuration data for the feature */
        fun enumConfiguration(enumConfiguration: List<EnumConfiguration>) = apply {
            body.enumConfiguration(enumConfiguration)
        }

        /**
         * Sets [Builder.enumConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enumConfiguration] with a well-typed
         * `List<EnumConfiguration>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun enumConfiguration(enumConfiguration: JsonField<List<EnumConfiguration>>) = apply {
            body.enumConfiguration(enumConfiguration)
        }

        /**
         * Adds a single [EnumConfiguration] to [Builder.enumConfiguration].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnumConfiguration(enumConfiguration: EnumConfiguration) = apply {
            body.addEnumConfiguration(enumConfiguration)
        }

        /** The units for the feature */
        fun featureUnits(featureUnits: String) = apply { body.featureUnits(featureUnits) }

        /**
         * Sets [Builder.featureUnits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureUnits] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun featureUnits(featureUnits: JsonField<String>) = apply {
            body.featureUnits(featureUnits)
        }

        /** The plural units for the feature */
        fun featureUnitsPlural(featureUnitsPlural: String) = apply {
            body.featureUnitsPlural(featureUnitsPlural)
        }

        /**
         * Sets [Builder.featureUnitsPlural] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureUnitsPlural] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun featureUnitsPlural(featureUnitsPlural: JsonField<String>) = apply {
            body.featureUnitsPlural(featureUnitsPlural)
        }

        /** The additional metadata for the feature */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun meter(meter: Meter) = apply { body.meter(meter) }

        /**
         * Sets [Builder.meter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meter] with a well-typed [Meter] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meter(meter: JsonField<Meter>) = apply { body.meter(meter) }

        /** Unit transformation to be applied to the reported usage */
        fun unitTransformation(unitTransformation: UnitTransformation?) = apply {
            body.unitTransformation(unitTransformation)
        }

        /**
         * Alias for calling [Builder.unitTransformation] with `unitTransformation.orElse(null)`.
         */
        fun unitTransformation(unitTransformation: Optional<UnitTransformation>) =
            unitTransformation(unitTransformation.getOrNull())

        /**
         * Sets [Builder.unitTransformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitTransformation] with a well-typed
         * [UnitTransformation] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun unitTransformation(unitTransformation: JsonField<UnitTransformation>) = apply {
            body.unitTransformation(unitTransformation)
        }

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
         * Returns an immutable instance of [FeatureUpdateFeatureParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FeatureUpdateFeatureParams =
            FeatureUpdateFeatureParams(
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

    /** Partially update an existing feature. Only provided fields are updated. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val displayName: JsonField<String>,
        private val enumConfiguration: JsonField<List<EnumConfiguration>>,
        private val featureUnits: JsonField<String>,
        private val featureUnitsPlural: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val meter: JsonField<Meter>,
        private val unitTransformation: JsonField<UnitTransformation>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enumConfiguration")
            @ExcludeMissing
            enumConfiguration: JsonField<List<EnumConfiguration>> = JsonMissing.of(),
            @JsonProperty("featureUnits")
            @ExcludeMissing
            featureUnits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("featureUnitsPlural")
            @ExcludeMissing
            featureUnitsPlural: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("meter") @ExcludeMissing meter: JsonField<Meter> = JsonMissing.of(),
            @JsonProperty("unitTransformation")
            @ExcludeMissing
            unitTransformation: JsonField<UnitTransformation> = JsonMissing.of(),
        ) : this(
            description,
            displayName,
            enumConfiguration,
            featureUnits,
            featureUnitsPlural,
            metadata,
            meter,
            unitTransformation,
            mutableMapOf(),
        )

        /**
         * The description for the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The display name for the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("displayName")

        /**
         * The configuration data for the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enumConfiguration(): Optional<List<EnumConfiguration>> =
            enumConfiguration.getOptional("enumConfiguration")

        /**
         * The units for the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureUnits(): Optional<String> = featureUnits.getOptional("featureUnits")

        /**
         * The plural units for the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureUnitsPlural(): Optional<String> =
            featureUnitsPlural.getOptional("featureUnitsPlural")

        /**
         * The additional metadata for the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun meter(): Optional<Meter> = meter.getOptional("meter")

        /**
         * Unit transformation to be applied to the reported usage
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unitTransformation(): Optional<UnitTransformation> =
            unitTransformation.getOptional("unitTransformation")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("displayName")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [enumConfiguration].
         *
         * Unlike [enumConfiguration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enumConfiguration")
        @ExcludeMissing
        fun _enumConfiguration(): JsonField<List<EnumConfiguration>> = enumConfiguration

        /**
         * Returns the raw JSON value of [featureUnits].
         *
         * Unlike [featureUnits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("featureUnits")
        @ExcludeMissing
        fun _featureUnits(): JsonField<String> = featureUnits

        /**
         * Returns the raw JSON value of [featureUnitsPlural].
         *
         * Unlike [featureUnitsPlural], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("featureUnitsPlural")
        @ExcludeMissing
        fun _featureUnitsPlural(): JsonField<String> = featureUnitsPlural

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [meter].
         *
         * Unlike [meter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meter") @ExcludeMissing fun _meter(): JsonField<Meter> = meter

        /**
         * Returns the raw JSON value of [unitTransformation].
         *
         * Unlike [unitTransformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("unitTransformation")
        @ExcludeMissing
        fun _unitTransformation(): JsonField<UnitTransformation> = unitTransformation

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

            private var description: JsonField<String> = JsonMissing.of()
            private var displayName: JsonField<String> = JsonMissing.of()
            private var enumConfiguration: JsonField<MutableList<EnumConfiguration>>? = null
            private var featureUnits: JsonField<String> = JsonMissing.of()
            private var featureUnitsPlural: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var meter: JsonField<Meter> = JsonMissing.of()
            private var unitTransformation: JsonField<UnitTransformation> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                description = body.description
                displayName = body.displayName
                enumConfiguration = body.enumConfiguration.map { it.toMutableList() }
                featureUnits = body.featureUnits
                featureUnitsPlural = body.featureUnitsPlural
                metadata = body.metadata
                meter = body.meter
                unitTransformation = body.unitTransformation
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The description for the feature */
            fun description(description: String) = description(JsonField.of(description))

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

            /** The display name for the feature */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /** The configuration data for the feature */
            fun enumConfiguration(enumConfiguration: List<EnumConfiguration>) =
                enumConfiguration(JsonField.of(enumConfiguration))

            /**
             * Sets [Builder.enumConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enumConfiguration] with a well-typed
             * `List<EnumConfiguration>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun enumConfiguration(enumConfiguration: JsonField<List<EnumConfiguration>>) = apply {
                this.enumConfiguration = enumConfiguration.map { it.toMutableList() }
            }

            /**
             * Adds a single [EnumConfiguration] to [Builder.enumConfiguration].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEnumConfiguration(enumConfiguration: EnumConfiguration) = apply {
                this.enumConfiguration =
                    (this.enumConfiguration ?: JsonField.of(mutableListOf())).also {
                        checkKnown("enumConfiguration", it).add(enumConfiguration)
                    }
            }

            /** The units for the feature */
            fun featureUnits(featureUnits: String) = featureUnits(JsonField.of(featureUnits))

            /**
             * Sets [Builder.featureUnits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureUnits] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureUnits(featureUnits: JsonField<String>) = apply {
                this.featureUnits = featureUnits
            }

            /** The plural units for the feature */
            fun featureUnitsPlural(featureUnitsPlural: String) =
                featureUnitsPlural(JsonField.of(featureUnitsPlural))

            /**
             * Sets [Builder.featureUnitsPlural] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureUnitsPlural] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureUnitsPlural(featureUnitsPlural: JsonField<String>) = apply {
                this.featureUnitsPlural = featureUnitsPlural
            }

            /** The additional metadata for the feature */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun meter(meter: Meter) = meter(JsonField.of(meter))

            /**
             * Sets [Builder.meter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meter] with a well-typed [Meter] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun meter(meter: JsonField<Meter>) = apply { this.meter = meter }

            /** Unit transformation to be applied to the reported usage */
            fun unitTransformation(unitTransformation: UnitTransformation?) =
                unitTransformation(JsonField.ofNullable(unitTransformation))

            /**
             * Alias for calling [Builder.unitTransformation] with
             * `unitTransformation.orElse(null)`.
             */
            fun unitTransformation(unitTransformation: Optional<UnitTransformation>) =
                unitTransformation(unitTransformation.getOrNull())

            /**
             * Sets [Builder.unitTransformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitTransformation] with a well-typed
             * [UnitTransformation] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun unitTransformation(unitTransformation: JsonField<UnitTransformation>) = apply {
                this.unitTransformation = unitTransformation
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    description,
                    displayName,
                    (enumConfiguration ?: JsonMissing.of()).map { it.toImmutable() },
                    featureUnits,
                    featureUnitsPlural,
                    metadata,
                    meter,
                    unitTransformation,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            description()
            displayName()
            enumConfiguration().ifPresent { it.forEach { it.validate() } }
            featureUnits()
            featureUnitsPlural()
            metadata().ifPresent { it.validate() }
            meter().ifPresent { it.validate() }
            unitTransformation().ifPresent { it.validate() }
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
            (if (description.asKnown().isPresent) 1 else 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (enumConfiguration.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (featureUnits.asKnown().isPresent) 1 else 0) +
                (if (featureUnitsPlural.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (meter.asKnown().getOrNull()?.validity() ?: 0) +
                (unitTransformation.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                description == other.description &&
                displayName == other.displayName &&
                enumConfiguration == other.enumConfiguration &&
                featureUnits == other.featureUnits &&
                featureUnitsPlural == other.featureUnitsPlural &&
                metadata == other.metadata &&
                meter == other.meter &&
                unitTransformation == other.unitTransformation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                description,
                displayName,
                enumConfiguration,
                featureUnits,
                featureUnitsPlural,
                metadata,
                meter,
                unitTransformation,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, displayName=$displayName, enumConfiguration=$enumConfiguration, featureUnits=$featureUnits, featureUnitsPlural=$featureUnitsPlural, metadata=$metadata, meter=$meter, unitTransformation=$unitTransformation, additionalProperties=$additionalProperties}"
    }

    class EnumConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayName: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(displayName, value, mutableMapOf())

        /**
         * The display name for the enum configuration entity
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun displayName(): String = displayName.getRequired("displayName")

        /**
         * The unique value identifier for the enum configuration entity
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("displayName")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [EnumConfiguration].
             *
             * The following fields are required:
             * ```java
             * .displayName()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EnumConfiguration]. */
        class Builder internal constructor() {

            private var displayName: JsonField<String>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(enumConfiguration: EnumConfiguration) = apply {
                displayName = enumConfiguration.displayName
                value = enumConfiguration.value
                additionalProperties = enumConfiguration.additionalProperties.toMutableMap()
            }

            /** The display name for the enum configuration entity */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /** The unique value identifier for the enum configuration entity */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [EnumConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .displayName()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EnumConfiguration =
                EnumConfiguration(
                    checkRequired("displayName", displayName),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EnumConfiguration = apply {
            if (validated) {
                return@apply
            }

            displayName()
            value()
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
            (if (displayName.asKnown().isPresent) 1 else 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EnumConfiguration &&
                displayName == other.displayName &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(displayName, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EnumConfiguration{displayName=$displayName, value=$value, additionalProperties=$additionalProperties}"
    }

    /** The additional metadata for the feature */
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

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class Meter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val aggregation: JsonField<Aggregation>,
        private val filters: JsonField<List<Filter>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aggregation")
            @ExcludeMissing
            aggregation: JsonField<Aggregation> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<Filter>> = JsonMissing.of(),
        ) : this(aggregation, filters, mutableMapOf())

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun aggregation(): Aggregation = aggregation.getRequired("aggregation")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filters(): List<Filter> = filters.getRequired("filters")

        /**
         * Returns the raw JSON value of [aggregation].
         *
         * Unlike [aggregation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aggregation")
        @ExcludeMissing
        fun _aggregation(): JsonField<Aggregation> = aggregation

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

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
             * Returns a mutable builder for constructing an instance of [Meter].
             *
             * The following fields are required:
             * ```java
             * .aggregation()
             * .filters()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meter]. */
        class Builder internal constructor() {

            private var aggregation: JsonField<Aggregation>? = null
            private var filters: JsonField<MutableList<Filter>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meter: Meter) = apply {
                aggregation = meter.aggregation
                filters = meter.filters.map { it.toMutableList() }
                additionalProperties = meter.additionalProperties.toMutableMap()
            }

            fun aggregation(aggregation: Aggregation) = aggregation(JsonField.of(aggregation))

            /**
             * Sets [Builder.aggregation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregation] with a well-typed [Aggregation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aggregation(aggregation: JsonField<Aggregation>) = apply {
                this.aggregation = aggregation
            }

            fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filters(filters: JsonField<List<Filter>>) = apply {
                this.filters = filters.map { it.toMutableList() }
            }

            /**
             * Adds a single [Filter] to [filters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFilter(filter: Filter) = apply {
                filters =
                    (filters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("filters", it).add(filter)
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
             * Returns an immutable instance of [Meter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .aggregation()
             * .filters()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meter =
                Meter(
                    checkRequired("aggregation", aggregation),
                    checkRequired("filters", filters).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meter = apply {
            if (validated) {
                return@apply
            }

            aggregation().validate()
            filters().forEach { it.validate() }
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
            (aggregation.asKnown().getOrNull()?.validity() ?: 0) +
                (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Aggregation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val function: JsonField<Function>,
            private val field: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("function")
                @ExcludeMissing
                function: JsonField<Function> = JsonMissing.of(),
                @JsonProperty("field") @ExcludeMissing field: JsonField<String> = JsonMissing.of(),
            ) : this(function, field, mutableMapOf())

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun function(): Function = function.getRequired("function")

            /**
             * Aggregation field name
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun field(): Optional<String> = field.getOptional("field")

            /**
             * Returns the raw JSON value of [function].
             *
             * Unlike [function], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("function")
            @ExcludeMissing
            fun _function(): JsonField<Function> = function

            /**
             * Returns the raw JSON value of [field].
             *
             * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

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
                 * Returns a mutable builder for constructing an instance of [Aggregation].
                 *
                 * The following fields are required:
                 * ```java
                 * .function()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Aggregation]. */
            class Builder internal constructor() {

                private var function: JsonField<Function>? = null
                private var field: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(aggregation: Aggregation) = apply {
                    function = aggregation.function
                    field = aggregation.field
                    additionalProperties = aggregation.additionalProperties.toMutableMap()
                }

                fun function(function: Function) = function(JsonField.of(function))

                /**
                 * Sets [Builder.function] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.function] with a well-typed [Function] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun function(function: JsonField<Function>) = apply { this.function = function }

                /** Aggregation field name */
                fun field(field: String) = field(JsonField.of(field))

                /**
                 * Sets [Builder.field] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.field] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun field(field: JsonField<String>) = apply { this.field = field }

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
                 * Returns an immutable instance of [Aggregation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .function()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Aggregation =
                    Aggregation(
                        checkRequired("function", function),
                        field,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Aggregation = apply {
                if (validated) {
                    return@apply
                }

                function().validate()
                field()
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
                (function.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (field.asKnown().isPresent) 1 else 0)

            class Function @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val SUM = of("SUM")

                    @JvmField val MAX = of("MAX")

                    @JvmField val MIN = of("MIN")

                    @JvmField val AVG = of("AVG")

                    @JvmField val COUNT = of("COUNT")

                    @JvmField val UNIQUE = of("UNIQUE")

                    @JvmStatic fun of(value: String) = Function(JsonField.of(value))
                }

                /** An enum containing [Function]'s known values. */
                enum class Known {
                    SUM,
                    MAX,
                    MIN,
                    AVG,
                    COUNT,
                    UNIQUE,
                }

                /**
                 * An enum containing [Function]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Function] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SUM,
                    MAX,
                    MIN,
                    AVG,
                    COUNT,
                    UNIQUE,
                    /**
                     * An enum member indicating that [Function] was instantiated with an unknown
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
                        SUM -> Value.SUM
                        MAX -> Value.MAX
                        MIN -> Value.MIN
                        AVG -> Value.AVG
                        COUNT -> Value.COUNT
                        UNIQUE -> Value.UNIQUE
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
                        SUM -> Known.SUM
                        MAX -> Known.MAX
                        MIN -> Known.MIN
                        AVG -> Known.AVG
                        COUNT -> Known.COUNT
                        UNIQUE -> Known.UNIQUE
                        else -> throw StiggInvalidDataException("Unknown Function: $value")
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

                fun validate(): Function = apply {
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

                    return other is Function && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Aggregation &&
                    function == other.function &&
                    field == other.field &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(function, field, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Aggregation{function=$function, field=$field, additionalProperties=$additionalProperties}"
        }

        class Filter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val conditions: JsonField<List<Condition>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("conditions")
                @ExcludeMissing
                conditions: JsonField<List<Condition>> = JsonMissing.of()
            ) : this(conditions, mutableMapOf())

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun conditions(): List<Condition> = conditions.getRequired("conditions")

            /**
             * Returns the raw JSON value of [conditions].
             *
             * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("conditions")
            @ExcludeMissing
            fun _conditions(): JsonField<List<Condition>> = conditions

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
                 * Returns a mutable builder for constructing an instance of [Filter].
                 *
                 * The following fields are required:
                 * ```java
                 * .conditions()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Filter]. */
            class Builder internal constructor() {

                private var conditions: JsonField<MutableList<Condition>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(filter: Filter) = apply {
                    conditions = filter.conditions.map { it.toMutableList() }
                    additionalProperties = filter.additionalProperties.toMutableMap()
                }

                fun conditions(conditions: List<Condition>) = conditions(JsonField.of(conditions))

                /**
                 * Sets [Builder.conditions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conditions] with a well-typed `List<Condition>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun conditions(conditions: JsonField<List<Condition>>) = apply {
                    this.conditions = conditions.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Condition] to [conditions].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCondition(condition: Condition) = apply {
                    conditions =
                        (conditions ?: JsonField.of(mutableListOf())).also {
                            checkKnown("conditions", it).add(condition)
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
                 * Returns an immutable instance of [Filter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .conditions()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Filter =
                    Filter(
                        checkRequired("conditions", conditions).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Filter = apply {
                if (validated) {
                    return@apply
                }

                conditions().forEach { it.validate() }
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
                (conditions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Condition
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val field: JsonField<String>,
                private val operation: JsonField<Operation>,
                private val value: JsonField<String>,
                private val values: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("field")
                    @ExcludeMissing
                    field: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("operation")
                    @ExcludeMissing
                    operation: JsonField<Operation> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("values")
                    @ExcludeMissing
                    values: JsonField<List<String>> = JsonMissing.of(),
                ) : this(field, operation, value, values, mutableMapOf())

                /**
                 * Condition field name
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun field(): String = field.getRequired("field")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun operation(): Operation = operation.getRequired("operation")

                /**
                 * Condition value
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun value(): Optional<String> = value.getOptional("value")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun values(): Optional<List<String>> = values.getOptional("values")

                /**
                 * Returns the raw JSON value of [field].
                 *
                 * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

                /**
                 * Returns the raw JSON value of [operation].
                 *
                 * Unlike [operation], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operation")
                @ExcludeMissing
                fun _operation(): JsonField<Operation> = operation

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                /**
                 * Returns the raw JSON value of [values].
                 *
                 * Unlike [values], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("values")
                @ExcludeMissing
                fun _values(): JsonField<List<String>> = values

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
                     * Returns a mutable builder for constructing an instance of [Condition].
                     *
                     * The following fields are required:
                     * ```java
                     * .field()
                     * .operation()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Condition]. */
                class Builder internal constructor() {

                    private var field: JsonField<String>? = null
                    private var operation: JsonField<Operation>? = null
                    private var value: JsonField<String> = JsonMissing.of()
                    private var values: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(condition: Condition) = apply {
                        field = condition.field
                        operation = condition.operation
                        value = condition.value
                        values = condition.values.map { it.toMutableList() }
                        additionalProperties = condition.additionalProperties.toMutableMap()
                    }

                    /** Condition field name */
                    fun field(field: String) = field(JsonField.of(field))

                    /**
                     * Sets [Builder.field] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.field] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun field(field: JsonField<String>) = apply { this.field = field }

                    fun operation(operation: Operation) = operation(JsonField.of(operation))

                    /**
                     * Sets [Builder.operation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operation] with a well-typed [Operation]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun operation(operation: JsonField<Operation>) = apply {
                        this.operation = operation
                    }

                    /** Condition value */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

                    fun values(values: List<String>) = values(JsonField.of(values))

                    /**
                     * Sets [Builder.values] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.values] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun values(values: JsonField<List<String>>) = apply {
                        this.values = values.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [values].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addValue(value: String) = apply {
                        values =
                            (values ?: JsonField.of(mutableListOf())).also {
                                checkKnown("values", it).add(value)
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
                     * Returns an immutable instance of [Condition].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .field()
                     * .operation()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Condition =
                        Condition(
                            checkRequired("field", field),
                            checkRequired("operation", operation),
                            value,
                            (values ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Condition = apply {
                    if (validated) {
                        return@apply
                    }

                    field()
                    operation().validate()
                    value()
                    values()
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
                    (if (field.asKnown().isPresent) 1 else 0) +
                        (operation.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (value.asKnown().isPresent) 1 else 0) +
                        (values.asKnown().getOrNull()?.size ?: 0)

                class Operation
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

                        @JvmField val EQUALS = of("EQUALS")

                        @JvmField val NOT_EQUALS = of("NOT_EQUALS")

                        @JvmField val GREATER_THAN = of("GREATER_THAN")

                        @JvmField val GREATER_THAN_OR_EQUAL = of("GREATER_THAN_OR_EQUAL")

                        @JvmField val LESS_THAN = of("LESS_THAN")

                        @JvmField val LESS_THAN_OR_EQUAL = of("LESS_THAN_OR_EQUAL")

                        @JvmField val IS_NULL = of("IS_NULL")

                        @JvmField val IS_NOT_NULL = of("IS_NOT_NULL")

                        @JvmField val CONTAINS = of("CONTAINS")

                        @JvmField val STARTS_WITH = of("STARTS_WITH")

                        @JvmField val ENDS_WITH = of("ENDS_WITH")

                        @JvmField val IN = of("IN")

                        @JvmStatic fun of(value: String) = Operation(JsonField.of(value))
                    }

                    /** An enum containing [Operation]'s known values. */
                    enum class Known {
                        EQUALS,
                        NOT_EQUALS,
                        GREATER_THAN,
                        GREATER_THAN_OR_EQUAL,
                        LESS_THAN,
                        LESS_THAN_OR_EQUAL,
                        IS_NULL,
                        IS_NOT_NULL,
                        CONTAINS,
                        STARTS_WITH,
                        ENDS_WITH,
                        IN,
                    }

                    /**
                     * An enum containing [Operation]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Operation] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        EQUALS,
                        NOT_EQUALS,
                        GREATER_THAN,
                        GREATER_THAN_OR_EQUAL,
                        LESS_THAN,
                        LESS_THAN_OR_EQUAL,
                        IS_NULL,
                        IS_NOT_NULL,
                        CONTAINS,
                        STARTS_WITH,
                        ENDS_WITH,
                        IN,
                        /**
                         * An enum member indicating that [Operation] was instantiated with an
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
                            EQUALS -> Value.EQUALS
                            NOT_EQUALS -> Value.NOT_EQUALS
                            GREATER_THAN -> Value.GREATER_THAN
                            GREATER_THAN_OR_EQUAL -> Value.GREATER_THAN_OR_EQUAL
                            LESS_THAN -> Value.LESS_THAN
                            LESS_THAN_OR_EQUAL -> Value.LESS_THAN_OR_EQUAL
                            IS_NULL -> Value.IS_NULL
                            IS_NOT_NULL -> Value.IS_NOT_NULL
                            CONTAINS -> Value.CONTAINS
                            STARTS_WITH -> Value.STARTS_WITH
                            ENDS_WITH -> Value.ENDS_WITH
                            IN -> Value.IN
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
                            EQUALS -> Known.EQUALS
                            NOT_EQUALS -> Known.NOT_EQUALS
                            GREATER_THAN -> Known.GREATER_THAN
                            GREATER_THAN_OR_EQUAL -> Known.GREATER_THAN_OR_EQUAL
                            LESS_THAN -> Known.LESS_THAN
                            LESS_THAN_OR_EQUAL -> Known.LESS_THAN_OR_EQUAL
                            IS_NULL -> Known.IS_NULL
                            IS_NOT_NULL -> Known.IS_NOT_NULL
                            CONTAINS -> Known.CONTAINS
                            STARTS_WITH -> Known.STARTS_WITH
                            ENDS_WITH -> Known.ENDS_WITH
                            IN -> Known.IN
                            else -> throw StiggInvalidDataException("Unknown Operation: $value")
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

                    fun validate(): Operation = apply {
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

                        return other is Operation && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Condition &&
                        field == other.field &&
                        operation == other.operation &&
                        value == other.value &&
                        values == other.values &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(field, operation, value, values, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Condition{field=$field, operation=$operation, value=$value, values=$values, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Filter &&
                    conditions == other.conditions &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(conditions, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Filter{conditions=$conditions, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meter &&
                aggregation == other.aggregation &&
                filters == other.filters &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(aggregation, filters, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meter{aggregation=$aggregation, filters=$filters, additionalProperties=$additionalProperties}"
    }

    /** Unit transformation to be applied to the reported usage */
    class UnitTransformation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val divide: JsonField<Long>,
        private val featureUnits: JsonField<String>,
        private val featureUnitsPlural: JsonField<String>,
        private val round: JsonField<Round>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("divide") @ExcludeMissing divide: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("featureUnits")
            @ExcludeMissing
            featureUnits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("featureUnitsPlural")
            @ExcludeMissing
            featureUnitsPlural: JsonField<String> = JsonMissing.of(),
            @JsonProperty("round") @ExcludeMissing round: JsonField<Round> = JsonMissing.of(),
        ) : this(divide, featureUnits, featureUnitsPlural, round, mutableMapOf())

        /**
         * Divide usage by this number
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun divide(): Long = divide.getRequired("divide")

        /**
         * Singular feature units after the transformation
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureUnits(): Optional<String> = featureUnits.getOptional("featureUnits")

        /**
         * Plural feature units after the transformation
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureUnitsPlural(): Optional<String> =
            featureUnitsPlural.getOptional("featureUnitsPlural")

        /**
         * After division, either round the result up or down
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun round(): Optional<Round> = round.getOptional("round")

        /**
         * Returns the raw JSON value of [divide].
         *
         * Unlike [divide], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("divide") @ExcludeMissing fun _divide(): JsonField<Long> = divide

        /**
         * Returns the raw JSON value of [featureUnits].
         *
         * Unlike [featureUnits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("featureUnits")
        @ExcludeMissing
        fun _featureUnits(): JsonField<String> = featureUnits

        /**
         * Returns the raw JSON value of [featureUnitsPlural].
         *
         * Unlike [featureUnitsPlural], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("featureUnitsPlural")
        @ExcludeMissing
        fun _featureUnitsPlural(): JsonField<String> = featureUnitsPlural

        /**
         * Returns the raw JSON value of [round].
         *
         * Unlike [round], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("round") @ExcludeMissing fun _round(): JsonField<Round> = round

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
             * Returns a mutable builder for constructing an instance of [UnitTransformation].
             *
             * The following fields are required:
             * ```java
             * .divide()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnitTransformation]. */
        class Builder internal constructor() {

            private var divide: JsonField<Long>? = null
            private var featureUnits: JsonField<String> = JsonMissing.of()
            private var featureUnitsPlural: JsonField<String> = JsonMissing.of()
            private var round: JsonField<Round> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unitTransformation: UnitTransformation) = apply {
                divide = unitTransformation.divide
                featureUnits = unitTransformation.featureUnits
                featureUnitsPlural = unitTransformation.featureUnitsPlural
                round = unitTransformation.round
                additionalProperties = unitTransformation.additionalProperties.toMutableMap()
            }

            /** Divide usage by this number */
            fun divide(divide: Long) = divide(JsonField.of(divide))

            /**
             * Sets [Builder.divide] to an arbitrary JSON value.
             *
             * You should usually call [Builder.divide] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun divide(divide: JsonField<Long>) = apply { this.divide = divide }

            /** Singular feature units after the transformation */
            fun featureUnits(featureUnits: String) = featureUnits(JsonField.of(featureUnits))

            /**
             * Sets [Builder.featureUnits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureUnits] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureUnits(featureUnits: JsonField<String>) = apply {
                this.featureUnits = featureUnits
            }

            /** Plural feature units after the transformation */
            fun featureUnitsPlural(featureUnitsPlural: String) =
                featureUnitsPlural(JsonField.of(featureUnitsPlural))

            /**
             * Sets [Builder.featureUnitsPlural] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureUnitsPlural] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureUnitsPlural(featureUnitsPlural: JsonField<String>) = apply {
                this.featureUnitsPlural = featureUnitsPlural
            }

            /** After division, either round the result up or down */
            fun round(round: Round) = round(JsonField.of(round))

            /**
             * Sets [Builder.round] to an arbitrary JSON value.
             *
             * You should usually call [Builder.round] with a well-typed [Round] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun round(round: JsonField<Round>) = apply { this.round = round }

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
             * Returns an immutable instance of [UnitTransformation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .divide()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnitTransformation =
                UnitTransformation(
                    checkRequired("divide", divide),
                    featureUnits,
                    featureUnitsPlural,
                    round,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnitTransformation = apply {
            if (validated) {
                return@apply
            }

            divide()
            featureUnits()
            featureUnitsPlural()
            round().ifPresent { it.validate() }
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
            (if (divide.asKnown().isPresent) 1 else 0) +
                (if (featureUnits.asKnown().isPresent) 1 else 0) +
                (if (featureUnitsPlural.asKnown().isPresent) 1 else 0) +
                (round.asKnown().getOrNull()?.validity() ?: 0)

        /** After division, either round the result up or down */
        class Round @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val UP = of("UP")

                @JvmField val DOWN = of("DOWN")

                @JvmStatic fun of(value: String) = Round(JsonField.of(value))
            }

            /** An enum containing [Round]'s known values. */
            enum class Known {
                UP,
                DOWN,
            }

            /**
             * An enum containing [Round]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Round] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UP,
                DOWN,
                /**
                 * An enum member indicating that [Round] was instantiated with an unknown value.
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
                    UP -> Value.UP
                    DOWN -> Value.DOWN
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
                    UP -> Known.UP
                    DOWN -> Known.DOWN
                    else -> throw StiggInvalidDataException("Unknown Round: $value")
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

            fun validate(): Round = apply {
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

                return other is Round && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnitTransformation &&
                divide == other.divide &&
                featureUnits == other.featureUnits &&
                featureUnitsPlural == other.featureUnitsPlural &&
                round == other.round &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(divide, featureUnits, featureUnitsPlural, round, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnitTransformation{divide=$divide, featureUnits=$featureUnits, featureUnitsPlural=$featureUnitsPlural, round=$round, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeatureUpdateFeatureParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FeatureUpdateFeatureParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
