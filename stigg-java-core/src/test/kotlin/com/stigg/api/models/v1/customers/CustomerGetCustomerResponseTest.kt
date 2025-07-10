// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerGetCustomerResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val customerGetCustomerResponse =
            CustomerGetCustomerResponse.builder()
                .id("8a201c04-d133-464a-805a-7c8a0ebb509b")
                .email("john@example.com")
                .name("John Doe")
                .build()

        assertThat(customerGetCustomerResponse.id())
            .isEqualTo("8a201c04-d133-464a-805a-7c8a0ebb509b")
        assertThat(customerGetCustomerResponse.email()).contains("john@example.com")
        assertThat(customerGetCustomerResponse.name()).contains("John Doe")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerGetCustomerResponse =
            CustomerGetCustomerResponse.builder()
                .id("8a201c04-d133-464a-805a-7c8a0ebb509b")
                .email("john@example.com")
                .name("John Doe")
                .build()

        val roundtrippedCustomerGetCustomerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerGetCustomerResponse),
                jacksonTypeRef<CustomerGetCustomerResponse>(),
            )

        assertThat(roundtrippedCustomerGetCustomerResponse).isEqualTo(customerGetCustomerResponse)
    }
}
