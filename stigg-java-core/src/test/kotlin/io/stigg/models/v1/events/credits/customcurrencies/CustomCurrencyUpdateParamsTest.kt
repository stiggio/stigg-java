// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits.customcurrencies

import io.stigg.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomCurrencyUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params = CustomCurrencyUpdateParams.builder().currencyId("currencyId").build()

        assertThat(params._pathParam(0)).isEqualTo("currencyId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.displayName()).contains("displayName")
        assertThat(body.metadata())
            .contains(
                CustomCurrencyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.symbol()).contains("symbol")
        assertThat(body.units())
            .contains(
                CustomCurrencyUpdateParams.Units.builder()
                    .plural("plural")
                    .singular("singular")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomCurrencyUpdateParams.builder().currencyId("currencyId").build()

        val body = params._body()
    }
}
