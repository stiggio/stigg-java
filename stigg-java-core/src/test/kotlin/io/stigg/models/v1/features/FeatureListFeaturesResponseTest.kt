// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.features

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureListFeaturesResponseTest {

    @Test
    fun create() {
        val featureListFeaturesResponse =
            FeatureListFeaturesResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .displayName("displayName")
                .addEnumConfiguration(
                    FeatureListFeaturesResponse.EnumConfiguration.builder()
                        .displayName("displayName")
                        .value("value")
                        .build()
                )
                .featureStatus(FeatureListFeaturesResponse.FeatureStatus.NEW)
                .featureType(FeatureListFeaturesResponse.FeatureType.BOOLEAN)
                .featureUnits("featureUnits")
                .featureUnitsPlural("featureUnitsPlural")
                .metadata(
                    FeatureListFeaturesResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .meter(
                    FeatureListFeaturesResponse.Meter.builder()
                        .aggregation(
                            FeatureListFeaturesResponse.Meter.Aggregation.builder()
                                .function(
                                    FeatureListFeaturesResponse.Meter.Aggregation.Function.SUM
                                )
                                .field("field")
                                .build()
                        )
                        .addFilter(
                            FeatureListFeaturesResponse.Meter.Filter.builder()
                                .addCondition(
                                    FeatureListFeaturesResponse.Meter.Filter.Condition.builder()
                                        .field("field")
                                        .operation(
                                            FeatureListFeaturesResponse.Meter.Filter.Condition
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
                .meterType(FeatureListFeaturesResponse.MeterType.NONE)
                .unitTransformation(
                    FeatureListFeaturesResponse.UnitTransformation.builder()
                        .divide(0.0)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .round(FeatureListFeaturesResponse.UnitTransformation.Round.UP)
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(featureListFeaturesResponse.id()).isEqualTo("id")
        assertThat(featureListFeaturesResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(featureListFeaturesResponse.description()).contains("description")
        assertThat(featureListFeaturesResponse.displayName()).isEqualTo("displayName")
        assertThat(featureListFeaturesResponse.enumConfiguration().getOrNull())
            .containsExactly(
                FeatureListFeaturesResponse.EnumConfiguration.builder()
                    .displayName("displayName")
                    .value("value")
                    .build()
            )
        assertThat(featureListFeaturesResponse.featureStatus())
            .isEqualTo(FeatureListFeaturesResponse.FeatureStatus.NEW)
        assertThat(featureListFeaturesResponse.featureType())
            .isEqualTo(FeatureListFeaturesResponse.FeatureType.BOOLEAN)
        assertThat(featureListFeaturesResponse.featureUnits()).contains("featureUnits")
        assertThat(featureListFeaturesResponse.featureUnitsPlural()).contains("featureUnitsPlural")
        assertThat(featureListFeaturesResponse.metadata())
            .isEqualTo(
                FeatureListFeaturesResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(featureListFeaturesResponse.meter())
            .contains(
                FeatureListFeaturesResponse.Meter.builder()
                    .aggregation(
                        FeatureListFeaturesResponse.Meter.Aggregation.builder()
                            .function(FeatureListFeaturesResponse.Meter.Aggregation.Function.SUM)
                            .field("field")
                            .build()
                    )
                    .addFilter(
                        FeatureListFeaturesResponse.Meter.Filter.builder()
                            .addCondition(
                                FeatureListFeaturesResponse.Meter.Filter.Condition.builder()
                                    .field("field")
                                    .operation(
                                        FeatureListFeaturesResponse.Meter.Filter.Condition.Operation
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
        assertThat(featureListFeaturesResponse.meterType())
            .isEqualTo(FeatureListFeaturesResponse.MeterType.NONE)
        assertThat(featureListFeaturesResponse.unitTransformation())
            .contains(
                FeatureListFeaturesResponse.UnitTransformation.builder()
                    .divide(0.0)
                    .featureUnits("featureUnits")
                    .featureUnitsPlural("featureUnitsPlural")
                    .round(FeatureListFeaturesResponse.UnitTransformation.Round.UP)
                    .build()
            )
        assertThat(featureListFeaturesResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val featureListFeaturesResponse =
            FeatureListFeaturesResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .displayName("displayName")
                .addEnumConfiguration(
                    FeatureListFeaturesResponse.EnumConfiguration.builder()
                        .displayName("displayName")
                        .value("value")
                        .build()
                )
                .featureStatus(FeatureListFeaturesResponse.FeatureStatus.NEW)
                .featureType(FeatureListFeaturesResponse.FeatureType.BOOLEAN)
                .featureUnits("featureUnits")
                .featureUnitsPlural("featureUnitsPlural")
                .metadata(
                    FeatureListFeaturesResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .meter(
                    FeatureListFeaturesResponse.Meter.builder()
                        .aggregation(
                            FeatureListFeaturesResponse.Meter.Aggregation.builder()
                                .function(
                                    FeatureListFeaturesResponse.Meter.Aggregation.Function.SUM
                                )
                                .field("field")
                                .build()
                        )
                        .addFilter(
                            FeatureListFeaturesResponse.Meter.Filter.builder()
                                .addCondition(
                                    FeatureListFeaturesResponse.Meter.Filter.Condition.builder()
                                        .field("field")
                                        .operation(
                                            FeatureListFeaturesResponse.Meter.Filter.Condition
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
                .meterType(FeatureListFeaturesResponse.MeterType.NONE)
                .unitTransformation(
                    FeatureListFeaturesResponse.UnitTransformation.builder()
                        .divide(0.0)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .round(FeatureListFeaturesResponse.UnitTransformation.Round.UP)
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedFeatureListFeaturesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(featureListFeaturesResponse),
                jacksonTypeRef<FeatureListFeaturesResponse>(),
            )

        assertThat(roundtrippedFeatureListFeaturesResponse).isEqualTo(featureListFeaturesResponse)
    }
}
