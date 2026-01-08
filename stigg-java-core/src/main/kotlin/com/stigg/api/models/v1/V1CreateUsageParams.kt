// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.stigg.api.core.Enum
import com.stigg.api.core.ExcludeMissing
import com.stigg.api.core.JsonField
import com.stigg.api.core.JsonMissing
import com.stigg.api.core.JsonValue
import com.stigg.api.core.Params
import com.stigg.api.core.checkKnown
import com.stigg.api.core.checkRequired
import com.stigg.api.core.http.Headers
import com.stigg.api.core.http.QueryParams
import com.stigg.api.core.toImmutable
import com.stigg.api.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new Usage */
class V1CreateUsageParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A list of usage reports to be submitted in bulk
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usages(): List<Usage> = body.usages()

    /**
     * Returns the raw JSON value of [usages].
     *
     * Unlike [usages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _usages(): JsonField<List<Usage>> = body._usages()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1CreateUsageParams].
         *
         * The following fields are required:
         * ```java
         * .usages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CreateUsageParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1CreateUsageParams: V1CreateUsageParams) = apply {
            body = v1CreateUsageParams.body.toBuilder()
            additionalHeaders = v1CreateUsageParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1CreateUsageParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [usages]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A list of usage reports to be submitted in bulk */
        fun usages(usages: List<Usage>) = apply { body.usages(usages) }

        /**
         * Sets [Builder.usages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usages] with a well-typed `List<Usage>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun usages(usages: JsonField<List<Usage>>) = apply { body.usages(usages) }

        /**
         * Adds a single [Usage] to [usages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUsage(usage: Usage) = apply { body.addUsage(usage) }

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
         * Returns an immutable instance of [V1CreateUsageParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .usages()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1CreateUsageParams =
            V1CreateUsageParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val usages: JsonField<List<Usage>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("usages")
            @ExcludeMissing
            usages: JsonField<List<Usage>> = JsonMissing.of()
        ) : this(usages, mutableMapOf())

        /**
         * A list of usage reports to be submitted in bulk
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun usages(): List<Usage> = usages.getRequired("usages")

        /**
         * Returns the raw JSON value of [usages].
         *
         * Unlike [usages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usages") @ExcludeMissing fun _usages(): JsonField<List<Usage>> = usages

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
             * .usages()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var usages: JsonField<MutableList<Usage>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                usages = body.usages.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A list of usage reports to be submitted in bulk */
            fun usages(usages: List<Usage>) = usages(JsonField.of(usages))

            /**
             * Sets [Builder.usages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usages] with a well-typed `List<Usage>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun usages(usages: JsonField<List<Usage>>) = apply {
                this.usages = usages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Usage] to [usages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUsage(usage: Usage) = apply {
                usages =
                    (usages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("usages", it).add(usage)
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
             * .usages()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("usages", usages).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            usages().forEach { it.validate() }
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
            (usages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                usages == other.usages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(usages, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{usages=$usages, additionalProperties=$additionalProperties}"
    }

    class Usage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerId: JsonField<String>,
        private val featureId: JsonField<String>,
        private val value: JsonField<Long>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val dimensions: JsonField<Dimensions>,
        private val resourceId: JsonField<String>,
        private val updateBehavior: JsonField<UpdateBehavior>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customerId")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("featureId")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<Dimensions> = JsonMissing.of(),
            @JsonProperty("resourceId")
            @ExcludeMissing
            resourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updateBehavior")
            @ExcludeMissing
            updateBehavior: JsonField<UpdateBehavior> = JsonMissing.of(),
        ) : this(
            customerId,
            featureId,
            value,
            createdAt,
            dimensions,
            resourceId,
            updateBehavior,
            mutableMapOf(),
        )

        /**
         * Customer id
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customerId")

        /**
         * Feature id
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun featureId(): String = featureId.getRequired("featureId")

        /**
         * The value to report for usage
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Long = value.getRequired("value")

        /**
         * Timestamp of when the record was created
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Additional dimensions for the usage report
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dimensions(): Optional<Dimensions> = dimensions.getOptional("dimensions")

        /**
         * Resource id
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resourceId(): Optional<String> = resourceId.getOptional("resourceId")

        /**
         * The method by which the usage value should be updated
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updateBehavior(): Optional<UpdateBehavior> =
            updateBehavior.getOptional("updateBehavior")

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [featureId].
         *
         * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<Dimensions> = dimensions

        /**
         * Returns the raw JSON value of [resourceId].
         *
         * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resourceId")
        @ExcludeMissing
        fun _resourceId(): JsonField<String> = resourceId

        /**
         * Returns the raw JSON value of [updateBehavior].
         *
         * Unlike [updateBehavior], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("updateBehavior")
        @ExcludeMissing
        fun _updateBehavior(): JsonField<UpdateBehavior> = updateBehavior

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
             * Returns a mutable builder for constructing an instance of [Usage].
             *
             * The following fields are required:
             * ```java
             * .customerId()
             * .featureId()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var featureId: JsonField<String>? = null
            private var value: JsonField<Long>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dimensions: JsonField<Dimensions> = JsonMissing.of()
            private var resourceId: JsonField<String> = JsonMissing.of()
            private var updateBehavior: JsonField<UpdateBehavior> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                customerId = usage.customerId
                featureId = usage.featureId
                value = usage.value
                createdAt = usage.createdAt
                dimensions = usage.dimensions
                resourceId = usage.resourceId
                updateBehavior = usage.updateBehavior
                additionalProperties = usage.additionalProperties.toMutableMap()
            }

            /** Customer id */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Feature id */
            fun featureId(featureId: String) = featureId(JsonField.of(featureId))

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

            /** The value to report for usage */
            fun value(value: Long) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun value(value: JsonField<Long>) = apply { this.value = value }

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

            /** Additional dimensions for the usage report */
            fun dimensions(dimensions: Dimensions) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed [Dimensions] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<Dimensions>) = apply {
                this.dimensions = dimensions
            }

            /** Resource id */
            fun resourceId(resourceId: String?) = resourceId(JsonField.ofNullable(resourceId))

            /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
            fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

            /**
             * Sets [Builder.resourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resourceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

            /** The method by which the usage value should be updated */
            fun updateBehavior(updateBehavior: UpdateBehavior) =
                updateBehavior(JsonField.of(updateBehavior))

            /**
             * Sets [Builder.updateBehavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updateBehavior] with a well-typed [UpdateBehavior]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun updateBehavior(updateBehavior: JsonField<UpdateBehavior>) = apply {
                this.updateBehavior = updateBehavior
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
             * Returns an immutable instance of [Usage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .customerId()
             * .featureId()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Usage =
                Usage(
                    checkRequired("customerId", customerId),
                    checkRequired("featureId", featureId),
                    checkRequired("value", value),
                    createdAt,
                    dimensions,
                    resourceId,
                    updateBehavior,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Usage = apply {
            if (validated) {
                return@apply
            }

            customerId()
            featureId()
            value()
            createdAt()
            dimensions().ifPresent { it.validate() }
            resourceId()
            updateBehavior().ifPresent { it.validate() }
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
            (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (featureId.asKnown().isPresent) 1 else 0) +
                (if (value.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (dimensions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (resourceId.asKnown().isPresent) 1 else 0) +
                (updateBehavior.asKnown().getOrNull()?.validity() ?: 0)

        /** Additional dimensions for the usage report */
        class Dimensions
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

                /** Returns a mutable builder for constructing an instance of [Dimensions]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Dimensions]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dimensions: Dimensions) = apply {
                    additionalProperties = dimensions.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Dimensions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Dimensions = Dimensions(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Dimensions = apply {
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

                return other is Dimensions && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Dimensions{additionalProperties=$additionalProperties}"
        }

        /** The method by which the usage value should be updated */
        class UpdateBehavior
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DELTA = of("DELTA")

                @JvmField val SET = of("SET")

                @JvmStatic fun of(value: String) = UpdateBehavior(JsonField.of(value))
            }

            /** An enum containing [UpdateBehavior]'s known values. */
            enum class Known {
                DELTA,
                SET,
            }

            /**
             * An enum containing [UpdateBehavior]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [UpdateBehavior] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DELTA,
                SET,
                /**
                 * An enum member indicating that [UpdateBehavior] was instantiated with an unknown
                 * value.
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
                    DELTA -> Value.DELTA
                    SET -> Value.SET
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
                    DELTA -> Known.DELTA
                    SET -> Known.SET
                    else -> throw StiggInvalidDataException("Unknown UpdateBehavior: $value")
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

            fun validate(): UpdateBehavior = apply {
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

                return other is UpdateBehavior && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Usage &&
                customerId == other.customerId &&
                featureId == other.featureId &&
                value == other.value &&
                createdAt == other.createdAt &&
                dimensions == other.dimensions &&
                resourceId == other.resourceId &&
                updateBehavior == other.updateBehavior &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customerId,
                featureId,
                value,
                createdAt,
                dimensions,
                resourceId,
                updateBehavior,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Usage{customerId=$customerId, featureId=$featureId, value=$value, createdAt=$createdAt, dimensions=$dimensions, resourceId=$resourceId, updateBehavior=$updateBehavior, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1CreateUsageParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1CreateUsageParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
