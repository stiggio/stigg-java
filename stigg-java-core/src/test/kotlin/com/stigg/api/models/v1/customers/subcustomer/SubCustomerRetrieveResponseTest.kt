// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers.subcustomer

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubCustomerRetrieveResponseTest {

    @Test
    fun create() {
        val subCustomerRetrieveResponse =
            SubCustomerRetrieveResponse.builder()
                .id("8a201c04-d133-464a-805a-7c8a0ebb509b")
                .email("john@example.com")
                .name("John Doe")
                .build()

        assertThat(subCustomerRetrieveResponse.id())
            .isEqualTo("8a201c04-d133-464a-805a-7c8a0ebb509b")
        assertThat(subCustomerRetrieveResponse.email()).contains("john@example.com")
        assertThat(subCustomerRetrieveResponse.name()).contains("John Doe")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subCustomerRetrieveResponse =
            SubCustomerRetrieveResponse.builder()
                .id("8a201c04-d133-464a-805a-7c8a0ebb509b")
                .email("john@example.com")
                .name("John Doe")
                .build()

        val roundtrippedSubCustomerRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subCustomerRetrieveResponse),
                jacksonTypeRef<SubCustomerRetrieveResponse>(),
            )

        assertThat(roundtrippedSubCustomerRetrieveResponse).isEqualTo(subCustomerRetrieveResponse)
    }
}
