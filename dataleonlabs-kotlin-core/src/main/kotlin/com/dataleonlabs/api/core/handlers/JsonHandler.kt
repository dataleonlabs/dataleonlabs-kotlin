@file:JvmName("JsonHandler")

package com.dataleonlabs.api.core.handlers

import com.dataleonlabs.api.core.http.HttpResponse
import com.dataleonlabs.api.core.http.HttpResponse.Handler
import com.dataleonlabs.api.errors.DataleonlabsInvalidDataException
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw DataleonlabsInvalidDataException("Error reading response", e)
            }
        }
    }
