// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClient
import com.stigg.api.core.JsonValue
import com.stigg.api.models.v1.permissions.PermissionCheckParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PermissionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun check() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val permissionService = client.v1().permissions()

        val response =
            permissionService.check(
                PermissionCheckParams.builder()
                    .userId("userId")
                    .addResourcesAndAction(
                        PermissionCheckParams.ResourcesAndAction.builder()
                            .action(JsonValue.from("read"))
                            .resource("product")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
