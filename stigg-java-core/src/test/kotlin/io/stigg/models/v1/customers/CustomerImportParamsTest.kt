// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerImportParamsTest {

    @Test
    fun create() {
        CustomerImportParams.builder()
            .addCustomer(
                CustomerImportParams.Customer.builder()
                    .id("id")
                    .email("dev@stainless.com")
                    .name("name")
                    .metadata(
                        CustomerImportParams.Customer.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .paymentMethodId("paymentMethodId")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerImportParams.builder()
                .addCustomer(
                    CustomerImportParams.Customer.builder()
                        .id("id")
                        .email("dev@stainless.com")
                        .name("name")
                        .metadata(
                            CustomerImportParams.Customer.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentMethodId("paymentMethodId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.customers())
            .containsExactly(
                CustomerImportParams.Customer.builder()
                    .id("id")
                    .email("dev@stainless.com")
                    .name("name")
                    .metadata(
                        CustomerImportParams.Customer.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .paymentMethodId("paymentMethodId")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerImportParams.builder()
                .addCustomer(
                    CustomerImportParams.Customer.builder()
                        .id("id")
                        .email("dev@stainless.com")
                        .name("name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.customers())
            .containsExactly(
                CustomerImportParams.Customer.builder()
                    .id("id")
                    .email("dev@stainless.com")
                    .name("name")
                    .build()
            )
    }
}
