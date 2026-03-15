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

/** Updates an existing customer's properties such as name, email, and billing information. */
class CustomerUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The billing currency of the customer
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingCurrency(): Optional<BillingCurrency> = body.billingCurrency()

    /**
     * The unique identifier for the entity in the billing provider
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingId(): Optional<String> = body.billingId()

    /**
     * Customer level coupon
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun couponId(): Optional<String> = body.couponId()

    /**
     * The email of the customer
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = body.email()

    /**
     * List of integrations
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrations(): Optional<List<Integration>> = body.integrations()

    /**
     * Additional metadata
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * The name of the customer
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Returns the raw JSON value of [billingCurrency].
     *
     * Unlike [billingCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingCurrency(): JsonField<BillingCurrency> = body._billingCurrency()

    /**
     * Returns the raw JSON value of [billingId].
     *
     * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingId(): JsonField<String> = body._billingId()

    /**
     * Returns the raw JSON value of [couponId].
     *
     * Unlike [couponId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _couponId(): JsonField<String> = body._couponId()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [integrations].
     *
     * Unlike [integrations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _integrations(): JsonField<List<Integration>> = body._integrations()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CustomerUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CustomerUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerUpdateParams: CustomerUpdateParams) = apply {
            id = customerUpdateParams.id
            body = customerUpdateParams.body.toBuilder()
            additionalHeaders = customerUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [billingCurrency]
         * - [billingId]
         * - [couponId]
         * - [email]
         * - [integrations]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The billing currency of the customer */
        fun billingCurrency(billingCurrency: BillingCurrency?) = apply {
            body.billingCurrency(billingCurrency)
        }

        /** Alias for calling [Builder.billingCurrency] with `billingCurrency.orElse(null)`. */
        fun billingCurrency(billingCurrency: Optional<BillingCurrency>) =
            billingCurrency(billingCurrency.getOrNull())

        /**
         * Sets [Builder.billingCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCurrency] with a well-typed [BillingCurrency]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billingCurrency(billingCurrency: JsonField<BillingCurrency>) = apply {
            body.billingCurrency(billingCurrency)
        }

        /** The unique identifier for the entity in the billing provider */
        fun billingId(billingId: String?) = apply { body.billingId(billingId) }

        /** Alias for calling [Builder.billingId] with `billingId.orElse(null)`. */
        fun billingId(billingId: Optional<String>) = billingId(billingId.getOrNull())

        /**
         * Sets [Builder.billingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billingId(billingId: JsonField<String>) = apply { body.billingId(billingId) }

        /** Customer level coupon */
        fun couponId(couponId: String?) = apply { body.couponId(couponId) }

        /** Alias for calling [Builder.couponId] with `couponId.orElse(null)`. */
        fun couponId(couponId: Optional<String>) = couponId(couponId.getOrNull())

        /**
         * Sets [Builder.couponId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.couponId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun couponId(couponId: JsonField<String>) = apply { body.couponId(couponId) }

        /** The email of the customer */
        fun email(email: String?) = apply { body.email(email) }

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** List of integrations */
        fun integrations(integrations: List<Integration>) = apply {
            body.integrations(integrations)
        }

        /**
         * Sets [Builder.integrations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrations] with a well-typed `List<Integration>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun integrations(integrations: JsonField<List<Integration>>) = apply {
            body.integrations(integrations)
        }

        /**
         * Adds a single [Integration] to [integrations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIntegration(integration: Integration) = apply { body.addIntegration(integration) }

        /** Additional metadata */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** The name of the customer */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

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
         * Returns an immutable instance of [CustomerUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerUpdateParams =
            CustomerUpdateParams(
                id,
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

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Partially update an existing customer. Only provided fields are updated. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingCurrency: JsonField<BillingCurrency>,
        private val billingId: JsonField<String>,
        private val couponId: JsonField<String>,
        private val email: JsonField<String>,
        private val integrations: JsonField<List<Integration>>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billingCurrency")
            @ExcludeMissing
            billingCurrency: JsonField<BillingCurrency> = JsonMissing.of(),
            @JsonProperty("billingId")
            @ExcludeMissing
            billingId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("couponId")
            @ExcludeMissing
            couponId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integrations")
            @ExcludeMissing
            integrations: JsonField<List<Integration>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(
            billingCurrency,
            billingId,
            couponId,
            email,
            integrations,
            metadata,
            name,
            mutableMapOf(),
        )

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billingCurrency: JsonField<BillingCurrency> = JsonMissing.of()
            private var billingId: JsonField<String> = JsonMissing.of()
            private var couponId: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var integrations: JsonField<MutableList<Integration>>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                billingCurrency = body.billingCurrency
                billingId = body.billingId
                couponId = body.couponId
                email = body.email
                integrations = body.integrations.map { it.toMutableList() }
                metadata = body.metadata
                name = body.name
                additionalProperties = body.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    billingCurrency,
                    billingId,
                    couponId,
                    email,
                    (integrations ?: JsonMissing.of()).map { it.toImmutable() },
                    metadata,
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billingCurrency().ifPresent { it.validate() }
            billingId()
            couponId()
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
            (billingCurrency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (billingId.asKnown().isPresent) 1 else 0) +
                (if (couponId.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (integrations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                billingCurrency == other.billingCurrency &&
                billingId == other.billingId &&
                couponId == other.couponId &&
                email == other.email &&
                integrations == other.integrations &&
                metadata == other.metadata &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingCurrency,
                billingId,
                couponId,
                email,
                integrations,
                metadata,
                name,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billingCurrency=$billingCurrency, billingId=$billingId, couponId=$couponId, email=$email, integrations=$integrations, metadata=$metadata, name=$name, additionalProperties=$additionalProperties}"
    }

    /** The billing currency of the customer */
    class BillingCurrency @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws StiggInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws StiggInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { StiggInvalidDataException("Value is not a String") }

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
             * @throws StiggInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        return other is CustomerUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
