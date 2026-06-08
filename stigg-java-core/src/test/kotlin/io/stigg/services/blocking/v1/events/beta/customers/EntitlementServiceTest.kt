// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.beta.customers

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.events.beta.customers.entitlements.EntitlementCheckParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntitlementServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun check() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entitlementService = client.v1().events().beta().customers().entitlements()

        val response =
            entitlementService.check(
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
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        response.validate()
    }
}
