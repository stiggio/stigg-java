// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.customcurrencies

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomCurrencyCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            CustomCurrencyCreateParams.builder().id("id").displayName("displayName").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.displayName()).isEqualTo("displayName")
        assertThat(body.description()).contains("description")
        assertThat(body.metadata())
            .contains(
                CustomCurrencyCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.symbol()).contains("symbol")
        assertThat(body.units())
            .contains(
                CustomCurrencyCreateParams.Units.builder()
                    .plural("plural")
                    .singular("singular")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomCurrencyCreateParams.builder().id("id").displayName("displayName").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.displayName()).isEqualTo("displayName")
    }
}
