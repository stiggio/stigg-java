// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions.usage

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

/** Response object */
class UsageChargeUsageResponse
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
     * Result of charging subscription usage including the billing period and charged items.
     *
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
         * Returns a mutable builder for constructing an instance of [UsageChargeUsageResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageChargeUsageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageChargeUsageResponse: UsageChargeUsageResponse) = apply {
            data = usageChargeUsageResponse.data
            additionalProperties = usageChargeUsageResponse.additionalProperties.toMutableMap()
        }

        /** Result of charging subscription usage including the billing period and charged items. */
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
         * Returns an immutable instance of [UsageChargeUsageResponse].
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
        fun build(): UsageChargeUsageResponse =
            UsageChargeUsageResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UsageChargeUsageResponse = apply {
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

    /** Result of charging subscription usage including the billing period and charged items. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val invoiceBillingId: JsonField<String>,
        private val periodEnd: JsonField<OffsetDateTime>,
        private val periodStart: JsonField<OffsetDateTime>,
        private val subscriptionId: JsonField<String>,
        private val usageCharged: JsonField<List<UsageCharged>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("invoiceBillingId")
            @ExcludeMissing
            invoiceBillingId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("periodEnd")
            @ExcludeMissing
            periodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("periodStart")
            @ExcludeMissing
            periodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("subscriptionId")
            @ExcludeMissing
            subscriptionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("usageCharged")
            @ExcludeMissing
            usageCharged: JsonField<List<UsageCharged>> = JsonMissing.of(),
        ) : this(
            invoiceBillingId,
            periodEnd,
            periodStart,
            subscriptionId,
            usageCharged,
            mutableMapOf(),
        )

        /**
         * The invoice ID in the billing integration
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoiceBillingId(): Optional<String> = invoiceBillingId.getOptional("invoiceBillingId")

        /**
         * End of the usage billing period
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun periodEnd(): OffsetDateTime = periodEnd.getRequired("periodEnd")

        /**
         * Start of the usage billing period
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun periodStart(): OffsetDateTime = periodStart.getRequired("periodStart")

        /**
         * The subscription ID for which usage was charged
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionId(): String = subscriptionId.getRequired("subscriptionId")

        /**
         * Usage items that were charged
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun usageCharged(): List<UsageCharged> = usageCharged.getRequired("usageCharged")

        /**
         * Returns the raw JSON value of [invoiceBillingId].
         *
         * Unlike [invoiceBillingId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoiceBillingId")
        @ExcludeMissing
        fun _invoiceBillingId(): JsonField<String> = invoiceBillingId

        /**
         * Returns the raw JSON value of [periodEnd].
         *
         * Unlike [periodEnd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("periodEnd")
        @ExcludeMissing
        fun _periodEnd(): JsonField<OffsetDateTime> = periodEnd

        /**
         * Returns the raw JSON value of [periodStart].
         *
         * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("periodStart")
        @ExcludeMissing
        fun _periodStart(): JsonField<OffsetDateTime> = periodStart

        /**
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriptionId")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

        /**
         * Returns the raw JSON value of [usageCharged].
         *
         * Unlike [usageCharged], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("usageCharged")
        @ExcludeMissing
        fun _usageCharged(): JsonField<List<UsageCharged>> = usageCharged

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
             * .invoiceBillingId()
             * .periodEnd()
             * .periodStart()
             * .subscriptionId()
             * .usageCharged()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var invoiceBillingId: JsonField<String>? = null
            private var periodEnd: JsonField<OffsetDateTime>? = null
            private var periodStart: JsonField<OffsetDateTime>? = null
            private var subscriptionId: JsonField<String>? = null
            private var usageCharged: JsonField<MutableList<UsageCharged>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                invoiceBillingId = data.invoiceBillingId
                periodEnd = data.periodEnd
                periodStart = data.periodStart
                subscriptionId = data.subscriptionId
                usageCharged = data.usageCharged.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The invoice ID in the billing integration */
            fun invoiceBillingId(invoiceBillingId: String?) =
                invoiceBillingId(JsonField.ofNullable(invoiceBillingId))

            /**
             * Alias for calling [Builder.invoiceBillingId] with `invoiceBillingId.orElse(null)`.
             */
            fun invoiceBillingId(invoiceBillingId: Optional<String>) =
                invoiceBillingId(invoiceBillingId.getOrNull())

            /**
             * Sets [Builder.invoiceBillingId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceBillingId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceBillingId(invoiceBillingId: JsonField<String>) = apply {
                this.invoiceBillingId = invoiceBillingId
            }

            /** End of the usage billing period */
            fun periodEnd(periodEnd: OffsetDateTime) = periodEnd(JsonField.of(periodEnd))

            /**
             * Sets [Builder.periodEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodEnd] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply {
                this.periodEnd = periodEnd
            }

            /** Start of the usage billing period */
            fun periodStart(periodStart: OffsetDateTime) = periodStart(JsonField.of(periodStart))

            /**
             * Sets [Builder.periodStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodStart] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
                this.periodStart = periodStart
            }

            /** The subscription ID for which usage was charged */
            fun subscriptionId(subscriptionId: String) =
                subscriptionId(JsonField.of(subscriptionId))

            /**
             * Sets [Builder.subscriptionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                this.subscriptionId = subscriptionId
            }

            /** Usage items that were charged */
            fun usageCharged(usageCharged: List<UsageCharged>) =
                usageCharged(JsonField.of(usageCharged))

            /**
             * Sets [Builder.usageCharged] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageCharged] with a well-typed `List<UsageCharged>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun usageCharged(usageCharged: JsonField<List<UsageCharged>>) = apply {
                this.usageCharged = usageCharged.map { it.toMutableList() }
            }

            /**
             * Adds a single [UsageCharged] to [Builder.usageCharged].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUsageCharged(usageCharged: UsageCharged) = apply {
                this.usageCharged =
                    (this.usageCharged ?: JsonField.of(mutableListOf())).also {
                        checkKnown("usageCharged", it).add(usageCharged)
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .invoiceBillingId()
             * .periodEnd()
             * .periodStart()
             * .subscriptionId()
             * .usageCharged()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("invoiceBillingId", invoiceBillingId),
                    checkRequired("periodEnd", periodEnd),
                    checkRequired("periodStart", periodStart),
                    checkRequired("subscriptionId", subscriptionId),
                    checkRequired("usageCharged", usageCharged).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            invoiceBillingId()
            periodEnd()
            periodStart()
            subscriptionId()
            usageCharged().forEach { it.validate() }
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
            (if (invoiceBillingId.asKnown().isPresent) 1 else 0) +
                (if (periodEnd.asKnown().isPresent) 1 else 0) +
                (if (periodStart.asKnown().isPresent) 1 else 0) +
                (if (subscriptionId.asKnown().isPresent) 1 else 0) +
                (usageCharged.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** A single usage item that was charged. */
        class UsageCharged
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val featureId: JsonField<String>,
            private val usageAmount: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("featureId")
                @ExcludeMissing
                featureId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("usageAmount")
                @ExcludeMissing
                usageAmount: JsonField<Double> = JsonMissing.of(),
            ) : this(featureId, usageAmount, mutableMapOf())

            /**
             * The feature ID for which usage was charged
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun featureId(): Optional<String> = featureId.getOptional("featureId")

            /**
             * The number of units charged
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usageAmount(): Double = usageAmount.getRequired("usageAmount")

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
             * Returns the raw JSON value of [usageAmount].
             *
             * Unlike [usageAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usageAmount")
            @ExcludeMissing
            fun _usageAmount(): JsonField<Double> = usageAmount

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
                 * Returns a mutable builder for constructing an instance of [UsageCharged].
                 *
                 * The following fields are required:
                 * ```java
                 * .featureId()
                 * .usageAmount()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UsageCharged]. */
            class Builder internal constructor() {

                private var featureId: JsonField<String>? = null
                private var usageAmount: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(usageCharged: UsageCharged) = apply {
                    featureId = usageCharged.featureId
                    usageAmount = usageCharged.usageAmount
                    additionalProperties = usageCharged.additionalProperties.toMutableMap()
                }

                /** The feature ID for which usage was charged */
                fun featureId(featureId: String?) = featureId(JsonField.ofNullable(featureId))

                /** Alias for calling [Builder.featureId] with `featureId.orElse(null)`. */
                fun featureId(featureId: Optional<String>) = featureId(featureId.getOrNull())

                /**
                 * Sets [Builder.featureId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.featureId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

                /** The number of units charged */
                fun usageAmount(usageAmount: Double) = usageAmount(JsonField.of(usageAmount))

                /**
                 * Sets [Builder.usageAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageAmount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usageAmount(usageAmount: JsonField<Double>) = apply {
                    this.usageAmount = usageAmount
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
                 * Returns an immutable instance of [UsageCharged].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .featureId()
                 * .usageAmount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsageCharged =
                    UsageCharged(
                        checkRequired("featureId", featureId),
                        checkRequired("usageAmount", usageAmount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UsageCharged = apply {
                if (validated) {
                    return@apply
                }

                featureId()
                usageAmount()
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
                    (if (usageAmount.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UsageCharged &&
                    featureId == other.featureId &&
                    usageAmount == other.usageAmount &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(featureId, usageAmount, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsageCharged{featureId=$featureId, usageAmount=$usageAmount, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                invoiceBillingId == other.invoiceBillingId &&
                periodEnd == other.periodEnd &&
                periodStart == other.periodStart &&
                subscriptionId == other.subscriptionId &&
                usageCharged == other.usageCharged &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                invoiceBillingId,
                periodEnd,
                periodStart,
                subscriptionId,
                usageCharged,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{invoiceBillingId=$invoiceBillingId, periodEnd=$periodEnd, periodStart=$periodStart, subscriptionId=$subscriptionId, usageCharged=$usageCharged, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageChargeUsageResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageChargeUsageResponse{data=$data, additionalProperties=$additionalProperties}"
}
