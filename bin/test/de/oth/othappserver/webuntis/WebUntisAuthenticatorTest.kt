package de.oth.othappserver.webuntis

import com.nhaarman.mockitokotlin2.*
import de.oth.othappserver.config.JacksonConfig
import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpPost
import org.apache.http.protocol.HttpContext
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito.mock

internal class WebUntisAuthenticatorTest {

    private val authenticator: WebUntisAuthenticator
    private val httpClient: HttpClient = mock(HttpClient::class.java)
    private val mapper = JacksonConfig.mapper
    private val webUntisProperties = WebUntisProperties("username", "password", "uri", true)

    init {
        authenticator = WebUntisAuthenticator(httpClient, webUntisProperties, mapper)
    }

    @Test
    fun getContext_returnsContext() {
        val context = authenticator.getContext()

        assertNotNull(context)
    }

    @Test
    fun authenticate_firstAuth_doesAuthenticate() {
        val contentStream =
            """
            { "jsonrpc": "2.0", "id": "123", "result": { "sessionId": "someSession", "personType": 1, "personId": 123, "klasseId": 1234 }}
            """.trimIndent().byteInputStream()

        val httpEntityMock = mock<HttpEntity> { on { content } doReturn contentStream }
        val responseMock = mock<HttpResponse> { on { entity } doReturn httpEntityMock }
        whenever(httpClient.execute(any(HttpPost::class.java), any(HttpContext::class.java))).thenAnswer {
            val request = it.getArgument<HttpPost>(0)
            val value = mapper.readValue(request.entity.content, WebUntisRequest::class.java) as WebUntisRequest<WebUntisUser>
            assertEquals(value.method, "authenticate")
            assertEquals(webUntisProperties.username, value.params!!["user"])
            assertEquals(webUntisProperties.password, value.params!!["password"])

            responseMock
        }

        authenticator.authenticate()
    }

    @Test
    fun authenticate_secondAuth_skipAuthentication() {
        val contentStream =
            """
            { "jsonrpc": "2.0", "id": "123", "result": { "sessionId": "someSession", "personType": 1, "personId": 123, "klasseId": 1234 }}
            """.trimIndent().byteInputStream()

        val httpEntityMock = mock<HttpEntity> { on { content } doReturn contentStream }
        val responseMock = mock<HttpResponse> { on { entity } doReturn httpEntityMock }
        whenever(httpClient.execute(any(HttpPost::class.java), any(HttpContext::class.java))).doReturn(responseMock)

        authenticator.authenticate()
        authenticator.authenticate()

        verify(httpClient, times(1)).execute(any(HttpPost::class.java), any(HttpContext::class.java))
        verifyNoMoreInteractions(httpClient)
    }
}
