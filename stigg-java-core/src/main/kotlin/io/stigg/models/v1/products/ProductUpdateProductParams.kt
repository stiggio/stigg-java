// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

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

/** Updates an existing product's properties such as display name, description, and metadata. */
class ProductUpdateProductParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Description of the product
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Display name of the product
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = body.displayName()

    /**
     * Additional metadata for the product
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Indicates if multiple subscriptions to this product are allowed
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun multipleSubscriptions(): Optional<Boolean> = body.multipleSubscriptions()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productSettings(): Optional<ProductSettings> = body.productSettings()

    /**
     * Rule defining when usage resets upon subscription update.
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usageResetCutoffRule(): Optional<UsageResetCutoffRule> = body.usageResetCutoffRule()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [multipleSubscriptions].
     *
     * Unlike [multipleSubscriptions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _multipleSubscriptions(): JsonField<Boolean> = body._multipleSubscriptions()

    /**
     * Returns the raw JSON value of [productSettings].
     *
     * Unlike [productSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productSettings(): JsonField<ProductSettings> = body._productSettings()

    /**
     * Returns the raw JSON value of [usageResetCutoffRule].
     *
     * Unlike [usageResetCutoffRule], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _usageResetCutoffRule(): JsonField<UsageResetCutoffRule> = body._usageResetCutoffRule()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ProductUpdateProductParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ProductUpdateProductParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProductUpdateProductParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(productUpdateProductParams: ProductUpdateProductParams) = apply {
            id = productUpdateProductParams.id
            body = productUpdateProductParams.body.toBuilder()
            additionalHeaders = productUpdateProductParams.additionalHeaders.toBuilder()
            additionalQueryParams = productUpdateProductParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [description]
         * - [displayName]
         * - [metadata]
         * - [multipleSubscriptions]
         * - [productSettings]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Description of the product */
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

        /** Display name of the product */
        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        /** Additional metadata for the product */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Indicates if multiple subscriptions to this product are allowed */
        fun multipleSubscriptions(multipleSubscriptions: Boolean) = apply {
            body.multipleSubscriptions(multipleSubscriptions)
        }

        /**
         * Sets [Builder.multipleSubscriptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multipleSubscriptions] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun multipleSubscriptions(multipleSubscriptions: JsonField<Boolean>) = apply {
            body.multipleSubscriptions(multipleSubscriptions)
        }

        fun productSettings(productSettings: ProductSettings) = apply {
            body.productSettings(productSettings)
        }

        /**
         * Sets [Builder.productSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productSettings] with a well-typed [ProductSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun productSettings(productSettings: JsonField<ProductSettings>) = apply {
            body.productSettings(productSettings)
        }

        /** Rule defining when usage resets upon subscription update. */
        fun usageResetCutoffRule(usageResetCutoffRule: UsageResetCutoffRule) = apply {
            body.usageResetCutoffRule(usageResetCutoffRule)
        }

        /**
         * Sets [Builder.usageResetCutoffRule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageResetCutoffRule] with a well-typed
         * [UsageResetCutoffRule] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun usageResetCutoffRule(usageResetCutoffRule: JsonField<UsageResetCutoffRule>) = apply {
            body.usageResetCutoffRule(usageResetCutoffRule)
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
         * Returns an immutable instance of [ProductUpdateProductParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProductUpdateProductParams =
            ProductUpdateProductParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Partially update an existing product. Only provided fields are updated. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val displayName: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val multipleSubscriptions: JsonField<Boolean>,
        private val productSettings: JsonField<ProductSettings>,
        private val usageResetCutoffRule: JsonField<UsageResetCutoffRule>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("multipleSubscriptions")
            @ExcludeMissing
            multipleSubscriptions: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("productSettings")
            @ExcludeMissing
            productSettings: JsonField<ProductSettings> = JsonMissing.of(),
            @JsonProperty("usageResetCutoffRule")
            @ExcludeMissing
            usageResetCutoffRule: JsonField<UsageResetCutoffRule> = JsonMissing.of(),
        ) : this(
            description,
            displayName,
            metadata,
            multipleSubscriptions,
            productSettings,
            usageResetCutoffRule,
            mutableMapOf(),
        )

        /**
         * Description of the product
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Display name of the product
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("displayName")

        /**
         * Additional metadata for the product
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Indicates if multiple subscriptions to this product are allowed
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun multipleSubscriptions(): Optional<Boolean> =
            multipleSubscriptions.getOptional("multipleSubscriptions")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productSettings(): Optional<ProductSettings> =
            productSettings.getOptional("productSettings")

        /**
         * Rule defining when usage resets upon subscription update.
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageResetCutoffRule(): Optional<UsageResetCutoffRule> =
            usageResetCutoffRule.getOptional("usageResetCutoffRule")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("displayName")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [multipleSubscriptions].
         *
         * Unlike [multipleSubscriptions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("multipleSubscriptions")
        @ExcludeMissing
        fun _multipleSubscriptions(): JsonField<Boolean> = multipleSubscriptions

        /**
         * Returns the raw JSON value of [productSettings].
         *
         * Unlike [productSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("productSettings")
        @ExcludeMissing
        fun _productSettings(): JsonField<ProductSettings> = productSettings

        /**
         * Returns the raw JSON value of [usageResetCutoffRule].
         *
         * Unlike [usageResetCutoffRule], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("usageResetCutoffRule")
        @ExcludeMissing
        fun _usageResetCutoffRule(): JsonField<UsageResetCutoffRule> = usageResetCutoffRule

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var description: JsonField<String> = JsonMissing.of()
            private var displayName: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var multipleSubscriptions: JsonField<Boolean> = JsonMissing.of()
            private var productSettings: JsonField<ProductSettings> = JsonMissing.of()
            private var usageResetCutoffRule: JsonField<UsageResetCutoffRule> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                description = body.description
                displayName = body.displayName
                metadata = body.metadata
                multipleSubscriptions = body.multipleSubscriptions
                productSettings = body.productSettings
                usageResetCutoffRule = body.usageResetCutoffRule
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Description of the product */
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

            /** Display name of the product */
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

            /** Additional metadata for the product */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Indicates if multiple subscriptions to this product are allowed */
            fun multipleSubscriptions(multipleSubscriptions: Boolean) =
                multipleSubscriptions(JsonField.of(multipleSubscriptions))

            /**
             * Sets [Builder.multipleSubscriptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.multipleSubscriptions] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun multipleSubscriptions(multipleSubscriptions: JsonField<Boolean>) = apply {
                this.multipleSubscriptions = multipleSubscriptions
            }

            fun productSettings(productSettings: ProductSettings) =
                productSettings(JsonField.of(productSettings))

            /**
             * Sets [Builder.productSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productSettings] with a well-typed [ProductSettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun productSettings(productSettings: JsonField<ProductSettings>) = apply {
                this.productSettings = productSettings
            }

            /** Rule defining when usage resets upon subscription update. */
            fun usageResetCutoffRule(usageResetCutoffRule: UsageResetCutoffRule) =
                usageResetCutoffRule(JsonField.of(usageResetCutoffRule))

            /**
             * Sets [Builder.usageResetCutoffRule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageResetCutoffRule] with a well-typed
             * [UsageResetCutoffRule] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun usageResetCutoffRule(usageResetCutoffRule: JsonField<UsageResetCutoffRule>) =
                apply {
                    this.usageResetCutoffRule = usageResetCutoffRule
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
             */
            fun build(): Body =
                Body(
                    description,
                    displayName,
                    metadata,
                    multipleSubscriptions,
                    productSettings,
                    usageResetCutoffRule,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            description()
            displayName()
            metadata().ifPresent { it.validate() }
            multipleSubscriptions()
            productSettings().ifPresent { it.validate() }
            usageResetCutoffRule().ifPresent { it.validate() }
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
            (if (description.asKnown().isPresent) 1 else 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (multipleSubscriptions.asKnown().isPresent) 1 else 0) +
                (productSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (usageResetCutoffRule.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                description == other.description &&
                displayName == other.displayName &&
                metadata == other.metadata &&
                multipleSubscriptions == other.multipleSubscriptions &&
                productSettings == other.productSettings &&
                usageResetCutoffRule == other.usageResetCutoffRule &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                description,
                displayName,
                metadata,
                multipleSubscriptions,
                productSettings,
                usageResetCutoffRule,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, displayName=$displayName, metadata=$metadata, multipleSubscriptions=$multipleSubscriptions, productSettings=$productSettings, usageResetCutoffRule=$usageResetCutoffRule, additionalProperties=$additionalProperties}"
    }

    /** Additional metadata for the product */
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

    class ProductSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val subscriptionCancellationTime: JsonField<SubscriptionCancellationTime>,
        private val subscriptionEndSetup: JsonField<SubscriptionEndSetup>,
        private val subscriptionStartSetup: JsonField<SubscriptionStartSetup>,
        private val downgradePlanId: JsonField<String>,
        private val prorateAtEndOfBillingPeriod: JsonField<Boolean>,
        private val subscriptionStartPlanId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("subscriptionCancellationTime")
            @ExcludeMissing
            subscriptionCancellationTime: JsonField<SubscriptionCancellationTime> =
                JsonMissing.of(),
            @JsonProperty("subscriptionEndSetup")
            @ExcludeMissing
            subscriptionEndSetup: JsonField<SubscriptionEndSetup> = JsonMissing.of(),
            @JsonProperty("subscriptionStartSetup")
            @ExcludeMissing
            subscriptionStartSetup: JsonField<SubscriptionStartSetup> = JsonMissing.of(),
            @JsonProperty("downgradePlanId")
            @ExcludeMissing
            downgradePlanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prorateAtEndOfBillingPeriod")
            @ExcludeMissing
            prorateAtEndOfBillingPeriod: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subscriptionStartPlanId")
            @ExcludeMissing
            subscriptionStartPlanId: JsonField<String> = JsonMissing.of(),
        ) : this(
            subscriptionCancellationTime,
            subscriptionEndSetup,
            subscriptionStartSetup,
            downgradePlanId,
            prorateAtEndOfBillingPeriod,
            subscriptionStartPlanId,
            mutableMapOf(),
        )

        /**
         * Time when the subscription will be cancelled
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionCancellationTime(): SubscriptionCancellationTime =
            subscriptionCancellationTime.getRequired("subscriptionCancellationTime")

        /**
         * Setup for the end of the subscription
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionEndSetup(): SubscriptionEndSetup =
            subscriptionEndSetup.getRequired("subscriptionEndSetup")

        /**
         * Setup for the start of the subscription
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionStartSetup(): SubscriptionStartSetup =
            subscriptionStartSetup.getRequired("subscriptionStartSetup")

        /**
         * ID of the plan to downgrade to at the end of the billing period
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun downgradePlanId(): Optional<String> = downgradePlanId.getOptional("downgradePlanId")

        /**
         * Indicates if the subscription should be prorated at the end of the billing period
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prorateAtEndOfBillingPeriod(): Optional<Boolean> =
            prorateAtEndOfBillingPeriod.getOptional("prorateAtEndOfBillingPeriod")

        /**
         * ID of the plan to start the subscription with
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscriptionStartPlanId(): Optional<String> =
            subscriptionStartPlanId.getOptional("subscriptionStartPlanId")

        /**
         * Returns the raw JSON value of [subscriptionCancellationTime].
         *
         * Unlike [subscriptionCancellationTime], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscriptionCancellationTime")
        @ExcludeMissing
        fun _subscriptionCancellationTime(): JsonField<SubscriptionCancellationTime> =
            subscriptionCancellationTime

        /**
         * Returns the raw JSON value of [subscriptionEndSetup].
         *
         * Unlike [subscriptionEndSetup], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscriptionEndSetup")
        @ExcludeMissing
        fun _subscriptionEndSetup(): JsonField<SubscriptionEndSetup> = subscriptionEndSetup

        /**
         * Returns the raw JSON value of [subscriptionStartSetup].
         *
         * Unlike [subscriptionStartSetup], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscriptionStartSetup")
        @ExcludeMissing
        fun _subscriptionStartSetup(): JsonField<SubscriptionStartSetup> = subscriptionStartSetup

        /**
         * Returns the raw JSON value of [downgradePlanId].
         *
         * Unlike [downgradePlanId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("downgradePlanId")
        @ExcludeMissing
        fun _downgradePlanId(): JsonField<String> = downgradePlanId

        /**
         * Returns the raw JSON value of [prorateAtEndOfBillingPeriod].
         *
         * Unlike [prorateAtEndOfBillingPeriod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("prorateAtEndOfBillingPeriod")
        @ExcludeMissing
        fun _prorateAtEndOfBillingPeriod(): JsonField<Boolean> = prorateAtEndOfBillingPeriod

        /**
         * Returns the raw JSON value of [subscriptionStartPlanId].
         *
         * Unlike [subscriptionStartPlanId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscriptionStartPlanId")
        @ExcludeMissing
        fun _subscriptionStartPlanId(): JsonField<String> = subscriptionStartPlanId

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
             * Returns a mutable builder for constructing an instance of [ProductSettings].
             *
             * The following fields are required:
             * ```java
             * .subscriptionCancellationTime()
             * .subscriptionEndSetup()
             * .subscriptionStartSetup()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ProductSettings]. */
        class Builder internal constructor() {

            private var subscriptionCancellationTime: JsonField<SubscriptionCancellationTime>? =
                null
            private var subscriptionEndSetup: JsonField<SubscriptionEndSetup>? = null
            private var subscriptionStartSetup: JsonField<SubscriptionStartSetup>? = null
            private var downgradePlanId: JsonField<String> = JsonMissing.of()
            private var prorateAtEndOfBillingPeriod: JsonField<Boolean> = JsonMissing.of()
            private var subscriptionStartPlanId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(productSettings: ProductSettings) = apply {
                subscriptionCancellationTime = productSettings.subscriptionCancellationTime
                subscriptionEndSetup = productSettings.subscriptionEndSetup
                subscriptionStartSetup = productSettings.subscriptionStartSetup
                downgradePlanId = productSettings.downgradePlanId
                prorateAtEndOfBillingPeriod = productSettings.prorateAtEndOfBillingPeriod
                subscriptionStartPlanId = productSettings.subscriptionStartPlanId
                additionalProperties = productSettings.additionalProperties.toMutableMap()
            }

            /** Time when the subscription will be cancelled */
            fun subscriptionCancellationTime(
                subscriptionCancellationTime: SubscriptionCancellationTime
            ) = subscriptionCancellationTime(JsonField.of(subscriptionCancellationTime))

            /**
             * Sets [Builder.subscriptionCancellationTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionCancellationTime] with a well-typed
             * [SubscriptionCancellationTime] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun subscriptionCancellationTime(
                subscriptionCancellationTime: JsonField<SubscriptionCancellationTime>
            ) = apply { this.subscriptionCancellationTime = subscriptionCancellationTime }

            /** Setup for the end of the subscription */
            fun subscriptionEndSetup(subscriptionEndSetup: SubscriptionEndSetup) =
                subscriptionEndSetup(JsonField.of(subscriptionEndSetup))

            /**
             * Sets [Builder.subscriptionEndSetup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionEndSetup] with a well-typed
             * [SubscriptionEndSetup] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun subscriptionEndSetup(subscriptionEndSetup: JsonField<SubscriptionEndSetup>) =
                apply {
                    this.subscriptionEndSetup = subscriptionEndSetup
                }

            /** Setup for the start of the subscription */
            fun subscriptionStartSetup(subscriptionStartSetup: SubscriptionStartSetup) =
                subscriptionStartSetup(JsonField.of(subscriptionStartSetup))

            /**
             * Sets [Builder.subscriptionStartSetup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionStartSetup] with a well-typed
             * [SubscriptionStartSetup] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun subscriptionStartSetup(subscriptionStartSetup: JsonField<SubscriptionStartSetup>) =
                apply {
                    this.subscriptionStartSetup = subscriptionStartSetup
                }

            /** ID of the plan to downgrade to at the end of the billing period */
            fun downgradePlanId(downgradePlanId: String?) =
                downgradePlanId(JsonField.ofNullable(downgradePlanId))

            /** Alias for calling [Builder.downgradePlanId] with `downgradePlanId.orElse(null)`. */
            fun downgradePlanId(downgradePlanId: Optional<String>) =
                downgradePlanId(downgradePlanId.getOrNull())

            /**
             * Sets [Builder.downgradePlanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.downgradePlanId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun downgradePlanId(downgradePlanId: JsonField<String>) = apply {
                this.downgradePlanId = downgradePlanId
            }

            /** Indicates if the subscription should be prorated at the end of the billing period */
            fun prorateAtEndOfBillingPeriod(prorateAtEndOfBillingPeriod: Boolean?) =
                prorateAtEndOfBillingPeriod(JsonField.ofNullable(prorateAtEndOfBillingPeriod))

            /**
             * Alias for [Builder.prorateAtEndOfBillingPeriod].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun prorateAtEndOfBillingPeriod(prorateAtEndOfBillingPeriod: Boolean) =
                prorateAtEndOfBillingPeriod(prorateAtEndOfBillingPeriod as Boolean?)

            /**
             * Alias for calling [Builder.prorateAtEndOfBillingPeriod] with
             * `prorateAtEndOfBillingPeriod.orElse(null)`.
             */
            fun prorateAtEndOfBillingPeriod(prorateAtEndOfBillingPeriod: Optional<Boolean>) =
                prorateAtEndOfBillingPeriod(prorateAtEndOfBillingPeriod.getOrNull())

            /**
             * Sets [Builder.prorateAtEndOfBillingPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prorateAtEndOfBillingPeriod] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun prorateAtEndOfBillingPeriod(prorateAtEndOfBillingPeriod: JsonField<Boolean>) =
                apply {
                    this.prorateAtEndOfBillingPeriod = prorateAtEndOfBillingPeriod
                }

            /** ID of the plan to start the subscription with */
            fun subscriptionStartPlanId(subscriptionStartPlanId: String?) =
                subscriptionStartPlanId(JsonField.ofNullable(subscriptionStartPlanId))

            /**
             * Alias for calling [Builder.subscriptionStartPlanId] with
             * `subscriptionStartPlanId.orElse(null)`.
             */
            fun subscriptionStartPlanId(subscriptionStartPlanId: Optional<String>) =
                subscriptionStartPlanId(subscriptionStartPlanId.getOrNull())

            /**
             * Sets [Builder.subscriptionStartPlanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionStartPlanId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subscriptionStartPlanId(subscriptionStartPlanId: JsonField<String>) = apply {
                this.subscriptionStartPlanId = subscriptionStartPlanId
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
             * Returns an immutable instance of [ProductSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .subscriptionCancellationTime()
             * .subscriptionEndSetup()
             * .subscriptionStartSetup()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ProductSettings =
                ProductSettings(
                    checkRequired("subscriptionCancellationTime", subscriptionCancellationTime),
                    checkRequired("subscriptionEndSetup", subscriptionEndSetup),
                    checkRequired("subscriptionStartSetup", subscriptionStartSetup),
                    downgradePlanId,
                    prorateAtEndOfBillingPeriod,
                    subscriptionStartPlanId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ProductSettings = apply {
            if (validated) {
                return@apply
            }

            subscriptionCancellationTime().validate()
            subscriptionEndSetup().validate()
            subscriptionStartSetup().validate()
            downgradePlanId()
            prorateAtEndOfBillingPeriod()
            subscriptionStartPlanId()
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
            (subscriptionCancellationTime.asKnown().getOrNull()?.validity() ?: 0) +
                (subscriptionEndSetup.asKnown().getOrNull()?.validity() ?: 0) +
                (subscriptionStartSetup.asKnown().getOrNull()?.validity() ?: 0) +
                (if (downgradePlanId.asKnown().isPresent) 1 else 0) +
                (if (prorateAtEndOfBillingPeriod.asKnown().isPresent) 1 else 0) +
                (if (subscriptionStartPlanId.asKnown().isPresent) 1 else 0)

        /** Time when the subscription will be cancelled */
        class SubscriptionCancellationTime
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

                @JvmField val END_OF_BILLING_PERIOD = of("END_OF_BILLING_PERIOD")

                @JvmField val IMMEDIATE = of("IMMEDIATE")

                @JvmField val SPECIFIC_DATE = of("SPECIFIC_DATE")

                @JvmStatic fun of(value: String) = SubscriptionCancellationTime(JsonField.of(value))
            }

            /** An enum containing [SubscriptionCancellationTime]'s known values. */
            enum class Known {
                END_OF_BILLING_PERIOD,
                IMMEDIATE,
                SPECIFIC_DATE,
            }

            /**
             * An enum containing [SubscriptionCancellationTime]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [SubscriptionCancellationTime] can contain an unknown value in a
             * couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                END_OF_BILLING_PERIOD,
                IMMEDIATE,
                SPECIFIC_DATE,
                /**
                 * An enum member indicating that [SubscriptionCancellationTime] was instantiated
                 * with an unknown value.
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
                    END_OF_BILLING_PERIOD -> Value.END_OF_BILLING_PERIOD
                    IMMEDIATE -> Value.IMMEDIATE
                    SPECIFIC_DATE -> Value.SPECIFIC_DATE
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
                    END_OF_BILLING_PERIOD -> Known.END_OF_BILLING_PERIOD
                    IMMEDIATE -> Known.IMMEDIATE
                    SPECIFIC_DATE -> Known.SPECIFIC_DATE
                    else ->
                        throw StiggInvalidDataException(
                            "Unknown SubscriptionCancellationTime: $value"
                        )
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

            fun validate(): SubscriptionCancellationTime = apply {
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

                return other is SubscriptionCancellationTime && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Setup for the end of the subscription */
        class SubscriptionEndSetup
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

                @JvmField val DOWNGRADE_TO_FREE = of("DOWNGRADE_TO_FREE")

                @JvmField val CANCEL_SUBSCRIPTION = of("CANCEL_SUBSCRIPTION")

                @JvmStatic fun of(value: String) = SubscriptionEndSetup(JsonField.of(value))
            }

            /** An enum containing [SubscriptionEndSetup]'s known values. */
            enum class Known {
                DOWNGRADE_TO_FREE,
                CANCEL_SUBSCRIPTION,
            }

            /**
             * An enum containing [SubscriptionEndSetup]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [SubscriptionEndSetup] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DOWNGRADE_TO_FREE,
                CANCEL_SUBSCRIPTION,
                /**
                 * An enum member indicating that [SubscriptionEndSetup] was instantiated with an
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
                    DOWNGRADE_TO_FREE -> Value.DOWNGRADE_TO_FREE
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
                    DOWNGRADE_TO_FREE -> Known.DOWNGRADE_TO_FREE
                    CANCEL_SUBSCRIPTION -> Known.CANCEL_SUBSCRIPTION
                    else -> throw StiggInvalidDataException("Unknown SubscriptionEndSetup: $value")
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

            fun validate(): SubscriptionEndSetup = apply {
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

                return other is SubscriptionEndSetup && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Setup for the start of the subscription */
        class SubscriptionStartSetup
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

                @JvmField val PLAN_SELECTION = of("PLAN_SELECTION")

                @JvmField val TRIAL_PERIOD = of("TRIAL_PERIOD")

                @JvmField val FREE_PLAN = of("FREE_PLAN")

                @JvmStatic fun of(value: String) = SubscriptionStartSetup(JsonField.of(value))
            }

            /** An enum containing [SubscriptionStartSetup]'s known values. */
            enum class Known {
                PLAN_SELECTION,
                TRIAL_PERIOD,
                FREE_PLAN,
            }

            /**
             * An enum containing [SubscriptionStartSetup]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [SubscriptionStartSetup] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PLAN_SELECTION,
                TRIAL_PERIOD,
                FREE_PLAN,
                /**
                 * An enum member indicating that [SubscriptionStartSetup] was instantiated with an
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
                    PLAN_SELECTION -> Value.PLAN_SELECTION
                    TRIAL_PERIOD -> Value.TRIAL_PERIOD
                    FREE_PLAN -> Value.FREE_PLAN
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
                    PLAN_SELECTION -> Known.PLAN_SELECTION
                    TRIAL_PERIOD -> Known.TRIAL_PERIOD
                    FREE_PLAN -> Known.FREE_PLAN
                    else ->
                        throw StiggInvalidDataException("Unknown SubscriptionStartSetup: $value")
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

            fun validate(): SubscriptionStartSetup = apply {
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

                return other is SubscriptionStartSetup && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProductSettings &&
                subscriptionCancellationTime == other.subscriptionCancellationTime &&
                subscriptionEndSetup == other.subscriptionEndSetup &&
                subscriptionStartSetup == other.subscriptionStartSetup &&
                downgradePlanId == other.downgradePlanId &&
                prorateAtEndOfBillingPeriod == other.prorateAtEndOfBillingPeriod &&
                subscriptionStartPlanId == other.subscriptionStartPlanId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                subscriptionCancellationTime,
                subscriptionEndSetup,
                subscriptionStartSetup,
                downgradePlanId,
                prorateAtEndOfBillingPeriod,
                subscriptionStartPlanId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProductSettings{subscriptionCancellationTime=$subscriptionCancellationTime, subscriptionEndSetup=$subscriptionEndSetup, subscriptionStartSetup=$subscriptionStartSetup, downgradePlanId=$downgradePlanId, prorateAtEndOfBillingPeriod=$prorateAtEndOfBillingPeriod, subscriptionStartPlanId=$subscriptionStartPlanId, additionalProperties=$additionalProperties}"
    }

    /** Rule defining when usage resets upon subscription update. */
    class UsageResetCutoffRule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val behavior: JsonField<Behavior>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("behavior")
            @ExcludeMissing
            behavior: JsonField<Behavior> = JsonMissing.of()
        ) : this(behavior, mutableMapOf())

        /**
         * Behavior of the usage reset cutoff rule
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun behavior(): Behavior = behavior.getRequired("behavior")

        /**
         * Returns the raw JSON value of [behavior].
         *
         * Unlike [behavior], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("behavior") @ExcludeMissing fun _behavior(): JsonField<Behavior> = behavior

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
             * Returns a mutable builder for constructing an instance of [UsageResetCutoffRule].
             *
             * The following fields are required:
             * ```java
             * .behavior()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UsageResetCutoffRule]. */
        class Builder internal constructor() {

            private var behavior: JsonField<Behavior>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usageResetCutoffRule: UsageResetCutoffRule) = apply {
                behavior = usageResetCutoffRule.behavior
                additionalProperties = usageResetCutoffRule.additionalProperties.toMutableMap()
            }

            /** Behavior of the usage reset cutoff rule */
            fun behavior(behavior: Behavior) = behavior(JsonField.of(behavior))

            /**
             * Sets [Builder.behavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.behavior] with a well-typed [Behavior] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun behavior(behavior: JsonField<Behavior>) = apply { this.behavior = behavior }

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
             * Returns an immutable instance of [UsageResetCutoffRule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .behavior()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UsageResetCutoffRule =
                UsageResetCutoffRule(
                    checkRequired("behavior", behavior),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UsageResetCutoffRule = apply {
            if (validated) {
                return@apply
            }

            behavior().validate()
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
        internal fun validity(): Int = (behavior.asKnown().getOrNull()?.validity() ?: 0)

        /** Behavior of the usage reset cutoff rule */
        class Behavior @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val NEVER_RESET = of("NEVER_RESET")

                @JvmField val ALWAYS_RESET = of("ALWAYS_RESET")

                @JvmField val BILLING_PERIOD_CHANGE = of("BILLING_PERIOD_CHANGE")

                @JvmStatic fun of(value: String) = Behavior(JsonField.of(value))
            }

            /** An enum containing [Behavior]'s known values. */
            enum class Known {
                NEVER_RESET,
                ALWAYS_RESET,
                BILLING_PERIOD_CHANGE,
            }

            /**
             * An enum containing [Behavior]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Behavior] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NEVER_RESET,
                ALWAYS_RESET,
                BILLING_PERIOD_CHANGE,
                /**
                 * An enum member indicating that [Behavior] was instantiated with an unknown value.
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
                    NEVER_RESET -> Value.NEVER_RESET
                    ALWAYS_RESET -> Value.ALWAYS_RESET
                    BILLING_PERIOD_CHANGE -> Value.BILLING_PERIOD_CHANGE
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
                    NEVER_RESET -> Known.NEVER_RESET
                    ALWAYS_RESET -> Known.ALWAYS_RESET
                    BILLING_PERIOD_CHANGE -> Known.BILLING_PERIOD_CHANGE
                    else -> throw StiggInvalidDataException("Unknown Behavior: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UsageResetCutoffRule &&
                behavior == other.behavior &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(behavior, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageResetCutoffRule{behavior=$behavior, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductUpdateProductParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ProductUpdateProductParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
