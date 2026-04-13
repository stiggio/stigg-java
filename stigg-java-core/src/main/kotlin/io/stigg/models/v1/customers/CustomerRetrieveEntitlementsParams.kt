// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.Params
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves the effective entitlements for a customer or resource, including feature and credit
 * entitlements.
 *
 * **Warning:** This REST API endpoint lacks built-in client-side caching, fallback mechanisms, and
 * low-latency guarantees. It is not recommended for hot-path entitlement checks. For production
 * use, consider using the Stigg Node Server SDK with caching or the Sidecar for low-latency cached
 * responses.
 */
class CustomerRetrieveEntitlementsParams
private constructor(
    private val id: String?,
    private val resourceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Resource ID to scope entitlements to a specific resource */
    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CustomerRetrieveEntitlementsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerRetrieveEntitlementsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerRetrieveEntitlementsParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var resourceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerRetrieveEntitlementsParams: CustomerRetrieveEntitlementsParams) =
            apply {
                id = customerRetrieveEntitlementsParams.id
                resourceId = customerRetrieveEntitlementsParams.resourceId
                additionalHeaders = customerRetrieveEntitlementsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    customerRetrieveEntitlementsParams.additionalQueryParams.toBuilder()
            }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Resource ID to scope entitlements to a specific resource */
        fun resourceId(resourceId: String?) = apply { this.resourceId = resourceId }

        /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
        fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

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
         * Returns an immutable instance of [CustomerRetrieveEntitlementsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerRetrieveEntitlementsParams =
            CustomerRetrieveEntitlementsParams(
                id,
                resourceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                resourceId?.let { put("resourceId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerRetrieveEntitlementsParams &&
            id == other.id &&
            resourceId == other.resourceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, resourceId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerRetrieveEntitlementsParams{id=$id, resourceId=$resourceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
