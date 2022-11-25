package de.oth.othappserver.rest

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.type.CollectionType
import de.oth.othappserver.IntegrationTest
import de.oth.othappserver.model.Faculty
import de.oth.othappserver.model.FacultyDetail
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod.GET
import org.springframework.http.HttpStatus.NOT_FOUND
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity

internal class FacultyControllerTests @Autowired constructor(
    private val restTemplate: TestRestTemplate,
    mapper: ObjectMapper
) : IntegrationTest() {

    private val facultyListType: CollectionType = mapper.typeFactory.constructCollectionType(List::class.java, Faculty::class.java)

    @Test
    fun `Get a list of all faculties`() {
        val response: ResponseEntity<List<Faculty>> = restTemplate.exchange(
            createURLWithPort("/v1/faculty/"),
            GET,
            null,
            ParameterizedTypeReference.forType(facultyListType)
        )

        assertNotNull(response)
        assertNotNull(response.body)

        val faculties = response.body as List<Faculty>
        faculties.forEach {
            assertNotNull(it.name)
            assertNotNull(it.identifier)
            assertNotNull(it.feeds)

            it.feeds?.forEach { feed ->
                assertNotNull(feed.rss)
                assertNotNull(feed.type)
            }
        }
    }

    @Test
    fun `Get a unknown faculty`() {
        val response: ResponseEntity<Any> = restTemplate.getForEntity(createURLWithPort("/v1/faculty/INVALID"), Any::class.java)

        assertNotNull(response)
        assertEquals(NOT_FOUND, response.statusCode)
        assertNotNull(response.body)
    }

    @Test
    fun `Get a single faculty`() {
        val identifier = "IM"
        val response: ResponseEntity<FacultyDetail> = restTemplate.getForEntity(
            createURLWithPort("/v1/faculty/$identifier"),
            FacultyDetail::class.java
        )

        assertNotNull(response)
        assertEquals(OK, response.statusCode)
        assertNotNull(response.body)

        val faculty = response.body as FacultyDetail

        assertNotNull(faculty.name)
        assertEquals(identifier, faculty.identifier)
        assertNotNull(faculty.feeds)

        faculty.feeds.forEach {
            assertNotNull(it.rss)
            assertNotNull(it.type)
        }

        assertNotNull(faculty.lecturer)
        assertTrue(faculty.lecturer.size == 1)
        faculty.lecturer[0].let {
            assertNotNull(it.id)
            assertNotNull(it.foreName)
            assertNotNull(it.longName)
            assertNotNull(it.title)
        }
    }
}
