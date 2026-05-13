// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits.customcurrencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomCurrencyListResponseTest {

    @Test
    fun create() {
        val customCurrencyListResponse =
            CustomCurrencyListResponse.builder()
                .id("id")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .displayName("displayName")
                .metadata(
                    CustomCurrencyListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .symbol("symbol")
                .units(
                    CustomCurrencyListResponse.Units.builder()
                        .plural("plural")
                        .singular("singular")
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(customCurrencyListResponse.id()).isEqualTo("id")
        assertThat(customCurrencyListResponse.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customCurrencyListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customCurrencyListResponse.description()).contains("description")
        assertThat(customCurrencyListResponse.displayName()).isEqualTo("displayName")
        assertThat(customCurrencyListResponse.metadata())
            .isEqualTo(
                CustomCurrencyListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customCurrencyListResponse.symbol()).contains("symbol")
        assertThat(customCurrencyListResponse.units())
            .contains(
                CustomCurrencyListResponse.Units.builder()
                    .plural("plural")
                    .singular("singular")
                    .build()
            )
        assertThat(customCurrencyListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customCurrencyListResponse =
            CustomCurrencyListResponse.builder()
                .id("id")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .displayName("displayName")
                .metadata(
                    CustomCurrencyListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .symbol("symbol")
                .units(
                    CustomCurrencyListResponse.Units.builder()
                        .plural("plural")
                        .singular("singular")
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCustomCurrencyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customCurrencyListResponse),
                jacksonTypeRef<CustomCurrencyListResponse>(),
            )

        assertThat(roundtrippedCustomCurrencyListResponse).isEqualTo(customCurrencyListResponse)
    }
}
