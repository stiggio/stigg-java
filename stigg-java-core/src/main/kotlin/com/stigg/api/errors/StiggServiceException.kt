// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.errors

import com.stigg.api.core.JsonValue
import com.stigg.api.core.http.Headers

abstract class StiggServiceException
protected constructor(message: String, cause: Throwable? = null) : StiggException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
