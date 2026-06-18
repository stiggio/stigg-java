// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.assignments

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
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
    private val createdAt: JsonField<OffsetDateTime>,
    private val entityId: JsonField<String>,
    private val parentId: JsonField<String>,
    private val scopeEntityIds: JsonField<List<String>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val usageLimit: JsonField<Double>,
    private val currencyId: JsonField<String>,
    private val featureId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cadence") @ExcludeMissing cadence: JsonField<Cadence> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entityId") @ExcludeMissing entityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parentId") @ExcludeMissing parentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scopeEntityIds")
        @ExcludeMissing
        scopeEntityIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("usageLimit")
        @ExcludeMissing
        usageLimit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currencyId")
        @ExcludeMissing
        currencyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("featureId") @ExcludeMissing featureId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        cadence,
        createdAt,
        entityId,
        parentId,
        scopeEntityIds,
        updatedAt,
        usageLimit,
        currencyId,
        featureId,
        mutableMapOf(),
    )

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
     * Parent entity refId in the hierarchy, or `null` for a root.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentId(): Optional<String> = parentId.getOptional("parentId")

    /**
     * Dimension-scoped sub-budget key: the set of entity refIds this budget applies to. Empty is
     * the node-wide budget that always matches; a non-empty set only applies when every listed
     * entity is present in the resolved set (order-insensitive).
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopeEntityIds(): List<String> = scopeEntityIds.getRequired("scopeEntityIds")

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
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usageLimit(): Optional<Double> = usageLimit.getOptional("usageLimit")

    /**
     * Currency refId this assignment grants (present for credit capabilities).
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyId(): Optional<String> = currencyId.getOptional("currencyId")

    /**
     * Feature refId this assignment grants (present for feature capabilities).
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun featureId(): Optional<String> = featureId.getOptional("featureId")

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
     * Returns the raw JSON value of [parentId].
     *
     * Unlike [parentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parentId") @ExcludeMissing fun _parentId(): JsonField<String> = parentId

    /**
     * Returns the raw JSON value of [scopeEntityIds].
     *
     * Unlike [scopeEntityIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopeEntityIds")
    @ExcludeMissing
    fun _scopeEntityIds(): JsonField<List<String>> = scopeEntityIds

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

    /**
     * Returns the raw JSON value of [currencyId].
     *
     * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currencyId") @ExcludeMissing fun _currencyId(): JsonField<String> = currencyId

    /**
     * Returns the raw JSON value of [featureId].
     *
     * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

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
         * .createdAt()
         * .entityId()
         * .parentId()
         * .scopeEntityIds()
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
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var entityId: JsonField<String>? = null
        private var parentId: JsonField<String>? = null
        private var scopeEntityIds: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var usageLimit: JsonField<Double>? = null
        private var currencyId: JsonField<String> = JsonMissing.of()
        private var featureId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(assignmentListResponse: AssignmentListResponse) = apply {
            id = assignmentListResponse.id
            cadence = assignmentListResponse.cadence
            createdAt = assignmentListResponse.createdAt
            entityId = assignmentListResponse.entityId
            parentId = assignmentListResponse.parentId
            scopeEntityIds = assignmentListResponse.scopeEntityIds.map { it.toMutableList() }
            updatedAt = assignmentListResponse.updatedAt
            usageLimit = assignmentListResponse.usageLimit
            currencyId = assignmentListResponse.currencyId
            featureId = assignmentListResponse.featureId
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

        /** Parent entity refId in the hierarchy, or `null` for a root. */
        fun parentId(parentId: String?) = parentId(JsonField.ofNullable(parentId))

        /** Alias for calling [Builder.parentId] with `parentId.orElse(null)`. */
        fun parentId(parentId: Optional<String>) = parentId(parentId.getOrNull())

        /**
         * Sets [Builder.parentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun parentId(parentId: JsonField<String>) = apply { this.parentId = parentId }

        /**
         * Dimension-scoped sub-budget key: the set of entity refIds this budget applies to. Empty
         * is the node-wide budget that always matches; a non-empty set only applies when every
         * listed entity is present in the resolved set (order-insensitive).
         */
        fun scopeEntityIds(scopeEntityIds: List<String>) =
            scopeEntityIds(JsonField.of(scopeEntityIds))

        /**
         * Sets [Builder.scopeEntityIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopeEntityIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scopeEntityIds(scopeEntityIds: JsonField<List<String>>) = apply {
            this.scopeEntityIds = scopeEntityIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [scopeEntityIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScopeEntityId(scopeEntityId: String) = apply {
            scopeEntityIds =
                (scopeEntityIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scopeEntityIds", it).add(scopeEntityId)
                }
        }

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
         * You should usually call [Builder.usageLimit] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun usageLimit(usageLimit: JsonField<Double>) = apply { this.usageLimit = usageLimit }

        /** Currency refId this assignment grants (present for credit capabilities). */
        fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

        /**
         * Sets [Builder.currencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

        /** Feature refId this assignment grants (present for feature capabilities). */
        fun featureId(featureId: String) = featureId(JsonField.of(featureId))

        /**
         * Sets [Builder.featureId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

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
         * .createdAt()
         * .entityId()
         * .parentId()
         * .scopeEntityIds()
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
                checkRequired("createdAt", createdAt),
                checkRequired("entityId", entityId),
                checkRequired("parentId", parentId),
                checkRequired("scopeEntityIds", scopeEntityIds).map { it.toImmutable() },
                checkRequired("updatedAt", updatedAt),
                checkRequired("usageLimit", usageLimit),
                currencyId,
                featureId,
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
        createdAt()
        entityId()
        parentId()
        scopeEntityIds()
        updatedAt()
        usageLimit()
        currencyId()
        featureId()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (entityId.asKnown().isPresent) 1 else 0) +
            (if (parentId.asKnown().isPresent) 1 else 0) +
            (scopeEntityIds.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (usageLimit.asKnown().isPresent) 1 else 0) +
            (if (currencyId.asKnown().isPresent) 1 else 0) +
            (if (featureId.asKnown().isPresent) 1 else 0)

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
            createdAt == other.createdAt &&
            entityId == other.entityId &&
            parentId == other.parentId &&
            scopeEntityIds == other.scopeEntityIds &&
            updatedAt == other.updatedAt &&
            usageLimit == other.usageLimit &&
            currencyId == other.currencyId &&
            featureId == other.featureId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            cadence,
            createdAt,
            entityId,
            parentId,
            scopeEntityIds,
            updatedAt,
            usageLimit,
            currencyId,
            featureId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssignmentListResponse{id=$id, cadence=$cadence, createdAt=$createdAt, entityId=$entityId, parentId=$parentId, scopeEntityIds=$scopeEntityIds, updatedAt=$updatedAt, usageLimit=$usageLimit, currencyId=$currencyId, featureId=$featureId, additionalProperties=$additionalProperties}"
}
