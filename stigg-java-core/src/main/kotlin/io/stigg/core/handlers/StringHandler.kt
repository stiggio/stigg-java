@file:JvmName("StringHandler")

package io.stigg.core.handlers

import io.stigg.core.http.HttpResponse
import io.stigg.core.http.HttpResponse.Handler

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
