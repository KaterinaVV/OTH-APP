package de.oth.othappserver.service

import de.oth.othappserver.jobmarket.JobMarketJob
import de.oth.othappserver.model.JobDetails
import de.oth.othappserver.model.JobMarket
import de.oth.othappserver.model.JobQuery
import java.time.LocalDate

interface IJobMarketService {
    fun getJobById(id: Int): JobDetails
    fun jobs(query: JobQuery): List<JobMarketJob>
    fun jobmarket(): JobMarket
    fun jobCount(since: LocalDate): Int
}
