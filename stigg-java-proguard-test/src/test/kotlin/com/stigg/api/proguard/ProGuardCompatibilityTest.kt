// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.client.okhttp.StiggOkHttpClient
import com.stigg.api.core.jsonMapper
import com.stigg.api.models.v1.permissions.PermissionCheckResponse
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
        assertThat(client.v2()).isNotNull()
    }

    @Test
    fun permissionCheckResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val permissionCheckResponse =
            PermissionCheckResponse.builder().addPermittedList(true).build()

        val roundtrippedPermissionCheckResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(permissionCheckResponse),
                jacksonTypeRef<PermissionCheckResponse>(),
            )

        assertThat(roundtrippedPermissionCheckResponse).isEqualTo(permissionCheckResponse)
    }
}
