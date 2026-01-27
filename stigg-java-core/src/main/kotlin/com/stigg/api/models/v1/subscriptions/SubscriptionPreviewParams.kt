// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.subscriptions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.stigg.api.core.Enum
import com.stigg.api.core.ExcludeMissing
import com.stigg.api.core.JsonField
import com.stigg.api.core.JsonMissing
import com.stigg.api.core.JsonValue
import com.stigg.api.core.Params
import com.stigg.api.core.checkKnown
import com.stigg.api.core.checkRequired
import com.stigg.api.core.http.Headers
import com.stigg.api.core.http.QueryParams
import com.stigg.api.core.toImmutable
import com.stigg.api.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new Subscription Preview */
class SubscriptionPreviewParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Customer ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * Plan ID
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun planId(): String = body.planId()

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
    fun billableFeatures(): Optional<List<BillableFeature>> = body.billableFeatures()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingCountryCode(): Optional<String> = body.billingCountryCode()

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
    fun charges(): Optional<List<Charge>> = body.charges()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payingCustomerId(): Optional<String> = body.payingCustomerId()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceId(): Optional<String> = body.resourceId()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduleStrategy(): Optional<ScheduleStrategy> = body.scheduleStrategy()

    /**
     * Subscription start date
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<OffsetDateTime> = body.startDate()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trialOverrideConfiguration(): Optional<TrialOverrideConfiguration> =
        body.trialOverrideConfiguration()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unitQuantity(): Optional<Double> = body.unitQuantity()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planId(): JsonField<String> = body._planId()

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
     * Returns the raw JSON value of [billableFeatures].
     *
     * Unlike [billableFeatures], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _billableFeatures(): JsonField<List<BillableFeature>> = body._billableFeatures()

    /**
     * Returns the raw JSON value of [billingCountryCode].
     *
     * Unlike [billingCountryCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _billingCountryCode(): JsonField<String> = body._billingCountryCode()

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
     * Returns the raw JSON value of [charges].
     *
     * Unlike [charges], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _charges(): JsonField<List<Charge>> = body._charges()

    /**
     * Returns the raw JSON value of [payingCustomerId].
     *
     * Unlike [payingCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _payingCustomerId(): JsonField<String> = body._payingCustomerId()

    /**
     * Returns the raw JSON value of [resourceId].
     *
     * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resourceId(): JsonField<String> = body._resourceId()

    /**
     * Returns the raw JSON value of [scheduleStrategy].
     *
     * Unlike [scheduleStrategy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _scheduleStrategy(): JsonField<ScheduleStrategy> = body._scheduleStrategy()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<OffsetDateTime> = body._startDate()

    /**
     * Returns the raw JSON value of [trialOverrideConfiguration].
     *
     * Unlike [trialOverrideConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _trialOverrideConfiguration(): JsonField<TrialOverrideConfiguration> =
        body._trialOverrideConfiguration()

    /**
     * Returns the raw JSON value of [unitQuantity].
     *
     * Unlike [unitQuantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _unitQuantity(): JsonField<Double> = body._unitQuantity()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionPreviewParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .planId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionPreviewParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionPreviewParams: SubscriptionPreviewParams) = apply {
            body = subscriptionPreviewParams.body.toBuilder()
            additionalHeaders = subscriptionPreviewParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionPreviewParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customerId]
         * - [planId]
         * - [addons]
         * - [appliedCoupon]
         * - [billableFeatures]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Customer ID */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** Plan ID */
        fun planId(planId: String) = apply { body.planId(planId) }

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

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

        fun billableFeatures(billableFeatures: List<BillableFeature>) = apply {
            body.billableFeatures(billableFeatures)
        }

        /**
         * Sets [Builder.billableFeatures] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billableFeatures] with a well-typed
         * `List<BillableFeature>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun billableFeatures(billableFeatures: JsonField<List<BillableFeature>>) = apply {
            body.billableFeatures(billableFeatures)
        }

        /**
         * Adds a single [BillableFeature] to [billableFeatures].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBillableFeature(billableFeature: BillableFeature) = apply {
            body.addBillableFeature(billableFeature)
        }

        fun billingCountryCode(billingCountryCode: String) = apply {
            body.billingCountryCode(billingCountryCode)
        }

        /**
         * Sets [Builder.billingCountryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCountryCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingCountryCode(billingCountryCode: JsonField<String>) = apply {
            body.billingCountryCode(billingCountryCode)
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

        fun payingCustomerId(payingCustomerId: String) = apply {
            body.payingCustomerId(payingCustomerId)
        }

        /**
         * Sets [Builder.payingCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payingCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payingCustomerId(payingCustomerId: JsonField<String>) = apply {
            body.payingCustomerId(payingCustomerId)
        }

        fun resourceId(resourceId: String) = apply { body.resourceId(resourceId) }

        /**
         * Sets [Builder.resourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceId(resourceId: JsonField<String>) = apply { body.resourceId(resourceId) }

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

        /** Subscription start date */
        fun startDate(startDate: OffsetDateTime) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { body.startDate(startDate) }

        fun trialOverrideConfiguration(trialOverrideConfiguration: TrialOverrideConfiguration) =
            apply {
                body.trialOverrideConfiguration(trialOverrideConfiguration)
            }

        /**
         * Sets [Builder.trialOverrideConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialOverrideConfiguration] with a well-typed
         * [TrialOverrideConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun trialOverrideConfiguration(
            trialOverrideConfiguration: JsonField<TrialOverrideConfiguration>
        ) = apply { body.trialOverrideConfiguration(trialOverrideConfiguration) }

        fun unitQuantity(unitQuantity: Double) = apply { body.unitQuantity(unitQuantity) }

        /**
         * Sets [Builder.unitQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitQuantity] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unitQuantity(unitQuantity: JsonField<Double>) = apply {
            body.unitQuantity(unitQuantity)
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
         * Returns an immutable instance of [SubscriptionPreviewParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .planId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionPreviewParams =
            SubscriptionPreviewParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerId: JsonField<String>,
        private val planId: JsonField<String>,
        private val addons: JsonField<List<Addon>>,
        private val appliedCoupon: JsonField<AppliedCoupon>,
        private val billableFeatures: JsonField<List<BillableFeature>>,
        private val billingCountryCode: JsonField<String>,
        private val billingInformation: JsonField<BillingInformation>,
        private val billingPeriod: JsonField<BillingPeriod>,
        private val charges: JsonField<List<Charge>>,
        private val payingCustomerId: JsonField<String>,
        private val resourceId: JsonField<String>,
        private val scheduleStrategy: JsonField<ScheduleStrategy>,
        private val startDate: JsonField<OffsetDateTime>,
        private val trialOverrideConfiguration: JsonField<TrialOverrideConfiguration>,
        private val unitQuantity: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customerId")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("planId") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("addons")
            @ExcludeMissing
            addons: JsonField<List<Addon>> = JsonMissing.of(),
            @JsonProperty("appliedCoupon")
            @ExcludeMissing
            appliedCoupon: JsonField<AppliedCoupon> = JsonMissing.of(),
            @JsonProperty("billableFeatures")
            @ExcludeMissing
            billableFeatures: JsonField<List<BillableFeature>> = JsonMissing.of(),
            @JsonProperty("billingCountryCode")
            @ExcludeMissing
            billingCountryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billingInformation")
            @ExcludeMissing
            billingInformation: JsonField<BillingInformation> = JsonMissing.of(),
            @JsonProperty("billingPeriod")
            @ExcludeMissing
            billingPeriod: JsonField<BillingPeriod> = JsonMissing.of(),
            @JsonProperty("charges")
            @ExcludeMissing
            charges: JsonField<List<Charge>> = JsonMissing.of(),
            @JsonProperty("payingCustomerId")
            @ExcludeMissing
            payingCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resourceId")
            @ExcludeMissing
            resourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scheduleStrategy")
            @ExcludeMissing
            scheduleStrategy: JsonField<ScheduleStrategy> = JsonMissing.of(),
            @JsonProperty("startDate")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("trialOverrideConfiguration")
            @ExcludeMissing
            trialOverrideConfiguration: JsonField<TrialOverrideConfiguration> = JsonMissing.of(),
            @JsonProperty("unitQuantity")
            @ExcludeMissing
            unitQuantity: JsonField<Double> = JsonMissing.of(),
        ) : this(
            customerId,
            planId,
            addons,
            appliedCoupon,
            billableFeatures,
            billingCountryCode,
            billingInformation,
            billingPeriod,
            charges,
            payingCustomerId,
            resourceId,
            scheduleStrategy,
            startDate,
            trialOverrideConfiguration,
            unitQuantity,
            mutableMapOf(),
        )

        /**
         * Customer ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customerId")

        /**
         * Plan ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun planId(): String = planId.getRequired("planId")

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
        fun billableFeatures(): Optional<List<BillableFeature>> =
            billableFeatures.getOptional("billableFeatures")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingCountryCode(): Optional<String> =
            billingCountryCode.getOptional("billingCountryCode")

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
        fun charges(): Optional<List<Charge>> = charges.getOptional("charges")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payingCustomerId(): Optional<String> = payingCustomerId.getOptional("payingCustomerId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resourceId(): Optional<String> = resourceId.getOptional("resourceId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scheduleStrategy(): Optional<ScheduleStrategy> =
            scheduleStrategy.getOptional("scheduleStrategy")

        /**
         * Subscription start date
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): Optional<OffsetDateTime> = startDate.getOptional("startDate")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trialOverrideConfiguration(): Optional<TrialOverrideConfiguration> =
            trialOverrideConfiguration.getOptional("trialOverrideConfiguration")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unitQuantity(): Optional<Double> = unitQuantity.getOptional("unitQuantity")

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [planId].
         *
         * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

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
         * Returns the raw JSON value of [billableFeatures].
         *
         * Unlike [billableFeatures], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billableFeatures")
        @ExcludeMissing
        fun _billableFeatures(): JsonField<List<BillableFeature>> = billableFeatures

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
         * Returns the raw JSON value of [charges].
         *
         * Unlike [charges], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("charges") @ExcludeMissing fun _charges(): JsonField<List<Charge>> = charges

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
         * Returns the raw JSON value of [resourceId].
         *
         * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resourceId")
        @ExcludeMissing
        fun _resourceId(): JsonField<String> = resourceId

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
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * Returns the raw JSON value of [trialOverrideConfiguration].
         *
         * Unlike [trialOverrideConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("trialOverrideConfiguration")
        @ExcludeMissing
        fun _trialOverrideConfiguration(): JsonField<TrialOverrideConfiguration> =
            trialOverrideConfiguration

        /**
         * Returns the raw JSON value of [unitQuantity].
         *
         * Unlike [unitQuantity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unitQuantity")
        @ExcludeMissing
        fun _unitQuantity(): JsonField<Double> = unitQuantity

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
             * .customerId()
             * .planId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var planId: JsonField<String>? = null
            private var addons: JsonField<MutableList<Addon>>? = null
            private var appliedCoupon: JsonField<AppliedCoupon> = JsonMissing.of()
            private var billableFeatures: JsonField<MutableList<BillableFeature>>? = null
            private var billingCountryCode: JsonField<String> = JsonMissing.of()
            private var billingInformation: JsonField<BillingInformation> = JsonMissing.of()
            private var billingPeriod: JsonField<BillingPeriod> = JsonMissing.of()
            private var charges: JsonField<MutableList<Charge>>? = null
            private var payingCustomerId: JsonField<String> = JsonMissing.of()
            private var resourceId: JsonField<String> = JsonMissing.of()
            private var scheduleStrategy: JsonField<ScheduleStrategy> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var trialOverrideConfiguration: JsonField<TrialOverrideConfiguration> =
                JsonMissing.of()
            private var unitQuantity: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customerId = body.customerId
                planId = body.planId
                addons = body.addons.map { it.toMutableList() }
                appliedCoupon = body.appliedCoupon
                billableFeatures = body.billableFeatures.map { it.toMutableList() }
                billingCountryCode = body.billingCountryCode
                billingInformation = body.billingInformation
                billingPeriod = body.billingPeriod
                charges = body.charges.map { it.toMutableList() }
                payingCustomerId = body.payingCustomerId
                resourceId = body.resourceId
                scheduleStrategy = body.scheduleStrategy
                startDate = body.startDate
                trialOverrideConfiguration = body.trialOverrideConfiguration
                unitQuantity = body.unitQuantity
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Customer ID */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Plan ID */
            fun planId(planId: String) = planId(JsonField.of(planId))

            /**
             * Sets [Builder.planId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

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

            fun billableFeatures(billableFeatures: List<BillableFeature>) =
                billableFeatures(JsonField.of(billableFeatures))

            /**
             * Sets [Builder.billableFeatures] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billableFeatures] with a well-typed
             * `List<BillableFeature>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun billableFeatures(billableFeatures: JsonField<List<BillableFeature>>) = apply {
                this.billableFeatures = billableFeatures.map { it.toMutableList() }
            }

            /**
             * Adds a single [BillableFeature] to [billableFeatures].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBillableFeature(billableFeature: BillableFeature) = apply {
                billableFeatures =
                    (billableFeatures ?: JsonField.of(mutableListOf())).also {
                        checkKnown("billableFeatures", it).add(billableFeature)
                    }
            }

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

            fun payingCustomerId(payingCustomerId: String) =
                payingCustomerId(JsonField.of(payingCustomerId))

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

            fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

            /**
             * Sets [Builder.resourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resourceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

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

            /** Subscription start date */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            fun trialOverrideConfiguration(trialOverrideConfiguration: TrialOverrideConfiguration) =
                trialOverrideConfiguration(JsonField.of(trialOverrideConfiguration))

            /**
             * Sets [Builder.trialOverrideConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialOverrideConfiguration] with a well-typed
             * [TrialOverrideConfiguration] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun trialOverrideConfiguration(
                trialOverrideConfiguration: JsonField<TrialOverrideConfiguration>
            ) = apply { this.trialOverrideConfiguration = trialOverrideConfiguration }

            fun unitQuantity(unitQuantity: Double) = unitQuantity(JsonField.of(unitQuantity))

            /**
             * Sets [Builder.unitQuantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitQuantity] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitQuantity(unitQuantity: JsonField<Double>) = apply {
                this.unitQuantity = unitQuantity
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
             * .customerId()
             * .planId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("customerId", customerId),
                    checkRequired("planId", planId),
                    (addons ?: JsonMissing.of()).map { it.toImmutable() },
                    appliedCoupon,
                    (billableFeatures ?: JsonMissing.of()).map { it.toImmutable() },
                    billingCountryCode,
                    billingInformation,
                    billingPeriod,
                    (charges ?: JsonMissing.of()).map { it.toImmutable() },
                    payingCustomerId,
                    resourceId,
                    scheduleStrategy,
                    startDate,
                    trialOverrideConfiguration,
                    unitQuantity,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customerId()
            planId()
            addons().ifPresent { it.forEach { it.validate() } }
            appliedCoupon().ifPresent { it.validate() }
            billableFeatures().ifPresent { it.forEach { it.validate() } }
            billingCountryCode()
            billingInformation().ifPresent { it.validate() }
            billingPeriod().ifPresent { it.validate() }
            charges().ifPresent { it.forEach { it.validate() } }
            payingCustomerId()
            resourceId()
            scheduleStrategy().ifPresent { it.validate() }
            startDate()
            trialOverrideConfiguration().ifPresent { it.validate() }
            unitQuantity()
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
            (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (planId.asKnown().isPresent) 1 else 0) +
                (addons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (appliedCoupon.asKnown().getOrNull()?.validity() ?: 0) +
                (billableFeatures.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (billingCountryCode.asKnown().isPresent) 1 else 0) +
                (billingInformation.asKnown().getOrNull()?.validity() ?: 0) +
                (billingPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                (charges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (payingCustomerId.asKnown().isPresent) 1 else 0) +
                (if (resourceId.asKnown().isPresent) 1 else 0) +
                (scheduleStrategy.asKnown().getOrNull()?.validity() ?: 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (trialOverrideConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (unitQuantity.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                customerId == other.customerId &&
                planId == other.planId &&
                addons == other.addons &&
                appliedCoupon == other.appliedCoupon &&
                billableFeatures == other.billableFeatures &&
                billingCountryCode == other.billingCountryCode &&
                billingInformation == other.billingInformation &&
                billingPeriod == other.billingPeriod &&
                charges == other.charges &&
                payingCustomerId == other.payingCustomerId &&
                resourceId == other.resourceId &&
                scheduleStrategy == other.scheduleStrategy &&
                startDate == other.startDate &&
                trialOverrideConfiguration == other.trialOverrideConfiguration &&
                unitQuantity == other.unitQuantity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customerId,
                planId,
                addons,
                appliedCoupon,
                billableFeatures,
                billingCountryCode,
                billingInformation,
                billingPeriod,
                charges,
                payingCustomerId,
                resourceId,
                scheduleStrategy,
                startDate,
                trialOverrideConfiguration,
                unitQuantity,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerId=$customerId, planId=$planId, addons=$addons, appliedCoupon=$appliedCoupon, billableFeatures=$billableFeatures, billingCountryCode=$billingCountryCode, billingInformation=$billingInformation, billingPeriod=$billingPeriod, charges=$charges, payingCustomerId=$payingCustomerId, resourceId=$resourceId, scheduleStrategy=$scheduleStrategy, startDate=$startDate, trialOverrideConfiguration=$trialOverrideConfiguration, unitQuantity=$unitQuantity, additionalProperties=$additionalProperties}"
    }

    class Addon
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addonId: JsonField<String>,
        private val quantity: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("addonId") @ExcludeMissing addonId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
        ) : this(addonId, quantity, mutableMapOf())

        /**
         * Addon ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun addonId(): String = addonId.getRequired("addonId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun quantity(): Optional<Long> = quantity.getOptional("quantity")

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
             * .addonId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Addon]. */
        class Builder internal constructor() {

            private var addonId: JsonField<String>? = null
            private var quantity: JsonField<Long> = JsonMissing.of()
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
             * .addonId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Addon =
                Addon(
                    checkRequired("addonId", addonId),
                    quantity,
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
                 * The price amount
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * The price currency
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
                     * Returns a mutable builder for constructing an instance of [AmountsOff].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AmountsOff]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var currency: JsonField<Currency>? = null
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The price currency */
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
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AmountsOff =
                        AmountsOff(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AmountsOff = apply {
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

                /** The price currency */
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

    class BillableFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val featureId: JsonField<String>,
        private val quantity: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("featureId")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Double> = JsonMissing.of(),
        ) : this(featureId, quantity, mutableMapOf())

        /**
         * Feature ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun featureId(): String = featureId.getRequired("featureId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Double = quantity.getRequired("quantity")

        /**
         * Returns the raw JSON value of [featureId].
         *
         * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

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
             * Returns a mutable builder for constructing an instance of [BillableFeature].
             *
             * The following fields are required:
             * ```java
             * .featureId()
             * .quantity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillableFeature]. */
        class Builder internal constructor() {

            private var featureId: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billableFeature: BillableFeature) = apply {
                featureId = billableFeature.featureId
                quantity = billableFeature.quantity
                additionalProperties = billableFeature.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [BillableFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .featureId()
             * .quantity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BillableFeature =
                BillableFeature(
                    checkRequired("featureId", featureId),
                    checkRequired("quantity", quantity),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BillableFeature = apply {
            if (validated) {
                return@apply
            }

            featureId()
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
            (if (featureId.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillableFeature &&
                featureId == other.featureId &&
                quantity == other.quantity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(featureId, quantity, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillableFeature{featureId=$featureId, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    class BillingInformation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingAddress: JsonField<BillingAddress>,
        private val chargeOnBehalfOfAccount: JsonField<String>,
        private val integrationId: JsonField<String>,
        private val invoiceDaysUntilDue: JsonField<Double>,
        private val isBackdated: JsonField<Boolean>,
        private val isInvoicePaid: JsonField<Boolean>,
        private val metadata: JsonValue,
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
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
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
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = billingInformation.metadata().convert(MyClass.class);
         * ```
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

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
            private var integrationId: JsonField<String> = JsonMissing.of()
            private var invoiceDaysUntilDue: JsonField<Double> = JsonMissing.of()
            private var isBackdated: JsonField<Boolean> = JsonMissing.of()
            private var isInvoicePaid: JsonField<Boolean> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var prorationBehavior: JsonField<ProrationBehavior> = JsonMissing.of()
            private var taxIds: JsonField<MutableList<TaxId>>? = null
            private var taxPercentage: JsonField<Double> = JsonMissing.of()
            private var taxRateIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingInformation: BillingInformation) = apply {
                billingAddress = billingInformation.billingAddress
                chargeOnBehalfOfAccount = billingInformation.chargeOnBehalfOfAccount
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

            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

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
            integrationId()
            invoiceDaysUntilDue()
            isBackdated()
            isInvoicePaid()
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
                (if (integrationId.asKnown().isPresent) 1 else 0) +
                (if (invoiceDaysUntilDue.asKnown().isPresent) 1 else 0) +
                (if (isBackdated.asKnown().isPresent) 1 else 0) +
                (if (isInvoicePaid.asKnown().isPresent) 1 else 0) +
                (prorationBehavior.asKnown().getOrNull()?.validity() ?: 0) +
                (taxIds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (taxPercentage.asKnown().isPresent) 1 else 0) +
                (taxRateIds.asKnown().getOrNull()?.size ?: 0)

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
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun city(): Optional<String> = city.getOptional("city")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun country(): Optional<String> = country.getOptional("country")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun line1(): Optional<String> = line1.getOptional("line1")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun postalCode(): Optional<String> = postalCode.getOptional("postalCode")

            /**
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

                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                fun line1(line1: String) = line1(JsonField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                fun line2(line2: String) = line2(JsonField.of(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
            "BillingInformation{billingAddress=$billingAddress, chargeOnBehalfOfAccount=$chargeOnBehalfOfAccount, integrationId=$integrationId, invoiceDaysUntilDue=$invoiceDaysUntilDue, isBackdated=$isBackdated, isInvoicePaid=$isInvoicePaid, metadata=$metadata, prorationBehavior=$prorationBehavior, taxIds=$taxIds, taxPercentage=$taxPercentage, taxRateIds=$taxRateIds, additionalProperties=$additionalProperties}"
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

    class TrialOverrideConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val isTrial: JsonField<Boolean>,
        private val trialEndBehavior: JsonField<TrialEndBehavior>,
        private val trialEndDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("isTrial") @ExcludeMissing isTrial: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("trialEndBehavior")
            @ExcludeMissing
            trialEndBehavior: JsonField<TrialEndBehavior> = JsonMissing.of(),
            @JsonProperty("trialEndDate")
            @ExcludeMissing
            trialEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(isTrial, trialEndBehavior, trialEndDate, mutableMapOf())

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isTrial(): Boolean = isTrial.getRequired("isTrial")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trialEndBehavior(): Optional<TrialEndBehavior> =
            trialEndBehavior.getOptional("trialEndBehavior")

        /**
         * Trial end date
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trialEndDate(): Optional<OffsetDateTime> = trialEndDate.getOptional("trialEndDate")

        /**
         * Returns the raw JSON value of [isTrial].
         *
         * Unlike [isTrial], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isTrial") @ExcludeMissing fun _isTrial(): JsonField<Boolean> = isTrial

        /**
         * Returns the raw JSON value of [trialEndBehavior].
         *
         * Unlike [trialEndBehavior], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trialEndBehavior")
        @ExcludeMissing
        fun _trialEndBehavior(): JsonField<TrialEndBehavior> = trialEndBehavior

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

            /**
             * Returns a mutable builder for constructing an instance of
             * [TrialOverrideConfiguration].
             *
             * The following fields are required:
             * ```java
             * .isTrial()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TrialOverrideConfiguration]. */
        class Builder internal constructor() {

            private var isTrial: JsonField<Boolean>? = null
            private var trialEndBehavior: JsonField<TrialEndBehavior> = JsonMissing.of()
            private var trialEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trialOverrideConfiguration: TrialOverrideConfiguration) = apply {
                isTrial = trialOverrideConfiguration.isTrial
                trialEndBehavior = trialOverrideConfiguration.trialEndBehavior
                trialEndDate = trialOverrideConfiguration.trialEndDate
                additionalProperties =
                    trialOverrideConfiguration.additionalProperties.toMutableMap()
            }

            fun isTrial(isTrial: Boolean) = isTrial(JsonField.of(isTrial))

            /**
             * Sets [Builder.isTrial] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTrial] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isTrial(isTrial: JsonField<Boolean>) = apply { this.isTrial = isTrial }

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

            /** Trial end date */
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
             * Returns an immutable instance of [TrialOverrideConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .isTrial()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TrialOverrideConfiguration =
                TrialOverrideConfiguration(
                    checkRequired("isTrial", isTrial),
                    trialEndBehavior,
                    trialEndDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TrialOverrideConfiguration = apply {
            if (validated) {
                return@apply
            }

            isTrial()
            trialEndBehavior().ifPresent { it.validate() }
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
            (if (isTrial.asKnown().isPresent) 1 else 0) +
                (trialEndBehavior.asKnown().getOrNull()?.validity() ?: 0) +
                (if (trialEndDate.asKnown().isPresent) 1 else 0)

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

            return other is TrialOverrideConfiguration &&
                isTrial == other.isTrial &&
                trialEndBehavior == other.trialEndBehavior &&
                trialEndDate == other.trialEndDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(isTrial, trialEndBehavior, trialEndDate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrialOverrideConfiguration{isTrial=$isTrial, trialEndBehavior=$trialEndBehavior, trialEndDate=$trialEndDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionPreviewParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionPreviewParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
