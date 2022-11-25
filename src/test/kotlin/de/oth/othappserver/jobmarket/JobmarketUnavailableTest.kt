package de.oth.othappserver.jobmarket

import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.whenever
import de.oth.othappserver.BaseIntegrationTest
import de.oth.othappserver.utils.TestUtils
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.CloseableHttpClient
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers.any
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.exchange
import org.springframework.http.HttpStatus
import org.springframework.http.RequestEntity
import org.springframework.test.annotation.DirtiesContext
import org.zalando.problem.Problem

@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
class JobmarketUnavailableTest : BaseIntegrationTest() {
    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @MockBean(name = "httpClient")
    private lateinit var client: CloseableHttpClient

    @BeforeEach
    fun setUp() {
        doAnswer { TestUtils.mockResponse(JobMarketClient.ERROR_RESPONSE) }
            .whenever(client).execute(any(HttpGet::class.java))
    }

    @Test
    fun `query all university rooms with webuntis unavailable`() {
        val request = RequestEntity.get(createURLWithPort("/v1/jobmarket")).build()
        val response = restTemplate.exchange<Problem>(request)

        assertEquals(HttpStatus.SERVICE_UNAVAILABLE.value(), response.statusCode.value())
    }
}
