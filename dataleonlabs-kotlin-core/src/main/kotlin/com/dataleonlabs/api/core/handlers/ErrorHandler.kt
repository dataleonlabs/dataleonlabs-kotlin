// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.core.handlers

import com.dataleonlabs.api.core.JsonMissing
import com.dataleonlabs.api.core.JsonValue
import com.dataleonlabs.api.core.http.HttpResponse
import com.dataleonlabs.api.core.http.HttpResponse.Handler
import com.dataleonlabs.api.errors.BadRequestException
import com.dataleonlabs.api.errors.InternalServerException
import com.dataleonlabs.api.errors.NotFoundException
import com.dataleonlabs.api.errors.PermissionDeniedException
import com.dataleonlabs.api.errors.RateLimitException
import com.dataleonlabs.api.errors.UnauthorizedException
import com.dataleonlabs.api.errors.UnexpectedStatusCodeException
import com.dataleonlabs.api.errors.UnprocessableEntityException
import com.fasterxml.jackson.databind.json.JsonMapper

internal fun errorBodyHandler(jsonMapper: JsonMapper): Handler<JsonValue> {
    val handler = jsonHandler<JsonValue>(jsonMapper)

    return object : Handler<JsonValue> {
        override fun handle(response: HttpResponse): JsonValue =
            try {
                handler.handle(response)
            } catch (e: Exception) {
                JsonMissing.of()
            }
    }
}

internal fun errorHandler(errorBodyHandler: Handler<JsonValue>): Handler<HttpResponse> =
    object : Handler<HttpResponse> {
        override fun handle(response: HttpResponse): HttpResponse =
            when (val statusCode = response.statusCode()) {
                in 200..299 -> response
                400 ->
                    throw BadRequestException.builder()
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                401 ->
                    throw UnauthorizedException.builder()
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                403 ->
                    throw PermissionDeniedException.builder()
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                404 ->
                    throw NotFoundException.builder()
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                422 ->
                    throw UnprocessableEntityException.builder()
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                429 ->
                    throw RateLimitException.builder()
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                in 500..599 ->
                    throw InternalServerException.builder()
                        .statusCode(statusCode)
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                else ->
                    throw UnexpectedStatusCodeException.builder()
                        .statusCode(statusCode)
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
            }
    }
