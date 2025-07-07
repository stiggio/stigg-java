// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1

import com.stigg.api.core.Params
import com.stigg.api.core.checkRequired
import com.stigg.api.core.http.Headers
import com.stigg.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a single customer by id */
class V1RetrieveCustomerParams
private constructor(
    private val refId: String?,
    private val xApiKey: String,
    private val xEnvironmentId: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun refId(): Optional<String> = Optional.ofNullable(refId)

    fun xApiKey(): String = xApiKey

    fun xEnvironmentId(): String = xEnvironmentId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1RetrieveCustomerParams].
         *
         * The following fields are required:
         * ```java
         * .xApiKey()
         * .xEnvironmentId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1RetrieveCustomerParams]. */
    class Builder internal constructor() {

        private var refId: String? = null
        private var xApiKey: String? = null
        private var xEnvironmentId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1RetrieveCustomerParams: V1RetrieveCustomerParams) = apply {
            refId = v1RetrieveCustomerParams.refId
            xApiKey = v1RetrieveCustomerParams.xApiKey
            xEnvironmentId = v1RetrieveCustomerParams.xEnvironmentId
            additionalHeaders = v1RetrieveCustomerParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1RetrieveCustomerParams.additionalQueryParams.toBuilder()
        }

        fun refId(refId: String?) = apply { this.refId = refId }

        /** Alias for calling [Builder.refId] with `refId.orElse(null)`. */
        fun refId(refId: Optional<String>) = refId(refId.getOrNull())

        fun xApiKey(xApiKey: String) = apply { this.xApiKey = xApiKey }

        fun xEnvironmentId(xEnvironmentId: String) = apply { this.xEnvironmentId = xEnvironmentId }

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
         * Returns an immutable instance of [V1RetrieveCustomerParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .xApiKey()
         * .xEnvironmentId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1RetrieveCustomerParams =
            V1RetrieveCustomerParams(
                refId,
                checkRequired("xApiKey", xApiKey),
                checkRequired("xEnvironmentId", xEnvironmentId),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> refId ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                put("X-API-KEY", xApiKey)
                put("X-ENVIRONMENT-ID", xEnvironmentId)
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1RetrieveCustomerParams && refId == other.refId && xApiKey == other.xApiKey && xEnvironmentId == other.xEnvironmentId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(refId, xApiKey, xEnvironmentId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1RetrieveCustomerParams{refId=$refId, xApiKey=$xApiKey, xEnvironmentId=$xEnvironmentId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
