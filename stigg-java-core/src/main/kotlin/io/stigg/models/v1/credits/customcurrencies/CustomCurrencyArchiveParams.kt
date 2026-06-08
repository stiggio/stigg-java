// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.customcurrencies

import io.stigg.core.JsonValue
import io.stigg.core.Params
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Archives a custom currency. Fails if the currency is still associated with any active plan or
 * addon — use the associated-entities endpoint first to inspect dependencies.
 */
class CustomCurrencyArchiveParams
private constructor(
    private val currencyId: String?,
    private val xAccountId: String?,
    private val xEnvironmentId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun currencyId(): Optional<String> = Optional.ofNullable(currencyId)

    fun xAccountId(): Optional<String> = Optional.ofNullable(xAccountId)

    fun xEnvironmentId(): Optional<String> = Optional.ofNullable(xEnvironmentId)

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CustomCurrencyArchiveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [CustomCurrencyArchiveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomCurrencyArchiveParams]. */
    class Builder internal constructor() {

        private var currencyId: String? = null
        private var xAccountId: String? = null
        private var xEnvironmentId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customCurrencyArchiveParams: CustomCurrencyArchiveParams) = apply {
            currencyId = customCurrencyArchiveParams.currencyId
            xAccountId = customCurrencyArchiveParams.xAccountId
            xEnvironmentId = customCurrencyArchiveParams.xEnvironmentId
            additionalHeaders = customCurrencyArchiveParams.additionalHeaders.toBuilder()
            additionalQueryParams = customCurrencyArchiveParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                customCurrencyArchiveParams.additionalBodyProperties.toMutableMap()
        }

        fun currencyId(currencyId: String?) = apply { this.currencyId = currencyId }

        /** Alias for calling [Builder.currencyId] with `currencyId.orElse(null)`. */
        fun currencyId(currencyId: Optional<String>) = currencyId(currencyId.getOrNull())

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [CustomCurrencyArchiveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomCurrencyArchiveParams =
            CustomCurrencyArchiveParams(
                currencyId,
                xAccountId,
                xEnvironmentId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> currencyId ?: ""
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

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomCurrencyArchiveParams &&
            currencyId == other.currencyId &&
            xAccountId == other.xAccountId &&
            xEnvironmentId == other.xEnvironmentId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(
            currencyId,
            xAccountId,
            xEnvironmentId,
            additionalHeaders,
            additionalQueryParams,
            additionalBodyProperties,
        )

    override fun toString() =
        "CustomCurrencyArchiveParams{currencyId=$currencyId, xAccountId=$xAccountId, xEnvironmentId=$xEnvironmentId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
