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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws StiggInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
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
        private val couponId: JsonField<CouponId>,
        private val defaultPaymentMethod: JsonField<DefaultPaymentMethod>,
        private val email: JsonField<String>,
        private val integrations: JsonField<List<Integration>>,
        private val language: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val passthrough: JsonField<Passthrough>,
        private val timezone: JsonField<String>,
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
            couponId: JsonField<CouponId> = JsonMissing.of(),
            @JsonProperty("defaultPaymentMethod")
            @ExcludeMissing
            defaultPaymentMethod: JsonField<DefaultPaymentMethod> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integrations")
            @ExcludeMissing
            integrations: JsonField<List<Integration>> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("passthrough")
            @ExcludeMissing
            passthrough: JsonField<Passthrough> = JsonMissing.of(),
            @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
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
            language,
            metadata,
            name,
            passthrough,
            timezone,
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
        fun couponId(): Optional<CouponId> = couponId.getOptional("couponId")

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
         * Language to use for this customer
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * Custom key-value metadata to attach to the customer. When creating a customer, this sets
         * the initial metadata. When updating a customer, this replaces the customer's existing
         * metadata object entirely — it is not merged key by key. Omit this field on update to
         * leave the customer's existing metadata untouched; pass an empty object to clear it.
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
         * Vendor-specific billing passthrough fields.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun passthrough(): Optional<Passthrough> = passthrough.getOptional("passthrough")

        /**
         * Timezone to use for this customer
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timezone(): Optional<String> = timezone.getOptional("timezone")

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
        @JsonProperty("couponId") @ExcludeMissing fun _couponId(): JsonField<CouponId> = couponId

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
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

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

        /**
         * Returns the raw JSON value of [passthrough].
         *
         * Unlike [passthrough], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("passthrough")
        @ExcludeMissing
        fun _passthrough(): JsonField<Passthrough> = passthrough

        /**
         * Returns the raw JSON value of [timezone].
         *
         * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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
            private var couponId: JsonField<CouponId> = JsonMissing.of()
            private var defaultPaymentMethod: JsonField<DefaultPaymentMethod> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var integrations: JsonField<MutableList<Integration>>? = null
            private var language: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var passthrough: JsonField<Passthrough> = JsonMissing.of()
            private var timezone: JsonField<String> = JsonMissing.of()
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
                language = data.language
                metadata = data.metadata
                name = data.name
                passthrough = data.passthrough
                timezone = data.timezone
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
            fun couponId(couponId: CouponId?) = couponId(JsonField.ofNullable(couponId))

            /** Alias for calling [Builder.couponId] with `couponId.orElse(null)`. */
            fun couponId(couponId: Optional<CouponId>) = couponId(couponId.getOrNull())

            /**
             * Sets [Builder.couponId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.couponId] with a well-typed [CouponId] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun couponId(couponId: JsonField<CouponId>) = apply { this.couponId = couponId }

            /**
             * Sets [couponId] to an arbitrary [String].
             *
             * You should usually call [couponId] with a well-typed [CouponId] constant instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun couponId(value: String) = couponId(CouponId.of(value))

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

            /** Language to use for this customer */
            fun language(language: String?) = language(JsonField.ofNullable(language))

            /** Alias for calling [Builder.language] with `language.orElse(null)`. */
            fun language(language: Optional<String>) = language(language.getOrNull())

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /**
             * Custom key-value metadata to attach to the customer. When creating a customer, this
             * sets the initial metadata. When updating a customer, this replaces the customer's
             * existing metadata object entirely — it is not merged key by key. Omit this field on
             * update to leave the customer's existing metadata untouched; pass an empty object to
             * clear it.
             */
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

            /** Vendor-specific billing passthrough fields. */
            fun passthrough(passthrough: Passthrough) = passthrough(JsonField.of(passthrough))

            /**
             * Sets [Builder.passthrough] to an arbitrary JSON value.
             *
             * You should usually call [Builder.passthrough] with a well-typed [Passthrough] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun passthrough(passthrough: JsonField<Passthrough>) = apply {
                this.passthrough = passthrough
            }

            /** Timezone to use for this customer */
            fun timezone(timezone: String?) = timezone(JsonField.ofNullable(timezone))

            /** Alias for calling [Builder.timezone] with `timezone.orElse(null)`. */
            fun timezone(timezone: Optional<String>) = timezone(timezone.getOrNull())

            /**
             * Sets [Builder.timezone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
                    language,
                    metadata,
                    name,
                    passthrough,
                    timezone,
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
            archivedAt()
            createdAt()
            updatedAt()
            billingCurrency().ifPresent { it.validate() }
            billingId()
            couponId()
            defaultPaymentMethod().ifPresent { it.validate() }
            email()
            integrations().ifPresent { it.forEach { it.validate() } }
            language()
            metadata().ifPresent { it.validate() }
            name()
            passthrough().ifPresent { it.validate() }
            timezone()
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
                (if (language.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (passthrough.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timezone.asKnown().isPresent) 1 else 0)

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

        /** Customer level coupon */
        class CouponId @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val EMPTY = of("")

                @JvmStatic fun of(value: String) = CouponId(JsonField.of(value))
            }

            /** An enum containing [CouponId]'s known values. */
            enum class Known {
                EMPTY
            }

            /**
             * An enum containing [CouponId]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [CouponId] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMPTY,
                /**
                 * An enum member indicating that [CouponId] was instantiated with an unknown value.
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
                    EMPTY -> Value.EMPTY
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
                    EMPTY -> Known.EMPTY
                    else -> throw StiggInvalidDataException("Unknown CouponId: $value")
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
            fun validate(): CouponId = apply {
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

                return other is CouponId && value == other.value
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

        /**
         * Links this customer to their record in a specific configured integration (e.g. their
         * Stripe customer ID under your Stripe integration). A customer has at most one link per
         * integration.
         */
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
             * The internal ID of the integration this record is linked to
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * The external entity ID this record is linked to in the vendor system (e.g. the Stripe
             * customer ID). Null until the link has synced; required when creating the link.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun syncedEntityId(): Optional<String> = syncedEntityId.getOptional("syncedEntityId")

            /**
             * The vendor identifier of the integration (e.g. STRIPE, SALESFORCE, SNOWFLAKE)
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

                /** The internal ID of the integration this record is linked to */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The external entity ID this record is linked to in the vendor system (e.g. the
                 * Stripe customer ID). Null until the link has synced; required when creating the
                 * link.
                 */
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

                /** The vendor identifier of the integration (e.g. STRIPE, SALESFORCE, SNOWFLAKE) */
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

            /** The vendor identifier of the integration (e.g. STRIPE, SALESFORCE, SNOWFLAKE) */
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
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws StiggInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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

        /**
         * Custom key-value metadata to attach to the customer. When creating a customer, this sets
         * the initial metadata. When updating a customer, this replaces the customer's existing
         * metadata object entirely — it is not merged key by key. Omit this field on update to
         * leave the customer's existing metadata untouched; pass an empty object to clear it.
         */
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

        /** Vendor-specific billing passthrough fields. */
        class Passthrough
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val stripe: JsonField<Stripe>,
            private val zuora: JsonField<Zuora>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("stripe")
                @ExcludeMissing
                stripe: JsonField<Stripe> = JsonMissing.of(),
                @JsonProperty("zuora") @ExcludeMissing zuora: JsonField<Zuora> = JsonMissing.of(),
            ) : this(stripe, zuora, mutableMapOf())

            /**
             * Stripe-specific billing fields for the customer.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun stripe(): Optional<Stripe> = stripe.getOptional("stripe")

            /**
             * Zuora-specific billing fields for the customer.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun zuora(): Optional<Zuora> = zuora.getOptional("zuora")

            /**
             * Returns the raw JSON value of [stripe].
             *
             * Unlike [stripe], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("stripe") @ExcludeMissing fun _stripe(): JsonField<Stripe> = stripe

            /**
             * Returns the raw JSON value of [zuora].
             *
             * Unlike [zuora], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("zuora") @ExcludeMissing fun _zuora(): JsonField<Zuora> = zuora

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

                /** Returns a mutable builder for constructing an instance of [Passthrough]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Passthrough]. */
            class Builder internal constructor() {

                private var stripe: JsonField<Stripe> = JsonMissing.of()
                private var zuora: JsonField<Zuora> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(passthrough: Passthrough) = apply {
                    stripe = passthrough.stripe
                    zuora = passthrough.zuora
                    additionalProperties = passthrough.additionalProperties.toMutableMap()
                }

                /** Stripe-specific billing fields for the customer. */
                fun stripe(stripe: Stripe) = stripe(JsonField.of(stripe))

                /**
                 * Sets [Builder.stripe] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stripe] with a well-typed [Stripe] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stripe(stripe: JsonField<Stripe>) = apply { this.stripe = stripe }

                /** Zuora-specific billing fields for the customer. */
                fun zuora(zuora: Zuora) = zuora(JsonField.of(zuora))

                /**
                 * Sets [Builder.zuora] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zuora] with a well-typed [Zuora] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun zuora(zuora: JsonField<Zuora>) = apply { this.zuora = zuora }

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
                 * Returns an immutable instance of [Passthrough].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Passthrough =
                    Passthrough(stripe, zuora, additionalProperties.toMutableMap())
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
            fun validate(): Passthrough = apply {
                if (validated) {
                    return@apply
                }

                stripe().ifPresent { it.validate() }
                zuora().ifPresent { it.validate() }
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
                (stripe.asKnown().getOrNull()?.validity() ?: 0) +
                    (zuora.asKnown().getOrNull()?.validity() ?: 0)

            /** Stripe-specific billing fields for the customer. */
            class Stripe
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val billingAddress: JsonField<BillingAddress>,
                private val customerName: JsonField<String>,
                private val invoiceCustomFields: JsonField<InvoiceCustomFields>,
                private val metadata: JsonField<Metadata>,
                private val paymentMethodId: JsonField<String>,
                private val shippingAddress: JsonField<ShippingAddress>,
                private val taxIds: JsonField<List<TaxId>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("billingAddress")
                    @ExcludeMissing
                    billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
                    @JsonProperty("customerName")
                    @ExcludeMissing
                    customerName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("invoiceCustomFields")
                    @ExcludeMissing
                    invoiceCustomFields: JsonField<InvoiceCustomFields> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonProperty("paymentMethodId")
                    @ExcludeMissing
                    paymentMethodId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("shippingAddress")
                    @ExcludeMissing
                    shippingAddress: JsonField<ShippingAddress> = JsonMissing.of(),
                    @JsonProperty("taxIds")
                    @ExcludeMissing
                    taxIds: JsonField<List<TaxId>> = JsonMissing.of(),
                ) : this(
                    billingAddress,
                    customerName,
                    invoiceCustomFields,
                    metadata,
                    paymentMethodId,
                    shippingAddress,
                    taxIds,
                    mutableMapOf(),
                )

                /**
                 * Physical address
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun billingAddress(): Optional<BillingAddress> =
                    billingAddress.getOptional("billingAddress")

                /**
                 * Customer name
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun customerName(): Optional<String> = customerName.getOptional("customerName")

                /**
                 * Invoice custom fields
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun invoiceCustomFields(): Optional<InvoiceCustomFields> =
                    invoiceCustomFields.getOptional("invoiceCustomFields")

                /**
                 * Additional metadata to pass through to the billing provider on the customer's
                 * record there. This is separate from the customer's own metadata field — it's
                 * stored only on the billing-provider side, not on the Stigg customer object.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

                /**
                 * Billing provider payment method id, attached to this customer
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun paymentMethodId(): Optional<String> =
                    paymentMethodId.getOptional("paymentMethodId")

                /**
                 * Physical address
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun shippingAddress(): Optional<ShippingAddress> =
                    shippingAddress.getOptional("shippingAddress")

                /**
                 * Tax IDs
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun taxIds(): Optional<List<TaxId>> = taxIds.getOptional("taxIds")

                /**
                 * Returns the raw JSON value of [billingAddress].
                 *
                 * Unlike [billingAddress], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billingAddress")
                @ExcludeMissing
                fun _billingAddress(): JsonField<BillingAddress> = billingAddress

                /**
                 * Returns the raw JSON value of [customerName].
                 *
                 * Unlike [customerName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("customerName")
                @ExcludeMissing
                fun _customerName(): JsonField<String> = customerName

                /**
                 * Returns the raw JSON value of [invoiceCustomFields].
                 *
                 * Unlike [invoiceCustomFields], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoiceCustomFields")
                @ExcludeMissing
                fun _invoiceCustomFields(): JsonField<InvoiceCustomFields> = invoiceCustomFields

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * Returns the raw JSON value of [paymentMethodId].
                 *
                 * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("paymentMethodId")
                @ExcludeMissing
                fun _paymentMethodId(): JsonField<String> = paymentMethodId

                /**
                 * Returns the raw JSON value of [shippingAddress].
                 *
                 * Unlike [shippingAddress], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("shippingAddress")
                @ExcludeMissing
                fun _shippingAddress(): JsonField<ShippingAddress> = shippingAddress

                /**
                 * Returns the raw JSON value of [taxIds].
                 *
                 * Unlike [taxIds], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("taxIds")
                @ExcludeMissing
                fun _taxIds(): JsonField<List<TaxId>> = taxIds

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

                    /** Returns a mutable builder for constructing an instance of [Stripe]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Stripe]. */
                class Builder internal constructor() {

                    private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
                    private var customerName: JsonField<String> = JsonMissing.of()
                    private var invoiceCustomFields: JsonField<InvoiceCustomFields> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var paymentMethodId: JsonField<String> = JsonMissing.of()
                    private var shippingAddress: JsonField<ShippingAddress> = JsonMissing.of()
                    private var taxIds: JsonField<MutableList<TaxId>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stripe: Stripe) = apply {
                        billingAddress = stripe.billingAddress
                        customerName = stripe.customerName
                        invoiceCustomFields = stripe.invoiceCustomFields
                        metadata = stripe.metadata
                        paymentMethodId = stripe.paymentMethodId
                        shippingAddress = stripe.shippingAddress
                        taxIds = stripe.taxIds.map { it.toMutableList() }
                        additionalProperties = stripe.additionalProperties.toMutableMap()
                    }

                    /** Physical address */
                    fun billingAddress(billingAddress: BillingAddress) =
                        billingAddress(JsonField.of(billingAddress))

                    /**
                     * Sets [Builder.billingAddress] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingAddress] with a well-typed
                     * [BillingAddress] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
                        this.billingAddress = billingAddress
                    }

                    /** Customer name */
                    fun customerName(customerName: String) =
                        customerName(JsonField.of(customerName))

                    /**
                     * Sets [Builder.customerName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.customerName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun customerName(customerName: JsonField<String>) = apply {
                        this.customerName = customerName
                    }

                    /** Invoice custom fields */
                    fun invoiceCustomFields(invoiceCustomFields: InvoiceCustomFields) =
                        invoiceCustomFields(JsonField.of(invoiceCustomFields))

                    /**
                     * Sets [Builder.invoiceCustomFields] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceCustomFields] with a well-typed
                     * [InvoiceCustomFields] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun invoiceCustomFields(invoiceCustomFields: JsonField<InvoiceCustomFields>) =
                        apply {
                            this.invoiceCustomFields = invoiceCustomFields
                        }

                    /**
                     * Additional metadata to pass through to the billing provider on the customer's
                     * record there. This is separate from the customer's own metadata field — it's
                     * stored only on the billing-provider side, not on the Stigg customer object.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /** Billing provider payment method id, attached to this customer */
                    fun paymentMethodId(paymentMethodId: String) =
                        paymentMethodId(JsonField.of(paymentMethodId))

                    /**
                     * Sets [Builder.paymentMethodId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.paymentMethodId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun paymentMethodId(paymentMethodId: JsonField<String>) = apply {
                        this.paymentMethodId = paymentMethodId
                    }

                    /** Physical address */
                    fun shippingAddress(shippingAddress: ShippingAddress) =
                        shippingAddress(JsonField.of(shippingAddress))

                    /**
                     * Sets [Builder.shippingAddress] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.shippingAddress] with a well-typed
                     * [ShippingAddress] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun shippingAddress(shippingAddress: JsonField<ShippingAddress>) = apply {
                        this.shippingAddress = shippingAddress
                    }

                    /** Tax IDs */
                    fun taxIds(taxIds: List<TaxId>) = taxIds(JsonField.of(taxIds))

                    /**
                     * Sets [Builder.taxIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.taxIds] with a well-typed `List<TaxId>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun taxIds(taxIds: JsonField<List<TaxId>>) = apply {
                        this.taxIds = taxIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [TaxId] to [taxIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTaxId(taxId: TaxId) = apply {
                        taxIds =
                            (taxIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("taxIds", it).add(taxId)
                            }
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
                     * Returns an immutable instance of [Stripe].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Stripe =
                        Stripe(
                            billingAddress,
                            customerName,
                            invoiceCustomFields,
                            metadata,
                            paymentMethodId,
                            shippingAddress,
                            (taxIds ?: JsonMissing.of()).map { it.toImmutable() },
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
                fun validate(): Stripe = apply {
                    if (validated) {
                        return@apply
                    }

                    billingAddress().ifPresent { it.validate() }
                    customerName()
                    invoiceCustomFields().ifPresent { it.validate() }
                    metadata().ifPresent { it.validate() }
                    paymentMethodId()
                    shippingAddress().ifPresent { it.validate() }
                    taxIds().ifPresent { it.forEach { it.validate() } }
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
                    (billingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (customerName.asKnown().isPresent) 1 else 0) +
                        (invoiceCustomFields.asKnown().getOrNull()?.validity() ?: 0) +
                        (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (paymentMethodId.asKnown().isPresent) 1 else 0) +
                        (shippingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                        (taxIds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                /** Physical address */
                class BillingAddress
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val city: JsonField<String>,
                    private val country: JsonField<String>,
                    private val line1: JsonField<String>,
                    private val line2: JsonField<String>,
                    private val postalCode: JsonField<String>,
                    private val state: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("city")
                        @ExcludeMissing
                        city: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("country")
                        @ExcludeMissing
                        country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("line1")
                        @ExcludeMissing
                        line1: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("line2")
                        @ExcludeMissing
                        line2: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("postalCode")
                        @ExcludeMissing
                        postalCode: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        state: JsonField<String> = JsonMissing.of(),
                    ) : this(city, country, line1, line2, postalCode, state, mutableMapOf())

                    /**
                     * City name
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun city(): Optional<String> = city.getOptional("city")

                    /**
                     * Country code or name
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun country(): Optional<String> = country.getOptional("country")

                    /**
                     * Street address line 1
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun line1(): Optional<String> = line1.getOptional("line1")

                    /**
                     * Street address line 2
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun line2(): Optional<String> = line2.getOptional("line2")

                    /**
                     * Postal or ZIP code
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun postalCode(): Optional<String> = postalCode.getOptional("postalCode")

                    /**
                     * State or province
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun state(): Optional<String> = state.getOptional("state")

                    /**
                     * Returns the raw JSON value of [city].
                     *
                     * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                    /**
                     * Returns the raw JSON value of [country].
                     *
                     * Unlike [country], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    /**
                     * Returns the raw JSON value of [line1].
                     *
                     * Unlike [line1], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    /**
                     * Returns the raw JSON value of [line2].
                     *
                     * Unlike [line2], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                    /**
                     * Returns the raw JSON value of [postalCode].
                     *
                     * Unlike [postalCode], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("postalCode")
                    @ExcludeMissing
                    fun _postalCode(): JsonField<String> = postalCode

                    /**
                     * Returns the raw JSON value of [state].
                     *
                     * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
                         * [BillingAddress].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [BillingAddress]. */
                    class Builder internal constructor() {

                        private var city: JsonField<String> = JsonMissing.of()
                        private var country: JsonField<String> = JsonMissing.of()
                        private var line1: JsonField<String> = JsonMissing.of()
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var postalCode: JsonField<String> = JsonMissing.of()
                        private var state: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(billingAddress: BillingAddress) = apply {
                            city = billingAddress.city
                            country = billingAddress.country
                            line1 = billingAddress.line1
                            line2 = billingAddress.line2
                            postalCode = billingAddress.postalCode
                            state = billingAddress.state
                            additionalProperties =
                                billingAddress.additionalProperties.toMutableMap()
                        }

                        /** City name */
                        fun city(city: String) = city(JsonField.of(city))

                        /**
                         * Sets [Builder.city] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.city] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /** Country code or name */
                        fun country(country: String) = country(JsonField.of(country))

                        /**
                         * Sets [Builder.country] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.country] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        /** Street address line 1 */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /**
                         * Sets [Builder.line1] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line1] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        /** Street address line 2 */
                        fun line2(line2: String) = line2(JsonField.of(line2))

                        /**
                         * Sets [Builder.line2] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line2] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        /** Postal or ZIP code */
                        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                        /**
                         * Sets [Builder.postalCode] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.postalCode] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun postalCode(postalCode: JsonField<String>) = apply {
                            this.postalCode = postalCode
                        }

                        /** State or province */
                        fun state(state: String) = state(JsonField.of(state))

                        /**
                         * Sets [Builder.state] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.state] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [BillingAddress].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): BillingAddress =
                            BillingAddress(
                                city,
                                country,
                                line1,
                                line2,
                                postalCode,
                                state,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StiggInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): BillingAddress = apply {
                        if (validated) {
                            return@apply
                        }

                        city()
                        country()
                        line1()
                        line2()
                        postalCode()
                        state()
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
                        (if (city.asKnown().isPresent) 1 else 0) +
                            (if (country.asKnown().isPresent) 1 else 0) +
                            (if (line1.asKnown().isPresent) 1 else 0) +
                            (if (line2.asKnown().isPresent) 1 else 0) +
                            (if (postalCode.asKnown().isPresent) 1 else 0) +
                            (if (state.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is BillingAddress &&
                            city == other.city &&
                            country == other.country &&
                            line1 == other.line1 &&
                            line2 == other.line2 &&
                            postalCode == other.postalCode &&
                            state == other.state &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            city,
                            country,
                            line1,
                            line2,
                            postalCode,
                            state,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "BillingAddress{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
                }

                /** Invoice custom fields */
                class InvoiceCustomFields
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

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [InvoiceCustomFields].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [InvoiceCustomFields]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(invoiceCustomFields: InvoiceCustomFields) = apply {
                            additionalProperties =
                                invoiceCustomFields.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [InvoiceCustomFields].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): InvoiceCustomFields =
                            InvoiceCustomFields(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StiggInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): InvoiceCustomFields = apply {
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is InvoiceCustomFields &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InvoiceCustomFields{additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional metadata to pass through to the billing provider on the customer's
                 * record there. This is separate from the customer's own metadata field — it's
                 * stored only on the billing-provider side, not on the Stigg customer object.
                 */
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StiggInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                /** Physical address */
                class ShippingAddress
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val city: JsonField<String>,
                    private val country: JsonField<String>,
                    private val line1: JsonField<String>,
                    private val line2: JsonField<String>,
                    private val postalCode: JsonField<String>,
                    private val state: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("city")
                        @ExcludeMissing
                        city: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("country")
                        @ExcludeMissing
                        country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("line1")
                        @ExcludeMissing
                        line1: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("line2")
                        @ExcludeMissing
                        line2: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("postalCode")
                        @ExcludeMissing
                        postalCode: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        state: JsonField<String> = JsonMissing.of(),
                    ) : this(city, country, line1, line2, postalCode, state, mutableMapOf())

                    /**
                     * City name
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun city(): Optional<String> = city.getOptional("city")

                    /**
                     * Country code or name
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun country(): Optional<String> = country.getOptional("country")

                    /**
                     * Street address line 1
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun line1(): Optional<String> = line1.getOptional("line1")

                    /**
                     * Street address line 2
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun line2(): Optional<String> = line2.getOptional("line2")

                    /**
                     * Postal or ZIP code
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun postalCode(): Optional<String> = postalCode.getOptional("postalCode")

                    /**
                     * State or province
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun state(): Optional<String> = state.getOptional("state")

                    /**
                     * Returns the raw JSON value of [city].
                     *
                     * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                    /**
                     * Returns the raw JSON value of [country].
                     *
                     * Unlike [country], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    /**
                     * Returns the raw JSON value of [line1].
                     *
                     * Unlike [line1], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    /**
                     * Returns the raw JSON value of [line2].
                     *
                     * Unlike [line2], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                    /**
                     * Returns the raw JSON value of [postalCode].
                     *
                     * Unlike [postalCode], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("postalCode")
                    @ExcludeMissing
                    fun _postalCode(): JsonField<String> = postalCode

                    /**
                     * Returns the raw JSON value of [state].
                     *
                     * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
                         * [ShippingAddress].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ShippingAddress]. */
                    class Builder internal constructor() {

                        private var city: JsonField<String> = JsonMissing.of()
                        private var country: JsonField<String> = JsonMissing.of()
                        private var line1: JsonField<String> = JsonMissing.of()
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var postalCode: JsonField<String> = JsonMissing.of()
                        private var state: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(shippingAddress: ShippingAddress) = apply {
                            city = shippingAddress.city
                            country = shippingAddress.country
                            line1 = shippingAddress.line1
                            line2 = shippingAddress.line2
                            postalCode = shippingAddress.postalCode
                            state = shippingAddress.state
                            additionalProperties =
                                shippingAddress.additionalProperties.toMutableMap()
                        }

                        /** City name */
                        fun city(city: String) = city(JsonField.of(city))

                        /**
                         * Sets [Builder.city] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.city] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /** Country code or name */
                        fun country(country: String) = country(JsonField.of(country))

                        /**
                         * Sets [Builder.country] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.country] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        /** Street address line 1 */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /**
                         * Sets [Builder.line1] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line1] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        /** Street address line 2 */
                        fun line2(line2: String) = line2(JsonField.of(line2))

                        /**
                         * Sets [Builder.line2] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line2] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        /** Postal or ZIP code */
                        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                        /**
                         * Sets [Builder.postalCode] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.postalCode] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun postalCode(postalCode: JsonField<String>) = apply {
                            this.postalCode = postalCode
                        }

                        /** State or province */
                        fun state(state: String) = state(JsonField.of(state))

                        /**
                         * Sets [Builder.state] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.state] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ShippingAddress].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): ShippingAddress =
                            ShippingAddress(
                                city,
                                country,
                                line1,
                                line2,
                                postalCode,
                                state,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StiggInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): ShippingAddress = apply {
                        if (validated) {
                            return@apply
                        }

                        city()
                        country()
                        line1()
                        line2()
                        postalCode()
                        state()
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
                        (if (city.asKnown().isPresent) 1 else 0) +
                            (if (country.asKnown().isPresent) 1 else 0) +
                            (if (line1.asKnown().isPresent) 1 else 0) +
                            (if (line2.asKnown().isPresent) 1 else 0) +
                            (if (postalCode.asKnown().isPresent) 1 else 0) +
                            (if (state.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ShippingAddress &&
                            city == other.city &&
                            country == other.country &&
                            line1 == other.line1 &&
                            line2 == other.line2 &&
                            postalCode == other.postalCode &&
                            state == other.state &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            city,
                            country,
                            line1,
                            line2,
                            postalCode,
                            state,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ShippingAddress{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
                }

                /** Tax identifier with type and value for customer tax exemptions. */
                class TaxId
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<String>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, value, mutableMapOf())

                    /**
                     * The type of tax exemption identifier, such as VAT.
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun type(): String = type.getRequired("type")

                    /**
                     * The actual tax identifier value
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun value(): String = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of [TaxId].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [TaxId]. */
                    class Builder internal constructor() {

                        private var type: JsonField<String>? = null
                        private var value: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(taxId: TaxId) = apply {
                            type = taxId.type
                            value = taxId.value
                            additionalProperties = taxId.additionalProperties.toMutableMap()
                        }

                        /** The type of tax exemption identifier, such as VAT. */
                        fun type(type: String) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<String>) = apply { this.type = type }

                        /** The actual tax identifier value */
                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [TaxId].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): TaxId =
                            TaxId(
                                checkRequired("type", type),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StiggInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): TaxId = apply {
                        if (validated) {
                            return@apply
                        }

                        type()
                        value()
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
                        (if (type.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TaxId &&
                            type == other.type &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TaxId{type=$type, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Stripe &&
                        billingAddress == other.billingAddress &&
                        customerName == other.customerName &&
                        invoiceCustomFields == other.invoiceCustomFields &&
                        metadata == other.metadata &&
                        paymentMethodId == other.paymentMethodId &&
                        shippingAddress == other.shippingAddress &&
                        taxIds == other.taxIds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        billingAddress,
                        customerName,
                        invoiceCustomFields,
                        metadata,
                        paymentMethodId,
                        shippingAddress,
                        taxIds,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Stripe{billingAddress=$billingAddress, customerName=$customerName, invoiceCustomFields=$invoiceCustomFields, metadata=$metadata, paymentMethodId=$paymentMethodId, shippingAddress=$shippingAddress, taxIds=$taxIds, additionalProperties=$additionalProperties}"
            }

            /** Zuora-specific billing fields for the customer. */
            class Zuora
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val billingAddress: JsonField<BillingAddress>,
                private val currency: JsonField<Currency>,
                private val metadata: JsonField<Metadata>,
                private val paymentMethodId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("billingAddress")
                    @ExcludeMissing
                    billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<Currency> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonProperty("paymentMethodId")
                    @ExcludeMissing
                    paymentMethodId: JsonField<String> = JsonMissing.of(),
                ) : this(billingAddress, currency, metadata, paymentMethodId, mutableMapOf())

                /**
                 * Physical address
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun billingAddress(): Optional<BillingAddress> =
                    billingAddress.getOptional("billingAddress")

                /**
                 * Customers selected currency
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun currency(): Optional<Currency> = currency.getOptional("currency")

                /**
                 * Additional metadata to pass through to the billing provider on the customer's
                 * record there. This is separate from the customer's own metadata field — it's
                 * stored only on the billing-provider side, not on the Stigg customer object.
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

                /**
                 * Billing provider payment method id, attached to this customer
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun paymentMethodId(): Optional<String> =
                    paymentMethodId.getOptional("paymentMethodId")

                /**
                 * Returns the raw JSON value of [billingAddress].
                 *
                 * Unlike [billingAddress], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billingAddress")
                @ExcludeMissing
                fun _billingAddress(): JsonField<BillingAddress> = billingAddress

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<Currency> = currency

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * Returns the raw JSON value of [paymentMethodId].
                 *
                 * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("paymentMethodId")
                @ExcludeMissing
                fun _paymentMethodId(): JsonField<String> = paymentMethodId

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

                    /** Returns a mutable builder for constructing an instance of [Zuora]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Zuora]. */
                class Builder internal constructor() {

                    private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var paymentMethodId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(zuora: Zuora) = apply {
                        billingAddress = zuora.billingAddress
                        currency = zuora.currency
                        metadata = zuora.metadata
                        paymentMethodId = zuora.paymentMethodId
                        additionalProperties = zuora.additionalProperties.toMutableMap()
                    }

                    /** Physical address */
                    fun billingAddress(billingAddress: BillingAddress) =
                        billingAddress(JsonField.of(billingAddress))

                    /**
                     * Sets [Builder.billingAddress] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingAddress] with a well-typed
                     * [BillingAddress] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
                        this.billingAddress = billingAddress
                    }

                    /** Customers selected currency */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [Currency] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /**
                     * Additional metadata to pass through to the billing provider on the customer's
                     * record there. This is separate from the customer's own metadata field — it's
                     * stored only on the billing-provider side, not on the Stigg customer object.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /** Billing provider payment method id, attached to this customer */
                    fun paymentMethodId(paymentMethodId: String) =
                        paymentMethodId(JsonField.of(paymentMethodId))

                    /**
                     * Sets [Builder.paymentMethodId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.paymentMethodId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun paymentMethodId(paymentMethodId: JsonField<String>) = apply {
                        this.paymentMethodId = paymentMethodId
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
                     * Returns an immutable instance of [Zuora].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Zuora =
                        Zuora(
                            billingAddress,
                            currency,
                            metadata,
                            paymentMethodId,
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
                fun validate(): Zuora = apply {
                    if (validated) {
                        return@apply
                    }

                    billingAddress().ifPresent { it.validate() }
                    currency().ifPresent { it.validate() }
                    metadata().ifPresent { it.validate() }
                    paymentMethodId()
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
                    (billingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                        (currency.asKnown().getOrNull()?.validity() ?: 0) +
                        (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (paymentMethodId.asKnown().isPresent) 1 else 0)

                /** Physical address */
                class BillingAddress
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val city: JsonField<String>,
                    private val country: JsonField<String>,
                    private val line1: JsonField<String>,
                    private val line2: JsonField<String>,
                    private val postalCode: JsonField<String>,
                    private val state: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("city")
                        @ExcludeMissing
                        city: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("country")
                        @ExcludeMissing
                        country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("line1")
                        @ExcludeMissing
                        line1: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("line2")
                        @ExcludeMissing
                        line2: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("postalCode")
                        @ExcludeMissing
                        postalCode: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        state: JsonField<String> = JsonMissing.of(),
                    ) : this(city, country, line1, line2, postalCode, state, mutableMapOf())

                    /**
                     * City name
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun city(): Optional<String> = city.getOptional("city")

                    /**
                     * Country code or name
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun country(): Optional<String> = country.getOptional("country")

                    /**
                     * Street address line 1
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun line1(): Optional<String> = line1.getOptional("line1")

                    /**
                     * Street address line 2
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun line2(): Optional<String> = line2.getOptional("line2")

                    /**
                     * Postal or ZIP code
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun postalCode(): Optional<String> = postalCode.getOptional("postalCode")

                    /**
                     * State or province
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun state(): Optional<String> = state.getOptional("state")

                    /**
                     * Returns the raw JSON value of [city].
                     *
                     * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                    /**
                     * Returns the raw JSON value of [country].
                     *
                     * Unlike [country], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    /**
                     * Returns the raw JSON value of [line1].
                     *
                     * Unlike [line1], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    /**
                     * Returns the raw JSON value of [line2].
                     *
                     * Unlike [line2], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                    /**
                     * Returns the raw JSON value of [postalCode].
                     *
                     * Unlike [postalCode], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("postalCode")
                    @ExcludeMissing
                    fun _postalCode(): JsonField<String> = postalCode

                    /**
                     * Returns the raw JSON value of [state].
                     *
                     * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
                         * [BillingAddress].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [BillingAddress]. */
                    class Builder internal constructor() {

                        private var city: JsonField<String> = JsonMissing.of()
                        private var country: JsonField<String> = JsonMissing.of()
                        private var line1: JsonField<String> = JsonMissing.of()
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var postalCode: JsonField<String> = JsonMissing.of()
                        private var state: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(billingAddress: BillingAddress) = apply {
                            city = billingAddress.city
                            country = billingAddress.country
                            line1 = billingAddress.line1
                            line2 = billingAddress.line2
                            postalCode = billingAddress.postalCode
                            state = billingAddress.state
                            additionalProperties =
                                billingAddress.additionalProperties.toMutableMap()
                        }

                        /** City name */
                        fun city(city: String) = city(JsonField.of(city))

                        /**
                         * Sets [Builder.city] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.city] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /** Country code or name */
                        fun country(country: String) = country(JsonField.of(country))

                        /**
                         * Sets [Builder.country] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.country] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        /** Street address line 1 */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /**
                         * Sets [Builder.line1] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line1] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        /** Street address line 2 */
                        fun line2(line2: String) = line2(JsonField.of(line2))

                        /**
                         * Sets [Builder.line2] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line2] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        /** Postal or ZIP code */
                        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                        /**
                         * Sets [Builder.postalCode] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.postalCode] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun postalCode(postalCode: JsonField<String>) = apply {
                            this.postalCode = postalCode
                        }

                        /** State or province */
                        fun state(state: String) = state(JsonField.of(state))

                        /**
                         * Sets [Builder.state] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.state] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [BillingAddress].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): BillingAddress =
                            BillingAddress(
                                city,
                                country,
                                line1,
                                line2,
                                postalCode,
                                state,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StiggInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): BillingAddress = apply {
                        if (validated) {
                            return@apply
                        }

                        city()
                        country()
                        line1()
                        line2()
                        postalCode()
                        state()
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
                        (if (city.asKnown().isPresent) 1 else 0) +
                            (if (country.asKnown().isPresent) 1 else 0) +
                            (if (line1.asKnown().isPresent) 1 else 0) +
                            (if (line2.asKnown().isPresent) 1 else 0) +
                            (if (postalCode.asKnown().isPresent) 1 else 0) +
                            (if (state.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is BillingAddress &&
                            city == other.city &&
                            country == other.country &&
                            line1 == other.line1 &&
                            line2 == other.line2 &&
                            postalCode == other.postalCode &&
                            state == other.state &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            city,
                            country,
                            line1,
                            line2,
                            postalCode,
                            state,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "BillingAddress{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
                }

                /** Customers selected currency */
                class Currency
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                        @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                    }

                    /** An enum containing [Currency]'s known values. */
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
                     * An enum containing [Currency]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Currency] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                         * An enum member indicating that [Currency] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws StiggInvalidDataException if this class instance's value is a not a
                     *   known member.
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
                            else -> throw StiggInvalidDataException("Unknown Currency: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws StiggInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            StiggInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StiggInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Currency = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Currency && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Additional metadata to pass through to the billing provider on the customer's
                 * record there. This is separate from the customer's own metadata field — it's
                 * stored only on the billing-provider side, not on the Stigg customer object.
                 */
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StiggInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Zuora &&
                        billingAddress == other.billingAddress &&
                        currency == other.currency &&
                        metadata == other.metadata &&
                        paymentMethodId == other.paymentMethodId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        billingAddress,
                        currency,
                        metadata,
                        paymentMethodId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Zuora{billingAddress=$billingAddress, currency=$currency, metadata=$metadata, paymentMethodId=$paymentMethodId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Passthrough &&
                    stripe == other.stripe &&
                    zuora == other.zuora &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(stripe, zuora, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Passthrough{stripe=$stripe, zuora=$zuora, additionalProperties=$additionalProperties}"
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
                language == other.language &&
                metadata == other.metadata &&
                name == other.name &&
                passthrough == other.passthrough &&
                timezone == other.timezone &&
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
                language,
                metadata,
                name,
                passthrough,
                timezone,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, archivedAt=$archivedAt, createdAt=$createdAt, updatedAt=$updatedAt, billingCurrency=$billingCurrency, billingId=$billingId, couponId=$couponId, defaultPaymentMethod=$defaultPaymentMethod, email=$email, integrations=$integrations, language=$language, metadata=$metadata, name=$name, passthrough=$passthrough, timezone=$timezone, additionalProperties=$additionalProperties}"
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
