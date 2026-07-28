// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.contracts

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
class ContractRetrieveResponse
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
     * A billing contract as reported by the connected billing provider.
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
         * Returns a mutable builder for constructing an instance of [ContractRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRetrieveResponse: ContractRetrieveResponse) = apply {
            data = contractRetrieveResponse.data
            additionalProperties = contractRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** A billing contract as reported by the connected billing provider. */
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
         * Returns an immutable instance of [ContractRetrieveResponse].
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
        fun build(): ContractRetrieveResponse =
            ContractRetrieveResponse(
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
    fun validate(): ContractRetrieveResponse = apply {
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

    /** A billing contract as reported by the connected billing provider. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val activationEndDate: JsonField<OffsetDateTime>,
        private val activationStartDate: JsonField<OffsetDateTime>,
        private val billingId: JsonField<String>,
        private val contractId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val customerExternalId: JsonField<String>,
        private val externalId: JsonField<String>,
        private val latestInvoice: JsonField<LatestInvoice>,
        private val name: JsonField<String>,
        private val nextInvoice: JsonField<NextInvoice>,
        private val poNumber: JsonField<String>,
        private val refId: JsonField<String>,
        private val state: JsonField<State>,
        private val subscriptions: JsonField<List<Subscription>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("activationEndDate")
            @ExcludeMissing
            activationEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("activationStartDate")
            @ExcludeMissing
            activationStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("billingId")
            @ExcludeMissing
            billingId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contractId")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customerExternalId")
            @ExcludeMissing
            customerExternalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("externalId")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("latestInvoice")
            @ExcludeMissing
            latestInvoice: JsonField<LatestInvoice> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nextInvoice")
            @ExcludeMissing
            nextInvoice: JsonField<NextInvoice> = JsonMissing.of(),
            @JsonProperty("poNumber")
            @ExcludeMissing
            poNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refId") @ExcludeMissing refId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
            @JsonProperty("subscriptions")
            @ExcludeMissing
            subscriptions: JsonField<List<Subscription>> = JsonMissing.of(),
        ) : this(
            id,
            activationEndDate,
            activationStartDate,
            billingId,
            contractId,
            createdAt,
            customerExternalId,
            externalId,
            latestInvoice,
            name,
            nextInvoice,
            poNumber,
            refId,
            state,
            subscriptions,
            mutableMapOf(),
        )

        /**
         * The persisted Stigg contract id (matches a subscription’s contractId; present for
         * Stigg-managed contracts)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The date the contract activation ends
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun activationEndDate(): Optional<OffsetDateTime> =
            activationEndDate.getOptional("activationEndDate")

        /**
         * The date the contract becomes active
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun activationStartDate(): Optional<OffsetDateTime> =
            activationStartDate.getOptional("activationStartDate")

        /**
         * The billing provider (Received) contract ID; null until the contract has synced to the
         * billing provider
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingId(): Optional<String> = billingId.getOptional("billingId")

        /**
         * The Stigg contract ref ID (the key used to fetch/update/delete this contract)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contractId(): String = contractId.getRequired("contractId")

        /**
         * The date the contract was created
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * The external identifier of the customer the contract belongs to
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerExternalId(): Optional<String> =
            customerExternalId.getOptional("customerExternalId")

        /**
         * The external identifier of the contract
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalId(): String = externalId.getRequired("externalId")

        /**
         * The most recent non-draft invoice for this contract (open, paid, or canceled), or null
         * when none exists
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun latestInvoice(): Optional<LatestInvoice> = latestInvoice.getOptional("latestInvoice")

        /**
         * The contract name (the purchase-order number when set, otherwise the contract/customer
         * name)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * A preview of the contract's upcoming invoice, or null when none is available
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nextInvoice(): Optional<NextInvoice> = nextInvoice.getOptional("nextInvoice")

        /**
         * Purchase-order number, when set on the contract
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun poNumber(): Optional<String> = poNumber.getOptional("poNumber")

        /**
         * The Stigg contract ref ID (present for Stigg-managed contracts; the key used to
         * update/delete)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun refId(): Optional<String> = refId.getOptional("refId")

        /**
         * The current state of the contract
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): State = state.getRequired("state")

        /**
         * The custom subscriptions attached to this contract (empty when none)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptions(): List<Subscription> = subscriptions.getRequired("subscriptions")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [activationEndDate].
         *
         * Unlike [activationEndDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("activationEndDate")
        @ExcludeMissing
        fun _activationEndDate(): JsonField<OffsetDateTime> = activationEndDate

        /**
         * Returns the raw JSON value of [activationStartDate].
         *
         * Unlike [activationStartDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("activationStartDate")
        @ExcludeMissing
        fun _activationStartDate(): JsonField<OffsetDateTime> = activationStartDate

        /**
         * Returns the raw JSON value of [billingId].
         *
         * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billingId") @ExcludeMissing fun _billingId(): JsonField<String> = billingId

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contractId")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [customerExternalId].
         *
         * Unlike [customerExternalId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("customerExternalId")
        @ExcludeMissing
        fun _customerExternalId(): JsonField<String> = customerExternalId

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("externalId")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [latestInvoice].
         *
         * Unlike [latestInvoice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("latestInvoice")
        @ExcludeMissing
        fun _latestInvoice(): JsonField<LatestInvoice> = latestInvoice

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [nextInvoice].
         *
         * Unlike [nextInvoice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nextInvoice")
        @ExcludeMissing
        fun _nextInvoice(): JsonField<NextInvoice> = nextInvoice

        /**
         * Returns the raw JSON value of [poNumber].
         *
         * Unlike [poNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("poNumber") @ExcludeMissing fun _poNumber(): JsonField<String> = poNumber

        /**
         * Returns the raw JSON value of [refId].
         *
         * Unlike [refId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refId") @ExcludeMissing fun _refId(): JsonField<String> = refId

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

        /**
         * Returns the raw JSON value of [subscriptions].
         *
         * Unlike [subscriptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriptions")
        @ExcludeMissing
        fun _subscriptions(): JsonField<List<Subscription>> = subscriptions

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
             * .activationEndDate()
             * .activationStartDate()
             * .billingId()
             * .contractId()
             * .createdAt()
             * .customerExternalId()
             * .externalId()
             * .latestInvoice()
             * .name()
             * .nextInvoice()
             * .poNumber()
             * .refId()
             * .state()
             * .subscriptions()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var activationEndDate: JsonField<OffsetDateTime>? = null
            private var activationStartDate: JsonField<OffsetDateTime>? = null
            private var billingId: JsonField<String>? = null
            private var contractId: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var customerExternalId: JsonField<String>? = null
            private var externalId: JsonField<String>? = null
            private var latestInvoice: JsonField<LatestInvoice>? = null
            private var name: JsonField<String>? = null
            private var nextInvoice: JsonField<NextInvoice>? = null
            private var poNumber: JsonField<String>? = null
            private var refId: JsonField<String>? = null
            private var state: JsonField<State>? = null
            private var subscriptions: JsonField<MutableList<Subscription>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                activationEndDate = data.activationEndDate
                activationStartDate = data.activationStartDate
                billingId = data.billingId
                contractId = data.contractId
                createdAt = data.createdAt
                customerExternalId = data.customerExternalId
                externalId = data.externalId
                latestInvoice = data.latestInvoice
                name = data.name
                nextInvoice = data.nextInvoice
                poNumber = data.poNumber
                refId = data.refId
                state = data.state
                subscriptions = data.subscriptions.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * The persisted Stigg contract id (matches a subscription’s contractId; present for
             * Stigg-managed contracts)
             */
            fun id(id: String?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<String>) = id(id.getOrNull())

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The date the contract activation ends */
            fun activationEndDate(activationEndDate: OffsetDateTime?) =
                activationEndDate(JsonField.ofNullable(activationEndDate))

            /**
             * Alias for calling [Builder.activationEndDate] with `activationEndDate.orElse(null)`.
             */
            fun activationEndDate(activationEndDate: Optional<OffsetDateTime>) =
                activationEndDate(activationEndDate.getOrNull())

            /**
             * Sets [Builder.activationEndDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activationEndDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun activationEndDate(activationEndDate: JsonField<OffsetDateTime>) = apply {
                this.activationEndDate = activationEndDate
            }

            /** The date the contract becomes active */
            fun activationStartDate(activationStartDate: OffsetDateTime?) =
                activationStartDate(JsonField.ofNullable(activationStartDate))

            /**
             * Alias for calling [Builder.activationStartDate] with
             * `activationStartDate.orElse(null)`.
             */
            fun activationStartDate(activationStartDate: Optional<OffsetDateTime>) =
                activationStartDate(activationStartDate.getOrNull())

            /**
             * Sets [Builder.activationStartDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activationStartDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun activationStartDate(activationStartDate: JsonField<OffsetDateTime>) = apply {
                this.activationStartDate = activationStartDate
            }

            /**
             * The billing provider (Received) contract ID; null until the contract has synced to
             * the billing provider
             */
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

            /** The Stigg contract ref ID (the key used to fetch/update/delete this contract) */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /** The date the contract was created */
            fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

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

            /** The external identifier of the customer the contract belongs to */
            fun customerExternalId(customerExternalId: String?) =
                customerExternalId(JsonField.ofNullable(customerExternalId))

            /**
             * Alias for calling [Builder.customerExternalId] with
             * `customerExternalId.orElse(null)`.
             */
            fun customerExternalId(customerExternalId: Optional<String>) =
                customerExternalId(customerExternalId.getOrNull())

            /**
             * Sets [Builder.customerExternalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerExternalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerExternalId(customerExternalId: JsonField<String>) = apply {
                this.customerExternalId = customerExternalId
            }

            /** The external identifier of the contract */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /**
             * The most recent non-draft invoice for this contract (open, paid, or canceled), or
             * null when none exists
             */
            fun latestInvoice(latestInvoice: LatestInvoice?) =
                latestInvoice(JsonField.ofNullable(latestInvoice))

            /** Alias for calling [Builder.latestInvoice] with `latestInvoice.orElse(null)`. */
            fun latestInvoice(latestInvoice: Optional<LatestInvoice>) =
                latestInvoice(latestInvoice.getOrNull())

            /**
             * Sets [Builder.latestInvoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latestInvoice] with a well-typed [LatestInvoice]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun latestInvoice(latestInvoice: JsonField<LatestInvoice>) = apply {
                this.latestInvoice = latestInvoice
            }

            /**
             * The contract name (the purchase-order number when set, otherwise the
             * contract/customer name)
             */
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

            /** A preview of the contract's upcoming invoice, or null when none is available */
            fun nextInvoice(nextInvoice: NextInvoice?) =
                nextInvoice(JsonField.ofNullable(nextInvoice))

            /** Alias for calling [Builder.nextInvoice] with `nextInvoice.orElse(null)`. */
            fun nextInvoice(nextInvoice: Optional<NextInvoice>) =
                nextInvoice(nextInvoice.getOrNull())

            /**
             * Sets [Builder.nextInvoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextInvoice] with a well-typed [NextInvoice] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nextInvoice(nextInvoice: JsonField<NextInvoice>) = apply {
                this.nextInvoice = nextInvoice
            }

            /** Purchase-order number, when set on the contract */
            fun poNumber(poNumber: String?) = poNumber(JsonField.ofNullable(poNumber))

            /** Alias for calling [Builder.poNumber] with `poNumber.orElse(null)`. */
            fun poNumber(poNumber: Optional<String>) = poNumber(poNumber.getOrNull())

            /**
             * Sets [Builder.poNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.poNumber] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun poNumber(poNumber: JsonField<String>) = apply { this.poNumber = poNumber }

            /**
             * The Stigg contract ref ID (present for Stigg-managed contracts; the key used to
             * update/delete)
             */
            fun refId(refId: String?) = refId(JsonField.ofNullable(refId))

            /** Alias for calling [Builder.refId] with `refId.orElse(null)`. */
            fun refId(refId: Optional<String>) = refId(refId.getOrNull())

            /**
             * Sets [Builder.refId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refId(refId: JsonField<String>) = apply { this.refId = refId }

            /** The current state of the contract */
            fun state(state: State) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [State] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun state(state: JsonField<State>) = apply { this.state = state }

            /** The custom subscriptions attached to this contract (empty when none) */
            fun subscriptions(subscriptions: List<Subscription>) =
                subscriptions(JsonField.of(subscriptions))

            /**
             * Sets [Builder.subscriptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptions] with a well-typed
             * `List<Subscription>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun subscriptions(subscriptions: JsonField<List<Subscription>>) = apply {
                this.subscriptions = subscriptions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Subscription] to [subscriptions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSubscription(subscription: Subscription) = apply {
                subscriptions =
                    (subscriptions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("subscriptions", it).add(subscription)
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .activationEndDate()
             * .activationStartDate()
             * .billingId()
             * .contractId()
             * .createdAt()
             * .customerExternalId()
             * .externalId()
             * .latestInvoice()
             * .name()
             * .nextInvoice()
             * .poNumber()
             * .refId()
             * .state()
             * .subscriptions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("activationEndDate", activationEndDate),
                    checkRequired("activationStartDate", activationStartDate),
                    checkRequired("billingId", billingId),
                    checkRequired("contractId", contractId),
                    checkRequired("createdAt", createdAt),
                    checkRequired("customerExternalId", customerExternalId),
                    checkRequired("externalId", externalId),
                    checkRequired("latestInvoice", latestInvoice),
                    checkRequired("name", name),
                    checkRequired("nextInvoice", nextInvoice),
                    checkRequired("poNumber", poNumber),
                    checkRequired("refId", refId),
                    checkRequired("state", state),
                    checkRequired("subscriptions", subscriptions).map { it.toImmutable() },
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
            activationEndDate()
            activationStartDate()
            billingId()
            contractId()
            createdAt()
            customerExternalId()
            externalId()
            latestInvoice().ifPresent { it.validate() }
            name()
            nextInvoice().ifPresent { it.validate() }
            poNumber()
            refId()
            state().validate()
            subscriptions().forEach { it.validate() }
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
                (if (activationEndDate.asKnown().isPresent) 1 else 0) +
                (if (activationStartDate.asKnown().isPresent) 1 else 0) +
                (if (billingId.asKnown().isPresent) 1 else 0) +
                (if (contractId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (customerExternalId.asKnown().isPresent) 1 else 0) +
                (if (externalId.asKnown().isPresent) 1 else 0) +
                (latestInvoice.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (nextInvoice.asKnown().getOrNull()?.validity() ?: 0) +
                (if (poNumber.asKnown().isPresent) 1 else 0) +
                (if (refId.asKnown().isPresent) 1 else 0) +
                (state.asKnown().getOrNull()?.validity() ?: 0) +
                (subscriptions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /**
         * The most recent non-draft invoice for this contract (open, paid, or canceled), or null
         * when none exists
         */
        class LatestInvoice
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val billingId: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val requiresAction: JsonField<Boolean>,
            private val status: JsonField<Status>,
            private val amountDue: JsonField<Double>,
            private val billingReason: JsonField<BillingReason>,
            private val currency: JsonField<String>,
            private val pdfUrl: JsonField<String>,
            private val total: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billingId")
                @ExcludeMissing
                billingId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("createdAt")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("requiresAction")
                @ExcludeMissing
                requiresAction: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("amountDue")
                @ExcludeMissing
                amountDue: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("billingReason")
                @ExcludeMissing
                billingReason: JsonField<BillingReason> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pdfUrl")
                @ExcludeMissing
                pdfUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("total") @ExcludeMissing total: JsonField<Double> = JsonMissing.of(),
            ) : this(
                billingId,
                createdAt,
                requiresAction,
                status,
                amountDue,
                billingReason,
                currency,
                pdfUrl,
                total,
                mutableMapOf(),
            )

            /**
             * Invoice billing ID
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun billingId(): String = billingId.getRequired("billingId")

            /**
             * Invoice creation date
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

            /**
             * Whether payment requires action
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun requiresAction(): Boolean = requiresAction.getRequired("requiresAction")

            /**
             * Invoice status
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * Amount due
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amountDue(): Optional<Double> = amountDue.getOptional("amountDue")

            /**
             * Billing reason
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billingReason(): Optional<BillingReason> =
                billingReason.getOptional("billingReason")

            /**
             * Invoice currency
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * Invoice PDF URL
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pdfUrl(): Optional<String> = pdfUrl.getOptional("pdfUrl")

            /**
             * Total amount
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun total(): Optional<Double> = total.getOptional("total")

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
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("createdAt")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [requiresAction].
             *
             * Unlike [requiresAction], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("requiresAction")
            @ExcludeMissing
            fun _requiresAction(): JsonField<Boolean> = requiresAction

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [amountDue].
             *
             * Unlike [amountDue], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("amountDue")
            @ExcludeMissing
            fun _amountDue(): JsonField<Double> = amountDue

            /**
             * Returns the raw JSON value of [billingReason].
             *
             * Unlike [billingReason], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("billingReason")
            @ExcludeMissing
            fun _billingReason(): JsonField<BillingReason> = billingReason

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [pdfUrl].
             *
             * Unlike [pdfUrl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pdfUrl") @ExcludeMissing fun _pdfUrl(): JsonField<String> = pdfUrl

            /**
             * Returns the raw JSON value of [total].
             *
             * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

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
                 * Returns a mutable builder for constructing an instance of [LatestInvoice].
                 *
                 * The following fields are required:
                 * ```java
                 * .billingId()
                 * .createdAt()
                 * .requiresAction()
                 * .status()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LatestInvoice]. */
            class Builder internal constructor() {

                private var billingId: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var requiresAction: JsonField<Boolean>? = null
                private var status: JsonField<Status>? = null
                private var amountDue: JsonField<Double> = JsonMissing.of()
                private var billingReason: JsonField<BillingReason> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var pdfUrl: JsonField<String> = JsonMissing.of()
                private var total: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(latestInvoice: LatestInvoice) = apply {
                    billingId = latestInvoice.billingId
                    createdAt = latestInvoice.createdAt
                    requiresAction = latestInvoice.requiresAction
                    status = latestInvoice.status
                    amountDue = latestInvoice.amountDue
                    billingReason = latestInvoice.billingReason
                    currency = latestInvoice.currency
                    pdfUrl = latestInvoice.pdfUrl
                    total = latestInvoice.total
                    additionalProperties = latestInvoice.additionalProperties.toMutableMap()
                }

                /** Invoice billing ID */
                fun billingId(billingId: String) = billingId(JsonField.of(billingId))

                /**
                 * Sets [Builder.billingId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun billingId(billingId: JsonField<String>) = apply { this.billingId = billingId }

                /** Invoice creation date */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Whether payment requires action */
                fun requiresAction(requiresAction: Boolean) =
                    requiresAction(JsonField.of(requiresAction))

                /**
                 * Sets [Builder.requiresAction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requiresAction] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun requiresAction(requiresAction: JsonField<Boolean>) = apply {
                    this.requiresAction = requiresAction
                }

                /** Invoice status */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** Amount due */
                fun amountDue(amountDue: Double?) = amountDue(JsonField.ofNullable(amountDue))

                /**
                 * Alias for [Builder.amountDue].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun amountDue(amountDue: Double) = amountDue(amountDue as Double?)

                /** Alias for calling [Builder.amountDue] with `amountDue.orElse(null)`. */
                fun amountDue(amountDue: Optional<Double>) = amountDue(amountDue.getOrNull())

                /**
                 * Sets [Builder.amountDue] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountDue] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amountDue(amountDue: JsonField<Double>) = apply { this.amountDue = amountDue }

                /** Billing reason */
                fun billingReason(billingReason: BillingReason?) =
                    billingReason(JsonField.ofNullable(billingReason))

                /** Alias for calling [Builder.billingReason] with `billingReason.orElse(null)`. */
                fun billingReason(billingReason: Optional<BillingReason>) =
                    billingReason(billingReason.getOrNull())

                /**
                 * Sets [Builder.billingReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingReason] with a well-typed [BillingReason]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billingReason(billingReason: JsonField<BillingReason>) = apply {
                    this.billingReason = billingReason
                }

                /** Invoice currency */
                fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
                fun currency(currency: Optional<String>) = currency(currency.getOrNull())

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** Invoice PDF URL */
                fun pdfUrl(pdfUrl: String?) = pdfUrl(JsonField.ofNullable(pdfUrl))

                /** Alias for calling [Builder.pdfUrl] with `pdfUrl.orElse(null)`. */
                fun pdfUrl(pdfUrl: Optional<String>) = pdfUrl(pdfUrl.getOrNull())

                /**
                 * Sets [Builder.pdfUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pdfUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pdfUrl(pdfUrl: JsonField<String>) = apply { this.pdfUrl = pdfUrl }

                /** Total amount */
                fun total(total: Double?) = total(JsonField.ofNullable(total))

                /**
                 * Alias for [Builder.total].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun total(total: Double) = total(total as Double?)

                /** Alias for calling [Builder.total] with `total.orElse(null)`. */
                fun total(total: Optional<Double>) = total(total.getOrNull())

                /**
                 * Sets [Builder.total] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.total] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun total(total: JsonField<Double>) = apply { this.total = total }

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
                 * Returns an immutable instance of [LatestInvoice].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .billingId()
                 * .createdAt()
                 * .requiresAction()
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): LatestInvoice =
                    LatestInvoice(
                        checkRequired("billingId", billingId),
                        checkRequired("createdAt", createdAt),
                        checkRequired("requiresAction", requiresAction),
                        checkRequired("status", status),
                        amountDue,
                        billingReason,
                        currency,
                        pdfUrl,
                        total,
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
            fun validate(): LatestInvoice = apply {
                if (validated) {
                    return@apply
                }

                billingId()
                createdAt()
                requiresAction()
                status().validate()
                amountDue()
                billingReason().ifPresent { it.validate() }
                currency()
                pdfUrl()
                total()
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
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (requiresAction.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (amountDue.asKnown().isPresent) 1 else 0) +
                    (billingReason.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (currency.asKnown().isPresent) 1 else 0) +
                    (if (pdfUrl.asKnown().isPresent) 1 else 0) +
                    (if (total.asKnown().isPresent) 1 else 0)

            /** Invoice status */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val OPEN = of("OPEN")

                    @JvmField val CANCELED = of("CANCELED")

                    @JvmField val PAID = of("PAID")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    OPEN,
                    CANCELED,
                    PAID,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    OPEN,
                    CANCELED,
                    PAID,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
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
                        OPEN -> Value.OPEN
                        CANCELED -> Value.CANCELED
                        PAID -> Value.PAID
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
                        OPEN -> Known.OPEN
                        CANCELED -> Known.CANCELED
                        PAID -> Known.PAID
                        else -> throw StiggInvalidDataException("Unknown Status: $value")
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
                fun validate(): Status = apply {
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

                    return other is Status && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Billing reason */
            class BillingReason
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

                    @JvmField val BILLING_CYCLE = of("BILLING_CYCLE")

                    @JvmField val SUBSCRIPTION_CREATION = of("SUBSCRIPTION_CREATION")

                    @JvmField val SUBSCRIPTION_UPDATE = of("SUBSCRIPTION_UPDATE")

                    @JvmField val MANUAL = of("MANUAL")

                    @JvmField
                    val MINIMUM_INVOICE_AMOUNT_EXCEEDED = of("MINIMUM_INVOICE_AMOUNT_EXCEEDED")

                    @JvmField val OTHER = of("OTHER")

                    @JvmStatic fun of(value: String) = BillingReason(JsonField.of(value))
                }

                /** An enum containing [BillingReason]'s known values. */
                enum class Known {
                    BILLING_CYCLE,
                    SUBSCRIPTION_CREATION,
                    SUBSCRIPTION_UPDATE,
                    MANUAL,
                    MINIMUM_INVOICE_AMOUNT_EXCEEDED,
                    OTHER,
                }

                /**
                 * An enum containing [BillingReason]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [BillingReason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BILLING_CYCLE,
                    SUBSCRIPTION_CREATION,
                    SUBSCRIPTION_UPDATE,
                    MANUAL,
                    MINIMUM_INVOICE_AMOUNT_EXCEEDED,
                    OTHER,
                    /**
                     * An enum member indicating that [BillingReason] was instantiated with an
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
                        BILLING_CYCLE -> Value.BILLING_CYCLE
                        SUBSCRIPTION_CREATION -> Value.SUBSCRIPTION_CREATION
                        SUBSCRIPTION_UPDATE -> Value.SUBSCRIPTION_UPDATE
                        MANUAL -> Value.MANUAL
                        MINIMUM_INVOICE_AMOUNT_EXCEEDED -> Value.MINIMUM_INVOICE_AMOUNT_EXCEEDED
                        OTHER -> Value.OTHER
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
                        BILLING_CYCLE -> Known.BILLING_CYCLE
                        SUBSCRIPTION_CREATION -> Known.SUBSCRIPTION_CREATION
                        SUBSCRIPTION_UPDATE -> Known.SUBSCRIPTION_UPDATE
                        MANUAL -> Known.MANUAL
                        MINIMUM_INVOICE_AMOUNT_EXCEEDED -> Known.MINIMUM_INVOICE_AMOUNT_EXCEEDED
                        OTHER -> Known.OTHER
                        else -> throw StiggInvalidDataException("Unknown BillingReason: $value")
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
                fun validate(): BillingReason = apply {
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

                    return other is BillingReason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LatestInvoice &&
                    billingId == other.billingId &&
                    createdAt == other.createdAt &&
                    requiresAction == other.requiresAction &&
                    status == other.status &&
                    amountDue == other.amountDue &&
                    billingReason == other.billingReason &&
                    currency == other.currency &&
                    pdfUrl == other.pdfUrl &&
                    total == other.total &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    billingId,
                    createdAt,
                    requiresAction,
                    status,
                    amountDue,
                    billingReason,
                    currency,
                    pdfUrl,
                    total,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LatestInvoice{billingId=$billingId, createdAt=$createdAt, requiresAction=$requiresAction, status=$status, amountDue=$amountDue, billingReason=$billingReason, currency=$currency, pdfUrl=$pdfUrl, total=$total, additionalProperties=$additionalProperties}"
        }

        /** A preview of the contract's upcoming invoice, or null when none is available */
        class NextInvoice
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Amount>,
            private val dueDate: JsonField<OffsetDateTime>,
            private val periodEnd: JsonField<OffsetDateTime>,
            private val periodStart: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Amount> = JsonMissing.of(),
                @JsonProperty("dueDate")
                @ExcludeMissing
                dueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("periodEnd")
                @ExcludeMissing
                periodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("periodStart")
                @ExcludeMissing
                periodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(amount, dueDate, periodEnd, periodStart, mutableMapOf())

            /**
             * The total amount of the upcoming invoice
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Amount = amount.getRequired("amount")

            /**
             * The date the upcoming invoice is due
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun dueDate(): Optional<OffsetDateTime> = dueDate.getOptional("dueDate")

            /**
             * The end of the billing period the upcoming invoice covers
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun periodEnd(): Optional<OffsetDateTime> = periodEnd.getOptional("periodEnd")

            /**
             * The start of the billing period the upcoming invoice covers
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun periodStart(): Optional<OffsetDateTime> = periodStart.getOptional("periodStart")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Amount> = amount

            /**
             * Returns the raw JSON value of [dueDate].
             *
             * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("dueDate")
            @ExcludeMissing
            fun _dueDate(): JsonField<OffsetDateTime> = dueDate

            /**
             * Returns the raw JSON value of [periodEnd].
             *
             * Unlike [periodEnd], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("periodEnd")
            @ExcludeMissing
            fun _periodEnd(): JsonField<OffsetDateTime> = periodEnd

            /**
             * Returns the raw JSON value of [periodStart].
             *
             * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("periodStart")
            @ExcludeMissing
            fun _periodStart(): JsonField<OffsetDateTime> = periodStart

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
                 * Returns a mutable builder for constructing an instance of [NextInvoice].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .dueDate()
                 * .periodEnd()
                 * .periodStart()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NextInvoice]. */
            class Builder internal constructor() {

                private var amount: JsonField<Amount>? = null
                private var dueDate: JsonField<OffsetDateTime>? = null
                private var periodEnd: JsonField<OffsetDateTime>? = null
                private var periodStart: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(nextInvoice: NextInvoice) = apply {
                    amount = nextInvoice.amount
                    dueDate = nextInvoice.dueDate
                    periodEnd = nextInvoice.periodEnd
                    periodStart = nextInvoice.periodStart
                    additionalProperties = nextInvoice.additionalProperties.toMutableMap()
                }

                /** The total amount of the upcoming invoice */
                fun amount(amount: Amount) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Amount] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Amount>) = apply { this.amount = amount }

                /** The date the upcoming invoice is due */
                fun dueDate(dueDate: OffsetDateTime?) = dueDate(JsonField.ofNullable(dueDate))

                /** Alias for calling [Builder.dueDate] with `dueDate.orElse(null)`. */
                fun dueDate(dueDate: Optional<OffsetDateTime>) = dueDate(dueDate.getOrNull())

                /**
                 * Sets [Builder.dueDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dueDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

                /** The end of the billing period the upcoming invoice covers */
                fun periodEnd(periodEnd: OffsetDateTime?) =
                    periodEnd(JsonField.ofNullable(periodEnd))

                /** Alias for calling [Builder.periodEnd] with `periodEnd.orElse(null)`. */
                fun periodEnd(periodEnd: Optional<OffsetDateTime>) =
                    periodEnd(periodEnd.getOrNull())

                /**
                 * Sets [Builder.periodEnd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.periodEnd] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply {
                    this.periodEnd = periodEnd
                }

                /** The start of the billing period the upcoming invoice covers */
                fun periodStart(periodStart: OffsetDateTime?) =
                    periodStart(JsonField.ofNullable(periodStart))

                /** Alias for calling [Builder.periodStart] with `periodStart.orElse(null)`. */
                fun periodStart(periodStart: Optional<OffsetDateTime>) =
                    periodStart(periodStart.getOrNull())

                /**
                 * Sets [Builder.periodStart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.periodStart] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
                    this.periodStart = periodStart
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
                 * Returns an immutable instance of [NextInvoice].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .dueDate()
                 * .periodEnd()
                 * .periodStart()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NextInvoice =
                    NextInvoice(
                        checkRequired("amount", amount),
                        checkRequired("dueDate", dueDate),
                        checkRequired("periodEnd", periodEnd),
                        checkRequired("periodStart", periodStart),
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
            fun validate(): NextInvoice = apply {
                if (validated) {
                    return@apply
                }

                amount().validate()
                dueDate()
                periodEnd()
                periodStart()
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
                (amount.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (dueDate.asKnown().isPresent) 1 else 0) +
                    (if (periodEnd.asKnown().isPresent) 1 else 0) +
                    (if (periodStart.asKnown().isPresent) 1 else 0)

            /** The total amount of the upcoming invoice */
            class Amount
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val currency: JsonField<Currency>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<Currency> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * The price amount
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * ISO 4217 currency code
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<Currency> = currency

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
                     * Returns a mutable builder for constructing an instance of [Amount].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Amount]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var currency: JsonField<Currency>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(amount: Amount) = apply {
                        this.amount = amount.amount
                        currency = amount.currency
                        additionalProperties = amount.additionalProperties.toMutableMap()
                    }

                    /** The price amount */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** ISO 4217 currency code */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [Currency] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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
                     * Returns an immutable instance of [Amount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Amount =
                        Amount(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
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
                fun validate(): Amount = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency().validate()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (currency.asKnown().getOrNull()?.validity() ?: 0)

                /** ISO 4217 currency code */
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Amount &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Amount{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NextInvoice &&
                    amount == other.amount &&
                    dueDate == other.dueDate &&
                    periodEnd == other.periodEnd &&
                    periodStart == other.periodStart &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, dueDate, periodEnd, periodStart, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NextInvoice{amount=$amount, dueDate=$dueDate, periodEnd=$periodEnd, periodStart=$periodStart, additionalProperties=$additionalProperties}"
        }

        /** The current state of the contract */
        class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DRAFT = of("DRAFT")

                @JvmField val ACTIVE = of("ACTIVE")

                @JvmField val CANCELED = of("CANCELED")

                @JvmField val END_BILLING = of("END_BILLING")

                @JvmStatic fun of(value: String) = State(JsonField.of(value))
            }

            /** An enum containing [State]'s known values. */
            enum class Known {
                DRAFT,
                ACTIVE,
                CANCELED,
                END_BILLING,
            }

            /**
             * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [State] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DRAFT,
                ACTIVE,
                CANCELED,
                END_BILLING,
                /**
                 * An enum member indicating that [State] was instantiated with an unknown value.
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
                    DRAFT -> Value.DRAFT
                    ACTIVE -> Value.ACTIVE
                    CANCELED -> Value.CANCELED
                    END_BILLING -> Value.END_BILLING
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
                    DRAFT -> Known.DRAFT
                    ACTIVE -> Known.ACTIVE
                    CANCELED -> Known.CANCELED
                    END_BILLING -> Known.END_BILLING
                    else -> throw StiggInvalidDataException("Unknown State: $value")
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
            fun validate(): State = apply {
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

                return other is State && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** A custom subscription attached to a contract. */
        class Subscription
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val planDisplayName: JsonField<String>,
            private val productDisplayName: JsonField<String>,
            private val subscriptionId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("planDisplayName")
                @ExcludeMissing
                planDisplayName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("productDisplayName")
                @ExcludeMissing
                productDisplayName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subscriptionId")
                @ExcludeMissing
                subscriptionId: JsonField<String> = JsonMissing.of(),
            ) : this(planDisplayName, productDisplayName, subscriptionId, mutableMapOf())

            /**
             * Display name of the subscription plan
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun planDisplayName(): Optional<String> = planDisplayName.getOptional("planDisplayName")

            /**
             * Display name of the product the subscription plan belongs to
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun productDisplayName(): Optional<String> =
                productDisplayName.getOptional("productDisplayName")

            /**
             * The subscription ref ID (use it to deep-link to the subscription)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionId(): String = subscriptionId.getRequired("subscriptionId")

            /**
             * Returns the raw JSON value of [planDisplayName].
             *
             * Unlike [planDisplayName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("planDisplayName")
            @ExcludeMissing
            fun _planDisplayName(): JsonField<String> = planDisplayName

            /**
             * Returns the raw JSON value of [productDisplayName].
             *
             * Unlike [productDisplayName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("productDisplayName")
            @ExcludeMissing
            fun _productDisplayName(): JsonField<String> = productDisplayName

            /**
             * Returns the raw JSON value of [subscriptionId].
             *
             * Unlike [subscriptionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscriptionId")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

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
                 * Returns a mutable builder for constructing an instance of [Subscription].
                 *
                 * The following fields are required:
                 * ```java
                 * .planDisplayName()
                 * .productDisplayName()
                 * .subscriptionId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Subscription]. */
            class Builder internal constructor() {

                private var planDisplayName: JsonField<String>? = null
                private var productDisplayName: JsonField<String>? = null
                private var subscriptionId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(subscription: Subscription) = apply {
                    planDisplayName = subscription.planDisplayName
                    productDisplayName = subscription.productDisplayName
                    subscriptionId = subscription.subscriptionId
                    additionalProperties = subscription.additionalProperties.toMutableMap()
                }

                /** Display name of the subscription plan */
                fun planDisplayName(planDisplayName: String?) =
                    planDisplayName(JsonField.ofNullable(planDisplayName))

                /**
                 * Alias for calling [Builder.planDisplayName] with `planDisplayName.orElse(null)`.
                 */
                fun planDisplayName(planDisplayName: Optional<String>) =
                    planDisplayName(planDisplayName.getOrNull())

                /**
                 * Sets [Builder.planDisplayName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planDisplayName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun planDisplayName(planDisplayName: JsonField<String>) = apply {
                    this.planDisplayName = planDisplayName
                }

                /** Display name of the product the subscription plan belongs to */
                fun productDisplayName(productDisplayName: String?) =
                    productDisplayName(JsonField.ofNullable(productDisplayName))

                /**
                 * Alias for calling [Builder.productDisplayName] with
                 * `productDisplayName.orElse(null)`.
                 */
                fun productDisplayName(productDisplayName: Optional<String>) =
                    productDisplayName(productDisplayName.getOrNull())

                /**
                 * Sets [Builder.productDisplayName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productDisplayName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun productDisplayName(productDisplayName: JsonField<String>) = apply {
                    this.productDisplayName = productDisplayName
                }

                /** The subscription ref ID (use it to deep-link to the subscription) */
                fun subscriptionId(subscriptionId: String) =
                    subscriptionId(JsonField.of(subscriptionId))

                /**
                 * Sets [Builder.subscriptionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
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
                 * Returns an immutable instance of [Subscription].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .planDisplayName()
                 * .productDisplayName()
                 * .subscriptionId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Subscription =
                    Subscription(
                        checkRequired("planDisplayName", planDisplayName),
                        checkRequired("productDisplayName", productDisplayName),
                        checkRequired("subscriptionId", subscriptionId),
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
            fun validate(): Subscription = apply {
                if (validated) {
                    return@apply
                }

                planDisplayName()
                productDisplayName()
                subscriptionId()
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
                (if (planDisplayName.asKnown().isPresent) 1 else 0) +
                    (if (productDisplayName.asKnown().isPresent) 1 else 0) +
                    (if (subscriptionId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Subscription &&
                    planDisplayName == other.planDisplayName &&
                    productDisplayName == other.productDisplayName &&
                    subscriptionId == other.subscriptionId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    planDisplayName,
                    productDisplayName,
                    subscriptionId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Subscription{planDisplayName=$planDisplayName, productDisplayName=$productDisplayName, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                activationEndDate == other.activationEndDate &&
                activationStartDate == other.activationStartDate &&
                billingId == other.billingId &&
                contractId == other.contractId &&
                createdAt == other.createdAt &&
                customerExternalId == other.customerExternalId &&
                externalId == other.externalId &&
                latestInvoice == other.latestInvoice &&
                name == other.name &&
                nextInvoice == other.nextInvoice &&
                poNumber == other.poNumber &&
                refId == other.refId &&
                state == other.state &&
                subscriptions == other.subscriptions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                activationEndDate,
                activationStartDate,
                billingId,
                contractId,
                createdAt,
                customerExternalId,
                externalId,
                latestInvoice,
                name,
                nextInvoice,
                poNumber,
                refId,
                state,
                subscriptions,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, activationEndDate=$activationEndDate, activationStartDate=$activationStartDate, billingId=$billingId, contractId=$contractId, createdAt=$createdAt, customerExternalId=$customerExternalId, externalId=$externalId, latestInvoice=$latestInvoice, name=$name, nextInvoice=$nextInvoice, poNumber=$poNumber, refId=$refId, state=$state, subscriptions=$subscriptions, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
