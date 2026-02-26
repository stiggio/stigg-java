// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.features.FeatureCreateFeatureParams
import io.stigg.models.v1.features.FeatureUpdateFeatureParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FeatureServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun archiveFeature() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val featureServiceAsync = client.v1().features()

        val featureFuture = featureServiceAsync.archiveFeature("x")

        val feature = featureFuture.get()
        feature.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createFeature() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val featureServiceAsync = client.v1().features()

        val featureFuture =
            featureServiceAsync.createFeature(
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

        val feature = featureFuture.get()
        feature.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFeatures() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val featureServiceAsync = client.v1().features()

        val pageFuture = featureServiceAsync.listFeatures()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveFeature() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val featureServiceAsync = client.v1().features()

        val featureFuture = featureServiceAsync.retrieveFeature("x")

        val feature = featureFuture.get()
        feature.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unarchiveFeature() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val featureServiceAsync = client.v1().features()

        val featureFuture = featureServiceAsync.unarchiveFeature("x")

        val feature = featureFuture.get()
        feature.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateFeature() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val featureServiceAsync = client.v1().features()

        val featureFuture =
            featureServiceAsync.updateFeature(
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

        val feature = featureFuture.get()
        feature.validate()
    }
}
