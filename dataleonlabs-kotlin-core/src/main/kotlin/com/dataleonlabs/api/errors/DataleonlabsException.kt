package com.dataleonlabs.api.errors

open class DataleonlabsException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
