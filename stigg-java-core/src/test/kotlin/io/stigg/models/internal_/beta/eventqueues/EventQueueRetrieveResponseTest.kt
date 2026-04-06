// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.internal_.beta.eventqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventQueueRetrieveResponseTest {

    @Test
    fun create() {
        val eventQueueRetrieveResponse =
            EventQueueRetrieveResponse.builder()
                .data(
                    EventQueueRetrieveResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueName("queueName")
                        .region(EventQueueRetrieveResponse.Data.Region.US_EAST_1)
                        .status(EventQueueRetrieveResponse.Data.Status.PROVISIONING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueUrl("queueUrl")
                        .roleArn("roleArn")
                        .suffix("suffix")
                        .build()
                )
                .build()

        assertThat(eventQueueRetrieveResponse.data())
            .isEqualTo(
                EventQueueRetrieveResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .queueName("queueName")
                    .region(EventQueueRetrieveResponse.Data.Region.US_EAST_1)
                    .status(EventQueueRetrieveResponse.Data.Status.PROVISIONING)
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
        val eventQueueRetrieveResponse =
            EventQueueRetrieveResponse.builder()
                .data(
                    EventQueueRetrieveResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueName("queueName")
                        .region(EventQueueRetrieveResponse.Data.Region.US_EAST_1)
                        .status(EventQueueRetrieveResponse.Data.Status.PROVISIONING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueUrl("queueUrl")
                        .roleArn("roleArn")
                        .suffix("suffix")
                        .build()
                )
                .build()

        val roundtrippedEventQueueRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventQueueRetrieveResponse),
                jacksonTypeRef<EventQueueRetrieveResponse>(),
            )

        assertThat(roundtrippedEventQueueRetrieveResponse).isEqualTo(eventQueueRetrieveResponse)
    }
}
