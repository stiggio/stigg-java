// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerImportParamsTest {

    @Test
    fun create() {
        CustomerImportParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .addCustomer(
                CustomerImportParams.Customer.builder()
                    .id("id")
                    .email("dev@stainless.com")
                    .name("name")
                    .billingId("billingId")
                    .metadata(
                        CustomerImportParams.Customer.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .paymentMethodId("paymentMethodId")
                    .salesforceId("salesforceId")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .integrationId("integrationId")
            .build()
    }

    @Test
    fun headers() {
        val params =
            CustomerImportParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addCustomer(
                    CustomerImportParams.Customer.builder()
                        .id("id")
                        .email("dev@stainless.com")
                        .name("name")
                        .billingId("billingId")
                        .metadata(
                            CustomerImportParams.Customer.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentMethodId("paymentMethodId")
                        .salesforceId("salesforceId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .integrationId("integrationId")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
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

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CustomerImportParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addCustomer(
                    CustomerImportParams.Customer.builder()
                        .id("id")
                        .email("dev@stainless.com")
                        .name("name")
                        .billingId("billingId")
                        .metadata(
                            CustomerImportParams.Customer.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentMethodId("paymentMethodId")
                        .salesforceId("salesforceId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .integrationId("integrationId")
                .build()

        val body = params._body()

        assertThat(body.customers())
            .containsExactly(
                CustomerImportParams.Customer.builder()
                    .id("id")
                    .email("dev@stainless.com")
                    .name("name")
                    .billingId("billingId")
                    .metadata(
                        CustomerImportParams.Customer.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .paymentMethodId("paymentMethodId")
                    .salesforceId("salesforceId")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(body.integrationId()).contains("integrationId")
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
