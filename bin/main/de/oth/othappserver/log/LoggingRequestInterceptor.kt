package de.oth.othappserver.log

import org.apache.http.HttpRequest
import org.apache.http.HttpRequestInterceptor
import org.apache.http.protocol.HttpContext
import org.apache.http.protocol.HttpCoreContext
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class LoggingRequestInterceptor : HttpRequestInterceptor {
    companion object {
        val logger: Logger = LoggerFactory.getLogger("http-client")
    }

    override fun process(request: HttpRequest, context: HttpContext?) {
        if (logger.isDebugEnabled) {
            val hostName = HttpCoreContext.adapt(context).targetHost.hostName

            logger.debug("${request.requestLine.method} $hostName${request.requestLine.uri}")
        }
    }
}
