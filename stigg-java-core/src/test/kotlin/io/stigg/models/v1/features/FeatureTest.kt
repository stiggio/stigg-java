// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.features

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureTest {

    @Test
    fun create() {
        val feature =
            Feature.builder()
                .data(
                    Feature.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .addEnumConfiguration(
                            Feature.Data.EnumConfiguration.builder()
                                .displayName("displayName")
                                .value("value")
                                .build()
                        )
                        .featureStatus(Feature.Data.FeatureStatus.NEW)
                        .featureType(Feature.Data.FeatureType.BOOLEAN)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .metadata(
                            Feature.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .meter(
                            Feature.Data.Meter.builder()
                                .aggregation(
                                    Feature.Data.Meter.Aggregation.builder()
                                        .function(Feature.Data.Meter.Aggregation.Function.SUM)
                                        .field("field")
                                        .build()
                                )
                                .addFilter(
                                    Feature.Data.Meter.Filter.builder()
                                        .addCondition(
                                            Feature.Data.Meter.Filter.Condition.builder()
                                                .field("field")
                                                .operation(
                                                    Feature.Data.Meter.Filter.Condition.Operation
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
                        .meterType(Feature.Data.MeterType.NONE)
                        .unitTransformation(
                            Feature.Data.UnitTransformation.builder()
                                .divide(0.0)
                                .featureUnits("featureUnits")
                                .featureUnitsPlural("featureUnitsPlural")
                                .round(Feature.Data.UnitTransformation.Round.UP)
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(feature.data())
            .isEqualTo(
                Feature.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .addEnumConfiguration(
                        Feature.Data.EnumConfiguration.builder()
                            .displayName("displayName")
                            .value("value")
                            .build()
                    )
                    .featureStatus(Feature.Data.FeatureStatus.NEW)
                    .featureType(Feature.Data.FeatureType.BOOLEAN)
                    .featureUnits("featureUnits")
                    .featureUnitsPlural("featureUnitsPlural")
                    .metadata(
                        Feature.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .meter(
                        Feature.Data.Meter.builder()
                            .aggregation(
                                Feature.Data.Meter.Aggregation.builder()
                                    .function(Feature.Data.Meter.Aggregation.Function.SUM)
                                    .field("field")
                                    .build()
                            )
                            .addFilter(
                                Feature.Data.Meter.Filter.builder()
                                    .addCondition(
                                        Feature.Data.Meter.Filter.Condition.builder()
                                            .field("field")
                                            .operation(
                                                Feature.Data.Meter.Filter.Condition.Operation.EQUALS
                                            )
                                            .value("value")
                                            .addValue("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .meterType(Feature.Data.MeterType.NONE)
                    .unitTransformation(
                        Feature.Data.UnitTransformation.builder()
                            .divide(0.0)
                            .featureUnits("featureUnits")
                            .featureUnitsPlural("featureUnitsPlural")
                            .round(Feature.Data.UnitTransformation.Round.UP)
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feature =
            Feature.builder()
                .data(
                    Feature.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .addEnumConfiguration(
                            Feature.Data.EnumConfiguration.builder()
                                .displayName("displayName")
                                .value("value")
                                .build()
                        )
                        .featureStatus(Feature.Data.FeatureStatus.NEW)
                        .featureType(Feature.Data.FeatureType.BOOLEAN)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .metadata(
                            Feature.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .meter(
                            Feature.Data.Meter.builder()
                                .aggregation(
                                    Feature.Data.Meter.Aggregation.builder()
                                        .function(Feature.Data.Meter.Aggregation.Function.SUM)
                                        .field("field")
                                        .build()
                                )
                                .addFilter(
                                    Feature.Data.Meter.Filter.builder()
                                        .addCondition(
                                            Feature.Data.Meter.Filter.Condition.builder()
                                                .field("field")
                                                .operation(
                                                    Feature.Data.Meter.Filter.Condition.Operation
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
                        .meterType(Feature.Data.MeterType.NONE)
                        .unitTransformation(
                            Feature.Data.UnitTransformation.builder()
                                .divide(0.0)
                                .featureUnits("featureUnits")
                                .featureUnitsPlural("featureUnitsPlural")
                                .round(Feature.Data.UnitTransformation.Round.UP)
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedFeature =
            jsonMapper.readValue(jsonMapper.writeValueAsString(feature), jacksonTypeRef<Feature>())

        assertThat(roundtrippedFeature).isEqualTo(feature)
    }
}
