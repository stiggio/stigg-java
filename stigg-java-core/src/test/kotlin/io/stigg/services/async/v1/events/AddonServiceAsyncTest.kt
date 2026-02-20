// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.events.addons.AddonCreateAddonParams
import io.stigg.models.v1.events.addons.AddonPublishAddonParams
import io.stigg.models.v1.events.addons.AddonUpdateAddonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AddonServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun archiveAddon() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val responseFuture = addonServiceAsync.archiveAddon("x")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createAddon() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val responseFuture =
            addonServiceAsync.createAddon(
                AddonCreateAddonParams.builder()
                    .id("id")
                    .displayName("displayName")
                    .productId("productId")
                    .billingId("billingId")
                    .description("description")
                    .maxQuantity(0L)
                    .metadata(
                        AddonCreateAddonParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pricingType(AddonCreateAddonParams.PricingType.FREE)
                    .status(AddonCreateAddonParams.Status.DRAFT)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listAddons() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val pageFuture = addonServiceAsync.listAddons()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun publishAddon() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val responseFuture =
            addonServiceAsync.publishAddon(
                AddonPublishAddonParams.builder()
                    .id("x")
                    .migrationType(AddonPublishAddonParams.MigrationType.NEW_CUSTOMERS)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAddon() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val responseFuture = addonServiceAsync.retrieveAddon("x")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateAddon() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addonServiceAsync = client.v1().events().addons()

        val responseFuture =
            addonServiceAsync.updateAddon(
                AddonUpdateAddonParams.builder()
                    .id("x")
                    .billingId("billingId")
                    .addDependency("string")
                    .description("description")
                    .displayName("displayName")
                    .maxQuantity(0L)
                    .metadata(
                        AddonUpdateAddonParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
