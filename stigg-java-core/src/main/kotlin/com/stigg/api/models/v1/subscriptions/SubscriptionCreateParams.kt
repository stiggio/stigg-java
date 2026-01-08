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

/** Create a new Subscription */
class SubscriptionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Customer ID to provision the subscription for
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * Plan ID to provision
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun planId(): String = body.planId()

    /**
     * Unique identifier for the subscription
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = body.id()

    /**
     * Whether to wait for payment confirmation before returning the subscription
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awaitPaymentConfirmation(): Optional<Boolean> = body.awaitPaymentConfirmation()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingPeriod(): Optional<BillingPeriod> = body.billingPeriod()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun checkoutOptions(): Optional<CheckoutOptions> = body.checkoutOptions()

    /**
     * Additional metadata for the subscription
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Optional paying customer ID for split billing scenarios
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payingCustomerId(): Optional<String> = body.payingCustomerId()

    /**
     * Optional resource ID for multi-instance subscriptions
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceId(): Optional<String> = body.resourceId()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trialOverrideConfiguration(): Optional<TrialOverrideConfiguration> =
        body.trialOverrideConfiguration()

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [awaitPaymentConfirmation].
     *
     * Unlike [awaitPaymentConfirmation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _awaitPaymentConfirmation(): JsonField<Boolean> = body._awaitPaymentConfirmation()

    /**
     * Returns the raw JSON value of [billingPeriod].
     *
     * Unlike [billingPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingPeriod(): JsonField<BillingPeriod> = body._billingPeriod()

    /**
     * Returns the raw JSON value of [checkoutOptions].
     *
     * Unlike [checkoutOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _checkoutOptions(): JsonField<CheckoutOptions> = body._checkoutOptions()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

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
     * Returns the raw JSON value of [trialOverrideConfiguration].
     *
     * Unlike [trialOverrideConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _trialOverrideConfiguration(): JsonField<TrialOverrideConfiguration> =
        body._trialOverrideConfiguration()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .planId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionCreateParams: SubscriptionCreateParams) = apply {
            body = subscriptionCreateParams.body.toBuilder()
            additionalHeaders = subscriptionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customerId]
         * - [planId]
         * - [id]
         * - [awaitPaymentConfirmation]
         * - [billingPeriod]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Customer ID to provision the subscription for */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** Plan ID to provision */
        fun planId(planId: String) = apply { body.planId(planId) }

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /** Unique identifier for the subscription */
        fun id(id: String?) = apply { body.id(id) }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** Whether to wait for payment confirmation before returning the subscription */
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

        fun checkoutOptions(checkoutOptions: CheckoutOptions) = apply {
            body.checkoutOptions(checkoutOptions)
        }

        /**
         * Sets [Builder.checkoutOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkoutOptions] with a well-typed [CheckoutOptions]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun checkoutOptions(checkoutOptions: JsonField<CheckoutOptions>) = apply {
            body.checkoutOptions(checkoutOptions)
        }

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

        /** Optional paying customer ID for split billing scenarios */
        fun payingCustomerId(payingCustomerId: String?) = apply {
            body.payingCustomerId(payingCustomerId)
        }

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
            body.payingCustomerId(payingCustomerId)
        }

        /** Optional resource ID for multi-instance subscriptions */
        fun resourceId(resourceId: String?) = apply { body.resourceId(resourceId) }

        /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
        fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

        /**
         * Sets [Builder.resourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceId(resourceId: JsonField<String>) = apply { body.resourceId(resourceId) }

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
         * Returns an immutable instance of [SubscriptionCreateParams].
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
        fun build(): SubscriptionCreateParams =
            SubscriptionCreateParams(
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
        private val id: JsonField<String>,
        private val awaitPaymentConfirmation: JsonField<Boolean>,
        private val billingPeriod: JsonField<BillingPeriod>,
        private val checkoutOptions: JsonField<CheckoutOptions>,
        private val metadata: JsonField<Metadata>,
        private val payingCustomerId: JsonField<String>,
        private val resourceId: JsonField<String>,
        private val trialOverrideConfiguration: JsonField<TrialOverrideConfiguration>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customerId")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("planId") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("awaitPaymentConfirmation")
            @ExcludeMissing
            awaitPaymentConfirmation: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("billingPeriod")
            @ExcludeMissing
            billingPeriod: JsonField<BillingPeriod> = JsonMissing.of(),
            @JsonProperty("checkoutOptions")
            @ExcludeMissing
            checkoutOptions: JsonField<CheckoutOptions> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("payingCustomerId")
            @ExcludeMissing
            payingCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resourceId")
            @ExcludeMissing
            resourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trialOverrideConfiguration")
            @ExcludeMissing
            trialOverrideConfiguration: JsonField<TrialOverrideConfiguration> = JsonMissing.of(),
        ) : this(
            customerId,
            planId,
            id,
            awaitPaymentConfirmation,
            billingPeriod,
            checkoutOptions,
            metadata,
            payingCustomerId,
            resourceId,
            trialOverrideConfiguration,
            mutableMapOf(),
        )

        /**
         * Customer ID to provision the subscription for
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customerId")

        /**
         * Plan ID to provision
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun planId(): String = planId.getRequired("planId")

        /**
         * Unique identifier for the subscription
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Whether to wait for payment confirmation before returning the subscription
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun awaitPaymentConfirmation(): Optional<Boolean> =
            awaitPaymentConfirmation.getOptional("awaitPaymentConfirmation")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingPeriod(): Optional<BillingPeriod> = billingPeriod.getOptional("billingPeriod")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun checkoutOptions(): Optional<CheckoutOptions> =
            checkoutOptions.getOptional("checkoutOptions")

        /**
         * Additional metadata for the subscription
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Optional paying customer ID for split billing scenarios
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payingCustomerId(): Optional<String> = payingCustomerId.getOptional("payingCustomerId")

        /**
         * Optional resource ID for multi-instance subscriptions
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resourceId(): Optional<String> = resourceId.getOptional("resourceId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trialOverrideConfiguration(): Optional<TrialOverrideConfiguration> =
            trialOverrideConfiguration.getOptional("trialOverrideConfiguration")

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
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Returns the raw JSON value of [billingPeriod].
         *
         * Unlike [billingPeriod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingPeriod")
        @ExcludeMissing
        fun _billingPeriod(): JsonField<BillingPeriod> = billingPeriod

        /**
         * Returns the raw JSON value of [checkoutOptions].
         *
         * Unlike [checkoutOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("checkoutOptions")
        @ExcludeMissing
        fun _checkoutOptions(): JsonField<CheckoutOptions> = checkoutOptions

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
         * Returns the raw JSON value of [resourceId].
         *
         * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resourceId")
        @ExcludeMissing
        fun _resourceId(): JsonField<String> = resourceId

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
            private var id: JsonField<String> = JsonMissing.of()
            private var awaitPaymentConfirmation: JsonField<Boolean> = JsonMissing.of()
            private var billingPeriod: JsonField<BillingPeriod> = JsonMissing.of()
            private var checkoutOptions: JsonField<CheckoutOptions> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var payingCustomerId: JsonField<String> = JsonMissing.of()
            private var resourceId: JsonField<String> = JsonMissing.of()
            private var trialOverrideConfiguration: JsonField<TrialOverrideConfiguration> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customerId = body.customerId
                planId = body.planId
                id = body.id
                awaitPaymentConfirmation = body.awaitPaymentConfirmation
                billingPeriod = body.billingPeriod
                checkoutOptions = body.checkoutOptions
                metadata = body.metadata
                payingCustomerId = body.payingCustomerId
                resourceId = body.resourceId
                trialOverrideConfiguration = body.trialOverrideConfiguration
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Customer ID to provision the subscription for */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Plan ID to provision */
            fun planId(planId: String) = planId(JsonField.of(planId))

            /**
             * Sets [Builder.planId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /** Unique identifier for the subscription */
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

            /** Whether to wait for payment confirmation before returning the subscription */
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

            fun checkoutOptions(checkoutOptions: CheckoutOptions) =
                checkoutOptions(JsonField.of(checkoutOptions))

            /**
             * Sets [Builder.checkoutOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkoutOptions] with a well-typed [CheckoutOptions]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun checkoutOptions(checkoutOptions: JsonField<CheckoutOptions>) = apply {
                this.checkoutOptions = checkoutOptions
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

            /** Optional paying customer ID for split billing scenarios */
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

            /** Optional resource ID for multi-instance subscriptions */
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
                    id,
                    awaitPaymentConfirmation,
                    billingPeriod,
                    checkoutOptions,
                    metadata,
                    payingCustomerId,
                    resourceId,
                    trialOverrideConfiguration,
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
            id()
            awaitPaymentConfirmation()
            billingPeriod().ifPresent { it.validate() }
            checkoutOptions().ifPresent { it.validate() }
            metadata().ifPresent { it.validate() }
            payingCustomerId()
            resourceId()
            trialOverrideConfiguration().ifPresent { it.validate() }
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
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (awaitPaymentConfirmation.asKnown().isPresent) 1 else 0) +
                (billingPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                (checkoutOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (payingCustomerId.asKnown().isPresent) 1 else 0) +
                (if (resourceId.asKnown().isPresent) 1 else 0) +
                (trialOverrideConfiguration.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                customerId == other.customerId &&
                planId == other.planId &&
                id == other.id &&
                awaitPaymentConfirmation == other.awaitPaymentConfirmation &&
                billingPeriod == other.billingPeriod &&
                checkoutOptions == other.checkoutOptions &&
                metadata == other.metadata &&
                payingCustomerId == other.payingCustomerId &&
                resourceId == other.resourceId &&
                trialOverrideConfiguration == other.trialOverrideConfiguration &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customerId,
                planId,
                id,
                awaitPaymentConfirmation,
                billingPeriod,
                checkoutOptions,
                metadata,
                payingCustomerId,
                resourceId,
                trialOverrideConfiguration,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerId=$customerId, planId=$planId, id=$id, awaitPaymentConfirmation=$awaitPaymentConfirmation, billingPeriod=$billingPeriod, checkoutOptions=$checkoutOptions, metadata=$metadata, payingCustomerId=$payingCustomerId, resourceId=$resourceId, trialOverrideConfiguration=$trialOverrideConfiguration, additionalProperties=$additionalProperties}"
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

    class CheckoutOptions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cancelUrl: JsonField<String>,
        private val successUrl: JsonField<String>,
        private val allowPromoCodes: JsonField<Boolean>,
        private val allowTaxIdCollection: JsonField<Boolean>,
        private val collectBillingAddress: JsonField<Boolean>,
        private val collectPhoneNumber: JsonField<Boolean>,
        private val referenceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cancelUrl")
            @ExcludeMissing
            cancelUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("successUrl")
            @ExcludeMissing
            successUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allowPromoCodes")
            @ExcludeMissing
            allowPromoCodes: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allowTaxIdCollection")
            @ExcludeMissing
            allowTaxIdCollection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("collectBillingAddress")
            @ExcludeMissing
            collectBillingAddress: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("collectPhoneNumber")
            @ExcludeMissing
            collectPhoneNumber: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("referenceId")
            @ExcludeMissing
            referenceId: JsonField<String> = JsonMissing.of(),
        ) : this(
            cancelUrl,
            successUrl,
            allowPromoCodes,
            allowTaxIdCollection,
            collectBillingAddress,
            collectPhoneNumber,
            referenceId,
            mutableMapOf(),
        )

        /**
         * URL to redirect to if checkout is canceled
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cancelUrl(): String = cancelUrl.getRequired("cancelUrl")

        /**
         * URL to redirect to after successful checkout
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun successUrl(): String = successUrl.getRequired("successUrl")

        /**
         * Allow promotional codes during checkout
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowPromoCodes(): Optional<Boolean> = allowPromoCodes.getOptional("allowPromoCodes")

        /**
         * Allow tax ID collection during checkout
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowTaxIdCollection(): Optional<Boolean> =
            allowTaxIdCollection.getOptional("allowTaxIdCollection")

        /**
         * Collect billing address during checkout
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun collectBillingAddress(): Optional<Boolean> =
            collectBillingAddress.getOptional("collectBillingAddress")

        /**
         * Collect phone number during checkout
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun collectPhoneNumber(): Optional<Boolean> =
            collectPhoneNumber.getOptional("collectPhoneNumber")

        /**
         * Optional reference ID for the checkout session
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun referenceId(): Optional<String> = referenceId.getOptional("referenceId")

        /**
         * Returns the raw JSON value of [cancelUrl].
         *
         * Unlike [cancelUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cancelUrl") @ExcludeMissing fun _cancelUrl(): JsonField<String> = cancelUrl

        /**
         * Returns the raw JSON value of [successUrl].
         *
         * Unlike [successUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("successUrl")
        @ExcludeMissing
        fun _successUrl(): JsonField<String> = successUrl

        /**
         * Returns the raw JSON value of [allowPromoCodes].
         *
         * Unlike [allowPromoCodes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allowPromoCodes")
        @ExcludeMissing
        fun _allowPromoCodes(): JsonField<Boolean> = allowPromoCodes

        /**
         * Returns the raw JSON value of [allowTaxIdCollection].
         *
         * Unlike [allowTaxIdCollection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowTaxIdCollection")
        @ExcludeMissing
        fun _allowTaxIdCollection(): JsonField<Boolean> = allowTaxIdCollection

        /**
         * Returns the raw JSON value of [collectBillingAddress].
         *
         * Unlike [collectBillingAddress], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("collectBillingAddress")
        @ExcludeMissing
        fun _collectBillingAddress(): JsonField<Boolean> = collectBillingAddress

        /**
         * Returns the raw JSON value of [collectPhoneNumber].
         *
         * Unlike [collectPhoneNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("collectPhoneNumber")
        @ExcludeMissing
        fun _collectPhoneNumber(): JsonField<Boolean> = collectPhoneNumber

        /**
         * Returns the raw JSON value of [referenceId].
         *
         * Unlike [referenceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("referenceId")
        @ExcludeMissing
        fun _referenceId(): JsonField<String> = referenceId

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
             * Returns a mutable builder for constructing an instance of [CheckoutOptions].
             *
             * The following fields are required:
             * ```java
             * .cancelUrl()
             * .successUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CheckoutOptions]. */
        class Builder internal constructor() {

            private var cancelUrl: JsonField<String>? = null
            private var successUrl: JsonField<String>? = null
            private var allowPromoCodes: JsonField<Boolean> = JsonMissing.of()
            private var allowTaxIdCollection: JsonField<Boolean> = JsonMissing.of()
            private var collectBillingAddress: JsonField<Boolean> = JsonMissing.of()
            private var collectPhoneNumber: JsonField<Boolean> = JsonMissing.of()
            private var referenceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(checkoutOptions: CheckoutOptions) = apply {
                cancelUrl = checkoutOptions.cancelUrl
                successUrl = checkoutOptions.successUrl
                allowPromoCodes = checkoutOptions.allowPromoCodes
                allowTaxIdCollection = checkoutOptions.allowTaxIdCollection
                collectBillingAddress = checkoutOptions.collectBillingAddress
                collectPhoneNumber = checkoutOptions.collectPhoneNumber
                referenceId = checkoutOptions.referenceId
                additionalProperties = checkoutOptions.additionalProperties.toMutableMap()
            }

            /** URL to redirect to if checkout is canceled */
            fun cancelUrl(cancelUrl: String) = cancelUrl(JsonField.of(cancelUrl))

            /**
             * Sets [Builder.cancelUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cancelUrl(cancelUrl: JsonField<String>) = apply { this.cancelUrl = cancelUrl }

            /** URL to redirect to after successful checkout */
            fun successUrl(successUrl: String) = successUrl(JsonField.of(successUrl))

            /**
             * Sets [Builder.successUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.successUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun successUrl(successUrl: JsonField<String>) = apply { this.successUrl = successUrl }

            /** Allow promotional codes during checkout */
            fun allowPromoCodes(allowPromoCodes: Boolean) =
                allowPromoCodes(JsonField.of(allowPromoCodes))

            /**
             * Sets [Builder.allowPromoCodes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowPromoCodes] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowPromoCodes(allowPromoCodes: JsonField<Boolean>) = apply {
                this.allowPromoCodes = allowPromoCodes
            }

            /** Allow tax ID collection during checkout */
            fun allowTaxIdCollection(allowTaxIdCollection: Boolean) =
                allowTaxIdCollection(JsonField.of(allowTaxIdCollection))

            /**
             * Sets [Builder.allowTaxIdCollection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowTaxIdCollection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowTaxIdCollection(allowTaxIdCollection: JsonField<Boolean>) = apply {
                this.allowTaxIdCollection = allowTaxIdCollection
            }

            /** Collect billing address during checkout */
            fun collectBillingAddress(collectBillingAddress: Boolean) =
                collectBillingAddress(JsonField.of(collectBillingAddress))

            /**
             * Sets [Builder.collectBillingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectBillingAddress] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun collectBillingAddress(collectBillingAddress: JsonField<Boolean>) = apply {
                this.collectBillingAddress = collectBillingAddress
            }

            /** Collect phone number during checkout */
            fun collectPhoneNumber(collectPhoneNumber: Boolean) =
                collectPhoneNumber(JsonField.of(collectPhoneNumber))

            /**
             * Sets [Builder.collectPhoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectPhoneNumber] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun collectPhoneNumber(collectPhoneNumber: JsonField<Boolean>) = apply {
                this.collectPhoneNumber = collectPhoneNumber
            }

            /** Optional reference ID for the checkout session */
            fun referenceId(referenceId: String?) = referenceId(JsonField.ofNullable(referenceId))

            /** Alias for calling [Builder.referenceId] with `referenceId.orElse(null)`. */
            fun referenceId(referenceId: Optional<String>) = referenceId(referenceId.getOrNull())

            /**
             * Sets [Builder.referenceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referenceId(referenceId: JsonField<String>) = apply {
                this.referenceId = referenceId
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
             * Returns an immutable instance of [CheckoutOptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .cancelUrl()
             * .successUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CheckoutOptions =
                CheckoutOptions(
                    checkRequired("cancelUrl", cancelUrl),
                    checkRequired("successUrl", successUrl),
                    allowPromoCodes,
                    allowTaxIdCollection,
                    collectBillingAddress,
                    collectPhoneNumber,
                    referenceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CheckoutOptions = apply {
            if (validated) {
                return@apply
            }

            cancelUrl()
            successUrl()
            allowPromoCodes()
            allowTaxIdCollection()
            collectBillingAddress()
            collectPhoneNumber()
            referenceId()
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
            (if (cancelUrl.asKnown().isPresent) 1 else 0) +
                (if (successUrl.asKnown().isPresent) 1 else 0) +
                (if (allowPromoCodes.asKnown().isPresent) 1 else 0) +
                (if (allowTaxIdCollection.asKnown().isPresent) 1 else 0) +
                (if (collectBillingAddress.asKnown().isPresent) 1 else 0) +
                (if (collectPhoneNumber.asKnown().isPresent) 1 else 0) +
                (if (referenceId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CheckoutOptions &&
                cancelUrl == other.cancelUrl &&
                successUrl == other.successUrl &&
                allowPromoCodes == other.allowPromoCodes &&
                allowTaxIdCollection == other.allowTaxIdCollection &&
                collectBillingAddress == other.collectBillingAddress &&
                collectPhoneNumber == other.collectPhoneNumber &&
                referenceId == other.referenceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cancelUrl,
                successUrl,
                allowPromoCodes,
                allowTaxIdCollection,
                collectBillingAddress,
                collectPhoneNumber,
                referenceId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CheckoutOptions{cancelUrl=$cancelUrl, successUrl=$successUrl, allowPromoCodes=$allowPromoCodes, allowTaxIdCollection=$allowTaxIdCollection, collectBillingAddress=$collectBillingAddress, collectPhoneNumber=$collectPhoneNumber, referenceId=$referenceId, additionalProperties=$additionalProperties}"
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
         * Whether the subscription should start with a trial period
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isTrial(): Boolean = isTrial.getRequired("isTrial")

        /**
         * Behavior when trial ends: CONVERT_TO_PAID or CANCEL_SUBSCRIPTION
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trialEndBehavior(): Optional<TrialEndBehavior> =
            trialEndBehavior.getOptional("trialEndBehavior")

        /**
         * Custom trial end date
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

            /** Whether the subscription should start with a trial period */
            fun isTrial(isTrial: Boolean) = isTrial(JsonField.of(isTrial))

            /**
             * Sets [Builder.isTrial] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTrial] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isTrial(isTrial: JsonField<Boolean>) = apply { this.isTrial = isTrial }

            /** Behavior when trial ends: CONVERT_TO_PAID or CANCEL_SUBSCRIPTION */
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

            /** Custom trial end date */
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

        /** Behavior when trial ends: CONVERT_TO_PAID or CANCEL_SUBSCRIPTION */
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

        return other is SubscriptionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
