// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Response object */
class DataExportListModelsResponse
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
     * Grouped catalog of every data-export model a destination can opt into.
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
         * Returns a mutable builder for constructing an instance of [DataExportListModelsResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportListModelsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataExportListModelsResponse: DataExportListModelsResponse) = apply {
            data = dataExportListModelsResponse.data
            additionalProperties = dataExportListModelsResponse.additionalProperties.toMutableMap()
        }

        /** Grouped catalog of every data-export model a destination can opt into. */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [DataExportListModelsResponse].
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
        fun build(): DataExportListModelsResponse =
            DataExportListModelsResponse(
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
    fun validate(): DataExportListModelsResponse = apply {
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

    /** Grouped catalog of every data-export model a destination can opt into. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val groups: JsonField<List<Group>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("groups")
            @ExcludeMissing
            groups: JsonField<List<Group>> = JsonMissing.of()
        ) : this(groups, mutableMapOf())

        /**
         * Groups of data-export models, in display order
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun groups(): List<Group> = groups.getRequired("groups")

        /**
         * Returns the raw JSON value of [groups].
         *
         * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("groups") @ExcludeMissing fun _groups(): JsonField<List<Group>> = groups

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
             * .groups()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var groups: JsonField<MutableList<Group>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                groups = data.groups.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Groups of data-export models, in display order */
            fun groups(groups: List<Group>) = groups(JsonField.of(groups))

            /**
             * Sets [Builder.groups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groups] with a well-typed `List<Group>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groups(groups: JsonField<List<Group>>) = apply {
                this.groups = groups.map { it.toMutableList() }
            }

            /**
             * Adds a single [Group] to [groups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroup(group: Group) = apply {
                groups =
                    (groups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groups", it).add(group)
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .groups()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("groups", groups).map { it.toImmutable() },
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            groups().forEach { it.validate() }
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
            (groups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** A group of related data-export models, mirroring the public docs taxonomy. */
        class Group
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val displayName: JsonField<String>,
            private val models: JsonField<List<Model>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("displayName")
                @ExcludeMissing
                displayName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("models")
                @ExcludeMissing
                models: JsonField<List<Model>> = JsonMissing.of(),
            ) : this(id, displayName, models, mutableMapOf())

            /**
             * Stable group identifier
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Customer-facing group label
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun displayName(): String = displayName.getRequired("displayName")

            /**
             * Models in this group
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun models(): List<Model> = models.getRequired("models")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [displayName].
             *
             * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("displayName")
            @ExcludeMissing
            fun _displayName(): JsonField<String> = displayName

            /**
             * Returns the raw JSON value of [models].
             *
             * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("models") @ExcludeMissing fun _models(): JsonField<List<Model>> = models

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
                 * Returns a mutable builder for constructing an instance of [Group].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .displayName()
                 * .models()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Group]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var displayName: JsonField<String>? = null
                private var models: JsonField<MutableList<Model>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(group: Group) = apply {
                    id = group.id
                    displayName = group.displayName
                    models = group.models.map { it.toMutableList() }
                    additionalProperties = group.additionalProperties.toMutableMap()
                }

                /** Stable group identifier */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Customer-facing group label */
                fun displayName(displayName: String) = displayName(JsonField.of(displayName))

                /**
                 * Sets [Builder.displayName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.displayName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun displayName(displayName: JsonField<String>) = apply {
                    this.displayName = displayName
                }

                /** Models in this group */
                fun models(models: List<Model>) = models(JsonField.of(models))

                /**
                 * Sets [Builder.models] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.models] with a well-typed `List<Model>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun models(models: JsonField<List<Model>>) = apply {
                    this.models = models.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Model] to [models].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addModel(model: Model) = apply {
                    models =
                        (models ?: JsonField.of(mutableListOf())).also {
                            checkKnown("models", it).add(model)
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
                 * Returns an immutable instance of [Group].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .displayName()
                 * .models()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Group =
                    Group(
                        checkRequired("id", id),
                        checkRequired("displayName", displayName),
                        checkRequired("models", models).map { it.toImmutable() },
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
            fun validate(): Group = apply {
                if (validated) {
                    return@apply
                }

                id()
                displayName()
                models().forEach { it.validate() }
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
                    (models.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** A single data-export model the customer can opt into. */
            class Model
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val displayName: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("displayName")
                    @ExcludeMissing
                    displayName: JsonField<String> = JsonMissing.of(),
                ) : this(id, displayName, mutableMapOf())

                /**
                 * Wire identifier — what gets persisted on the destination and registered with the
                 * provider
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Customer-facing label for the model
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun displayName(): String = displayName.getRequired("displayName")

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
                     * Returns a mutable builder for constructing an instance of [Model].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .displayName()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Model]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var displayName: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(model: Model) = apply {
                        id = model.id
                        displayName = model.displayName
                        additionalProperties = model.additionalProperties.toMutableMap()
                    }

                    /**
                     * Wire identifier — what gets persisted on the destination and registered with
                     * the provider
                     */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** Customer-facing label for the model */
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
                     * Returns an immutable instance of [Model].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .displayName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Model =
                        Model(
                            checkRequired("id", id),
                            checkRequired("displayName", displayName),
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
                fun validate(): Model = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    displayName()
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
                        (if (displayName.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Model &&
                        id == other.id &&
                        displayName == other.displayName &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, displayName, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Model{id=$id, displayName=$displayName, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Group &&
                    id == other.id &&
                    displayName == other.displayName &&
                    models == other.models &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, displayName, models, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Group{id=$id, displayName=$displayName, models=$models, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                groups == other.groups &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(groups, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{groups=$groups, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataExportListModelsResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataExportListModelsResponse{data=$data, additionalProperties=$additionalProperties}"
}
