// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.credits

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyArchiveParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyCreateParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyListAssociatedEntitiesParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyUnarchiveParams
import io.stigg.models.v1.credits.customcurrencies.CustomCurrencyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomCurrencyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customCurrencyServiceAsync = client.v1().credits().customCurrencies()

        val customCurrencyResponseFuture =
            customCurrencyServiceAsync.create(
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

        val customCurrencyResponse = customCurrencyResponseFuture.get()
        customCurrencyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customCurrencyServiceAsync = client.v1().credits().customCurrencies()

        val customCurrencyResponseFuture =
            customCurrencyServiceAsync.update(
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

        val customCurrencyResponse = customCurrencyResponseFuture.get()
        customCurrencyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customCurrencyServiceAsync = client.v1().credits().customCurrencies()

        val pageFuture = customCurrencyServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customCurrencyServiceAsync = client.v1().credits().customCurrencies()

        val customCurrencyResponseFuture =
            customCurrencyServiceAsync.archive(
                CustomCurrencyArchiveParams.builder()
                    .currencyId("currencyId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val customCurrencyResponse = customCurrencyResponseFuture.get()
        customCurrencyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAssociatedEntities() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customCurrencyServiceAsync = client.v1().credits().customCurrencies()

        val responseFuture =
            customCurrencyServiceAsync.listAssociatedEntities(
                CustomCurrencyListAssociatedEntitiesParams.builder()
                    .currencyId("currencyId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unarchive() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customCurrencyServiceAsync = client.v1().credits().customCurrencies()

        val customCurrencyResponseFuture =
            customCurrencyServiceAsync.unarchive(
                CustomCurrencyUnarchiveParams.builder()
                    .currencyId("currencyId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val customCurrencyResponse = customCurrencyResponseFuture.get()
        customCurrencyResponse.validate()
    }
}
