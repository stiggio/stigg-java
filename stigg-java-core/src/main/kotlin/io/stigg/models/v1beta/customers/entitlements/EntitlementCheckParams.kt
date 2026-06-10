// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.entitlements

import io.stigg.core.Params
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Experimental — request and response shapes may change without notice. Same semantics as `Check
 * entitlement`, plus an optional `dimensions` query param that resolves to per-entity governance
 * limits surfaced as `chains` on the response.
 */
class EntitlementCheckParams
private constructor(
    private val id: String?,
    private val currencyId: String?,
    private val dimensions: Dimensions?,
    private val featureId: String?,
    private val requestedUsage: Long?,
    private val requestedValues: List<String>?,
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
     * Optional attribution map (e.g. `dimensions[userId]=u1`). When provided, the response includes
     * a `chains` array with per-entity governance limits.
     */
    fun dimensions(): Optional<Dimensions> = Optional.ofNullable(dimensions)

    /** Feature ID (refId) to check. Mutually exclusive with `currencyId`. */
    fun featureId(): Optional<String> = Optional.ofNullable(featureId)

    /** Requested usage amount to evaluate against the entitlement limit (numeric features only) */
    fun requestedUsage(): Optional<Long> = Optional.ofNullable(requestedUsage)

    /** Requested values to evaluate against allowed values (enum features only) */
    fun requestedValues(): Optional<List<String>> = Optional.ofNullable(requestedValues)

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

        @JvmStatic fun none(): EntitlementCheckParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EntitlementCheckParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntitlementCheckParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var currencyId: String? = null
        private var dimensions: Dimensions? = null
        private var featureId: String? = null
        private var requestedUsage: Long? = null
        private var requestedValues: MutableList<String>? = null
        private var resourceId: String? = null
        private var xAccountId: String? = null
        private var xEnvironmentId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(entitlementCheckParams: EntitlementCheckParams) = apply {
            id = entitlementCheckParams.id
            currencyId = entitlementCheckParams.currencyId
            dimensions = entitlementCheckParams.dimensions
            featureId = entitlementCheckParams.featureId
            requestedUsage = entitlementCheckParams.requestedUsage
            requestedValues = entitlementCheckParams.requestedValues?.toMutableList()
            resourceId = entitlementCheckParams.resourceId
            xAccountId = entitlementCheckParams.xAccountId
            xEnvironmentId = entitlementCheckParams.xEnvironmentId
            additionalHeaders = entitlementCheckParams.additionalHeaders.toBuilder()
            additionalQueryParams = entitlementCheckParams.additionalQueryParams.toBuilder()
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
         * Optional attribution map (e.g. `dimensions[userId]=u1`). When provided, the response
         * includes a `chains` array with per-entity governance limits.
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
         * Returns an immutable instance of [EntitlementCheckParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EntitlementCheckParams =
            EntitlementCheckParams(
                id,
                currencyId,
                dimensions,
                featureId,
                requestedUsage,
                requestedValues?.toImmutable(),
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
                resourceId?.let { put("resourceId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Optional attribution map (e.g. `dimensions[userId]=u1`). When provided, the response includes
     * a `chains` array with per-entity governance limits.
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

        return other is EntitlementCheckParams &&
            id == other.id &&
            currencyId == other.currencyId &&
            dimensions == other.dimensions &&
            featureId == other.featureId &&
            requestedUsage == other.requestedUsage &&
            requestedValues == other.requestedValues &&
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
            resourceId,
            xAccountId,
            xEnvironmentId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EntitlementCheckParams{id=$id, currencyId=$currencyId, dimensions=$dimensions, featureId=$featureId, requestedUsage=$requestedUsage, requestedValues=$requestedValues, resourceId=$resourceId, xAccountId=$xAccountId, xEnvironmentId=$xEnvironmentId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
