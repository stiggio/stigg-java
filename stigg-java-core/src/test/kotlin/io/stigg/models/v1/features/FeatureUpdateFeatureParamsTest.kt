// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.features

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureUpdateFeatureParamsTest {

    @Test
    fun create() {
        FeatureUpdateFeatureParams.builder()
            .id("x")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .description("description")
            .displayName("displayName")
            .addEnumConfiguration(
                FeatureUpdateFeatureParams.EnumConfiguration.builder()
                    .displayName("displayName")
                    .value("value")
                    .build()
            )
            .featureUnits("featureUnits")
            .featureUnitsPlural("featureUnitsPlural")
            .metadata(
                FeatureUpdateFeatureParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .meter(
                FeatureUpdateFeatureParams.Meter.builder()
                    .aggregation(
                        FeatureUpdateFeatureParams.Meter.Aggregation.builder()
                            .function(FeatureUpdateFeatureParams.Meter.Aggregation.Function.SUM)
                            .field("field")
                            .build()
                    )
                    .addFilter(
                        FeatureUpdateFeatureParams.Meter.Filter.builder()
                            .addCondition(
                                FeatureUpdateFeatureParams.Meter.Filter.Condition.builder()
                                    .field("field")
                                    .operation(
                                        FeatureUpdateFeatureParams.Meter.Filter.Condition.Operation
                                            .EQUALS
                                    )
                                    .value("value")
                                    .addValue("string")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .unitTransformation(
                FeatureUpdateFeatureParams.UnitTransformation.builder()
                    .divide(0L)
                    .featureUnits("featureUnits")
                    .featureUnitsPlural("featureUnitsPlural")
                    .round(FeatureUpdateFeatureParams.UnitTransformation.Round.UP)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = FeatureUpdateFeatureParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            FeatureUpdateFeatureParams.builder()
                .id("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .description("description")
                .displayName("displayName")
                .addEnumConfiguration(
                    FeatureUpdateFeatureParams.EnumConfiguration.builder()
                        .displayName("displayName")
                        .value("value")
                        .build()
                )
                .featureUnits("featureUnits")
                .featureUnitsPlural("featureUnitsPlural")
                .metadata(
                    FeatureUpdateFeatureParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .meter(
                    FeatureUpdateFeatureParams.Meter.builder()
                        .aggregation(
                            FeatureUpdateFeatureParams.Meter.Aggregation.builder()
                                .function(FeatureUpdateFeatureParams.Meter.Aggregation.Function.SUM)
                                .field("field")
                                .build()
                        )
                        .addFilter(
                            FeatureUpdateFeatureParams.Meter.Filter.builder()
                                .addCondition(
                                    FeatureUpdateFeatureParams.Meter.Filter.Condition.builder()
                                        .field("field")
                                        .operation(
                                            FeatureUpdateFeatureParams.Meter.Filter.Condition
                                                .Operation
                                                .EQUALS
                                        )
                                        .value("value")
                                        .addValue("string")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .unitTransformation(
                    FeatureUpdateFeatureParams.UnitTransformation.builder()
                        .divide(0L)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .round(FeatureUpdateFeatureParams.UnitTransformation.Round.UP)
                        .build()
                )
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
        val params = FeatureUpdateFeatureParams.builder().id("x").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            FeatureUpdateFeatureParams.builder()
                .id("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .description("description")
                .displayName("displayName")
                .addEnumConfiguration(
                    FeatureUpdateFeatureParams.EnumConfiguration.builder()
                        .displayName("displayName")
                        .value("value")
                        .build()
                )
                .featureUnits("featureUnits")
                .featureUnitsPlural("featureUnitsPlural")
                .metadata(
                    FeatureUpdateFeatureParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .meter(
                    FeatureUpdateFeatureParams.Meter.builder()
                        .aggregation(
                            FeatureUpdateFeatureParams.Meter.Aggregation.builder()
                                .function(FeatureUpdateFeatureParams.Meter.Aggregation.Function.SUM)
                                .field("field")
                                .build()
                        )
                        .addFilter(
                            FeatureUpdateFeatureParams.Meter.Filter.builder()
                                .addCondition(
                                    FeatureUpdateFeatureParams.Meter.Filter.Condition.builder()
                                        .field("field")
                                        .operation(
                                            FeatureUpdateFeatureParams.Meter.Filter.Condition
                                                .Operation
                                                .EQUALS
                                        )
                                        .value("value")
                                        .addValue("string")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .unitTransformation(
                    FeatureUpdateFeatureParams.UnitTransformation.builder()
                        .divide(0L)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .round(FeatureUpdateFeatureParams.UnitTransformation.Round.UP)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.displayName()).contains("displayName")
        assertThat(body.enumConfiguration().getOrNull())
            .containsExactly(
                FeatureUpdateFeatureParams.EnumConfiguration.builder()
                    .displayName("displayName")
                    .value("value")
                    .build()
            )
        assertThat(body.featureUnits()).contains("featureUnits")
        assertThat(body.featureUnitsPlural()).contains("featureUnitsPlural")
        assertThat(body.metadata())
            .contains(
                FeatureUpdateFeatureParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.meter())
            .contains(
                FeatureUpdateFeatureParams.Meter.builder()
                    .aggregation(
                        FeatureUpdateFeatureParams.Meter.Aggregation.builder()
                            .function(FeatureUpdateFeatureParams.Meter.Aggregation.Function.SUM)
                            .field("field")
                            .build()
                    )
                    .addFilter(
                        FeatureUpdateFeatureParams.Meter.Filter.builder()
                            .addCondition(
                                FeatureUpdateFeatureParams.Meter.Filter.Condition.builder()
                                    .field("field")
                                    .operation(
                                        FeatureUpdateFeatureParams.Meter.Filter.Condition.Operation
                                            .EQUALS
                                    )
                                    .value("value")
                                    .addValue("string")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.unitTransformation())
            .contains(
                FeatureUpdateFeatureParams.UnitTransformation.builder()
                    .divide(0L)
                    .featureUnits("featureUnits")
                    .featureUnitsPlural("featureUnitsPlural")
                    .round(FeatureUpdateFeatureParams.UnitTransformation.Round.UP)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FeatureUpdateFeatureParams.builder().id("x").build()

        val body = params._body()
    }
}
