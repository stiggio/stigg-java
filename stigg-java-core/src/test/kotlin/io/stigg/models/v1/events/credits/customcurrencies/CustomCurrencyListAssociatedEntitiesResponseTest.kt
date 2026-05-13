// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits.customcurrencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomCurrencyListAssociatedEntitiesResponseTest {

    @Test
    fun create() {
        val customCurrencyListAssociatedEntitiesResponse =
            CustomCurrencyListAssociatedEntitiesResponse.builder()
                .addData(
                    CustomCurrencyListAssociatedEntitiesResponse.Data.builder()
                        .id("id")
                        .displayName("displayName")
                        .type("type")
                        .build()
                )
                .build()

        assertThat(customCurrencyListAssociatedEntitiesResponse.data())
            .containsExactly(
                CustomCurrencyListAssociatedEntitiesResponse.Data.builder()
                    .id("id")
                    .displayName("displayName")
                    .type("type")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customCurrencyListAssociatedEntitiesResponse =
            CustomCurrencyListAssociatedEntitiesResponse.builder()
                .addData(
                    CustomCurrencyListAssociatedEntitiesResponse.Data.builder()
                        .id("id")
                        .displayName("displayName")
                        .type("type")
                        .build()
                )
                .build()

        val roundtrippedCustomCurrencyListAssociatedEntitiesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customCurrencyListAssociatedEntitiesResponse),
                jacksonTypeRef<CustomCurrencyListAssociatedEntitiesResponse>(),
            )

        assertThat(roundtrippedCustomCurrencyListAssociatedEntitiesResponse)
            .isEqualTo(customCurrencyListAssociatedEntitiesResponse)
    }
}
