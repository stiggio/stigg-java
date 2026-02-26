// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.plans

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
import io.stigg.core.checkRequired
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates a new plan in draft status. */
class PlanCreateParams
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
     * The display name of the package
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = body.displayName()

    /**
     * The product ID to associate the plan with
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = body.productId()

    /**
     * The unique identifier for the entity in the billing provider
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingId(): Optional<String> = body.billingId()

    /**
     * Default trial configuration for the plan
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultTrialConfig(): Optional<DefaultTrialConfig> = body.defaultTrialConfig()

    /**
     * The description of the package
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Metadata associated with the entity
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * The ID of the parent plan, if applicable
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentPlanId(): Optional<String> = body.parentPlanId()

    /**
     * The pricing type of the package
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pricingType(): Optional<PricingType> = body.pricingType()

    /**
     * The status of the package
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = body.status()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productId(): JsonField<String> = body._productId()

    /**
     * Returns the raw JSON value of [billingId].
     *
     * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingId(): JsonField<String> = body._billingId()

    /**
     * Returns the raw JSON value of [defaultTrialConfig].
     *
     * Unlike [defaultTrialConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultTrialConfig(): JsonField<DefaultTrialConfig> = body._defaultTrialConfig()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [parentPlanId].
     *
     * Unlike [parentPlanId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parentPlanId(): JsonField<String> = body._parentPlanId()

    /**
     * Returns the raw JSON value of [pricingType].
     *
     * Unlike [pricingType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pricingType(): JsonField<PricingType> = body._pricingType()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanCreateParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .displayName()
         * .productId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(planCreateParams: PlanCreateParams) = apply {
            body = planCreateParams.body.toBuilder()
            additionalHeaders = planCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = planCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [displayName]
         * - [productId]
         * - [billingId]
         * - [defaultTrialConfig]
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

        /** The display name of the package */
        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        /** The product ID to associate the plan with */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /** The unique identifier for the entity in the billing provider */
        fun billingId(billingId: String?) = apply { body.billingId(billingId) }

        /** Alias for calling [Builder.billingId] with `billingId.orElse(null)`. */
        fun billingId(billingId: Optional<String>) = billingId(billingId.getOrNull())

        /**
         * Sets [Builder.billingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billingId(billingId: JsonField<String>) = apply { body.billingId(billingId) }

        /** Default trial configuration for the plan */
        fun defaultTrialConfig(defaultTrialConfig: DefaultTrialConfig?) = apply {
            body.defaultTrialConfig(defaultTrialConfig)
        }

        /**
         * Alias for calling [Builder.defaultTrialConfig] with `defaultTrialConfig.orElse(null)`.
         */
        fun defaultTrialConfig(defaultTrialConfig: Optional<DefaultTrialConfig>) =
            defaultTrialConfig(defaultTrialConfig.getOrNull())

        /**
         * Sets [Builder.defaultTrialConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultTrialConfig] with a well-typed
         * [DefaultTrialConfig] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun defaultTrialConfig(defaultTrialConfig: JsonField<DefaultTrialConfig>) = apply {
            body.defaultTrialConfig(defaultTrialConfig)
        }

        /** The description of the package */
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

        /** Metadata associated with the entity */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** The ID of the parent plan, if applicable */
        fun parentPlanId(parentPlanId: String?) = apply { body.parentPlanId(parentPlanId) }

        /** Alias for calling [Builder.parentPlanId] with `parentPlanId.orElse(null)`. */
        fun parentPlanId(parentPlanId: Optional<String>) = parentPlanId(parentPlanId.getOrNull())

        /**
         * Sets [Builder.parentPlanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentPlanId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentPlanId(parentPlanId: JsonField<String>) = apply {
            body.parentPlanId(parentPlanId)
        }

        /** The pricing type of the package */
        fun pricingType(pricingType: PricingType?) = apply { body.pricingType(pricingType) }

        /** Alias for calling [Builder.pricingType] with `pricingType.orElse(null)`. */
        fun pricingType(pricingType: Optional<PricingType>) = pricingType(pricingType.getOrNull())

        /**
         * Sets [Builder.pricingType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricingType] with a well-typed [PricingType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pricingType(pricingType: JsonField<PricingType>) = apply {
            body.pricingType(pricingType)
        }

        /** The status of the package */
        fun status(status: Status) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

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
         * Returns an immutable instance of [PlanCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .displayName()
         * .productId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanCreateParams =
            PlanCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request to create a new plan */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val displayName: JsonField<String>,
        private val productId: JsonField<String>,
        private val billingId: JsonField<String>,
        private val defaultTrialConfig: JsonField<DefaultTrialConfig>,
        private val description: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val parentPlanId: JsonField<String>,
        private val pricingType: JsonField<PricingType>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("productId")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billingId")
            @ExcludeMissing
            billingId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("defaultTrialConfig")
            @ExcludeMissing
            defaultTrialConfig: JsonField<DefaultTrialConfig> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("parentPlanId")
            @ExcludeMissing
            parentPlanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pricingType")
            @ExcludeMissing
            pricingType: JsonField<PricingType> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(
            id,
            displayName,
            productId,
            billingId,
            defaultTrialConfig,
            description,
            metadata,
            parentPlanId,
            pricingType,
            status,
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
         * The display name of the package
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun displayName(): String = displayName.getRequired("displayName")

        /**
         * The product ID to associate the plan with
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("productId")

        /**
         * The unique identifier for the entity in the billing provider
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingId(): Optional<String> = billingId.getOptional("billingId")

        /**
         * Default trial configuration for the plan
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultTrialConfig(): Optional<DefaultTrialConfig> =
            defaultTrialConfig.getOptional("defaultTrialConfig")

        /**
         * The description of the package
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Metadata associated with the entity
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * The ID of the parent plan, if applicable
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parentPlanId(): Optional<String> = parentPlanId.getOptional("parentPlanId")

        /**
         * The pricing type of the package
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pricingType(): Optional<PricingType> = pricingType.getOptional("pricingType")

        /**
         * The status of the package
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("displayName")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [billingId].
         *
         * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billingId") @ExcludeMissing fun _billingId(): JsonField<String> = billingId

        /**
         * Returns the raw JSON value of [defaultTrialConfig].
         *
         * Unlike [defaultTrialConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("defaultTrialConfig")
        @ExcludeMissing
        fun _defaultTrialConfig(): JsonField<DefaultTrialConfig> = defaultTrialConfig

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [parentPlanId].
         *
         * Unlike [parentPlanId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parentPlanId")
        @ExcludeMissing
        fun _parentPlanId(): JsonField<String> = parentPlanId

        /**
         * Returns the raw JSON value of [pricingType].
         *
         * Unlike [pricingType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pricingType")
        @ExcludeMissing
        fun _pricingType(): JsonField<PricingType> = pricingType

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .displayName()
             * .productId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var displayName: JsonField<String>? = null
            private var productId: JsonField<String>? = null
            private var billingId: JsonField<String> = JsonMissing.of()
            private var defaultTrialConfig: JsonField<DefaultTrialConfig> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var parentPlanId: JsonField<String> = JsonMissing.of()
            private var pricingType: JsonField<PricingType> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                displayName = body.displayName
                productId = body.productId
                billingId = body.billingId
                defaultTrialConfig = body.defaultTrialConfig
                description = body.description
                metadata = body.metadata
                parentPlanId = body.parentPlanId
                pricingType = body.pricingType
                status = body.status
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

            /** The display name of the package */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /** The product ID to associate the plan with */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** The unique identifier for the entity in the billing provider */
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

            /** Default trial configuration for the plan */
            fun defaultTrialConfig(defaultTrialConfig: DefaultTrialConfig?) =
                defaultTrialConfig(JsonField.ofNullable(defaultTrialConfig))

            /**
             * Alias for calling [Builder.defaultTrialConfig] with
             * `defaultTrialConfig.orElse(null)`.
             */
            fun defaultTrialConfig(defaultTrialConfig: Optional<DefaultTrialConfig>) =
                defaultTrialConfig(defaultTrialConfig.getOrNull())

            /**
             * Sets [Builder.defaultTrialConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultTrialConfig] with a well-typed
             * [DefaultTrialConfig] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun defaultTrialConfig(defaultTrialConfig: JsonField<DefaultTrialConfig>) = apply {
                this.defaultTrialConfig = defaultTrialConfig
            }

            /** The description of the package */
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

            /** Metadata associated with the entity */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** The ID of the parent plan, if applicable */
            fun parentPlanId(parentPlanId: String?) =
                parentPlanId(JsonField.ofNullable(parentPlanId))

            /** Alias for calling [Builder.parentPlanId] with `parentPlanId.orElse(null)`. */
            fun parentPlanId(parentPlanId: Optional<String>) =
                parentPlanId(parentPlanId.getOrNull())

            /**
             * Sets [Builder.parentPlanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentPlanId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentPlanId(parentPlanId: JsonField<String>) = apply {
                this.parentPlanId = parentPlanId
            }

            /** The pricing type of the package */
            fun pricingType(pricingType: PricingType?) =
                pricingType(JsonField.ofNullable(pricingType))

            /** Alias for calling [Builder.pricingType] with `pricingType.orElse(null)`. */
            fun pricingType(pricingType: Optional<PricingType>) =
                pricingType(pricingType.getOrNull())

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

            /** The status of the package */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * .displayName()
             * .productId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("id", id),
                    checkRequired("displayName", displayName),
                    checkRequired("productId", productId),
                    billingId,
                    defaultTrialConfig,
                    description,
                    metadata,
                    parentPlanId,
                    pricingType,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            id()
            displayName()
            productId()
            billingId()
            defaultTrialConfig().ifPresent { it.validate() }
            description()
            metadata().ifPresent { it.validate() }
            parentPlanId()
            pricingType().ifPresent { it.validate() }
            status().ifPresent { it.validate() }
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
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (if (billingId.asKnown().isPresent) 1 else 0) +
                (defaultTrialConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (parentPlanId.asKnown().isPresent) 1 else 0) +
                (pricingType.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                displayName == other.displayName &&
                productId == other.productId &&
                billingId == other.billingId &&
                defaultTrialConfig == other.defaultTrialConfig &&
                description == other.description &&
                metadata == other.metadata &&
                parentPlanId == other.parentPlanId &&
                pricingType == other.pricingType &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                displayName,
                productId,
                billingId,
                defaultTrialConfig,
                description,
                metadata,
                parentPlanId,
                pricingType,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, displayName=$displayName, productId=$productId, billingId=$billingId, defaultTrialConfig=$defaultTrialConfig, description=$description, metadata=$metadata, parentPlanId=$parentPlanId, pricingType=$pricingType, status=$status, additionalProperties=$additionalProperties}"
    }

    /** Default trial configuration for the plan */
    class DefaultTrialConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val duration: JsonField<Double>,
        private val units: JsonField<Units>,
        private val budget: JsonField<Budget>,
        private val trialEndBehavior: JsonField<TrialEndBehavior>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("units") @ExcludeMissing units: JsonField<Units> = JsonMissing.of(),
            @JsonProperty("budget") @ExcludeMissing budget: JsonField<Budget> = JsonMissing.of(),
            @JsonProperty("trialEndBehavior")
            @ExcludeMissing
            trialEndBehavior: JsonField<TrialEndBehavior> = JsonMissing.of(),
        ) : this(duration, units, budget, trialEndBehavior, mutableMapOf())

        /**
         * The duration of the trial in the specified units
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun duration(): Double = duration.getRequired("duration")

        /**
         * The time unit for the trial duration (DAY or MONTH)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun units(): Units = units.getRequired("units")

        /**
         * Budget configuration for the trial
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budget(): Optional<Budget> = budget.getOptional("budget")

        /**
         * Behavior when the trial ends (CONVERT_TO_PAID or CANCEL_SUBSCRIPTION)
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trialEndBehavior(): Optional<TrialEndBehavior> =
            trialEndBehavior.getOptional("trialEndBehavior")

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

        /**
         * Returns the raw JSON value of [units].
         *
         * Unlike [units], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("units") @ExcludeMissing fun _units(): JsonField<Units> = units

        /**
         * Returns the raw JSON value of [budget].
         *
         * Unlike [budget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("budget") @ExcludeMissing fun _budget(): JsonField<Budget> = budget

        /**
         * Returns the raw JSON value of [trialEndBehavior].
         *
         * Unlike [trialEndBehavior], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trialEndBehavior")
        @ExcludeMissing
        fun _trialEndBehavior(): JsonField<TrialEndBehavior> = trialEndBehavior

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
             * Returns a mutable builder for constructing an instance of [DefaultTrialConfig].
             *
             * The following fields are required:
             * ```java
             * .duration()
             * .units()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DefaultTrialConfig]. */
        class Builder internal constructor() {

            private var duration: JsonField<Double>? = null
            private var units: JsonField<Units>? = null
            private var budget: JsonField<Budget> = JsonMissing.of()
            private var trialEndBehavior: JsonField<TrialEndBehavior> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(defaultTrialConfig: DefaultTrialConfig) = apply {
                duration = defaultTrialConfig.duration
                units = defaultTrialConfig.units
                budget = defaultTrialConfig.budget
                trialEndBehavior = defaultTrialConfig.trialEndBehavior
                additionalProperties = defaultTrialConfig.additionalProperties.toMutableMap()
            }

            /** The duration of the trial in the specified units */
            fun duration(duration: Double) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

            /** The time unit for the trial duration (DAY or MONTH) */
            fun units(units: Units) = units(JsonField.of(units))

            /**
             * Sets [Builder.units] to an arbitrary JSON value.
             *
             * You should usually call [Builder.units] with a well-typed [Units] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun units(units: JsonField<Units>) = apply { this.units = units }

            /** Budget configuration for the trial */
            fun budget(budget: Budget?) = budget(JsonField.ofNullable(budget))

            /** Alias for calling [Builder.budget] with `budget.orElse(null)`. */
            fun budget(budget: Optional<Budget>) = budget(budget.getOrNull())

            /**
             * Sets [Builder.budget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budget] with a well-typed [Budget] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budget(budget: JsonField<Budget>) = apply { this.budget = budget }

            /** Behavior when the trial ends (CONVERT_TO_PAID or CANCEL_SUBSCRIPTION) */
            fun trialEndBehavior(trialEndBehavior: TrialEndBehavior?) =
                trialEndBehavior(JsonField.ofNullable(trialEndBehavior))

            /**
             * Alias for calling [Builder.trialEndBehavior] with `trialEndBehavior.orElse(null)`.
             */
            fun trialEndBehavior(trialEndBehavior: Optional<TrialEndBehavior>) =
                trialEndBehavior(trialEndBehavior.getOrNull())

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
             * Returns an immutable instance of [DefaultTrialConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .duration()
             * .units()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DefaultTrialConfig =
                DefaultTrialConfig(
                    checkRequired("duration", duration),
                    checkRequired("units", units),
                    budget,
                    trialEndBehavior,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DefaultTrialConfig = apply {
            if (validated) {
                return@apply
            }

            duration()
            units().validate()
            budget().ifPresent { it.validate() }
            trialEndBehavior().ifPresent { it.validate() }
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
            (if (duration.asKnown().isPresent) 1 else 0) +
                (units.asKnown().getOrNull()?.validity() ?: 0) +
                (budget.asKnown().getOrNull()?.validity() ?: 0) +
                (trialEndBehavior.asKnown().getOrNull()?.validity() ?: 0)

        /** The time unit for the trial duration (DAY or MONTH) */
        class Units @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DAY = of("DAY")

                @JvmField val MONTH = of("MONTH")

                @JvmStatic fun of(value: String) = Units(JsonField.of(value))
            }

            /** An enum containing [Units]'s known values. */
            enum class Known {
                DAY,
                MONTH,
            }

            /**
             * An enum containing [Units]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Units] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DAY,
                MONTH,
                /**
                 * An enum member indicating that [Units] was instantiated with an unknown value.
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
                    DAY -> Value.DAY
                    MONTH -> Value.MONTH
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
                    DAY -> Known.DAY
                    MONTH -> Known.MONTH
                    else -> throw StiggInvalidDataException("Unknown Units: $value")
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

            fun validate(): Units = apply {
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

                return other is Units && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Budget configuration for the trial */
        class Budget
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val hasSoftLimit: JsonField<Boolean>,
            private val limit: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("hasSoftLimit")
                @ExcludeMissing
                hasSoftLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
            ) : this(hasSoftLimit, limit, mutableMapOf())

            /**
             * Whether the budget limit is a soft limit (allows overage) or hard limit
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun hasSoftLimit(): Boolean = hasSoftLimit.getRequired("hasSoftLimit")

            /**
             * The budget limit amount
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

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
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

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
                 * Returns a mutable builder for constructing an instance of [Budget].
                 *
                 * The following fields are required:
                 * ```java
                 * .hasSoftLimit()
                 * .limit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Budget]. */
            class Builder internal constructor() {

                private var hasSoftLimit: JsonField<Boolean>? = null
                private var limit: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(budget: Budget) = apply {
                    hasSoftLimit = budget.hasSoftLimit
                    limit = budget.limit
                    additionalProperties = budget.additionalProperties.toMutableMap()
                }

                /** Whether the budget limit is a soft limit (allows overage) or hard limit */
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

                /** The budget limit amount */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

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
                 * Returns an immutable instance of [Budget].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .hasSoftLimit()
                 * .limit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Budget =
                    Budget(
                        checkRequired("hasSoftLimit", hasSoftLimit),
                        checkRequired("limit", limit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Budget = apply {
                if (validated) {
                    return@apply
                }

                hasSoftLimit()
                limit()
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
                (if (hasSoftLimit.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Budget &&
                    hasSoftLimit == other.hasSoftLimit &&
                    limit == other.limit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(hasSoftLimit, limit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Budget{hasSoftLimit=$hasSoftLimit, limit=$limit, additionalProperties=$additionalProperties}"
        }

        /** Behavior when the trial ends (CONVERT_TO_PAID or CANCEL_SUBSCRIPTION) */
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

            return other is DefaultTrialConfig &&
                duration == other.duration &&
                units == other.units &&
                budget == other.budget &&
                trialEndBehavior == other.trialEndBehavior &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(duration, units, budget, trialEndBehavior, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DefaultTrialConfig{duration=$duration, units=$units, budget=$budget, trialEndBehavior=$trialEndBehavior, additionalProperties=$additionalProperties}"
    }

    /** Metadata associated with the entity */
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

    /** The pricing type of the package */
    class PricingType @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FREE,
            PAID,
            CUSTOM,
            /**
             * An enum member indicating that [PricingType] was instantiated with an unknown value.
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
                FREE -> Value.FREE
                PAID -> Value.PAID
                CUSTOM -> Value.CUSTOM
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
                FREE -> Known.FREE
                PAID -> Known.PAID
                CUSTOM -> Known.CUSTOM
                else -> throw StiggInvalidDataException("Unknown PricingType: $value")
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

    /** The status of the package */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DRAFT = of("DRAFT")

            @JvmField val PUBLISHED = of("PUBLISHED")

            @JvmField val ARCHIVED = of("ARCHIVED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            PUBLISHED,
            ARCHIVED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            PUBLISHED,
            ARCHIVED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                DRAFT -> Value.DRAFT
                PUBLISHED -> Value.PUBLISHED
                ARCHIVED -> Value.ARCHIVED
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
                DRAFT -> Known.DRAFT
                PUBLISHED -> Known.PUBLISHED
                ARCHIVED -> Known.ARCHIVED
                else -> throw StiggInvalidDataException("Unknown Status: $value")
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

        return other is PlanCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlanCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
