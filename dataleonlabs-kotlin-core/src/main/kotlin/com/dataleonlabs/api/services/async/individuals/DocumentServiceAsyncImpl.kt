// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.async.individuals

import com.dataleonlabs.api.core.ClientOptions
import com.dataleonlabs.api.core.RequestOptions
import com.dataleonlabs.api.core.checkRequired
import com.dataleonlabs.api.core.handlers.errorBodyHandler
import com.dataleonlabs.api.core.handlers.errorHandler
import com.dataleonlabs.api.core.handlers.jsonHandler
import com.dataleonlabs.api.core.http.HttpMethod
import com.dataleonlabs.api.core.http.HttpRequest
import com.dataleonlabs.api.core.http.HttpResponse
import com.dataleonlabs.api.core.http.HttpResponse.Handler
import com.dataleonlabs.api.core.http.HttpResponseFor
import com.dataleonlabs.api.core.http.multipartFormData
import com.dataleonlabs.api.core.http.parseable
import com.dataleonlabs.api.core.prepareAsync
import com.dataleonlabs.api.models.companies.documents.DocumentResponse
import com.dataleonlabs.api.models.companies.documents.GenericDocument
import com.dataleonlabs.api.models.individuals.documents.DocumentListParams
import com.dataleonlabs.api.models.individuals.documents.DocumentUploadParams

class DocumentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentServiceAsync {

    private val withRawResponse: DocumentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocumentServiceAsync =
        DocumentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions,
    ): DocumentResponse =
        // get /individuals/{individual_id}/documents
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions,
    ): GenericDocument =
        // post /individuals/{individual_id}/documents
        withRawResponse().upload(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DocumentServiceAsync.WithRawResponse =
            DocumentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<DocumentResponse> =
            jsonHandler<DocumentResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("individualId", params.individualId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals", params._pathParam(0), "documents")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadHandler: Handler<GenericDocument> =
            jsonHandler<GenericDocument>(clientOptions.jsonMapper)

        override suspend fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GenericDocument> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("individualId", params.individualId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals", params._pathParam(0), "documents")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
