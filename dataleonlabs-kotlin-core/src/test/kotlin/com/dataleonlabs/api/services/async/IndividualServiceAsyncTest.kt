// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.async

import com.dataleonlabs.api.TestServerExtension
import com.dataleonlabs.api.client.okhttp.DataleonlabsOkHttpClientAsync
import com.dataleonlabs.api.models.individuals.IndividualCreateParams
import com.dataleonlabs.api.models.individuals.IndividualListParams
import com.dataleonlabs.api.models.individuals.IndividualRetrieveParams
import com.dataleonlabs.api.models.individuals.IndividualUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IndividualServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            DataleonlabsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val individualServiceAsync = client.individuals()

        val individual =
            individualServiceAsync.create(
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
            )

        individual.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            DataleonlabsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val individualServiceAsync = client.individuals()

        val individual =
            individualServiceAsync.retrieve(
                IndividualRetrieveParams.builder()
                    .individualId("individual_id")
                    .document(true)
                    .scope("scope")
                    .build()
            )

        individual.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            DataleonlabsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val individualServiceAsync = client.individuals()

        val individual =
            individualServiceAsync.update(
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
                            .nationality("FRA")
                            .phoneNumber("+33 1 23 45 67 89")
                            .build()
                    )
                    .sourceId("ID54410069066")
                    .technicalData(
                        IndividualUpdateParams.TechnicalData.builder()
                            .activeAmlSuspicions(false)
                            .callbackUrl("https://example.com/callback")
                            .callbackUrlNotification("https://example.com/notify")
                            .filteringScoreAmlSuspicions(0.75f)
                            .language("fra")
                            .rawData(true)
                            .build()
                    )
                    .build()
            )

        individual.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            DataleonlabsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val individualServiceAsync = client.individuals()

        val individuals =
            individualServiceAsync.list(
                IndividualListParams.builder()
                    .endDate(LocalDate.parse("2019-12-27"))
                    .limit(1L)
                    .offset(0L)
                    .sourceId("source_id")
                    .startDate(LocalDate.parse("2019-12-27"))
                    .state(IndividualListParams.State.VOID)
                    .status(IndividualListParams.Status.REJECTED)
                    .workspaceId("workspace_id")
                    .build()
            )

        individuals.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            DataleonlabsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val individualServiceAsync = client.individuals()

        individualServiceAsync.delete("individual_id")
    }
}
