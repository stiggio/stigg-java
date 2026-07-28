// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.contracts

import io.stigg.core.Params
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a cursor-paginated list of contracts in the environment, fetched live from the
 * connected billing provider. Each contract is enriched with a preview of its upcoming (next)
 * invoice when one is available. Returns an empty list when no billing provider is connected.
 * Supports filtering by customer external ID, state, and name.
 */
class ContractListParams
private constructor(
    private val after: String?,
    private val before: String?,
    private val customerExternalId: String?,
    private val limit: Long?,
    private val name: String?,
    private val state: String?,
    private val xAccountId: String?,
    private val xEnvironmentId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Return items that come after this cursor */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** Return items that come before this cursor */
    fun before(): Optional<String> = Optional.ofNullable(before)

    /** Filter by the exact external ID of the customer the contract belongs to */
    fun customerExternalId(): Optional<String> = Optional.ofNullable(customerExternalId)

    /** Maximum number of items to return */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter by exact contract name */
    fun name(): Optional<String> = Optional.ofNullable(name)

    /** Filter by contract state. Supports comma-separated values for multiple states */
    fun state(): Optional<String> = Optional.ofNullable(state)

    fun xAccountId(): Optional<String> = Optional.ofNullable(xAccountId)

    fun xEnvironmentId(): Optional<String> = Optional.ofNullable(xEnvironmentId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ContractListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ContractListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractListParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var before: String? = null
        private var customerExternalId: String? = null
        private var limit: Long? = null
        private var name: String? = null
        private var state: String? = null
        private var xAccountId: String? = null
        private var xEnvironmentId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractListParams: ContractListParams) = apply {
            after = contractListParams.after
            before = contractListParams.before
            customerExternalId = contractListParams.customerExternalId
            limit = contractListParams.limit
            name = contractListParams.name
            state = contractListParams.state
            xAccountId = contractListParams.xAccountId
            xEnvironmentId = contractListParams.xEnvironmentId
            additionalHeaders = contractListParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractListParams.additionalQueryParams.toBuilder()
        }

        /** Return items that come after this cursor */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** Return items that come before this cursor */
        fun before(before: String?) = apply { this.before = before }

        /** Alias for calling [Builder.before] with `before.orElse(null)`. */
        fun before(before: Optional<String>) = before(before.getOrNull())

        /** Filter by the exact external ID of the customer the contract belongs to */
        fun customerExternalId(customerExternalId: String?) = apply {
            this.customerExternalId = customerExternalId
        }

        /**
         * Alias for calling [Builder.customerExternalId] with `customerExternalId.orElse(null)`.
         */
        fun customerExternalId(customerExternalId: Optional<String>) =
            customerExternalId(customerExternalId.getOrNull())

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

        /** Filter by exact contract name */
        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /** Filter by contract state. Supports comma-separated values for multiple states */
        fun state(state: String?) = apply { this.state = state }

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<String>) = state(state.getOrNull())

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
         * Returns an immutable instance of [ContractListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContractListParams =
            ContractListParams(
                after,
                before,
                customerExternalId,
                limit,
                name,
                state,
                xAccountId,
                xEnvironmentId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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
                after?.let { put("after", it) }
                before?.let { put("before", it) }
                customerExternalId?.let { put("customerExternalId", it) }
                limit?.let { put("limit", it.toString()) }
                name?.let { put("name", it) }
                state?.let { put("state", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractListParams &&
            after == other.after &&
            before == other.before &&
            customerExternalId == other.customerExternalId &&
            limit == other.limit &&
            name == other.name &&
            state == other.state &&
            xAccountId == other.xAccountId &&
            xEnvironmentId == other.xEnvironmentId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            before,
            customerExternalId,
            limit,
            name,
            state,
            xAccountId,
            xEnvironmentId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ContractListParams{after=$after, before=$before, customerExternalId=$customerExternalId, limit=$limit, name=$name, state=$state, xAccountId=$xAccountId, xEnvironmentId=$xEnvironmentId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
