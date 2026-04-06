// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.internal_.beta.eventqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventQueueDeleteResponseTest {

    @Test
    fun create() {
        val eventQueueDeleteResponse =
            EventQueueDeleteResponse.builder()
                .data(
                    EventQueueDeleteResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueName("queueName")
                        .region(EventQueueDeleteResponse.Data.Region.US_EAST_1)
                        .status(EventQueueDeleteResponse.Data.Status.PROVISIONING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueUrl("queueUrl")
                        .roleArn("roleArn")
                        .suffix("suffix")
                        .build()
                )
                .build()

        assertThat(eventQueueDeleteResponse.data())
            .isEqualTo(
                EventQueueDeleteResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .queueName("queueName")
                    .region(EventQueueDeleteResponse.Data.Region.US_EAST_1)
                    .status(EventQueueDeleteResponse.Data.Status.PROVISIONING)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .queueUrl("queueUrl")
                    .roleArn("roleArn")
                    .suffix("suffix")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventQueueDeleteResponse =
            EventQueueDeleteResponse.builder()
                .data(
                    EventQueueDeleteResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueName("queueName")
                        .region(EventQueueDeleteResponse.Data.Region.US_EAST_1)
                        .status(EventQueueDeleteResponse.Data.Status.PROVISIONING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueUrl("queueUrl")
                        .roleArn("roleArn")
                        .suffix("suffix")
                        .build()
                )
                .build()

        val roundtrippedEventQueueDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventQueueDeleteResponse),
                jacksonTypeRef<EventQueueDeleteResponse>(),
            )

        assertThat(roundtrippedEventQueueDeleteResponse).isEqualTo(eventQueueDeleteResponse)
    }
}
