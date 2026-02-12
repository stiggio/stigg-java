// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import io.stigg.core.Params
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a paginated list of subscriptions, with optional filters for customer, status, and
 * plan.
 */
class SubscriptionListParams
private constructor(
    private val after: String?,
    private val before: String?,
    private val createdAt: CreatedAt?,
    private val customerId: String?,
    private val limit: Long?,
    private val planId: String?,
    private val pricingType: String?,
    private val resourceId: String?,
    private val status: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Return items that come after this cursor */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** Return items that come before this cursor */
    fun before(): Optional<String> = Optional.ofNullable(before)

    /** Filter by creation date using range operators: gt, gte, lt, lte */
    fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

    /** Filter by customer ID */
    fun customerId(): Optional<String> = Optional.ofNullable(customerId)

    /** Maximum number of items to return */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter by plan ID */
    fun planId(): Optional<String> = Optional.ofNullable(planId)

    /** Filter by pricing type. Supports comma-separated values for multiple types */
    fun pricingType(): Optional<String> = Optional.ofNullable(pricingType)

    /** Filter by resource ID */
    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId)

    /** Filter by subscription status. Supports comma-separated values for multiple statuses */
    fun status(): Optional<String> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SubscriptionListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SubscriptionListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionListParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var before: String? = null
        private var createdAt: CreatedAt? = null
        private var customerId: String? = null
        private var limit: Long? = null
        private var planId: String? = null
        private var pricingType: String? = null
        private var resourceId: String? = null
        private var status: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionListParams: SubscriptionListParams) = apply {
            after = subscriptionListParams.after
            before = subscriptionListParams.before
            createdAt = subscriptionListParams.createdAt
            customerId = subscriptionListParams.customerId
            limit = subscriptionListParams.limit
            planId = subscriptionListParams.planId
            pricingType = subscriptionListParams.pricingType
            resourceId = subscriptionListParams.resourceId
            status = subscriptionListParams.status
            additionalHeaders = subscriptionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionListParams.additionalQueryParams.toBuilder()
        }

        /** Return items that come after this cursor */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** Return items that come before this cursor */
        fun before(before: String?) = apply { this.before = before }

        /** Alias for calling [Builder.before] with `before.orElse(null)`. */
        fun before(before: Optional<String>) = before(before.getOrNull())

        /** Filter by creation date using range operators: gt, gte, lt, lte */
        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

        /** Filter by customer ID */
        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** Alias for calling [Builder.customerId] with `customerId.orElse(null)`. */
        fun customerId(customerId: Optional<String>) = customerId(customerId.getOrNull())

        /** Maximum number of items to return */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Filter by plan ID */
        fun planId(planId: String?) = apply { this.planId = planId }

        /** Alias for calling [Builder.planId] with `planId.orElse(null)`. */
        fun planId(planId: Optional<String>) = planId(planId.getOrNull())

        /** Filter by pricing type. Supports comma-separated values for multiple types */
        fun pricingType(pricingType: String?) = apply { this.pricingType = pricingType }

        /** Alias for calling [Builder.pricingType] with `pricingType.orElse(null)`. */
        fun pricingType(pricingType: Optional<String>) = pricingType(pricingType.getOrNull())

        /** Filter by resource ID */
        fun resourceId(resourceId: String?) = apply { this.resourceId = resourceId }

        /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
        fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

        /** Filter by subscription status. Supports comma-separated values for multiple statuses */
        fun status(status: String?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

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
         * Returns an immutable instance of [SubscriptionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionListParams =
            SubscriptionListParams(
                after,
                before,
                createdAt,
                customerId,
                limit,
                planId,
                pricingType,
                resourceId,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                before?.let { put("before", it) }
                createdAt?.let {
                    it.gt().ifPresent {
                        put("createdAt[gt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.gte().ifPresent {
                        put("createdAt[gte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.lt().ifPresent {
                        put("createdAt[lt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.lte().ifPresent {
                        put("createdAt[lte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("createdAt[$key]", value)
                        }
                    }
                }
                customerId?.let { put("customerId", it) }
                limit?.let { put("limit", it.toString()) }
                planId?.let { put("planId", it) }
                pricingType?.let { put("pricingType", it) }
                resourceId?.let { put("resourceId", it) }
                status?.let { put("status", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by creation date using range operators: gt, gte, lt, lte */
    class CreatedAt
    private constructor(
        private val gt: OffsetDateTime?,
        private val gte: OffsetDateTime?,
        private val lt: OffsetDateTime?,
        private val lte: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        /** Greater than the specified createdAt value */
        fun gt(): Optional<OffsetDateTime> = Optional.ofNullable(gt)

        /** Greater than or equal to the specified createdAt value */
        fun gte(): Optional<OffsetDateTime> = Optional.ofNullable(gte)

        /** Less than the specified createdAt value */
        fun lt(): Optional<OffsetDateTime> = Optional.ofNullable(lt)

        /** Less than or equal to the specified createdAt value */
        fun lte(): Optional<OffsetDateTime> = Optional.ofNullable(lte)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreatedAt]. */
        class Builder internal constructor() {

            private var gt: OffsetDateTime? = null
            private var gte: OffsetDateTime? = null
            private var lt: OffsetDateTime? = null
            private var lte: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(createdAt: CreatedAt) = apply {
                gt = createdAt.gt
                gte = createdAt.gte
                lt = createdAt.lt
                lte = createdAt.lte
                additionalProperties = createdAt.additionalProperties.toBuilder()
            }

            /** Greater than the specified createdAt value */
            fun gt(gt: OffsetDateTime?) = apply { this.gt = gt }

            /** Alias for calling [Builder.gt] with `gt.orElse(null)`. */
            fun gt(gt: Optional<OffsetDateTime>) = gt(gt.getOrNull())

            /** Greater than or equal to the specified createdAt value */
            fun gte(gte: OffsetDateTime?) = apply { this.gte = gte }

            /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
            fun gte(gte: Optional<OffsetDateTime>) = gte(gte.getOrNull())

            /** Less than the specified createdAt value */
            fun lt(lt: OffsetDateTime?) = apply { this.lt = lt }

            /** Alias for calling [Builder.lt] with `lt.orElse(null)`. */
            fun lt(lt: Optional<OffsetDateTime>) = lt(lt.getOrNull())

            /** Less than or equal to the specified createdAt value */
            fun lte(lte: OffsetDateTime?) = apply { this.lte = lte }

            /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
            fun lte(lte: Optional<OffsetDateTime>) = lte(lte.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [CreatedAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CreatedAt = CreatedAt(gt, gte, lt, lte, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedAt &&
                gt == other.gt &&
                gte == other.gte &&
                lt == other.lt &&
                lte == other.lte &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(gt, gte, lt, lte, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedAt{gt=$gt, gte=$gte, lt=$lt, lte=$lte, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionListParams &&
            after == other.after &&
            before == other.before &&
            createdAt == other.createdAt &&
            customerId == other.customerId &&
            limit == other.limit &&
            planId == other.planId &&
            pricingType == other.pricingType &&
            resourceId == other.resourceId &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            before,
            createdAt,
            customerId,
            limit,
            planId,
            pricingType,
            resourceId,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SubscriptionListParams{after=$after, before=$before, createdAt=$createdAt, customerId=$customerId, limit=$limit, planId=$planId, pricingType=$pricingType, resourceId=$resourceId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
