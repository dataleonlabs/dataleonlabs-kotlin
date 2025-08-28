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
import com.dataleonlabs.api.models.individuals.Individual
import com.dataleonlabs.api.models.individuals.IndividualCreateParams
import com.dataleonlabs.api.models.individuals.IndividualDeleteParams
import com.dataleonlabs.api.models.individuals.IndividualListParams
import com.dataleonlabs.api.models.individuals.IndividualRetrieveParams
import com.dataleonlabs.api.models.individuals.IndividualUpdateParams
import com.dataleonlabs.api.services.blocking.individuals.DocumentService
import com.dataleonlabs.api.services.blocking.individuals.DocumentServiceImpl

class IndividualServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IndividualService {

    private val withRawResponse: IndividualService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    override fun withRawResponse(): IndividualService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IndividualService =
        IndividualServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun documents(): DocumentService = documents

    override fun create(
        params: IndividualCreateParams,
        requestOptions: RequestOptions,
    ): Individual =
        // post /individuals
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: IndividualRetrieveParams,
        requestOptions: RequestOptions,
    ): Individual =
        // get /individuals/{individual_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: IndividualUpdateParams,
        requestOptions: RequestOptions,
    ): Individual =
        // put /individuals/{individual_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: IndividualListParams,
        requestOptions: RequestOptions,
    ): List<Individual> =
        // get /individuals
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: IndividualDeleteParams, requestOptions: RequestOptions) {
        // delete /individuals/{individual_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndividualService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val documents: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): IndividualService.WithRawResponse =
            IndividualServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun documents(): DocumentService.WithRawResponse = documents

        private val createHandler: Handler<Individual> =
            jsonHandler<Individual>(clientOptions.jsonMapper)

        override fun create(
            params: IndividualCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Individual> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals")
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

        private val retrieveHandler: Handler<Individual> =
            jsonHandler<Individual>(clientOptions.jsonMapper)

        override fun retrieve(
            params: IndividualRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Individual> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("individualId", params.individualId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals", params._pathParam(0))
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

        private val updateHandler: Handler<Individual> =
            jsonHandler<Individual>(clientOptions.jsonMapper)

        override fun update(
            params: IndividualUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Individual> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("individualId", params.individualId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals", params._pathParam(0))
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

        private val listHandler: Handler<List<Individual>> =
            jsonHandler<List<Individual>>(clientOptions.jsonMapper)

        override fun list(
            params: IndividualListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Individual>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals")
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
            params: IndividualDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("individualId", params.individualId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals", params._pathParam(0))
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
