// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.contracts

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
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Updates a contract's metadata (name, PO number, activation dates) and optionally re-links its
 * subscriptions. Best-effort re-syncs the change to the connected billing provider.
 */
class ContractUpdateParams
private constructor(
    private val id: String?,
    private val xAccountId: String?,
    private val xEnvironmentId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun xAccountId(): Optional<String> = Optional.ofNullable(xAccountId)

    fun xEnvironmentId(): Optional<String> = Optional.ofNullable(xEnvironmentId)

    /**
     * New activation end date
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activationEndDate(): Optional<OffsetDateTime> = body.activationEndDate()

    /**
     * New activation start date
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activationStartDate(): Optional<OffsetDateTime> = body.activationStartDate()

    /**
     * New contract name
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * New purchase-order number
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun poNumber(): Optional<String> = body.poNumber()

    /**
     * Enable billing on a provision-access-only contract by creating a billing contract in the
     * connected billing provider. Only takes effect when true and the contract has no billing yet;
     * omitting it leaves billing unchanged. Billing is never removed by an update.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun setupBilling(): Optional<Boolean> = body.setupBilling()

    /**
     * When provided, replaces the set of subscriptions linked to the contract (subscription ref
     * IDs)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionIds(): Optional<List<String>> = body.subscriptionIds()

    /**
     * Returns the raw JSON value of [activationEndDate].
     *
     * Unlike [activationEndDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _activationEndDate(): JsonField<OffsetDateTime> = body._activationEndDate()

    /**
     * Returns the raw JSON value of [activationStartDate].
     *
     * Unlike [activationStartDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _activationStartDate(): JsonField<OffsetDateTime> = body._activationStartDate()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [poNumber].
     *
     * Unlike [poNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _poNumber(): JsonField<String> = body._poNumber()

    /**
     * Returns the raw JSON value of [setupBilling].
     *
     * Unlike [setupBilling], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _setupBilling(): JsonField<Boolean> = body._setupBilling()

    /**
     * Returns the raw JSON value of [subscriptionIds].
     *
     * Unlike [subscriptionIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subscriptionIds(): JsonField<List<String>> = body._subscriptionIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ContractUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ContractUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var xAccountId: String? = null
        private var xEnvironmentId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractUpdateParams: ContractUpdateParams) = apply {
            id = contractUpdateParams.id
            xAccountId = contractUpdateParams.xAccountId
            xEnvironmentId = contractUpdateParams.xEnvironmentId
            body = contractUpdateParams.body.toBuilder()
            additionalHeaders = contractUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        fun xAccountId(xAccountId: String?) = apply { this.xAccountId = xAccountId }

        /** Alias for calling [Builder.xAccountId] with `xAccountId.orElse(null)`. */
        fun xAccountId(xAccountId: Optional<String>) = xAccountId(xAccountId.getOrNull())

        fun xEnvironmentId(xEnvironmentId: String?) = apply { this.xEnvironmentId = xEnvironmentId }

        /** Alias for calling [Builder.xEnvironmentId] with `xEnvironmentId.orElse(null)`. */
        fun xEnvironmentId(xEnvironmentId: Optional<String>) =
            xEnvironmentId(xEnvironmentId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [activationEndDate]
         * - [activationStartDate]
         * - [name]
         * - [poNumber]
         * - [setupBilling]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** New activation end date */
        fun activationEndDate(activationEndDate: OffsetDateTime) = apply {
            body.activationEndDate(activationEndDate)
        }

        /**
         * Sets [Builder.activationEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationEndDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun activationEndDate(activationEndDate: JsonField<OffsetDateTime>) = apply {
            body.activationEndDate(activationEndDate)
        }

        /** New activation start date */
        fun activationStartDate(activationStartDate: OffsetDateTime) = apply {
            body.activationStartDate(activationStartDate)
        }

        /**
         * Sets [Builder.activationStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationStartDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun activationStartDate(activationStartDate: JsonField<OffsetDateTime>) = apply {
            body.activationStartDate(activationStartDate)
        }

        /** New contract name */
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

        /** New purchase-order number */
        fun poNumber(poNumber: String?) = apply { body.poNumber(poNumber) }

        /** Alias for calling [Builder.poNumber] with `poNumber.orElse(null)`. */
        fun poNumber(poNumber: Optional<String>) = poNumber(poNumber.getOrNull())

        /**
         * Sets [Builder.poNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.poNumber] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun poNumber(poNumber: JsonField<String>) = apply { body.poNumber(poNumber) }

        /**
         * Enable billing on a provision-access-only contract by creating a billing contract in the
         * connected billing provider. Only takes effect when true and the contract has no billing
         * yet; omitting it leaves billing unchanged. Billing is never removed by an update.
         */
        fun setupBilling(setupBilling: Boolean) = apply { body.setupBilling(setupBilling) }

        /**
         * Sets [Builder.setupBilling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.setupBilling] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun setupBilling(setupBilling: JsonField<Boolean>) = apply {
            body.setupBilling(setupBilling)
        }

        /**
         * When provided, replaces the set of subscriptions linked to the contract (subscription ref
         * IDs)
         */
        fun subscriptionIds(subscriptionIds: List<String>) = apply {
            body.subscriptionIds(subscriptionIds)
        }

        /**
         * Sets [Builder.subscriptionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionIds(subscriptionIds: JsonField<List<String>>) = apply {
            body.subscriptionIds(subscriptionIds)
        }

        /**
         * Adds a single [String] to [subscriptionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubscriptionId(subscriptionId: String) = apply {
            body.addSubscriptionId(subscriptionId)
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
         * Returns an immutable instance of [ContractUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContractUpdateParams =
            ContractUpdateParams(
                id,
                xAccountId,
                xEnvironmentId,
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

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                xAccountId?.let { put("X-ACCOUNT-ID", it) }
                xEnvironmentId?.let { put("X-ENVIRONMENT-ID", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Input for updating a contract and optionally re-linking its subscriptions. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val activationEndDate: JsonField<OffsetDateTime>,
        private val activationStartDate: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val poNumber: JsonField<String>,
        private val setupBilling: JsonField<Boolean>,
        private val subscriptionIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("activationEndDate")
            @ExcludeMissing
            activationEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("activationStartDate")
            @ExcludeMissing
            activationStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("poNumber")
            @ExcludeMissing
            poNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("setupBilling")
            @ExcludeMissing
            setupBilling: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subscriptionIds")
            @ExcludeMissing
            subscriptionIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            activationEndDate,
            activationStartDate,
            name,
            poNumber,
            setupBilling,
            subscriptionIds,
            mutableMapOf(),
        )

        /**
         * New activation end date
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun activationEndDate(): Optional<OffsetDateTime> =
            activationEndDate.getOptional("activationEndDate")

        /**
         * New activation start date
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun activationStartDate(): Optional<OffsetDateTime> =
            activationStartDate.getOptional("activationStartDate")

        /**
         * New contract name
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * New purchase-order number
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun poNumber(): Optional<String> = poNumber.getOptional("poNumber")

        /**
         * Enable billing on a provision-access-only contract by creating a billing contract in the
         * connected billing provider. Only takes effect when true and the contract has no billing
         * yet; omitting it leaves billing unchanged. Billing is never removed by an update.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun setupBilling(): Optional<Boolean> = setupBilling.getOptional("setupBilling")

        /**
         * When provided, replaces the set of subscriptions linked to the contract (subscription ref
         * IDs)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscriptionIds(): Optional<List<String>> =
            subscriptionIds.getOptional("subscriptionIds")

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [poNumber].
         *
         * Unlike [poNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("poNumber") @ExcludeMissing fun _poNumber(): JsonField<String> = poNumber

        /**
         * Returns the raw JSON value of [setupBilling].
         *
         * Unlike [setupBilling], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("setupBilling")
        @ExcludeMissing
        fun _setupBilling(): JsonField<Boolean> = setupBilling

        /**
         * Returns the raw JSON value of [subscriptionIds].
         *
         * Unlike [subscriptionIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriptionIds")
        @ExcludeMissing
        fun _subscriptionIds(): JsonField<List<String>> = subscriptionIds

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

            private var activationEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var activationStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var poNumber: JsonField<String> = JsonMissing.of()
            private var setupBilling: JsonField<Boolean> = JsonMissing.of()
            private var subscriptionIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                activationEndDate = body.activationEndDate
                activationStartDate = body.activationStartDate
                name = body.name
                poNumber = body.poNumber
                setupBilling = body.setupBilling
                subscriptionIds = body.subscriptionIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** New activation end date */
            fun activationEndDate(activationEndDate: OffsetDateTime) =
                activationEndDate(JsonField.of(activationEndDate))

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

            /** New activation start date */
            fun activationStartDate(activationStartDate: OffsetDateTime) =
                activationStartDate(JsonField.of(activationStartDate))

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

            /** New contract name */
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

            /** New purchase-order number */
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
             * Enable billing on a provision-access-only contract by creating a billing contract in
             * the connected billing provider. Only takes effect when true and the contract has no
             * billing yet; omitting it leaves billing unchanged. Billing is never removed by an
             * update.
             */
            fun setupBilling(setupBilling: Boolean) = setupBilling(JsonField.of(setupBilling))

            /**
             * Sets [Builder.setupBilling] to an arbitrary JSON value.
             *
             * You should usually call [Builder.setupBilling] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun setupBilling(setupBilling: JsonField<Boolean>) = apply {
                this.setupBilling = setupBilling
            }

            /**
             * When provided, replaces the set of subscriptions linked to the contract (subscription
             * ref IDs)
             */
            fun subscriptionIds(subscriptionIds: List<String>) =
                subscriptionIds(JsonField.of(subscriptionIds))

            /**
             * Sets [Builder.subscriptionIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subscriptionIds(subscriptionIds: JsonField<List<String>>) = apply {
                this.subscriptionIds = subscriptionIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [subscriptionIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSubscriptionId(subscriptionId: String) = apply {
                subscriptionIds =
                    (subscriptionIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("subscriptionIds", it).add(subscriptionId)
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
             */
            fun build(): Body =
                Body(
                    activationEndDate,
                    activationStartDate,
                    name,
                    poNumber,
                    setupBilling,
                    (subscriptionIds ?: JsonMissing.of()).map { it.toImmutable() },
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

            activationEndDate()
            activationStartDate()
            name()
            poNumber()
            setupBilling()
            subscriptionIds()
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
            (if (activationEndDate.asKnown().isPresent) 1 else 0) +
                (if (activationStartDate.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (poNumber.asKnown().isPresent) 1 else 0) +
                (if (setupBilling.asKnown().isPresent) 1 else 0) +
                (subscriptionIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                activationEndDate == other.activationEndDate &&
                activationStartDate == other.activationStartDate &&
                name == other.name &&
                poNumber == other.poNumber &&
                setupBilling == other.setupBilling &&
                subscriptionIds == other.subscriptionIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                activationEndDate,
                activationStartDate,
                name,
                poNumber,
                setupBilling,
                subscriptionIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{activationEndDate=$activationEndDate, activationStartDate=$activationStartDate, name=$name, poNumber=$poNumber, setupBilling=$setupBilling, subscriptionIds=$subscriptionIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractUpdateParams &&
            id == other.id &&
            xAccountId == other.xAccountId &&
            xEnvironmentId == other.xEnvironmentId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, xAccountId, xEnvironmentId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContractUpdateParams{id=$id, xAccountId=$xAccountId, xEnvironmentId=$xEnvironmentId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
