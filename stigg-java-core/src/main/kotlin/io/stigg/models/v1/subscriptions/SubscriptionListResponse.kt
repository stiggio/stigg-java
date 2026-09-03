// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

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

/** Customer subscription to a plan */
class SubscriptionListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val billingId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerId: JsonField<String>,
    private val paymentCollection: JsonField<PaymentCollection>,
    private val planId: JsonField<String>,
    private val pricingType: JsonField<PricingType>,
    private val startDate: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val addons: JsonField<List<Addon>>,
    private val billingCycleAnchor: JsonField<OffsetDateTime>,
    private val budget: JsonField<Budget>,
    private val cancellationDate: JsonField<OffsetDateTime>,
    private val cancelReason: JsonField<CancelReason>,
    private val contractId: JsonField<String>,
    private val coupons: JsonField<List<Coupon>>,
    private val currentBillingPeriodEnd: JsonField<OffsetDateTime>,
    private val currentBillingPeriodStart: JsonField<OffsetDateTime>,
    private val effectiveEndDate: JsonField<OffsetDateTime>,
    private val endDate: JsonField<OffsetDateTime>,
    private val futureUpdates: JsonField<List<FutureUpdate>>,
    private val latestInvoice: JsonField<LatestInvoice>,
    private val metadata: JsonField<Metadata>,
    private val minimumSpend: JsonField<MinimumSpend>,
    private val payingCustomerId: JsonField<String>,
    private val paymentCollectionMethod: JsonField<PaymentCollectionMethod>,
    private val prices: JsonField<List<Price>>,
    private val resourceId: JsonField<String>,
    private val subscriptionEntitlements: JsonField<List<SubscriptionEntitlement>>,
    private val trial: JsonField<Trial>,
    private val trialEndDate: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billingId") @ExcludeMissing billingId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("paymentCollection")
        @ExcludeMissing
        paymentCollection: JsonField<PaymentCollection> = JsonMissing.of(),
        @JsonProperty("planId") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pricingType")
        @ExcludeMissing
        pricingType: JsonField<PricingType> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("addons") @ExcludeMissing addons: JsonField<List<Addon>> = JsonMissing.of(),
        @JsonProperty("billingCycleAnchor")
        @ExcludeMissing
        billingCycleAnchor: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("budget") @ExcludeMissing budget: JsonField<Budget> = JsonMissing.of(),
        @JsonProperty("cancellationDate")
        @ExcludeMissing
        cancellationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("cancelReason")
        @ExcludeMissing
        cancelReason: JsonField<CancelReason> = JsonMissing.of(),
        @JsonProperty("contractId")
        @ExcludeMissing
        contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coupons")
        @ExcludeMissing
        coupons: JsonField<List<Coupon>> = JsonMissing.of(),
        @JsonProperty("currentBillingPeriodEnd")
        @ExcludeMissing
        currentBillingPeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currentBillingPeriodStart")
        @ExcludeMissing
        currentBillingPeriodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("effectiveEndDate")
        @ExcludeMissing
        effectiveEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("futureUpdates")
        @ExcludeMissing
        futureUpdates: JsonField<List<FutureUpdate>> = JsonMissing.of(),
        @JsonProperty("latestInvoice")
        @ExcludeMissing
        latestInvoice: JsonField<LatestInvoice> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        minimumSpend: JsonField<MinimumSpend> = JsonMissing.of(),
        @JsonProperty("payingCustomerId")
        @ExcludeMissing
        payingCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("paymentCollectionMethod")
        @ExcludeMissing
        paymentCollectionMethod: JsonField<PaymentCollectionMethod> = JsonMissing.of(),
        @JsonProperty("prices") @ExcludeMissing prices: JsonField<List<Price>> = JsonMissing.of(),
        @JsonProperty("resourceId")
        @ExcludeMissing
        resourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriptionEntitlements")
        @ExcludeMissing
        subscriptionEntitlements: JsonField<List<SubscriptionEntitlement>> = JsonMissing.of(),
        @JsonProperty("trial") @ExcludeMissing trial: JsonField<Trial> = JsonMissing.of(),
        @JsonProperty("trialEndDate")
        @ExcludeMissing
        trialEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        billingId,
        createdAt,
        customerId,
        paymentCollection,
        planId,
        pricingType,
        startDate,
        status,
        addons,
        billingCycleAnchor,
        budget,
        cancellationDate,
        cancelReason,
        contractId,
        coupons,
        currentBillingPeriodEnd,
        currentBillingPeriodStart,
        effectiveEndDate,
        endDate,
        futureUpdates,
        latestInvoice,
        metadata,
        minimumSpend,
        payingCustomerId,
        paymentCollectionMethod,
        prices,
        resourceId,
        subscriptionEntitlements,
        trial,
        trialEndDate,
        mutableMapOf(),
    )

    /**
     * Subscription ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Billing ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingId(): Optional<String> = billingId.getOptional("billingId")

    /**
     * Created at
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Customer ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customerId")

    /**
     * Payment collection
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentCollection(): PaymentCollection = paymentCollection.getRequired("paymentCollection")

    /**
     * Plan ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun planId(): String = planId.getRequired("planId")

    /**
     * Pricing type
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pricingType(): PricingType = pricingType.getRequired("pricingType")

    /**
     * Subscription start date
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

    /**
     * Subscription status
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addons(): Optional<List<Addon>> = addons.getOptional("addons")

    /**
     * Billing cycle anchor date
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingCycleAnchor(): Optional<OffsetDateTime> =
        billingCycleAnchor.getOptional("billingCycleAnchor")

    /**
     * Budget configuration
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budget(): Optional<Budget> = budget.getOptional("budget")

    /**
     * Subscription cancellation date
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancellationDate(): Optional<OffsetDateTime> =
        cancellationDate.getOptional("cancellationDate")

    /**
     * Subscription cancel reason
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancelReason(): Optional<CancelReason> = cancelReason.getOptional("cancelReason")

    /**
     * The Stigg contract this subscription is linked to, when any
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractId(): Optional<String> = contractId.getOptional("contractId")

    /**
     * Coupons applied to the subscription
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coupons(): Optional<List<Coupon>> = coupons.getOptional("coupons")

    /**
     * End of the current billing period
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentBillingPeriodEnd(): Optional<OffsetDateTime> =
        currentBillingPeriodEnd.getOptional("currentBillingPeriodEnd")

    /**
     * Start of the current billing period
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentBillingPeriodStart(): Optional<OffsetDateTime> =
        currentBillingPeriodStart.getOptional("currentBillingPeriodStart")

    /**
     * Subscription effective end date
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveEndDate(): Optional<OffsetDateTime> =
        effectiveEndDate.getOptional("effectiveEndDate")

    /**
     * Subscription end date
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("endDate")

    /**
     * Scheduled future updates for the subscription
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun futureUpdates(): Optional<List<FutureUpdate>> = futureUpdates.getOptional("futureUpdates")

    /**
     * Latest invoice for the subscription
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestInvoice(): Optional<LatestInvoice> = latestInvoice.getOptional("latestInvoice")

    /**
     * Additional metadata for the subscription, stored as an arbitrary flat key-value object.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Minimum spend configuration
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpend(): Optional<MinimumSpend> = minimumSpend.getOptional("minimumSpend")

    /**
     * Paying customer ID for delegated billing
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payingCustomerId(): Optional<String> = payingCustomerId.getOptional("payingCustomerId")

    /**
     * The method used to collect payments for a subscription
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentCollectionMethod(): Optional<PaymentCollectionMethod> =
        paymentCollectionMethod.getOptional("paymentCollectionMethod")

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prices(): Optional<List<Price>> = prices.getOptional("prices")

    /**
     * Resource ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceId(): Optional<String> = resourceId.getOptional("resourceId")

    /**
     * Entitlements associated with the subscription
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionEntitlements(): Optional<List<SubscriptionEntitlement>> =
        subscriptionEntitlements.getOptional("subscriptionEntitlements")

    /**
     * Trial configuration
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trial(): Optional<Trial> = trial.getOptional("trial")

    /**
     * Subscription trial end date
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trialEndDate(): Optional<OffsetDateTime> = trialEndDate.getOptional("trialEndDate")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [billingId].
     *
     * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billingId") @ExcludeMissing fun _billingId(): JsonField<String> = billingId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

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
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

    /**
     * Returns the raw JSON value of [pricingType].
     *
     * Unlike [pricingType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pricingType")
    @ExcludeMissing
    fun _pricingType(): JsonField<PricingType> = pricingType

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDate")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [addons].
     *
     * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addons") @ExcludeMissing fun _addons(): JsonField<List<Addon>> = addons

    /**
     * Returns the raw JSON value of [billingCycleAnchor].
     *
     * Unlike [billingCycleAnchor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billingCycleAnchor")
    @ExcludeMissing
    fun _billingCycleAnchor(): JsonField<OffsetDateTime> = billingCycleAnchor

    /**
     * Returns the raw JSON value of [budget].
     *
     * Unlike [budget], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("budget") @ExcludeMissing fun _budget(): JsonField<Budget> = budget

    /**
     * Returns the raw JSON value of [cancellationDate].
     *
     * Unlike [cancellationDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cancellationDate")
    @ExcludeMissing
    fun _cancellationDate(): JsonField<OffsetDateTime> = cancellationDate

    /**
     * Returns the raw JSON value of [cancelReason].
     *
     * Unlike [cancelReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancelReason")
    @ExcludeMissing
    fun _cancelReason(): JsonField<CancelReason> = cancelReason

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contractId") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    /**
     * Returns the raw JSON value of [coupons].
     *
     * Unlike [coupons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coupons") @ExcludeMissing fun _coupons(): JsonField<List<Coupon>> = coupons

    /**
     * Returns the raw JSON value of [currentBillingPeriodEnd].
     *
     * Unlike [currentBillingPeriodEnd], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("currentBillingPeriodEnd")
    @ExcludeMissing
    fun _currentBillingPeriodEnd(): JsonField<OffsetDateTime> = currentBillingPeriodEnd

    /**
     * Returns the raw JSON value of [currentBillingPeriodStart].
     *
     * Unlike [currentBillingPeriodStart], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("currentBillingPeriodStart")
    @ExcludeMissing
    fun _currentBillingPeriodStart(): JsonField<OffsetDateTime> = currentBillingPeriodStart

    /**
     * Returns the raw JSON value of [effectiveEndDate].
     *
     * Unlike [effectiveEndDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("effectiveEndDate")
    @ExcludeMissing
    fun _effectiveEndDate(): JsonField<OffsetDateTime> = effectiveEndDate

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [futureUpdates].
     *
     * Unlike [futureUpdates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("futureUpdates")
    @ExcludeMissing
    fun _futureUpdates(): JsonField<List<FutureUpdate>> = futureUpdates

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
     * Returns the raw JSON value of [minimumSpend].
     *
     * Unlike [minimumSpend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minimumSpend")
    @ExcludeMissing
    fun _minimumSpend(): JsonField<MinimumSpend> = minimumSpend

    /**
     * Returns the raw JSON value of [payingCustomerId].
     *
     * Unlike [payingCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payingCustomerId")
    @ExcludeMissing
    fun _payingCustomerId(): JsonField<String> = payingCustomerId

    /**
     * Returns the raw JSON value of [paymentCollectionMethod].
     *
     * Unlike [paymentCollectionMethod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("paymentCollectionMethod")
    @ExcludeMissing
    fun _paymentCollectionMethod(): JsonField<PaymentCollectionMethod> = paymentCollectionMethod

    /**
     * Returns the raw JSON value of [prices].
     *
     * Unlike [prices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prices") @ExcludeMissing fun _prices(): JsonField<List<Price>> = prices

    /**
     * Returns the raw JSON value of [resourceId].
     *
     * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resourceId") @ExcludeMissing fun _resourceId(): JsonField<String> = resourceId

    /**
     * Returns the raw JSON value of [subscriptionEntitlements].
     *
     * Unlike [subscriptionEntitlements], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("subscriptionEntitlements")
    @ExcludeMissing
    fun _subscriptionEntitlements(): JsonField<List<SubscriptionEntitlement>> =
        subscriptionEntitlements

    /**
     * Returns the raw JSON value of [trial].
     *
     * Unlike [trial], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial") @ExcludeMissing fun _trial(): JsonField<Trial> = trial

    /**
     * Returns the raw JSON value of [trialEndDate].
     *
     * Unlike [trialEndDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trialEndDate")
    @ExcludeMissing
    fun _trialEndDate(): JsonField<OffsetDateTime> = trialEndDate

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
         * Returns a mutable builder for constructing an instance of [SubscriptionListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .billingId()
         * .createdAt()
         * .customerId()
         * .paymentCollection()
         * .planId()
         * .pricingType()
         * .startDate()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var billingId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerId: JsonField<String>? = null
        private var paymentCollection: JsonField<PaymentCollection>? = null
        private var planId: JsonField<String>? = null
        private var pricingType: JsonField<PricingType>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var addons: JsonField<MutableList<Addon>>? = null
        private var billingCycleAnchor: JsonField<OffsetDateTime> = JsonMissing.of()
        private var budget: JsonField<Budget> = JsonMissing.of()
        private var cancellationDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var cancelReason: JsonField<CancelReason> = JsonMissing.of()
        private var contractId: JsonField<String> = JsonMissing.of()
        private var coupons: JsonField<MutableList<Coupon>>? = null
        private var currentBillingPeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currentBillingPeriodStart: JsonField<OffsetDateTime> = JsonMissing.of()
        private var effectiveEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var futureUpdates: JsonField<MutableList<FutureUpdate>>? = null
        private var latestInvoice: JsonField<LatestInvoice> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var minimumSpend: JsonField<MinimumSpend> = JsonMissing.of()
        private var payingCustomerId: JsonField<String> = JsonMissing.of()
        private var paymentCollectionMethod: JsonField<PaymentCollectionMethod> = JsonMissing.of()
        private var prices: JsonField<MutableList<Price>>? = null
        private var resourceId: JsonField<String> = JsonMissing.of()
        private var subscriptionEntitlements: JsonField<MutableList<SubscriptionEntitlement>>? =
            null
        private var trial: JsonField<Trial> = JsonMissing.of()
        private var trialEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionListResponse: SubscriptionListResponse) = apply {
            id = subscriptionListResponse.id
            billingId = subscriptionListResponse.billingId
            createdAt = subscriptionListResponse.createdAt
            customerId = subscriptionListResponse.customerId
            paymentCollection = subscriptionListResponse.paymentCollection
            planId = subscriptionListResponse.planId
            pricingType = subscriptionListResponse.pricingType
            startDate = subscriptionListResponse.startDate
            status = subscriptionListResponse.status
            addons = subscriptionListResponse.addons.map { it.toMutableList() }
            billingCycleAnchor = subscriptionListResponse.billingCycleAnchor
            budget = subscriptionListResponse.budget
            cancellationDate = subscriptionListResponse.cancellationDate
            cancelReason = subscriptionListResponse.cancelReason
            contractId = subscriptionListResponse.contractId
            coupons = subscriptionListResponse.coupons.map { it.toMutableList() }
            currentBillingPeriodEnd = subscriptionListResponse.currentBillingPeriodEnd
            currentBillingPeriodStart = subscriptionListResponse.currentBillingPeriodStart
            effectiveEndDate = subscriptionListResponse.effectiveEndDate
            endDate = subscriptionListResponse.endDate
            futureUpdates = subscriptionListResponse.futureUpdates.map { it.toMutableList() }
            latestInvoice = subscriptionListResponse.latestInvoice
            metadata = subscriptionListResponse.metadata
            minimumSpend = subscriptionListResponse.minimumSpend
            payingCustomerId = subscriptionListResponse.payingCustomerId
            paymentCollectionMethod = subscriptionListResponse.paymentCollectionMethod
            prices = subscriptionListResponse.prices.map { it.toMutableList() }
            resourceId = subscriptionListResponse.resourceId
            subscriptionEntitlements =
                subscriptionListResponse.subscriptionEntitlements.map { it.toMutableList() }
            trial = subscriptionListResponse.trial
            trialEndDate = subscriptionListResponse.trialEndDate
            additionalProperties = subscriptionListResponse.additionalProperties.toMutableMap()
        }

        /** Subscription ID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Billing ID */
        fun billingId(billingId: String?) = billingId(JsonField.ofNullable(billingId))

        /** Alias for calling [Builder.billingId] with `billingId.orElse(null)`. */
        fun billingId(billingId: Optional<String>) = billingId(billingId.getOrNull())

        /**
         * Sets [Builder.billingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billingId(billingId: JsonField<String>) = apply { this.billingId = billingId }

        /** Created at */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Customer ID */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** Payment collection */
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

        /** Plan ID */
        fun planId(planId: String) = planId(JsonField.of(planId))

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        /** Pricing type */
        fun pricingType(pricingType: PricingType) = pricingType(JsonField.of(pricingType))

        /**
         * Sets [Builder.pricingType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricingType] with a well-typed [PricingType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pricingType(pricingType: JsonField<PricingType>) = apply {
            this.pricingType = pricingType
        }

        /** Subscription start date */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /** Subscription status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun addons(addons: List<Addon>) = addons(JsonField.of(addons))

        /**
         * Sets [Builder.addons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addons] with a well-typed `List<Addon>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addons(addons: JsonField<List<Addon>>) = apply {
            this.addons = addons.map { it.toMutableList() }
        }

        /**
         * Adds a single [Addon] to [addons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddon(addon: Addon) = apply {
            addons =
                (addons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addons", it).add(addon)
                }
        }

        /** Billing cycle anchor date */
        fun billingCycleAnchor(billingCycleAnchor: OffsetDateTime?) =
            billingCycleAnchor(JsonField.ofNullable(billingCycleAnchor))

        /**
         * Alias for calling [Builder.billingCycleAnchor] with `billingCycleAnchor.orElse(null)`.
         */
        fun billingCycleAnchor(billingCycleAnchor: Optional<OffsetDateTime>) =
            billingCycleAnchor(billingCycleAnchor.getOrNull())

        /**
         * Sets [Builder.billingCycleAnchor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCycleAnchor] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billingCycleAnchor(billingCycleAnchor: JsonField<OffsetDateTime>) = apply {
            this.billingCycleAnchor = billingCycleAnchor
        }

        /** Budget configuration */
        fun budget(budget: Budget?) = budget(JsonField.ofNullable(budget))

        /** Alias for calling [Builder.budget] with `budget.orElse(null)`. */
        fun budget(budget: Optional<Budget>) = budget(budget.getOrNull())

        /**
         * Sets [Builder.budget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budget] with a well-typed [Budget] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun budget(budget: JsonField<Budget>) = apply { this.budget = budget }

        /** Subscription cancellation date */
        fun cancellationDate(cancellationDate: OffsetDateTime?) =
            cancellationDate(JsonField.ofNullable(cancellationDate))

        /** Alias for calling [Builder.cancellationDate] with `cancellationDate.orElse(null)`. */
        fun cancellationDate(cancellationDate: Optional<OffsetDateTime>) =
            cancellationDate(cancellationDate.getOrNull())

        /**
         * Sets [Builder.cancellationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancellationDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cancellationDate(cancellationDate: JsonField<OffsetDateTime>) = apply {
            this.cancellationDate = cancellationDate
        }

        /** Subscription cancel reason */
        fun cancelReason(cancelReason: CancelReason?) =
            cancelReason(JsonField.ofNullable(cancelReason))

        /** Alias for calling [Builder.cancelReason] with `cancelReason.orElse(null)`. */
        fun cancelReason(cancelReason: Optional<CancelReason>) =
            cancelReason(cancelReason.getOrNull())

        /**
         * Sets [Builder.cancelReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelReason] with a well-typed [CancelReason] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancelReason(cancelReason: JsonField<CancelReason>) = apply {
            this.cancelReason = cancelReason
        }

        /** The Stigg contract this subscription is linked to, when any */
        fun contractId(contractId: String?) = contractId(JsonField.ofNullable(contractId))

        /** Alias for calling [Builder.contractId] with `contractId.orElse(null)`. */
        fun contractId(contractId: Optional<String>) = contractId(contractId.getOrNull())

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        /** Coupons applied to the subscription */
        fun coupons(coupons: List<Coupon>) = coupons(JsonField.of(coupons))

        /**
         * Sets [Builder.coupons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coupons] with a well-typed `List<Coupon>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun coupons(coupons: JsonField<List<Coupon>>) = apply {
            this.coupons = coupons.map { it.toMutableList() }
        }

        /**
         * Adds a single [Coupon] to [coupons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCoupon(coupon: Coupon) = apply {
            coupons =
                (coupons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("coupons", it).add(coupon)
                }
        }

        /** End of the current billing period */
        fun currentBillingPeriodEnd(currentBillingPeriodEnd: OffsetDateTime?) =
            currentBillingPeriodEnd(JsonField.ofNullable(currentBillingPeriodEnd))

        /**
         * Alias for calling [Builder.currentBillingPeriodEnd] with
         * `currentBillingPeriodEnd.orElse(null)`.
         */
        fun currentBillingPeriodEnd(currentBillingPeriodEnd: Optional<OffsetDateTime>) =
            currentBillingPeriodEnd(currentBillingPeriodEnd.getOrNull())

        /**
         * Sets [Builder.currentBillingPeriodEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentBillingPeriodEnd] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun currentBillingPeriodEnd(currentBillingPeriodEnd: JsonField<OffsetDateTime>) = apply {
            this.currentBillingPeriodEnd = currentBillingPeriodEnd
        }

        /** Start of the current billing period */
        fun currentBillingPeriodStart(currentBillingPeriodStart: OffsetDateTime?) =
            currentBillingPeriodStart(JsonField.ofNullable(currentBillingPeriodStart))

        /**
         * Alias for calling [Builder.currentBillingPeriodStart] with
         * `currentBillingPeriodStart.orElse(null)`.
         */
        fun currentBillingPeriodStart(currentBillingPeriodStart: Optional<OffsetDateTime>) =
            currentBillingPeriodStart(currentBillingPeriodStart.getOrNull())

        /**
         * Sets [Builder.currentBillingPeriodStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentBillingPeriodStart] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun currentBillingPeriodStart(currentBillingPeriodStart: JsonField<OffsetDateTime>) =
            apply {
                this.currentBillingPeriodStart = currentBillingPeriodStart
            }

        /** Subscription effective end date */
        fun effectiveEndDate(effectiveEndDate: OffsetDateTime?) =
            effectiveEndDate(JsonField.ofNullable(effectiveEndDate))

        /** Alias for calling [Builder.effectiveEndDate] with `effectiveEndDate.orElse(null)`. */
        fun effectiveEndDate(effectiveEndDate: Optional<OffsetDateTime>) =
            effectiveEndDate(effectiveEndDate.getOrNull())

        /**
         * Sets [Builder.effectiveEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveEndDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun effectiveEndDate(effectiveEndDate: JsonField<OffsetDateTime>) = apply {
            this.effectiveEndDate = effectiveEndDate
        }

        /** Subscription end date */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** Scheduled future updates for the subscription */
        fun futureUpdates(futureUpdates: List<FutureUpdate>) =
            futureUpdates(JsonField.of(futureUpdates))

        /**
         * Sets [Builder.futureUpdates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.futureUpdates] with a well-typed `List<FutureUpdate>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun futureUpdates(futureUpdates: JsonField<List<FutureUpdate>>) = apply {
            this.futureUpdates = futureUpdates.map { it.toMutableList() }
        }

        /**
         * Adds a single [FutureUpdate] to [futureUpdates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFutureUpdate(futureUpdate: FutureUpdate) = apply {
            futureUpdates =
                (futureUpdates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("futureUpdates", it).add(futureUpdate)
                }
        }

        /** Latest invoice for the subscription */
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

        /**
         * Additional metadata for the subscription, stored as an arbitrary flat key-value object.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Minimum spend configuration */
        fun minimumSpend(minimumSpend: MinimumSpend?) =
            minimumSpend(JsonField.ofNullable(minimumSpend))

        /** Alias for calling [Builder.minimumSpend] with `minimumSpend.orElse(null)`. */
        fun minimumSpend(minimumSpend: Optional<MinimumSpend>) =
            minimumSpend(minimumSpend.getOrNull())

        /**
         * Sets [Builder.minimumSpend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumSpend] with a well-typed [MinimumSpend] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minimumSpend(minimumSpend: JsonField<MinimumSpend>) = apply {
            this.minimumSpend = minimumSpend
        }

        /** Paying customer ID for delegated billing */
        fun payingCustomerId(payingCustomerId: String?) =
            payingCustomerId(JsonField.ofNullable(payingCustomerId))

        /** Alias for calling [Builder.payingCustomerId] with `payingCustomerId.orElse(null)`. */
        fun payingCustomerId(payingCustomerId: Optional<String>) =
            payingCustomerId(payingCustomerId.getOrNull())

        /**
         * Sets [Builder.payingCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payingCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payingCustomerId(payingCustomerId: JsonField<String>) = apply {
            this.payingCustomerId = payingCustomerId
        }

        /** The method used to collect payments for a subscription */
        fun paymentCollectionMethod(paymentCollectionMethod: PaymentCollectionMethod?) =
            paymentCollectionMethod(JsonField.ofNullable(paymentCollectionMethod))

        /**
         * Alias for calling [Builder.paymentCollectionMethod] with
         * `paymentCollectionMethod.orElse(null)`.
         */
        fun paymentCollectionMethod(paymentCollectionMethod: Optional<PaymentCollectionMethod>) =
            paymentCollectionMethod(paymentCollectionMethod.getOrNull())

        /**
         * Sets [Builder.paymentCollectionMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentCollectionMethod] with a well-typed
         * [PaymentCollectionMethod] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun paymentCollectionMethod(paymentCollectionMethod: JsonField<PaymentCollectionMethod>) =
            apply {
                this.paymentCollectionMethod = paymentCollectionMethod
            }

        fun prices(prices: List<Price>) = prices(JsonField.of(prices))

        /**
         * Sets [Builder.prices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prices] with a well-typed `List<Price>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prices(prices: JsonField<List<Price>>) = apply {
            this.prices = prices.map { it.toMutableList() }
        }

        /**
         * Adds a single [Price] to [prices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrice(price: Price) = apply {
            prices =
                (prices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("prices", it).add(price)
                }
        }

        /** Resource ID */
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

        /** Entitlements associated with the subscription */
        fun subscriptionEntitlements(subscriptionEntitlements: List<SubscriptionEntitlement>) =
            subscriptionEntitlements(JsonField.of(subscriptionEntitlements))

        /**
         * Sets [Builder.subscriptionEntitlements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionEntitlements] with a well-typed
         * `List<SubscriptionEntitlement>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun subscriptionEntitlements(
            subscriptionEntitlements: JsonField<List<SubscriptionEntitlement>>
        ) = apply {
            this.subscriptionEntitlements = subscriptionEntitlements.map { it.toMutableList() }
        }

        /**
         * Adds a single [SubscriptionEntitlement] to [subscriptionEntitlements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubscriptionEntitlement(subscriptionEntitlement: SubscriptionEntitlement) = apply {
            subscriptionEntitlements =
                (subscriptionEntitlements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subscriptionEntitlements", it).add(subscriptionEntitlement)
                }
        }

        /** Trial configuration */
        fun trial(trial: Trial?) = trial(JsonField.ofNullable(trial))

        /** Alias for calling [Builder.trial] with `trial.orElse(null)`. */
        fun trial(trial: Optional<Trial>) = trial(trial.getOrNull())

        /**
         * Sets [Builder.trial] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trial] with a well-typed [Trial] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trial(trial: JsonField<Trial>) = apply { this.trial = trial }

        /** Subscription trial end date */
        fun trialEndDate(trialEndDate: OffsetDateTime?) =
            trialEndDate(JsonField.ofNullable(trialEndDate))

        /** Alias for calling [Builder.trialEndDate] with `trialEndDate.orElse(null)`. */
        fun trialEndDate(trialEndDate: Optional<OffsetDateTime>) =
            trialEndDate(trialEndDate.getOrNull())

        /**
         * Sets [Builder.trialEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialEndDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trialEndDate(trialEndDate: JsonField<OffsetDateTime>) = apply {
            this.trialEndDate = trialEndDate
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
         * Returns an immutable instance of [SubscriptionListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .billingId()
         * .createdAt()
         * .customerId()
         * .paymentCollection()
         * .planId()
         * .pricingType()
         * .startDate()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionListResponse =
            SubscriptionListResponse(
                checkRequired("id", id),
                checkRequired("billingId", billingId),
                checkRequired("createdAt", createdAt),
                checkRequired("customerId", customerId),
                checkRequired("paymentCollection", paymentCollection),
                checkRequired("planId", planId),
                checkRequired("pricingType", pricingType),
                checkRequired("startDate", startDate),
                checkRequired("status", status),
                (addons ?: JsonMissing.of()).map { it.toImmutable() },
                billingCycleAnchor,
                budget,
                cancellationDate,
                cancelReason,
                contractId,
                (coupons ?: JsonMissing.of()).map { it.toImmutable() },
                currentBillingPeriodEnd,
                currentBillingPeriodStart,
                effectiveEndDate,
                endDate,
                (futureUpdates ?: JsonMissing.of()).map { it.toImmutable() },
                latestInvoice,
                metadata,
                minimumSpend,
                payingCustomerId,
                paymentCollectionMethod,
                (prices ?: JsonMissing.of()).map { it.toImmutable() },
                resourceId,
                (subscriptionEntitlements ?: JsonMissing.of()).map { it.toImmutable() },
                trial,
                trialEndDate,
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
    fun validate(): SubscriptionListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        billingId()
        createdAt()
        customerId()
        paymentCollection().validate()
        planId()
        pricingType().validate()
        startDate()
        status().validate()
        addons().ifPresent { it.forEach { it.validate() } }
        billingCycleAnchor()
        budget().ifPresent { it.validate() }
        cancellationDate()
        cancelReason().ifPresent { it.validate() }
        contractId()
        coupons().ifPresent { it.forEach { it.validate() } }
        currentBillingPeriodEnd()
        currentBillingPeriodStart()
        effectiveEndDate()
        endDate()
        futureUpdates().ifPresent { it.forEach { it.validate() } }
        latestInvoice().ifPresent { it.validate() }
        metadata().ifPresent { it.validate() }
        minimumSpend().ifPresent { it.validate() }
        payingCustomerId()
        paymentCollectionMethod().ifPresent { it.validate() }
        prices().ifPresent { it.forEach { it.validate() } }
        resourceId()
        subscriptionEntitlements().ifPresent { it.forEach { it.validate() } }
        trial().ifPresent { it.validate() }
        trialEndDate()
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
            (if (billingId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (customerId.asKnown().isPresent) 1 else 0) +
            (paymentCollection.asKnown().getOrNull()?.validity() ?: 0) +
            (if (planId.asKnown().isPresent) 1 else 0) +
            (pricingType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (addons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (billingCycleAnchor.asKnown().isPresent) 1 else 0) +
            (budget.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cancellationDate.asKnown().isPresent) 1 else 0) +
            (cancelReason.asKnown().getOrNull()?.validity() ?: 0) +
            (if (contractId.asKnown().isPresent) 1 else 0) +
            (coupons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (currentBillingPeriodEnd.asKnown().isPresent) 1 else 0) +
            (if (currentBillingPeriodStart.asKnown().isPresent) 1 else 0) +
            (if (effectiveEndDate.asKnown().isPresent) 1 else 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (futureUpdates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (latestInvoice.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (minimumSpend.asKnown().getOrNull()?.validity() ?: 0) +
            (if (payingCustomerId.asKnown().isPresent) 1 else 0) +
            (paymentCollectionMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (prices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (resourceId.asKnown().isPresent) 1 else 0) +
            (subscriptionEntitlements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (trial.asKnown().getOrNull()?.validity() ?: 0) +
            (if (trialEndDate.asKnown().isPresent) 1 else 0)

    /** Payment collection */
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

    /** Pricing type */
    class PricingType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val FREE = of("FREE")

            @JvmField val PAID = of("PAID")

            @JvmField val CUSTOM = of("CUSTOM")

            @JvmStatic fun of(value: String) = PricingType(JsonField.of(value))
        }

        /** An enum containing [PricingType]'s known values. */
        enum class Known {
            FREE,
            PAID,
            CUSTOM,
        }

        /**
         * An enum containing [PricingType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PricingType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FREE,
            PAID,
            CUSTOM,
            /**
             * An enum member indicating that [PricingType] was instantiated with an unknown value.
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
                FREE -> Value.FREE
                PAID -> Value.PAID
                CUSTOM -> Value.CUSTOM
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
                FREE -> Known.FREE
                PAID -> Known.PAID
                CUSTOM -> Known.CUSTOM
                else -> throw StiggInvalidDataException("Unknown PricingType: $value")
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
        fun validate(): PricingType = apply {
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

            return other is PricingType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Subscription status */
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

            @JvmField val IN_TRIAL = of("IN_TRIAL")

            @JvmField val CANCELED = of("CANCELED")

            @JvmField val NOT_STARTED = of("NOT_STARTED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PAYMENT_PENDING,
            ACTIVE,
            EXPIRED,
            IN_TRIAL,
            CANCELED,
            NOT_STARTED,
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
            IN_TRIAL,
            CANCELED,
            NOT_STARTED,
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
                IN_TRIAL -> Value.IN_TRIAL
                CANCELED -> Value.CANCELED
                NOT_STARTED -> Value.NOT_STARTED
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
                IN_TRIAL -> Known.IN_TRIAL
                CANCELED -> Known.CANCELED
                NOT_STARTED -> Known.NOT_STARTED
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

    /** Addon configuration */
    class Addon
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val quantity: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
        ) : this(id, quantity, mutableMapOf())

        /**
         * Addon ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Number of addon instances
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Long = quantity.getRequired("quantity")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

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
             * Returns a mutable builder for constructing an instance of [Addon].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .quantity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Addon]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var quantity: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addon: Addon) = apply {
                id = addon.id
                quantity = addon.quantity
                additionalProperties = addon.additionalProperties.toMutableMap()
            }

            /** Addon ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Number of addon instances */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

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
             * Returns an immutable instance of [Addon].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .quantity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Addon =
                Addon(
                    checkRequired("id", id),
                    checkRequired("quantity", quantity),
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
        fun validate(): Addon = apply {
            if (validated) {
                return@apply
            }

            id()
            quantity()
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
            (if (id.asKnown().isPresent) 1 else 0) + (if (quantity.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Addon &&
                id == other.id &&
                quantity == other.quantity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, quantity, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Addon{id=$id, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    /** Budget configuration */
    class Budget
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val hasSoftLimit: JsonField<Boolean>,
        private val limit: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("hasSoftLimit")
            @ExcludeMissing
            hasSoftLimit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
        ) : this(hasSoftLimit, limit, mutableMapOf())

        /**
         * Whether the budget is a soft limit
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hasSoftLimit(): Boolean = hasSoftLimit.getRequired("hasSoftLimit")

        /**
         * Maximum spending limit
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun limit(): Double = limit.getRequired("limit")

        /**
         * Returns the raw JSON value of [hasSoftLimit].
         *
         * Unlike [hasSoftLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hasSoftLimit")
        @ExcludeMissing
        fun _hasSoftLimit(): JsonField<Boolean> = hasSoftLimit

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

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
             * Returns a mutable builder for constructing an instance of [Budget].
             *
             * The following fields are required:
             * ```java
             * .hasSoftLimit()
             * .limit()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Budget]. */
        class Builder internal constructor() {

            private var hasSoftLimit: JsonField<Boolean>? = null
            private var limit: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(budget: Budget) = apply {
                hasSoftLimit = budget.hasSoftLimit
                limit = budget.limit
                additionalProperties = budget.additionalProperties.toMutableMap()
            }

            /** Whether the budget is a soft limit */
            fun hasSoftLimit(hasSoftLimit: Boolean) = hasSoftLimit(JsonField.of(hasSoftLimit))

            /**
             * Sets [Builder.hasSoftLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasSoftLimit] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasSoftLimit(hasSoftLimit: JsonField<Boolean>) = apply {
                this.hasSoftLimit = hasSoftLimit
            }

            /** Maximum spending limit */
            fun limit(limit: Double) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

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
             * Returns an immutable instance of [Budget].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .hasSoftLimit()
             * .limit()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Budget =
                Budget(
                    checkRequired("hasSoftLimit", hasSoftLimit),
                    checkRequired("limit", limit),
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
        fun validate(): Budget = apply {
            if (validated) {
                return@apply
            }

            hasSoftLimit()
            limit()
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
            (if (hasSoftLimit.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Budget &&
                hasSoftLimit == other.hasSoftLimit &&
                limit == other.limit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(hasSoftLimit, limit, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Budget{hasSoftLimit=$hasSoftLimit, limit=$limit, additionalProperties=$additionalProperties}"
    }

    /** Subscription cancel reason */
    class CancelReason @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val UPGRADE_OR_DOWNGRADE = of("UPGRADE_OR_DOWNGRADE")

            @JvmField val CANCELLED_BY_BILLING = of("CANCELLED_BY_BILLING")

            @JvmField val EXPIRED = of("EXPIRED")

            @JvmField val DETACH_BILLING = of("DETACH_BILLING")

            @JvmField val TRIAL_ENDED = of("TRIAL_ENDED")

            @JvmField val IMMEDIATE = of("Immediate")

            @JvmField val TRIAL_CONVERTED = of("TRIAL_CONVERTED")

            @JvmField val PENDING_PAYMENT_EXPIRED = of("PENDING_PAYMENT_EXPIRED")

            @JvmField val SCHEDULED_CANCELLATION = of("ScheduledCancellation")

            @JvmField val CUSTOMER_ARCHIVED = of("CustomerArchived")

            @JvmField val AUTO_CANCELLATION_RULE = of("AutoCancellationRule")

            @JvmStatic fun of(value: String) = CancelReason(JsonField.of(value))
        }

        /** An enum containing [CancelReason]'s known values. */
        enum class Known {
            UPGRADE_OR_DOWNGRADE,
            CANCELLED_BY_BILLING,
            EXPIRED,
            DETACH_BILLING,
            TRIAL_ENDED,
            IMMEDIATE,
            TRIAL_CONVERTED,
            PENDING_PAYMENT_EXPIRED,
            SCHEDULED_CANCELLATION,
            CUSTOMER_ARCHIVED,
            AUTO_CANCELLATION_RULE,
        }

        /**
         * An enum containing [CancelReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CancelReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UPGRADE_OR_DOWNGRADE,
            CANCELLED_BY_BILLING,
            EXPIRED,
            DETACH_BILLING,
            TRIAL_ENDED,
            IMMEDIATE,
            TRIAL_CONVERTED,
            PENDING_PAYMENT_EXPIRED,
            SCHEDULED_CANCELLATION,
            CUSTOMER_ARCHIVED,
            AUTO_CANCELLATION_RULE,
            /**
             * An enum member indicating that [CancelReason] was instantiated with an unknown value.
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
                UPGRADE_OR_DOWNGRADE -> Value.UPGRADE_OR_DOWNGRADE
                CANCELLED_BY_BILLING -> Value.CANCELLED_BY_BILLING
                EXPIRED -> Value.EXPIRED
                DETACH_BILLING -> Value.DETACH_BILLING
                TRIAL_ENDED -> Value.TRIAL_ENDED
                IMMEDIATE -> Value.IMMEDIATE
                TRIAL_CONVERTED -> Value.TRIAL_CONVERTED
                PENDING_PAYMENT_EXPIRED -> Value.PENDING_PAYMENT_EXPIRED
                SCHEDULED_CANCELLATION -> Value.SCHEDULED_CANCELLATION
                CUSTOMER_ARCHIVED -> Value.CUSTOMER_ARCHIVED
                AUTO_CANCELLATION_RULE -> Value.AUTO_CANCELLATION_RULE
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
                UPGRADE_OR_DOWNGRADE -> Known.UPGRADE_OR_DOWNGRADE
                CANCELLED_BY_BILLING -> Known.CANCELLED_BY_BILLING
                EXPIRED -> Known.EXPIRED
                DETACH_BILLING -> Known.DETACH_BILLING
                TRIAL_ENDED -> Known.TRIAL_ENDED
                IMMEDIATE -> Known.IMMEDIATE
                TRIAL_CONVERTED -> Known.TRIAL_CONVERTED
                PENDING_PAYMENT_EXPIRED -> Known.PENDING_PAYMENT_EXPIRED
                SCHEDULED_CANCELLATION -> Known.SCHEDULED_CANCELLATION
                CUSTOMER_ARCHIVED -> Known.CUSTOMER_ARCHIVED
                AUTO_CANCELLATION_RULE -> Known.AUTO_CANCELLATION_RULE
                else -> throw StiggInvalidDataException("Unknown CancelReason: $value")
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
        fun validate(): CancelReason = apply {
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

            return other is CancelReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Coupon applied to a subscription */
    class Coupon
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val status: JsonField<Status>,
        private val amountsOff: JsonField<List<AmountsOff>>,
        private val percentOff: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("amountsOff")
            @ExcludeMissing
            amountsOff: JsonField<List<AmountsOff>> = JsonMissing.of(),
            @JsonProperty("percentOff")
            @ExcludeMissing
            percentOff: JsonField<Double> = JsonMissing.of(),
        ) : this(id, name, status, amountsOff, percentOff, mutableMapOf())

        /**
         * Coupon ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Coupon name
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Coupon status
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Fixed amount discounts by currency
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountsOff(): Optional<List<AmountsOff>> = amountsOff.getOptional("amountsOff")

        /**
         * Percentage discount
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun percentOff(): Optional<Double> = percentOff.getOptional("percentOff")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [amountsOff].
         *
         * Unlike [amountsOff], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amountsOff")
        @ExcludeMissing
        fun _amountsOff(): JsonField<List<AmountsOff>> = amountsOff

        /**
         * Returns the raw JSON value of [percentOff].
         *
         * Unlike [percentOff], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("percentOff")
        @ExcludeMissing
        fun _percentOff(): JsonField<Double> = percentOff

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
             * Returns a mutable builder for constructing an instance of [Coupon].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Coupon]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var amountsOff: JsonField<MutableList<AmountsOff>>? = null
            private var percentOff: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(coupon: Coupon) = apply {
                id = coupon.id
                name = coupon.name
                status = coupon.status
                amountsOff = coupon.amountsOff.map { it.toMutableList() }
                percentOff = coupon.percentOff
                additionalProperties = coupon.additionalProperties.toMutableMap()
            }

            /** Coupon ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Coupon name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Coupon status */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Fixed amount discounts by currency */
            fun amountsOff(amountsOff: List<AmountsOff>?) =
                amountsOff(JsonField.ofNullable(amountsOff))

            /** Alias for calling [Builder.amountsOff] with `amountsOff.orElse(null)`. */
            fun amountsOff(amountsOff: Optional<List<AmountsOff>>) =
                amountsOff(amountsOff.getOrNull())

            /**
             * Sets [Builder.amountsOff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountsOff] with a well-typed `List<AmountsOff>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun amountsOff(amountsOff: JsonField<List<AmountsOff>>) = apply {
                this.amountsOff = amountsOff.map { it.toMutableList() }
            }

            /**
             * Adds a single [AmountsOff] to [Builder.amountsOff].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAmountsOff(amountsOff: AmountsOff) = apply {
                this.amountsOff =
                    (this.amountsOff ?: JsonField.of(mutableListOf())).also {
                        checkKnown("amountsOff", it).add(amountsOff)
                    }
            }

            /** Percentage discount */
            fun percentOff(percentOff: Double?) = percentOff(JsonField.ofNullable(percentOff))

            /**
             * Alias for [Builder.percentOff].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun percentOff(percentOff: Double) = percentOff(percentOff as Double?)

            /** Alias for calling [Builder.percentOff] with `percentOff.orElse(null)`. */
            fun percentOff(percentOff: Optional<Double>) = percentOff(percentOff.getOrNull())

            /**
             * Sets [Builder.percentOff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.percentOff] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun percentOff(percentOff: JsonField<Double>) = apply { this.percentOff = percentOff }

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
             * Returns an immutable instance of [Coupon].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Coupon =
                Coupon(
                    checkRequired("id", id),
                    checkRequired("name", name),
                    checkRequired("status", status),
                    (amountsOff ?: JsonMissing.of()).map { it.toImmutable() },
                    percentOff,
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
        fun validate(): Coupon = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            status().validate()
            amountsOff().ifPresent { it.forEach { it.validate() } }
            percentOff()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (amountsOff.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (percentOff.asKnown().isPresent) 1 else 0)

        /** Coupon status */
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

                @JvmField val ACTIVE = of("ACTIVE")

                @JvmField val EXPIRED = of("EXPIRED")

                @JvmField val REMOVED = of("REMOVED")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ACTIVE,
                EXPIRED,
                REMOVED,
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
                ACTIVE,
                EXPIRED,
                REMOVED,
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
                    ACTIVE -> Value.ACTIVE
                    EXPIRED -> Value.EXPIRED
                    REMOVED -> Value.REMOVED
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
                    ACTIVE -> Known.ACTIVE
                    EXPIRED -> Known.EXPIRED
                    REMOVED -> Known.REMOVED
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

        class AmountsOff
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
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<Double> = amount.getOptional("amount")

            /**
             * The price currency
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<Currency> = currency.getOptional("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
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

                /** Returns a mutable builder for constructing an instance of [AmountsOff]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AmountsOff]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(amountsOff: AmountsOff) = apply {
                    amount = amountsOff.amount
                    currency = amountsOff.currency
                    additionalProperties = amountsOff.additionalProperties.toMutableMap()
                }

                /** The price amount */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** The price currency */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [AmountsOff].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AmountsOff =
                    AmountsOff(amount, currency, additionalProperties.toMutableMap())
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
            fun validate(): AmountsOff = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency().ifPresent { it.validate() }
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

            /** The price currency */
            class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
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
                 * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Currency] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [Currency] was instantiated with an unknown
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
                        else -> throw StiggInvalidDataException("Unknown Currency: $value")
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                return other is AmountsOff &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AmountsOff{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Coupon &&
                id == other.id &&
                name == other.name &&
                status == other.status &&
                amountsOff == other.amountsOff &&
                percentOff == other.percentOff &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, name, status, amountsOff, percentOff, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Coupon{id=$id, name=$name, status=$status, amountsOff=$amountsOff, percentOff=$percentOff, additionalProperties=$additionalProperties}"
    }

    /** Scheduled subscription update */
    class FutureUpdate
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val scheduledExecutionTime: JsonField<OffsetDateTime>,
        private val scheduleStatus: JsonField<ScheduleStatus>,
        private val subscriptionScheduleType: JsonField<SubscriptionScheduleType>,
        private val targetPackage: JsonField<TargetPackage>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("scheduledExecutionTime")
            @ExcludeMissing
            scheduledExecutionTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("scheduleStatus")
            @ExcludeMissing
            scheduleStatus: JsonField<ScheduleStatus> = JsonMissing.of(),
            @JsonProperty("subscriptionScheduleType")
            @ExcludeMissing
            subscriptionScheduleType: JsonField<SubscriptionScheduleType> = JsonMissing.of(),
            @JsonProperty("targetPackage")
            @ExcludeMissing
            targetPackage: JsonField<TargetPackage> = JsonMissing.of(),
        ) : this(
            scheduledExecutionTime,
            scheduleStatus,
            subscriptionScheduleType,
            targetPackage,
            mutableMapOf(),
        )

        /**
         * Scheduled execution time
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scheduledExecutionTime(): OffsetDateTime =
            scheduledExecutionTime.getRequired("scheduledExecutionTime")

        /**
         * Status of the scheduled update
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scheduleStatus(): ScheduleStatus = scheduleStatus.getRequired("scheduleStatus")

        /**
         * Type of scheduled change
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionScheduleType(): SubscriptionScheduleType =
            subscriptionScheduleType.getRequired("subscriptionScheduleType")

        /**
         * Target package for the update
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun targetPackage(): Optional<TargetPackage> = targetPackage.getOptional("targetPackage")

        /**
         * Returns the raw JSON value of [scheduledExecutionTime].
         *
         * Unlike [scheduledExecutionTime], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("scheduledExecutionTime")
        @ExcludeMissing
        fun _scheduledExecutionTime(): JsonField<OffsetDateTime> = scheduledExecutionTime

        /**
         * Returns the raw JSON value of [scheduleStatus].
         *
         * Unlike [scheduleStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scheduleStatus")
        @ExcludeMissing
        fun _scheduleStatus(): JsonField<ScheduleStatus> = scheduleStatus

        /**
         * Returns the raw JSON value of [subscriptionScheduleType].
         *
         * Unlike [subscriptionScheduleType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscriptionScheduleType")
        @ExcludeMissing
        fun _subscriptionScheduleType(): JsonField<SubscriptionScheduleType> =
            subscriptionScheduleType

        /**
         * Returns the raw JSON value of [targetPackage].
         *
         * Unlike [targetPackage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("targetPackage")
        @ExcludeMissing
        fun _targetPackage(): JsonField<TargetPackage> = targetPackage

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
             * Returns a mutable builder for constructing an instance of [FutureUpdate].
             *
             * The following fields are required:
             * ```java
             * .scheduledExecutionTime()
             * .scheduleStatus()
             * .subscriptionScheduleType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FutureUpdate]. */
        class Builder internal constructor() {

            private var scheduledExecutionTime: JsonField<OffsetDateTime>? = null
            private var scheduleStatus: JsonField<ScheduleStatus>? = null
            private var subscriptionScheduleType: JsonField<SubscriptionScheduleType>? = null
            private var targetPackage: JsonField<TargetPackage> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(futureUpdate: FutureUpdate) = apply {
                scheduledExecutionTime = futureUpdate.scheduledExecutionTime
                scheduleStatus = futureUpdate.scheduleStatus
                subscriptionScheduleType = futureUpdate.subscriptionScheduleType
                targetPackage = futureUpdate.targetPackage
                additionalProperties = futureUpdate.additionalProperties.toMutableMap()
            }

            /** Scheduled execution time */
            fun scheduledExecutionTime(scheduledExecutionTime: OffsetDateTime) =
                scheduledExecutionTime(JsonField.of(scheduledExecutionTime))

            /**
             * Sets [Builder.scheduledExecutionTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledExecutionTime] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun scheduledExecutionTime(scheduledExecutionTime: JsonField<OffsetDateTime>) = apply {
                this.scheduledExecutionTime = scheduledExecutionTime
            }

            /** Status of the scheduled update */
            fun scheduleStatus(scheduleStatus: ScheduleStatus) =
                scheduleStatus(JsonField.of(scheduleStatus))

            /**
             * Sets [Builder.scheduleStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduleStatus] with a well-typed [ScheduleStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun scheduleStatus(scheduleStatus: JsonField<ScheduleStatus>) = apply {
                this.scheduleStatus = scheduleStatus
            }

            /** Type of scheduled change */
            fun subscriptionScheduleType(subscriptionScheduleType: SubscriptionScheduleType) =
                subscriptionScheduleType(JsonField.of(subscriptionScheduleType))

            /**
             * Sets [Builder.subscriptionScheduleType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionScheduleType] with a well-typed
             * [SubscriptionScheduleType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun subscriptionScheduleType(
                subscriptionScheduleType: JsonField<SubscriptionScheduleType>
            ) = apply { this.subscriptionScheduleType = subscriptionScheduleType }

            /** Target package for the update */
            fun targetPackage(targetPackage: TargetPackage?) =
                targetPackage(JsonField.ofNullable(targetPackage))

            /** Alias for calling [Builder.targetPackage] with `targetPackage.orElse(null)`. */
            fun targetPackage(targetPackage: Optional<TargetPackage>) =
                targetPackage(targetPackage.getOrNull())

            /**
             * Sets [Builder.targetPackage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetPackage] with a well-typed [TargetPackage]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun targetPackage(targetPackage: JsonField<TargetPackage>) = apply {
                this.targetPackage = targetPackage
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
             * Returns an immutable instance of [FutureUpdate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .scheduledExecutionTime()
             * .scheduleStatus()
             * .subscriptionScheduleType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FutureUpdate =
                FutureUpdate(
                    checkRequired("scheduledExecutionTime", scheduledExecutionTime),
                    checkRequired("scheduleStatus", scheduleStatus),
                    checkRequired("subscriptionScheduleType", subscriptionScheduleType),
                    targetPackage,
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
        fun validate(): FutureUpdate = apply {
            if (validated) {
                return@apply
            }

            scheduledExecutionTime()
            scheduleStatus().validate()
            subscriptionScheduleType().validate()
            targetPackage().ifPresent { it.validate() }
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
            (if (scheduledExecutionTime.asKnown().isPresent) 1 else 0) +
                (scheduleStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (subscriptionScheduleType.asKnown().getOrNull()?.validity() ?: 0) +
                (targetPackage.asKnown().getOrNull()?.validity() ?: 0)

        /** Status of the scheduled update */
        class ScheduleStatus
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

                @JvmField val PENDING_PAYMENT = of("PENDING_PAYMENT")

                @JvmField val SCHEDULED = of("SCHEDULED")

                @JvmField val CANCELED = of("CANCELED")

                @JvmField val DONE = of("DONE")

                @JvmField val FAILED = of("FAILED")

                @JvmStatic fun of(value: String) = ScheduleStatus(JsonField.of(value))
            }

            /** An enum containing [ScheduleStatus]'s known values. */
            enum class Known {
                PENDING_PAYMENT,
                SCHEDULED,
                CANCELED,
                DONE,
                FAILED,
            }

            /**
             * An enum containing [ScheduleStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ScheduleStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING_PAYMENT,
                SCHEDULED,
                CANCELED,
                DONE,
                FAILED,
                /**
                 * An enum member indicating that [ScheduleStatus] was instantiated with an unknown
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
                    PENDING_PAYMENT -> Value.PENDING_PAYMENT
                    SCHEDULED -> Value.SCHEDULED
                    CANCELED -> Value.CANCELED
                    DONE -> Value.DONE
                    FAILED -> Value.FAILED
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
                    PENDING_PAYMENT -> Known.PENDING_PAYMENT
                    SCHEDULED -> Known.SCHEDULED
                    CANCELED -> Known.CANCELED
                    DONE -> Known.DONE
                    FAILED -> Known.FAILED
                    else -> throw StiggInvalidDataException("Unknown ScheduleStatus: $value")
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
            fun validate(): ScheduleStatus = apply {
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

                return other is ScheduleStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Type of scheduled change */
        class SubscriptionScheduleType
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

                @JvmField val DOWNGRADE = of("DOWNGRADE")

                @JvmField val PLAN = of("PLAN")

                @JvmField val BILLING_PERIOD = of("BILLING_PERIOD")

                @JvmField val UNIT_AMOUNT = of("UNIT_AMOUNT")

                @JvmField val RECURRING_CREDITS = of("RECURRING_CREDITS")

                @JvmField val PRICE_OVERRIDE = of("PRICE_OVERRIDE")

                @JvmField val ADDON = of("ADDON")

                @JvmField val COUPON = of("COUPON")

                @JvmField val MIGRATE_TO_LATEST = of("MIGRATE_TO_LATEST")

                @JvmField val ADDITIONAL_META_DATA = of("ADDITIONAL_META_DATA")

                @JvmField val BILLING_INFO_METADATA = of("BILLING_INFO_METADATA")

                @JvmStatic fun of(value: String) = SubscriptionScheduleType(JsonField.of(value))
            }

            /** An enum containing [SubscriptionScheduleType]'s known values. */
            enum class Known {
                DOWNGRADE,
                PLAN,
                BILLING_PERIOD,
                UNIT_AMOUNT,
                RECURRING_CREDITS,
                PRICE_OVERRIDE,
                ADDON,
                COUPON,
                MIGRATE_TO_LATEST,
                ADDITIONAL_META_DATA,
                BILLING_INFO_METADATA,
            }

            /**
             * An enum containing [SubscriptionScheduleType]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [SubscriptionScheduleType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DOWNGRADE,
                PLAN,
                BILLING_PERIOD,
                UNIT_AMOUNT,
                RECURRING_CREDITS,
                PRICE_OVERRIDE,
                ADDON,
                COUPON,
                MIGRATE_TO_LATEST,
                ADDITIONAL_META_DATA,
                BILLING_INFO_METADATA,
                /**
                 * An enum member indicating that [SubscriptionScheduleType] was instantiated with
                 * an unknown value.
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
                    DOWNGRADE -> Value.DOWNGRADE
                    PLAN -> Value.PLAN
                    BILLING_PERIOD -> Value.BILLING_PERIOD
                    UNIT_AMOUNT -> Value.UNIT_AMOUNT
                    RECURRING_CREDITS -> Value.RECURRING_CREDITS
                    PRICE_OVERRIDE -> Value.PRICE_OVERRIDE
                    ADDON -> Value.ADDON
                    COUPON -> Value.COUPON
                    MIGRATE_TO_LATEST -> Value.MIGRATE_TO_LATEST
                    ADDITIONAL_META_DATA -> Value.ADDITIONAL_META_DATA
                    BILLING_INFO_METADATA -> Value.BILLING_INFO_METADATA
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
                    DOWNGRADE -> Known.DOWNGRADE
                    PLAN -> Known.PLAN
                    BILLING_PERIOD -> Known.BILLING_PERIOD
                    UNIT_AMOUNT -> Known.UNIT_AMOUNT
                    RECURRING_CREDITS -> Known.RECURRING_CREDITS
                    PRICE_OVERRIDE -> Known.PRICE_OVERRIDE
                    ADDON -> Known.ADDON
                    COUPON -> Known.COUPON
                    MIGRATE_TO_LATEST -> Known.MIGRATE_TO_LATEST
                    ADDITIONAL_META_DATA -> Known.ADDITIONAL_META_DATA
                    BILLING_INFO_METADATA -> Known.BILLING_INFO_METADATA
                    else ->
                        throw StiggInvalidDataException("Unknown SubscriptionScheduleType: $value")
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
            fun validate(): SubscriptionScheduleType = apply {
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

                return other is SubscriptionScheduleType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Target package for the update */
        class TargetPackage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
            ) : this(id, mutableMapOf())

            /**
             * Target package for the update
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                 * Returns a mutable builder for constructing an instance of [TargetPackage].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TargetPackage]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(targetPackage: TargetPackage) = apply {
                    id = targetPackage.id
                    additionalProperties = targetPackage.additionalProperties.toMutableMap()
                }

                /** Target package for the update */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

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
                 * Returns an immutable instance of [TargetPackage].
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
                fun build(): TargetPackage =
                    TargetPackage(checkRequired("id", id), additionalProperties.toMutableMap())
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
            fun validate(): TargetPackage = apply {
                if (validated) {
                    return@apply
                }

                id()
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
            @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TargetPackage &&
                    id == other.id &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TargetPackage{id=$id, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FutureUpdate &&
                scheduledExecutionTime == other.scheduledExecutionTime &&
                scheduleStatus == other.scheduleStatus &&
                subscriptionScheduleType == other.subscriptionScheduleType &&
                targetPackage == other.targetPackage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                scheduledExecutionTime,
                scheduleStatus,
                subscriptionScheduleType,
                targetPackage,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FutureUpdate{scheduledExecutionTime=$scheduledExecutionTime, scheduleStatus=$scheduleStatus, subscriptionScheduleType=$subscriptionScheduleType, targetPackage=$targetPackage, additionalProperties=$additionalProperties}"
    }

    /** Latest invoice for the subscription */
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
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("amountDue")
            @ExcludeMissing
            amountDue: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("billingReason")
            @ExcludeMissing
            billingReason: JsonField<BillingReason> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pdfUrl") @ExcludeMissing pdfUrl: JsonField<String> = JsonMissing.of(),
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
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingId(): String = billingId.getRequired("billingId")

        /**
         * Invoice creation date
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * Whether payment requires action
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requiresAction(): Boolean = requiresAction.getRequired("requiresAction")

        /**
         * Invoice status
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Amount due
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountDue(): Optional<Double> = amountDue.getOptional("amountDue")

        /**
         * Billing reason
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingReason(): Optional<BillingReason> = billingReason.getOptional("billingReason")

        /**
         * Invoice currency
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * Invoice PDF URL
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pdfUrl(): Optional<String> = pdfUrl.getOptional("pdfUrl")

        /**
         * Total amount
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun total(): Optional<Double> = total.getOptional("total")

        /**
         * Returns the raw JSON value of [billingId].
         *
         * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billingId") @ExcludeMissing fun _billingId(): JsonField<String> = billingId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns the raw JSON value of [amountDue].
         *
         * Unlike [amountDue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amountDue") @ExcludeMissing fun _amountDue(): JsonField<Double> = amountDue

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
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
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
             * You should usually call [Builder.billingId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingId(billingId: JsonField<String>) = apply { this.billingId = billingId }

            /** Invoice creation date */
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

            /** Whether payment requires action */
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

            /** Invoice status */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.amountDue] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Invoice PDF URL */
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OPEN,
                CANCELED,
                PAID,
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

        /** Billing reason */
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
             * An enum containing [BillingReason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillingReason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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

    /** Additional metadata for the subscription, stored as an arbitrary flat key-value object. */
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

    /** Minimum spend configuration */
    class MinimumSpend
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val currency: JsonField<Currency>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
        ) : this(amount, currency, mutableMapOf())

        /**
         * The price amount
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<Double> = amount.getOptional("amount")

        /**
         * The price currency
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<Currency> = currency.getOptional("currency")

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
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

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

            /** Returns a mutable builder for constructing an instance of [MinimumSpend]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MinimumSpend]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimumSpend: MinimumSpend) = apply {
                amount = minimumSpend.amount
                currency = minimumSpend.currency
                additionalProperties = minimumSpend.additionalProperties.toMutableMap()
            }

            /** The price amount */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** The price currency */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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
             * Returns an immutable instance of [MinimumSpend].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MinimumSpend =
                MinimumSpend(amount, currency, additionalProperties.toMutableMap())
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
        fun validate(): MinimumSpend = apply {
            if (validated) {
                return@apply
            }

            amount()
            currency().ifPresent { it.validate() }
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

        /** The price currency */
        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Currency] can contain an unknown value in a couple of cases:
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
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
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
                    else -> throw StiggInvalidDataException("Unknown Currency: $value")
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            return other is MinimumSpend &&
                amount == other.amount &&
                currency == other.currency &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, currency, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MinimumSpend{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
    }

    /** The method used to collect payments for a subscription */
    class PaymentCollectionMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CHARGE = of("CHARGE")

            @JvmField val INVOICE = of("INVOICE")

            @JvmField val NONE = of("NONE")

            @JvmStatic fun of(value: String) = PaymentCollectionMethod(JsonField.of(value))
        }

        /** An enum containing [PaymentCollectionMethod]'s known values. */
        enum class Known {
            CHARGE,
            INVOICE,
            NONE,
        }

        /**
         * An enum containing [PaymentCollectionMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [PaymentCollectionMethod] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHARGE,
            INVOICE,
            NONE,
            /**
             * An enum member indicating that [PaymentCollectionMethod] was instantiated with an
             * unknown value.
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
                CHARGE -> Value.CHARGE
                INVOICE -> Value.INVOICE
                NONE -> Value.NONE
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
                CHARGE -> Known.CHARGE
                INVOICE -> Known.INVOICE
                NONE -> Known.NONE
                else -> throw StiggInvalidDataException("Unknown PaymentCollectionMethod: $value")
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
        fun validate(): PaymentCollectionMethod = apply {
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

            return other is PaymentCollectionMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Price
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addonId: JsonField<String>,
        private val amount: JsonField<Double>,
        private val baseCharge: JsonField<Boolean>,
        private val billingCountryCode: JsonField<String>,
        private val blockSize: JsonField<Double>,
        private val currency: JsonField<Currency>,
        private val featureId: JsonField<String>,
        private val tiers: JsonField<List<Tier>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("addonId") @ExcludeMissing addonId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("baseCharge")
            @ExcludeMissing
            baseCharge: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("billingCountryCode")
            @ExcludeMissing
            billingCountryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("blockSize")
            @ExcludeMissing
            blockSize: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("featureId")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tiers") @ExcludeMissing tiers: JsonField<List<Tier>> = JsonMissing.of(),
        ) : this(
            addonId,
            amount,
            baseCharge,
            billingCountryCode,
            blockSize,
            currency,
            featureId,
            tiers,
            mutableMapOf(),
        )

        /**
         * Addon identifier for the price override
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addonId(): Optional<String> = addonId.getOptional("addonId")

        /**
         * The price amount
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<Double> = amount.getOptional("amount")

        /**
         * Whether this is a base charge override
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun baseCharge(): Optional<Boolean> = baseCharge.getOptional("baseCharge")

        /**
         * ISO 3166-1 alpha-2 country code this price applies to, or "eu" for the European Union
         * group you map countries into. Omit for the default price shown to all countries; set one
         * or more country-specific price periods on the same currency to localize the amount by
         * billing country.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingCountryCode(): Optional<String> =
            billingCountryCode.getOptional("billingCountryCode")

        /**
         * Block size for pricing
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun blockSize(): Optional<Double> = blockSize.getOptional("blockSize")

        /**
         * The price currency
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<Currency> = currency.getOptional("currency")

        /**
         * Feature identifier for the price override
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureId(): Optional<String> = featureId.getOptional("featureId")

        /**
         * Pricing tiers configuration
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

        /**
         * Returns the raw JSON value of [addonId].
         *
         * Unlike [addonId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addonId") @ExcludeMissing fun _addonId(): JsonField<String> = addonId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [baseCharge].
         *
         * Unlike [baseCharge], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("baseCharge")
        @ExcludeMissing
        fun _baseCharge(): JsonField<Boolean> = baseCharge

        /**
         * Returns the raw JSON value of [billingCountryCode].
         *
         * Unlike [billingCountryCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billingCountryCode")
        @ExcludeMissing
        fun _billingCountryCode(): JsonField<String> = billingCountryCode

        /**
         * Returns the raw JSON value of [blockSize].
         *
         * Unlike [blockSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blockSize") @ExcludeMissing fun _blockSize(): JsonField<Double> = blockSize

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [featureId].
         *
         * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

        /**
         * Returns the raw JSON value of [tiers].
         *
         * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

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

            /** Returns a mutable builder for constructing an instance of [Price]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Price]. */
        class Builder internal constructor() {

            private var addonId: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var baseCharge: JsonField<Boolean> = JsonMissing.of()
            private var billingCountryCode: JsonField<String> = JsonMissing.of()
            private var blockSize: JsonField<Double> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var featureId: JsonField<String> = JsonMissing.of()
            private var tiers: JsonField<MutableList<Tier>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(price: Price) = apply {
                addonId = price.addonId
                amount = price.amount
                baseCharge = price.baseCharge
                billingCountryCode = price.billingCountryCode
                blockSize = price.blockSize
                currency = price.currency
                featureId = price.featureId
                tiers = price.tiers.map { it.toMutableList() }
                additionalProperties = price.additionalProperties.toMutableMap()
            }

            /** Addon identifier for the price override */
            fun addonId(addonId: String?) = addonId(JsonField.ofNullable(addonId))

            /** Alias for calling [Builder.addonId] with `addonId.orElse(null)`. */
            fun addonId(addonId: Optional<String>) = addonId(addonId.getOrNull())

            /**
             * Sets [Builder.addonId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addonId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addonId(addonId: JsonField<String>) = apply { this.addonId = addonId }

            /** The price amount */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** Whether this is a base charge override */
            fun baseCharge(baseCharge: Boolean) = baseCharge(JsonField.of(baseCharge))

            /**
             * Sets [Builder.baseCharge] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseCharge] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseCharge(baseCharge: JsonField<Boolean>) = apply { this.baseCharge = baseCharge }

            /**
             * ISO 3166-1 alpha-2 country code this price applies to, or "eu" for the European Union
             * group you map countries into. Omit for the default price shown to all countries; set
             * one or more country-specific price periods on the same currency to localize the
             * amount by billing country.
             */
            fun billingCountryCode(billingCountryCode: String) =
                billingCountryCode(JsonField.of(billingCountryCode))

            /**
             * Sets [Builder.billingCountryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingCountryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingCountryCode(billingCountryCode: JsonField<String>) = apply {
                this.billingCountryCode = billingCountryCode
            }

            /** Block size for pricing */
            fun blockSize(blockSize: Double) = blockSize(JsonField.of(blockSize))

            /**
             * Sets [Builder.blockSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockSize] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blockSize(blockSize: JsonField<Double>) = apply { this.blockSize = blockSize }

            /** The price currency */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Feature identifier for the price override */
            fun featureId(featureId: String?) = featureId(JsonField.ofNullable(featureId))

            /** Alias for calling [Builder.featureId] with `featureId.orElse(null)`. */
            fun featureId(featureId: Optional<String>) = featureId(featureId.getOrNull())

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

            /** Pricing tiers configuration */
            fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

            /**
             * Sets [Builder.tiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tiers(tiers: JsonField<List<Tier>>) = apply {
                this.tiers = tiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Tier] to [tiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTier(tier: Tier) = apply {
                tiers =
                    (tiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tiers", it).add(tier)
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
             * Returns an immutable instance of [Price].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Price =
                Price(
                    addonId,
                    amount,
                    baseCharge,
                    billingCountryCode,
                    blockSize,
                    currency,
                    featureId,
                    (tiers ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Price = apply {
            if (validated) {
                return@apply
            }

            addonId()
            amount()
            baseCharge()
            billingCountryCode()
            blockSize()
            currency().ifPresent { it.validate() }
            featureId()
            tiers().ifPresent { it.forEach { it.validate() } }
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
            (if (addonId.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (baseCharge.asKnown().isPresent) 1 else 0) +
                (if (billingCountryCode.asKnown().isPresent) 1 else 0) +
                (if (blockSize.asKnown().isPresent) 1 else 0) +
                (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (featureId.asKnown().isPresent) 1 else 0) +
                (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** The price currency */
        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Currency] can contain an unknown value in a couple of cases:
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
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
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
                    else -> throw StiggInvalidDataException("Unknown Currency: $value")
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Currency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Tier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val flatPrice: JsonField<FlatPrice>,
            private val unitPrice: JsonField<UnitPrice>,
            private val upTo: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("flatPrice")
                @ExcludeMissing
                flatPrice: JsonField<FlatPrice> = JsonMissing.of(),
                @JsonProperty("unitPrice")
                @ExcludeMissing
                unitPrice: JsonField<UnitPrice> = JsonMissing.of(),
                @JsonProperty("upTo") @ExcludeMissing upTo: JsonField<Double> = JsonMissing.of(),
            ) : this(flatPrice, unitPrice, upTo, mutableMapOf())

            /**
             * The flat fee price of the price tier
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun flatPrice(): Optional<FlatPrice> = flatPrice.getOptional("flatPrice")

            /**
             * The unit price of the price tier
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun unitPrice(): Optional<UnitPrice> = unitPrice.getOptional("unitPrice")

            /**
             * The up to quantity of the price tier
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun upTo(): Optional<Double> = upTo.getOptional("upTo")

            /**
             * Returns the raw JSON value of [flatPrice].
             *
             * Unlike [flatPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("flatPrice")
            @ExcludeMissing
            fun _flatPrice(): JsonField<FlatPrice> = flatPrice

            /**
             * Returns the raw JSON value of [unitPrice].
             *
             * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unitPrice")
            @ExcludeMissing
            fun _unitPrice(): JsonField<UnitPrice> = unitPrice

            /**
             * Returns the raw JSON value of [upTo].
             *
             * Unlike [upTo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("upTo") @ExcludeMissing fun _upTo(): JsonField<Double> = upTo

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

                /** Returns a mutable builder for constructing an instance of [Tier]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tier]. */
            class Builder internal constructor() {

                private var flatPrice: JsonField<FlatPrice> = JsonMissing.of()
                private var unitPrice: JsonField<UnitPrice> = JsonMissing.of()
                private var upTo: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tier: Tier) = apply {
                    flatPrice = tier.flatPrice
                    unitPrice = tier.unitPrice
                    upTo = tier.upTo
                    additionalProperties = tier.additionalProperties.toMutableMap()
                }

                /** The flat fee price of the price tier */
                fun flatPrice(flatPrice: FlatPrice) = flatPrice(JsonField.of(flatPrice))

                /**
                 * Sets [Builder.flatPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.flatPrice] with a well-typed [FlatPrice] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun flatPrice(flatPrice: JsonField<FlatPrice>) = apply {
                    this.flatPrice = flatPrice
                }

                /** The unit price of the price tier */
                fun unitPrice(unitPrice: UnitPrice) = unitPrice(JsonField.of(unitPrice))

                /**
                 * Sets [Builder.unitPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitPrice] with a well-typed [UnitPrice] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unitPrice(unitPrice: JsonField<UnitPrice>) = apply {
                    this.unitPrice = unitPrice
                }

                /** The up to quantity of the price tier */
                fun upTo(upTo: Double) = upTo(JsonField.of(upTo))

                /**
                 * Sets [Builder.upTo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.upTo] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun upTo(upTo: JsonField<Double>) = apply { this.upTo = upTo }

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
                 * Returns an immutable instance of [Tier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Tier =
                    Tier(flatPrice, unitPrice, upTo, additionalProperties.toMutableMap())
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
            fun validate(): Tier = apply {
                if (validated) {
                    return@apply
                }

                flatPrice().ifPresent { it.validate() }
                unitPrice().ifPresent { it.validate() }
                upTo()
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
                (flatPrice.asKnown().getOrNull()?.validity() ?: 0) +
                    (unitPrice.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (upTo.asKnown().isPresent) 1 else 0)

            /** The flat fee price of the price tier */
            class FlatPrice
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
                     * Returns a mutable builder for constructing an instance of [FlatPrice].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [FlatPrice]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var currency: JsonField<Currency>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(flatPrice: FlatPrice) = apply {
                        amount = flatPrice.amount
                        currency = flatPrice.currency
                        additionalProperties = flatPrice.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [FlatPrice].
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
                    fun build(): FlatPrice =
                        FlatPrice(
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
                fun validate(): FlatPrice = apply {
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

                    return other is FlatPrice &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FlatPrice{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /** The unit price of the price tier */
            class UnitPrice
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
                     * Returns a mutable builder for constructing an instance of [UnitPrice].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [UnitPrice]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var currency: JsonField<Currency>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(unitPrice: UnitPrice) = apply {
                        amount = unitPrice.amount
                        currency = unitPrice.currency
                        additionalProperties = unitPrice.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [UnitPrice].
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
                    fun build(): UnitPrice =
                        UnitPrice(
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
                fun validate(): UnitPrice = apply {
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

                    return other is UnitPrice &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UnitPrice{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tier &&
                    flatPrice == other.flatPrice &&
                    unitPrice == other.unitPrice &&
                    upTo == other.upTo &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(flatPrice, unitPrice, upTo, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tier{flatPrice=$flatPrice, unitPrice=$unitPrice, upTo=$upTo, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Price &&
                addonId == other.addonId &&
                amount == other.amount &&
                baseCharge == other.baseCharge &&
                billingCountryCode == other.billingCountryCode &&
                blockSize == other.blockSize &&
                currency == other.currency &&
                featureId == other.featureId &&
                tiers == other.tiers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addonId,
                amount,
                baseCharge,
                billingCountryCode,
                blockSize,
                currency,
                featureId,
                tiers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Price{addonId=$addonId, amount=$amount, baseCharge=$baseCharge, billingCountryCode=$billingCountryCode, blockSize=$blockSize, currency=$currency, featureId=$featureId, tiers=$tiers, additionalProperties=$additionalProperties}"
    }

    /** Subscription entitlement reference */
    class SubscriptionEntitlement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(id, type, mutableMapOf())

        /**
         * Feature ID or currency ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Entitlement type (FEATURE or CREDIT)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
             * Returns a mutable builder for constructing an instance of [SubscriptionEntitlement].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SubscriptionEntitlement]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscriptionEntitlement: SubscriptionEntitlement) = apply {
                id = subscriptionEntitlement.id
                type = subscriptionEntitlement.type
                additionalProperties = subscriptionEntitlement.additionalProperties.toMutableMap()
            }

            /** Feature ID or currency ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Entitlement type (FEATURE or CREDIT) */
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
             * Returns an immutable instance of [SubscriptionEntitlement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SubscriptionEntitlement =
                SubscriptionEntitlement(
                    checkRequired("id", id),
                    checkRequired("type", type),
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
        fun validate(): SubscriptionEntitlement = apply {
            if (validated) {
                return@apply
            }

            id()
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
            (if (id.asKnown().isPresent) 1 else 0) + (type.asKnown().getOrNull()?.validity() ?: 0)

        /** Entitlement type (FEATURE or CREDIT) */
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

                @JvmField val FEATURE = of("FEATURE")

                @JvmField val CREDIT = of("CREDIT")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                FEATURE,
                CREDIT,
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
                FEATURE,
                CREDIT,
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
                    FEATURE -> Value.FEATURE
                    CREDIT -> Value.CREDIT
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
                    FEATURE -> Known.FEATURE
                    CREDIT -> Known.CREDIT
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

            return other is SubscriptionEntitlement &&
                id == other.id &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionEntitlement{id=$id, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Trial configuration */
    class Trial
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val trialEndBehavior: JsonField<TrialEndBehavior>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("trialEndBehavior")
            @ExcludeMissing
            trialEndBehavior: JsonField<TrialEndBehavior> = JsonMissing.of()
        ) : this(trialEndBehavior, mutableMapOf())

        /**
         * Behavior when the trial ends
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun trialEndBehavior(): TrialEndBehavior = trialEndBehavior.getRequired("trialEndBehavior")

        /**
         * Returns the raw JSON value of [trialEndBehavior].
         *
         * Unlike [trialEndBehavior], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trialEndBehavior")
        @ExcludeMissing
        fun _trialEndBehavior(): JsonField<TrialEndBehavior> = trialEndBehavior

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
             * Returns a mutable builder for constructing an instance of [Trial].
             *
             * The following fields are required:
             * ```java
             * .trialEndBehavior()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Trial]. */
        class Builder internal constructor() {

            private var trialEndBehavior: JsonField<TrialEndBehavior>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trial: Trial) = apply {
                trialEndBehavior = trial.trialEndBehavior
                additionalProperties = trial.additionalProperties.toMutableMap()
            }

            /** Behavior when the trial ends */
            fun trialEndBehavior(trialEndBehavior: TrialEndBehavior) =
                trialEndBehavior(JsonField.of(trialEndBehavior))

            /**
             * Sets [Builder.trialEndBehavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialEndBehavior] with a well-typed
             * [TrialEndBehavior] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun trialEndBehavior(trialEndBehavior: JsonField<TrialEndBehavior>) = apply {
                this.trialEndBehavior = trialEndBehavior
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
             * Returns an immutable instance of [Trial].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .trialEndBehavior()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Trial =
                Trial(
                    checkRequired("trialEndBehavior", trialEndBehavior),
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
        fun validate(): Trial = apply {
            if (validated) {
                return@apply
            }

            trialEndBehavior().validate()
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
        internal fun validity(): Int = (trialEndBehavior.asKnown().getOrNull()?.validity() ?: 0)

        /** Behavior when the trial ends */
        class TrialEndBehavior
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

                @JvmField val CONVERT_TO_PAID = of("CONVERT_TO_PAID")

                @JvmField val CANCEL_SUBSCRIPTION = of("CANCEL_SUBSCRIPTION")

                @JvmStatic fun of(value: String) = TrialEndBehavior(JsonField.of(value))
            }

            /** An enum containing [TrialEndBehavior]'s known values. */
            enum class Known {
                CONVERT_TO_PAID,
                CANCEL_SUBSCRIPTION,
            }

            /**
             * An enum containing [TrialEndBehavior]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TrialEndBehavior] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CONVERT_TO_PAID,
                CANCEL_SUBSCRIPTION,
                /**
                 * An enum member indicating that [TrialEndBehavior] was instantiated with an
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
                    CONVERT_TO_PAID -> Value.CONVERT_TO_PAID
                    CANCEL_SUBSCRIPTION -> Value.CANCEL_SUBSCRIPTION
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
                    CONVERT_TO_PAID -> Known.CONVERT_TO_PAID
                    CANCEL_SUBSCRIPTION -> Known.CANCEL_SUBSCRIPTION
                    else -> throw StiggInvalidDataException("Unknown TrialEndBehavior: $value")
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
            fun validate(): TrialEndBehavior = apply {
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

                return other is TrialEndBehavior && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Trial &&
                trialEndBehavior == other.trialEndBehavior &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(trialEndBehavior, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Trial{trialEndBehavior=$trialEndBehavior, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionListResponse &&
            id == other.id &&
            billingId == other.billingId &&
            createdAt == other.createdAt &&
            customerId == other.customerId &&
            paymentCollection == other.paymentCollection &&
            planId == other.planId &&
            pricingType == other.pricingType &&
            startDate == other.startDate &&
            status == other.status &&
            addons == other.addons &&
            billingCycleAnchor == other.billingCycleAnchor &&
            budget == other.budget &&
            cancellationDate == other.cancellationDate &&
            cancelReason == other.cancelReason &&
            contractId == other.contractId &&
            coupons == other.coupons &&
            currentBillingPeriodEnd == other.currentBillingPeriodEnd &&
            currentBillingPeriodStart == other.currentBillingPeriodStart &&
            effectiveEndDate == other.effectiveEndDate &&
            endDate == other.endDate &&
            futureUpdates == other.futureUpdates &&
            latestInvoice == other.latestInvoice &&
            metadata == other.metadata &&
            minimumSpend == other.minimumSpend &&
            payingCustomerId == other.payingCustomerId &&
            paymentCollectionMethod == other.paymentCollectionMethod &&
            prices == other.prices &&
            resourceId == other.resourceId &&
            subscriptionEntitlements == other.subscriptionEntitlements &&
            trial == other.trial &&
            trialEndDate == other.trialEndDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            billingId,
            createdAt,
            customerId,
            paymentCollection,
            planId,
            pricingType,
            startDate,
            status,
            addons,
            billingCycleAnchor,
            budget,
            cancellationDate,
            cancelReason,
            contractId,
            coupons,
            currentBillingPeriodEnd,
            currentBillingPeriodStart,
            effectiveEndDate,
            endDate,
            futureUpdates,
            latestInvoice,
            metadata,
            minimumSpend,
            payingCustomerId,
            paymentCollectionMethod,
            prices,
            resourceId,
            subscriptionEntitlements,
            trial,
            trialEndDate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionListResponse{id=$id, billingId=$billingId, createdAt=$createdAt, customerId=$customerId, paymentCollection=$paymentCollection, planId=$planId, pricingType=$pricingType, startDate=$startDate, status=$status, addons=$addons, billingCycleAnchor=$billingCycleAnchor, budget=$budget, cancellationDate=$cancellationDate, cancelReason=$cancelReason, contractId=$contractId, coupons=$coupons, currentBillingPeriodEnd=$currentBillingPeriodEnd, currentBillingPeriodStart=$currentBillingPeriodStart, effectiveEndDate=$effectiveEndDate, endDate=$endDate, futureUpdates=$futureUpdates, latestInvoice=$latestInvoice, metadata=$metadata, minimumSpend=$minimumSpend, payingCustomerId=$payingCustomerId, paymentCollectionMethod=$paymentCollectionMethod, prices=$prices, resourceId=$resourceId, subscriptionEntitlements=$subscriptionEntitlements, trial=$trial, trialEndDate=$trialEndDate, additionalProperties=$additionalProperties}"
}
