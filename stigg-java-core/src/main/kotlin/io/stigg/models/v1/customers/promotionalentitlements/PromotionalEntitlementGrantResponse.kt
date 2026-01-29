// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.promotionalentitlements

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
class PromotionalEntitlementGrantResponse
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
         * Returns a mutable builder for constructing an instance of
         * [PromotionalEntitlementGrantResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromotionalEntitlementGrantResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            promotionalEntitlementGrantResponse: PromotionalEntitlementGrantResponse
        ) = apply {
            data = promotionalEntitlementGrantResponse.data.map { it.toMutableList() }
            additionalProperties =
                promotionalEntitlementGrantResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [PromotionalEntitlementGrantResponse].
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
        fun build(): PromotionalEntitlementGrantResponse =
            PromotionalEntitlementGrantResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PromotionalEntitlementGrantResponse = apply {
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

    /** Granted feature entitlement */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val endDate: JsonField<OffsetDateTime>,
        private val enumValues: JsonField<List<String>>,
        private val environmentId: JsonField<String>,
        private val featureGroupIds: JsonField<List<String>>,
        private val featureId: JsonField<String>,
        private val hasSoftLimit: JsonField<Boolean>,
        private val hasUnlimitedUsage: JsonField<Boolean>,
        private val isVisible: JsonField<Boolean>,
        private val period: JsonField<Period>,
        private val resetPeriod: JsonField<ResetPeriod>,
        private val resetPeriodConfiguration: JsonField<ResetPeriodConfiguration>,
        private val startDate: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val usageLimit: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("endDate")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("enumValues")
            @ExcludeMissing
            enumValues: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("environmentId")
            @ExcludeMissing
            environmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("featureGroupIds")
            @ExcludeMissing
            featureGroupIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("featureId")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hasSoftLimit")
            @ExcludeMissing
            hasSoftLimit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hasUnlimitedUsage")
            @ExcludeMissing
            hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isVisible")
            @ExcludeMissing
            isVisible: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("period") @ExcludeMissing period: JsonField<Period> = JsonMissing.of(),
            @JsonProperty("resetPeriod")
            @ExcludeMissing
            resetPeriod: JsonField<ResetPeriod> = JsonMissing.of(),
            @JsonProperty("resetPeriodConfiguration")
            @ExcludeMissing
            resetPeriodConfiguration: JsonField<ResetPeriodConfiguration> = JsonMissing.of(),
            @JsonProperty("startDate")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("usageLimit")
            @ExcludeMissing
            usageLimit: JsonField<Double> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            description,
            endDate,
            enumValues,
            environmentId,
            featureGroupIds,
            featureId,
            hasSoftLimit,
            hasUnlimitedUsage,
            isVisible,
            period,
            resetPeriod,
            resetPeriodConfiguration,
            startDate,
            status,
            updatedAt,
            usageLimit,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the entity
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Timestamp of when the record was created
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * The description of the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The end date of the promotional entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("endDate")

        /**
         * The enum values of the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enumValues(): Optional<List<String>> = enumValues.getOptional("enumValues")

        /**
         * The unique identifier for the environment
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun environmentId(): String = environmentId.getRequired("environmentId")

        /**
         * Feature group IDs associated with this entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureGroupIds(): Optional<List<String>> =
            featureGroupIds.getOptional("featureGroupIds")

        /**
         * The unique identifier of the entitlement feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun featureId(): String = featureId.getRequired("featureId")

        /**
         * Whether the entitlement has a soft limit
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasSoftLimit(): Optional<Boolean> = hasSoftLimit.getOptional("hasSoftLimit")

        /**
         * Whether the entitlement has an unlimited usage
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasUnlimitedUsage(): Optional<Boolean> =
            hasUnlimitedUsage.getOptional("hasUnlimitedUsage")

        /**
         * Whether the entitlement is visible
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isVisible(): Boolean = isVisible.getRequired("isVisible")

        /**
         * The grant period of the promotional entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun period(): Period = period.getRequired("period")

        /**
         * The reset period of the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resetPeriod(): Optional<ResetPeriod> = resetPeriod.getOptional("resetPeriod")

        /**
         * The reset period configuration of the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resetPeriodConfiguration(): Optional<ResetPeriodConfiguration> =
            resetPeriodConfiguration.getOptional("resetPeriodConfiguration")

        /**
         * The start date of the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

        /**
         * The status of the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Timestamp of when the record was last updated
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

        /**
         * The usage limit of the entitlement
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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [enumValues].
         *
         * Unlike [enumValues], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enumValues")
        @ExcludeMissing
        fun _enumValues(): JsonField<List<String>> = enumValues

        /**
         * Returns the raw JSON value of [environmentId].
         *
         * Unlike [environmentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("environmentId")
        @ExcludeMissing
        fun _environmentId(): JsonField<String> = environmentId

        /**
         * Returns the raw JSON value of [featureGroupIds].
         *
         * Unlike [featureGroupIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("featureGroupIds")
        @ExcludeMissing
        fun _featureGroupIds(): JsonField<List<String>> = featureGroupIds

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
         * Returns the raw JSON value of [isVisible].
         *
         * Unlike [isVisible], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isVisible") @ExcludeMissing fun _isVisible(): JsonField<Boolean> = isVisible

        /**
         * Returns the raw JSON value of [period].
         *
         * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<Period> = period

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
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
             * .createdAt()
             * .description()
             * .endDate()
             * .enumValues()
             * .environmentId()
             * .featureGroupIds()
             * .featureId()
             * .hasSoftLimit()
             * .hasUnlimitedUsage()
             * .isVisible()
             * .period()
             * .resetPeriod()
             * .resetPeriodConfiguration()
             * .startDate()
             * .status()
             * .updatedAt()
             * .usageLimit()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var description: JsonField<String>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var enumValues: JsonField<MutableList<String>>? = null
            private var environmentId: JsonField<String>? = null
            private var featureGroupIds: JsonField<MutableList<String>>? = null
            private var featureId: JsonField<String>? = null
            private var hasSoftLimit: JsonField<Boolean>? = null
            private var hasUnlimitedUsage: JsonField<Boolean>? = null
            private var isVisible: JsonField<Boolean>? = null
            private var period: JsonField<Period>? = null
            private var resetPeriod: JsonField<ResetPeriod>? = null
            private var resetPeriodConfiguration: JsonField<ResetPeriodConfiguration>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var status: JsonField<Status>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var usageLimit: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                description = data.description
                endDate = data.endDate
                enumValues = data.enumValues.map { it.toMutableList() }
                environmentId = data.environmentId
                featureGroupIds = data.featureGroupIds.map { it.toMutableList() }
                featureId = data.featureId
                hasSoftLimit = data.hasSoftLimit
                hasUnlimitedUsage = data.hasUnlimitedUsage
                isVisible = data.isVisible
                period = data.period
                resetPeriod = data.resetPeriod
                resetPeriodConfiguration = data.resetPeriodConfiguration
                startDate = data.startDate
                status = data.status
                updatedAt = data.updatedAt
                usageLimit = data.usageLimit
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the entity */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            /** The description of the entitlement */
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

            /** The end date of the promotional entitlement */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The enum values of the entitlement */
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

            /** The unique identifier for the environment */
            fun environmentId(environmentId: String) = environmentId(JsonField.of(environmentId))

            /**
             * Sets [Builder.environmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.environmentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun environmentId(environmentId: JsonField<String>) = apply {
                this.environmentId = environmentId
            }

            /** Feature group IDs associated with this entitlement */
            fun featureGroupIds(featureGroupIds: List<String>?) =
                featureGroupIds(JsonField.ofNullable(featureGroupIds))

            /** Alias for calling [Builder.featureGroupIds] with `featureGroupIds.orElse(null)`. */
            fun featureGroupIds(featureGroupIds: Optional<List<String>>) =
                featureGroupIds(featureGroupIds.getOrNull())

            /**
             * Sets [Builder.featureGroupIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureGroupIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun featureGroupIds(featureGroupIds: JsonField<List<String>>) = apply {
                this.featureGroupIds = featureGroupIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [featureGroupIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFeatureGroupId(featureGroupId: String) = apply {
                featureGroupIds =
                    (featureGroupIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("featureGroupIds", it).add(featureGroupId)
                    }
            }

            /** The unique identifier of the entitlement feature */
            fun featureId(featureId: String) = featureId(JsonField.of(featureId))

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

            /** Whether the entitlement has a soft limit */
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

            /** Whether the entitlement has an unlimited usage */
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

            /** Whether the entitlement is visible */
            fun isVisible(isVisible: Boolean) = isVisible(JsonField.of(isVisible))

            /**
             * Sets [Builder.isVisible] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isVisible] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isVisible(isVisible: JsonField<Boolean>) = apply { this.isVisible = isVisible }

            /** The grant period of the promotional entitlement */
            fun period(period: Period) = period(JsonField.of(period))

            /**
             * Sets [Builder.period] to an arbitrary JSON value.
             *
             * You should usually call [Builder.period] with a well-typed [Period] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun period(period: JsonField<Period>) = apply { this.period = period }

            /** The reset period of the entitlement */
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

            /** The reset period configuration of the entitlement */
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

            /** The start date of the entitlement */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** The status of the entitlement */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            /** The usage limit of the entitlement */
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
             * .createdAt()
             * .description()
             * .endDate()
             * .enumValues()
             * .environmentId()
             * .featureGroupIds()
             * .featureId()
             * .hasSoftLimit()
             * .hasUnlimitedUsage()
             * .isVisible()
             * .period()
             * .resetPeriod()
             * .resetPeriodConfiguration()
             * .startDate()
             * .status()
             * .updatedAt()
             * .usageLimit()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("description", description),
                    checkRequired("endDate", endDate),
                    checkRequired("enumValues", enumValues).map { it.toImmutable() },
                    checkRequired("environmentId", environmentId),
                    checkRequired("featureGroupIds", featureGroupIds).map { it.toImmutable() },
                    checkRequired("featureId", featureId),
                    checkRequired("hasSoftLimit", hasSoftLimit),
                    checkRequired("hasUnlimitedUsage", hasUnlimitedUsage),
                    checkRequired("isVisible", isVisible),
                    checkRequired("period", period),
                    checkRequired("resetPeriod", resetPeriod),
                    checkRequired("resetPeriodConfiguration", resetPeriodConfiguration),
                    checkRequired("startDate", startDate),
                    checkRequired("status", status),
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
            createdAt()
            description()
            endDate()
            enumValues()
            environmentId()
            featureGroupIds()
            featureId()
            hasSoftLimit()
            hasUnlimitedUsage()
            isVisible()
            period().validate()
            resetPeriod().ifPresent { it.validate() }
            resetPeriodConfiguration().ifPresent { it.validate() }
            startDate()
            status().validate()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (enumValues.asKnown().getOrNull()?.size ?: 0) +
                (if (environmentId.asKnown().isPresent) 1 else 0) +
                (featureGroupIds.asKnown().getOrNull()?.size ?: 0) +
                (if (featureId.asKnown().isPresent) 1 else 0) +
                (if (hasSoftLimit.asKnown().isPresent) 1 else 0) +
                (if (hasUnlimitedUsage.asKnown().isPresent) 1 else 0) +
                (if (isVisible.asKnown().isPresent) 1 else 0) +
                (period.asKnown().getOrNull()?.validity() ?: 0) +
                (resetPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                (resetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (usageLimit.asKnown().isPresent) 1 else 0)

        /** The grant period of the promotional entitlement */
        class Period @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val _1_WEEK = of("1 week")

                @JvmField val _1_MONTH = of("1 month")

                @JvmField val _6_MONTH = of("6 month")

                @JvmField val _1_YEAR = of("1 year")

                @JvmField val LIFETIME = of("lifetime")

                @JvmField val CUSTOM = of("custom")

                @JvmStatic fun of(value: String) = Period(JsonField.of(value))
            }

            /** An enum containing [Period]'s known values. */
            enum class Known {
                _1_WEEK,
                _1_MONTH,
                _6_MONTH,
                _1_YEAR,
                LIFETIME,
                CUSTOM,
            }

            /**
             * An enum containing [Period]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Period] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                _1_WEEK,
                _1_MONTH,
                _6_MONTH,
                _1_YEAR,
                LIFETIME,
                CUSTOM,
                /**
                 * An enum member indicating that [Period] was instantiated with an unknown value.
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
                    _1_WEEK -> Value._1_WEEK
                    _1_MONTH -> Value._1_MONTH
                    _6_MONTH -> Value._6_MONTH
                    _1_YEAR -> Value._1_YEAR
                    LIFETIME -> Value.LIFETIME
                    CUSTOM -> Value.CUSTOM
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
                    _1_WEEK -> Known._1_WEEK
                    _1_MONTH -> Known._1_MONTH
                    _6_MONTH -> Known._6_MONTH
                    _1_YEAR -> Known._1_YEAR
                    LIFETIME -> Known.LIFETIME
                    CUSTOM -> Known.CUSTOM
                    else -> throw StiggInvalidDataException("Unknown Period: $value")
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

            fun validate(): Period = apply {
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

                return other is Period && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The reset period of the entitlement */
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

        /** The reset period configuration of the entitlement */
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

        /** The status of the entitlement */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ACTIVE = of("Active")

                @JvmField val EXPIRED = of("Expired")

                @JvmField val PAUSED = of("Paused")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ACTIVE,
                EXPIRED,
                PAUSED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACTIVE,
                EXPIRED,
                PAUSED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    ACTIVE -> Value.ACTIVE
                    EXPIRED -> Value.EXPIRED
                    PAUSED -> Value.PAUSED
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
                    ACTIVE -> Known.ACTIVE
                    EXPIRED -> Known.EXPIRED
                    PAUSED -> Known.PAUSED
                    else -> throw StiggInvalidDataException("Unknown Status: $value")
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

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
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
                description == other.description &&
                endDate == other.endDate &&
                enumValues == other.enumValues &&
                environmentId == other.environmentId &&
                featureGroupIds == other.featureGroupIds &&
                featureId == other.featureId &&
                hasSoftLimit == other.hasSoftLimit &&
                hasUnlimitedUsage == other.hasUnlimitedUsage &&
                isVisible == other.isVisible &&
                period == other.period &&
                resetPeriod == other.resetPeriod &&
                resetPeriodConfiguration == other.resetPeriodConfiguration &&
                startDate == other.startDate &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                usageLimit == other.usageLimit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                description,
                endDate,
                enumValues,
                environmentId,
                featureGroupIds,
                featureId,
                hasSoftLimit,
                hasUnlimitedUsage,
                isVisible,
                period,
                resetPeriod,
                resetPeriodConfiguration,
                startDate,
                status,
                updatedAt,
                usageLimit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, description=$description, endDate=$endDate, enumValues=$enumValues, environmentId=$environmentId, featureGroupIds=$featureGroupIds, featureId=$featureId, hasSoftLimit=$hasSoftLimit, hasUnlimitedUsage=$hasUnlimitedUsage, isVisible=$isVisible, period=$period, resetPeriod=$resetPeriod, resetPeriodConfiguration=$resetPeriodConfiguration, startDate=$startDate, status=$status, updatedAt=$updatedAt, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromotionalEntitlementGrantResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PromotionalEntitlementGrantResponse{data=$data, additionalProperties=$additionalProperties}"
}
