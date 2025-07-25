// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.permissions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.stigg.api.core.ExcludeMissing
import com.stigg.api.core.JsonField
import com.stigg.api.core.JsonMissing
import com.stigg.api.core.JsonValue
import com.stigg.api.core.Params
import com.stigg.api.core.checkKnown
import com.stigg.api.core.checkRequired
import com.stigg.api.core.http.Headers
import com.stigg.api.core.http.QueryParams
import com.stigg.api.core.toImmutable
import com.stigg.api.errors.StiggInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Check multiple permissions for a user */
class PermissionCheckParams
private constructor(
    private val userId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** ID of the user to check permissions for */
    fun userId(): String = userId

    /**
     * List of resources and actions to check permissions for
     *
     * @throws StiggInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resourcesAndActions(): List<ResourcesAndAction> = body.resourcesAndActions()

    /**
     * Returns the raw JSON value of [resourcesAndActions].
     *
     * Unlike [resourcesAndActions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _resourcesAndActions(): JsonField<List<ResourcesAndAction>> = body._resourcesAndActions()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PermissionCheckParams].
         *
         * The following fields are required:
         * ```java
         * .userId()
         * .resourcesAndActions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PermissionCheckParams]. */
    class Builder internal constructor() {

        private var userId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(permissionCheckParams: PermissionCheckParams) = apply {
            userId = permissionCheckParams.userId
            body = permissionCheckParams.body.toBuilder()
            additionalHeaders = permissionCheckParams.additionalHeaders.toBuilder()
            additionalQueryParams = permissionCheckParams.additionalQueryParams.toBuilder()
        }

        /** ID of the user to check permissions for */
        fun userId(userId: String) = apply { this.userId = userId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [resourcesAndActions]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** List of resources and actions to check permissions for */
        fun resourcesAndActions(resourcesAndActions: List<ResourcesAndAction>) = apply {
            body.resourcesAndActions(resourcesAndActions)
        }

        /**
         * Sets [Builder.resourcesAndActions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourcesAndActions] with a well-typed
         * `List<ResourcesAndAction>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun resourcesAndActions(resourcesAndActions: JsonField<List<ResourcesAndAction>>) = apply {
            body.resourcesAndActions(resourcesAndActions)
        }

        /**
         * Adds a single [ResourcesAndAction] to [resourcesAndActions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResourcesAndAction(resourcesAndAction: ResourcesAndAction) = apply {
            body.addResourcesAndAction(resourcesAndAction)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [PermissionCheckParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .userId()
         * .resourcesAndActions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PermissionCheckParams =
            PermissionCheckParams(
                checkRequired("userId", userId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("userId", userId)
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    private constructor(
        private val resourcesAndActions: JsonField<List<ResourcesAndAction>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("resourcesAndActions")
            @ExcludeMissing
            resourcesAndActions: JsonField<List<ResourcesAndAction>> = JsonMissing.of()
        ) : this(resourcesAndActions, mutableMapOf())

        /**
         * List of resources and actions to check permissions for
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun resourcesAndActions(): List<ResourcesAndAction> =
            resourcesAndActions.getRequired("resourcesAndActions")

        /**
         * Returns the raw JSON value of [resourcesAndActions].
         *
         * Unlike [resourcesAndActions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("resourcesAndActions")
        @ExcludeMissing
        fun _resourcesAndActions(): JsonField<List<ResourcesAndAction>> = resourcesAndActions

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .resourcesAndActions()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var resourcesAndActions: JsonField<MutableList<ResourcesAndAction>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                resourcesAndActions = body.resourcesAndActions.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** List of resources and actions to check permissions for */
            fun resourcesAndActions(resourcesAndActions: List<ResourcesAndAction>) =
                resourcesAndActions(JsonField.of(resourcesAndActions))

            /**
             * Sets [Builder.resourcesAndActions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resourcesAndActions] with a well-typed
             * `List<ResourcesAndAction>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun resourcesAndActions(resourcesAndActions: JsonField<List<ResourcesAndAction>>) =
                apply {
                    this.resourcesAndActions = resourcesAndActions.map { it.toMutableList() }
                }

            /**
             * Adds a single [ResourcesAndAction] to [resourcesAndActions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResourcesAndAction(resourcesAndAction: ResourcesAndAction) = apply {
                resourcesAndActions =
                    (resourcesAndActions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("resourcesAndActions", it).add(resourcesAndAction)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .resourcesAndActions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("resourcesAndActions", resourcesAndActions).map {
                        it.toImmutable()
                    },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            resourcesAndActions().forEach { it.validate() }
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
            (resourcesAndActions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && resourcesAndActions == other.resourcesAndActions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(resourcesAndActions, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{resourcesAndActions=$resourcesAndActions, additionalProperties=$additionalProperties}"
    }

    /** Data transfer object for resource and action pair */
    class ResourcesAndAction
    private constructor(
        private val action: JsonValue,
        private val resource: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action") @ExcludeMissing action: JsonValue = JsonMissing.of(),
            @JsonProperty("resource") @ExcludeMissing resource: JsonField<String> = JsonMissing.of(),
        ) : this(action, resource, mutableMapOf())

        /** Action to check permissions for */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonValue = action

        /**
         * Resource to check permissions for
         *
         * @throws StiggInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun resource(): String = resource.getRequired("resource")

        /**
         * Returns the raw JSON value of [resource].
         *
         * Unlike [resource], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resource") @ExcludeMissing fun _resource(): JsonField<String> = resource

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
             * Returns a mutable builder for constructing an instance of [ResourcesAndAction].
             *
             * The following fields are required:
             * ```java
             * .action()
             * .resource()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResourcesAndAction]. */
        class Builder internal constructor() {

            private var action: JsonValue? = null
            private var resource: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resourcesAndAction: ResourcesAndAction) = apply {
                action = resourcesAndAction.action
                resource = resourcesAndAction.resource
                additionalProperties = resourcesAndAction.additionalProperties.toMutableMap()
            }

            /** Action to check permissions for */
            fun action(action: JsonValue) = apply { this.action = action }

            /** Resource to check permissions for */
            fun resource(resource: String) = resource(JsonField.of(resource))

            /**
             * Sets [Builder.resource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resource] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resource(resource: JsonField<String>) = apply { this.resource = resource }

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
             * Returns an immutable instance of [ResourcesAndAction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .action()
             * .resource()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResourcesAndAction =
                ResourcesAndAction(
                    checkRequired("action", action),
                    checkRequired("resource", resource),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResourcesAndAction = apply {
            if (validated) {
                return@apply
            }

            resource()
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
        @JvmSynthetic internal fun validity(): Int = (if (resource.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResourcesAndAction && action == other.action && resource == other.resource && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(action, resource, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResourcesAndAction{action=$action, resource=$resource, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PermissionCheckParams && userId == other.userId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(userId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PermissionCheckParams{userId=$userId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
