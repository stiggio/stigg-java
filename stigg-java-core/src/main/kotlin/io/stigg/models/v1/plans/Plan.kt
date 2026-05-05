// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

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

/** Response object */
class Plan
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
     * Plan configuration object
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
         * Returns a mutable builder for constructing an instance of [Plan].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Plan]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(plan: Plan) = apply {
            data = plan.data
            additionalProperties = plan.additionalProperties.toMutableMap()
        }

        /** Plan configuration object */
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
         * Returns an immutable instance of [Plan].
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
        fun build(): Plan = Plan(checkRequired("data", data), additionalProperties.toMutableMap())
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
    fun validate(): Plan = apply {
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

    /** Plan configuration object */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val billingId: JsonField<String>,
        private val compatibleAddonIds: JsonField<List<String>>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val defaultTrialConfig: JsonField<DefaultTrialConfig>,
        private val description: JsonField<String>,
        private val displayName: JsonField<String>,
        private val entitlements: JsonField<List<Entitlement>>,
        private val isLatest: JsonField<Boolean>,
        private val metadata: JsonField<Metadata>,
        private val parentPlanId: JsonField<String>,
        private val pricingType: JsonField<PricingType>,
        private val productId: JsonField<String>,
        private val status: JsonField<Status>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val versionNumber: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billingId")
            @ExcludeMissing
            billingId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("compatibleAddonIds")
            @ExcludeMissing
            compatibleAddonIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("defaultTrialConfig")
            @ExcludeMissing
            defaultTrialConfig: JsonField<DefaultTrialConfig> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entitlements")
            @ExcludeMissing
            entitlements: JsonField<List<Entitlement>> = JsonMissing.of(),
            @JsonProperty("isLatest")
            @ExcludeMissing
            isLatest: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("parentPlanId")
            @ExcludeMissing
            parentPlanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pricingType")
            @ExcludeMissing
            pricingType: JsonField<PricingType> = JsonMissing.of(),
            @JsonProperty("productId")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("versionNumber")
            @ExcludeMissing
            versionNumber: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            billingId,
            compatibleAddonIds,
            createdAt,
            defaultTrialConfig,
            description,
            displayName,
            entitlements,
            isLatest,
            metadata,
            parentPlanId,
            pricingType,
            productId,
            status,
            updatedAt,
            versionNumber,
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
         * The unique identifier for the entity in the billing provider
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingId(): Optional<String> = billingId.getOptional("billingId")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun compatibleAddonIds(): Optional<List<String>> =
            compatibleAddonIds.getOptional("compatibleAddonIds")

        /**
         * Timestamp of when the record was created
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

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
         * The display name of the package
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun displayName(): String = displayName.getRequired("displayName")

        /**
         * List of entitlements of the package
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entitlements(): List<Entitlement> = entitlements.getRequired("entitlements")

        /**
         * Indicates if the package is the latest version
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isLatest(): Optional<Boolean> = isLatest.getOptional("isLatest")

        /**
         * Metadata associated with the entity
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

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
         * The product id of the package
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("productId")

        /**
         * The status of the package
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Timestamp of when the record was last updated
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

        /**
         * The version number of the package
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun versionNumber(): Long = versionNumber.getRequired("versionNumber")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [billingId].
         *
         * Unlike [billingId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billingId") @ExcludeMissing fun _billingId(): JsonField<String> = billingId

        /**
         * Returns the raw JSON value of [compatibleAddonIds].
         *
         * Unlike [compatibleAddonIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("compatibleAddonIds")
        @ExcludeMissing
        fun _compatibleAddonIds(): JsonField<List<String>> = compatibleAddonIds

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("displayName")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

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
         * Returns the raw JSON value of [isLatest].
         *
         * Unlike [isLatest], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isLatest") @ExcludeMissing fun _isLatest(): JsonField<Boolean> = isLatest

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
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [versionNumber].
         *
         * Unlike [versionNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("versionNumber")
        @ExcludeMissing
        fun _versionNumber(): JsonField<Long> = versionNumber

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
             * .billingId()
             * .compatibleAddonIds()
             * .createdAt()
             * .defaultTrialConfig()
             * .description()
             * .displayName()
             * .entitlements()
             * .isLatest()
             * .metadata()
             * .parentPlanId()
             * .pricingType()
             * .productId()
             * .status()
             * .updatedAt()
             * .versionNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var billingId: JsonField<String>? = null
            private var compatibleAddonIds: JsonField<MutableList<String>>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var defaultTrialConfig: JsonField<DefaultTrialConfig>? = null
            private var description: JsonField<String>? = null
            private var displayName: JsonField<String>? = null
            private var entitlements: JsonField<MutableList<Entitlement>>? = null
            private var isLatest: JsonField<Boolean>? = null
            private var metadata: JsonField<Metadata>? = null
            private var parentPlanId: JsonField<String>? = null
            private var pricingType: JsonField<PricingType>? = null
            private var productId: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var versionNumber: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                billingId = data.billingId
                compatibleAddonIds = data.compatibleAddonIds.map { it.toMutableList() }
                createdAt = data.createdAt
                defaultTrialConfig = data.defaultTrialConfig
                description = data.description
                displayName = data.displayName
                entitlements = data.entitlements.map { it.toMutableList() }
                isLatest = data.isLatest
                metadata = data.metadata
                parentPlanId = data.parentPlanId
                pricingType = data.pricingType
                productId = data.productId
                status = data.status
                updatedAt = data.updatedAt
                versionNumber = data.versionNumber
                additionalProperties = data.additionalProperties.toMutableMap()
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

            fun compatibleAddonIds(compatibleAddonIds: List<String>?) =
                compatibleAddonIds(JsonField.ofNullable(compatibleAddonIds))

            /**
             * Alias for calling [Builder.compatibleAddonIds] with
             * `compatibleAddonIds.orElse(null)`.
             */
            fun compatibleAddonIds(compatibleAddonIds: Optional<List<String>>) =
                compatibleAddonIds(compatibleAddonIds.getOrNull())

            /**
             * Sets [Builder.compatibleAddonIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.compatibleAddonIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun compatibleAddonIds(compatibleAddonIds: JsonField<List<String>>) = apply {
                this.compatibleAddonIds = compatibleAddonIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [compatibleAddonIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCompatibleAddonId(compatibleAddonId: String) = apply {
                compatibleAddonIds =
                    (compatibleAddonIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("compatibleAddonIds", it).add(compatibleAddonId)
                    }
            }

            /** Timestamp of when the record was created */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

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

            /** List of entitlements of the package */
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

            /** Indicates if the package is the latest version */
            fun isLatest(isLatest: Boolean?) = isLatest(JsonField.ofNullable(isLatest))

            /**
             * Alias for [Builder.isLatest].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isLatest(isLatest: Boolean) = isLatest(isLatest as Boolean?)

            /** Alias for calling [Builder.isLatest] with `isLatest.orElse(null)`. */
            fun isLatest(isLatest: Optional<Boolean>) = isLatest(isLatest.getOrNull())

            /**
             * Sets [Builder.isLatest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isLatest] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isLatest(isLatest: JsonField<Boolean>) = apply { this.isLatest = isLatest }

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

            /** The product id of the package */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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

            /** Timestamp of when the record was last updated */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** The version number of the package */
            fun versionNumber(versionNumber: Long) = versionNumber(JsonField.of(versionNumber))

            /**
             * Sets [Builder.versionNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.versionNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun versionNumber(versionNumber: JsonField<Long>) = apply {
                this.versionNumber = versionNumber
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
             * .billingId()
             * .compatibleAddonIds()
             * .createdAt()
             * .defaultTrialConfig()
             * .description()
             * .displayName()
             * .entitlements()
             * .isLatest()
             * .metadata()
             * .parentPlanId()
             * .pricingType()
             * .productId()
             * .status()
             * .updatedAt()
             * .versionNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("billingId", billingId),
                    checkRequired("compatibleAddonIds", compatibleAddonIds).map {
                        it.toImmutable()
                    },
                    checkRequired("createdAt", createdAt),
                    checkRequired("defaultTrialConfig", defaultTrialConfig),
                    checkRequired("description", description),
                    checkRequired("displayName", displayName),
                    checkRequired("entitlements", entitlements).map { it.toImmutable() },
                    checkRequired("isLatest", isLatest),
                    checkRequired("metadata", metadata),
                    checkRequired("parentPlanId", parentPlanId),
                    checkRequired("pricingType", pricingType),
                    checkRequired("productId", productId),
                    checkRequired("status", status),
                    checkRequired("updatedAt", updatedAt),
                    checkRequired("versionNumber", versionNumber),
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

            id()
            billingId()
            compatibleAddonIds()
            createdAt()
            defaultTrialConfig().ifPresent { it.validate() }
            description()
            displayName()
            entitlements().forEach { it.validate() }
            isLatest()
            metadata().validate()
            parentPlanId()
            pricingType().ifPresent { it.validate() }
            productId()
            status().validate()
            updatedAt()
            versionNumber()
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
                (compatibleAddonIds.asKnown().getOrNull()?.size ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (defaultTrialConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (entitlements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (isLatest.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (parentPlanId.asKnown().isPresent) 1 else 0) +
                (pricingType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (versionNumber.asKnown().isPresent) 1 else 0)

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
                @JsonProperty("budget")
                @ExcludeMissing
                budget: JsonField<Budget> = JsonMissing.of(),
                @JsonProperty("trialEndBehavior")
                @ExcludeMissing
                trialEndBehavior: JsonField<TrialEndBehavior> = JsonMissing.of(),
            ) : this(duration, units, budget, trialEndBehavior, mutableMapOf())

            /**
             * The duration of the trial in the specified units
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun duration(): Double = duration.getRequired("duration")

            /**
             * The time unit for the trial duration (DAY or MONTH)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun units(): Units = units.getRequired("units")

            /**
             * Budget configuration for the trial
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budget(): Optional<Budget> = budget.getOptional("budget")

            /**
             * Behavior when the trial ends (CONVERT_TO_PAID or CANCEL_SUBSCRIPTION)
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun trialEndBehavior(): Optional<TrialEndBehavior> =
                trialEndBehavior.getOptional("trialEndBehavior")

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [trialEndBehavior], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * You should usually call [Builder.duration] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

                /** The time unit for the trial duration (DAY or MONTH) */
                fun units(units: Units) = units(JsonField.of(units))

                /**
                 * Sets [Builder.units] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.units] with a well-typed [Units] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun units(units: JsonField<Units>) = apply { this.units = units }

                /** Budget configuration for the trial */
                fun budget(budget: Budget?) = budget(JsonField.ofNullable(budget))

                /** Alias for calling [Builder.budget] with `budget.orElse(null)`. */
                fun budget(budget: Optional<Budget>) = budget(budget.getOrNull())

                /**
                 * Sets [Builder.budget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.budget] with a well-typed [Budget] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun budget(budget: JsonField<Budget>) = apply { this.budget = budget }

                /** Behavior when the trial ends (CONVERT_TO_PAID or CANCEL_SUBSCRIPTION) */
                fun trialEndBehavior(trialEndBehavior: TrialEndBehavior?) =
                    trialEndBehavior(JsonField.ofNullable(trialEndBehavior))

                /**
                 * Alias for calling [Builder.trialEndBehavior] with
                 * `trialEndBehavior.orElse(null)`.
                 */
                fun trialEndBehavior(trialEndBehavior: Optional<TrialEndBehavior>) =
                    trialEndBehavior(trialEndBehavior.getOrNull())

                /**
                 * Sets [Builder.trialEndBehavior] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trialEndBehavior] with a well-typed
                 * [TrialEndBehavior] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
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
            class Units @JsonCreator private constructor(private val value: JsonField<String>) :
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DAY,
                    MONTH,
                    /**
                     * An enum member indicating that [Units] was instantiated with an unknown
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
                    @JsonProperty("limit")
                    @ExcludeMissing
                    limit: JsonField<Double> = JsonMissing.of(),
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
                 * Unlike [hasSoftLimit], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("hasSoftLimit")
                @ExcludeMissing
                fun _hasSoftLimit(): JsonField<Boolean> = hasSoftLimit

                /**
                 * Returns the raw JSON value of [limit].
                 *
                 * Unlike [limit], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                    fun hasSoftLimit(hasSoftLimit: Boolean) =
                        hasSoftLimit(JsonField.of(hasSoftLimit))

                    /**
                     * Sets [Builder.hasSoftLimit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.hasSoftLimit] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun hasSoftLimit(hasSoftLimit: JsonField<Boolean>) = apply {
                        this.hasSoftLimit = hasSoftLimit
                    }

                    /** The budget limit amount */
                    fun limit(limit: Double) = limit(JsonField.of(limit))

                    /**
                     * Sets [Builder.limit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.limit] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An instance of [TrialEndBehavior] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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

        /** Entitlement reference with type and identifier */
        class Entitlement
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(id, type, mutableMapOf())

            /**
             * The unique identifier for the entity
             *
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [Entitlement].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entitlement]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entitlement: Entitlement) = apply {
                    id = entitlement.id
                    type = entitlement.type
                    additionalProperties = entitlement.additionalProperties.toMutableMap()
                }

                /** The unique identifier for the entity */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Entitlement =
                    Entitlement(
                        checkRequired("id", id),
                        checkRequired("type", type),
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
            fun validate(): Entitlement = apply {
                if (validated) {
                    return@apply
                }

                id()
                type().validate()
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
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val FEATURE = of("FEATURE")

                    @JvmField val CREDIT = of("CREDIT")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    FEATURE,
                    CREDIT,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FEATURE,
                    CREDIT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        FEATURE -> Value.FEATURE
                        CREDIT -> Value.CREDIT
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
                        FEATURE -> Known.FEATURE
                        CREDIT -> Known.CREDIT
                        else -> throw StiggInvalidDataException("Unknown Type: $value")
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
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entitlement &&
                    id == other.id &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entitlement{id=$id, type=$type, additionalProperties=$additionalProperties}"
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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DRAFT,
                PUBLISHED,
                ARCHIVED,
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
                    DRAFT -> Value.DRAFT
                    PUBLISHED -> Value.PUBLISHED
                    ARCHIVED -> Value.ARCHIVED
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
                    DRAFT -> Known.DRAFT
                    PUBLISHED -> Known.PUBLISHED
                    ARCHIVED -> Known.ARCHIVED
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

            return other is Data &&
                id == other.id &&
                billingId == other.billingId &&
                compatibleAddonIds == other.compatibleAddonIds &&
                createdAt == other.createdAt &&
                defaultTrialConfig == other.defaultTrialConfig &&
                description == other.description &&
                displayName == other.displayName &&
                entitlements == other.entitlements &&
                isLatest == other.isLatest &&
                metadata == other.metadata &&
                parentPlanId == other.parentPlanId &&
                pricingType == other.pricingType &&
                productId == other.productId &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                versionNumber == other.versionNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                billingId,
                compatibleAddonIds,
                createdAt,
                defaultTrialConfig,
                description,
                displayName,
                entitlements,
                isLatest,
                metadata,
                parentPlanId,
                pricingType,
                productId,
                status,
                updatedAt,
                versionNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, billingId=$billingId, compatibleAddonIds=$compatibleAddonIds, createdAt=$createdAt, defaultTrialConfig=$defaultTrialConfig, description=$description, displayName=$displayName, entitlements=$entitlements, isLatest=$isLatest, metadata=$metadata, parentPlanId=$parentPlanId, pricingType=$pricingType, productId=$productId, status=$status, updatedAt=$updatedAt, versionNumber=$versionNumber, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Plan &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "Plan{data=$data, additionalProperties=$additionalProperties}"
}
