// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.features

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureListFeaturesPageResponseTest {

    @Test
    fun create() {
        val featureListFeaturesPageResponse =
            FeatureListFeaturesPageResponse.builder()
                .addData(
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
                                            FeatureListFeaturesResponse.Meter.Aggregation.Function
                                                .SUM
                                        )
                                        .field("field")
                                        .build()
                                )
                                .addFilter(
                                    FeatureListFeaturesResponse.Meter.Filter.builder()
                                        .addCondition(
                                            FeatureListFeaturesResponse.Meter.Filter.Condition
                                                .builder()
                                                .field("field")
                                                .operation(
                                                    FeatureListFeaturesResponse.Meter.Filter
                                                        .Condition
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
                )
                .pagination(
                    FeatureListFeaturesPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(featureListFeaturesPageResponse.data())
            .containsExactly(
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
            )
        assertThat(featureListFeaturesPageResponse.pagination())
            .isEqualTo(
                FeatureListFeaturesPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val featureListFeaturesPageResponse =
            FeatureListFeaturesPageResponse.builder()
                .addData(
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
                                            FeatureListFeaturesResponse.Meter.Aggregation.Function
                                                .SUM
                                        )
                                        .field("field")
                                        .build()
                                )
                                .addFilter(
                                    FeatureListFeaturesResponse.Meter.Filter.builder()
                                        .addCondition(
                                            FeatureListFeaturesResponse.Meter.Filter.Condition
                                                .builder()
                                                .field("field")
                                                .operation(
                                                    FeatureListFeaturesResponse.Meter.Filter
                                                        .Condition
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
                )
                .pagination(
                    FeatureListFeaturesPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedFeatureListFeaturesPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(featureListFeaturesPageResponse),
                jacksonTypeRef<FeatureListFeaturesPageResponse>(),
            )

        assertThat(roundtrippedFeatureListFeaturesPageResponse)
            .isEqualTo(featureListFeaturesPageResponse)
    }
}
