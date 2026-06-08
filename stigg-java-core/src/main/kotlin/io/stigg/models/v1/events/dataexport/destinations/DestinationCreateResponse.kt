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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response object */
class DestinationCreateResponse
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
         * Returns a mutable builder for constructing an instance of [DestinationCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DestinationCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(destinationCreateResponse: DestinationCreateResponse) = apply {
            data = destinationCreateResponse.data
            additionalProperties = destinationCreateResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [DestinationCreateResponse].
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
        fun build(): DestinationCreateResponse =
            DestinationCreateResponse(
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
    fun validate(): DestinationCreateResponse = apply {
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
            private val connectionStatus: JsonField<String>,
            private val lastSyncStatus: JsonField<LastSyncStatus>,
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
                @JsonProperty("connectionStatus")
                @ExcludeMissing
                connectionStatus: JsonField<String> = JsonMissing.of(),
                @JsonProperty("lastSyncStatus")
                @ExcludeMissing
                lastSyncStatus: JsonField<LastSyncStatus> = JsonMissing.of(),
            ) : this(
                connectedAt,
                destinationId,
                type,
                connectionStatus,
                lastSyncStatus,
                mutableMapOf(),
            )

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
             * Connection status of the destination (connected, failed)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun connectionStatus(): Optional<String> =
                connectionStatus.getOptional("connectionStatus")

            /**
             * Latest sync snapshot for the destination, refreshed by the provider webhook
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lastSyncStatus(): Optional<LastSyncStatus> =
                lastSyncStatus.getOptional("lastSyncStatus")

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

            /**
             * Returns the raw JSON value of [connectionStatus].
             *
             * Unlike [connectionStatus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("connectionStatus")
            @ExcludeMissing
            fun _connectionStatus(): JsonField<String> = connectionStatus

            /**
             * Returns the raw JSON value of [lastSyncStatus].
             *
             * Unlike [lastSyncStatus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("lastSyncStatus")
            @ExcludeMissing
            fun _lastSyncStatus(): JsonField<LastSyncStatus> = lastSyncStatus

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
                private var connectionStatus: JsonField<String> = JsonMissing.of()
                private var lastSyncStatus: JsonField<LastSyncStatus> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(destination: Destination) = apply {
                    connectedAt = destination.connectedAt
                    destinationId = destination.destinationId
                    type = destination.type
                    connectionStatus = destination.connectionStatus
                    lastSyncStatus = destination.lastSyncStatus
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

                /** Connection status of the destination (connected, failed) */
                fun connectionStatus(connectionStatus: String) =
                    connectionStatus(JsonField.of(connectionStatus))

                /**
                 * Sets [Builder.connectionStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.connectionStatus] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun connectionStatus(connectionStatus: JsonField<String>) = apply {
                    this.connectionStatus = connectionStatus
                }

                /** Latest sync snapshot for the destination, refreshed by the provider webhook */
                fun lastSyncStatus(lastSyncStatus: LastSyncStatus) =
                    lastSyncStatus(JsonField.of(lastSyncStatus))

                /**
                 * Sets [Builder.lastSyncStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastSyncStatus] with a well-typed
                 * [LastSyncStatus] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun lastSyncStatus(lastSyncStatus: JsonField<LastSyncStatus>) = apply {
                    this.lastSyncStatus = lastSyncStatus
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
                        connectionStatus,
                        lastSyncStatus,
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
                connectionStatus()
                lastSyncStatus().ifPresent { it.validate() }
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
                    (if (type.asKnown().isPresent) 1 else 0) +
                    (if (connectionStatus.asKnown().isPresent) 1 else 0) +
                    (lastSyncStatus.asKnown().getOrNull()?.validity() ?: 0)

            /** Latest sync snapshot for the destination, refreshed by the provider webhook */
            class LastSyncStatus
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val finishedAt: JsonField<String>,
                private val status: JsonField<String>,
                private val transferId: JsonField<String>,
                private val blamedParty: JsonField<String>,
                private val failureMessage: JsonField<String>,
                private val rowsTransferred: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("finishedAt")
                    @ExcludeMissing
                    finishedAt: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("transferId")
                    @ExcludeMissing
                    transferId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("blamedParty")
                    @ExcludeMissing
                    blamedParty: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("failureMessage")
                    @ExcludeMissing
                    failureMessage: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("rowsTransferred")
                    @ExcludeMissing
                    rowsTransferred: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    finishedAt,
                    status,
                    transferId,
                    blamedParty,
                    failureMessage,
                    rowsTransferred,
                    mutableMapOf(),
                )

                /**
                 * ISO8601 timestamp of when the latest sync finished
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun finishedAt(): String = finishedAt.getRequired("finishedAt")

                /**
                 * Sync status (PENDING, RUNNING, INCOMPLETE, FAILED, SUCCEEDED, CANCELLED)
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun status(): String = status.getRequired("status")

                /**
                 * Provider transfer ID of the latest sync
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun transferId(): String = transferId.getRequired("transferId")

                /**
                 * Party responsible for a failed sync, as reported by the data-export provider
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun blamedParty(): Optional<String> = blamedParty.getOptional("blamedParty")

                /**
                 * Customer-friendly failure message, when the latest sync failed
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun failureMessage(): Optional<String> =
                    failureMessage.getOptional("failureMessage")

                /**
                 * Number of rows transferred in the latest sync
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun rowsTransferred(): Optional<Double> =
                    rowsTransferred.getOptional("rowsTransferred")

                /**
                 * Returns the raw JSON value of [finishedAt].
                 *
                 * Unlike [finishedAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("finishedAt")
                @ExcludeMissing
                fun _finishedAt(): JsonField<String> = finishedAt

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                /**
                 * Returns the raw JSON value of [transferId].
                 *
                 * Unlike [transferId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("transferId")
                @ExcludeMissing
                fun _transferId(): JsonField<String> = transferId

                /**
                 * Returns the raw JSON value of [blamedParty].
                 *
                 * Unlike [blamedParty], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("blamedParty")
                @ExcludeMissing
                fun _blamedParty(): JsonField<String> = blamedParty

                /**
                 * Returns the raw JSON value of [failureMessage].
                 *
                 * Unlike [failureMessage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("failureMessage")
                @ExcludeMissing
                fun _failureMessage(): JsonField<String> = failureMessage

                /**
                 * Returns the raw JSON value of [rowsTransferred].
                 *
                 * Unlike [rowsTransferred], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("rowsTransferred")
                @ExcludeMissing
                fun _rowsTransferred(): JsonField<Double> = rowsTransferred

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
                     * Returns a mutable builder for constructing an instance of [LastSyncStatus].
                     *
                     * The following fields are required:
                     * ```java
                     * .finishedAt()
                     * .status()
                     * .transferId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [LastSyncStatus]. */
                class Builder internal constructor() {

                    private var finishedAt: JsonField<String>? = null
                    private var status: JsonField<String>? = null
                    private var transferId: JsonField<String>? = null
                    private var blamedParty: JsonField<String> = JsonMissing.of()
                    private var failureMessage: JsonField<String> = JsonMissing.of()
                    private var rowsTransferred: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(lastSyncStatus: LastSyncStatus) = apply {
                        finishedAt = lastSyncStatus.finishedAt
                        status = lastSyncStatus.status
                        transferId = lastSyncStatus.transferId
                        blamedParty = lastSyncStatus.blamedParty
                        failureMessage = lastSyncStatus.failureMessage
                        rowsTransferred = lastSyncStatus.rowsTransferred
                        additionalProperties = lastSyncStatus.additionalProperties.toMutableMap()
                    }

                    /** ISO8601 timestamp of when the latest sync finished */
                    fun finishedAt(finishedAt: String) = finishedAt(JsonField.of(finishedAt))

                    /**
                     * Sets [Builder.finishedAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.finishedAt] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun finishedAt(finishedAt: JsonField<String>) = apply {
                        this.finishedAt = finishedAt
                    }

                    /** Sync status (PENDING, RUNNING, INCOMPLETE, FAILED, SUCCEEDED, CANCELLED) */
                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    /** Provider transfer ID of the latest sync */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /**
                     * Sets [Builder.transferId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.transferId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun transferId(transferId: JsonField<String>) = apply {
                        this.transferId = transferId
                    }

                    /**
                     * Party responsible for a failed sync, as reported by the data-export provider
                     */
                    fun blamedParty(blamedParty: String) = blamedParty(JsonField.of(blamedParty))

                    /**
                     * Sets [Builder.blamedParty] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.blamedParty] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun blamedParty(blamedParty: JsonField<String>) = apply {
                        this.blamedParty = blamedParty
                    }

                    /** Customer-friendly failure message, when the latest sync failed */
                    fun failureMessage(failureMessage: String) =
                        failureMessage(JsonField.of(failureMessage))

                    /**
                     * Sets [Builder.failureMessage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.failureMessage] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun failureMessage(failureMessage: JsonField<String>) = apply {
                        this.failureMessage = failureMessage
                    }

                    /** Number of rows transferred in the latest sync */
                    fun rowsTransferred(rowsTransferred: Double) =
                        rowsTransferred(JsonField.of(rowsTransferred))

                    /**
                     * Sets [Builder.rowsTransferred] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rowsTransferred] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun rowsTransferred(rowsTransferred: JsonField<Double>) = apply {
                        this.rowsTransferred = rowsTransferred
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
                     * Returns an immutable instance of [LastSyncStatus].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .finishedAt()
                     * .status()
                     * .transferId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): LastSyncStatus =
                        LastSyncStatus(
                            checkRequired("finishedAt", finishedAt),
                            checkRequired("status", status),
                            checkRequired("transferId", transferId),
                            blamedParty,
                            failureMessage,
                            rowsTransferred,
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
                fun validate(): LastSyncStatus = apply {
                    if (validated) {
                        return@apply
                    }

                    finishedAt()
                    status()
                    transferId()
                    blamedParty()
                    failureMessage()
                    rowsTransferred()
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
                    (if (finishedAt.asKnown().isPresent) 1 else 0) +
                        (if (status.asKnown().isPresent) 1 else 0) +
                        (if (transferId.asKnown().isPresent) 1 else 0) +
                        (if (blamedParty.asKnown().isPresent) 1 else 0) +
                        (if (failureMessage.asKnown().isPresent) 1 else 0) +
                        (if (rowsTransferred.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LastSyncStatus &&
                        finishedAt == other.finishedAt &&
                        status == other.status &&
                        transferId == other.transferId &&
                        blamedParty == other.blamedParty &&
                        failureMessage == other.failureMessage &&
                        rowsTransferred == other.rowsTransferred &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        finishedAt,
                        status,
                        transferId,
                        blamedParty,
                        failureMessage,
                        rowsTransferred,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LastSyncStatus{finishedAt=$finishedAt, status=$status, transferId=$transferId, blamedParty=$blamedParty, failureMessage=$failureMessage, rowsTransferred=$rowsTransferred, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Destination &&
                    connectedAt == other.connectedAt &&
                    destinationId == other.destinationId &&
                    type == other.type &&
                    connectionStatus == other.connectionStatus &&
                    lastSyncStatus == other.lastSyncStatus &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    connectedAt,
                    destinationId,
                    type,
                    connectionStatus,
                    lastSyncStatus,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Destination{connectedAt=$connectedAt, destinationId=$destinationId, type=$type, connectionStatus=$connectionStatus, lastSyncStatus=$lastSyncStatus, additionalProperties=$additionalProperties}"
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

        return other is DestinationCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DestinationCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
