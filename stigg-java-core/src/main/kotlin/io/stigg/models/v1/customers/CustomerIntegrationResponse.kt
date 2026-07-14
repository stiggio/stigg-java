// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.BaseDeserializer
import io.stigg.core.BaseSerializer
import io.stigg.core.Enum
import io.stigg.core.ExcludeMissing
import io.stigg.core.JsonField
import io.stigg.core.JsonMissing
import io.stigg.core.JsonValue
import io.stigg.core.allMaxBy
import io.stigg.core.checkRequired
import io.stigg.core.getOrThrow
import io.stigg.errors.StiggInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response object */
class CustomerIntegrationResponse
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
     * External billing or CRM integration link
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
         * Returns a mutable builder for constructing an instance of [CustomerIntegrationResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerIntegrationResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerIntegrationResponse: CustomerIntegrationResponse) = apply {
            data = customerIntegrationResponse.data
            additionalProperties = customerIntegrationResponse.additionalProperties.toMutableMap()
        }

        /** External billing or CRM integration link */
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
         * Returns an immutable instance of [CustomerIntegrationResponse].
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
        fun build(): CustomerIntegrationResponse =
            CustomerIntegrationResponse(
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
    fun validate(): CustomerIntegrationResponse = apply {
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

    /** External billing or CRM integration link */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val syncedEntityId: JsonField<String>,
        private val vendorIdentifier: JsonField<VendorIdentifier>,
        private val syncData: JsonField<SyncData>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("syncedEntityId")
            @ExcludeMissing
            syncedEntityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vendorIdentifier")
            @ExcludeMissing
            vendorIdentifier: JsonField<VendorIdentifier> = JsonMissing.of(),
            @JsonProperty("syncData")
            @ExcludeMissing
            syncData: JsonField<SyncData> = JsonMissing.of(),
        ) : this(id, syncedEntityId, vendorIdentifier, syncData, mutableMapOf())

        /**
         * Integration details
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Synced entity id
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun syncedEntityId(): Optional<String> = syncedEntityId.getOptional("syncedEntityId")

        /**
         * The vendor identifier of integration
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vendorIdentifier(): VendorIdentifier = vendorIdentifier.getRequired("vendorIdentifier")

        /**
         * Price billing sync revision data containing billing ID, link URL, and price group package
         * billing ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun syncData(): Optional<SyncData> = syncData.getOptional("syncData")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

        /**
         * Returns the raw JSON value of [syncData].
         *
         * Unlike [syncData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("syncData") @ExcludeMissing fun _syncData(): JsonField<SyncData> = syncData

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
             * .syncedEntityId()
             * .vendorIdentifier()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var syncedEntityId: JsonField<String>? = null
            private var vendorIdentifier: JsonField<VendorIdentifier>? = null
            private var syncData: JsonField<SyncData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                syncedEntityId = data.syncedEntityId
                vendorIdentifier = data.vendorIdentifier
                syncData = data.syncData
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Integration details */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Synced entity id */
            fun syncedEntityId(syncedEntityId: String?) =
                syncedEntityId(JsonField.ofNullable(syncedEntityId))

            /** Alias for calling [Builder.syncedEntityId] with `syncedEntityId.orElse(null)`. */
            fun syncedEntityId(syncedEntityId: Optional<String>) =
                syncedEntityId(syncedEntityId.getOrNull())

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

            /**
             * Price billing sync revision data containing billing ID, link URL, and price group
             * package billing ID
             */
            fun syncData(syncData: SyncData?) = syncData(JsonField.ofNullable(syncData))

            /** Alias for calling [Builder.syncData] with `syncData.orElse(null)`. */
            fun syncData(syncData: Optional<SyncData>) = syncData(syncData.getOrNull())

            /**
             * Sets [Builder.syncData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.syncData] with a well-typed [SyncData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun syncData(syncData: JsonField<SyncData>) = apply { this.syncData = syncData }

            /**
             * Alias for calling [syncData] with
             * `SyncData.ofRevisionPriceBilling(revisionPriceBilling)`.
             */
            fun syncData(revisionPriceBilling: SyncData.SyncRevisionPriceBillingData) =
                syncData(SyncData.ofRevisionPriceBilling(revisionPriceBilling))

            /** Alias for calling [syncData] with `SyncData.ofRevisionBilling(revisionBilling)`. */
            fun syncData(revisionBilling: SyncData.SyncRevisionBillingData) =
                syncData(SyncData.ofRevisionBilling(revisionBilling))

            /**
             * Alias for calling [syncData] with
             * `SyncData.ofRevisionMarketplace(revisionMarketplace)`.
             */
            fun syncData(revisionMarketplace: SyncData.SyncRevisionMarketplaceData) =
                syncData(SyncData.ofRevisionMarketplace(revisionMarketplace))

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
             * .syncedEntityId()
             * .vendorIdentifier()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("syncedEntityId", syncedEntityId),
                    checkRequired("vendorIdentifier", vendorIdentifier),
                    syncData,
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

            id()
            syncedEntityId()
            vendorIdentifier().validate()
            syncData().ifPresent { it.validate() }
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
                (if (syncedEntityId.asKnown().isPresent) 1 else 0) +
                (vendorIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
                (syncData.asKnown().getOrNull()?.validity() ?: 0)

        /** The vendor identifier of integration */
        class VendorIdentifier
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

                @JvmField val AIRWALLEX = of("AIRWALLEX")

                @JvmField val STRIPE_INVOICING = of("STRIPE_INVOICING")

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
                AIRWALLEX,
                STRIPE_INVOICING,
            }

            /**
             * An enum containing [VendorIdentifier]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [VendorIdentifier] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                AIRWALLEX,
                STRIPE_INVOICING,
                /**
                 * An enum member indicating that [VendorIdentifier] was instantiated with an
                 * unknown value.
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
                    AIRWALLEX -> Value.AIRWALLEX
                    STRIPE_INVOICING -> Value.STRIPE_INVOICING
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
                    AIRWALLEX -> Known.AIRWALLEX
                    STRIPE_INVOICING -> Known.STRIPE_INVOICING
                    else -> throw StiggInvalidDataException("Unknown VendorIdentifier: $value")
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

        /**
         * Price billing sync revision data containing billing ID, link URL, and price group package
         * billing ID
         */
        @JsonDeserialize(using = SyncData.Deserializer::class)
        @JsonSerialize(using = SyncData.Serializer::class)
        class SyncData
        private constructor(
            private val revisionPriceBilling: SyncRevisionPriceBillingData? = null,
            private val revisionBilling: SyncRevisionBillingData? = null,
            private val revisionMarketplace: SyncRevisionMarketplaceData? = null,
            private val _json: JsonValue? = null,
        ) {

            /**
             * Price billing sync revision data containing billing ID, link URL, and price group
             * package billing ID
             */
            fun revisionPriceBilling(): Optional<SyncRevisionPriceBillingData> =
                Optional.ofNullable(revisionPriceBilling)

            /** Billing sync revision data containing billing ID and link URL */
            fun revisionBilling(): Optional<SyncRevisionBillingData> =
                Optional.ofNullable(revisionBilling)

            /** Marketplace sync revision data containing dimensions */
            fun revisionMarketplace(): Optional<SyncRevisionMarketplaceData> =
                Optional.ofNullable(revisionMarketplace)

            fun isRevisionPriceBilling(): Boolean = revisionPriceBilling != null

            fun isRevisionBilling(): Boolean = revisionBilling != null

            fun isRevisionMarketplace(): Boolean = revisionMarketplace != null

            /**
             * Price billing sync revision data containing billing ID, link URL, and price group
             * package billing ID
             */
            fun asRevisionPriceBilling(): SyncRevisionPriceBillingData =
                revisionPriceBilling.getOrThrow("revisionPriceBilling")

            /** Billing sync revision data containing billing ID and link URL */
            fun asRevisionBilling(): SyncRevisionBillingData =
                revisionBilling.getOrThrow("revisionBilling")

            /** Marketplace sync revision data containing dimensions */
            fun asRevisionMarketplace(): SyncRevisionMarketplaceData =
                revisionMarketplace.getOrThrow("revisionMarketplace")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import io.stigg.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = syncData.accept(new SyncData.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitRevisionPriceBilling(SyncRevisionPriceBillingData revisionPriceBilling) {
             *         return Optional.of(revisionPriceBilling.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws StiggInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
             *   and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    revisionPriceBilling != null ->
                        visitor.visitRevisionPriceBilling(revisionPriceBilling)
                    revisionBilling != null -> visitor.visitRevisionBilling(revisionBilling)
                    revisionMarketplace != null ->
                        visitor.visitRevisionMarketplace(revisionMarketplace)
                    else -> visitor.unknown(_json)
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
            fun validate(): SyncData = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitRevisionPriceBilling(
                            revisionPriceBilling: SyncRevisionPriceBillingData
                        ) {
                            revisionPriceBilling.validate()
                        }

                        override fun visitRevisionBilling(
                            revisionBilling: SyncRevisionBillingData
                        ) {
                            revisionBilling.validate()
                        }

                        override fun visitRevisionMarketplace(
                            revisionMarketplace: SyncRevisionMarketplaceData
                        ) {
                            revisionMarketplace.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitRevisionPriceBilling(
                            revisionPriceBilling: SyncRevisionPriceBillingData
                        ) = revisionPriceBilling.validity()

                        override fun visitRevisionBilling(
                            revisionBilling: SyncRevisionBillingData
                        ) = revisionBilling.validity()

                        override fun visitRevisionMarketplace(
                            revisionMarketplace: SyncRevisionMarketplaceData
                        ) = revisionMarketplace.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SyncData &&
                    revisionPriceBilling == other.revisionPriceBilling &&
                    revisionBilling == other.revisionBilling &&
                    revisionMarketplace == other.revisionMarketplace
            }

            override fun hashCode(): Int =
                Objects.hash(revisionPriceBilling, revisionBilling, revisionMarketplace)

            override fun toString(): String =
                when {
                    revisionPriceBilling != null ->
                        "SyncData{revisionPriceBilling=$revisionPriceBilling}"
                    revisionBilling != null -> "SyncData{revisionBilling=$revisionBilling}"
                    revisionMarketplace != null ->
                        "SyncData{revisionMarketplace=$revisionMarketplace}"
                    _json != null -> "SyncData{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid SyncData")
                }

            companion object {

                /**
                 * Price billing sync revision data containing billing ID, link URL, and price group
                 * package billing ID
                 */
                @JvmStatic
                fun ofRevisionPriceBilling(revisionPriceBilling: SyncRevisionPriceBillingData) =
                    SyncData(revisionPriceBilling = revisionPriceBilling)

                /** Billing sync revision data containing billing ID and link URL */
                @JvmStatic
                fun ofRevisionBilling(revisionBilling: SyncRevisionBillingData) =
                    SyncData(revisionBilling = revisionBilling)

                /** Marketplace sync revision data containing dimensions */
                @JvmStatic
                fun ofRevisionMarketplace(revisionMarketplace: SyncRevisionMarketplaceData) =
                    SyncData(revisionMarketplace = revisionMarketplace)
            }

            /**
             * An interface that defines how to map each variant of [SyncData] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                /**
                 * Price billing sync revision data containing billing ID, link URL, and price group
                 * package billing ID
                 */
                fun visitRevisionPriceBilling(revisionPriceBilling: SyncRevisionPriceBillingData): T

                /** Billing sync revision data containing billing ID and link URL */
                fun visitRevisionBilling(revisionBilling: SyncRevisionBillingData): T

                /** Marketplace sync revision data containing dimensions */
                fun visitRevisionMarketplace(revisionMarketplace: SyncRevisionMarketplaceData): T

                /**
                 * Maps an unknown variant of [SyncData] to a value of type [T].
                 *
                 * An instance of [SyncData] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws StiggInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw StiggInvalidDataException("Unknown SyncData: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<SyncData>(SyncData::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): SyncData {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<SyncRevisionPriceBillingData>())
                                    ?.let { SyncData(revisionPriceBilling = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<SyncRevisionBillingData>())
                                    ?.let { SyncData(revisionBilling = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<SyncRevisionMarketplaceData>())
                                    ?.let { SyncData(revisionMarketplace = it, _json = json) },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> SyncData(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<SyncData>(SyncData::class) {

                override fun serialize(
                    value: SyncData,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.revisionPriceBilling != null ->
                            generator.writeObject(value.revisionPriceBilling)
                        value.revisionBilling != null ->
                            generator.writeObject(value.revisionBilling)
                        value.revisionMarketplace != null ->
                            generator.writeObject(value.revisionMarketplace)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid SyncData")
                    }
                }
            }

            /**
             * Price billing sync revision data containing billing ID, link URL, and price group
             * package billing ID
             */
            class SyncRevisionPriceBillingData
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val billingId: JsonField<String>,
                private val billingLinkUrl: JsonField<String>,
                private val priceGroupPackageBillingId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("billingId")
                    @ExcludeMissing
                    billingId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billingLinkUrl")
                    @ExcludeMissing
                    billingLinkUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("priceGroupPackageBillingId")
                    @ExcludeMissing
                    priceGroupPackageBillingId: JsonField<String> = JsonMissing.of(),
                ) : this(billingId, billingLinkUrl, priceGroupPackageBillingId, mutableMapOf())

                /**
                 * Billing integration id
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun billingId(): String = billingId.getRequired("billingId")

                /**
                 * Billing integration url
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun billingLinkUrl(): String = billingLinkUrl.getRequired("billingLinkUrl")

                /**
                 * Price group package billing id
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun priceGroupPackageBillingId(): String =
                    priceGroupPackageBillingId.getRequired("priceGroupPackageBillingId")

                /**
                 * Returns the raw JSON value of [billingId].
                 *
                 * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("billingId")
                @ExcludeMissing
                fun _billingId(): JsonField<String> = billingId

                /**
                 * Returns the raw JSON value of [billingLinkUrl].
                 *
                 * Unlike [billingLinkUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billingLinkUrl")
                @ExcludeMissing
                fun _billingLinkUrl(): JsonField<String> = billingLinkUrl

                /**
                 * Returns the raw JSON value of [priceGroupPackageBillingId].
                 *
                 * Unlike [priceGroupPackageBillingId], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("priceGroupPackageBillingId")
                @ExcludeMissing
                fun _priceGroupPackageBillingId(): JsonField<String> = priceGroupPackageBillingId

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
                     * [SyncRevisionPriceBillingData].
                     *
                     * The following fields are required:
                     * ```java
                     * .billingId()
                     * .billingLinkUrl()
                     * .priceGroupPackageBillingId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SyncRevisionPriceBillingData]. */
                class Builder internal constructor() {

                    private var billingId: JsonField<String>? = null
                    private var billingLinkUrl: JsonField<String>? = null
                    private var priceGroupPackageBillingId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(syncRevisionPriceBillingData: SyncRevisionPriceBillingData) =
                        apply {
                            billingId = syncRevisionPriceBillingData.billingId
                            billingLinkUrl = syncRevisionPriceBillingData.billingLinkUrl
                            priceGroupPackageBillingId =
                                syncRevisionPriceBillingData.priceGroupPackageBillingId
                            additionalProperties =
                                syncRevisionPriceBillingData.additionalProperties.toMutableMap()
                        }

                    /** Billing integration id */
                    fun billingId(billingId: String) = billingId(JsonField.of(billingId))

                    /**
                     * Sets [Builder.billingId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun billingId(billingId: JsonField<String>) = apply {
                        this.billingId = billingId
                    }

                    /** Billing integration url */
                    fun billingLinkUrl(billingLinkUrl: String) =
                        billingLinkUrl(JsonField.of(billingLinkUrl))

                    /**
                     * Sets [Builder.billingLinkUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingLinkUrl] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billingLinkUrl(billingLinkUrl: JsonField<String>) = apply {
                        this.billingLinkUrl = billingLinkUrl
                    }

                    /** Price group package billing id */
                    fun priceGroupPackageBillingId(priceGroupPackageBillingId: String) =
                        priceGroupPackageBillingId(JsonField.of(priceGroupPackageBillingId))

                    /**
                     * Sets [Builder.priceGroupPackageBillingId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.priceGroupPackageBillingId] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun priceGroupPackageBillingId(priceGroupPackageBillingId: JsonField<String>) =
                        apply {
                            this.priceGroupPackageBillingId = priceGroupPackageBillingId
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
                     * Returns an immutable instance of [SyncRevisionPriceBillingData].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .billingId()
                     * .billingLinkUrl()
                     * .priceGroupPackageBillingId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SyncRevisionPriceBillingData =
                        SyncRevisionPriceBillingData(
                            checkRequired("billingId", billingId),
                            checkRequired("billingLinkUrl", billingLinkUrl),
                            checkRequired("priceGroupPackageBillingId", priceGroupPackageBillingId),
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
                fun validate(): SyncRevisionPriceBillingData = apply {
                    if (validated) {
                        return@apply
                    }

                    billingId()
                    billingLinkUrl()
                    priceGroupPackageBillingId()
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
                    (if (billingId.asKnown().isPresent) 1 else 0) +
                        (if (billingLinkUrl.asKnown().isPresent) 1 else 0) +
                        (if (priceGroupPackageBillingId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SyncRevisionPriceBillingData &&
                        billingId == other.billingId &&
                        billingLinkUrl == other.billingLinkUrl &&
                        priceGroupPackageBillingId == other.priceGroupPackageBillingId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        billingId,
                        billingLinkUrl,
                        priceGroupPackageBillingId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SyncRevisionPriceBillingData{billingId=$billingId, billingLinkUrl=$billingLinkUrl, priceGroupPackageBillingId=$priceGroupPackageBillingId, additionalProperties=$additionalProperties}"
            }

            /** Billing sync revision data containing billing ID and link URL */
            class SyncRevisionBillingData
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val billingId: JsonField<String>,
                private val billingLinkUrl: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("billingId")
                    @ExcludeMissing
                    billingId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billingLinkUrl")
                    @ExcludeMissing
                    billingLinkUrl: JsonField<String> = JsonMissing.of(),
                ) : this(billingId, billingLinkUrl, mutableMapOf())

                /**
                 * Billing integration id
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun billingId(): String = billingId.getRequired("billingId")

                /**
                 * Billing integration url
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun billingLinkUrl(): String = billingLinkUrl.getRequired("billingLinkUrl")

                /**
                 * Returns the raw JSON value of [billingId].
                 *
                 * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("billingId")
                @ExcludeMissing
                fun _billingId(): JsonField<String> = billingId

                /**
                 * Returns the raw JSON value of [billingLinkUrl].
                 *
                 * Unlike [billingLinkUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billingLinkUrl")
                @ExcludeMissing
                fun _billingLinkUrl(): JsonField<String> = billingLinkUrl

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
                     * [SyncRevisionBillingData].
                     *
                     * The following fields are required:
                     * ```java
                     * .billingId()
                     * .billingLinkUrl()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SyncRevisionBillingData]. */
                class Builder internal constructor() {

                    private var billingId: JsonField<String>? = null
                    private var billingLinkUrl: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(syncRevisionBillingData: SyncRevisionBillingData) = apply {
                        billingId = syncRevisionBillingData.billingId
                        billingLinkUrl = syncRevisionBillingData.billingLinkUrl
                        additionalProperties =
                            syncRevisionBillingData.additionalProperties.toMutableMap()
                    }

                    /** Billing integration id */
                    fun billingId(billingId: String) = billingId(JsonField.of(billingId))

                    /**
                     * Sets [Builder.billingId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun billingId(billingId: JsonField<String>) = apply {
                        this.billingId = billingId
                    }

                    /** Billing integration url */
                    fun billingLinkUrl(billingLinkUrl: String) =
                        billingLinkUrl(JsonField.of(billingLinkUrl))

                    /**
                     * Sets [Builder.billingLinkUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingLinkUrl] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billingLinkUrl(billingLinkUrl: JsonField<String>) = apply {
                        this.billingLinkUrl = billingLinkUrl
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
                     * Returns an immutable instance of [SyncRevisionBillingData].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .billingId()
                     * .billingLinkUrl()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SyncRevisionBillingData =
                        SyncRevisionBillingData(
                            checkRequired("billingId", billingId),
                            checkRequired("billingLinkUrl", billingLinkUrl),
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
                fun validate(): SyncRevisionBillingData = apply {
                    if (validated) {
                        return@apply
                    }

                    billingId()
                    billingLinkUrl()
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
                    (if (billingId.asKnown().isPresent) 1 else 0) +
                        (if (billingLinkUrl.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SyncRevisionBillingData &&
                        billingId == other.billingId &&
                        billingLinkUrl == other.billingLinkUrl &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(billingId, billingLinkUrl, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SyncRevisionBillingData{billingId=$billingId, billingLinkUrl=$billingLinkUrl, additionalProperties=$additionalProperties}"
            }

            /** Marketplace sync revision data containing dimensions */
            class SyncRevisionMarketplaceData
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val dimensions: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("dimensions")
                    @ExcludeMissing
                    dimensions: JsonField<String> = JsonMissing.of()
                ) : this(dimensions, mutableMapOf())

                /**
                 * Dimensions of the marketplace sync revision
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun dimensions(): String = dimensions.getRequired("dimensions")

                /**
                 * Returns the raw JSON value of [dimensions].
                 *
                 * Unlike [dimensions], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("dimensions")
                @ExcludeMissing
                fun _dimensions(): JsonField<String> = dimensions

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
                     * [SyncRevisionMarketplaceData].
                     *
                     * The following fields are required:
                     * ```java
                     * .dimensions()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SyncRevisionMarketplaceData]. */
                class Builder internal constructor() {

                    private var dimensions: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(syncRevisionMarketplaceData: SyncRevisionMarketplaceData) =
                        apply {
                            dimensions = syncRevisionMarketplaceData.dimensions
                            additionalProperties =
                                syncRevisionMarketplaceData.additionalProperties.toMutableMap()
                        }

                    /** Dimensions of the marketplace sync revision */
                    fun dimensions(dimensions: String) = dimensions(JsonField.of(dimensions))

                    /**
                     * Sets [Builder.dimensions] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensions] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun dimensions(dimensions: JsonField<String>) = apply {
                        this.dimensions = dimensions
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
                     * Returns an immutable instance of [SyncRevisionMarketplaceData].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .dimensions()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SyncRevisionMarketplaceData =
                        SyncRevisionMarketplaceData(
                            checkRequired("dimensions", dimensions),
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
                fun validate(): SyncRevisionMarketplaceData = apply {
                    if (validated) {
                        return@apply
                    }

                    dimensions()
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
                internal fun validity(): Int = (if (dimensions.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SyncRevisionMarketplaceData &&
                        dimensions == other.dimensions &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(dimensions, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SyncRevisionMarketplaceData{dimensions=$dimensions, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                syncedEntityId == other.syncedEntityId &&
                vendorIdentifier == other.vendorIdentifier &&
                syncData == other.syncData &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, syncedEntityId, vendorIdentifier, syncData, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, syncedEntityId=$syncedEntityId, vendorIdentifier=$vendorIdentifier, syncData=$syncData, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerIntegrationResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerIntegrationResponse{data=$data, additionalProperties=$additionalProperties}"
}
