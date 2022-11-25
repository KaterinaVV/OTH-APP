package de.oth.othappserver.exceptions

import org.springframework.core.env.Environment
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.NativeWebRequest
import org.zalando.problem.Problem
import org.zalando.problem.Status
import org.zalando.problem.spring.web.advice.AdviceTrait
import org.zalando.problem.spring.web.advice.ProblemHandling
import java.net.URI

/**
 * Defines exception handlers for our custom exceptions.
 */
@ControllerAdvice
open class ProblemHandlingAdvice(private val environment: Environment) : AdviceTrait, ProblemHandling {
    companion object {
        val TYPE: URI = URI.create("https://othr.de/error/ServiceNotAvailable")
    }

    @ExceptionHandler
    fun handleThirdPartyProblem(
        problem: ThirdPartyProblem,
        request: NativeWebRequest
    ): ResponseEntity<Problem> {
        val error = Problem.builder()
            .withType(TYPE)
            .withTitle(Status.SERVICE_UNAVAILABLE.reasonPhrase)
            .withStatus(Status.SERVICE_UNAVAILABLE)
            .withCause(problem)
            .build()

        return create(error, request)
    }

    override fun isCausalChainsEnabled(): Boolean {
        return environment.activeProfiles.contains("dev")
    }
}
