// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.individuals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualCreateParamsTest {

    @Test
    fun create() {
        IndividualCreateParams.builder()
            .workspaceId("wk_123")
            .person(
                IndividualCreateParams.Person.builder()
                    .birthday("15/05/1985")
                    .email("john.doe@example.com")
                    .firstName("John")
                    .gender(IndividualCreateParams.Person.Gender.M)
                    .lastName("Doe")
                    .maidenName("John Doe")
                    .nationality("FRA")
                    .phoneNumber("+33 1 23 45 67 89")
                    .build()
            )
            .sourceId("ID54410069066")
            .technicalData(
                IndividualCreateParams.TechnicalData.builder()
                    .activeAmlSuspicions(false)
                    .callbackUrl("https://example.com/callback")
                    .callbackUrlNotification("https://example.com/notify")
                    .filteringScoreAmlSuspicions(0.75f)
                    .language("fra")
                    .rawData(true)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            IndividualCreateParams.builder()
                .workspaceId("wk_123")
                .person(
                    IndividualCreateParams.Person.builder()
                        .birthday("15/05/1985")
                        .email("john.doe@example.com")
                        .firstName("John")
                        .gender(IndividualCreateParams.Person.Gender.M)
                        .lastName("Doe")
                        .maidenName("John Doe")
                        .nationality("FRA")
                        .phoneNumber("+33 1 23 45 67 89")
                        .build()
                )
                .sourceId("ID54410069066")
                .technicalData(
                    IndividualCreateParams.TechnicalData.builder()
                        .activeAmlSuspicions(false)
                        .callbackUrl("https://example.com/callback")
                        .callbackUrlNotification("https://example.com/notify")
                        .filteringScoreAmlSuspicions(0.75f)
                        .language("fra")
                        .rawData(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.workspaceId()).isEqualTo("wk_123")
        assertThat(body.person())
            .isEqualTo(
                IndividualCreateParams.Person.builder()
                    .birthday("15/05/1985")
                    .email("john.doe@example.com")
                    .firstName("John")
                    .gender(IndividualCreateParams.Person.Gender.M)
                    .lastName("Doe")
                    .maidenName("John Doe")
                    .nationality("FRA")
                    .phoneNumber("+33 1 23 45 67 89")
                    .build()
            )
        assertThat(body.sourceId()).isEqualTo("ID54410069066")
        assertThat(body.technicalData())
            .isEqualTo(
                IndividualCreateParams.TechnicalData.builder()
                    .activeAmlSuspicions(false)
                    .callbackUrl("https://example.com/callback")
                    .callbackUrlNotification("https://example.com/notify")
                    .filteringScoreAmlSuspicions(0.75f)
                    .language("fra")
                    .rawData(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = IndividualCreateParams.builder().workspaceId("wk_123").build()

        val body = params._body()

        assertThat(body.workspaceId()).isEqualTo("wk_123")
    }
}
