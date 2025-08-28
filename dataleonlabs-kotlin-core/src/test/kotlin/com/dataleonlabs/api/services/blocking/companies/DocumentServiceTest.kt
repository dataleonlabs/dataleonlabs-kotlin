// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.blocking.companies

import com.dataleonlabs.api.TestServerExtension
import com.dataleonlabs.api.client.okhttp.DataleonlabsOkHttpClient
import com.dataleonlabs.api.models.companies.documents.DocumentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            DataleonlabsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentService = client.companies().documents()

        val documentResponse = documentService.list("company_id")

        documentResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            DataleonlabsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentService = client.companies().documents()

        val genericDocument =
            documentService.upload(
                DocumentUploadParams.builder()
                    .companyId("company_id")
                    .documentType(DocumentUploadParams.DocumentType.LIASSE_FISCALE)
                    .file("some content".byteInputStream())
                    .url("https://example.com/sample.pdf")
                    .build()
            )

        genericDocument.validate()
    }
}
