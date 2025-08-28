// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.async

import com.dataleonlabs.api.TestServerExtension
import com.dataleonlabs.api.client.okhttp.DataleonlabsOkHttpClientAsync
import com.dataleonlabs.api.models.companies.CompanyCreateParams
import com.dataleonlabs.api.models.companies.CompanyListParams
import com.dataleonlabs.api.models.companies.CompanyRetrieveParams
import com.dataleonlabs.api.models.companies.CompanyUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CompanyServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            DataleonlabsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyServiceAsync = client.companies()

        val company =
            companyServiceAsync.create(
                CompanyCreateParams.builder()
                    .company(
                        CompanyCreateParams.Company.builder()
                            .name("ACME Corp")
                            .address("123 rue Exemple, Paris")
                            .commercialName("ACME")
                            .country("FR")
                            .email("info@acme.fr")
                            .employerIdentificationNumber("EIN123456")
                            .legalForm("SARL")
                            .phoneNumber("+33 1 23 45 67 89")
                            .registrationDate("2010-05-15")
                            .registrationId("RCS123456")
                            .shareCapital("100000")
                            .status("active")
                            .taxIdentificationNumber("FR123456789")
                            .type("main")
                            .websiteUrl("https://acme.fr")
                            .build()
                    )
                    .workspaceId("wk_123")
                    .sourceId("ID54410069066")
                    .technicalData(
                        CompanyCreateParams.TechnicalData.builder()
                            .activeAmlSuspicions(false)
                            .callbackUrl("https://example.com/callback")
                            .callbackUrlNotification("https://example.com/notify")
                            .language("fra")
                            .rawData(true)
                            .build()
                    )
                    .build()
            )

        company.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            DataleonlabsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyServiceAsync = client.companies()

        val company =
            companyServiceAsync.retrieve(
                CompanyRetrieveParams.builder()
                    .companyId("company_id")
                    .document(true)
                    .scope("scope")
                    .build()
            )

        company.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            DataleonlabsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyServiceAsync = client.companies()

        val company =
            companyServiceAsync.update(
                CompanyUpdateParams.builder()
                    .companyId("company_id")
                    .company(
                        CompanyUpdateParams.Company.builder()
                            .name("ACME Corp")
                            .address("123 rue Exemple, Paris")
                            .commercialName("ACME")
                            .country("FR")
                            .email("info@acme.fr")
                            .employerIdentificationNumber("EIN123456")
                            .legalForm("SARL")
                            .phoneNumber("+33 1 23 45 67 89")
                            .registrationDate("2010-05-15")
                            .registrationId("RCS123456")
                            .shareCapital("100000")
                            .status("active")
                            .taxIdentificationNumber("FR123456789")
                            .type("main")
                            .websiteUrl("https://acme.fr")
                            .build()
                    )
                    .workspaceId("wk_123")
                    .sourceId("ID54410069066")
                    .technicalData(
                        CompanyUpdateParams.TechnicalData.builder()
                            .activeAmlSuspicions(false)
                            .callbackUrl("https://example.com/callback")
                            .callbackUrlNotification("https://example.com/notify")
                            .language("fra")
                            .rawData(true)
                            .build()
                    )
                    .build()
            )

        company.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            DataleonlabsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyServiceAsync = client.companies()

        val companies =
            companyServiceAsync.list(
                CompanyListParams.builder()
                    .endDate(LocalDate.parse("2019-12-27"))
                    .limit(1L)
                    .offset(0L)
                    .sourceId("source_id")
                    .startDate(LocalDate.parse("2019-12-27"))
                    .state(CompanyListParams.State.VOID)
                    .status(CompanyListParams.Status.REJECTED)
                    .workspaceId("workspace_id")
                    .build()
            )

        companies.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            DataleonlabsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyServiceAsync = client.companies()

        companyServiceAsync.delete("company_id")
    }
}
