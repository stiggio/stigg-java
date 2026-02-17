// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.features

import io.stigg.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureCreateFeatureParamsTest {

    @Test
    fun create() {
        FeatureCreateFeatureParams.builder()
            .id("id")
            .displayName("displayName")
            .featureType(FeatureCreateFeatureParams.FeatureType.BOOLEAN)
            .description("description")
            .addEnumConfiguration(
                FeatureCreateFeatureParams.EnumConfiguration.builder()
                    .displayName("displayName")
                    .value("value")
                    .build()
            )
            .featureStatus(FeatureCreateFeatureParams.FeatureStatus.NEW)
            .featureUnits("featureUnits")
            .featureUnitsPlural("featureUnitsPlural")
            .metadata(
                FeatureCreateFeatureParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .meterType(FeatureCreateFeatureParams.MeterType.NONE)
            .unitTransformation(
                FeatureCreateFeatureParams.UnitTransformation.builder()
                    .divide(0L)
                    .featureUnits("featureUnits")
                    .featureUnitsPlural("featureUnitsPlural")
                    .round(FeatureCreateFeatureParams.UnitTransformation.Round.UP)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            FeatureCreateFeatureParams.builder()
                .id("id")
                .displayName("displayName")
                .featureType(FeatureCreateFeatureParams.FeatureType.BOOLEAN)
                .description("description")
                .addEnumConfiguration(
                    FeatureCreateFeatureParams.EnumConfiguration.builder()
                        .displayName("displayName")
                        .value("value")
                        .build()
                )
                .featureStatus(FeatureCreateFeatureParams.FeatureStatus.NEW)
                .featureUnits("featureUnits")
                .featureUnitsPlural("featureUnitsPlural")
                .metadata(
                    FeatureCreateFeatureParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .meterType(FeatureCreateFeatureParams.MeterType.NONE)
                .unitTransformation(
                    FeatureCreateFeatureParams.UnitTransformation.builder()
                        .divide(0L)
                        .featureUnits("featureUnits")
                        .featureUnitsPlural("featureUnitsPlural")
                        .round(FeatureCreateFeatureParams.UnitTransformation.Round.UP)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.displayName()).isEqualTo("displayName")
        assertThat(body.featureType()).isEqualTo(FeatureCreateFeatureParams.FeatureType.BOOLEAN)
        assertThat(body.description()).contains("description")
        assertThat(body.enumConfiguration().getOrNull())
            .containsExactly(
                FeatureCreateFeatureParams.EnumConfiguration.builder()
                    .displayName("displayName")
                    .value("value")
                    .build()
            )
        assertThat(body.featureStatus()).contains(FeatureCreateFeatureParams.FeatureStatus.NEW)
        assertThat(body.featureUnits()).contains("featureUnits")
        assertThat(body.featureUnitsPlural()).contains("featureUnitsPlural")
        assertThat(body.metadata())
            .contains(
                FeatureCreateFeatureParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.meterType()).contains(FeatureCreateFeatureParams.MeterType.NONE)
        assertThat(body.unitTransformation())
            .contains(
                FeatureCreateFeatureParams.UnitTransformation.builder()
                    .divide(0L)
                    .featureUnits("featureUnits")
                    .featureUnitsPlural("featureUnitsPlural")
                    .round(FeatureCreateFeatureParams.UnitTransformation.Round.UP)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FeatureCreateFeatureParams.builder()
                .id("id")
                .displayName("displayName")
                .featureType(FeatureCreateFeatureParams.FeatureType.BOOLEAN)
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.displayName()).isEqualTo("displayName")
        assertThat(body.featureType()).isEqualTo(FeatureCreateFeatureParams.FeatureType.BOOLEAN)
    }
}
