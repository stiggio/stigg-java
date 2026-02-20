// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.addons

import io.stigg.client.okhttp.StiggOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DraftServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createAddonDraft() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val draftService = client.v1().events().addons().draft()

        val response = draftService.createAddonDraft("x")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removeAddonDraft() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val draftService = client.v1().events().addons().draft()

        val response = draftService.removeAddonDraft("x")

        response.validate()
    }
}
