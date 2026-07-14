// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response object */
class EventEstimateCostResponse
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
     * Estimated credit cost, current balance and balance after
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
         * Returns a mutable builder for constructing an instance of [EventEstimateCostResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventEstimateCostResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventEstimateCostResponse: EventEstimateCostResponse) = apply {
            data = eventEstimateCostResponse.data
            additionalProperties = eventEstimateCostResponse.additionalProperties.toMutableMap()
        }

        /** Estimated credit cost, current balance and balance after */
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
         * Returns an immutable instance of [EventEstimateCostResponse].
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
        fun build(): EventEstimateCostResponse =
            EventEstimateCostResponse(
                checkRequired("data", data),
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
    fun validate(): EventEstimateCostResponse = apply {
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

    /** Estimated credit cost, current balance and balance after */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val estimates: JsonField<List<Estimate>>,
        private val warnings: JsonField<List<Warning>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("estimates")
            @ExcludeMissing
            estimates: JsonField<List<Estimate>> = JsonMissing.of(),
            @JsonProperty("warnings")
            @ExcludeMissing
            warnings: JsonField<List<Warning>> = JsonMissing.of(),
        ) : this(estimates, warnings, mutableMapOf())

        /**
         * Per-currency cost estimates
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun estimates(): List<Estimate> = estimates.getRequired("estimates")

        /**
         * Request-level warnings about the estimation context
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun warnings(): List<Warning> = warnings.getRequired("warnings")

        /**
         * Returns the raw JSON value of [estimates].
         *
         * Unlike [estimates], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("estimates")
        @ExcludeMissing
        fun _estimates(): JsonField<List<Estimate>> = estimates

        /**
         * Returns the raw JSON value of [warnings].
         *
         * Unlike [warnings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("warnings")
        @ExcludeMissing
        fun _warnings(): JsonField<List<Warning>> = warnings

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
             * .estimates()
             * .warnings()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var estimates: JsonField<MutableList<Estimate>>? = null
            private var warnings: JsonField<MutableList<Warning>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                estimates = data.estimates.map { it.toMutableList() }
                warnings = data.warnings.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Per-currency cost estimates */
            fun estimates(estimates: List<Estimate>) = estimates(JsonField.of(estimates))

            /**
             * Sets [Builder.estimates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.estimates] with a well-typed `List<Estimate>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun estimates(estimates: JsonField<List<Estimate>>) = apply {
                this.estimates = estimates.map { it.toMutableList() }
            }

            /**
             * Adds a single [Estimate] to [estimates].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEstimate(estimate: Estimate) = apply {
                estimates =
                    (estimates ?: JsonField.of(mutableListOf())).also {
                        checkKnown("estimates", it).add(estimate)
                    }
            }

            /** Request-level warnings about the estimation context */
            fun warnings(warnings: List<Warning>) = warnings(JsonField.of(warnings))

            /**
             * Sets [Builder.warnings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.warnings] with a well-typed `List<Warning>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun warnings(warnings: JsonField<List<Warning>>) = apply {
                this.warnings = warnings.map { it.toMutableList() }
            }

            /**
             * Adds a single [Warning] to [warnings].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWarning(warning: Warning) = apply {
                warnings =
                    (warnings ?: JsonField.of(mutableListOf())).also {
                        checkKnown("warnings", it).add(warning)
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
             * .estimates()
             * .warnings()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("estimates", estimates).map { it.toImmutable() },
                    checkRequired("warnings", warnings).map { it.toImmutable() },
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            estimates().forEach { it.validate() }
            warnings().forEach { it.validate() }
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
            (estimates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (warnings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Estimate
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val balanceAfterEstimate: JsonField<Double>,
            private val breakdown: JsonField<List<Breakdown>>,
            private val currencyId: JsonField<String>,
            private val currentBalance: JsonField<Double>,
            private val estimatedCost: JsonField<Double>,
            private val wouldOverdraft: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("balanceAfterEstimate")
                @ExcludeMissing
                balanceAfterEstimate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("breakdown")
                @ExcludeMissing
                breakdown: JsonField<List<Breakdown>> = JsonMissing.of(),
                @JsonProperty("currencyId")
                @ExcludeMissing
                currencyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currentBalance")
                @ExcludeMissing
                currentBalance: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("estimatedCost")
                @ExcludeMissing
                estimatedCost: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("wouldOverdraft")
                @ExcludeMissing
                wouldOverdraft: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                balanceAfterEstimate,
                breakdown,
                currencyId,
                currentBalance,
                estimatedCost,
                wouldOverdraft,
                mutableMapOf(),
            )

            /**
             * The credit balance after subtracting the estimated cost
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun balanceAfterEstimate(): Double =
                balanceAfterEstimate.getRequired("balanceAfterEstimate")

            /**
             * Estimated cost contribution per feature
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun breakdown(): List<Breakdown> = breakdown.getRequired("breakdown")

            /**
             * The credit currency identifier
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currencyId(): String = currencyId.getRequired("currencyId")

            /**
             * The current credit balance, including not-yet-reconciled consumption
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currentBalance(): Double = currentBalance.getRequired("currentBalance")

            /**
             * The estimated credit cost of the reported event or usage
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun estimatedCost(): Double = estimatedCost.getRequired("estimatedCost")

            /**
             * Whether the estimated consumption would bring the balance below zero
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun wouldOverdraft(): Boolean = wouldOverdraft.getRequired("wouldOverdraft")

            /**
             * Returns the raw JSON value of [balanceAfterEstimate].
             *
             * Unlike [balanceAfterEstimate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("balanceAfterEstimate")
            @ExcludeMissing
            fun _balanceAfterEstimate(): JsonField<Double> = balanceAfterEstimate

            /**
             * Returns the raw JSON value of [breakdown].
             *
             * Unlike [breakdown], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("breakdown")
            @ExcludeMissing
            fun _breakdown(): JsonField<List<Breakdown>> = breakdown

            /**
             * Returns the raw JSON value of [currencyId].
             *
             * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currencyId")
            @ExcludeMissing
            fun _currencyId(): JsonField<String> = currencyId

            /**
             * Returns the raw JSON value of [currentBalance].
             *
             * Unlike [currentBalance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("currentBalance")
            @ExcludeMissing
            fun _currentBalance(): JsonField<Double> = currentBalance

            /**
             * Returns the raw JSON value of [estimatedCost].
             *
             * Unlike [estimatedCost], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("estimatedCost")
            @ExcludeMissing
            fun _estimatedCost(): JsonField<Double> = estimatedCost

            /**
             * Returns the raw JSON value of [wouldOverdraft].
             *
             * Unlike [wouldOverdraft], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("wouldOverdraft")
            @ExcludeMissing
            fun _wouldOverdraft(): JsonField<Boolean> = wouldOverdraft

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
                 * Returns a mutable builder for constructing an instance of [Estimate].
                 *
                 * The following fields are required:
                 * ```java
                 * .balanceAfterEstimate()
                 * .breakdown()
                 * .currencyId()
                 * .currentBalance()
                 * .estimatedCost()
                 * .wouldOverdraft()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Estimate]. */
            class Builder internal constructor() {

                private var balanceAfterEstimate: JsonField<Double>? = null
                private var breakdown: JsonField<MutableList<Breakdown>>? = null
                private var currencyId: JsonField<String>? = null
                private var currentBalance: JsonField<Double>? = null
                private var estimatedCost: JsonField<Double>? = null
                private var wouldOverdraft: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(estimate: Estimate) = apply {
                    balanceAfterEstimate = estimate.balanceAfterEstimate
                    breakdown = estimate.breakdown.map { it.toMutableList() }
                    currencyId = estimate.currencyId
                    currentBalance = estimate.currentBalance
                    estimatedCost = estimate.estimatedCost
                    wouldOverdraft = estimate.wouldOverdraft
                    additionalProperties = estimate.additionalProperties.toMutableMap()
                }

                /** The credit balance after subtracting the estimated cost */
                fun balanceAfterEstimate(balanceAfterEstimate: Double) =
                    balanceAfterEstimate(JsonField.of(balanceAfterEstimate))

                /**
                 * Sets [Builder.balanceAfterEstimate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.balanceAfterEstimate] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun balanceAfterEstimate(balanceAfterEstimate: JsonField<Double>) = apply {
                    this.balanceAfterEstimate = balanceAfterEstimate
                }

                /** Estimated cost contribution per feature */
                fun breakdown(breakdown: List<Breakdown>) = breakdown(JsonField.of(breakdown))

                /**
                 * Sets [Builder.breakdown] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.breakdown] with a well-typed `List<Breakdown>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun breakdown(breakdown: JsonField<List<Breakdown>>) = apply {
                    this.breakdown = breakdown.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Breakdown] to [Builder.breakdown].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addBreakdown(breakdown: Breakdown) = apply {
                    this.breakdown =
                        (this.breakdown ?: JsonField.of(mutableListOf())).also {
                            checkKnown("breakdown", it).add(breakdown)
                        }
                }

                /** The credit currency identifier */
                fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

                /**
                 * Sets [Builder.currencyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currencyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currencyId(currencyId: JsonField<String>) = apply {
                    this.currencyId = currencyId
                }

                /** The current credit balance, including not-yet-reconciled consumption */
                fun currentBalance(currentBalance: Double) =
                    currentBalance(JsonField.of(currentBalance))

                /**
                 * Sets [Builder.currentBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currentBalance] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currentBalance(currentBalance: JsonField<Double>) = apply {
                    this.currentBalance = currentBalance
                }

                /** The estimated credit cost of the reported event or usage */
                fun estimatedCost(estimatedCost: Double) =
                    estimatedCost(JsonField.of(estimatedCost))

                /**
                 * Sets [Builder.estimatedCost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.estimatedCost] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun estimatedCost(estimatedCost: JsonField<Double>) = apply {
                    this.estimatedCost = estimatedCost
                }

                /** Whether the estimated consumption would bring the balance below zero */
                fun wouldOverdraft(wouldOverdraft: Boolean) =
                    wouldOverdraft(JsonField.of(wouldOverdraft))

                /**
                 * Sets [Builder.wouldOverdraft] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.wouldOverdraft] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun wouldOverdraft(wouldOverdraft: JsonField<Boolean>) = apply {
                    this.wouldOverdraft = wouldOverdraft
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
                 * Returns an immutable instance of [Estimate].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .balanceAfterEstimate()
                 * .breakdown()
                 * .currencyId()
                 * .currentBalance()
                 * .estimatedCost()
                 * .wouldOverdraft()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Estimate =
                    Estimate(
                        checkRequired("balanceAfterEstimate", balanceAfterEstimate),
                        checkRequired("breakdown", breakdown).map { it.toImmutable() },
                        checkRequired("currencyId", currencyId),
                        checkRequired("currentBalance", currentBalance),
                        checkRequired("estimatedCost", estimatedCost),
                        checkRequired("wouldOverdraft", wouldOverdraft),
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
            fun validate(): Estimate = apply {
                if (validated) {
                    return@apply
                }

                balanceAfterEstimate()
                breakdown().forEach { it.validate() }
                currencyId()
                currentBalance()
                estimatedCost()
                wouldOverdraft()
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
                (if (balanceAfterEstimate.asKnown().isPresent) 1 else 0) +
                    (breakdown.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (currencyId.asKnown().isPresent) 1 else 0) +
                    (if (currentBalance.asKnown().isPresent) 1 else 0) +
                    (if (estimatedCost.asKnown().isPresent) 1 else 0) +
                    (if (wouldOverdraft.asKnown().isPresent) 1 else 0)

            class Breakdown
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cost: JsonField<Double>,
                private val featureId: JsonField<String>,
                private val warningCode: JsonField<WarningCode>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cost")
                    @ExcludeMissing
                    cost: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("featureId")
                    @ExcludeMissing
                    featureId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("warningCode")
                    @ExcludeMissing
                    warningCode: JsonField<WarningCode> = JsonMissing.of(),
                ) : this(cost, featureId, warningCode, mutableMapOf())

                /**
                 * The estimated credit cost contributed by this feature
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cost(): Double = cost.getRequired("cost")

                /**
                 * The feature whose meter contributed this cost
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun featureId(): String = featureId.getRequired("featureId")

                /**
                 * Warning explaining why this cost may be inaccurate, if any
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun warningCode(): Optional<WarningCode> = warningCode.getOptional("warningCode")

                /**
                 * Returns the raw JSON value of [cost].
                 *
                 * Unlike [cost], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Double> = cost

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
                 * Returns the raw JSON value of [warningCode].
                 *
                 * Unlike [warningCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("warningCode")
                @ExcludeMissing
                fun _warningCode(): JsonField<WarningCode> = warningCode

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
                     * Returns a mutable builder for constructing an instance of [Breakdown].
                     *
                     * The following fields are required:
                     * ```java
                     * .cost()
                     * .featureId()
                     * .warningCode()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Breakdown]. */
                class Builder internal constructor() {

                    private var cost: JsonField<Double>? = null
                    private var featureId: JsonField<String>? = null
                    private var warningCode: JsonField<WarningCode>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(breakdown: Breakdown) = apply {
                        cost = breakdown.cost
                        featureId = breakdown.featureId
                        warningCode = breakdown.warningCode
                        additionalProperties = breakdown.additionalProperties.toMutableMap()
                    }

                    /** The estimated credit cost contributed by this feature */
                    fun cost(cost: Double) = cost(JsonField.of(cost))

                    /**
                     * Sets [Builder.cost] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cost] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cost(cost: JsonField<Double>) = apply { this.cost = cost }

                    /** The feature whose meter contributed this cost */
                    fun featureId(featureId: String) = featureId(JsonField.of(featureId))

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

                    /** Warning explaining why this cost may be inaccurate, if any */
                    fun warningCode(warningCode: WarningCode?) =
                        warningCode(JsonField.ofNullable(warningCode))

                    /** Alias for calling [Builder.warningCode] with `warningCode.orElse(null)`. */
                    fun warningCode(warningCode: Optional<WarningCode>) =
                        warningCode(warningCode.getOrNull())

                    /**
                     * Sets [Builder.warningCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.warningCode] with a well-typed [WarningCode]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun warningCode(warningCode: JsonField<WarningCode>) = apply {
                        this.warningCode = warningCode
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
                     * Returns an immutable instance of [Breakdown].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .cost()
                     * .featureId()
                     * .warningCode()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Breakdown =
                        Breakdown(
                            checkRequired("cost", cost),
                            checkRequired("featureId", featureId),
                            checkRequired("warningCode", warningCode),
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
                fun validate(): Breakdown = apply {
                    if (validated) {
                        return@apply
                    }

                    cost()
                    featureId()
                    warningCode().ifPresent { it.validate() }
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
                    (if (cost.asKnown().isPresent) 1 else 0) +
                        (if (featureId.asKnown().isPresent) 1 else 0) +
                        (warningCode.asKnown().getOrNull()?.validity() ?: 0)

                /** Warning explaining why this cost may be inaccurate, if any */
                class WarningCode
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

                        @JvmField val UNSUPPORTED_AGGREGATION = of("UNSUPPORTED_AGGREGATION")

                        @JvmStatic fun of(value: String) = WarningCode(JsonField.of(value))
                    }

                    /** An enum containing [WarningCode]'s known values. */
                    enum class Known {
                        UNSUPPORTED_AGGREGATION
                    }

                    /**
                     * An enum containing [WarningCode]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [WarningCode] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        UNSUPPORTED_AGGREGATION,
                        /**
                         * An enum member indicating that [WarningCode] was instantiated with an
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
                            UNSUPPORTED_AGGREGATION -> Value.UNSUPPORTED_AGGREGATION
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
                            UNSUPPORTED_AGGREGATION -> Known.UNSUPPORTED_AGGREGATION
                            else -> throw StiggInvalidDataException("Unknown WarningCode: $value")
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
                    fun validate(): WarningCode = apply {
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

                        return other is WarningCode && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Breakdown &&
                        cost == other.cost &&
                        featureId == other.featureId &&
                        warningCode == other.warningCode &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(cost, featureId, warningCode, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Breakdown{cost=$cost, featureId=$featureId, warningCode=$warningCode, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Estimate &&
                    balanceAfterEstimate == other.balanceAfterEstimate &&
                    breakdown == other.breakdown &&
                    currencyId == other.currencyId &&
                    currentBalance == other.currentBalance &&
                    estimatedCost == other.estimatedCost &&
                    wouldOverdraft == other.wouldOverdraft &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    balanceAfterEstimate,
                    breakdown,
                    currencyId,
                    currentBalance,
                    estimatedCost,
                    wouldOverdraft,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Estimate{balanceAfterEstimate=$balanceAfterEstimate, breakdown=$breakdown, currencyId=$currencyId, currentBalance=$currentBalance, estimatedCost=$estimatedCost, wouldOverdraft=$wouldOverdraft, additionalProperties=$additionalProperties}"
        }

        class Warning @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField
                val RESOURCE_SCOPED_SUBSCRIPTION_EXISTS = of("RESOURCE_SCOPED_SUBSCRIPTION_EXISTS")

                @JvmField val FEATURE_NOT_FOUND = of("FEATURE_NOT_FOUND")

                @JvmField val FEATURE_NOT_CREDIT_BASED = of("FEATURE_NOT_CREDIT_BASED")

                @JvmStatic fun of(value: String) = Warning(JsonField.of(value))
            }

            /** An enum containing [Warning]'s known values. */
            enum class Known {
                RESOURCE_SCOPED_SUBSCRIPTION_EXISTS,
                FEATURE_NOT_FOUND,
                FEATURE_NOT_CREDIT_BASED,
            }

            /**
             * An enum containing [Warning]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Warning] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                RESOURCE_SCOPED_SUBSCRIPTION_EXISTS,
                FEATURE_NOT_FOUND,
                FEATURE_NOT_CREDIT_BASED,
                /**
                 * An enum member indicating that [Warning] was instantiated with an unknown value.
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
                    RESOURCE_SCOPED_SUBSCRIPTION_EXISTS -> Value.RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                    FEATURE_NOT_FOUND -> Value.FEATURE_NOT_FOUND
                    FEATURE_NOT_CREDIT_BASED -> Value.FEATURE_NOT_CREDIT_BASED
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
                    RESOURCE_SCOPED_SUBSCRIPTION_EXISTS -> Known.RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                    FEATURE_NOT_FOUND -> Known.FEATURE_NOT_FOUND
                    FEATURE_NOT_CREDIT_BASED -> Known.FEATURE_NOT_CREDIT_BASED
                    else -> throw StiggInvalidDataException("Unknown Warning: $value")
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
            fun validate(): Warning = apply {
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

                return other is Warning && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                estimates == other.estimates &&
                warnings == other.warnings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(estimates, warnings, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{estimates=$estimates, warnings=$warnings, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventEstimateCostResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventEstimateCostResponse{data=$data, additionalProperties=$additionalProperties}"
}
