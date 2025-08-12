// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v2

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClientAsync
import com.stigg.api.core.JsonValue
import com.stigg.api.models.v2.permissions.PermissionCheckParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PermissionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun check() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val permissionServiceAsync = client.v2().permissions()

        val responseFuture =
            permissionServiceAsync.check(
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

        val response = responseFuture.get()
        response.validate()
    }
}
