// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.customcurrencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomCurrencyListPageResponseTest {

    @Test
    fun create() {
        val customCurrencyListPageResponse =
            CustomCurrencyListPageResponse.builder()
                .addData(
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
                )
                .pagination(
                    CustomCurrencyListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(customCurrencyListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(customCurrencyListPageResponse.pagination())
            .isEqualTo(
                CustomCurrencyListPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customCurrencyListPageResponse =
            CustomCurrencyListPageResponse.builder()
                .addData(
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
                )
                .pagination(
                    CustomCurrencyListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedCustomCurrencyListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customCurrencyListPageResponse),
                jacksonTypeRef<CustomCurrencyListPageResponse>(),
            )

        assertThat(roundtrippedCustomCurrencyListPageResponse)
            .isEqualTo(customCurrencyListPageResponse)
    }
}
