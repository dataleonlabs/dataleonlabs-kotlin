// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies

import com.dataleonlabs.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TechnicalDataTest {

    @Test
    fun create() {
        val technicalData =
            TechnicalData.builder()
                .activeAmlSuspicions(false)
                .apiVersion(2L)
                .approvedAt(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
                .callbackUrl("https://example.com/callback")
                .callbackUrlNotification("https://example.com/notify")
                .disableNotification(false)
                .disableNotificationDate(OffsetDateTime.parse("2025-07-12T13:10:00Z"))
                .exportType("json")
                .filteringScoreAmlSuspicions(0.75f)
                .finishedAt(OffsetDateTime.parse("2025-05-05T13:10:00Z"))
                .ip("192.168.1.1")
                .language("fra")
                .locationIp("203.0.113.45")
                .needReviewAt(null)
                .notificationConfirmation(false)
                .qrCode("false")
                .rawData(true)
                .rejectedAt(null)
                .sessionDuration(45L)
                .startedAt(OffsetDateTime.parse("2025-05-05T13:00:00Z"))
                .transferAt(OffsetDateTime.parse("2025-07-12T14:00:00Z"))
                .transferMode("API")
                .build()

        assertThat(technicalData.activeAmlSuspicions()).isEqualTo(false)
        assertThat(technicalData.apiVersion()).isEqualTo(2L)
        assertThat(technicalData.approvedAt())
            .isEqualTo(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
        assertThat(technicalData.callbackUrl()).isEqualTo("https://example.com/callback")
        assertThat(technicalData.callbackUrlNotification()).isEqualTo("https://example.com/notify")
        assertThat(technicalData.disableNotification()).isEqualTo(false)
        assertThat(technicalData.disableNotificationDate())
            .isEqualTo(OffsetDateTime.parse("2025-07-12T13:10:00Z"))
        assertThat(technicalData.exportType()).isEqualTo("json")
        assertThat(technicalData.filteringScoreAmlSuspicions()).isEqualTo(0.75f)
        assertThat(technicalData.finishedAt())
            .isEqualTo(OffsetDateTime.parse("2025-05-05T13:10:00Z"))
        assertThat(technicalData.ip()).isEqualTo("192.168.1.1")
        assertThat(technicalData.language()).isEqualTo("fra")
        assertThat(technicalData.locationIp()).isEqualTo("203.0.113.45")
        assertThat(technicalData.needReviewAt()).isNull()
        assertThat(technicalData.notificationConfirmation()).isEqualTo(false)
        assertThat(technicalData.qrCode()).isEqualTo("false")
        assertThat(technicalData.rawData()).isEqualTo(true)
        assertThat(technicalData.rejectedAt()).isNull()
        assertThat(technicalData.sessionDuration()).isEqualTo(45L)
        assertThat(technicalData.startedAt())
            .isEqualTo(OffsetDateTime.parse("2025-05-05T13:00:00Z"))
        assertThat(technicalData.transferAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-12T14:00:00Z"))
        assertThat(technicalData.transferMode()).isEqualTo("API")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val technicalData =
            TechnicalData.builder()
                .activeAmlSuspicions(false)
                .apiVersion(2L)
                .approvedAt(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
                .callbackUrl("https://example.com/callback")
                .callbackUrlNotification("https://example.com/notify")
                .disableNotification(false)
                .disableNotificationDate(OffsetDateTime.parse("2025-07-12T13:10:00Z"))
                .exportType("json")
                .filteringScoreAmlSuspicions(0.75f)
                .finishedAt(OffsetDateTime.parse("2025-05-05T13:10:00Z"))
                .ip("192.168.1.1")
                .language("fra")
                .locationIp("203.0.113.45")
                .needReviewAt(null)
                .notificationConfirmation(false)
                .qrCode("false")
                .rawData(true)
                .rejectedAt(null)
                .sessionDuration(45L)
                .startedAt(OffsetDateTime.parse("2025-05-05T13:00:00Z"))
                .transferAt(OffsetDateTime.parse("2025-07-12T14:00:00Z"))
                .transferMode("API")
                .build()

        val roundtrippedTechnicalData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(technicalData),
                jacksonTypeRef<TechnicalData>(),
            )

        assertThat(roundtrippedTechnicalData).isEqualTo(technicalData)
    }
}
