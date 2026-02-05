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

/**
 * Creates a new customer and optionally provisions an initial subscription in a single operation.
 */
class CustomerProvisionParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Customer slug
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = body.id()

    /**
     * Customer level coupon
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun couponId(): Optional<String> = body.couponId()

    /**
     * The default payment method details
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultPaymentMethod(): Optional<DefaultPaymentMethod> = body.defaultPaymentMethod()

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [couponId].
     *
     * Unlike [couponId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _couponId(): JsonField<String> = body._couponId()

    /**
     * Returns the raw JSON value of [defaultPaymentMethod].
     *
     * Unlike [defaultPaymentMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultPaymentMethod(): JsonField<DefaultPaymentMethod> = body._defaultPaymentMethod()

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

        /**
         * Returns a mutable builder for constructing an instance of [CustomerProvisionParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerProvisionParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerProvisionParams: CustomerProvisionParams) = apply {
            body = customerProvisionParams.body.toBuilder()
            additionalHeaders = customerProvisionParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerProvisionParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [couponId]
         * - [defaultPaymentMethod]
         * - [email]
         * - [integrations]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Customer slug */
        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

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

        /** The default payment method details */
        fun defaultPaymentMethod(defaultPaymentMethod: DefaultPaymentMethod?) = apply {
            body.defaultPaymentMethod(defaultPaymentMethod)
        }

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
         * [DefaultPaymentMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun defaultPaymentMethod(defaultPaymentMethod: JsonField<DefaultPaymentMethod>) = apply {
            body.defaultPaymentMethod(defaultPaymentMethod)
        }

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
         * Returns an immutable instance of [CustomerProvisionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerProvisionParams =
            CustomerProvisionParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Provisions a new customer with unique ID, optional name and email. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var couponId: JsonField<String> = JsonMissing.of()
            private var defaultPaymentMethod: JsonField<DefaultPaymentMethod> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var integrations: JsonField<MutableList<Integration>>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                couponId = body.couponId
                defaultPaymentMethod = body.defaultPaymentMethod
                email = body.email
                integrations = body.integrations.map { it.toMutableList() }
                metadata = body.metadata
                name = body.name
                additionalProperties = body.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("id", id),
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

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            id()
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
                (if (couponId.asKnown().isPresent) 1 else 0) +
                (defaultPaymentMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (integrations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
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
            "Body{id=$id, couponId=$couponId, defaultPaymentMethod=$defaultPaymentMethod, email=$email, integrations=$integrations, metadata=$metadata, name=$name, additionalProperties=$additionalProperties}"
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
        ) : this(billingId, cardExpiryMonth, cardExpiryYear, cardLast4Digits, type, mutableMapOf())

        /**
         * The default payment method id
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingId(): Optional<String> = billingId.getOptional("billingId")

        /**
         * The expiration month of the default payment method
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cardExpiryMonth(): Optional<Double> = cardExpiryMonth.getOptional("cardExpiryMonth")

        /**
         * The expiration year of the default payment method
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cardExpiryYear(): Optional<Double> = cardExpiryYear.getOptional("cardExpiryYear")

        /**
         * The last 4 digits of the default payment method
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cardLast4Digits(): Optional<String> = cardLast4Digits.getOptional("cardLast4Digits")

        /**
         * The default payment method type
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [billingId].
         *
         * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billingId") @ExcludeMissing fun _billingId(): JsonField<String> = billingId

        /**
         * Returns the raw JSON value of [cardExpiryMonth].
         *
         * Unlike [cardExpiryMonth], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cardExpiryMonth")
        @ExcludeMissing
        fun _cardExpiryMonth(): JsonField<Double> = cardExpiryMonth

        /**
         * Returns the raw JSON value of [cardExpiryYear].
         *
         * Unlike [cardExpiryYear], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cardExpiryYear")
        @ExcludeMissing
        fun _cardExpiryYear(): JsonField<Double> = cardExpiryYear

        /**
         * Returns the raw JSON value of [cardLast4Digits].
         *
         * Unlike [cardLast4Digits], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * You should usually call [Builder.billingId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /** Alias for calling [Builder.cardExpiryMonth] with `cardExpiryMonth.orElse(null)`. */
            fun cardExpiryMonth(cardExpiryMonth: Optional<Double>) =
                cardExpiryMonth(cardExpiryMonth.getOrNull())

            /**
             * Sets [Builder.cardExpiryMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardExpiryMonth] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun cardExpiryYear(cardExpiryYear: Double) = cardExpiryYear(cardExpiryYear as Double?)

            /** Alias for calling [Builder.cardExpiryYear] with `cardExpiryYear.orElse(null)`. */
            fun cardExpiryYear(cardExpiryYear: Optional<Double>) =
                cardExpiryYear(cardExpiryYear.getOrNull())

            /**
             * Sets [Builder.cardExpiryYear] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardExpiryYear] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardExpiryYear(cardExpiryYear: JsonField<Double>) = apply {
                this.cardExpiryYear = cardExpiryYear
            }

            /** The last 4 digits of the default payment method */
            fun cardLast4Digits(cardLast4Digits: String?) =
                cardLast4Digits(JsonField.ofNullable(cardLast4Digits))

            /** Alias for calling [Builder.cardLast4Digits] with `cardLast4Digits.orElse(null)`. */
            fun cardLast4Digits(cardLast4Digits: Optional<String>) =
                cardLast4Digits(cardLast4Digits.getOrNull())

            /**
             * Sets [Builder.cardLast4Digits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardLast4Digits] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardLast4Digits(cardLast4Digits: JsonField<String>) = apply {
                this.cardLast4Digits = cardLast4Digits
            }

            /** The default payment method type */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                BANK,
                CASH_APP,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
             * @throws StiggInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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

        return other is CustomerProvisionParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerProvisionParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
