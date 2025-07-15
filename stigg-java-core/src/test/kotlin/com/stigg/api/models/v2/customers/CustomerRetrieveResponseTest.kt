// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v2.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val customerRetrieveResponse =
            CustomerRetrieveResponse.builder()
                .id("8a201c04-d133-464a-805a-7c8a0ebb509b")
                .email("john@example.com")
                .name("John Doe")
                .build()

        assertThat(customerRetrieveResponse.id()).isEqualTo("8a201c04-d133-464a-805a-7c8a0ebb509b")
        assertThat(customerRetrieveResponse.email()).contains("john@example.com")
        assertThat(customerRetrieveResponse.name()).contains("John Doe")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerRetrieveResponse =
            CustomerRetrieveResponse.builder()
                .id("8a201c04-d133-464a-805a-7c8a0ebb509b")
                .email("john@example.com")
                .name("John Doe")
                .build()

        val roundtrippedCustomerRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerRetrieveResponse),
                jacksonTypeRef<CustomerRetrieveResponse>(),
            )

        assertThat(roundtrippedCustomerRetrieveResponse).isEqualTo(customerRetrieveResponse)
    }
}
