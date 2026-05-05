// File generated from our OpenAPI spec by Stainless.

package io.stigg.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.jsonMapper
import io.stigg.models.v1.customers.CustomerIntegrationResponse
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
        assertThat(client.internal_()).isNotNull()
    }

    @Test
    fun customerIntegrationResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerIntegrationResponse =
            CustomerIntegrationResponse.builder()
                .data(
                    CustomerIntegrationResponse.Data.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(CustomerIntegrationResponse.Data.VendorIdentifier.AUTH0)
                        .syncData(
                            CustomerIntegrationResponse.Data.SyncData.SyncRevisionPriceBillingData
                                .builder()
                                .billingId("billingId")
                                .billingLinkUrl("billingLinkUrl")
                                .priceGroupPackageBillingId("priceGroupPackageBillingId")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCustomerIntegrationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerIntegrationResponse),
                jacksonTypeRef<CustomerIntegrationResponse>(),
            )

        assertThat(roundtrippedCustomerIntegrationResponse).isEqualTo(customerIntegrationResponse)
    }
}
