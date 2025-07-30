// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v2.permissions

import com.stigg.api.core.JsonValue
import com.stigg.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionCheckParamsTest {

    @Test
    fun create() {
        PermissionCheckParams.builder()
            .userId("userId")
            .addResourcesAndAction(
                PermissionCheckParams.ResourcesAndAction.builder()
                    .action(JsonValue.from("read"))
                    .resource("product")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PermissionCheckParams.builder()
                .userId("userId")
                .addResourcesAndAction(
                    PermissionCheckParams.ResourcesAndAction.builder()
                        .action(JsonValue.from("read"))
                        .resource("product")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("userId", "userId").build())
    }

    @Test
    fun body() {
        val params =
            PermissionCheckParams.builder()
                .userId("userId")
                .addResourcesAndAction(
                    PermissionCheckParams.ResourcesAndAction.builder()
                        .action(JsonValue.from("read"))
                        .resource("product")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.resourcesAndActions())
            .containsExactly(
                PermissionCheckParams.ResourcesAndAction.builder()
                    .action(JsonValue.from("read"))
                    .resource("product")
                    .build()
            )
    }
}
