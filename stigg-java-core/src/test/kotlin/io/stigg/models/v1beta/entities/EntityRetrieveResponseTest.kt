// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.entities

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityRetrieveResponseTest {

    @Test
    fun create() {
        val entityRetrieveResponse =
            EntityRetrieveResponse.builder()
                .data(
                    EntityRetrieveResponse.Data.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            EntityRetrieveResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .typeId("typeId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(entityRetrieveResponse.data())
            .isEqualTo(
                EntityRetrieveResponse.Data.builder()
                    .id("id")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        EntityRetrieveResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .typeId("typeId")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityRetrieveResponse =
            EntityRetrieveResponse.builder()
                .data(
                    EntityRetrieveResponse.Data.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            EntityRetrieveResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .typeId("typeId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedEntityRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityRetrieveResponse),
                jacksonTypeRef<EntityRetrieveResponse>(),
            )

        assertThat(roundtrippedEntityRetrieveResponse).isEqualTo(entityRetrieveResponse)
    }
}
