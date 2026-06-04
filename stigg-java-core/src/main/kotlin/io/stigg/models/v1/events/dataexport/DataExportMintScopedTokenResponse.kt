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
import io.stigg.core.checkRequired
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Response object */
class DataExportMintScopedTokenResponse
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
     * Scoped token + expiry + provider-specific metadata for the FE SDK.
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
         * [DataExportMintScopedTokenResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportMintScopedTokenResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataExportMintScopedTokenResponse: DataExportMintScopedTokenResponse) =
            apply {
                data = dataExportMintScopedTokenResponse.data
                additionalProperties =
                    dataExportMintScopedTokenResponse.additionalProperties.toMutableMap()
            }

        /** Scoped token + expiry + provider-specific metadata for the FE SDK. */
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
         * Returns an immutable instance of [DataExportMintScopedTokenResponse].
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
        fun build(): DataExportMintScopedTokenResponse =
            DataExportMintScopedTokenResponse(
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
    fun validate(): DataExportMintScopedTokenResponse = apply {
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

    /** Scoped token + expiry + provider-specific metadata for the FE SDK. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val expiresAt: JsonField<String>,
        private val providerMetadata: JsonField<ProviderMetadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiresAt")
            @ExcludeMissing
            expiresAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("providerMetadata")
            @ExcludeMissing
            providerMetadata: JsonField<ProviderMetadata> = JsonMissing.of(),
        ) : this(token, expiresAt, providerMetadata, mutableMapOf())

        /**
         * Provider scoped JWT
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * ISO8601 token expiry
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresAt(): String = expiresAt.getRequired("expiresAt")

        /**
         * Provider-specific extras the FE embedded SDK needs
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun providerMetadata(): ProviderMetadata = providerMetadata.getRequired("providerMetadata")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expiresAt") @ExcludeMissing fun _expiresAt(): JsonField<String> = expiresAt

        /**
         * Returns the raw JSON value of [providerMetadata].
         *
         * Unlike [providerMetadata], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("providerMetadata")
        @ExcludeMissing
        fun _providerMetadata(): JsonField<ProviderMetadata> = providerMetadata

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
             * .token()
             * .expiresAt()
             * .providerMetadata()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var expiresAt: JsonField<String>? = null
            private var providerMetadata: JsonField<ProviderMetadata>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                token = data.token
                expiresAt = data.expiresAt
                providerMetadata = data.providerMetadata
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Provider scoped JWT */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** ISO8601 token expiry */
            fun expiresAt(expiresAt: String) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<String>) = apply { this.expiresAt = expiresAt }

            /** Provider-specific extras the FE embedded SDK needs */
            fun providerMetadata(providerMetadata: ProviderMetadata) =
                providerMetadata(JsonField.of(providerMetadata))

            /**
             * Sets [Builder.providerMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerMetadata] with a well-typed
             * [ProviderMetadata] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun providerMetadata(providerMetadata: JsonField<ProviderMetadata>) = apply {
                this.providerMetadata = providerMetadata
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
             * .token()
             * .expiresAt()
             * .providerMetadata()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("token", token),
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("providerMetadata", providerMetadata),
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

            token()
            expiresAt()
            providerMetadata().validate()
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
            (if (token.asKnown().isPresent) 1 else 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (providerMetadata.asKnown().getOrNull()?.validity() ?: 0)

        /** Provider-specific extras the FE embedded SDK needs */
        class ProviderMetadata
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

                /** Returns a mutable builder for constructing an instance of [ProviderMetadata]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProviderMetadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(providerMetadata: ProviderMetadata) = apply {
                    additionalProperties = providerMetadata.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [ProviderMetadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ProviderMetadata = ProviderMetadata(additionalProperties.toImmutable())
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
            fun validate(): ProviderMetadata = apply {
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

                return other is ProviderMetadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "ProviderMetadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                token == other.token &&
                expiresAt == other.expiresAt &&
                providerMetadata == other.providerMetadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(token, expiresAt, providerMetadata, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{token=$token, expiresAt=$expiresAt, providerMetadata=$providerMetadata, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataExportMintScopedTokenResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataExportMintScopedTokenResponse{data=$data, additionalProperties=$additionalProperties}"
}
