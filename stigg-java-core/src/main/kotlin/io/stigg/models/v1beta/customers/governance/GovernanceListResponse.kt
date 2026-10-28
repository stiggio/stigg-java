// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.governance

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
 * A node of the governance hierarchy tree with its usage configuration (limit, cadence, scope) and
 * current usage. Usage is read from a periodically-refreshed read model and may lag the live
 * counter by a short interval; it never gates access.
 */
class GovernanceListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cadence: JsonField<String>,
    private val currentUsage: JsonField<Double>,
    private val displayName: JsonField<String>,
    private val entityId: JsonField<String>,
    private val entityTypeId: JsonField<String>,
    private val parentId: JsonField<String>,
    private val scopeEntityIds: JsonField<List<String>>,
    private val usageLimit: JsonField<Double>,
    private val usagePeriodEnd: JsonField<OffsetDateTime>,
    private val usagePeriodStart: JsonField<OffsetDateTime>,
    private val utilization: JsonField<Double>,
    private val currencyId: JsonField<String>,
    private val featureId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cadence") @ExcludeMissing cadence: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currentUsage")
        @ExcludeMissing
        currentUsage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("displayName")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entityId") @ExcludeMissing entityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entityTypeId")
        @ExcludeMissing
        entityTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parentId") @ExcludeMissing parentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scopeEntityIds")
        @ExcludeMissing
        scopeEntityIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("usageLimit")
        @ExcludeMissing
        usageLimit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("usagePeriodEnd")
        @ExcludeMissing
        usagePeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("usagePeriodStart")
        @ExcludeMissing
        usagePeriodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("utilization")
        @ExcludeMissing
        utilization: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currencyId")
        @ExcludeMissing
        currencyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("featureId") @ExcludeMissing featureId: JsonField<String> = JsonMissing.of(),
    ) : this(
        cadence,
        currentUsage,
        displayName,
        entityId,
        entityTypeId,
        parentId,
        scopeEntityIds,
        usageLimit,
        usagePeriodEnd,
        usagePeriodStart,
        utilization,
        currencyId,
        featureId,
        mutableMapOf(),
    )

    /**
     * Usage-reset cadence as an ISO-8601 single-unit duration, e.g. `P1M`, `P30D`, `PT1M`; `null`
     * when the node has no usage configuration.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cadence(): Optional<String> = cadence.getOptional("cadence")

    /**
     * Usage consumed in the current cadence period (may lag the live counter by a short interval).
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentUsage(): Optional<Double> = currentUsage.getOptional("currentUsage")

    /**
     * Human-readable name of the entity, or null when none is set (display the entity id instead).
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = displayName.getOptional("displayName")

    /**
     * External id of the entity at this node.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityId(): String = entityId.getRequired("entityId")

    /**
     * External id of the entity type (e.g. `team`, `user`).
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityTypeId(): String = entityTypeId.getRequired("entityTypeId")

    /**
     * External id of the parent entity in the tree. `null` means the entity is either a root or not
     * yet placed in the hierarchy — placement rides on an assignment, so an entity with no limits
     * set has no parent yet. Both render at the top level; use it to rebuild the tree.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentId(): Optional<String> = parentId.getOptional("parentId")

    /**
     * The configuration scope (entity ids). Empty is the node-wide configuration; a non-empty set
     * is a dimension-scoped sub-configuration.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopeEntityIds(): List<String> = scopeEntityIds.getRequired("scopeEntityIds")

    /**
     * Hard usage limit for this node per cadence period.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usageLimit(): Optional<Double> = usageLimit.getOptional("usageLimit")

    /**
     * Exclusive end of the cadence period in progress now — when usage resets. `null` when the node
     * has no usage configuration, or when a stored cadence cannot be parsed.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usagePeriodEnd(): Optional<OffsetDateTime> = usagePeriodEnd.getOptional("usagePeriodEnd")

    /**
     * Start of the cadence period in progress now, derived from the cadence and the assignment
     * anchor — it stays correct across a rollover. `null` when the node has no usage configuration,
     * or when a stored cadence cannot be parsed.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usagePeriodStart(): Optional<OffsetDateTime> =
        usagePeriodStart.getOptional("usagePeriodStart")

    /**
     * `currentUsage / usageLimit` (1 when usageLimit is 0 — always at limit). The
     * cross-capability-safe sort key.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun utilization(): Optional<Double> = utilization.getOptional("utilization")

    /**
     * The metered currency ID (present when the configured capability is a credit currency).
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyId(): Optional<String> = currencyId.getOptional("currencyId")

    /**
     * The metered feature ID (present when the configured capability is a feature).
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun featureId(): Optional<String> = featureId.getOptional("featureId")

    /**
     * Returns the raw JSON value of [cadence].
     *
     * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<String> = cadence

    /**
     * Returns the raw JSON value of [currentUsage].
     *
     * Unlike [currentUsage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currentUsage")
    @ExcludeMissing
    fun _currentUsage(): JsonField<Double> = currentUsage

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayName") @ExcludeMissing fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityId") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /**
     * Returns the raw JSON value of [entityTypeId].
     *
     * Unlike [entityTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityTypeId")
    @ExcludeMissing
    fun _entityTypeId(): JsonField<String> = entityTypeId

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
     * Returns the raw JSON value of [usageLimit].
     *
     * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usageLimit") @ExcludeMissing fun _usageLimit(): JsonField<Double> = usageLimit

    /**
     * Returns the raw JSON value of [usagePeriodEnd].
     *
     * Unlike [usagePeriodEnd], this method doesn't throw if the JSON field has an unexpected type.
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

    /**
     * Returns the raw JSON value of [utilization].
     *
     * Unlike [utilization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("utilization") @ExcludeMissing fun _utilization(): JsonField<Double> = utilization

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
         * Returns a mutable builder for constructing an instance of [GovernanceListResponse].
         *
         * The following fields are required:
         * ```java
         * .cadence()
         * .currentUsage()
         * .displayName()
         * .entityId()
         * .entityTypeId()
         * .parentId()
         * .scopeEntityIds()
         * .usageLimit()
         * .usagePeriodEnd()
         * .usagePeriodStart()
         * .utilization()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GovernanceListResponse]. */
    class Builder internal constructor() {

        private var cadence: JsonField<String>? = null
        private var currentUsage: JsonField<Double>? = null
        private var displayName: JsonField<String>? = null
        private var entityId: JsonField<String>? = null
        private var entityTypeId: JsonField<String>? = null
        private var parentId: JsonField<String>? = null
        private var scopeEntityIds: JsonField<MutableList<String>>? = null
        private var usageLimit: JsonField<Double>? = null
        private var usagePeriodEnd: JsonField<OffsetDateTime>? = null
        private var usagePeriodStart: JsonField<OffsetDateTime>? = null
        private var utilization: JsonField<Double>? = null
        private var currencyId: JsonField<String> = JsonMissing.of()
        private var featureId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(governanceListResponse: GovernanceListResponse) = apply {
            cadence = governanceListResponse.cadence
            currentUsage = governanceListResponse.currentUsage
            displayName = governanceListResponse.displayName
            entityId = governanceListResponse.entityId
            entityTypeId = governanceListResponse.entityTypeId
            parentId = governanceListResponse.parentId
            scopeEntityIds = governanceListResponse.scopeEntityIds.map { it.toMutableList() }
            usageLimit = governanceListResponse.usageLimit
            usagePeriodEnd = governanceListResponse.usagePeriodEnd
            usagePeriodStart = governanceListResponse.usagePeriodStart
            utilization = governanceListResponse.utilization
            currencyId = governanceListResponse.currencyId
            featureId = governanceListResponse.featureId
            additionalProperties = governanceListResponse.additionalProperties.toMutableMap()
        }

        /**
         * Usage-reset cadence as an ISO-8601 single-unit duration, e.g. `P1M`, `P30D`, `PT1M`;
         * `null` when the node has no usage configuration.
         */
        fun cadence(cadence: String?) = cadence(JsonField.ofNullable(cadence))

        /** Alias for calling [Builder.cadence] with `cadence.orElse(null)`. */
        fun cadence(cadence: Optional<String>) = cadence(cadence.getOrNull())

        /**
         * Sets [Builder.cadence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cadence] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cadence(cadence: JsonField<String>) = apply { this.cadence = cadence }

        /**
         * Usage consumed in the current cadence period (may lag the live counter by a short
         * interval).
         */
        fun currentUsage(currentUsage: Double?) = currentUsage(JsonField.ofNullable(currentUsage))

        /**
         * Alias for [Builder.currentUsage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun currentUsage(currentUsage: Double) = currentUsage(currentUsage as Double?)

        /** Alias for calling [Builder.currentUsage] with `currentUsage.orElse(null)`. */
        fun currentUsage(currentUsage: Optional<Double>) = currentUsage(currentUsage.getOrNull())

        /**
         * Sets [Builder.currentUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentUsage] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentUsage(currentUsage: JsonField<Double>) = apply {
            this.currentUsage = currentUsage
        }

        /**
         * Human-readable name of the entity, or null when none is set (display the entity id
         * instead).
         */
        fun displayName(displayName: String?) = displayName(JsonField.ofNullable(displayName))

        /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
        fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        /** External id of the entity at this node. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** External id of the entity type (e.g. `team`, `user`). */
        fun entityTypeId(entityTypeId: String) = entityTypeId(JsonField.of(entityTypeId))

        /**
         * Sets [Builder.entityTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entityTypeId(entityTypeId: JsonField<String>) = apply {
            this.entityTypeId = entityTypeId
        }

        /**
         * External id of the parent entity in the tree. `null` means the entity is either a root or
         * not yet placed in the hierarchy — placement rides on an assignment, so an entity with no
         * limits set has no parent yet. Both render at the top level; use it to rebuild the tree.
         */
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
         * The configuration scope (entity ids). Empty is the node-wide configuration; a non-empty
         * set is a dimension-scoped sub-configuration.
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

        /** Hard usage limit for this node per cadence period. */
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

        /**
         * Exclusive end of the cadence period in progress now — when usage resets. `null` when the
         * node has no usage configuration, or when a stored cadence cannot be parsed.
         */
        fun usagePeriodEnd(usagePeriodEnd: OffsetDateTime?) =
            usagePeriodEnd(JsonField.ofNullable(usagePeriodEnd))

        /** Alias for calling [Builder.usagePeriodEnd] with `usagePeriodEnd.orElse(null)`. */
        fun usagePeriodEnd(usagePeriodEnd: Optional<OffsetDateTime>) =
            usagePeriodEnd(usagePeriodEnd.getOrNull())

        /**
         * Sets [Builder.usagePeriodEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usagePeriodEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usagePeriodEnd(usagePeriodEnd: JsonField<OffsetDateTime>) = apply {
            this.usagePeriodEnd = usagePeriodEnd
        }

        /**
         * Start of the cadence period in progress now, derived from the cadence and the assignment
         * anchor — it stays correct across a rollover. `null` when the node has no usage
         * configuration, or when a stored cadence cannot be parsed.
         */
        fun usagePeriodStart(usagePeriodStart: OffsetDateTime?) =
            usagePeriodStart(JsonField.ofNullable(usagePeriodStart))

        /** Alias for calling [Builder.usagePeriodStart] with `usagePeriodStart.orElse(null)`. */
        fun usagePeriodStart(usagePeriodStart: Optional<OffsetDateTime>) =
            usagePeriodStart(usagePeriodStart.getOrNull())

        /**
         * Sets [Builder.usagePeriodStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usagePeriodStart] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun usagePeriodStart(usagePeriodStart: JsonField<OffsetDateTime>) = apply {
            this.usagePeriodStart = usagePeriodStart
        }

        /**
         * `currentUsage / usageLimit` (1 when usageLimit is 0 — always at limit). The
         * cross-capability-safe sort key.
         */
        fun utilization(utilization: Double?) = utilization(JsonField.ofNullable(utilization))

        /**
         * Alias for [Builder.utilization].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun utilization(utilization: Double) = utilization(utilization as Double?)

        /** Alias for calling [Builder.utilization] with `utilization.orElse(null)`. */
        fun utilization(utilization: Optional<Double>) = utilization(utilization.getOrNull())

        /**
         * Sets [Builder.utilization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.utilization] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun utilization(utilization: JsonField<Double>) = apply { this.utilization = utilization }

        /**
         * The metered currency ID (present when the configured capability is a credit currency).
         */
        fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

        /**
         * Sets [Builder.currencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

        /** The metered feature ID (present when the configured capability is a feature). */
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
         * Returns an immutable instance of [GovernanceListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cadence()
         * .currentUsage()
         * .displayName()
         * .entityId()
         * .entityTypeId()
         * .parentId()
         * .scopeEntityIds()
         * .usageLimit()
         * .usagePeriodEnd()
         * .usagePeriodStart()
         * .utilization()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GovernanceListResponse =
            GovernanceListResponse(
                checkRequired("cadence", cadence),
                checkRequired("currentUsage", currentUsage),
                checkRequired("displayName", displayName),
                checkRequired("entityId", entityId),
                checkRequired("entityTypeId", entityTypeId),
                checkRequired("parentId", parentId),
                checkRequired("scopeEntityIds", scopeEntityIds).map { it.toImmutable() },
                checkRequired("usageLimit", usageLimit),
                checkRequired("usagePeriodEnd", usagePeriodEnd),
                checkRequired("usagePeriodStart", usagePeriodStart),
                checkRequired("utilization", utilization),
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
    fun validate(): GovernanceListResponse = apply {
        if (validated) {
            return@apply
        }

        cadence()
        currentUsage()
        displayName()
        entityId()
        entityTypeId()
        parentId()
        scopeEntityIds()
        usageLimit()
        usagePeriodEnd()
        usagePeriodStart()
        utilization()
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
        (if (cadence.asKnown().isPresent) 1 else 0) +
            (if (currentUsage.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (entityId.asKnown().isPresent) 1 else 0) +
            (if (entityTypeId.asKnown().isPresent) 1 else 0) +
            (if (parentId.asKnown().isPresent) 1 else 0) +
            (scopeEntityIds.asKnown().getOrNull()?.size ?: 0) +
            (if (usageLimit.asKnown().isPresent) 1 else 0) +
            (if (usagePeriodEnd.asKnown().isPresent) 1 else 0) +
            (if (usagePeriodStart.asKnown().isPresent) 1 else 0) +
            (if (utilization.asKnown().isPresent) 1 else 0) +
            (if (currencyId.asKnown().isPresent) 1 else 0) +
            (if (featureId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GovernanceListResponse &&
            cadence == other.cadence &&
            currentUsage == other.currentUsage &&
            displayName == other.displayName &&
            entityId == other.entityId &&
            entityTypeId == other.entityTypeId &&
            parentId == other.parentId &&
            scopeEntityIds == other.scopeEntityIds &&
            usageLimit == other.usageLimit &&
            usagePeriodEnd == other.usagePeriodEnd &&
            usagePeriodStart == other.usagePeriodStart &&
            utilization == other.utilization &&
            currencyId == other.currencyId &&
            featureId == other.featureId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cadence,
            currentUsage,
            displayName,
            entityId,
            entityTypeId,
            parentId,
            scopeEntityIds,
            usageLimit,
            usagePeriodEnd,
            usagePeriodStart,
            utilization,
            currencyId,
            featureId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GovernanceListResponse{cadence=$cadence, currentUsage=$currentUsage, displayName=$displayName, entityId=$entityId, entityTypeId=$entityTypeId, parentId=$parentId, scopeEntityIds=$scopeEntityIds, usageLimit=$usageLimit, usagePeriodEnd=$usagePeriodEnd, usagePeriodStart=$usagePeriodStart, utilization=$utilization, currencyId=$currencyId, featureId=$featureId, additionalProperties=$additionalProperties}"
}
