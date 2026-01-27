// File generated from our OpenAPI spec by Stainless.

package io.stigg.errors

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers

abstract class StiggServiceException
protected constructor(message: String, cause: Throwable? = null) : StiggException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
