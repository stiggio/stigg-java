// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

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

/**
 * A single pricing row on a plan or addon. Each charge encodes one (billingPeriod, billingModel,
 * billingCadence, billingCountryCode) combination. Plans and addons own many of these — one per
 * currency / billing period / feature.
 */
class PlanListOverageChargesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val billingCadence: JsonField<BillingCadence>,
    private val billingModel: JsonField<BillingModel>,
    private val billingPeriod: JsonField<BillingPeriod>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val billingCountryCode: JsonField<String>,
    private val billingId: JsonField<String>,
    private val blockSize: JsonField<Double>,
    private val creditGrantCadence: JsonField<CreditGrantCadence>,
    private val creditRate: JsonField<CreditRate>,
    private val crmId: JsonField<String>,
    private val crmLinkUrl: JsonField<String>,
    private val featureId: JsonField<String>,
    private val maxUnitQuantity: JsonField<Double>,
    private val minUnitQuantity: JsonField<Double>,
    private val price: JsonField<Price>,
    private val tiers: JsonField<List<Tier>>,
    private val tiersMode: JsonField<TiersMode>,
    private val topUpCustomCurrencyId: JsonField<String>,
    private val usedInSubscriptions: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billingCadence")
        @ExcludeMissing
        billingCadence: JsonField<BillingCadence> = JsonMissing.of(),
        @JsonProperty("billingModel")
        @ExcludeMissing
        billingModel: JsonField<BillingModel> = JsonMissing.of(),
        @JsonProperty("billingPeriod")
        @ExcludeMissing
        billingPeriod: JsonField<BillingPeriod> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("billingCountryCode")
        @ExcludeMissing
        billingCountryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billingId") @ExcludeMissing billingId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("blockSize") @ExcludeMissing blockSize: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("creditGrantCadence")
        @ExcludeMissing
        creditGrantCadence: JsonField<CreditGrantCadence> = JsonMissing.of(),
        @JsonProperty("creditRate")
        @ExcludeMissing
        creditRate: JsonField<CreditRate> = JsonMissing.of(),
        @JsonProperty("crmId") @ExcludeMissing crmId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("crmLinkUrl")
        @ExcludeMissing
        crmLinkUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("featureId") @ExcludeMissing featureId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxUnitQuantity")
        @ExcludeMissing
        maxUnitQuantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minUnitQuantity")
        @ExcludeMissing
        minUnitQuantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
        @JsonProperty("tiers") @ExcludeMissing tiers: JsonField<List<Tier>> = JsonMissing.of(),
        @JsonProperty("tiersMode")
        @ExcludeMissing
        tiersMode: JsonField<TiersMode> = JsonMissing.of(),
        @JsonProperty("topUpCustomCurrencyId")
        @ExcludeMissing
        topUpCustomCurrencyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usedInSubscriptions")
        @ExcludeMissing
        usedInSubscriptions: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        billingCadence,
        billingModel,
        billingPeriod,
        createdAt,
        billingCountryCode,
        billingId,
        blockSize,
        creditGrantCadence,
        creditRate,
        crmId,
        crmLinkUrl,
        featureId,
        maxUnitQuantity,
        minUnitQuantity,
        price,
        tiers,
        tiersMode,
        topUpCustomCurrencyId,
        usedInSubscriptions,
        mutableMapOf(),
    )

    /**
     * Unique identifier of the charge
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The billing cadence (RECURRING or ONE_OFF)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingCadence(): BillingCadence = billingCadence.getRequired("billingCadence")

    /**
     * The billing model (FLAT_FEE, PER_UNIT, USAGE_BASED, CREDIT_BASED, MINIMUM_SPEND)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingModel(): BillingModel = billingModel.getRequired("billingModel")

    /**
     * The billing period (MONTHLY or ANNUALLY)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingPeriod(): BillingPeriod = billingPeriod.getRequired("billingPeriod")

    /**
     * Timestamp when the charge was created
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * ISO country code for localized pricing, if any
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingCountryCode(): Optional<String> =
        billingCountryCode.getOptional("billingCountryCode")

    /**
     * Identifier in the external billing integration (e.g. Stripe price id), if any
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingId(): Optional<String> = billingId.getOptional("billingId")

    /**
     * Block size for usage-based pricing
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blockSize(): Optional<Double> = blockSize.getOptional("blockSize")

    /**
     * When credits are granted (for credit-based pricing)
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditGrantCadence(): Optional<CreditGrantCadence> =
        creditGrantCadence.getOptional("creditGrantCadence")

    /**
     * Credit rate configuration for credit-based pricing
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditRate(): Optional<CreditRate> = creditRate.getOptional("creditRate")

    /**
     * Identifier in the linked CRM, if any
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun crmId(): Optional<String> = crmId.getOptional("crmId")

    /**
     * Deep link to the charge in the linked CRM, if any
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun crmLinkUrl(): Optional<String> = crmLinkUrl.getOptional("crmLinkUrl")

    /**
     * The feature this charge meters, if metered
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun featureId(): Optional<String> = featureId.getOptional("featureId")

    /**
     * Maximum unit quantity that can be purchased
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxUnitQuantity(): Optional<Double> = maxUnitQuantity.getOptional("maxUnitQuantity")

    /**
     * Minimum unit quantity that can be purchased
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minUnitQuantity(): Optional<Double> = minUnitQuantity.getOptional("minUnitQuantity")

    /**
     * The flat price amount and currency, when applicable
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun price(): Optional<Price> = price.getOptional("price")

    /**
     * Tiered pricing rows when the charge is tiered
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

    /**
     * Tiered pricing mode (VOLUME or GRADUATED) when the charge is tiered
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tiersMode(): Optional<TiersMode> = tiersMode.getOptional("tiersMode")

    /**
     * Custom currency identifier for top-up pricing, if any
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topUpCustomCurrencyId(): Optional<String> =
        topUpCustomCurrencyId.getOptional("topUpCustomCurrencyId")

    /**
     * True if this charge is referenced by at least one subscription
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usedInSubscriptions(): Optional<Boolean> =
        usedInSubscriptions.getOptional("usedInSubscriptions")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [billingCadence].
     *
     * Unlike [billingCadence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billingCadence")
    @ExcludeMissing
    fun _billingCadence(): JsonField<BillingCadence> = billingCadence

    /**
     * Returns the raw JSON value of [billingModel].
     *
     * Unlike [billingModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billingModel")
    @ExcludeMissing
    fun _billingModel(): JsonField<BillingModel> = billingModel

    /**
     * Returns the raw JSON value of [billingPeriod].
     *
     * Unlike [billingPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billingPeriod")
    @ExcludeMissing
    fun _billingPeriod(): JsonField<BillingPeriod> = billingPeriod

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [billingCountryCode].
     *
     * Unlike [billingCountryCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billingCountryCode")
    @ExcludeMissing
    fun _billingCountryCode(): JsonField<String> = billingCountryCode

    /**
     * Returns the raw JSON value of [billingId].
     *
     * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billingId") @ExcludeMissing fun _billingId(): JsonField<String> = billingId

    /**
     * Returns the raw JSON value of [blockSize].
     *
     * Unlike [blockSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blockSize") @ExcludeMissing fun _blockSize(): JsonField<Double> = blockSize

    /**
     * Returns the raw JSON value of [creditGrantCadence].
     *
     * Unlike [creditGrantCadence], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("creditGrantCadence")
    @ExcludeMissing
    fun _creditGrantCadence(): JsonField<CreditGrantCadence> = creditGrantCadence

    /**
     * Returns the raw JSON value of [creditRate].
     *
     * Unlike [creditRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creditRate")
    @ExcludeMissing
    fun _creditRate(): JsonField<CreditRate> = creditRate

    /**
     * Returns the raw JSON value of [crmId].
     *
     * Unlike [crmId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("crmId") @ExcludeMissing fun _crmId(): JsonField<String> = crmId

    /**
     * Returns the raw JSON value of [crmLinkUrl].
     *
     * Unlike [crmLinkUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("crmLinkUrl") @ExcludeMissing fun _crmLinkUrl(): JsonField<String> = crmLinkUrl

    /**
     * Returns the raw JSON value of [featureId].
     *
     * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

    /**
     * Returns the raw JSON value of [maxUnitQuantity].
     *
     * Unlike [maxUnitQuantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxUnitQuantity")
    @ExcludeMissing
    fun _maxUnitQuantity(): JsonField<Double> = maxUnitQuantity

    /**
     * Returns the raw JSON value of [minUnitQuantity].
     *
     * Unlike [minUnitQuantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minUnitQuantity")
    @ExcludeMissing
    fun _minUnitQuantity(): JsonField<Double> = minUnitQuantity

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

    /**
     * Returns the raw JSON value of [tiers].
     *
     * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

    /**
     * Returns the raw JSON value of [tiersMode].
     *
     * Unlike [tiersMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tiersMode") @ExcludeMissing fun _tiersMode(): JsonField<TiersMode> = tiersMode

    /**
     * Returns the raw JSON value of [topUpCustomCurrencyId].
     *
     * Unlike [topUpCustomCurrencyId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("topUpCustomCurrencyId")
    @ExcludeMissing
    fun _topUpCustomCurrencyId(): JsonField<String> = topUpCustomCurrencyId

    /**
     * Returns the raw JSON value of [usedInSubscriptions].
     *
     * Unlike [usedInSubscriptions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usedInSubscriptions")
    @ExcludeMissing
    fun _usedInSubscriptions(): JsonField<Boolean> = usedInSubscriptions

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
         * [PlanListOverageChargesResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .billingCadence()
         * .billingModel()
         * .billingPeriod()
         * .createdAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanListOverageChargesResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var billingCadence: JsonField<BillingCadence>? = null
        private var billingModel: JsonField<BillingModel>? = null
        private var billingPeriod: JsonField<BillingPeriod>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var billingCountryCode: JsonField<String> = JsonMissing.of()
        private var billingId: JsonField<String> = JsonMissing.of()
        private var blockSize: JsonField<Double> = JsonMissing.of()
        private var creditGrantCadence: JsonField<CreditGrantCadence> = JsonMissing.of()
        private var creditRate: JsonField<CreditRate> = JsonMissing.of()
        private var crmId: JsonField<String> = JsonMissing.of()
        private var crmLinkUrl: JsonField<String> = JsonMissing.of()
        private var featureId: JsonField<String> = JsonMissing.of()
        private var maxUnitQuantity: JsonField<Double> = JsonMissing.of()
        private var minUnitQuantity: JsonField<Double> = JsonMissing.of()
        private var price: JsonField<Price> = JsonMissing.of()
        private var tiers: JsonField<MutableList<Tier>>? = null
        private var tiersMode: JsonField<TiersMode> = JsonMissing.of()
        private var topUpCustomCurrencyId: JsonField<String> = JsonMissing.of()
        private var usedInSubscriptions: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planListOverageChargesResponse: PlanListOverageChargesResponse) = apply {
            id = planListOverageChargesResponse.id
            billingCadence = planListOverageChargesResponse.billingCadence
            billingModel = planListOverageChargesResponse.billingModel
            billingPeriod = planListOverageChargesResponse.billingPeriod
            createdAt = planListOverageChargesResponse.createdAt
            billingCountryCode = planListOverageChargesResponse.billingCountryCode
            billingId = planListOverageChargesResponse.billingId
            blockSize = planListOverageChargesResponse.blockSize
            creditGrantCadence = planListOverageChargesResponse.creditGrantCadence
            creditRate = planListOverageChargesResponse.creditRate
            crmId = planListOverageChargesResponse.crmId
            crmLinkUrl = planListOverageChargesResponse.crmLinkUrl
            featureId = planListOverageChargesResponse.featureId
            maxUnitQuantity = planListOverageChargesResponse.maxUnitQuantity
            minUnitQuantity = planListOverageChargesResponse.minUnitQuantity
            price = planListOverageChargesResponse.price
            tiers = planListOverageChargesResponse.tiers.map { it.toMutableList() }
            tiersMode = planListOverageChargesResponse.tiersMode
            topUpCustomCurrencyId = planListOverageChargesResponse.topUpCustomCurrencyId
            usedInSubscriptions = planListOverageChargesResponse.usedInSubscriptions
            additionalProperties =
                planListOverageChargesResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier of the charge */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The billing cadence (RECURRING or ONE_OFF) */
        fun billingCadence(billingCadence: BillingCadence) =
            billingCadence(JsonField.of(billingCadence))

        /**
         * Sets [Builder.billingCadence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCadence] with a well-typed [BillingCadence] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingCadence(billingCadence: JsonField<BillingCadence>) = apply {
            this.billingCadence = billingCadence
        }

        /** The billing model (FLAT_FEE, PER_UNIT, USAGE_BASED, CREDIT_BASED, MINIMUM_SPEND) */
        fun billingModel(billingModel: BillingModel) = billingModel(JsonField.of(billingModel))

        /**
         * Sets [Builder.billingModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingModel] with a well-typed [BillingModel] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingModel(billingModel: JsonField<BillingModel>) = apply {
            this.billingModel = billingModel
        }

        /** The billing period (MONTHLY or ANNUALLY) */
        fun billingPeriod(billingPeriod: BillingPeriod) = billingPeriod(JsonField.of(billingPeriod))

        /**
         * Sets [Builder.billingPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingPeriod] with a well-typed [BillingPeriod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingPeriod(billingPeriod: JsonField<BillingPeriod>) = apply {
            this.billingPeriod = billingPeriod
        }

        /** Timestamp when the charge was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** ISO country code for localized pricing, if any */
        fun billingCountryCode(billingCountryCode: String?) =
            billingCountryCode(JsonField.ofNullable(billingCountryCode))

        /**
         * Alias for calling [Builder.billingCountryCode] with `billingCountryCode.orElse(null)`.
         */
        fun billingCountryCode(billingCountryCode: Optional<String>) =
            billingCountryCode(billingCountryCode.getOrNull())

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

        /** Identifier in the external billing integration (e.g. Stripe price id), if any */
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

        /** Block size for usage-based pricing */
        fun blockSize(blockSize: Double?) = blockSize(JsonField.ofNullable(blockSize))

        /**
         * Alias for [Builder.blockSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun blockSize(blockSize: Double) = blockSize(blockSize as Double?)

        /** Alias for calling [Builder.blockSize] with `blockSize.orElse(null)`. */
        fun blockSize(blockSize: Optional<Double>) = blockSize(blockSize.getOrNull())

        /**
         * Sets [Builder.blockSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blockSize] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun blockSize(blockSize: JsonField<Double>) = apply { this.blockSize = blockSize }

        /** When credits are granted (for credit-based pricing) */
        fun creditGrantCadence(creditGrantCadence: CreditGrantCadence?) =
            creditGrantCadence(JsonField.ofNullable(creditGrantCadence))

        /**
         * Alias for calling [Builder.creditGrantCadence] with `creditGrantCadence.orElse(null)`.
         */
        fun creditGrantCadence(creditGrantCadence: Optional<CreditGrantCadence>) =
            creditGrantCadence(creditGrantCadence.getOrNull())

        /**
         * Sets [Builder.creditGrantCadence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditGrantCadence] with a well-typed
         * [CreditGrantCadence] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun creditGrantCadence(creditGrantCadence: JsonField<CreditGrantCadence>) = apply {
            this.creditGrantCadence = creditGrantCadence
        }

        /** Credit rate configuration for credit-based pricing */
        fun creditRate(creditRate: CreditRate?) = creditRate(JsonField.ofNullable(creditRate))

        /** Alias for calling [Builder.creditRate] with `creditRate.orElse(null)`. */
        fun creditRate(creditRate: Optional<CreditRate>) = creditRate(creditRate.getOrNull())

        /**
         * Sets [Builder.creditRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditRate] with a well-typed [CreditRate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditRate(creditRate: JsonField<CreditRate>) = apply { this.creditRate = creditRate }

        /** Identifier in the linked CRM, if any */
        fun crmId(crmId: String?) = crmId(JsonField.ofNullable(crmId))

        /** Alias for calling [Builder.crmId] with `crmId.orElse(null)`. */
        fun crmId(crmId: Optional<String>) = crmId(crmId.getOrNull())

        /**
         * Sets [Builder.crmId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.crmId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun crmId(crmId: JsonField<String>) = apply { this.crmId = crmId }

        /** Deep link to the charge in the linked CRM, if any */
        fun crmLinkUrl(crmLinkUrl: String?) = crmLinkUrl(JsonField.ofNullable(crmLinkUrl))

        /** Alias for calling [Builder.crmLinkUrl] with `crmLinkUrl.orElse(null)`. */
        fun crmLinkUrl(crmLinkUrl: Optional<String>) = crmLinkUrl(crmLinkUrl.getOrNull())

        /**
         * Sets [Builder.crmLinkUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.crmLinkUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun crmLinkUrl(crmLinkUrl: JsonField<String>) = apply { this.crmLinkUrl = crmLinkUrl }

        /** The feature this charge meters, if metered */
        fun featureId(featureId: String?) = featureId(JsonField.ofNullable(featureId))

        /** Alias for calling [Builder.featureId] with `featureId.orElse(null)`. */
        fun featureId(featureId: Optional<String>) = featureId(featureId.getOrNull())

        /**
         * Sets [Builder.featureId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

        /** Maximum unit quantity that can be purchased */
        fun maxUnitQuantity(maxUnitQuantity: Double?) =
            maxUnitQuantity(JsonField.ofNullable(maxUnitQuantity))

        /**
         * Alias for [Builder.maxUnitQuantity].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxUnitQuantity(maxUnitQuantity: Double) = maxUnitQuantity(maxUnitQuantity as Double?)

        /** Alias for calling [Builder.maxUnitQuantity] with `maxUnitQuantity.orElse(null)`. */
        fun maxUnitQuantity(maxUnitQuantity: Optional<Double>) =
            maxUnitQuantity(maxUnitQuantity.getOrNull())

        /**
         * Sets [Builder.maxUnitQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxUnitQuantity] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxUnitQuantity(maxUnitQuantity: JsonField<Double>) = apply {
            this.maxUnitQuantity = maxUnitQuantity
        }

        /** Minimum unit quantity that can be purchased */
        fun minUnitQuantity(minUnitQuantity: Double?) =
            minUnitQuantity(JsonField.ofNullable(minUnitQuantity))

        /**
         * Alias for [Builder.minUnitQuantity].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minUnitQuantity(minUnitQuantity: Double) = minUnitQuantity(minUnitQuantity as Double?)

        /** Alias for calling [Builder.minUnitQuantity] with `minUnitQuantity.orElse(null)`. */
        fun minUnitQuantity(minUnitQuantity: Optional<Double>) =
            minUnitQuantity(minUnitQuantity.getOrNull())

        /**
         * Sets [Builder.minUnitQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minUnitQuantity] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minUnitQuantity(minUnitQuantity: JsonField<Double>) = apply {
            this.minUnitQuantity = minUnitQuantity
        }

        /** The flat price amount and currency, when applicable */
        fun price(price: Price?) = price(JsonField.ofNullable(price))

        /** Alias for calling [Builder.price] with `price.orElse(null)`. */
        fun price(price: Optional<Price>) = price(price.getOrNull())

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Price] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Price>) = apply { this.price = price }

        /** Tiered pricing rows when the charge is tiered */
        fun tiers(tiers: List<Tier>?) = tiers(JsonField.ofNullable(tiers))

        /** Alias for calling [Builder.tiers] with `tiers.orElse(null)`. */
        fun tiers(tiers: Optional<List<Tier>>) = tiers(tiers.getOrNull())

        /**
         * Sets [Builder.tiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
                (tiers ?: JsonField.of(mutableListOf())).also { checkKnown("tiers", it).add(tier) }
        }

        /** Tiered pricing mode (VOLUME or GRADUATED) when the charge is tiered */
        fun tiersMode(tiersMode: TiersMode?) = tiersMode(JsonField.ofNullable(tiersMode))

        /** Alias for calling [Builder.tiersMode] with `tiersMode.orElse(null)`. */
        fun tiersMode(tiersMode: Optional<TiersMode>) = tiersMode(tiersMode.getOrNull())

        /**
         * Sets [Builder.tiersMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tiersMode] with a well-typed [TiersMode] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tiersMode(tiersMode: JsonField<TiersMode>) = apply { this.tiersMode = tiersMode }

        /** Custom currency identifier for top-up pricing, if any */
        fun topUpCustomCurrencyId(topUpCustomCurrencyId: String?) =
            topUpCustomCurrencyId(JsonField.ofNullable(topUpCustomCurrencyId))

        /**
         * Alias for calling [Builder.topUpCustomCurrencyId] with
         * `topUpCustomCurrencyId.orElse(null)`.
         */
        fun topUpCustomCurrencyId(topUpCustomCurrencyId: Optional<String>) =
            topUpCustomCurrencyId(topUpCustomCurrencyId.getOrNull())

        /**
         * Sets [Builder.topUpCustomCurrencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topUpCustomCurrencyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun topUpCustomCurrencyId(topUpCustomCurrencyId: JsonField<String>) = apply {
            this.topUpCustomCurrencyId = topUpCustomCurrencyId
        }

        /** True if this charge is referenced by at least one subscription */
        fun usedInSubscriptions(usedInSubscriptions: Boolean?) =
            usedInSubscriptions(JsonField.ofNullable(usedInSubscriptions))

        /**
         * Alias for [Builder.usedInSubscriptions].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun usedInSubscriptions(usedInSubscriptions: Boolean) =
            usedInSubscriptions(usedInSubscriptions as Boolean?)

        /**
         * Alias for calling [Builder.usedInSubscriptions] with `usedInSubscriptions.orElse(null)`.
         */
        fun usedInSubscriptions(usedInSubscriptions: Optional<Boolean>) =
            usedInSubscriptions(usedInSubscriptions.getOrNull())

        /**
         * Sets [Builder.usedInSubscriptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usedInSubscriptions] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usedInSubscriptions(usedInSubscriptions: JsonField<Boolean>) = apply {
            this.usedInSubscriptions = usedInSubscriptions
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
         * Returns an immutable instance of [PlanListOverageChargesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .billingCadence()
         * .billingModel()
         * .billingPeriod()
         * .createdAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanListOverageChargesResponse =
            PlanListOverageChargesResponse(
                checkRequired("id", id),
                checkRequired("billingCadence", billingCadence),
                checkRequired("billingModel", billingModel),
                checkRequired("billingPeriod", billingPeriod),
                checkRequired("createdAt", createdAt),
                billingCountryCode,
                billingId,
                blockSize,
                creditGrantCadence,
                creditRate,
                crmId,
                crmLinkUrl,
                featureId,
                maxUnitQuantity,
                minUnitQuantity,
                price,
                (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                tiersMode,
                topUpCustomCurrencyId,
                usedInSubscriptions,
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
    fun validate(): PlanListOverageChargesResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        billingCadence().validate()
        billingModel().validate()
        billingPeriod().validate()
        createdAt()
        billingCountryCode()
        billingId()
        blockSize()
        creditGrantCadence().ifPresent { it.validate() }
        creditRate().ifPresent { it.validate() }
        crmId()
        crmLinkUrl()
        featureId()
        maxUnitQuantity()
        minUnitQuantity()
        price().ifPresent { it.validate() }
        tiers().ifPresent { it.forEach { it.validate() } }
        tiersMode().ifPresent { it.validate() }
        topUpCustomCurrencyId()
        usedInSubscriptions()
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
            (billingCadence.asKnown().getOrNull()?.validity() ?: 0) +
            (billingModel.asKnown().getOrNull()?.validity() ?: 0) +
            (billingPeriod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (billingCountryCode.asKnown().isPresent) 1 else 0) +
            (if (billingId.asKnown().isPresent) 1 else 0) +
            (if (blockSize.asKnown().isPresent) 1 else 0) +
            (creditGrantCadence.asKnown().getOrNull()?.validity() ?: 0) +
            (creditRate.asKnown().getOrNull()?.validity() ?: 0) +
            (if (crmId.asKnown().isPresent) 1 else 0) +
            (if (crmLinkUrl.asKnown().isPresent) 1 else 0) +
            (if (featureId.asKnown().isPresent) 1 else 0) +
            (if (maxUnitQuantity.asKnown().isPresent) 1 else 0) +
            (if (minUnitQuantity.asKnown().isPresent) 1 else 0) +
            (price.asKnown().getOrNull()?.validity() ?: 0) +
            (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (tiersMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (topUpCustomCurrencyId.asKnown().isPresent) 1 else 0) +
            (if (usedInSubscriptions.asKnown().isPresent) 1 else 0)

    /** The billing cadence (RECURRING or ONE_OFF) */
    class BillingCadence @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val RECURRING = of("RECURRING")

            @JvmField val ONE_OFF = of("ONE_OFF")

            @JvmStatic fun of(value: String) = BillingCadence(JsonField.of(value))
        }

        /** An enum containing [BillingCadence]'s known values. */
        enum class Known {
            RECURRING,
            ONE_OFF,
        }

        /**
         * An enum containing [BillingCadence]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BillingCadence] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RECURRING,
            ONE_OFF,
            /**
             * An enum member indicating that [BillingCadence] was instantiated with an unknown
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
                RECURRING -> Value.RECURRING
                ONE_OFF -> Value.ONE_OFF
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
                RECURRING -> Known.RECURRING
                ONE_OFF -> Known.ONE_OFF
                else -> throw StiggInvalidDataException("Unknown BillingCadence: $value")
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
        fun validate(): BillingCadence = apply {
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

            return other is BillingCadence && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The billing model (FLAT_FEE, PER_UNIT, USAGE_BASED, CREDIT_BASED, MINIMUM_SPEND) */
    class BillingModel @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val FLAT_FEE = of("FLAT_FEE")

            @JvmField val MINIMUM_SPEND = of("MINIMUM_SPEND")

            @JvmField val PER_UNIT = of("PER_UNIT")

            @JvmField val USAGE_BASED = of("USAGE_BASED")

            @JvmField val CREDIT_BASED = of("CREDIT_BASED")

            @JvmStatic fun of(value: String) = BillingModel(JsonField.of(value))
        }

        /** An enum containing [BillingModel]'s known values. */
        enum class Known {
            FLAT_FEE,
            MINIMUM_SPEND,
            PER_UNIT,
            USAGE_BASED,
            CREDIT_BASED,
        }

        /**
         * An enum containing [BillingModel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BillingModel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FLAT_FEE,
            MINIMUM_SPEND,
            PER_UNIT,
            USAGE_BASED,
            CREDIT_BASED,
            /**
             * An enum member indicating that [BillingModel] was instantiated with an unknown value.
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
                FLAT_FEE -> Value.FLAT_FEE
                MINIMUM_SPEND -> Value.MINIMUM_SPEND
                PER_UNIT -> Value.PER_UNIT
                USAGE_BASED -> Value.USAGE_BASED
                CREDIT_BASED -> Value.CREDIT_BASED
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
                FLAT_FEE -> Known.FLAT_FEE
                MINIMUM_SPEND -> Known.MINIMUM_SPEND
                PER_UNIT -> Known.PER_UNIT
                USAGE_BASED -> Known.USAGE_BASED
                CREDIT_BASED -> Known.CREDIT_BASED
                else -> throw StiggInvalidDataException("Unknown BillingModel: $value")
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
        fun validate(): BillingModel = apply {
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

            return other is BillingModel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The billing period (MONTHLY or ANNUALLY) */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws StiggInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    /** When credits are granted (for credit-based pricing) */
    class CreditGrantCadence
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

            @JvmField val BEGINNING_OF_BILLING_PERIOD = of("BEGINNING_OF_BILLING_PERIOD")

            @JvmField val MONTHLY = of("MONTHLY")

            @JvmStatic fun of(value: String) = CreditGrantCadence(JsonField.of(value))
        }

        /** An enum containing [CreditGrantCadence]'s known values. */
        enum class Known {
            BEGINNING_OF_BILLING_PERIOD,
            MONTHLY,
        }

        /**
         * An enum containing [CreditGrantCadence]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CreditGrantCadence] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BEGINNING_OF_BILLING_PERIOD,
            MONTHLY,
            /**
             * An enum member indicating that [CreditGrantCadence] was instantiated with an unknown
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
                BEGINNING_OF_BILLING_PERIOD -> Value.BEGINNING_OF_BILLING_PERIOD
                MONTHLY -> Value.MONTHLY
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
                BEGINNING_OF_BILLING_PERIOD -> Known.BEGINNING_OF_BILLING_PERIOD
                MONTHLY -> Known.MONTHLY
                else -> throw StiggInvalidDataException("Unknown CreditGrantCadence: $value")
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
        fun validate(): CreditGrantCadence = apply {
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

            return other is CreditGrantCadence && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Credit rate configuration for credit-based pricing */
    class CreditRate
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val currencyId: JsonField<String>,
        private val costFormula: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("currencyId")
            @ExcludeMissing
            currencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("costFormula")
            @ExcludeMissing
            costFormula: JsonField<String> = JsonMissing.of(),
        ) : this(amount, currencyId, costFormula, mutableMapOf())

        /**
         * Credit rate amount
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * Custom currency identifier
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currencyId(): String = currencyId.getRequired("currencyId")

        /**
         * Optional cost formula expression
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun costFormula(): Optional<String> = costFormula.getOptional("costFormula")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [currencyId].
         *
         * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currencyId")
        @ExcludeMissing
        fun _currencyId(): JsonField<String> = currencyId

        /**
         * Returns the raw JSON value of [costFormula].
         *
         * Unlike [costFormula], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("costFormula")
        @ExcludeMissing
        fun _costFormula(): JsonField<String> = costFormula

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
             * Returns a mutable builder for constructing an instance of [CreditRate].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .currencyId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreditRate]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var currencyId: JsonField<String>? = null
            private var costFormula: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditRate: CreditRate) = apply {
                amount = creditRate.amount
                currencyId = creditRate.currencyId
                costFormula = creditRate.costFormula
                additionalProperties = creditRate.additionalProperties.toMutableMap()
            }

            /** Credit rate amount */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** Custom currency identifier */
            fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

            /**
             * Sets [Builder.currencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

            /** Optional cost formula expression */
            fun costFormula(costFormula: String?) = costFormula(JsonField.ofNullable(costFormula))

            /** Alias for calling [Builder.costFormula] with `costFormula.orElse(null)`. */
            fun costFormula(costFormula: Optional<String>) = costFormula(costFormula.getOrNull())

            /**
             * Sets [Builder.costFormula] to an arbitrary JSON value.
             *
             * You should usually call [Builder.costFormula] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun costFormula(costFormula: JsonField<String>) = apply {
                this.costFormula = costFormula
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
             * Returns an immutable instance of [CreditRate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .currencyId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditRate =
                CreditRate(
                    checkRequired("amount", amount),
                    checkRequired("currencyId", currencyId),
                    costFormula,
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
        fun validate(): CreditRate = apply {
            if (validated) {
                return@apply
            }

            amount()
            currencyId()
            costFormula()
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
                (if (currencyId.asKnown().isPresent) 1 else 0) +
                (if (costFormula.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditRate &&
                amount == other.amount &&
                currencyId == other.currencyId &&
                costFormula == other.costFormula &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(amount, currencyId, costFormula, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditRate{amount=$amount, currencyId=$currencyId, costFormula=$costFormula, additionalProperties=$additionalProperties}"
    }

    /** The flat price amount and currency, when applicable */
    class Price
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
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * ISO 4217 currency code
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

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

            /**
             * Returns a mutable builder for constructing an instance of [Price].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .currency()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Price]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var currency: JsonField<Currency>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(price: Price) = apply {
                amount = price.amount
                currency = price.currency
                additionalProperties = price.additionalProperties.toMutableMap()
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

            /** ISO 4217 currency code */
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
             * Returns an immutable instance of [Price].
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
            fun build(): Price =
                Price(
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
        fun validate(): Price = apply {
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

            return other is Price &&
                amount == other.amount &&
                currency == other.currency &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, currency, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Price{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
    }

    /** A single tier within a tiered charge */
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
         * Flat price for this tier
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun flatPrice(): Optional<FlatPrice> = flatPrice.getOptional("flatPrice")

        /**
         * Per-unit price in this tier
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unitPrice(): Optional<UnitPrice> = unitPrice.getOptional("unitPrice")

        /**
         * Upper bound of this tier (null for unlimited)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun upTo(): Optional<Double> = upTo.getOptional("upTo")

        /**
         * Returns the raw JSON value of [flatPrice].
         *
         * Unlike [flatPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("flatPrice")
        @ExcludeMissing
        fun _flatPrice(): JsonField<FlatPrice> = flatPrice

        /**
         * Returns the raw JSON value of [unitPrice].
         *
         * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
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

            /** Flat price for this tier */
            fun flatPrice(flatPrice: FlatPrice?) = flatPrice(JsonField.ofNullable(flatPrice))

            /** Alias for calling [Builder.flatPrice] with `flatPrice.orElse(null)`. */
            fun flatPrice(flatPrice: Optional<FlatPrice>) = flatPrice(flatPrice.getOrNull())

            /**
             * Sets [Builder.flatPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.flatPrice] with a well-typed [FlatPrice] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun flatPrice(flatPrice: JsonField<FlatPrice>) = apply { this.flatPrice = flatPrice }

            /** Per-unit price in this tier */
            fun unitPrice(unitPrice: UnitPrice?) = unitPrice(JsonField.ofNullable(unitPrice))

            /** Alias for calling [Builder.unitPrice] with `unitPrice.orElse(null)`. */
            fun unitPrice(unitPrice: Optional<UnitPrice>) = unitPrice(unitPrice.getOrNull())

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [UnitPrice] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<UnitPrice>) = apply { this.unitPrice = unitPrice }

            /** Upper bound of this tier (null for unlimited) */
            fun upTo(upTo: Double?) = upTo(JsonField.ofNullable(upTo))

            /**
             * Alias for [Builder.upTo].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun upTo(upTo: Double) = upTo(upTo as Double?)

            /** Alias for calling [Builder.upTo] with `upTo.orElse(null)`. */
            fun upTo(upTo: Optional<Double>) = upTo(upTo.getOrNull())

            /**
             * Sets [Builder.upTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.upTo] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun upTo(upTo: JsonField<Double>) = apply { this.upTo = upTo }

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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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

        /** Flat price for this tier */
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** ISO 4217 currency code */
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
             * @throws StiggInvalidDataException if any value type in this object doesn't match its
             *   expected type.
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

        /** Per-unit price in this tier */
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** ISO 4217 currency code */
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
             * @throws StiggInvalidDataException if any value type in this object doesn't match its
             *   expected type.
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

    /** Tiered pricing mode (VOLUME or GRADUATED) when the charge is tiered */
    class TiersMode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val VOLUME = of("VOLUME")

            @JvmField val GRADUATED = of("GRADUATED")

            @JvmStatic fun of(value: String) = TiersMode(JsonField.of(value))
        }

        /** An enum containing [TiersMode]'s known values. */
        enum class Known {
            VOLUME,
            GRADUATED,
        }

        /**
         * An enum containing [TiersMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TiersMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VOLUME,
            GRADUATED,
            /**
             * An enum member indicating that [TiersMode] was instantiated with an unknown value.
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
                VOLUME -> Value.VOLUME
                GRADUATED -> Value.GRADUATED
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
                VOLUME -> Known.VOLUME
                GRADUATED -> Known.GRADUATED
                else -> throw StiggInvalidDataException("Unknown TiersMode: $value")
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
        fun validate(): TiersMode = apply {
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

            return other is TiersMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListOverageChargesResponse &&
            id == other.id &&
            billingCadence == other.billingCadence &&
            billingModel == other.billingModel &&
            billingPeriod == other.billingPeriod &&
            createdAt == other.createdAt &&
            billingCountryCode == other.billingCountryCode &&
            billingId == other.billingId &&
            blockSize == other.blockSize &&
            creditGrantCadence == other.creditGrantCadence &&
            creditRate == other.creditRate &&
            crmId == other.crmId &&
            crmLinkUrl == other.crmLinkUrl &&
            featureId == other.featureId &&
            maxUnitQuantity == other.maxUnitQuantity &&
            minUnitQuantity == other.minUnitQuantity &&
            price == other.price &&
            tiers == other.tiers &&
            tiersMode == other.tiersMode &&
            topUpCustomCurrencyId == other.topUpCustomCurrencyId &&
            usedInSubscriptions == other.usedInSubscriptions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            billingCadence,
            billingModel,
            billingPeriod,
            createdAt,
            billingCountryCode,
            billingId,
            blockSize,
            creditGrantCadence,
            creditRate,
            crmId,
            crmLinkUrl,
            featureId,
            maxUnitQuantity,
            minUnitQuantity,
            price,
            tiers,
            tiersMode,
            topUpCustomCurrencyId,
            usedInSubscriptions,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanListOverageChargesResponse{id=$id, billingCadence=$billingCadence, billingModel=$billingModel, billingPeriod=$billingPeriod, createdAt=$createdAt, billingCountryCode=$billingCountryCode, billingId=$billingId, blockSize=$blockSize, creditGrantCadence=$creditGrantCadence, creditRate=$creditRate, crmId=$crmId, crmLinkUrl=$crmLinkUrl, featureId=$featureId, maxUnitQuantity=$maxUnitQuantity, minUnitQuantity=$minUnitQuantity, price=$price, tiers=$tiers, tiersMode=$tiersMode, topUpCustomCurrencyId=$topUpCustomCurrencyId, usedInSubscriptions=$usedInSubscriptions, additionalProperties=$additionalProperties}"
}
