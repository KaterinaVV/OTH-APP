package de.oth.othappserver.jobmarket

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

class JobMarketUtils {
    companion object {
        const val DateTimeFormat = "yyyy-MM-dd HH:mm:s.SSS"
        val JobMarketDateTimeFormat = DateTimeFormatter.ofPattern(DateTimeFormat)

        fun toBerlinOffset(dateTime: String): OffsetDateTime {
            val zone = ZoneId.of("Europe/Berlin")
            val localDateTime = LocalDateTime.parse(dateTime, JobMarketDateTimeFormat)
            val zoneOffSet = zone.rules.getOffset(localDateTime)

            return localDateTime.atOffset(zoneOffSet)
        }
    }
}
