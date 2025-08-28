// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.async

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
import com.dataleonlabs.api.core.prepareAsync
import com.dataleonlabs.api.models.individuals.Individual
import com.dataleonlabs.api.models.individuals.IndividualCreateParams
import com.dataleonlabs.api.models.individuals.IndividualDeleteParams
import com.dataleonlabs.api.models.individuals.IndividualListParams
import com.dataleonlabs.api.models.individuals.IndividualRetrieveParams
import com.dataleonlabs.api.models.individuals.IndividualUpdateParams
import com.dataleonlabs.api.services.async.individuals.DocumentServiceAsync
import com.dataleonlabs.api.services.async.individuals.DocumentServiceAsyncImpl

class IndividualServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IndividualServiceAsync {

    private val withRawResponse: IndividualServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): IndividualServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IndividualServiceAsync =
        IndividualServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun documents(): DocumentServiceAsync = documents

    override suspend fun create(
        params: IndividualCreateParams,
        requestOptions: RequestOptions,
    ): Individual =
        // post /individuals
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: IndividualRetrieveParams,
        requestOptions: RequestOptions,
    ): Individual =
        // get /individuals/{individual_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: IndividualUpdateParams,
        requestOptions: RequestOptions,
    ): Individual =
        // put /individuals/{individual_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: IndividualListParams,
        requestOptions: RequestOptions,
    ): List<Individual> =
        // get /individuals
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: IndividualDeleteParams, requestOptions: RequestOptions) {
        // delete /individuals/{individual_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndividualServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val documents: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): IndividualServiceAsync.WithRawResponse =
            IndividualServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun documents(): DocumentServiceAsync.WithRawResponse = documents

        private val createHandler: Handler<Individual> =
            jsonHandler<Individual>(clientOptions.jsonMapper)

        override suspend fun create(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun retrieve(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun update(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun list(
            params: IndividualListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Individual>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun delete(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
