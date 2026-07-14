// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers

import com.fasterxml.jackson.annotation.JsonCreator
import io.stigg.core.Enum
import io.stigg.core.JsonField
import io.stigg.core.Params
import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Queries the customer's governance hierarchy tree, returning a cursor-paginated list of nodes with
 * their usage configuration (limit, cadence, scope) and current usage, sortable and filterable by
 * usage. Each node carries `parentId` so the tree can be rebuilt client-side. Usage is read from a
 * periodically-refreshed read model and never gates access.
 */
class CustomerRetrieveGovernanceParams
private constructor(
    private val id: String?,
    private val after: String?,
    private val currencyIds: List<String>?,
    private val entityIdSearch: String?,
    private val entityTypeIds: List<String>?,
    private val featureIds: List<String>?,
    private val limit: Long?,
    private val minUtilization: Double?,
    private val order: Order?,
    private val scope: Scope?,
    private val sortBy: SortBy?,
    private val xAccountId: String?,
    private val xEnvironmentId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Return items that come after this cursor */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /**
     * Currency ids to include, repeated per value (e.g. `?currencyIds=credits`). Omit both
     * featureIds and currencyIds for tree mode.
     */
    fun currencyIds(): Optional<List<String>> = Optional.ofNullable(currencyIds)

    /** Case-insensitive substring match on the entity id (`%`/`_` matched literally). */
    fun entityIdSearch(): Optional<String> = Optional.ofNullable(entityIdSearch)

    /**
     * Filter to one or more entity types, repeated per value (e.g.
     * `?entityTypeIds=team&entityTypeIds=user`).
     */
    fun entityTypeIds(): Optional<List<String>> = Optional.ofNullable(entityTypeIds)

    /**
     * Feature ids to include, repeated per value (e.g. `?featureIds=ai-tokens&featureIds=seats`).
     * Omit both featureIds and currencyIds for tree mode — every node in the hierarchy with no
     * usage configuration attached.
     */
    fun featureIds(): Optional<List<String>> = Optional.ofNullable(featureIds)

    /** Maximum number of items to return */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Only nodes with utilization ≥ this value (e.g. 0.8 for ≥80%, 1 for at/over limit). */
    fun minUtilization(): Optional<Double> = Optional.ofNullable(minUtilization)

    /** Sort direction: `asc` or `desc` (default `desc`). */
    fun order(): Optional<Order> = Optional.ofNullable(order)

    /**
     * Filter by configuration scope: `all` (default), `nodeWide` (`[]` only), or `scoped`
     * (non-empty only).
     */
    fun scope(): Optional<Scope> = Optional.ofNullable(scope)

    /**
     * Sort key: `utilization` (default, cross-capability-safe), `currentUsage`, `usageLimit`,
     * `scopeSize`, `id`, or `createdAt`.
     */
    fun sortBy(): Optional<SortBy> = Optional.ofNullable(sortBy)

    fun xAccountId(): Optional<String> = Optional.ofNullable(xAccountId)

    fun xEnvironmentId(): Optional<String> = Optional.ofNullable(xEnvironmentId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CustomerRetrieveGovernanceParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerRetrieveGovernanceParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerRetrieveGovernanceParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var after: String? = null
        private var currencyIds: MutableList<String>? = null
        private var entityIdSearch: String? = null
        private var entityTypeIds: MutableList<String>? = null
        private var featureIds: MutableList<String>? = null
        private var limit: Long? = null
        private var minUtilization: Double? = null
        private var order: Order? = null
        private var scope: Scope? = null
        private var sortBy: SortBy? = null
        private var xAccountId: String? = null
        private var xEnvironmentId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerRetrieveGovernanceParams: CustomerRetrieveGovernanceParams) =
            apply {
                id = customerRetrieveGovernanceParams.id
                after = customerRetrieveGovernanceParams.after
                currencyIds = customerRetrieveGovernanceParams.currencyIds?.toMutableList()
                entityIdSearch = customerRetrieveGovernanceParams.entityIdSearch
                entityTypeIds = customerRetrieveGovernanceParams.entityTypeIds?.toMutableList()
                featureIds = customerRetrieveGovernanceParams.featureIds?.toMutableList()
                limit = customerRetrieveGovernanceParams.limit
                minUtilization = customerRetrieveGovernanceParams.minUtilization
                order = customerRetrieveGovernanceParams.order
                scope = customerRetrieveGovernanceParams.scope
                sortBy = customerRetrieveGovernanceParams.sortBy
                xAccountId = customerRetrieveGovernanceParams.xAccountId
                xEnvironmentId = customerRetrieveGovernanceParams.xEnvironmentId
                additionalHeaders = customerRetrieveGovernanceParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    customerRetrieveGovernanceParams.additionalQueryParams.toBuilder()
            }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Return items that come after this cursor */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /**
         * Currency ids to include, repeated per value (e.g. `?currencyIds=credits`). Omit both
         * featureIds and currencyIds for tree mode.
         */
        fun currencyIds(currencyIds: List<String>?) = apply {
            this.currencyIds = currencyIds?.toMutableList()
        }

        /** Alias for calling [Builder.currencyIds] with `currencyIds.orElse(null)`. */
        fun currencyIds(currencyIds: Optional<List<String>>) = currencyIds(currencyIds.getOrNull())

        /**
         * Adds a single [String] to [currencyIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCurrencyId(currencyId: String) = apply {
            currencyIds = (currencyIds ?: mutableListOf()).apply { add(currencyId) }
        }

        /** Case-insensitive substring match on the entity id (`%`/`_` matched literally). */
        fun entityIdSearch(entityIdSearch: String?) = apply { this.entityIdSearch = entityIdSearch }

        /** Alias for calling [Builder.entityIdSearch] with `entityIdSearch.orElse(null)`. */
        fun entityIdSearch(entityIdSearch: Optional<String>) =
            entityIdSearch(entityIdSearch.getOrNull())

        /**
         * Filter to one or more entity types, repeated per value (e.g.
         * `?entityTypeIds=team&entityTypeIds=user`).
         */
        fun entityTypeIds(entityTypeIds: List<String>?) = apply {
            this.entityTypeIds = entityTypeIds?.toMutableList()
        }

        /** Alias for calling [Builder.entityTypeIds] with `entityTypeIds.orElse(null)`. */
        fun entityTypeIds(entityTypeIds: Optional<List<String>>) =
            entityTypeIds(entityTypeIds.getOrNull())

        /**
         * Adds a single [String] to [entityTypeIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntityTypeId(entityTypeId: String) = apply {
            entityTypeIds = (entityTypeIds ?: mutableListOf()).apply { add(entityTypeId) }
        }

        /**
         * Feature ids to include, repeated per value (e.g.
         * `?featureIds=ai-tokens&featureIds=seats`). Omit both featureIds and currencyIds for tree
         * mode — every node in the hierarchy with no usage configuration attached.
         */
        fun featureIds(featureIds: List<String>?) = apply {
            this.featureIds = featureIds?.toMutableList()
        }

        /** Alias for calling [Builder.featureIds] with `featureIds.orElse(null)`. */
        fun featureIds(featureIds: Optional<List<String>>) = featureIds(featureIds.getOrNull())

        /**
         * Adds a single [String] to [featureIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeatureId(featureId: String) = apply {
            featureIds = (featureIds ?: mutableListOf()).apply { add(featureId) }
        }

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

        /** Only nodes with utilization ≥ this value (e.g. 0.8 for ≥80%, 1 for at/over limit). */
        fun minUtilization(minUtilization: Double?) = apply { this.minUtilization = minUtilization }

        /**
         * Alias for [Builder.minUtilization].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minUtilization(minUtilization: Double) = minUtilization(minUtilization as Double?)

        /** Alias for calling [Builder.minUtilization] with `minUtilization.orElse(null)`. */
        fun minUtilization(minUtilization: Optional<Double>) =
            minUtilization(minUtilization.getOrNull())

        /** Sort direction: `asc` or `desc` (default `desc`). */
        fun order(order: Order?) = apply { this.order = order }

        /** Alias for calling [Builder.order] with `order.orElse(null)`. */
        fun order(order: Optional<Order>) = order(order.getOrNull())

        /**
         * Filter by configuration scope: `all` (default), `nodeWide` (`[]` only), or `scoped`
         * (non-empty only).
         */
        fun scope(scope: Scope?) = apply { this.scope = scope }

        /** Alias for calling [Builder.scope] with `scope.orElse(null)`. */
        fun scope(scope: Optional<Scope>) = scope(scope.getOrNull())

        /**
         * Sort key: `utilization` (default, cross-capability-safe), `currentUsage`, `usageLimit`,
         * `scopeSize`, `id`, or `createdAt`.
         */
        fun sortBy(sortBy: SortBy?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<SortBy>) = sortBy(sortBy.getOrNull())

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
         * Returns an immutable instance of [CustomerRetrieveGovernanceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerRetrieveGovernanceParams =
            CustomerRetrieveGovernanceParams(
                id,
                after,
                currencyIds?.toImmutable(),
                entityIdSearch,
                entityTypeIds?.toImmutable(),
                featureIds?.toImmutable(),
                limit,
                minUtilization,
                order,
                scope,
                sortBy,
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
                after?.let { put("after", it) }
                currencyIds?.let { put("currencyIds", it.joinToString(",")) }
                entityIdSearch?.let { put("entityIdSearch", it) }
                entityTypeIds?.let { put("entityTypeIds", it.joinToString(",")) }
                featureIds?.let { put("featureIds", it.joinToString(",")) }
                limit?.let { put("limit", it.toString()) }
                minUtilization?.let { put("minUtilization", it.toString()) }
                order?.let { put("order", it.toString()) }
                scope?.let { put("scope", it.toString()) }
                sortBy?.let { put("sortBy", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Sort direction: `asc` or `desc` (default `desc`). */
    class Order @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ASC = of("asc")

            @JvmField val DESC = of("desc")

            @JvmStatic fun of(value: String) = Order(JsonField.of(value))
        }

        /** An enum containing [Order]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [Order]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Order] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /** An enum member indicating that [Order] was instantiated with an unknown value. */
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
                ASC -> Value.ASC
                DESC -> Value.DESC
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
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw StiggInvalidDataException("Unknown Order: $value")
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
        fun validate(): Order = apply {
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

            return other is Order && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Filter by configuration scope: `all` (default), `nodeWide` (`[]` only), or `scoped`
     * (non-empty only).
     */
    class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ALL = of("all")

            @JvmField val NODE_WIDE = of("nodeWide")

            @JvmField val SCOPED = of("scoped")

            @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
        }

        /** An enum containing [Scope]'s known values. */
        enum class Known {
            ALL,
            NODE_WIDE,
            SCOPED,
        }

        /**
         * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Scope] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL,
            NODE_WIDE,
            SCOPED,
            /** An enum member indicating that [Scope] was instantiated with an unknown value. */
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
                ALL -> Value.ALL
                NODE_WIDE -> Value.NODE_WIDE
                SCOPED -> Value.SCOPED
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
                ALL -> Known.ALL
                NODE_WIDE -> Known.NODE_WIDE
                SCOPED -> Known.SCOPED
                else -> throw StiggInvalidDataException("Unknown Scope: $value")
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
        fun validate(): Scope = apply {
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

            return other is Scope && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Sort key: `utilization` (default, cross-capability-safe), `currentUsage`, `usageLimit`,
     * `scopeSize`, `id`, or `createdAt`.
     */
    class SortBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val UTILIZATION = of("utilization")

            @JvmField val CURRENT_USAGE = of("currentUsage")

            @JvmField val USAGE_LIMIT = of("usageLimit")

            @JvmField val SCOPE_SIZE = of("scopeSize")

            @JvmField val ID = of("id")

            @JvmField val CREATED_AT = of("createdAt")

            @JvmStatic fun of(value: String) = SortBy(JsonField.of(value))
        }

        /** An enum containing [SortBy]'s known values. */
        enum class Known {
            UTILIZATION,
            CURRENT_USAGE,
            USAGE_LIMIT,
            SCOPE_SIZE,
            ID,
            CREATED_AT,
        }

        /**
         * An enum containing [SortBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UTILIZATION,
            CURRENT_USAGE,
            USAGE_LIMIT,
            SCOPE_SIZE,
            ID,
            CREATED_AT,
            /** An enum member indicating that [SortBy] was instantiated with an unknown value. */
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
                UTILIZATION -> Value.UTILIZATION
                CURRENT_USAGE -> Value.CURRENT_USAGE
                USAGE_LIMIT -> Value.USAGE_LIMIT
                SCOPE_SIZE -> Value.SCOPE_SIZE
                ID -> Value.ID
                CREATED_AT -> Value.CREATED_AT
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
                UTILIZATION -> Known.UTILIZATION
                CURRENT_USAGE -> Known.CURRENT_USAGE
                USAGE_LIMIT -> Known.USAGE_LIMIT
                SCOPE_SIZE -> Known.SCOPE_SIZE
                ID -> Known.ID
                CREATED_AT -> Known.CREATED_AT
                else -> throw StiggInvalidDataException("Unknown SortBy: $value")
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
        fun validate(): SortBy = apply {
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

            return other is SortBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerRetrieveGovernanceParams &&
            id == other.id &&
            after == other.after &&
            currencyIds == other.currencyIds &&
            entityIdSearch == other.entityIdSearch &&
            entityTypeIds == other.entityTypeIds &&
            featureIds == other.featureIds &&
            limit == other.limit &&
            minUtilization == other.minUtilization &&
            order == other.order &&
            scope == other.scope &&
            sortBy == other.sortBy &&
            xAccountId == other.xAccountId &&
            xEnvironmentId == other.xEnvironmentId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            after,
            currencyIds,
            entityIdSearch,
            entityTypeIds,
            featureIds,
            limit,
            minUtilization,
            order,
            scope,
            sortBy,
            xAccountId,
            xEnvironmentId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CustomerRetrieveGovernanceParams{id=$id, after=$after, currencyIds=$currencyIds, entityIdSearch=$entityIdSearch, entityTypeIds=$entityTypeIds, featureIds=$featureIds, limit=$limit, minUtilization=$minUtilization, order=$order, scope=$scope, sortBy=$sortBy, xAccountId=$xAccountId, xEnvironmentId=$xEnvironmentId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
