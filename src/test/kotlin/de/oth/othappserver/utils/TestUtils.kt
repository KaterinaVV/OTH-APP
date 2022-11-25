package de.oth.othappserver.utils

import org.apache.http.HttpEntity
import org.apache.http.StatusLine
import org.apache.http.client.methods.CloseableHttpResponse
import org.mockito.Mockito
import org.springframework.http.HttpStatus
import java.io.ByteArrayInputStream
import java.io.InputStream

class TestUtils {
    companion object {
        fun mockResponseFromFile(responseFile: String): CloseableHttpResponse {
            val responseStream = TestUtils::class.java.classLoader.getResource(responseFile)?.openStream() ?: throw RuntimeException("Could not find $responseFile")

            return mockResponse(responseStream)
        }

        fun mockResponse(content: String): CloseableHttpResponse {
            return mockResponse(content.byteInputStream())
        }

        fun mockResponse(stream: InputStream, status: HttpStatus = HttpStatus.OK): CloseableHttpResponse {
            val responseMock = Mockito.mock(CloseableHttpResponse::class.java)

            stream.use {
                val entityContent = it.readAllBytes()
                val entityMock = Mockito.mock(HttpEntity::class.java)

                val statusLineMock = Mockito.mock(StatusLine::class.java)
                Mockito.`when`(statusLineMock.statusCode).thenReturn(status.value())
                Mockito.`when`(statusLineMock.reasonPhrase).thenReturn(status.reasonPhrase)

                Mockito.`when`(responseMock.entity).thenReturn(entityMock)
                Mockito.`when`(responseMock.entity.content).thenReturn(ByteArrayInputStream(entityContent))
                Mockito.`when`(responseMock.entity.contentLength).thenReturn(entityContent.size.toLong())
                Mockito.`when`(responseMock.statusLine).thenReturn(statusLineMock)
            }

            return responseMock
        }

        /**
         * 302 Found response typically returned by WebUnits if in maintenance mode.
         */
        fun mock302FoundResponse(): CloseableHttpResponse {
            val responseStream =
                """
                <html><body>302 FOUND.</body></html>
                """.trimIndent().byteInputStream()

            return mockResponse(responseStream, HttpStatus.FOUND)
        }
    }
}
