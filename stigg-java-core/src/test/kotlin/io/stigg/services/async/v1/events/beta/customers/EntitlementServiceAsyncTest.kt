// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.beta.customers

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.events.beta.customers.entitlements.EntitlementCheckParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntitlementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun check() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().events().beta().customers().entitlements()

        val responseFuture =
            entitlementServiceAsync.check(
                EntitlementCheckParams.builder()
                    .id("x")
                    .currencyId("x")
                    .dimensions(
                        EntitlementCheckParams.Dimensions.builder()
                            .putAdditionalProperty("foo", "string")
                            .build()
                    )
                    .featureId("x")
                    .requestedUsage(0L)
                    .addRequestedValue("string")
                    .resourceId("x")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
