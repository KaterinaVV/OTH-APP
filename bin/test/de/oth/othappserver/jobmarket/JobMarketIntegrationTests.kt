package de.oth.othappserver.jobmarket

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.nhaarman.mockitokotlin2.whenever
import de.oth.othappserver.IntegrationTest
import de.oth.othappserver.model.*
import de.oth.othappserver.service.IFacultyService
import de.oth.othappserver.utils.TestUtils
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.CloseableHttpClient
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.exchange
import org.springframework.http.RequestEntity
import java.math.BigDecimal
import java.time.LocalDate
import java.time.format.DateTimeFormatter

private class JobMarketIntegrationTests @Autowired constructor(
    private val restTemplate: TestRestTemplate,
    private val mapper: ObjectMapper,
    private val facultyService: IFacultyService,
    private val jobmarketProperties: JobmarketProperties
) : IntegrationTest() {

    @MockBean
    private lateinit var client: CloseableHttpClient

    @Test
    internal fun `get jobmarket information`() {
        whenever(client.execute(ArgumentMatchers.any(HttpGet::class.java))).thenAnswer {
            val httpGet = it.arguments[0] as HttpGet
            val industryCall = mapper.writeValueAsString(IndustryCategoryCall(1))
            val typesCall = mapper.writeValueAsString(JobTypesCall())
            val jobsCall = mapper.writeValueAsString(JobOffersCall(null, null, null, null, null, null, null, null))

            val query = httpGet.uri.query
            when {
                query.contains(industryCall) && query.contains(typesCall) && query.contains(jobsCall) -> {
                    TestUtils.mockResponseFromFile("responses/jobmarket/industries_types_jobs.json")
                }
                else -> fail("JobMarket call with wrong values.")
            }
        }
        val request = RequestEntity.get(createURLWithPort("/v1/jobmarket")).build()
        val response = restTemplate.exchange<JobMarket>(request)

        assertNotNull(response)
        assertNotNull(response.body)
        assertTrue(response.statusCode.is2xxSuccessful)

        val jobMarket = response.body!!
        assertTrue(jobMarket.industries.contains(Industry(1, "Abfallwirtschaft")))
        assertTrue(jobMarket.jobtypes.contains(JobType(9, "Praktikum im Studium")))
        assertTrue(jobMarket.countries.contains("Deutschland"))
        assertTrue(jobMarket.companies.contains("Wasserwirtschaftsamt Bad Kissingen"))
    }

    /**
     * Tests /v1/jobmarket/job functionality for a successful return value.
     *
     * Also verifies that a JobQuery without "max" Parameter results is a default max value.
     */
    @Test
    internal fun `get jobmarket jobs default`() {
        whenever(client.execute(ArgumentMatchers.any(HttpGet::class.java))).thenAnswer {
            val httpGet = it.arguments[0] as HttpGet
            val jobsCall = mapper.writeValueAsString(JobOffersCall(null, null, null, null, null, null, null, JobMarketService.DEFAULT_MAX_VALUE.toString()))

            val query = httpGet.uri.query
            when {
                query.contains(jobsCall) -> {
                    TestUtils.mockResponseFromFile("responses/jobmarket/jobs.json")
                }
                else -> fail("JobMarket jobs call with wrong values.")
            }
        }

        val request = RequestEntity
            .post(createURLWithPort("/v1/jobmarket/job"))
            .body(JobQuery())
        val response = restTemplate.exchange<List<Job>>(request)

        assertNotNull(response)
        assertNotNull(response.body)
        assertTrue(response.statusCode.is2xxSuccessful)
    }

    /**
     * Tests /v1/jobmarket/job functionality for a successful return value.
     *
     * Verifies that JobQuery filters are properly handed to JobMarket.
     */
    @Test
    fun `get filtered jobmarket jobs`() {
        val facultyIM = facultyService.faculty("IM")
        val type = 1
        val industry = 2
        val max = 10
        val text = "SAP"
        val country = "Deutschland"
        val company = "Wasserwirtschaftsamt Bad Kissingen"
        val latitude = BigDecimal.ONE
        val longitude = BigDecimal.TEN
        val radius = 100
        val since = LocalDate.parse("2020-07-06")

        whenever(client.execute(ArgumentMatchers.any(HttpGet::class.java))).thenAnswer {
            val httpGet = it.arguments[0] as HttpGet
            val query = httpGet.uri.query.substring(2)
            val request = mapper.readValue<JobMarketRequest>(query)

            val jobsCall = JobOffersCall(listOf(type), facultyIM.jobmarketId, listOf(industry), listOf(text), "($latitude,$longitude)", radius.toString(), country, max.toString())
            val expected = JobMarketRequest(JobMarketCredentials(jobmarketProperties.clientId, jobmarketProperties.clientKey), listOf(jobsCall))
            assertEquals(expected, request)

            TestUtils.mockResponseFromFile("responses/jobmarket/jobs.json")
        }

        val query = JobQuery(facultyIM.identifier, listOf(type), listOf(industry), text, country, company, JobQueryLocation(latitude, longitude, radius), since, max)
        val request = RequestEntity
            .post(createURLWithPort("/v1/jobmarket/job"))
            .body(query)
        val response = restTemplate.exchange<List<Job>>(request)

        assertNotNull(response)
        assertNotNull(response.body)
        assertTrue(response.statusCode.is2xxSuccessful)

        val body = response.body!!
        val job = Job(
            657837,
            "Diplomingenieur (FH) / Bachelor of Engineering / Bachelor of Science (m/w/d)",
            "https://jobboerse.oth-regensburg.de/index.php/Logo/7c9cbbecfe19a9ede7d845d1046ae280.201616448623.jpeg",
            "https://jobboerse.oth-regensburg.de/index.php/PDF/657837",
            "https://jobboerse.oth-regensburg.de/index.php/job/657837-Diplomingenieur-FH-Bachelor-of-Engineering-Bachelor-of-Science-mwd-Wasserwirtschaftsamt-Bad-Kissingen",
            "Wasserwirtschaftsamt Bad Kissingen",
            "50.200733700000001",
            "10.080392",
            "Deutschland",
            LocalDate.parse("2020-07-06")
        )
        assertTrue(body.contains(job))
        body.forEach {
            assertEquals(company, it.company)
        }
    }

    /**
     * Tests /v1/jobmarket/job/{id} functionality for a successful return value.
     */
    @Test
    internal fun `get single jobmarket job`() {
        val id = 657837
        whenever(client.execute(ArgumentMatchers.any(HttpGet::class.java))).thenAnswer {
            val httpGet = it.arguments[0] as HttpGet
            val query = httpGet.uri.query.substring(2)
            val request = mapper.readValue<JobMarketRequest>(query)

            val jobsCall = JobOfferCall(id.toString())
            val expected = JobMarketRequest(JobMarketCredentials(jobmarketProperties.clientId, jobmarketProperties.clientKey), listOf(jobsCall))
            assertEquals(expected, request)

            TestUtils.mockResponseFromFile("responses/jobmarket/job.json")
        }

        val request = RequestEntity
            .get(createURLWithPort("/v1/jobmarket/job/$id"))
            .build()
        val response = restTemplate.exchange<JobDetails>(request)

        assertNotNull(response)
        assertNotNull(response.body)
        assertTrue(response.statusCode.is2xxSuccessful)
    }

    /**
     * Tests /v1/jobmarket/new?since={since} functionality for a successful return value.
     */
    @Test
    internal fun `get new jobmarket jobs`() {
        val since = LocalDate.parse("2020-07-06")

        whenever(client.execute(ArgumentMatchers.any(HttpGet::class.java))).thenAnswer {
            val httpGet = it.arguments[0] as HttpGet
            val query = httpGet.uri.query.substring(2)
            val request = mapper.readValue<JobMarketRequest>(query)

            val jobsCall = JobOffersCall(null, null, null, null, null, null, null, JobMarketService.DEFAULT_MAX_VALUE.toString())
            val expected = JobMarketRequest(JobMarketCredentials(jobmarketProperties.clientId, jobmarketProperties.clientKey), listOf(jobsCall))
            assertEquals(expected, request)

            TestUtils.mockResponseFromFile("responses/jobmarket/jobs.json")
        }

        val request = RequestEntity
            .get(createURLWithPort("/v1/jobmarket/new?since=${since.format(DateTimeFormatter.ISO_DATE)}"))
            .build()
        val response = restTemplate.exchange<Int>(request)

        assertNotNull(response)
        assertNotNull(response.body)
        assertTrue(response.statusCode.is2xxSuccessful)
        // only 2 jobs are after 2020-07-06
        assertEquals(2, response.body!!)
    }
}
