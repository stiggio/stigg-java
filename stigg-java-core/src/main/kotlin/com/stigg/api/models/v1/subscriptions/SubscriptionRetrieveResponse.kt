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
import com.stigg.api.core.checkRequired
import com.stigg.api.core.toImmutable
import com.stigg.api.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SubscriptionRetrieveResponse
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
         * Returns a mutable builder for constructing an instance of [SubscriptionRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionRetrieveResponse: SubscriptionRetrieveResponse) = apply {
            data = subscriptionRetrieveResponse.data
            additionalProperties = subscriptionRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SubscriptionRetrieveResponse].
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
        fun build(): SubscriptionRetrieveResponse =
            SubscriptionRetrieveResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionRetrieveResponse = apply {
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
        private val id: JsonField<String>,
        private val billingId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val customerId: JsonField<String>,
        private val paymentCollection: JsonField<PaymentCollection>,
        private val planId: JsonField<String>,
        private val pricingType: JsonField<PricingType>,
        private val startDate: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val cancellationDate: JsonField<OffsetDateTime>,
        private val cancelReason: JsonField<CancelReason>,
        private val currentBillingPeriodEnd: JsonField<OffsetDateTime>,
        private val currentBillingPeriodStart: JsonField<OffsetDateTime>,
        private val effectiveEndDate: JsonField<OffsetDateTime>,
        private val endDate: JsonField<OffsetDateTime>,
        private val metadata: JsonField<Metadata>,
        private val payingCustomerId: JsonField<String>,
        private val paymentCollectionMethod: JsonField<PaymentCollectionMethod>,
        private val resourceId: JsonField<String>,
        private val trialEndDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billingId")
            @ExcludeMissing
            billingId: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("cancellationDate")
            @ExcludeMissing
            cancellationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("cancelReason")
            @ExcludeMissing
            cancelReason: JsonField<CancelReason> = JsonMissing.of(),
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
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("payingCustomerId")
            @ExcludeMissing
            payingCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentCollectionMethod")
            @ExcludeMissing
            paymentCollectionMethod: JsonField<PaymentCollectionMethod> = JsonMissing.of(),
            @JsonProperty("resourceId")
            @ExcludeMissing
            resourceId: JsonField<String> = JsonMissing.of(),
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
            cancellationDate,
            cancelReason,
            currentBillingPeriodEnd,
            currentBillingPeriodStart,
            effectiveEndDate,
            endDate,
            metadata,
            payingCustomerId,
            paymentCollectionMethod,
            resourceId,
            trialEndDate,
            mutableMapOf(),
        )

        /**
         * Subscription ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * Customer ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customerId")

        /**
         * Payment collection
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentCollection(): PaymentCollection =
            paymentCollection.getRequired("paymentCollection")

        /**
         * Plan ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun planId(): String = planId.getRequired("planId")

        /**
         * Pricing type
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pricingType(): PricingType = pricingType.getRequired("pricingType")

        /**
         * Subscription start date
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

        /**
         * Subscription status
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

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
         * Additional metadata for the subscription
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

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
         * Resource ID
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resourceId(): Optional<String> = resourceId.getOptional("resourceId")

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
        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

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
         * Unlike [cancelReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cancelReason")
        @ExcludeMissing
        fun _cancelReason(): JsonField<CancelReason> = cancelReason

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
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
         * Returns the raw JSON value of [resourceId].
         *
         * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resourceId")
        @ExcludeMissing
        fun _resourceId(): JsonField<String> = resourceId

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
             * Returns a mutable builder for constructing an instance of [Data].
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

        /** A builder for [Data]. */
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
            private var cancellationDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cancelReason: JsonField<CancelReason> = JsonMissing.of()
            private var currentBillingPeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currentBillingPeriodStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var effectiveEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var payingCustomerId: JsonField<String> = JsonMissing.of()
            private var paymentCollectionMethod: JsonField<PaymentCollectionMethod> =
                JsonMissing.of()
            private var resourceId: JsonField<String> = JsonMissing.of()
            private var trialEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                billingId = data.billingId
                createdAt = data.createdAt
                customerId = data.customerId
                paymentCollection = data.paymentCollection
                planId = data.planId
                pricingType = data.pricingType
                startDate = data.startDate
                status = data.status
                cancellationDate = data.cancellationDate
                cancelReason = data.cancelReason
                currentBillingPeriodEnd = data.currentBillingPeriodEnd
                currentBillingPeriodStart = data.currentBillingPeriodStart
                effectiveEndDate = data.effectiveEndDate
                endDate = data.endDate
                metadata = data.metadata
                payingCustomerId = data.payingCustomerId
                paymentCollectionMethod = data.paymentCollectionMethod
                resourceId = data.resourceId
                trialEndDate = data.trialEndDate
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Subscription ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
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

            /** Payment collection */
            fun paymentCollection(paymentCollection: PaymentCollection) =
                paymentCollection(JsonField.of(paymentCollection))

            /**
             * Sets [Builder.paymentCollection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentCollection] with a well-typed
             * [PaymentCollection] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun paymentCollection(paymentCollection: JsonField<PaymentCollection>) = apply {
                this.paymentCollection = paymentCollection
            }

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
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** Subscription status */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Subscription cancellation date */
            fun cancellationDate(cancellationDate: OffsetDateTime?) =
                cancellationDate(JsonField.ofNullable(cancellationDate))

            /**
             * Alias for calling [Builder.cancellationDate] with `cancellationDate.orElse(null)`.
             */
            fun cancellationDate(cancellationDate: Optional<OffsetDateTime>) =
                cancellationDate(cancellationDate.getOrNull())

            /**
             * Sets [Builder.cancellationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancellationDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
            fun currentBillingPeriodEnd(currentBillingPeriodEnd: JsonField<OffsetDateTime>) =
                apply {
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

            /**
             * Alias for calling [Builder.effectiveEndDate] with `effectiveEndDate.orElse(null)`.
             */
            fun effectiveEndDate(effectiveEndDate: Optional<OffsetDateTime>) =
                effectiveEndDate(effectiveEndDate.getOrNull())

            /**
             * Sets [Builder.effectiveEndDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveEndDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Paying customer ID for delegated billing */
            fun payingCustomerId(payingCustomerId: String?) =
                payingCustomerId(JsonField.ofNullable(payingCustomerId))

            /**
             * Alias for calling [Builder.payingCustomerId] with `payingCustomerId.orElse(null)`.
             */
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
            fun paymentCollectionMethod(
                paymentCollectionMethod: Optional<PaymentCollectionMethod>
            ) = paymentCollectionMethod(paymentCollectionMethod.getOrNull())

            /**
             * Sets [Builder.paymentCollectionMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentCollectionMethod] with a well-typed
             * [PaymentCollectionMethod] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun paymentCollectionMethod(
                paymentCollectionMethod: JsonField<PaymentCollectionMethod>
            ) = apply { this.paymentCollectionMethod = paymentCollectionMethod }

            /** Resource ID */
            fun resourceId(resourceId: String?) = resourceId(JsonField.ofNullable(resourceId))

            /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
            fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

            /**
             * Sets [Builder.resourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resourceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

            /** Subscription trial end date */
            fun trialEndDate(trialEndDate: OffsetDateTime?) =
                trialEndDate(JsonField.ofNullable(trialEndDate))

            /** Alias for calling [Builder.trialEndDate] with `trialEndDate.orElse(null)`. */
            fun trialEndDate(trialEndDate: Optional<OffsetDateTime>) =
                trialEndDate(trialEndDate.getOrNull())

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
             * Returns an immutable instance of [Data].
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
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("billingId", billingId),
                    checkRequired("createdAt", createdAt),
                    checkRequired("customerId", customerId),
                    checkRequired("paymentCollection", paymentCollection),
                    checkRequired("planId", planId),
                    checkRequired("pricingType", pricingType),
                    checkRequired("startDate", startDate),
                    checkRequired("status", status),
                    cancellationDate,
                    cancelReason,
                    currentBillingPeriodEnd,
                    currentBillingPeriodStart,
                    effectiveEndDate,
                    endDate,
                    metadata,
                    payingCustomerId,
                    paymentCollectionMethod,
                    resourceId,
                    trialEndDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
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
            cancellationDate()
            cancelReason().ifPresent { it.validate() }
            currentBillingPeriodEnd()
            currentBillingPeriodStart()
            effectiveEndDate()
            endDate()
            metadata().ifPresent { it.validate() }
            payingCustomerId()
            paymentCollectionMethod().ifPresent { it.validate() }
            resourceId()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (billingId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (paymentCollection.asKnown().getOrNull()?.validity() ?: 0) +
                (if (planId.asKnown().isPresent) 1 else 0) +
                (pricingType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cancellationDate.asKnown().isPresent) 1 else 0) +
                (cancelReason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (currentBillingPeriodEnd.asKnown().isPresent) 1 else 0) +
                (if (currentBillingPeriodStart.asKnown().isPresent) 1 else 0) +
                (if (effectiveEndDate.asKnown().isPresent) 1 else 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (payingCustomerId.asKnown().isPresent) 1 else 0) +
                (paymentCollectionMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (resourceId.asKnown().isPresent) 1 else 0) +
                (if (trialEndDate.asKnown().isPresent) 1 else 0)

        /** Payment collection */
        class PaymentCollection
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
             * An enum containing [PaymentCollection]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [PaymentCollection] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NOT_REQUIRED,
                PROCESSING,
                FAILED,
                ACTION_REQUIRED,
                /**
                 * An enum member indicating that [PaymentCollection] was instantiated with an
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
                    NOT_REQUIRED -> Value.NOT_REQUIRED
                    PROCESSING -> Value.PROCESSING
                    FAILED -> Value.FAILED
                    ACTION_REQUIRED -> Value.ACTION_REQUIRED
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
                    NOT_REQUIRED -> Known.NOT_REQUIRED
                    PROCESSING -> Known.PROCESSING
                    FAILED -> Known.FAILED
                    ACTION_REQUIRED -> Known.ACTION_REQUIRED
                    else -> throw StiggInvalidDataException("Unknown PaymentCollection: $value")
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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FREE,
                PAID,
                CUSTOM,
                /**
                 * An enum member indicating that [PricingType] was instantiated with an unknown
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
                    FREE -> Value.FREE
                    PAID -> Value.PAID
                    CUSTOM -> Value.CUSTOM
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
                    FREE -> Known.FREE
                    PAID -> Known.PAID
                    CUSTOM -> Known.CUSTOM
                    else -> throw StiggInvalidDataException("Unknown PricingType: $value")
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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PAYMENT_PENDING,
                ACTIVE,
                EXPIRED,
                IN_TRIAL,
                CANCELED,
                NOT_STARTED,
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws StiggInvalidDataException if this class instance's value is a not a known
             *   member.
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

        /** Subscription cancel reason */
        class CancelReason @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                 * An enum member indicating that [CancelReason] was instantiated with an unknown
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws StiggInvalidDataException if this class instance's value is a not a known
             *   member.
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

        /** The method used to collect payments for a subscription */
        class PaymentCollectionMethod
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws StiggInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CHARGE -> Known.CHARGE
                    INVOICE -> Known.INVOICE
                    NONE -> Known.NONE
                    else ->
                        throw StiggInvalidDataException("Unknown PaymentCollectionMethod: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                billingId == other.billingId &&
                createdAt == other.createdAt &&
                customerId == other.customerId &&
                paymentCollection == other.paymentCollection &&
                planId == other.planId &&
                pricingType == other.pricingType &&
                startDate == other.startDate &&
                status == other.status &&
                cancellationDate == other.cancellationDate &&
                cancelReason == other.cancelReason &&
                currentBillingPeriodEnd == other.currentBillingPeriodEnd &&
                currentBillingPeriodStart == other.currentBillingPeriodStart &&
                effectiveEndDate == other.effectiveEndDate &&
                endDate == other.endDate &&
                metadata == other.metadata &&
                payingCustomerId == other.payingCustomerId &&
                paymentCollectionMethod == other.paymentCollectionMethod &&
                resourceId == other.resourceId &&
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
                cancellationDate,
                cancelReason,
                currentBillingPeriodEnd,
                currentBillingPeriodStart,
                effectiveEndDate,
                endDate,
                metadata,
                payingCustomerId,
                paymentCollectionMethod,
                resourceId,
                trialEndDate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, billingId=$billingId, createdAt=$createdAt, customerId=$customerId, paymentCollection=$paymentCollection, planId=$planId, pricingType=$pricingType, startDate=$startDate, status=$status, cancellationDate=$cancellationDate, cancelReason=$cancelReason, currentBillingPeriodEnd=$currentBillingPeriodEnd, currentBillingPeriodStart=$currentBillingPeriodStart, effectiveEndDate=$effectiveEndDate, endDate=$endDate, metadata=$metadata, payingCustomerId=$payingCustomerId, paymentCollectionMethod=$paymentCollectionMethod, resourceId=$resourceId, trialEndDate=$trialEndDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
