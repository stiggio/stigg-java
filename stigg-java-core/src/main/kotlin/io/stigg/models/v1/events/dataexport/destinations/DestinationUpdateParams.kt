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
 * Update a destination's entity selection. Pushes the new enabled_models to the provider first,
 * then persists the selection. Applies on the next scheduled transfer.
 */
class DestinationUpdateParams
private constructor(
    private val destinationId: String?,
    private val xAccountId: String?,
    private val xEnvironmentId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun destinationId(): Optional<String> = Optional.ofNullable(destinationId)

    fun xAccountId(): Optional<String> = Optional.ofNullable(xAccountId)

    fun xEnvironmentId(): Optional<String> = Optional.ofNullable(xEnvironmentId)

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enabledModels(): List<String> = body.enabledModels()

    /**
     * Target integration row hosting the destination
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun integrationId(): String = body.integrationId()

    /**
     * Returns the raw JSON value of [enabledModels].
     *
     * Unlike [enabledModels], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enabledModels(): JsonField<List<String>> = body._enabledModels()

    /**
     * Returns the raw JSON value of [integrationId].
     *
     * Unlike [integrationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _integrationId(): JsonField<String> = body._integrationId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DestinationUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .enabledModels()
         * .integrationId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DestinationUpdateParams]. */
    class Builder internal constructor() {

        private var destinationId: String? = null
        private var xAccountId: String? = null
        private var xEnvironmentId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(destinationUpdateParams: DestinationUpdateParams) = apply {
            destinationId = destinationUpdateParams.destinationId
            xAccountId = destinationUpdateParams.xAccountId
            xEnvironmentId = destinationUpdateParams.xEnvironmentId
            body = destinationUpdateParams.body.toBuilder()
            additionalHeaders = destinationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = destinationUpdateParams.additionalQueryParams.toBuilder()
        }

        fun destinationId(destinationId: String?) = apply { this.destinationId = destinationId }

        /** Alias for calling [Builder.destinationId] with `destinationId.orElse(null)`. */
        fun destinationId(destinationId: Optional<String>) =
            destinationId(destinationId.getOrNull())

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
         * - [enabledModels]
         * - [integrationId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun enabledModels(enabledModels: List<String>) = apply { body.enabledModels(enabledModels) }

        /**
         * Sets [Builder.enabledModels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabledModels] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enabledModels(enabledModels: JsonField<List<String>>) = apply {
            body.enabledModels(enabledModels)
        }

        /**
         * Adds a single [String] to [enabledModels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnabledModel(enabledModel: String) = apply { body.addEnabledModel(enabledModel) }

        /** Target integration row hosting the destination */
        fun integrationId(integrationId: String) = apply { body.integrationId(integrationId) }

        /**
         * Sets [Builder.integrationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun integrationId(integrationId: JsonField<String>) = apply {
            body.integrationId(integrationId)
        }

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
         * Returns an immutable instance of [DestinationUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .enabledModels()
         * .integrationId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DestinationUpdateParams =
            DestinationUpdateParams(
                destinationId,
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
            0 -> destinationId ?: ""
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

    /** Update a destination's entity selection and push it to the provider. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val enabledModels: JsonField<List<String>>,
        private val integrationId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("enabledModels")
            @ExcludeMissing
            enabledModels: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("integrationId")
            @ExcludeMissing
            integrationId: JsonField<String> = JsonMissing.of(),
        ) : this(enabledModels, integrationId, mutableMapOf())

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun enabledModels(): List<String> = enabledModels.getRequired("enabledModels")

        /**
         * Target integration row hosting the destination
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun integrationId(): String = integrationId.getRequired("integrationId")

        /**
         * Returns the raw JSON value of [enabledModels].
         *
         * Unlike [enabledModels], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enabledModels")
        @ExcludeMissing
        fun _enabledModels(): JsonField<List<String>> = enabledModels

        /**
         * Returns the raw JSON value of [integrationId].
         *
         * Unlike [integrationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integrationId")
        @ExcludeMissing
        fun _integrationId(): JsonField<String> = integrationId

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
             * .enabledModels()
             * .integrationId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var enabledModels: JsonField<MutableList<String>>? = null
            private var integrationId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                enabledModels = body.enabledModels.map { it.toMutableList() }
                integrationId = body.integrationId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun enabledModels(enabledModels: List<String>) =
                enabledModels(JsonField.of(enabledModels))

            /**
             * Sets [Builder.enabledModels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabledModels] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun enabledModels(enabledModels: JsonField<List<String>>) = apply {
                this.enabledModels = enabledModels.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [enabledModels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEnabledModel(enabledModel: String) = apply {
                enabledModels =
                    (enabledModels ?: JsonField.of(mutableListOf())).also {
                        checkKnown("enabledModels", it).add(enabledModel)
                    }
            }

            /** Target integration row hosting the destination */
            fun integrationId(integrationId: String) = integrationId(JsonField.of(integrationId))

            /**
             * Sets [Builder.integrationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun integrationId(integrationId: JsonField<String>) = apply {
                this.integrationId = integrationId
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
             * .enabledModels()
             * .integrationId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("enabledModels", enabledModels).map { it.toImmutable() },
                    checkRequired("integrationId", integrationId),
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

            enabledModels()
            integrationId()
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
            (enabledModels.asKnown().getOrNull()?.size ?: 0) +
                (if (integrationId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                enabledModels == other.enabledModels &&
                integrationId == other.integrationId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(enabledModels, integrationId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{enabledModels=$enabledModels, integrationId=$integrationId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DestinationUpdateParams &&
            destinationId == other.destinationId &&
            xAccountId == other.xAccountId &&
            xEnvironmentId == other.xEnvironmentId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            destinationId,
            xAccountId,
            xEnvironmentId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DestinationUpdateParams{destinationId=$destinationId, xAccountId=$xAccountId, xEnvironmentId=$xEnvironmentId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
