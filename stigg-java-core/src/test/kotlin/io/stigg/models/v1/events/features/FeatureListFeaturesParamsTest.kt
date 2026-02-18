// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.features

import io.stigg.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureListFeaturesParamsTest {

    @Test
    fun create() {
        FeatureListFeaturesParams.builder()
            .id("id")
            .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .createdAt(
                FeatureListFeaturesParams.CreatedAt.builder()
                    .gt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .featureType("featureType")
            .limit(1L)
            .meterType("meterType")
            .status("status")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FeatureListFeaturesParams.builder()
                .id("id")
                .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(
                    FeatureListFeaturesParams.CreatedAt.builder()
                        .gt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .featureType("featureType")
                .limit(1L)
                .meterType("meterType")
                .status("status")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "id")
                    .put("after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("createdAt[gt]", "2019-12-27T18:11:19.117Z")
                    .put("createdAt[gte]", "2019-12-27T18:11:19.117Z")
                    .put("createdAt[lt]", "2019-12-27T18:11:19.117Z")
                    .put("createdAt[lte]", "2019-12-27T18:11:19.117Z")
                    .put("featureType", "featureType")
                    .put("limit", "1")
                    .put("meterType", "meterType")
                    .put("status", "status")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FeatureListFeaturesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
