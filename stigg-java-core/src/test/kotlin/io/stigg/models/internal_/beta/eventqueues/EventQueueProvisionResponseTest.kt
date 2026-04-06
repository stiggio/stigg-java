// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.internal_.beta.eventqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventQueueProvisionResponseTest {

    @Test
    fun create() {
        val eventQueueProvisionResponse =
            EventQueueProvisionResponse.builder()
                .data(
                    EventQueueProvisionResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueName("queueName")
                        .region(EventQueueProvisionResponse.Data.Region.US_EAST_1)
                        .status(EventQueueProvisionResponse.Data.Status.PROVISIONING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueUrl("queueUrl")
                        .roleArn("roleArn")
                        .suffix("suffix")
                        .build()
                )
                .build()

        assertThat(eventQueueProvisionResponse.data())
            .isEqualTo(
                EventQueueProvisionResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .queueName("queueName")
                    .region(EventQueueProvisionResponse.Data.Region.US_EAST_1)
                    .status(EventQueueProvisionResponse.Data.Status.PROVISIONING)
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
        val eventQueueProvisionResponse =
            EventQueueProvisionResponse.builder()
                .data(
                    EventQueueProvisionResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueName("queueName")
                        .region(EventQueueProvisionResponse.Data.Region.US_EAST_1)
                        .status(EventQueueProvisionResponse.Data.Status.PROVISIONING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .queueUrl("queueUrl")
                        .roleArn("roleArn")
                        .suffix("suffix")
                        .build()
                )
                .build()

        val roundtrippedEventQueueProvisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventQueueProvisionResponse),
                jacksonTypeRef<EventQueueProvisionResponse>(),
            )

        assertThat(roundtrippedEventQueueProvisionResponse).isEqualTo(eventQueueProvisionResponse)
    }
}
