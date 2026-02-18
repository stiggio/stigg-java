// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.features

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureRetrieveFeatureResponseTest {

    @Test
    fun create() {
        val featureRetrieveFeatureResponse =
            FeatureRetrieveFeatureResponse.builder()
                .data(
                    FeatureRetrieveFeatureResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .addEnumConfiguration(
                            FeatureRetrieveFeatureResponse.Data.EnumConfiguration.builder()
                                .displayName("displayName")
                                .value("value")
                                .build()
                        )
                        .featureStatus(FeatureRetrieveFeatureResponse.Data.FeatureStatus.NEW)
                        .featureType(FeatureRetrieveFeatureResponse.Data.FeatureType.BOOLEAN)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .metadata(
                            FeatureRetrieveFeatureResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .meterType(FeatureRetrieveFeatureResponse.Data.MeterType.NONE)
                        .unitTransformation(
                            FeatureRetrieveFeatureResponse.Data.UnitTransformation.builder()
                                .divide(0.0)
                                .featureUnits("featureUnits")
                                .featureUnitsPlural("featureUnitsPlural")
                                .round(
                                    FeatureRetrieveFeatureResponse.Data.UnitTransformation.Round.UP
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(featureRetrieveFeatureResponse.data())
            .isEqualTo(
                FeatureRetrieveFeatureResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .addEnumConfiguration(
                        FeatureRetrieveFeatureResponse.Data.EnumConfiguration.builder()
                            .displayName("displayName")
                            .value("value")
                            .build()
                    )
                    .featureStatus(FeatureRetrieveFeatureResponse.Data.FeatureStatus.NEW)
                    .featureType(FeatureRetrieveFeatureResponse.Data.FeatureType.BOOLEAN)
                    .featureUnits("featureUnits")
                    .featureUnitsPlural("featureUnitsPlural")
                    .metadata(
                        FeatureRetrieveFeatureResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .meterType(FeatureRetrieveFeatureResponse.Data.MeterType.NONE)
                    .unitTransformation(
                        FeatureRetrieveFeatureResponse.Data.UnitTransformation.builder()
                            .divide(0.0)
                            .featureUnits("featureUnits")
                            .featureUnitsPlural("featureUnitsPlural")
                            .round(FeatureRetrieveFeatureResponse.Data.UnitTransformation.Round.UP)
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val featureRetrieveFeatureResponse =
            FeatureRetrieveFeatureResponse.builder()
                .data(
                    FeatureRetrieveFeatureResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .addEnumConfiguration(
                            FeatureRetrieveFeatureResponse.Data.EnumConfiguration.builder()
                                .displayName("displayName")
                                .value("value")
                                .build()
                        )
                        .featureStatus(FeatureRetrieveFeatureResponse.Data.FeatureStatus.NEW)
                        .featureType(FeatureRetrieveFeatureResponse.Data.FeatureType.BOOLEAN)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .metadata(
                            FeatureRetrieveFeatureResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .meterType(FeatureRetrieveFeatureResponse.Data.MeterType.NONE)
                        .unitTransformation(
                            FeatureRetrieveFeatureResponse.Data.UnitTransformation.builder()
                                .divide(0.0)
                                .featureUnits("featureUnits")
                                .featureUnitsPlural("featureUnitsPlural")
                                .round(
                                    FeatureRetrieveFeatureResponse.Data.UnitTransformation.Round.UP
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedFeatureRetrieveFeatureResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(featureRetrieveFeatureResponse),
                jacksonTypeRef<FeatureRetrieveFeatureResponse>(),
            )

        assertThat(roundtrippedFeatureRetrieveFeatureResponse)
            .isEqualTo(featureRetrieveFeatureResponse)
    }
}
