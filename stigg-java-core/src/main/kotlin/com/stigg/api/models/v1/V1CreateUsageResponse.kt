// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.stigg.api.core.ExcludeMissing
import com.stigg.api.core.JsonField
import com.stigg.api.core.JsonMissing
import com.stigg.api.core.JsonValue
import com.stigg.api.core.checkKnown
import com.stigg.api.core.checkRequired
import com.stigg.api.core.toImmutable
import com.stigg.api.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1CreateUsageResponse
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
         * Returns a mutable builder for constructing an instance of [V1CreateUsageResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CreateUsageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1CreateUsageResponse: V1CreateUsageResponse) = apply {
            data = v1CreateUsageResponse.data.map { it.toMutableList() }
            additionalProperties = v1CreateUsageResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [V1CreateUsageResponse].
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
        fun build(): V1CreateUsageResponse =
            V1CreateUsageResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1CreateUsageResponse = apply {
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

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val customerId: JsonField<String>,
        private val featureId: JsonField<String>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val value: JsonField<Double>,
        private val currentUsage: JsonField<Double>,
        private val nextResetDate: JsonField<OffsetDateTime>,
        private val resourceId: JsonField<String>,
        private val usagePeriodEnd: JsonField<OffsetDateTime>,
        private val usagePeriodStart: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customerId")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("featureId")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("currentUsage")
            @ExcludeMissing
            currentUsage: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("nextResetDate")
            @ExcludeMissing
            nextResetDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("resourceId")
            @ExcludeMissing
            resourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("usagePeriodEnd")
            @ExcludeMissing
            usagePeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("usagePeriodStart")
            @ExcludeMissing
            usagePeriodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            customerId,
            featureId,
            timestamp,
            value,
            currentUsage,
            nextResetDate,
            resourceId,
            usagePeriodEnd,
            usagePeriodStart,
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
         * Customer id
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customerId")

        /**
         * Feature id
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun featureId(): String = featureId.getRequired("featureId")

        /**
         * Timestamp
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        /**
         * The usage measurement record
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Double = value.getRequired("value")

        /**
         * The current measured usage value
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currentUsage(): Optional<Double> = currentUsage.getOptional("currentUsage")

        /**
         * The date when the next usage reset will occur
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nextResetDate(): Optional<OffsetDateTime> = nextResetDate.getOptional("nextResetDate")

        /**
         * Resource id
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resourceId(): Optional<String> = resourceId.getOptional("resourceId")

        /**
         * The end date of the usage period in which this measurement resides (for entitlements with
         * a reset period)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usagePeriodEnd(): Optional<OffsetDateTime> =
            usagePeriodEnd.getOptional("usagePeriodEnd")

        /**
         * The start date of the usage period in which this measurement resides (for entitlements
         * with a reset period)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usagePeriodStart(): Optional<OffsetDateTime> =
            usagePeriodStart.getOptional("usagePeriodStart")

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
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [featureId].
         *
         * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
         * Returns the raw JSON value of [nextResetDate].
         *
         * Unlike [nextResetDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("nextResetDate")
        @ExcludeMissing
        fun _nextResetDate(): JsonField<OffsetDateTime> = nextResetDate

        /**
         * Returns the raw JSON value of [resourceId].
         *
         * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resourceId")
        @ExcludeMissing
        fun _resourceId(): JsonField<String> = resourceId

        /**
         * Returns the raw JSON value of [usagePeriodEnd].
         *
         * Unlike [usagePeriodEnd], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("usagePeriodEnd")
        @ExcludeMissing
        fun _usagePeriodEnd(): JsonField<OffsetDateTime> = usagePeriodEnd

        /**
         * Returns the raw JSON value of [usagePeriodStart].
         *
         * Unlike [usagePeriodStart], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("usagePeriodStart")
        @ExcludeMissing
        fun _usagePeriodStart(): JsonField<OffsetDateTime> = usagePeriodStart

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
             * .customerId()
             * .featureId()
             * .timestamp()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var customerId: JsonField<String>? = null
            private var featureId: JsonField<String>? = null
            private var timestamp: JsonField<OffsetDateTime>? = null
            private var value: JsonField<Double>? = null
            private var currentUsage: JsonField<Double> = JsonMissing.of()
            private var nextResetDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var resourceId: JsonField<String> = JsonMissing.of()
            private var usagePeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var usagePeriodStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                customerId = data.customerId
                featureId = data.featureId
                timestamp = data.timestamp
                value = data.value
                currentUsage = data.currentUsage
                nextResetDate = data.nextResetDate
                resourceId = data.resourceId
                usagePeriodEnd = data.usagePeriodEnd
                usagePeriodStart = data.usagePeriodStart
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

            /** Customer id */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Feature id */
            fun featureId(featureId: String) = featureId(JsonField.of(featureId))

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

            /** Timestamp */
            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            /** The usage measurement record */
            fun value(value: Double) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<Double>) = apply { this.value = value }

            /** The current measured usage value */
            fun currentUsage(currentUsage: Double?) =
                currentUsage(JsonField.ofNullable(currentUsage))

            /**
             * Alias for [Builder.currentUsage].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun currentUsage(currentUsage: Double) = currentUsage(currentUsage as Double?)

            /** Alias for calling [Builder.currentUsage] with `currentUsage.orElse(null)`. */
            fun currentUsage(currentUsage: Optional<Double>) =
                currentUsage(currentUsage.getOrNull())

            /**
             * Sets [Builder.currentUsage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentUsage] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentUsage(currentUsage: JsonField<Double>) = apply {
                this.currentUsage = currentUsage
            }

            /** The date when the next usage reset will occur */
            fun nextResetDate(nextResetDate: OffsetDateTime?) =
                nextResetDate(JsonField.ofNullable(nextResetDate))

            /** Alias for calling [Builder.nextResetDate] with `nextResetDate.orElse(null)`. */
            fun nextResetDate(nextResetDate: Optional<OffsetDateTime>) =
                nextResetDate(nextResetDate.getOrNull())

            /**
             * Sets [Builder.nextResetDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextResetDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nextResetDate(nextResetDate: JsonField<OffsetDateTime>) = apply {
                this.nextResetDate = nextResetDate
            }

            /** Resource id */
            fun resourceId(resourceId: String?) = resourceId(JsonField.ofNullable(resourceId))

            /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
            fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

            /**
             * Sets [Builder.resourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resourceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

            /**
             * The end date of the usage period in which this measurement resides (for entitlements
             * with a reset period)
             */
            fun usagePeriodEnd(usagePeriodEnd: OffsetDateTime?) =
                usagePeriodEnd(JsonField.ofNullable(usagePeriodEnd))

            /** Alias for calling [Builder.usagePeriodEnd] with `usagePeriodEnd.orElse(null)`. */
            fun usagePeriodEnd(usagePeriodEnd: Optional<OffsetDateTime>) =
                usagePeriodEnd(usagePeriodEnd.getOrNull())

            /**
             * Sets [Builder.usagePeriodEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usagePeriodEnd] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun usagePeriodEnd(usagePeriodEnd: JsonField<OffsetDateTime>) = apply {
                this.usagePeriodEnd = usagePeriodEnd
            }

            /**
             * The start date of the usage period in which this measurement resides (for
             * entitlements with a reset period)
             */
            fun usagePeriodStart(usagePeriodStart: OffsetDateTime?) =
                usagePeriodStart(JsonField.ofNullable(usagePeriodStart))

            /**
             * Alias for calling [Builder.usagePeriodStart] with `usagePeriodStart.orElse(null)`.
             */
            fun usagePeriodStart(usagePeriodStart: Optional<OffsetDateTime>) =
                usagePeriodStart(usagePeriodStart.getOrNull())

            /**
             * Sets [Builder.usagePeriodStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usagePeriodStart] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun usagePeriodStart(usagePeriodStart: JsonField<OffsetDateTime>) = apply {
                this.usagePeriodStart = usagePeriodStart
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
             * .customerId()
             * .featureId()
             * .timestamp()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("customerId", customerId),
                    checkRequired("featureId", featureId),
                    checkRequired("timestamp", timestamp),
                    checkRequired("value", value),
                    currentUsage,
                    nextResetDate,
                    resourceId,
                    usagePeriodEnd,
                    usagePeriodStart,
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
            customerId()
            featureId()
            timestamp()
            value()
            currentUsage()
            nextResetDate()
            resourceId()
            usagePeriodEnd()
            usagePeriodStart()
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
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (featureId.asKnown().isPresent) 1 else 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                (if (value.asKnown().isPresent) 1 else 0) +
                (if (currentUsage.asKnown().isPresent) 1 else 0) +
                (if (nextResetDate.asKnown().isPresent) 1 else 0) +
                (if (resourceId.asKnown().isPresent) 1 else 0) +
                (if (usagePeriodEnd.asKnown().isPresent) 1 else 0) +
                (if (usagePeriodStart.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                createdAt == other.createdAt &&
                customerId == other.customerId &&
                featureId == other.featureId &&
                timestamp == other.timestamp &&
                value == other.value &&
                currentUsage == other.currentUsage &&
                nextResetDate == other.nextResetDate &&
                resourceId == other.resourceId &&
                usagePeriodEnd == other.usagePeriodEnd &&
                usagePeriodStart == other.usagePeriodStart &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                customerId,
                featureId,
                timestamp,
                value,
                currentUsage,
                nextResetDate,
                resourceId,
                usagePeriodEnd,
                usagePeriodStart,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, customerId=$customerId, featureId=$featureId, timestamp=$timestamp, value=$value, currentUsage=$currentUsage, nextResetDate=$nextResetDate, resourceId=$resourceId, usagePeriodEnd=$usagePeriodEnd, usagePeriodStart=$usagePeriodStart, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1CreateUsageResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1CreateUsageResponse{data=$data, additionalProperties=$additionalProperties}"
}
