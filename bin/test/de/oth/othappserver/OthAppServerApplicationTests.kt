package de.oth.othappserver

import de.oth.othappserver.OthAppServerApplicationTests.Companion.AUTH_TOKEN
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest(properties = ["app.auth.token=$AUTH_TOKEN"])
@ActiveProfiles(value = ["test"])
internal class OthAppServerApplicationTests {
    @Test
    fun contextLoads() {
    }

    companion object {
        const val AUTH_TOKEN = "junittest"
    }
}
