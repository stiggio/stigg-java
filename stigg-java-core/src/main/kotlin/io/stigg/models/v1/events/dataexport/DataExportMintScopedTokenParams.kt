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
import io.stigg.core.Params
import io.stigg.core.checkRequired
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.errors.StiggInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Mint a scoped JWT for the FE embedded SDK. Lazy-creates the DATA_EXPORT integration if needed.
 */
class DataExportMintScopedTokenParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * FE origin the resulting JWT is bound to (provider-side anti-fraud)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun applicationOrigin(): String = body.applicationOrigin()

    /**
     * Pin the token to a specific warehouse connect flow
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destinationType(): Optional<String> = body.destinationType()

    /**
     * Returns the raw JSON value of [applicationOrigin].
     *
     * Unlike [applicationOrigin], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _applicationOrigin(): JsonField<String> = body._applicationOrigin()

    /**
     * Returns the raw JSON value of [destinationType].
     *
     * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _destinationType(): JsonField<String> = body._destinationType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DataExportMintScopedTokenParams].
         *
         * The following fields are required:
         * ```java
         * .applicationOrigin()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportMintScopedTokenParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dataExportMintScopedTokenParams: DataExportMintScopedTokenParams) =
            apply {
                body = dataExportMintScopedTokenParams.body.toBuilder()
                additionalHeaders = dataExportMintScopedTokenParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    dataExportMintScopedTokenParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [applicationOrigin]
         * - [destinationType]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** FE origin the resulting JWT is bound to (provider-side anti-fraud) */
        fun applicationOrigin(applicationOrigin: String) = apply {
            body.applicationOrigin(applicationOrigin)
        }

        /**
         * Sets [Builder.applicationOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationOrigin] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun applicationOrigin(applicationOrigin: JsonField<String>) = apply {
            body.applicationOrigin(applicationOrigin)
        }

        /** Pin the token to a specific warehouse connect flow */
        fun destinationType(destinationType: String) = apply {
            body.destinationType(destinationType)
        }

        /**
         * Sets [Builder.destinationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun destinationType(destinationType: JsonField<String>) = apply {
            body.destinationType(destinationType)
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
         * Returns an immutable instance of [DataExportMintScopedTokenParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .applicationOrigin()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataExportMintScopedTokenParams =
            DataExportMintScopedTokenParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Mint a scoped JWT for the FE embedded SDK. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val applicationOrigin: JsonField<String>,
        private val destinationType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("applicationOrigin")
            @ExcludeMissing
            applicationOrigin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destinationType")
            @ExcludeMissing
            destinationType: JsonField<String> = JsonMissing.of(),
        ) : this(applicationOrigin, destinationType, mutableMapOf())

        /**
         * FE origin the resulting JWT is bound to (provider-side anti-fraud)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun applicationOrigin(): String = applicationOrigin.getRequired("applicationOrigin")

        /**
         * Pin the token to a specific warehouse connect flow
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun destinationType(): Optional<String> = destinationType.getOptional("destinationType")

        /**
         * Returns the raw JSON value of [applicationOrigin].
         *
         * Unlike [applicationOrigin], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applicationOrigin")
        @ExcludeMissing
        fun _applicationOrigin(): JsonField<String> = applicationOrigin

        /**
         * Returns the raw JSON value of [destinationType].
         *
         * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destinationType")
        @ExcludeMissing
        fun _destinationType(): JsonField<String> = destinationType

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
             * .applicationOrigin()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var applicationOrigin: JsonField<String>? = null
            private var destinationType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                applicationOrigin = body.applicationOrigin
                destinationType = body.destinationType
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** FE origin the resulting JWT is bound to (provider-side anti-fraud) */
            fun applicationOrigin(applicationOrigin: String) =
                applicationOrigin(JsonField.of(applicationOrigin))

            /**
             * Sets [Builder.applicationOrigin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicationOrigin] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applicationOrigin(applicationOrigin: JsonField<String>) = apply {
                this.applicationOrigin = applicationOrigin
            }

            /** Pin the token to a specific warehouse connect flow */
            fun destinationType(destinationType: String) =
                destinationType(JsonField.of(destinationType))

            /**
             * Sets [Builder.destinationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destinationType(destinationType: JsonField<String>) = apply {
                this.destinationType = destinationType
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
             * .applicationOrigin()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("applicationOrigin", applicationOrigin),
                    destinationType,
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

            applicationOrigin()
            destinationType()
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
            (if (applicationOrigin.asKnown().isPresent) 1 else 0) +
                (if (destinationType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                applicationOrigin == other.applicationOrigin &&
                destinationType == other.destinationType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(applicationOrigin, destinationType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{applicationOrigin=$applicationOrigin, destinationType=$destinationType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataExportMintScopedTokenParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DataExportMintScopedTokenParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
