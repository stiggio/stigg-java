// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions.usage

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.stigg.core.ExcludeMissing
import io.stigg.core.JsonField
import io.stigg.core.JsonMissing
import io.stigg.core.JsonValue
import io.stigg.core.Params
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Immediately charges usage for a subscription via the billing integration. Calculates usage since
 * the last charge and creates an invoice.
 */
class UsageChargeUsageParams
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
     * Cutoff date for usage calculation. If not provided, the current time is used.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun untilDate(): Optional<OffsetDateTime> = body.untilDate()

    /**
     * Returns the raw JSON value of [untilDate].
     *
     * Unlike [untilDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _untilDate(): JsonField<OffsetDateTime> = body._untilDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UsageChargeUsageParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [UsageChargeUsageParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageChargeUsageParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var xAccountId: String? = null
        private var xEnvironmentId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageChargeUsageParams: UsageChargeUsageParams) = apply {
            id = usageChargeUsageParams.id
            xAccountId = usageChargeUsageParams.xAccountId
            xEnvironmentId = usageChargeUsageParams.xEnvironmentId
            body = usageChargeUsageParams.body.toBuilder()
            additionalHeaders = usageChargeUsageParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageChargeUsageParams.additionalQueryParams.toBuilder()
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
         * - [untilDate]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Cutoff date for usage calculation. If not provided, the current time is used. */
        fun untilDate(untilDate: OffsetDateTime) = apply { body.untilDate(untilDate) }

        /**
         * Sets [Builder.untilDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.untilDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun untilDate(untilDate: JsonField<OffsetDateTime>) = apply { body.untilDate(untilDate) }

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
         * Returns an immutable instance of [UsageChargeUsageParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UsageChargeUsageParams =
            UsageChargeUsageParams(
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

    /** Request to immediately charge usage for a subscription. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val untilDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("untilDate")
            @ExcludeMissing
            untilDate: JsonField<OffsetDateTime> = JsonMissing.of()
        ) : this(untilDate, mutableMapOf())

        /**
         * Cutoff date for usage calculation. If not provided, the current time is used.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun untilDate(): Optional<OffsetDateTime> = untilDate.getOptional("untilDate")

        /**
         * Returns the raw JSON value of [untilDate].
         *
         * Unlike [untilDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("untilDate")
        @ExcludeMissing
        fun _untilDate(): JsonField<OffsetDateTime> = untilDate

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var untilDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                untilDate = body.untilDate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Cutoff date for usage calculation. If not provided, the current time is used. */
            fun untilDate(untilDate: OffsetDateTime) = untilDate(JsonField.of(untilDate))

            /**
             * Sets [Builder.untilDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.untilDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun untilDate(untilDate: JsonField<OffsetDateTime>) = apply {
                this.untilDate = untilDate
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
             */
            fun build(): Body = Body(untilDate, additionalProperties.toMutableMap())
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

            untilDate()
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
        @JvmSynthetic internal fun validity(): Int = (if (untilDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                untilDate == other.untilDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(untilDate, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{untilDate=$untilDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageChargeUsageParams &&
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
        "UsageChargeUsageParams{id=$id, xAccountId=$xAccountId, xEnvironmentId=$xEnvironmentId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
