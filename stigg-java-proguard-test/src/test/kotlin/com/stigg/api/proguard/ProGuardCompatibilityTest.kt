// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.client.okhttp.StiggOkHttpClient
import com.stigg.api.core.JsonValue
import com.stigg.api.core.jsonMapper
import com.stigg.api.models.v1.customers.CustomerResponse
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/stigg-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.v1()).isNotNull()
    }

    @Test
    fun customerResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerResponse =
            CustomerResponse.builder()
                .data(
                    CustomerResponse.Data.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .couponId("couponId")
                        .defaultPaymentMethod(
                            CustomerResponse.Data.DefaultPaymentMethod.builder()
                                .billingId("billingId")
                                .cardExpiryMonth(0.0)
                                .cardExpiryYear(0.0)
                                .cardLast4Digits("cardLast4Digits")
                                .type(CustomerResponse.Data.DefaultPaymentMethod.Type.CARD)
                                .build()
                        )
                        .email("dev@stainless.com")
                        .addIntegration(
                            CustomerResponse.Data.Integration.builder()
                                .id("id")
                                .syncedEntityId("syncedEntityId")
                                .vendorIdentifier(
                                    CustomerResponse.Data.Integration.VendorIdentifier.AUTH0
                                )
                                .build()
                        )
                        .metadata(
                            CustomerResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedCustomerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerResponse),
                jacksonTypeRef<CustomerResponse>(),
            )

        assertThat(roundtrippedCustomerResponse).isEqualTo(customerResponse)
    }
}
