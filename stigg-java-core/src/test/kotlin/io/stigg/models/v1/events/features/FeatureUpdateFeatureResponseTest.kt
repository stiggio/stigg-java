// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.features

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureUpdateFeatureResponseTest {

    @Test
    fun create() {
        val featureUpdateFeatureResponse =
            FeatureUpdateFeatureResponse.builder()
                .data(
                    FeatureUpdateFeatureResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .addEnumConfiguration(
                            FeatureUpdateFeatureResponse.Data.EnumConfiguration.builder()
                                .displayName("displayName")
                                .value("value")
                                .build()
                        )
                        .featureStatus(FeatureUpdateFeatureResponse.Data.FeatureStatus.NEW)
                        .featureType(FeatureUpdateFeatureResponse.Data.FeatureType.BOOLEAN)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .metadata(
                            FeatureUpdateFeatureResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .meterType(FeatureUpdateFeatureResponse.Data.MeterType.NONE)
                        .unitTransformation(
                            FeatureUpdateFeatureResponse.Data.UnitTransformation.builder()
                                .divide(0.0)
                                .featureUnits("featureUnits")
                                .featureUnitsPlural("featureUnitsPlural")
                                .round(
                                    FeatureUpdateFeatureResponse.Data.UnitTransformation.Round.UP
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(featureUpdateFeatureResponse.data())
            .isEqualTo(
                FeatureUpdateFeatureResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .displayName("displayName")
                    .addEnumConfiguration(
                        FeatureUpdateFeatureResponse.Data.EnumConfiguration.builder()
                            .displayName("displayName")
                            .value("value")
                            .build()
                    )
                    .featureStatus(FeatureUpdateFeatureResponse.Data.FeatureStatus.NEW)
                    .featureType(FeatureUpdateFeatureResponse.Data.FeatureType.BOOLEAN)
                    .featureUnits("featureUnits")
                    .featureUnitsPlural("featureUnitsPlural")
                    .metadata(
                        FeatureUpdateFeatureResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .meterType(FeatureUpdateFeatureResponse.Data.MeterType.NONE)
                    .unitTransformation(
                        FeatureUpdateFeatureResponse.Data.UnitTransformation.builder()
                            .divide(0.0)
                            .featureUnits("featureUnits")
                            .featureUnitsPlural("featureUnitsPlural")
                            .round(FeatureUpdateFeatureResponse.Data.UnitTransformation.Round.UP)
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val featureUpdateFeatureResponse =
            FeatureUpdateFeatureResponse.builder()
                .data(
                    FeatureUpdateFeatureResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .displayName("displayName")
                        .addEnumConfiguration(
                            FeatureUpdateFeatureResponse.Data.EnumConfiguration.builder()
                                .displayName("displayName")
                                .value("value")
                                .build()
                        )
                        .featureStatus(FeatureUpdateFeatureResponse.Data.FeatureStatus.NEW)
                        .featureType(FeatureUpdateFeatureResponse.Data.FeatureType.BOOLEAN)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .metadata(
                            FeatureUpdateFeatureResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .meterType(FeatureUpdateFeatureResponse.Data.MeterType.NONE)
                        .unitTransformation(
                            FeatureUpdateFeatureResponse.Data.UnitTransformation.builder()
                                .divide(0.0)
                                .featureUnits("featureUnits")
                                .featureUnitsPlural("featureUnitsPlural")
                                .round(
                                    FeatureUpdateFeatureResponse.Data.UnitTransformation.Round.UP
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedFeatureUpdateFeatureResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(featureUpdateFeatureResponse),
                jacksonTypeRef<FeatureUpdateFeatureResponse>(),
            )

        assertThat(roundtrippedFeatureUpdateFeatureResponse).isEqualTo(featureUpdateFeatureResponse)
    }
}
