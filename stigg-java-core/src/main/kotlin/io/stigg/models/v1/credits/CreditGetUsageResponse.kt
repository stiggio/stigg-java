// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits

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
class CreditGetUsageResponse
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
     * Credit usage data grouped by feature with time-series points
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
         * Returns a mutable builder for constructing an instance of [CreditGetUsageResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditGetUsageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditGetUsageResponse: CreditGetUsageResponse) = apply {
            data = creditGetUsageResponse.data
            additionalProperties = creditGetUsageResponse.additionalProperties.toMutableMap()
        }

        /** Credit usage data grouped by feature with time-series points */
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
         * Returns an immutable instance of [CreditGetUsageResponse].
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
        fun build(): CreditGetUsageResponse =
            CreditGetUsageResponse(checkRequired("data", data), additionalProperties.toMutableMap())
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
    fun validate(): CreditGetUsageResponse = apply {
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

    /** Credit usage data grouped by feature with time-series points */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<Currency>,
        private val pagination: JsonField<Pagination>,
        private val series: JsonField<List<Series>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("pagination")
            @ExcludeMissing
            pagination: JsonField<Pagination> = JsonMissing.of(),
            @JsonProperty("series")
            @ExcludeMissing
            series: JsonField<List<Series>> = JsonMissing.of(),
        ) : this(currency, pagination, series, mutableMapOf())

        /**
         * The custom currency used for credit measurement
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<Currency> = currency.getOptional("currency")

        /**
         * Cursor-based pagination for the returned series. `next`/`prev` are opaque cursors; pass
         * them back as `after`/`before` to traverse pages. The series axis is `groupBy` when
         * provided, otherwise `featureId`
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pagination(): Pagination = pagination.getRequired("pagination")

        /**
         * Credit usage series grouped by feature
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun series(): List<Series> = series.getRequired("series")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [pagination].
         *
         * Unlike [pagination], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pagination")
        @ExcludeMissing
        fun _pagination(): JsonField<Pagination> = pagination

        /**
         * Returns the raw JSON value of [series].
         *
         * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("series") @ExcludeMissing fun _series(): JsonField<List<Series>> = series

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
             * .currency()
             * .pagination()
             * .series()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var currency: JsonField<Currency>? = null
            private var pagination: JsonField<Pagination>? = null
            private var series: JsonField<MutableList<Series>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                currency = data.currency
                pagination = data.pagination
                series = data.series.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The custom currency used for credit measurement */
            fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

            /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
            fun currency(currency: Optional<Currency>) = currency(currency.getOrNull())

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /**
             * Cursor-based pagination for the returned series. `next`/`prev` are opaque cursors;
             * pass them back as `after`/`before` to traverse pages. The series axis is `groupBy`
             * when provided, otherwise `featureId`
             */
            fun pagination(pagination: Pagination) = pagination(JsonField.of(pagination))

            /**
             * Sets [Builder.pagination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pagination] with a well-typed [Pagination] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pagination(pagination: JsonField<Pagination>) = apply {
                this.pagination = pagination
            }

            /** Credit usage series grouped by feature */
            fun series(series: List<Series>) = series(JsonField.of(series))

            /**
             * Sets [Builder.series] to an arbitrary JSON value.
             *
             * You should usually call [Builder.series] with a well-typed `List<Series>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun series(series: JsonField<List<Series>>) = apply {
                this.series = series.map { it.toMutableList() }
            }

            /**
             * Adds a single [Series] to [Builder.series].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSeries(series: Series) = apply {
                this.series =
                    (this.series ?: JsonField.of(mutableListOf())).also {
                        checkKnown("series", it).add(series)
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
             * .currency()
             * .pagination()
             * .series()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("currency", currency),
                    checkRequired("pagination", pagination),
                    checkRequired("series", series).map { it.toImmutable() },
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

            currency().ifPresent { it.validate() }
            pagination().validate()
            series().forEach { it.validate() }
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
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (pagination.asKnown().getOrNull()?.validity() ?: 0) +
                (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** The custom currency used for credit measurement */
        class Currency
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val currencyId: JsonField<String>,
            private val displayName: JsonField<String>,
            private val plural: JsonField<String>,
            private val singular: JsonField<String>,
            private val symbol: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("currencyId")
                @ExcludeMissing
                currencyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("displayName")
                @ExcludeMissing
                displayName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("plural")
                @ExcludeMissing
                plural: JsonField<String> = JsonMissing.of(),
                @JsonProperty("singular")
                @ExcludeMissing
                singular: JsonField<String> = JsonMissing.of(),
                @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
            ) : this(currencyId, displayName, plural, singular, symbol, mutableMapOf())

            /**
             * The currency identifier
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currencyId(): String = currencyId.getRequired("currencyId")

            /**
             * The display name of the currency
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun displayName(): String = displayName.getRequired("displayName")

            /**
             * Plural unit label
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun plural(): Optional<String> = plural.getOptional("plural")

            /**
             * Singular unit label
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun singular(): Optional<String> = singular.getOptional("singular")

            /**
             * The currency symbol
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun symbol(): Optional<String> = symbol.getOptional("symbol")

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
             * Returns the raw JSON value of [displayName].
             *
             * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("displayName")
            @ExcludeMissing
            fun _displayName(): JsonField<String> = displayName

            /**
             * Returns the raw JSON value of [plural].
             *
             * Unlike [plural], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("plural") @ExcludeMissing fun _plural(): JsonField<String> = plural

            /**
             * Returns the raw JSON value of [singular].
             *
             * Unlike [singular], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("singular") @ExcludeMissing fun _singular(): JsonField<String> = singular

            /**
             * Returns the raw JSON value of [symbol].
             *
             * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

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
                 * Returns a mutable builder for constructing an instance of [Currency].
                 *
                 * The following fields are required:
                 * ```java
                 * .currencyId()
                 * .displayName()
                 * .plural()
                 * .singular()
                 * .symbol()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Currency]. */
            class Builder internal constructor() {

                private var currencyId: JsonField<String>? = null
                private var displayName: JsonField<String>? = null
                private var plural: JsonField<String>? = null
                private var singular: JsonField<String>? = null
                private var symbol: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(currency: Currency) = apply {
                    currencyId = currency.currencyId
                    displayName = currency.displayName
                    plural = currency.plural
                    singular = currency.singular
                    symbol = currency.symbol
                    additionalProperties = currency.additionalProperties.toMutableMap()
                }

                /** The currency identifier */
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

                /** The display name of the currency */
                fun displayName(displayName: String) = displayName(JsonField.of(displayName))

                /**
                 * Sets [Builder.displayName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.displayName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun displayName(displayName: JsonField<String>) = apply {
                    this.displayName = displayName
                }

                /** Plural unit label */
                fun plural(plural: String?) = plural(JsonField.ofNullable(plural))

                /** Alias for calling [Builder.plural] with `plural.orElse(null)`. */
                fun plural(plural: Optional<String>) = plural(plural.getOrNull())

                /**
                 * Sets [Builder.plural] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.plural] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun plural(plural: JsonField<String>) = apply { this.plural = plural }

                /** Singular unit label */
                fun singular(singular: String?) = singular(JsonField.ofNullable(singular))

                /** Alias for calling [Builder.singular] with `singular.orElse(null)`. */
                fun singular(singular: Optional<String>) = singular(singular.getOrNull())

                /**
                 * Sets [Builder.singular] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.singular] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun singular(singular: JsonField<String>) = apply { this.singular = singular }

                /** The currency symbol */
                fun symbol(symbol: String?) = symbol(JsonField.ofNullable(symbol))

                /** Alias for calling [Builder.symbol] with `symbol.orElse(null)`. */
                fun symbol(symbol: Optional<String>) = symbol(symbol.getOrNull())

                /**
                 * Sets [Builder.symbol] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.symbol] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

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
                 * Returns an immutable instance of [Currency].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .currencyId()
                 * .displayName()
                 * .plural()
                 * .singular()
                 * .symbol()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Currency =
                    Currency(
                        checkRequired("currencyId", currencyId),
                        checkRequired("displayName", displayName),
                        checkRequired("plural", plural),
                        checkRequired("singular", singular),
                        checkRequired("symbol", symbol),
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
            fun validate(): Currency = apply {
                if (validated) {
                    return@apply
                }

                currencyId()
                displayName()
                plural()
                singular()
                symbol()
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
                (if (currencyId.asKnown().isPresent) 1 else 0) +
                    (if (displayName.asKnown().isPresent) 1 else 0) +
                    (if (plural.asKnown().isPresent) 1 else 0) +
                    (if (singular.asKnown().isPresent) 1 else 0) +
                    (if (symbol.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Currency &&
                    currencyId == other.currencyId &&
                    displayName == other.displayName &&
                    plural == other.plural &&
                    singular == other.singular &&
                    symbol == other.symbol &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    currencyId,
                    displayName,
                    plural,
                    singular,
                    symbol,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Currency{currencyId=$currencyId, displayName=$displayName, plural=$plural, singular=$singular, symbol=$symbol, additionalProperties=$additionalProperties}"
        }

        /**
         * Cursor-based pagination for the returned series. `next`/`prev` are opaque cursors; pass
         * them back as `after`/`before` to traverse pages. The series axis is `groupBy` when
         * provided, otherwise `featureId`
         */
        class Pagination
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val next: JsonField<String>,
            private val prev: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
                @JsonProperty("prev") @ExcludeMissing prev: JsonField<String> = JsonMissing.of(),
            ) : this(next, prev, mutableMapOf())

            /**
             * Cursor for fetching the next page of results, or null if no additional pages exist
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun next(): Optional<String> = next.getOptional("next")

            /**
             * Cursor for fetching the previous page of results, or null if at the beginning
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun prev(): Optional<String> = prev.getOptional("prev")

            /**
             * Returns the raw JSON value of [next].
             *
             * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

            /**
             * Returns the raw JSON value of [prev].
             *
             * Unlike [prev], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("prev") @ExcludeMissing fun _prev(): JsonField<String> = prev

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
                 * Returns a mutable builder for constructing an instance of [Pagination].
                 *
                 * The following fields are required:
                 * ```java
                 * .next()
                 * .prev()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Pagination]. */
            class Builder internal constructor() {

                private var next: JsonField<String>? = null
                private var prev: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pagination: Pagination) = apply {
                    next = pagination.next
                    prev = pagination.prev
                    additionalProperties = pagination.additionalProperties.toMutableMap()
                }

                /**
                 * Cursor for fetching the next page of results, or null if no additional pages
                 * exist
                 */
                fun next(next: String?) = next(JsonField.ofNullable(next))

                /** Alias for calling [Builder.next] with `next.orElse(null)`. */
                fun next(next: Optional<String>) = next(next.getOrNull())

                /**
                 * Sets [Builder.next] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.next] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun next(next: JsonField<String>) = apply { this.next = next }

                /** Cursor for fetching the previous page of results, or null if at the beginning */
                fun prev(prev: String?) = prev(JsonField.ofNullable(prev))

                /** Alias for calling [Builder.prev] with `prev.orElse(null)`. */
                fun prev(prev: Optional<String>) = prev(prev.getOrNull())

                /**
                 * Sets [Builder.prev] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prev] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun prev(prev: JsonField<String>) = apply { this.prev = prev }

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
                 * Returns an immutable instance of [Pagination].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .next()
                 * .prev()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Pagination =
                    Pagination(
                        checkRequired("next", next),
                        checkRequired("prev", prev),
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
            fun validate(): Pagination = apply {
                if (validated) {
                    return@apply
                }

                next()
                prev()
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
                (if (next.asKnown().isPresent) 1 else 0) + (if (prev.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Pagination &&
                    next == other.next &&
                    prev == other.prev &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(next, prev, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Pagination{next=$next, prev=$prev, additionalProperties=$additionalProperties}"
        }

        /** Credit usage data for a single feature */
        class Series
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val eventCount: JsonField<Double>,
            private val featureId: JsonField<String>,
            private val featureName: JsonField<String>,
            private val points: JsonField<List<Point>>,
            private val totalCredits: JsonField<Double>,
            private val tags: JsonField<List<Tag>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("eventCount")
                @ExcludeMissing
                eventCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("featureId")
                @ExcludeMissing
                featureId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("featureName")
                @ExcludeMissing
                featureName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("points")
                @ExcludeMissing
                points: JsonField<List<Point>> = JsonMissing.of(),
                @JsonProperty("totalCredits")
                @ExcludeMissing
                totalCredits: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<Tag>> = JsonMissing.of(),
            ) : this(eventCount, featureId, featureName, points, totalCredits, tags, mutableMapOf())

            /**
             * Number of distinct usage events that consumed credits in this series. This count is
             * not additive across series, because an event matched by several meters appears in
             * more than one series.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun eventCount(): Double = eventCount.getRequired("eventCount")

            /**
             * The feature ID; null when grouping by dimensions only
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun featureId(): Optional<String> = featureId.getOptional("featureId")

            /**
             * The display name of the feature; null when grouping by dimensions only
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun featureName(): Optional<String> = featureName.getOptional("featureName")

            /**
             * Time-series data points for this feature
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun points(): List<Point> = points.getRequired("points")

            /**
             * Total credits consumed by this feature in the time range
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalCredits(): Double = totalCredits.getRequired("totalCredits")

            /**
             * Dimension key/value pairs identifying this series when groupBy is applied
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tags(): Optional<List<Tag>> = tags.getOptional("tags")

            /**
             * Returns the raw JSON value of [eventCount].
             *
             * Unlike [eventCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("eventCount")
            @ExcludeMissing
            fun _eventCount(): JsonField<Double> = eventCount

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
             * Returns the raw JSON value of [featureName].
             *
             * Unlike [featureName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("featureName")
            @ExcludeMissing
            fun _featureName(): JsonField<String> = featureName

            /**
             * Returns the raw JSON value of [points].
             *
             * Unlike [points], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("points") @ExcludeMissing fun _points(): JsonField<List<Point>> = points

            /**
             * Returns the raw JSON value of [totalCredits].
             *
             * Unlike [totalCredits], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("totalCredits")
            @ExcludeMissing
            fun _totalCredits(): JsonField<Double> = totalCredits

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<Tag>> = tags

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
                 * Returns a mutable builder for constructing an instance of [Series].
                 *
                 * The following fields are required:
                 * ```java
                 * .eventCount()
                 * .featureId()
                 * .featureName()
                 * .points()
                 * .totalCredits()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Series]. */
            class Builder internal constructor() {

                private var eventCount: JsonField<Double>? = null
                private var featureId: JsonField<String>? = null
                private var featureName: JsonField<String>? = null
                private var points: JsonField<MutableList<Point>>? = null
                private var totalCredits: JsonField<Double>? = null
                private var tags: JsonField<MutableList<Tag>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(series: Series) = apply {
                    eventCount = series.eventCount
                    featureId = series.featureId
                    featureName = series.featureName
                    points = series.points.map { it.toMutableList() }
                    totalCredits = series.totalCredits
                    tags = series.tags.map { it.toMutableList() }
                    additionalProperties = series.additionalProperties.toMutableMap()
                }

                /**
                 * Number of distinct usage events that consumed credits in this series. This count
                 * is not additive across series, because an event matched by several meters appears
                 * in more than one series.
                 */
                fun eventCount(eventCount: Double) = eventCount(JsonField.of(eventCount))

                /**
                 * Sets [Builder.eventCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventCount(eventCount: JsonField<Double>) = apply {
                    this.eventCount = eventCount
                }

                /** The feature ID; null when grouping by dimensions only */
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

                /** The display name of the feature; null when grouping by dimensions only */
                fun featureName(featureName: String?) =
                    featureName(JsonField.ofNullable(featureName))

                /** Alias for calling [Builder.featureName] with `featureName.orElse(null)`. */
                fun featureName(featureName: Optional<String>) =
                    featureName(featureName.getOrNull())

                /**
                 * Sets [Builder.featureName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.featureName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun featureName(featureName: JsonField<String>) = apply {
                    this.featureName = featureName
                }

                /** Time-series data points for this feature */
                fun points(points: List<Point>) = points(JsonField.of(points))

                /**
                 * Sets [Builder.points] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.points] with a well-typed `List<Point>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun points(points: JsonField<List<Point>>) = apply {
                    this.points = points.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Point] to [points].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPoint(point: Point) = apply {
                    points =
                        (points ?: JsonField.of(mutableListOf())).also {
                            checkKnown("points", it).add(point)
                        }
                }

                /** Total credits consumed by this feature in the time range */
                fun totalCredits(totalCredits: Double) = totalCredits(JsonField.of(totalCredits))

                /**
                 * Sets [Builder.totalCredits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalCredits] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalCredits(totalCredits: JsonField<Double>) = apply {
                    this.totalCredits = totalCredits
                }

                /** Dimension key/value pairs identifying this series when groupBy is applied */
                fun tags(tags: List<Tag>) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<Tag>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tags(tags: JsonField<List<Tag>>) = apply {
                    this.tags = tags.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Tag] to [tags].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTag(tag: Tag) = apply {
                    tags =
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
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
                 * Returns an immutable instance of [Series].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .eventCount()
                 * .featureId()
                 * .featureName()
                 * .points()
                 * .totalCredits()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Series =
                    Series(
                        checkRequired("eventCount", eventCount),
                        checkRequired("featureId", featureId),
                        checkRequired("featureName", featureName),
                        checkRequired("points", points).map { it.toImmutable() },
                        checkRequired("totalCredits", totalCredits),
                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): Series = apply {
                if (validated) {
                    return@apply
                }

                eventCount()
                featureId()
                featureName()
                points().forEach { it.validate() }
                totalCredits()
                tags().ifPresent { it.forEach { it.validate() } }
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
                (if (eventCount.asKnown().isPresent) 1 else 0) +
                    (if (featureId.asKnown().isPresent) 1 else 0) +
                    (if (featureName.asKnown().isPresent) 1 else 0) +
                    (points.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (totalCredits.asKnown().isPresent) 1 else 0) +
                    (tags.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** A single data point in the credit usage time series */
            class Point
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val eventCount: JsonField<Double>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val value: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("eventCount")
                    @ExcludeMissing
                    eventCount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Double> = JsonMissing.of(),
                ) : this(eventCount, timestamp, value, mutableMapOf())

                /**
                 * Number of distinct usage events that consumed credits in this time bucket
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun eventCount(): Double = eventCount.getRequired("eventCount")

                /**
                 * The timestamp of the data point
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                /**
                 * The credit usage value at this point
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun value(): Double = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [eventCount].
                 *
                 * Unlike [eventCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("eventCount")
                @ExcludeMissing
                fun _eventCount(): JsonField<Double> = eventCount

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
                     * Returns a mutable builder for constructing an instance of [Point].
                     *
                     * The following fields are required:
                     * ```java
                     * .eventCount()
                     * .timestamp()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Point]. */
                class Builder internal constructor() {

                    private var eventCount: JsonField<Double>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var value: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(point: Point) = apply {
                        eventCount = point.eventCount
                        timestamp = point.timestamp
                        value = point.value
                        additionalProperties = point.additionalProperties.toMutableMap()
                    }

                    /** Number of distinct usage events that consumed credits in this time bucket */
                    fun eventCount(eventCount: Double) = eventCount(JsonField.of(eventCount))

                    /**
                     * Sets [Builder.eventCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.eventCount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun eventCount(eventCount: JsonField<Double>) = apply {
                        this.eventCount = eventCount
                    }

                    /** The timestamp of the data point */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    /** The credit usage value at this point */
                    fun value(value: Double) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Double>) = apply { this.value = value }

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
                     * Returns an immutable instance of [Point].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .eventCount()
                     * .timestamp()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Point =
                        Point(
                            checkRequired("eventCount", eventCount),
                            checkRequired("timestamp", timestamp),
                            checkRequired("value", value),
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
                fun validate(): Point = apply {
                    if (validated) {
                        return@apply
                    }

                    eventCount()
                    timestamp()
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
                    (if (eventCount.asKnown().isPresent) 1 else 0) +
                        (if (timestamp.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Point &&
                        eventCount == other.eventCount &&
                        timestamp == other.timestamp &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(eventCount, timestamp, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Point{eventCount=$eventCount, timestamp=$timestamp, value=$value, additionalProperties=$additionalProperties}"
            }

            /** Dimension key/value pair identifying a credit usage series */
            class Tag
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val key: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(key, value, mutableMapOf())

                /**
                 * The dimension key
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun key(): String = key.getRequired("key")

                /**
                 * The dimension value for this series
                 *
                 * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun value(): String = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [key].
                 *
                 * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of [Tag].
                     *
                     * The following fields are required:
                     * ```java
                     * .key()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tag]. */
                class Builder internal constructor() {

                    private var key: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tag: Tag) = apply {
                        key = tag.key
                        value = tag.value
                        additionalProperties = tag.additionalProperties.toMutableMap()
                    }

                    /** The dimension key */
                    fun key(key: String) = key(JsonField.of(key))

                    /**
                     * Sets [Builder.key] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.key] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** The dimension value for this series */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [Tag].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .key()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Tag =
                        Tag(
                            checkRequired("key", key),
                            checkRequired("value", value),
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
                fun validate(): Tag = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
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
                    (if (key.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tag &&
                        key == other.key &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tag{key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Series &&
                    eventCount == other.eventCount &&
                    featureId == other.featureId &&
                    featureName == other.featureName &&
                    points == other.points &&
                    totalCredits == other.totalCredits &&
                    tags == other.tags &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    eventCount,
                    featureId,
                    featureName,
                    points,
                    totalCredits,
                    tags,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Series{eventCount=$eventCount, featureId=$featureId, featureName=$featureName, points=$points, totalCredits=$totalCredits, tags=$tags, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                currency == other.currency &&
                pagination == other.pagination &&
                series == other.series &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(currency, pagination, series, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{currency=$currency, pagination=$pagination, series=$series, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditGetUsageResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditGetUsageResponse{data=$data, additionalProperties=$additionalProperties}"
}
