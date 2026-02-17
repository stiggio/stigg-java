// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.features

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureArchiveFeatureResponseTest {

    @Test
    fun create() {
        val featureArchiveFeatureResponse =
            FeatureArchiveFeatureResponse.builder()
                .data(
                    FeatureArchiveFeatureResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .addEnumConfiguration(
                            FeatureArchiveFeatureResponse.Data.EnumConfiguration.builder()
                                .displayName("displayName")
                                .value("value")
                                .build()
                        )
                        .featureStatus(FeatureArchiveFeatureResponse.Data.FeatureStatus.NEW)
                        .featureType(FeatureArchiveFeatureResponse.Data.FeatureType.BOOLEAN)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .metadata(
                            FeatureArchiveFeatureResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .meterType(FeatureArchiveFeatureResponse.Data.MeterType.NONE)
                        .unitTransformation(
                            FeatureArchiveFeatureResponse.Data.UnitTransformation.builder()
                                .divide(0.0)
                                .featureUnits("featureUnits")
                                .featureUnitsPlural("featureUnitsPlural")
                                .round(
                                    FeatureArchiveFeatureResponse.Data.UnitTransformation.Round.UP
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(featureArchiveFeatureResponse.data())
            .isEqualTo(
                FeatureArchiveFeatureResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .addEnumConfiguration(
                        FeatureArchiveFeatureResponse.Data.EnumConfiguration.builder()
                            .displayName("displayName")
                            .value("value")
                            .build()
                    )
                    .featureStatus(FeatureArchiveFeatureResponse.Data.FeatureStatus.NEW)
                    .featureType(FeatureArchiveFeatureResponse.Data.FeatureType.BOOLEAN)
                    .featureUnits("featureUnits")
                    .featureUnitsPlural("featureUnitsPlural")
                    .metadata(
                        FeatureArchiveFeatureResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .meterType(FeatureArchiveFeatureResponse.Data.MeterType.NONE)
                    .unitTransformation(
                        FeatureArchiveFeatureResponse.Data.UnitTransformation.builder()
                            .divide(0.0)
                            .featureUnits("featureUnits")
                            .featureUnitsPlural("featureUnitsPlural")
                            .round(FeatureArchiveFeatureResponse.Data.UnitTransformation.Round.UP)
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val featureArchiveFeatureResponse =
            FeatureArchiveFeatureResponse.builder()
                .data(
                    FeatureArchiveFeatureResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .addEnumConfiguration(
                            FeatureArchiveFeatureResponse.Data.EnumConfiguration.builder()
                                .displayName("displayName")
                                .value("value")
                                .build()
                        )
                        .featureStatus(FeatureArchiveFeatureResponse.Data.FeatureStatus.NEW)
                        .featureType(FeatureArchiveFeatureResponse.Data.FeatureType.BOOLEAN)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .metadata(
                            FeatureArchiveFeatureResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .meterType(FeatureArchiveFeatureResponse.Data.MeterType.NONE)
                        .unitTransformation(
                            FeatureArchiveFeatureResponse.Data.UnitTransformation.builder()
                                .divide(0.0)
                                .featureUnits("featureUnits")
                                .featureUnitsPlural("featureUnitsPlural")
                                .round(
                                    FeatureArchiveFeatureResponse.Data.UnitTransformation.Round.UP
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedFeatureArchiveFeatureResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(featureArchiveFeatureResponse),
                jacksonTypeRef<FeatureArchiveFeatureResponse>(),
            )

        assertThat(roundtrippedFeatureArchiveFeatureResponse)
            .isEqualTo(featureArchiveFeatureResponse)
    }
}
