// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.customers.assignments

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
import kotlin.jvm.optionals.getOrNull

/**
 * A capability assignment for an entity belonging to a customer. Defines how much of the capability
 * the entity may consume (`usageLimit`) and how often the counter resets (`cadence`).
 */
class AssignmentListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val cadence: JsonField<Cadence>,
    private val capabilityId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val entityId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val usageLimit: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cadence") @ExcludeMissing cadence: JsonField<Cadence> = JsonMissing.of(),
        @JsonProperty("capabilityId")
        @ExcludeMissing
        capabilityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entityId") @ExcludeMissing entityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("usageLimit") @ExcludeMissing usageLimit: JsonField<Double> = JsonMissing.of(),
    ) : this(id, cadence, capabilityId, createdAt, entityId, updatedAt, usageLimit, mutableMapOf())

    /**
     * Synthetic UUID identifier — also the cursor anchor for paginated lists
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Usage-reset cadence. Currently only `MONTH` is supported
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cadence(): Cadence = cadence.getRequired("cadence")

    /**
     * The capability refId this assignment grants
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun capabilityId(): String = capabilityId.getRequired("capabilityId")

    /**
     * Timestamp of when the record was created
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The entity refId this assignment is attached to
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityId(): String = entityId.getRequired("entityId")

    /**
     * Timestamp of when the record was last updated
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Maximum usage allowed within one cadence window
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usageLimit(): Double = usageLimit.getRequired("usageLimit")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [cadence].
     *
     * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

    /**
     * Returns the raw JSON value of [capabilityId].
     *
     * Unlike [capabilityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capabilityId")
    @ExcludeMissing
    fun _capabilityId(): JsonField<String> = capabilityId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityId") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

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
    @JsonProperty("usageLimit") @ExcludeMissing fun _usageLimit(): JsonField<Double> = usageLimit

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
         * Returns a mutable builder for constructing an instance of [AssignmentListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cadence()
         * .capabilityId()
         * .createdAt()
         * .entityId()
         * .updatedAt()
         * .usageLimit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssignmentListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var cadence: JsonField<Cadence>? = null
        private var capabilityId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var entityId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var usageLimit: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(assignmentListResponse: AssignmentListResponse) = apply {
            id = assignmentListResponse.id
            cadence = assignmentListResponse.cadence
            capabilityId = assignmentListResponse.capabilityId
            createdAt = assignmentListResponse.createdAt
            entityId = assignmentListResponse.entityId
            updatedAt = assignmentListResponse.updatedAt
            usageLimit = assignmentListResponse.usageLimit
            additionalProperties = assignmentListResponse.additionalProperties.toMutableMap()
        }

        /** Synthetic UUID identifier — also the cursor anchor for paginated lists */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Usage-reset cadence. Currently only `MONTH` is supported */
        fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

        /**
         * Sets [Builder.cadence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cadence] with a well-typed [Cadence] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

        /** The capability refId this assignment grants */
        fun capabilityId(capabilityId: String) = capabilityId(JsonField.of(capabilityId))

        /**
         * Sets [Builder.capabilityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun capabilityId(capabilityId: JsonField<String>) = apply {
            this.capabilityId = capabilityId
        }

        /** Timestamp of when the record was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The entity refId this assignment is attached to */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** Timestamp of when the record was last updated */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Maximum usage allowed within one cadence window */
        fun usageLimit(usageLimit: Double) = usageLimit(JsonField.of(usageLimit))

        /**
         * Sets [Builder.usageLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageLimit] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [AssignmentListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cadence()
         * .capabilityId()
         * .createdAt()
         * .entityId()
         * .updatedAt()
         * .usageLimit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssignmentListResponse =
            AssignmentListResponse(
                checkRequired("id", id),
                checkRequired("cadence", cadence),
                checkRequired("capabilityId", capabilityId),
                checkRequired("createdAt", createdAt),
                checkRequired("entityId", entityId),
                checkRequired("updatedAt", updatedAt),
                checkRequired("usageLimit", usageLimit),
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
    fun validate(): AssignmentListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        cadence().validate()
        capabilityId()
        createdAt()
        entityId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (cadence.asKnown().getOrNull()?.validity() ?: 0) +
            (if (capabilityId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (entityId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (usageLimit.asKnown().isPresent) 1 else 0)

    /** Usage-reset cadence. Currently only `MONTH` is supported */
    class Cadence @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MONTH = of("MONTH")

            @JvmStatic fun of(value: String) = Cadence(JsonField.of(value))
        }

        /** An enum containing [Cadence]'s known values. */
        enum class Known {
            MONTH
        }

        /**
         * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Cadence] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MONTH,
            /** An enum member indicating that [Cadence] was instantiated with an unknown value. */
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
                MONTH -> Value.MONTH
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
                MONTH -> Known.MONTH
                else -> throw StiggInvalidDataException("Unknown Cadence: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssignmentListResponse &&
            id == other.id &&
            cadence == other.cadence &&
            capabilityId == other.capabilityId &&
            createdAt == other.createdAt &&
            entityId == other.entityId &&
            updatedAt == other.updatedAt &&
            usageLimit == other.usageLimit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            cadence,
            capabilityId,
            createdAt,
            entityId,
            updatedAt,
            usageLimit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssignmentListResponse{id=$id, cadence=$cadence, capabilityId=$capabilityId, createdAt=$createdAt, entityId=$entityId, updatedAt=$updatedAt, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
}
