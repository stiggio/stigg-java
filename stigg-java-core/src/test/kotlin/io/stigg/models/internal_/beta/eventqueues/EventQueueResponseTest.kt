// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.internal_.beta.eventqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventQueueResponseTest {

    @Test
    fun create() {
        val eventQueueResponse =
            EventQueueResponse.builder()
                .data(
                    EventQueueResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueName("queueName")
                        .region(EventQueueResponse.Data.Region.US_EAST_1)
                        .status(EventQueueResponse.Data.Status.PROVISIONING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueUrl("queueUrl")
                        .roleArn("roleArn")
                        .suffix("suffix")
                        .build()
                )
                .build()

        assertThat(eventQueueResponse.data())
            .isEqualTo(
                EventQueueResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .queueName("queueName")
                    .region(EventQueueResponse.Data.Region.US_EAST_1)
                    .status(EventQueueResponse.Data.Status.PROVISIONING)
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
        val eventQueueResponse =
            EventQueueResponse.builder()
                .data(
                    EventQueueResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueName("queueName")
                        .region(EventQueueResponse.Data.Region.US_EAST_1)
                        .status(EventQueueResponse.Data.Status.PROVISIONING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueUrl("queueUrl")
                        .roleArn("roleArn")
                        .suffix("suffix")
                        .build()
                )
                .build()

        val roundtrippedEventQueueResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventQueueResponse),
                jacksonTypeRef<EventQueueResponse>(),
            )

        assertThat(roundtrippedEventQueueResponse).isEqualTo(eventQueueResponse)
    }
}
