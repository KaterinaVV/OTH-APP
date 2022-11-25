package de.oth.othappserver.exceptions

import org.zalando.problem.AbstractThrowableProblem
import org.zalando.problem.Exceptional
import org.zalando.problem.Status.SERVICE_UNAVAILABLE
import java.net.URI

/**
 * Generic problem with a third party dependency service.
 */
abstract class ThirdPartyProblem(type: URI, title: String, detail: String) : AbstractThrowableProblem(type, title, SERVICE_UNAVAILABLE, detail, null) {
    override fun getCause(): Exceptional? = super.cause
}

/**
 * Problem thrown when WebUntis does currently not resolve requests.
 */
class WebuntisNotAvailable : ThirdPartyProblem(TYPE, TITLE, "WebUntis currently unavailable. Try again later.") {
    companion object {
        val TYPE: URI = URI.create("https://othr.de/error/webuntis/ServiceNotAvailable")
        const val TITLE: String = "WebUntis Unavailable"
    }
}

/**
 * Problem thrown when Jobmarket does currently not resolve requests.
 */
class JobmarketNotAvailable : ThirdPartyProblem(TYPE, TITLE, "Jobmarket currently unavailable. Try again later.") {
    companion object {
        val TYPE: URI = URI.create("https://othr.de/error/jobmarket/ServiceNotAvailable")
        const val TITLE: String = "Jobmarket Unavailable"
    }
}
