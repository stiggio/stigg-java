// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class SubscriptionPreviewResponse
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
         * Returns a mutable builder for constructing an instance of [SubscriptionPreviewResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionPreviewResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionPreviewResponse: SubscriptionPreviewResponse) = apply {
            data = subscriptionPreviewResponse.data
            additionalProperties = subscriptionPreviewResponse.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [SubscriptionPreviewResponse].
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
        fun build(): SubscriptionPreviewResponse =
            SubscriptionPreviewResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionPreviewResponse = apply {
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

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val immediateInvoice: JsonField<ImmediateInvoice>,
        private val billingPeriodRange: JsonField<BillingPeriodRange>,
        private val freeItems: JsonField<List<FreeItem>>,
        private val hasScheduledUpdates: JsonField<Boolean>,
        private val isPlanDowngrade: JsonField<Boolean>,
        private val recurringInvoice: JsonField<RecurringInvoice>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("immediateInvoice")
            @ExcludeMissing
            immediateInvoice: JsonField<ImmediateInvoice> = JsonMissing.of(),
            @JsonProperty("billingPeriodRange")
            @ExcludeMissing
            billingPeriodRange: JsonField<BillingPeriodRange> = JsonMissing.of(),
            @JsonProperty("freeItems")
            @ExcludeMissing
            freeItems: JsonField<List<FreeItem>> = JsonMissing.of(),
            @JsonProperty("hasScheduledUpdates")
            @ExcludeMissing
            hasScheduledUpdates: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isPlanDowngrade")
            @ExcludeMissing
            isPlanDowngrade: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("recurringInvoice")
            @ExcludeMissing
            recurringInvoice: JsonField<RecurringInvoice> = JsonMissing.of(),
        ) : this(
            immediateInvoice,
            billingPeriodRange,
            freeItems,
            hasScheduledUpdates,
            isPlanDowngrade,
            recurringInvoice,
            mutableMapOf(),
        )

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun immediateInvoice(): ImmediateInvoice = immediateInvoice.getRequired("immediateInvoice")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingPeriodRange(): Optional<BillingPeriodRange> =
            billingPeriodRange.getOptional("billingPeriodRange")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun freeItems(): Optional<List<FreeItem>> = freeItems.getOptional("freeItems")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasScheduledUpdates(): Optional<Boolean> =
            hasScheduledUpdates.getOptional("hasScheduledUpdates")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isPlanDowngrade(): Optional<Boolean> = isPlanDowngrade.getOptional("isPlanDowngrade")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recurringInvoice(): Optional<RecurringInvoice> =
            recurringInvoice.getOptional("recurringInvoice")

        /**
         * Returns the raw JSON value of [immediateInvoice].
         *
         * Unlike [immediateInvoice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("immediateInvoice")
        @ExcludeMissing
        fun _immediateInvoice(): JsonField<ImmediateInvoice> = immediateInvoice

        /**
         * Returns the raw JSON value of [billingPeriodRange].
         *
         * Unlike [billingPeriodRange], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billingPeriodRange")
        @ExcludeMissing
        fun _billingPeriodRange(): JsonField<BillingPeriodRange> = billingPeriodRange

        /**
         * Returns the raw JSON value of [freeItems].
         *
         * Unlike [freeItems], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("freeItems")
        @ExcludeMissing
        fun _freeItems(): JsonField<List<FreeItem>> = freeItems

        /**
         * Returns the raw JSON value of [hasScheduledUpdates].
         *
         * Unlike [hasScheduledUpdates], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hasScheduledUpdates")
        @ExcludeMissing
        fun _hasScheduledUpdates(): JsonField<Boolean> = hasScheduledUpdates

        /**
         * Returns the raw JSON value of [isPlanDowngrade].
         *
         * Unlike [isPlanDowngrade], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("isPlanDowngrade")
        @ExcludeMissing
        fun _isPlanDowngrade(): JsonField<Boolean> = isPlanDowngrade

        /**
         * Returns the raw JSON value of [recurringInvoice].
         *
         * Unlike [recurringInvoice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recurringInvoice")
        @ExcludeMissing
        fun _recurringInvoice(): JsonField<RecurringInvoice> = recurringInvoice

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
             * .immediateInvoice()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var immediateInvoice: JsonField<ImmediateInvoice>? = null
            private var billingPeriodRange: JsonField<BillingPeriodRange> = JsonMissing.of()
            private var freeItems: JsonField<MutableList<FreeItem>>? = null
            private var hasScheduledUpdates: JsonField<Boolean> = JsonMissing.of()
            private var isPlanDowngrade: JsonField<Boolean> = JsonMissing.of()
            private var recurringInvoice: JsonField<RecurringInvoice> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                immediateInvoice = data.immediateInvoice
                billingPeriodRange = data.billingPeriodRange
                freeItems = data.freeItems.map { it.toMutableList() }
                hasScheduledUpdates = data.hasScheduledUpdates
                isPlanDowngrade = data.isPlanDowngrade
                recurringInvoice = data.recurringInvoice
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun immediateInvoice(immediateInvoice: ImmediateInvoice) =
                immediateInvoice(JsonField.of(immediateInvoice))

            /**
             * Sets [Builder.immediateInvoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.immediateInvoice] with a well-typed
             * [ImmediateInvoice] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun immediateInvoice(immediateInvoice: JsonField<ImmediateInvoice>) = apply {
                this.immediateInvoice = immediateInvoice
            }

            fun billingPeriodRange(billingPeriodRange: BillingPeriodRange) =
                billingPeriodRange(JsonField.of(billingPeriodRange))

            /**
             * Sets [Builder.billingPeriodRange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingPeriodRange] with a well-typed
             * [BillingPeriodRange] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun billingPeriodRange(billingPeriodRange: JsonField<BillingPeriodRange>) = apply {
                this.billingPeriodRange = billingPeriodRange
            }

            fun freeItems(freeItems: List<FreeItem>) = freeItems(JsonField.of(freeItems))

            /**
             * Sets [Builder.freeItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freeItems] with a well-typed `List<FreeItem>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freeItems(freeItems: JsonField<List<FreeItem>>) = apply {
                this.freeItems = freeItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [FreeItem] to [freeItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFreeItem(freeItem: FreeItem) = apply {
                freeItems =
                    (freeItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("freeItems", it).add(freeItem)
                    }
            }

            fun hasScheduledUpdates(hasScheduledUpdates: Boolean) =
                hasScheduledUpdates(JsonField.of(hasScheduledUpdates))

            /**
             * Sets [Builder.hasScheduledUpdates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasScheduledUpdates] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hasScheduledUpdates(hasScheduledUpdates: JsonField<Boolean>) = apply {
                this.hasScheduledUpdates = hasScheduledUpdates
            }

            fun isPlanDowngrade(isPlanDowngrade: Boolean) =
                isPlanDowngrade(JsonField.of(isPlanDowngrade))

            /**
             * Sets [Builder.isPlanDowngrade] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isPlanDowngrade] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isPlanDowngrade(isPlanDowngrade: JsonField<Boolean>) = apply {
                this.isPlanDowngrade = isPlanDowngrade
            }

            fun recurringInvoice(recurringInvoice: RecurringInvoice) =
                recurringInvoice(JsonField.of(recurringInvoice))

            /**
             * Sets [Builder.recurringInvoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurringInvoice] with a well-typed
             * [RecurringInvoice] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun recurringInvoice(recurringInvoice: JsonField<RecurringInvoice>) = apply {
                this.recurringInvoice = recurringInvoice
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
             * .immediateInvoice()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("immediateInvoice", immediateInvoice),
                    billingPeriodRange,
                    (freeItems ?: JsonMissing.of()).map { it.toImmutable() },
                    hasScheduledUpdates,
                    isPlanDowngrade,
                    recurringInvoice,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            immediateInvoice().validate()
            billingPeriodRange().ifPresent { it.validate() }
            freeItems().ifPresent { it.forEach { it.validate() } }
            hasScheduledUpdates()
            isPlanDowngrade()
            recurringInvoice().ifPresent { it.validate() }
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
            (immediateInvoice.asKnown().getOrNull()?.validity() ?: 0) +
                (billingPeriodRange.asKnown().getOrNull()?.validity() ?: 0) +
                (freeItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (hasScheduledUpdates.asKnown().isPresent) 1 else 0) +
                (if (isPlanDowngrade.asKnown().isPresent) 1 else 0) +
                (recurringInvoice.asKnown().getOrNull()?.validity() ?: 0)

        class ImmediateInvoice
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val subTotal: JsonField<Double>,
            private val total: JsonField<Double>,
            private val billingPeriodRange: JsonField<BillingPeriodRange>,
            private val currency: JsonField<String>,
            private val discount: JsonField<Double>,
            private val discountDetails: JsonField<DiscountDetails>,
            private val discounts: JsonField<List<Discount>>,
            private val lines: JsonField<List<Line>>,
            private val tax: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("subTotal")
                @ExcludeMissing
                subTotal: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("total") @ExcludeMissing total: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("billingPeriodRange")
                @ExcludeMissing
                billingPeriodRange: JsonField<BillingPeriodRange> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("discount")
                @ExcludeMissing
                discount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("discountDetails")
                @ExcludeMissing
                discountDetails: JsonField<DiscountDetails> = JsonMissing.of(),
                @JsonProperty("discounts")
                @ExcludeMissing
                discounts: JsonField<List<Discount>> = JsonMissing.of(),
                @JsonProperty("lines")
                @ExcludeMissing
                lines: JsonField<List<Line>> = JsonMissing.of(),
                @JsonProperty("tax") @ExcludeMissing tax: JsonField<Double> = JsonMissing.of(),
            ) : this(
                subTotal,
                total,
                billingPeriodRange,
                currency,
                discount,
                discountDetails,
                discounts,
                lines,
                tax,
                mutableMapOf(),
            )

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subTotal(): Double = subTotal.getRequired("subTotal")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun total(): Double = total.getRequired("total")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billingPeriodRange(): Optional<BillingPeriodRange> =
                billingPeriodRange.getOptional("billingPeriodRange")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun discount(): Optional<Double> = discount.getOptional("discount")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun discountDetails(): Optional<DiscountDetails> =
                discountDetails.getOptional("discountDetails")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun discounts(): Optional<List<Discount>> = discounts.getOptional("discounts")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lines(): Optional<List<Line>> = lines.getOptional("lines")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tax(): Optional<Double> = tax.getOptional("tax")

            /**
             * Returns the raw JSON value of [subTotal].
             *
             * Unlike [subTotal], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("subTotal") @ExcludeMissing fun _subTotal(): JsonField<Double> = subTotal

            /**
             * Returns the raw JSON value of [total].
             *
             * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

            /**
             * Returns the raw JSON value of [billingPeriodRange].
             *
             * Unlike [billingPeriodRange], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billingPeriodRange")
            @ExcludeMissing
            fun _billingPeriodRange(): JsonField<BillingPeriodRange> = billingPeriodRange

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [discount].
             *
             * Unlike [discount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Double> = discount

            /**
             * Returns the raw JSON value of [discountDetails].
             *
             * Unlike [discountDetails], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("discountDetails")
            @ExcludeMissing
            fun _discountDetails(): JsonField<DiscountDetails> = discountDetails

            /**
             * Returns the raw JSON value of [discounts].
             *
             * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("discounts")
            @ExcludeMissing
            fun _discounts(): JsonField<List<Discount>> = discounts

            /**
             * Returns the raw JSON value of [lines].
             *
             * Unlike [lines], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lines") @ExcludeMissing fun _lines(): JsonField<List<Line>> = lines

            /**
             * Returns the raw JSON value of [tax].
             *
             * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Double> = tax

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
                 * Returns a mutable builder for constructing an instance of [ImmediateInvoice].
                 *
                 * The following fields are required:
                 * ```java
                 * .subTotal()
                 * .total()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ImmediateInvoice]. */
            class Builder internal constructor() {

                private var subTotal: JsonField<Double>? = null
                private var total: JsonField<Double>? = null
                private var billingPeriodRange: JsonField<BillingPeriodRange> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var discount: JsonField<Double> = JsonMissing.of()
                private var discountDetails: JsonField<DiscountDetails> = JsonMissing.of()
                private var discounts: JsonField<MutableList<Discount>>? = null
                private var lines: JsonField<MutableList<Line>>? = null
                private var tax: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(immediateInvoice: ImmediateInvoice) = apply {
                    subTotal = immediateInvoice.subTotal
                    total = immediateInvoice.total
                    billingPeriodRange = immediateInvoice.billingPeriodRange
                    currency = immediateInvoice.currency
                    discount = immediateInvoice.discount
                    discountDetails = immediateInvoice.discountDetails
                    discounts = immediateInvoice.discounts.map { it.toMutableList() }
                    lines = immediateInvoice.lines.map { it.toMutableList() }
                    tax = immediateInvoice.tax
                    additionalProperties = immediateInvoice.additionalProperties.toMutableMap()
                }

                fun subTotal(subTotal: Double) = subTotal(JsonField.of(subTotal))

                /**
                 * Sets [Builder.subTotal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subTotal] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subTotal(subTotal: JsonField<Double>) = apply { this.subTotal = subTotal }

                fun total(total: Double) = total(JsonField.of(total))

                /**
                 * Sets [Builder.total] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.total] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun total(total: JsonField<Double>) = apply { this.total = total }

                fun billingPeriodRange(billingPeriodRange: BillingPeriodRange) =
                    billingPeriodRange(JsonField.of(billingPeriodRange))

                /**
                 * Sets [Builder.billingPeriodRange] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingPeriodRange] with a well-typed
                 * [BillingPeriodRange] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun billingPeriodRange(billingPeriodRange: JsonField<BillingPeriodRange>) = apply {
                    this.billingPeriodRange = billingPeriodRange
                }

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

                fun discount(discount: Double) = discount(JsonField.of(discount))

                /**
                 * Sets [Builder.discount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun discount(discount: JsonField<Double>) = apply { this.discount = discount }

                fun discountDetails(discountDetails: DiscountDetails) =
                    discountDetails(JsonField.of(discountDetails))

                /**
                 * Sets [Builder.discountDetails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discountDetails] with a well-typed
                 * [DiscountDetails] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun discountDetails(discountDetails: JsonField<DiscountDetails>) = apply {
                    this.discountDetails = discountDetails
                }

                fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

                /**
                 * Sets [Builder.discounts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discounts] with a well-typed `List<Discount>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun discounts(discounts: JsonField<List<Discount>>) = apply {
                    this.discounts = discounts.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Discount] to [discounts].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDiscount(discount: Discount) = apply {
                    discounts =
                        (discounts ?: JsonField.of(mutableListOf())).also {
                            checkKnown("discounts", it).add(discount)
                        }
                }

                fun lines(lines: List<Line>) = lines(JsonField.of(lines))

                /**
                 * Sets [Builder.lines] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lines] with a well-typed `List<Line>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lines(lines: JsonField<List<Line>>) = apply {
                    this.lines = lines.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Line] to [lines].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLine(line: Line) = apply {
                    lines =
                        (lines ?: JsonField.of(mutableListOf())).also {
                            checkKnown("lines", it).add(line)
                        }
                }

                fun tax(tax: Double) = tax(JsonField.of(tax))

                /**
                 * Sets [Builder.tax] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tax] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tax(tax: JsonField<Double>) = apply { this.tax = tax }

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
                 * Returns an immutable instance of [ImmediateInvoice].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .subTotal()
                 * .total()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ImmediateInvoice =
                    ImmediateInvoice(
                        checkRequired("subTotal", subTotal),
                        checkRequired("total", total),
                        billingPeriodRange,
                        currency,
                        discount,
                        discountDetails,
                        (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                        (lines ?: JsonMissing.of()).map { it.toImmutable() },
                        tax,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ImmediateInvoice = apply {
                if (validated) {
                    return@apply
                }

                subTotal()
                total()
                billingPeriodRange().ifPresent { it.validate() }
                currency()
                discount()
                discountDetails().ifPresent { it.validate() }
                discounts().ifPresent { it.forEach { it.validate() } }
                lines().ifPresent { it.forEach { it.validate() } }
                tax()
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
                (if (subTotal.asKnown().isPresent) 1 else 0) +
                    (if (total.asKnown().isPresent) 1 else 0) +
                    (billingPeriodRange.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (currency.asKnown().isPresent) 1 else 0) +
                    (if (discount.asKnown().isPresent) 1 else 0) +
                    (discountDetails.asKnown().getOrNull()?.validity() ?: 0) +
                    (discounts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (lines.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (tax.asKnown().isPresent) 1 else 0)

            class BillingPeriodRange
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val end: JsonField<OffsetDateTime>,
                private val start: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("end")
                    @ExcludeMissing
                    end: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("start")
                    @ExcludeMissing
                    start: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(end, start, mutableMapOf())

                /**
                 * Billing period end date
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun end(): OffsetDateTime = end.getRequired("end")

                /**
                 * Billing period start date
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun start(): OffsetDateTime = start.getRequired("start")

                /**
                 * Returns the raw JSON value of [end].
                 *
                 * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<OffsetDateTime> = end

                /**
                 * Returns the raw JSON value of [start].
                 *
                 * Unlike [start], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("start")
                @ExcludeMissing
                fun _start(): JsonField<OffsetDateTime> = start

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
                     * [BillingPeriodRange].
                     *
                     * The following fields are required:
                     * ```java
                     * .end()
                     * .start()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [BillingPeriodRange]. */
                class Builder internal constructor() {

                    private var end: JsonField<OffsetDateTime>? = null
                    private var start: JsonField<OffsetDateTime>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(billingPeriodRange: BillingPeriodRange) = apply {
                        end = billingPeriodRange.end
                        start = billingPeriodRange.start
                        additionalProperties =
                            billingPeriodRange.additionalProperties.toMutableMap()
                    }

                    /** Billing period end date */
                    fun end(end: OffsetDateTime) = end(JsonField.of(end))

                    /**
                     * Sets [Builder.end] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.end] with a well-typed [OffsetDateTime]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun end(end: JsonField<OffsetDateTime>) = apply { this.end = end }

                    /** Billing period start date */
                    fun start(start: OffsetDateTime) = start(JsonField.of(start))

                    /**
                     * Sets [Builder.start] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.start] with a well-typed [OffsetDateTime]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

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
                     * Returns an immutable instance of [BillingPeriodRange].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .end()
                     * .start()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): BillingPeriodRange =
                        BillingPeriodRange(
                            checkRequired("end", end),
                            checkRequired("start", start),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): BillingPeriodRange = apply {
                    if (validated) {
                        return@apply
                    }

                    end()
                    start()
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
                    (if (end.asKnown().isPresent) 1 else 0) +
                        (if (start.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BillingPeriodRange &&
                        end == other.end &&
                        start == other.start &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(end, start, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BillingPeriodRange{end=$end, start=$start, additionalProperties=$additionalProperties}"
            }

            class DiscountDetails
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val code: JsonField<String>,
                private val fixedAmount: JsonField<Double>,
                private val percentage: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("code")
                    @ExcludeMissing
                    code: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fixedAmount")
                    @ExcludeMissing
                    fixedAmount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("percentage")
                    @ExcludeMissing
                    percentage: JsonField<Double> = JsonMissing.of(),
                ) : this(code, fixedAmount, percentage, mutableMapOf())

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun code(): Optional<String> = code.getOptional("code")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun fixedAmount(): Optional<Double> = fixedAmount.getOptional("fixedAmount")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun percentage(): Optional<Double> = percentage.getOptional("percentage")

                /**
                 * Returns the raw JSON value of [code].
                 *
                 * Unlike [code], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

                /**
                 * Returns the raw JSON value of [fixedAmount].
                 *
                 * Unlike [fixedAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fixedAmount")
                @ExcludeMissing
                fun _fixedAmount(): JsonField<Double> = fixedAmount

                /**
                 * Returns the raw JSON value of [percentage].
                 *
                 * Unlike [percentage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage")
                @ExcludeMissing
                fun _percentage(): JsonField<Double> = percentage

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
                     * Returns a mutable builder for constructing an instance of [DiscountDetails].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [DiscountDetails]. */
                class Builder internal constructor() {

                    private var code: JsonField<String> = JsonMissing.of()
                    private var fixedAmount: JsonField<Double> = JsonMissing.of()
                    private var percentage: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discountDetails: DiscountDetails) = apply {
                        code = discountDetails.code
                        fixedAmount = discountDetails.fixedAmount
                        percentage = discountDetails.percentage
                        additionalProperties = discountDetails.additionalProperties.toMutableMap()
                    }

                    fun code(code: String) = code(JsonField.of(code))

                    /**
                     * Sets [Builder.code] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.code] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun code(code: JsonField<String>) = apply { this.code = code }

                    fun fixedAmount(fixedAmount: Double) = fixedAmount(JsonField.of(fixedAmount))

                    /**
                     * Sets [Builder.fixedAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fixedAmount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fixedAmount(fixedAmount: JsonField<Double>) = apply {
                        this.fixedAmount = fixedAmount
                    }

                    fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

                    /**
                     * Sets [Builder.percentage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentage] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun percentage(percentage: JsonField<Double>) = apply {
                        this.percentage = percentage
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
                     * Returns an immutable instance of [DiscountDetails].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): DiscountDetails =
                        DiscountDetails(
                            code,
                            fixedAmount,
                            percentage,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): DiscountDetails = apply {
                    if (validated) {
                        return@apply
                    }

                    code()
                    fixedAmount()
                    percentage()
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
                    (if (code.asKnown().isPresent) 1 else 0) +
                        (if (fixedAmount.asKnown().isPresent) 1 else 0) +
                        (if (percentage.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DiscountDetails &&
                        code == other.code &&
                        fixedAmount == other.fixedAmount &&
                        percentage == other.percentage &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(code, fixedAmount, percentage, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DiscountDetails{code=$code, fixedAmount=$fixedAmount, percentage=$percentage, additionalProperties=$additionalProperties}"
            }

            class Discount
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val currency: JsonField<String>,
                private val description: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, description, mutableMapOf())

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun description(): String = description.getRequired("description")

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
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

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
                     * Returns a mutable builder for constructing an instance of [Discount].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * .description()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Discount]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var currency: JsonField<String>? = null
                    private var description: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        amount = discount.amount
                        currency = discount.currency
                        description = discount.description
                        additionalProperties = discount.additionalProperties.toMutableMap()
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

                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
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
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * .description()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Discount =
                        Discount(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            checkRequired("description", description),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Discount = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
                    description()
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
                        (if (currency.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        amount == other.amount &&
                        currency == other.currency &&
                        description == other.description &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, description, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Discount{amount=$amount, currency=$currency, description=$description, additionalProperties=$additionalProperties}"
            }

            class Line
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val currency: JsonField<String>,
                private val description: JsonField<String>,
                private val subTotal: JsonField<Double>,
                private val unitPrice: JsonField<Double>,
                private val quantity: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("subTotal")
                    @ExcludeMissing
                    subTotal: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unitPrice")
                    @ExcludeMissing
                    unitPrice: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                ) : this(currency, description, subTotal, unitPrice, quantity, mutableMapOf())

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun description(): String = description.getRequired("description")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun subTotal(): Double = subTotal.getRequired("subTotal")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun unitPrice(): Double = unitPrice.getRequired("unitPrice")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun quantity(): Optional<Double> = quantity.getOptional("quantity")

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [subTotal].
                 *
                 * Unlike [subTotal], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("subTotal")
                @ExcludeMissing
                fun _subTotal(): JsonField<Double> = subTotal

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unitPrice")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

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
                     * Returns a mutable builder for constructing an instance of [Line].
                     *
                     * The following fields are required:
                     * ```java
                     * .currency()
                     * .description()
                     * .subTotal()
                     * .unitPrice()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Line]. */
                class Builder internal constructor() {

                    private var currency: JsonField<String>? = null
                    private var description: JsonField<String>? = null
                    private var subTotal: JsonField<Double>? = null
                    private var unitPrice: JsonField<Double>? = null
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(line: Line) = apply {
                        currency = line.currency
                        description = line.description
                        subTotal = line.subTotal
                        unitPrice = line.unitPrice
                        quantity = line.quantity
                        additionalProperties = line.additionalProperties.toMutableMap()
                    }

                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    fun subTotal(subTotal: Double) = subTotal(JsonField.of(subTotal))

                    /**
                     * Sets [Builder.subTotal] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subTotal] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun subTotal(subTotal: JsonField<Double>) = apply { this.subTotal = subTotal }

                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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
                     * Returns an immutable instance of [Line].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .currency()
                     * .description()
                     * .subTotal()
                     * .unitPrice()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Line =
                        Line(
                            checkRequired("currency", currency),
                            checkRequired("description", description),
                            checkRequired("subTotal", subTotal),
                            checkRequired("unitPrice", unitPrice),
                            quantity,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Line = apply {
                    if (validated) {
                        return@apply
                    }

                    currency()
                    description()
                    subTotal()
                    unitPrice()
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
                    (if (currency.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (if (subTotal.asKnown().isPresent) 1 else 0) +
                        (if (unitPrice.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Line &&
                        currency == other.currency &&
                        description == other.description &&
                        subTotal == other.subTotal &&
                        unitPrice == other.unitPrice &&
                        quantity == other.quantity &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        currency,
                        description,
                        subTotal,
                        unitPrice,
                        quantity,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Line{currency=$currency, description=$description, subTotal=$subTotal, unitPrice=$unitPrice, quantity=$quantity, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ImmediateInvoice &&
                    subTotal == other.subTotal &&
                    total == other.total &&
                    billingPeriodRange == other.billingPeriodRange &&
                    currency == other.currency &&
                    discount == other.discount &&
                    discountDetails == other.discountDetails &&
                    discounts == other.discounts &&
                    lines == other.lines &&
                    tax == other.tax &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    subTotal,
                    total,
                    billingPeriodRange,
                    currency,
                    discount,
                    discountDetails,
                    discounts,
                    lines,
                    tax,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ImmediateInvoice{subTotal=$subTotal, total=$total, billingPeriodRange=$billingPeriodRange, currency=$currency, discount=$discount, discountDetails=$discountDetails, discounts=$discounts, lines=$lines, tax=$tax, additionalProperties=$additionalProperties}"
        }

        class BillingPeriodRange
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val end: JsonField<OffsetDateTime>,
            private val start: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("end")
                @ExcludeMissing
                end: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("start")
                @ExcludeMissing
                start: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(end, start, mutableMapOf())

            /**
             * Billing period end date
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun end(): Optional<OffsetDateTime> = end.getOptional("end")

            /**
             * Billing period start date
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun start(): Optional<OffsetDateTime> = start.getOptional("start")

            /**
             * Returns the raw JSON value of [end].
             *
             * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<OffsetDateTime> = end

            /**
             * Returns the raw JSON value of [start].
             *
             * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<OffsetDateTime> = start

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
                 * Returns a mutable builder for constructing an instance of [BillingPeriodRange].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BillingPeriodRange]. */
            class Builder internal constructor() {

                private var end: JsonField<OffsetDateTime> = JsonMissing.of()
                private var start: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(billingPeriodRange: BillingPeriodRange) = apply {
                    end = billingPeriodRange.end
                    start = billingPeriodRange.start
                    additionalProperties = billingPeriodRange.additionalProperties.toMutableMap()
                }

                /** Billing period end date */
                fun end(end: OffsetDateTime) = end(JsonField.of(end))

                /**
                 * Sets [Builder.end] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.end] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun end(end: JsonField<OffsetDateTime>) = apply { this.end = end }

                /** Billing period start date */
                fun start(start: OffsetDateTime) = start(JsonField.of(start))

                /**
                 * Sets [Builder.start] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

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
                 * Returns an immutable instance of [BillingPeriodRange].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): BillingPeriodRange =
                    BillingPeriodRange(end, start, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): BillingPeriodRange = apply {
                if (validated) {
                    return@apply
                }

                end()
                start()
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
                (if (end.asKnown().isPresent) 1 else 0) + (if (start.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillingPeriodRange &&
                    end == other.end &&
                    start == other.start &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(end, start, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingPeriodRange{end=$end, start=$start, additionalProperties=$additionalProperties}"
        }

        class FreeItem
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val addonId: JsonField<String>,
            private val quantity: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("addonId")
                @ExcludeMissing
                addonId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
            ) : this(addonId, quantity, mutableMapOf())

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun addonId(): String = addonId.getRequired("addonId")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [FreeItem].
                 *
                 * The following fields are required:
                 * ```java
                 * .addonId()
                 * .quantity()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FreeItem]. */
            class Builder internal constructor() {

                private var addonId: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(freeItem: FreeItem) = apply {
                    addonId = freeItem.addonId
                    quantity = freeItem.quantity
                    additionalProperties = freeItem.additionalProperties.toMutableMap()
                }

                fun addonId(addonId: String) = addonId(JsonField.of(addonId))

                /**
                 * Sets [Builder.addonId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.addonId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun addonId(addonId: JsonField<String>) = apply { this.addonId = addonId }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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
                 * Returns an immutable instance of [FreeItem].
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
                fun build(): FreeItem =
                    FreeItem(
                        checkRequired("addonId", addonId),
                        checkRequired("quantity", quantity),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FreeItem = apply {
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

                return other is FreeItem &&
                    addonId == other.addonId &&
                    quantity == other.quantity &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(addonId, quantity, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FreeItem{addonId=$addonId, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        class RecurringInvoice
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val subTotal: JsonField<Double>,
            private val total: JsonField<Double>,
            private val billingPeriodRange: JsonField<BillingPeriodRange>,
            private val currency: JsonField<String>,
            private val discount: JsonField<Double>,
            private val discountDetails: JsonField<DiscountDetails>,
            private val discounts: JsonField<List<Discount>>,
            private val lines: JsonField<List<Line>>,
            private val tax: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("subTotal")
                @ExcludeMissing
                subTotal: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("total") @ExcludeMissing total: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("billingPeriodRange")
                @ExcludeMissing
                billingPeriodRange: JsonField<BillingPeriodRange> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("discount")
                @ExcludeMissing
                discount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("discountDetails")
                @ExcludeMissing
                discountDetails: JsonField<DiscountDetails> = JsonMissing.of(),
                @JsonProperty("discounts")
                @ExcludeMissing
                discounts: JsonField<List<Discount>> = JsonMissing.of(),
                @JsonProperty("lines")
                @ExcludeMissing
                lines: JsonField<List<Line>> = JsonMissing.of(),
                @JsonProperty("tax") @ExcludeMissing tax: JsonField<Double> = JsonMissing.of(),
            ) : this(
                subTotal,
                total,
                billingPeriodRange,
                currency,
                discount,
                discountDetails,
                discounts,
                lines,
                tax,
                mutableMapOf(),
            )

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subTotal(): Double = subTotal.getRequired("subTotal")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun total(): Double = total.getRequired("total")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billingPeriodRange(): Optional<BillingPeriodRange> =
                billingPeriodRange.getOptional("billingPeriodRange")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun discount(): Optional<Double> = discount.getOptional("discount")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun discountDetails(): Optional<DiscountDetails> =
                discountDetails.getOptional("discountDetails")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun discounts(): Optional<List<Discount>> = discounts.getOptional("discounts")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lines(): Optional<List<Line>> = lines.getOptional("lines")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tax(): Optional<Double> = tax.getOptional("tax")

            /**
             * Returns the raw JSON value of [subTotal].
             *
             * Unlike [subTotal], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("subTotal") @ExcludeMissing fun _subTotal(): JsonField<Double> = subTotal

            /**
             * Returns the raw JSON value of [total].
             *
             * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

            /**
             * Returns the raw JSON value of [billingPeriodRange].
             *
             * Unlike [billingPeriodRange], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billingPeriodRange")
            @ExcludeMissing
            fun _billingPeriodRange(): JsonField<BillingPeriodRange> = billingPeriodRange

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [discount].
             *
             * Unlike [discount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Double> = discount

            /**
             * Returns the raw JSON value of [discountDetails].
             *
             * Unlike [discountDetails], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("discountDetails")
            @ExcludeMissing
            fun _discountDetails(): JsonField<DiscountDetails> = discountDetails

            /**
             * Returns the raw JSON value of [discounts].
             *
             * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("discounts")
            @ExcludeMissing
            fun _discounts(): JsonField<List<Discount>> = discounts

            /**
             * Returns the raw JSON value of [lines].
             *
             * Unlike [lines], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lines") @ExcludeMissing fun _lines(): JsonField<List<Line>> = lines

            /**
             * Returns the raw JSON value of [tax].
             *
             * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Double> = tax

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
                 * Returns a mutable builder for constructing an instance of [RecurringInvoice].
                 *
                 * The following fields are required:
                 * ```java
                 * .subTotal()
                 * .total()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RecurringInvoice]. */
            class Builder internal constructor() {

                private var subTotal: JsonField<Double>? = null
                private var total: JsonField<Double>? = null
                private var billingPeriodRange: JsonField<BillingPeriodRange> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var discount: JsonField<Double> = JsonMissing.of()
                private var discountDetails: JsonField<DiscountDetails> = JsonMissing.of()
                private var discounts: JsonField<MutableList<Discount>>? = null
                private var lines: JsonField<MutableList<Line>>? = null
                private var tax: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(recurringInvoice: RecurringInvoice) = apply {
                    subTotal = recurringInvoice.subTotal
                    total = recurringInvoice.total
                    billingPeriodRange = recurringInvoice.billingPeriodRange
                    currency = recurringInvoice.currency
                    discount = recurringInvoice.discount
                    discountDetails = recurringInvoice.discountDetails
                    discounts = recurringInvoice.discounts.map { it.toMutableList() }
                    lines = recurringInvoice.lines.map { it.toMutableList() }
                    tax = recurringInvoice.tax
                    additionalProperties = recurringInvoice.additionalProperties.toMutableMap()
                }

                fun subTotal(subTotal: Double) = subTotal(JsonField.of(subTotal))

                /**
                 * Sets [Builder.subTotal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subTotal] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subTotal(subTotal: JsonField<Double>) = apply { this.subTotal = subTotal }

                fun total(total: Double) = total(JsonField.of(total))

                /**
                 * Sets [Builder.total] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.total] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun total(total: JsonField<Double>) = apply { this.total = total }

                fun billingPeriodRange(billingPeriodRange: BillingPeriodRange) =
                    billingPeriodRange(JsonField.of(billingPeriodRange))

                /**
                 * Sets [Builder.billingPeriodRange] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingPeriodRange] with a well-typed
                 * [BillingPeriodRange] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun billingPeriodRange(billingPeriodRange: JsonField<BillingPeriodRange>) = apply {
                    this.billingPeriodRange = billingPeriodRange
                }

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

                fun discount(discount: Double) = discount(JsonField.of(discount))

                /**
                 * Sets [Builder.discount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun discount(discount: JsonField<Double>) = apply { this.discount = discount }

                fun discountDetails(discountDetails: DiscountDetails) =
                    discountDetails(JsonField.of(discountDetails))

                /**
                 * Sets [Builder.discountDetails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discountDetails] with a well-typed
                 * [DiscountDetails] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun discountDetails(discountDetails: JsonField<DiscountDetails>) = apply {
                    this.discountDetails = discountDetails
                }

                fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

                /**
                 * Sets [Builder.discounts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discounts] with a well-typed `List<Discount>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun discounts(discounts: JsonField<List<Discount>>) = apply {
                    this.discounts = discounts.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Discount] to [discounts].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDiscount(discount: Discount) = apply {
                    discounts =
                        (discounts ?: JsonField.of(mutableListOf())).also {
                            checkKnown("discounts", it).add(discount)
                        }
                }

                fun lines(lines: List<Line>) = lines(JsonField.of(lines))

                /**
                 * Sets [Builder.lines] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lines] with a well-typed `List<Line>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lines(lines: JsonField<List<Line>>) = apply {
                    this.lines = lines.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Line] to [lines].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLine(line: Line) = apply {
                    lines =
                        (lines ?: JsonField.of(mutableListOf())).also {
                            checkKnown("lines", it).add(line)
                        }
                }

                fun tax(tax: Double) = tax(JsonField.of(tax))

                /**
                 * Sets [Builder.tax] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tax] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tax(tax: JsonField<Double>) = apply { this.tax = tax }

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
                 * Returns an immutable instance of [RecurringInvoice].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .subTotal()
                 * .total()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RecurringInvoice =
                    RecurringInvoice(
                        checkRequired("subTotal", subTotal),
                        checkRequired("total", total),
                        billingPeriodRange,
                        currency,
                        discount,
                        discountDetails,
                        (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                        (lines ?: JsonMissing.of()).map { it.toImmutable() },
                        tax,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RecurringInvoice = apply {
                if (validated) {
                    return@apply
                }

                subTotal()
                total()
                billingPeriodRange().ifPresent { it.validate() }
                currency()
                discount()
                discountDetails().ifPresent { it.validate() }
                discounts().ifPresent { it.forEach { it.validate() } }
                lines().ifPresent { it.forEach { it.validate() } }
                tax()
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
                (if (subTotal.asKnown().isPresent) 1 else 0) +
                    (if (total.asKnown().isPresent) 1 else 0) +
                    (billingPeriodRange.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (currency.asKnown().isPresent) 1 else 0) +
                    (if (discount.asKnown().isPresent) 1 else 0) +
                    (discountDetails.asKnown().getOrNull()?.validity() ?: 0) +
                    (discounts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (lines.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (tax.asKnown().isPresent) 1 else 0)

            class BillingPeriodRange
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val end: JsonField<OffsetDateTime>,
                private val start: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("end")
                    @ExcludeMissing
                    end: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("start")
                    @ExcludeMissing
                    start: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(end, start, mutableMapOf())

                /**
                 * Billing period end date
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun end(): OffsetDateTime = end.getRequired("end")

                /**
                 * Billing period start date
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun start(): OffsetDateTime = start.getRequired("start")

                /**
                 * Returns the raw JSON value of [end].
                 *
                 * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<OffsetDateTime> = end

                /**
                 * Returns the raw JSON value of [start].
                 *
                 * Unlike [start], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("start")
                @ExcludeMissing
                fun _start(): JsonField<OffsetDateTime> = start

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
                     * [BillingPeriodRange].
                     *
                     * The following fields are required:
                     * ```java
                     * .end()
                     * .start()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [BillingPeriodRange]. */
                class Builder internal constructor() {

                    private var end: JsonField<OffsetDateTime>? = null
                    private var start: JsonField<OffsetDateTime>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(billingPeriodRange: BillingPeriodRange) = apply {
                        end = billingPeriodRange.end
                        start = billingPeriodRange.start
                        additionalProperties =
                            billingPeriodRange.additionalProperties.toMutableMap()
                    }

                    /** Billing period end date */
                    fun end(end: OffsetDateTime) = end(JsonField.of(end))

                    /**
                     * Sets [Builder.end] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.end] with a well-typed [OffsetDateTime]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun end(end: JsonField<OffsetDateTime>) = apply { this.end = end }

                    /** Billing period start date */
                    fun start(start: OffsetDateTime) = start(JsonField.of(start))

                    /**
                     * Sets [Builder.start] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.start] with a well-typed [OffsetDateTime]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

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
                     * Returns an immutable instance of [BillingPeriodRange].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .end()
                     * .start()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): BillingPeriodRange =
                        BillingPeriodRange(
                            checkRequired("end", end),
                            checkRequired("start", start),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): BillingPeriodRange = apply {
                    if (validated) {
                        return@apply
                    }

                    end()
                    start()
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
                    (if (end.asKnown().isPresent) 1 else 0) +
                        (if (start.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BillingPeriodRange &&
                        end == other.end &&
                        start == other.start &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(end, start, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BillingPeriodRange{end=$end, start=$start, additionalProperties=$additionalProperties}"
            }

            class DiscountDetails
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val code: JsonField<String>,
                private val fixedAmount: JsonField<Double>,
                private val percentage: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("code")
                    @ExcludeMissing
                    code: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fixedAmount")
                    @ExcludeMissing
                    fixedAmount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("percentage")
                    @ExcludeMissing
                    percentage: JsonField<Double> = JsonMissing.of(),
                ) : this(code, fixedAmount, percentage, mutableMapOf())

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun code(): Optional<String> = code.getOptional("code")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun fixedAmount(): Optional<Double> = fixedAmount.getOptional("fixedAmount")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun percentage(): Optional<Double> = percentage.getOptional("percentage")

                /**
                 * Returns the raw JSON value of [code].
                 *
                 * Unlike [code], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

                /**
                 * Returns the raw JSON value of [fixedAmount].
                 *
                 * Unlike [fixedAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fixedAmount")
                @ExcludeMissing
                fun _fixedAmount(): JsonField<Double> = fixedAmount

                /**
                 * Returns the raw JSON value of [percentage].
                 *
                 * Unlike [percentage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage")
                @ExcludeMissing
                fun _percentage(): JsonField<Double> = percentage

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
                     * Returns a mutable builder for constructing an instance of [DiscountDetails].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [DiscountDetails]. */
                class Builder internal constructor() {

                    private var code: JsonField<String> = JsonMissing.of()
                    private var fixedAmount: JsonField<Double> = JsonMissing.of()
                    private var percentage: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discountDetails: DiscountDetails) = apply {
                        code = discountDetails.code
                        fixedAmount = discountDetails.fixedAmount
                        percentage = discountDetails.percentage
                        additionalProperties = discountDetails.additionalProperties.toMutableMap()
                    }

                    fun code(code: String) = code(JsonField.of(code))

                    /**
                     * Sets [Builder.code] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.code] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun code(code: JsonField<String>) = apply { this.code = code }

                    fun fixedAmount(fixedAmount: Double) = fixedAmount(JsonField.of(fixedAmount))

                    /**
                     * Sets [Builder.fixedAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fixedAmount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fixedAmount(fixedAmount: JsonField<Double>) = apply {
                        this.fixedAmount = fixedAmount
                    }

                    fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

                    /**
                     * Sets [Builder.percentage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentage] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun percentage(percentage: JsonField<Double>) = apply {
                        this.percentage = percentage
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
                     * Returns an immutable instance of [DiscountDetails].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): DiscountDetails =
                        DiscountDetails(
                            code,
                            fixedAmount,
                            percentage,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): DiscountDetails = apply {
                    if (validated) {
                        return@apply
                    }

                    code()
                    fixedAmount()
                    percentage()
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
                    (if (code.asKnown().isPresent) 1 else 0) +
                        (if (fixedAmount.asKnown().isPresent) 1 else 0) +
                        (if (percentage.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DiscountDetails &&
                        code == other.code &&
                        fixedAmount == other.fixedAmount &&
                        percentage == other.percentage &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(code, fixedAmount, percentage, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DiscountDetails{code=$code, fixedAmount=$fixedAmount, percentage=$percentage, additionalProperties=$additionalProperties}"
            }

            class Discount
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val currency: JsonField<String>,
                private val description: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, description, mutableMapOf())

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun description(): String = description.getRequired("description")

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
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

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
                     * Returns a mutable builder for constructing an instance of [Discount].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * .description()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Discount]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var currency: JsonField<String>? = null
                    private var description: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        amount = discount.amount
                        currency = discount.currency
                        description = discount.description
                        additionalProperties = discount.additionalProperties.toMutableMap()
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

                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
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
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * .description()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Discount =
                        Discount(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            checkRequired("description", description),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Discount = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
                    description()
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
                        (if (currency.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        amount == other.amount &&
                        currency == other.currency &&
                        description == other.description &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, description, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Discount{amount=$amount, currency=$currency, description=$description, additionalProperties=$additionalProperties}"
            }

            class Line
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val currency: JsonField<String>,
                private val description: JsonField<String>,
                private val subTotal: JsonField<Double>,
                private val unitPrice: JsonField<Double>,
                private val quantity: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("subTotal")
                    @ExcludeMissing
                    subTotal: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unitPrice")
                    @ExcludeMissing
                    unitPrice: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                ) : this(currency, description, subTotal, unitPrice, quantity, mutableMapOf())

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun description(): String = description.getRequired("description")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun subTotal(): Double = subTotal.getRequired("subTotal")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun unitPrice(): Double = unitPrice.getRequired("unitPrice")

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun quantity(): Optional<Double> = quantity.getOptional("quantity")

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [subTotal].
                 *
                 * Unlike [subTotal], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("subTotal")
                @ExcludeMissing
                fun _subTotal(): JsonField<Double> = subTotal

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unitPrice")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

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
                     * Returns a mutable builder for constructing an instance of [Line].
                     *
                     * The following fields are required:
                     * ```java
                     * .currency()
                     * .description()
                     * .subTotal()
                     * .unitPrice()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Line]. */
                class Builder internal constructor() {

                    private var currency: JsonField<String>? = null
                    private var description: JsonField<String>? = null
                    private var subTotal: JsonField<Double>? = null
                    private var unitPrice: JsonField<Double>? = null
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(line: Line) = apply {
                        currency = line.currency
                        description = line.description
                        subTotal = line.subTotal
                        unitPrice = line.unitPrice
                        quantity = line.quantity
                        additionalProperties = line.additionalProperties.toMutableMap()
                    }

                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    fun subTotal(subTotal: Double) = subTotal(JsonField.of(subTotal))

                    /**
                     * Sets [Builder.subTotal] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subTotal] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun subTotal(subTotal: JsonField<Double>) = apply { this.subTotal = subTotal }

                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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
                     * Returns an immutable instance of [Line].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .currency()
                     * .description()
                     * .subTotal()
                     * .unitPrice()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Line =
                        Line(
                            checkRequired("currency", currency),
                            checkRequired("description", description),
                            checkRequired("subTotal", subTotal),
                            checkRequired("unitPrice", unitPrice),
                            quantity,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Line = apply {
                    if (validated) {
                        return@apply
                    }

                    currency()
                    description()
                    subTotal()
                    unitPrice()
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
                    (if (currency.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (if (subTotal.asKnown().isPresent) 1 else 0) +
                        (if (unitPrice.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Line &&
                        currency == other.currency &&
                        description == other.description &&
                        subTotal == other.subTotal &&
                        unitPrice == other.unitPrice &&
                        quantity == other.quantity &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        currency,
                        description,
                        subTotal,
                        unitPrice,
                        quantity,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Line{currency=$currency, description=$description, subTotal=$subTotal, unitPrice=$unitPrice, quantity=$quantity, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RecurringInvoice &&
                    subTotal == other.subTotal &&
                    total == other.total &&
                    billingPeriodRange == other.billingPeriodRange &&
                    currency == other.currency &&
                    discount == other.discount &&
                    discountDetails == other.discountDetails &&
                    discounts == other.discounts &&
                    lines == other.lines &&
                    tax == other.tax &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    subTotal,
                    total,
                    billingPeriodRange,
                    currency,
                    discount,
                    discountDetails,
                    discounts,
                    lines,
                    tax,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RecurringInvoice{subTotal=$subTotal, total=$total, billingPeriodRange=$billingPeriodRange, currency=$currency, discount=$discount, discountDetails=$discountDetails, discounts=$discounts, lines=$lines, tax=$tax, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                immediateInvoice == other.immediateInvoice &&
                billingPeriodRange == other.billingPeriodRange &&
                freeItems == other.freeItems &&
                hasScheduledUpdates == other.hasScheduledUpdates &&
                isPlanDowngrade == other.isPlanDowngrade &&
                recurringInvoice == other.recurringInvoice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                immediateInvoice,
                billingPeriodRange,
                freeItems,
                hasScheduledUpdates,
                isPlanDowngrade,
                recurringInvoice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{immediateInvoice=$immediateInvoice, billingPeriodRange=$billingPeriodRange, freeItems=$freeItems, hasScheduledUpdates=$hasScheduledUpdates, isPlanDowngrade=$isPlanDowngrade, recurringInvoice=$recurringInvoice, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionPreviewResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionPreviewResponse{data=$data, additionalProperties=$additionalProperties}"
}
