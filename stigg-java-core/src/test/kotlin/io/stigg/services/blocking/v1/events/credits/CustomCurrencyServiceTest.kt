// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.credits

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyCreateParams
import io.stigg.models.v1.events.credits.customcurrencies.CustomCurrencyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomCurrencyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customCurrencyService = client.v1().events().credits().customCurrencies()

        val customCurrency =
            customCurrencyService.create(
                CustomCurrencyCreateParams.builder()
                    .id("id")
                    .displayName("displayName")
                    .description("description")
                    .metadata(
                        CustomCurrencyCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .symbol("symbol")
                    .units(
                        CustomCurrencyCreateParams.Units.builder()
                            .plural("plural")
                            .singular("singular")
                            .build()
                    )
                    .build()
            )

        customCurrency.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customCurrencyService = client.v1().events().credits().customCurrencies()

        val customCurrency =
            customCurrencyService.update(
                CustomCurrencyUpdateParams.builder()
                    .currencyId("currencyId")
                    .description("description")
                    .displayName("displayName")
                    .metadata(
                        CustomCurrencyUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .symbol("symbol")
                    .units(
                        CustomCurrencyUpdateParams.Units.builder()
                            .plural("plural")
                            .singular("singular")
                            .build()
                    )
                    .build()
            )

        customCurrency.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customCurrencyService = client.v1().events().credits().customCurrencies()

        val page = customCurrencyService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customCurrencyService = client.v1().events().credits().customCurrencies()

        val response = customCurrencyService.archive("currencyId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAssociatedEntities() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customCurrencyService = client.v1().events().credits().customCurrencies()

        val response = customCurrencyService.listAssociatedEntities("currencyId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unarchive() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customCurrencyService = client.v1().events().credits().customCurrencies()

        val response = customCurrencyService.unarchive("currencyId")

        response.validate()
    }
}
