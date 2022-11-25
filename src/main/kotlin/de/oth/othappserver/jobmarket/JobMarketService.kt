package de.oth.othappserver.jobmarket

import com.github.benmanes.caffeine.cache.Caffeine
import com.github.benmanes.caffeine.cache.LoadingCache
import de.oth.othappserver.config.CacheConfig.Companion.DAY_CACHE
import de.oth.othappserver.config.CacheConfig.Companion.SHORT_CACHE
import de.oth.othappserver.model.*
import de.oth.othappserver.service.IFacultyService
import de.oth.othappserver.service.IJobMarketService
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.concurrent.TimeUnit

@Service
@ConditionalOnProperty(JobmarketProperties.ENABLED)
@CacheConfig(cacheNames = [DAY_CACHE], keyGenerator = "customKeyGenerator")
open class JobMarketService(
    private val jobMarketClient: JobMarketClient,
    private val facultyService: IFacultyService
) : IJobMarketService {

    companion object {
        val JobCountCacheKeyFormatter: DateTimeFormatter = DateTimeFormatter.ISO_DATE
        const val MAX_JOB_COUNT = 100
        const val DEFAULT_MAX_VALUE = 100
    }

    /** A cache with a date string as key and the jobs count as value. */
    private val jobCountCache: LoadingCache<String, Int> = Caffeine.newBuilder()
        .expireAfterWrite(1, TimeUnit.DAYS)
        .refreshAfterWrite(3, TimeUnit.HOURS)
        .maximumSize(20)
        .build { k ->
            val since = LocalDate.from(JobCountCacheKeyFormatter.parse(k)).atStartOfDay()

            jobMarketClient.execute(JobMarketRequests.jobOffers(MAX_JOB_COUNT))
                .filter { LocalDateTime.from(JobMarketUtils.JobMarketDateTimeFormat.parse(it.date)).isAfter(since) }
                .map { j -> j.toModel() }
                .count()
        }

    @Cacheable(value = [SHORT_CACHE])
    override fun getJobById(id: Int): JobDetails {
        val result = jobMarketClient.execute(JobMarketRequests.jobOffer(id))
        val faculties = facultyService.faculties().keys
            .filter { it.jobmarketId != null }

        return result.toModel(faculties)
    }

    override fun jobs(query: JobQuery): List<JobMarketJob> {
        val faculty = if (query.faculty != null) facultyService.faculty(query.faculty) else null

        return jobMarketClient.execute(
            JobMarketRequests.jobOffers(query.type, faculty, query.industry, query.text, query.location, query.country, query.max ?: DEFAULT_MAX_VALUE)
        )
    }

    override fun jobCount(since: LocalDate): Int = jobCountCache.get(JobCountCacheKeyFormatter.format(since)) ?: 0

    @Cacheable(value = [DAY_CACHE])
    override fun jobmarket(): JobMarket {
        val (industries, types, jobs) = jobMarketClient.executeBatch(
            JobMarketRequests.industry(),
            JobMarketRequests.types(),
            JobMarketRequests.jobOffers()
        )

        val countries = jobs
            .filter { it.country != null && it.country.isNotEmpty() }
            .map { it.country!! }
            .distinct()

        val companies = jobs
            .filter { it.company != null && it.company.isNotEmpty() }
            .map { it.company!! }
            .distinct()

        return JobMarket(
            industries.map { Industry(it.id.toInt(), it.identifier) },
            types.map { JobType(it.id.toInt(), it.identifier) },
            countries,
            companies
        )
    }
}
