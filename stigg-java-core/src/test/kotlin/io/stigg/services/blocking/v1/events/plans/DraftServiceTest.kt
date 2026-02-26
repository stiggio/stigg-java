// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.plans

import io.stigg.client.okhttp.StiggOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DraftServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val draftService = client.v1().events().plans().draft()

        val plan = draftService.create("x")

        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val draftService = client.v1().events().plans().draft()

        val draft = draftService.remove("x")

        draft.validate()
    }
}
