// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans.entitlements

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates one or more entitlements (feature or credit) on a draft plan. */
class EntitlementCreateParams
private constructor(
    private val planId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun planId(): Optional<String> = Optional.ofNullable(planId)

    /**
     * Entitlements to create
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entitlements(): List<Entitlement> = body.entitlements()

    /**
     * Returns the raw JSON value of [entitlements].
     *
     * Unlike [entitlements], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entitlements(): JsonField<List<Entitlement>> = body._entitlements()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntitlementCreateParams].
         *
         * The following fields are required:
         * ```java
         * .entitlements()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntitlementCreateParams]. */
    class Builder internal constructor() {

        private var planId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(entitlementCreateParams: EntitlementCreateParams) = apply {
            planId = entitlementCreateParams.planId
            body = entitlementCreateParams.body.toBuilder()
            additionalHeaders = entitlementCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = entitlementCreateParams.additionalQueryParams.toBuilder()
        }

        fun planId(planId: String?) = apply { this.planId = planId }

        /** Alias for calling [Builder.planId] with `planId.orElse(null)`. */
        fun planId(planId: Optional<String>) = planId(planId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [entitlements]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Entitlements to create */
        fun entitlements(entitlements: List<Entitlement>) = apply {
            body.entitlements(entitlements)
        }

        /**
         * Sets [Builder.entitlements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entitlements] with a well-typed `List<Entitlement>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun entitlements(entitlements: JsonField<List<Entitlement>>) = apply {
            body.entitlements(entitlements)
        }

        /**
         * Adds a single [Entitlement] to [entitlements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntitlement(entitlement: Entitlement) = apply { body.addEntitlement(entitlement) }

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
         * Returns an immutable instance of [EntitlementCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .entitlements()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntitlementCreateParams =
            EntitlementCreateParams(
                planId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> planId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request to create one or more entitlements on a plan */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val entitlements: JsonField<List<Entitlement>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("entitlements")
            @ExcludeMissing
            entitlements: JsonField<List<Entitlement>> = JsonMissing.of()
        ) : this(entitlements, mutableMapOf())

        /**
         * Entitlements to create
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entitlements(): List<Entitlement> = entitlements.getRequired("entitlements")

        /**
         * Returns the raw JSON value of [entitlements].
         *
         * Unlike [entitlements], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("entitlements")
        @ExcludeMissing
        fun _entitlements(): JsonField<List<Entitlement>> = entitlements

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
             * .entitlements()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var entitlements: JsonField<MutableList<Entitlement>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                entitlements = body.entitlements.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Entitlements to create */
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
             * .entitlements()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("entitlements", entitlements).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            entitlements().forEach { it.validate() }
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
            (entitlements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                entitlements == other.entitlements &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(entitlements, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{entitlements=$entitlements, additionalProperties=$additionalProperties}"
    }

    /** A single entitlement to create. Provide exactly one of feature or credit. */
    class Entitlement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val credit: JsonField<Credit>,
        private val feature: JsonField<Feature>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit") @ExcludeMissing credit: JsonField<Credit> = JsonMissing.of(),
            @JsonProperty("feature") @ExcludeMissing feature: JsonField<Feature> = JsonMissing.of(),
        ) : this(credit, feature, mutableMapOf())

        /**
         * Credit entitlement to create
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun credit(): Optional<Credit> = credit.getOptional("credit")

        /**
         * Feature entitlement to create
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun feature(): Optional<Feature> = feature.getOptional("feature")

        /**
         * Returns the raw JSON value of [credit].
         *
         * Unlike [credit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit") @ExcludeMissing fun _credit(): JsonField<Credit> = credit

        /**
         * Returns the raw JSON value of [feature].
         *
         * Unlike [feature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("feature") @ExcludeMissing fun _feature(): JsonField<Feature> = feature

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

            private var credit: JsonField<Credit> = JsonMissing.of()
            private var feature: JsonField<Feature> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entitlement: Entitlement) = apply {
                credit = entitlement.credit
                feature = entitlement.feature
                additionalProperties = entitlement.additionalProperties.toMutableMap()
            }

            /** Credit entitlement to create */
            fun credit(credit: Credit) = credit(JsonField.of(credit))

            /**
             * Sets [Builder.credit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.credit] with a well-typed [Credit] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun credit(credit: JsonField<Credit>) = apply { this.credit = credit }

            /** Feature entitlement to create */
            fun feature(feature: Feature) = feature(JsonField.of(feature))

            /**
             * Sets [Builder.feature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feature] with a well-typed [Feature] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun feature(feature: JsonField<Feature>) = apply { this.feature = feature }

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
             * Returns an immutable instance of [Entitlement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Entitlement =
                Entitlement(credit, feature, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Entitlement = apply {
            if (validated) {
                return@apply
            }

            credit().ifPresent { it.validate() }
            feature().ifPresent { it.validate() }
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
            (credit.asKnown().getOrNull()?.validity() ?: 0) +
                (feature.asKnown().getOrNull()?.validity() ?: 0)

        /** Credit entitlement to create */
        class Credit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val cadence: JsonField<Cadence>,
            private val customCurrencyId: JsonField<String>,
            private val behavior: JsonField<Behavior>,
            private val description: JsonField<String>,
            private val displayNameOverride: JsonField<String>,
            private val hiddenFromWidgets: JsonField<List<HiddenFromWidget>>,
            private val isCustom: JsonField<Boolean>,
            private val isGranted: JsonField<Boolean>,
            private val order: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cadence")
                @ExcludeMissing
                cadence: JsonField<Cadence> = JsonMissing.of(),
                @JsonProperty("customCurrencyId")
                @ExcludeMissing
                customCurrencyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("behavior")
                @ExcludeMissing
                behavior: JsonField<Behavior> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("displayNameOverride")
                @ExcludeMissing
                displayNameOverride: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hiddenFromWidgets")
                @ExcludeMissing
                hiddenFromWidgets: JsonField<List<HiddenFromWidget>> = JsonMissing.of(),
                @JsonProperty("isCustom")
                @ExcludeMissing
                isCustom: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("isGranted")
                @ExcludeMissing
                isGranted: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("order") @ExcludeMissing order: JsonField<Double> = JsonMissing.of(),
            ) : this(
                amount,
                cadence,
                customCurrencyId,
                behavior,
                description,
                displayNameOverride,
                hiddenFromWidgets,
                isCustom,
                isGranted,
                order,
                mutableMapOf(),
            )

            /**
             * Credit grant amount
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<Double> = amount.getOptional("amount")

            /**
             * Credit grant cadence (MONTH or YEAR)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cadence(): Cadence = cadence.getRequired("cadence")

            /**
             * The custom currency ID for the credit entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customCurrencyId(): String = customCurrencyId.getRequired("customCurrencyId")

            /**
             * Entitlement behavior (Increment or Override)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun behavior(): Optional<Behavior> = behavior.getOptional("behavior")

            /**
             * Description of the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Override display name for the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun displayNameOverride(): Optional<String> =
                displayNameOverride.getOptional("displayNameOverride")

            /**
             * Widget types where this entitlement is hidden
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hiddenFromWidgets(): Optional<List<HiddenFromWidget>> =
                hiddenFromWidgets.getOptional("hiddenFromWidgets")

            /**
             * Whether this is a custom entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isCustom(): Optional<Boolean> = isCustom.getOptional("isCustom")

            /**
             * Whether the entitlement is granted
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isGranted(): Optional<Boolean> = isGranted.getOptional("isGranted")

            /**
             * Display order of the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun order(): Optional<Double> = order.getOptional("order")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [cadence].
             *
             * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

            /**
             * Returns the raw JSON value of [customCurrencyId].
             *
             * Unlike [customCurrencyId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("customCurrencyId")
            @ExcludeMissing
            fun _customCurrencyId(): JsonField<String> = customCurrencyId

            /**
             * Returns the raw JSON value of [behavior].
             *
             * Unlike [behavior], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("behavior")
            @ExcludeMissing
            fun _behavior(): JsonField<Behavior> = behavior

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
             * Returns the raw JSON value of [displayNameOverride].
             *
             * Unlike [displayNameOverride], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("displayNameOverride")
            @ExcludeMissing
            fun _displayNameOverride(): JsonField<String> = displayNameOverride

            /**
             * Returns the raw JSON value of [hiddenFromWidgets].
             *
             * Unlike [hiddenFromWidgets], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("hiddenFromWidgets")
            @ExcludeMissing
            fun _hiddenFromWidgets(): JsonField<List<HiddenFromWidget>> = hiddenFromWidgets

            /**
             * Returns the raw JSON value of [isCustom].
             *
             * Unlike [isCustom], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("isCustom") @ExcludeMissing fun _isCustom(): JsonField<Boolean> = isCustom

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
             * Returns the raw JSON value of [order].
             *
             * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Double> = order

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
                 * Returns a mutable builder for constructing an instance of [Credit].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .cadence()
                 * .customCurrencyId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Credit]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var cadence: JsonField<Cadence>? = null
                private var customCurrencyId: JsonField<String>? = null
                private var behavior: JsonField<Behavior> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var displayNameOverride: JsonField<String> = JsonMissing.of()
                private var hiddenFromWidgets: JsonField<MutableList<HiddenFromWidget>>? = null
                private var isCustom: JsonField<Boolean> = JsonMissing.of()
                private var isGranted: JsonField<Boolean> = JsonMissing.of()
                private var order: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(credit: Credit) = apply {
                    amount = credit.amount
                    cadence = credit.cadence
                    customCurrencyId = credit.customCurrencyId
                    behavior = credit.behavior
                    description = credit.description
                    displayNameOverride = credit.displayNameOverride
                    hiddenFromWidgets = credit.hiddenFromWidgets.map { it.toMutableList() }
                    isCustom = credit.isCustom
                    isGranted = credit.isGranted
                    order = credit.order
                    additionalProperties = credit.additionalProperties.toMutableMap()
                }

                /** Credit grant amount */
                fun amount(amount: Double?) = amount(JsonField.ofNullable(amount))

                /**
                 * Alias for [Builder.amount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun amount(amount: Double) = amount(amount as Double?)

                /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
                fun amount(amount: Optional<Double>) = amount(amount.getOrNull())

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** Credit grant cadence (MONTH or YEAR) */
                fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                /**
                 * Sets [Builder.cadence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                /** The custom currency ID for the credit entitlement */
                fun customCurrencyId(customCurrencyId: String) =
                    customCurrencyId(JsonField.of(customCurrencyId))

                /**
                 * Sets [Builder.customCurrencyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customCurrencyId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun customCurrencyId(customCurrencyId: JsonField<String>) = apply {
                    this.customCurrencyId = customCurrencyId
                }

                /** Entitlement behavior (Increment or Override) */
                fun behavior(behavior: Behavior) = behavior(JsonField.of(behavior))

                /**
                 * Sets [Builder.behavior] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.behavior] with a well-typed [Behavior] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun behavior(behavior: JsonField<Behavior>) = apply { this.behavior = behavior }

                /** Description of the entitlement */
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

                /** Override display name for the entitlement */
                fun displayNameOverride(displayNameOverride: String) =
                    displayNameOverride(JsonField.of(displayNameOverride))

                /**
                 * Sets [Builder.displayNameOverride] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.displayNameOverride] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun displayNameOverride(displayNameOverride: JsonField<String>) = apply {
                    this.displayNameOverride = displayNameOverride
                }

                /** Widget types where this entitlement is hidden */
                fun hiddenFromWidgets(hiddenFromWidgets: List<HiddenFromWidget>) =
                    hiddenFromWidgets(JsonField.of(hiddenFromWidgets))

                /**
                 * Sets [Builder.hiddenFromWidgets] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hiddenFromWidgets] with a well-typed
                 * `List<HiddenFromWidget>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun hiddenFromWidgets(hiddenFromWidgets: JsonField<List<HiddenFromWidget>>) =
                    apply {
                        this.hiddenFromWidgets = hiddenFromWidgets.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [HiddenFromWidget] to [hiddenFromWidgets].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addHiddenFromWidget(hiddenFromWidget: HiddenFromWidget) = apply {
                    hiddenFromWidgets =
                        (hiddenFromWidgets ?: JsonField.of(mutableListOf())).also {
                            checkKnown("hiddenFromWidgets", it).add(hiddenFromWidget)
                        }
                }

                /** Whether this is a custom entitlement */
                fun isCustom(isCustom: Boolean) = isCustom(JsonField.of(isCustom))

                /**
                 * Sets [Builder.isCustom] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isCustom] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isCustom(isCustom: JsonField<Boolean>) = apply { this.isCustom = isCustom }

                /** Whether the entitlement is granted */
                fun isGranted(isGranted: Boolean) = isGranted(JsonField.of(isGranted))

                /**
                 * Sets [Builder.isGranted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isGranted] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isGranted(isGranted: JsonField<Boolean>) = apply { this.isGranted = isGranted }

                /** Display order of the entitlement */
                fun order(order: Double) = order(JsonField.of(order))

                /**
                 * Sets [Builder.order] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.order] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun order(order: JsonField<Double>) = apply { this.order = order }

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
                 * Returns an immutable instance of [Credit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .cadence()
                 * .customCurrencyId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Credit =
                    Credit(
                        checkRequired("amount", amount),
                        checkRequired("cadence", cadence),
                        checkRequired("customCurrencyId", customCurrencyId),
                        behavior,
                        description,
                        displayNameOverride,
                        (hiddenFromWidgets ?: JsonMissing.of()).map { it.toImmutable() },
                        isCustom,
                        isGranted,
                        order,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Credit = apply {
                if (validated) {
                    return@apply
                }

                amount()
                cadence().validate()
                customCurrencyId()
                behavior().ifPresent { it.validate() }
                description()
                displayNameOverride()
                hiddenFromWidgets().ifPresent { it.forEach { it.validate() } }
                isCustom()
                isGranted()
                order()
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
                    (cadence.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (customCurrencyId.asKnown().isPresent) 1 else 0) +
                    (behavior.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (displayNameOverride.asKnown().isPresent) 1 else 0) +
                    (hiddenFromWidgets.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (if (isCustom.asKnown().isPresent) 1 else 0) +
                    (if (isGranted.asKnown().isPresent) 1 else 0) +
                    (if (order.asKnown().isPresent) 1 else 0)

            /** Credit grant cadence (MONTH or YEAR) */
            class Cadence @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val MONTH = of("MONTH")

                    @JvmField val YEAR = of("YEAR")

                    @JvmStatic fun of(value: String) = Cadence(JsonField.of(value))
                }

                /** An enum containing [Cadence]'s known values. */
                enum class Known {
                    MONTH,
                    YEAR,
                }

                /**
                 * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Cadence] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONTH,
                    YEAR,
                    /**
                     * An enum member indicating that [Cadence] was instantiated with an unknown
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
                        MONTH -> Value.MONTH
                        YEAR -> Value.YEAR
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
                        MONTH -> Known.MONTH
                        YEAR -> Known.YEAR
                        else -> throw StiggInvalidDataException("Unknown Cadence: $value")
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

                fun validate(): Cadence = apply {
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

                    return other is Cadence && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Entitlement behavior (Increment or Override) */
            class Behavior @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val INCREMENT = of("Increment")

                    @JvmField val OVERRIDE = of("Override")

                    @JvmStatic fun of(value: String) = Behavior(JsonField.of(value))
                }

                /** An enum containing [Behavior]'s known values. */
                enum class Known {
                    INCREMENT,
                    OVERRIDE,
                }

                /**
                 * An enum containing [Behavior]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Behavior] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INCREMENT,
                    OVERRIDE,
                    /**
                     * An enum member indicating that [Behavior] was instantiated with an unknown
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
                        INCREMENT -> Value.INCREMENT
                        OVERRIDE -> Value.OVERRIDE
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
                        INCREMENT -> Known.INCREMENT
                        OVERRIDE -> Known.OVERRIDE
                        else -> throw StiggInvalidDataException("Unknown Behavior: $value")
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

                fun validate(): Behavior = apply {
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

                    return other is Behavior && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class HiddenFromWidget
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

                    @JvmField val PAYWALL = of("PAYWALL")

                    @JvmField val CUSTOMER_PORTAL = of("CUSTOMER_PORTAL")

                    @JvmField val CHECKOUT = of("CHECKOUT")

                    @JvmStatic fun of(value: String) = HiddenFromWidget(JsonField.of(value))
                }

                /** An enum containing [HiddenFromWidget]'s known values. */
                enum class Known {
                    PAYWALL,
                    CUSTOMER_PORTAL,
                    CHECKOUT,
                }

                /**
                 * An enum containing [HiddenFromWidget]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [HiddenFromWidget] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PAYWALL,
                    CUSTOMER_PORTAL,
                    CHECKOUT,
                    /**
                     * An enum member indicating that [HiddenFromWidget] was instantiated with an
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
                        PAYWALL -> Value.PAYWALL
                        CUSTOMER_PORTAL -> Value.CUSTOMER_PORTAL
                        CHECKOUT -> Value.CHECKOUT
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
                        PAYWALL -> Known.PAYWALL
                        CUSTOMER_PORTAL -> Known.CUSTOMER_PORTAL
                        CHECKOUT -> Known.CHECKOUT
                        else -> throw StiggInvalidDataException("Unknown HiddenFromWidget: $value")
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

                fun validate(): HiddenFromWidget = apply {
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

                    return other is HiddenFromWidget && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Credit &&
                    amount == other.amount &&
                    cadence == other.cadence &&
                    customCurrencyId == other.customCurrencyId &&
                    behavior == other.behavior &&
                    description == other.description &&
                    displayNameOverride == other.displayNameOverride &&
                    hiddenFromWidgets == other.hiddenFromWidgets &&
                    isCustom == other.isCustom &&
                    isGranted == other.isGranted &&
                    order == other.order &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    cadence,
                    customCurrencyId,
                    behavior,
                    description,
                    displayNameOverride,
                    hiddenFromWidgets,
                    isCustom,
                    isGranted,
                    order,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Credit{amount=$amount, cadence=$cadence, customCurrencyId=$customCurrencyId, behavior=$behavior, description=$description, displayNameOverride=$displayNameOverride, hiddenFromWidgets=$hiddenFromWidgets, isCustom=$isCustom, isGranted=$isGranted, order=$order, additionalProperties=$additionalProperties}"
        }

        /** Feature entitlement to create */
        class Feature
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val featureId: JsonField<String>,
            private val behavior: JsonField<Behavior>,
            private val description: JsonField<String>,
            private val displayNameOverride: JsonField<String>,
            private val enumValues: JsonField<List<String>>,
            private val hasSoftLimit: JsonField<Boolean>,
            private val hasUnlimitedUsage: JsonField<Boolean>,
            private val hiddenFromWidgets: JsonField<List<HiddenFromWidget>>,
            private val isCustom: JsonField<Boolean>,
            private val isGranted: JsonField<Boolean>,
            private val monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration>,
            private val order: JsonField<Double>,
            private val resetPeriod: JsonField<ResetPeriod>,
            private val usageLimit: JsonField<Long>,
            private val weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration>,
            private val yearlyResetPeriodConfiguration: JsonField<YearlyResetPeriodConfiguration>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("featureId")
                @ExcludeMissing
                featureId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("behavior")
                @ExcludeMissing
                behavior: JsonField<Behavior> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("displayNameOverride")
                @ExcludeMissing
                displayNameOverride: JsonField<String> = JsonMissing.of(),
                @JsonProperty("enumValues")
                @ExcludeMissing
                enumValues: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("hasSoftLimit")
                @ExcludeMissing
                hasSoftLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("hasUnlimitedUsage")
                @ExcludeMissing
                hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("hiddenFromWidgets")
                @ExcludeMissing
                hiddenFromWidgets: JsonField<List<HiddenFromWidget>> = JsonMissing.of(),
                @JsonProperty("isCustom")
                @ExcludeMissing
                isCustom: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("isGranted")
                @ExcludeMissing
                isGranted: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("monthlyResetPeriodConfiguration")
                @ExcludeMissing
                monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("order") @ExcludeMissing order: JsonField<Double> = JsonMissing.of(),
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
                featureId,
                behavior,
                description,
                displayNameOverride,
                enumValues,
                hasSoftLimit,
                hasUnlimitedUsage,
                hiddenFromWidgets,
                isCustom,
                isGranted,
                monthlyResetPeriodConfiguration,
                order,
                resetPeriod,
                usageLimit,
                weeklyResetPeriodConfiguration,
                yearlyResetPeriodConfiguration,
                mutableMapOf(),
            )

            /**
             * The feature ID to attach the entitlement to
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun featureId(): String = featureId.getRequired("featureId")

            /**
             * Entitlement behavior (Increment or Override)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun behavior(): Optional<Behavior> = behavior.getOptional("behavior")

            /**
             * Description of the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Override display name for the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun displayNameOverride(): Optional<String> =
                displayNameOverride.getOptional("displayNameOverride")

            /**
             * Allowed enum values for the feature entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun enumValues(): Optional<List<String>> = enumValues.getOptional("enumValues")

            /**
             * Whether the usage limit is a soft limit
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasSoftLimit(): Optional<Boolean> = hasSoftLimit.getOptional("hasSoftLimit")

            /**
             * Whether usage is unlimited
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasUnlimitedUsage(): Optional<Boolean> =
                hasUnlimitedUsage.getOptional("hasUnlimitedUsage")

            /**
             * Widget types where this entitlement is hidden
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hiddenFromWidgets(): Optional<List<HiddenFromWidget>> =
                hiddenFromWidgets.getOptional("hiddenFromWidgets")

            /**
             * Whether this is a custom entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isCustom(): Optional<Boolean> = isCustom.getOptional("isCustom")

            /**
             * Whether the entitlement is granted
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isGranted(): Optional<Boolean> = isGranted.getOptional("isGranted")

            /**
             * Configuration for monthly reset period
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun monthlyResetPeriodConfiguration(): Optional<MonthlyResetPeriodConfiguration> =
                monthlyResetPeriodConfiguration.getOptional("monthlyResetPeriodConfiguration")

            /**
             * Display order of the entitlement
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun order(): Optional<Double> = order.getOptional("order")

            /**
             * Period at which usage resets
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun resetPeriod(): Optional<ResetPeriod> = resetPeriod.getOptional("resetPeriod")

            /**
             * Maximum allowed usage for the feature
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usageLimit(): Optional<Long> = usageLimit.getOptional("usageLimit")

            /**
             * Configuration for weekly reset period
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun weeklyResetPeriodConfiguration(): Optional<WeeklyResetPeriodConfiguration> =
                weeklyResetPeriodConfiguration.getOptional("weeklyResetPeriodConfiguration")

            /**
             * Configuration for yearly reset period
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun yearlyResetPeriodConfiguration(): Optional<YearlyResetPeriodConfiguration> =
                yearlyResetPeriodConfiguration.getOptional("yearlyResetPeriodConfiguration")

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
             * Returns the raw JSON value of [behavior].
             *
             * Unlike [behavior], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("behavior")
            @ExcludeMissing
            fun _behavior(): JsonField<Behavior> = behavior

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
             * Returns the raw JSON value of [displayNameOverride].
             *
             * Unlike [displayNameOverride], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("displayNameOverride")
            @ExcludeMissing
            fun _displayNameOverride(): JsonField<String> = displayNameOverride

            /**
             * Returns the raw JSON value of [enumValues].
             *
             * Unlike [enumValues], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("enumValues")
            @ExcludeMissing
            fun _enumValues(): JsonField<List<String>> = enumValues

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
             * Unlike [hasUnlimitedUsage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("hasUnlimitedUsage")
            @ExcludeMissing
            fun _hasUnlimitedUsage(): JsonField<Boolean> = hasUnlimitedUsage

            /**
             * Returns the raw JSON value of [hiddenFromWidgets].
             *
             * Unlike [hiddenFromWidgets], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("hiddenFromWidgets")
            @ExcludeMissing
            fun _hiddenFromWidgets(): JsonField<List<HiddenFromWidget>> = hiddenFromWidgets

            /**
             * Returns the raw JSON value of [isCustom].
             *
             * Unlike [isCustom], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("isCustom") @ExcludeMissing fun _isCustom(): JsonField<Boolean> = isCustom

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
             * Returns the raw JSON value of [monthlyResetPeriodConfiguration].
             *
             * Unlike [monthlyResetPeriodConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("monthlyResetPeriodConfiguration")
            @ExcludeMissing
            fun _monthlyResetPeriodConfiguration(): JsonField<MonthlyResetPeriodConfiguration> =
                monthlyResetPeriodConfiguration

            /**
             * Returns the raw JSON value of [order].
             *
             * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Double> = order

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
            fun _usageLimit(): JsonField<Long> = usageLimit

            /**
             * Returns the raw JSON value of [weeklyResetPeriodConfiguration].
             *
             * Unlike [weeklyResetPeriodConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("weeklyResetPeriodConfiguration")
            @ExcludeMissing
            fun _weeklyResetPeriodConfiguration(): JsonField<WeeklyResetPeriodConfiguration> =
                weeklyResetPeriodConfiguration

            /**
             * Returns the raw JSON value of [yearlyResetPeriodConfiguration].
             *
             * Unlike [yearlyResetPeriodConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [Feature].
                 *
                 * The following fields are required:
                 * ```java
                 * .featureId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Feature]. */
            class Builder internal constructor() {

                private var featureId: JsonField<String>? = null
                private var behavior: JsonField<Behavior> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var displayNameOverride: JsonField<String> = JsonMissing.of()
                private var enumValues: JsonField<MutableList<String>>? = null
                private var hasSoftLimit: JsonField<Boolean> = JsonMissing.of()
                private var hasUnlimitedUsage: JsonField<Boolean> = JsonMissing.of()
                private var hiddenFromWidgets: JsonField<MutableList<HiddenFromWidget>>? = null
                private var isCustom: JsonField<Boolean> = JsonMissing.of()
                private var isGranted: JsonField<Boolean> = JsonMissing.of()
                private var monthlyResetPeriodConfiguration:
                    JsonField<MonthlyResetPeriodConfiguration> =
                    JsonMissing.of()
                private var order: JsonField<Double> = JsonMissing.of()
                private var resetPeriod: JsonField<ResetPeriod> = JsonMissing.of()
                private var usageLimit: JsonField<Long> = JsonMissing.of()
                private var weeklyResetPeriodConfiguration:
                    JsonField<WeeklyResetPeriodConfiguration> =
                    JsonMissing.of()
                private var yearlyResetPeriodConfiguration:
                    JsonField<YearlyResetPeriodConfiguration> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(feature: Feature) = apply {
                    featureId = feature.featureId
                    behavior = feature.behavior
                    description = feature.description
                    displayNameOverride = feature.displayNameOverride
                    enumValues = feature.enumValues.map { it.toMutableList() }
                    hasSoftLimit = feature.hasSoftLimit
                    hasUnlimitedUsage = feature.hasUnlimitedUsage
                    hiddenFromWidgets = feature.hiddenFromWidgets.map { it.toMutableList() }
                    isCustom = feature.isCustom
                    isGranted = feature.isGranted
                    monthlyResetPeriodConfiguration = feature.monthlyResetPeriodConfiguration
                    order = feature.order
                    resetPeriod = feature.resetPeriod
                    usageLimit = feature.usageLimit
                    weeklyResetPeriodConfiguration = feature.weeklyResetPeriodConfiguration
                    yearlyResetPeriodConfiguration = feature.yearlyResetPeriodConfiguration
                    additionalProperties = feature.additionalProperties.toMutableMap()
                }

                /** The feature ID to attach the entitlement to */
                fun featureId(featureId: String) = featureId(JsonField.of(featureId))

                /**
                 * Sets [Builder.featureId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.featureId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

                /** Entitlement behavior (Increment or Override) */
                fun behavior(behavior: Behavior) = behavior(JsonField.of(behavior))

                /**
                 * Sets [Builder.behavior] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.behavior] with a well-typed [Behavior] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun behavior(behavior: JsonField<Behavior>) = apply { this.behavior = behavior }

                /** Description of the entitlement */
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

                /** Override display name for the entitlement */
                fun displayNameOverride(displayNameOverride: String) =
                    displayNameOverride(JsonField.of(displayNameOverride))

                /**
                 * Sets [Builder.displayNameOverride] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.displayNameOverride] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun displayNameOverride(displayNameOverride: JsonField<String>) = apply {
                    this.displayNameOverride = displayNameOverride
                }

                /** Allowed enum values for the feature entitlement */
                fun enumValues(enumValues: List<String>) = enumValues(JsonField.of(enumValues))

                /**
                 * Sets [Builder.enumValues] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enumValues] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /** Whether the usage limit is a soft limit */
                fun hasSoftLimit(hasSoftLimit: Boolean) = hasSoftLimit(JsonField.of(hasSoftLimit))

                /**
                 * Sets [Builder.hasSoftLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasSoftLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hasSoftLimit(hasSoftLimit: JsonField<Boolean>) = apply {
                    this.hasSoftLimit = hasSoftLimit
                }

                /** Whether usage is unlimited */
                fun hasUnlimitedUsage(hasUnlimitedUsage: Boolean) =
                    hasUnlimitedUsage(JsonField.of(hasUnlimitedUsage))

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

                /** Widget types where this entitlement is hidden */
                fun hiddenFromWidgets(hiddenFromWidgets: List<HiddenFromWidget>) =
                    hiddenFromWidgets(JsonField.of(hiddenFromWidgets))

                /**
                 * Sets [Builder.hiddenFromWidgets] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hiddenFromWidgets] with a well-typed
                 * `List<HiddenFromWidget>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun hiddenFromWidgets(hiddenFromWidgets: JsonField<List<HiddenFromWidget>>) =
                    apply {
                        this.hiddenFromWidgets = hiddenFromWidgets.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [HiddenFromWidget] to [hiddenFromWidgets].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addHiddenFromWidget(hiddenFromWidget: HiddenFromWidget) = apply {
                    hiddenFromWidgets =
                        (hiddenFromWidgets ?: JsonField.of(mutableListOf())).also {
                            checkKnown("hiddenFromWidgets", it).add(hiddenFromWidget)
                        }
                }

                /** Whether this is a custom entitlement */
                fun isCustom(isCustom: Boolean) = isCustom(JsonField.of(isCustom))

                /**
                 * Sets [Builder.isCustom] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isCustom] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isCustom(isCustom: JsonField<Boolean>) = apply { this.isCustom = isCustom }

                /** Whether the entitlement is granted */
                fun isGranted(isGranted: Boolean) = isGranted(JsonField.of(isGranted))

                /**
                 * Sets [Builder.isGranted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isGranted] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isGranted(isGranted: JsonField<Boolean>) = apply { this.isGranted = isGranted }

                /** Configuration for monthly reset period */
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
                 * You should usually call [Builder.monthlyResetPeriodConfiguration] with a
                 * well-typed [MonthlyResetPeriodConfiguration] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun monthlyResetPeriodConfiguration(
                    monthlyResetPeriodConfiguration: JsonField<MonthlyResetPeriodConfiguration>
                ) = apply { this.monthlyResetPeriodConfiguration = monthlyResetPeriodConfiguration }

                /** Display order of the entitlement */
                fun order(order: Double) = order(JsonField.of(order))

                /**
                 * Sets [Builder.order] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.order] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun order(order: JsonField<Double>) = apply { this.order = order }

                /** Period at which usage resets */
                fun resetPeriod(resetPeriod: ResetPeriod) = resetPeriod(JsonField.of(resetPeriod))

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

                /** Maximum allowed usage for the feature */
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
                 * You should usually call [Builder.usageLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usageLimit(usageLimit: JsonField<Long>) = apply { this.usageLimit = usageLimit }

                /** Configuration for weekly reset period */
                fun weeklyResetPeriodConfiguration(
                    weeklyResetPeriodConfiguration: WeeklyResetPeriodConfiguration?
                ) =
                    weeklyResetPeriodConfiguration(
                        JsonField.ofNullable(weeklyResetPeriodConfiguration)
                    )

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
                 * You should usually call [Builder.weeklyResetPeriodConfiguration] with a
                 * well-typed [WeeklyResetPeriodConfiguration] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun weeklyResetPeriodConfiguration(
                    weeklyResetPeriodConfiguration: JsonField<WeeklyResetPeriodConfiguration>
                ) = apply { this.weeklyResetPeriodConfiguration = weeklyResetPeriodConfiguration }

                /** Configuration for yearly reset period */
                fun yearlyResetPeriodConfiguration(
                    yearlyResetPeriodConfiguration: YearlyResetPeriodConfiguration?
                ) =
                    yearlyResetPeriodConfiguration(
                        JsonField.ofNullable(yearlyResetPeriodConfiguration)
                    )

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
                 * You should usually call [Builder.yearlyResetPeriodConfiguration] with a
                 * well-typed [YearlyResetPeriodConfiguration] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
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
                 * .featureId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Feature =
                    Feature(
                        checkRequired("featureId", featureId),
                        behavior,
                        description,
                        displayNameOverride,
                        (enumValues ?: JsonMissing.of()).map { it.toImmutable() },
                        hasSoftLimit,
                        hasUnlimitedUsage,
                        (hiddenFromWidgets ?: JsonMissing.of()).map { it.toImmutable() },
                        isCustom,
                        isGranted,
                        monthlyResetPeriodConfiguration,
                        order,
                        resetPeriod,
                        usageLimit,
                        weeklyResetPeriodConfiguration,
                        yearlyResetPeriodConfiguration,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Feature = apply {
                if (validated) {
                    return@apply
                }

                featureId()
                behavior().ifPresent { it.validate() }
                description()
                displayNameOverride()
                enumValues()
                hasSoftLimit()
                hasUnlimitedUsage()
                hiddenFromWidgets().ifPresent { it.forEach { it.validate() } }
                isCustom()
                isGranted()
                monthlyResetPeriodConfiguration().ifPresent { it.validate() }
                order()
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
                (if (featureId.asKnown().isPresent) 1 else 0) +
                    (behavior.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (displayNameOverride.asKnown().isPresent) 1 else 0) +
                    (enumValues.asKnown().getOrNull()?.size ?: 0) +
                    (if (hasSoftLimit.asKnown().isPresent) 1 else 0) +
                    (if (hasUnlimitedUsage.asKnown().isPresent) 1 else 0) +
                    (hiddenFromWidgets.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (if (isCustom.asKnown().isPresent) 1 else 0) +
                    (if (isGranted.asKnown().isPresent) 1 else 0) +
                    (monthlyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (order.asKnown().isPresent) 1 else 0) +
                    (resetPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (usageLimit.asKnown().isPresent) 1 else 0) +
                    (weeklyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                    (yearlyResetPeriodConfiguration.asKnown().getOrNull()?.validity() ?: 0)

            /** Entitlement behavior (Increment or Override) */
            class Behavior @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val INCREMENT = of("Increment")

                    @JvmField val OVERRIDE = of("Override")

                    @JvmStatic fun of(value: String) = Behavior(JsonField.of(value))
                }

                /** An enum containing [Behavior]'s known values. */
                enum class Known {
                    INCREMENT,
                    OVERRIDE,
                }

                /**
                 * An enum containing [Behavior]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Behavior] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INCREMENT,
                    OVERRIDE,
                    /**
                     * An enum member indicating that [Behavior] was instantiated with an unknown
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
                        INCREMENT -> Value.INCREMENT
                        OVERRIDE -> Value.OVERRIDE
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
                        INCREMENT -> Known.INCREMENT
                        OVERRIDE -> Known.OVERRIDE
                        else -> throw StiggInvalidDataException("Unknown Behavior: $value")
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

                fun validate(): Behavior = apply {
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

                    return other is Behavior && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class HiddenFromWidget
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

                    @JvmField val PAYWALL = of("PAYWALL")

                    @JvmField val CUSTOMER_PORTAL = of("CUSTOMER_PORTAL")

                    @JvmField val CHECKOUT = of("CHECKOUT")

                    @JvmStatic fun of(value: String) = HiddenFromWidget(JsonField.of(value))
                }

                /** An enum containing [HiddenFromWidget]'s known values. */
                enum class Known {
                    PAYWALL,
                    CUSTOMER_PORTAL,
                    CHECKOUT,
                }

                /**
                 * An enum containing [HiddenFromWidget]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [HiddenFromWidget] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PAYWALL,
                    CUSTOMER_PORTAL,
                    CHECKOUT,
                    /**
                     * An enum member indicating that [HiddenFromWidget] was instantiated with an
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
                        PAYWALL -> Value.PAYWALL
                        CUSTOMER_PORTAL -> Value.CUSTOMER_PORTAL
                        CHECKOUT -> Value.CHECKOUT
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
                        PAYWALL -> Known.PAYWALL
                        CUSTOMER_PORTAL -> Known.CUSTOMER_PORTAL
                        CHECKOUT -> Known.CHECKOUT
                        else -> throw StiggInvalidDataException("Unknown HiddenFromWidget: $value")
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

                fun validate(): HiddenFromWidget = apply {
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

                    return other is HiddenFromWidget && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Configuration for monthly reset period */
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
                 * Unlike [accordingTo], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                    fun accordingTo(accordingTo: AccordingTo) =
                        accordingTo(JsonField.of(accordingTo))

                    /**
                     * Sets [Builder.accordingTo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accordingTo] with a well-typed [AccordingTo]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [AccordingTo]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AccordingTo] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SUBSCRIPTION_START,
                        START_OF_THE_MONTH,
                        /**
                         * An enum member indicating that [AccordingTo] was instantiated with an
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
                            SUBSCRIPTION_START -> Value.SUBSCRIPTION_START
                            START_OF_THE_MONTH -> Value.START_OF_THE_MONTH
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
                     * @throws StiggInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                private val hashCode: Int by lazy {
                    Objects.hash(accordingTo, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MonthlyResetPeriodConfiguration{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
            }

            /** Period at which usage resets */
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

            /** Configuration for weekly reset period */
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
                 * Unlike [accordingTo], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                    internal fun from(
                        weeklyResetPeriodConfiguration: WeeklyResetPeriodConfiguration
                    ) = apply {
                        accordingTo = weeklyResetPeriodConfiguration.accordingTo
                        additionalProperties =
                            weeklyResetPeriodConfiguration.additionalProperties.toMutableMap()
                    }

                    /** Reset anchor (SubscriptionStart or specific day) */
                    fun accordingTo(accordingTo: AccordingTo) =
                        accordingTo(JsonField.of(accordingTo))

                    /**
                     * Sets [Builder.accordingTo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accordingTo] with a well-typed [AccordingTo]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [AccordingTo]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AccordingTo] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                         * An enum member indicating that [AccordingTo] was instantiated with an
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws StiggInvalidDataException if this class instance's value is a not a
                     *   known member.
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
                     * @throws StiggInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                private val hashCode: Int by lazy {
                    Objects.hash(accordingTo, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WeeklyResetPeriodConfiguration{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
            }

            /** Configuration for yearly reset period */
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
                 * Unlike [accordingTo], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                    internal fun from(
                        yearlyResetPeriodConfiguration: YearlyResetPeriodConfiguration
                    ) = apply {
                        accordingTo = yearlyResetPeriodConfiguration.accordingTo
                        additionalProperties =
                            yearlyResetPeriodConfiguration.additionalProperties.toMutableMap()
                    }

                    /** Reset anchor (SubscriptionStart) */
                    fun accordingTo(accordingTo: AccordingTo) =
                        accordingTo(JsonField.of(accordingTo))

                    /**
                     * Sets [Builder.accordingTo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accordingTo] with a well-typed [AccordingTo]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SUBSCRIPTION_START = of("SubscriptionStart")

                        @JvmStatic fun of(value: String) = AccordingTo(JsonField.of(value))
                    }

                    /** An enum containing [AccordingTo]'s known values. */
                    enum class Known {
                        SUBSCRIPTION_START
                    }

                    /**
                     * An enum containing [AccordingTo]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AccordingTo] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SUBSCRIPTION_START,
                        /**
                         * An enum member indicating that [AccordingTo] was instantiated with an
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
                            SUBSCRIPTION_START -> Value.SUBSCRIPTION_START
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
                            SUBSCRIPTION_START -> Known.SUBSCRIPTION_START
                            else -> throw StiggInvalidDataException("Unknown AccordingTo: $value")
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                private val hashCode: Int by lazy {
                    Objects.hash(accordingTo, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "YearlyResetPeriodConfiguration{accordingTo=$accordingTo, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Feature &&
                    featureId == other.featureId &&
                    behavior == other.behavior &&
                    description == other.description &&
                    displayNameOverride == other.displayNameOverride &&
                    enumValues == other.enumValues &&
                    hasSoftLimit == other.hasSoftLimit &&
                    hasUnlimitedUsage == other.hasUnlimitedUsage &&
                    hiddenFromWidgets == other.hiddenFromWidgets &&
                    isCustom == other.isCustom &&
                    isGranted == other.isGranted &&
                    monthlyResetPeriodConfiguration == other.monthlyResetPeriodConfiguration &&
                    order == other.order &&
                    resetPeriod == other.resetPeriod &&
                    usageLimit == other.usageLimit &&
                    weeklyResetPeriodConfiguration == other.weeklyResetPeriodConfiguration &&
                    yearlyResetPeriodConfiguration == other.yearlyResetPeriodConfiguration &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    featureId,
                    behavior,
                    description,
                    displayNameOverride,
                    enumValues,
                    hasSoftLimit,
                    hasUnlimitedUsage,
                    hiddenFromWidgets,
                    isCustom,
                    isGranted,
                    monthlyResetPeriodConfiguration,
                    order,
                    resetPeriod,
                    usageLimit,
                    weeklyResetPeriodConfiguration,
                    yearlyResetPeriodConfiguration,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Feature{featureId=$featureId, behavior=$behavior, description=$description, displayNameOverride=$displayNameOverride, enumValues=$enumValues, hasSoftLimit=$hasSoftLimit, hasUnlimitedUsage=$hasUnlimitedUsage, hiddenFromWidgets=$hiddenFromWidgets, isCustom=$isCustom, isGranted=$isGranted, monthlyResetPeriodConfiguration=$monthlyResetPeriodConfiguration, order=$order, resetPeriod=$resetPeriod, usageLimit=$usageLimit, weeklyResetPeriodConfiguration=$weeklyResetPeriodConfiguration, yearlyResetPeriodConfiguration=$yearlyResetPeriodConfiguration, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entitlement &&
                credit == other.credit &&
                feature == other.feature &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(credit, feature, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entitlement{credit=$credit, feature=$feature, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntitlementCreateParams &&
            planId == other.planId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(planId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EntitlementCreateParams{planId=$planId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
