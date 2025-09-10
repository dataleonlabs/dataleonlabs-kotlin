// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.company())
            .isEqualTo(
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
        assertThat(body.workspaceId()).isEqualTo("wk_123")
        assertThat(body.sourceId()).isEqualTo("ID54410069066")
        assertThat(body.technicalData())
            .isEqualTo(
                CompanyCreateParams.TechnicalData.builder()
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
            CompanyCreateParams.builder()
                .company(CompanyCreateParams.Company.builder().name("ACME Corp").build())
                .workspaceId("wk_123")
                .build()

        val body = params._body()

        assertThat(body.company())
            .isEqualTo(CompanyCreateParams.Company.builder().name("ACME Corp").build())
        assertThat(body.workspaceId()).isEqualTo("wk_123")
    }
}
