// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v2.permissions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.stigg.api.core.ExcludeMissing
import com.stigg.api.core.JsonField
import com.stigg.api.core.JsonMissing
import com.stigg.api.core.JsonValue
import com.stigg.api.core.checkKnown
import com.stigg.api.core.checkRequired
import com.stigg.api.core.toImmutable
import com.stigg.api.errors.StiggInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Response for checking permissions */
class PermissionCheckResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val permittedList: JsonField<List<Boolean>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("permittedList")
        @ExcludeMissing
        permittedList: JsonField<List<Boolean>> = JsonMissing.of()
    ) : this(permittedList, mutableMapOf())

    /**
     * List of booleans indicating whether the user has access to each resource and action
     * correspondingly
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun permittedList(): List<Boolean> = permittedList.getRequired("permittedList")

    /**
     * Returns the raw JSON value of [permittedList].
     *
     * Unlike [permittedList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permittedList")
    @ExcludeMissing
    fun _permittedList(): JsonField<List<Boolean>> = permittedList

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
         * Returns a mutable builder for constructing an instance of [PermissionCheckResponse].
         *
         * The following fields are required:
         * ```java
         * .permittedList()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PermissionCheckResponse]. */
    class Builder internal constructor() {

        private var permittedList: JsonField<MutableList<Boolean>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(permissionCheckResponse: PermissionCheckResponse) = apply {
            permittedList = permissionCheckResponse.permittedList.map { it.toMutableList() }
            additionalProperties = permissionCheckResponse.additionalProperties.toMutableMap()
        }

        /**
         * List of booleans indicating whether the user has access to each resource and action
         * correspondingly
         */
        fun permittedList(permittedList: List<Boolean>) = permittedList(JsonField.of(permittedList))

        /**
         * Sets [Builder.permittedList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permittedList] with a well-typed `List<Boolean>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permittedList(permittedList: JsonField<List<Boolean>>) = apply {
            this.permittedList = permittedList.map { it.toMutableList() }
        }

        /**
         * Adds a single [Boolean] to [Builder.permittedList].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPermittedList(permittedList: Boolean) = apply {
            this.permittedList =
                (this.permittedList ?: JsonField.of(mutableListOf())).also {
                    checkKnown("permittedList", it).add(permittedList)
                }
        }

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
         * Returns an immutable instance of [PermissionCheckResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .permittedList()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PermissionCheckResponse =
            PermissionCheckResponse(
                checkRequired("permittedList", permittedList).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PermissionCheckResponse = apply {
        if (validated) {
            return@apply
        }

        permittedList()
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
    @JvmSynthetic internal fun validity(): Int = (permittedList.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PermissionCheckResponse &&
            permittedList == other.permittedList &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(permittedList, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PermissionCheckResponse{permittedList=$permittedList, additionalProperties=$additionalProperties}"
}
