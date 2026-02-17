// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.features

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureCreateFeatureResponseTest {

    @Test
    fun create() {
        val featureCreateFeatureResponse =
            FeatureCreateFeatureResponse.builder()
                .data(
                    FeatureCreateFeatureResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .addEnumConfiguration(
                            FeatureCreateFeatureResponse.Data.EnumConfiguration.builder()
                                .displayName("displayName")
                                .value("value")
                                .build()
                        )
                        .featureStatus(FeatureCreateFeatureResponse.Data.FeatureStatus.NEW)
                        .featureType(FeatureCreateFeatureResponse.Data.FeatureType.BOOLEAN)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .metadata(
                            FeatureCreateFeatureResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .meterType(FeatureCreateFeatureResponse.Data.MeterType.NONE)
                        .unitTransformation(
                            FeatureCreateFeatureResponse.Data.UnitTransformation.builder()
                                .divide(0.0)
                                .featureUnits("featureUnits")
                                .featureUnitsPlural("featureUnitsPlural")
                                .round(
                                    FeatureCreateFeatureResponse.Data.UnitTransformation.Round.UP
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(featureCreateFeatureResponse.data())
            .isEqualTo(
                FeatureCreateFeatureResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .addEnumConfiguration(
                        FeatureCreateFeatureResponse.Data.EnumConfiguration.builder()
                            .displayName("displayName")
                            .value("value")
                            .build()
                    )
                    .featureStatus(FeatureCreateFeatureResponse.Data.FeatureStatus.NEW)
                    .featureType(FeatureCreateFeatureResponse.Data.FeatureType.BOOLEAN)
                    .featureUnits("featureUnits")
                    .featureUnitsPlural("featureUnitsPlural")
                    .metadata(
                        FeatureCreateFeatureResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .meterType(FeatureCreateFeatureResponse.Data.MeterType.NONE)
                    .unitTransformation(
                        FeatureCreateFeatureResponse.Data.UnitTransformation.builder()
                            .divide(0.0)
                            .featureUnits("featureUnits")
                            .featureUnitsPlural("featureUnitsPlural")
                            .round(FeatureCreateFeatureResponse.Data.UnitTransformation.Round.UP)
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val featureCreateFeatureResponse =
            FeatureCreateFeatureResponse.builder()
                .data(
                    FeatureCreateFeatureResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .addEnumConfiguration(
                            FeatureCreateFeatureResponse.Data.EnumConfiguration.builder()
                                .displayName("displayName")
                                .value("value")
                                .build()
                        )
                        .featureStatus(FeatureCreateFeatureResponse.Data.FeatureStatus.NEW)
                        .featureType(FeatureCreateFeatureResponse.Data.FeatureType.BOOLEAN)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .metadata(
                            FeatureCreateFeatureResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .meterType(FeatureCreateFeatureResponse.Data.MeterType.NONE)
                        .unitTransformation(
                            FeatureCreateFeatureResponse.Data.UnitTransformation.builder()
                                .divide(0.0)
                                .featureUnits("featureUnits")
                                .featureUnitsPlural("featureUnitsPlural")
                                .round(
                                    FeatureCreateFeatureResponse.Data.UnitTransformation.Round.UP
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedFeatureCreateFeatureResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(featureCreateFeatureResponse),
                jacksonTypeRef<FeatureCreateFeatureResponse>(),
            )

        assertThat(roundtrippedFeatureCreateFeatureResponse).isEqualTo(featureCreateFeatureResponse)
    }
}
