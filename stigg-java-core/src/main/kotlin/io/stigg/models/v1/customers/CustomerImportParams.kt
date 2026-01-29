// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Bulk import customers */
class CustomerImportParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * List of customer objects to import
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customers(): List<Customer> = body.customers()

    /**
     * Returns the raw JSON value of [customers].
     *
     * Unlike [customers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customers(): JsonField<List<Customer>> = body._customers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerImportParams].
         *
         * The following fields are required:
         * ```java
         * .customers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerImportParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerImportParams: CustomerImportParams) = apply {
            body = customerImportParams.body.toBuilder()
            additionalHeaders = customerImportParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerImportParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customers]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** List of customer objects to import */
        fun customers(customers: List<Customer>) = apply { body.customers(customers) }

        /**
         * Sets [Builder.customers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customers] with a well-typed `List<Customer>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customers(customers: JsonField<List<Customer>>) = apply { body.customers(customers) }

        /**
         * Adds a single [Customer] to [customers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomer(customer: Customer) = apply { body.addCustomer(customer) }

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
         * Returns an immutable instance of [CustomerImportParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerImportParams =
            CustomerImportParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Bulk import up to 1000 customers. Existing customers are updated, new ones are created. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customers: JsonField<List<Customer>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customers")
            @ExcludeMissing
            customers: JsonField<List<Customer>> = JsonMissing.of()
        ) : this(customers, mutableMapOf())

        /**
         * List of customer objects to import
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customers(): List<Customer> = customers.getRequired("customers")

        /**
         * Returns the raw JSON value of [customers].
         *
         * Unlike [customers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customers")
        @ExcludeMissing
        fun _customers(): JsonField<List<Customer>> = customers

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
             * .customers()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var customers: JsonField<MutableList<Customer>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customers = body.customers.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** List of customer objects to import */
            fun customers(customers: List<Customer>) = customers(JsonField.of(customers))

            /**
             * Sets [Builder.customers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customers] with a well-typed `List<Customer>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customers(customers: JsonField<List<Customer>>) = apply {
                this.customers = customers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Customer] to [customers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomer(customer: Customer) = apply {
                customers =
                    (customers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customers", it).add(customer)
                    }
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
             * .customers()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("customers", customers).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customers().forEach { it.validate() }
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
            (customers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                customers == other.customers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(customers, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customers=$customers, additionalProperties=$additionalProperties}"
    }

    class Customer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val email: JsonField<String>,
        private val name: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val paymentMethodId: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("paymentMethodId")
            @ExcludeMissing
            paymentMethodId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, email, name, metadata, paymentMethodId, updatedAt, mutableMapOf())

        /**
         * Customer slug
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The email of the customer
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * The name of the customer
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Additional metadata
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Billing provider payment method id
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentMethodId(): Optional<String> = paymentMethodId.getOptional("paymentMethodId")

        /**
         * Timestamp of when the record was last updated
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [paymentMethodId].
         *
         * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("paymentMethodId")
        @ExcludeMissing
        fun _paymentMethodId(): JsonField<String> = paymentMethodId

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
             * Returns a mutable builder for constructing an instance of [Customer].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .email()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Customer]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var paymentMethodId: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customer: Customer) = apply {
                id = customer.id
                email = customer.email
                name = customer.name
                metadata = customer.metadata
                paymentMethodId = customer.paymentMethodId
                updatedAt = customer.updatedAt
                additionalProperties = customer.additionalProperties.toMutableMap()
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

            /** Billing provider payment method id */
            fun paymentMethodId(paymentMethodId: String) =
                paymentMethodId(JsonField.of(paymentMethodId))

            /**
             * Sets [Builder.paymentMethodId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentMethodId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentMethodId(paymentMethodId: JsonField<String>) = apply {
                this.paymentMethodId = paymentMethodId
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
             * Returns an immutable instance of [Customer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .email()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Customer =
                Customer(
                    checkRequired("id", id),
                    checkRequired("email", email),
                    checkRequired("name", name),
                    metadata,
                    paymentMethodId,
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Customer = apply {
            if (validated) {
                return@apply
            }

            id()
            email()
            name()
            metadata().ifPresent { it.validate() }
            paymentMethodId()
            updatedAt()
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
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (paymentMethodId.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

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

            return other is Customer &&
                id == other.id &&
                email == other.email &&
                name == other.name &&
                metadata == other.metadata &&
                paymentMethodId == other.paymentMethodId &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                email,
                name,
                metadata,
                paymentMethodId,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Customer{id=$id, email=$email, name=$name, metadata=$metadata, paymentMethodId=$paymentMethodId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerImportParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerImportParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
