// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListResourcesResponseTest {

    @Test
    fun create() {
        val customerListResourcesResponse =
            CustomerListResourcesResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(customerListResourcesResponse.id()).isEqualTo("id")
        assertThat(customerListResourcesResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListResourcesResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListResourcesResponse =
            CustomerListResourcesResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCustomerListResourcesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListResourcesResponse),
                jacksonTypeRef<CustomerListResourcesResponse>(),
            )

        assertThat(roundtrippedCustomerListResourcesResponse)
            .isEqualTo(customerListResourcesResponse)
    }
}
