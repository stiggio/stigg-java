// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.credits

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyArchiveParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyCreateParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyListAssociatedEntitiesParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyUnarchiveParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomCurrencyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customCurrencyService = client.v1().credits().customCurrencies()

        val customCurrencyResponse =
            customCurrencyService.create(
                CustomCurrencyCreateParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
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

        customCurrencyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customCurrencyService = client.v1().credits().customCurrencies()

        val customCurrencyResponse =
            customCurrencyService.update(
                CustomCurrencyUpdateParams.builder()
                    .currencyId("currencyId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
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

        customCurrencyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customCurrencyService = client.v1().credits().customCurrencies()

        val page = customCurrencyService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customCurrencyService = client.v1().credits().customCurrencies()

        val customCurrencyResponse =
            customCurrencyService.archive(
                CustomCurrencyArchiveParams.builder()
                    .currencyId("currencyId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        customCurrencyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAssociatedEntities() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customCurrencyService = client.v1().credits().customCurrencies()

        val response =
            customCurrencyService.listAssociatedEntities(
                CustomCurrencyListAssociatedEntitiesParams.builder()
                    .currencyId("currencyId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unarchive() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customCurrencyService = client.v1().credits().customCurrencies()

        val customCurrencyResponse =
            customCurrencyService.unarchive(
                CustomCurrencyUnarchiveParams.builder()
                    .currencyId("currencyId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        customCurrencyResponse.validate()
    }
}
