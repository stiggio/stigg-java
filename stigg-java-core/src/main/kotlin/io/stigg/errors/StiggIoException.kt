package io.stigg.errors

class StiggIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : StiggException(message, cause)
