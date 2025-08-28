// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.blocking

import com.dataleonlabs.api.core.ClientOptions
import com.dataleonlabs.api.core.RequestOptions
import com.dataleonlabs.api.core.http.HttpResponse
import com.dataleonlabs.api.core.http.HttpResponseFor
import com.dataleonlabs.api.models.individuals.Individual
import com.dataleonlabs.api.models.individuals.IndividualCreateParams
import com.dataleonlabs.api.models.individuals.IndividualDeleteParams
import com.dataleonlabs.api.models.individuals.IndividualListParams
import com.dataleonlabs.api.models.individuals.IndividualRetrieveParams
import com.dataleonlabs.api.models.individuals.IndividualUpdateParams
import com.dataleonlabs.api.services.blocking.individuals.DocumentService
import com.google.errorprone.annotations.MustBeClosed

interface IndividualService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IndividualService

    fun documents(): DocumentService

    /** Create a new individual */
    fun create(
        params: IndividualCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Individual

    /** Get an individual by ID */
    fun retrieve(
        individualId: String,
        params: IndividualRetrieveParams = IndividualRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Individual = retrieve(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: IndividualRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Individual

    /** @see retrieve */
    fun retrieve(individualId: String, requestOptions: RequestOptions): Individual =
        retrieve(individualId, IndividualRetrieveParams.none(), requestOptions)

    /** Update an individual by ID */
    fun update(
        individualId: String,
        params: IndividualUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Individual = update(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see update */
    fun update(
        params: IndividualUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Individual

    /** Get all individuals */
    fun list(
        params: IndividualListParams = IndividualListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Individual>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<Individual> =
        list(IndividualListParams.none(), requestOptions)

    /** Delete an individual by ID */
    fun delete(
        individualId: String,
        params: IndividualDeleteParams = IndividualDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: IndividualDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(individualId: String, requestOptions: RequestOptions) =
        delete(individualId, IndividualDeleteParams.none(), requestOptions)

    /** A view of [IndividualService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): IndividualService.WithRawResponse

        fun documents(): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /individuals`, but is otherwise the same as
         * [IndividualService.create].
         */
        @MustBeClosed
        fun create(
            params: IndividualCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Individual>

        /**
         * Returns a raw HTTP response for `get /individuals/{individual_id}`, but is otherwise the
         * same as [IndividualService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            individualId: String,
            params: IndividualRetrieveParams = IndividualRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Individual> =
            retrieve(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IndividualRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Individual>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            individualId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Individual> =
            retrieve(individualId, IndividualRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /individuals/{individual_id}`, but is otherwise the
         * same as [IndividualService.update].
         */
        @MustBeClosed
        fun update(
            individualId: String,
            params: IndividualUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Individual> =
            update(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: IndividualUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Individual>

        /**
         * Returns a raw HTTP response for `get /individuals`, but is otherwise the same as
         * [IndividualService.list].
         */
        @MustBeClosed
        fun list(
            params: IndividualListParams = IndividualListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Individual>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Individual>> =
            list(IndividualListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /individuals/{individual_id}`, but is otherwise
         * the same as [IndividualService.delete].
         */
        @MustBeClosed
        fun delete(
            individualId: String,
            params: IndividualDeleteParams = IndividualDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: IndividualDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(individualId: String, requestOptions: RequestOptions): HttpResponse =
            delete(individualId, IndividualDeleteParams.none(), requestOptions)
    }
}
