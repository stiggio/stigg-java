// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.reservations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.stigg.core.Enum
import io.stigg.core.ExcludeMissing
import io.stigg.core.JsonField
import io.stigg.core.JsonMissing
import io.stigg.core.JsonValue
import io.stigg.core.checkRequired
import io.stigg.errors.StiggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response object */
class ReservationReleaseResponse
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
     * Result of releasing a credit reservation
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
         * Returns a mutable builder for constructing an instance of [ReservationReleaseResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReservationReleaseResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reservationReleaseResponse: ReservationReleaseResponse) = apply {
            data = reservationReleaseResponse.data
            additionalProperties = reservationReleaseResponse.additionalProperties.toMutableMap()
        }

        /** Result of releasing a credit reservation */
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
         * Returns an immutable instance of [ReservationReleaseResponse].
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
        fun build(): ReservationReleaseResponse =
            ReservationReleaseResponse(
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
    fun validate(): ReservationReleaseResponse = apply {
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

    /** Result of releasing a credit reservation */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val credit: JsonField<Credit>,
        private val reservation: JsonField<Reservation>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit") @ExcludeMissing credit: JsonField<Credit> = JsonMissing.of(),
            @JsonProperty("reservation")
            @ExcludeMissing
            reservation: JsonField<Reservation> = JsonMissing.of(),
        ) : this(credit, reservation, mutableMapOf())

        /**
         * The optimistic credit balance after the release
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun credit(): Optional<Credit> = credit.getOptional("credit")

        /**
         * The released reservation
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reservation(): Reservation = reservation.getRequired("reservation")

        /**
         * Returns the raw JSON value of [credit].
         *
         * Unlike [credit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit") @ExcludeMissing fun _credit(): JsonField<Credit> = credit

        /**
         * Returns the raw JSON value of [reservation].
         *
         * Unlike [reservation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reservation")
        @ExcludeMissing
        fun _reservation(): JsonField<Reservation> = reservation

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
             * .credit()
             * .reservation()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var credit: JsonField<Credit>? = null
            private var reservation: JsonField<Reservation>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                credit = data.credit
                reservation = data.reservation
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The optimistic credit balance after the release */
            fun credit(credit: Credit?) = credit(JsonField.ofNullable(credit))

            /** Alias for calling [Builder.credit] with `credit.orElse(null)`. */
            fun credit(credit: Optional<Credit>) = credit(credit.getOrNull())

            /**
             * Sets [Builder.credit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.credit] with a well-typed [Credit] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun credit(credit: JsonField<Credit>) = apply { this.credit = credit }

            /** The released reservation */
            fun reservation(reservation: Reservation) = reservation(JsonField.of(reservation))

            /**
             * Sets [Builder.reservation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reservation] with a well-typed [Reservation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reservation(reservation: JsonField<Reservation>) = apply {
                this.reservation = reservation
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
             * .credit()
             * .reservation()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("credit", credit),
                    checkRequired("reservation", reservation),
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

            credit().ifPresent { it.validate() }
            reservation().validate()
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
                (reservation.asKnown().getOrNull()?.validity() ?: 0)

        /** The optimistic credit balance after the release */
        class Credit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val currencyId: JsonField<String>,
            private val currentUsage: JsonField<Double>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val usageLimit: JsonField<Double>,
            private val usagePeriodEnd: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("currencyId")
                @ExcludeMissing
                currencyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currentUsage")
                @ExcludeMissing
                currentUsage: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("usageLimit")
                @ExcludeMissing
                usageLimit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("usagePeriodEnd")
                @ExcludeMissing
                usagePeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                currencyId,
                currentUsage,
                timestamp,
                usageLimit,
                usagePeriodEnd,
                mutableMapOf(),
            )

            /**
             * The credit currency identifier
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currencyId(): String = currencyId.getRequired("currencyId")

            /**
             * The wallet's total consumed credits for this currency (optimistic — includes
             * not-yet-reconciled usage), shared across every feature that draws on the currency.
             * This is the running balance, not this call's deduction — see `consumed` for that.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currentUsage(): Double = currentUsage.getRequired("currentUsage")

            /**
             * The grant-version timestamp of this balance, used by the SDK for last-write-wins
             * reconciliation
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * The total credits granted
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usageLimit(): Double = usageLimit.getRequired("usageLimit")

            /**
             * End of the current credit grant period (when recurring credits reset), if applicable
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usagePeriodEnd(): Optional<OffsetDateTime> =
                usagePeriodEnd.getOptional("usagePeriodEnd")

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
             * Returns the raw JSON value of [currentUsage].
             *
             * Unlike [currentUsage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currentUsage")
            @ExcludeMissing
            fun _currentUsage(): JsonField<Double> = currentUsage

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
             * Returns the raw JSON value of [usageLimit].
             *
             * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usageLimit")
            @ExcludeMissing
            fun _usageLimit(): JsonField<Double> = usageLimit

            /**
             * Returns the raw JSON value of [usagePeriodEnd].
             *
             * Unlike [usagePeriodEnd], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usagePeriodEnd")
            @ExcludeMissing
            fun _usagePeriodEnd(): JsonField<OffsetDateTime> = usagePeriodEnd

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
                 * .currencyId()
                 * .currentUsage()
                 * .timestamp()
                 * .usageLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Credit]. */
            class Builder internal constructor() {

                private var currencyId: JsonField<String>? = null
                private var currentUsage: JsonField<Double>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var usageLimit: JsonField<Double>? = null
                private var usagePeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(credit: Credit) = apply {
                    currencyId = credit.currencyId
                    currentUsage = credit.currentUsage
                    timestamp = credit.timestamp
                    usageLimit = credit.usageLimit
                    usagePeriodEnd = credit.usagePeriodEnd
                    additionalProperties = credit.additionalProperties.toMutableMap()
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

                /**
                 * The wallet's total consumed credits for this currency (optimistic — includes
                 * not-yet-reconciled usage), shared across every feature that draws on the
                 * currency. This is the running balance, not this call's deduction — see `consumed`
                 * for that.
                 */
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

                /**
                 * The grant-version timestamp of this balance, used by the SDK for last-write-wins
                 * reconciliation
                 */
                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                /** The total credits granted */
                fun usageLimit(usageLimit: Double) = usageLimit(JsonField.of(usageLimit))

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

                /**
                 * End of the current credit grant period (when recurring credits reset), if
                 * applicable
                 */
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
                 * .currencyId()
                 * .currentUsage()
                 * .timestamp()
                 * .usageLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Credit =
                    Credit(
                        checkRequired("currencyId", currencyId),
                        checkRequired("currentUsage", currentUsage),
                        checkRequired("timestamp", timestamp),
                        checkRequired("usageLimit", usageLimit),
                        usagePeriodEnd,
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
            fun validate(): Credit = apply {
                if (validated) {
                    return@apply
                }

                currencyId()
                currentUsage()
                timestamp()
                usageLimit()
                usagePeriodEnd()
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
                    (if (currentUsage.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (if (usageLimit.asKnown().isPresent) 1 else 0) +
                    (if (usagePeriodEnd.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Credit &&
                    currencyId == other.currencyId &&
                    currentUsage == other.currentUsage &&
                    timestamp == other.timestamp &&
                    usageLimit == other.usageLimit &&
                    usagePeriodEnd == other.usagePeriodEnd &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    currencyId,
                    currentUsage,
                    timestamp,
                    usageLimit,
                    usagePeriodEnd,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Credit{currencyId=$currencyId, currentUsage=$currentUsage, timestamp=$timestamp, usageLimit=$usageLimit, usagePeriodEnd=$usagePeriodEnd, additionalProperties=$additionalProperties}"
        }

        /** The released reservation */
        class Reservation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val amount: JsonField<Double>,
            private val consumedAmount: JsonField<Double>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val status: JsonField<Status>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("consumedAmount")
                @ExcludeMissing
                consumedAmount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("expiresAt")
                @ExcludeMissing
                expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            ) : this(id, amount, consumedAmount, expiresAt, status, mutableMapOf())

            /**
             * The client-provided reservation ID.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * The amount of credits held.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * The amount consumed at release
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun consumedAmount(): Optional<Double> = consumedAmount.getOptional("consumedAmount")

            /**
             * When the reservation expires. Unreleased credits return to the balance at this time.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expiresAt")

            /**
             * The status of the reservation.
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [consumedAmount].
             *
             * Unlike [consumedAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("consumedAmount")
            @ExcludeMissing
            fun _consumedAmount(): JsonField<Double> = consumedAmount

            /**
             * Returns the raw JSON value of [expiresAt].
             *
             * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expiresAt")
            @ExcludeMissing
            fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
                 * Returns a mutable builder for constructing an instance of [Reservation].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .amount()
                 * .consumedAmount()
                 * .expiresAt()
                 * .status()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Reservation]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var amount: JsonField<Double>? = null
                private var consumedAmount: JsonField<Double>? = null
                private var expiresAt: JsonField<OffsetDateTime>? = null
                private var status: JsonField<Status>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(reservation: Reservation) = apply {
                    id = reservation.id
                    amount = reservation.amount
                    consumedAmount = reservation.consumedAmount
                    expiresAt = reservation.expiresAt
                    status = reservation.status
                    additionalProperties = reservation.additionalProperties.toMutableMap()
                }

                /** The client-provided reservation ID. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The amount of credits held. */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** The amount consumed at release */
                fun consumedAmount(consumedAmount: Double?) =
                    consumedAmount(JsonField.ofNullable(consumedAmount))

                /**
                 * Alias for [Builder.consumedAmount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun consumedAmount(consumedAmount: Double) =
                    consumedAmount(consumedAmount as Double?)

                /**
                 * Alias for calling [Builder.consumedAmount] with `consumedAmount.orElse(null)`.
                 */
                fun consumedAmount(consumedAmount: Optional<Double>) =
                    consumedAmount(consumedAmount.getOrNull())

                /**
                 * Sets [Builder.consumedAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.consumedAmount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun consumedAmount(consumedAmount: JsonField<Double>) = apply {
                    this.consumedAmount = consumedAmount
                }

                /**
                 * When the reservation expires. Unreleased credits return to the balance at this
                 * time.
                 */
                fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

                /**
                 * Sets [Builder.expiresAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /** The status of the reservation. */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

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
                 * Returns an immutable instance of [Reservation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .amount()
                 * .consumedAmount()
                 * .expiresAt()
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Reservation =
                    Reservation(
                        checkRequired("id", id),
                        checkRequired("amount", amount),
                        checkRequired("consumedAmount", consumedAmount),
                        checkRequired("expiresAt", expiresAt),
                        checkRequired("status", status),
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
            fun validate(): Reservation = apply {
                if (validated) {
                    return@apply
                }

                id()
                amount()
                consumedAmount()
                expiresAt()
                status().validate()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (consumedAmount.asKnown().isPresent) 1 else 0) +
                    (if (expiresAt.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0)

            /** The status of the reservation. */
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

                    @JvmField val ACTIVE = of("ACTIVE")

                    @JvmField val RELEASED = of("RELEASED")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    ACTIVE,
                    RELEASED,
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
                    ACTIVE,
                    RELEASED,
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
                        ACTIVE -> Value.ACTIVE
                        RELEASED -> Value.RELEASED
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
                        ACTIVE -> Known.ACTIVE
                        RELEASED -> Known.RELEASED
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Reservation &&
                    id == other.id &&
                    amount == other.amount &&
                    consumedAmount == other.consumedAmount &&
                    expiresAt == other.expiresAt &&
                    status == other.status &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, amount, consumedAmount, expiresAt, status, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Reservation{id=$id, amount=$amount, consumedAmount=$consumedAmount, expiresAt=$expiresAt, status=$status, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                credit == other.credit &&
                reservation == other.reservation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(credit, reservation, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{credit=$credit, reservation=$reservation, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReservationReleaseResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReservationReleaseResponse{data=$data, additionalProperties=$additionalProperties}"
}
