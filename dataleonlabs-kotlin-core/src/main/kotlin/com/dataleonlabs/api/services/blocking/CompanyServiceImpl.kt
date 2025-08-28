// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.blocking

import com.dataleonlabs.api.core.ClientOptions
import com.dataleonlabs.api.core.RequestOptions
import com.dataleonlabs.api.core.checkRequired
import com.dataleonlabs.api.core.handlers.emptyHandler
import com.dataleonlabs.api.core.handlers.errorBodyHandler
import com.dataleonlabs.api.core.handlers.errorHandler
import com.dataleonlabs.api.core.handlers.jsonHandler
import com.dataleonlabs.api.core.http.HttpMethod
import com.dataleonlabs.api.core.http.HttpRequest
import com.dataleonlabs.api.core.http.HttpResponse
import com.dataleonlabs.api.core.http.HttpResponse.Handler
import com.dataleonlabs.api.core.http.HttpResponseFor
import com.dataleonlabs.api.core.http.json
import com.dataleonlabs.api.core.http.parseable
import com.dataleonlabs.api.core.prepare
import com.dataleonlabs.api.models.companies.Company
import com.dataleonlabs.api.models.companies.CompanyCreateParams
import com.dataleonlabs.api.models.companies.CompanyDeleteParams
import com.dataleonlabs.api.models.companies.CompanyListParams
import com.dataleonlabs.api.models.companies.CompanyRetrieveParams
import com.dataleonlabs.api.models.companies.CompanyUpdateParams
import com.dataleonlabs.api.services.blocking.companies.DocumentService
import com.dataleonlabs.api.services.blocking.companies.DocumentServiceImpl

class CompanyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CompanyService {

    private val withRawResponse: CompanyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    override fun withRawResponse(): CompanyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompanyService =
        CompanyServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun documents(): DocumentService = documents

    override fun create(params: CompanyCreateParams, requestOptions: RequestOptions): Company =
        // post /companies
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: CompanyRetrieveParams, requestOptions: RequestOptions): Company =
        // get /companies/{company_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: CompanyUpdateParams, requestOptions: RequestOptions): Company =
        // put /companies/{company_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: CompanyListParams, requestOptions: RequestOptions): List<Company> =
        // get /companies
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CompanyDeleteParams, requestOptions: RequestOptions) {
        // delete /companies/{company_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CompanyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val documents: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CompanyService.WithRawResponse =
            CompanyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun documents(): DocumentService.WithRawResponse = documents

        private val createHandler: Handler<Company> = jsonHandler<Company>(clientOptions.jsonMapper)

        override fun create(
            params: CompanyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Company> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Company> =
            jsonHandler<Company>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CompanyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Company> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Company> = jsonHandler<Company>(clientOptions.jsonMapper)

        override fun update(
            params: CompanyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Company> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<Company>> =
            jsonHandler<List<Company>>(clientOptions.jsonMapper)

        override fun list(
            params: CompanyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Company>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CompanyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
