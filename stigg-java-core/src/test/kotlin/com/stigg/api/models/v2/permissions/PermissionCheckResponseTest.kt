// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v2.permissions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PermissionCheckResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val permissionCheckResponse =
            PermissionCheckResponse.builder().addPermittedList(true).build()

        assertThat(permissionCheckResponse.permittedList()).containsExactly(true)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val permissionCheckResponse =
            PermissionCheckResponse.builder().addPermittedList(true).build()

        val roundtrippedPermissionCheckResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(permissionCheckResponse),
                jacksonTypeRef<PermissionCheckResponse>(),
            )

        assertThat(roundtrippedPermissionCheckResponse).isEqualTo(permissionCheckResponse)
    }
}
