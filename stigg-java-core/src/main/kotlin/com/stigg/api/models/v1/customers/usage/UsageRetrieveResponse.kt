// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers.usage

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.stigg.api.core.Enum
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
import kotlin.jvm.optionals.getOrNull

class UsageRetrieveResponse
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
         * Returns a mutable builder for constructing an instance of [UsageRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageRetrieveResponse: UsageRetrieveResponse) = apply {
            data = usageRetrieveResponse.data
            additionalProperties = usageRetrieveResponse.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [UsageRetrieveResponse].
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
        fun build(): UsageRetrieveResponse =
            UsageRetrieveResponse(checkRequired("data", data), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): UsageRetrieveResponse = apply {
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

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val markers: JsonField<List<Marker>>,
        private val series: JsonField<List<Series>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("markers")
            @ExcludeMissing
            markers: JsonField<List<Marker>> = JsonMissing.of(),
            @JsonProperty("series")
            @ExcludeMissing
            series: JsonField<List<Series>> = JsonMissing.of(),
        ) : this(markers, series, mutableMapOf())

        /**
         * Markers for events that affecting feature usage
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun markers(): List<Marker> = markers.getRequired("markers")

        /**
         * Series of usage history
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun series(): List<Series> = series.getRequired("series")

        /**
         * Returns the raw JSON value of [markers].
         *
         * Unlike [markers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("markers") @ExcludeMissing fun _markers(): JsonField<List<Marker>> = markers

        /**
         * Returns the raw JSON value of [series].
         *
         * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("series") @ExcludeMissing fun _series(): JsonField<List<Series>> = series

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
             * .markers()
             * .series()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var markers: JsonField<MutableList<Marker>>? = null
            private var series: JsonField<MutableList<Series>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                markers = data.markers.map { it.toMutableList() }
                series = data.series.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Markers for events that affecting feature usage */
            fun markers(markers: List<Marker>) = markers(JsonField.of(markers))

            /**
             * Sets [Builder.markers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.markers] with a well-typed `List<Marker>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun markers(markers: JsonField<List<Marker>>) = apply {
                this.markers = markers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Marker] to [markers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMarker(marker: Marker) = apply {
                markers =
                    (markers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("markers", it).add(marker)
                    }
            }

            /** Series of usage history */
            fun series(series: List<Series>) = series(JsonField.of(series))

            /**
             * Sets [Builder.series] to an arbitrary JSON value.
             *
             * You should usually call [Builder.series] with a well-typed `List<Series>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun series(series: JsonField<List<Series>>) = apply {
                this.series = series.map { it.toMutableList() }
            }

            /**
             * Adds a single [Series] to [Builder.series].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSeries(series: Series) = apply {
                this.series =
                    (this.series ?: JsonField.of(mutableListOf())).also {
                        checkKnown("series", it).add(series)
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
             * .markers()
             * .series()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("markers", markers).map { it.toImmutable() },
                    checkRequired("series", series).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            markers().forEach { it.validate() }
            series().forEach { it.validate() }
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
            (markers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Marker
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(timestamp, type, mutableMapOf())

            /**
             * Timestamp of the marker
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * Type of marker for a usage history point
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [Marker].
                 *
                 * The following fields are required:
                 * ```java
                 * .timestamp()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Marker]. */
            class Builder internal constructor() {

                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(marker: Marker) = apply {
                    timestamp = marker.timestamp
                    type = marker.type
                    additionalProperties = marker.additionalProperties.toMutableMap()
                }

                /** Timestamp of the marker */
                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                /** Type of marker for a usage history point */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Marker].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Marker =
                    Marker(
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Marker = apply {
                if (validated) {
                    return@apply
                }

                timestamp()
                type().validate()
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
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Type of marker for a usage history point */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PERIODIC_RESET = of("PERIODIC_RESET")

                    @JvmField val SUBSCRIPTION_CHANGE_RESET = of("SUBSCRIPTION_CHANGE_RESET")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PERIODIC_RESET,
                    SUBSCRIPTION_CHANGE_RESET,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PERIODIC_RESET,
                    SUBSCRIPTION_CHANGE_RESET,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PERIODIC_RESET -> Value.PERIODIC_RESET
                        SUBSCRIPTION_CHANGE_RESET -> Value.SUBSCRIPTION_CHANGE_RESET
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
                        PERIODIC_RESET -> Known.PERIODIC_RESET
                        SUBSCRIPTION_CHANGE_RESET -> Known.SUBSCRIPTION_CHANGE_RESET
                        else -> throw StiggInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StiggInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Marker &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(timestamp, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Marker{timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class Series
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val points: JsonField<List<Point>>,
            private val tags: JsonField<List<Tag>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("points")
                @ExcludeMissing
                points: JsonField<List<Point>> = JsonMissing.of(),
                @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<Tag>> = JsonMissing.of(),
            ) : this(points, tags, mutableMapOf())

            /**
             * Points in the usage history series
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun points(): List<Point> = points.getRequired("points")

            /**
             * Tags for the usage history series
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tags(): List<Tag> = tags.getRequired("tags")

            /**
             * Returns the raw JSON value of [points].
             *
             * Unlike [points], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("points") @ExcludeMissing fun _points(): JsonField<List<Point>> = points

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<Tag>> = tags

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
                 * Returns a mutable builder for constructing an instance of [Series].
                 *
                 * The following fields are required:
                 * ```java
                 * .points()
                 * .tags()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Series]. */
            class Builder internal constructor() {

                private var points: JsonField<MutableList<Point>>? = null
                private var tags: JsonField<MutableList<Tag>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(series: Series) = apply {
                    points = series.points.map { it.toMutableList() }
                    tags = series.tags.map { it.toMutableList() }
                    additionalProperties = series.additionalProperties.toMutableMap()
                }

                /** Points in the usage history series */
                fun points(points: List<Point>) = points(JsonField.of(points))

                /**
                 * Sets [Builder.points] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.points] with a well-typed `List<Point>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun points(points: JsonField<List<Point>>) = apply {
                    this.points = points.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Point] to [points].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPoint(point: Point) = apply {
                    points =
                        (points ?: JsonField.of(mutableListOf())).also {
                            checkKnown("points", it).add(point)
                        }
                }

                /** Tags for the usage history series */
                fun tags(tags: List<Tag>) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<Tag>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tags(tags: JsonField<List<Tag>>) = apply {
                    this.tags = tags.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Tag] to [tags].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTag(tag: Tag) = apply {
                    tags =
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
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
                 * Returns an immutable instance of [Series].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .points()
                 * .tags()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Series =
                    Series(
                        checkRequired("points", points).map { it.toImmutable() },
                        checkRequired("tags", tags).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Series = apply {
                if (validated) {
                    return@apply
                }

                points().forEach { it.validate() }
                tags().forEach { it.validate() }
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
                (points.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (tags.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Point
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val isResetPoint: JsonField<Boolean>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val value: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("isResetPoint")
                    @ExcludeMissing
                    isResetPoint: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Double> = JsonMissing.of(),
                ) : this(isResetPoint, timestamp, value, mutableMapOf())

                /**
                 * Indicates whether there was usage reset in this point, see `markers` for details
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isResetPoint(): Boolean = isResetPoint.getRequired("isResetPoint")

                /**
                 * Timestamp of the usage history point
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                /**
                 * Value of the usage history point
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun value(): Double = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [isResetPoint].
                 *
                 * Unlike [isResetPoint], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("isResetPoint")
                @ExcludeMissing
                fun _isResetPoint(): JsonField<Boolean> = isResetPoint

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
                     * Returns a mutable builder for constructing an instance of [Point].
                     *
                     * The following fields are required:
                     * ```java
                     * .isResetPoint()
                     * .timestamp()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Point]. */
                class Builder internal constructor() {

                    private var isResetPoint: JsonField<Boolean>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var value: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(point: Point) = apply {
                        isResetPoint = point.isResetPoint
                        timestamp = point.timestamp
                        value = point.value
                        additionalProperties = point.additionalProperties.toMutableMap()
                    }

                    /**
                     * Indicates whether there was usage reset in this point, see `markers` for
                     * details
                     */
                    fun isResetPoint(isResetPoint: Boolean) =
                        isResetPoint(JsonField.of(isResetPoint))

                    /**
                     * Sets [Builder.isResetPoint] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isResetPoint] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun isResetPoint(isResetPoint: JsonField<Boolean>) = apply {
                        this.isResetPoint = isResetPoint
                    }

                    /** Timestamp of the usage history point */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    /** Value of the usage history point */
                    fun value(value: Double) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Double>) = apply { this.value = value }

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
                     * Returns an immutable instance of [Point].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .isResetPoint()
                     * .timestamp()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Point =
                        Point(
                            checkRequired("isResetPoint", isResetPoint),
                            checkRequired("timestamp", timestamp),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Point = apply {
                    if (validated) {
                        return@apply
                    }

                    isResetPoint()
                    timestamp()
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
                    (if (isResetPoint.asKnown().isPresent) 1 else 0) +
                        (if (timestamp.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Point &&
                        isResetPoint == other.isResetPoint &&
                        timestamp == other.timestamp &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(isResetPoint, timestamp, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Point{isResetPoint=$isResetPoint, timestamp=$timestamp, value=$value, additionalProperties=$additionalProperties}"
            }

            class Tag
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val key: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(key, value, mutableMapOf())

                /**
                 * Key of the tag
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun key(): String = key.getRequired("key")

                /**
                 * Value of the tag
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun value(): String = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [key].
                 *
                 * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of [Tag].
                     *
                     * The following fields are required:
                     * ```java
                     * .key()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tag]. */
                class Builder internal constructor() {

                    private var key: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tag: Tag) = apply {
                        key = tag.key
                        value = tag.value
                        additionalProperties = tag.additionalProperties.toMutableMap()
                    }

                    /** Key of the tag */
                    fun key(key: String) = key(JsonField.of(key))

                    /**
                     * Sets [Builder.key] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.key] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** Value of the tag */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [Tag].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .key()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Tag =
                        Tag(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Tag = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
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
                    (if (key.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tag &&
                        key == other.key &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tag{key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Series &&
                    points == other.points &&
                    tags == other.tags &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(points, tags, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Series{points=$points, tags=$tags, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                markers == other.markers &&
                series == other.series &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(markers, series, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{markers=$markers, series=$series, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
