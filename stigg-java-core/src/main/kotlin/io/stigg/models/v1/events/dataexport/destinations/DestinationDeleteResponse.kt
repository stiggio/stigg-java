// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport.destinations

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
class DestinationDeleteResponse
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
     * Current destinations under the DATA_EXPORT integration.
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
         * Returns a mutable builder for constructing an instance of [DestinationDeleteResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DestinationDeleteResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(destinationDeleteResponse: DestinationDeleteResponse) = apply {
            data = destinationDeleteResponse.data
            additionalProperties = destinationDeleteResponse.additionalProperties.toMutableMap()
        }

        /** Current destinations under the DATA_EXPORT integration. */
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
         * Returns an immutable instance of [DestinationDeleteResponse].
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
        fun build(): DestinationDeleteResponse =
            DestinationDeleteResponse(
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
    fun validate(): DestinationDeleteResponse = apply {
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

    /** Current destinations under the DATA_EXPORT integration. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val destinations: JsonField<List<Destination>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("destinations")
            @ExcludeMissing
            destinations: JsonField<List<Destination>> = JsonMissing.of()
        ) : this(destinations, mutableMapOf())

        /**
         * Current destinations under the DATA_EXPORT integration
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destinations(): List<Destination> = destinations.getRequired("destinations")

        /**
         * Returns the raw JSON value of [destinations].
         *
         * Unlike [destinations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destinations")
        @ExcludeMissing
        fun _destinations(): JsonField<List<Destination>> = destinations

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
             * .destinations()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var destinations: JsonField<MutableList<Destination>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                destinations = data.destinations.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Current destinations under the DATA_EXPORT integration */
            fun destinations(destinations: List<Destination>) =
                destinations(JsonField.of(destinations))

            /**
             * Sets [Builder.destinations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinations] with a well-typed `List<Destination>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun destinations(destinations: JsonField<List<Destination>>) = apply {
                this.destinations = destinations.map { it.toMutableList() }
            }

            /**
             * Adds a single [Destination] to [destinations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDestination(destination: Destination) = apply {
                destinations =
                    (destinations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("destinations", it).add(destination)
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
             * .destinations()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("destinations", destinations).map { it.toImmutable() },
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

            destinations().forEach { it.validate() }
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
            (destinations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** A single destination entry under the DATA_EXPORT integration. */
        class Destination
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val connectedAt: JsonField<String>,
            private val destinationId: JsonField<String>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("connectedAt")
                @ExcludeMissing
                connectedAt: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destinationId")
                @ExcludeMissing
                destinationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(connectedAt, destinationId, type, mutableMapOf())

            /**
             * ISO8601 timestamp of when the destination was connected
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun connectedAt(): String = connectedAt.getRequired("connectedAt")

            /**
             * Provider destination ID
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun destinationId(): String = destinationId.getRequired("destinationId")

            /**
             * Destination type (snowflake, bigquery, ...)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): String = type.getRequired("type")

            /**
             * Returns the raw JSON value of [connectedAt].
             *
             * Unlike [connectedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("connectedAt")
            @ExcludeMissing
            fun _connectedAt(): JsonField<String> = connectedAt

            /**
             * Returns the raw JSON value of [destinationId].
             *
             * Unlike [destinationId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("destinationId")
            @ExcludeMissing
            fun _destinationId(): JsonField<String> = destinationId

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
                 * Returns a mutable builder for constructing an instance of [Destination].
                 *
                 * The following fields are required:
                 * ```java
                 * .connectedAt()
                 * .destinationId()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Destination]. */
            class Builder internal constructor() {

                private var connectedAt: JsonField<String>? = null
                private var destinationId: JsonField<String>? = null
                private var type: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(destination: Destination) = apply {
                    connectedAt = destination.connectedAt
                    destinationId = destination.destinationId
                    type = destination.type
                    additionalProperties = destination.additionalProperties.toMutableMap()
                }

                /** ISO8601 timestamp of when the destination was connected */
                fun connectedAt(connectedAt: String) = connectedAt(JsonField.of(connectedAt))

                /**
                 * Sets [Builder.connectedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.connectedAt] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun connectedAt(connectedAt: JsonField<String>) = apply {
                    this.connectedAt = connectedAt
                }

                /** Provider destination ID */
                fun destinationId(destinationId: String) =
                    destinationId(JsonField.of(destinationId))

                /**
                 * Sets [Builder.destinationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.destinationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun destinationId(destinationId: JsonField<String>) = apply {
                    this.destinationId = destinationId
                }

                /** Destination type (snowflake, bigquery, ...) */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Destination].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .connectedAt()
                 * .destinationId()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Destination =
                    Destination(
                        checkRequired("connectedAt", connectedAt),
                        checkRequired("destinationId", destinationId),
                        checkRequired("type", type),
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
            fun validate(): Destination = apply {
                if (validated) {
                    return@apply
                }

                connectedAt()
                destinationId()
                type()
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
                (if (connectedAt.asKnown().isPresent) 1 else 0) +
                    (if (destinationId.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Destination &&
                    connectedAt == other.connectedAt &&
                    destinationId == other.destinationId &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(connectedAt, destinationId, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Destination{connectedAt=$connectedAt, destinationId=$destinationId, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                destinations == other.destinations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(destinations, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{destinations=$destinations, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DestinationDeleteResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DestinationDeleteResponse{data=$data, additionalProperties=$additionalProperties}"
}
