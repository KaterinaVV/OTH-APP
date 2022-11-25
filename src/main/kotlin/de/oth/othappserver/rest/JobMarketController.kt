package de.oth.othappserver.rest

import de.oth.othappserver.api.JobMarketApi
import de.oth.othappserver.jobmarket.JobMarketUtils
import de.oth.othappserver.jobmarket.JobmarketProperties
import de.oth.othappserver.model.Job
import de.oth.othappserver.model.JobDetails
import de.oth.othappserver.model.JobMarket
import de.oth.othappserver.model.JobQuery
import de.oth.othappserver.service.IJobMarketService
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import org.zalando.problem.Problem
import org.zalando.problem.Status.BAD_REQUEST
import java.time.LocalDate

@RestController
@ConditionalOnProperty(JobmarketProperties.ENABLED)
open class JobMarketController(private val jobMarketService: IJobMarketService) : JobMarketApi {
    companion object {
        private val logger = LoggerFactory.getLogger(JobMarketController::class.java)
    }

    override fun jobById(id: Int): ResponseEntity<JobDetails> {
        val job = jobMarketService.getJobById(id)

        return ResponseEntity.ok(job)
    }

    override fun jobs(jobQuery: JobQuery): ResponseEntity<List<Job>> {
        var intermediate = jobMarketService.jobs(jobQuery)

        if (jobQuery.company != null && jobQuery.company.isNotEmpty()) {
            intermediate = intermediate.filter { it.company == jobQuery.company }
        }

        if (jobQuery.since != null) {
            intermediate = intermediate.filter {
                val date = JobMarketUtils.toBerlinOffset(it.date)

                date.isAfter(jobQuery.since.atStartOfDay().atOffset(date.offset))
            }
        }

        val body = intermediate.mapNotNull {
            try {
                it.toModel()
            } catch (e: Exception) {
                logger.error("Failed to map job to its model.", e)
                null
            }
        }

        return ResponseEntity.ok(body)
    }

    override fun jobmarket(): ResponseEntity<JobMarket> {
        val jobMarket = jobMarketService.jobmarket()

        return ResponseEntity.ok(jobMarket)
    }

    override fun newJobs(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) since: LocalDate): ResponseEntity<Int> {
        if (since.isAfter(LocalDate.now())) throw Problem.valueOf(BAD_REQUEST, "Parameter since should be today or in the past.")

        val count = jobMarketService.jobCount(since)

        return ResponseEntity.ok(count)
    }
}
