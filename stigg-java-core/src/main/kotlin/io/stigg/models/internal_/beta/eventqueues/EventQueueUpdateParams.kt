// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.internal_.beta.eventqueues

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
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update event queue configuration */
class EventQueueUpdateParams
private constructor(
    private val queueName: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun queueName(): Optional<String> = Optional.ofNullable(queueName)

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedAssumeRoleArns(): Optional<List<String>> = body.allowedAssumeRoleArns()

    /**
     * Whether to create separate low-priority queues for standard topic events
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createLowPriorityQueues(): Optional<Boolean> = body.createLowPriorityQueues()

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventTypes(): Optional<List<EventType>> = body.eventTypes()

    /**
     * Returns the raw JSON value of [allowedAssumeRoleArns].
     *
     * Unlike [allowedAssumeRoleArns], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allowedAssumeRoleArns(): JsonField<List<String>> = body._allowedAssumeRoleArns()

    /**
     * Returns the raw JSON value of [createLowPriorityQueues].
     *
     * Unlike [createLowPriorityQueues], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _createLowPriorityQueues(): JsonField<Boolean> = body._createLowPriorityQueues()

    /**
     * Returns the raw JSON value of [eventTypes].
     *
     * Unlike [eventTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _eventTypes(): JsonField<List<EventType>> = body._eventTypes()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EventQueueUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EventQueueUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventQueueUpdateParams]. */
    class Builder internal constructor() {

        private var queueName: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventQueueUpdateParams: EventQueueUpdateParams) = apply {
            queueName = eventQueueUpdateParams.queueName
            body = eventQueueUpdateParams.body.toBuilder()
            additionalHeaders = eventQueueUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventQueueUpdateParams.additionalQueryParams.toBuilder()
        }

        fun queueName(queueName: String?) = apply { this.queueName = queueName }

        /** Alias for calling [Builder.queueName] with `queueName.orElse(null)`. */
        fun queueName(queueName: Optional<String>) = queueName(queueName.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [allowedAssumeRoleArns]
         * - [createLowPriorityQueues]
         * - [eventTypes]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun allowedAssumeRoleArns(allowedAssumeRoleArns: List<String>) = apply {
            body.allowedAssumeRoleArns(allowedAssumeRoleArns)
        }

        /**
         * Sets [Builder.allowedAssumeRoleArns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedAssumeRoleArns] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowedAssumeRoleArns(allowedAssumeRoleArns: JsonField<List<String>>) = apply {
            body.allowedAssumeRoleArns(allowedAssumeRoleArns)
        }

        /**
         * Adds a single [String] to [allowedAssumeRoleArns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedAssumeRoleArn(allowedAssumeRoleArn: String) = apply {
            body.addAllowedAssumeRoleArn(allowedAssumeRoleArn)
        }

        /** Whether to create separate low-priority queues for standard topic events */
        fun createLowPriorityQueues(createLowPriorityQueues: Boolean) = apply {
            body.createLowPriorityQueues(createLowPriorityQueues)
        }

        /**
         * Sets [Builder.createLowPriorityQueues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createLowPriorityQueues] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun createLowPriorityQueues(createLowPriorityQueues: JsonField<Boolean>) = apply {
            body.createLowPriorityQueues(createLowPriorityQueues)
        }

        fun eventTypes(eventTypes: List<EventType>) = apply { body.eventTypes(eventTypes) }

        /**
         * Sets [Builder.eventTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTypes] with a well-typed `List<EventType>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventTypes(eventTypes: JsonField<List<EventType>>) = apply {
            body.eventTypes(eventTypes)
        }

        /**
         * Adds a single [EventType] to [eventTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEventType(eventType: EventType) = apply { body.addEventType(eventType) }

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
         * Returns an immutable instance of [EventQueueUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventQueueUpdateParams =
            EventQueueUpdateParams(
                queueName,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> queueName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request to update an existing event queue configuration */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowedAssumeRoleArns: JsonField<List<String>>,
        private val createLowPriorityQueues: JsonField<Boolean>,
        private val eventTypes: JsonField<List<EventType>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allowedAssumeRoleArns")
            @ExcludeMissing
            allowedAssumeRoleArns: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("createLowPriorityQueues")
            @ExcludeMissing
            createLowPriorityQueues: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("eventTypes")
            @ExcludeMissing
            eventTypes: JsonField<List<EventType>> = JsonMissing.of(),
        ) : this(allowedAssumeRoleArns, createLowPriorityQueues, eventTypes, mutableMapOf())

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedAssumeRoleArns(): Optional<List<String>> =
            allowedAssumeRoleArns.getOptional("allowedAssumeRoleArns")

        /**
         * Whether to create separate low-priority queues for standard topic events
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createLowPriorityQueues(): Optional<Boolean> =
            createLowPriorityQueues.getOptional("createLowPriorityQueues")

        /**
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventTypes(): Optional<List<EventType>> = eventTypes.getOptional("eventTypes")

        /**
         * Returns the raw JSON value of [allowedAssumeRoleArns].
         *
         * Unlike [allowedAssumeRoleArns], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowedAssumeRoleArns")
        @ExcludeMissing
        fun _allowedAssumeRoleArns(): JsonField<List<String>> = allowedAssumeRoleArns

        /**
         * Returns the raw JSON value of [createLowPriorityQueues].
         *
         * Unlike [createLowPriorityQueues], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("createLowPriorityQueues")
        @ExcludeMissing
        fun _createLowPriorityQueues(): JsonField<Boolean> = createLowPriorityQueues

        /**
         * Returns the raw JSON value of [eventTypes].
         *
         * Unlike [eventTypes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eventTypes")
        @ExcludeMissing
        fun _eventTypes(): JsonField<List<EventType>> = eventTypes

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

            private var allowedAssumeRoleArns: JsonField<MutableList<String>>? = null
            private var createLowPriorityQueues: JsonField<Boolean> = JsonMissing.of()
            private var eventTypes: JsonField<MutableList<EventType>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                allowedAssumeRoleArns = body.allowedAssumeRoleArns.map { it.toMutableList() }
                createLowPriorityQueues = body.createLowPriorityQueues
                eventTypes = body.eventTypes.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun allowedAssumeRoleArns(allowedAssumeRoleArns: List<String>) =
                allowedAssumeRoleArns(JsonField.of(allowedAssumeRoleArns))

            /**
             * Sets [Builder.allowedAssumeRoleArns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedAssumeRoleArns] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowedAssumeRoleArns(allowedAssumeRoleArns: JsonField<List<String>>) = apply {
                this.allowedAssumeRoleArns = allowedAssumeRoleArns.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [allowedAssumeRoleArns].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedAssumeRoleArn(allowedAssumeRoleArn: String) = apply {
                allowedAssumeRoleArns =
                    (allowedAssumeRoleArns ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedAssumeRoleArns", it).add(allowedAssumeRoleArn)
                    }
            }

            /** Whether to create separate low-priority queues for standard topic events */
            fun createLowPriorityQueues(createLowPriorityQueues: Boolean) =
                createLowPriorityQueues(JsonField.of(createLowPriorityQueues))

            /**
             * Sets [Builder.createLowPriorityQueues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createLowPriorityQueues] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun createLowPriorityQueues(createLowPriorityQueues: JsonField<Boolean>) = apply {
                this.createLowPriorityQueues = createLowPriorityQueues
            }

            fun eventTypes(eventTypes: List<EventType>) = eventTypes(JsonField.of(eventTypes))

            /**
             * Sets [Builder.eventTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventTypes] with a well-typed `List<EventType>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun eventTypes(eventTypes: JsonField<List<EventType>>) = apply {
                this.eventTypes = eventTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [EventType] to [eventTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEventType(eventType: EventType) = apply {
                eventTypes =
                    (eventTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("eventTypes", it).add(eventType)
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
             */
            fun build(): Body =
                Body(
                    (allowedAssumeRoleArns ?: JsonMissing.of()).map { it.toImmutable() },
                    createLowPriorityQueues,
                    (eventTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            allowedAssumeRoleArns()
            createLowPriorityQueues()
            eventTypes().ifPresent { it.forEach { it.validate() } }
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
            (allowedAssumeRoleArns.asKnown().getOrNull()?.size ?: 0) +
                (if (createLowPriorityQueues.asKnown().isPresent) 1 else 0) +
                (eventTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                allowedAssumeRoleArns == other.allowedAssumeRoleArns &&
                createLowPriorityQueues == other.createLowPriorityQueues &&
                eventTypes == other.eventTypes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowedAssumeRoleArns,
                createLowPriorityQueues,
                eventTypes,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{allowedAssumeRoleArns=$allowedAssumeRoleArns, createLowPriorityQueues=$createLowPriorityQueues, eventTypes=$eventTypes, additionalProperties=$additionalProperties}"
    }

    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MEMBER_INVITED = of("MEMBER_INVITED")

            @JvmField val SYNC_SUBSCRIPTION = of("SYNC_SUBSCRIPTION")

            @JvmField val SYNC_CREDIT_GRANT = of("SYNC_CREDIT_GRANT")

            @JvmField val CUSTOMER_CREATED = of("CUSTOMER_CREATED")

            @JvmField val CUSTOMER_UPDATED = of("CUSTOMER_UPDATED")

            @JvmField val CUSTOMER_DELETED = of("CUSTOMER_DELETED")

            @JvmField val SYNC_CUSTOMER = of("SYNC_CUSTOMER")

            @JvmField val SUBSCRIPTION_CREATED = of("SUBSCRIPTION_CREATED")

            @JvmField val SUBSCRIPTION_CANCELED = of("SUBSCRIPTION_CANCELED")

            @JvmField val SUBSCRIPTION_EXPIRED = of("SUBSCRIPTION_EXPIRED")

            @JvmField val SUBSCRIPTION_UPDATED = of("SUBSCRIPTION_UPDATED")

            @JvmField val SUBSCRIPTION_TRIAL_STARTED = of("SUBSCRIPTION_TRIAL_STARTED")

            @JvmField val SUBSCRIPTION_TRIAL_EXPIRED = of("SUBSCRIPTION_TRIAL_EXPIRED")

            @JvmField val SUBSCRIPTION_TRIAL_CONVERTED = of("SUBSCRIPTION_TRIAL_CONVERTED")

            @JvmField val SUBSCRIPTION_TRIAL_ENDS_SOON = of("SUBSCRIPTION_TRIAL_ENDS_SOON")

            @JvmField val SYNC_SUBSCRIPTION_USAGE = of("SYNC_SUBSCRIPTION_USAGE")

            @JvmField val SUBSCRIPTION_USAGE_UPDATED = of("SUBSCRIPTION_USAGE_UPDATED")

            @JvmField
            val SUBSCRIPTION_SPENT_LIMIT_EXCEEDED = of("SUBSCRIPTION_SPENT_LIMIT_EXCEEDED")

            @JvmField val CREATE_SUBSCRIPTION_FAILED = of("CREATE_SUBSCRIPTION_FAILED")

            @JvmField val PLAN_CREATED = of("PLAN_CREATED")

            @JvmField val PLAN_UPDATED = of("PLAN_UPDATED")

            @JvmField val PLAN_DELETED = of("PLAN_DELETED")

            @JvmField val ADDON_CREATED = of("ADDON_CREATED")

            @JvmField val ADDON_UPDATED = of("ADDON_UPDATED")

            @JvmField val ADDON_DELETED = of("ADDON_DELETED")

            @JvmField val SYNC_PACKAGE = of("SYNC_PACKAGE")

            @JvmField val FEATURE_CREATED = of("FEATURE_CREATED")

            @JvmField val FEATURE_UPDATED = of("FEATURE_UPDATED")

            @JvmField val FEATURE_DELETED = of("FEATURE_DELETED")

            @JvmField val FEATURE_ARCHIVED = of("FEATURE_ARCHIVED")

            @JvmField val API_KEY_CREATED = of("API_KEY_CREATED")

            @JvmField val API_KEY_UPDATED = of("API_KEY_UPDATED")

            @JvmField val API_KEY_ROTATED = of("API_KEY_ROTATED")

            @JvmField val API_KEY_REVOKED = of("API_KEY_REVOKED")

            @JvmField val ENTITLEMENT_REQUESTED = of("ENTITLEMENT_REQUESTED")

            @JvmField val ENTITLEMENT_GRANTED = of("ENTITLEMENT_GRANTED")

            @JvmField val ENTITLEMENT_DENIED = of("ENTITLEMENT_DENIED")

            @JvmField val MEASUREMENT_REPORTED = of("MEASUREMENT_REPORTED")

            @JvmField val USAGE_THRESHOLD_EXCEEDED = of("USAGE_THRESHOLD_EXCEEDED")

            @JvmField val PROMOTIONAL_ENTITLEMENT_GRANTED = of("PROMOTIONAL_ENTITLEMENT_GRANTED")

            @JvmField val PROMOTIONAL_ENTITLEMENT_REVOKED = of("PROMOTIONAL_ENTITLEMENT_REVOKED")

            @JvmField val PROMOTIONAL_ENTITLEMENT_UPDATED = of("PROMOTIONAL_ENTITLEMENT_UPDATED")

            @JvmField val PROMOTIONAL_ENTITLEMENT_EXPIRED = of("PROMOTIONAL_ENTITLEMENT_EXPIRED")

            @JvmField
            val PROMOTIONAL_ENTITLEMENT_ENDS_SOON = of("PROMOTIONAL_ENTITLEMENT_ENDS_SOON")

            @JvmField val PACKAGE_PUBLISHED = of("PACKAGE_PUBLISHED")

            @JvmField val MIGRATE_SUBSCRIPTIONS = of("MIGRATE_SUBSCRIPTIONS")

            @JvmField
            val RECALCULATE_MIGRATED_ENTITLEMENTS_BATCH =
                of("RECALCULATE_MIGRATED_ENTITLEMENTS_BATCH")

            @JvmField
            val MIGRATE_SUBSCRIPTIONS_SCHEDULED_UPDATES =
                of("MIGRATE_SUBSCRIPTIONS_SCHEDULED_UPDATES")

            @JvmField val ENTITLEMENTS_UPDATED = of("ENTITLEMENTS_UPDATED")

            @JvmField val RESYNC_INTEGRATION_TRIGGERED = of("RESYNC_INTEGRATION_TRIGGERED")

            @JvmField val COUPON_CREATED = of("COUPON_CREATED")

            @JvmField val COUPON_UPDATED = of("COUPON_UPDATED")

            @JvmField
            val IMPORT_INTEGRATION_CATALOG_TRIGGERED = of("IMPORT_INTEGRATION_CATALOG_TRIGGERED")

            @JvmField
            val IMPORT_INTEGRATION_CUSTOMERS_TRIGGERED =
                of("IMPORT_INTEGRATION_CUSTOMERS_TRIGGERED")

            @JvmField val INCOMING_STRIPE_WEBHOOK = of("INCOMING_STRIPE_WEBHOOK")

            @JvmField val INCOMING_AWS_MARKETPLACE_WEBHOOK = of("INCOMING_AWS_MARKETPLACE_WEBHOOK")

            @JvmField val INCOMING_ZUORA_WEBHOOK = of("INCOMING_ZUORA_WEBHOOK")

            @JvmField val INCOMING_DOGGO_WEBHOOK = of("INCOMING_DOGGO_WEBHOOK")

            @JvmField val INCOMING_APP_STORE_WEBHOOK = of("INCOMING_APP_STORE_WEBHOOK")

            @JvmField val RESYNC_INTEGRATION = of("RESYNC_INTEGRATION")

            @JvmField val SYNC_COUPON = of("SYNC_COUPON")

            @JvmField val IMPORT_INTEGRATION_CATALOG = of("IMPORT_INTEGRATION_CATALOG")

            @JvmField val IMPORT_INTEGRATION_CUSTOMERS = of("IMPORT_INTEGRATION_CUSTOMERS")

            @JvmField val SYNC_FAILED = of("SYNC_FAILED")

            @JvmField val CUSTOMER_PAYMENT_FAILED = of("CUSTOMER_PAYMENT_FAILED")

            @JvmField val PRODUCT_CREATED = of("PRODUCT_CREATED")

            @JvmField val PRODUCT_UPDATED = of("PRODUCT_UPDATED")

            @JvmField val PRODUCT_DELETED = of("PRODUCT_DELETED")

            @JvmField val PRODUCT_UNARCHIVED = of("PRODUCT_UNARCHIVED")

            @JvmField val PACKAGE_GROUP_CREATED = of("PACKAGE_GROUP_CREATED")

            @JvmField val PACKAGE_GROUP_UPDATED = of("PACKAGE_GROUP_UPDATED")

            @JvmField val ENVIRONMENT_DELETED = of("ENVIRONMENT_DELETED")

            @JvmField val WIDGET_CONFIGURATION_UPDATED = of("WIDGET_CONFIGURATION_UPDATED")

            @JvmField val EDGE_API_DATA_RESYNC = of("EDGE_API_DATA_RESYNC")

            @JvmField val EDGE_API_DOGGO_RESYNC = of("EDGE_API_DOGGO_RESYNC")

            @JvmField
            val EDGE_API_CLIENT_CONFIGURATION_DATA_RESYNC =
                of("EDGE_API_CLIENT_CONFIGURATION_DATA_RESYNC")

            @JvmField
            val PURGE_CUSTOMER_PERSISTENT_CACHE_REQUESTED =
                of("PURGE_CUSTOMER_PERSISTENT_CACHE_REQUESTED")

            @JvmField
            val CUSTOMER_RESOURCE_ENTITLEMENT_CALCULATION_TRIGGERED =
                of("CUSTOMER_RESOURCE_ENTITLEMENT_CALCULATION_TRIGGERED")

            @JvmField
            val RECALCULATE_RESOURCE_ENTITLEMENTS = of("RECALCULATE_RESOURCE_ENTITLEMENTS")

            @JvmField
            val CUSTOMER_ENTITLEMENT_CALCULATION_TRIGGERED =
                of("CUSTOMER_ENTITLEMENT_CALCULATION_TRIGGERED[")

            @JvmField
            val RECALCULATE_ENTITLEMENTS_TRIGGERED = of("RECALCULATE_ENTITLEMENTS_TRIGGERED")

            @JvmField
            val IMPORT_SUBSCRIPTIONS_BULK_TRIGGERED = of("IMPORT_SUBSCRIPTIONS_BULK_TRIGGERED")

            @JvmField val EDGE_API_CUSTOMER_DATA_RESYNC = of("EDGE_API_CUSTOMER_DATA_RESYNC")

            @JvmField
            val EDGE_API_SUBSCRIPTIONS_DATA_RESYNC = of("EDGE_API_SUBSCRIPTIONS_DATA_RESYNC")

            @JvmField
            val EDGE_API_PACKAGE_ENTITLEMENTS_DATA_RESYNC =
                of("EDGE_API_PACKAGE_ENTITLEMENTS_DATA_RESYNC")

            @JvmField
            val EDGE_API_PRODUCT_CACHE_DATA_RESYNC = of("EDGE_API_PRODUCT_CACHE_DATA_RESYNC")

            @JvmField val EDGE_API_PLAN_CACHE_DATA_RESYNC = of("EDGE_API_PLAN_CACHE_DATA_RESYNC")

            @JvmField
            val EDGE_API_CUSTOM_CURRENCY_CACHE_DATA_RESYNC =
                of("EDGE_API_CUSTOM_CURRENCY_CACHE_DATA_RESYNC")

            @JvmField val REPLAY_WEBHOOK_EVENT = of("REPLAY_WEBHOOK_EVENT")

            @JvmField val SUBSCRIPTIONS_MIGRATED = of("SUBSCRIPTIONS_MIGRATED")

            @JvmField
            val SUBSCRIPTIONS_MIGRATION_TRIGGERED = of("SUBSCRIPTIONS_MIGRATION_TRIGGERED")

            @JvmField
            val SUBSCRIPTION_BILLING_MONTH_ENDS_SOON = of("SUBSCRIPTION_BILLING_MONTH_ENDS_SOON")

            @JvmField
            val SUBSCRIPTION_USAGE_CHARGE_TRIGGERED = of("SUBSCRIPTION_USAGE_CHARGE_TRIGGERED")

            @JvmField val SCHEDULER_BATCH = of("SCHEDULER_BATCH")

            @JvmField val EVENT_LOG_CREATED = of("EVENT_LOG_CREATED")

            @JvmField val CREDIT_GRANT_CREATED = of("CREDIT_GRANT_CREATED")

            @JvmField val CREDIT_GRANT_EXPIRED = of("CREDIT_GRANT_EXPIRED")

            @JvmField val CREDIT_GRANT_VOIDED = of("CREDIT_GRANT_VOIDED")

            @JvmField val CREDIT_GRANT_UPDATED = of("CREDIT_GRANT_UPDATED")

            @JvmField val CREDIT_GRANT_DEPLETED = of("CREDIT_GRANT_DEPLETED")

            @JvmField val CREDIT_GRANT_BALANCE_LOW = of("CREDIT_GRANT_BALANCE_LOW")

            @JvmField val CREDIT_BALANCE_UPDATED = of("CREDIT_BALANCE_UPDATED")

            @JvmField val CREDIT_BALANCE_DEPLETED = of("CREDIT_BALANCE_DEPLETED")

            @JvmField val CREDIT_BALANCE_LOW = of("CREDIT_BALANCE_LOW")

            @JvmField val CREDIT_GRANT_PROCESS_COMPLETED = of("CREDIT_GRANT_PROCESS_COMPLETED")

            @JvmField
            val AUTOMATIC_RECHARGE_THRESHOLD_BREACH = of("AUTOMATIC_RECHARGE_THRESHOLD_BREACH")

            @JvmField
            val AUTOMATIC_RECHARGE_OPERATION_ATTEMPTED =
                of("AUTOMATIC_RECHARGE_OPERATION_ATTEMPTED")

            @JvmField
            val CREDITS_AUTOMATIC_RECHARGE_LIMIT_EXCEEDED =
                of("CREDITS_AUTOMATIC_RECHARGE_LIMIT_EXCEEDED")

            @JvmField
            val AUTOMATIC_RECHARGE_CONFIGURATION_CHANGED =
                of("AUTOMATIC_RECHARGE_CONFIGURATION_CHANGED")

            @JvmField val FEATURE_GROUP_CREATED = of("FEATURE_GROUP_CREATED")

            @JvmField val FEATURE_GROUP_UPDATED = of("FEATURE_GROUP_UPDATED")

            @JvmField val FEATURE_GROUP_ARCHIVED = of("FEATURE_GROUP_ARCHIVED")

            @JvmField val FEATURE_GROUP_UN_ARCHIVED = of("FEATURE_GROUP_UN_ARCHIVED")

            @JvmField val STRIPE_APP_DRAWER_VIEWED = of("STRIPE_APP_DRAWER_VIEWED")

            @JvmField
            val EVENT_QUEUE_PROVISIONING_REQUESTED = of("EVENT_QUEUE_PROVISIONING_REQUESTED")

            @JvmField
            val EVENT_QUEUE_DEPROVISIONING_REQUESTED = of("EVENT_QUEUE_DEPROVISIONING_REQUESTED")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            MEMBER_INVITED,
            SYNC_SUBSCRIPTION,
            SYNC_CREDIT_GRANT,
            CUSTOMER_CREATED,
            CUSTOMER_UPDATED,
            CUSTOMER_DELETED,
            SYNC_CUSTOMER,
            SUBSCRIPTION_CREATED,
            SUBSCRIPTION_CANCELED,
            SUBSCRIPTION_EXPIRED,
            SUBSCRIPTION_UPDATED,
            SUBSCRIPTION_TRIAL_STARTED,
            SUBSCRIPTION_TRIAL_EXPIRED,
            SUBSCRIPTION_TRIAL_CONVERTED,
            SUBSCRIPTION_TRIAL_ENDS_SOON,
            SYNC_SUBSCRIPTION_USAGE,
            SUBSCRIPTION_USAGE_UPDATED,
            SUBSCRIPTION_SPENT_LIMIT_EXCEEDED,
            CREATE_SUBSCRIPTION_FAILED,
            PLAN_CREATED,
            PLAN_UPDATED,
            PLAN_DELETED,
            ADDON_CREATED,
            ADDON_UPDATED,
            ADDON_DELETED,
            SYNC_PACKAGE,
            FEATURE_CREATED,
            FEATURE_UPDATED,
            FEATURE_DELETED,
            FEATURE_ARCHIVED,
            API_KEY_CREATED,
            API_KEY_UPDATED,
            API_KEY_ROTATED,
            API_KEY_REVOKED,
            ENTITLEMENT_REQUESTED,
            ENTITLEMENT_GRANTED,
            ENTITLEMENT_DENIED,
            MEASUREMENT_REPORTED,
            USAGE_THRESHOLD_EXCEEDED,
            PROMOTIONAL_ENTITLEMENT_GRANTED,
            PROMOTIONAL_ENTITLEMENT_REVOKED,
            PROMOTIONAL_ENTITLEMENT_UPDATED,
            PROMOTIONAL_ENTITLEMENT_EXPIRED,
            PROMOTIONAL_ENTITLEMENT_ENDS_SOON,
            PACKAGE_PUBLISHED,
            MIGRATE_SUBSCRIPTIONS,
            RECALCULATE_MIGRATED_ENTITLEMENTS_BATCH,
            MIGRATE_SUBSCRIPTIONS_SCHEDULED_UPDATES,
            ENTITLEMENTS_UPDATED,
            RESYNC_INTEGRATION_TRIGGERED,
            COUPON_CREATED,
            COUPON_UPDATED,
            IMPORT_INTEGRATION_CATALOG_TRIGGERED,
            IMPORT_INTEGRATION_CUSTOMERS_TRIGGERED,
            INCOMING_STRIPE_WEBHOOK,
            INCOMING_AWS_MARKETPLACE_WEBHOOK,
            INCOMING_ZUORA_WEBHOOK,
            INCOMING_DOGGO_WEBHOOK,
            INCOMING_APP_STORE_WEBHOOK,
            RESYNC_INTEGRATION,
            SYNC_COUPON,
            IMPORT_INTEGRATION_CATALOG,
            IMPORT_INTEGRATION_CUSTOMERS,
            SYNC_FAILED,
            CUSTOMER_PAYMENT_FAILED,
            PRODUCT_CREATED,
            PRODUCT_UPDATED,
            PRODUCT_DELETED,
            PRODUCT_UNARCHIVED,
            PACKAGE_GROUP_CREATED,
            PACKAGE_GROUP_UPDATED,
            ENVIRONMENT_DELETED,
            WIDGET_CONFIGURATION_UPDATED,
            EDGE_API_DATA_RESYNC,
            EDGE_API_DOGGO_RESYNC,
            EDGE_API_CLIENT_CONFIGURATION_DATA_RESYNC,
            PURGE_CUSTOMER_PERSISTENT_CACHE_REQUESTED,
            CUSTOMER_RESOURCE_ENTITLEMENT_CALCULATION_TRIGGERED,
            RECALCULATE_RESOURCE_ENTITLEMENTS,
            CUSTOMER_ENTITLEMENT_CALCULATION_TRIGGERED,
            RECALCULATE_ENTITLEMENTS_TRIGGERED,
            IMPORT_SUBSCRIPTIONS_BULK_TRIGGERED,
            EDGE_API_CUSTOMER_DATA_RESYNC,
            EDGE_API_SUBSCRIPTIONS_DATA_RESYNC,
            EDGE_API_PACKAGE_ENTITLEMENTS_DATA_RESYNC,
            EDGE_API_PRODUCT_CACHE_DATA_RESYNC,
            EDGE_API_PLAN_CACHE_DATA_RESYNC,
            EDGE_API_CUSTOM_CURRENCY_CACHE_DATA_RESYNC,
            REPLAY_WEBHOOK_EVENT,
            SUBSCRIPTIONS_MIGRATED,
            SUBSCRIPTIONS_MIGRATION_TRIGGERED,
            SUBSCRIPTION_BILLING_MONTH_ENDS_SOON,
            SUBSCRIPTION_USAGE_CHARGE_TRIGGERED,
            SCHEDULER_BATCH,
            EVENT_LOG_CREATED,
            CREDIT_GRANT_CREATED,
            CREDIT_GRANT_EXPIRED,
            CREDIT_GRANT_VOIDED,
            CREDIT_GRANT_UPDATED,
            CREDIT_GRANT_DEPLETED,
            CREDIT_GRANT_BALANCE_LOW,
            CREDIT_BALANCE_UPDATED,
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_LOW,
            CREDIT_GRANT_PROCESS_COMPLETED,
            AUTOMATIC_RECHARGE_THRESHOLD_BREACH,
            AUTOMATIC_RECHARGE_OPERATION_ATTEMPTED,
            CREDITS_AUTOMATIC_RECHARGE_LIMIT_EXCEEDED,
            AUTOMATIC_RECHARGE_CONFIGURATION_CHANGED,
            FEATURE_GROUP_CREATED,
            FEATURE_GROUP_UPDATED,
            FEATURE_GROUP_ARCHIVED,
            FEATURE_GROUP_UN_ARCHIVED,
            STRIPE_APP_DRAWER_VIEWED,
            EVENT_QUEUE_PROVISIONING_REQUESTED,
            EVENT_QUEUE_DEPROVISIONING_REQUESTED,
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MEMBER_INVITED,
            SYNC_SUBSCRIPTION,
            SYNC_CREDIT_GRANT,
            CUSTOMER_CREATED,
            CUSTOMER_UPDATED,
            CUSTOMER_DELETED,
            SYNC_CUSTOMER,
            SUBSCRIPTION_CREATED,
            SUBSCRIPTION_CANCELED,
            SUBSCRIPTION_EXPIRED,
            SUBSCRIPTION_UPDATED,
            SUBSCRIPTION_TRIAL_STARTED,
            SUBSCRIPTION_TRIAL_EXPIRED,
            SUBSCRIPTION_TRIAL_CONVERTED,
            SUBSCRIPTION_TRIAL_ENDS_SOON,
            SYNC_SUBSCRIPTION_USAGE,
            SUBSCRIPTION_USAGE_UPDATED,
            SUBSCRIPTION_SPENT_LIMIT_EXCEEDED,
            CREATE_SUBSCRIPTION_FAILED,
            PLAN_CREATED,
            PLAN_UPDATED,
            PLAN_DELETED,
            ADDON_CREATED,
            ADDON_UPDATED,
            ADDON_DELETED,
            SYNC_PACKAGE,
            FEATURE_CREATED,
            FEATURE_UPDATED,
            FEATURE_DELETED,
            FEATURE_ARCHIVED,
            API_KEY_CREATED,
            API_KEY_UPDATED,
            API_KEY_ROTATED,
            API_KEY_REVOKED,
            ENTITLEMENT_REQUESTED,
            ENTITLEMENT_GRANTED,
            ENTITLEMENT_DENIED,
            MEASUREMENT_REPORTED,
            USAGE_THRESHOLD_EXCEEDED,
            PROMOTIONAL_ENTITLEMENT_GRANTED,
            PROMOTIONAL_ENTITLEMENT_REVOKED,
            PROMOTIONAL_ENTITLEMENT_UPDATED,
            PROMOTIONAL_ENTITLEMENT_EXPIRED,
            PROMOTIONAL_ENTITLEMENT_ENDS_SOON,
            PACKAGE_PUBLISHED,
            MIGRATE_SUBSCRIPTIONS,
            RECALCULATE_MIGRATED_ENTITLEMENTS_BATCH,
            MIGRATE_SUBSCRIPTIONS_SCHEDULED_UPDATES,
            ENTITLEMENTS_UPDATED,
            RESYNC_INTEGRATION_TRIGGERED,
            COUPON_CREATED,
            COUPON_UPDATED,
            IMPORT_INTEGRATION_CATALOG_TRIGGERED,
            IMPORT_INTEGRATION_CUSTOMERS_TRIGGERED,
            INCOMING_STRIPE_WEBHOOK,
            INCOMING_AWS_MARKETPLACE_WEBHOOK,
            INCOMING_ZUORA_WEBHOOK,
            INCOMING_DOGGO_WEBHOOK,
            INCOMING_APP_STORE_WEBHOOK,
            RESYNC_INTEGRATION,
            SYNC_COUPON,
            IMPORT_INTEGRATION_CATALOG,
            IMPORT_INTEGRATION_CUSTOMERS,
            SYNC_FAILED,
            CUSTOMER_PAYMENT_FAILED,
            PRODUCT_CREATED,
            PRODUCT_UPDATED,
            PRODUCT_DELETED,
            PRODUCT_UNARCHIVED,
            PACKAGE_GROUP_CREATED,
            PACKAGE_GROUP_UPDATED,
            ENVIRONMENT_DELETED,
            WIDGET_CONFIGURATION_UPDATED,
            EDGE_API_DATA_RESYNC,
            EDGE_API_DOGGO_RESYNC,
            EDGE_API_CLIENT_CONFIGURATION_DATA_RESYNC,
            PURGE_CUSTOMER_PERSISTENT_CACHE_REQUESTED,
            CUSTOMER_RESOURCE_ENTITLEMENT_CALCULATION_TRIGGERED,
            RECALCULATE_RESOURCE_ENTITLEMENTS,
            CUSTOMER_ENTITLEMENT_CALCULATION_TRIGGERED,
            RECALCULATE_ENTITLEMENTS_TRIGGERED,
            IMPORT_SUBSCRIPTIONS_BULK_TRIGGERED,
            EDGE_API_CUSTOMER_DATA_RESYNC,
            EDGE_API_SUBSCRIPTIONS_DATA_RESYNC,
            EDGE_API_PACKAGE_ENTITLEMENTS_DATA_RESYNC,
            EDGE_API_PRODUCT_CACHE_DATA_RESYNC,
            EDGE_API_PLAN_CACHE_DATA_RESYNC,
            EDGE_API_CUSTOM_CURRENCY_CACHE_DATA_RESYNC,
            REPLAY_WEBHOOK_EVENT,
            SUBSCRIPTIONS_MIGRATED,
            SUBSCRIPTIONS_MIGRATION_TRIGGERED,
            SUBSCRIPTION_BILLING_MONTH_ENDS_SOON,
            SUBSCRIPTION_USAGE_CHARGE_TRIGGERED,
            SCHEDULER_BATCH,
            EVENT_LOG_CREATED,
            CREDIT_GRANT_CREATED,
            CREDIT_GRANT_EXPIRED,
            CREDIT_GRANT_VOIDED,
            CREDIT_GRANT_UPDATED,
            CREDIT_GRANT_DEPLETED,
            CREDIT_GRANT_BALANCE_LOW,
            CREDIT_BALANCE_UPDATED,
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_LOW,
            CREDIT_GRANT_PROCESS_COMPLETED,
            AUTOMATIC_RECHARGE_THRESHOLD_BREACH,
            AUTOMATIC_RECHARGE_OPERATION_ATTEMPTED,
            CREDITS_AUTOMATIC_RECHARGE_LIMIT_EXCEEDED,
            AUTOMATIC_RECHARGE_CONFIGURATION_CHANGED,
            FEATURE_GROUP_CREATED,
            FEATURE_GROUP_UPDATED,
            FEATURE_GROUP_ARCHIVED,
            FEATURE_GROUP_UN_ARCHIVED,
            STRIPE_APP_DRAWER_VIEWED,
            EVENT_QUEUE_PROVISIONING_REQUESTED,
            EVENT_QUEUE_DEPROVISIONING_REQUESTED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                MEMBER_INVITED -> Value.MEMBER_INVITED
                SYNC_SUBSCRIPTION -> Value.SYNC_SUBSCRIPTION
                SYNC_CREDIT_GRANT -> Value.SYNC_CREDIT_GRANT
                CUSTOMER_CREATED -> Value.CUSTOMER_CREATED
                CUSTOMER_UPDATED -> Value.CUSTOMER_UPDATED
                CUSTOMER_DELETED -> Value.CUSTOMER_DELETED
                SYNC_CUSTOMER -> Value.SYNC_CUSTOMER
                SUBSCRIPTION_CREATED -> Value.SUBSCRIPTION_CREATED
                SUBSCRIPTION_CANCELED -> Value.SUBSCRIPTION_CANCELED
                SUBSCRIPTION_EXPIRED -> Value.SUBSCRIPTION_EXPIRED
                SUBSCRIPTION_UPDATED -> Value.SUBSCRIPTION_UPDATED
                SUBSCRIPTION_TRIAL_STARTED -> Value.SUBSCRIPTION_TRIAL_STARTED
                SUBSCRIPTION_TRIAL_EXPIRED -> Value.SUBSCRIPTION_TRIAL_EXPIRED
                SUBSCRIPTION_TRIAL_CONVERTED -> Value.SUBSCRIPTION_TRIAL_CONVERTED
                SUBSCRIPTION_TRIAL_ENDS_SOON -> Value.SUBSCRIPTION_TRIAL_ENDS_SOON
                SYNC_SUBSCRIPTION_USAGE -> Value.SYNC_SUBSCRIPTION_USAGE
                SUBSCRIPTION_USAGE_UPDATED -> Value.SUBSCRIPTION_USAGE_UPDATED
                SUBSCRIPTION_SPENT_LIMIT_EXCEEDED -> Value.SUBSCRIPTION_SPENT_LIMIT_EXCEEDED
                CREATE_SUBSCRIPTION_FAILED -> Value.CREATE_SUBSCRIPTION_FAILED
                PLAN_CREATED -> Value.PLAN_CREATED
                PLAN_UPDATED -> Value.PLAN_UPDATED
                PLAN_DELETED -> Value.PLAN_DELETED
                ADDON_CREATED -> Value.ADDON_CREATED
                ADDON_UPDATED -> Value.ADDON_UPDATED
                ADDON_DELETED -> Value.ADDON_DELETED
                SYNC_PACKAGE -> Value.SYNC_PACKAGE
                FEATURE_CREATED -> Value.FEATURE_CREATED
                FEATURE_UPDATED -> Value.FEATURE_UPDATED
                FEATURE_DELETED -> Value.FEATURE_DELETED
                FEATURE_ARCHIVED -> Value.FEATURE_ARCHIVED
                API_KEY_CREATED -> Value.API_KEY_CREATED
                API_KEY_UPDATED -> Value.API_KEY_UPDATED
                API_KEY_ROTATED -> Value.API_KEY_ROTATED
                API_KEY_REVOKED -> Value.API_KEY_REVOKED
                ENTITLEMENT_REQUESTED -> Value.ENTITLEMENT_REQUESTED
                ENTITLEMENT_GRANTED -> Value.ENTITLEMENT_GRANTED
                ENTITLEMENT_DENIED -> Value.ENTITLEMENT_DENIED
                MEASUREMENT_REPORTED -> Value.MEASUREMENT_REPORTED
                USAGE_THRESHOLD_EXCEEDED -> Value.USAGE_THRESHOLD_EXCEEDED
                PROMOTIONAL_ENTITLEMENT_GRANTED -> Value.PROMOTIONAL_ENTITLEMENT_GRANTED
                PROMOTIONAL_ENTITLEMENT_REVOKED -> Value.PROMOTIONAL_ENTITLEMENT_REVOKED
                PROMOTIONAL_ENTITLEMENT_UPDATED -> Value.PROMOTIONAL_ENTITLEMENT_UPDATED
                PROMOTIONAL_ENTITLEMENT_EXPIRED -> Value.PROMOTIONAL_ENTITLEMENT_EXPIRED
                PROMOTIONAL_ENTITLEMENT_ENDS_SOON -> Value.PROMOTIONAL_ENTITLEMENT_ENDS_SOON
                PACKAGE_PUBLISHED -> Value.PACKAGE_PUBLISHED
                MIGRATE_SUBSCRIPTIONS -> Value.MIGRATE_SUBSCRIPTIONS
                RECALCULATE_MIGRATED_ENTITLEMENTS_BATCH ->
                    Value.RECALCULATE_MIGRATED_ENTITLEMENTS_BATCH
                MIGRATE_SUBSCRIPTIONS_SCHEDULED_UPDATES ->
                    Value.MIGRATE_SUBSCRIPTIONS_SCHEDULED_UPDATES
                ENTITLEMENTS_UPDATED -> Value.ENTITLEMENTS_UPDATED
                RESYNC_INTEGRATION_TRIGGERED -> Value.RESYNC_INTEGRATION_TRIGGERED
                COUPON_CREATED -> Value.COUPON_CREATED
                COUPON_UPDATED -> Value.COUPON_UPDATED
                IMPORT_INTEGRATION_CATALOG_TRIGGERED -> Value.IMPORT_INTEGRATION_CATALOG_TRIGGERED
                IMPORT_INTEGRATION_CUSTOMERS_TRIGGERED ->
                    Value.IMPORT_INTEGRATION_CUSTOMERS_TRIGGERED
                INCOMING_STRIPE_WEBHOOK -> Value.INCOMING_STRIPE_WEBHOOK
                INCOMING_AWS_MARKETPLACE_WEBHOOK -> Value.INCOMING_AWS_MARKETPLACE_WEBHOOK
                INCOMING_ZUORA_WEBHOOK -> Value.INCOMING_ZUORA_WEBHOOK
                INCOMING_DOGGO_WEBHOOK -> Value.INCOMING_DOGGO_WEBHOOK
                INCOMING_APP_STORE_WEBHOOK -> Value.INCOMING_APP_STORE_WEBHOOK
                RESYNC_INTEGRATION -> Value.RESYNC_INTEGRATION
                SYNC_COUPON -> Value.SYNC_COUPON
                IMPORT_INTEGRATION_CATALOG -> Value.IMPORT_INTEGRATION_CATALOG
                IMPORT_INTEGRATION_CUSTOMERS -> Value.IMPORT_INTEGRATION_CUSTOMERS
                SYNC_FAILED -> Value.SYNC_FAILED
                CUSTOMER_PAYMENT_FAILED -> Value.CUSTOMER_PAYMENT_FAILED
                PRODUCT_CREATED -> Value.PRODUCT_CREATED
                PRODUCT_UPDATED -> Value.PRODUCT_UPDATED
                PRODUCT_DELETED -> Value.PRODUCT_DELETED
                PRODUCT_UNARCHIVED -> Value.PRODUCT_UNARCHIVED
                PACKAGE_GROUP_CREATED -> Value.PACKAGE_GROUP_CREATED
                PACKAGE_GROUP_UPDATED -> Value.PACKAGE_GROUP_UPDATED
                ENVIRONMENT_DELETED -> Value.ENVIRONMENT_DELETED
                WIDGET_CONFIGURATION_UPDATED -> Value.WIDGET_CONFIGURATION_UPDATED
                EDGE_API_DATA_RESYNC -> Value.EDGE_API_DATA_RESYNC
                EDGE_API_DOGGO_RESYNC -> Value.EDGE_API_DOGGO_RESYNC
                EDGE_API_CLIENT_CONFIGURATION_DATA_RESYNC ->
                    Value.EDGE_API_CLIENT_CONFIGURATION_DATA_RESYNC
                PURGE_CUSTOMER_PERSISTENT_CACHE_REQUESTED ->
                    Value.PURGE_CUSTOMER_PERSISTENT_CACHE_REQUESTED
                CUSTOMER_RESOURCE_ENTITLEMENT_CALCULATION_TRIGGERED ->
                    Value.CUSTOMER_RESOURCE_ENTITLEMENT_CALCULATION_TRIGGERED
                RECALCULATE_RESOURCE_ENTITLEMENTS -> Value.RECALCULATE_RESOURCE_ENTITLEMENTS
                CUSTOMER_ENTITLEMENT_CALCULATION_TRIGGERED ->
                    Value.CUSTOMER_ENTITLEMENT_CALCULATION_TRIGGERED
                RECALCULATE_ENTITLEMENTS_TRIGGERED -> Value.RECALCULATE_ENTITLEMENTS_TRIGGERED
                IMPORT_SUBSCRIPTIONS_BULK_TRIGGERED -> Value.IMPORT_SUBSCRIPTIONS_BULK_TRIGGERED
                EDGE_API_CUSTOMER_DATA_RESYNC -> Value.EDGE_API_CUSTOMER_DATA_RESYNC
                EDGE_API_SUBSCRIPTIONS_DATA_RESYNC -> Value.EDGE_API_SUBSCRIPTIONS_DATA_RESYNC
                EDGE_API_PACKAGE_ENTITLEMENTS_DATA_RESYNC ->
                    Value.EDGE_API_PACKAGE_ENTITLEMENTS_DATA_RESYNC
                EDGE_API_PRODUCT_CACHE_DATA_RESYNC -> Value.EDGE_API_PRODUCT_CACHE_DATA_RESYNC
                EDGE_API_PLAN_CACHE_DATA_RESYNC -> Value.EDGE_API_PLAN_CACHE_DATA_RESYNC
                EDGE_API_CUSTOM_CURRENCY_CACHE_DATA_RESYNC ->
                    Value.EDGE_API_CUSTOM_CURRENCY_CACHE_DATA_RESYNC
                REPLAY_WEBHOOK_EVENT -> Value.REPLAY_WEBHOOK_EVENT
                SUBSCRIPTIONS_MIGRATED -> Value.SUBSCRIPTIONS_MIGRATED
                SUBSCRIPTIONS_MIGRATION_TRIGGERED -> Value.SUBSCRIPTIONS_MIGRATION_TRIGGERED
                SUBSCRIPTION_BILLING_MONTH_ENDS_SOON -> Value.SUBSCRIPTION_BILLING_MONTH_ENDS_SOON
                SUBSCRIPTION_USAGE_CHARGE_TRIGGERED -> Value.SUBSCRIPTION_USAGE_CHARGE_TRIGGERED
                SCHEDULER_BATCH -> Value.SCHEDULER_BATCH
                EVENT_LOG_CREATED -> Value.EVENT_LOG_CREATED
                CREDIT_GRANT_CREATED -> Value.CREDIT_GRANT_CREATED
                CREDIT_GRANT_EXPIRED -> Value.CREDIT_GRANT_EXPIRED
                CREDIT_GRANT_VOIDED -> Value.CREDIT_GRANT_VOIDED
                CREDIT_GRANT_UPDATED -> Value.CREDIT_GRANT_UPDATED
                CREDIT_GRANT_DEPLETED -> Value.CREDIT_GRANT_DEPLETED
                CREDIT_GRANT_BALANCE_LOW -> Value.CREDIT_GRANT_BALANCE_LOW
                CREDIT_BALANCE_UPDATED -> Value.CREDIT_BALANCE_UPDATED
                CREDIT_BALANCE_DEPLETED -> Value.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_LOW -> Value.CREDIT_BALANCE_LOW
                CREDIT_GRANT_PROCESS_COMPLETED -> Value.CREDIT_GRANT_PROCESS_COMPLETED
                AUTOMATIC_RECHARGE_THRESHOLD_BREACH -> Value.AUTOMATIC_RECHARGE_THRESHOLD_BREACH
                AUTOMATIC_RECHARGE_OPERATION_ATTEMPTED ->
                    Value.AUTOMATIC_RECHARGE_OPERATION_ATTEMPTED
                CREDITS_AUTOMATIC_RECHARGE_LIMIT_EXCEEDED ->
                    Value.CREDITS_AUTOMATIC_RECHARGE_LIMIT_EXCEEDED
                AUTOMATIC_RECHARGE_CONFIGURATION_CHANGED ->
                    Value.AUTOMATIC_RECHARGE_CONFIGURATION_CHANGED
                FEATURE_GROUP_CREATED -> Value.FEATURE_GROUP_CREATED
                FEATURE_GROUP_UPDATED -> Value.FEATURE_GROUP_UPDATED
                FEATURE_GROUP_ARCHIVED -> Value.FEATURE_GROUP_ARCHIVED
                FEATURE_GROUP_UN_ARCHIVED -> Value.FEATURE_GROUP_UN_ARCHIVED
                STRIPE_APP_DRAWER_VIEWED -> Value.STRIPE_APP_DRAWER_VIEWED
                EVENT_QUEUE_PROVISIONING_REQUESTED -> Value.EVENT_QUEUE_PROVISIONING_REQUESTED
                EVENT_QUEUE_DEPROVISIONING_REQUESTED -> Value.EVENT_QUEUE_DEPROVISIONING_REQUESTED
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
                MEMBER_INVITED -> Known.MEMBER_INVITED
                SYNC_SUBSCRIPTION -> Known.SYNC_SUBSCRIPTION
                SYNC_CREDIT_GRANT -> Known.SYNC_CREDIT_GRANT
                CUSTOMER_CREATED -> Known.CUSTOMER_CREATED
                CUSTOMER_UPDATED -> Known.CUSTOMER_UPDATED
                CUSTOMER_DELETED -> Known.CUSTOMER_DELETED
                SYNC_CUSTOMER -> Known.SYNC_CUSTOMER
                SUBSCRIPTION_CREATED -> Known.SUBSCRIPTION_CREATED
                SUBSCRIPTION_CANCELED -> Known.SUBSCRIPTION_CANCELED
                SUBSCRIPTION_EXPIRED -> Known.SUBSCRIPTION_EXPIRED
                SUBSCRIPTION_UPDATED -> Known.SUBSCRIPTION_UPDATED
                SUBSCRIPTION_TRIAL_STARTED -> Known.SUBSCRIPTION_TRIAL_STARTED
                SUBSCRIPTION_TRIAL_EXPIRED -> Known.SUBSCRIPTION_TRIAL_EXPIRED
                SUBSCRIPTION_TRIAL_CONVERTED -> Known.SUBSCRIPTION_TRIAL_CONVERTED
                SUBSCRIPTION_TRIAL_ENDS_SOON -> Known.SUBSCRIPTION_TRIAL_ENDS_SOON
                SYNC_SUBSCRIPTION_USAGE -> Known.SYNC_SUBSCRIPTION_USAGE
                SUBSCRIPTION_USAGE_UPDATED -> Known.SUBSCRIPTION_USAGE_UPDATED
                SUBSCRIPTION_SPENT_LIMIT_EXCEEDED -> Known.SUBSCRIPTION_SPENT_LIMIT_EXCEEDED
                CREATE_SUBSCRIPTION_FAILED -> Known.CREATE_SUBSCRIPTION_FAILED
                PLAN_CREATED -> Known.PLAN_CREATED
                PLAN_UPDATED -> Known.PLAN_UPDATED
                PLAN_DELETED -> Known.PLAN_DELETED
                ADDON_CREATED -> Known.ADDON_CREATED
                ADDON_UPDATED -> Known.ADDON_UPDATED
                ADDON_DELETED -> Known.ADDON_DELETED
                SYNC_PACKAGE -> Known.SYNC_PACKAGE
                FEATURE_CREATED -> Known.FEATURE_CREATED
                FEATURE_UPDATED -> Known.FEATURE_UPDATED
                FEATURE_DELETED -> Known.FEATURE_DELETED
                FEATURE_ARCHIVED -> Known.FEATURE_ARCHIVED
                API_KEY_CREATED -> Known.API_KEY_CREATED
                API_KEY_UPDATED -> Known.API_KEY_UPDATED
                API_KEY_ROTATED -> Known.API_KEY_ROTATED
                API_KEY_REVOKED -> Known.API_KEY_REVOKED
                ENTITLEMENT_REQUESTED -> Known.ENTITLEMENT_REQUESTED
                ENTITLEMENT_GRANTED -> Known.ENTITLEMENT_GRANTED
                ENTITLEMENT_DENIED -> Known.ENTITLEMENT_DENIED
                MEASUREMENT_REPORTED -> Known.MEASUREMENT_REPORTED
                USAGE_THRESHOLD_EXCEEDED -> Known.USAGE_THRESHOLD_EXCEEDED
                PROMOTIONAL_ENTITLEMENT_GRANTED -> Known.PROMOTIONAL_ENTITLEMENT_GRANTED
                PROMOTIONAL_ENTITLEMENT_REVOKED -> Known.PROMOTIONAL_ENTITLEMENT_REVOKED
                PROMOTIONAL_ENTITLEMENT_UPDATED -> Known.PROMOTIONAL_ENTITLEMENT_UPDATED
                PROMOTIONAL_ENTITLEMENT_EXPIRED -> Known.PROMOTIONAL_ENTITLEMENT_EXPIRED
                PROMOTIONAL_ENTITLEMENT_ENDS_SOON -> Known.PROMOTIONAL_ENTITLEMENT_ENDS_SOON
                PACKAGE_PUBLISHED -> Known.PACKAGE_PUBLISHED
                MIGRATE_SUBSCRIPTIONS -> Known.MIGRATE_SUBSCRIPTIONS
                RECALCULATE_MIGRATED_ENTITLEMENTS_BATCH ->
                    Known.RECALCULATE_MIGRATED_ENTITLEMENTS_BATCH
                MIGRATE_SUBSCRIPTIONS_SCHEDULED_UPDATES ->
                    Known.MIGRATE_SUBSCRIPTIONS_SCHEDULED_UPDATES
                ENTITLEMENTS_UPDATED -> Known.ENTITLEMENTS_UPDATED
                RESYNC_INTEGRATION_TRIGGERED -> Known.RESYNC_INTEGRATION_TRIGGERED
                COUPON_CREATED -> Known.COUPON_CREATED
                COUPON_UPDATED -> Known.COUPON_UPDATED
                IMPORT_INTEGRATION_CATALOG_TRIGGERED -> Known.IMPORT_INTEGRATION_CATALOG_TRIGGERED
                IMPORT_INTEGRATION_CUSTOMERS_TRIGGERED ->
                    Known.IMPORT_INTEGRATION_CUSTOMERS_TRIGGERED
                INCOMING_STRIPE_WEBHOOK -> Known.INCOMING_STRIPE_WEBHOOK
                INCOMING_AWS_MARKETPLACE_WEBHOOK -> Known.INCOMING_AWS_MARKETPLACE_WEBHOOK
                INCOMING_ZUORA_WEBHOOK -> Known.INCOMING_ZUORA_WEBHOOK
                INCOMING_DOGGO_WEBHOOK -> Known.INCOMING_DOGGO_WEBHOOK
                INCOMING_APP_STORE_WEBHOOK -> Known.INCOMING_APP_STORE_WEBHOOK
                RESYNC_INTEGRATION -> Known.RESYNC_INTEGRATION
                SYNC_COUPON -> Known.SYNC_COUPON
                IMPORT_INTEGRATION_CATALOG -> Known.IMPORT_INTEGRATION_CATALOG
                IMPORT_INTEGRATION_CUSTOMERS -> Known.IMPORT_INTEGRATION_CUSTOMERS
                SYNC_FAILED -> Known.SYNC_FAILED
                CUSTOMER_PAYMENT_FAILED -> Known.CUSTOMER_PAYMENT_FAILED
                PRODUCT_CREATED -> Known.PRODUCT_CREATED
                PRODUCT_UPDATED -> Known.PRODUCT_UPDATED
                PRODUCT_DELETED -> Known.PRODUCT_DELETED
                PRODUCT_UNARCHIVED -> Known.PRODUCT_UNARCHIVED
                PACKAGE_GROUP_CREATED -> Known.PACKAGE_GROUP_CREATED
                PACKAGE_GROUP_UPDATED -> Known.PACKAGE_GROUP_UPDATED
                ENVIRONMENT_DELETED -> Known.ENVIRONMENT_DELETED
                WIDGET_CONFIGURATION_UPDATED -> Known.WIDGET_CONFIGURATION_UPDATED
                EDGE_API_DATA_RESYNC -> Known.EDGE_API_DATA_RESYNC
                EDGE_API_DOGGO_RESYNC -> Known.EDGE_API_DOGGO_RESYNC
                EDGE_API_CLIENT_CONFIGURATION_DATA_RESYNC ->
                    Known.EDGE_API_CLIENT_CONFIGURATION_DATA_RESYNC
                PURGE_CUSTOMER_PERSISTENT_CACHE_REQUESTED ->
                    Known.PURGE_CUSTOMER_PERSISTENT_CACHE_REQUESTED
                CUSTOMER_RESOURCE_ENTITLEMENT_CALCULATION_TRIGGERED ->
                    Known.CUSTOMER_RESOURCE_ENTITLEMENT_CALCULATION_TRIGGERED
                RECALCULATE_RESOURCE_ENTITLEMENTS -> Known.RECALCULATE_RESOURCE_ENTITLEMENTS
                CUSTOMER_ENTITLEMENT_CALCULATION_TRIGGERED ->
                    Known.CUSTOMER_ENTITLEMENT_CALCULATION_TRIGGERED
                RECALCULATE_ENTITLEMENTS_TRIGGERED -> Known.RECALCULATE_ENTITLEMENTS_TRIGGERED
                IMPORT_SUBSCRIPTIONS_BULK_TRIGGERED -> Known.IMPORT_SUBSCRIPTIONS_BULK_TRIGGERED
                EDGE_API_CUSTOMER_DATA_RESYNC -> Known.EDGE_API_CUSTOMER_DATA_RESYNC
                EDGE_API_SUBSCRIPTIONS_DATA_RESYNC -> Known.EDGE_API_SUBSCRIPTIONS_DATA_RESYNC
                EDGE_API_PACKAGE_ENTITLEMENTS_DATA_RESYNC ->
                    Known.EDGE_API_PACKAGE_ENTITLEMENTS_DATA_RESYNC
                EDGE_API_PRODUCT_CACHE_DATA_RESYNC -> Known.EDGE_API_PRODUCT_CACHE_DATA_RESYNC
                EDGE_API_PLAN_CACHE_DATA_RESYNC -> Known.EDGE_API_PLAN_CACHE_DATA_RESYNC
                EDGE_API_CUSTOM_CURRENCY_CACHE_DATA_RESYNC ->
                    Known.EDGE_API_CUSTOM_CURRENCY_CACHE_DATA_RESYNC
                REPLAY_WEBHOOK_EVENT -> Known.REPLAY_WEBHOOK_EVENT
                SUBSCRIPTIONS_MIGRATED -> Known.SUBSCRIPTIONS_MIGRATED
                SUBSCRIPTIONS_MIGRATION_TRIGGERED -> Known.SUBSCRIPTIONS_MIGRATION_TRIGGERED
                SUBSCRIPTION_BILLING_MONTH_ENDS_SOON -> Known.SUBSCRIPTION_BILLING_MONTH_ENDS_SOON
                SUBSCRIPTION_USAGE_CHARGE_TRIGGERED -> Known.SUBSCRIPTION_USAGE_CHARGE_TRIGGERED
                SCHEDULER_BATCH -> Known.SCHEDULER_BATCH
                EVENT_LOG_CREATED -> Known.EVENT_LOG_CREATED
                CREDIT_GRANT_CREATED -> Known.CREDIT_GRANT_CREATED
                CREDIT_GRANT_EXPIRED -> Known.CREDIT_GRANT_EXPIRED
                CREDIT_GRANT_VOIDED -> Known.CREDIT_GRANT_VOIDED
                CREDIT_GRANT_UPDATED -> Known.CREDIT_GRANT_UPDATED
                CREDIT_GRANT_DEPLETED -> Known.CREDIT_GRANT_DEPLETED
                CREDIT_GRANT_BALANCE_LOW -> Known.CREDIT_GRANT_BALANCE_LOW
                CREDIT_BALANCE_UPDATED -> Known.CREDIT_BALANCE_UPDATED
                CREDIT_BALANCE_DEPLETED -> Known.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_LOW -> Known.CREDIT_BALANCE_LOW
                CREDIT_GRANT_PROCESS_COMPLETED -> Known.CREDIT_GRANT_PROCESS_COMPLETED
                AUTOMATIC_RECHARGE_THRESHOLD_BREACH -> Known.AUTOMATIC_RECHARGE_THRESHOLD_BREACH
                AUTOMATIC_RECHARGE_OPERATION_ATTEMPTED ->
                    Known.AUTOMATIC_RECHARGE_OPERATION_ATTEMPTED
                CREDITS_AUTOMATIC_RECHARGE_LIMIT_EXCEEDED ->
                    Known.CREDITS_AUTOMATIC_RECHARGE_LIMIT_EXCEEDED
                AUTOMATIC_RECHARGE_CONFIGURATION_CHANGED ->
                    Known.AUTOMATIC_RECHARGE_CONFIGURATION_CHANGED
                FEATURE_GROUP_CREATED -> Known.FEATURE_GROUP_CREATED
                FEATURE_GROUP_UPDATED -> Known.FEATURE_GROUP_UPDATED
                FEATURE_GROUP_ARCHIVED -> Known.FEATURE_GROUP_ARCHIVED
                FEATURE_GROUP_UN_ARCHIVED -> Known.FEATURE_GROUP_UN_ARCHIVED
                STRIPE_APP_DRAWER_VIEWED -> Known.STRIPE_APP_DRAWER_VIEWED
                EVENT_QUEUE_PROVISIONING_REQUESTED -> Known.EVENT_QUEUE_PROVISIONING_REQUESTED
                EVENT_QUEUE_DEPROVISIONING_REQUESTED -> Known.EVENT_QUEUE_DEPROVISIONING_REQUESTED
                else -> throw StiggInvalidDataException("Unknown EventType: $value")
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

        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventQueueUpdateParams &&
            queueName == other.queueName &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(queueName, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EventQueueUpdateParams{queueName=$queueName, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
