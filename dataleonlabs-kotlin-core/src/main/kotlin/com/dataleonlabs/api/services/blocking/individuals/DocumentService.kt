// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.blocking.individuals

import com.dataleonlabs.api.core.ClientOptions
import com.dataleonlabs.api.core.RequestOptions
import com.dataleonlabs.api.core.http.HttpResponseFor
import com.dataleonlabs.api.models.companies.documents.DocumentResponse
import com.dataleonlabs.api.models.companies.documents.GenericDocument
import com.dataleonlabs.api.models.individuals.documents.DocumentListParams
import com.dataleonlabs.api.models.individuals.documents.DocumentUploadParams
import com.google.errorprone.annotations.MustBeClosed

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocumentService

    /** Get documents to an individuals */
    fun list(
        individualId: String,
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentResponse =
        list(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see list */
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentResponse

    /** @see list */
    fun list(individualId: String, requestOptions: RequestOptions): DocumentResponse =
        list(individualId, DocumentListParams.none(), requestOptions)

    /** Upload documents to an individual */
    fun upload(
        individualId: String,
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GenericDocument =
        upload(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see upload */
    fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GenericDocument

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /individuals/{individual_id}/documents`, but is
         * otherwise the same as [DocumentService.list].
         */
        @MustBeClosed
        fun list(
            individualId: String,
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentResponse> =
            list(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            individualId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentResponse> =
            list(individualId, DocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /individuals/{individual_id}/documents`, but is
         * otherwise the same as [DocumentService.upload].
         */
        @MustBeClosed
        fun upload(
            individualId: String,
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GenericDocument> =
            upload(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GenericDocument>
    }
}
