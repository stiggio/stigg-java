// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.customers.entities

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityListPageResponseTest {

    @Test
    fun create() {
        val entityListPageResponse =
            EntityListPageResponse.builder()
                .addData(
                    EntityListResponse.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            EntityListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .typeId("typeId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pagination(
                    EntityListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(entityListPageResponse.data())
            .containsExactly(
                EntityListResponse.builder()
                    .id("id")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        EntityListResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .typeId("typeId")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(entityListPageResponse.pagination())
            .isEqualTo(
                EntityListPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityListPageResponse =
            EntityListPageResponse.builder()
                .addData(
                    EntityListResponse.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            EntityListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .typeId("typeId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pagination(
                    EntityListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedEntityListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityListPageResponse),
                jacksonTypeRef<EntityListPageResponse>(),
            )

        assertThat(roundtrippedEntityListPageResponse).isEqualTo(entityListPageResponse)
    }
}
