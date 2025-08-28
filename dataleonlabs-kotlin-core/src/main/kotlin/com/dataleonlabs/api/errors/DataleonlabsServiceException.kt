// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.errors

import com.dataleonlabs.api.core.JsonValue
import com.dataleonlabs.api.core.http.Headers

abstract class DataleonlabsServiceException
protected constructor(message: String, cause: Throwable? = null) :
    DataleonlabsException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
