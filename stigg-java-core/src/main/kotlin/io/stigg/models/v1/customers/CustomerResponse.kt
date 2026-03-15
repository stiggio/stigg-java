// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.stigg.core.Enum
import io.stigg.core.ExcludeMissing
import io.stigg.core.JsonField
import io.stigg.core.JsonMissing
import io.stigg.core.JsonValue
import io.stigg.core.checkKnown
import io.stigg.core.checkRequired
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response object */
class CustomerResponse
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
     * A customer can be either an organization or an individual
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
         * Returns a mutable builder for constructing an instance of [CustomerResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerResponse: CustomerResponse) = apply {
            data = customerResponse.data
            additionalProperties = customerResponse.additionalProperties.toMutableMap()
        }

        /** A customer can be either an organization or an individual */
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
         * Returns an immutable instance of [CustomerResponse].
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
        fun build(): CustomerResponse =
            CustomerResponse(checkRequired("data", data), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CustomerResponse = apply {
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

    /** A customer can be either an organization or an individual */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val archivedAt: JsonField<OffsetDateTime>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val billingCurrency: JsonField<BillingCurrency>,
        private val billingId: JsonField<String>,
        private val couponId: JsonField<String>,
        private val defaultPaymentMethod: JsonField<DefaultPaymentMethod>,
        private val email: JsonField<String>,
        private val integrations: JsonField<List<Integration>>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("archivedAt")
            @ExcludeMissing
            archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("billingCurrency")
            @ExcludeMissing
            billingCurrency: JsonField<BillingCurrency> = JsonMissing.of(),
            @JsonProperty("billingId")
            @ExcludeMissing
            billingId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("couponId")
            @ExcludeMissing
            couponId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("defaultPaymentMethod")
            @ExcludeMissing
            defaultPaymentMethod: JsonField<DefaultPaymentMethod> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integrations")
            @ExcludeMissing
            integrations: JsonField<List<Integration>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            archivedAt,
            createdAt,
            updatedAt,
            billingCurrency,
            billingId,
            couponId,
            defaultPaymentMethod,
            email,
            integrations,
            metadata,
            name,
            mutableMapOf(),
        )

        /**
         * Customer slug
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Timestamp of when the record was deleted
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun archivedAt(): Optional<OffsetDateTime> = archivedAt.getOptional("archivedAt")

        /**
         * Timestamp of when the record was created
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * Timestamp of when the record was last updated
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

        /**
         * The billing currency of the customer
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingCurrency(): Optional<BillingCurrency> =
            billingCurrency.getOptional("billingCurrency")

        /**
         * The unique identifier for the entity in the billing provider
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingId(): Optional<String> = billingId.getOptional("billingId")

        /**
         * Customer level coupon
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun couponId(): Optional<String> = couponId.getOptional("couponId")

        /**
         * The default payment method details
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultPaymentMethod(): Optional<DefaultPaymentMethod> =
            defaultPaymentMethod.getOptional("defaultPaymentMethod")

        /**
         * The email of the customer
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * List of integrations
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun integrations(): Optional<List<Integration>> = integrations.getOptional("integrations")

        /**
         * Additional metadata
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * The name of the customer
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [archivedAt].
         *
         * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("archivedAt")
        @ExcludeMissing
        fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [billingCurrency].
         *
         * Unlike [billingCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingCurrency")
        @ExcludeMissing
        fun _billingCurrency(): JsonField<BillingCurrency> = billingCurrency

        /**
         * Returns the raw JSON value of [billingId].
         *
         * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billingId") @ExcludeMissing fun _billingId(): JsonField<String> = billingId

        /**
         * Returns the raw JSON value of [couponId].
         *
         * Unlike [couponId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("couponId") @ExcludeMissing fun _couponId(): JsonField<String> = couponId

        /**
         * Returns the raw JSON value of [defaultPaymentMethod].
         *
         * Unlike [defaultPaymentMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("defaultPaymentMethod")
        @ExcludeMissing
        fun _defaultPaymentMethod(): JsonField<DefaultPaymentMethod> = defaultPaymentMethod

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [integrations].
         *
         * Unlike [integrations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integrations")
        @ExcludeMissing
        fun _integrations(): JsonField<List<Integration>> = integrations

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * .archivedAt()
             * .createdAt()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var archivedAt: JsonField<OffsetDateTime>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var billingCurrency: JsonField<BillingCurrency> = JsonMissing.of()
            private var billingId: JsonField<String> = JsonMissing.of()
            private var couponId: JsonField<String> = JsonMissing.of()
            private var defaultPaymentMethod: JsonField<DefaultPaymentMethod> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var integrations: JsonField<MutableList<Integration>>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                archivedAt = data.archivedAt
                createdAt = data.createdAt
                updatedAt = data.updatedAt
                billingCurrency = data.billingCurrency
                billingId = data.billingId
                couponId = data.couponId
                defaultPaymentMethod = data.defaultPaymentMethod
                email = data.email
                integrations = data.integrations.map { it.toMutableList() }
                metadata = data.metadata
                name = data.name
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Customer slug */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Timestamp of when the record was deleted */
            fun archivedAt(archivedAt: OffsetDateTime?) =
                archivedAt(JsonField.ofNullable(archivedAt))

            /** Alias for calling [Builder.archivedAt] with `archivedAt.orElse(null)`. */
            fun archivedAt(archivedAt: Optional<OffsetDateTime>) =
                archivedAt(archivedAt.getOrNull())

            /**
             * Sets [Builder.archivedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
                this.archivedAt = archivedAt
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

            /** The billing currency of the customer */
            fun billingCurrency(billingCurrency: BillingCurrency?) =
                billingCurrency(JsonField.ofNullable(billingCurrency))

            /** Alias for calling [Builder.billingCurrency] with `billingCurrency.orElse(null)`. */
            fun billingCurrency(billingCurrency: Optional<BillingCurrency>) =
                billingCurrency(billingCurrency.getOrNull())

            /**
             * Sets [Builder.billingCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingCurrency] with a well-typed [BillingCurrency]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingCurrency(billingCurrency: JsonField<BillingCurrency>) = apply {
                this.billingCurrency = billingCurrency
            }

            /** The unique identifier for the entity in the billing provider */
            fun billingId(billingId: String?) = billingId(JsonField.ofNullable(billingId))

            /** Alias for calling [Builder.billingId] with `billingId.orElse(null)`. */
            fun billingId(billingId: Optional<String>) = billingId(billingId.getOrNull())

            /**
             * Sets [Builder.billingId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingId(billingId: JsonField<String>) = apply { this.billingId = billingId }

            /** Customer level coupon */
            fun couponId(couponId: String?) = couponId(JsonField.ofNullable(couponId))

            /** Alias for calling [Builder.couponId] with `couponId.orElse(null)`. */
            fun couponId(couponId: Optional<String>) = couponId(couponId.getOrNull())

            /**
             * Sets [Builder.couponId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.couponId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun couponId(couponId: JsonField<String>) = apply { this.couponId = couponId }

            /** The default payment method details */
            fun defaultPaymentMethod(defaultPaymentMethod: DefaultPaymentMethod?) =
                defaultPaymentMethod(JsonField.ofNullable(defaultPaymentMethod))

            /**
             * Alias for calling [Builder.defaultPaymentMethod] with
             * `defaultPaymentMethod.orElse(null)`.
             */
            fun defaultPaymentMethod(defaultPaymentMethod: Optional<DefaultPaymentMethod>) =
                defaultPaymentMethod(defaultPaymentMethod.getOrNull())

            /**
             * Sets [Builder.defaultPaymentMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultPaymentMethod] with a well-typed
             * [DefaultPaymentMethod] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun defaultPaymentMethod(defaultPaymentMethod: JsonField<DefaultPaymentMethod>) =
                apply {
                    this.defaultPaymentMethod = defaultPaymentMethod
                }

            /** The email of the customer */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** Alias for calling [Builder.email] with `email.orElse(null)`. */
            fun email(email: Optional<String>) = email(email.getOrNull())

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** List of integrations */
            fun integrations(integrations: List<Integration>) =
                integrations(JsonField.of(integrations))

            /**
             * Sets [Builder.integrations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrations] with a well-typed `List<Integration>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun integrations(integrations: JsonField<List<Integration>>) = apply {
                this.integrations = integrations.map { it.toMutableList() }
            }

            /**
             * Adds a single [Integration] to [integrations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIntegration(integration: Integration) = apply {
                integrations =
                    (integrations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("integrations", it).add(integration)
                    }
            }

            /** Additional metadata */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** The name of the customer */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * .archivedAt()
             * .createdAt()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("archivedAt", archivedAt),
                    checkRequired("createdAt", createdAt),
                    checkRequired("updatedAt", updatedAt),
                    billingCurrency,
                    billingId,
                    couponId,
                    defaultPaymentMethod,
                    email,
                    (integrations ?: JsonMissing.of()).map { it.toImmutable() },
                    metadata,
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            archivedAt()
            createdAt()
            updatedAt()
            billingCurrency().ifPresent { it.validate() }
            billingId()
            couponId()
            defaultPaymentMethod().ifPresent { it.validate() }
            email()
            integrations().ifPresent { it.forEach { it.validate() } }
            metadata().ifPresent { it.validate() }
            name()
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
                (if (archivedAt.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (billingCurrency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (billingId.asKnown().isPresent) 1 else 0) +
                (if (couponId.asKnown().isPresent) 1 else 0) +
                (defaultPaymentMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (integrations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** The billing currency of the customer */
        class BillingCurrency
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

                @JvmField val USD = of("usd")

                @JvmField val AED = of("aed")

                @JvmField val ALL = of("all")

                @JvmField val AMD = of("amd")

                @JvmField val ANG = of("ang")

                @JvmField val AUD = of("aud")

                @JvmField val AWG = of("awg")

                @JvmField val AZN = of("azn")

                @JvmField val BAM = of("bam")

                @JvmField val BBD = of("bbd")

                @JvmField val BDT = of("bdt")

                @JvmField val BGN = of("bgn")

                @JvmField val BIF = of("bif")

                @JvmField val BMD = of("bmd")

                @JvmField val BND = of("bnd")

                @JvmField val BSD = of("bsd")

                @JvmField val BWP = of("bwp")

                @JvmField val BYN = of("byn")

                @JvmField val BZD = of("bzd")

                @JvmField val BRL = of("brl")

                @JvmField val CAD = of("cad")

                @JvmField val CDF = of("cdf")

                @JvmField val CHF = of("chf")

                @JvmField val CNY = of("cny")

                @JvmField val CZK = of("czk")

                @JvmField val DKK = of("dkk")

                @JvmField val DOP = of("dop")

                @JvmField val DZD = of("dzd")

                @JvmField val EGP = of("egp")

                @JvmField val ETB = of("etb")

                @JvmField val EUR = of("eur")

                @JvmField val FJD = of("fjd")

                @JvmField val GBP = of("gbp")

                @JvmField val GEL = of("gel")

                @JvmField val GIP = of("gip")

                @JvmField val GMD = of("gmd")

                @JvmField val GYD = of("gyd")

                @JvmField val HKD = of("hkd")

                @JvmField val HRK = of("hrk")

                @JvmField val HTG = of("htg")

                @JvmField val IDR = of("idr")

                @JvmField val ILS = of("ils")

                @JvmField val INR = of("inr")

                @JvmField val ISK = of("isk")

                @JvmField val JMD = of("jmd")

                @JvmField val JPY = of("jpy")

                @JvmField val KES = of("kes")

                @JvmField val KGS = of("kgs")

                @JvmField val KHR = of("khr")

                @JvmField val KMF = of("kmf")

                @JvmField val KRW = of("krw")

                @JvmField val KYD = of("kyd")

                @JvmField val KZT = of("kzt")

                @JvmField val LBP = of("lbp")

                @JvmField val LKR = of("lkr")

                @JvmField val LRD = of("lrd")

                @JvmField val LSL = of("lsl")

                @JvmField val MAD = of("mad")

                @JvmField val MDL = of("mdl")

                @JvmField val MGA = of("mga")

                @JvmField val MKD = of("mkd")

                @JvmField val MMK = of("mmk")

                @JvmField val MNT = of("mnt")

                @JvmField val MOP = of("mop")

                @JvmField val MRO = of("mro")

                @JvmField val MVR = of("mvr")

                @JvmField val MWK = of("mwk")

                @JvmField val MXN = of("mxn")

                @JvmField val MYR = of("myr")

                @JvmField val MZN = of("mzn")

                @JvmField val NAD = of("nad")

                @JvmField val NGN = of("ngn")

                @JvmField val NOK = of("nok")

                @JvmField val NPR = of("npr")

                @JvmField val NZD = of("nzd")

                @JvmField val PGK = of("pgk")

                @JvmField val PHP = of("php")

                @JvmField val PKR = of("pkr")

                @JvmField val PLN = of("pln")

                @JvmField val QAR = of("qar")

                @JvmField val RON = of("ron")

                @JvmField val RSD = of("rsd")

                @JvmField val RUB = of("rub")

                @JvmField val RWF = of("rwf")

                @JvmField val SAR = of("sar")

                @JvmField val SBD = of("sbd")

                @JvmField val SCR = of("scr")

                @JvmField val SEK = of("sek")

                @JvmField val SGD = of("sgd")

                @JvmField val SLE = of("sle")

                @JvmField val SLL = of("sll")

                @JvmField val SOS = of("sos")

                @JvmField val SZL = of("szl")

                @JvmField val THB = of("thb")

                @JvmField val TJS = of("tjs")

                @JvmField val TOP = of("top")

                @JvmField val TRY = of("try")

                @JvmField val TTD = of("ttd")

                @JvmField val TZS = of("tzs")

                @JvmField val UAH = of("uah")

                @JvmField val UZS = of("uzs")

                @JvmField val VND = of("vnd")

                @JvmField val VUV = of("vuv")

                @JvmField val WST = of("wst")

                @JvmField val XAF = of("xaf")

                @JvmField val XCD = of("xcd")

                @JvmField val YER = of("yer")

                @JvmField val ZAR = of("zar")

                @JvmField val ZMW = of("zmw")

                @JvmField val CLP = of("clp")

                @JvmField val DJF = of("djf")

                @JvmField val GNF = of("gnf")

                @JvmField val UGX = of("ugx")

                @JvmField val PYG = of("pyg")

                @JvmField val XOF = of("xof")

                @JvmField val XPF = of("xpf")

                @JvmStatic fun of(value: String) = BillingCurrency(JsonField.of(value))
            }

            /** An enum containing [BillingCurrency]'s known values. */
            enum class Known {
                USD,
                AED,
                ALL,
                AMD,
                ANG,
                AUD,
                AWG,
                AZN,
                BAM,
                BBD,
                BDT,
                BGN,
                BIF,
                BMD,
                BND,
                BSD,
                BWP,
                BYN,
                BZD,
                BRL,
                CAD,
                CDF,
                CHF,
                CNY,
                CZK,
                DKK,
                DOP,
                DZD,
                EGP,
                ETB,
                EUR,
                FJD,
                GBP,
                GEL,
                GIP,
                GMD,
                GYD,
                HKD,
                HRK,
                HTG,
                IDR,
                ILS,
                INR,
                ISK,
                JMD,
                JPY,
                KES,
                KGS,
                KHR,
                KMF,
                KRW,
                KYD,
                KZT,
                LBP,
                LKR,
                LRD,
                LSL,
                MAD,
                MDL,
                MGA,
                MKD,
                MMK,
                MNT,
                MOP,
                MRO,
                MVR,
                MWK,
                MXN,
                MYR,
                MZN,
                NAD,
                NGN,
                NOK,
                NPR,
                NZD,
                PGK,
                PHP,
                PKR,
                PLN,
                QAR,
                RON,
                RSD,
                RUB,
                RWF,
                SAR,
                SBD,
                SCR,
                SEK,
                SGD,
                SLE,
                SLL,
                SOS,
                SZL,
                THB,
                TJS,
                TOP,
                TRY,
                TTD,
                TZS,
                UAH,
                UZS,
                VND,
                VUV,
                WST,
                XAF,
                XCD,
                YER,
                ZAR,
                ZMW,
                CLP,
                DJF,
                GNF,
                UGX,
                PYG,
                XOF,
                XPF,
            }

            /**
             * An enum containing [BillingCurrency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillingCurrency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                USD,
                AED,
                ALL,
                AMD,
                ANG,
                AUD,
                AWG,
                AZN,
                BAM,
                BBD,
                BDT,
                BGN,
                BIF,
                BMD,
                BND,
                BSD,
                BWP,
                BYN,
                BZD,
                BRL,
                CAD,
                CDF,
                CHF,
                CNY,
                CZK,
                DKK,
                DOP,
                DZD,
                EGP,
                ETB,
                EUR,
                FJD,
                GBP,
                GEL,
                GIP,
                GMD,
                GYD,
                HKD,
                HRK,
                HTG,
                IDR,
                ILS,
                INR,
                ISK,
                JMD,
                JPY,
                KES,
                KGS,
                KHR,
                KMF,
                KRW,
                KYD,
                KZT,
                LBP,
                LKR,
                LRD,
                LSL,
                MAD,
                MDL,
                MGA,
                MKD,
                MMK,
                MNT,
                MOP,
                MRO,
                MVR,
                MWK,
                MXN,
                MYR,
                MZN,
                NAD,
                NGN,
                NOK,
                NPR,
                NZD,
                PGK,
                PHP,
                PKR,
                PLN,
                QAR,
                RON,
                RSD,
                RUB,
                RWF,
                SAR,
                SBD,
                SCR,
                SEK,
                SGD,
                SLE,
                SLL,
                SOS,
                SZL,
                THB,
                TJS,
                TOP,
                TRY,
                TTD,
                TZS,
                UAH,
                UZS,
                VND,
                VUV,
                WST,
                XAF,
                XCD,
                YER,
                ZAR,
                ZMW,
                CLP,
                DJF,
                GNF,
                UGX,
                PYG,
                XOF,
                XPF,
                /**
                 * An enum member indicating that [BillingCurrency] was instantiated with an unknown
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
                    USD -> Value.USD
                    AED -> Value.AED
                    ALL -> Value.ALL
                    AMD -> Value.AMD
                    ANG -> Value.ANG
                    AUD -> Value.AUD
                    AWG -> Value.AWG
                    AZN -> Value.AZN
                    BAM -> Value.BAM
                    BBD -> Value.BBD
                    BDT -> Value.BDT
                    BGN -> Value.BGN
                    BIF -> Value.BIF
                    BMD -> Value.BMD
                    BND -> Value.BND
                    BSD -> Value.BSD
                    BWP -> Value.BWP
                    BYN -> Value.BYN
                    BZD -> Value.BZD
                    BRL -> Value.BRL
                    CAD -> Value.CAD
                    CDF -> Value.CDF
                    CHF -> Value.CHF
                    CNY -> Value.CNY
                    CZK -> Value.CZK
                    DKK -> Value.DKK
                    DOP -> Value.DOP
                    DZD -> Value.DZD
                    EGP -> Value.EGP
                    ETB -> Value.ETB
                    EUR -> Value.EUR
                    FJD -> Value.FJD
                    GBP -> Value.GBP
                    GEL -> Value.GEL
                    GIP -> Value.GIP
                    GMD -> Value.GMD
                    GYD -> Value.GYD
                    HKD -> Value.HKD
                    HRK -> Value.HRK
                    HTG -> Value.HTG
                    IDR -> Value.IDR
                    ILS -> Value.ILS
                    INR -> Value.INR
                    ISK -> Value.ISK
                    JMD -> Value.JMD
                    JPY -> Value.JPY
                    KES -> Value.KES
                    KGS -> Value.KGS
                    KHR -> Value.KHR
                    KMF -> Value.KMF
                    KRW -> Value.KRW
                    KYD -> Value.KYD
                    KZT -> Value.KZT
                    LBP -> Value.LBP
                    LKR -> Value.LKR
                    LRD -> Value.LRD
                    LSL -> Value.LSL
                    MAD -> Value.MAD
                    MDL -> Value.MDL
                    MGA -> Value.MGA
                    MKD -> Value.MKD
                    MMK -> Value.MMK
                    MNT -> Value.MNT
                    MOP -> Value.MOP
                    MRO -> Value.MRO
                    MVR -> Value.MVR
                    MWK -> Value.MWK
                    MXN -> Value.MXN
                    MYR -> Value.MYR
                    MZN -> Value.MZN
                    NAD -> Value.NAD
                    NGN -> Value.NGN
                    NOK -> Value.NOK
                    NPR -> Value.NPR
                    NZD -> Value.NZD
                    PGK -> Value.PGK
                    PHP -> Value.PHP
                    PKR -> Value.PKR
                    PLN -> Value.PLN
                    QAR -> Value.QAR
                    RON -> Value.RON
                    RSD -> Value.RSD
                    RUB -> Value.RUB
                    RWF -> Value.RWF
                    SAR -> Value.SAR
                    SBD -> Value.SBD
                    SCR -> Value.SCR
                    SEK -> Value.SEK
                    SGD -> Value.SGD
                    SLE -> Value.SLE
                    SLL -> Value.SLL
                    SOS -> Value.SOS
                    SZL -> Value.SZL
                    THB -> Value.THB
                    TJS -> Value.TJS
                    TOP -> Value.TOP
                    TRY -> Value.TRY
                    TTD -> Value.TTD
                    TZS -> Value.TZS
                    UAH -> Value.UAH
                    UZS -> Value.UZS
                    VND -> Value.VND
                    VUV -> Value.VUV
                    WST -> Value.WST
                    XAF -> Value.XAF
                    XCD -> Value.XCD
                    YER -> Value.YER
                    ZAR -> Value.ZAR
                    ZMW -> Value.ZMW
                    CLP -> Value.CLP
                    DJF -> Value.DJF
                    GNF -> Value.GNF
                    UGX -> Value.UGX
                    PYG -> Value.PYG
                    XOF -> Value.XOF
                    XPF -> Value.XPF
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
                    USD -> Known.USD
                    AED -> Known.AED
                    ALL -> Known.ALL
                    AMD -> Known.AMD
                    ANG -> Known.ANG
                    AUD -> Known.AUD
                    AWG -> Known.AWG
                    AZN -> Known.AZN
                    BAM -> Known.BAM
                    BBD -> Known.BBD
                    BDT -> Known.BDT
                    BGN -> Known.BGN
                    BIF -> Known.BIF
                    BMD -> Known.BMD
                    BND -> Known.BND
                    BSD -> Known.BSD
                    BWP -> Known.BWP
                    BYN -> Known.BYN
                    BZD -> Known.BZD
                    BRL -> Known.BRL
                    CAD -> Known.CAD
                    CDF -> Known.CDF
                    CHF -> Known.CHF
                    CNY -> Known.CNY
                    CZK -> Known.CZK
                    DKK -> Known.DKK
                    DOP -> Known.DOP
                    DZD -> Known.DZD
                    EGP -> Known.EGP
                    ETB -> Known.ETB
                    EUR -> Known.EUR
                    FJD -> Known.FJD
                    GBP -> Known.GBP
                    GEL -> Known.GEL
                    GIP -> Known.GIP
                    GMD -> Known.GMD
                    GYD -> Known.GYD
                    HKD -> Known.HKD
                    HRK -> Known.HRK
                    HTG -> Known.HTG
                    IDR -> Known.IDR
                    ILS -> Known.ILS
                    INR -> Known.INR
                    ISK -> Known.ISK
                    JMD -> Known.JMD
                    JPY -> Known.JPY
                    KES -> Known.KES
                    KGS -> Known.KGS
                    KHR -> Known.KHR
                    KMF -> Known.KMF
                    KRW -> Known.KRW
                    KYD -> Known.KYD
                    KZT -> Known.KZT
                    LBP -> Known.LBP
                    LKR -> Known.LKR
                    LRD -> Known.LRD
                    LSL -> Known.LSL
                    MAD -> Known.MAD
                    MDL -> Known.MDL
                    MGA -> Known.MGA
                    MKD -> Known.MKD
                    MMK -> Known.MMK
                    MNT -> Known.MNT
                    MOP -> Known.MOP
                    MRO -> Known.MRO
                    MVR -> Known.MVR
                    MWK -> Known.MWK
                    MXN -> Known.MXN
                    MYR -> Known.MYR
                    MZN -> Known.MZN
                    NAD -> Known.NAD
                    NGN -> Known.NGN
                    NOK -> Known.NOK
                    NPR -> Known.NPR
                    NZD -> Known.NZD
                    PGK -> Known.PGK
                    PHP -> Known.PHP
                    PKR -> Known.PKR
                    PLN -> Known.PLN
                    QAR -> Known.QAR
                    RON -> Known.RON
                    RSD -> Known.RSD
                    RUB -> Known.RUB
                    RWF -> Known.RWF
                    SAR -> Known.SAR
                    SBD -> Known.SBD
                    SCR -> Known.SCR
                    SEK -> Known.SEK
                    SGD -> Known.SGD
                    SLE -> Known.SLE
                    SLL -> Known.SLL
                    SOS -> Known.SOS
                    SZL -> Known.SZL
                    THB -> Known.THB
                    TJS -> Known.TJS
                    TOP -> Known.TOP
                    TRY -> Known.TRY
                    TTD -> Known.TTD
                    TZS -> Known.TZS
                    UAH -> Known.UAH
                    UZS -> Known.UZS
                    VND -> Known.VND
                    VUV -> Known.VUV
                    WST -> Known.WST
                    XAF -> Known.XAF
                    XCD -> Known.XCD
                    YER -> Known.YER
                    ZAR -> Known.ZAR
                    ZMW -> Known.ZMW
                    CLP -> Known.CLP
                    DJF -> Known.DJF
                    GNF -> Known.GNF
                    UGX -> Known.UGX
                    PYG -> Known.PYG
                    XOF -> Known.XOF
                    XPF -> Known.XPF
                    else -> throw StiggInvalidDataException("Unknown BillingCurrency: $value")
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

            fun validate(): BillingCurrency = apply {
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

                return other is BillingCurrency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The default payment method details */
        class DefaultPaymentMethod
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val billingId: JsonField<String>,
            private val cardExpiryMonth: JsonField<Double>,
            private val cardExpiryYear: JsonField<Double>,
            private val cardLast4Digits: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billingId")
                @ExcludeMissing
                billingId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cardExpiryMonth")
                @ExcludeMissing
                cardExpiryMonth: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cardExpiryYear")
                @ExcludeMissing
                cardExpiryYear: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cardLast4Digits")
                @ExcludeMissing
                cardLast4Digits: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(
                billingId,
                cardExpiryMonth,
                cardExpiryYear,
                cardLast4Digits,
                type,
                mutableMapOf(),
            )

            /**
             * The default payment method id
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billingId(): Optional<String> = billingId.getOptional("billingId")

            /**
             * The expiration month of the default payment method
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cardExpiryMonth(): Optional<Double> = cardExpiryMonth.getOptional("cardExpiryMonth")

            /**
             * The expiration year of the default payment method
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cardExpiryYear(): Optional<Double> = cardExpiryYear.getOptional("cardExpiryYear")

            /**
             * The last 4 digits of the default payment method
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cardLast4Digits(): Optional<String> = cardLast4Digits.getOptional("cardLast4Digits")

            /**
             * The default payment method type
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

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
             * Returns the raw JSON value of [cardExpiryMonth].
             *
             * Unlike [cardExpiryMonth], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cardExpiryMonth")
            @ExcludeMissing
            fun _cardExpiryMonth(): JsonField<Double> = cardExpiryMonth

            /**
             * Returns the raw JSON value of [cardExpiryYear].
             *
             * Unlike [cardExpiryYear], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cardExpiryYear")
            @ExcludeMissing
            fun _cardExpiryYear(): JsonField<Double> = cardExpiryYear

            /**
             * Returns the raw JSON value of [cardLast4Digits].
             *
             * Unlike [cardLast4Digits], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cardLast4Digits")
            @ExcludeMissing
            fun _cardLast4Digits(): JsonField<String> = cardLast4Digits

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [DefaultPaymentMethod].
                 *
                 * The following fields are required:
                 * ```java
                 * .billingId()
                 * .cardExpiryMonth()
                 * .cardExpiryYear()
                 * .cardLast4Digits()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DefaultPaymentMethod]. */
            class Builder internal constructor() {

                private var billingId: JsonField<String>? = null
                private var cardExpiryMonth: JsonField<Double>? = null
                private var cardExpiryYear: JsonField<Double>? = null
                private var cardLast4Digits: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(defaultPaymentMethod: DefaultPaymentMethod) = apply {
                    billingId = defaultPaymentMethod.billingId
                    cardExpiryMonth = defaultPaymentMethod.cardExpiryMonth
                    cardExpiryYear = defaultPaymentMethod.cardExpiryYear
                    cardLast4Digits = defaultPaymentMethod.cardLast4Digits
                    type = defaultPaymentMethod.type
                    additionalProperties = defaultPaymentMethod.additionalProperties.toMutableMap()
                }

                /** The default payment method id */
                fun billingId(billingId: String?) = billingId(JsonField.ofNullable(billingId))

                /** Alias for calling [Builder.billingId] with `billingId.orElse(null)`. */
                fun billingId(billingId: Optional<String>) = billingId(billingId.getOrNull())

                /**
                 * Sets [Builder.billingId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun billingId(billingId: JsonField<String>) = apply { this.billingId = billingId }

                /** The expiration month of the default payment method */
                fun cardExpiryMonth(cardExpiryMonth: Double?) =
                    cardExpiryMonth(JsonField.ofNullable(cardExpiryMonth))

                /**
                 * Alias for [Builder.cardExpiryMonth].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun cardExpiryMonth(cardExpiryMonth: Double) =
                    cardExpiryMonth(cardExpiryMonth as Double?)

                /**
                 * Alias for calling [Builder.cardExpiryMonth] with `cardExpiryMonth.orElse(null)`.
                 */
                fun cardExpiryMonth(cardExpiryMonth: Optional<Double>) =
                    cardExpiryMonth(cardExpiryMonth.getOrNull())

                /**
                 * Sets [Builder.cardExpiryMonth] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardExpiryMonth] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cardExpiryMonth(cardExpiryMonth: JsonField<Double>) = apply {
                    this.cardExpiryMonth = cardExpiryMonth
                }

                /** The expiration year of the default payment method */
                fun cardExpiryYear(cardExpiryYear: Double?) =
                    cardExpiryYear(JsonField.ofNullable(cardExpiryYear))

                /**
                 * Alias for [Builder.cardExpiryYear].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun cardExpiryYear(cardExpiryYear: Double) =
                    cardExpiryYear(cardExpiryYear as Double?)

                /**
                 * Alias for calling [Builder.cardExpiryYear] with `cardExpiryYear.orElse(null)`.
                 */
                fun cardExpiryYear(cardExpiryYear: Optional<Double>) =
                    cardExpiryYear(cardExpiryYear.getOrNull())

                /**
                 * Sets [Builder.cardExpiryYear] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardExpiryYear] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardExpiryYear(cardExpiryYear: JsonField<Double>) = apply {
                    this.cardExpiryYear = cardExpiryYear
                }

                /** The last 4 digits of the default payment method */
                fun cardLast4Digits(cardLast4Digits: String?) =
                    cardLast4Digits(JsonField.ofNullable(cardLast4Digits))

                /**
                 * Alias for calling [Builder.cardLast4Digits] with `cardLast4Digits.orElse(null)`.
                 */
                fun cardLast4Digits(cardLast4Digits: Optional<String>) =
                    cardLast4Digits(cardLast4Digits.getOrNull())

                /**
                 * Sets [Builder.cardLast4Digits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardLast4Digits] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cardLast4Digits(cardLast4Digits: JsonField<String>) = apply {
                    this.cardLast4Digits = cardLast4Digits
                }

                /** The default payment method type */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [DefaultPaymentMethod].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .billingId()
                 * .cardExpiryMonth()
                 * .cardExpiryYear()
                 * .cardLast4Digits()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DefaultPaymentMethod =
                    DefaultPaymentMethod(
                        checkRequired("billingId", billingId),
                        checkRequired("cardExpiryMonth", cardExpiryMonth),
                        checkRequired("cardExpiryYear", cardExpiryYear),
                        checkRequired("cardLast4Digits", cardLast4Digits),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DefaultPaymentMethod = apply {
                if (validated) {
                    return@apply
                }

                billingId()
                cardExpiryMonth()
                cardExpiryYear()
                cardLast4Digits()
                type().validate()
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
                    (if (cardExpiryMonth.asKnown().isPresent) 1 else 0) +
                    (if (cardExpiryYear.asKnown().isPresent) 1 else 0) +
                    (if (cardLast4Digits.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** The default payment method type */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CARD = of("CARD")

                    @JvmField val BANK = of("BANK")

                    @JvmField val CASH_APP = of("CASH_APP")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CARD,
                    BANK,
                    CASH_APP,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CARD,
                    BANK,
                    CASH_APP,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CARD -> Value.CARD
                        BANK -> Value.BANK
                        CASH_APP -> Value.CASH_APP
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
                        CARD -> Known.CARD
                        BANK -> Known.BANK
                        CASH_APP -> Known.CASH_APP
                        else -> throw StiggInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StiggInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DefaultPaymentMethod &&
                    billingId == other.billingId &&
                    cardExpiryMonth == other.cardExpiryMonth &&
                    cardExpiryYear == other.cardExpiryYear &&
                    cardLast4Digits == other.cardLast4Digits &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    billingId,
                    cardExpiryMonth,
                    cardExpiryYear,
                    cardLast4Digits,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DefaultPaymentMethod{billingId=$billingId, cardExpiryMonth=$cardExpiryMonth, cardExpiryYear=$cardExpiryYear, cardLast4Digits=$cardLast4Digits, type=$type, additionalProperties=$additionalProperties}"
        }

        /** External billing or CRM integration link */
        class Integration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val syncedEntityId: JsonField<String>,
            private val vendorIdentifier: JsonField<VendorIdentifier>,
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
            ) : this(id, syncedEntityId, vendorIdentifier, mutableMapOf())

            /**
             * Integration details
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Synced entity id
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun syncedEntityId(): Optional<String> = syncedEntityId.getOptional("syncedEntityId")

            /**
             * The vendor identifier of integration
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun vendorIdentifier(): VendorIdentifier =
                vendorIdentifier.getRequired("vendorIdentifier")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [syncedEntityId].
             *
             * Unlike [syncedEntityId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("syncedEntityId")
            @ExcludeMissing
            fun _syncedEntityId(): JsonField<String> = syncedEntityId

            /**
             * Returns the raw JSON value of [vendorIdentifier].
             *
             * Unlike [vendorIdentifier], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [Integration].
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

            /** A builder for [Integration]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var syncedEntityId: JsonField<String>? = null
                private var vendorIdentifier: JsonField<VendorIdentifier>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(integration: Integration) = apply {
                    id = integration.id
                    syncedEntityId = integration.syncedEntityId
                    vendorIdentifier = integration.vendorIdentifier
                    additionalProperties = integration.additionalProperties.toMutableMap()
                }

                /** Integration details */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Synced entity id */
                fun syncedEntityId(syncedEntityId: String?) =
                    syncedEntityId(JsonField.ofNullable(syncedEntityId))

                /**
                 * Alias for calling [Builder.syncedEntityId] with `syncedEntityId.orElse(null)`.
                 */
                fun syncedEntityId(syncedEntityId: Optional<String>) =
                    syncedEntityId(syncedEntityId.getOrNull())

                /**
                 * Sets [Builder.syncedEntityId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.syncedEntityId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * [VendorIdentifier] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
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
                 * Returns an immutable instance of [Integration].
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
                fun build(): Integration =
                    Integration(
                        checkRequired("id", id),
                        checkRequired("syncedEntityId", syncedEntityId),
                        checkRequired("vendorIdentifier", vendorIdentifier),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Integration = apply {
                if (validated) {
                    return@apply
                }

                id()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (syncedEntityId.asKnown().isPresent) 1 else 0) +
                    (vendorIdentifier.asKnown().getOrNull()?.validity() ?: 0)

            /** The vendor identifier of integration */
            class VendorIdentifier
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                }

                /**
                 * An enum containing [VendorIdentifier]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [VendorIdentifier] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                        else -> throw StiggInvalidDataException("Unknown VendorIdentifier: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        StiggInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

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

                return other is Integration &&
                    id == other.id &&
                    syncedEntityId == other.syncedEntityId &&
                    vendorIdentifier == other.vendorIdentifier &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, syncedEntityId, vendorIdentifier, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Integration{id=$id, syncedEntityId=$syncedEntityId, vendorIdentifier=$vendorIdentifier, additionalProperties=$additionalProperties}"
        }

        /** Additional metadata */
        class Metadata
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

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
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

                return other is Metadata && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                archivedAt == other.archivedAt &&
                createdAt == other.createdAt &&
                updatedAt == other.updatedAt &&
                billingCurrency == other.billingCurrency &&
                billingId == other.billingId &&
                couponId == other.couponId &&
                defaultPaymentMethod == other.defaultPaymentMethod &&
                email == other.email &&
                integrations == other.integrations &&
                metadata == other.metadata &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                archivedAt,
                createdAt,
                updatedAt,
                billingCurrency,
                billingId,
                couponId,
                defaultPaymentMethod,
                email,
                integrations,
                metadata,
                name,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, archivedAt=$archivedAt, createdAt=$createdAt, updatedAt=$updatedAt, billingCurrency=$billingCurrency, billingId=$billingId, couponId=$couponId, defaultPaymentMethod=$defaultPaymentMethod, email=$email, integrations=$integrations, metadata=$metadata, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerResponse{data=$data, additionalProperties=$additionalProperties}"
}
