// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.async.individuals

import com.dataleonlabs.api.TestServerExtension
import com.dataleonlabs.api.client.okhttp.DataleonlabsOkHttpClientAsync
import com.dataleonlabs.api.models.individuals.documents.DocumentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            DataleonlabsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.individuals().documents()

        val documentResponse = documentServiceAsync.list("individual_id")

        documentResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun upload() {
        val client =
            DataleonlabsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.individuals().documents()

        val genericDocument =
            documentServiceAsync.upload(
                DocumentUploadParams.builder()
                    .individualId("individual_id")
                    .documentType(DocumentUploadParams.DocumentType.LIASSE_FISCALE)
                    .file("some content".byteInputStream())
                    .url("https://example.com/sample.pdf")
                    .build()
            )

        genericDocument.validate()
    }
}
