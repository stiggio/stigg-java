// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SetPackagePricingResponseTest {

    @Test
    fun create() {
        val setPackagePricingResponse =
            SetPackagePricingResponse.builder()
                .data(
                    SetPackagePricingResponse.Data.builder()
                        .id("id")
                        .pricingType(SetPackagePricingResponse.Data.PricingType.FREE)
                        .build()
                )
                .build()

        assertThat(setPackagePricingResponse.data())
            .isEqualTo(
                SetPackagePricingResponse.Data.builder()
                    .id("id")
                    .pricingType(SetPackagePricingResponse.Data.PricingType.FREE)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val setPackagePricingResponse =
            SetPackagePricingResponse.builder()
                .data(
                    SetPackagePricingResponse.Data.builder()
                        .id("id")
                        .pricingType(SetPackagePricingResponse.Data.PricingType.FREE)
                        .build()
                )
                .build()

        val roundtrippedSetPackagePricingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(setPackagePricingResponse),
                jacksonTypeRef<SetPackagePricingResponse>(),
            )

        assertThat(roundtrippedSetPackagePricingResponse).isEqualTo(setPackagePricingResponse)
    }
}
