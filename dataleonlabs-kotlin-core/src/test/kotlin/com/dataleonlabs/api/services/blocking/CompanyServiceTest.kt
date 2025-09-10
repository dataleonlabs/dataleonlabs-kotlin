// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.blocking

import com.dataleonlabs.api.TestServerExtension
import com.dataleonlabs.api.client.okhttp.DataleonlabsOkHttpClient
import com.dataleonlabs.api.models.companies.CompanyCreateParams
import com.dataleonlabs.api.models.companies.CompanyListParams
import com.dataleonlabs.api.models.companies.CompanyRetrieveParams
import com.dataleonlabs.api.models.companies.CompanyUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CompanyServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            DataleonlabsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val company =
            companyService.create(
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
                            .filteringScoreAmlSuspicions(0.75f)
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
    fun retrieve() {
        val client =
            DataleonlabsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val company =
            companyService.retrieve(
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
    fun update() {
        val client =
            DataleonlabsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val company =
            companyService.update(
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
                            .filteringScoreAmlSuspicions(0.75f)
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
    fun list() {
        val client =
            DataleonlabsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val companies =
            companyService.list(
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
    fun delete() {
        val client =
            DataleonlabsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        companyService.delete("company_id")
    }
}
