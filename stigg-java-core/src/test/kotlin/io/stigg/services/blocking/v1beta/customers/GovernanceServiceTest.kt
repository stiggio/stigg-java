// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1beta.customers

import io.stigg.client.okhttp.StiggOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GovernanceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val governanceService = client.v1Beta().customers().governance()

        val page = governanceService.list("id")

        page.response().validate()
    }
}
