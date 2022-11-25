package de.oth.othappserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
open class OthAppServerApplication {

    companion object App {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(OthAppServerApplication::class.java, *args)
        }
    }
}
