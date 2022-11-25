package de.oth.othappserver.exceptions

import org.zalando.problem.AbstractThrowableProblem
import org.zalando.problem.Exceptional
import org.zalando.problem.Status.BAD_REQUEST
import java.net.URI

// Exchange exceptions
class InvalidSyncTokenProblem : AbstractThrowableProblem(
    TYPE,
    "Invalid deltaToken or skipToken.",
    BAD_REQUEST,
    "The provided token is not valid anymore."
) {
    companion object {
        val TYPE: URI = URI.create("https://othr.de/error/event/InvalidSyncToken")
    }

    override fun getCause(): Exceptional? = super.cause
}
