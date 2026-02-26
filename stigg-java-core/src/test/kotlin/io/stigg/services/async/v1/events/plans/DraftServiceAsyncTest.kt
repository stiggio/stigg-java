// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.plans

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DraftServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val draftServiceAsync = client.v1().events().plans().draft()

        val planFuture = draftServiceAsync.create("x")

        val plan = planFuture.get()
        plan.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val draftServiceAsync = client.v1().events().plans().draft()

        val draftFuture = draftServiceAsync.remove("x")

        val draft = draftFuture.get()
        draft.validate()
    }
}
