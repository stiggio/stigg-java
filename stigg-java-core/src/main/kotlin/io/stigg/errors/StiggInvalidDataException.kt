package io.stigg.errors

class StiggInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : StiggException(message, cause)
