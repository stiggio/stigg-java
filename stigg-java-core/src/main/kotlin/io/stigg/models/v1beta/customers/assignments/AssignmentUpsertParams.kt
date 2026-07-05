// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.assignments

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Batched create-or-update of capability assignments. Existing assignments matched by (entityId,
 * capabilityId) are updated; new pairs are created. On update, omitted fields (usageLimit, cadence)
 * are preserved; on create both are required by the governance service.
 */
class AssignmentUpsertParams
private constructor(
    private val id: String?,
    private val xAccountId: String?,
    private val xEnvironmentId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun xAccountId(): Optional<String> = Optional.ofNullable(xAccountId)

    fun xEnvironmentId(): Optional<String> = Optional.ofNullable(xEnvironmentId)

    /**
     * Assignments to upsert (1–100 per request)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun assignments(): List<Assignment> = body.assignments()

    /**
     * Returns the raw JSON value of [assignments].
     *
     * Unlike [assignments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assignments(): JsonField<List<Assignment>> = body._assignments()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AssignmentUpsertParams].
         *
         * The following fields are required:
         * ```java
         * .assignments()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssignmentUpsertParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var xAccountId: String? = null
        private var xEnvironmentId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(assignmentUpsertParams: AssignmentUpsertParams) = apply {
            id = assignmentUpsertParams.id
            xAccountId = assignmentUpsertParams.xAccountId
            xEnvironmentId = assignmentUpsertParams.xEnvironmentId
            body = assignmentUpsertParams.body.toBuilder()
            additionalHeaders = assignmentUpsertParams.additionalHeaders.toBuilder()
            additionalQueryParams = assignmentUpsertParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        fun xAccountId(xAccountId: String?) = apply { this.xAccountId = xAccountId }

        /** Alias for calling [Builder.xAccountId] with `xAccountId.orElse(null)`. */
        fun xAccountId(xAccountId: Optional<String>) = xAccountId(xAccountId.getOrNull())

        fun xEnvironmentId(xEnvironmentId: String?) = apply { this.xEnvironmentId = xEnvironmentId }

        /** Alias for calling [Builder.xEnvironmentId] with `xEnvironmentId.orElse(null)`. */
        fun xEnvironmentId(xEnvironmentId: Optional<String>) =
            xEnvironmentId(xEnvironmentId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [assignments]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Assignments to upsert (1–100 per request) */
        fun assignments(assignments: List<Assignment>) = apply { body.assignments(assignments) }

        /**
         * Sets [Builder.assignments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignments] with a well-typed `List<Assignment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun assignments(assignments: JsonField<List<Assignment>>) = apply {
            body.assignments(assignments)
        }

        /**
         * Adds a single [Assignment] to [assignments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssignment(assignment: Assignment) = apply { body.addAssignment(assignment) }

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
         * Returns an immutable instance of [AssignmentUpsertParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .assignments()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssignmentUpsertParams =
            AssignmentUpsertParams(
                id,
                xAccountId,
                xEnvironmentId,
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

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                xAccountId?.let { put("X-ACCOUNT-ID", it) }
                xEnvironmentId?.let { put("X-ENVIRONMENT-ID", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for creating or updating capability assignments in bulk for a single customer
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val assignments: JsonField<List<Assignment>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("assignments")
            @ExcludeMissing
            assignments: JsonField<List<Assignment>> = JsonMissing.of()
        ) : this(assignments, mutableMapOf())

        /**
         * Assignments to upsert (1–100 per request)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun assignments(): List<Assignment> = assignments.getRequired("assignments")

        /**
         * Returns the raw JSON value of [assignments].
         *
         * Unlike [assignments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assignments")
        @ExcludeMissing
        fun _assignments(): JsonField<List<Assignment>> = assignments

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
             * .assignments()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var assignments: JsonField<MutableList<Assignment>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                assignments = body.assignments.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Assignments to upsert (1–100 per request) */
            fun assignments(assignments: List<Assignment>) = assignments(JsonField.of(assignments))

            /**
             * Sets [Builder.assignments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignments] with a well-typed `List<Assignment>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun assignments(assignments: JsonField<List<Assignment>>) = apply {
                this.assignments = assignments.map { it.toMutableList() }
            }

            /**
             * Adds a single [Assignment] to [assignments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAssignment(assignment: Assignment) = apply {
                assignments =
                    (assignments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("assignments", it).add(assignment)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .assignments()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("assignments", assignments).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            assignments().forEach { it.validate() }
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
            (assignments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                assignments == other.assignments &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(assignments, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{assignments=$assignments, additionalProperties=$additionalProperties}"
    }

    /**
     * A single assignment to create or update. Identify the capability with exactly one of
     * `featureId` or `currencyId`. The natural key is the `(entityId, capability, scopeEntityIds)`
     * triple. On create both `usageLimit` and `cadence` are required; on update they may be omitted
     * individually to preserve the existing value.
     */
    class Assignment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val entityId: JsonField<String>,
        private val cadence: JsonField<String>,
        private val currencyId: JsonField<String>,
        private val featureId: JsonField<String>,
        private val parentId: JsonField<String>,
        private val scopeEntityIds: JsonField<List<String>>,
        private val usageLimit: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("entityId")
            @ExcludeMissing
            entityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cadence") @ExcludeMissing cadence: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currencyId")
            @ExcludeMissing
            currencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("featureId")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parentId")
            @ExcludeMissing
            parentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scopeEntityIds")
            @ExcludeMissing
            scopeEntityIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("usageLimit")
            @ExcludeMissing
            usageLimit: JsonField<Double> = JsonMissing.of(),
        ) : this(
            entityId,
            cadence,
            currencyId,
            featureId,
            parentId,
            scopeEntityIds,
            usageLimit,
            mutableMapOf(),
        )

        /**
         * The entity ID this assignment is attached to
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entityId(): String = entityId.getRequired("entityId")

        /**
         * Usage-reset cadence (required on create) as an ISO-8601 single-unit duration, e.g. `P1M`,
         * `P30D`, `PT1M`.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cadence(): Optional<String> = cadence.getOptional("cadence")

        /**
         * Currency ID this assignment grants (credit budgets). Mutually exclusive with `featureId`.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyId(): Optional<String> = currencyId.getOptional("currencyId")

        /**
         * Feature ID this assignment grants. Mutually exclusive with `currencyId`.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureId(): Optional<String> = featureId.getOptional("featureId")

        /**
         * Parent entity ID in the hierarchy. Omit to leave the current parent untouched (a new node
         * defaults to a root); `null` detaches to a root; an ID sets or changes the parent.
         * Reparenting an existing node is leaf-only.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parentId(): Optional<String> = parentId.getOptional("parentId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scopeEntityIds(): Optional<List<String>> = scopeEntityIds.getOptional("scopeEntityIds")

        /**
         * Maximum usage allowed within one cadence window (required on create)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageLimit(): Optional<Double> = usageLimit.getOptional("usageLimit")

        /**
         * Returns the raw JSON value of [entityId].
         *
         * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entityId") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

        /**
         * Returns the raw JSON value of [cadence].
         *
         * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<String> = cadence

        /**
         * Returns the raw JSON value of [currencyId].
         *
         * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currencyId")
        @ExcludeMissing
        fun _currencyId(): JsonField<String> = currencyId

        /**
         * Returns the raw JSON value of [featureId].
         *
         * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

        /**
         * Returns the raw JSON value of [parentId].
         *
         * Unlike [parentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parentId") @ExcludeMissing fun _parentId(): JsonField<String> = parentId

        /**
         * Returns the raw JSON value of [scopeEntityIds].
         *
         * Unlike [scopeEntityIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scopeEntityIds")
        @ExcludeMissing
        fun _scopeEntityIds(): JsonField<List<String>> = scopeEntityIds

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
             * Returns a mutable builder for constructing an instance of [Assignment].
             *
             * The following fields are required:
             * ```java
             * .entityId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Assignment]. */
        class Builder internal constructor() {

            private var entityId: JsonField<String>? = null
            private var cadence: JsonField<String> = JsonMissing.of()
            private var currencyId: JsonField<String> = JsonMissing.of()
            private var featureId: JsonField<String> = JsonMissing.of()
            private var parentId: JsonField<String> = JsonMissing.of()
            private var scopeEntityIds: JsonField<MutableList<String>>? = null
            private var usageLimit: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(assignment: Assignment) = apply {
                entityId = assignment.entityId
                cadence = assignment.cadence
                currencyId = assignment.currencyId
                featureId = assignment.featureId
                parentId = assignment.parentId
                scopeEntityIds = assignment.scopeEntityIds.map { it.toMutableList() }
                usageLimit = assignment.usageLimit
                additionalProperties = assignment.additionalProperties.toMutableMap()
            }

            /** The entity ID this assignment is attached to */
            fun entityId(entityId: String) = entityId(JsonField.of(entityId))

            /**
             * Sets [Builder.entityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

            /**
             * Usage-reset cadence (required on create) as an ISO-8601 single-unit duration, e.g.
             * `P1M`, `P30D`, `PT1M`.
             */
            fun cadence(cadence: String) = cadence(JsonField.of(cadence))

            /**
             * Sets [Builder.cadence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cadence] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cadence(cadence: JsonField<String>) = apply { this.cadence = cadence }

            /**
             * Currency ID this assignment grants (credit budgets). Mutually exclusive with
             * `featureId`.
             */
            fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

            /**
             * Sets [Builder.currencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

            /** Feature ID this assignment grants. Mutually exclusive with `currencyId`. */
            fun featureId(featureId: String) = featureId(JsonField.of(featureId))

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

            /**
             * Parent entity ID in the hierarchy. Omit to leave the current parent untouched (a new
             * node defaults to a root); `null` detaches to a root; an ID sets or changes the
             * parent. Reparenting an existing node is leaf-only.
             */
            fun parentId(parentId: String?) = parentId(JsonField.ofNullable(parentId))

            /** Alias for calling [Builder.parentId] with `parentId.orElse(null)`. */
            fun parentId(parentId: Optional<String>) = parentId(parentId.getOrNull())

            /**
             * Sets [Builder.parentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentId(parentId: JsonField<String>) = apply { this.parentId = parentId }

            fun scopeEntityIds(scopeEntityIds: List<String>) =
                scopeEntityIds(JsonField.of(scopeEntityIds))

            /**
             * Sets [Builder.scopeEntityIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scopeEntityIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Maximum usage allowed within one cadence window (required on create) */
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
             * Returns an immutable instance of [Assignment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .entityId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Assignment =
                Assignment(
                    checkRequired("entityId", entityId),
                    cadence,
                    currencyId,
                    featureId,
                    parentId,
                    (scopeEntityIds ?: JsonMissing.of()).map { it.toImmutable() },
                    usageLimit,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Assignment = apply {
            if (validated) {
                return@apply
            }

            entityId()
            cadence()
            currencyId()
            featureId()
            parentId()
            scopeEntityIds()
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
            (if (entityId.asKnown().isPresent) 1 else 0) +
                (if (cadence.asKnown().isPresent) 1 else 0) +
                (if (currencyId.asKnown().isPresent) 1 else 0) +
                (if (featureId.asKnown().isPresent) 1 else 0) +
                (if (parentId.asKnown().isPresent) 1 else 0) +
                (scopeEntityIds.asKnown().getOrNull()?.size ?: 0) +
                (if (usageLimit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Assignment &&
                entityId == other.entityId &&
                cadence == other.cadence &&
                currencyId == other.currencyId &&
                featureId == other.featureId &&
                parentId == other.parentId &&
                scopeEntityIds == other.scopeEntityIds &&
                usageLimit == other.usageLimit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                entityId,
                cadence,
                currencyId,
                featureId,
                parentId,
                scopeEntityIds,
                usageLimit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Assignment{entityId=$entityId, cadence=$cadence, currencyId=$currencyId, featureId=$featureId, parentId=$parentId, scopeEntityIds=$scopeEntityIds, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssignmentUpsertParams &&
            id == other.id &&
            xAccountId == other.xAccountId &&
            xEnvironmentId == other.xEnvironmentId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, xAccountId, xEnvironmentId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AssignmentUpsertParams{id=$id, xAccountId=$xAccountId, xEnvironmentId=$xEnvironmentId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
