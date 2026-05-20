// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.customcurrencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomCurrencyResponseTest {

    @Test
    fun create() {
        val customCurrencyResponse =
            CustomCurrencyResponse.builder()
                .data(
                    CustomCurrencyResponse.Data.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            CustomCurrencyResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .symbol("symbol")
                        .units(
                            CustomCurrencyResponse.Data.Units.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(customCurrencyResponse.data())
            .isEqualTo(
                CustomCurrencyResponse.Data.builder()
                    .id("id")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .metadata(
                        CustomCurrencyResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .symbol("symbol")
                    .units(
                        CustomCurrencyResponse.Data.Units.builder()
                            .plural("plural")
                            .singular("singular")
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customCurrencyResponse =
            CustomCurrencyResponse.builder()
                .data(
                    CustomCurrencyResponse.Data.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            CustomCurrencyResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .symbol("symbol")
                        .units(
                            CustomCurrencyResponse.Data.Units.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCustomCurrencyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customCurrencyResponse),
                jacksonTypeRef<CustomCurrencyResponse>(),
            )

        assertThat(roundtrippedCustomCurrencyResponse).isEqualTo(customCurrencyResponse)
    }
}
