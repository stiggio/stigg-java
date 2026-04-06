// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.internal_.beta.eventqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventQueueUpdateResponseTest {

    @Test
    fun create() {
        val eventQueueUpdateResponse =
            EventQueueUpdateResponse.builder()
                .data(
                    EventQueueUpdateResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueName("queueName")
                        .region(EventQueueUpdateResponse.Data.Region.US_EAST_1)
                        .status(EventQueueUpdateResponse.Data.Status.PROVISIONING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueUrl("queueUrl")
                        .roleArn("roleArn")
                        .suffix("suffix")
                        .build()
                )
                .build()

        assertThat(eventQueueUpdateResponse.data())
            .isEqualTo(
                EventQueueUpdateResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .queueName("queueName")
                    .region(EventQueueUpdateResponse.Data.Region.US_EAST_1)
                    .status(EventQueueUpdateResponse.Data.Status.PROVISIONING)
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
        val eventQueueUpdateResponse =
            EventQueueUpdateResponse.builder()
                .data(
                    EventQueueUpdateResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueName("queueName")
                        .region(EventQueueUpdateResponse.Data.Region.US_EAST_1)
                        .status(EventQueueUpdateResponse.Data.Status.PROVISIONING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueUrl("queueUrl")
                        .roleArn("roleArn")
                        .suffix("suffix")
                        .build()
                )
                .build()

        val roundtrippedEventQueueUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventQueueUpdateResponse),
                jacksonTypeRef<EventQueueUpdateResponse>(),
            )

        assertThat(roundtrippedEventQueueUpdateResponse).isEqualTo(eventQueueUpdateResponse)
    }
}
