// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.addons

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DraftServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createAddonDraft() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val draftServiceAsync = client.v1().events().addons().draft()

        val responseFuture = draftServiceAsync.createAddonDraft("x")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removeAddonDraft() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val draftServiceAsync = client.v1().events().addons().draft()

        val responseFuture = draftServiceAsync.removeAddonDraft("x")

        val response = responseFuture.get()
        response.validate()
    }
}
