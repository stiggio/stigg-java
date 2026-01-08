// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1

import com.stigg.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateUsageParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.usages())
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CreateUsageParams.builder()
                .addUsage(
                    V1CreateUsageParams.Usage.builder()
                        .customerId("customerId")
                        .featureId("featureId")
                        .value(-9007199254740991L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.usages())
            .containsExactly(
                V1CreateUsageParams.Usage.builder()
                    .customerId("customerId")
                    .featureId("featureId")
                    .value(-9007199254740991L)
                    .build()
            )
    }
}
