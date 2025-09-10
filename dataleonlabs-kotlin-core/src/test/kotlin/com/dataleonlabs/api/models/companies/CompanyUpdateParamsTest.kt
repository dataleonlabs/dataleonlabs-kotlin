// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            CompanyUpdateParams.builder()
                .companyId("company_id")
                .company(CompanyUpdateParams.Company.builder().name("ACME Corp").build())
                .workspaceId("wk_123")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("company_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.company())
            .isEqualTo(
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
        assertThat(body.workspaceId()).isEqualTo("wk_123")
        assertThat(body.sourceId()).isEqualTo("ID54410069066")
        assertThat(body.technicalData())
            .isEqualTo(
                CompanyUpdateParams.TechnicalData.builder()
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
        val params =
            CompanyUpdateParams.builder()
                .companyId("company_id")
                .company(CompanyUpdateParams.Company.builder().name("ACME Corp").build())
                .workspaceId("wk_123")
                .build()

        val body = params._body()

        assertThat(body.company())
            .isEqualTo(CompanyUpdateParams.Company.builder().name("ACME Corp").build())
        assertThat(body.workspaceId()).isEqualTo("wk_123")
    }
}
