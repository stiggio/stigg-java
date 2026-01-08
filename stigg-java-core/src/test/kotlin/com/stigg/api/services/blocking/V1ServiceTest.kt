// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClient
import com.stigg.api.core.JsonValue
import com.stigg.api.models.v1.V1CreateEventParams
import com.stigg.api.models.v1.V1CreateUsageParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createEvent() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.v1()

        val response =
            v1Service.createEvent(
                V1CreateEventParams.builder()
                    .addEvent(
                        V1CreateEventParams.Event.builder()
                            .customerId("customerId")
                            .eventName("x")
                            .idempotencyKey("x")
                            .dimensions(
                                V1CreateEventParams.Event.Dimensions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .resourceId("resourceId")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createUsage() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.v1()

        val response =
            v1Service.createUsage(
                V1CreateUsageParams.builder()
                    .addUsage(
                        V1CreateUsageParams.Usage.builder()
                            .customerId("customerId")
                            .featureId("featureId")
                            .value(-9007199254740991L)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .dimensions(
                                V1CreateUsageParams.Usage.Dimensions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .resourceId("resourceId")
                            .updateBehavior(V1CreateUsageParams.Usage.UpdateBehavior.DELTA)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
