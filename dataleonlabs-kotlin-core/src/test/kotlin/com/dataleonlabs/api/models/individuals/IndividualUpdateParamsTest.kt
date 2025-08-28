// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.individuals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualUpdateParamsTest {

    @Test
    fun create() {
        IndividualUpdateParams.builder()
            .individualId("individual_id")
            .workspaceId("wk_123")
            .person(
                IndividualUpdateParams.Person.builder()
                    .birthday("15/05/1985")
                    .email("john.doe@example.com")
                    .firstName("John")
                    .gender(IndividualUpdateParams.Person.Gender.M)
                    .lastName("Doe")
                    .maidenName("John Doe")
                    .phoneNumber("+33 1 23 45 67 89")
                    .build()
            )
            .sourceId("ID54410069066")
            .technicalData(
                IndividualUpdateParams.TechnicalData.builder()
                    .activeAmlSuspicions(false)
                    .callbackUrl("https://example.com/callback")
                    .callbackUrlNotification("https://example.com/notify")
                    .language("fra")
                    .rawData(true)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IndividualUpdateParams.builder()
                .individualId("individual_id")
                .workspaceId("wk_123")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("individual_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IndividualUpdateParams.builder()
                .individualId("individual_id")
                .workspaceId("wk_123")
                .person(
                    IndividualUpdateParams.Person.builder()
                        .birthday("15/05/1985")
                        .email("john.doe@example.com")
                        .firstName("John")
                        .gender(IndividualUpdateParams.Person.Gender.M)
                        .lastName("Doe")
                        .maidenName("John Doe")
                        .phoneNumber("+33 1 23 45 67 89")
                        .build()
                )
                .sourceId("ID54410069066")
                .technicalData(
                    IndividualUpdateParams.TechnicalData.builder()
                        .activeAmlSuspicions(false)
                        .callbackUrl("https://example.com/callback")
                        .callbackUrlNotification("https://example.com/notify")
                        .language("fra")
                        .rawData(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.workspaceId()).isEqualTo("wk_123")
        assertThat(body.person())
            .isEqualTo(
                IndividualUpdateParams.Person.builder()
                    .birthday("15/05/1985")
                    .email("john.doe@example.com")
                    .firstName("John")
                    .gender(IndividualUpdateParams.Person.Gender.M)
                    .lastName("Doe")
                    .maidenName("John Doe")
                    .phoneNumber("+33 1 23 45 67 89")
                    .build()
            )
        assertThat(body.sourceId()).isEqualTo("ID54410069066")
        assertThat(body.technicalData())
            .isEqualTo(
                IndividualUpdateParams.TechnicalData.builder()
                    .activeAmlSuspicions(false)
                    .callbackUrl("https://example.com/callback")
                    .callbackUrlNotification("https://example.com/notify")
                    .language("fra")
                    .rawData(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IndividualUpdateParams.builder()
                .individualId("individual_id")
                .workspaceId("wk_123")
                .build()

        val body = params._body()

        assertThat(body.workspaceId()).isEqualTo("wk_123")
    }
}
