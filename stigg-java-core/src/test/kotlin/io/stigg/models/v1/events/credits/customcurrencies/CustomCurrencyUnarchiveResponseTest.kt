// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits.customcurrencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomCurrencyUnarchiveResponseTest {

    @Test
    fun create() {
        val customCurrencyUnarchiveResponse =
            CustomCurrencyUnarchiveResponse.builder()
                .data(
                    CustomCurrencyUnarchiveResponse.Data.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            CustomCurrencyUnarchiveResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .symbol("symbol")
                        .units(
                            CustomCurrencyUnarchiveResponse.Data.Units.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(customCurrencyUnarchiveResponse.data())
            .isEqualTo(
                CustomCurrencyUnarchiveResponse.Data.builder()
                    .id("id")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .metadata(
                        CustomCurrencyUnarchiveResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .symbol("symbol")
                    .units(
                        CustomCurrencyUnarchiveResponse.Data.Units.builder()
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
        val customCurrencyUnarchiveResponse =
            CustomCurrencyUnarchiveResponse.builder()
                .data(
                    CustomCurrencyUnarchiveResponse.Data.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .metadata(
                            CustomCurrencyUnarchiveResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .symbol("symbol")
                        .units(
                            CustomCurrencyUnarchiveResponse.Data.Units.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCustomCurrencyUnarchiveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customCurrencyUnarchiveResponse),
                jacksonTypeRef<CustomCurrencyUnarchiveResponse>(),
            )

        assertThat(roundtrippedCustomCurrencyUnarchiveResponse)
            .isEqualTo(customCurrencyUnarchiveResponse)
    }
}
