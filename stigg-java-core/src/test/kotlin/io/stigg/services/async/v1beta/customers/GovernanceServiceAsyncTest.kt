// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1beta.customers

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GovernanceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val governanceServiceAsync = client.v1Beta().customers().governance()

        val pageFuture = governanceServiceAsync.list("id")

        val page = pageFuture.get()
        page.response().validate()
    }
}
