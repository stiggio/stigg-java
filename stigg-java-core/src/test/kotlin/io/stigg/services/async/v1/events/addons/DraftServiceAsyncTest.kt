// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.addons

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DraftServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAddonDraft() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val draftServiceAsync = client.v1().events().addons().draft()

        val addonFuture = draftServiceAsync.createAddonDraft("x")

        val addon = addonFuture.get()
        addon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun removeAddonDraft() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val draftServiceAsync = client.v1().events().addons().draft()

        val responseFuture = draftServiceAsync.removeAddonDraft("x")

        val response = responseFuture.get()
        response.validate()
    }
}
