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

/** Update a subscription */
class SubscriptionUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addons(): Optional<List<Addon>> = body.addons()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun appliedCoupon(): Optional<AppliedCoupon> = body.appliedCoupon()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awaitPaymentConfirmation(): Optional<Boolean> = body.awaitPaymentConfirmation()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingInformation(): Optional<BillingInformation> = body.billingInformation()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingPeriod(): Optional<BillingPeriod> = body.billingPeriod()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budget(): Optional<Budget> = body.budget()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun charges(): Optional<List<Charge>> = body.charges()

    /**
     * Additional metadata for the subscription
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpend(): Optional<MinimumSpend> = body.minimumSpend()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priceOverrides(): Optional<List<PriceOverride>> = body.priceOverrides()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promotionCode(): Optional<String> = body.promotionCode()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduleStrategy(): Optional<ScheduleStrategy> = body.scheduleStrategy()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionEntitlements(): Optional<List<SubscriptionEntitlement>> =
        body.subscriptionEntitlements()

    /**
     * Subscription trial end date
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trialEndDate(): Optional<OffsetDateTime> = body.trialEndDate()

    /**
     * Returns the raw JSON value of [addons].
     *
     * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addons(): JsonField<List<Addon>> = body._addons()

    /**
     * Returns the raw JSON value of [appliedCoupon].
     *
     * Unlike [appliedCoupon], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _appliedCoupon(): JsonField<AppliedCoupon> = body._appliedCoupon()

    /**
     * Returns the raw JSON value of [awaitPaymentConfirmation].
     *
     * Unlike [awaitPaymentConfirmation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _awaitPaymentConfirmation(): JsonField<Boolean> = body._awaitPaymentConfirmation()

    /**
     * Returns the raw JSON value of [billingInformation].
     *
     * Unlike [billingInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _billingInformation(): JsonField<BillingInformation> = body._billingInformation()

    /**
     * Returns the raw JSON value of [billingPeriod].
     *
     * Unlike [billingPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingPeriod(): JsonField<BillingPeriod> = body._billingPeriod()

    /**
     * Returns the raw JSON value of [budget].
     *
     * Unlike [budget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _budget(): JsonField<Budget> = body._budget()

    /**
     * Returns the raw JSON value of [charges].
     *
     * Unlike [charges], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _charges(): JsonField<List<Charge>> = body._charges()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [minimumSpend].
     *
     * Unlike [minimumSpend], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minimumSpend(): JsonField<MinimumSpend> = body._minimumSpend()

    /**
     * Returns the raw JSON value of [priceOverrides].
     *
     * Unlike [priceOverrides], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _priceOverrides(): JsonField<List<PriceOverride>> = body._priceOverrides()

    /**
     * Returns the raw JSON value of [promotionCode].
     *
     * Unlike [promotionCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _promotionCode(): JsonField<String> = body._promotionCode()

    /**
     * Returns the raw JSON value of [scheduleStrategy].
     *
     * Unlike [scheduleStrategy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _scheduleStrategy(): JsonField<ScheduleStrategy> = body._scheduleStrategy()

    /**
     * Returns the raw JSON value of [subscriptionEntitlements].
     *
     * Unlike [subscriptionEntitlements], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _subscriptionEntitlements(): JsonField<List<SubscriptionEntitlement>> =
        body._subscriptionEntitlements()

    /**
     * Returns the raw JSON value of [trialEndDate].
     *
     * Unlike [trialEndDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trialEndDate(): JsonField<OffsetDateTime> = body._trialEndDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SubscriptionUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SubscriptionUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionUpdateParams: SubscriptionUpdateParams) = apply {
            id = subscriptionUpdateParams.id
            body = subscriptionUpdateParams.body.toBuilder()
            additionalHeaders = subscriptionUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [addons]
         * - [appliedCoupon]
         * - [awaitPaymentConfirmation]
         * - [billingInformation]
         * - [billingPeriod]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun addons(addons: List<Addon>) = apply { body.addons(addons) }

        /**
         * Sets [Builder.addons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addons] with a well-typed `List<Addon>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addons(addons: JsonField<List<Addon>>) = apply { body.addons(addons) }

        /**
         * Adds a single [Addon] to [addons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddon(addon: Addon) = apply { body.addAddon(addon) }

        fun appliedCoupon(appliedCoupon: AppliedCoupon) = apply {
            body.appliedCoupon(appliedCoupon)
        }

        /**
         * Sets [Builder.appliedCoupon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appliedCoupon] with a well-typed [AppliedCoupon] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun appliedCoupon(appliedCoupon: JsonField<AppliedCoupon>) = apply {
            body.appliedCoupon(appliedCoupon)
        }

        fun awaitPaymentConfirmation(awaitPaymentConfirmation: Boolean) = apply {
            body.awaitPaymentConfirmation(awaitPaymentConfirmation)
        }

        /**
         * Sets [Builder.awaitPaymentConfirmation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awaitPaymentConfirmation] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun awaitPaymentConfirmation(awaitPaymentConfirmation: JsonField<Boolean>) = apply {
            body.awaitPaymentConfirmation(awaitPaymentConfirmation)
        }

        fun billingInformation(billingInformation: BillingInformation) = apply {
            body.billingInformation(billingInformation)
        }

        /**
         * Sets [Builder.billingInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingInformation] with a well-typed
         * [BillingInformation] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun billingInformation(billingInformation: JsonField<BillingInformation>) = apply {
            body.billingInformation(billingInformation)
        }

        fun billingPeriod(billingPeriod: BillingPeriod) = apply {
            body.billingPeriod(billingPeriod)
        }

        /**
         * Sets [Builder.billingPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingPeriod] with a well-typed [BillingPeriod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingPeriod(billingPeriod: JsonField<BillingPeriod>) = apply {
            body.billingPeriod(billingPeriod)
        }

        fun budget(budget: Budget?) = apply { body.budget(budget) }

        /** Alias for calling [Builder.budget] with `budget.orElse(null)`. */
        fun budget(budget: Optional<Budget>) = budget(budget.getOrNull())

        /**
         * Sets [Builder.budget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budget] with a well-typed [Budget] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun budget(budget: JsonField<Budget>) = apply { body.budget(budget) }

        fun charges(charges: List<Charge>) = apply { body.charges(charges) }

        /**
         * Sets [Builder.charges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.charges] with a well-typed `List<Charge>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun charges(charges: JsonField<List<Charge>>) = apply { body.charges(charges) }

        /**
         * Adds a single [Charge] to [charges].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCharge(charge: Charge) = apply { body.addCharge(charge) }

        /** Additional metadata for the subscription */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun minimumSpend(minimumSpend: MinimumSpend?) = apply { body.minimumSpend(minimumSpend) }

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
            body.minimumSpend(minimumSpend)
        }

        fun priceOverrides(priceOverrides: List<PriceOverride>) = apply {
            body.priceOverrides(priceOverrides)
        }

        /**
         * Sets [Builder.priceOverrides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceOverrides] with a well-typed `List<PriceOverride>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun priceOverrides(priceOverrides: JsonField<List<PriceOverride>>) = apply {
            body.priceOverrides(priceOverrides)
        }

        /**
         * Adds a single [PriceOverride] to [priceOverrides].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriceOverride(priceOverride: PriceOverride) = apply {
            body.addPriceOverride(priceOverride)
        }

        fun promotionCode(promotionCode: String) = apply { body.promotionCode(promotionCode) }

        /**
         * Sets [Builder.promotionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promotionCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promotionCode(promotionCode: JsonField<String>) = apply {
            body.promotionCode(promotionCode)
        }

        fun scheduleStrategy(scheduleStrategy: ScheduleStrategy) = apply {
            body.scheduleStrategy(scheduleStrategy)
        }

        /**
         * Sets [Builder.scheduleStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduleStrategy] with a well-typed [ScheduleStrategy]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun scheduleStrategy(scheduleStrategy: JsonField<ScheduleStrategy>) = apply {
            body.scheduleStrategy(scheduleStrategy)
        }

        fun subscriptionEntitlements(subscriptionEntitlements: List<SubscriptionEntitlement>) =
            apply {
                body.subscriptionEntitlements(subscriptionEntitlements)
            }

        /**
         * Sets [Builder.subscriptionEntitlements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionEntitlements] with a well-typed
         * `List<SubscriptionEntitlement>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun subscriptionEntitlements(
            subscriptionEntitlements: JsonField<List<SubscriptionEntitlement>>
        ) = apply { body.subscriptionEntitlements(subscriptionEntitlements) }

        /**
         * Adds a single [SubscriptionEntitlement] to [subscriptionEntitlements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubscriptionEntitlement(subscriptionEntitlement: SubscriptionEntitlement) = apply {
            body.addSubscriptionEntitlement(subscriptionEntitlement)
        }

        /** Subscription trial end date */
        fun trialEndDate(trialEndDate: OffsetDateTime) = apply { body.trialEndDate(trialEndDate) }

        /**
         * Sets [Builder.trialEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialEndDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trialEndDate(trialEndDate: JsonField<OffsetDateTime>) = apply {
            body.trialEndDate(trialEndDate)
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
         * Returns an immutable instance of [SubscriptionUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionUpdateParams =
            SubscriptionUpdateParams(
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

    /** Partially update an existing subscriptoin. Only provided fields are updated. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addons: JsonField<List<Addon>>,
        private val appliedCoupon: JsonField<AppliedCoupon>,
        private val awaitPaymentConfirmation: JsonField<Boolean>,
        private val billingInformation: JsonField<BillingInformation>,
        private val billingPeriod: JsonField<BillingPeriod>,
        private val budget: JsonField<Budget>,
        private val charges: JsonField<List<Charge>>,
        private val metadata: JsonField<Metadata>,
        private val minimumSpend: JsonField<MinimumSpend>,
        private val priceOverrides: JsonField<List<PriceOverride>>,
        private val promotionCode: JsonField<String>,
        private val scheduleStrategy: JsonField<ScheduleStrategy>,
        private val subscriptionEntitlements: JsonField<List<SubscriptionEntitlement>>,
        private val trialEndDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("addons")
            @ExcludeMissing
            addons: JsonField<List<Addon>> = JsonMissing.of(),
            @JsonProperty("appliedCoupon")
            @ExcludeMissing
            appliedCoupon: JsonField<AppliedCoupon> = JsonMissing.of(),
            @JsonProperty("awaitPaymentConfirmation")
            @ExcludeMissing
            awaitPaymentConfirmation: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("billingInformation")
            @ExcludeMissing
            billingInformation: JsonField<BillingInformation> = JsonMissing.of(),
            @JsonProperty("billingPeriod")
            @ExcludeMissing
            billingPeriod: JsonField<BillingPeriod> = JsonMissing.of(),
            @JsonProperty("budget") @ExcludeMissing budget: JsonField<Budget> = JsonMissing.of(),
            @JsonProperty("charges")
            @ExcludeMissing
            charges: JsonField<List<Charge>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("minimumSpend")
            @ExcludeMissing
            minimumSpend: JsonField<MinimumSpend> = JsonMissing.of(),
            @JsonProperty("priceOverrides")
            @ExcludeMissing
            priceOverrides: JsonField<List<PriceOverride>> = JsonMissing.of(),
            @JsonProperty("promotionCode")
            @ExcludeMissing
            promotionCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scheduleStrategy")
            @ExcludeMissing
            scheduleStrategy: JsonField<ScheduleStrategy> = JsonMissing.of(),
            @JsonProperty("subscriptionEntitlements")
            @ExcludeMissing
            subscriptionEntitlements: JsonField<List<SubscriptionEntitlement>> = JsonMissing.of(),
            @JsonProperty("trialEndDate")
            @ExcludeMissing
            trialEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            addons,
            appliedCoupon,
            awaitPaymentConfirmation,
            billingInformation,
            billingPeriod,
            budget,
            charges,
            metadata,
            minimumSpend,
            priceOverrides,
            promotionCode,
            scheduleStrategy,
            subscriptionEntitlements,
            trialEndDate,
            mutableMapOf(),
        )

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addons(): Optional<List<Addon>> = addons.getOptional("addons")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appliedCoupon(): Optional<AppliedCoupon> = appliedCoupon.getOptional("appliedCoupon")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun awaitPaymentConfirmation(): Optional<Boolean> =
            awaitPaymentConfirmation.getOptional("awaitPaymentConfirmation")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingInformation(): Optional<BillingInformation> =
            billingInformation.getOptional("billingInformation")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingPeriod(): Optional<BillingPeriod> = billingPeriod.getOptional("billingPeriod")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budget(): Optional<Budget> = budget.getOptional("budget")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun charges(): Optional<List<Charge>> = charges.getOptional("charges")

        /**
         * Additional metadata for the subscription
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumSpend(): Optional<MinimumSpend> = minimumSpend.getOptional("minimumSpend")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceOverrides(): Optional<List<PriceOverride>> =
            priceOverrides.getOptional("priceOverrides")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun promotionCode(): Optional<String> = promotionCode.getOptional("promotionCode")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scheduleStrategy(): Optional<ScheduleStrategy> =
            scheduleStrategy.getOptional("scheduleStrategy")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscriptionEntitlements(): Optional<List<SubscriptionEntitlement>> =
            subscriptionEntitlements.getOptional("subscriptionEntitlements")

        /**
         * Subscription trial end date
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trialEndDate(): Optional<OffsetDateTime> = trialEndDate.getOptional("trialEndDate")

        /**
         * Returns the raw JSON value of [addons].
         *
         * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addons") @ExcludeMissing fun _addons(): JsonField<List<Addon>> = addons

        /**
         * Returns the raw JSON value of [appliedCoupon].
         *
         * Unlike [appliedCoupon], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("appliedCoupon")
        @ExcludeMissing
        fun _appliedCoupon(): JsonField<AppliedCoupon> = appliedCoupon

        /**
         * Returns the raw JSON value of [awaitPaymentConfirmation].
         *
         * Unlike [awaitPaymentConfirmation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("awaitPaymentConfirmation")
        @ExcludeMissing
        fun _awaitPaymentConfirmation(): JsonField<Boolean> = awaitPaymentConfirmation

        /**
         * Returns the raw JSON value of [billingInformation].
         *
         * Unlike [billingInformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billingInformation")
        @ExcludeMissing
        fun _billingInformation(): JsonField<BillingInformation> = billingInformation

        /**
         * Returns the raw JSON value of [billingPeriod].
         *
         * Unlike [billingPeriod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingPeriod")
        @ExcludeMissing
        fun _billingPeriod(): JsonField<BillingPeriod> = billingPeriod

        /**
         * Returns the raw JSON value of [budget].
         *
         * Unlike [budget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("budget") @ExcludeMissing fun _budget(): JsonField<Budget> = budget

        /**
         * Returns the raw JSON value of [charges].
         *
         * Unlike [charges], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("charges") @ExcludeMissing fun _charges(): JsonField<List<Charge>> = charges

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [minimumSpend].
         *
         * Unlike [minimumSpend], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        fun _minimumSpend(): JsonField<MinimumSpend> = minimumSpend

        /**
         * Returns the raw JSON value of [priceOverrides].
         *
         * Unlike [priceOverrides], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("priceOverrides")
        @ExcludeMissing
        fun _priceOverrides(): JsonField<List<PriceOverride>> = priceOverrides

        /**
         * Returns the raw JSON value of [promotionCode].
         *
         * Unlike [promotionCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("promotionCode")
        @ExcludeMissing
        fun _promotionCode(): JsonField<String> = promotionCode

        /**
         * Returns the raw JSON value of [scheduleStrategy].
         *
         * Unlike [scheduleStrategy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scheduleStrategy")
        @ExcludeMissing
        fun _scheduleStrategy(): JsonField<ScheduleStrategy> = scheduleStrategy

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
         * Returns the raw JSON value of [trialEndDate].
         *
         * Unlike [trialEndDate], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var addons: JsonField<MutableList<Addon>>? = null
            private var appliedCoupon: JsonField<AppliedCoupon> = JsonMissing.of()
            private var awaitPaymentConfirmation: JsonField<Boolean> = JsonMissing.of()
            private var billingInformation: JsonField<BillingInformation> = JsonMissing.of()
            private var billingPeriod: JsonField<BillingPeriod> = JsonMissing.of()
            private var budget: JsonField<Budget> = JsonMissing.of()
            private var charges: JsonField<MutableList<Charge>>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var minimumSpend: JsonField<MinimumSpend> = JsonMissing.of()
            private var priceOverrides: JsonField<MutableList<PriceOverride>>? = null
            private var promotionCode: JsonField<String> = JsonMissing.of()
            private var scheduleStrategy: JsonField<ScheduleStrategy> = JsonMissing.of()
            private var subscriptionEntitlements: JsonField<MutableList<SubscriptionEntitlement>>? =
                null
            private var trialEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                addons = body.addons.map { it.toMutableList() }
                appliedCoupon = body.appliedCoupon
                awaitPaymentConfirmation = body.awaitPaymentConfirmation
                billingInformation = body.billingInformation
                billingPeriod = body.billingPeriod
                budget = body.budget
                charges = body.charges.map { it.toMutableList() }
                metadata = body.metadata
                minimumSpend = body.minimumSpend
                priceOverrides = body.priceOverrides.map { it.toMutableList() }
                promotionCode = body.promotionCode
                scheduleStrategy = body.scheduleStrategy
                subscriptionEntitlements = body.subscriptionEntitlements.map { it.toMutableList() }
                trialEndDate = body.trialEndDate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun addons(addons: List<Addon>) = addons(JsonField.of(addons))

            /**
             * Sets [Builder.addons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addons] with a well-typed `List<Addon>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun appliedCoupon(appliedCoupon: AppliedCoupon) =
                appliedCoupon(JsonField.of(appliedCoupon))

            /**
             * Sets [Builder.appliedCoupon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliedCoupon] with a well-typed [AppliedCoupon]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun appliedCoupon(appliedCoupon: JsonField<AppliedCoupon>) = apply {
                this.appliedCoupon = appliedCoupon
            }

            fun awaitPaymentConfirmation(awaitPaymentConfirmation: Boolean) =
                awaitPaymentConfirmation(JsonField.of(awaitPaymentConfirmation))

            /**
             * Sets [Builder.awaitPaymentConfirmation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awaitPaymentConfirmation] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun awaitPaymentConfirmation(awaitPaymentConfirmation: JsonField<Boolean>) = apply {
                this.awaitPaymentConfirmation = awaitPaymentConfirmation
            }

            fun billingInformation(billingInformation: BillingInformation) =
                billingInformation(JsonField.of(billingInformation))

            /**
             * Sets [Builder.billingInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingInformation] with a well-typed
             * [BillingInformation] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun billingInformation(billingInformation: JsonField<BillingInformation>) = apply {
                this.billingInformation = billingInformation
            }

            fun billingPeriod(billingPeriod: BillingPeriod) =
                billingPeriod(JsonField.of(billingPeriod))

            /**
             * Sets [Builder.billingPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingPeriod] with a well-typed [BillingPeriod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingPeriod(billingPeriod: JsonField<BillingPeriod>) = apply {
                this.billingPeriod = billingPeriod
            }

            fun budget(budget: Budget?) = budget(JsonField.ofNullable(budget))

            /** Alias for calling [Builder.budget] with `budget.orElse(null)`. */
            fun budget(budget: Optional<Budget>) = budget(budget.getOrNull())

            /**
             * Sets [Builder.budget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budget] with a well-typed [Budget] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budget(budget: JsonField<Budget>) = apply { this.budget = budget }

            fun charges(charges: List<Charge>) = charges(JsonField.of(charges))

            /**
             * Sets [Builder.charges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.charges] with a well-typed `List<Charge>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun charges(charges: JsonField<List<Charge>>) = apply {
                this.charges = charges.map { it.toMutableList() }
            }

            /**
             * Adds a single [Charge] to [charges].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCharge(charge: Charge) = apply {
                charges =
                    (charges ?: JsonField.of(mutableListOf())).also {
                        checkKnown("charges", it).add(charge)
                    }
            }

            /** Additional metadata for the subscription */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

            fun priceOverrides(priceOverrides: List<PriceOverride>) =
                priceOverrides(JsonField.of(priceOverrides))

            /**
             * Sets [Builder.priceOverrides] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceOverrides] with a well-typed
             * `List<PriceOverride>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun priceOverrides(priceOverrides: JsonField<List<PriceOverride>>) = apply {
                this.priceOverrides = priceOverrides.map { it.toMutableList() }
            }

            /**
             * Adds a single [PriceOverride] to [priceOverrides].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPriceOverride(priceOverride: PriceOverride) = apply {
                priceOverrides =
                    (priceOverrides ?: JsonField.of(mutableListOf())).also {
                        checkKnown("priceOverrides", it).add(priceOverride)
                    }
            }

            fun promotionCode(promotionCode: String) = promotionCode(JsonField.of(promotionCode))

            /**
             * Sets [Builder.promotionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promotionCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promotionCode(promotionCode: JsonField<String>) = apply {
                this.promotionCode = promotionCode
            }

            fun scheduleStrategy(scheduleStrategy: ScheduleStrategy) =
                scheduleStrategy(JsonField.of(scheduleStrategy))

            /**
             * Sets [Builder.scheduleStrategy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduleStrategy] with a well-typed
             * [ScheduleStrategy] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun scheduleStrategy(scheduleStrategy: JsonField<ScheduleStrategy>) = apply {
                this.scheduleStrategy = scheduleStrategy
            }

            fun subscriptionEntitlements(subscriptionEntitlements: List<SubscriptionEntitlement>) =
                subscriptionEntitlements(JsonField.of(subscriptionEntitlements))

            /**
             * Sets [Builder.subscriptionEntitlements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionEntitlements] with a well-typed
             * `List<SubscriptionEntitlement>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
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
            fun addSubscriptionEntitlement(subscriptionEntitlement: SubscriptionEntitlement) =
                apply {
                    subscriptionEntitlements =
                        (subscriptionEntitlements ?: JsonField.of(mutableListOf())).also {
                            checkKnown("subscriptionEntitlements", it).add(subscriptionEntitlement)
                        }
                }

            /** Subscription trial end date */
            fun trialEndDate(trialEndDate: OffsetDateTime) =
                trialEndDate(JsonField.of(trialEndDate))

            /**
             * Sets [Builder.trialEndDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialEndDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (addons ?: JsonMissing.of()).map { it.toImmutable() },
                    appliedCoupon,
                    awaitPaymentConfirmation,
                    billingInformation,
                    billingPeriod,
                    budget,
                    (charges ?: JsonMissing.of()).map { it.toImmutable() },
                    metadata,
                    minimumSpend,
                    (priceOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                    promotionCode,
                    scheduleStrategy,
                    (subscriptionEntitlements ?: JsonMissing.of()).map { it.toImmutable() },
                    trialEndDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            addons().ifPresent { it.forEach { it.validate() } }
            appliedCoupon().ifPresent { it.validate() }
            awaitPaymentConfirmation()
            billingInformation().ifPresent { it.validate() }
            billingPeriod().ifPresent { it.validate() }
            budget().ifPresent { it.validate() }
            charges().ifPresent { it.forEach { it.validate() } }
            metadata().ifPresent { it.validate() }
            minimumSpend().ifPresent { it.validate() }
            priceOverrides().ifPresent { it.forEach { it.validate() } }
            promotionCode()
            scheduleStrategy().ifPresent { it.validate() }
            subscriptionEntitlements().ifPresent { it.forEach { it.validate() } }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (addons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (appliedCoupon.asKnown().getOrNull()?.validity() ?: 0) +
                (if (awaitPaymentConfirmation.asKnown().isPresent) 1 else 0) +
                (billingInformation.asKnown().getOrNull()?.validity() ?: 0) +
                (billingPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                (budget.asKnown().getOrNull()?.validity() ?: 0) +
                (charges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (minimumSpend.asKnown().getOrNull()?.validity() ?: 0) +
                (priceOverrides.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (promotionCode.asKnown().isPresent) 1 else 0) +
                (scheduleStrategy.asKnown().getOrNull()?.validity() ?: 0) +
                (subscriptionEntitlements.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (trialEndDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                addons == other.addons &&
                appliedCoupon == other.appliedCoupon &&
                awaitPaymentConfirmation == other.awaitPaymentConfirmation &&
                billingInformation == other.billingInformation &&
                billingPeriod == other.billingPeriod &&
                budget == other.budget &&
                charges == other.charges &&
                metadata == other.metadata &&
                minimumSpend == other.minimumSpend &&
                priceOverrides == other.priceOverrides &&
                promotionCode == other.promotionCode &&
                scheduleStrategy == other.scheduleStrategy &&
                subscriptionEntitlements == other.subscriptionEntitlements &&
                trialEndDate == other.trialEndDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addons,
                appliedCoupon,
                awaitPaymentConfirmation,
                billingInformation,
                billingPeriod,
                budget,
                charges,
                metadata,
                minimumSpend,
                priceOverrides,
                promotionCode,
                scheduleStrategy,
                subscriptionEntitlements,
                trialEndDate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{addons=$addons, appliedCoupon=$appliedCoupon, awaitPaymentConfirmation=$awaitPaymentConfirmation, billingInformation=$billingInformation, billingPeriod=$billingPeriod, budget=$budget, charges=$charges, metadata=$metadata, minimumSpend=$minimumSpend, priceOverrides=$priceOverrides, promotionCode=$promotionCode, scheduleStrategy=$scheduleStrategy, subscriptionEntitlements=$subscriptionEntitlements, trialEndDate=$trialEndDate, additionalProperties=$additionalProperties}"
    }

    class Addon
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addonId: JsonField<String>,
        private val quantity: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("addonId") @ExcludeMissing addonId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Double> = JsonMissing.of(),
        ) : this(addonId, quantity, mutableMapOf())

        /**
         * Addon ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun addonId(): String = addonId.getRequired("addonId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Double = quantity.getRequired("quantity")

        /**
         * Returns the raw JSON value of [addonId].
         *
         * Unlike [addonId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addonId") @ExcludeMissing fun _addonId(): JsonField<String> = addonId

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

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
             * .addonId()
             * .quantity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Addon]. */
        class Builder internal constructor() {

            private var addonId: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addon: Addon) = apply {
                addonId = addon.addonId
                quantity = addon.quantity
                additionalProperties = addon.additionalProperties.toMutableMap()
            }

            /** Addon ID */
            fun addonId(addonId: String) = addonId(JsonField.of(addonId))

            /**
             * Sets [Builder.addonId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addonId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addonId(addonId: JsonField<String>) = apply { this.addonId = addonId }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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
             * .addonId()
             * .quantity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Addon =
                Addon(
                    checkRequired("addonId", addonId),
                    checkRequired("quantity", quantity),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Addon = apply {
            if (validated) {
                return@apply
            }

            addonId()
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
            (if (addonId.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Addon &&
                addonId == other.addonId &&
                quantity == other.quantity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(addonId, quantity, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Addon{addonId=$addonId, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    class AppliedCoupon
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingCouponId: JsonField<String>,
        private val configuration: JsonField<Configuration>,
        private val couponId: JsonField<String>,
        private val discount: JsonField<Discount>,
        private val promotionCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billingCouponId")
            @ExcludeMissing
            billingCouponId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("configuration")
            @ExcludeMissing
            configuration: JsonField<Configuration> = JsonMissing.of(),
            @JsonProperty("couponId")
            @ExcludeMissing
            couponId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount")
            @ExcludeMissing
            discount: JsonField<Discount> = JsonMissing.of(),
            @JsonProperty("promotionCode")
            @ExcludeMissing
            promotionCode: JsonField<String> = JsonMissing.of(),
        ) : this(billingCouponId, configuration, couponId, discount, promotionCode, mutableMapOf())

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingCouponId(): Optional<String> = billingCouponId.getOptional("billingCouponId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun configuration(): Optional<Configuration> = configuration.getOptional("configuration")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun couponId(): Optional<String> = couponId.getOptional("couponId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun discount(): Optional<Discount> = discount.getOptional("discount")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun promotionCode(): Optional<String> = promotionCode.getOptional("promotionCode")

        /**
         * Returns the raw JSON value of [billingCouponId].
         *
         * Unlike [billingCouponId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingCouponId")
        @ExcludeMissing
        fun _billingCouponId(): JsonField<String> = billingCouponId

        /**
         * Returns the raw JSON value of [configuration].
         *
         * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<Configuration> = configuration

        /**
         * Returns the raw JSON value of [couponId].
         *
         * Unlike [couponId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("couponId") @ExcludeMissing fun _couponId(): JsonField<String> = couponId

        /**
         * Returns the raw JSON value of [discount].
         *
         * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

        /**
         * Returns the raw JSON value of [promotionCode].
         *
         * Unlike [promotionCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("promotionCode")
        @ExcludeMissing
        fun _promotionCode(): JsonField<String> = promotionCode

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

            /** Returns a mutable builder for constructing an instance of [AppliedCoupon]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AppliedCoupon]. */
        class Builder internal constructor() {

            private var billingCouponId: JsonField<String> = JsonMissing.of()
            private var configuration: JsonField<Configuration> = JsonMissing.of()
            private var couponId: JsonField<String> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var promotionCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(appliedCoupon: AppliedCoupon) = apply {
                billingCouponId = appliedCoupon.billingCouponId
                configuration = appliedCoupon.configuration
                couponId = appliedCoupon.couponId
                discount = appliedCoupon.discount
                promotionCode = appliedCoupon.promotionCode
                additionalProperties = appliedCoupon.additionalProperties.toMutableMap()
            }

            fun billingCouponId(billingCouponId: String) =
                billingCouponId(JsonField.of(billingCouponId))

            /**
             * Sets [Builder.billingCouponId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingCouponId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingCouponId(billingCouponId: JsonField<String>) = apply {
                this.billingCouponId = billingCouponId
            }

            fun configuration(configuration: Configuration) =
                configuration(JsonField.of(configuration))

            /**
             * Sets [Builder.configuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configuration] with a well-typed [Configuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun configuration(configuration: JsonField<Configuration>) = apply {
                this.configuration = configuration
            }

            fun couponId(couponId: String) = couponId(JsonField.of(couponId))

            /**
             * Sets [Builder.couponId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.couponId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun couponId(couponId: JsonField<String>) = apply { this.couponId = couponId }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Discount] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun promotionCode(promotionCode: String?) =
                promotionCode(JsonField.ofNullable(promotionCode))

            /** Alias for calling [Builder.promotionCode] with `promotionCode.orElse(null)`. */
            fun promotionCode(promotionCode: Optional<String>) =
                promotionCode(promotionCode.getOrNull())

            /**
             * Sets [Builder.promotionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promotionCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promotionCode(promotionCode: JsonField<String>) = apply {
                this.promotionCode = promotionCode
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
             * Returns an immutable instance of [AppliedCoupon].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AppliedCoupon =
                AppliedCoupon(
                    billingCouponId,
                    configuration,
                    couponId,
                    discount,
                    promotionCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AppliedCoupon = apply {
            if (validated) {
                return@apply
            }

            billingCouponId()
            configuration().ifPresent { it.validate() }
            couponId()
            discount().ifPresent { it.validate() }
            promotionCode()
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
            (if (billingCouponId.asKnown().isPresent) 1 else 0) +
                (configuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (couponId.asKnown().isPresent) 1 else 0) +
                (discount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (promotionCode.asKnown().isPresent) 1 else 0)

        class Configuration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val startDate: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("startDate")
                @ExcludeMissing
                startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            ) : this(startDate, mutableMapOf())

            /**
             * Coupon start date
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun startDate(): Optional<OffsetDateTime> = startDate.getOptional("startDate")

            /**
             * Returns the raw JSON value of [startDate].
             *
             * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("startDate")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

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

                /** Returns a mutable builder for constructing an instance of [Configuration]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Configuration]. */
            class Builder internal constructor() {

                private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(configuration: Configuration) = apply {
                    startDate = configuration.startDate
                    additionalProperties = configuration.additionalProperties.toMutableMap()
                }

                /** Coupon start date */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /**
                 * Sets [Builder.startDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
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
                 * Returns an immutable instance of [Configuration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Configuration =
                    Configuration(startDate, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Configuration = apply {
                if (validated) {
                    return@apply
                }

                startDate()
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
            internal fun validity(): Int = (if (startDate.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Configuration &&
                    startDate == other.startDate &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(startDate, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Configuration{startDate=$startDate, additionalProperties=$additionalProperties}"
        }

        class Discount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amountsOff: JsonField<List<AmountsOff>>,
            private val description: JsonField<String>,
            private val durationInMonths: JsonField<Double>,
            private val name: JsonField<String>,
            private val percentOff: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amountsOff")
                @ExcludeMissing
                amountsOff: JsonField<List<AmountsOff>> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("durationInMonths")
                @ExcludeMissing
                durationInMonths: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("percentOff")
                @ExcludeMissing
                percentOff: JsonField<Double> = JsonMissing.of(),
            ) : this(amountsOff, description, durationInMonths, name, percentOff, mutableMapOf())

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amountsOff(): Optional<List<AmountsOff>> = amountsOff.getOptional("amountsOff")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun durationInMonths(): Optional<Double> =
                durationInMonths.getOptional("durationInMonths")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun percentOff(): Optional<Double> = percentOff.getOptional("percentOff")

            /**
             * Returns the raw JSON value of [amountsOff].
             *
             * Unlike [amountsOff], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("amountsOff")
            @ExcludeMissing
            fun _amountsOff(): JsonField<List<AmountsOff>> = amountsOff

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [durationInMonths].
             *
             * Unlike [durationInMonths], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("durationInMonths")
            @ExcludeMissing
            fun _durationInMonths(): JsonField<Double> = durationInMonths

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [percentOff].
             *
             * Unlike [percentOff], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /** Returns a mutable builder for constructing an instance of [Discount]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Discount]. */
            class Builder internal constructor() {

                private var amountsOff: JsonField<MutableList<AmountsOff>>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var durationInMonths: JsonField<Double> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var percentOff: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(discount: Discount) = apply {
                    amountsOff = discount.amountsOff.map { it.toMutableList() }
                    description = discount.description
                    durationInMonths = discount.durationInMonths
                    name = discount.name
                    percentOff = discount.percentOff
                    additionalProperties = discount.additionalProperties.toMutableMap()
                }

                fun amountsOff(amountsOff: List<AmountsOff>?) =
                    amountsOff(JsonField.ofNullable(amountsOff))

                /** Alias for calling [Builder.amountsOff] with `amountsOff.orElse(null)`. */
                fun amountsOff(amountsOff: Optional<List<AmountsOff>>) =
                    amountsOff(amountsOff.getOrNull())

                /**
                 * Sets [Builder.amountsOff] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountsOff] with a well-typed `List<AmountsOff>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun durationInMonths(durationInMonths: Double) =
                    durationInMonths(JsonField.of(durationInMonths))

                /**
                 * Sets [Builder.durationInMonths] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.durationInMonths] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun durationInMonths(durationInMonths: JsonField<Double>) = apply {
                    this.durationInMonths = durationInMonths
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun percentOff(percentOff: Double) = percentOff(JsonField.of(percentOff))

                /**
                 * Sets [Builder.percentOff] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.percentOff] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun percentOff(percentOff: JsonField<Double>) = apply {
                    this.percentOff = percentOff
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
                 * Returns an immutable instance of [Discount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Discount =
                    Discount(
                        (amountsOff ?: JsonMissing.of()).map { it.toImmutable() },
                        description,
                        durationInMonths,
                        name,
                        percentOff,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Discount = apply {
                if (validated) {
                    return@apply
                }

                amountsOff().ifPresent { it.forEach { it.validate() } }
                description()
                durationInMonths()
                name()
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
                (amountsOff.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (durationInMonths.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (percentOff.asKnown().isPresent) 1 else 0)

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
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun currency(): Optional<Currency> = currency.getOptional("currency")

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
                     * Returns a mutable builder for constructing an instance of [AmountsOff].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AmountsOff]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(amountsOff: AmountsOff) = apply {
                        amount = amountsOff.amount
                        currency = amountsOff.currency
                        additionalProperties = amountsOff.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

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
                     * Returns an immutable instance of [AmountsOff].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AmountsOff =
                        AmountsOff(
                            checkRequired("amount", amount),
                            currency,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

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

                return other is Discount &&
                    amountsOff == other.amountsOff &&
                    description == other.description &&
                    durationInMonths == other.durationInMonths &&
                    name == other.name &&
                    percentOff == other.percentOff &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amountsOff,
                    description,
                    durationInMonths,
                    name,
                    percentOff,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Discount{amountsOff=$amountsOff, description=$description, durationInMonths=$durationInMonths, name=$name, percentOff=$percentOff, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AppliedCoupon &&
                billingCouponId == other.billingCouponId &&
                configuration == other.configuration &&
                couponId == other.couponId &&
                discount == other.discount &&
                promotionCode == other.promotionCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingCouponId,
                configuration,
                couponId,
                discount,
                promotionCode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AppliedCoupon{billingCouponId=$billingCouponId, configuration=$configuration, couponId=$couponId, discount=$discount, promotionCode=$promotionCode, additionalProperties=$additionalProperties}"
    }

    class BillingInformation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingAddress: JsonField<BillingAddress>,
        private val chargeOnBehalfOfAccount: JsonField<String>,
        private val couponId: JsonField<String>,
        private val integrationId: JsonField<String>,
        private val invoiceDaysUntilDue: JsonField<Double>,
        private val isBackdated: JsonField<Boolean>,
        private val isInvoicePaid: JsonField<Boolean>,
        private val metadata: JsonField<Metadata>,
        private val prorationBehavior: JsonField<ProrationBehavior>,
        private val taxIds: JsonField<List<TaxId>>,
        private val taxPercentage: JsonField<Double>,
        private val taxRateIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billingAddress")
            @ExcludeMissing
            billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
            @JsonProperty("chargeOnBehalfOfAccount")
            @ExcludeMissing
            chargeOnBehalfOfAccount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("couponId")
            @ExcludeMissing
            couponId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integrationId")
            @ExcludeMissing
            integrationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoiceDaysUntilDue")
            @ExcludeMissing
            invoiceDaysUntilDue: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("isBackdated")
            @ExcludeMissing
            isBackdated: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isInvoicePaid")
            @ExcludeMissing
            isInvoicePaid: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("prorationBehavior")
            @ExcludeMissing
            prorationBehavior: JsonField<ProrationBehavior> = JsonMissing.of(),
            @JsonProperty("taxIds")
            @ExcludeMissing
            taxIds: JsonField<List<TaxId>> = JsonMissing.of(),
            @JsonProperty("taxPercentage")
            @ExcludeMissing
            taxPercentage: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("taxRateIds")
            @ExcludeMissing
            taxRateIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            billingAddress,
            chargeOnBehalfOfAccount,
            couponId,
            integrationId,
            invoiceDaysUntilDue,
            isBackdated,
            isInvoicePaid,
            metadata,
            prorationBehavior,
            taxIds,
            taxPercentage,
            taxRateIds,
            mutableMapOf(),
        )

        /**
         * Physical address
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingAddress(): Optional<BillingAddress> =
            billingAddress.getOptional("billingAddress")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chargeOnBehalfOfAccount(): Optional<String> =
            chargeOnBehalfOfAccount.getOptional("chargeOnBehalfOfAccount")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun couponId(): Optional<String> = couponId.getOptional("couponId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun integrationId(): Optional<String> = integrationId.getOptional("integrationId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoiceDaysUntilDue(): Optional<Double> =
            invoiceDaysUntilDue.getOptional("invoiceDaysUntilDue")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isBackdated(): Optional<Boolean> = isBackdated.getOptional("isBackdated")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isInvoicePaid(): Optional<Boolean> = isInvoicePaid.getOptional("isInvoicePaid")

        /**
         * Additional metadata for the subscription
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prorationBehavior(): Optional<ProrationBehavior> =
            prorationBehavior.getOptional("prorationBehavior")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun taxIds(): Optional<List<TaxId>> = taxIds.getOptional("taxIds")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun taxPercentage(): Optional<Double> = taxPercentage.getOptional("taxPercentage")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun taxRateIds(): Optional<List<String>> = taxRateIds.getOptional("taxRateIds")

        /**
         * Returns the raw JSON value of [billingAddress].
         *
         * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingAddress")
        @ExcludeMissing
        fun _billingAddress(): JsonField<BillingAddress> = billingAddress

        /**
         * Returns the raw JSON value of [chargeOnBehalfOfAccount].
         *
         * Unlike [chargeOnBehalfOfAccount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("chargeOnBehalfOfAccount")
        @ExcludeMissing
        fun _chargeOnBehalfOfAccount(): JsonField<String> = chargeOnBehalfOfAccount

        /**
         * Returns the raw JSON value of [couponId].
         *
         * Unlike [couponId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("couponId") @ExcludeMissing fun _couponId(): JsonField<String> = couponId

        /**
         * Returns the raw JSON value of [integrationId].
         *
         * Unlike [integrationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integrationId")
        @ExcludeMissing
        fun _integrationId(): JsonField<String> = integrationId

        /**
         * Returns the raw JSON value of [invoiceDaysUntilDue].
         *
         * Unlike [invoiceDaysUntilDue], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("invoiceDaysUntilDue")
        @ExcludeMissing
        fun _invoiceDaysUntilDue(): JsonField<Double> = invoiceDaysUntilDue

        /**
         * Returns the raw JSON value of [isBackdated].
         *
         * Unlike [isBackdated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isBackdated")
        @ExcludeMissing
        fun _isBackdated(): JsonField<Boolean> = isBackdated

        /**
         * Returns the raw JSON value of [isInvoicePaid].
         *
         * Unlike [isInvoicePaid], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("isInvoicePaid")
        @ExcludeMissing
        fun _isInvoicePaid(): JsonField<Boolean> = isInvoicePaid

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [prorationBehavior].
         *
         * Unlike [prorationBehavior], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prorationBehavior")
        @ExcludeMissing
        fun _prorationBehavior(): JsonField<ProrationBehavior> = prorationBehavior

        /**
         * Returns the raw JSON value of [taxIds].
         *
         * Unlike [taxIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taxIds") @ExcludeMissing fun _taxIds(): JsonField<List<TaxId>> = taxIds

        /**
         * Returns the raw JSON value of [taxPercentage].
         *
         * Unlike [taxPercentage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("taxPercentage")
        @ExcludeMissing
        fun _taxPercentage(): JsonField<Double> = taxPercentage

        /**
         * Returns the raw JSON value of [taxRateIds].
         *
         * Unlike [taxRateIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taxRateIds")
        @ExcludeMissing
        fun _taxRateIds(): JsonField<List<String>> = taxRateIds

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

            /** Returns a mutable builder for constructing an instance of [BillingInformation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillingInformation]. */
        class Builder internal constructor() {

            private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
            private var chargeOnBehalfOfAccount: JsonField<String> = JsonMissing.of()
            private var couponId: JsonField<String> = JsonMissing.of()
            private var integrationId: JsonField<String> = JsonMissing.of()
            private var invoiceDaysUntilDue: JsonField<Double> = JsonMissing.of()
            private var isBackdated: JsonField<Boolean> = JsonMissing.of()
            private var isInvoicePaid: JsonField<Boolean> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var prorationBehavior: JsonField<ProrationBehavior> = JsonMissing.of()
            private var taxIds: JsonField<MutableList<TaxId>>? = null
            private var taxPercentage: JsonField<Double> = JsonMissing.of()
            private var taxRateIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingInformation: BillingInformation) = apply {
                billingAddress = billingInformation.billingAddress
                chargeOnBehalfOfAccount = billingInformation.chargeOnBehalfOfAccount
                couponId = billingInformation.couponId
                integrationId = billingInformation.integrationId
                invoiceDaysUntilDue = billingInformation.invoiceDaysUntilDue
                isBackdated = billingInformation.isBackdated
                isInvoicePaid = billingInformation.isInvoicePaid
                metadata = billingInformation.metadata
                prorationBehavior = billingInformation.prorationBehavior
                taxIds = billingInformation.taxIds.map { it.toMutableList() }
                taxPercentage = billingInformation.taxPercentage
                taxRateIds = billingInformation.taxRateIds.map { it.toMutableList() }
                additionalProperties = billingInformation.additionalProperties.toMutableMap()
            }

            /** Physical address */
            fun billingAddress(billingAddress: BillingAddress) =
                billingAddress(JsonField.of(billingAddress))

            /**
             * Sets [Builder.billingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
                this.billingAddress = billingAddress
            }

            fun chargeOnBehalfOfAccount(chargeOnBehalfOfAccount: String) =
                chargeOnBehalfOfAccount(JsonField.of(chargeOnBehalfOfAccount))

            /**
             * Sets [Builder.chargeOnBehalfOfAccount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chargeOnBehalfOfAccount] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun chargeOnBehalfOfAccount(chargeOnBehalfOfAccount: JsonField<String>) = apply {
                this.chargeOnBehalfOfAccount = chargeOnBehalfOfAccount
            }

            fun couponId(couponId: String) = couponId(JsonField.of(couponId))

            /**
             * Sets [Builder.couponId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.couponId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun couponId(couponId: JsonField<String>) = apply { this.couponId = couponId }

            fun integrationId(integrationId: String) = integrationId(JsonField.of(integrationId))

            /**
             * Sets [Builder.integrationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun integrationId(integrationId: JsonField<String>) = apply {
                this.integrationId = integrationId
            }

            fun invoiceDaysUntilDue(invoiceDaysUntilDue: Double) =
                invoiceDaysUntilDue(JsonField.of(invoiceDaysUntilDue))

            /**
             * Sets [Builder.invoiceDaysUntilDue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceDaysUntilDue] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceDaysUntilDue(invoiceDaysUntilDue: JsonField<Double>) = apply {
                this.invoiceDaysUntilDue = invoiceDaysUntilDue
            }

            fun isBackdated(isBackdated: Boolean) = isBackdated(JsonField.of(isBackdated))

            /**
             * Sets [Builder.isBackdated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isBackdated] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isBackdated(isBackdated: JsonField<Boolean>) = apply {
                this.isBackdated = isBackdated
            }

            fun isInvoicePaid(isInvoicePaid: Boolean) = isInvoicePaid(JsonField.of(isInvoicePaid))

            /**
             * Sets [Builder.isInvoicePaid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isInvoicePaid] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isInvoicePaid(isInvoicePaid: JsonField<Boolean>) = apply {
                this.isInvoicePaid = isInvoicePaid
            }

            /** Additional metadata for the subscription */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun prorationBehavior(prorationBehavior: ProrationBehavior) =
                prorationBehavior(JsonField.of(prorationBehavior))

            /**
             * Sets [Builder.prorationBehavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prorationBehavior] with a well-typed
             * [ProrationBehavior] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun prorationBehavior(prorationBehavior: JsonField<ProrationBehavior>) = apply {
                this.prorationBehavior = prorationBehavior
            }

            fun taxIds(taxIds: List<TaxId>) = taxIds(JsonField.of(taxIds))

            /**
             * Sets [Builder.taxIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxIds] with a well-typed `List<TaxId>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun taxPercentage(taxPercentage: Double) = taxPercentage(JsonField.of(taxPercentage))

            /**
             * Sets [Builder.taxPercentage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxPercentage] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxPercentage(taxPercentage: JsonField<Double>) = apply {
                this.taxPercentage = taxPercentage
            }

            fun taxRateIds(taxRateIds: List<String>) = taxRateIds(JsonField.of(taxRateIds))

            /**
             * Sets [Builder.taxRateIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxRateIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxRateIds(taxRateIds: JsonField<List<String>>) = apply {
                this.taxRateIds = taxRateIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [taxRateIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTaxRateId(taxRateId: String) = apply {
                taxRateIds =
                    (taxRateIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("taxRateIds", it).add(taxRateId)
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
             * Returns an immutable instance of [BillingInformation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BillingInformation =
                BillingInformation(
                    billingAddress,
                    chargeOnBehalfOfAccount,
                    couponId,
                    integrationId,
                    invoiceDaysUntilDue,
                    isBackdated,
                    isInvoicePaid,
                    metadata,
                    prorationBehavior,
                    (taxIds ?: JsonMissing.of()).map { it.toImmutable() },
                    taxPercentage,
                    (taxRateIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BillingInformation = apply {
            if (validated) {
                return@apply
            }

            billingAddress().ifPresent { it.validate() }
            chargeOnBehalfOfAccount()
            couponId()
            integrationId()
            invoiceDaysUntilDue()
            isBackdated()
            isInvoicePaid()
            metadata().ifPresent { it.validate() }
            prorationBehavior().ifPresent { it.validate() }
            taxIds().ifPresent { it.forEach { it.validate() } }
            taxPercentage()
            taxRateIds()
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
                (if (chargeOnBehalfOfAccount.asKnown().isPresent) 1 else 0) +
                (if (couponId.asKnown().isPresent) 1 else 0) +
                (if (integrationId.asKnown().isPresent) 1 else 0) +
                (if (invoiceDaysUntilDue.asKnown().isPresent) 1 else 0) +
                (if (isBackdated.asKnown().isPresent) 1 else 0) +
                (if (isInvoicePaid.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (prorationBehavior.asKnown().getOrNull()?.validity() ?: 0) +
                (taxIds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (taxPercentage.asKnown().isPresent) 1 else 0) +
                (taxRateIds.asKnown().getOrNull()?.size ?: 0)

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
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postalCode")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            ) : this(city, country, line1, line2, postalCode, state, mutableMapOf())

            /**
             * City name
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun city(): Optional<String> = city.getOptional("city")

            /**
             * Country code or name
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun country(): Optional<String> = country.getOptional("country")

            /**
             * Street address line 1
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun line1(): Optional<String> = line1.getOptional("line1")

            /**
             * Street address line 2
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

            /**
             * Postal or ZIP code
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun postalCode(): Optional<String> = postalCode.getOptional("postalCode")

            /**
             * State or province
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun state(): Optional<String> = state.getOptional("state")

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [line1].
             *
             * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /**
             * Returns the raw JSON value of [line2].
             *
             * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /**
             * Returns the raw JSON value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postalCode")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
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

                /** Returns a mutable builder for constructing an instance of [BillingAddress]. */
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
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(billingAddress: BillingAddress) = apply {
                    city = billingAddress.city
                    country = billingAddress.country
                    line1 = billingAddress.line1
                    line2 = billingAddress.line2
                    postalCode = billingAddress.postalCode
                    state = billingAddress.state
                    additionalProperties = billingAddress.additionalProperties.toMutableMap()
                }

                /** City name */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** Country code or name */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** Street address line 1 */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** Street address line 2 */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** Postal or ZIP code */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** State or province */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

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
                Objects.hash(city, country, line1, line2, postalCode, state, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingAddress{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        /** Additional metadata for the subscription */
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

        class ProrationBehavior
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

                @JvmField val INVOICE_IMMEDIATELY = of("INVOICE_IMMEDIATELY")

                @JvmField val CREATE_PRORATIONS = of("CREATE_PRORATIONS")

                @JvmField val NONE = of("NONE")

                @JvmStatic fun of(value: String) = ProrationBehavior(JsonField.of(value))
            }

            /** An enum containing [ProrationBehavior]'s known values. */
            enum class Known {
                INVOICE_IMMEDIATELY,
                CREATE_PRORATIONS,
                NONE,
            }

            /**
             * An enum containing [ProrationBehavior]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ProrationBehavior] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INVOICE_IMMEDIATELY,
                CREATE_PRORATIONS,
                NONE,
                /**
                 * An enum member indicating that [ProrationBehavior] was instantiated with an
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
                    INVOICE_IMMEDIATELY -> Value.INVOICE_IMMEDIATELY
                    CREATE_PRORATIONS -> Value.CREATE_PRORATIONS
                    NONE -> Value.NONE
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
                    INVOICE_IMMEDIATELY -> Known.INVOICE_IMMEDIATELY
                    CREATE_PRORATIONS -> Known.CREATE_PRORATIONS
                    NONE -> Known.NONE
                    else -> throw StiggInvalidDataException("Unknown ProrationBehavior: $value")
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

            fun validate(): ProrationBehavior = apply {
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

                return other is ProrationBehavior && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class TaxId
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(type, value, mutableMapOf())

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): String = type.getRequired("type")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
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
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(taxId: TaxId) = apply {
                    type = taxId.type
                    value = taxId.value
                    additionalProperties = taxId.additionalProperties.toMutableMap()
                }

                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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
                (if (type.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TaxId &&
                    type == other.type &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TaxId{type=$type, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingInformation &&
                billingAddress == other.billingAddress &&
                chargeOnBehalfOfAccount == other.chargeOnBehalfOfAccount &&
                couponId == other.couponId &&
                integrationId == other.integrationId &&
                invoiceDaysUntilDue == other.invoiceDaysUntilDue &&
                isBackdated == other.isBackdated &&
                isInvoicePaid == other.isInvoicePaid &&
                metadata == other.metadata &&
                prorationBehavior == other.prorationBehavior &&
                taxIds == other.taxIds &&
                taxPercentage == other.taxPercentage &&
                taxRateIds == other.taxRateIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingAddress,
                chargeOnBehalfOfAccount,
                couponId,
                integrationId,
                invoiceDaysUntilDue,
                isBackdated,
                isInvoicePaid,
                metadata,
                prorationBehavior,
                taxIds,
                taxPercentage,
                taxRateIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingInformation{billingAddress=$billingAddress, chargeOnBehalfOfAccount=$chargeOnBehalfOfAccount, couponId=$couponId, integrationId=$integrationId, invoiceDaysUntilDue=$invoiceDaysUntilDue, isBackdated=$isBackdated, isInvoicePaid=$isInvoicePaid, metadata=$metadata, prorationBehavior=$prorationBehavior, taxIds=$taxIds, taxPercentage=$taxPercentage, taxRateIds=$taxRateIds, additionalProperties=$additionalProperties}"
    }

    class BillingPeriod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val MONTHLY = of("MONTHLY")

            @JvmField val ANNUALLY = of("ANNUALLY")

            @JvmStatic fun of(value: String) = BillingPeriod(JsonField.of(value))
        }

        /** An enum containing [BillingPeriod]'s known values. */
        enum class Known {
            MONTHLY,
            ANNUALLY,
        }

        /**
         * An enum containing [BillingPeriod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BillingPeriod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MONTHLY,
            ANNUALLY,
            /**
             * An enum member indicating that [BillingPeriod] was instantiated with an unknown
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
                MONTHLY -> Value.MONTHLY
                ANNUALLY -> Value.ANNUALLY
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
                MONTHLY -> Known.MONTHLY
                ANNUALLY -> Known.ANNUALLY
                else -> throw StiggInvalidDataException("Unknown BillingPeriod: $value")
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

        fun validate(): BillingPeriod = apply {
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

            return other is BillingPeriod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hasSoftLimit(): Boolean = hasSoftLimit.getRequired("hasSoftLimit")

        /**
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

    class Charge
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val quantity: JsonField<Double>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(id, quantity, type, mutableMapOf())

        /**
         * Charge ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Double = quantity.getRequired("quantity")

        /**
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
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

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
             * Returns a mutable builder for constructing an instance of [Charge].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .quantity()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Charge]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(charge: Charge) = apply {
                id = charge.id
                quantity = charge.quantity
                type = charge.type
                additionalProperties = charge.additionalProperties.toMutableMap()
            }

            /** Charge ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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
             * Returns an immutable instance of [Charge].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .quantity()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Charge =
                Charge(
                    checkRequired("id", id),
                    checkRequired("quantity", quantity),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Charge = apply {
            if (validated) {
                return@apply
            }

            id()
            quantity()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

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

            return other is Charge &&
                id == other.id &&
                quantity == other.quantity &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, quantity, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Charge{id=$id, quantity=$quantity, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Additional metadata for the subscription */
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

    class MinimumSpend
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val minimum: JsonField<Minimum>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("minimum") @ExcludeMissing minimum: JsonField<Minimum> = JsonMissing.of()
        ) : this(minimum, mutableMapOf())

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimum(): Optional<Minimum> = minimum.getOptional("minimum")

        /**
         * Returns the raw JSON value of [minimum].
         *
         * Unlike [minimum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<Minimum> = minimum

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

            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimumSpend: MinimumSpend) = apply {
                minimum = minimumSpend.minimum
                additionalProperties = minimumSpend.additionalProperties.toMutableMap()
            }

            fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

            /** Alias for calling [Builder.minimum] with `minimum.orElse(null)`. */
            fun minimum(minimum: Optional<Minimum>) = minimum(minimum.getOrNull())

            /**
             * Sets [Builder.minimum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimum] with a well-typed [Minimum] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

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
            fun build(): MinimumSpend = MinimumSpend(minimum, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): MinimumSpend = apply {
            if (validated) {
                return@apply
            }

            minimum().ifPresent { it.validate() }
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
        internal fun validity(): Int = (minimum.asKnown().getOrNull()?.validity() ?: 0)

        class Minimum
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
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
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

                /**
                 * Returns a mutable builder for constructing an instance of [Minimum].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Minimum]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(minimum: Minimum) = apply {
                    amount = minimum.amount
                    currency = minimum.currency
                    additionalProperties = minimum.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

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
                 * Returns an immutable instance of [Minimum].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Minimum =
                    Minimum(
                        checkRequired("amount", amount),
                        currency,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Minimum = apply {
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

                return other is Minimum &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Minimum{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MinimumSpend &&
                minimum == other.minimum &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(minimum, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MinimumSpend{minimum=$minimum, additionalProperties=$additionalProperties}"
    }

    class PriceOverride
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val featureId: JsonField<String>,
        private val price: JsonField<Price>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("featureId")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
        ) : this(featureId, price, mutableMapOf())

        /**
         * Feature ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun featureId(): String = featureId.getRequired("featureId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun price(): Optional<Price> = price.getOptional("price")

        /**
         * Returns the raw JSON value of [featureId].
         *
         * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

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
             * Returns a mutable builder for constructing an instance of [PriceOverride].
             *
             * The following fields are required:
             * ```java
             * .featureId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PriceOverride]. */
        class Builder internal constructor() {

            private var featureId: JsonField<String>? = null
            private var price: JsonField<Price> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(priceOverride: PriceOverride) = apply {
                featureId = priceOverride.featureId
                price = priceOverride.price
                additionalProperties = priceOverride.additionalProperties.toMutableMap()
            }

            /** Feature ID */
            fun featureId(featureId: String) = featureId(JsonField.of(featureId))

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

            fun price(price: Price) = price(JsonField.of(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

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
             * Returns an immutable instance of [PriceOverride].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .featureId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PriceOverride =
                PriceOverride(
                    checkRequired("featureId", featureId),
                    price,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PriceOverride = apply {
            if (validated) {
                return@apply
            }

            featureId()
            price().ifPresent { it.validate() }
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
            (if (featureId.asKnown().isPresent) 1 else 0) +
                (price.asKnown().getOrNull()?.validity() ?: 0)

        class Price
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
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
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

                /**
                 * Returns a mutable builder for constructing an instance of [Price].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Price]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(price: Price) = apply {
                    amount = price.amount
                    currency = price.currency
                    additionalProperties = price.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

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
                 * Returns an immutable instance of [Price].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Price =
                    Price(
                        checkRequired("amount", amount),
                        currency,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Price = apply {
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

                return other is Price &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Price{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PriceOverride &&
                featureId == other.featureId &&
                price == other.price &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(featureId, price, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PriceOverride{featureId=$featureId, price=$price, additionalProperties=$additionalProperties}"
    }

    class ScheduleStrategy @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val END_OF_BILLING_PERIOD = of("END_OF_BILLING_PERIOD")

            @JvmField val END_OF_BILLING_MONTH = of("END_OF_BILLING_MONTH")

            @JvmField val IMMEDIATE = of("IMMEDIATE")

            @JvmStatic fun of(value: String) = ScheduleStrategy(JsonField.of(value))
        }

        /** An enum containing [ScheduleStrategy]'s known values. */
        enum class Known {
            END_OF_BILLING_PERIOD,
            END_OF_BILLING_MONTH,
            IMMEDIATE,
        }

        /**
         * An enum containing [ScheduleStrategy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ScheduleStrategy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            END_OF_BILLING_PERIOD,
            END_OF_BILLING_MONTH,
            IMMEDIATE,
            /**
             * An enum member indicating that [ScheduleStrategy] was instantiated with an unknown
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
                END_OF_BILLING_PERIOD -> Value.END_OF_BILLING_PERIOD
                END_OF_BILLING_MONTH -> Value.END_OF_BILLING_MONTH
                IMMEDIATE -> Value.IMMEDIATE
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
                END_OF_BILLING_PERIOD -> Known.END_OF_BILLING_PERIOD
                END_OF_BILLING_MONTH -> Known.END_OF_BILLING_MONTH
                IMMEDIATE -> Known.IMMEDIATE
                else -> throw StiggInvalidDataException("Unknown ScheduleStrategy: $value")
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

        fun validate(): ScheduleStrategy = apply {
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

            return other is ScheduleStrategy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class SubscriptionEntitlement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val featureId: JsonField<String>,
        private val hasSoftLimit: JsonField<Boolean>,
        private val hasUnlimitedUsage: JsonField<Boolean>,
        private val monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration>,
        private val resetPeriod: JsonField<ResetPeriod>,
        private val usageLimit: JsonField<Double>,
        private val weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration>,
        private val yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("featureId")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hasSoftLimit")
            @ExcludeMissing
            hasSoftLimit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hasUnlimitedUsage")
            @ExcludeMissing
            hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("monthlyResetPeriodConfiguration")
            @ExcludeMissing
            monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration> =
                JsonMissing.of(),
            @JsonProperty("resetPeriod")
            @ExcludeMissing
            resetPeriod: JsonField<ResetPeriod> = JsonMissing.of(),
            @JsonProperty("usageLimit")
            @ExcludeMissing
            usageLimit: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("weeklyResetPeriodConfiguration")
            @ExcludeMissing
            weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration> =
                JsonMissing.of(),
            @JsonProperty("yearlyResetPeriodConfiguration")
            @ExcludeMissing
            yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration> =
                JsonMissing.of(),
        ) : this(
            id,
            featureId,
            hasSoftLimit,
            hasUnlimitedUsage,
            monthlyResetPeriodConfiguration,
            resetPeriod,
            usageLimit,
            weeklyResetPeriodConfiguration,
            yearlyResetPeriodConfiguration,
            mutableMapOf(),
        )

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureId(): Optional<String> = featureId.getOptional("featureId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasSoftLimit(): Optional<Boolean> = hasSoftLimit.getOptional("hasSoftLimit")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasUnlimitedUsage(): Optional<Boolean> =
            hasUnlimitedUsage.getOptional("hasUnlimitedUsage")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthlyResetPeriodConfiguration(): Optional<MonthlyResetPeriodConfiguration> =
            monthlyResetPeriodConfiguration.getOptional("monthlyResetPeriodConfiguration")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resetPeriod(): Optional<ResetPeriod> = resetPeriod.getOptional("resetPeriod")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageLimit(): Optional<Double> = usageLimit.getOptional("usageLimit")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun weeklyResetPeriodConfiguration(): Optional<WeeklyResetPeriodConfiguration> =
            weeklyResetPeriodConfiguration.getOptional("weeklyResetPeriodConfiguration")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun yearlyResetPeriodConfiguration(): Optional<YearlyResetPeriodConfiguration> =
            yearlyResetPeriodConfiguration.getOptional("yearlyResetPeriodConfiguration")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [featureId].
         *
         * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

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
         * Returns the raw JSON value of [hasUnlimitedUsage].
         *
         * Unlike [hasUnlimitedUsage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hasUnlimitedUsage")
        @ExcludeMissing
        fun _hasUnlimitedUsage(): JsonField<Boolean> = hasUnlimitedUsage

        /**
         * Returns the raw JSON value of [monthlyResetPeriodConfiguration].
         *
         * Unlike [monthlyResetPeriodConfiguration], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("monthlyResetPeriodConfiguration")
        @ExcludeMissing
        fun _monthlyResetPeriodConfiguration(): JsonField<MonthlyResetPeriodConfiguration> =
            monthlyResetPeriodConfiguration

        /**
         * Returns the raw JSON value of [resetPeriod].
         *
         * Unlike [resetPeriod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resetPeriod")
        @ExcludeMissing
        fun _resetPeriod(): JsonField<ResetPeriod> = resetPeriod

        /**
         * Returns the raw JSON value of [usageLimit].
         *
         * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usageLimit")
        @ExcludeMissing
        fun _usageLimit(): JsonField<Double> = usageLimit

        /**
         * Returns the raw JSON value of [weeklyResetPeriodConfiguration].
         *
         * Unlike [weeklyResetPeriodConfiguration], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("weeklyResetPeriodConfiguration")
        @ExcludeMissing
        fun _weeklyResetPeriodConfiguration(): JsonField<WeeklyResetPeriodConfiguration> =
            weeklyResetPeriodConfiguration

        /**
         * Returns the raw JSON value of [yearlyResetPeriodConfiguration].
         *
         * Unlike [yearlyResetPeriodConfiguration], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("yearlyResetPeriodConfiguration")
        @ExcludeMissing
        fun _yearlyResetPeriodConfiguration(): JsonField<YearlyResetPeriodConfiguration> =
            yearlyResetPeriodConfiguration

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
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SubscriptionEntitlement]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var featureId: JsonField<String> = JsonMissing.of()
            private var hasSoftLimit: JsonField<Boolean> = JsonMissing.of()
            private var hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of()
            private var monthlyResetPeriodConfiguration:
                JsonField<MonthlyResetPeriodConfiguration> =
                JsonMissing.of()
            private var resetPeriod: JsonField<ResetPeriod> = JsonMissing.of()
            private var usageLimit: JsonField<Double> = JsonMissing.of()
            private var weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration> =
                JsonMissing.of()
            private var yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscriptionEntitlement: SubscriptionEntitlement) = apply {
                id = subscriptionEntitlement.id
                featureId = subscriptionEntitlement.featureId
                hasSoftLimit = subscriptionEntitlement.hasSoftLimit
                hasUnlimitedUsage = subscriptionEntitlement.hasUnlimitedUsage
                monthlyResetPeriodConfiguration =
                    subscriptionEntitlement.monthlyResetPeriodConfiguration
                resetPeriod = subscriptionEntitlement.resetPeriod
                usageLimit = subscriptionEntitlement.usageLimit
                weeklyResetPeriodConfiguration =
                    subscriptionEntitlement.weeklyResetPeriodConfiguration
                yearlyResetPeriodConfiguration =
                    subscriptionEntitlement.yearlyResetPeriodConfiguration
                additionalProperties = subscriptionEntitlement.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun featureId(featureId: String) = featureId(JsonField.of(featureId))

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

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

            fun hasUnlimitedUsage(hasUnlimitedUsage: Boolean) =
                hasUnlimitedUsage(JsonField.of(hasUnlimitedUsage))

            /**
             * Sets [Builder.hasUnlimitedUsage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasUnlimitedUsage] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasUnlimitedUsage(hasUnlimitedUsage: JsonField<Boolean>) = apply {
                this.hasUnlimitedUsage = hasUnlimitedUsage
            }

            fun monthlyResetPeriodConfiguration(
                monthlyResetPeriodConfiguration: MonthlyResetPeriodConfiguration
            ) = monthlyResetPeriodConfiguration(JsonField.of(monthlyResetPeriodConfiguration))

            /**
             * Sets [Builder.monthlyResetPeriodConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyResetPeriodConfiguration] with a well-typed
             * [MonthlyResetPeriodConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun monthlyResetPeriodConfiguration(
                monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration>
            ) = apply { this.monthlyResetPeriodConfiguration = monthlyResetPeriodConfiguration }

            fun resetPeriod(resetPeriod: ResetPeriod) = resetPeriod(JsonField.of(resetPeriod))

            /**
             * Sets [Builder.resetPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resetPeriod] with a well-typed [ResetPeriod] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resetPeriod(resetPeriod: JsonField<ResetPeriod>) = apply {
                this.resetPeriod = resetPeriod
            }

            fun usageLimit(usageLimit: Double) = usageLimit(JsonField.of(usageLimit))

            /**
             * Sets [Builder.usageLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageLimit] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun usageLimit(usageLimit: JsonField<Double>) = apply { this.usageLimit = usageLimit }

            fun weeklyResetPeriodConfiguration(
                weeklyResetPeriodConfiguration: WeeklyResetPeriodConfiguration
            ) = weeklyResetPeriodConfiguration(JsonField.of(weeklyResetPeriodConfiguration))

            /**
             * Sets [Builder.weeklyResetPeriodConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weeklyResetPeriodConfiguration] with a well-typed
             * [WeeklyResetPeriodConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun weeklyResetPeriodConfiguration(
                weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration>
            ) = apply { this.weeklyResetPeriodConfiguration = weeklyResetPeriodConfiguration }

            fun yearlyResetPeriodConfiguration(
                yearlyResetPeriodConfiguration: YearlyResetPeriodConfiguration
            ) = yearlyResetPeriodConfiguration(JsonField.of(yearlyResetPeriodConfiguration))

            /**
             * Sets [Builder.yearlyResetPeriodConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.yearlyResetPeriodConfiguration] with a well-typed
             * [YearlyResetPeriodConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun yearlyResetPeriodConfiguration(
                yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration>
            ) = apply { this.yearlyResetPeriodConfiguration = yearlyResetPeriodConfiguration }

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
             */
            fun build(): SubscriptionEntitlement =
                SubscriptionEntitlement(
                    id,
                    featureId,
                    hasSoftLimit,
                    hasUnlimitedUsage,
                    monthlyResetPeriodConfiguration,
                    resetPeriod,
                    usageLimit,
                    weeklyResetPeriodConfiguration,
                    yearlyResetPeriodConfiguration,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SubscriptionEntitlement = apply {
            if (validated) {
                return@apply
            }

            id()
            featureId()
            hasSoftLimit()
            hasUnlimitedUsage()
            monthlyResetPeriodConfiguration().ifPresent { it.validate() }
            resetPeriod().ifPresent { it.validate() }
            usageLimit()
            weeklyResetPeriodConfiguration().ifPresent { it.validate() }
            yearlyResetPeriodConfiguration().ifPresent { it.validate() }
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
                (if (featureId.asKnown().isPresent) 1 else 0) +
                (if (hasSoftLimit.asKnown().isPresent) 1 else 0) +
                (if (hasUnlimitedUsage.asKnown().isPresent) 1 else 0) +
                (monthlyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (resetPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (usageLimit.asKnown().isPresent) 1 else 0) +
                (weeklyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (yearlyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0)

        class MonthlyResetPeriodConfiguration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accordingTo: JsonField<AccordingTo>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accordingTo")
                @ExcludeMissing
                accordingTo: JsonField<AccordingTo> = JsonMissing.of()
            ) : this(accordingTo, mutableMapOf())

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accordingTo(): AccordingTo = accordingTo.getRequired("accordingTo")

            /**
             * Returns the raw JSON value of [accordingTo].
             *
             * Unlike [accordingTo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accordingTo")
            @ExcludeMissing
            fun _accordingTo(): JsonField<AccordingTo> = accordingTo

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
                 * [MonthlyResetPeriodConfiguration].
                 *
                 * The following fields are required:
                 * ```java
                 * .accordingTo()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MonthlyResetPeriodConfiguration]. */
            class Builder internal constructor() {

                private var accordingTo: JsonField<AccordingTo>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    monthlyResetPeriodConfiguration: MonthlyResetPeriodConfiguration
                ) = apply {
                    accordingTo = monthlyResetPeriodConfiguration.accordingTo
                    additionalProperties =
                        monthlyResetPeriodConfiguration.additionalProperties.toMutableMap()
                }

                fun accordingTo(accordingTo: AccordingTo) = accordingTo(JsonField.of(accordingTo))

                /**
                 * Sets [Builder.accordingTo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accordingTo] with a well-typed [AccordingTo]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accordingTo(accordingTo: JsonField<AccordingTo>) = apply {
                    this.accordingTo = accordingTo
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
                 * Returns an immutable instance of [MonthlyResetPeriodConfiguration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accordingTo()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MonthlyResetPeriodConfiguration =
                    MonthlyResetPeriodConfiguration(
                        checkRequired("accordingTo", accordingTo),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MonthlyResetPeriodConfiguration = apply {
                if (validated) {
                    return@apply
                }

                accordingTo().validate()
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
            internal fun validity(): Int = (accordingTo.asKnown().getOrNull()?.validity() ?: 0)

            class AccordingTo
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

                    @JvmField val SUBSCRIPTION_START = of("SubscriptionStart")

                    @JvmField val START_OF_THE_MONTH = of("StartOfTheMonth")

                    @JvmStatic fun of(value: String) = AccordingTo(JsonField.of(value))
                }

                /** An enum containing [AccordingTo]'s known values. */
                enum class Known {
                    SUBSCRIPTION_START,
                    START_OF_THE_MONTH,
                }

                /**
                 * An enum containing [AccordingTo]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccordingTo] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SUBSCRIPTION_START,
                    START_OF_THE_MONTH,
                    /**
                     * An enum member indicating that [AccordingTo] was instantiated with an unknown
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
                        SUBSCRIPTION_START -> Value.SUBSCRIPTION_START
                        START_OF_THE_MONTH -> Value.START_OF_THE_MONTH
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
                        SUBSCRIPTION_START -> Known.SUBSCRIPTION_START
                        START_OF_THE_MONTH -> Known.START_OF_THE_MONTH
                        else -> throw StiggInvalidDataException("Unknown AccordingTo: $value")
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

                fun validate(): AccordingTo = apply {
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

                    return other is AccordingTo && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MonthlyResetPeriodConfiguration &&
                    accordingTo == other.accordingTo &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(accordingTo, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MonthlyResetPeriodConfiguration{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
        }

        class ResetPeriod @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val YEAR = of("YEAR")

                @JvmField val MONTH = of("MONTH")

                @JvmField val WEEK = of("WEEK")

                @JvmField val DAY = of("DAY")

                @JvmField val HOUR = of("HOUR")

                @JvmStatic fun of(value: String) = ResetPeriod(JsonField.of(value))
            }

            /** An enum containing [ResetPeriod]'s known values. */
            enum class Known {
                YEAR,
                MONTH,
                WEEK,
                DAY,
                HOUR,
            }

            /**
             * An enum containing [ResetPeriod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ResetPeriod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                YEAR,
                MONTH,
                WEEK,
                DAY,
                HOUR,
                /**
                 * An enum member indicating that [ResetPeriod] was instantiated with an unknown
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
                    YEAR -> Value.YEAR
                    MONTH -> Value.MONTH
                    WEEK -> Value.WEEK
                    DAY -> Value.DAY
                    HOUR -> Value.HOUR
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
                    YEAR -> Known.YEAR
                    MONTH -> Known.MONTH
                    WEEK -> Known.WEEK
                    DAY -> Known.DAY
                    HOUR -> Known.HOUR
                    else -> throw StiggInvalidDataException("Unknown ResetPeriod: $value")
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

            fun validate(): ResetPeriod = apply {
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

                return other is ResetPeriod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class WeeklyResetPeriodConfiguration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accordingTo: JsonField<AccordingTo>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accordingTo")
                @ExcludeMissing
                accordingTo: JsonField<AccordingTo> = JsonMissing.of()
            ) : this(accordingTo, mutableMapOf())

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accordingTo(): AccordingTo = accordingTo.getRequired("accordingTo")

            /**
             * Returns the raw JSON value of [accordingTo].
             *
             * Unlike [accordingTo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accordingTo")
            @ExcludeMissing
            fun _accordingTo(): JsonField<AccordingTo> = accordingTo

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
                 * [WeeklyResetPeriodConfiguration].
                 *
                 * The following fields are required:
                 * ```java
                 * .accordingTo()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WeeklyResetPeriodConfiguration]. */
            class Builder internal constructor() {

                private var accordingTo: JsonField<AccordingTo>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(weeklyResetPeriodConfiguration: WeeklyResetPeriodConfiguration) =
                    apply {
                        accordingTo = weeklyResetPeriodConfiguration.accordingTo
                        additionalProperties =
                            weeklyResetPeriodConfiguration.additionalProperties.toMutableMap()
                    }

                fun accordingTo(accordingTo: AccordingTo) = accordingTo(JsonField.of(accordingTo))

                /**
                 * Sets [Builder.accordingTo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accordingTo] with a well-typed [AccordingTo]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accordingTo(accordingTo: JsonField<AccordingTo>) = apply {
                    this.accordingTo = accordingTo
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
                 * Returns an immutable instance of [WeeklyResetPeriodConfiguration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accordingTo()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WeeklyResetPeriodConfiguration =
                    WeeklyResetPeriodConfiguration(
                        checkRequired("accordingTo", accordingTo),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WeeklyResetPeriodConfiguration = apply {
                if (validated) {
                    return@apply
                }

                accordingTo().validate()
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
            internal fun validity(): Int = (accordingTo.asKnown().getOrNull()?.validity() ?: 0)

            class AccordingTo
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

                    @JvmField val SUBSCRIPTION_START = of("SubscriptionStart")

                    @JvmField val EVERY_SUNDAY = of("EverySunday")

                    @JvmField val EVERY_MONDAY = of("EveryMonday")

                    @JvmField val EVERY_TUESDAY = of("EveryTuesday")

                    @JvmField val EVERY_WEDNESDAY = of("EveryWednesday")

                    @JvmField val EVERY_THURSDAY = of("EveryThursday")

                    @JvmField val EVERY_FRIDAY = of("EveryFriday")

                    @JvmField val EVERY_SATURDAY = of("EverySaturday")

                    @JvmStatic fun of(value: String) = AccordingTo(JsonField.of(value))
                }

                /** An enum containing [AccordingTo]'s known values. */
                enum class Known {
                    SUBSCRIPTION_START,
                    EVERY_SUNDAY,
                    EVERY_MONDAY,
                    EVERY_TUESDAY,
                    EVERY_WEDNESDAY,
                    EVERY_THURSDAY,
                    EVERY_FRIDAY,
                    EVERY_SATURDAY,
                }

                /**
                 * An enum containing [AccordingTo]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccordingTo] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SUBSCRIPTION_START,
                    EVERY_SUNDAY,
                    EVERY_MONDAY,
                    EVERY_TUESDAY,
                    EVERY_WEDNESDAY,
                    EVERY_THURSDAY,
                    EVERY_FRIDAY,
                    EVERY_SATURDAY,
                    /**
                     * An enum member indicating that [AccordingTo] was instantiated with an unknown
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
                        SUBSCRIPTION_START -> Value.SUBSCRIPTION_START
                        EVERY_SUNDAY -> Value.EVERY_SUNDAY
                        EVERY_MONDAY -> Value.EVERY_MONDAY
                        EVERY_TUESDAY -> Value.EVERY_TUESDAY
                        EVERY_WEDNESDAY -> Value.EVERY_WEDNESDAY
                        EVERY_THURSDAY -> Value.EVERY_THURSDAY
                        EVERY_FRIDAY -> Value.EVERY_FRIDAY
                        EVERY_SATURDAY -> Value.EVERY_SATURDAY
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
                        SUBSCRIPTION_START -> Known.SUBSCRIPTION_START
                        EVERY_SUNDAY -> Known.EVERY_SUNDAY
                        EVERY_MONDAY -> Known.EVERY_MONDAY
                        EVERY_TUESDAY -> Known.EVERY_TUESDAY
                        EVERY_WEDNESDAY -> Known.EVERY_WEDNESDAY
                        EVERY_THURSDAY -> Known.EVERY_THURSDAY
                        EVERY_FRIDAY -> Known.EVERY_FRIDAY
                        EVERY_SATURDAY -> Known.EVERY_SATURDAY
                        else -> throw StiggInvalidDataException("Unknown AccordingTo: $value")
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

                fun validate(): AccordingTo = apply {
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

                    return other is AccordingTo && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WeeklyResetPeriodConfiguration &&
                    accordingTo == other.accordingTo &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(accordingTo, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WeeklyResetPeriodConfiguration{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
        }

        class YearlyResetPeriodConfiguration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accordingTo: JsonField<AccordingTo>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accordingTo")
                @ExcludeMissing
                accordingTo: JsonField<AccordingTo> = JsonMissing.of()
            ) : this(accordingTo, mutableMapOf())

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accordingTo(): AccordingTo = accordingTo.getRequired("accordingTo")

            /**
             * Returns the raw JSON value of [accordingTo].
             *
             * Unlike [accordingTo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accordingTo")
            @ExcludeMissing
            fun _accordingTo(): JsonField<AccordingTo> = accordingTo

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
                 * [YearlyResetPeriodConfiguration].
                 *
                 * The following fields are required:
                 * ```java
                 * .accordingTo()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [YearlyResetPeriodConfiguration]. */
            class Builder internal constructor() {

                private var accordingTo: JsonField<AccordingTo>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(yearlyResetPeriodConfiguration: YearlyResetPeriodConfiguration) =
                    apply {
                        accordingTo = yearlyResetPeriodConfiguration.accordingTo
                        additionalProperties =
                            yearlyResetPeriodConfiguration.additionalProperties.toMutableMap()
                    }

                fun accordingTo(accordingTo: AccordingTo) = accordingTo(JsonField.of(accordingTo))

                /**
                 * Sets [Builder.accordingTo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accordingTo] with a well-typed [AccordingTo]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accordingTo(accordingTo: JsonField<AccordingTo>) = apply {
                    this.accordingTo = accordingTo
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
                 * Returns an immutable instance of [YearlyResetPeriodConfiguration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accordingTo()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): YearlyResetPeriodConfiguration =
                    YearlyResetPeriodConfiguration(
                        checkRequired("accordingTo", accordingTo),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): YearlyResetPeriodConfiguration = apply {
                if (validated) {
                    return@apply
                }

                accordingTo().validate()
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
            internal fun validity(): Int = (accordingTo.asKnown().getOrNull()?.validity() ?: 0)

            class AccordingTo
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

                    @JvmField val SUBSCRIPTION_START = of("SubscriptionStart")

                    @JvmStatic fun of(value: String) = AccordingTo(JsonField.of(value))
                }

                /** An enum containing [AccordingTo]'s known values. */
                enum class Known {
                    SUBSCRIPTION_START
                }

                /**
                 * An enum containing [AccordingTo]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccordingTo] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SUBSCRIPTION_START,
                    /**
                     * An enum member indicating that [AccordingTo] was instantiated with an unknown
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
                        SUBSCRIPTION_START -> Value.SUBSCRIPTION_START
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
                        SUBSCRIPTION_START -> Known.SUBSCRIPTION_START
                        else -> throw StiggInvalidDataException("Unknown AccordingTo: $value")
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

                fun validate(): AccordingTo = apply {
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

                    return other is AccordingTo && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is YearlyResetPeriodConfiguration &&
                    accordingTo == other.accordingTo &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(accordingTo, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "YearlyResetPeriodConfiguration{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SubscriptionEntitlement &&
                id == other.id &&
                featureId == other.featureId &&
                hasSoftLimit == other.hasSoftLimit &&
                hasUnlimitedUsage == other.hasUnlimitedUsage &&
                monthlyResetPeriodConfiguration == other.monthlyResetPeriodConfiguration &&
                resetPeriod == other.resetPeriod &&
                usageLimit == other.usageLimit &&
                weeklyResetPeriodConfiguration == other.weeklyResetPeriodConfiguration &&
                yearlyResetPeriodConfiguration == other.yearlyResetPeriodConfiguration &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                featureId,
                hasSoftLimit,
                hasUnlimitedUsage,
                monthlyResetPeriodConfiguration,
                resetPeriod,
                usageLimit,
                weeklyResetPeriodConfiguration,
                yearlyResetPeriodConfiguration,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionEntitlement{id=$id, featureId=$featureId, hasSoftLimit=$hasSoftLimit, hasUnlimitedUsage=$hasUnlimitedUsage, monthlyResetPeriodConfiguration=$monthlyResetPeriodConfiguration, resetPeriod=$resetPeriod, usageLimit=$usageLimit, weeklyResetPeriodConfiguration=$weeklyResetPeriodConfiguration, yearlyResetPeriodConfiguration=$yearlyResetPeriodConfiguration, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
