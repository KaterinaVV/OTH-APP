package de.oth.othappserver.rest

import com.fasterxml.jackson.databind.ObjectMapper
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.whenever
import de.oth.othappserver.IntegrationTest
import de.oth.othappserver.model.FreeRoom
import de.oth.othappserver.model.FreeRoomBuilding
import de.oth.othappserver.model.FreeTime
import de.oth.othappserver.model.RoomType
import de.oth.othappserver.utils.entityContains
import de.oth.othappserver.webuntis.*
import org.apache.http.HttpEntity
import org.apache.http.StatusLine
import org.apache.http.client.methods.CloseableHttpResponse
import org.apache.http.client.methods.HttpPost
import org.apache.http.impl.client.CloseableHttpClient
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.exchange
import org.springframework.http.RequestEntity
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

internal class RoomFinderControllerTest @Autowired constructor(
    private val restTemplate: TestRestTemplate,
    private val mapper: ObjectMapper
) : IntegrationTest() {

    private var timetableIdSequence = 1
    private val dateFormatter = DateTimeFormatter.ofPattern("yyyyMMdd")

    @MockBean
    private lateinit var httpClient: CloseableHttpClient
    private val now = LocalDateTime.now()

    @Test
    fun `query free rooms basic`() {
        val d003 = WebUntisRoom(31, "D003", "D003 (Hörsaal - 120 - IM)", "Hörsaalgebäude")
        val d204 = WebUntisRoom(594, "D204", "D204 (Seminarraum)", "Hörsaalgebäude")
        val roomsResponse = WebUntisResponse("somerooms", null, listOf(d003, d204))
        val timetableResponse = WebUntisResponse(
            "sometimetables",
            null,
            listOf(
                createTimeTable(815, 945, d003),
                createTimeTable(1130, 1300, d003),
                createTimeTable(1130, 1300, d204),
                createTimeTable(1700, 1830, d204)
            )
        )

        doAnswer {
            val httpPost = it.arguments[0] as HttpPost
            when {
                httpPost.entityContains("getRooms") -> mockResponse(roomsResponse)
                httpPost.entityContains("getTimetable") -> mockResponse(timetableResponse)
                else -> throw IllegalAccessException("Nothing should post the $httpPost")
            }
        }.whenever(httpClient)
            .execute(ArgumentMatchers.any(HttpPost::class.java), ArgumentMatchers.any())

        val now = LocalDate.now()
        val request =
            RequestEntity.get(createURLWithPort("/v1/freerooms?start=now&building=D&date=$now&roomType=Hoersaal"))
                .build()
        val response = restTemplate.exchange<List<FreeRoomBuilding>>(request)
        Assertions.assertNotNull(response)
        Assertions.assertNotNull(response.body)
        val freeRoomBuildings = response.body as List<FreeRoomBuilding>
        Assertions.assertEquals(1, freeRoomBuildings.size)
        val freeRoomBuilding = freeRoomBuildings[0]
        Assertions.assertEquals("D", freeRoomBuilding.letter)
        val expectedFreeRooms = listOf(
            FreeRoom(
                "D003",
                "D003 (Hörsaal - 120 - IM)",
                RoomType.HOERSAAL,
                emptyList(),
                listOf(FreeTime("09:45", "11:30"), FreeTime("13:00", "17:00")),
                0
            )
        )
        assertThat(freeRoomBuilding.rooms).containsExactlyInAnyOrder(*expectedFreeRooms.toTypedArray())
    }

    private fun createTimeTable(start: Int, end: Int, room: WebUntisRoom): WebUntisTimetable {
        return WebUntisTimetable(
            timetableIdSequence++,
            now.format(dateFormatter),
            start.toString(),
            end.toString(),
            emptyList(),
            listOf(NamedWebUntisResourceOptional(room.id, room.name, room.longName)),
            emptyList(),
            emptyList()
        )
    }

    private fun <T> mockResponse(response: WebUntisResponse<T>): CloseableHttpResponse? {
        val responseJson = mapper.writeValueAsString(response)
        val byteInputStream = responseJson.byteInputStream()

        val statusLineMock = Mockito.mock(StatusLine::class.java)
        Mockito.`when`(statusLineMock.statusCode).thenReturn(200)

        val responseMock = Mockito.mock(CloseableHttpResponse::class.java)
        val entityMock = Mockito.mock(HttpEntity::class.java)
        Mockito.`when`(responseMock.entity).thenReturn(entityMock)
        Mockito.`when`(responseMock.statusLine).thenReturn(statusLineMock)
        Mockito.`when`(responseMock.entity.content).thenReturn(byteInputStream)
        Mockito.`when`(responseMock.entity.contentLength)
            .thenReturn(byteInputStream.available().toLong())
        return responseMock
    }
}
