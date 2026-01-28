// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.stigg.core.ExcludeMissing
import io.stigg.core.JsonField
import io.stigg.core.JsonMissing
import io.stigg.core.JsonValue
import io.stigg.core.checkKnown
import io.stigg.core.checkRequired
import io.stigg.core.toImmutable
import io.stigg.errors.StiggInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response list object */
class SubscriptionListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<SubscriptionListResponse>>,
    private val pagination: JsonField<Pagination>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<SubscriptionListResponse>> = JsonMissing.of(),
        @JsonProperty("pagination")
        @ExcludeMissing
        pagination: JsonField<Pagination> = JsonMissing.of(),
    ) : this(data, pagination, mutableMapOf())

    /**
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<SubscriptionListResponse> = data.getRequired("data")

    /**
     * Pagination metadata including cursors for navigating through results
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pagination(): Pagination = pagination.getRequired("pagination")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<List<SubscriptionListResponse>> = data

    /**
     * Returns the raw JSON value of [pagination].
     *
     * Unlike [pagination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pagination")
    @ExcludeMissing
    fun _pagination(): JsonField<Pagination> = pagination

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

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .pagination()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionListPageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<SubscriptionListResponse>>? = null
        private var pagination: JsonField<Pagination>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionListPageResponse: SubscriptionListPageResponse) = apply {
            data = subscriptionListPageResponse.data.map { it.toMutableList() }
            pagination = subscriptionListPageResponse.pagination
            additionalProperties = subscriptionListPageResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<SubscriptionListResponse>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<SubscriptionListResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun data(data: JsonField<List<SubscriptionListResponse>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [SubscriptionListResponse] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: SubscriptionListResponse) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /** Pagination metadata including cursors for navigating through results */
        fun pagination(pagination: Pagination) = pagination(JsonField.of(pagination))

        /**
         * Sets [Builder.pagination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pagination] with a well-typed [Pagination] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pagination(pagination: JsonField<Pagination>) = apply { this.pagination = pagination }

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
         * Returns an immutable instance of [SubscriptionListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .pagination()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionListPageResponse =
            SubscriptionListPageResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("pagination", pagination),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionListPageResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        pagination().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (pagination.asKnown().getOrNull()?.validity() ?: 0)

    /** Pagination metadata including cursors for navigating through results */
    class Pagination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val next: JsonField<String>,
        private val prev: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prev") @ExcludeMissing prev: JsonField<String> = JsonMissing.of(),
        ) : this(next, prev, mutableMapOf())

        /**
         * Cursor for fetching the next page of results, or null if no additional pages exist
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun next(): Optional<String> = next.getOptional("next")

        /**
         * Cursor for fetching the previous page of results, or null if at the beginning
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prev(): Optional<String> = prev.getOptional("prev")

        /**
         * Returns the raw JSON value of [next].
         *
         * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

        /**
         * Returns the raw JSON value of [prev].
         *
         * Unlike [prev], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prev") @ExcludeMissing fun _prev(): JsonField<String> = prev

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

            /**
             * Returns a mutable builder for constructing an instance of [Pagination].
             *
             * The following fields are required:
             * ```java
             * .next()
             * .prev()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pagination]. */
        class Builder internal constructor() {

            private var next: JsonField<String>? = null
            private var prev: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pagination: Pagination) = apply {
                next = pagination.next
                prev = pagination.prev
                additionalProperties = pagination.additionalProperties.toMutableMap()
            }

            /**
             * Cursor for fetching the next page of results, or null if no additional pages exist
             */
            fun next(next: String?) = next(JsonField.ofNullable(next))

            /** Alias for calling [Builder.next] with `next.orElse(null)`. */
            fun next(next: Optional<String>) = next(next.getOrNull())

            /**
             * Sets [Builder.next] to an arbitrary JSON value.
             *
             * You should usually call [Builder.next] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun next(next: JsonField<String>) = apply { this.next = next }

            /** Cursor for fetching the previous page of results, or null if at the beginning */
            fun prev(prev: String?) = prev(JsonField.ofNullable(prev))

            /** Alias for calling [Builder.prev] with `prev.orElse(null)`. */
            fun prev(prev: Optional<String>) = prev(prev.getOrNull())

            /**
             * Sets [Builder.prev] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prev] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun prev(prev: JsonField<String>) = apply { this.prev = prev }

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
             * Returns an immutable instance of [Pagination].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .next()
             * .prev()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Pagination =
                Pagination(
                    checkRequired("next", next),
                    checkRequired("prev", prev),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Pagination = apply {
            if (validated) {
                return@apply
            }

            next()
            prev()
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
            (if (next.asKnown().isPresent) 1 else 0) + (if (prev.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pagination &&
                next == other.next &&
                prev == other.prev &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(next, prev, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pagination{next=$next, prev=$prev, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionListPageResponse &&
            data == other.data &&
            pagination == other.pagination &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, pagination, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionListPageResponse{data=$data, pagination=$pagination, additionalProperties=$additionalProperties}"
}
