// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.features

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureUnarchiveFeatureResponseTest {

    @Test
    fun create() {
        val featureUnarchiveFeatureResponse =
            FeatureUnarchiveFeatureResponse.builder()
                .data(
                    FeatureUnarchiveFeatureResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .addEnumConfiguration(
                            FeatureUnarchiveFeatureResponse.Data.EnumConfiguration.builder()
                                .displayName("displayName")
                                .value("value")
                                .build()
                        )
                        .featureStatus(FeatureUnarchiveFeatureResponse.Data.FeatureStatus.NEW)
                        .featureType(FeatureUnarchiveFeatureResponse.Data.FeatureType.BOOLEAN)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .metadata(
                            FeatureUnarchiveFeatureResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .meterType(FeatureUnarchiveFeatureResponse.Data.MeterType.NONE)
                        .unitTransformation(
                            FeatureUnarchiveFeatureResponse.Data.UnitTransformation.builder()
                                .divide(0.0)
                                .featureUnits("featureUnits")
                                .featureUnitsPlural("featureUnitsPlural")
                                .round(
                                    FeatureUnarchiveFeatureResponse.Data.UnitTransformation.Round.UP
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(featureUnarchiveFeatureResponse.data())
            .isEqualTo(
                FeatureUnarchiveFeatureResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .addEnumConfiguration(
                        FeatureUnarchiveFeatureResponse.Data.EnumConfiguration.builder()
                            .displayName("displayName")
                            .value("value")
                            .build()
                    )
                    .featureStatus(FeatureUnarchiveFeatureResponse.Data.FeatureStatus.NEW)
                    .featureType(FeatureUnarchiveFeatureResponse.Data.FeatureType.BOOLEAN)
                    .featureUnits("featureUnits")
                    .featureUnitsPlural("featureUnitsPlural")
                    .metadata(
                        FeatureUnarchiveFeatureResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .meterType(FeatureUnarchiveFeatureResponse.Data.MeterType.NONE)
                    .unitTransformation(
                        FeatureUnarchiveFeatureResponse.Data.UnitTransformation.builder()
                            .divide(0.0)
                            .featureUnits("featureUnits")
                            .featureUnitsPlural("featureUnitsPlural")
                            .round(FeatureUnarchiveFeatureResponse.Data.UnitTransformation.Round.UP)
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val featureUnarchiveFeatureResponse =
            FeatureUnarchiveFeatureResponse.builder()
                .data(
                    FeatureUnarchiveFeatureResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .addEnumConfiguration(
                            FeatureUnarchiveFeatureResponse.Data.EnumConfiguration.builder()
                                .displayName("displayName")
                                .value("value")
                                .build()
                        )
                        .featureStatus(FeatureUnarchiveFeatureResponse.Data.FeatureStatus.NEW)
                        .featureType(FeatureUnarchiveFeatureResponse.Data.FeatureType.BOOLEAN)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .metadata(
                            FeatureUnarchiveFeatureResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .meterType(FeatureUnarchiveFeatureResponse.Data.MeterType.NONE)
                        .unitTransformation(
                            FeatureUnarchiveFeatureResponse.Data.UnitTransformation.builder()
                                .divide(0.0)
                                .featureUnits("featureUnits")
                                .featureUnitsPlural("featureUnitsPlural")
                                .round(
                                    FeatureUnarchiveFeatureResponse.Data.UnitTransformation.Round.UP
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedFeatureUnarchiveFeatureResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(featureUnarchiveFeatureResponse),
                jacksonTypeRef<FeatureUnarchiveFeatureResponse>(),
            )

        assertThat(roundtrippedFeatureUnarchiveFeatureResponse)
            .isEqualTo(featureUnarchiveFeatureResponse)
    }
}
