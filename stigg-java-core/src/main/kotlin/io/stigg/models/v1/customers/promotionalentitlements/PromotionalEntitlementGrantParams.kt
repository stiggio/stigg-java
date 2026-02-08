// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.promotionalentitlements

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

/**
 * Grants promotional entitlements to a customer, providing feature access outside their
 * subscription. Entitlements can be time-limited or permanent.
 */
class PromotionalEntitlementGrantParams
private constructor(
    private val customerId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): Optional<String> = Optional.ofNullable(customerId)

    /**
     * Promotional entitlements to grant
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun promotionalEntitlements(): List<PromotionalEntitlement> = body.promotionalEntitlements()

    /**
     * Returns the raw JSON value of [promotionalEntitlements].
     *
     * Unlike [promotionalEntitlements], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _promotionalEntitlements(): JsonField<List<PromotionalEntitlement>> =
        body._promotionalEntitlements()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PromotionalEntitlementGrantParams].
         *
         * The following fields are required:
         * ```java
         * .promotionalEntitlements()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromotionalEntitlementGrantParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(promotionalEntitlementGrantParams: PromotionalEntitlementGrantParams) =
            apply {
                customerId = promotionalEntitlementGrantParams.customerId
                body = promotionalEntitlementGrantParams.body.toBuilder()
                additionalHeaders = promotionalEntitlementGrantParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    promotionalEntitlementGrantParams.additionalQueryParams.toBuilder()
            }

        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** Alias for calling [Builder.customerId] with `customerId.orElse(null)`. */
        fun customerId(customerId: Optional<String>) = customerId(customerId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [promotionalEntitlements]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Promotional entitlements to grant */
        fun promotionalEntitlements(promotionalEntitlements: List<PromotionalEntitlement>) = apply {
            body.promotionalEntitlements(promotionalEntitlements)
        }

        /**
         * Sets [Builder.promotionalEntitlements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promotionalEntitlements] with a well-typed
         * `List<PromotionalEntitlement>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun promotionalEntitlements(
            promotionalEntitlements: JsonField<List<PromotionalEntitlement>>
        ) = apply { body.promotionalEntitlements(promotionalEntitlements) }

        /**
         * Adds a single [PromotionalEntitlement] to [promotionalEntitlements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPromotionalEntitlement(promotionalEntitlement: PromotionalEntitlement) = apply {
            body.addPromotionalEntitlement(promotionalEntitlement)
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
         * Returns an immutable instance of [PromotionalEntitlementGrantParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .promotionalEntitlements()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PromotionalEntitlementGrantParams =
            PromotionalEntitlementGrantParams(
                customerId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Grant promotional entitlements to a customer for a specified period. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val promotionalEntitlements: JsonField<List<PromotionalEntitlement>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("promotionalEntitlements")
            @ExcludeMissing
            promotionalEntitlements: JsonField<List<PromotionalEntitlement>> = JsonMissing.of()
        ) : this(promotionalEntitlements, mutableMapOf())

        /**
         * Promotional entitlements to grant
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun promotionalEntitlements(): List<PromotionalEntitlement> =
            promotionalEntitlements.getRequired("promotionalEntitlements")

        /**
         * Returns the raw JSON value of [promotionalEntitlements].
         *
         * Unlike [promotionalEntitlements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("promotionalEntitlements")
        @ExcludeMissing
        fun _promotionalEntitlements(): JsonField<List<PromotionalEntitlement>> =
            promotionalEntitlements

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
             * .promotionalEntitlements()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var promotionalEntitlements: JsonField<MutableList<PromotionalEntitlement>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                promotionalEntitlements = body.promotionalEntitlements.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Promotional entitlements to grant */
            fun promotionalEntitlements(promotionalEntitlements: List<PromotionalEntitlement>) =
                promotionalEntitlements(JsonField.of(promotionalEntitlements))

            /**
             * Sets [Builder.promotionalEntitlements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promotionalEntitlements] with a well-typed
             * `List<PromotionalEntitlement>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun promotionalEntitlements(
                promotionalEntitlements: JsonField<List<PromotionalEntitlement>>
            ) = apply {
                this.promotionalEntitlements = promotionalEntitlements.map { it.toMutableList() }
            }

            /**
             * Adds a single [PromotionalEntitlement] to [promotionalEntitlements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPromotionalEntitlement(promotionalEntitlement: PromotionalEntitlement) = apply {
                promotionalEntitlements =
                    (promotionalEntitlements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("promotionalEntitlements", it).add(promotionalEntitlement)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .promotionalEntitlements()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("promotionalEntitlements", promotionalEntitlements).map {
                        it.toImmutable()
                    },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            promotionalEntitlements().forEach { it.validate() }
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
            (promotionalEntitlements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                promotionalEntitlements == other.promotionalEntitlements &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(promotionalEntitlements, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{promotionalEntitlements=$promotionalEntitlements, additionalProperties=$additionalProperties}"
    }

    /** Single entitlement grant config */
    class PromotionalEntitlement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customEndDate: JsonField<OffsetDateTime>,
        private val enumValues: JsonField<List<String>>,
        private val featureId: JsonField<String>,
        private val hasSoftLimit: JsonField<Boolean>,
        private val hasUnlimitedUsage: JsonField<Boolean>,
        private val isVisible: JsonField<Boolean>,
        private val monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration>,
        private val period: JsonField<Period>,
        private val resetPeriod: JsonField<ResetPeriod>,
        private val usageLimit: JsonField<Long>,
        private val weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration>,
        private val yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customEndDate")
            @ExcludeMissing
            customEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("enumValues")
            @ExcludeMissing
            enumValues: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("featureId")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hasSoftLimit")
            @ExcludeMissing
            hasSoftLimit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hasUnlimitedUsage")
            @ExcludeMissing
            hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isVisible")
            @ExcludeMissing
            isVisible: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("monthlyResetPeriodConfiguration")
            @ExcludeMissing
            monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration> =
                JsonMissing.of(),
            @JsonProperty("period") @ExcludeMissing period: JsonField<Period> = JsonMissing.of(),
            @JsonProperty("resetPeriod")
            @ExcludeMissing
            resetPeriod: JsonField<ResetPeriod> = JsonMissing.of(),
            @JsonProperty("usageLimit")
            @ExcludeMissing
            usageLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("weeklyResetPeriodConfiguration")
            @ExcludeMissing
            weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration> =
                JsonMissing.of(),
            @JsonProperty("yearlyResetPeriodConfiguration")
            @ExcludeMissing
            yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration> =
                JsonMissing.of(),
        ) : this(
            customEndDate,
            enumValues,
            featureId,
            hasSoftLimit,
            hasUnlimitedUsage,
            isVisible,
            monthlyResetPeriodConfiguration,
            period,
            resetPeriod,
            usageLimit,
            weeklyResetPeriodConfiguration,
            yearlyResetPeriodConfiguration,
            mutableMapOf(),
        )

        /**
         * The custom end date of the promotional entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customEndDate(): Optional<OffsetDateTime> = customEndDate.getOptional("customEndDate")

        /**
         * The enum values of the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enumValues(): Optional<List<String>> = enumValues.getOptional("enumValues")

        /**
         * The unique identifier of the entitlement feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun featureId(): String = featureId.getRequired("featureId")

        /**
         * Whether the entitlement has a soft limit
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasSoftLimit(): Optional<Boolean> = hasSoftLimit.getOptional("hasSoftLimit")

        /**
         * Whether the entitlement has an unlimited usage
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasUnlimitedUsage(): Optional<Boolean> =
            hasUnlimitedUsage.getOptional("hasUnlimitedUsage")

        /**
         * Whether the entitlement is visible
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isVisible(): Optional<Boolean> = isVisible.getOptional("isVisible")

        /**
         * The monthly reset period configuration of the entitlement, defined when reset period is
         * monthly
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthlyResetPeriodConfiguration(): Optional<MonthlyResetPeriodConfiguration> =
            monthlyResetPeriodConfiguration.getOptional("monthlyResetPeriodConfiguration")

        /**
         * The grant period of the promotional entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun period(): Period = period.getRequired("period")

        /**
         * The reset period of the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resetPeriod(): Optional<ResetPeriod> = resetPeriod.getOptional("resetPeriod")

        /**
         * The usage limit of the entitlement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageLimit(): Optional<Long> = usageLimit.getOptional("usageLimit")

        /**
         * The weekly reset period configuration of the entitlement, defined when reset period is
         * weekly
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun weeklyResetPeriodConfiguration(): Optional<WeeklyResetPeriodConfiguration> =
            weeklyResetPeriodConfiguration.getOptional("weeklyResetPeriodConfiguration")

        /**
         * The yearly reset period configuration of the entitlement, defined when reset period is
         * yearly
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun yearlyResetPeriodConfiguration(): Optional<YearlyResetPeriodConfiguration> =
            yearlyResetPeriodConfiguration.getOptional("yearlyResetPeriodConfiguration")

        /**
         * Returns the raw JSON value of [customEndDate].
         *
         * Unlike [customEndDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customEndDate")
        @ExcludeMissing
        fun _customEndDate(): JsonField<OffsetDateTime> = customEndDate

        /**
         * Returns the raw JSON value of [enumValues].
         *
         * Unlike [enumValues], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enumValues")
        @ExcludeMissing
        fun _enumValues(): JsonField<List<String>> = enumValues

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
         * Returns the raw JSON value of [isVisible].
         *
         * Unlike [isVisible], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isVisible") @ExcludeMissing fun _isVisible(): JsonField<Boolean> = isVisible

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
         * Returns the raw JSON value of [period].
         *
         * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<Period> = period

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
        @JsonProperty("usageLimit") @ExcludeMissing fun _usageLimit(): JsonField<Long> = usageLimit

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
             * Returns a mutable builder for constructing an instance of [PromotionalEntitlement].
             *
             * The following fields are required:
             * ```java
             * .customEndDate()
             * .enumValues()
             * .featureId()
             * .hasSoftLimit()
             * .hasUnlimitedUsage()
             * .isVisible()
             * .monthlyResetPeriodConfiguration()
             * .period()
             * .resetPeriod()
             * .usageLimit()
             * .weeklyResetPeriodConfiguration()
             * .yearlyResetPeriodConfiguration()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PromotionalEntitlement]. */
        class Builder internal constructor() {

            private var customEndDate: JsonField<OffsetDateTime>? = null
            private var enumValues: JsonField<MutableList<String>>? = null
            private var featureId: JsonField<String>? = null
            private var hasSoftLimit: JsonField<Boolean>? = null
            private var hasUnlimitedUsage: JsonField<Boolean>? = null
            private var isVisible: JsonField<Boolean>? = null
            private var monthlyResetPeriodConfiguration:
                JsonField<MonthlyResetPeriodConfiguration>? =
                null
            private var period: JsonField<Period>? = null
            private var resetPeriod: JsonField<ResetPeriod>? = null
            private var usageLimit: JsonField<Long>? = null
            private var weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration>? =
                null
            private var yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promotionalEntitlement: PromotionalEntitlement) = apply {
                customEndDate = promotionalEntitlement.customEndDate
                enumValues = promotionalEntitlement.enumValues.map { it.toMutableList() }
                featureId = promotionalEntitlement.featureId
                hasSoftLimit = promotionalEntitlement.hasSoftLimit
                hasUnlimitedUsage = promotionalEntitlement.hasUnlimitedUsage
                isVisible = promotionalEntitlement.isVisible
                monthlyResetPeriodConfiguration =
                    promotionalEntitlement.monthlyResetPeriodConfiguration
                period = promotionalEntitlement.period
                resetPeriod = promotionalEntitlement.resetPeriod
                usageLimit = promotionalEntitlement.usageLimit
                weeklyResetPeriodConfiguration =
                    promotionalEntitlement.weeklyResetPeriodConfiguration
                yearlyResetPeriodConfiguration =
                    promotionalEntitlement.yearlyResetPeriodConfiguration
                additionalProperties = promotionalEntitlement.additionalProperties.toMutableMap()
            }

            /** The custom end date of the promotional entitlement */
            fun customEndDate(customEndDate: OffsetDateTime?) =
                customEndDate(JsonField.ofNullable(customEndDate))

            /** Alias for calling [Builder.customEndDate] with `customEndDate.orElse(null)`. */
            fun customEndDate(customEndDate: Optional<OffsetDateTime>) =
                customEndDate(customEndDate.getOrNull())

            /**
             * Sets [Builder.customEndDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customEndDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun customEndDate(customEndDate: JsonField<OffsetDateTime>) = apply {
                this.customEndDate = customEndDate
            }

            /** The enum values of the entitlement */
            fun enumValues(enumValues: List<String>?) = enumValues(JsonField.ofNullable(enumValues))

            /** Alias for calling [Builder.enumValues] with `enumValues.orElse(null)`. */
            fun enumValues(enumValues: Optional<List<String>>) = enumValues(enumValues.getOrNull())

            /**
             * Sets [Builder.enumValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enumValues] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enumValues(enumValues: JsonField<List<String>>) = apply {
                this.enumValues = enumValues.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [enumValues].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEnumValue(enumValue: String) = apply {
                enumValues =
                    (enumValues ?: JsonField.of(mutableListOf())).also {
                        checkKnown("enumValues", it).add(enumValue)
                    }
            }

            /** The unique identifier of the entitlement feature */
            fun featureId(featureId: String) = featureId(JsonField.of(featureId))

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

            /** Whether the entitlement has a soft limit */
            fun hasSoftLimit(hasSoftLimit: Boolean?) =
                hasSoftLimit(JsonField.ofNullable(hasSoftLimit))

            /**
             * Alias for [Builder.hasSoftLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun hasSoftLimit(hasSoftLimit: Boolean) = hasSoftLimit(hasSoftLimit as Boolean?)

            /** Alias for calling [Builder.hasSoftLimit] with `hasSoftLimit.orElse(null)`. */
            fun hasSoftLimit(hasSoftLimit: Optional<Boolean>) =
                hasSoftLimit(hasSoftLimit.getOrNull())

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

            /** Whether the entitlement has an unlimited usage */
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
             * Alias for calling [Builder.hasUnlimitedUsage] with `hasUnlimitedUsage.orElse(null)`.
             */
            fun hasUnlimitedUsage(hasUnlimitedUsage: Optional<Boolean>) =
                hasUnlimitedUsage(hasUnlimitedUsage.getOrNull())

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

            /** Whether the entitlement is visible */
            fun isVisible(isVisible: Boolean?) = isVisible(JsonField.ofNullable(isVisible))

            /**
             * Alias for [Builder.isVisible].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isVisible(isVisible: Boolean) = isVisible(isVisible as Boolean?)

            /** Alias for calling [Builder.isVisible] with `isVisible.orElse(null)`. */
            fun isVisible(isVisible: Optional<Boolean>) = isVisible(isVisible.getOrNull())

            /**
             * Sets [Builder.isVisible] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isVisible] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isVisible(isVisible: JsonField<Boolean>) = apply { this.isVisible = isVisible }

            /**
             * The monthly reset period configuration of the entitlement, defined when reset period
             * is monthly
             */
            fun monthlyResetPeriodConfiguration(
                monthlyResetPeriodConfiguration: MonthlyResetPeriodConfiguration?
            ) =
                monthlyResetPeriodConfiguration(
                    JsonField.ofNullable(monthlyResetPeriodConfiguration)
                )

            /**
             * Alias for calling [Builder.monthlyResetPeriodConfiguration] with
             * `monthlyResetPeriodConfiguration.orElse(null)`.
             */
            fun monthlyResetPeriodConfiguration(
                monthlyResetPeriodConfiguration: Optional<MonthlyResetPeriodConfiguration>
            ) = monthlyResetPeriodConfiguration(monthlyResetPeriodConfiguration.getOrNull())

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

            /** The grant period of the promotional entitlement */
            fun period(period: Period) = period(JsonField.of(period))

            /**
             * Sets [Builder.period] to an arbitrary JSON value.
             *
             * You should usually call [Builder.period] with a well-typed [Period] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun period(period: JsonField<Period>) = apply { this.period = period }

            /** The reset period of the entitlement */
            fun resetPeriod(resetPeriod: ResetPeriod?) =
                resetPeriod(JsonField.ofNullable(resetPeriod))

            /** Alias for calling [Builder.resetPeriod] with `resetPeriod.orElse(null)`. */
            fun resetPeriod(resetPeriod: Optional<ResetPeriod>) =
                resetPeriod(resetPeriod.getOrNull())

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

            /** The usage limit of the entitlement */
            fun usageLimit(usageLimit: Long?) = usageLimit(JsonField.ofNullable(usageLimit))

            /**
             * Alias for [Builder.usageLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun usageLimit(usageLimit: Long) = usageLimit(usageLimit as Long?)

            /** Alias for calling [Builder.usageLimit] with `usageLimit.orElse(null)`. */
            fun usageLimit(usageLimit: Optional<Long>) = usageLimit(usageLimit.getOrNull())

            /**
             * Sets [Builder.usageLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun usageLimit(usageLimit: JsonField<Long>) = apply { this.usageLimit = usageLimit }

            /**
             * The weekly reset period configuration of the entitlement, defined when reset period
             * is weekly
             */
            fun weeklyResetPeriodConfiguration(
                weeklyResetPeriodConfiguration: WeeklyResetPeriodConfiguration?
            ) = weeklyResetPeriodConfiguration(JsonField.ofNullable(weeklyResetPeriodConfiguration))

            /**
             * Alias for calling [Builder.weeklyResetPeriodConfiguration] with
             * `weeklyResetPeriodConfiguration.orElse(null)`.
             */
            fun weeklyResetPeriodConfiguration(
                weeklyResetPeriodConfiguration: Optional<WeeklyResetPeriodConfiguration>
            ) = weeklyResetPeriodConfiguration(weeklyResetPeriodConfiguration.getOrNull())

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

            /**
             * The yearly reset period configuration of the entitlement, defined when reset period
             * is yearly
             */
            fun yearlyResetPeriodConfiguration(
                yearlyResetPeriodConfiguration: YearlyResetPeriodConfiguration?
            ) = yearlyResetPeriodConfiguration(JsonField.ofNullable(yearlyResetPeriodConfiguration))

            /**
             * Alias for calling [Builder.yearlyResetPeriodConfiguration] with
             * `yearlyResetPeriodConfiguration.orElse(null)`.
             */
            fun yearlyResetPeriodConfiguration(
                yearlyResetPeriodConfiguration: Optional<YearlyResetPeriodConfiguration>
            ) = yearlyResetPeriodConfiguration(yearlyResetPeriodConfiguration.getOrNull())

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
             * Returns an immutable instance of [PromotionalEntitlement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .customEndDate()
             * .enumValues()
             * .featureId()
             * .hasSoftLimit()
             * .hasUnlimitedUsage()
             * .isVisible()
             * .monthlyResetPeriodConfiguration()
             * .period()
             * .resetPeriod()
             * .usageLimit()
             * .weeklyResetPeriodConfiguration()
             * .yearlyResetPeriodConfiguration()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PromotionalEntitlement =
                PromotionalEntitlement(
                    checkRequired("customEndDate", customEndDate),
                    checkRequired("enumValues", enumValues).map { it.toImmutable() },
                    checkRequired("featureId", featureId),
                    checkRequired("hasSoftLimit", hasSoftLimit),
                    checkRequired("hasUnlimitedUsage", hasUnlimitedUsage),
                    checkRequired("isVisible", isVisible),
                    checkRequired(
                        "monthlyResetPeriodConfiguration",
                        monthlyResetPeriodConfiguration,
                    ),
                    checkRequired("period", period),
                    checkRequired("resetPeriod", resetPeriod),
                    checkRequired("usageLimit", usageLimit),
                    checkRequired("weeklyResetPeriodConfiguration", weeklyResetPeriodConfiguration),
                    checkRequired("yearlyResetPeriodConfiguration", yearlyResetPeriodConfiguration),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PromotionalEntitlement = apply {
            if (validated) {
                return@apply
            }

            customEndDate()
            enumValues()
            featureId()
            hasSoftLimit()
            hasUnlimitedUsage()
            isVisible()
            monthlyResetPeriodConfiguration().ifPresent { it.validate() }
            period().validate()
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
            (if (customEndDate.asKnown().isPresent) 1 else 0) +
                (enumValues.asKnown().getOrNull()?.size ?: 0) +
                (if (featureId.asKnown().isPresent) 1 else 0) +
                (if (hasSoftLimit.asKnown().isPresent) 1 else 0) +
                (if (hasUnlimitedUsage.asKnown().isPresent) 1 else 0) +
                (if (isVisible.asKnown().isPresent) 1 else 0) +
                (monthlyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (period.asKnown().getOrNull()?.validity() ?: 0) +
                (resetPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (usageLimit.asKnown().isPresent) 1 else 0) +
                (weeklyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (yearlyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The monthly reset period configuration of the entitlement, defined when reset period is
         * monthly
         */
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
             * Reset anchor (SubscriptionStart or StartOfTheMonth)
             *
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

                /** Reset anchor (SubscriptionStart or StartOfTheMonth) */
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

            /** Reset anchor (SubscriptionStart or StartOfTheMonth) */
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

        /** The grant period of the promotional entitlement */
        class Period @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val _1_WEEK = of("1 week")

                @JvmField val _1_MONTH = of("1 month")

                @JvmField val _6_MONTH = of("6 month")

                @JvmField val _1_YEAR = of("1 year")

                @JvmField val LIFETIME = of("lifetime")

                @JvmField val CUSTOM = of("custom")

                @JvmStatic fun of(value: String) = Period(JsonField.of(value))
            }

            /** An enum containing [Period]'s known values. */
            enum class Known {
                _1_WEEK,
                _1_MONTH,
                _6_MONTH,
                _1_YEAR,
                LIFETIME,
                CUSTOM,
            }

            /**
             * An enum containing [Period]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Period] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                _1_WEEK,
                _1_MONTH,
                _6_MONTH,
                _1_YEAR,
                LIFETIME,
                CUSTOM,
                /**
                 * An enum member indicating that [Period] was instantiated with an unknown value.
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
                    _1_WEEK -> Value._1_WEEK
                    _1_MONTH -> Value._1_MONTH
                    _6_MONTH -> Value._6_MONTH
                    _1_YEAR -> Value._1_YEAR
                    LIFETIME -> Value.LIFETIME
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
                    _1_WEEK -> Known._1_WEEK
                    _1_MONTH -> Known._1_MONTH
                    _6_MONTH -> Known._6_MONTH
                    _1_YEAR -> Known._1_YEAR
                    LIFETIME -> Known.LIFETIME
                    CUSTOM -> Known.CUSTOM
                    else -> throw StiggInvalidDataException("Unknown Period: $value")
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

            fun validate(): Period = apply {
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

                return other is Period && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The reset period of the entitlement */
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

        /**
         * The weekly reset period configuration of the entitlement, defined when reset period is
         * weekly
         */
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
             * Reset anchor (SubscriptionStart or specific day)
             *
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

                /** Reset anchor (SubscriptionStart or specific day) */
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

            /** Reset anchor (SubscriptionStart or specific day) */
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

        /**
         * The yearly reset period configuration of the entitlement, defined when reset period is
         * yearly
         */
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
             * Reset anchor (SubscriptionStart)
             *
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

                /** Reset anchor (SubscriptionStart) */
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

            /** Reset anchor (SubscriptionStart) */
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

            return other is PromotionalEntitlement &&
                customEndDate == other.customEndDate &&
                enumValues == other.enumValues &&
                featureId == other.featureId &&
                hasSoftLimit == other.hasSoftLimit &&
                hasUnlimitedUsage == other.hasUnlimitedUsage &&
                isVisible == other.isVisible &&
                monthlyResetPeriodConfiguration == other.monthlyResetPeriodConfiguration &&
                period == other.period &&
                resetPeriod == other.resetPeriod &&
                usageLimit == other.usageLimit &&
                weeklyResetPeriodConfiguration == other.weeklyResetPeriodConfiguration &&
                yearlyResetPeriodConfiguration == other.yearlyResetPeriodConfiguration &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customEndDate,
                enumValues,
                featureId,
                hasSoftLimit,
                hasUnlimitedUsage,
                isVisible,
                monthlyResetPeriodConfiguration,
                period,
                resetPeriod,
                usageLimit,
                weeklyResetPeriodConfiguration,
                yearlyResetPeriodConfiguration,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PromotionalEntitlement{customEndDate=$customEndDate, enumValues=$enumValues, featureId=$featureId, hasSoftLimit=$hasSoftLimit, hasUnlimitedUsage=$hasUnlimitedUsage, isVisible=$isVisible, monthlyResetPeriodConfiguration=$monthlyResetPeriodConfiguration, period=$period, resetPeriod=$resetPeriod, usageLimit=$usageLimit, weeklyResetPeriodConfiguration=$weeklyResetPeriodConfiguration, yearlyResetPeriodConfiguration=$yearlyResetPeriodConfiguration, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromotionalEntitlementGrantParams &&
            customerId == other.customerId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(customerId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PromotionalEntitlementGrantParams{customerId=$customerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
