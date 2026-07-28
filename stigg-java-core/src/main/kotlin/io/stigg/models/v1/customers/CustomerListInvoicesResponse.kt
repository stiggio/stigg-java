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

/** A customer invoice as reported by the connected billing provider. */
class CustomerListInvoicesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contractExternalId: JsonField<String>,
    private val currency: JsonField<String>,
    private val customerExternalId: JsonField<String>,
    private val discount: JsonField<Double>,
    private val dueDate: JsonField<OffsetDateTime>,
    private val invoiceExternalId: JsonField<String>,
    private val invoiceId: JsonField<String>,
    private val invoiceNumber: JsonField<String>,
    private val issueDate: JsonField<OffsetDateTime>,
    private val lineItems: JsonField<List<LineItem>>,
    private val paidDate: JsonField<OffsetDateTime>,
    private val state: JsonField<State>,
    private val subtotal: JsonField<Double>,
    private val tax: JsonField<Double>,
    private val total: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contractExternalId")
        @ExcludeMissing
        contractExternalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customerExternalId")
        @ExcludeMissing
        customerExternalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount") @ExcludeMissing discount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dueDate")
        @ExcludeMissing
        dueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("invoiceExternalId")
        @ExcludeMissing
        invoiceExternalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoiceId") @ExcludeMissing invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoiceNumber")
        @ExcludeMissing
        invoiceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("issueDate")
        @ExcludeMissing
        issueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lineItems")
        @ExcludeMissing
        lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
        @JsonProperty("paidDate")
        @ExcludeMissing
        paidDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tax") @ExcludeMissing tax: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Double> = JsonMissing.of(),
    ) : this(
        contractExternalId,
        currency,
        customerExternalId,
        discount,
        dueDate,
        invoiceExternalId,
        invoiceId,
        invoiceNumber,
        issueDate,
        lineItems,
        paidDate,
        state,
        subtotal,
        tax,
        total,
        mutableMapOf(),
    )

    /**
     * External ID of the contract the invoice belongs to: your contract ref when mapped, otherwise
     * the Received contract ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractExternalId(): Optional<String> =
        contractExternalId.getOptional("contractExternalId")

    /**
     * The ISO-4217 currency code of the invoice
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * External ID of the customer the invoice belongs to: your customer ref when mapped, otherwise
     * the Received customer ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerExternalId(): Optional<String> =
        customerExternalId.getOptional("customerExternalId")

    /**
     * The total discount amount
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun discount(): Optional<Double> = discount.getOptional("discount")

    /**
     * The date payment is due
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dueDate(): Optional<OffsetDateTime> = dueDate.getOptional("dueDate")

    /**
     * External ID for the invoice: the mapped external ID when one exists, otherwise the invoice ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceExternalId(): Optional<String> = invoiceExternalId.getOptional("invoiceExternalId")

    /**
     * The billing provider (Received) invoice ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceId(): String = invoiceId.getRequired("invoiceId")

    /**
     * The invoice document number (or draft number while the invoice is unissued)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceNumber(): Optional<String> = invoiceNumber.getOptional("invoiceNumber")

    /**
     * The date the invoice was issued
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun issueDate(): Optional<OffsetDateTime> = issueDate.getOptional("issueDate")

    /**
     * The invoice line items
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lineItems(): List<LineItem> = lineItems.getRequired("lineItems")

    /**
     * The date the invoice was reconciled as paid; present once reconciled
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paidDate(): Optional<OffsetDateTime> = paidDate.getOptional("paidDate")

    /**
     * The invoice status (open, paid, or canceled)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): State = state.getRequired("state")

    /**
     * The pre-tax subtotal
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subtotal(): Optional<Double> = subtotal.getOptional("subtotal")

    /**
     * The total tax amount
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tax(): Optional<Double> = tax.getOptional("tax")

    /**
     * The total amount due
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun total(): Optional<Double> = total.getOptional("total")

    /**
     * Returns the raw JSON value of [contractExternalId].
     *
     * Unlike [contractExternalId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("contractExternalId")
    @ExcludeMissing
    fun _contractExternalId(): JsonField<String> = contractExternalId

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [customerExternalId].
     *
     * Unlike [customerExternalId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customerExternalId")
    @ExcludeMissing
    fun _customerExternalId(): JsonField<String> = customerExternalId

    /**
     * Returns the raw JSON value of [discount].
     *
     * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Double> = discount

    /**
     * Returns the raw JSON value of [dueDate].
     *
     * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dueDate") @ExcludeMissing fun _dueDate(): JsonField<OffsetDateTime> = dueDate

    /**
     * Returns the raw JSON value of [invoiceExternalId].
     *
     * Unlike [invoiceExternalId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("invoiceExternalId")
    @ExcludeMissing
    fun _invoiceExternalId(): JsonField<String> = invoiceExternalId

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoiceId") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    /**
     * Returns the raw JSON value of [invoiceNumber].
     *
     * Unlike [invoiceNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoiceNumber")
    @ExcludeMissing
    fun _invoiceNumber(): JsonField<String> = invoiceNumber

    /**
     * Returns the raw JSON value of [issueDate].
     *
     * Unlike [issueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issueDate")
    @ExcludeMissing
    fun _issueDate(): JsonField<OffsetDateTime> = issueDate

    /**
     * Returns the raw JSON value of [lineItems].
     *
     * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lineItems")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<LineItem>> = lineItems

    /**
     * Returns the raw JSON value of [paidDate].
     *
     * Unlike [paidDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paidDate") @ExcludeMissing fun _paidDate(): JsonField<OffsetDateTime> = paidDate

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Returns the raw JSON value of [subtotal].
     *
     * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Double> = subtotal

    /**
     * Returns the raw JSON value of [tax].
     *
     * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Double> = tax

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
         * Returns a mutable builder for constructing an instance of [CustomerListInvoicesResponse].
         *
         * The following fields are required:
         * ```java
         * .contractExternalId()
         * .currency()
         * .customerExternalId()
         * .discount()
         * .dueDate()
         * .invoiceExternalId()
         * .invoiceId()
         * .invoiceNumber()
         * .issueDate()
         * .lineItems()
         * .paidDate()
         * .state()
         * .subtotal()
         * .tax()
         * .total()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerListInvoicesResponse]. */
    class Builder internal constructor() {

        private var contractExternalId: JsonField<String>? = null
        private var currency: JsonField<String>? = null
        private var customerExternalId: JsonField<String>? = null
        private var discount: JsonField<Double>? = null
        private var dueDate: JsonField<OffsetDateTime>? = null
        private var invoiceExternalId: JsonField<String>? = null
        private var invoiceId: JsonField<String>? = null
        private var invoiceNumber: JsonField<String>? = null
        private var issueDate: JsonField<OffsetDateTime>? = null
        private var lineItems: JsonField<MutableList<LineItem>>? = null
        private var paidDate: JsonField<OffsetDateTime>? = null
        private var state: JsonField<State>? = null
        private var subtotal: JsonField<Double>? = null
        private var tax: JsonField<Double>? = null
        private var total: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerListInvoicesResponse: CustomerListInvoicesResponse) = apply {
            contractExternalId = customerListInvoicesResponse.contractExternalId
            currency = customerListInvoicesResponse.currency
            customerExternalId = customerListInvoicesResponse.customerExternalId
            discount = customerListInvoicesResponse.discount
            dueDate = customerListInvoicesResponse.dueDate
            invoiceExternalId = customerListInvoicesResponse.invoiceExternalId
            invoiceId = customerListInvoicesResponse.invoiceId
            invoiceNumber = customerListInvoicesResponse.invoiceNumber
            issueDate = customerListInvoicesResponse.issueDate
            lineItems = customerListInvoicesResponse.lineItems.map { it.toMutableList() }
            paidDate = customerListInvoicesResponse.paidDate
            state = customerListInvoicesResponse.state
            subtotal = customerListInvoicesResponse.subtotal
            tax = customerListInvoicesResponse.tax
            total = customerListInvoicesResponse.total
            additionalProperties = customerListInvoicesResponse.additionalProperties.toMutableMap()
        }

        /**
         * External ID of the contract the invoice belongs to: your contract ref when mapped,
         * otherwise the Received contract ID
         */
        fun contractExternalId(contractExternalId: String?) =
            contractExternalId(JsonField.ofNullable(contractExternalId))

        /**
         * Alias for calling [Builder.contractExternalId] with `contractExternalId.orElse(null)`.
         */
        fun contractExternalId(contractExternalId: Optional<String>) =
            contractExternalId(contractExternalId.getOrNull())

        /**
         * Sets [Builder.contractExternalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractExternalId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contractExternalId(contractExternalId: JsonField<String>) = apply {
            this.contractExternalId = contractExternalId
        }

        /** The ISO-4217 currency code of the invoice */
        fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * External ID of the customer the invoice belongs to: your customer ref when mapped,
         * otherwise the Received customer ID
         */
        fun customerExternalId(customerExternalId: String?) =
            customerExternalId(JsonField.ofNullable(customerExternalId))

        /**
         * Alias for calling [Builder.customerExternalId] with `customerExternalId.orElse(null)`.
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

        /** The total discount amount */
        fun discount(discount: Double?) = discount(JsonField.ofNullable(discount))

        /**
         * Alias for [Builder.discount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun discount(discount: Double) = discount(discount as Double?)

        /** Alias for calling [Builder.discount] with `discount.orElse(null)`. */
        fun discount(discount: Optional<Double>) = discount(discount.getOrNull())

        /**
         * Sets [Builder.discount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun discount(discount: JsonField<Double>) = apply { this.discount = discount }

        /** The date payment is due */
        fun dueDate(dueDate: OffsetDateTime?) = dueDate(JsonField.ofNullable(dueDate))

        /** Alias for calling [Builder.dueDate] with `dueDate.orElse(null)`. */
        fun dueDate(dueDate: Optional<OffsetDateTime>) = dueDate(dueDate.getOrNull())

        /**
         * Sets [Builder.dueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

        /**
         * External ID for the invoice: the mapped external ID when one exists, otherwise the
         * invoice ID
         */
        fun invoiceExternalId(invoiceExternalId: String?) =
            invoiceExternalId(JsonField.ofNullable(invoiceExternalId))

        /** Alias for calling [Builder.invoiceExternalId] with `invoiceExternalId.orElse(null)`. */
        fun invoiceExternalId(invoiceExternalId: Optional<String>) =
            invoiceExternalId(invoiceExternalId.getOrNull())

        /**
         * Sets [Builder.invoiceExternalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceExternalId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoiceExternalId(invoiceExternalId: JsonField<String>) = apply {
            this.invoiceExternalId = invoiceExternalId
        }

        /** The billing provider (Received) invoice ID */
        fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        /** The invoice document number (or draft number while the invoice is unissued) */
        fun invoiceNumber(invoiceNumber: String?) =
            invoiceNumber(JsonField.ofNullable(invoiceNumber))

        /** Alias for calling [Builder.invoiceNumber] with `invoiceNumber.orElse(null)`. */
        fun invoiceNumber(invoiceNumber: Optional<String>) =
            invoiceNumber(invoiceNumber.getOrNull())

        /**
         * Sets [Builder.invoiceNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceNumber(invoiceNumber: JsonField<String>) = apply {
            this.invoiceNumber = invoiceNumber
        }

        /** The date the invoice was issued */
        fun issueDate(issueDate: OffsetDateTime?) = issueDate(JsonField.ofNullable(issueDate))

        /** Alias for calling [Builder.issueDate] with `issueDate.orElse(null)`. */
        fun issueDate(issueDate: Optional<OffsetDateTime>) = issueDate(issueDate.getOrNull())

        /**
         * Sets [Builder.issueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issueDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issueDate(issueDate: JsonField<OffsetDateTime>) = apply { this.issueDate = issueDate }

        /** The invoice line items */
        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        /**
         * Sets [Builder.lineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItems] with a well-typed `List<LineItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [LineItem] to [lineItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLineItem(lineItem: LineItem) = apply {
            lineItems =
                (lineItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("lineItems", it).add(lineItem)
                }
        }

        /** The date the invoice was reconciled as paid; present once reconciled */
        fun paidDate(paidDate: OffsetDateTime?) = paidDate(JsonField.ofNullable(paidDate))

        /** Alias for calling [Builder.paidDate] with `paidDate.orElse(null)`. */
        fun paidDate(paidDate: Optional<OffsetDateTime>) = paidDate(paidDate.getOrNull())

        /**
         * Sets [Builder.paidDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paidDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paidDate(paidDate: JsonField<OffsetDateTime>) = apply { this.paidDate = paidDate }

        /** The invoice status (open, paid, or canceled) */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** The pre-tax subtotal */
        fun subtotal(subtotal: Double?) = subtotal(JsonField.ofNullable(subtotal))

        /**
         * Alias for [Builder.subtotal].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun subtotal(subtotal: Double) = subtotal(subtotal as Double?)

        /** Alias for calling [Builder.subtotal] with `subtotal.orElse(null)`. */
        fun subtotal(subtotal: Optional<Double>) = subtotal(subtotal.getOrNull())

        /**
         * Sets [Builder.subtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtotal] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

        /** The total tax amount */
        fun tax(tax: Double?) = tax(JsonField.ofNullable(tax))

        /**
         * Alias for [Builder.tax].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun tax(tax: Double) = tax(tax as Double?)

        /** Alias for calling [Builder.tax] with `tax.orElse(null)`. */
        fun tax(tax: Optional<Double>) = tax(tax.getOrNull())

        /**
         * Sets [Builder.tax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tax] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tax(tax: JsonField<Double>) = apply { this.tax = tax }

        /** The total amount due */
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
         * You should usually call [Builder.total] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Double>) = apply { this.total = total }

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
         * Returns an immutable instance of [CustomerListInvoicesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contractExternalId()
         * .currency()
         * .customerExternalId()
         * .discount()
         * .dueDate()
         * .invoiceExternalId()
         * .invoiceId()
         * .invoiceNumber()
         * .issueDate()
         * .lineItems()
         * .paidDate()
         * .state()
         * .subtotal()
         * .tax()
         * .total()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerListInvoicesResponse =
            CustomerListInvoicesResponse(
                checkRequired("contractExternalId", contractExternalId),
                checkRequired("currency", currency),
                checkRequired("customerExternalId", customerExternalId),
                checkRequired("discount", discount),
                checkRequired("dueDate", dueDate),
                checkRequired("invoiceExternalId", invoiceExternalId),
                checkRequired("invoiceId", invoiceId),
                checkRequired("invoiceNumber", invoiceNumber),
                checkRequired("issueDate", issueDate),
                checkRequired("lineItems", lineItems).map { it.toImmutable() },
                checkRequired("paidDate", paidDate),
                checkRequired("state", state),
                checkRequired("subtotal", subtotal),
                checkRequired("tax", tax),
                checkRequired("total", total),
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
    fun validate(): CustomerListInvoicesResponse = apply {
        if (validated) {
            return@apply
        }

        contractExternalId()
        currency()
        customerExternalId()
        discount()
        dueDate()
        invoiceExternalId()
        invoiceId()
        invoiceNumber()
        issueDate()
        lineItems().forEach { it.validate() }
        paidDate()
        state().validate()
        subtotal()
        tax()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (contractExternalId.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (customerExternalId.asKnown().isPresent) 1 else 0) +
            (if (discount.asKnown().isPresent) 1 else 0) +
            (if (dueDate.asKnown().isPresent) 1 else 0) +
            (if (invoiceExternalId.asKnown().isPresent) 1 else 0) +
            (if (invoiceId.asKnown().isPresent) 1 else 0) +
            (if (invoiceNumber.asKnown().isPresent) 1 else 0) +
            (if (issueDate.asKnown().isPresent) 1 else 0) +
            (lineItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (paidDate.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subtotal.asKnown().isPresent) 1 else 0) +
            (if (tax.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0)

    /** A single line item on an invoice. */
    class LineItem
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val description: JsonField<String>,
        private val productExternalId: JsonField<String>,
        private val quantity: JsonField<Double>,
        private val unitPrice: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("productExternalId")
            @ExcludeMissing
            productExternalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unitPrice")
            @ExcludeMissing
            unitPrice: JsonField<Double> = JsonMissing.of(),
        ) : this(amount, description, productExternalId, quantity, unitPrice, mutableMapOf())

        /**
         * Total amount for this line (unit price × quantity)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<Double> = amount.getOptional("amount")

        /**
         * Human-readable description of the line item
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * External ID of the product this line item relates to, when one is mapped
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productExternalId(): Optional<String> =
            productExternalId.getOptional("productExternalId")

        /**
         * Quantity billed on this line
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun quantity(): Optional<Double> = quantity.getOptional("quantity")

        /**
         * Price per unit for this line
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unitPrice(): Optional<Double> = unitPrice.getOptional("unitPrice")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [productExternalId].
         *
         * Unlike [productExternalId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("productExternalId")
        @ExcludeMissing
        fun _productExternalId(): JsonField<String> = productExternalId

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Returns the raw JSON value of [unitPrice].
         *
         * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unitPrice") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

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
             * Returns a mutable builder for constructing an instance of [LineItem].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .description()
             * .productExternalId()
             * .quantity()
             * .unitPrice()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LineItem]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var description: JsonField<String>? = null
            private var productExternalId: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var unitPrice: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                amount = lineItem.amount
                description = lineItem.description
                productExternalId = lineItem.productExternalId
                quantity = lineItem.quantity
                unitPrice = lineItem.unitPrice
                additionalProperties = lineItem.additionalProperties.toMutableMap()
            }

            /** Total amount for this line (unit price × quantity) */
            fun amount(amount: Double?) = amount(JsonField.ofNullable(amount))

            /**
             * Alias for [Builder.amount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun amount(amount: Double) = amount(amount as Double?)

            /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
            fun amount(amount: Optional<Double>) = amount(amount.getOrNull())

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** Human-readable description of the line item */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** External ID of the product this line item relates to, when one is mapped */
            fun productExternalId(productExternalId: String?) =
                productExternalId(JsonField.ofNullable(productExternalId))

            /**
             * Alias for calling [Builder.productExternalId] with `productExternalId.orElse(null)`.
             */
            fun productExternalId(productExternalId: Optional<String>) =
                productExternalId(productExternalId.getOrNull())

            /**
             * Sets [Builder.productExternalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productExternalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productExternalId(productExternalId: JsonField<String>) = apply {
                this.productExternalId = productExternalId
            }

            /** Quantity billed on this line */
            fun quantity(quantity: Double?) = quantity(JsonField.ofNullable(quantity))

            /**
             * Alias for [Builder.quantity].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun quantity(quantity: Double) = quantity(quantity as Double?)

            /** Alias for calling [Builder.quantity] with `quantity.orElse(null)`. */
            fun quantity(quantity: Optional<Double>) = quantity(quantity.getOrNull())

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** Price per unit for this line */
            fun unitPrice(unitPrice: Double?) = unitPrice(JsonField.ofNullable(unitPrice))

            /**
             * Alias for [Builder.unitPrice].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun unitPrice(unitPrice: Double) = unitPrice(unitPrice as Double?)

            /** Alias for calling [Builder.unitPrice] with `unitPrice.orElse(null)`. */
            fun unitPrice(unitPrice: Optional<Double>) = unitPrice(unitPrice.getOrNull())

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

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
             * Returns an immutable instance of [LineItem].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .description()
             * .productExternalId()
             * .quantity()
             * .unitPrice()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LineItem =
                LineItem(
                    checkRequired("amount", amount),
                    checkRequired("description", description),
                    checkRequired("productExternalId", productExternalId),
                    checkRequired("quantity", quantity),
                    checkRequired("unitPrice", unitPrice),
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
        fun validate(): LineItem = apply {
            if (validated) {
                return@apply
            }

            amount()
            description()
            productExternalId()
            quantity()
            unitPrice()
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
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (productExternalId.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (unitPrice.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LineItem &&
                amount == other.amount &&
                description == other.description &&
                productExternalId == other.productExternalId &&
                quantity == other.quantity &&
                unitPrice == other.unitPrice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                description,
                productExternalId,
                quantity,
                unitPrice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{amount=$amount, description=$description, productExternalId=$productExternalId, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
    }

    /** The invoice status (open, paid, or canceled) */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OPEN = of("OPEN")

            @JvmField val CANCELED = of("CANCELED")

            @JvmField val PAID = of("PAID")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            OPEN,
            CANCELED,
            PAID,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPEN,
            CANCELED,
            PAID,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                OPEN -> Value.OPEN
                CANCELED -> Value.CANCELED
                PAID -> Value.PAID
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
                OPEN -> Known.OPEN
                CANCELED -> Known.CANCELED
                PAID -> Known.PAID
                else -> throw StiggInvalidDataException("Unknown State: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListInvoicesResponse &&
            contractExternalId == other.contractExternalId &&
            currency == other.currency &&
            customerExternalId == other.customerExternalId &&
            discount == other.discount &&
            dueDate == other.dueDate &&
            invoiceExternalId == other.invoiceExternalId &&
            invoiceId == other.invoiceId &&
            invoiceNumber == other.invoiceNumber &&
            issueDate == other.issueDate &&
            lineItems == other.lineItems &&
            paidDate == other.paidDate &&
            state == other.state &&
            subtotal == other.subtotal &&
            tax == other.tax &&
            total == other.total &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            contractExternalId,
            currency,
            customerExternalId,
            discount,
            dueDate,
            invoiceExternalId,
            invoiceId,
            invoiceNumber,
            issueDate,
            lineItems,
            paidDate,
            state,
            subtotal,
            tax,
            total,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerListInvoicesResponse{contractExternalId=$contractExternalId, currency=$currency, customerExternalId=$customerExternalId, discount=$discount, dueDate=$dueDate, invoiceExternalId=$invoiceExternalId, invoiceId=$invoiceId, invoiceNumber=$invoiceNumber, issueDate=$issueDate, lineItems=$lineItems, paidDate=$paidDate, state=$state, subtotal=$subtotal, tax=$tax, total=$total, additionalProperties=$additionalProperties}"
}
