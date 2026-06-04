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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response object */
class DataExportTriggerSyncResponse
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
     * Per-destination trigger results across the batch.
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
         * [DataExportTriggerSyncResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportTriggerSyncResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataExportTriggerSyncResponse: DataExportTriggerSyncResponse) = apply {
            data = dataExportTriggerSyncResponse.data
            additionalProperties = dataExportTriggerSyncResponse.additionalProperties.toMutableMap()
        }

        /** Per-destination trigger results across the batch. */
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
         * Returns an immutable instance of [DataExportTriggerSyncResponse].
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
        fun build(): DataExportTriggerSyncResponse =
            DataExportTriggerSyncResponse(
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
    fun validate(): DataExportTriggerSyncResponse = apply {
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

    /** Per-destination trigger results across the batch. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val results: JsonField<List<Result>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("results")
            @ExcludeMissing
            results: JsonField<List<Result>> = JsonMissing.of()
        ) : this(results, mutableMapOf())

        /**
         * Per-destination trigger results
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun results(): List<Result> = results.getRequired("results")

        /**
         * Returns the raw JSON value of [results].
         *
         * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

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
             * .results()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var results: JsonField<MutableList<Result>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                results = data.results.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Per-destination trigger results */
            fun results(results: List<Result>) = results(JsonField.of(results))

            /**
             * Sets [Builder.results] to an arbitrary JSON value.
             *
             * You should usually call [Builder.results] with a well-typed `List<Result>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun results(results: JsonField<List<Result>>) = apply {
                this.results = results.map { it.toMutableList() }
            }

            /**
             * Adds a single [Result] to [results].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResult(result: Result) = apply {
                results =
                    (results ?: JsonField.of(mutableListOf())).also {
                        checkKnown("results", it).add(result)
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
             * .results()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("results", results).map { it.toImmutable() },
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

            results().forEach { it.validate() }
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
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** Per-destination trigger results. */
        class Result
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val destinationId: JsonField<String>,
            private val triggered: JsonField<Boolean>,
            private val errorMessage: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("destinationId")
                @ExcludeMissing
                destinationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("triggered")
                @ExcludeMissing
                triggered: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("errorMessage")
                @ExcludeMissing
                errorMessage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transferId")
                @ExcludeMissing
                transferId: JsonField<String> = JsonMissing.of(),
            ) : this(destinationId, triggered, errorMessage, transferId, mutableMapOf())

            /**
             * Provider destination ID
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun destinationId(): String = destinationId.getRequired("destinationId")

            /**
             * True if a transfer was kicked
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun triggered(): Boolean = triggered.getRequired("triggered")

            /**
             * Error message if triggered=false on a hard failure
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun errorMessage(): Optional<String> = errorMessage.getOptional("errorMessage")

            /**
             * Provider-side transfer ID
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transferId(): Optional<String> = transferId.getOptional("transferId")

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
             * Returns the raw JSON value of [triggered].
             *
             * Unlike [triggered], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("triggered")
            @ExcludeMissing
            fun _triggered(): JsonField<Boolean> = triggered

            /**
             * Returns the raw JSON value of [errorMessage].
             *
             * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("errorMessage")
            @ExcludeMissing
            fun _errorMessage(): JsonField<String> = errorMessage

            /**
             * Returns the raw JSON value of [transferId].
             *
             * Unlike [transferId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transferId")
            @ExcludeMissing
            fun _transferId(): JsonField<String> = transferId

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
                 * Returns a mutable builder for constructing an instance of [Result].
                 *
                 * The following fields are required:
                 * ```java
                 * .destinationId()
                 * .triggered()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Result]. */
            class Builder internal constructor() {

                private var destinationId: JsonField<String>? = null
                private var triggered: JsonField<Boolean>? = null
                private var errorMessage: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(result: Result) = apply {
                    destinationId = result.destinationId
                    triggered = result.triggered
                    errorMessage = result.errorMessage
                    transferId = result.transferId
                    additionalProperties = result.additionalProperties.toMutableMap()
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

                /** True if a transfer was kicked */
                fun triggered(triggered: Boolean) = triggered(JsonField.of(triggered))

                /**
                 * Sets [Builder.triggered] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.triggered] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun triggered(triggered: JsonField<Boolean>) = apply { this.triggered = triggered }

                /** Error message if triggered=false on a hard failure */
                fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

                /**
                 * Sets [Builder.errorMessage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorMessage] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorMessage(errorMessage: JsonField<String>) = apply {
                    this.errorMessage = errorMessage
                }

                /** Provider-side transfer ID */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /**
                 * Sets [Builder.transferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transferId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
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
                 * Returns an immutable instance of [Result].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .destinationId()
                 * .triggered()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Result =
                    Result(
                        checkRequired("destinationId", destinationId),
                        checkRequired("triggered", triggered),
                        errorMessage,
                        transferId,
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
            fun validate(): Result = apply {
                if (validated) {
                    return@apply
                }

                destinationId()
                triggered()
                errorMessage()
                transferId()
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
                (if (destinationId.asKnown().isPresent) 1 else 0) +
                    (if (triggered.asKnown().isPresent) 1 else 0) +
                    (if (errorMessage.asKnown().isPresent) 1 else 0) +
                    (if (transferId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result &&
                    destinationId == other.destinationId &&
                    triggered == other.triggered &&
                    errorMessage == other.errorMessage &&
                    transferId == other.transferId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    destinationId,
                    triggered,
                    errorMessage,
                    transferId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Result{destinationId=$destinationId, triggered=$triggered, errorMessage=$errorMessage, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                results == other.results &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(results, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{results=$results, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataExportTriggerSyncResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataExportTriggerSyncResponse{data=$data, additionalProperties=$additionalProperties}"
}
