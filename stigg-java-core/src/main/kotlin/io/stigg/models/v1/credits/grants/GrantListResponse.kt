// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.grants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.stigg.core.Enum
import io.stigg.core.ExcludeMissing
import io.stigg.core.JsonField
import io.stigg.core.JsonMissing
import io.stigg.core.JsonValue
import io.stigg.core.checkRequired
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Credit grant object representing allocated credits for a customer */
class GrantListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Double>,
    private val comment: JsonField<String>,
    private val consumedAmount: JsonField<Double>,
    private val cost: JsonField<Cost>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currencyId: JsonField<String>,
    private val customerId: JsonField<String>,
    private val displayName: JsonField<String>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val expireAt: JsonField<OffsetDateTime>,
    private val grantType: JsonField<GrantType>,
    private val invoiceId: JsonField<String>,
    private val latestInvoice: JsonField<LatestInvoice>,
    private val metadata: JsonField<Metadata>,
    private val paymentCollection: JsonField<PaymentCollection>,
    private val priority: JsonField<Double>,
    private val resourceId: JsonField<String>,
    private val sourceType: JsonField<SourceType>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val voidedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("consumedAmount")
        @ExcludeMissing
        consumedAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("cost") @ExcludeMissing cost: JsonField<Cost> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currencyId")
        @ExcludeMissing
        currencyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("displayName")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effectiveAt")
        @ExcludeMissing
        effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expireAt")
        @ExcludeMissing
        expireAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("grantType")
        @ExcludeMissing
        grantType: JsonField<GrantType> = JsonMissing.of(),
        @JsonProperty("invoiceId") @ExcludeMissing invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("latestInvoice")
        @ExcludeMissing
        latestInvoice: JsonField<LatestInvoice> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("paymentCollection")
        @ExcludeMissing
        paymentCollection: JsonField<PaymentCollection> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("resourceId")
        @ExcludeMissing
        resourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceType")
        @ExcludeMissing
        sourceType: JsonField<SourceType> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("voidedAt")
        @ExcludeMissing
        voidedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        comment,
        consumedAmount,
        cost,
        createdAt,
        currencyId,
        customerId,
        displayName,
        effectiveAt,
        expireAt,
        grantType,
        invoiceId,
        latestInvoice,
        metadata,
        paymentCollection,
        priority,
        resourceId,
        sourceType,
        status,
        updatedAt,
        voidedAt,
        mutableMapOf(),
    )

    /**
     * The unique readable identifier of the credit grant
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The total credits granted
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Double = amount.getRequired("amount")

    /**
     * An optional comment on the credit grant
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comment(): Optional<String> = comment.getOptional("comment")

    /**
     * The total credits consumed from this grant
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun consumedAmount(): Double = consumedAmount.getRequired("consumedAmount")

    /**
     * The monetary cost of the credit grant
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cost(): Cost = cost.getRequired("cost")

    /**
     * Timestamp of when the record was created
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The currency identifier for this grant
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currencyId(): String = currencyId.getRequired("currencyId")

    /**
     * The customer ID this grant belongs to
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customerId")

    /**
     * The display name of the credit grant
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("displayName")

    /**
     * The date when the credit grant becomes effective
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effectiveAt")

    /**
     * The date when the credit grant expires
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expireAt(): Optional<OffsetDateTime> = expireAt.getOptional("expireAt")

    /**
     * The type of credit grant (PAID, PROMOTIONAL, RECURRING)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun grantType(): GrantType = grantType.getRequired("grantType")

    /**
     * The billing invoice ID associated with this grant
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceId(): Optional<String> = invoiceId.getOptional("invoiceId")

    /**
     * The latest invoice details for this grant
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestInvoice(): Optional<LatestInvoice> = latestInvoice.getOptional("latestInvoice")

    /**
     * Metadata associated with the entity
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * The payment collection status
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentCollection(): PaymentCollection = paymentCollection.getRequired("paymentCollection")

    /**
     * The priority of the credit grant (lower number = higher priority)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun priority(): Double = priority.getRequired("priority")

    /**
     * The resource ID this grant is scoped to
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceId(): Optional<String> = resourceId.getOptional("resourceId")

    /**
     * The source type of the grant (PRICE, PLAN_ENTITLEMENT, ADDON_ENTITLEMENT)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceType(): Optional<SourceType> = sourceType.getOptional("sourceType")

    /**
     * The effective status of the credit grant
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Timestamp of when the record was last updated
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * The date when the credit grant was voided
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voidedAt(): Optional<OffsetDateTime> = voidedAt.getOptional("voidedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

    /**
     * Returns the raw JSON value of [consumedAmount].
     *
     * Unlike [consumedAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("consumedAmount")
    @ExcludeMissing
    fun _consumedAmount(): JsonField<Double> = consumedAmount

    /**
     * Returns the raw JSON value of [cost].
     *
     * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Cost> = cost

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currencyId].
     *
     * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currencyId") @ExcludeMissing fun _currencyId(): JsonField<String> = currencyId

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayName") @ExcludeMissing fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [effectiveAt].
     *
     * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effectiveAt")
    @ExcludeMissing
    fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

    /**
     * Returns the raw JSON value of [expireAt].
     *
     * Unlike [expireAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expireAt") @ExcludeMissing fun _expireAt(): JsonField<OffsetDateTime> = expireAt

    /**
     * Returns the raw JSON value of [grantType].
     *
     * Unlike [grantType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grantType") @ExcludeMissing fun _grantType(): JsonField<GrantType> = grantType

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoiceId") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    /**
     * Returns the raw JSON value of [latestInvoice].
     *
     * Unlike [latestInvoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latestInvoice")
    @ExcludeMissing
    fun _latestInvoice(): JsonField<LatestInvoice> = latestInvoice

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [paymentCollection].
     *
     * Unlike [paymentCollection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("paymentCollection")
    @ExcludeMissing
    fun _paymentCollection(): JsonField<PaymentCollection> = paymentCollection

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

    /**
     * Returns the raw JSON value of [resourceId].
     *
     * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resourceId") @ExcludeMissing fun _resourceId(): JsonField<String> = resourceId

    /**
     * Returns the raw JSON value of [sourceType].
     *
     * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceType")
    @ExcludeMissing
    fun _sourceType(): JsonField<SourceType> = sourceType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [voidedAt].
     *
     * Unlike [voidedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voidedAt") @ExcludeMissing fun _voidedAt(): JsonField<OffsetDateTime> = voidedAt

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
         * Returns a mutable builder for constructing an instance of [GrantListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .comment()
         * .consumedAmount()
         * .cost()
         * .createdAt()
         * .currencyId()
         * .customerId()
         * .displayName()
         * .effectiveAt()
         * .expireAt()
         * .grantType()
         * .invoiceId()
         * .latestInvoice()
         * .metadata()
         * .paymentCollection()
         * .priority()
         * .resourceId()
         * .sourceType()
         * .status()
         * .updatedAt()
         * .voidedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GrantListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Double>? = null
        private var comment: JsonField<String>? = null
        private var consumedAmount: JsonField<Double>? = null
        private var cost: JsonField<Cost>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currencyId: JsonField<String>? = null
        private var customerId: JsonField<String>? = null
        private var displayName: JsonField<String>? = null
        private var effectiveAt: JsonField<OffsetDateTime>? = null
        private var expireAt: JsonField<OffsetDateTime>? = null
        private var grantType: JsonField<GrantType>? = null
        private var invoiceId: JsonField<String>? = null
        private var latestInvoice: JsonField<LatestInvoice>? = null
        private var metadata: JsonField<Metadata>? = null
        private var paymentCollection: JsonField<PaymentCollection>? = null
        private var priority: JsonField<Double>? = null
        private var resourceId: JsonField<String>? = null
        private var sourceType: JsonField<SourceType>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var voidedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(grantListResponse: GrantListResponse) = apply {
            id = grantListResponse.id
            amount = grantListResponse.amount
            comment = grantListResponse.comment
            consumedAmount = grantListResponse.consumedAmount
            cost = grantListResponse.cost
            createdAt = grantListResponse.createdAt
            currencyId = grantListResponse.currencyId
            customerId = grantListResponse.customerId
            displayName = grantListResponse.displayName
            effectiveAt = grantListResponse.effectiveAt
            expireAt = grantListResponse.expireAt
            grantType = grantListResponse.grantType
            invoiceId = grantListResponse.invoiceId
            latestInvoice = grantListResponse.latestInvoice
            metadata = grantListResponse.metadata
            paymentCollection = grantListResponse.paymentCollection
            priority = grantListResponse.priority
            resourceId = grantListResponse.resourceId
            sourceType = grantListResponse.sourceType
            status = grantListResponse.status
            updatedAt = grantListResponse.updatedAt
            voidedAt = grantListResponse.voidedAt
            additionalProperties = grantListResponse.additionalProperties.toMutableMap()
        }

        /** The unique readable identifier of the credit grant */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The total credits granted */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /** An optional comment on the credit grant */
        fun comment(comment: String?) = comment(JsonField.ofNullable(comment))

        /** Alias for calling [Builder.comment] with `comment.orElse(null)`. */
        fun comment(comment: Optional<String>) = comment(comment.getOrNull())

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { this.comment = comment }

        /** The total credits consumed from this grant */
        fun consumedAmount(consumedAmount: Double) = consumedAmount(JsonField.of(consumedAmount))

        /**
         * Sets [Builder.consumedAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consumedAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun consumedAmount(consumedAmount: JsonField<Double>) = apply {
            this.consumedAmount = consumedAmount
        }

        /** The monetary cost of the credit grant */
        fun cost(cost: Cost) = cost(JsonField.of(cost))

        /**
         * Sets [Builder.cost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cost] with a well-typed [Cost] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cost(cost: JsonField<Cost>) = apply { this.cost = cost }

        /** Timestamp of when the record was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The currency identifier for this grant */
        fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

        /**
         * Sets [Builder.currencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

        /** The customer ID this grant belongs to */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** The display name of the credit grant */
        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        /** The date when the credit grant becomes effective */
        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        /**
         * Sets [Builder.effectiveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        /** The date when the credit grant expires */
        fun expireAt(expireAt: OffsetDateTime?) = expireAt(JsonField.ofNullable(expireAt))

        /** Alias for calling [Builder.expireAt] with `expireAt.orElse(null)`. */
        fun expireAt(expireAt: Optional<OffsetDateTime>) = expireAt(expireAt.getOrNull())

        /**
         * Sets [Builder.expireAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expireAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expireAt(expireAt: JsonField<OffsetDateTime>) = apply { this.expireAt = expireAt }

        /** The type of credit grant (PAID, PROMOTIONAL, RECURRING) */
        fun grantType(grantType: GrantType) = grantType(JsonField.of(grantType))

        /**
         * Sets [Builder.grantType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grantType] with a well-typed [GrantType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun grantType(grantType: JsonField<GrantType>) = apply { this.grantType = grantType }

        /** The billing invoice ID associated with this grant */
        fun invoiceId(invoiceId: String?) = invoiceId(JsonField.ofNullable(invoiceId))

        /** Alias for calling [Builder.invoiceId] with `invoiceId.orElse(null)`. */
        fun invoiceId(invoiceId: Optional<String>) = invoiceId(invoiceId.getOrNull())

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        /** The latest invoice details for this grant */
        fun latestInvoice(latestInvoice: LatestInvoice?) =
            latestInvoice(JsonField.ofNullable(latestInvoice))

        /** Alias for calling [Builder.latestInvoice] with `latestInvoice.orElse(null)`. */
        fun latestInvoice(latestInvoice: Optional<LatestInvoice>) =
            latestInvoice(latestInvoice.getOrNull())

        /**
         * Sets [Builder.latestInvoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestInvoice] with a well-typed [LatestInvoice] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun latestInvoice(latestInvoice: JsonField<LatestInvoice>) = apply {
            this.latestInvoice = latestInvoice
        }

        /** Metadata associated with the entity */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The payment collection status */
        fun paymentCollection(paymentCollection: PaymentCollection) =
            paymentCollection(JsonField.of(paymentCollection))

        /**
         * Sets [Builder.paymentCollection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentCollection] with a well-typed [PaymentCollection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentCollection(paymentCollection: JsonField<PaymentCollection>) = apply {
            this.paymentCollection = paymentCollection
        }

        /** The priority of the credit grant (lower number = higher priority) */
        fun priority(priority: Double) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        /** The resource ID this grant is scoped to */
        fun resourceId(resourceId: String?) = resourceId(JsonField.ofNullable(resourceId))

        /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
        fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

        /**
         * Sets [Builder.resourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

        /** The source type of the grant (PRICE, PLAN_ENTITLEMENT, ADDON_ENTITLEMENT) */
        fun sourceType(sourceType: SourceType?) = sourceType(JsonField.ofNullable(sourceType))

        /** Alias for calling [Builder.sourceType] with `sourceType.orElse(null)`. */
        fun sourceType(sourceType: Optional<SourceType>) = sourceType(sourceType.getOrNull())

        /**
         * Sets [Builder.sourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceType(sourceType: JsonField<SourceType>) = apply { this.sourceType = sourceType }

        /** The effective status of the credit grant */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Timestamp of when the record was last updated */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The date when the credit grant was voided */
        fun voidedAt(voidedAt: OffsetDateTime?) = voidedAt(JsonField.ofNullable(voidedAt))

        /** Alias for calling [Builder.voidedAt] with `voidedAt.orElse(null)`. */
        fun voidedAt(voidedAt: Optional<OffsetDateTime>) = voidedAt(voidedAt.getOrNull())

        /**
         * Sets [Builder.voidedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voidedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

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
         * Returns an immutable instance of [GrantListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .comment()
         * .consumedAmount()
         * .cost()
         * .createdAt()
         * .currencyId()
         * .customerId()
         * .displayName()
         * .effectiveAt()
         * .expireAt()
         * .grantType()
         * .invoiceId()
         * .latestInvoice()
         * .metadata()
         * .paymentCollection()
         * .priority()
         * .resourceId()
         * .sourceType()
         * .status()
         * .updatedAt()
         * .voidedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GrantListResponse =
            GrantListResponse(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("comment", comment),
                checkRequired("consumedAmount", consumedAmount),
                checkRequired("cost", cost),
                checkRequired("createdAt", createdAt),
                checkRequired("currencyId", currencyId),
                checkRequired("customerId", customerId),
                checkRequired("displayName", displayName),
                checkRequired("effectiveAt", effectiveAt),
                checkRequired("expireAt", expireAt),
                checkRequired("grantType", grantType),
                checkRequired("invoiceId", invoiceId),
                checkRequired("latestInvoice", latestInvoice),
                checkRequired("metadata", metadata),
                checkRequired("paymentCollection", paymentCollection),
                checkRequired("priority", priority),
                checkRequired("resourceId", resourceId),
                checkRequired("sourceType", sourceType),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                checkRequired("voidedAt", voidedAt),
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
    fun validate(): GrantListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        comment()
        consumedAmount()
        cost().validate()
        createdAt()
        currencyId()
        customerId()
        displayName()
        effectiveAt()
        expireAt()
        grantType().validate()
        invoiceId()
        latestInvoice().ifPresent { it.validate() }
        metadata().validate()
        paymentCollection().validate()
        priority()
        resourceId()
        sourceType().ifPresent { it.validate() }
        status().validate()
        updatedAt()
        voidedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (comment.asKnown().isPresent) 1 else 0) +
            (if (consumedAmount.asKnown().isPresent) 1 else 0) +
            (cost.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (currencyId.asKnown().isPresent) 1 else 0) +
            (if (customerId.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (effectiveAt.asKnown().isPresent) 1 else 0) +
            (if (expireAt.asKnown().isPresent) 1 else 0) +
            (grantType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (invoiceId.asKnown().isPresent) 1 else 0) +
            (latestInvoice.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (paymentCollection.asKnown().getOrNull()?.validity() ?: 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (if (resourceId.asKnown().isPresent) 1 else 0) +
            (sourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (voidedAt.asKnown().isPresent) 1 else 0)

    /** The monetary cost of the credit grant */
    class Cost
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val currency: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        ) : this(amount, currency, mutableMapOf())

        /**
         * The cost amount
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * The currency code
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
             * Returns a mutable builder for constructing an instance of [Cost].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .currency()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cost]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var currency: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cost: Cost) = apply {
                amount = cost.amount
                currency = cost.currency
                additionalProperties = cost.additionalProperties.toMutableMap()
            }

            /** The cost amount */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** The currency code */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
             * Returns an immutable instance of [Cost].
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
            fun build(): Cost =
                Cost(
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws StiggInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Cost = apply {
            if (validated) {
                return@apply
            }

            amount()
            currency()
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
                (if (currency.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cost &&
                amount == other.amount &&
                currency == other.currency &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, currency, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cost{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
    }

    /** The type of credit grant (PAID, PROMOTIONAL, RECURRING) */
    class GrantType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PAID = of("PAID")

            @JvmField val PROMOTIONAL = of("PROMOTIONAL")

            @JvmField val RECURRING = of("RECURRING")

            @JvmField val OVERDRAFT = of("OVERDRAFT")

            @JvmStatic fun of(value: String) = GrantType(JsonField.of(value))
        }

        /** An enum containing [GrantType]'s known values. */
        enum class Known {
            PAID,
            PROMOTIONAL,
            RECURRING,
            OVERDRAFT,
        }

        /**
         * An enum containing [GrantType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [GrantType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAID,
            PROMOTIONAL,
            RECURRING,
            OVERDRAFT,
            /**
             * An enum member indicating that [GrantType] was instantiated with an unknown value.
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
                PAID -> Value.PAID
                PROMOTIONAL -> Value.PROMOTIONAL
                RECURRING -> Value.RECURRING
                OVERDRAFT -> Value.OVERDRAFT
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
                PAID -> Known.PAID
                PROMOTIONAL -> Known.PROMOTIONAL
                RECURRING -> Known.RECURRING
                OVERDRAFT -> Known.OVERDRAFT
                else -> throw StiggInvalidDataException("Unknown GrantType: $value")
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
        fun validate(): GrantType = apply {
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

            return other is GrantType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The latest invoice details for this grant */
    class LatestInvoice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingId: JsonField<String>,
        private val billingReason: JsonField<BillingReason>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<String>,
        private val dueDate: JsonField<OffsetDateTime>,
        private val errorMessage: JsonField<String>,
        private val paymentUrl: JsonField<String>,
        private val pdfUrl: JsonField<String>,
        private val requiresAction: JsonField<Boolean>,
        private val status: JsonField<Status>,
        private val subTotal: JsonField<Double>,
        private val tax: JsonField<Double>,
        private val total: JsonField<Double>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billingId")
            @ExcludeMissing
            billingId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billingReason")
            @ExcludeMissing
            billingReason: JsonField<BillingReason> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dueDate")
            @ExcludeMissing
            dueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("errorMessage")
            @ExcludeMissing
            errorMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentUrl")
            @ExcludeMissing
            paymentUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pdfUrl") @ExcludeMissing pdfUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requiresAction")
            @ExcludeMissing
            requiresAction: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("subTotal")
            @ExcludeMissing
            subTotal: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            billingId,
            billingReason,
            createdAt,
            currency,
            dueDate,
            errorMessage,
            paymentUrl,
            pdfUrl,
            requiresAction,
            status,
            subTotal,
            tax,
            total,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * The billing provider invoice ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingId(): String = billingId.getRequired("billingId")

        /**
         * The billing reason for the invoice
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingReason(): Optional<BillingReason> = billingReason.getOptional("billingReason")

        /**
         * The invoice creation date
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * The invoice currency
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * The invoice due date
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dueDate(): Optional<OffsetDateTime> = dueDate.getOptional("dueDate")

        /**
         * Error message if payment failed
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errorMessage(): Optional<String> = errorMessage.getOptional("errorMessage")

        /**
         * The payment URL for settling the invoice
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentUrl(): Optional<String> = paymentUrl.getOptional("paymentUrl")

        /**
         * The PDF URL of the invoice
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pdfUrl(): Optional<String> = pdfUrl.getOptional("pdfUrl")

        /**
         * Whether the invoice requires user action
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requiresAction(): Boolean = requiresAction.getRequired("requiresAction")

        /**
         * The invoice status
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * The subtotal amount before tax
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subTotal(): Optional<Double> = subTotal.getOptional("subTotal")

        /**
         * The tax amount
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tax(): Optional<Double> = tax.getOptional("tax")

        /**
         * The total amount including tax
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun total(): Optional<Double> = total.getOptional("total")

        /**
         * The invoice last update date
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

        /**
         * Returns the raw JSON value of [billingId].
         *
         * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billingId") @ExcludeMissing fun _billingId(): JsonField<String> = billingId

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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [dueDate].
         *
         * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dueDate") @ExcludeMissing fun _dueDate(): JsonField<OffsetDateTime> = dueDate

        /**
         * Returns the raw JSON value of [errorMessage].
         *
         * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("errorMessage")
        @ExcludeMissing
        fun _errorMessage(): JsonField<String> = errorMessage

        /**
         * Returns the raw JSON value of [paymentUrl].
         *
         * Unlike [paymentUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paymentUrl")
        @ExcludeMissing
        fun _paymentUrl(): JsonField<String> = paymentUrl

        /**
         * Returns the raw JSON value of [pdfUrl].
         *
         * Unlike [pdfUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pdfUrl") @ExcludeMissing fun _pdfUrl(): JsonField<String> = pdfUrl

        /**
         * Returns the raw JSON value of [requiresAction].
         *
         * Unlike [requiresAction], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [subTotal].
         *
         * Unlike [subTotal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subTotal") @ExcludeMissing fun _subTotal(): JsonField<Double> = subTotal

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
             * Returns a mutable builder for constructing an instance of [LatestInvoice].
             *
             * The following fields are required:
             * ```java
             * .billingId()
             * .billingReason()
             * .createdAt()
             * .currency()
             * .dueDate()
             * .errorMessage()
             * .paymentUrl()
             * .pdfUrl()
             * .requiresAction()
             * .status()
             * .subTotal()
             * .tax()
             * .total()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LatestInvoice]. */
        class Builder internal constructor() {

            private var billingId: JsonField<String>? = null
            private var billingReason: JsonField<BillingReason>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var currency: JsonField<String>? = null
            private var dueDate: JsonField<OffsetDateTime>? = null
            private var errorMessage: JsonField<String>? = null
            private var paymentUrl: JsonField<String>? = null
            private var pdfUrl: JsonField<String>? = null
            private var requiresAction: JsonField<Boolean>? = null
            private var status: JsonField<Status>? = null
            private var subTotal: JsonField<Double>? = null
            private var tax: JsonField<Double>? = null
            private var total: JsonField<Double>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(latestInvoice: LatestInvoice) = apply {
                billingId = latestInvoice.billingId
                billingReason = latestInvoice.billingReason
                createdAt = latestInvoice.createdAt
                currency = latestInvoice.currency
                dueDate = latestInvoice.dueDate
                errorMessage = latestInvoice.errorMessage
                paymentUrl = latestInvoice.paymentUrl
                pdfUrl = latestInvoice.pdfUrl
                requiresAction = latestInvoice.requiresAction
                status = latestInvoice.status
                subTotal = latestInvoice.subTotal
                tax = latestInvoice.tax
                total = latestInvoice.total
                updatedAt = latestInvoice.updatedAt
                additionalProperties = latestInvoice.additionalProperties.toMutableMap()
            }

            /** The billing provider invoice ID */
            fun billingId(billingId: String) = billingId(JsonField.of(billingId))

            /**
             * Sets [Builder.billingId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingId(billingId: JsonField<String>) = apply { this.billingId = billingId }

            /** The billing reason for the invoice */
            fun billingReason(billingReason: BillingReason?) =
                billingReason(JsonField.ofNullable(billingReason))

            /** Alias for calling [Builder.billingReason] with `billingReason.orElse(null)`. */
            fun billingReason(billingReason: Optional<BillingReason>) =
                billingReason(billingReason.getOrNull())

            /**
             * Sets [Builder.billingReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingReason] with a well-typed [BillingReason]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingReason(billingReason: JsonField<BillingReason>) = apply {
                this.billingReason = billingReason
            }

            /** The invoice creation date */
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

            /** The invoice currency */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
            fun currency(currency: Optional<String>) = currency(currency.getOrNull())

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** The invoice due date */
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

            /** Error message if payment failed */
            fun errorMessage(errorMessage: String?) =
                errorMessage(JsonField.ofNullable(errorMessage))

            /** Alias for calling [Builder.errorMessage] with `errorMessage.orElse(null)`. */
            fun errorMessage(errorMessage: Optional<String>) =
                errorMessage(errorMessage.getOrNull())

            /**
             * Sets [Builder.errorMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorMessage(errorMessage: JsonField<String>) = apply {
                this.errorMessage = errorMessage
            }

            /** The payment URL for settling the invoice */
            fun paymentUrl(paymentUrl: String?) = paymentUrl(JsonField.ofNullable(paymentUrl))

            /** Alias for calling [Builder.paymentUrl] with `paymentUrl.orElse(null)`. */
            fun paymentUrl(paymentUrl: Optional<String>) = paymentUrl(paymentUrl.getOrNull())

            /**
             * Sets [Builder.paymentUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentUrl(paymentUrl: JsonField<String>) = apply { this.paymentUrl = paymentUrl }

            /** The PDF URL of the invoice */
            fun pdfUrl(pdfUrl: String?) = pdfUrl(JsonField.ofNullable(pdfUrl))

            /** Alias for calling [Builder.pdfUrl] with `pdfUrl.orElse(null)`. */
            fun pdfUrl(pdfUrl: Optional<String>) = pdfUrl(pdfUrl.getOrNull())

            /**
             * Sets [Builder.pdfUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pdfUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pdfUrl(pdfUrl: JsonField<String>) = apply { this.pdfUrl = pdfUrl }

            /** Whether the invoice requires user action */
            fun requiresAction(requiresAction: Boolean) =
                requiresAction(JsonField.of(requiresAction))

            /**
             * Sets [Builder.requiresAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requiresAction] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requiresAction(requiresAction: JsonField<Boolean>) = apply {
                this.requiresAction = requiresAction
            }

            /** The invoice status */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The subtotal amount before tax */
            fun subTotal(subTotal: Double?) = subTotal(JsonField.ofNullable(subTotal))

            /**
             * Alias for [Builder.subTotal].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun subTotal(subTotal: Double) = subTotal(subTotal as Double?)

            /** Alias for calling [Builder.subTotal] with `subTotal.orElse(null)`. */
            fun subTotal(subTotal: Optional<Double>) = subTotal(subTotal.getOrNull())

            /**
             * Sets [Builder.subTotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subTotal] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subTotal(subTotal: JsonField<Double>) = apply { this.subTotal = subTotal }

            /** The tax amount */
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tax(tax: JsonField<Double>) = apply { this.tax = tax }

            /** The total amount including tax */
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

            /** The invoice last update date */
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
             * Returns an immutable instance of [LatestInvoice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billingId()
             * .billingReason()
             * .createdAt()
             * .currency()
             * .dueDate()
             * .errorMessage()
             * .paymentUrl()
             * .pdfUrl()
             * .requiresAction()
             * .status()
             * .subTotal()
             * .tax()
             * .total()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LatestInvoice =
                LatestInvoice(
                    checkRequired("billingId", billingId),
                    checkRequired("billingReason", billingReason),
                    checkRequired("createdAt", createdAt),
                    checkRequired("currency", currency),
                    checkRequired("dueDate", dueDate),
                    checkRequired("errorMessage", errorMessage),
                    checkRequired("paymentUrl", paymentUrl),
                    checkRequired("pdfUrl", pdfUrl),
                    checkRequired("requiresAction", requiresAction),
                    checkRequired("status", status),
                    checkRequired("subTotal", subTotal),
                    checkRequired("tax", tax),
                    checkRequired("total", total),
                    checkRequired("updatedAt", updatedAt),
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
        fun validate(): LatestInvoice = apply {
            if (validated) {
                return@apply
            }

            billingId()
            billingReason().ifPresent { it.validate() }
            createdAt()
            currency()
            dueDate()
            errorMessage()
            paymentUrl()
            pdfUrl()
            requiresAction()
            status().validate()
            subTotal()
            tax()
            total()
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
            (if (billingId.asKnown().isPresent) 1 else 0) +
                (billingReason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (dueDate.asKnown().isPresent) 1 else 0) +
                (if (errorMessage.asKnown().isPresent) 1 else 0) +
                (if (paymentUrl.asKnown().isPresent) 1 else 0) +
                (if (pdfUrl.asKnown().isPresent) 1 else 0) +
                (if (requiresAction.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (subTotal.asKnown().isPresent) 1 else 0) +
                (if (tax.asKnown().isPresent) 1 else 0) +
                (if (total.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /** The billing reason for the invoice */
        class BillingReason @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val MANUAL = of("MANUAL")

                @JvmField val OTHER = of("OTHER")

                @JvmStatic fun of(value: String) = BillingReason(JsonField.of(value))
            }

            /** An enum containing [BillingReason]'s known values. */
            enum class Known {
                MANUAL,
                OTHER,
            }

            /**
             * An enum containing [BillingReason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillingReason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MANUAL,
                OTHER,
                /**
                 * An enum member indicating that [BillingReason] was instantiated with an unknown
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
                    MANUAL -> Value.MANUAL
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
                    MANUAL -> Known.MANUAL
                    OTHER -> Known.OTHER
                    else -> throw StiggInvalidDataException("Unknown BillingReason: $value")
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

        /** The invoice status */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val OPEN = of("OPEN")

                @JvmField val PAID = of("PAID")

                @JvmField val CANCELED = of("CANCELED")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                OPEN,
                PAID,
                CANCELED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OPEN,
                PAID,
                CANCELED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    OPEN -> Value.OPEN
                    PAID -> Value.PAID
                    CANCELED -> Value.CANCELED
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
                    PAID -> Known.PAID
                    CANCELED -> Known.CANCELED
                    else -> throw StiggInvalidDataException("Unknown Status: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LatestInvoice &&
                billingId == other.billingId &&
                billingReason == other.billingReason &&
                createdAt == other.createdAt &&
                currency == other.currency &&
                dueDate == other.dueDate &&
                errorMessage == other.errorMessage &&
                paymentUrl == other.paymentUrl &&
                pdfUrl == other.pdfUrl &&
                requiresAction == other.requiresAction &&
                status == other.status &&
                subTotal == other.subTotal &&
                tax == other.tax &&
                total == other.total &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingId,
                billingReason,
                createdAt,
                currency,
                dueDate,
                errorMessage,
                paymentUrl,
                pdfUrl,
                requiresAction,
                status,
                subTotal,
                tax,
                total,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LatestInvoice{billingId=$billingId, billingReason=$billingReason, createdAt=$createdAt, currency=$currency, dueDate=$dueDate, errorMessage=$errorMessage, paymentUrl=$paymentUrl, pdfUrl=$pdfUrl, requiresAction=$requiresAction, status=$status, subTotal=$subTotal, tax=$tax, total=$total, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** Metadata associated with the entity */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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

    /** The payment collection status */
    class PaymentCollection @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val NOT_REQUIRED = of("NOT_REQUIRED")

            @JvmField val PROCESSING = of("PROCESSING")

            @JvmField val FAILED = of("FAILED")

            @JvmField val ACTION_REQUIRED = of("ACTION_REQUIRED")

            @JvmStatic fun of(value: String) = PaymentCollection(JsonField.of(value))
        }

        /** An enum containing [PaymentCollection]'s known values. */
        enum class Known {
            NOT_REQUIRED,
            PROCESSING,
            FAILED,
            ACTION_REQUIRED,
        }

        /**
         * An enum containing [PaymentCollection]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentCollection] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NOT_REQUIRED,
            PROCESSING,
            FAILED,
            ACTION_REQUIRED,
            /**
             * An enum member indicating that [PaymentCollection] was instantiated with an unknown
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
                NOT_REQUIRED -> Value.NOT_REQUIRED
                PROCESSING -> Value.PROCESSING
                FAILED -> Value.FAILED
                ACTION_REQUIRED -> Value.ACTION_REQUIRED
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
                NOT_REQUIRED -> Known.NOT_REQUIRED
                PROCESSING -> Known.PROCESSING
                FAILED -> Known.FAILED
                ACTION_REQUIRED -> Known.ACTION_REQUIRED
                else -> throw StiggInvalidDataException("Unknown PaymentCollection: $value")
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
        fun validate(): PaymentCollection = apply {
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

            return other is PaymentCollection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The source type of the grant (PRICE, PLAN_ENTITLEMENT, ADDON_ENTITLEMENT) */
    class SourceType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PRICE = of("PRICE")

            @JvmField val PLAN_ENTITLEMENT = of("PLAN_ENTITLEMENT")

            @JvmField val ADDON_ENTITLEMENT = of("ADDON_ENTITLEMENT")

            @JvmStatic fun of(value: String) = SourceType(JsonField.of(value))
        }

        /** An enum containing [SourceType]'s known values. */
        enum class Known {
            PRICE,
            PLAN_ENTITLEMENT,
            ADDON_ENTITLEMENT,
        }

        /**
         * An enum containing [SourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PRICE,
            PLAN_ENTITLEMENT,
            ADDON_ENTITLEMENT,
            /**
             * An enum member indicating that [SourceType] was instantiated with an unknown value.
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
                PRICE -> Value.PRICE
                PLAN_ENTITLEMENT -> Value.PLAN_ENTITLEMENT
                ADDON_ENTITLEMENT -> Value.ADDON_ENTITLEMENT
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
                PRICE -> Known.PRICE
                PLAN_ENTITLEMENT -> Known.PLAN_ENTITLEMENT
                ADDON_ENTITLEMENT -> Known.ADDON_ENTITLEMENT
                else -> throw StiggInvalidDataException("Unknown SourceType: $value")
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
        fun validate(): SourceType = apply {
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

            return other is SourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The effective status of the credit grant */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PAYMENT_PENDING = of("PAYMENT_PENDING")

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val EXPIRED = of("EXPIRED")

            @JvmField val VOIDED = of("VOIDED")

            @JvmField val SCHEDULED = of("SCHEDULED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PAYMENT_PENDING,
            ACTIVE,
            EXPIRED,
            VOIDED,
            SCHEDULED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAYMENT_PENDING,
            ACTIVE,
            EXPIRED,
            VOIDED,
            SCHEDULED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PAYMENT_PENDING -> Value.PAYMENT_PENDING
                ACTIVE -> Value.ACTIVE
                EXPIRED -> Value.EXPIRED
                VOIDED -> Value.VOIDED
                SCHEDULED -> Value.SCHEDULED
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
                PAYMENT_PENDING -> Known.PAYMENT_PENDING
                ACTIVE -> Known.ACTIVE
                EXPIRED -> Known.EXPIRED
                VOIDED -> Known.VOIDED
                SCHEDULED -> Known.SCHEDULED
                else -> throw StiggInvalidDataException("Unknown Status: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GrantListResponse &&
            id == other.id &&
            amount == other.amount &&
            comment == other.comment &&
            consumedAmount == other.consumedAmount &&
            cost == other.cost &&
            createdAt == other.createdAt &&
            currencyId == other.currencyId &&
            customerId == other.customerId &&
            displayName == other.displayName &&
            effectiveAt == other.effectiveAt &&
            expireAt == other.expireAt &&
            grantType == other.grantType &&
            invoiceId == other.invoiceId &&
            latestInvoice == other.latestInvoice &&
            metadata == other.metadata &&
            paymentCollection == other.paymentCollection &&
            priority == other.priority &&
            resourceId == other.resourceId &&
            sourceType == other.sourceType &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            voidedAt == other.voidedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amount,
            comment,
            consumedAmount,
            cost,
            createdAt,
            currencyId,
            customerId,
            displayName,
            effectiveAt,
            expireAt,
            grantType,
            invoiceId,
            latestInvoice,
            metadata,
            paymentCollection,
            priority,
            resourceId,
            sourceType,
            status,
            updatedAt,
            voidedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GrantListResponse{id=$id, amount=$amount, comment=$comment, consumedAmount=$consumedAmount, cost=$cost, createdAt=$createdAt, currencyId=$currencyId, customerId=$customerId, displayName=$displayName, effectiveAt=$effectiveAt, expireAt=$expireAt, grantType=$grantType, invoiceId=$invoiceId, latestInvoice=$latestInvoice, metadata=$metadata, paymentCollection=$paymentCollection, priority=$priority, resourceId=$resourceId, sourceType=$sourceType, status=$status, updatedAt=$updatedAt, voidedAt=$voidedAt, additionalProperties=$additionalProperties}"
}
