// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class V1RetrieveCustomerResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val v1RetrieveCustomerResponse =
            V1RetrieveCustomerResponse.builder()
                .id("8a201c04-d133-464a-805a-7c8a0ebb509b")
                .email("john@example.com")
                .name("John Doe")
                .build()

        assertThat(v1RetrieveCustomerResponse.id())
            .isEqualTo("8a201c04-d133-464a-805a-7c8a0ebb509b")
        assertThat(v1RetrieveCustomerResponse.email()).contains("john@example.com")
        assertThat(v1RetrieveCustomerResponse.name()).contains("John Doe")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1RetrieveCustomerResponse =
            V1RetrieveCustomerResponse.builder()
                .id("8a201c04-d133-464a-805a-7c8a0ebb509b")
                .email("john@example.com")
                .name("John Doe")
                .build()

        val roundtrippedV1RetrieveCustomerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1RetrieveCustomerResponse),
                jacksonTypeRef<V1RetrieveCustomerResponse>(),
            )

        assertThat(roundtrippedV1RetrieveCustomerResponse).isEqualTo(v1RetrieveCustomerResponse)
    }
}
