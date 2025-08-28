// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.async.individuals

import com.dataleonlabs.api.core.ClientOptions
import com.dataleonlabs.api.core.RequestOptions
import com.dataleonlabs.api.core.http.HttpResponseFor
import com.dataleonlabs.api.models.companies.documents.DocumentResponse
import com.dataleonlabs.api.models.companies.documents.GenericDocument
import com.dataleonlabs.api.models.individuals.documents.DocumentListParams
import com.dataleonlabs.api.models.individuals.documents.DocumentUploadParams
import com.google.errorprone.annotations.MustBeClosed

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocumentServiceAsync

    /** Get documents to an individuals */
    suspend fun list(
        individualId: String,
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentResponse =
        list(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentResponse

    /** @see list */
    suspend fun list(individualId: String, requestOptions: RequestOptions): DocumentResponse =
        list(individualId, DocumentListParams.none(), requestOptions)

    /** Upload documents to an individual */
    suspend fun upload(
        individualId: String,
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GenericDocument =
        upload(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see upload */
    suspend fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GenericDocument

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /individuals/{individual_id}/documents`, but is
         * otherwise the same as [DocumentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            individualId: String,
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentResponse> =
            list(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            individualId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentResponse> =
            list(individualId, DocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /individuals/{individual_id}/documents`, but is
         * otherwise the same as [DocumentServiceAsync.upload].
         */
        @MustBeClosed
        suspend fun upload(
            individualId: String,
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GenericDocument> =
            upload(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        suspend fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GenericDocument>
    }
}
