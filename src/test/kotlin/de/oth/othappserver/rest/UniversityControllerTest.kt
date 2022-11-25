package de.oth.othappserver.rest

import de.oth.othappserver.IntegrationTest
import de.oth.othappserver.model.Room
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.exchange
import org.springframework.http.RequestEntity

internal class UniversityControllerTest @Autowired constructor(
    private val restTemplate: TestRestTemplate
) : IntegrationTest() {

    @Test
    fun `query all university rooms`() {
        val request = RequestEntity.get(createURLWithPort("/v1/university/room")).build()
        val response = restTemplate.exchange<List<Room>>(request)
        Assertions.assertNotNull(response)
        Assertions.assertNotNull(response.body)

        val result = response.body as List<Room>
        assertThat(result).isNotEmpty
        assertThat(result).contains(Room(31, "D003", "D003 (Hörsaal - 120 - IM)"))
    }
}
