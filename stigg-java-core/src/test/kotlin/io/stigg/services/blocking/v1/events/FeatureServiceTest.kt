// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.events.features.FeatureCreateFeatureParams
import io.stigg.models.v1.events.features.FeatureUpdateFeatureParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FeatureServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun archiveFeature() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val featureService = client.v1().events().features()

        val feature = featureService.archiveFeature("x")

        feature.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createFeature() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val featureService = client.v1().events().features()

        val feature =
            featureService.createFeature(
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
            )

        feature.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFeatures() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val featureService = client.v1().events().features()

        val page = featureService.listFeatures()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveFeature() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val featureService = client.v1().events().features()

        val feature = featureService.retrieveFeature("x")

        feature.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unarchiveFeature() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val featureService = client.v1().events().features()

        val feature = featureService.unarchiveFeature("x")

        feature.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateFeature() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val featureService = client.v1().events().features()

        val feature =
            featureService.updateFeature(
                FeatureUpdateFeatureParams.builder()
                    .id("x")
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
                                    .function(
                                        FeatureUpdateFeatureParams.Meter.Aggregation.Function.SUM
                                    )
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
            )

        feature.validate()
    }
}
