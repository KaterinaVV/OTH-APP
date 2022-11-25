package de.oth.othappserver

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.test.context.ActiveProfiles
import java.net.URI

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(value = ["test"])
abstract class BaseIntegrationTest {
    @LocalServerPort
    protected val port = 0

    protected fun createURLWithPort(uri: String): URI {
        return URI.create("http://localhost:$port$uri")
    }
}
