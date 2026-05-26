// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.entities

import com.fasterxml.jackson.annotation.JsonCreator
import io.stigg.core.Enum
import io.stigg.core.JsonField
import io.stigg.core.Params
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.errors.StiggInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves a paginated list of entities for the given customer. */
class EntityListParams
private constructor(
    private val id: String?,
    private val after: String?,
    private val before: String?,
    private val includeArchived: IncludeArchived?,
    private val limit: Long?,
    private val typeRefId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Return items that come after this cursor */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** Return items that come before this cursor */
    fun before(): Optional<String> = Optional.ofNullable(before)

    /** Whether to include archived entities. One of: true, false */
    fun includeArchived(): Optional<IncludeArchived> = Optional.ofNullable(includeArchived)

    /** Maximum number of items to return */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter results to entities of a specific entity type, by the type's refId */
    fun typeRefId(): Optional<String> = Optional.ofNullable(typeRefId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EntityListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EntityListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntityListParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var after: String? = null
        private var before: String? = null
        private var includeArchived: IncludeArchived? = null
        private var limit: Long? = null
        private var typeRefId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(entityListParams: EntityListParams) = apply {
            id = entityListParams.id
            after = entityListParams.after
            before = entityListParams.before
            includeArchived = entityListParams.includeArchived
            limit = entityListParams.limit
            typeRefId = entityListParams.typeRefId
            additionalHeaders = entityListParams.additionalHeaders.toBuilder()
            additionalQueryParams = entityListParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Return items that come after this cursor */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** Return items that come before this cursor */
        fun before(before: String?) = apply { this.before = before }

        /** Alias for calling [Builder.before] with `before.orElse(null)`. */
        fun before(before: Optional<String>) = before(before.getOrNull())

        /** Whether to include archived entities. One of: true, false */
        fun includeArchived(includeArchived: IncludeArchived?) = apply {
            this.includeArchived = includeArchived
        }

        /** Alias for calling [Builder.includeArchived] with `includeArchived.orElse(null)`. */
        fun includeArchived(includeArchived: Optional<IncludeArchived>) =
            includeArchived(includeArchived.getOrNull())

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

        /** Filter results to entities of a specific entity type, by the type's refId */
        fun typeRefId(typeRefId: String?) = apply { this.typeRefId = typeRefId }

        /** Alias for calling [Builder.typeRefId] with `typeRefId.orElse(null)`. */
        fun typeRefId(typeRefId: Optional<String>) = typeRefId(typeRefId.getOrNull())

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
         * Returns an immutable instance of [EntityListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EntityListParams =
            EntityListParams(
                id,
                after,
                before,
                includeArchived,
                limit,
                typeRefId,
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
                after?.let { put("after", it) }
                before?.let { put("before", it) }
                includeArchived?.let { put("includeArchived", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                typeRefId?.let { put("typeRefId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Whether to include archived entities. One of: true, false */
    class IncludeArchived @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmStatic fun of(value: String) = IncludeArchived(JsonField.of(value))
        }

        /** An enum containing [IncludeArchived]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
        }

        /**
         * An enum containing [IncludeArchived]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [IncludeArchived] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            /**
             * An enum member indicating that [IncludeArchived] was instantiated with an unknown
             * value.
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                else -> throw StiggInvalidDataException("Unknown IncludeArchived: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws StiggInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): IncludeArchived = apply {
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

            return other is IncludeArchived && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityListParams &&
            id == other.id &&
            after == other.after &&
            before == other.before &&
            includeArchived == other.includeArchived &&
            limit == other.limit &&
            typeRefId == other.typeRefId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            after,
            before,
            includeArchived,
            limit,
            typeRefId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EntityListParams{id=$id, after=$after, before=$before, includeArchived=$includeArchived, limit=$limit, typeRefId=$typeRefId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
