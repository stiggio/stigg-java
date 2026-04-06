// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.internal_.beta.eventqueues

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response object */
class EventQueueRetrieveResponse
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
     * Event queue provisioning status and details
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
         * Returns a mutable builder for constructing an instance of [EventQueueRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventQueueRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventQueueRetrieveResponse: EventQueueRetrieveResponse) = apply {
            data = eventQueueRetrieveResponse.data
            additionalProperties = eventQueueRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Event queue provisioning status and details */
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
         * Returns an immutable instance of [EventQueueRetrieveResponse].
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
        fun build(): EventQueueRetrieveResponse =
            EventQueueRetrieveResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EventQueueRetrieveResponse = apply {
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

    /** Event queue provisioning status and details */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val queueName: JsonField<String>,
        private val region: JsonField<Region>,
        private val status: JsonField<Status>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val queueUrl: JsonField<String>,
        private val roleArn: JsonField<String>,
        private val suffix: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("queueName")
            @ExcludeMissing
            queueName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<Region> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("queueUrl")
            @ExcludeMissing
            queueUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("roleArn") @ExcludeMissing roleArn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suffix") @ExcludeMissing suffix: JsonField<String> = JsonMissing.of(),
        ) : this(
            createdAt,
            queueName,
            region,
            status,
            updatedAt,
            queueUrl,
            roleArn,
            suffix,
            mutableMapOf(),
        )

        /**
         * Timestamp of when the record was created
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * Unique queue identifier
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun queueName(): String = queueName.getRequired("queueName")

        /**
         * AWS region where the queue is deployed
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): Region = region.getRequired("region")

        /**
         * Current provisioning status
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
         * SQS queue URL
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun queueUrl(): Optional<String> = queueUrl.getOptional("queueUrl")

        /**
         * IAM role ARN for queue access
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun roleArn(): Optional<String> = roleArn.getOptional("roleArn")

        /**
         * Queue suffix for disambiguation
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun suffix(): Optional<String> = suffix.getOptional("suffix")

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [queueName].
         *
         * Unlike [queueName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("queueName") @ExcludeMissing fun _queueName(): JsonField<String> = queueName

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<Region> = region

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
         * Returns the raw JSON value of [queueUrl].
         *
         * Unlike [queueUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("queueUrl") @ExcludeMissing fun _queueUrl(): JsonField<String> = queueUrl

        /**
         * Returns the raw JSON value of [roleArn].
         *
         * Unlike [roleArn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("roleArn") @ExcludeMissing fun _roleArn(): JsonField<String> = roleArn

        /**
         * Returns the raw JSON value of [suffix].
         *
         * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

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
             * .createdAt()
             * .queueName()
             * .region()
             * .status()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var createdAt: JsonField<OffsetDateTime>? = null
            private var queueName: JsonField<String>? = null
            private var region: JsonField<Region>? = null
            private var status: JsonField<Status>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var queueUrl: JsonField<String> = JsonMissing.of()
            private var roleArn: JsonField<String> = JsonMissing.of()
            private var suffix: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                createdAt = data.createdAt
                queueName = data.queueName
                region = data.region
                status = data.status
                updatedAt = data.updatedAt
                queueUrl = data.queueUrl
                roleArn = data.roleArn
                suffix = data.suffix
                additionalProperties = data.additionalProperties.toMutableMap()
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Unique queue identifier */
            fun queueName(queueName: String) = queueName(JsonField.of(queueName))

            /**
             * Sets [Builder.queueName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.queueName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun queueName(queueName: JsonField<String>) = apply { this.queueName = queueName }

            /** AWS region where the queue is deployed */
            fun region(region: Region) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [Region] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<Region>) = apply { this.region = region }

            /** Current provisioning status */
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

            /** SQS queue URL */
            fun queueUrl(queueUrl: String?) = queueUrl(JsonField.ofNullable(queueUrl))

            /** Alias for calling [Builder.queueUrl] with `queueUrl.orElse(null)`. */
            fun queueUrl(queueUrl: Optional<String>) = queueUrl(queueUrl.getOrNull())

            /**
             * Sets [Builder.queueUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.queueUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun queueUrl(queueUrl: JsonField<String>) = apply { this.queueUrl = queueUrl }

            /** IAM role ARN for queue access */
            fun roleArn(roleArn: String?) = roleArn(JsonField.ofNullable(roleArn))

            /** Alias for calling [Builder.roleArn] with `roleArn.orElse(null)`. */
            fun roleArn(roleArn: Optional<String>) = roleArn(roleArn.getOrNull())

            /**
             * Sets [Builder.roleArn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roleArn] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roleArn(roleArn: JsonField<String>) = apply { this.roleArn = roleArn }

            /** Queue suffix for disambiguation */
            fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

            /** Alias for calling [Builder.suffix] with `suffix.orElse(null)`. */
            fun suffix(suffix: Optional<String>) = suffix(suffix.getOrNull())

            /**
             * Sets [Builder.suffix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suffix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

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
             * .createdAt()
             * .queueName()
             * .region()
             * .status()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("createdAt", createdAt),
                    checkRequired("queueName", queueName),
                    checkRequired("region", region),
                    checkRequired("status", status),
                    checkRequired("updatedAt", updatedAt),
                    queueUrl,
                    roleArn,
                    suffix,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            createdAt()
            queueName()
            region().validate()
            status().validate()
            updatedAt()
            queueUrl()
            roleArn()
            suffix()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (queueName.asKnown().isPresent) 1 else 0) +
                (region.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (queueUrl.asKnown().isPresent) 1 else 0) +
                (if (roleArn.asKnown().isPresent) 1 else 0) +
                (if (suffix.asKnown().isPresent) 1 else 0)

        /** AWS region where the queue is deployed */
        class Region @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val US_EAST_1 = of("us-east-1")

                @JvmField val US_EAST_2 = of("us-east-2")

                @JvmField val US_WEST_1 = of("us-west-1")

                @JvmField val US_WEST_2 = of("us-west-2")

                @JvmField val CA_CENTRAL_1 = of("ca-central-1")

                @JvmField val EU_WEST_1 = of("eu-west-1")

                @JvmField val EU_WEST_2 = of("eu-west-2")

                @JvmField val EU_WEST_3 = of("eu-west-3")

                @JvmField val EU_CENTRAL_1 = of("eu-central-1")

                @JvmField val EU_CENTRAL_2 = of("eu-central-2")

                @JvmField val EU_NORTH_1 = of("eu-north-1")

                @JvmField val EU_SOUTH_1 = of("eu-south-1")

                @JvmField val EU_SOUTH_2 = of("eu-south-2")

                @JvmField val AP_SOUTHEAST_1 = of("ap-southeast-1")

                @JvmField val AP_SOUTHEAST_2 = of("ap-southeast-2")

                @JvmField val AP_SOUTHEAST_3 = of("ap-southeast-3")

                @JvmField val AP_NORTHEAST_1 = of("ap-northeast-1")

                @JvmField val AP_NORTHEAST_2 = of("ap-northeast-2")

                @JvmField val AP_NORTHEAST_3 = of("ap-northeast-3")

                @JvmField val AP_SOUTH_1 = of("ap-south-1")

                @JvmField val AP_SOUTH_2 = of("ap-south-2")

                @JvmField val AP_EAST_1 = of("ap-east-1")

                @JvmField val SA_EAST_1 = of("sa-east-1")

                @JvmField val AF_SOUTH_1 = of("af-south-1")

                @JvmField val ME_SOUTH_1 = of("me-south-1")

                @JvmField val ME_CENTRAL_1 = of("me-central-1")

                @JvmField val IL_CENTRAL_1 = of("il-central-1")

                @JvmStatic fun of(value: String) = Region(JsonField.of(value))
            }

            /** An enum containing [Region]'s known values. */
            enum class Known {
                US_EAST_1,
                US_EAST_2,
                US_WEST_1,
                US_WEST_2,
                CA_CENTRAL_1,
                EU_WEST_1,
                EU_WEST_2,
                EU_WEST_3,
                EU_CENTRAL_1,
                EU_CENTRAL_2,
                EU_NORTH_1,
                EU_SOUTH_1,
                EU_SOUTH_2,
                AP_SOUTHEAST_1,
                AP_SOUTHEAST_2,
                AP_SOUTHEAST_3,
                AP_NORTHEAST_1,
                AP_NORTHEAST_2,
                AP_NORTHEAST_3,
                AP_SOUTH_1,
                AP_SOUTH_2,
                AP_EAST_1,
                SA_EAST_1,
                AF_SOUTH_1,
                ME_SOUTH_1,
                ME_CENTRAL_1,
                IL_CENTRAL_1,
            }

            /**
             * An enum containing [Region]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Region] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                US_EAST_1,
                US_EAST_2,
                US_WEST_1,
                US_WEST_2,
                CA_CENTRAL_1,
                EU_WEST_1,
                EU_WEST_2,
                EU_WEST_3,
                EU_CENTRAL_1,
                EU_CENTRAL_2,
                EU_NORTH_1,
                EU_SOUTH_1,
                EU_SOUTH_2,
                AP_SOUTHEAST_1,
                AP_SOUTHEAST_2,
                AP_SOUTHEAST_3,
                AP_NORTHEAST_1,
                AP_NORTHEAST_2,
                AP_NORTHEAST_3,
                AP_SOUTH_1,
                AP_SOUTH_2,
                AP_EAST_1,
                SA_EAST_1,
                AF_SOUTH_1,
                ME_SOUTH_1,
                ME_CENTRAL_1,
                IL_CENTRAL_1,
                /**
                 * An enum member indicating that [Region] was instantiated with an unknown value.
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
                    US_EAST_1 -> Value.US_EAST_1
                    US_EAST_2 -> Value.US_EAST_2
                    US_WEST_1 -> Value.US_WEST_1
                    US_WEST_2 -> Value.US_WEST_2
                    CA_CENTRAL_1 -> Value.CA_CENTRAL_1
                    EU_WEST_1 -> Value.EU_WEST_1
                    EU_WEST_2 -> Value.EU_WEST_2
                    EU_WEST_3 -> Value.EU_WEST_3
                    EU_CENTRAL_1 -> Value.EU_CENTRAL_1
                    EU_CENTRAL_2 -> Value.EU_CENTRAL_2
                    EU_NORTH_1 -> Value.EU_NORTH_1
                    EU_SOUTH_1 -> Value.EU_SOUTH_1
                    EU_SOUTH_2 -> Value.EU_SOUTH_2
                    AP_SOUTHEAST_1 -> Value.AP_SOUTHEAST_1
                    AP_SOUTHEAST_2 -> Value.AP_SOUTHEAST_2
                    AP_SOUTHEAST_3 -> Value.AP_SOUTHEAST_3
                    AP_NORTHEAST_1 -> Value.AP_NORTHEAST_1
                    AP_NORTHEAST_2 -> Value.AP_NORTHEAST_2
                    AP_NORTHEAST_3 -> Value.AP_NORTHEAST_3
                    AP_SOUTH_1 -> Value.AP_SOUTH_1
                    AP_SOUTH_2 -> Value.AP_SOUTH_2
                    AP_EAST_1 -> Value.AP_EAST_1
                    SA_EAST_1 -> Value.SA_EAST_1
                    AF_SOUTH_1 -> Value.AF_SOUTH_1
                    ME_SOUTH_1 -> Value.ME_SOUTH_1
                    ME_CENTRAL_1 -> Value.ME_CENTRAL_1
                    IL_CENTRAL_1 -> Value.IL_CENTRAL_1
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
                    US_EAST_1 -> Known.US_EAST_1
                    US_EAST_2 -> Known.US_EAST_2
                    US_WEST_1 -> Known.US_WEST_1
                    US_WEST_2 -> Known.US_WEST_2
                    CA_CENTRAL_1 -> Known.CA_CENTRAL_1
                    EU_WEST_1 -> Known.EU_WEST_1
                    EU_WEST_2 -> Known.EU_WEST_2
                    EU_WEST_3 -> Known.EU_WEST_3
                    EU_CENTRAL_1 -> Known.EU_CENTRAL_1
                    EU_CENTRAL_2 -> Known.EU_CENTRAL_2
                    EU_NORTH_1 -> Known.EU_NORTH_1
                    EU_SOUTH_1 -> Known.EU_SOUTH_1
                    EU_SOUTH_2 -> Known.EU_SOUTH_2
                    AP_SOUTHEAST_1 -> Known.AP_SOUTHEAST_1
                    AP_SOUTHEAST_2 -> Known.AP_SOUTHEAST_2
                    AP_SOUTHEAST_3 -> Known.AP_SOUTHEAST_3
                    AP_NORTHEAST_1 -> Known.AP_NORTHEAST_1
                    AP_NORTHEAST_2 -> Known.AP_NORTHEAST_2
                    AP_NORTHEAST_3 -> Known.AP_NORTHEAST_3
                    AP_SOUTH_1 -> Known.AP_SOUTH_1
                    AP_SOUTH_2 -> Known.AP_SOUTH_2
                    AP_EAST_1 -> Known.AP_EAST_1
                    SA_EAST_1 -> Known.SA_EAST_1
                    AF_SOUTH_1 -> Known.AF_SOUTH_1
                    ME_SOUTH_1 -> Known.ME_SOUTH_1
                    ME_CENTRAL_1 -> Known.ME_CENTRAL_1
                    IL_CENTRAL_1 -> Known.IL_CENTRAL_1
                    else -> throw StiggInvalidDataException("Unknown Region: $value")
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

            fun validate(): Region = apply {
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

                return other is Region && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Current provisioning status */
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

                @JvmField val PROVISIONING = of("PROVISIONING")

                @JvmField val ACTIVE = of("ACTIVE")

                @JvmField val FAILED = of("FAILED")

                @JvmField val DEPROVISIONING = of("DEPROVISIONING")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PROVISIONING,
                ACTIVE,
                FAILED,
                DEPROVISIONING,
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
                PROVISIONING,
                ACTIVE,
                FAILED,
                DEPROVISIONING,
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
                    PROVISIONING -> Value.PROVISIONING
                    ACTIVE -> Value.ACTIVE
                    FAILED -> Value.FAILED
                    DEPROVISIONING -> Value.DEPROVISIONING
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
                    PROVISIONING -> Known.PROVISIONING
                    ACTIVE -> Known.ACTIVE
                    FAILED -> Known.FAILED
                    DEPROVISIONING -> Known.DEPROVISIONING
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                createdAt == other.createdAt &&
                queueName == other.queueName &&
                region == other.region &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                queueUrl == other.queueUrl &&
                roleArn == other.roleArn &&
                suffix == other.suffix &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                createdAt,
                queueName,
                region,
                status,
                updatedAt,
                queueUrl,
                roleArn,
                suffix,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{createdAt=$createdAt, queueName=$queueName, region=$region, status=$status, updatedAt=$updatedAt, queueUrl=$queueUrl, roleArn=$roleArn, suffix=$suffix, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventQueueRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventQueueRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
