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

/** Creates a new feature with the specified type, metering, and configuration. */
class FeatureCreateFeatureParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The unique identifier for the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = body.id()

    /**
     * The display name for the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = body.displayName()

    /**
     * The type of the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun featureType(): FeatureType = body.featureType()

    /**
     * The description for the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The configuration data for the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enumConfiguration(): Optional<List<EnumConfiguration>> = body.enumConfiguration()

    /**
     * The status of the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun featureStatus(): Optional<FeatureStatus> = body.featureStatus()

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
     * The meter type for the feature
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meterType(): Optional<MeterType> = body.meterType()

    /**
     * Unit transformation to be applied to the reported usage
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unitTransformation(): Optional<UnitTransformation> = body.unitTransformation()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [featureType].
     *
     * Unlike [featureType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _featureType(): JsonField<FeatureType> = body._featureType()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [enumConfiguration].
     *
     * Unlike [enumConfiguration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _enumConfiguration(): JsonField<List<EnumConfiguration>> = body._enumConfiguration()

    /**
     * Returns the raw JSON value of [featureStatus].
     *
     * Unlike [featureStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _featureStatus(): JsonField<FeatureStatus> = body._featureStatus()

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
     * Returns the raw JSON value of [meterType].
     *
     * Unlike [meterType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _meterType(): JsonField<MeterType> = body._meterType()

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

        /**
         * Returns a mutable builder for constructing an instance of [FeatureCreateFeatureParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .displayName()
         * .featureType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeatureCreateFeatureParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(featureCreateFeatureParams: FeatureCreateFeatureParams) = apply {
            body = featureCreateFeatureParams.body.toBuilder()
            additionalHeaders = featureCreateFeatureParams.additionalHeaders.toBuilder()
            additionalQueryParams = featureCreateFeatureParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [displayName]
         * - [featureType]
         * - [description]
         * - [enumConfiguration]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The unique identifier for the feature */
        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

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

        /** The type of the feature */
        fun featureType(featureType: FeatureType) = apply { body.featureType(featureType) }

        /**
         * Sets [Builder.featureType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureType] with a well-typed [FeatureType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun featureType(featureType: JsonField<FeatureType>) = apply {
            body.featureType(featureType)
        }

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

        /** The status of the feature */
        fun featureStatus(featureStatus: FeatureStatus) = apply {
            body.featureStatus(featureStatus)
        }

        /**
         * Sets [Builder.featureStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureStatus] with a well-typed [FeatureStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun featureStatus(featureStatus: JsonField<FeatureStatus>) = apply {
            body.featureStatus(featureStatus)
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

        /** The meter type for the feature */
        fun meterType(meterType: MeterType) = apply { body.meterType(meterType) }

        /**
         * Sets [Builder.meterType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterType] with a well-typed [MeterType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meterType(meterType: JsonField<MeterType>) = apply { body.meterType(meterType) }

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
         * Returns an immutable instance of [FeatureCreateFeatureParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .displayName()
         * .featureType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeatureCreateFeatureParams =
            FeatureCreateFeatureParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Create a new feature with type, optional metering, and configuration. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val displayName: JsonField<String>,
        private val featureType: JsonField<FeatureType>,
        private val description: JsonField<String>,
        private val enumConfiguration: JsonField<List<EnumConfiguration>>,
        private val featureStatus: JsonField<FeatureStatus>,
        private val featureUnits: JsonField<String>,
        private val featureUnitsPlural: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val meterType: JsonField<MeterType>,
        private val unitTransformation: JsonField<UnitTransformation>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("featureType")
            @ExcludeMissing
            featureType: JsonField<FeatureType> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enumConfiguration")
            @ExcludeMissing
            enumConfiguration: JsonField<List<EnumConfiguration>> = JsonMissing.of(),
            @JsonProperty("featureStatus")
            @ExcludeMissing
            featureStatus: JsonField<FeatureStatus> = JsonMissing.of(),
            @JsonProperty("featureUnits")
            @ExcludeMissing
            featureUnits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("featureUnitsPlural")
            @ExcludeMissing
            featureUnitsPlural: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("meterType")
            @ExcludeMissing
            meterType: JsonField<MeterType> = JsonMissing.of(),
            @JsonProperty("unitTransformation")
            @ExcludeMissing
            unitTransformation: JsonField<UnitTransformation> = JsonMissing.of(),
        ) : this(
            id,
            displayName,
            featureType,
            description,
            enumConfiguration,
            featureStatus,
            featureUnits,
            featureUnitsPlural,
            metadata,
            meterType,
            unitTransformation,
            mutableMapOf(),
        )

        /**
         * The unique identifier for the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The display name for the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun displayName(): String = displayName.getRequired("displayName")

        /**
         * The type of the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun featureType(): FeatureType = featureType.getRequired("featureType")

        /**
         * The description for the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The configuration data for the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enumConfiguration(): Optional<List<EnumConfiguration>> =
            enumConfiguration.getOptional("enumConfiguration")

        /**
         * The status of the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureStatus(): Optional<FeatureStatus> = featureStatus.getOptional("featureStatus")

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
         * The meter type for the feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun meterType(): Optional<MeterType> = meterType.getOptional("meterType")

        /**
         * Unit transformation to be applied to the reported usage
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unitTransformation(): Optional<UnitTransformation> =
            unitTransformation.getOptional("unitTransformation")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("displayName")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [featureType].
         *
         * Unlike [featureType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureType")
        @ExcludeMissing
        fun _featureType(): JsonField<FeatureType> = featureType

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
         * Returns the raw JSON value of [featureStatus].
         *
         * Unlike [featureStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("featureStatus")
        @ExcludeMissing
        fun _featureStatus(): JsonField<FeatureStatus> = featureStatus

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
         * Returns the raw JSON value of [meterType].
         *
         * Unlike [meterType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meterType")
        @ExcludeMissing
        fun _meterType(): JsonField<MeterType> = meterType

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .displayName()
             * .featureType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var displayName: JsonField<String>? = null
            private var featureType: JsonField<FeatureType>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var enumConfiguration: JsonField<MutableList<EnumConfiguration>>? = null
            private var featureStatus: JsonField<FeatureStatus> = JsonMissing.of()
            private var featureUnits: JsonField<String> = JsonMissing.of()
            private var featureUnitsPlural: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var meterType: JsonField<MeterType> = JsonMissing.of()
            private var unitTransformation: JsonField<UnitTransformation> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                displayName = body.displayName
                featureType = body.featureType
                description = body.description
                enumConfiguration = body.enumConfiguration.map { it.toMutableList() }
                featureStatus = body.featureStatus
                featureUnits = body.featureUnits
                featureUnitsPlural = body.featureUnitsPlural
                metadata = body.metadata
                meterType = body.meterType
                unitTransformation = body.unitTransformation
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The unique identifier for the feature */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            /** The type of the feature */
            fun featureType(featureType: FeatureType) = featureType(JsonField.of(featureType))

            /**
             * Sets [Builder.featureType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureType] with a well-typed [FeatureType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureType(featureType: JsonField<FeatureType>) = apply {
                this.featureType = featureType
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

            /** The status of the feature */
            fun featureStatus(featureStatus: FeatureStatus) =
                featureStatus(JsonField.of(featureStatus))

            /**
             * Sets [Builder.featureStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureStatus] with a well-typed [FeatureStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun featureStatus(featureStatus: JsonField<FeatureStatus>) = apply {
                this.featureStatus = featureStatus
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

            /** The meter type for the feature */
            fun meterType(meterType: MeterType) = meterType(JsonField.of(meterType))

            /**
             * Sets [Builder.meterType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterType] with a well-typed [MeterType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterType(meterType: JsonField<MeterType>) = apply { this.meterType = meterType }

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
             *
             * The following fields are required:
             * ```java
             * .id()
             * .displayName()
             * .featureType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("id", id),
                    checkRequired("displayName", displayName),
                    checkRequired("featureType", featureType),
                    description,
                    (enumConfiguration ?: JsonMissing.of()).map { it.toImmutable() },
                    featureStatus,
                    featureUnits,
                    featureUnitsPlural,
                    metadata,
                    meterType,
                    unitTransformation,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            id()
            displayName()
            featureType().validate()
            description()
            enumConfiguration().ifPresent { it.forEach { it.validate() } }
            featureStatus().ifPresent { it.validate() }
            featureUnits()
            featureUnitsPlural()
            metadata().ifPresent { it.validate() }
            meterType().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (featureType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (enumConfiguration.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (featureStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (featureUnits.asKnown().isPresent) 1 else 0) +
                (if (featureUnitsPlural.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (meterType.asKnown().getOrNull()?.validity() ?: 0) +
                (unitTransformation.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                displayName == other.displayName &&
                featureType == other.featureType &&
                description == other.description &&
                enumConfiguration == other.enumConfiguration &&
                featureStatus == other.featureStatus &&
                featureUnits == other.featureUnits &&
                featureUnitsPlural == other.featureUnitsPlural &&
                metadata == other.metadata &&
                meterType == other.meterType &&
                unitTransformation == other.unitTransformation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                displayName,
                featureType,
                description,
                enumConfiguration,
                featureStatus,
                featureUnits,
                featureUnitsPlural,
                metadata,
                meterType,
                unitTransformation,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, displayName=$displayName, featureType=$featureType, description=$description, enumConfiguration=$enumConfiguration, featureStatus=$featureStatus, featureUnits=$featureUnits, featureUnitsPlural=$featureUnitsPlural, metadata=$metadata, meterType=$meterType, unitTransformation=$unitTransformation, additionalProperties=$additionalProperties}"
    }

    /** The type of the feature */
    class FeatureType @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * An enum containing [FeatureType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FeatureType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BOOLEAN,
            NUMBER,
            ENUM,
            /**
             * An enum member indicating that [FeatureType] was instantiated with an unknown value.
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
                BOOLEAN -> Value.BOOLEAN
                NUMBER -> Value.NUMBER
                ENUM -> Value.ENUM
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
                BOOLEAN -> Known.BOOLEAN
                NUMBER -> Known.NUMBER
                ENUM -> Known.ENUM
                else -> throw StiggInvalidDataException("Unknown FeatureType: $value")
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeatureType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

    /** The status of the feature */
    class FeatureStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * An enum containing [FeatureStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FeatureStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NEW,
            SUSPENDED,
            ACTIVE,
            /**
             * An enum member indicating that [FeatureStatus] was instantiated with an unknown
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
                NEW -> Value.NEW
                SUSPENDED -> Value.SUSPENDED
                ACTIVE -> Value.ACTIVE
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
                NEW -> Known.NEW
                SUSPENDED -> Known.SUSPENDED
                ACTIVE -> Known.ACTIVE
                else -> throw StiggInvalidDataException("Unknown FeatureStatus: $value")
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeatureStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

    /** The meter type for the feature */
    class MeterType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NONE = of("None")

            @JvmField val FLUCTUATING = of("FLUCTUATING")

            @JvmField val INCREMENTAL = of("INCREMENTAL")

            @JvmStatic fun of(value: String) = MeterType(JsonField.of(value))
        }

        /** An enum containing [MeterType]'s known values. */
        enum class Known {
            NONE,
            FLUCTUATING,
            INCREMENTAL,
        }

        /**
         * An enum containing [MeterType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MeterType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            FLUCTUATING,
            INCREMENTAL,
            /**
             * An enum member indicating that [MeterType] was instantiated with an unknown value.
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
                NONE -> Value.NONE
                FLUCTUATING -> Value.FLUCTUATING
                INCREMENTAL -> Value.INCREMENTAL
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
                NONE -> Known.NONE
                FLUCTUATING -> Known.FLUCTUATING
                INCREMENTAL -> Known.INCREMENTAL
                else -> throw StiggInvalidDataException("Unknown MeterType: $value")
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

        fun validate(): MeterType = apply {
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

            return other is MeterType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

        return other is FeatureCreateFeatureParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FeatureCreateFeatureParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
