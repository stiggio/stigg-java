// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.entities

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
 * Creates or updates entities in bulk for the given customer. Existing entities matched by id are
 * updated; new ids are created.
 */
class EntityUpsertParams
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
     * List of entities to create or update (1-100 entries)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entities(): List<Entity> = body.entities()

    /**
     * Returns the raw JSON value of [entities].
     *
     * Unlike [entities], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entities(): JsonField<List<Entity>> = body._entities()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntityUpsertParams].
         *
         * The following fields are required:
         * ```java
         * .entities()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntityUpsertParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var xAccountId: String? = null
        private var xEnvironmentId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(entityUpsertParams: EntityUpsertParams) = apply {
            id = entityUpsertParams.id
            xAccountId = entityUpsertParams.xAccountId
            xEnvironmentId = entityUpsertParams.xEnvironmentId
            body = entityUpsertParams.body.toBuilder()
            additionalHeaders = entityUpsertParams.additionalHeaders.toBuilder()
            additionalQueryParams = entityUpsertParams.additionalQueryParams.toBuilder()
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
         * - [entities]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** List of entities to create or update (1-100 entries) */
        fun entities(entities: List<Entity>) = apply { body.entities(entities) }

        /**
         * Sets [Builder.entities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entities] with a well-typed `List<Entity>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entities(entities: JsonField<List<Entity>>) = apply { body.entities(entities) }

        /**
         * Adds a single [Entity] to [entities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntity(entity: Entity) = apply { body.addEntity(entity) }

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
         * Returns an immutable instance of [EntityUpsertParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .entities()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntityUpsertParams =
            EntityUpsertParams(
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

    /** Request body for creating or updating entities in bulk for a single customer */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val entities: JsonField<List<Entity>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("entities")
            @ExcludeMissing
            entities: JsonField<List<Entity>> = JsonMissing.of()
        ) : this(entities, mutableMapOf())

        /**
         * List of entities to create or update (1-100 entries)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entities(): List<Entity> = entities.getRequired("entities")

        /**
         * Returns the raw JSON value of [entities].
         *
         * Unlike [entities], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entities")
        @ExcludeMissing
        fun _entities(): JsonField<List<Entity>> = entities

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
             * .entities()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var entities: JsonField<MutableList<Entity>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                entities = body.entities.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** List of entities to create or update (1-100 entries) */
            fun entities(entities: List<Entity>) = entities(JsonField.of(entities))

            /**
             * Sets [Builder.entities] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entities] with a well-typed `List<Entity>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entities(entities: JsonField<List<Entity>>) = apply {
                this.entities = entities.map { it.toMutableList() }
            }

            /**
             * Adds a single [Entity] to [entities].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEntity(entity: Entity) = apply {
                entities =
                    (entities ?: JsonField.of(mutableListOf())).also {
                        checkKnown("entities", it).add(entity)
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
             * .entities()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("entities", entities).map { it.toImmutable() },
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

            entities().forEach { it.validate() }
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
            (entities.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                entities == other.entities &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(entities, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{entities=$entities, additionalProperties=$additionalProperties}"
    }

    /** A single entity to create or update. */
    class Entity
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val typeRefId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("typeRefId")
            @ExcludeMissing
            typeRefId: JsonField<String> = JsonMissing.of(),
        ) : this(id, metadata, typeRefId, mutableMapOf())

        /**
         * The unique identifier for the entity
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Free-form key/value metadata. Patch semantics: empty-string value removes a key, omitted
         * keys are preserved.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * The entity type refId this entity instantiates. Required when creating a new entity; on a
         * re-upsert may be omitted to preserve the existing type. Governance returns 400 if missing
         * on create.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun typeRefId(): Optional<String> = typeRefId.getOptional("typeRefId")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [typeRefId].
         *
         * Unlike [typeRefId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("typeRefId") @ExcludeMissing fun _typeRefId(): JsonField<String> = typeRefId

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
             * Returns a mutable builder for constructing an instance of [Entity].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Entity]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var typeRefId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entity: Entity) = apply {
                id = entity.id
                metadata = entity.metadata
                typeRefId = entity.typeRefId
                additionalProperties = entity.additionalProperties.toMutableMap()
            }

            /** The unique identifier for the entity */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Free-form key/value metadata. Patch semantics: empty-string value removes a key,
             * omitted keys are preserved.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * The entity type refId this entity instantiates. Required when creating a new entity;
             * on a re-upsert may be omitted to preserve the existing type. Governance returns 400
             * if missing on create.
             */
            fun typeRefId(typeRefId: String) = typeRefId(JsonField.of(typeRefId))

            /**
             * Sets [Builder.typeRefId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.typeRefId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun typeRefId(typeRefId: JsonField<String>) = apply { this.typeRefId = typeRefId }

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
             * Returns an immutable instance of [Entity].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Entity =
                Entity(
                    checkRequired("id", id),
                    metadata,
                    typeRefId,
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
        fun validate(): Entity = apply {
            if (validated) {
                return@apply
            }

            id()
            metadata().ifPresent { it.validate() }
            typeRefId()
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
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (typeRefId.asKnown().isPresent) 1 else 0)

        /**
         * Free-form key/value metadata. Patch semantics: empty-string value removes a key, omitted
         * keys are preserved.
         */
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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entity &&
                id == other.id &&
                metadata == other.metadata &&
                typeRefId == other.typeRefId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, metadata, typeRefId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entity{id=$id, metadata=$metadata, typeRefId=$typeRefId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityUpsertParams &&
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
        "EntityUpsertParams{id=$id, xAccountId=$xAccountId, xEnvironmentId=$xEnvironmentId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
