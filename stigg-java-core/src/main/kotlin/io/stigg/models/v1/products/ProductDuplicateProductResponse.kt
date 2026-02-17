// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

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
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response object */
class ProductDuplicateProductResponse
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
     * Product configuration object
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
         * Returns a mutable builder for constructing an instance of
         * [ProductDuplicateProductResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProductDuplicateProductResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(productDuplicateProductResponse: ProductDuplicateProductResponse) =
            apply {
                data = productDuplicateProductResponse.data
                additionalProperties =
                    productDuplicateProductResponse.additionalProperties.toMutableMap()
            }

        /** Product configuration object */
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
         * Returns an immutable instance of [ProductDuplicateProductResponse].
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
        fun build(): ProductDuplicateProductResponse =
            ProductDuplicateProductResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProductDuplicateProductResponse = apply {
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

    /** Product configuration object */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val displayName: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val multipleSubscriptions: JsonField<Boolean>,
        private val status: JsonField<Status>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val productSettings: JsonField<ProductSettings>,
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
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("multipleSubscriptions")
            @ExcludeMissing
            multipleSubscriptions: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("productSettings")
            @ExcludeMissing
            productSettings: JsonField<ProductSettings> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            description,
            displayName,
            metadata,
            multipleSubscriptions,
            status,
            updatedAt,
            productSettings,
            mutableMapOf(),
        )

        /**
         * The unique identifier for the entity
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
         * Description of the product
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Display name of the product
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun displayName(): String = displayName.getRequired("displayName")

        /**
         * Metadata associated with the entity
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * Indicates if multiple subscriptions to this product are allowed
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun multipleSubscriptions(): Boolean =
            multipleSubscriptions.getRequired("multipleSubscriptions")

        /**
         * The status of the product
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
         * Product behavior settings for subscription lifecycle management.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productSettings(): Optional<ProductSettings> =
            productSettings.getOptional("productSettings")

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
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("displayName")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [multipleSubscriptions].
         *
         * Unlike [multipleSubscriptions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("multipleSubscriptions")
        @ExcludeMissing
        fun _multipleSubscriptions(): JsonField<Boolean> = multipleSubscriptions

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
         * Returns the raw JSON value of [productSettings].
         *
         * Unlike [productSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("productSettings")
        @ExcludeMissing
        fun _productSettings(): JsonField<ProductSettings> = productSettings

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
             * .displayName()
             * .metadata()
             * .multipleSubscriptions()
             * .status()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var description: JsonField<String>? = null
            private var displayName: JsonField<String>? = null
            private var metadata: JsonField<Metadata>? = null
            private var multipleSubscriptions: JsonField<Boolean>? = null
            private var status: JsonField<Status>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var productSettings: JsonField<ProductSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                description = data.description
                displayName = data.displayName
                metadata = data.metadata
                multipleSubscriptions = data.multipleSubscriptions
                status = data.status
                updatedAt = data.updatedAt
                productSettings = data.productSettings
                additionalProperties = data.additionalProperties.toMutableMap()
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

            /** Description of the product */
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

            /** Display name of the product */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /** Metadata associated with the entity */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Indicates if multiple subscriptions to this product are allowed */
            fun multipleSubscriptions(multipleSubscriptions: Boolean) =
                multipleSubscriptions(JsonField.of(multipleSubscriptions))

            /**
             * Sets [Builder.multipleSubscriptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.multipleSubscriptions] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun multipleSubscriptions(multipleSubscriptions: JsonField<Boolean>) = apply {
                this.multipleSubscriptions = multipleSubscriptions
            }

            /** The status of the product */
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

            /** Product behavior settings for subscription lifecycle management. */
            fun productSettings(productSettings: ProductSettings) =
                productSettings(JsonField.of(productSettings))

            /**
             * Sets [Builder.productSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productSettings] with a well-typed [ProductSettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun productSettings(productSettings: JsonField<ProductSettings>) = apply {
                this.productSettings = productSettings
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
             * .description()
             * .displayName()
             * .metadata()
             * .multipleSubscriptions()
             * .status()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("description", description),
                    checkRequired("displayName", displayName),
                    checkRequired("metadata", metadata),
                    checkRequired("multipleSubscriptions", multipleSubscriptions),
                    checkRequired("status", status),
                    checkRequired("updatedAt", updatedAt),
                    productSettings,
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
            displayName()
            metadata().validate()
            multipleSubscriptions()
            status().validate()
            updatedAt()
            productSettings().ifPresent { it.validate() }
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
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (multipleSubscriptions.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (productSettings.asKnown().getOrNull()?.validity() ?: 0)

        /** Metadata associated with the entity */
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

        /** The status of the product */
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

                @JvmField val PUBLISHED = of("PUBLISHED")

                @JvmField val ARCHIVED = of("ARCHIVED")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PUBLISHED,
                ARCHIVED,
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
                PUBLISHED,
                ARCHIVED,
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
                    PUBLISHED -> Value.PUBLISHED
                    ARCHIVED -> Value.ARCHIVED
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
                    PUBLISHED -> Known.PUBLISHED
                    ARCHIVED -> Known.ARCHIVED
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

        /** Product behavior settings for subscription lifecycle management. */
        class ProductSettings
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val subscriptionCancellationTime: JsonField<SubscriptionCancellationTime>,
            private val subscriptionEndSetup: JsonField<SubscriptionEndSetup>,
            private val subscriptionStartSetup: JsonField<SubscriptionStartSetup>,
            private val downgradePlanId: JsonField<String>,
            private val prorateAtEndOfBillingPeriod: JsonField<Boolean>,
            private val subscriptionStartPlanId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("subscriptionCancellationTime")
                @ExcludeMissing
                subscriptionCancellationTime: JsonField<SubscriptionCancellationTime> =
                    JsonMissing.of(),
                @JsonProperty("subscriptionEndSetup")
                @ExcludeMissing
                subscriptionEndSetup: JsonField<SubscriptionEndSetup> = JsonMissing.of(),
                @JsonProperty("subscriptionStartSetup")
                @ExcludeMissing
                subscriptionStartSetup: JsonField<SubscriptionStartSetup> = JsonMissing.of(),
                @JsonProperty("downgradePlanId")
                @ExcludeMissing
                downgradePlanId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("prorateAtEndOfBillingPeriod")
                @ExcludeMissing
                prorateAtEndOfBillingPeriod: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("subscriptionStartPlanId")
                @ExcludeMissing
                subscriptionStartPlanId: JsonField<String> = JsonMissing.of(),
            ) : this(
                subscriptionCancellationTime,
                subscriptionEndSetup,
                subscriptionStartSetup,
                downgradePlanId,
                prorateAtEndOfBillingPeriod,
                subscriptionStartPlanId,
                mutableMapOf(),
            )

            /**
             * Time when the subscription will be cancelled
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionCancellationTime(): SubscriptionCancellationTime =
                subscriptionCancellationTime.getRequired("subscriptionCancellationTime")

            /**
             * Setup for the end of the subscription
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionEndSetup(): SubscriptionEndSetup =
                subscriptionEndSetup.getRequired("subscriptionEndSetup")

            /**
             * Setup for the start of the subscription
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionStartSetup(): SubscriptionStartSetup =
                subscriptionStartSetup.getRequired("subscriptionStartSetup")

            /**
             * ID of the plan to downgrade to at the end of the billing period
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun downgradePlanId(): Optional<String> = downgradePlanId.getOptional("downgradePlanId")

            /**
             * Indicates if the subscription should be prorated at the end of the billing period
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun prorateAtEndOfBillingPeriod(): Optional<Boolean> =
                prorateAtEndOfBillingPeriod.getOptional("prorateAtEndOfBillingPeriod")

            /**
             * ID of the plan to start the subscription with
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subscriptionStartPlanId(): Optional<String> =
                subscriptionStartPlanId.getOptional("subscriptionStartPlanId")

            /**
             * Returns the raw JSON value of [subscriptionCancellationTime].
             *
             * Unlike [subscriptionCancellationTime], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("subscriptionCancellationTime")
            @ExcludeMissing
            fun _subscriptionCancellationTime(): JsonField<SubscriptionCancellationTime> =
                subscriptionCancellationTime

            /**
             * Returns the raw JSON value of [subscriptionEndSetup].
             *
             * Unlike [subscriptionEndSetup], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscriptionEndSetup")
            @ExcludeMissing
            fun _subscriptionEndSetup(): JsonField<SubscriptionEndSetup> = subscriptionEndSetup

            /**
             * Returns the raw JSON value of [subscriptionStartSetup].
             *
             * Unlike [subscriptionStartSetup], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscriptionStartSetup")
            @ExcludeMissing
            fun _subscriptionStartSetup(): JsonField<SubscriptionStartSetup> =
                subscriptionStartSetup

            /**
             * Returns the raw JSON value of [downgradePlanId].
             *
             * Unlike [downgradePlanId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("downgradePlanId")
            @ExcludeMissing
            fun _downgradePlanId(): JsonField<String> = downgradePlanId

            /**
             * Returns the raw JSON value of [prorateAtEndOfBillingPeriod].
             *
             * Unlike [prorateAtEndOfBillingPeriod], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("prorateAtEndOfBillingPeriod")
            @ExcludeMissing
            fun _prorateAtEndOfBillingPeriod(): JsonField<Boolean> = prorateAtEndOfBillingPeriod

            /**
             * Returns the raw JSON value of [subscriptionStartPlanId].
             *
             * Unlike [subscriptionStartPlanId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscriptionStartPlanId")
            @ExcludeMissing
            fun _subscriptionStartPlanId(): JsonField<String> = subscriptionStartPlanId

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
                 * Returns a mutable builder for constructing an instance of [ProductSettings].
                 *
                 * The following fields are required:
                 * ```java
                 * .subscriptionCancellationTime()
                 * .subscriptionEndSetup()
                 * .subscriptionStartSetup()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProductSettings]. */
            class Builder internal constructor() {

                private var subscriptionCancellationTime: JsonField<SubscriptionCancellationTime>? =
                    null
                private var subscriptionEndSetup: JsonField<SubscriptionEndSetup>? = null
                private var subscriptionStartSetup: JsonField<SubscriptionStartSetup>? = null
                private var downgradePlanId: JsonField<String> = JsonMissing.of()
                private var prorateAtEndOfBillingPeriod: JsonField<Boolean> = JsonMissing.of()
                private var subscriptionStartPlanId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(productSettings: ProductSettings) = apply {
                    subscriptionCancellationTime = productSettings.subscriptionCancellationTime
                    subscriptionEndSetup = productSettings.subscriptionEndSetup
                    subscriptionStartSetup = productSettings.subscriptionStartSetup
                    downgradePlanId = productSettings.downgradePlanId
                    prorateAtEndOfBillingPeriod = productSettings.prorateAtEndOfBillingPeriod
                    subscriptionStartPlanId = productSettings.subscriptionStartPlanId
                    additionalProperties = productSettings.additionalProperties.toMutableMap()
                }

                /** Time when the subscription will be cancelled */
                fun subscriptionCancellationTime(
                    subscriptionCancellationTime: SubscriptionCancellationTime
                ) = subscriptionCancellationTime(JsonField.of(subscriptionCancellationTime))

                /**
                 * Sets [Builder.subscriptionCancellationTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionCancellationTime] with a well-typed
                 * [SubscriptionCancellationTime] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun subscriptionCancellationTime(
                    subscriptionCancellationTime: JsonField<SubscriptionCancellationTime>
                ) = apply { this.subscriptionCancellationTime = subscriptionCancellationTime }

                /** Setup for the end of the subscription */
                fun subscriptionEndSetup(subscriptionEndSetup: SubscriptionEndSetup) =
                    subscriptionEndSetup(JsonField.of(subscriptionEndSetup))

                /**
                 * Sets [Builder.subscriptionEndSetup] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionEndSetup] with a well-typed
                 * [SubscriptionEndSetup] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun subscriptionEndSetup(subscriptionEndSetup: JsonField<SubscriptionEndSetup>) =
                    apply {
                        this.subscriptionEndSetup = subscriptionEndSetup
                    }

                /** Setup for the start of the subscription */
                fun subscriptionStartSetup(subscriptionStartSetup: SubscriptionStartSetup) =
                    subscriptionStartSetup(JsonField.of(subscriptionStartSetup))

                /**
                 * Sets [Builder.subscriptionStartSetup] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionStartSetup] with a well-typed
                 * [SubscriptionStartSetup] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun subscriptionStartSetup(
                    subscriptionStartSetup: JsonField<SubscriptionStartSetup>
                ) = apply { this.subscriptionStartSetup = subscriptionStartSetup }

                /** ID of the plan to downgrade to at the end of the billing period */
                fun downgradePlanId(downgradePlanId: String?) =
                    downgradePlanId(JsonField.ofNullable(downgradePlanId))

                /**
                 * Alias for calling [Builder.downgradePlanId] with `downgradePlanId.orElse(null)`.
                 */
                fun downgradePlanId(downgradePlanId: Optional<String>) =
                    downgradePlanId(downgradePlanId.getOrNull())

                /**
                 * Sets [Builder.downgradePlanId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.downgradePlanId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun downgradePlanId(downgradePlanId: JsonField<String>) = apply {
                    this.downgradePlanId = downgradePlanId
                }

                /**
                 * Indicates if the subscription should be prorated at the end of the billing period
                 */
                fun prorateAtEndOfBillingPeriod(prorateAtEndOfBillingPeriod: Boolean?) =
                    prorateAtEndOfBillingPeriod(JsonField.ofNullable(prorateAtEndOfBillingPeriod))

                /**
                 * Alias for [Builder.prorateAtEndOfBillingPeriod].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun prorateAtEndOfBillingPeriod(prorateAtEndOfBillingPeriod: Boolean) =
                    prorateAtEndOfBillingPeriod(prorateAtEndOfBillingPeriod as Boolean?)

                /**
                 * Alias for calling [Builder.prorateAtEndOfBillingPeriod] with
                 * `prorateAtEndOfBillingPeriod.orElse(null)`.
                 */
                fun prorateAtEndOfBillingPeriod(prorateAtEndOfBillingPeriod: Optional<Boolean>) =
                    prorateAtEndOfBillingPeriod(prorateAtEndOfBillingPeriod.getOrNull())

                /**
                 * Sets [Builder.prorateAtEndOfBillingPeriod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prorateAtEndOfBillingPeriod] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun prorateAtEndOfBillingPeriod(prorateAtEndOfBillingPeriod: JsonField<Boolean>) =
                    apply {
                        this.prorateAtEndOfBillingPeriod = prorateAtEndOfBillingPeriod
                    }

                /** ID of the plan to start the subscription with */
                fun subscriptionStartPlanId(subscriptionStartPlanId: String?) =
                    subscriptionStartPlanId(JsonField.ofNullable(subscriptionStartPlanId))

                /**
                 * Alias for calling [Builder.subscriptionStartPlanId] with
                 * `subscriptionStartPlanId.orElse(null)`.
                 */
                fun subscriptionStartPlanId(subscriptionStartPlanId: Optional<String>) =
                    subscriptionStartPlanId(subscriptionStartPlanId.getOrNull())

                /**
                 * Sets [Builder.subscriptionStartPlanId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionStartPlanId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun subscriptionStartPlanId(subscriptionStartPlanId: JsonField<String>) = apply {
                    this.subscriptionStartPlanId = subscriptionStartPlanId
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
                 * Returns an immutable instance of [ProductSettings].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .subscriptionCancellationTime()
                 * .subscriptionEndSetup()
                 * .subscriptionStartSetup()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ProductSettings =
                    ProductSettings(
                        checkRequired("subscriptionCancellationTime", subscriptionCancellationTime),
                        checkRequired("subscriptionEndSetup", subscriptionEndSetup),
                        checkRequired("subscriptionStartSetup", subscriptionStartSetup),
                        downgradePlanId,
                        prorateAtEndOfBillingPeriod,
                        subscriptionStartPlanId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ProductSettings = apply {
                if (validated) {
                    return@apply
                }

                subscriptionCancellationTime().validate()
                subscriptionEndSetup().validate()
                subscriptionStartSetup().validate()
                downgradePlanId()
                prorateAtEndOfBillingPeriod()
                subscriptionStartPlanId()
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
                (subscriptionCancellationTime.asKnown().getOrNull()?.validity() ?: 0) +
                    (subscriptionEndSetup.asKnown().getOrNull()?.validity() ?: 0) +
                    (subscriptionStartSetup.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (downgradePlanId.asKnown().isPresent) 1 else 0) +
                    (if (prorateAtEndOfBillingPeriod.asKnown().isPresent) 1 else 0) +
                    (if (subscriptionStartPlanId.asKnown().isPresent) 1 else 0)

            /** Time when the subscription will be cancelled */
            class SubscriptionCancellationTime
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val END_OF_BILLING_PERIOD = of("END_OF_BILLING_PERIOD")

                    @JvmField val IMMEDIATE = of("IMMEDIATE")

                    @JvmField val SPECIFIC_DATE = of("SPECIFIC_DATE")

                    @JvmStatic
                    fun of(value: String) = SubscriptionCancellationTime(JsonField.of(value))
                }

                /** An enum containing [SubscriptionCancellationTime]'s known values. */
                enum class Known {
                    END_OF_BILLING_PERIOD,
                    IMMEDIATE,
                    SPECIFIC_DATE,
                }

                /**
                 * An enum containing [SubscriptionCancellationTime]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [SubscriptionCancellationTime] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    END_OF_BILLING_PERIOD,
                    IMMEDIATE,
                    SPECIFIC_DATE,
                    /**
                     * An enum member indicating that [SubscriptionCancellationTime] was
                     * instantiated with an unknown value.
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
                        END_OF_BILLING_PERIOD -> Value.END_OF_BILLING_PERIOD
                        IMMEDIATE -> Value.IMMEDIATE
                        SPECIFIC_DATE -> Value.SPECIFIC_DATE
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
                        END_OF_BILLING_PERIOD -> Known.END_OF_BILLING_PERIOD
                        IMMEDIATE -> Known.IMMEDIATE
                        SPECIFIC_DATE -> Known.SPECIFIC_DATE
                        else ->
                            throw StiggInvalidDataException(
                                "Unknown SubscriptionCancellationTime: $value"
                            )
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

                fun validate(): SubscriptionCancellationTime = apply {
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

                    return other is SubscriptionCancellationTime && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Setup for the end of the subscription */
            class SubscriptionEndSetup
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val DOWNGRADE_TO_FREE = of("DOWNGRADE_TO_FREE")

                    @JvmField val CANCEL_SUBSCRIPTION = of("CANCEL_SUBSCRIPTION")

                    @JvmStatic fun of(value: String) = SubscriptionEndSetup(JsonField.of(value))
                }

                /** An enum containing [SubscriptionEndSetup]'s known values. */
                enum class Known {
                    DOWNGRADE_TO_FREE,
                    CANCEL_SUBSCRIPTION,
                }

                /**
                 * An enum containing [SubscriptionEndSetup]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [SubscriptionEndSetup] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DOWNGRADE_TO_FREE,
                    CANCEL_SUBSCRIPTION,
                    /**
                     * An enum member indicating that [SubscriptionEndSetup] was instantiated with
                     * an unknown value.
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
                        DOWNGRADE_TO_FREE -> Value.DOWNGRADE_TO_FREE
                        CANCEL_SUBSCRIPTION -> Value.CANCEL_SUBSCRIPTION
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
                        DOWNGRADE_TO_FREE -> Known.DOWNGRADE_TO_FREE
                        CANCEL_SUBSCRIPTION -> Known.CANCEL_SUBSCRIPTION
                        else ->
                            throw StiggInvalidDataException("Unknown SubscriptionEndSetup: $value")
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

                fun validate(): SubscriptionEndSetup = apply {
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

                    return other is SubscriptionEndSetup && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Setup for the start of the subscription */
            class SubscriptionStartSetup
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val PLAN_SELECTION = of("PLAN_SELECTION")

                    @JvmField val TRIAL_PERIOD = of("TRIAL_PERIOD")

                    @JvmField val FREE_PLAN = of("FREE_PLAN")

                    @JvmStatic fun of(value: String) = SubscriptionStartSetup(JsonField.of(value))
                }

                /** An enum containing [SubscriptionStartSetup]'s known values. */
                enum class Known {
                    PLAN_SELECTION,
                    TRIAL_PERIOD,
                    FREE_PLAN,
                }

                /**
                 * An enum containing [SubscriptionStartSetup]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [SubscriptionStartSetup] can contain an unknown value in a couple
                 * of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PLAN_SELECTION,
                    TRIAL_PERIOD,
                    FREE_PLAN,
                    /**
                     * An enum member indicating that [SubscriptionStartSetup] was instantiated with
                     * an unknown value.
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
                        PLAN_SELECTION -> Value.PLAN_SELECTION
                        TRIAL_PERIOD -> Value.TRIAL_PERIOD
                        FREE_PLAN -> Value.FREE_PLAN
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
                        PLAN_SELECTION -> Known.PLAN_SELECTION
                        TRIAL_PERIOD -> Known.TRIAL_PERIOD
                        FREE_PLAN -> Known.FREE_PLAN
                        else ->
                            throw StiggInvalidDataException(
                                "Unknown SubscriptionStartSetup: $value"
                            )
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

                fun validate(): SubscriptionStartSetup = apply {
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

                    return other is SubscriptionStartSetup && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProductSettings &&
                    subscriptionCancellationTime == other.subscriptionCancellationTime &&
                    subscriptionEndSetup == other.subscriptionEndSetup &&
                    subscriptionStartSetup == other.subscriptionStartSetup &&
                    downgradePlanId == other.downgradePlanId &&
                    prorateAtEndOfBillingPeriod == other.prorateAtEndOfBillingPeriod &&
                    subscriptionStartPlanId == other.subscriptionStartPlanId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    subscriptionCancellationTime,
                    subscriptionEndSetup,
                    subscriptionStartSetup,
                    downgradePlanId,
                    prorateAtEndOfBillingPeriod,
                    subscriptionStartPlanId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProductSettings{subscriptionCancellationTime=$subscriptionCancellationTime, subscriptionEndSetup=$subscriptionEndSetup, subscriptionStartSetup=$subscriptionStartSetup, downgradePlanId=$downgradePlanId, prorateAtEndOfBillingPeriod=$prorateAtEndOfBillingPeriod, subscriptionStartPlanId=$subscriptionStartPlanId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                createdAt == other.createdAt &&
                description == other.description &&
                displayName == other.displayName &&
                metadata == other.metadata &&
                multipleSubscriptions == other.multipleSubscriptions &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                productSettings == other.productSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                description,
                displayName,
                metadata,
                multipleSubscriptions,
                status,
                updatedAt,
                productSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, description=$description, displayName=$displayName, metadata=$metadata, multipleSubscriptions=$multipleSubscriptions, status=$status, updatedAt=$updatedAt, productSettings=$productSettings, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductDuplicateProductResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductDuplicateProductResponse{data=$data, additionalProperties=$additionalProperties}"
}
