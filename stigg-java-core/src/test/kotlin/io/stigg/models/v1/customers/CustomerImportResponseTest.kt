// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerImportResponseTest {

    @Test
    fun create() {
        val customerImportResponse =
            CustomerImportResponse.builder()
                .data(CustomerImportResponse.Data.builder().addNewCustomer("string").build())
                .build()

        assertThat(customerImportResponse.data())
            .isEqualTo(CustomerImportResponse.Data.builder().addNewCustomer("string").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerImportResponse =
            CustomerImportResponse.builder()
                .data(CustomerImportResponse.Data.builder().addNewCustomer("string").build())
                .build()

        val roundtrippedCustomerImportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerImportResponse),
                jacksonTypeRef<CustomerImportResponse>(),
            )

        assertThat(roundtrippedCustomerImportResponse).isEqualTo(customerImportResponse)
    }
}
