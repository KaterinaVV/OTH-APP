package de.oth.othappserver.webuntis

import de.oth.othappserver.FreshContextIntegrationTest
import de.oth.othappserver.model.UniversityInfo
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.ResponseEntity

class WebUntisAuthTest @Autowired constructor(private val restTemplate: TestRestTemplate) :
    FreshContextIntegrationTest() {

    @Test
    fun `can authenticate to WebUntis`() {
        val response: ResponseEntity<UniversityInfo> = restTemplate.getForEntity(createURLWithPort("/v1/university/info"), UniversityInfo::class.java)

        Assertions.assertNotNull(response)
        Assertions.assertNotNull(response.body)
        Assertions.assertTrue(response.statusCode.is2xxSuccessful)
    }
}
