// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.stigg.core.Enum
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
import kotlin.jvm.optionals.getOrNull

/** Links a customer to an external integration by specifying the vendor and external entity ID. */
class IntegrationLinkParams
private constructor(
    private val pathId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathId(): Optional<String> = Optional.ofNullable(pathId)

    /**
     * Integration details
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bodyId(): String = body.bodyId()

    /**
     * Synced entity id
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun syncedEntityId(): String = body.syncedEntityId()

    /**
     * The vendor identifier of integration
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vendorIdentifier(): VendorIdentifier = body.vendorIdentifier()

    /**
     * Returns the raw JSON value of [bodyId].
     *
     * Unlike [bodyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyId(): JsonField<String> = body._bodyId()

    /**
     * Returns the raw JSON value of [syncedEntityId].
     *
     * Unlike [syncedEntityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _syncedEntityId(): JsonField<String> = body._syncedEntityId()

    /**
     * Returns the raw JSON value of [vendorIdentifier].
     *
     * Unlike [vendorIdentifier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _vendorIdentifier(): JsonField<VendorIdentifier> = body._vendorIdentifier()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IntegrationLinkParams].
         *
         * The following fields are required:
         * ```java
         * .bodyId()
         * .syncedEntityId()
         * .vendorIdentifier()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegrationLinkParams]. */
    class Builder internal constructor() {

        private var pathId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(integrationLinkParams: IntegrationLinkParams) = apply {
            pathId = integrationLinkParams.pathId
            body = integrationLinkParams.body.toBuilder()
            additionalHeaders = integrationLinkParams.additionalHeaders.toBuilder()
            additionalQueryParams = integrationLinkParams.additionalQueryParams.toBuilder()
        }

        fun pathId(pathId: String?) = apply { this.pathId = pathId }

        /** Alias for calling [Builder.pathId] with `pathId.orElse(null)`. */
        fun pathId(pathId: Optional<String>) = pathId(pathId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bodyId]
         * - [syncedEntityId]
         * - [vendorIdentifier]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Integration details */
        fun bodyId(bodyId: String) = apply { body.bodyId(bodyId) }

        /**
         * Sets [Builder.bodyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bodyId(bodyId: JsonField<String>) = apply { body.bodyId(bodyId) }

        /** Synced entity id */
        fun syncedEntityId(syncedEntityId: String) = apply { body.syncedEntityId(syncedEntityId) }

        /**
         * Sets [Builder.syncedEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.syncedEntityId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun syncedEntityId(syncedEntityId: JsonField<String>) = apply {
            body.syncedEntityId(syncedEntityId)
        }

        /** The vendor identifier of integration */
        fun vendorIdentifier(vendorIdentifier: VendorIdentifier) = apply {
            body.vendorIdentifier(vendorIdentifier)
        }

        /**
         * Sets [Builder.vendorIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorIdentifier] with a well-typed [VendorIdentifier]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun vendorIdentifier(vendorIdentifier: JsonField<VendorIdentifier>) = apply {
            body.vendorIdentifier(vendorIdentifier)
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
         * Returns an immutable instance of [IntegrationLinkParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bodyId()
         * .syncedEntityId()
         * .vendorIdentifier()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntegrationLinkParams =
            IntegrationLinkParams(
                pathId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Links a customer to an external integration. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bodyId: JsonField<String>,
        private val syncedEntityId: JsonField<String>,
        private val vendorIdentifier: JsonField<VendorIdentifier>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing bodyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("syncedEntityId")
            @ExcludeMissing
            syncedEntityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vendorIdentifier")
            @ExcludeMissing
            vendorIdentifier: JsonField<VendorIdentifier> = JsonMissing.of(),
        ) : this(bodyId, syncedEntityId, vendorIdentifier, mutableMapOf())

        /**
         * Integration details
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bodyId(): String = bodyId.getRequired("id")

        /**
         * Synced entity id
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun syncedEntityId(): String = syncedEntityId.getRequired("syncedEntityId")

        /**
         * The vendor identifier of integration
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vendorIdentifier(): VendorIdentifier = vendorIdentifier.getRequired("vendorIdentifier")

        /**
         * Returns the raw JSON value of [bodyId].
         *
         * Unlike [bodyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _bodyId(): JsonField<String> = bodyId

        /**
         * Returns the raw JSON value of [syncedEntityId].
         *
         * Unlike [syncedEntityId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("syncedEntityId")
        @ExcludeMissing
        fun _syncedEntityId(): JsonField<String> = syncedEntityId

        /**
         * Returns the raw JSON value of [vendorIdentifier].
         *
         * Unlike [vendorIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vendorIdentifier")
        @ExcludeMissing
        fun _vendorIdentifier(): JsonField<VendorIdentifier> = vendorIdentifier

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
             * .bodyId()
             * .syncedEntityId()
             * .vendorIdentifier()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bodyId: JsonField<String>? = null
            private var syncedEntityId: JsonField<String>? = null
            private var vendorIdentifier: JsonField<VendorIdentifier>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bodyId = body.bodyId
                syncedEntityId = body.syncedEntityId
                vendorIdentifier = body.vendorIdentifier
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Integration details */
            fun bodyId(bodyId: String) = bodyId(JsonField.of(bodyId))

            /**
             * Sets [Builder.bodyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyId(bodyId: JsonField<String>) = apply { this.bodyId = bodyId }

            /** Synced entity id */
            fun syncedEntityId(syncedEntityId: String) =
                syncedEntityId(JsonField.of(syncedEntityId))

            /**
             * Sets [Builder.syncedEntityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.syncedEntityId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun syncedEntityId(syncedEntityId: JsonField<String>) = apply {
                this.syncedEntityId = syncedEntityId
            }

            /** The vendor identifier of integration */
            fun vendorIdentifier(vendorIdentifier: VendorIdentifier) =
                vendorIdentifier(JsonField.of(vendorIdentifier))

            /**
             * Sets [Builder.vendorIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vendorIdentifier] with a well-typed
             * [VendorIdentifier] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun vendorIdentifier(vendorIdentifier: JsonField<VendorIdentifier>) = apply {
                this.vendorIdentifier = vendorIdentifier
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
             * .bodyId()
             * .syncedEntityId()
             * .vendorIdentifier()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("bodyId", bodyId),
                    checkRequired("syncedEntityId", syncedEntityId),
                    checkRequired("vendorIdentifier", vendorIdentifier),
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

            bodyId()
            syncedEntityId()
            vendorIdentifier().validate()
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
            (if (bodyId.asKnown().isPresent) 1 else 0) +
                (if (syncedEntityId.asKnown().isPresent) 1 else 0) +
                (vendorIdentifier.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bodyId == other.bodyId &&
                syncedEntityId == other.syncedEntityId &&
                vendorIdentifier == other.vendorIdentifier &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bodyId, syncedEntityId, vendorIdentifier, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bodyId=$bodyId, syncedEntityId=$syncedEntityId, vendorIdentifier=$vendorIdentifier, additionalProperties=$additionalProperties}"
    }

    /** The vendor identifier of integration */
    class VendorIdentifier @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AUTH0 = of("AUTH0")

            @JvmField val ZUORA = of("ZUORA")

            @JvmField val STRIPE = of("STRIPE")

            @JvmField val HUBSPOT = of("HUBSPOT")

            @JvmField val AWS_MARKETPLACE = of("AWS_MARKETPLACE")

            @JvmField val SNOWFLAKE = of("SNOWFLAKE")

            @JvmField val SALESFORCE = of("SALESFORCE")

            @JvmField val BIG_QUERY = of("BIG_QUERY")

            @JvmField val OPEN_FGA = of("OPEN_FGA")

            @JvmField val APP_STORE = of("APP_STORE")

            @JvmField val RECEIVED = of("RECEIVED")

            @JvmField val PREQUEL = of("PREQUEL")

            @JvmStatic fun of(value: String) = VendorIdentifier(JsonField.of(value))
        }

        /** An enum containing [VendorIdentifier]'s known values. */
        enum class Known {
            AUTH0,
            ZUORA,
            STRIPE,
            HUBSPOT,
            AWS_MARKETPLACE,
            SNOWFLAKE,
            SALESFORCE,
            BIG_QUERY,
            OPEN_FGA,
            APP_STORE,
            RECEIVED,
            PREQUEL,
        }

        /**
         * An enum containing [VendorIdentifier]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VendorIdentifier] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTH0,
            ZUORA,
            STRIPE,
            HUBSPOT,
            AWS_MARKETPLACE,
            SNOWFLAKE,
            SALESFORCE,
            BIG_QUERY,
            OPEN_FGA,
            APP_STORE,
            RECEIVED,
            PREQUEL,
            /**
             * An enum member indicating that [VendorIdentifier] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AUTH0 -> Value.AUTH0
                ZUORA -> Value.ZUORA
                STRIPE -> Value.STRIPE
                HUBSPOT -> Value.HUBSPOT
                AWS_MARKETPLACE -> Value.AWS_MARKETPLACE
                SNOWFLAKE -> Value.SNOWFLAKE
                SALESFORCE -> Value.SALESFORCE
                BIG_QUERY -> Value.BIG_QUERY
                OPEN_FGA -> Value.OPEN_FGA
                APP_STORE -> Value.APP_STORE
                RECEIVED -> Value.RECEIVED
                PREQUEL -> Value.PREQUEL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws StiggInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                AUTH0 -> Known.AUTH0
                ZUORA -> Known.ZUORA
                STRIPE -> Known.STRIPE
                HUBSPOT -> Known.HUBSPOT
                AWS_MARKETPLACE -> Known.AWS_MARKETPLACE
                SNOWFLAKE -> Known.SNOWFLAKE
                SALESFORCE -> Known.SALESFORCE
                BIG_QUERY -> Known.BIG_QUERY
                OPEN_FGA -> Known.OPEN_FGA
                APP_STORE -> Known.APP_STORE
                RECEIVED -> Known.RECEIVED
                PREQUEL -> Known.PREQUEL
                else -> throw StiggInvalidDataException("Unknown VendorIdentifier: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws StiggInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { StiggInvalidDataException("Value is not a String") }

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
        fun validate(): VendorIdentifier = apply {
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

            return other is VendorIdentifier && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegrationLinkParams &&
            pathId == other.pathId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pathId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IntegrationLinkParams{pathId=$pathId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
