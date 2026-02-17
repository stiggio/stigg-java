// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.events.addons.AddonCreateAddonParams
import io.stigg.models.v1.events.addons.AddonPublishAddonParams
import io.stigg.models.v1.events.addons.AddonUpdateAddonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AddonServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun archiveAddon() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addonService = client.v1().events().addons()

        val response = addonService.archiveAddon("x")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createAddon() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addonService = client.v1().events().addons()

        val response =
            addonService.createAddon(
                AddonCreateAddonParams.builder()
                    .id("id")
                    .displayName("displayName")
                    .productId("productId")
                    .billingId("billingId")
                    .description("description")
                    .maxQuantity(1L)
                    .metadata(
                        AddonCreateAddonParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pricingType(AddonCreateAddonParams.PricingType.FREE)
                    .status(AddonCreateAddonParams.Status.DRAFT)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listAddons() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addonService = client.v1().events().addons()

        val page = addonService.listAddons()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun publishAddon() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addonService = client.v1().events().addons()

        val response =
            addonService.publishAddon(
                AddonPublishAddonParams.builder()
                    .id("x")
                    .migrationType(AddonPublishAddonParams.MigrationType.NEW_CUSTOMERS)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAddon() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addonService = client.v1().events().addons()

        val response = addonService.retrieveAddon("x")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateAddon() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addonService = client.v1().events().addons()

        val response =
            addonService.updateAddon(
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

        response.validate()
    }
}
