// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.coupons

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
import com.stigg.api.core.checkKnown
import com.stigg.api.core.checkRequired
import com.stigg.api.core.http.Headers
import com.stigg.api.core.http.QueryParams
import com.stigg.api.core.toImmutable
import com.stigg.api.errors.StiggInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new Coupon */
class CouponCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The unique identifier for the entity
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = body.id()

    /**
     * Fixed amount discounts in different currencies
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountsOff(): Optional<List<AmountsOff>> = body.amountsOff()

    /**
     * Description of the coupon
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Duration of the coupon validity in months
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationInMonths(): Optional<Long> = body.durationInMonths()

    /**
     * Name of the coupon
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Percentage discount off the original price
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun percentOff(): Optional<Double> = body.percentOff()

    /** Metadata associated with the entity */
    fun _additionalMetaData(): JsonValue = body._additionalMetaData()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [amountsOff].
     *
     * Unlike [amountsOff], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amountsOff(): JsonField<List<AmountsOff>> = body._amountsOff()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [durationInMonths].
     *
     * Unlike [durationInMonths], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _durationInMonths(): JsonField<Long> = body._durationInMonths()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [percentOff].
     *
     * Unlike [percentOff], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _percentOff(): JsonField<Double> = body._percentOff()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CouponCreateParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amountsOff()
         * .description()
         * .durationInMonths()
         * .name()
         * .percentOff()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CouponCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(couponCreateParams: CouponCreateParams) = apply {
            body = couponCreateParams.body.toBuilder()
            additionalHeaders = couponCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = couponCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [amountsOff]
         * - [description]
         * - [durationInMonths]
         * - [name]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The unique identifier for the entity */
        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** Fixed amount discounts in different currencies */
        fun amountsOff(amountsOff: List<AmountsOff>?) = apply { body.amountsOff(amountsOff) }

        /** Alias for calling [Builder.amountsOff] with `amountsOff.orElse(null)`. */
        fun amountsOff(amountsOff: Optional<List<AmountsOff>>) = amountsOff(amountsOff.getOrNull())

        /**
         * Sets [Builder.amountsOff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountsOff] with a well-typed `List<AmountsOff>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountsOff(amountsOff: JsonField<List<AmountsOff>>) = apply {
            body.amountsOff(amountsOff)
        }

        /**
         * Adds a single [AmountsOff] to [Builder.amountsOff].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAmountsOff(amountsOff: AmountsOff) = apply { body.addAmountsOff(amountsOff) }

        /** Description of the coupon */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Duration of the coupon validity in months */
        fun durationInMonths(durationInMonths: Long?) = apply {
            body.durationInMonths(durationInMonths)
        }

        /**
         * Alias for [Builder.durationInMonths].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun durationInMonths(durationInMonths: Long) = durationInMonths(durationInMonths as Long?)

        /** Alias for calling [Builder.durationInMonths] with `durationInMonths.orElse(null)`. */
        fun durationInMonths(durationInMonths: Optional<Long>) =
            durationInMonths(durationInMonths.getOrNull())

        /**
         * Sets [Builder.durationInMonths] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationInMonths] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun durationInMonths(durationInMonths: JsonField<Long>) = apply {
            body.durationInMonths(durationInMonths)
        }

        /** Name of the coupon */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Percentage discount off the original price */
        fun percentOff(percentOff: Double?) = apply { body.percentOff(percentOff) }

        /**
         * Alias for [Builder.percentOff].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun percentOff(percentOff: Double) = percentOff(percentOff as Double?)

        /** Alias for calling [Builder.percentOff] with `percentOff.orElse(null)`. */
        fun percentOff(percentOff: Optional<Double>) = percentOff(percentOff.getOrNull())

        /**
         * Sets [Builder.percentOff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentOff] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun percentOff(percentOff: JsonField<Double>) = apply { body.percentOff(percentOff) }

        /** Metadata associated with the entity */
        fun additionalMetaData(additionalMetaData: JsonValue) = apply {
            body.additionalMetaData(additionalMetaData)
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
         * Returns an immutable instance of [CouponCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amountsOff()
         * .description()
         * .durationInMonths()
         * .name()
         * .percentOff()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CouponCreateParams =
            CouponCreateParams(
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
        private val id: JsonField<String>,
        private val amountsOff: JsonField<List<AmountsOff>>,
        private val description: JsonField<String>,
        private val durationInMonths: JsonField<Long>,
        private val name: JsonField<String>,
        private val percentOff: JsonField<Double>,
        private val additionalMetaData: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amountsOff")
            @ExcludeMissing
            amountsOff: JsonField<List<AmountsOff>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("durationInMonths")
            @ExcludeMissing
            durationInMonths: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("percentOff")
            @ExcludeMissing
            percentOff: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("additionalMetaData")
            @ExcludeMissing
            additionalMetaData: JsonValue = JsonMissing.of(),
        ) : this(
            id,
            amountsOff,
            description,
            durationInMonths,
            name,
            percentOff,
            additionalMetaData,
            mutableMapOf(),
        )

        /**
         * The unique identifier for the entity
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Fixed amount discounts in different currencies
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountsOff(): Optional<List<AmountsOff>> = amountsOff.getOptional("amountsOff")

        /**
         * Description of the coupon
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Duration of the coupon validity in months
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun durationInMonths(): Optional<Long> = durationInMonths.getOptional("durationInMonths")

        /**
         * Name of the coupon
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Percentage discount off the original price
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun percentOff(): Optional<Double> = percentOff.getOptional("percentOff")

        /** Metadata associated with the entity */
        @JsonProperty("additionalMetaData")
        @ExcludeMissing
        fun _additionalMetaData(): JsonValue = additionalMetaData

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amountsOff].
         *
         * Unlike [amountsOff], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amountsOff")
        @ExcludeMissing
        fun _amountsOff(): JsonField<List<AmountsOff>> = amountsOff

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [durationInMonths].
         *
         * Unlike [durationInMonths], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("durationInMonths")
        @ExcludeMissing
        fun _durationInMonths(): JsonField<Long> = durationInMonths

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [percentOff].
         *
         * Unlike [percentOff], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("percentOff")
        @ExcludeMissing
        fun _percentOff(): JsonField<Double> = percentOff

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
             * .id()
             * .amountsOff()
             * .description()
             * .durationInMonths()
             * .name()
             * .percentOff()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amountsOff: JsonField<MutableList<AmountsOff>>? = null
            private var description: JsonField<String>? = null
            private var durationInMonths: JsonField<Long>? = null
            private var name: JsonField<String>? = null
            private var percentOff: JsonField<Double>? = null
            private var additionalMetaData: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                amountsOff = body.amountsOff.map { it.toMutableList() }
                description = body.description
                durationInMonths = body.durationInMonths
                name = body.name
                percentOff = body.percentOff
                additionalMetaData = body.additionalMetaData
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The unique identifier for the entity */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Fixed amount discounts in different currencies */
            fun amountsOff(amountsOff: List<AmountsOff>?) =
                amountsOff(JsonField.ofNullable(amountsOff))

            /** Alias for calling [Builder.amountsOff] with `amountsOff.orElse(null)`. */
            fun amountsOff(amountsOff: Optional<List<AmountsOff>>) =
                amountsOff(amountsOff.getOrNull())

            /**
             * Sets [Builder.amountsOff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountsOff] with a well-typed `List<AmountsOff>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun amountsOff(amountsOff: JsonField<List<AmountsOff>>) = apply {
                this.amountsOff = amountsOff.map { it.toMutableList() }
            }

            /**
             * Adds a single [AmountsOff] to [Builder.amountsOff].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAmountsOff(amountsOff: AmountsOff) = apply {
                this.amountsOff =
                    (this.amountsOff ?: JsonField.of(mutableListOf())).also {
                        checkKnown("amountsOff", it).add(amountsOff)
                    }
            }

            /** Description of the coupon */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Duration of the coupon validity in months */
            fun durationInMonths(durationInMonths: Long?) =
                durationInMonths(JsonField.ofNullable(durationInMonths))

            /**
             * Alias for [Builder.durationInMonths].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun durationInMonths(durationInMonths: Long) =
                durationInMonths(durationInMonths as Long?)

            /**
             * Alias for calling [Builder.durationInMonths] with `durationInMonths.orElse(null)`.
             */
            fun durationInMonths(durationInMonths: Optional<Long>) =
                durationInMonths(durationInMonths.getOrNull())

            /**
             * Sets [Builder.durationInMonths] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationInMonths] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationInMonths(durationInMonths: JsonField<Long>) = apply {
                this.durationInMonths = durationInMonths
            }

            /** Name of the coupon */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Percentage discount off the original price */
            fun percentOff(percentOff: Double?) = percentOff(JsonField.ofNullable(percentOff))

            /**
             * Alias for [Builder.percentOff].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun percentOff(percentOff: Double) = percentOff(percentOff as Double?)

            /** Alias for calling [Builder.percentOff] with `percentOff.orElse(null)`. */
            fun percentOff(percentOff: Optional<Double>) = percentOff(percentOff.getOrNull())

            /**
             * Sets [Builder.percentOff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.percentOff] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun percentOff(percentOff: JsonField<Double>) = apply { this.percentOff = percentOff }

            /** Metadata associated with the entity */
            fun additionalMetaData(additionalMetaData: JsonValue) = apply {
                this.additionalMetaData = additionalMetaData
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
             * .id()
             * .amountsOff()
             * .description()
             * .durationInMonths()
             * .name()
             * .percentOff()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("id", id),
                    checkRequired("amountsOff", amountsOff).map { it.toImmutable() },
                    checkRequired("description", description),
                    checkRequired("durationInMonths", durationInMonths),
                    checkRequired("name", name),
                    checkRequired("percentOff", percentOff),
                    additionalMetaData,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            id()
            amountsOff().ifPresent { it.forEach { it.validate() } }
            description()
            durationInMonths()
            name()
            percentOff()
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
                (amountsOff.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (durationInMonths.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (percentOff.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                amountsOff == other.amountsOff &&
                description == other.description &&
                durationInMonths == other.durationInMonths &&
                name == other.name &&
                percentOff == other.percentOff &&
                additionalMetaData == other.additionalMetaData &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amountsOff,
                description,
                durationInMonths,
                name,
                percentOff,
                additionalMetaData,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, amountsOff=$amountsOff, description=$description, durationInMonths=$durationInMonths, name=$name, percentOff=$percentOff, additionalMetaData=$additionalMetaData, additionalProperties=$additionalProperties}"
    }

    class AmountsOff
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val currency: JsonField<Currency>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
        ) : this(amount, currency, mutableMapOf())

        /**
         * The price amount
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * The price currency
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

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
             * Returns a mutable builder for constructing an instance of [AmountsOff].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .currency()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AmountsOff]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var currency: JsonField<Currency>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(amountsOff: AmountsOff) = apply {
                amount = amountsOff.amount
                currency = amountsOff.currency
                additionalProperties = amountsOff.additionalProperties.toMutableMap()
            }

            /** The price amount */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** The price currency */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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
             * Returns an immutable instance of [AmountsOff].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .currency()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AmountsOff =
                AmountsOff(
                    checkRequired("amount", amount),
                    checkRequired("currency", currency),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AmountsOff = apply {
            if (validated) {
                return@apply
            }

            amount()
            currency().validate()
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
                (currency.asKnown().getOrNull()?.validity() ?: 0)

        /** The price currency */
        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Currency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws StiggInvalidDataException if this class instance's value is a not a known
             *   member.
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

                return other is Currency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AmountsOff &&
                amount == other.amount &&
                currency == other.currency &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, currency, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AmountsOff{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CouponCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CouponCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
