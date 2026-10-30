// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.Params
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Checks a single entitlement (feature or credit) for a customer or resource. Supports
 * `requestedUsage` and `requestedValues` to evaluate against limits or enum values. Pass
 * `dimensions` to also check the governance budgets of the entities the usage is attributed to; the
 * response then includes `chains`. Each call reaches the Stigg API directly, so latency reflects a
 * network round trip. For entitlement checks on a hot path (e.g. gating a request in real time),
 * the Stigg Node Server SDK (with its built-in cache) or the Sidecar will typically respond faster
 * and keep working through brief Stigg outages; reach for this endpoint when a live HTTP call is
 * the natural fit, such as from a non-Node backend or a server-side job.
 */
class CustomerCheckEntitlementParams
private constructor(
    private val id: String?,
    private val currencyId: String?,
    private val dimensions: Dimensions?,
    private val featureId: String?,
    private val requestedUsage: Long?,
    private val requestedValues: List<String>?,
    private val reservationExpiresAt: OffsetDateTime?,
    private val reservationId: String?,
    private val reservationMetadata: String?,
    private val reservationTtlSeconds: Long?,
    private val reserveAmount: Double?,
    private val resourceId: String?,
    private val xAccountId: String?,
    private val xEnvironmentId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Currency ID (refId) to check for credit entitlements. Mutually exclusive with `featureId`.
     */
    fun currencyId(): Optional<String> = Optional.ofNullable(currencyId)

    /**
     * Attribution map of the entities the usage is attributed to (e.g. `dimensions[userId]=u1`).
     * When provided, their governance budgets are checked too and the response includes `chains`.
     */
    fun dimensions(): Optional<Dimensions> = Optional.ofNullable(dimensions)

    /** Feature ID (refId) to check. Mutually exclusive with `currencyId`. */
    fun featureId(): Optional<String> = Optional.ofNullable(featureId)

    /** Requested usage amount to evaluate against the entitlement limit (numeric features only) */
    fun requestedUsage(): Optional<Long> = Optional.ofNullable(requestedUsage)

    /** Requested values to evaluate against allowed values (enum features only) */
    fun requestedValues(): Optional<List<String>> = Optional.ofNullable(requestedValues)

    /**
     * When the reservation expires (ISO 8601, at most 24 hours ahead). Mutually exclusive with
     * `reservationTtlSeconds`.
     */
    fun reservationExpiresAt(): Optional<OffsetDateTime> = Optional.ofNullable(reservationExpiresAt)

    /**
     * Client-provided reservation ID, required with `reserveAmount`. Retry with the same ID to get
     * the same result; reuse with different parameters is a conflict.
     */
    fun reservationId(): Optional<String> = Optional.ofNullable(reservationId)

    /** JSON-encoded object of string values to attach to the reservation. */
    fun reservationMetadata(): Optional<String> = Optional.ofNullable(reservationMetadata)

    /**
     * How long the reservation holds the credits, in seconds (1–86400, default 3600). Mutually
     * exclusive with `reservationExpiresAt`.
     */
    fun reservationTtlSeconds(): Optional<Long> = Optional.ofNullable(reservationTtlSeconds)

    /**
     * Credits to reserve (credit entitlements only). The check is decided and the credits held
     * atomically; `requestedUsage` is ignored. Not supported with `dimensions`.
     */
    fun reserveAmount(): Optional<Double> = Optional.ofNullable(reserveAmount)

    /** Resource ID to scope the entitlement check to a specific resource */
    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId)

    fun xAccountId(): Optional<String> = Optional.ofNullable(xAccountId)

    fun xEnvironmentId(): Optional<String> = Optional.ofNullable(xEnvironmentId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CustomerCheckEntitlementParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCheckEntitlementParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerCheckEntitlementParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var currencyId: String? = null
        private var dimensions: Dimensions? = null
        private var featureId: String? = null
        private var requestedUsage: Long? = null
        private var requestedValues: MutableList<String>? = null
        private var reservationExpiresAt: OffsetDateTime? = null
        private var reservationId: String? = null
        private var reservationMetadata: String? = null
        private var reservationTtlSeconds: Long? = null
        private var reserveAmount: Double? = null
        private var resourceId: String? = null
        private var xAccountId: String? = null
        private var xEnvironmentId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerCheckEntitlementParams: CustomerCheckEntitlementParams) = apply {
            id = customerCheckEntitlementParams.id
            currencyId = customerCheckEntitlementParams.currencyId
            dimensions = customerCheckEntitlementParams.dimensions
            featureId = customerCheckEntitlementParams.featureId
            requestedUsage = customerCheckEntitlementParams.requestedUsage
            requestedValues = customerCheckEntitlementParams.requestedValues?.toMutableList()
            reservationExpiresAt = customerCheckEntitlementParams.reservationExpiresAt
            reservationId = customerCheckEntitlementParams.reservationId
            reservationMetadata = customerCheckEntitlementParams.reservationMetadata
            reservationTtlSeconds = customerCheckEntitlementParams.reservationTtlSeconds
            reserveAmount = customerCheckEntitlementParams.reserveAmount
            resourceId = customerCheckEntitlementParams.resourceId
            xAccountId = customerCheckEntitlementParams.xAccountId
            xEnvironmentId = customerCheckEntitlementParams.xEnvironmentId
            additionalHeaders = customerCheckEntitlementParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCheckEntitlementParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Currency ID (refId) to check for credit entitlements. Mutually exclusive with
         * `featureId`.
         */
        fun currencyId(currencyId: String?) = apply { this.currencyId = currencyId }

        /** Alias for calling [Builder.currencyId] with `currencyId.orElse(null)`. */
        fun currencyId(currencyId: Optional<String>) = currencyId(currencyId.getOrNull())

        /**
         * Attribution map of the entities the usage is attributed to (e.g.
         * `dimensions[userId]=u1`). When provided, their governance budgets are checked too and the
         * response includes `chains`.
         */
        fun dimensions(dimensions: Dimensions?) = apply { this.dimensions = dimensions }

        /** Alias for calling [Builder.dimensions] with `dimensions.orElse(null)`. */
        fun dimensions(dimensions: Optional<Dimensions>) = dimensions(dimensions.getOrNull())

        /** Feature ID (refId) to check. Mutually exclusive with `currencyId`. */
        fun featureId(featureId: String?) = apply { this.featureId = featureId }

        /** Alias for calling [Builder.featureId] with `featureId.orElse(null)`. */
        fun featureId(featureId: Optional<String>) = featureId(featureId.getOrNull())

        /**
         * Requested usage amount to evaluate against the entitlement limit (numeric features only)
         */
        fun requestedUsage(requestedUsage: Long?) = apply { this.requestedUsage = requestedUsage }

        /**
         * Alias for [Builder.requestedUsage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun requestedUsage(requestedUsage: Long) = requestedUsage(requestedUsage as Long?)

        /** Alias for calling [Builder.requestedUsage] with `requestedUsage.orElse(null)`. */
        fun requestedUsage(requestedUsage: Optional<Long>) =
            requestedUsage(requestedUsage.getOrNull())

        /** Requested values to evaluate against allowed values (enum features only) */
        fun requestedValues(requestedValues: List<String>?) = apply {
            this.requestedValues = requestedValues?.toMutableList()
        }

        /** Alias for calling [Builder.requestedValues] with `requestedValues.orElse(null)`. */
        fun requestedValues(requestedValues: Optional<List<String>>) =
            requestedValues(requestedValues.getOrNull())

        /**
         * Adds a single [String] to [requestedValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequestedValue(requestedValue: String) = apply {
            requestedValues = (requestedValues ?: mutableListOf()).apply { add(requestedValue) }
        }

        /**
         * When the reservation expires (ISO 8601, at most 24 hours ahead). Mutually exclusive with
         * `reservationTtlSeconds`.
         */
        fun reservationExpiresAt(reservationExpiresAt: OffsetDateTime?) = apply {
            this.reservationExpiresAt = reservationExpiresAt
        }

        /**
         * Alias for calling [Builder.reservationExpiresAt] with
         * `reservationExpiresAt.orElse(null)`.
         */
        fun reservationExpiresAt(reservationExpiresAt: Optional<OffsetDateTime>) =
            reservationExpiresAt(reservationExpiresAt.getOrNull())

        /**
         * Client-provided reservation ID, required with `reserveAmount`. Retry with the same ID to
         * get the same result; reuse with different parameters is a conflict.
         */
        fun reservationId(reservationId: String?) = apply { this.reservationId = reservationId }

        /** Alias for calling [Builder.reservationId] with `reservationId.orElse(null)`. */
        fun reservationId(reservationId: Optional<String>) =
            reservationId(reservationId.getOrNull())

        /** JSON-encoded object of string values to attach to the reservation. */
        fun reservationMetadata(reservationMetadata: String?) = apply {
            this.reservationMetadata = reservationMetadata
        }

        /**
         * Alias for calling [Builder.reservationMetadata] with `reservationMetadata.orElse(null)`.
         */
        fun reservationMetadata(reservationMetadata: Optional<String>) =
            reservationMetadata(reservationMetadata.getOrNull())

        /**
         * How long the reservation holds the credits, in seconds (1–86400, default 3600). Mutually
         * exclusive with `reservationExpiresAt`.
         */
        fun reservationTtlSeconds(reservationTtlSeconds: Long?) = apply {
            this.reservationTtlSeconds = reservationTtlSeconds
        }

        /**
         * Alias for [Builder.reservationTtlSeconds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun reservationTtlSeconds(reservationTtlSeconds: Long) =
            reservationTtlSeconds(reservationTtlSeconds as Long?)

        /**
         * Alias for calling [Builder.reservationTtlSeconds] with
         * `reservationTtlSeconds.orElse(null)`.
         */
        fun reservationTtlSeconds(reservationTtlSeconds: Optional<Long>) =
            reservationTtlSeconds(reservationTtlSeconds.getOrNull())

        /**
         * Credits to reserve (credit entitlements only). The check is decided and the credits held
         * atomically; `requestedUsage` is ignored. Not supported with `dimensions`.
         */
        fun reserveAmount(reserveAmount: Double?) = apply { this.reserveAmount = reserveAmount }

        /**
         * Alias for [Builder.reserveAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun reserveAmount(reserveAmount: Double) = reserveAmount(reserveAmount as Double?)

        /** Alias for calling [Builder.reserveAmount] with `reserveAmount.orElse(null)`. */
        fun reserveAmount(reserveAmount: Optional<Double>) =
            reserveAmount(reserveAmount.getOrNull())

        /** Resource ID to scope the entitlement check to a specific resource */
        fun resourceId(resourceId: String?) = apply { this.resourceId = resourceId }

        /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
        fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

        fun xAccountId(xAccountId: String?) = apply { this.xAccountId = xAccountId }

        /** Alias for calling [Builder.xAccountId] with `xAccountId.orElse(null)`. */
        fun xAccountId(xAccountId: Optional<String>) = xAccountId(xAccountId.getOrNull())

        fun xEnvironmentId(xEnvironmentId: String?) = apply { this.xEnvironmentId = xEnvironmentId }

        /** Alias for calling [Builder.xEnvironmentId] with `xEnvironmentId.orElse(null)`. */
        fun xEnvironmentId(xEnvironmentId: Optional<String>) =
            xEnvironmentId(xEnvironmentId.getOrNull())

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
         * Returns an immutable instance of [CustomerCheckEntitlementParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerCheckEntitlementParams =
            CustomerCheckEntitlementParams(
                id,
                currencyId,
                dimensions,
                featureId,
                requestedUsage,
                requestedValues?.toImmutable(),
                reservationExpiresAt,
                reservationId,
                reservationMetadata,
                reservationTtlSeconds,
                reserveAmount,
                resourceId,
                xAccountId,
                xEnvironmentId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                xAccountId?.let { put("X-ACCOUNT-ID", it) }
                xEnvironmentId?.let { put("X-ENVIRONMENT-ID", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                currencyId?.let { put("currencyId", it) }
                dimensions?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("dimensions[$key]", value)
                        }
                    }
                }
                featureId?.let { put("featureId", it) }
                requestedUsage?.let { put("requestedUsage", it.toString()) }
                requestedValues?.let { put("requestedValues", it.joinToString(",")) }
                reservationExpiresAt?.let {
                    put("reservationExpiresAt", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                reservationId?.let { put("reservationId", it) }
                reservationMetadata?.let { put("reservationMetadata", it) }
                reservationTtlSeconds?.let { put("reservationTtlSeconds", it.toString()) }
                reserveAmount?.let { put("reserveAmount", it.toString()) }
                resourceId?.let { put("resourceId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Attribution map of the entities the usage is attributed to (e.g. `dimensions[userId]=u1`).
     * When provided, their governance budgets are checked too and the response includes `chains`.
     */
    class Dimensions private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Dimensions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Dimensions]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(dimensions: Dimensions) = apply {
                additionalProperties = dimensions.additionalProperties.toBuilder()
            }

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
             * Returns an immutable instance of [Dimensions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Dimensions = Dimensions(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Dimensions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Dimensions{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerCheckEntitlementParams &&
            id == other.id &&
            currencyId == other.currencyId &&
            dimensions == other.dimensions &&
            featureId == other.featureId &&
            requestedUsage == other.requestedUsage &&
            requestedValues == other.requestedValues &&
            reservationExpiresAt == other.reservationExpiresAt &&
            reservationId == other.reservationId &&
            reservationMetadata == other.reservationMetadata &&
            reservationTtlSeconds == other.reservationTtlSeconds &&
            reserveAmount == other.reserveAmount &&
            resourceId == other.resourceId &&
            xAccountId == other.xAccountId &&
            xEnvironmentId == other.xEnvironmentId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            currencyId,
            dimensions,
            featureId,
            requestedUsage,
            requestedValues,
            reservationExpiresAt,
            reservationId,
            reservationMetadata,
            reservationTtlSeconds,
            reserveAmount,
            resourceId,
            xAccountId,
            xEnvironmentId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CustomerCheckEntitlementParams{id=$id, currencyId=$currencyId, dimensions=$dimensions, featureId=$featureId, requestedUsage=$requestedUsage, requestedValues=$requestedValues, reservationExpiresAt=$reservationExpiresAt, reservationId=$reservationId, reservationMetadata=$reservationMetadata, reservationTtlSeconds=$reservationTtlSeconds, reserveAmount=$reserveAmount, resourceId=$resourceId, xAccountId=$xAccountId, xEnvironmentId=$xEnvironmentId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
