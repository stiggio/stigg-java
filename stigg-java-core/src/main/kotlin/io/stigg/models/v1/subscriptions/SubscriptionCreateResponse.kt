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

class SubscriptionCreateResponse
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
         * Returns a mutable builder for constructing an instance of [SubscriptionCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionCreateResponse: SubscriptionCreateResponse) = apply {
            data = subscriptionCreateResponse.data
            additionalProperties = subscriptionCreateResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SubscriptionCreateResponse].
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
        fun build(): SubscriptionCreateResponse =
            SubscriptionCreateResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionCreateResponse = apply {
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
        private val entitlements: JsonField<List<Entitlement>>,
        private val status: JsonField<Status>,
        private val checkoutBillingId: JsonField<String>,
        private val checkoutUrl: JsonField<String>,
        private val isScheduled: JsonField<Boolean>,
        private val subscription: JsonField<Subscription>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entitlements")
            @ExcludeMissing
            entitlements: JsonField<List<Entitlement>> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("checkoutBillingId")
            @ExcludeMissing
            checkoutBillingId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("checkoutUrl")
            @ExcludeMissing
            checkoutUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isScheduled")
            @ExcludeMissing
            isScheduled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subscription")
            @ExcludeMissing
            subscription: JsonField<Subscription> = JsonMissing.of(),
        ) : this(
            id,
            entitlements,
            status,
            checkoutBillingId,
            checkoutUrl,
            isScheduled,
            subscription,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the provisioned subscription
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entitlements(): List<Entitlement> = entitlements.getRequired("entitlements")

        /**
         * Provision status: SUCCESS or PAYMENT_REQUIRED
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Checkout billing ID when payment is required
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun checkoutBillingId(): Optional<String> =
            checkoutBillingId.getOptional("checkoutBillingId")

        /**
         * URL to complete payment when PAYMENT_REQUIRED
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun checkoutUrl(): Optional<String> = checkoutUrl.getOptional("checkoutUrl")

        /**
         * Whether the subscription is scheduled for future activation
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isScheduled(): Optional<Boolean> = isScheduled.getOptional("isScheduled")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscription(): Optional<Subscription> = subscription.getOptional("subscription")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [entitlements].
         *
         * Unlike [entitlements], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("entitlements")
        @ExcludeMissing
        fun _entitlements(): JsonField<List<Entitlement>> = entitlements

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [checkoutBillingId].
         *
         * Unlike [checkoutBillingId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("checkoutBillingId")
        @ExcludeMissing
        fun _checkoutBillingId(): JsonField<String> = checkoutBillingId

        /**
         * Returns the raw JSON value of [checkoutUrl].
         *
         * Unlike [checkoutUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("checkoutUrl")
        @ExcludeMissing
        fun _checkoutUrl(): JsonField<String> = checkoutUrl

        /**
         * Returns the raw JSON value of [isScheduled].
         *
         * Unlike [isScheduled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isScheduled")
        @ExcludeMissing
        fun _isScheduled(): JsonField<Boolean> = isScheduled

        /**
         * Returns the raw JSON value of [subscription].
         *
         * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription")
        @ExcludeMissing
        fun _subscription(): JsonField<Subscription> = subscription

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
             * .entitlements()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var entitlements: JsonField<MutableList<Entitlement>>? = null
            private var status: JsonField<Status>? = null
            private var checkoutBillingId: JsonField<String> = JsonMissing.of()
            private var checkoutUrl: JsonField<String> = JsonMissing.of()
            private var isScheduled: JsonField<Boolean> = JsonMissing.of()
            private var subscription: JsonField<Subscription> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                entitlements = data.entitlements.map { it.toMutableList() }
                status = data.status
                checkoutBillingId = data.checkoutBillingId
                checkoutUrl = data.checkoutUrl
                isScheduled = data.isScheduled
                subscription = data.subscription
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the provisioned subscription */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun entitlements(entitlements: List<Entitlement>) =
                entitlements(JsonField.of(entitlements))

            /**
             * Sets [Builder.entitlements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entitlements] with a well-typed `List<Entitlement>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun entitlements(entitlements: JsonField<List<Entitlement>>) = apply {
                this.entitlements = entitlements.map { it.toMutableList() }
            }

            /**
             * Adds a single [Entitlement] to [entitlements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEntitlement(entitlement: Entitlement) = apply {
                entitlements =
                    (entitlements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("entitlements", it).add(entitlement)
                    }
            }

            /** Provision status: SUCCESS or PAYMENT_REQUIRED */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Checkout billing ID when payment is required */
            fun checkoutBillingId(checkoutBillingId: String?) =
                checkoutBillingId(JsonField.ofNullable(checkoutBillingId))

            /**
             * Alias for calling [Builder.checkoutBillingId] with `checkoutBillingId.orElse(null)`.
             */
            fun checkoutBillingId(checkoutBillingId: Optional<String>) =
                checkoutBillingId(checkoutBillingId.getOrNull())

            /**
             * Sets [Builder.checkoutBillingId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkoutBillingId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checkoutBillingId(checkoutBillingId: JsonField<String>) = apply {
                this.checkoutBillingId = checkoutBillingId
            }

            /** URL to complete payment when PAYMENT_REQUIRED */
            fun checkoutUrl(checkoutUrl: String?) = checkoutUrl(JsonField.ofNullable(checkoutUrl))

            /** Alias for calling [Builder.checkoutUrl] with `checkoutUrl.orElse(null)`. */
            fun checkoutUrl(checkoutUrl: Optional<String>) = checkoutUrl(checkoutUrl.getOrNull())

            /**
             * Sets [Builder.checkoutUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkoutUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checkoutUrl(checkoutUrl: JsonField<String>) = apply {
                this.checkoutUrl = checkoutUrl
            }

            /** Whether the subscription is scheduled for future activation */
            fun isScheduled(isScheduled: Boolean) = isScheduled(JsonField.of(isScheduled))

            /**
             * Sets [Builder.isScheduled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isScheduled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isScheduled(isScheduled: JsonField<Boolean>) = apply {
                this.isScheduled = isScheduled
            }

            fun subscription(subscription: Subscription) = subscription(JsonField.of(subscription))

            /**
             * Sets [Builder.subscription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscription] with a well-typed [Subscription] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscription(subscription: JsonField<Subscription>) = apply {
                this.subscription = subscription
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
             * .entitlements()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("entitlements", entitlements).map { it.toImmutable() },
                    checkRequired("status", status),
                    checkoutBillingId,
                    checkoutUrl,
                    isScheduled,
                    subscription,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            entitlements().forEach { it.validate() }
            status().validate()
            checkoutBillingId()
            checkoutUrl()
            isScheduled()
            subscription().ifPresent { it.validate() }
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
                (entitlements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (checkoutBillingId.asKnown().isPresent) 1 else 0) +
                (if (checkoutUrl.asKnown().isPresent) 1 else 0) +
                (if (isScheduled.asKnown().isPresent) 1 else 0) +
                (subscription.asKnown().getOrNull()?.validity() ?: 0)

        class Entitlement
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accessDeniedReason: JsonField<String>,
            private val currentUsage: JsonField<Double>,
            private val entitlementUpdatedAt: JsonField<OffsetDateTime>,
            private val feature: JsonField<Feature>,
            private val hasUnlimitedUsage: JsonField<Boolean>,
            private val isGranted: JsonField<Boolean>,
            private val resetPeriod: JsonField<ResetPeriod>,
            private val usageLimit: JsonField<Double>,
            private val usagePeriodAnchor: JsonField<OffsetDateTime>,
            private val usagePeriodEnd: JsonField<OffsetDateTime>,
            private val usagePeriodStart: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accessDeniedReason")
                @ExcludeMissing
                accessDeniedReason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currentUsage")
                @ExcludeMissing
                currentUsage: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("entitlementUpdatedAt")
                @ExcludeMissing
                entitlementUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("feature")
                @ExcludeMissing
                feature: JsonField<Feature> = JsonMissing.of(),
                @JsonProperty("hasUnlimitedUsage")
                @ExcludeMissing
                hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("isGranted")
                @ExcludeMissing
                isGranted: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("resetPeriod")
                @ExcludeMissing
                resetPeriod: JsonField<ResetPeriod> = JsonMissing.of(),
                @JsonProperty("usageLimit")
                @ExcludeMissing
                usageLimit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("usagePeriodAnchor")
                @ExcludeMissing
                usagePeriodAnchor: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("usagePeriodEnd")
                @ExcludeMissing
                usagePeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("usagePeriodStart")
                @ExcludeMissing
                usagePeriodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                accessDeniedReason,
                currentUsage,
                entitlementUpdatedAt,
                feature,
                hasUnlimitedUsage,
                isGranted,
                resetPeriod,
                usageLimit,
                usagePeriodAnchor,
                usagePeriodEnd,
                usagePeriodStart,
                mutableMapOf(),
            )

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accessDeniedReason(): Optional<String> =
                accessDeniedReason.getOptional("accessDeniedReason")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currentUsage(): Optional<Double> = currentUsage.getOptional("currentUsage")

            /**
             * entitlement updated at
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun entitlementUpdatedAt(): Optional<OffsetDateTime> =
                entitlementUpdatedAt.getOptional("entitlementUpdatedAt")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun feature(): Optional<Feature> = feature.getOptional("feature")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasUnlimitedUsage(): Optional<Boolean> =
                hasUnlimitedUsage.getOptional("hasUnlimitedUsage")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isGranted(): Optional<Boolean> = isGranted.getOptional("isGranted")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun resetPeriod(): Optional<ResetPeriod> = resetPeriod.getOptional("resetPeriod")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usageLimit(): Optional<Double> = usageLimit.getOptional("usageLimit")

            /**
             * usage period anchor
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usagePeriodAnchor(): Optional<OffsetDateTime> =
                usagePeriodAnchor.getOptional("usagePeriodAnchor")

            /**
             * usage period end
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usagePeriodEnd(): Optional<OffsetDateTime> =
                usagePeriodEnd.getOptional("usagePeriodEnd")

            /**
             * usage period start
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usagePeriodStart(): Optional<OffsetDateTime> =
                usagePeriodStart.getOptional("usagePeriodStart")

            /**
             * Returns the raw JSON value of [accessDeniedReason].
             *
             * Unlike [accessDeniedReason], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("accessDeniedReason")
            @ExcludeMissing
            fun _accessDeniedReason(): JsonField<String> = accessDeniedReason

            /**
             * Returns the raw JSON value of [currentUsage].
             *
             * Unlike [currentUsage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currentUsage")
            @ExcludeMissing
            fun _currentUsage(): JsonField<Double> = currentUsage

            /**
             * Returns the raw JSON value of [entitlementUpdatedAt].
             *
             * Unlike [entitlementUpdatedAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("entitlementUpdatedAt")
            @ExcludeMissing
            fun _entitlementUpdatedAt(): JsonField<OffsetDateTime> = entitlementUpdatedAt

            /**
             * Returns the raw JSON value of [feature].
             *
             * Unlike [feature], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("feature") @ExcludeMissing fun _feature(): JsonField<Feature> = feature

            /**
             * Returns the raw JSON value of [hasUnlimitedUsage].
             *
             * Unlike [hasUnlimitedUsage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("hasUnlimitedUsage")
            @ExcludeMissing
            fun _hasUnlimitedUsage(): JsonField<Boolean> = hasUnlimitedUsage

            /**
             * Returns the raw JSON value of [isGranted].
             *
             * Unlike [isGranted], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("isGranted")
            @ExcludeMissing
            fun _isGranted(): JsonField<Boolean> = isGranted

            /**
             * Returns the raw JSON value of [resetPeriod].
             *
             * Unlike [resetPeriod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("resetPeriod")
            @ExcludeMissing
            fun _resetPeriod(): JsonField<ResetPeriod> = resetPeriod

            /**
             * Returns the raw JSON value of [usageLimit].
             *
             * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usageLimit")
            @ExcludeMissing
            fun _usageLimit(): JsonField<Double> = usageLimit

            /**
             * Returns the raw JSON value of [usagePeriodAnchor].
             *
             * Unlike [usagePeriodAnchor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usagePeriodAnchor")
            @ExcludeMissing
            fun _usagePeriodAnchor(): JsonField<OffsetDateTime> = usagePeriodAnchor

            /**
             * Returns the raw JSON value of [usagePeriodEnd].
             *
             * Unlike [usagePeriodEnd], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usagePeriodEnd")
            @ExcludeMissing
            fun _usagePeriodEnd(): JsonField<OffsetDateTime> = usagePeriodEnd

            /**
             * Returns the raw JSON value of [usagePeriodStart].
             *
             * Unlike [usagePeriodStart], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usagePeriodStart")
            @ExcludeMissing
            fun _usagePeriodStart(): JsonField<OffsetDateTime> = usagePeriodStart

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

                /** Returns a mutable builder for constructing an instance of [Entitlement]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entitlement]. */
            class Builder internal constructor() {

                private var accessDeniedReason: JsonField<String> = JsonMissing.of()
                private var currentUsage: JsonField<Double> = JsonMissing.of()
                private var entitlementUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var feature: JsonField<Feature> = JsonMissing.of()
                private var hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of()
                private var isGranted: JsonField<Boolean> = JsonMissing.of()
                private var resetPeriod: JsonField<ResetPeriod> = JsonMissing.of()
                private var usageLimit: JsonField<Double> = JsonMissing.of()
                private var usagePeriodAnchor: JsonField<OffsetDateTime> = JsonMissing.of()
                private var usagePeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                private var usagePeriodStart: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entitlement: Entitlement) = apply {
                    accessDeniedReason = entitlement.accessDeniedReason
                    currentUsage = entitlement.currentUsage
                    entitlementUpdatedAt = entitlement.entitlementUpdatedAt
                    feature = entitlement.feature
                    hasUnlimitedUsage = entitlement.hasUnlimitedUsage
                    isGranted = entitlement.isGranted
                    resetPeriod = entitlement.resetPeriod
                    usageLimit = entitlement.usageLimit
                    usagePeriodAnchor = entitlement.usagePeriodAnchor
                    usagePeriodEnd = entitlement.usagePeriodEnd
                    usagePeriodStart = entitlement.usagePeriodStart
                    additionalProperties = entitlement.additionalProperties.toMutableMap()
                }

                fun accessDeniedReason(accessDeniedReason: String?) =
                    accessDeniedReason(JsonField.ofNullable(accessDeniedReason))

                /**
                 * Alias for calling [Builder.accessDeniedReason] with
                 * `accessDeniedReason.orElse(null)`.
                 */
                fun accessDeniedReason(accessDeniedReason: Optional<String>) =
                    accessDeniedReason(accessDeniedReason.getOrNull())

                /**
                 * Sets [Builder.accessDeniedReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accessDeniedReason] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accessDeniedReason(accessDeniedReason: JsonField<String>) = apply {
                    this.accessDeniedReason = accessDeniedReason
                }

                fun currentUsage(currentUsage: Double) = currentUsage(JsonField.of(currentUsage))

                /**
                 * Sets [Builder.currentUsage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currentUsage] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currentUsage(currentUsage: JsonField<Double>) = apply {
                    this.currentUsage = currentUsage
                }

                /** entitlement updated at */
                fun entitlementUpdatedAt(entitlementUpdatedAt: OffsetDateTime?) =
                    entitlementUpdatedAt(JsonField.ofNullable(entitlementUpdatedAt))

                /**
                 * Alias for calling [Builder.entitlementUpdatedAt] with
                 * `entitlementUpdatedAt.orElse(null)`.
                 */
                fun entitlementUpdatedAt(entitlementUpdatedAt: Optional<OffsetDateTime>) =
                    entitlementUpdatedAt(entitlementUpdatedAt.getOrNull())

                /**
                 * Sets [Builder.entitlementUpdatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entitlementUpdatedAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun entitlementUpdatedAt(entitlementUpdatedAt: JsonField<OffsetDateTime>) = apply {
                    this.entitlementUpdatedAt = entitlementUpdatedAt
                }

                fun feature(feature: Feature?) = feature(JsonField.ofNullable(feature))

                /** Alias for calling [Builder.feature] with `feature.orElse(null)`. */
                fun feature(feature: Optional<Feature>) = feature(feature.getOrNull())

                /**
                 * Sets [Builder.feature] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.feature] with a well-typed [Feature] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun feature(feature: JsonField<Feature>) = apply { this.feature = feature }

                fun hasUnlimitedUsage(hasUnlimitedUsage: Boolean?) =
                    hasUnlimitedUsage(JsonField.ofNullable(hasUnlimitedUsage))

                /**
                 * Alias for [Builder.hasUnlimitedUsage].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun hasUnlimitedUsage(hasUnlimitedUsage: Boolean) =
                    hasUnlimitedUsage(hasUnlimitedUsage as Boolean?)

                /**
                 * Alias for calling [Builder.hasUnlimitedUsage] with
                 * `hasUnlimitedUsage.orElse(null)`.
                 */
                fun hasUnlimitedUsage(hasUnlimitedUsage: Optional<Boolean>) =
                    hasUnlimitedUsage(hasUnlimitedUsage.getOrNull())

                /**
                 * Sets [Builder.hasUnlimitedUsage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasUnlimitedUsage] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun hasUnlimitedUsage(hasUnlimitedUsage: JsonField<Boolean>) = apply {
                    this.hasUnlimitedUsage = hasUnlimitedUsage
                }

                fun isGranted(isGranted: Boolean) = isGranted(JsonField.of(isGranted))

                /**
                 * Sets [Builder.isGranted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isGranted] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isGranted(isGranted: JsonField<Boolean>) = apply { this.isGranted = isGranted }

                fun resetPeriod(resetPeriod: ResetPeriod?) =
                    resetPeriod(JsonField.ofNullable(resetPeriod))

                /** Alias for calling [Builder.resetPeriod] with `resetPeriod.orElse(null)`. */
                fun resetPeriod(resetPeriod: Optional<ResetPeriod>) =
                    resetPeriod(resetPeriod.getOrNull())

                /**
                 * Sets [Builder.resetPeriod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resetPeriod] with a well-typed [ResetPeriod]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun resetPeriod(resetPeriod: JsonField<ResetPeriod>) = apply {
                    this.resetPeriod = resetPeriod
                }

                fun usageLimit(usageLimit: Double?) = usageLimit(JsonField.ofNullable(usageLimit))

                /**
                 * Alias for [Builder.usageLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun usageLimit(usageLimit: Double) = usageLimit(usageLimit as Double?)

                /** Alias for calling [Builder.usageLimit] with `usageLimit.orElse(null)`. */
                fun usageLimit(usageLimit: Optional<Double>) = usageLimit(usageLimit.getOrNull())

                /**
                 * Sets [Builder.usageLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageLimit] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usageLimit(usageLimit: JsonField<Double>) = apply {
                    this.usageLimit = usageLimit
                }

                /** usage period anchor */
                fun usagePeriodAnchor(usagePeriodAnchor: OffsetDateTime?) =
                    usagePeriodAnchor(JsonField.ofNullable(usagePeriodAnchor))

                /**
                 * Alias for calling [Builder.usagePeriodAnchor] with
                 * `usagePeriodAnchor.orElse(null)`.
                 */
                fun usagePeriodAnchor(usagePeriodAnchor: Optional<OffsetDateTime>) =
                    usagePeriodAnchor(usagePeriodAnchor.getOrNull())

                /**
                 * Sets [Builder.usagePeriodAnchor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usagePeriodAnchor] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun usagePeriodAnchor(usagePeriodAnchor: JsonField<OffsetDateTime>) = apply {
                    this.usagePeriodAnchor = usagePeriodAnchor
                }

                /** usage period end */
                fun usagePeriodEnd(usagePeriodEnd: OffsetDateTime?) =
                    usagePeriodEnd(JsonField.ofNullable(usagePeriodEnd))

                /**
                 * Alias for calling [Builder.usagePeriodEnd] with `usagePeriodEnd.orElse(null)`.
                 */
                fun usagePeriodEnd(usagePeriodEnd: Optional<OffsetDateTime>) =
                    usagePeriodEnd(usagePeriodEnd.getOrNull())

                /**
                 * Sets [Builder.usagePeriodEnd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usagePeriodEnd] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun usagePeriodEnd(usagePeriodEnd: JsonField<OffsetDateTime>) = apply {
                    this.usagePeriodEnd = usagePeriodEnd
                }

                /** usage period start */
                fun usagePeriodStart(usagePeriodStart: OffsetDateTime?) =
                    usagePeriodStart(JsonField.ofNullable(usagePeriodStart))

                /**
                 * Alias for calling [Builder.usagePeriodStart] with
                 * `usagePeriodStart.orElse(null)`.
                 */
                fun usagePeriodStart(usagePeriodStart: Optional<OffsetDateTime>) =
                    usagePeriodStart(usagePeriodStart.getOrNull())

                /**
                 * Sets [Builder.usagePeriodStart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usagePeriodStart] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun usagePeriodStart(usagePeriodStart: JsonField<OffsetDateTime>) = apply {
                    this.usagePeriodStart = usagePeriodStart
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
                 * Returns an immutable instance of [Entitlement].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Entitlement =
                    Entitlement(
                        accessDeniedReason,
                        currentUsage,
                        entitlementUpdatedAt,
                        feature,
                        hasUnlimitedUsage,
                        isGranted,
                        resetPeriod,
                        usageLimit,
                        usagePeriodAnchor,
                        usagePeriodEnd,
                        usagePeriodStart,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Entitlement = apply {
                if (validated) {
                    return@apply
                }

                accessDeniedReason()
                currentUsage()
                entitlementUpdatedAt()
                feature().ifPresent { it.validate() }
                hasUnlimitedUsage()
                isGranted()
                resetPeriod().ifPresent { it.validate() }
                usageLimit()
                usagePeriodAnchor()
                usagePeriodEnd()
                usagePeriodStart()
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
                (if (accessDeniedReason.asKnown().isPresent) 1 else 0) +
                    (if (currentUsage.asKnown().isPresent) 1 else 0) +
                    (if (entitlementUpdatedAt.asKnown().isPresent) 1 else 0) +
                    (feature.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (hasUnlimitedUsage.asKnown().isPresent) 1 else 0) +
                    (if (isGranted.asKnown().isPresent) 1 else 0) +
                    (resetPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (usageLimit.asKnown().isPresent) 1 else 0) +
                    (if (usagePeriodAnchor.asKnown().isPresent) 1 else 0) +
                    (if (usagePeriodEnd.asKnown().isPresent) 1 else 0) +
                    (if (usagePeriodStart.asKnown().isPresent) 1 else 0)

            class Feature
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val refId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("refId")
                    @ExcludeMissing
                    refId: JsonField<String> = JsonMissing.of()
                ) : this(refId, mutableMapOf())

                /**
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun refId(): String = refId.getRequired("refId")

                /**
                 * Returns the raw JSON value of [refId].
                 *
                 * Unlike [refId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("refId") @ExcludeMissing fun _refId(): JsonField<String> = refId

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
                     * Returns a mutable builder for constructing an instance of [Feature].
                     *
                     * The following fields are required:
                     * ```java
                     * .refId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Feature]. */
                class Builder internal constructor() {

                    private var refId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(feature: Feature) = apply {
                        refId = feature.refId
                        additionalProperties = feature.additionalProperties.toMutableMap()
                    }

                    fun refId(refId: String) = refId(JsonField.of(refId))

                    /**
                     * Sets [Builder.refId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.refId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun refId(refId: JsonField<String>) = apply { this.refId = refId }

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
                     * Returns an immutable instance of [Feature].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .refId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Feature =
                        Feature(checkRequired("refId", refId), additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Feature = apply {
                    if (validated) {
                        return@apply
                    }

                    refId()
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
                internal fun validity(): Int = (if (refId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Feature &&
                        refId == other.refId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(refId, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Feature{refId=$refId, additionalProperties=$additionalProperties}"
            }

            class ResetPeriod
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entitlement &&
                    accessDeniedReason == other.accessDeniedReason &&
                    currentUsage == other.currentUsage &&
                    entitlementUpdatedAt == other.entitlementUpdatedAt &&
                    feature == other.feature &&
                    hasUnlimitedUsage == other.hasUnlimitedUsage &&
                    isGranted == other.isGranted &&
                    resetPeriod == other.resetPeriod &&
                    usageLimit == other.usageLimit &&
                    usagePeriodAnchor == other.usagePeriodAnchor &&
                    usagePeriodEnd == other.usagePeriodEnd &&
                    usagePeriodStart == other.usagePeriodStart &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accessDeniedReason,
                    currentUsage,
                    entitlementUpdatedAt,
                    feature,
                    hasUnlimitedUsage,
                    isGranted,
                    resetPeriod,
                    usageLimit,
                    usagePeriodAnchor,
                    usagePeriodEnd,
                    usagePeriodStart,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entitlement{accessDeniedReason=$accessDeniedReason, currentUsage=$currentUsage, entitlementUpdatedAt=$entitlementUpdatedAt, feature=$feature, hasUnlimitedUsage=$hasUnlimitedUsage, isGranted=$isGranted, resetPeriod=$resetPeriod, usageLimit=$usageLimit, usagePeriodAnchor=$usagePeriodAnchor, usagePeriodEnd=$usagePeriodEnd, usagePeriodStart=$usagePeriodStart, additionalProperties=$additionalProperties}"
        }

        /** Provision status: SUCCESS or PAYMENT_REQUIRED */
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

                @JvmField val SUCCESS = of("SUCCESS")

                @JvmField val PAYMENT_REQUIRED = of("PAYMENT_REQUIRED")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                SUCCESS,
                PAYMENT_REQUIRED,
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
                SUCCESS,
                PAYMENT_REQUIRED,
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
                    SUCCESS -> Value.SUCCESS
                    PAYMENT_REQUIRED -> Value.PAYMENT_REQUIRED
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
                    SUCCESS -> Known.SUCCESS
                    PAYMENT_REQUIRED -> Known.PAYMENT_REQUIRED
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

        class Subscription
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
            private val prices: JsonField<List<Price>>,
            private val resourceId: JsonField<String>,
            private val trialEndDate: JsonField<OffsetDateTime>,
            private val unitQuantity: JsonField<Double>,
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
                @JsonProperty("planId")
                @ExcludeMissing
                planId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pricingType")
                @ExcludeMissing
                pricingType: JsonField<PricingType> = JsonMissing.of(),
                @JsonProperty("startDate")
                @ExcludeMissing
                startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
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
                @JsonProperty("prices")
                @ExcludeMissing
                prices: JsonField<List<Price>> = JsonMissing.of(),
                @JsonProperty("resourceId")
                @ExcludeMissing
                resourceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trialEndDate")
                @ExcludeMissing
                trialEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("unitQuantity")
                @ExcludeMissing
                unitQuantity: JsonField<Double> = JsonMissing.of(),
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
                prices,
                resourceId,
                trialEndDate,
                unitQuantity,
                mutableMapOf(),
            )

            /**
             * Subscription ID
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Billing ID
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billingId(): Optional<String> = billingId.getOptional("billingId")

            /**
             * Created at
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

            /**
             * Customer ID
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerId(): String = customerId.getRequired("customerId")

            /**
             * Payment collection
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentCollection(): PaymentCollection =
                paymentCollection.getRequired("paymentCollection")

            /**
             * Plan ID
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun planId(): String = planId.getRequired("planId")

            /**
             * Pricing type
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pricingType(): PricingType = pricingType.getRequired("pricingType")

            /**
             * Subscription start date
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

            /**
             * Subscription status
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * Subscription cancellation date
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cancellationDate(): Optional<OffsetDateTime> =
                cancellationDate.getOptional("cancellationDate")

            /**
             * Subscription cancel reason
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cancelReason(): Optional<CancelReason> = cancelReason.getOptional("cancelReason")

            /**
             * End of the current billing period
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currentBillingPeriodEnd(): Optional<OffsetDateTime> =
                currentBillingPeriodEnd.getOptional("currentBillingPeriodEnd")

            /**
             * Start of the current billing period
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currentBillingPeriodStart(): Optional<OffsetDateTime> =
                currentBillingPeriodStart.getOptional("currentBillingPeriodStart")

            /**
             * Subscription effective end date
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun effectiveEndDate(): Optional<OffsetDateTime> =
                effectiveEndDate.getOptional("effectiveEndDate")

            /**
             * Subscription end date
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("endDate")

            /**
             * Additional metadata for the subscription
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * Paying customer ID for delegated billing
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payingCustomerId(): Optional<String> =
                payingCustomerId.getOptional("payingCustomerId")

            /**
             * The method used to collect payments for a subscription
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentCollectionMethod(): Optional<PaymentCollectionMethod> =
                paymentCollectionMethod.getOptional("paymentCollectionMethod")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun prices(): Optional<List<Price>> = prices.getOptional("prices")

            /**
             * Resource ID
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun resourceId(): Optional<String> = resourceId.getOptional("resourceId")

            /**
             * Subscription trial end date
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun trialEndDate(): Optional<OffsetDateTime> = trialEndDate.getOptional("trialEndDate")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun unitQuantity(): Optional<Double> = unitQuantity.getOptional("unitQuantity")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [billingId].
             *
             * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("billingId")
            @ExcludeMissing
            fun _billingId(): JsonField<String> = billingId

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("createdAt")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customerId")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            /**
             * Returns the raw JSON value of [paymentCollection].
             *
             * Unlike [paymentCollection], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Unlike [pricingType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pricingType")
            @ExcludeMissing
            fun _pricingType(): JsonField<PricingType> = pricingType

            /**
             * Returns the raw JSON value of [startDate].
             *
             * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [cancellationDate], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Unlike [currentBillingPeriodStart], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("currentBillingPeriodStart")
            @ExcludeMissing
            fun _currentBillingPeriodStart(): JsonField<OffsetDateTime> = currentBillingPeriodStart

            /**
             * Returns the raw JSON value of [effectiveEndDate].
             *
             * Unlike [effectiveEndDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("effectiveEndDate")
            @ExcludeMissing
            fun _effectiveEndDate(): JsonField<OffsetDateTime> = effectiveEndDate

            /**
             * Returns the raw JSON value of [endDate].
             *
             * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("endDate")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [payingCustomerId].
             *
             * Unlike [payingCustomerId], this method doesn't throw if the JSON field has an
             * unexpected type.
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
            fun _paymentCollectionMethod(): JsonField<PaymentCollectionMethod> =
                paymentCollectionMethod

            /**
             * Returns the raw JSON value of [prices].
             *
             * Unlike [prices], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("prices") @ExcludeMissing fun _prices(): JsonField<List<Price>> = prices

            /**
             * Returns the raw JSON value of [resourceId].
             *
             * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [Subscription].
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

            /** A builder for [Subscription]. */
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
                private var prices: JsonField<MutableList<Price>>? = null
                private var resourceId: JsonField<String> = JsonMissing.of()
                private var trialEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var unitQuantity: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(subscription: Subscription) = apply {
                    id = subscription.id
                    billingId = subscription.billingId
                    createdAt = subscription.createdAt
                    customerId = subscription.customerId
                    paymentCollection = subscription.paymentCollection
                    planId = subscription.planId
                    pricingType = subscription.pricingType
                    startDate = subscription.startDate
                    status = subscription.status
                    cancellationDate = subscription.cancellationDate
                    cancelReason = subscription.cancelReason
                    currentBillingPeriodEnd = subscription.currentBillingPeriodEnd
                    currentBillingPeriodStart = subscription.currentBillingPeriodStart
                    effectiveEndDate = subscription.effectiveEndDate
                    endDate = subscription.endDate
                    metadata = subscription.metadata
                    payingCustomerId = subscription.payingCustomerId
                    paymentCollectionMethod = subscription.paymentCollectionMethod
                    prices = subscription.prices.map { it.toMutableList() }
                    resourceId = subscription.resourceId
                    trialEndDate = subscription.trialEndDate
                    unitQuantity = subscription.unitQuantity
                    additionalProperties = subscription.additionalProperties.toMutableMap()
                }

                /** Subscription ID */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Billing ID */
                fun billingId(billingId: String?) = billingId(JsonField.ofNullable(billingId))

                /** Alias for calling [Builder.billingId] with `billingId.orElse(null)`. */
                fun billingId(billingId: Optional<String>) = billingId(billingId.getOrNull())

                /**
                 * Sets [Builder.billingId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun billingId(billingId: JsonField<String>) = apply { this.billingId = billingId }

                /** Created at */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                /** Payment collection */
                fun paymentCollection(paymentCollection: PaymentCollection) =
                    paymentCollection(JsonField.of(paymentCollection))

                /**
                 * Sets [Builder.paymentCollection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentCollection] with a well-typed
                 * [PaymentCollection] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun paymentCollection(paymentCollection: JsonField<PaymentCollection>) = apply {
                    this.paymentCollection = paymentCollection
                }

                /** Plan ID */
                fun planId(planId: String) = planId(JsonField.of(planId))

                /**
                 * Sets [Builder.planId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun planId(planId: JsonField<String>) = apply { this.planId = planId }

                /** Pricing type */
                fun pricingType(pricingType: PricingType) = pricingType(JsonField.of(pricingType))

                /**
                 * Sets [Builder.pricingType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pricingType] with a well-typed [PricingType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pricingType(pricingType: JsonField<PricingType>) = apply {
                    this.pricingType = pricingType
                }

                /** Subscription start date */
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

                /** Subscription status */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** Subscription cancellation date */
                fun cancellationDate(cancellationDate: OffsetDateTime?) =
                    cancellationDate(JsonField.ofNullable(cancellationDate))

                /**
                 * Alias for calling [Builder.cancellationDate] with
                 * `cancellationDate.orElse(null)`.
                 */
                fun cancellationDate(cancellationDate: Optional<OffsetDateTime>) =
                    cancellationDate(cancellationDate.getOrNull())

                /**
                 * Sets [Builder.cancellationDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cancellationDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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
                 * You should usually call [Builder.cancelReason] with a well-typed [CancelReason]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun currentBillingPeriodStart(
                    currentBillingPeriodStart: JsonField<OffsetDateTime>
                ) = apply { this.currentBillingPeriodStart = currentBillingPeriodStart }

                /** Subscription effective end date */
                fun effectiveEndDate(effectiveEndDate: OffsetDateTime?) =
                    effectiveEndDate(JsonField.ofNullable(effectiveEndDate))

                /**
                 * Alias for calling [Builder.effectiveEndDate] with
                 * `effectiveEndDate.orElse(null)`.
                 */
                fun effectiveEndDate(effectiveEndDate: Optional<OffsetDateTime>) =
                    effectiveEndDate(effectiveEndDate.getOrNull())

                /**
                 * Sets [Builder.effectiveEndDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effectiveEndDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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
                 * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** Additional metadata for the subscription */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** Paying customer ID for delegated billing */
                fun payingCustomerId(payingCustomerId: String?) =
                    payingCustomerId(JsonField.ofNullable(payingCustomerId))

                /**
                 * Alias for calling [Builder.payingCustomerId] with
                 * `payingCustomerId.orElse(null)`.
                 */
                fun payingCustomerId(payingCustomerId: Optional<String>) =
                    payingCustomerId(payingCustomerId.getOrNull())

                /**
                 * Sets [Builder.payingCustomerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payingCustomerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                fun prices(prices: List<Price>) = prices(JsonField.of(prices))

                /**
                 * Sets [Builder.prices] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prices] with a well-typed `List<Price>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.resourceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun resourceId(resourceId: JsonField<String>) = apply {
                    this.resourceId = resourceId
                }

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
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun trialEndDate(trialEndDate: JsonField<OffsetDateTime>) = apply {
                    this.trialEndDate = trialEndDate
                }

                fun unitQuantity(unitQuantity: Double) = unitQuantity(JsonField.of(unitQuantity))

                /**
                 * Sets [Builder.unitQuantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitQuantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [Subscription].
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
                fun build(): Subscription =
                    Subscription(
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
                        (prices ?: JsonMissing.of()).map { it.toImmutable() },
                        resourceId,
                        trialEndDate,
                        unitQuantity,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Subscription = apply {
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
                prices().ifPresent { it.forEach { it.validate() } }
                resourceId()
                trialEndDate()
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
                    (prices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (resourceId.asKnown().isPresent) 1 else 0) +
                    (if (trialEndDate.asKnown().isPresent) 1 else 0) +
                    (if (unitQuantity.asKnown().isPresent) 1 else 0)

            /** Payment collection */
            class PaymentCollection
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
                 * An instance of [PaymentCollection] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
            class PricingType
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [Status] was instantiated with an unknown
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
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
            class CancelReason
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
                 * An enum containing [CancelReason]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [CancelReason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [CancelReason] was instantiated with an
                     * unknown value.
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
                 * @throws StiggInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An enum containing [PaymentCollectionMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [PaymentCollectionMethod] can contain an unknown value in a couple
                 * of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHARGE,
                    INVOICE,
                    NONE,
                    /**
                     * An enum member indicating that [PaymentCollectionMethod] was instantiated
                     * with an unknown value.
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
                            throw StiggInvalidDataException(
                                "Unknown PaymentCollectionMethod: $value"
                            )
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
                private val baseCharge: JsonField<Boolean>,
                private val blockSize: JsonField<Double>,
                private val featureId: JsonField<String>,
                private val price: JsonField<InnerPrice>,
                private val tiers: JsonField<List<Tier>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("addonId")
                    @ExcludeMissing
                    addonId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("baseCharge")
                    @ExcludeMissing
                    baseCharge: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("blockSize")
                    @ExcludeMissing
                    blockSize: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("featureId")
                    @ExcludeMissing
                    featureId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("price")
                    @ExcludeMissing
                    price: JsonField<InnerPrice> = JsonMissing.of(),
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    tiers: JsonField<List<Tier>> = JsonMissing.of(),
                ) : this(addonId, baseCharge, blockSize, featureId, price, tiers, mutableMapOf())

                /**
                 * Addon identifier for the price override
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun addonId(): Optional<String> = addonId.getOptional("addonId")

                /**
                 * Whether this is a base charge override
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun baseCharge(): Optional<Boolean> = baseCharge.getOptional("baseCharge")

                /**
                 * Block size for pricing
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun blockSize(): Optional<Double> = blockSize.getOptional("blockSize")

                /**
                 * Feature identifier for the price override
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun featureId(): Optional<String> = featureId.getOptional("featureId")

                /**
                 * Override price amount
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun price(): Optional<InnerPrice> = price.getOptional("price")

                /**
                 * Pricing tiers configuration
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

                /**
                 * Returns the raw JSON value of [addonId].
                 *
                 * Unlike [addonId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("addonId") @ExcludeMissing fun _addonId(): JsonField<String> = addonId

                /**
                 * Returns the raw JSON value of [baseCharge].
                 *
                 * Unlike [baseCharge], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("baseCharge")
                @ExcludeMissing
                fun _baseCharge(): JsonField<Boolean> = baseCharge

                /**
                 * Returns the raw JSON value of [blockSize].
                 *
                 * Unlike [blockSize], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("blockSize")
                @ExcludeMissing
                fun _blockSize(): JsonField<Double> = blockSize

                /**
                 * Returns the raw JSON value of [featureId].
                 *
                 * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("featureId")
                @ExcludeMissing
                fun _featureId(): JsonField<String> = featureId

                /**
                 * Returns the raw JSON value of [price].
                 *
                 * Unlike [price], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<InnerPrice> = price

                /**
                 * Returns the raw JSON value of [tiers].
                 *
                 * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                    private var baseCharge: JsonField<Boolean> = JsonMissing.of()
                    private var blockSize: JsonField<Double> = JsonMissing.of()
                    private var featureId: JsonField<String> = JsonMissing.of()
                    private var price: JsonField<InnerPrice> = JsonMissing.of()
                    private var tiers: JsonField<MutableList<Tier>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(price: Price) = apply {
                        addonId = price.addonId
                        baseCharge = price.baseCharge
                        blockSize = price.blockSize
                        featureId = price.featureId
                        this.price = price.price
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
                     * You should usually call [Builder.addonId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun addonId(addonId: JsonField<String>) = apply { this.addonId = addonId }

                    /** Whether this is a base charge override */
                    fun baseCharge(baseCharge: Boolean) = baseCharge(JsonField.of(baseCharge))

                    /**
                     * Sets [Builder.baseCharge] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.baseCharge] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun baseCharge(baseCharge: JsonField<Boolean>) = apply {
                        this.baseCharge = baseCharge
                    }

                    /** Block size for pricing */
                    fun blockSize(blockSize: Double) = blockSize(JsonField.of(blockSize))

                    /**
                     * Sets [Builder.blockSize] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.blockSize] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun blockSize(blockSize: JsonField<Double>) = apply {
                        this.blockSize = blockSize
                    }

                    /** Feature identifier for the price override */
                    fun featureId(featureId: String?) = featureId(JsonField.ofNullable(featureId))

                    /** Alias for calling [Builder.featureId] with `featureId.orElse(null)`. */
                    fun featureId(featureId: Optional<String>) = featureId(featureId.getOrNull())

                    /**
                     * Sets [Builder.featureId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.featureId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun featureId(featureId: JsonField<String>) = apply {
                        this.featureId = featureId
                    }

                    /** Override price amount */
                    fun price(price: InnerPrice) = price(JsonField.of(price))

                    /**
                     * Sets [Builder.price] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.price] with a well-typed [InnerPrice] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun price(price: JsonField<InnerPrice>) = apply { this.price = price }

                    /** Pricing tiers configuration */
                    fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                    /**
                     * Sets [Builder.tiers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     */
                    fun build(): Price =
                        Price(
                            addonId,
                            baseCharge,
                            blockSize,
                            featureId,
                            price,
                            (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Price = apply {
                    if (validated) {
                        return@apply
                    }

                    addonId()
                    baseCharge()
                    blockSize()
                    featureId()
                    price().ifPresent { it.validate() }
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
                        (if (baseCharge.asKnown().isPresent) 1 else 0) +
                        (if (blockSize.asKnown().isPresent) 1 else 0) +
                        (if (featureId.asKnown().isPresent) 1 else 0) +
                        (price.asKnown().getOrNull()?.validity() ?: 0) +
                        (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                /** Override price amount */
                class InnerPrice
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Double>,
                    private val billingCountryCode: JsonField<String>,
                    private val currency: JsonField<Currency>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("billingCountryCode")
                        @ExcludeMissing
                        billingCountryCode: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<Currency> = JsonMissing.of(),
                    ) : this(amount, billingCountryCode, currency, mutableMapOf())

                    /**
                     * The price amount
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun amount(): Optional<Double> = amount.getOptional("amount")

                    /**
                     * The billing country code of the price
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun billingCountryCode(): Optional<String> =
                        billingCountryCode.getOptional("billingCountryCode")

                    /**
                     * The price currency
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun currency(): Optional<Currency> = currency.getOptional("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    /**
                     * Returns the raw JSON value of [billingCountryCode].
                     *
                     * Unlike [billingCountryCode], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("billingCountryCode")
                    @ExcludeMissing
                    fun _billingCountryCode(): JsonField<String> = billingCountryCode

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                         * Returns a mutable builder for constructing an instance of [InnerPrice].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [InnerPrice]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Double> = JsonMissing.of()
                        private var billingCountryCode: JsonField<String> = JsonMissing.of()
                        private var currency: JsonField<Currency> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(innerPrice: InnerPrice) = apply {
                            amount = innerPrice.amount
                            billingCountryCode = innerPrice.billingCountryCode
                            currency = innerPrice.currency
                            additionalProperties = innerPrice.additionalProperties.toMutableMap()
                        }

                        /** The price amount */
                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        /** The billing country code of the price */
                        fun billingCountryCode(billingCountryCode: String?) =
                            billingCountryCode(JsonField.ofNullable(billingCountryCode))

                        /**
                         * Alias for calling [Builder.billingCountryCode] with
                         * `billingCountryCode.orElse(null)`.
                         */
                        fun billingCountryCode(billingCountryCode: Optional<String>) =
                            billingCountryCode(billingCountryCode.getOrNull())

                        /**
                         * Sets [Builder.billingCountryCode] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.billingCountryCode] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun billingCountryCode(billingCountryCode: JsonField<String>) = apply {
                            this.billingCountryCode = billingCountryCode
                        }

                        /** The price currency */
                        fun currency(currency: Currency) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [Currency]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<Currency>) = apply {
                            this.currency = currency
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [InnerPrice].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): InnerPrice =
                            InnerPrice(
                                amount,
                                billingCountryCode,
                                currency,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): InnerPrice = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        billingCountryCode()
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
                            (if (billingCountryCode.asKnown().isPresent) 1 else 0) +
                            (currency.asKnown().getOrNull()?.validity() ?: 0)

                    /** The price currency */
                    class Currency
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
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
                         * An instance of [Currency] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
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
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws StiggInvalidDataException if this class instance's value is a not
                         *   a known member.
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
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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

                        return other is InnerPrice &&
                            amount == other.amount &&
                            billingCountryCode == other.billingCountryCode &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, billingCountryCode, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerPrice{amount=$amount, billingCountryCode=$billingCountryCode, currency=$currency, additionalProperties=$additionalProperties}"
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
                        @JsonProperty("upTo")
                        @ExcludeMissing
                        upTo: JsonField<Double> = JsonMissing.of(),
                    ) : this(flatPrice, unitPrice, upTo, mutableMapOf())

                    /**
                     * The flat fee price of the price tier
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun flatPrice(): Optional<FlatPrice> = flatPrice.getOptional("flatPrice")

                    /**
                     * The unit price of the price tier
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun unitPrice(): Optional<UnitPrice> = unitPrice.getOptional("unitPrice")

                    /**
                     * The up to quantity of the price tier
                     *
                     * @throws StiggInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun upTo(): Optional<Double> = upTo.getOptional("upTo")

                    /**
                     * Returns the raw JSON value of [flatPrice].
                     *
                     * Unlike [flatPrice], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("flatPrice")
                    @ExcludeMissing
                    fun _flatPrice(): JsonField<FlatPrice> = flatPrice

                    /**
                     * Returns the raw JSON value of [unitPrice].
                     *
                     * Unlike [unitPrice], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("unitPrice")
                    @ExcludeMissing
                    fun _unitPrice(): JsonField<UnitPrice> = unitPrice

                    /**
                     * Returns the raw JSON value of [upTo].
                     *
                     * Unlike [upTo], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

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
                         * You should usually call [Builder.flatPrice] with a well-typed [FlatPrice]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun flatPrice(flatPrice: JsonField<FlatPrice>) = apply {
                            this.flatPrice = flatPrice
                        }

                        /** The unit price of the price tier */
                        fun unitPrice(unitPrice: UnitPrice) = unitPrice(JsonField.of(unitPrice))

                        /**
                         * Sets [Builder.unitPrice] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unitPrice] with a well-typed [UnitPrice]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unitPrice(unitPrice: JsonField<UnitPrice>) = apply {
                            this.unitPrice = unitPrice
                        }

                        /** The up to quantity of the price tier */
                        fun upTo(upTo: Double) = upTo(JsonField.of(upTo))

                        /**
                         * Sets [Builder.upTo] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.upTo] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun upTo(upTo: JsonField<Double>) = apply { this.upTo = upTo }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                        private val billingCountryCode: JsonField<String>,
                        private val currency: JsonField<Currency>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("amount")
                            @ExcludeMissing
                            amount: JsonField<Double> = JsonMissing.of(),
                            @JsonProperty("billingCountryCode")
                            @ExcludeMissing
                            billingCountryCode: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("currency")
                            @ExcludeMissing
                            currency: JsonField<Currency> = JsonMissing.of(),
                        ) : this(amount, billingCountryCode, currency, mutableMapOf())

                        /**
                         * The price amount
                         *
                         * @throws StiggInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun amount(): Optional<Double> = amount.getOptional("amount")

                        /**
                         * The billing country code of the price
                         *
                         * @throws StiggInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun billingCountryCode(): Optional<String> =
                            billingCountryCode.getOptional("billingCountryCode")

                        /**
                         * The price currency
                         *
                         * @throws StiggInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun currency(): Optional<Currency> = currency.getOptional("currency")

                        /**
                         * Returns the raw JSON value of [amount].
                         *
                         * Unlike [amount], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("amount")
                        @ExcludeMissing
                        fun _amount(): JsonField<Double> = amount

                        /**
                         * Returns the raw JSON value of [billingCountryCode].
                         *
                         * Unlike [billingCountryCode], this method doesn't throw if the JSON field
                         * has an unexpected type.
                         */
                        @JsonProperty("billingCountryCode")
                        @ExcludeMissing
                        fun _billingCountryCode(): JsonField<String> = billingCountryCode

                        /**
                         * Returns the raw JSON value of [currency].
                         *
                         * Unlike [currency], this method doesn't throw if the JSON field has an
                         * unexpected type.
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
                             * Returns a mutable builder for constructing an instance of
                             * [FlatPrice].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [FlatPrice]. */
                        class Builder internal constructor() {

                            private var amount: JsonField<Double> = JsonMissing.of()
                            private var billingCountryCode: JsonField<String> = JsonMissing.of()
                            private var currency: JsonField<Currency> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(flatPrice: FlatPrice) = apply {
                                amount = flatPrice.amount
                                billingCountryCode = flatPrice.billingCountryCode
                                currency = flatPrice.currency
                                additionalProperties = flatPrice.additionalProperties.toMutableMap()
                            }

                            /** The price amount */
                            fun amount(amount: Double) = amount(JsonField.of(amount))

                            /**
                             * Sets [Builder.amount] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.amount] with a well-typed [Double]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                            /** The billing country code of the price */
                            fun billingCountryCode(billingCountryCode: String?) =
                                billingCountryCode(JsonField.ofNullable(billingCountryCode))

                            /**
                             * Alias for calling [Builder.billingCountryCode] with
                             * `billingCountryCode.orElse(null)`.
                             */
                            fun billingCountryCode(billingCountryCode: Optional<String>) =
                                billingCountryCode(billingCountryCode.getOrNull())

                            /**
                             * Sets [Builder.billingCountryCode] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.billingCountryCode] with a
                             * well-typed [String] value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun billingCountryCode(billingCountryCode: JsonField<String>) = apply {
                                this.billingCountryCode = billingCountryCode
                            }

                            /** The price currency */
                            fun currency(currency: Currency) = currency(JsonField.of(currency))

                            /**
                             * Sets [Builder.currency] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.currency] with a well-typed
                             * [Currency] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun currency(currency: JsonField<Currency>) = apply {
                                this.currency = currency
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [FlatPrice].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): FlatPrice =
                                FlatPrice(
                                    amount,
                                    billingCountryCode,
                                    currency,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): FlatPrice = apply {
                            if (validated) {
                                return@apply
                            }

                            amount()
                            billingCountryCode()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (amount.asKnown().isPresent) 1 else 0) +
                                (if (billingCountryCode.asKnown().isPresent) 1 else 0) +
                                (currency.asKnown().getOrNull()?.validity() ?: 0)

                        /** The price currency */
                        class Currency
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
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
                             * An enum containing [Currency]'s known values, as well as an
                             * [_UNKNOWN] member.
                             *
                             * An instance of [Currency] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
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
                                 * An enum member indicating that [Currency] was instantiated with
                                 * an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
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
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws StiggInvalidDataException if this class instance's value is a
                             *   not a known member.
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
                                    else ->
                                        throw StiggInvalidDataException("Unknown Currency: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws StiggInvalidDataException if this class instance's value does
                             *   not have the expected primitive type.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                                billingCountryCode == other.billingCountryCode &&
                                currency == other.currency &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(amount, billingCountryCode, currency, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "FlatPrice{amount=$amount, billingCountryCode=$billingCountryCode, currency=$currency, additionalProperties=$additionalProperties}"
                    }

                    /** The unit price of the price tier */
                    class UnitPrice
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val amount: JsonField<Double>,
                        private val billingCountryCode: JsonField<String>,
                        private val currency: JsonField<Currency>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("amount")
                            @ExcludeMissing
                            amount: JsonField<Double> = JsonMissing.of(),
                            @JsonProperty("billingCountryCode")
                            @ExcludeMissing
                            billingCountryCode: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("currency")
                            @ExcludeMissing
                            currency: JsonField<Currency> = JsonMissing.of(),
                        ) : this(amount, billingCountryCode, currency, mutableMapOf())

                        /**
                         * The price amount
                         *
                         * @throws StiggInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun amount(): Optional<Double> = amount.getOptional("amount")

                        /**
                         * The billing country code of the price
                         *
                         * @throws StiggInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun billingCountryCode(): Optional<String> =
                            billingCountryCode.getOptional("billingCountryCode")

                        /**
                         * The price currency
                         *
                         * @throws StiggInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun currency(): Optional<Currency> = currency.getOptional("currency")

                        /**
                         * Returns the raw JSON value of [amount].
                         *
                         * Unlike [amount], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("amount")
                        @ExcludeMissing
                        fun _amount(): JsonField<Double> = amount

                        /**
                         * Returns the raw JSON value of [billingCountryCode].
                         *
                         * Unlike [billingCountryCode], this method doesn't throw if the JSON field
                         * has an unexpected type.
                         */
                        @JsonProperty("billingCountryCode")
                        @ExcludeMissing
                        fun _billingCountryCode(): JsonField<String> = billingCountryCode

                        /**
                         * Returns the raw JSON value of [currency].
                         *
                         * Unlike [currency], this method doesn't throw if the JSON field has an
                         * unexpected type.
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
                             * Returns a mutable builder for constructing an instance of
                             * [UnitPrice].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [UnitPrice]. */
                        class Builder internal constructor() {

                            private var amount: JsonField<Double> = JsonMissing.of()
                            private var billingCountryCode: JsonField<String> = JsonMissing.of()
                            private var currency: JsonField<Currency> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(unitPrice: UnitPrice) = apply {
                                amount = unitPrice.amount
                                billingCountryCode = unitPrice.billingCountryCode
                                currency = unitPrice.currency
                                additionalProperties = unitPrice.additionalProperties.toMutableMap()
                            }

                            /** The price amount */
                            fun amount(amount: Double) = amount(JsonField.of(amount))

                            /**
                             * Sets [Builder.amount] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.amount] with a well-typed [Double]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                            /** The billing country code of the price */
                            fun billingCountryCode(billingCountryCode: String?) =
                                billingCountryCode(JsonField.ofNullable(billingCountryCode))

                            /**
                             * Alias for calling [Builder.billingCountryCode] with
                             * `billingCountryCode.orElse(null)`.
                             */
                            fun billingCountryCode(billingCountryCode: Optional<String>) =
                                billingCountryCode(billingCountryCode.getOrNull())

                            /**
                             * Sets [Builder.billingCountryCode] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.billingCountryCode] with a
                             * well-typed [String] value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun billingCountryCode(billingCountryCode: JsonField<String>) = apply {
                                this.billingCountryCode = billingCountryCode
                            }

                            /** The price currency */
                            fun currency(currency: Currency) = currency(JsonField.of(currency))

                            /**
                             * Sets [Builder.currency] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.currency] with a well-typed
                             * [Currency] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun currency(currency: JsonField<Currency>) = apply {
                                this.currency = currency
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [UnitPrice].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): UnitPrice =
                                UnitPrice(
                                    amount,
                                    billingCountryCode,
                                    currency,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): UnitPrice = apply {
                            if (validated) {
                                return@apply
                            }

                            amount()
                            billingCountryCode()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (amount.asKnown().isPresent) 1 else 0) +
                                (if (billingCountryCode.asKnown().isPresent) 1 else 0) +
                                (currency.asKnown().getOrNull()?.validity() ?: 0)

                        /** The price currency */
                        class Currency
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
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
                             * An enum containing [Currency]'s known values, as well as an
                             * [_UNKNOWN] member.
                             *
                             * An instance of [Currency] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
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
                                 * An enum member indicating that [Currency] was instantiated with
                                 * an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
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
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws StiggInvalidDataException if this class instance's value is a
                             *   not a known member.
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
                                    else ->
                                        throw StiggInvalidDataException("Unknown Currency: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws StiggInvalidDataException if this class instance's value does
                             *   not have the expected primitive type.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                                billingCountryCode == other.billingCountryCode &&
                                currency == other.currency &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(amount, billingCountryCode, currency, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "UnitPrice{amount=$amount, billingCountryCode=$billingCountryCode, currency=$currency, additionalProperties=$additionalProperties}"
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
                        baseCharge == other.baseCharge &&
                        blockSize == other.blockSize &&
                        featureId == other.featureId &&
                        price == other.price &&
                        tiers == other.tiers &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        addonId,
                        baseCharge,
                        blockSize,
                        featureId,
                        price,
                        tiers,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Price{addonId=$addonId, baseCharge=$baseCharge, blockSize=$blockSize, featureId=$featureId, price=$price, tiers=$tiers, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Subscription &&
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
                    prices == other.prices &&
                    resourceId == other.resourceId &&
                    trialEndDate == other.trialEndDate &&
                    unitQuantity == other.unitQuantity &&
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
                    prices,
                    resourceId,
                    trialEndDate,
                    unitQuantity,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Subscription{id=$id, billingId=$billingId, createdAt=$createdAt, customerId=$customerId, paymentCollection=$paymentCollection, planId=$planId, pricingType=$pricingType, startDate=$startDate, status=$status, cancellationDate=$cancellationDate, cancelReason=$cancelReason, currentBillingPeriodEnd=$currentBillingPeriodEnd, currentBillingPeriodStart=$currentBillingPeriodStart, effectiveEndDate=$effectiveEndDate, endDate=$endDate, metadata=$metadata, payingCustomerId=$payingCustomerId, paymentCollectionMethod=$paymentCollectionMethod, prices=$prices, resourceId=$resourceId, trialEndDate=$trialEndDate, unitQuantity=$unitQuantity, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                entitlements == other.entitlements &&
                status == other.status &&
                checkoutBillingId == other.checkoutBillingId &&
                checkoutUrl == other.checkoutUrl &&
                isScheduled == other.isScheduled &&
                subscription == other.subscription &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                entitlements,
                status,
                checkoutBillingId,
                checkoutUrl,
                isScheduled,
                subscription,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, entitlements=$entitlements, status=$status, checkoutBillingId=$checkoutBillingId, checkoutUrl=$checkoutUrl, isScheduled=$isScheduled, subscription=$subscription, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
